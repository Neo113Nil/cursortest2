package androidx.camera.camera2.adapter;

import androidx.camera.camera2.impl.EvCompControl;
import androidx.camera.camera2.impl.LowLightBoostControl;
import androidx.camera.camera2.impl.TorchControl;
import androidx.camera.camera2.impl.ZoomControl;

/* loaded from: classes3.dex */
public final class CameraControlStateAdapter {
    public final TorchControl torchControl;
    public final ZoomControl zoomControl;

    public CameraControlStateAdapter(ZoomControl zoomControl, EvCompControl evCompControl, TorchControl torchControl, LowLightBoostControl lowLightBoostControl) {
        zoomControl.getClass();
        evCompControl.getClass();
        torchControl.getClass();
        lowLightBoostControl.getClass();
        this.zoomControl = zoomControl;
        this.torchControl = torchControl;
    }
}
