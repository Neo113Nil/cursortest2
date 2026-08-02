package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraManager;
import android.util.Log;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.internal.CameraStatusMonitor$CameraStatus;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ChannelsKt__ChannelsKt;
import kotlinx.coroutines.channels.ProducerScope;

/* loaded from: classes3.dex */
public final class Camera2DeviceCache$createCameraIdListFlow$1$callback$1 extends CameraManager.AvailabilityCallback {
    public final /* synthetic */ ProducerScope $$this$callbackFlow;
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object this$0;

    public Camera2DeviceCache$createCameraIdListFlow$1$callback$1(ProducerScope producerScope, Camera2CameraStatusMonitor camera2CameraStatusMonitor) {
        this.$$this$callbackFlow = producerScope;
        this.this$0 = camera2CameraStatusMonitor;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public void onCameraAccessPrioritiesChanged() {
        switch (this.$r8$classId) {
            case 1:
                Log.d("CXCP", "Camera access priorities have changed");
                if (ChannelsKt__ChannelsKt.trySendBlocking(CameraStatusMonitor$CameraStatus.CameraPrioritiesChanged.INSTANCE, this.$$this$callbackFlow) instanceof ChannelResult.Failed) {
                    Log.w("CXCP", "Failed to emit CameraPrioritiesChanged");
                    break;
                }
                break;
            default:
                super.onCameraAccessPrioritiesChanged();
                break;
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        int i = this.$r8$classId;
        ProducerScope producerScope = this.$$this$callbackFlow;
        Object obj = this.this$0;
        str.getClass();
        switch (i) {
            case 0:
                Camera2DeviceCache.access$onCameraAvailabilityChanged((Camera2DeviceCache) obj, producerScope, str, true);
                break;
            default:
                if (str.equals(((Camera2CameraStatusMonitor) obj).cameraId)) {
                    Log.d("CXCP", "Camera " + str + " has become available");
                    CameraId.m45constructorimpl(str);
                    if (ChannelsKt__ChannelsKt.trySendBlocking(new CameraStatusMonitor$CameraStatus.CameraAvailable(str), producerScope) instanceof ChannelResult.Failed) {
                        Log.w("CXCP", "Failed to emit CameraAvailable(" + str + ')');
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        int i = this.$r8$classId;
        ProducerScope producerScope = this.$$this$callbackFlow;
        Object obj = this.this$0;
        str.getClass();
        switch (i) {
            case 0:
                Camera2DeviceCache.access$onCameraAvailabilityChanged((Camera2DeviceCache) obj, producerScope, str, false);
                break;
            default:
                if (str.equals(((Camera2CameraStatusMonitor) obj).cameraId)) {
                    Log.d("CXCP", "Camera " + str + " has become unavailable");
                    CameraId.m45constructorimpl(str);
                    if (ChannelsKt__ChannelsKt.trySendBlocking(new CameraStatusMonitor$CameraStatus.CameraUnavailable(str), producerScope) instanceof ChannelResult.Failed) {
                        Log.w("CXCP", "Failed to emit CameraUnavailable(" + str + ')');
                        break;
                    }
                }
                break;
        }
    }

    public Camera2DeviceCache$createCameraIdListFlow$1$callback$1(Camera2DeviceCache camera2DeviceCache, ProducerScope producerScope) {
        this.this$0 = camera2DeviceCache;
        this.$$this$callbackFlow = producerScope;
    }
}
