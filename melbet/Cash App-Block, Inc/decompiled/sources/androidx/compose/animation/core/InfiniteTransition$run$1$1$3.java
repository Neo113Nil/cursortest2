package androidx.compose.animation.core;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class InfiniteTransition$run$1$1$3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ float F$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InfiniteTransition$run$1$1$3(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.$r8$classId = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                InfiniteTransition$run$1$1$3 infiniteTransition$run$1$1$3 = new InfiniteTransition$run$1$1$3(2, continuation, 0);
                infiniteTransition$run$1$1$3.F$0 = ((Number) obj).floatValue();
                return infiniteTransition$run$1$1$3;
            default:
                InfiniteTransition$run$1$1$3 infiniteTransition$run$1$1$32 = new InfiniteTransition$run$1$1$3(2, continuation, 1);
                infiniteTransition$run$1$1$32.F$0 = ((Number) obj).floatValue();
                return infiniteTransition$run$1$1$32;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        float floatValue = ((Number) obj).floatValue();
        Continuation continuation = (Continuation) obj2;
        switch (i) {
        }
        return ((InfiniteTransition$run$1$1$3) create(Float.valueOf(floatValue), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf(this.F$0 > RecyclerView.DECELERATION_RATE);
            default:
                float f = this.F$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf(f > RecyclerView.DECELERATION_RATE);
        }
    }
}
