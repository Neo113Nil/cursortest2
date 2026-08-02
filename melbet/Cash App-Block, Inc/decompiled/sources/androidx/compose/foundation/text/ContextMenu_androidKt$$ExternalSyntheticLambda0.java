package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class ContextMenu_androidKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TextFieldSelectionState f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ ComposableLambdaImpl f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ ContextMenu_androidKt$$ExternalSyntheticLambda0(TextFieldSelectionState textFieldSelectionState, boolean z, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = textFieldSelectionState;
        this.f$1 = z;
        this.f$2 = composableLambdaImpl;
        this.f$3 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$3;
        ComposableLambdaImpl composableLambdaImpl = this.f$2;
        boolean z = this.f$1;
        TextFieldSelectionState textFieldSelectionState = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                BasicTextKt.ContextMenuArea(textFieldSelectionState, z, composableLambdaImpl, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                BasicTextKt.CommonContextMenuArea(textFieldSelectionState, z, composableLambdaImpl, composer, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
