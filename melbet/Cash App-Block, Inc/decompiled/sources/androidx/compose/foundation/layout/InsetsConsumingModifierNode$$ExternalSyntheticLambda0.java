package androidx.compose.foundation.layout;

import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class InsetsConsumingModifierNode$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InsetsConsumingModifierNode f$0;

    public /* synthetic */ InsetsConsumingModifierNode$$ExternalSyntheticLambda0(InsetsConsumingModifierNode insetsConsumingModifierNode, int i) {
        this.$r8$classId = i;
        this.f$0 = insetsConsumingModifierNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        InsetsConsumingModifierNode insetsConsumingModifierNode = this.f$0;
        TraversableNode traversableNode = (TraversableNode) obj;
        switch (i) {
            case 0:
                traversableNode.getClass();
                InsetsConsumingModifierNode insetsConsumingModifierNode2 = (InsetsConsumingModifierNode) traversableNode;
                WindowInsets windowInsets = insetsConsumingModifierNode.consumedInsets;
                if (!Intrinsics.areEqual(insetsConsumingModifierNode2.ancestorConsumedInsets, windowInsets)) {
                    insetsConsumingModifierNode2.ancestorConsumedInsets = windowInsets;
                    insetsConsumingModifierNode2.insetsInvalidated();
                }
                return TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
            default:
                traversableNode.getClass();
                insetsConsumingModifierNode.ancestorConsumedInsets = ((InsetsConsumingModifierNode) traversableNode).consumedInsets;
                return Boolean.FALSE;
        }
    }
}
