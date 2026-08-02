package androidx.compose.foundation.gestures;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class TapGestureDetectorKt$processTapGesture$3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ PressGestureScopeImpl $pressScope;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TapGestureDetectorKt$processTapGesture$3(PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$pressScope = pressGestureScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
        switch (i) {
            case 0:
                return new TapGestureDetectorKt$processTapGesture$3(pressGestureScopeImpl, continuation, 0);
            case 1:
                return new TapGestureDetectorKt$processTapGesture$3(pressGestureScopeImpl, continuation, 1);
            case 2:
                return new TapGestureDetectorKt$processTapGesture$3(pressGestureScopeImpl, continuation, 2);
            case 3:
                return new TapGestureDetectorKt$processTapGesture$3(pressGestureScopeImpl, continuation, 3);
            case 4:
                return new TapGestureDetectorKt$processTapGesture$3(pressGestureScopeImpl, continuation, 4);
            case 5:
                return new TapGestureDetectorKt$processTapGesture$3(pressGestureScopeImpl, continuation, 5);
            case 6:
                return new TapGestureDetectorKt$processTapGesture$3(pressGestureScopeImpl, continuation, 6);
            default:
                return new TapGestureDetectorKt$processTapGesture$3(pressGestureScopeImpl, continuation, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((TapGestureDetectorKt$processTapGesture$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                pressGestureScopeImpl.release();
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                pressGestureScopeImpl.cancel();
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                pressGestureScopeImpl.release();
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                pressGestureScopeImpl.cancel();
                break;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                pressGestureScopeImpl.release();
                break;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                pressGestureScopeImpl.release();
                break;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                pressGestureScopeImpl.cancel();
                break;
            default:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                pressGestureScopeImpl.release();
                break;
        }
        return Unit.INSTANCE;
    }
}
