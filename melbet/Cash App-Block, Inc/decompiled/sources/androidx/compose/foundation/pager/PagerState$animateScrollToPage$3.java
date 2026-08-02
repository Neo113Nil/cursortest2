package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.material3.TextKt$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$FloatRef;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class PagerState$animateScrollToPage$3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ AnimationSpec $animationSpec;
    public final /* synthetic */ int $targetPage;
    public final /* synthetic */ float $targetPageOffsetToSnappedPosition;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ PagerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$animateScrollToPage$3(PagerState pagerState, int i, float f, AnimationSpec animationSpec, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pagerState;
        this.$targetPage = i;
        this.$targetPageOffsetToSnappedPosition = f;
        this.$animationSpec = animationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PagerState$animateScrollToPage$3 pagerState$animateScrollToPage$3 = new PagerState$animateScrollToPage$3(this.this$0, this.$targetPage, this.$targetPageOffsetToSnappedPosition, this.$animationSpec, continuation);
        pagerState$animateScrollToPage$3.L$0 = obj;
        return pagerState$animateScrollToPage$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PagerState$animateScrollToPage$3) create((ScrollScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            ScrollScope scrollScope = (ScrollScope) this.L$0;
            PagerState pagerState = this.this$0;
            PagerScrollScopeKt$LazyLayoutScrollScope$1 pagerScrollScopeKt$LazyLayoutScrollScope$1 = new PagerScrollScopeKt$LazyLayoutScrollScope$1(scrollScope, pagerState, 0);
            this.label = 1;
            PagerStateKt$UnitDensity$1 pagerStateKt$UnitDensity$1 = PagerStateKt.UnitDensity;
            int i2 = this.$targetPage;
            pagerState.programmaticScrollTargetPage$delegate.setIntValue(pagerState.coerceInPageRange(new Integer(i2).intValue()));
            boolean z = i2 > pagerState.firstVisiblePage;
            int lastVisibleItemIndex = (pagerScrollScopeKt$LazyLayoutScrollScope$1.getLastVisibleItemIndex() - pagerState.firstVisiblePage) + 1;
            if (((z && i2 > pagerScrollScopeKt$LazyLayoutScrollScope$1.getLastVisibleItemIndex()) || (!z && i2 < pagerState.firstVisiblePage)) && Math.abs(i2 - pagerState.firstVisiblePage) >= 3) {
                int i3 = pagerState.firstVisiblePage;
                if (z) {
                    int i4 = i2 - lastVisibleItemIndex;
                    if (i4 >= i3) {
                        i3 = i4;
                    }
                } else {
                    int i5 = lastVisibleItemIndex + i2;
                    if (i5 <= i3) {
                        i3 = i5;
                    }
                }
                pagerScrollScopeKt$LazyLayoutScrollScope$1.snapToItem(i3, 0);
            }
            Object animate$default = AnimatableKt.animate$default(RecyclerView.DECELERATION_RATE, pagerScrollScopeKt$LazyLayoutScrollScope$1.calculateDistanceTo(i2) + this.$targetPageOffsetToSnappedPosition, this.$animationSpec, new TextKt$$ExternalSyntheticLambda0(10, new Ref$FloatRef(), pagerScrollScopeKt$LazyLayoutScrollScope$1), this, 4);
            if (animate$default != obj2) {
                animate$default = Unit.INSTANCE;
            }
            if (animate$default == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
