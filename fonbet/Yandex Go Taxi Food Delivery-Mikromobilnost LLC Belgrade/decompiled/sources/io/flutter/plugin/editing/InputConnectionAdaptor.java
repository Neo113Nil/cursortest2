package io.flutter.plugin.editing;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.btr;
import defpackage.duy;
import defpackage.epy0;
import defpackage.iyv;
import defpackage.jkx;
import defpackage.pgp0;
import io.appmetrica.analytics.rtm.internal.Constants;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class InputConnectionAdaptor extends BaseInputConnection implements duy {
    private static final String TAG = "InputConnectionAdaptor";
    private int batchEditNestDepth;
    private btr flutterTextUtils;
    private final iyv keyboardDelegate;
    private final int mClient;
    private CursorAnchorInfo.Builder mCursorAnchorInfoBuilder;
    private final ListenableEditingState mEditable;
    private final EditorInfo mEditorInfo;
    private ExtractedTextRequest mExtractRequest;
    private ExtractedText mExtractedText;
    private final View mFlutterView;
    private InputMethodManager mImm;
    private final Layout mLayout;
    private boolean mMonitorCursorUpdate;
    private final pgp0 scribeChannel;
    private final epy0 textInputChannel;

    public InputConnectionAdaptor(View view, int i, epy0 epy0Var, pgp0 pgp0Var, iyv iyvVar, ListenableEditingState listenableEditingState, EditorInfo editorInfo, FlutterJNI flutterJNI) {
        super(view, true);
        this.mMonitorCursorUpdate = false;
        this.mExtractedText = new ExtractedText();
        this.batchEditNestDepth = 0;
        this.mFlutterView = view;
        this.mClient = i;
        this.textInputChannel = epy0Var;
        this.scribeChannel = pgp0Var;
        this.mEditable = listenableEditingState;
        listenableEditingState.addEditingStateListener(this);
        this.mEditorInfo = editorInfo;
        this.keyboardDelegate = iyvVar;
        this.flutterTextUtils = new btr(flutterJNI);
        this.mLayout = new DynamicLayout(listenableEditingState, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.mImm = (InputMethodManager) view.getContext().getSystemService("input_method");
    }

    private static int clampIndexToEditable(int i, Editable editable) {
        return Math.max(0, Math.min(editable.length(), i));
    }

    private boolean doPerformContextMenuAction(int i) {
        if (i == 16908319) {
            setSelection(0, this.mEditable.length());
            return true;
        }
        if (i == 16908320) {
            int selectionStart = Selection.getSelectionStart(this.mEditable);
            int selectionEnd = Selection.getSelectionEnd(this.mEditable);
            if (selectionStart != selectionEnd) {
                int min = Math.min(selectionStart, selectionEnd);
                int max = Math.max(selectionStart, selectionEnd);
                ((ClipboardManager) this.mFlutterView.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.mEditable.subSequence(min, max)));
                this.mEditable.delete(min, max);
                setSelection(min, min);
            }
            return true;
        }
        if (i == 16908321) {
            int selectionStart2 = Selection.getSelectionStart(this.mEditable);
            int selectionEnd2 = Selection.getSelectionEnd(this.mEditable);
            if (selectionStart2 != selectionEnd2) {
                ((ClipboardManager) this.mFlutterView.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.mEditable.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
            }
            return true;
        }
        if (i != 16908322) {
            return false;
        }
        ClipData primaryClip = ((ClipboardManager) this.mFlutterView.getContext().getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip != null) {
            CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(this.mFlutterView.getContext());
            int max2 = Math.max(0, Selection.getSelectionStart(this.mEditable));
            int max3 = Math.max(0, Selection.getSelectionEnd(this.mEditable));
            int min2 = Math.min(max2, max3);
            int max4 = Math.max(max2, max3);
            if (min2 != max4) {
                this.mEditable.delete(min2, max4);
            }
            this.mEditable.insert(min2, coerceToText);
            int length = coerceToText.length() + min2;
            setSelection(length, length);
        }
        return true;
    }

    private CursorAnchorInfo getCursorAnchorInfo() {
        CursorAnchorInfo.Builder builder = this.mCursorAnchorInfoBuilder;
        if (builder == null) {
            this.mCursorAnchorInfoBuilder = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        this.mCursorAnchorInfoBuilder.setSelectionRange(this.mEditable.getSelectionStart(), this.mEditable.getSelectionEnd());
        int composingStart = this.mEditable.getComposingStart();
        int composingEnd = this.mEditable.getComposingEnd();
        if (composingStart < 0 || composingEnd <= composingStart) {
            this.mCursorAnchorInfoBuilder.setComposingText(-1, "");
        } else {
            this.mCursorAnchorInfoBuilder.setComposingText(composingStart, this.mEditable.toString().subSequence(composingStart, composingEnd));
        }
        return this.mCursorAnchorInfoBuilder.build();
    }

    private ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.mExtractedText;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        extractedText.selectionStart = this.mEditable.getSelectionStart();
        this.mExtractedText.selectionEnd = this.mEditable.getSelectionEnd();
        this.mExtractedText.text = (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) ? this.mEditable.toString() : this.mEditable;
        return this.mExtractedText;
    }

    private boolean handleHorizontalMovement(boolean z, boolean z2) {
        int charCount;
        int charCount2;
        int charCount3;
        int charCount4;
        int min;
        int codePointBefore;
        int charCount5;
        int charCount6;
        int i;
        int i2;
        int charCount7;
        int selectionStart = Selection.getSelectionStart(this.mEditable);
        int selectionEnd = Selection.getSelectionEnd(this.mEditable);
        int i3 = 0;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        btr btrVar = this.flutterTextUtils;
        ListenableEditingState listenableEditingState = this.mEditable;
        if (z) {
            FlutterJNI flutterJNI = btrVar.a;
            if (selectionEnd > 1 && (charCount6 = selectionEnd - (charCount5 = Character.charCount((codePointBefore = Character.codePointBefore(listenableEditingState, selectionEnd))))) != 0) {
                if (codePointBefore == 10) {
                    if (Character.codePointBefore(listenableEditingState, charCount6) == 13) {
                        charCount5++;
                    }
                } else if (flutterJNI.isCodePointRegionalIndicator(codePointBefore)) {
                    int codePointBefore2 = Character.codePointBefore(listenableEditingState, charCount6);
                    int charCount8 = charCount6 - Character.charCount(codePointBefore2);
                    int i4 = 1;
                    while (charCount8 > 0 && flutterJNI.isCodePointRegionalIndicator(codePointBefore2)) {
                        codePointBefore2 = Character.codePointBefore(listenableEditingState, charCount8);
                        charCount8 -= Character.charCount(codePointBefore2);
                        i4++;
                    }
                    if (i4 % 2 == 0) {
                        charCount5 += 2;
                    }
                } else if (codePointBefore == 8419) {
                    int codePointBefore3 = Character.codePointBefore(listenableEditingState, charCount6);
                    int charCount9 = charCount6 - Character.charCount(codePointBefore3);
                    if (charCount9 > 0 && flutterJNI.isCodePointVariantSelector(codePointBefore3)) {
                        int codePointBefore4 = Character.codePointBefore(listenableEditingState, charCount9);
                        if (btr.a(codePointBefore4)) {
                            charCount7 = Character.charCount(codePointBefore4) + Character.charCount(codePointBefore3);
                            charCount5 += charCount7;
                        }
                    } else if (btr.a(codePointBefore3)) {
                        charCount7 = Character.charCount(codePointBefore3);
                        charCount5 += charCount7;
                    }
                } else {
                    if (codePointBefore == 917631) {
                        int codePointBefore5 = Character.codePointBefore(listenableEditingState, charCount6);
                        charCount6 -= Character.charCount(codePointBefore5);
                        codePointBefore = codePointBefore5;
                        while (charCount6 > 0 && 917536 <= codePointBefore && codePointBefore <= 917630) {
                            charCount5 += Character.charCount(codePointBefore);
                            codePointBefore = Character.codePointBefore(listenableEditingState, charCount6);
                            charCount6 -= Character.charCount(codePointBefore);
                        }
                        if (flutterJNI.isCodePointEmoji(codePointBefore)) {
                            charCount5 += Character.charCount(codePointBefore);
                        } else {
                            i2 = selectionEnd - 2;
                        }
                    }
                    if (flutterJNI.isCodePointVariantSelector(codePointBefore)) {
                        codePointBefore = Character.codePointBefore(listenableEditingState, charCount6);
                        if (flutterJNI.isCodePointEmoji(codePointBefore)) {
                            charCount5 += Character.charCount(codePointBefore);
                            charCount6 -= charCount5;
                        }
                    }
                    if (flutterJNI.isCodePointEmoji(codePointBefore)) {
                        boolean z3 = false;
                        int i5 = 0;
                        while (true) {
                            if (z3) {
                                charCount5 = Character.charCount(codePointBefore) + i5 + 1 + charCount5;
                                z3 = false;
                            }
                            if (flutterJNI.isCodePointEmojiModifier(codePointBefore)) {
                                int codePointBefore6 = Character.codePointBefore(listenableEditingState, charCount6);
                                int charCount10 = charCount6 - Character.charCount(codePointBefore6);
                                if (charCount10 <= 0 || !flutterJNI.isCodePointVariantSelector(codePointBefore6)) {
                                    i = 0;
                                } else {
                                    codePointBefore6 = Character.codePointBefore(listenableEditingState, charCount10);
                                    if (flutterJNI.isCodePointEmoji(codePointBefore6)) {
                                        i = Character.charCount(codePointBefore6);
                                        Character.charCount(codePointBefore6);
                                    }
                                }
                                if (flutterJNI.isCodePointEmojiModifierBase(codePointBefore6)) {
                                    charCount5 += Character.charCount(codePointBefore6) + i;
                                }
                            } else {
                                if (charCount6 > 0) {
                                    int codePointBefore7 = Character.codePointBefore(listenableEditingState, charCount6);
                                    charCount6 -= Character.charCount(codePointBefore7);
                                    if (codePointBefore7 == 8205) {
                                        int codePointBefore8 = Character.codePointBefore(listenableEditingState, charCount6);
                                        charCount6 -= Character.charCount(codePointBefore8);
                                        if (charCount6 <= 0 || !flutterJNI.isCodePointVariantSelector(codePointBefore8)) {
                                            i5 = 0;
                                        } else {
                                            codePointBefore8 = Character.codePointBefore(listenableEditingState, charCount6);
                                            i5 = Character.charCount(codePointBefore8);
                                            charCount6 -= Character.charCount(codePointBefore8);
                                        }
                                        codePointBefore = codePointBefore8;
                                        z3 = true;
                                        if (charCount6 != 0 || !z3 || !flutterJNI.isCodePointEmoji(codePointBefore)) {
                                            break;
                                            break;
                                        }
                                    } else {
                                        codePointBefore = codePointBefore7;
                                    }
                                }
                                i5 = 0;
                                if (charCount6 != 0) {
                                    break;
                                }
                            }
                        }
                    }
                }
                i2 = selectionEnd - charCount5;
            } else {
                i2 = 0;
            }
            min = Math.max(i2, 0);
        } else {
            FlutterJNI flutterJNI2 = btrVar.a;
            int length = listenableEditingState.length();
            int i6 = length - 1;
            if (selectionEnd >= i6) {
                i3 = length;
            } else {
                int codePointAt = Character.codePointAt(listenableEditingState, selectionEnd);
                int charCount11 = Character.charCount(codePointAt);
                int i7 = selectionEnd + charCount11;
                if (i7 != 0) {
                    if (codePointAt == 10) {
                        if (Character.codePointAt(listenableEditingState, i7) == 13) {
                            charCount11++;
                        }
                    } else if (!flutterJNI2.isCodePointRegionalIndicator(codePointAt)) {
                        if (btr.a(codePointAt)) {
                            charCount11 += Character.charCount(codePointAt);
                        }
                        if (codePointAt == 8419) {
                            int codePointBefore9 = Character.codePointBefore(listenableEditingState, i7);
                            int charCount12 = Character.charCount(codePointBefore9) + i7;
                            if (charCount12 < length && flutterJNI2.isCodePointVariantSelector(codePointBefore9)) {
                                int codePointAt2 = Character.codePointAt(listenableEditingState, charCount12);
                                if (btr.a(codePointAt2)) {
                                    charCount2 = Character.charCount(codePointBefore9);
                                    charCount3 = Character.charCount(codePointAt2);
                                    charCount11 += charCount3 + charCount2;
                                }
                            } else if (btr.a(codePointBefore9)) {
                                charCount = Character.charCount(codePointBefore9);
                                charCount11 += charCount;
                            }
                        } else if (flutterJNI2.isCodePointEmoji(codePointAt)) {
                            boolean z4 = false;
                            int i8 = 0;
                            while (true) {
                                if (z4) {
                                    charCount11 = Character.charCount(codePointAt) + i8 + 1 + charCount11;
                                    z4 = false;
                                }
                                if (flutterJNI2.isCodePointEmojiModifier(codePointAt)) {
                                    break;
                                }
                                if (i7 < length) {
                                    int codePointAt3 = Character.codePointAt(listenableEditingState, i7);
                                    int charCount13 = Character.charCount(codePointAt3) + i7;
                                    if (codePointAt3 == 8419) {
                                        int codePointBefore10 = Character.codePointBefore(listenableEditingState, charCount13);
                                        int charCount14 = Character.charCount(codePointBefore10) + charCount13;
                                        if (charCount14 < length && flutterJNI2.isCodePointVariantSelector(codePointBefore10)) {
                                            int codePointAt4 = Character.codePointAt(listenableEditingState, charCount14);
                                            if (btr.a(codePointAt4)) {
                                                charCount2 = Character.charCount(codePointBefore10);
                                                charCount3 = Character.charCount(codePointAt4);
                                            }
                                        } else if (btr.a(codePointBefore10)) {
                                            charCount = Character.charCount(codePointBefore10);
                                        }
                                    } else {
                                        if (flutterJNI2.isCodePointEmojiModifier(codePointAt3)) {
                                            charCount4 = Character.charCount(codePointAt3);
                                            break;
                                        }
                                        if (flutterJNI2.isCodePointVariantSelector(codePointAt3)) {
                                            charCount4 = Character.charCount(codePointAt3);
                                            break;
                                        }
                                        if (codePointAt3 == 8205) {
                                            int codePointAt5 = Character.codePointAt(listenableEditingState, charCount13);
                                            int charCount15 = Character.charCount(codePointAt5) + charCount13;
                                            if (charCount15 < length && flutterJNI2.isCodePointVariantSelector(codePointAt5)) {
                                                int codePointAt6 = Character.codePointAt(listenableEditingState, charCount15);
                                                int charCount16 = Character.charCount(codePointAt6);
                                                int charCount17 = Character.charCount(codePointAt6) + charCount15;
                                                i8 = charCount16;
                                                i7 = charCount17;
                                                codePointAt = codePointAt6;
                                                z4 = true;
                                                if (i7 < length || !z4 || !flutterJNI2.isCodePointEmoji(codePointAt)) {
                                                    break;
                                                }
                                            } else {
                                                codePointAt = codePointAt5;
                                                i7 = charCount15;
                                                z4 = true;
                                            }
                                        } else {
                                            codePointAt = codePointAt3;
                                            i7 = charCount13;
                                        }
                                    }
                                }
                                i8 = 0;
                                if (i7 < length) {
                                    break;
                                    break;
                                }
                            }
                            charCount11 += charCount4;
                        }
                    } else if (i7 >= i6 || !flutterJNI2.isCodePointRegionalIndicator(Character.codePointAt(listenableEditingState, i7))) {
                        i3 = i7;
                    } else {
                        int i9 = selectionEnd;
                        while (i9 > 0 && flutterJNI2.isCodePointRegionalIndicator(Character.codePointBefore(listenableEditingState, selectionEnd))) {
                            i9 -= Character.charCount(Character.codePointBefore(listenableEditingState, selectionEnd));
                            i3++;
                        }
                        if (i3 % 2 == 0) {
                            charCount11 += 2;
                        }
                    }
                    i3 = selectionEnd + charCount11;
                }
            }
            min = Math.min(i3, this.mEditable.length());
        }
        if (selectionStart != selectionEnd || z2) {
            setSelection(selectionStart, min);
            return true;
        }
        setSelection(min, min);
        return true;
    }

    private boolean handleVerticalMovement(boolean z, boolean z2) {
        int selectionStart = Selection.getSelectionStart(this.mEditable);
        int selectionEnd = Selection.getSelectionEnd(this.mEditable);
        boolean z3 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z2) {
            z3 = true;
        }
        beginBatchEdit();
        if (z3) {
            ListenableEditingState listenableEditingState = this.mEditable;
            if (z) {
                Selection.moveUp(listenableEditingState, this.mLayout);
            } else {
                Selection.moveDown(listenableEditingState, this.mLayout);
            }
            int selectionStart2 = Selection.getSelectionStart(this.mEditable);
            setSelection(selectionStart2, selectionStart2);
        } else {
            ListenableEditingState listenableEditingState2 = this.mEditable;
            if (z) {
                Selection.extendUp(listenableEditingState2, this.mLayout);
            } else {
                Selection.extendDown(listenableEditingState2, this.mLayout);
            }
            setSelection(Selection.getSelectionStart(this.mEditable), Selection.getSelectionEnd(this.mEditable));
        }
        endBatchEdit();
        return true;
    }

    private byte[] readStreamFully(InputStream inputStream, int i) {
        int i2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[i];
        while (true) {
            try {
                i2 = inputStream.read(bArr);
            } catch (IOException unused) {
                i2 = -1;
            }
            if (i2 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i2);
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.mEditable.beginBatchEdit();
        this.batchEditNestDepth++;
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i) {
        return super.clearMetaKeyStates(i);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public void closeConnection() {
        super.closeConnection();
        this.mEditable.removeEditingStateListener(this);
        while (this.batchEditNestDepth > 0) {
            endBatchEdit();
            this.batchEditNestDepth--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        if ((i & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                if (inputContentInfo.getDescription().getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    Uri contentUri = inputContentInfo.getContentUri();
                    String mimeType = inputContentInfo.getDescription().getMimeType(0);
                    Context context = this.mFlutterView.getContext();
                    if (contentUri != null) {
                        try {
                            InputStream openInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (openInputStream != null) {
                                byte[] readStreamFully = readStreamFully(openInputStream, 65536);
                                HashMap hashMap = new HashMap();
                                hashMap.put("mimeType", mimeType);
                                hashMap.put(Constants.KEY_DATA, readStreamFully);
                                hashMap.put(LaunchBrowserActivity.KEY_URI, contentUri.toString());
                                this.textInputChannel.a.a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(this.mClient), "TextInputAction.commitContent", hashMap), null);
                                inputContentInfo.releasePermission();
                                return true;
                            }
                        } catch (FileNotFoundException unused) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i) {
        return super.commitText(charSequence, i);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        if (this.mEditable.getSelectionStart() == -1) {
            return true;
        }
        return super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return super.deleteSurroundingTextInCodePoints(i, i2);
    }

    @Override // defpackage.duy
    public void didChangeEditingState(boolean z, boolean z2, boolean z3) {
        this.mImm.updateSelection(this.mFlutterView, this.mEditable.getSelectionStart(), this.mEditable.getSelectionEnd(), this.mEditable.getComposingStart(), this.mEditable.getComposingEnd());
        ExtractedTextRequest extractedTextRequest = this.mExtractRequest;
        if (extractedTextRequest != null) {
            this.mImm.updateExtractedText(this.mFlutterView, extractedTextRequest.token, getExtractedText(extractedTextRequest));
        }
        if (this.mMonitorCursorUpdate) {
            this.mImm.updateCursorAnchorInfo(this.mFlutterView, getCursorAnchorInfo());
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.batchEditNestDepth--;
        this.mEditable.endBatchEdit();
        return endBatchEdit;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        return super.finishComposingText();
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public Editable getEditable() {
        return this.mEditable;
    }

    public boolean handleKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 21) {
                return handleHorizontalMovement(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 22) {
                return handleHorizontalMovement(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 19) {
                return handleVerticalMovement(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 20) {
                return handleVerticalMovement(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                EditorInfo editorInfo = this.mEditorInfo;
                if ((editorInfo.inputType & 131072) == 0) {
                    performEditorAction(editorInfo.imeOptions & 255);
                    return true;
                }
            }
            int selectionStart = Selection.getSelectionStart(this.mEditable);
            int selectionEnd = Selection.getSelectionEnd(this.mEditable);
            int unicodeChar = keyEvent.getUnicodeChar();
            if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                int min = Math.min(selectionStart, selectionEnd);
                int max = Math.max(selectionStart, selectionEnd);
                beginBatchEdit();
                if (min != max) {
                    this.mEditable.delete(min, max);
                }
                this.mEditable.insert(min, (CharSequence) String.valueOf((char) unicodeChar));
                int i = min + 1;
                setSelection(i, i);
                endBatchEdit();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i) {
        beginBatchEdit();
        boolean doPerformContextMenuAction = doPerformContextMenuAction(i);
        endBatchEdit();
        return doPerformContextMenuAction;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i) {
        if (i == 0) {
            this.textInputChannel.a.a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(this.mClient), "TextInputAction.unspecified"), null);
            return true;
        }
        if (i == 1) {
            this.textInputChannel.a.a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(this.mClient), "TextInputAction.newline"), null);
            return true;
        }
        if (i == 2) {
            this.textInputChannel.a.a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(this.mClient), "TextInputAction.go"), null);
            return true;
        }
        if (i == 3) {
            this.textInputChannel.a.a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(this.mClient), "TextInputAction.search"), null);
            return true;
        }
        if (i == 4) {
            this.textInputChannel.a.a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(this.mClient), "TextInputAction.send"), null);
            return true;
        }
        epy0 epy0Var = this.textInputChannel;
        if (i == 5) {
            epy0Var.a.a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(this.mClient), "TextInputAction.next"), null);
            return true;
        }
        int i2 = this.mClient;
        if (i != 7) {
            epy0Var.a.a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i2), "TextInputAction.done"), null);
            return true;
        }
        epy0Var.a.a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i2), "TextInputAction.previous"), null);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        epy0 epy0Var = this.textInputChannel;
        int i = this.mClient;
        epy0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        if (bundle != null) {
            HashMap hashMap2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    hashMap2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    hashMap2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    hashMap2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    hashMap2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    hashMap2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    hashMap2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    hashMap2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            hashMap.put(Constants.KEY_DATA, hashMap2);
        }
        epy0Var.a.a("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(i), hashMap), null);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i) {
        if ((i & 1) != 0) {
            this.mImm.updateCursorAnchorInfo(this.mFlutterView, getCursorAnchorInfo());
        }
        this.mMonitorCursorUpdate = (i & 2) != 0;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        return ((jkx) this.keyboardDelegate).a(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i, int i2) {
        return super.setComposingRegion(i, i2);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i) {
        beginBatchEdit();
        boolean commitText = charSequence.length() == 0 ? super.commitText(charSequence, i) : super.setComposingText(charSequence, i);
        endBatchEdit();
        return commitText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setSelection(int i, int i2) {
        beginBatchEdit();
        boolean selection = super.setSelection(i, i2);
        endBatchEdit();
        return selection;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        this.mExtractRequest = (i & 1) != 0 ? extractedTextRequest : null;
        return getExtractedText(extractedTextRequest);
    }

    public InputConnectionAdaptor(View view, int i, epy0 epy0Var, pgp0 pgp0Var, iyv iyvVar, ListenableEditingState listenableEditingState, EditorInfo editorInfo) {
        this(view, i, epy0Var, pgp0Var, iyvVar, listenableEditingState, editorInfo, new FlutterJNI());
    }
}
