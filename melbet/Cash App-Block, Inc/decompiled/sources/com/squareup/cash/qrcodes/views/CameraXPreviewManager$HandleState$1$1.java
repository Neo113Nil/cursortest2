package com.squareup.cash.qrcodes.views;

import androidx.camera.core.RotationProvider;
import androidx.camera.core.impl.AdapterCameraControl;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.lifecycle.LifecycleCamera;
import androidx.lifecycle.Lifecycle;
import com.squareup.cash.qrcodes.viewmodels.CameraState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class CameraXPreviewManager$HandleState$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CameraXPreviewState $state;
    public final /* synthetic */ CameraXPreviewManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CameraXPreviewManager$HandleState$1$1(CameraXPreviewState cameraXPreviewState, CameraXPreviewManager cameraXPreviewManager, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$state = cameraXPreviewState;
        this.this$0 = cameraXPreviewManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        CameraXPreviewManager cameraXPreviewManager = this.this$0;
        CameraXPreviewState cameraXPreviewState = this.$state;
        switch (i) {
            case 0:
                return new CameraXPreviewManager$HandleState$1$1(cameraXPreviewState, cameraXPreviewManager, continuation, 0);
            default:
                return new CameraXPreviewManager$HandleState$1$1(cameraXPreviewState, cameraXPreviewManager, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CameraXPreviewManager$HandleState$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LifecycleCamera lifecycleCamera;
        CameraControlInternal cameraControl;
        int i = this.$r8$classId;
        CameraXPreviewState cameraXPreviewState = this.$state;
        CameraXPreviewManager cameraXPreviewManager = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (cameraXPreviewState.getFlashAvailable() && (lifecycleCamera = cameraXPreviewManager.camera) != null && (cameraControl = lifecycleCamera.getCameraControl()) != null) {
                    ((AdapterCameraControl) cameraControl).enableTorch(cameraXPreviewState.getFlashEnabled());
                }
                break;
            default:
                RotationProvider.AnonymousClass1 anonymousClass1 = cameraXPreviewManager.orientationEventListener;
                CameraXPreviewManager$cameraLifecycleOwner$1 cameraXPreviewManager$cameraLifecycleOwner$1 = cameraXPreviewManager.cameraLifecycleOwner;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                int ordinal = ((CameraState) cameraXPreviewState.cameraState$delegate.getValue()).ordinal();
                if (ordinal == 0) {
                    cameraXPreviewManager$cameraLifecycleOwner$1.lifecycle.setCurrentState(Lifecycle.State.CREATED);
                    anonymousClass1.disable();
                } else if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    cameraXPreviewManager$cameraLifecycleOwner$1.lifecycle.setCurrentState(Lifecycle.State.STARTED);
                    anonymousClass1.enable();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
