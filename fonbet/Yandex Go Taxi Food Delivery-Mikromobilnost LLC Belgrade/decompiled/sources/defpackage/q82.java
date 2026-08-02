package defpackage;

import android.app.ApplicationStartInfo;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class q82 {
    public static /* bridge */ /* synthetic */ ApplicationStartInfo c(Object obj) {
        return (ApplicationStartInfo) obj;
    }

    public static /* bridge */ /* synthetic */ CameraDevice.CameraDeviceSetup f(Object obj) {
        return (CameraDevice.CameraDeviceSetup) obj;
    }

    public static /* synthetic */ OutputConfiguration i(int i, Size size) {
        return new OutputConfiguration(i, size);
    }
}
