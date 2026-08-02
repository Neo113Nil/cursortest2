package coil3;

import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.request.ImageRequest;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class RealImageLoader$enqueue$job$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ImageRequest $request;
    public int label;
    public final /* synthetic */ RealImageLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealImageLoader$enqueue$job$1(RealImageLoader realImageLoader, ImageRequest imageRequest, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realImageLoader;
        this.$request = imageRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        ImageRequest imageRequest = this.$request;
        RealImageLoader realImageLoader = this.this$0;
        switch (i) {
            case 0:
                return new RealImageLoader$enqueue$job$1(realImageLoader, imageRequest, continuation, 0);
            default:
                return new RealImageLoader$enqueue$job$1(realImageLoader, imageRequest, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealImageLoader$enqueue$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        ImageRequest imageRequest = this.$request;
        RealImageLoader realImageLoader = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 != 0) {
                    if (i2 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                this.label = 1;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = RealImageLoader.shutdown$volatile$FU;
                Object execute = realImageLoader.execute(imageRequest, 0, this);
                return execute == coroutineSingletons ? coroutineSingletons : execute;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                this.label = 1;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = RealImageLoader.shutdown$volatile$FU;
                Object execute2 = realImageLoader.execute(imageRequest, 1, this);
                return execute2 == coroutineSingletons2 ? coroutineSingletons2 : execute2;
        }
    }
}
