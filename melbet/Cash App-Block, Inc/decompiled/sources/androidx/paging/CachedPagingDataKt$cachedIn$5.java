package androidx.paging;

import androidx.compose.ui.geometry.Offset;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class CachedPagingDataKt$cachedIn$5 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CachedPagingDataKt$cachedIn$5(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$r8$classId) {
            case 0:
                return new CachedPagingDataKt$cachedIn$5(3, (Continuation) obj3, 0).invokeSuspend(Unit.INSTANCE);
            case 1:
                long j = ((Offset) obj2).packedValue;
                return new CachedPagingDataKt$cachedIn$5(3, (Continuation) obj3, 1).invokeSuspend(Unit.INSTANCE);
            case 2:
                ((Number) obj2).floatValue();
                return new CachedPagingDataKt$cachedIn$5(3, (Continuation) obj3, 2).invokeSuspend(Unit.INSTANCE);
            case 3:
                long j2 = ((Offset) obj2).packedValue;
                return new CachedPagingDataKt$cachedIn$5(3, (Continuation) obj3, 3).invokeSuspend(Unit.INSTANCE);
            default:
                return new CachedPagingDataKt$cachedIn$5(3, (Continuation) obj3, 4).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                break;
            default:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                break;
        }
        return Unit.INSTANCE;
    }
}
