package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.Velocity;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$LongRef;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class ScrollingLogic$doFlingAnimation$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ long $available;
    public final /* synthetic */ Ref$LongRef $result;
    public long J$0;
    public /* synthetic */ Object L$0;
    public ScrollingLogic L$1;
    public Ref$LongRef L$2;
    public int label;
    public final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, Ref$LongRef ref$LongRef, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = scrollingLogic;
        this.$result = ref$LongRef;
        this.$available = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.this$0, this.$result, this.$available, continuation);
        scrollingLogic$doFlingAnimation$2.L$0 = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollingLogic$doFlingAnimation$2) create((ScrollingLogic$nestedScrollScope$1) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ScrollingLogic scrollingLogic;
        Ref$LongRef ref$LongRef;
        ScrollingLogic scrollingLogic2;
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            ScrollingLogic$nestedScrollScope$1 scrollingLogic$nestedScrollScope$1 = (ScrollingLogic$nestedScrollScope$1) this.L$0;
            scrollingLogic = this.this$0;
            AnchoredDraggableNode$fling$2$scrollScope$1 anchoredDraggableNode$fling$2$scrollScope$1 = new AnchoredDraggableNode$fling$2$scrollScope$1(i2, scrollingLogic, scrollingLogic$nestedScrollScope$1);
            FlingBehavior flingBehavior = scrollingLogic.flingBehavior;
            ref$LongRef = this.$result;
            long j2 = ref$LongRef.element;
            Orientation orientation = scrollingLogic.orientation;
            Orientation orientation2 = Orientation.Horizontal;
            long j3 = this.$available;
            float reverseIfNeeded = scrollingLogic.reverseIfNeeded(orientation == orientation2 ? Velocity.m1067getXimpl(j3) : Velocity.m1068getYimpl(j3));
            this.L$0 = scrollingLogic;
            this.L$1 = scrollingLogic;
            this.L$2 = ref$LongRef;
            this.J$0 = j2;
            this.label = 1;
            obj = flingBehavior.performFling(anchoredDraggableNode$fling$2$scrollScope$1, reverseIfNeeded, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            scrollingLogic2 = scrollingLogic;
            j = j2;
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.J$0;
            ref$LongRef = this.L$2;
            scrollingLogic = this.L$1;
            scrollingLogic2 = (ScrollingLogic) this.L$0;
            SafeTrace.throwOnFailure(obj);
        }
        float reverseIfNeeded2 = scrollingLogic2.reverseIfNeeded(((Number) obj).floatValue());
        ref$LongRef.element = scrollingLogic.orientation == Orientation.Horizontal ? Velocity.m1065copyOhffZ5M$default(reverseIfNeeded2, RecyclerView.DECELERATION_RATE, 2, j) : Velocity.m1065copyOhffZ5M$default(RecyclerView.DECELERATION_RATE, reverseIfNeeded2, 1, j);
        return Unit.INSTANCE;
    }
}
