package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class BasicTextFieldKt$$ExternalSyntheticLambda17 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TextFieldSelectionState f$0;

    public /* synthetic */ BasicTextFieldKt$$ExternalSyntheticLambda17(TextFieldSelectionState textFieldSelectionState, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = textFieldSelectionState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                BasicTextFieldKt.TextFieldSelectionHandles(this.f$0, composer, Updater.updateChangedFlags(1));
                break;
            default:
                BasicTextFieldKt.TextFieldCursorHandle(this.f$0, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
