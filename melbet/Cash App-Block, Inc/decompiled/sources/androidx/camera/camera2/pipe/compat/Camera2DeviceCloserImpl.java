package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.util.Log;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.glance.session.SessionWorker$doWork$2$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes3.dex */
public final class Camera2DeviceCloserImpl {
    public final Camera2Quirks camera2Quirks;
    public final Threads threads;

    public Camera2DeviceCloserImpl(Threads threads, Camera2Quirks camera2Quirks, RetryingCameraStateOpenerImpl retryingCameraStateOpenerImpl) {
        threads.getClass();
        camera2Quirks.getClass();
        retryingCameraStateOpenerImpl.getClass();
        this.threads = threads;
        this.camera2Quirks = camera2Quirks;
    }

    public final void closeCamera(CameraDeviceWrapper cameraDeviceWrapper, CameraDevice cameraDevice, AndroidCameraState androidCameraState, AudioRestrictionControllerImpl audioRestrictionControllerImpl) {
        audioRestrictionControllerImpl.getClass();
        CameraDevice cameraDevice2 = cameraDeviceWrapper != null ? (CameraDevice) cameraDeviceWrapper.unwrapAs(Reflection.factory.getOrCreateKotlinClass(CameraDevice.class)) : null;
        if (cameraDevice2 == null) {
            if (cameraDevice != null) {
                closeCameraDevice(cameraDevice, androidCameraState);
                return;
            }
            return;
        }
        String id = cameraDevice2.getId();
        id.getClass();
        CameraId.m45constructorimpl(id);
        if (cameraDevice != null && !id.equals(cameraDevice.getId())) {
            StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Unwrapped camera device has camera ID ", id, ", but the wrapped camera device has camera ID ");
            m3m.append(cameraDevice.getId());
            m3m.append('!');
            throw new IllegalStateException(m3m.toString().toString());
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            cameraDeviceWrapper.getClass();
            if (i >= 30) {
                audioRestrictionControllerImpl.activeListeners.remove(cameraDeviceWrapper);
            }
        }
        Log.d("CXCP", "handleQuirksBeforeClosing(" + cameraDevice2 + ')');
        cameraDeviceWrapper.mo59getCameraIdDz_R5H8();
        Pair pair = new Pair(cameraDeviceWrapper, androidCameraState);
        CameraDeviceWrapper cameraDeviceWrapper2 = (CameraDeviceWrapper) pair.first;
        AndroidCameraState androidCameraState2 = (AndroidCameraState) pair.second;
        Object unwrapAs = cameraDeviceWrapper2.unwrapAs(Reflection.factory.getOrCreateKotlinClass(CameraDevice.class));
        if (unwrapAs == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
            return;
        }
        cameraDeviceWrapper.onDeviceClosing();
        closeCameraDevice((CameraDevice) unwrapAs, androidCameraState2);
        cameraDeviceWrapper.onDeviceClosed();
    }

    public final void closeCameraDevice(CameraDevice cameraDevice, AndroidCameraState androidCameraState) {
        String id = cameraDevice.getId();
        id.getClass();
        Log.d("CXCP", "closeCameraDevice(" + id + ')');
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        if (((Unit) this.threads.runBlockingCheckedOrNull(7000L, new SessionWorker$doWork$2$1(cameraDevice, ref$BooleanRef, null, 1))) == null) {
            Log.e("CXCP", "Failed to close CameraDevice(" + id + ") after 7000ms. The camera is likely in a bad state.");
        }
        String id2 = cameraDevice.getId();
        id2.getClass();
        CameraId.m45constructorimpl(id2);
        Camera2Quirks camera2Quirks = this.camera2Quirks;
        camera2Quirks.getClass();
        camera2Quirks.strictMode.getClass();
        CameraMetadata.Companion companion = CameraMetadata.Companion;
        CameraMetadata m72awaitCameraMetadataEfqyGwQ = ((Camera2MetadataCache) camera2Quirks.metadataProvider).m72awaitCameraMetadataEfqyGwQ(id2);
        companion.getClass();
        if (CameraMetadata.Companion.isHardwareLevelLegacy(m72awaitCameraMetadataEfqyGwQ) && ref$BooleanRef.element) {
            Log.d("CXCP", "Waiting for OnClosed from " + ((Object) CameraId.m46toStringimpl(id2)));
            if (androidCameraState.cameraDeviceClosed.await(2000L, TimeUnit.MILLISECONDS)) {
                Log.d("CXCP", "Received OnClosed for " + ((Object) CameraId.m46toStringimpl(id2)));
            } else {
                Log.w("CXCP", "Failed to close " + ((Object) CameraId.m46toStringimpl(id2)) + " after 2000ms!");
            }
        }
    }
}
