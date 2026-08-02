package androidx.paging;

import android.opengl.GLES20;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class CachedPagingDataKt$cachedIn$4 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CachedPagingDataKt$cachedIn$4(int i) {
        super(2, null);
        this.$r8$classId = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new CachedPagingDataKt$cachedIn$4(2, continuation, 0);
            case 1:
                return new CachedPagingDataKt$cachedIn$4(2, continuation, 1);
            case 2:
                return new CachedPagingDataKt$cachedIn$4(2, continuation, 2);
            case 3:
                return new CachedPagingDataKt$cachedIn$4(2, continuation, 3);
            case 4:
                return new CachedPagingDataKt$cachedIn$4(2, continuation, 4);
            case 5:
                return new CachedPagingDataKt$cachedIn$4(2, continuation, 5);
            case 6:
                return new CachedPagingDataKt$cachedIn$4(2, continuation, 6);
            case 7:
                return new CachedPagingDataKt$cachedIn$4(2, continuation, 7);
            case 8:
                return new CachedPagingDataKt$cachedIn$4(2, continuation, 8);
            case 9:
                return new CachedPagingDataKt$cachedIn$4(2, continuation, 9);
            case 10:
                return new CachedPagingDataKt$cachedIn$4(2, continuation, 10);
            case 11:
                return new CachedPagingDataKt$cachedIn$4(2, continuation, 11);
            case 12:
                return new CachedPagingDataKt$cachedIn$4(2, continuation, 12);
            case 13:
                return new CachedPagingDataKt$cachedIn$4(2, continuation, 13);
            default:
                return new CachedPagingDataKt$cachedIn$4(2, continuation, 14);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((CachedPagingDataKt$cachedIn$4) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((CachedPagingDataKt$cachedIn$4) create((Flow) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((CachedPagingDataKt$cachedIn$4) create((ScrollScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((CachedPagingDataKt$cachedIn$4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                ((CachedPagingDataKt$cachedIn$4) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return Boolean.TRUE;
            case 5:
                return ((CachedPagingDataKt$cachedIn$4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((CachedPagingDataKt$cachedIn$4) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((CachedPagingDataKt$cachedIn$4) create(bool2, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 8:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((CachedPagingDataKt$cachedIn$4) create(bool3, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 9:
                return ((CachedPagingDataKt$cachedIn$4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 10:
                return ((CachedPagingDataKt$cachedIn$4) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 11:
                return ((CachedPagingDataKt$cachedIn$4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 12:
                return ((CachedPagingDataKt$cachedIn$4) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 13:
                return ((CachedPagingDataKt$cachedIn$4) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((CachedPagingDataKt$cachedIn$4) create((Throwable) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
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
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                break;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                break;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                break;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                break;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                break;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                GLES20.glClearColor(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
                GLES20.glClear(16640);
                break;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                break;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                break;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                break;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                break;
            default:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CachedPagingDataKt$cachedIn$4(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.$r8$classId = i2;
    }
}
