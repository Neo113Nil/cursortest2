package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class LazyLayoutSemanticsModifierNode$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LazyLayoutSemanticsModifierNode f$0;

    public /* synthetic */ LazyLayoutSemanticsModifierNode$$ExternalSyntheticLambda1(LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode, int i) {
        this.$r8$classId = i;
        this.f$0 = lazyLayoutSemanticsModifierNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode = this.f$0;
        switch (i) {
            case 0:
                return Float.valueOf(lazyLayoutSemanticsModifierNode.state.getScrollOffset());
            case 1:
                return Float.valueOf(lazyLayoutSemanticsModifierNode.state.getMaxScrollOffset());
            default:
                return Float.valueOf(lazyLayoutSemanticsModifierNode.state.getViewport() - lazyLayoutSemanticsModifierNode.state.getContentPadding());
        }
    }
}
