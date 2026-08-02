package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.node.DepthSortedSetKt;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class SharedTransitionScopeRootModifierNode$onAttach$1 extends Lambda implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SharedTransitionScopeRootModifierNode$onAttach$1(Object obj, int i) {
        super(0);
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Object obj = this.this$0;
        switch (i) {
            case 0:
                DepthSortedSetKt.invalidateDraw((SharedTransitionScopeRootModifierNode) obj);
                return Unit.INSTANCE;
            case 1:
                Transition transition = (Transition) obj;
                Object currentState = transition.transitionState.getCurrentState();
                EnterExitState enterExitState = EnterExitState.PostExit;
                return Boolean.valueOf(currentState == enterExitState && transition.targetState$delegate.getValue() == enterExitState);
            default:
                Collection values = ((SharedTransitionScopeImpl) obj).sharedElements.getReadable$runtime().map.values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator it = values.iterator();
                    while (it.hasNext() && !((SharedElement) it.next()).isAnimating()) {
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
