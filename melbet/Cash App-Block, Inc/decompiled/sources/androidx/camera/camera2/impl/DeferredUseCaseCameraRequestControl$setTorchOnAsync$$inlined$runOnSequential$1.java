package androidx.camera.camera2.impl;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class DeferredUseCaseCameraRequestControl$setTorchOnAsync$$inlined$runOnSequential$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ DeferredUseCaseCameraRequestControl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DeferredUseCaseCameraRequestControl$setTorchOnAsync$$inlined$runOnSequential$1(DeferredUseCaseCameraRequestControl deferredUseCaseCameraRequestControl, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = deferredUseCaseCameraRequestControl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        DeferredUseCaseCameraRequestControl deferredUseCaseCameraRequestControl = this.this$0;
        switch (i) {
            case 0:
                return new DeferredUseCaseCameraRequestControl$setTorchOnAsync$$inlined$runOnSequential$1(deferredUseCaseCameraRequestControl, continuation, 0);
            case 1:
                return new DeferredUseCaseCameraRequestControl$setTorchOnAsync$$inlined$runOnSequential$1(deferredUseCaseCameraRequestControl, continuation, 1);
            default:
                return new DeferredUseCaseCameraRequestControl$setTorchOnAsync$$inlined$runOnSequential$1(deferredUseCaseCameraRequestControl, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((DeferredUseCaseCameraRequestControl$setTorchOnAsync$$inlined$runOnSequential$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        DeferredUseCaseCameraRequestControl deferredUseCaseCameraRequestControl = this.this$0;
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
                Deferred torchOnAsync = DeferredUseCaseCameraRequestControl.access$getOrCreateImpl(deferredUseCaseCameraRequestControl).setTorchOnAsync();
                this.label = 1;
                Object awaitInternal = ((CompletableDeferredImpl) torchOnAsync).awaitInternal(this);
                return awaitInternal == coroutineSingletons ? coroutineSingletons : awaitInternal;
            case 1:
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
                UseCaseCameraRequestControlImpl access$getOrCreateImpl = DeferredUseCaseCameraRequestControl.access$getOrCreateImpl(deferredUseCaseCameraRequestControl);
                this.label = 1;
                Object awaitSurfaceSetup = access$getOrCreateImpl.awaitSurfaceSetup(this);
                return awaitSurfaceSetup == coroutineSingletons2 ? coroutineSingletons2 : awaitSurfaceSetup;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 != 0) {
                    if (i4 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                Deferred cancelFocusAndMeteringAsync = DeferredUseCaseCameraRequestControl.access$getOrCreateImpl(deferredUseCaseCameraRequestControl).cancelFocusAndMeteringAsync();
                this.label = 1;
                Object awaitInternal2 = ((CompletableDeferredImpl) cancelFocusAndMeteringAsync).awaitInternal(this);
                return awaitInternal2 == coroutineSingletons3 ? coroutineSingletons3 : awaitInternal2;
        }
    }
}
