package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import com.squareup.cash.mooncake.resources.ImageResourcesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class TextFieldSelectionState_androidKt$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TextFieldSelectionState f$0;

    public /* synthetic */ TextFieldSelectionState_androidKt$$ExternalSyntheticLambda2(TextFieldSelectionState textFieldSelectionState, int i) {
        this.$r8$classId = i;
        this.f$0 = textFieldSelectionState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        TextFieldSelectionState textFieldSelectionState = this.f$0;
        switch (i) {
            case 0:
                break;
            case 1:
                textFieldSelectionState.clearHandleDragging();
                break;
            case 2:
                TransformedTextFieldState transformedTextFieldState = textFieldSelectionState.textFieldState;
                TextFieldState textFieldState = transformedTextFieldState.textFieldState;
                InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
                TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
                textFieldState.mainBuffer.getChangeTracker$foundation().clearChanges();
                TextFieldBuffer textFieldBuffer = textFieldState.mainBuffer;
                ImageResourcesKt.setSelectionCoerced(textFieldBuffer, 0, textFieldBuffer.buffer.length());
                TextFieldState.access$commitEditAsUser(textFieldState, inputTransformation, true, textFieldEditUndoBehavior);
                textFieldState.setUserCommit(true);
                break;
            default:
                Function0 function0 = textFieldSelectionState.requestAutofillAction;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
