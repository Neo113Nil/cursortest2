package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import androidx.camera.camera2.pipe.CameraId;
import javax.inject.Provider;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$deferred$1$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $cameraId;
    public final /* synthetic */ Camera2DeviceCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$deferred$1$1$1(String str, Camera2DeviceCache camera2DeviceCache, Continuation continuation) {
        super(2, continuation);
        this.$cameraId = str;
        this.this$0 = camera2DeviceCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$deferred$1$1$1(this.$cameraId, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$deferred$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        int i;
        CameraDevice.CameraDeviceSetup cameraDeviceSetup;
        int i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        String str = this.$cameraId;
        Camera2DeviceCache camera2DeviceCache = this.this$0;
        Provider provider = camera2DeviceCache.cameraManager;
        Camera2ErrorProcessor camera2ErrorProcessor = camera2DeviceCache.cameraErrorListener;
        try {
            bool = Boolean.valueOf(((CameraManager) provider.get()).isCameraDeviceSetupSupported(str));
        } catch (Exception e) {
            if (e instanceof CameraAccessException) {
                Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                CameraAccessException cameraAccessException = (CameraAccessException) e;
                int reason = cameraAccessException.getReason();
                if (reason == 1) {
                    i = 3;
                } else if (reason == 2) {
                    i = 6;
                } else if (reason == 3) {
                    i = 0;
                } else if (reason == 4) {
                    i = 1;
                } else if (reason != 5) {
                    Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                    i = 11;
                } else {
                    i = 2;
                }
                camera2ErrorProcessor.m69onCameraError3M5Xam4(str, i, true);
            } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                camera2ErrorProcessor.m69onCameraError3M5Xam4(str, 9, false);
            } else {
                if (!(e instanceof IllegalStateException)) {
                    throw e;
                }
                Log.d("CXCP", "Failed to execute call: Camera may be closed");
            }
            bool = null;
        }
        if (!Intrinsics.areEqual(bool, Boolean.TRUE)) {
            return null;
        }
        Log.d("CXCP", "Initializing CameraDeviceSetup for " + ((Object) CameraId.m46toStringimpl(str)));
        try {
            cameraDeviceSetup = ((CameraManager) provider.get()).getCameraDeviceSetup(str);
        } catch (Exception e2) {
            if (e2 instanceof CameraAccessException) {
                Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e2.getMessage());
                CameraAccessException cameraAccessException2 = (CameraAccessException) e2;
                int reason2 = cameraAccessException2.getReason();
                if (reason2 == 1) {
                    i2 = 3;
                } else if (reason2 == 2) {
                    i2 = 6;
                } else if (reason2 == 3) {
                    i2 = 0;
                } else if (reason2 == 4) {
                    i2 = 1;
                } else if (reason2 != 5) {
                    Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException2);
                    i2 = 11;
                } else {
                    i2 = 2;
                }
                camera2ErrorProcessor.m69onCameraError3M5Xam4(str, i2, true);
            } else if ((e2 instanceof IllegalArgumentException) || (e2 instanceof SecurityException) || (e2 instanceof UnsupportedOperationException) || (e2 instanceof NullPointerException)) {
                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e2.getMessage());
                camera2ErrorProcessor.m69onCameraError3M5Xam4(str, 9, false);
            } else {
                if (!(e2 instanceof IllegalStateException)) {
                    throw e2;
                }
                Log.d("CXCP", "Failed to execute call: Camera may be closed");
            }
            cameraDeviceSetup = null;
        }
        if (cameraDeviceSetup != null) {
            return new Camera2DeviceSetup(cameraDeviceSetup, str, camera2ErrorProcessor);
        }
        return null;
    }
}
