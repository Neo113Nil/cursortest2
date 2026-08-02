package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.ContextMenu_androidKt$$ExternalSyntheticLambda2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class SelectionContainerKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ SelectionManager f$0;
    public final /* synthetic */ SelectionRegistrarImpl f$1;
    public final /* synthetic */ ComposableLambdaImpl f$2;

    public /* synthetic */ SelectionContainerKt$$ExternalSyntheticLambda4(SelectionManager selectionManager, SelectionRegistrarImpl selectionRegistrarImpl, ComposableLambdaImpl composableLambdaImpl) {
        this.f$0 = selectionManager;
        this.f$1 = selectionRegistrarImpl;
        this.f$2 = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        SelectionManager selectionManager = this.f$0;
        ComposableLambdaImpl composableLambdaImpl = this.f$2;
        SelectionRegistrarImpl selectionRegistrarImpl = this.f$1;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    BasicTextKt.ContextMenuArea(selectionManager, Expect_jvmKt.rememberComposableLambda(-284825865, new SelectionContainerKt$$ExternalSyntheticLambda4(selectionRegistrarImpl, composableLambdaImpl, selectionManager), gapComposer), gapComposer, 48);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Updater.CompositionLocalProvider(SelectionRegistrarKt.LocalSelectionRegistrar.defaultProvidedValue$runtime(selectionRegistrarImpl), Expect_jvmKt.rememberComposableLambda(610483127, new ContextMenu_androidKt$$ExternalSyntheticLambda2(composableLambdaImpl, selectionManager), gapComposer2), gapComposer2, 56);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SelectionContainerKt$$ExternalSyntheticLambda4(SelectionRegistrarImpl selectionRegistrarImpl, ComposableLambdaImpl composableLambdaImpl, SelectionManager selectionManager) {
        this.f$1 = selectionRegistrarImpl;
        this.f$2 = composableLambdaImpl;
        this.f$0 = selectionManager;
    }
}
