package androidx.camera.featurecombinationquery;

import android.hardware.camera2.params.SessionConfiguration;
import com.google.android.gms.dynamite.zzo;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class AggregatedCameraDeviceSetupCompat implements CameraDeviceSetupCompat {
    public final ArrayList mCameraDeviceSetupImpls;

    public AggregatedCameraDeviceSetupCompat(ArrayList arrayList) {
        this.mCameraDeviceSetupImpls = arrayList;
    }

    @Override // androidx.camera.featurecombinationquery.CameraDeviceSetupCompat
    public final zzo isSessionConfigurationSupported(SessionConfiguration sessionConfiguration) {
        Iterator it = this.mCameraDeviceSetupImpls.iterator();
        while (it.hasNext()) {
            zzo isSessionConfigurationSupported = ((CameraDeviceSetupCompat) it.next()).isSessionConfigurationSupported(sessionConfiguration);
            if (isSessionConfigurationSupported.zza != 0) {
                return isSessionConfigurationSupported;
            }
        }
        return new zzo((byte) 0, 0);
    }
}
