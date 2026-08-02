package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.text.TextRange;
import kotlinx.coroutines.StandaloneCoroutine;

/* loaded from: classes3.dex */
public final /* synthetic */ class HandwritingGestureApi34$$ExternalSyntheticLambda0 implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ HandwritingGestureApi34$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) obj;
                if (textFieldSelectionManager != null) {
                    LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.state;
                    if (legacyTextFieldState != null) {
                        legacyTextFieldState.m361setDeletionPreviewHighlightRange5zctL8(TextRange.Zero);
                    }
                    LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.state;
                    if (legacyTextFieldState2 != null) {
                        legacyTextFieldState2.m362setSelectionPreviewHighlightRange5zctL8(TextRange.Zero);
                        break;
                    }
                }
                break;
            case 1:
                TransformedTextFieldState transformedTextFieldState = (TransformedTextFieldState) obj;
                TextFieldState textFieldState = transformedTextFieldState.textFieldState;
                InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
                TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
                textFieldState.mainBuffer.getChangeTracker$foundation().clearChanges();
                TextFieldBuffer textFieldBuffer = textFieldState.mainBuffer;
                textFieldBuffer.highlight = null;
                transformedTextFieldState.updateWedgeAffinity(textFieldBuffer);
                TextFieldState.access$commitEditAsUser(textFieldState, inputTransformation, true, textFieldEditUndoBehavior);
                textFieldState.setUserCommit(true);
                break;
            default:
                ((StandaloneCoroutine) obj).cancel(null);
                break;
        }
    }
}
