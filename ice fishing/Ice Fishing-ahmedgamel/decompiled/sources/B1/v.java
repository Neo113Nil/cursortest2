package B1;

import android.adservices.measurement.MeasurementManager;
import android.app.sdksandbox.sdkprovider.SdkSandboxController;
import android.graphics.Bitmap;
import android.graphics.Gainmap;

/* loaded from: classes.dex */
public abstract /* synthetic */ class v {
    public static /* bridge */ /* synthetic */ MeasurementManager d(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* bridge */ /* synthetic */ SdkSandboxController e(Object obj) {
        return (SdkSandboxController) obj;
    }

    public static /* bridge */ /* synthetic */ Class i() {
        return SdkSandboxController.class;
    }

    public static /* synthetic */ Gainmap t(Bitmap bitmap) {
        return new Gainmap(bitmap);
    }

    public static /* bridge */ /* synthetic */ Class u() {
        return MeasurementManager.class;
    }
}
