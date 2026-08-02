package app.cash.local.views.instore;

import androidx.camera.core.RotationProvider;
import androidx.camera.core.impl.AdapterCameraControl;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.lifecycle.LifecycleCamera;
import androidx.lifecycle.Lifecycle;
import app.cash.local.viewmodels.instore.CameraState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class TableQrCodeCameraViewFinderManager$HandleState$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TableQrCodeCameraViewFinderState $state;
    public final /* synthetic */ TableQrCodeCameraViewFinderManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TableQrCodeCameraViewFinderManager$HandleState$1$1(TableQrCodeCameraViewFinderState tableQrCodeCameraViewFinderState, TableQrCodeCameraViewFinderManager tableQrCodeCameraViewFinderManager, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$state = tableQrCodeCameraViewFinderState;
        this.this$0 = tableQrCodeCameraViewFinderManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        TableQrCodeCameraViewFinderManager tableQrCodeCameraViewFinderManager = this.this$0;
        TableQrCodeCameraViewFinderState tableQrCodeCameraViewFinderState = this.$state;
        switch (i) {
            case 0:
                return new TableQrCodeCameraViewFinderManager$HandleState$1$1(tableQrCodeCameraViewFinderState, tableQrCodeCameraViewFinderManager, continuation, 0);
            default:
                return new TableQrCodeCameraViewFinderManager$HandleState$1$1(tableQrCodeCameraViewFinderState, tableQrCodeCameraViewFinderManager, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((TableQrCodeCameraViewFinderManager$HandleState$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LifecycleCamera lifecycleCamera;
        CameraControlInternal cameraControl;
        int i = this.$r8$classId;
        TableQrCodeCameraViewFinderState tableQrCodeCameraViewFinderState = this.$state;
        TableQrCodeCameraViewFinderManager tableQrCodeCameraViewFinderManager = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((Boolean) tableQrCodeCameraViewFinderState.flashAvailable$delegate.getValue()).booleanValue() && (lifecycleCamera = tableQrCodeCameraViewFinderManager.camera) != null && (cameraControl = lifecycleCamera.getCameraControl()) != null) {
                    ((AdapterCameraControl) cameraControl).enableTorch(((Boolean) tableQrCodeCameraViewFinderState.flashEnabled$delegate.getValue()).booleanValue());
                }
                break;
            default:
                RotationProvider.AnonymousClass1 anonymousClass1 = tableQrCodeCameraViewFinderManager.orientationEventListener;
                TableQrCodeCameraViewFinderManager$cameraLifecycleOwner$1 tableQrCodeCameraViewFinderManager$cameraLifecycleOwner$1 = tableQrCodeCameraViewFinderManager.cameraLifecycleOwner;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                int ordinal = ((CameraState) tableQrCodeCameraViewFinderState.cameraState$delegate.getValue()).ordinal();
                if (ordinal == 0) {
                    tableQrCodeCameraViewFinderManager$cameraLifecycleOwner$1.lifecycle.setCurrentState(Lifecycle.State.CREATED);
                    anonymousClass1.disable();
                } else if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    tableQrCodeCameraViewFinderManager$cameraLifecycleOwner$1.lifecycle.setCurrentState(Lifecycle.State.STARTED);
                    anonymousClass1.enable();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
