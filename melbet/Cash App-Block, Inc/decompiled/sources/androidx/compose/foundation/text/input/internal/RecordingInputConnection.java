package androidx.compose.foundation.text.input.internal;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextInCodePointsCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.SetComposingRegionCommand;
import androidx.compose.ui.text.input.SetComposingTextCommand;
import androidx.compose.ui.text.input.SetSelectionCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextFieldValueKt;
import androidx.paging.CachedPageEventFlow$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class RecordingInputConnection implements InputConnection {
    public final boolean autoCorrect;
    public int batchDepth;
    public int currentExtractedTextRequestToken;
    public final Toolbar.AnonymousClass1 eventCallback;
    public boolean extractedTextMonitorMode;
    public final LegacyTextFieldState legacyTextFieldState;
    public final TextFieldSelectionManager textFieldSelectionManager;
    public TextFieldValue textFieldValue;
    public final ViewConfiguration viewConfiguration;
    public final ArrayList editCommands = new ArrayList();
    public boolean isActive = true;

    public RecordingInputConnection(TextFieldValue textFieldValue, Toolbar.AnonymousClass1 anonymousClass1, boolean z, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, ViewConfiguration viewConfiguration) {
        this.eventCallback = anonymousClass1;
        this.autoCorrect = z;
        this.legacyTextFieldState = legacyTextFieldState;
        this.textFieldSelectionManager = textFieldSelectionManager;
        this.viewConfiguration = viewConfiguration;
        this.textFieldValue = textFieldValue;
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
        ArrayList arrayList = ((LegacyTextInputMethodRequest) this.eventCallback.this$0).ics;
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
                ((LegacyTextInputMethodRequest) this.eventCallback.this$0).onEditCommand.invoke(new ArrayList(arrayList));
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
        TextFieldValue textFieldValue = this.textFieldValue;
        return TextUtils.getCapsMode(textFieldValue.annotatedString.text, TextRange.m990getMinimpl(textFieldValue.selection), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.extractedTextMonitorMode = z;
        if (z) {
            this.currentExtractedTextRequestToken = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return MathUtilsKt.access$toExtractedText(this.textFieldValue);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (TextRange.m987getCollapsedimpl(this.textFieldValue.selection)) {
            return null;
        }
        return TextFieldValueKt.getSelectedText(this.textFieldValue).text;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return TextFieldValueKt.getTextAfterSelection(this.textFieldValue, i).text;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return TextFieldValueKt.getTextBeforeSelection(this.textFieldValue, i).text;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.isActive;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    addEditCommandWithBatch(new SetSelectionCommand(0, this.textFieldValue.annotatedString.text.length()));
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
                ((LegacyTextInputMethodRequest) this.eventCallback.this$0).onImeActionPerformed.invoke(new ImeAction(i2));
            }
            i2 = 1;
            ((LegacyTextInputMethodRequest) this.eventCallback.this$0).onImeActionPerformed.invoke(new ImeAction(i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            CachedPageEventFlow$$ExternalSyntheticLambda0 cachedPageEventFlow$$ExternalSyntheticLambda0 = new CachedPageEventFlow$$ExternalSyntheticLambda0(this, 1);
            LegacyTextFieldState legacyTextFieldState = this.legacyTextFieldState;
            int performHandwritingGesture$foundation = legacyTextFieldState != null ? HandwritingGestureApi34.performHandwritingGesture$foundation(legacyTextFieldState, handwritingGesture, this.textFieldSelectionManager, this.viewConfiguration, cachedPageEventFlow$$ExternalSyntheticLambda0) : 3;
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new Api34PerformHandwritingGestureImpl$$ExternalSyntheticLambda0(intConsumer, performHandwritingGesture$foundation, 1));
            } else {
                intConsumer.accept(performHandwritingGesture$foundation);
            }
        }
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
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        LegacyTextFieldState legacyTextFieldState;
        if (Build.VERSION.SDK_INT < 34 || (legacyTextFieldState = this.legacyTextFieldState) == null) {
            return false;
        }
        return HandwritingGestureApi34.previewHandwritingGesture$foundation(legacyTextFieldState, previewableHandwritingGesture, this.textFieldSelectionManager, cancellationSignal);
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
        LegacyCursorAnchorInfoController legacyCursorAnchorInfoController;
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
                legacyCursorAnchorInfoController = ((LegacyTextInputMethodRequest) this.eventCallback.this$0).cursorAnchorInfoController;
                synchronized (legacyCursorAnchorInfoController.lock) {
                    try {
                        legacyCursorAnchorInfoController.includeInsertionMarker = z2;
                        legacyCursorAnchorInfoController.includeCharacterBounds = z3;
                        legacyCursorAnchorInfoController.includeEditorBounds = z5;
                        legacyCursorAnchorInfoController.includeLineBounds = z;
                        if (z6) {
                            legacyCursorAnchorInfoController.hasPendingImmediateRequest = true;
                            if (legacyCursorAnchorInfoController.textFieldValue != null) {
                                legacyCursorAnchorInfoController.updateCursorAnchorInfo();
                            }
                        }
                        legacyCursorAnchorInfoController.monitorEnabled = z7;
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
        legacyCursorAnchorInfoController = ((LegacyTextInputMethodRequest) this.eventCallback.this$0).cursorAnchorInfoController;
        synchronized (legacyCursorAnchorInfoController.lock) {
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((LegacyTextInputMethodRequest) this.eventCallback.this$0).baseInputConnection$delegate.getValue()).sendKeyEvent(keyEvent);
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

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new SetSelectionCommand(i, i2));
        return true;
    }
}
