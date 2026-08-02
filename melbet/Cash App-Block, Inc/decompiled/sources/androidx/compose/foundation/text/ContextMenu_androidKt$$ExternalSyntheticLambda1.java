package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class ContextMenu_androidKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TextFieldSelectionManager f$0;
    public final /* synthetic */ ComposableLambdaImpl f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ ContextMenu_androidKt$$ExternalSyntheticLambda1(TextFieldSelectionManager textFieldSelectionManager, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = textFieldSelectionManager;
        this.f$1 = composableLambdaImpl;
        this.f$2 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$2;
        ComposableLambdaImpl composableLambdaImpl = this.f$1;
        TextFieldSelectionManager textFieldSelectionManager = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                BasicTextKt.ContextMenuArea(textFieldSelectionManager, composableLambdaImpl, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                BasicTextKt.CommonContextMenuArea(textFieldSelectionManager, composableLambdaImpl, composer, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
