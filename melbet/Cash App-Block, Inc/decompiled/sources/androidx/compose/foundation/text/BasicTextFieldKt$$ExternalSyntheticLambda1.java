package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class BasicTextFieldKt$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TextFieldValue f$0;
    public final /* synthetic */ MutableState f$1;

    public /* synthetic */ BasicTextFieldKt$$ExternalSyntheticLambda1(TextFieldValue textFieldValue, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.f$0 = textFieldValue;
        this.f$1 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        MutableState mutableState = this.f$1;
        TextFieldValue textFieldValue = this.f$0;
        switch (i) {
            case 0:
                if (!TextRange.m986equalsimpl0(textFieldValue.selection, ((TextFieldValue) mutableState.getValue()).selection) || !Intrinsics.areEqual(textFieldValue.composition, ((TextFieldValue) mutableState.getValue()).composition)) {
                    mutableState.setValue(textFieldValue);
                }
                break;
            default:
                if (!TextRange.m986equalsimpl0(textFieldValue.selection, ((TextFieldValue) mutableState.getValue()).selection) || !Intrinsics.areEqual(textFieldValue.composition, ((TextFieldValue) mutableState.getValue()).composition)) {
                    mutableState.setValue(textFieldValue);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
