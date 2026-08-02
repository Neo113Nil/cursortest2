package androidx.compose.ui.text.input;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.text.TextRange;
import com.plaid.internal.EnumC0170g;
import com.squareup.wire.GrpcMethod;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class RecordingInputConnection implements InputConnection {
    public final boolean autoCorrect;
    public int batchDepth;
    public int currentExtractedTextRequestToken;
    public final Toolbar.AnonymousClass1 eventCallback;
    public boolean extractedTextMonitorMode;
    public TextFieldValue mTextFieldValue;
    public final ArrayList editCommands = new ArrayList();
    public boolean isActive = true;

    public RecordingInputConnection(TextFieldValue textFieldValue, Toolbar.AnonymousClass1 anonymousClass1, boolean z) {
        this.eventCallback = anonymousClass1;
        this.autoCorrect = z;
        this.mTextFieldValue = textFieldValue;
    }

    public final void addEditCommandWithBatch(EditCommand editCommand) {
        this.batchDepth++;
        try {
            this.editCommands.add(editCommand);
        } finally {
            endBatchEditInternal();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        this.batchDepth++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.isActive;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.editCommands.clear();
        this.batchDepth = 0;
        this.isActive = false;
        ArrayList arrayList = ((TextInputServiceAndroid) this.eventCallback.this$0).ics;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (Intrinsics.areEqual(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.isActive;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.isActive;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.isActive;
        return z ? this.autoCorrect : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new CommitTextCommand(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new DeleteSurroundingTextCommand(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new DeleteSurroundingTextInCodePointsCommand(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return endBatchEditInternal();
    }

    public final boolean endBatchEditInternal() {
        int i = this.batchDepth - 1;
        this.batchDepth = i;
        if (i == 0) {
            ArrayList arrayList = this.editCommands;
            if (!arrayList.isEmpty()) {
                ((TextInputServiceAndroid) this.eventCallback.this$0).onEditCommand.invoke(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.batchDepth > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new FinishComposingTextCommand());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        TextFieldValue textFieldValue = this.mTextFieldValue;
        return TextUtils.getCapsMode(textFieldValue.annotatedString.text, TextRange.m990getMinimpl(textFieldValue.selection), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.extractedTextMonitorMode = z;
        if (z) {
            this.currentExtractedTextRequestToken = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return InputState_androidKt.toExtractedText(this.mTextFieldValue);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (TextRange.m987getCollapsedimpl(this.mTextFieldValue.selection)) {
            return null;
        }
        return TextFieldValueKt.getSelectedText(this.mTextFieldValue).text;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return TextFieldValueKt.getTextAfterSelection(this.mTextFieldValue, i).text;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return TextFieldValueKt.getTextBeforeSelection(this.mTextFieldValue, i).text;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.isActive;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    addEditCommandWithBatch(new SetSelectionCommand(0, this.mTextFieldValue.annotatedString.text.length()));
                    break;
                case R.id.cut:
                    sendSynthesizedKeyEvent(EnumC0170g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE);
                    return false;
                case R.id.copy:
                    sendSynthesizedKeyEvent(EnumC0170g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE);
                    return false;
                case R.id.paste:
                    sendSynthesizedKeyEvent(EnumC0170g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.isActive;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        break;
                }
                ((TextInputServiceAndroid) this.eventCallback.this$0).onImeActionPerformed.invoke(new ImeAction(i2));
            }
            i2 = 1;
            ((TextInputServiceAndroid) this.eventCallback.this$0).onImeActionPerformed.invoke(new ImeAction(i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.isActive;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        CursorAnchorInfoController cursorAnchorInfoController;
        boolean z4 = this.isActive;
        if (!z4) {
            return z4;
        }
        boolean z5 = false;
        boolean z6 = (i & 1) != 0;
        boolean z7 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            z2 = (i & 16) != 0;
            z3 = (i & 8) != 0;
            boolean z8 = (i & 4) != 0;
            if (i2 >= 34 && (i & 32) != 0) {
                z5 = true;
            }
            if (z2 || z3 || z8 || z5) {
                z = z5;
                z5 = z8;
                cursorAnchorInfoController = ((TextInputServiceAndroid) this.eventCallback.this$0).cursorAnchorInfoController;
                synchronized (cursorAnchorInfoController.lock) {
                    try {
                        cursorAnchorInfoController.includeInsertionMarker = z2;
                        cursorAnchorInfoController.includeCharacterBounds = z3;
                        cursorAnchorInfoController.includeEditorBounds = z5;
                        cursorAnchorInfoController.includeLineBounds = z;
                        if (z6) {
                            cursorAnchorInfoController.hasPendingImmediateRequest = true;
                            if (cursorAnchorInfoController.textFieldValue != null) {
                                cursorAnchorInfoController.updateCursorAnchorInfo();
                            }
                        }
                        cursorAnchorInfoController.monitorEnabled = z7;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
            }
            if (i2 >= 34) {
                z = true;
                z5 = true;
            } else {
                z = z5;
                z5 = true;
            }
            z2 = z5;
        } else {
            z = false;
            z2 = true;
        }
        z3 = z2;
        cursorAnchorInfoController = ((TextInputServiceAndroid) this.eventCallback.this$0).cursorAnchorInfoController;
        synchronized (cursorAnchorInfoController.lock) {
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((TextInputServiceAndroid) this.eventCallback.this$0).baseInputConnection$delegate.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    public final void sendSynthesizedKeyEvent(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new SetComposingRegionCommand(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new SetComposingTextCommand(String.valueOf(charSequence), i));
        }
        return z;
    }

    public final void setMTextFieldValue$ui(TextFieldValue textFieldValue) {
        this.mTextFieldValue = textFieldValue;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new SetSelectionCommand(i, i2));
        return true;
    }

    public final void updateInputState(TextFieldValue textFieldValue, GrpcMethod grpcMethod) {
        if (this.isActive) {
            this.mTextFieldValue = textFieldValue;
            if (this.extractedTextMonitorMode) {
                ((InputMethodManager) ((Lazy) grpcMethod.requestAdapter).getValue()).updateExtractedText((AndroidComposeView) grpcMethod.path, this.currentExtractedTextRequestToken, InputState_androidKt.toExtractedText(textFieldValue));
            }
            TextRange textRange = textFieldValue.composition;
            long j = textFieldValue.selection;
            int m990getMinimpl = textRange != null ? TextRange.m990getMinimpl(textRange.packedValue) : -1;
            TextRange textRange2 = textFieldValue.composition;
            int m989getMaximpl = textRange2 != null ? TextRange.m989getMaximpl(textRange2.packedValue) : -1;
            ((InputMethodManager) ((Lazy) grpcMethod.requestAdapter).getValue()).updateSelection((AndroidComposeView) grpcMethod.path, TextRange.m990getMinimpl(j), TextRange.m989getMaximpl(j), m990getMinimpl, m989getMaximpl);
        }
    }
}
