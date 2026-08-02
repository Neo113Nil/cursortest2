package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.video.AutoValue_Quality_ConstantQuality;

/* loaded from: classes3.dex */
public class ExcludeStretchedVideoQualityQuirk implements VideoQualityQuirk {
    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public final boolean isProblematicVideoQuality(CameraInfoInternal cameraInfoInternal, AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality) {
        String str = Build.BRAND;
        if ("Samsung".equalsIgnoreCase(str) && "SM-J400G".equalsIgnoreCase(Build.MODEL)) {
            if (autoValue_Quality_ConstantQuality == AutoValue_Quality_ConstantQuality.FHD || autoValue_Quality_ConstantQuality == AutoValue_Quality_ConstantQuality.UHD) {
                return true;
            }
        } else if ((("Samsung".equalsIgnoreCase(str) && "SM-J260F".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str) && "SM-J530F".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str) && "sm-j600g".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str) && "SM-J701F".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str) && "SM-G610M".equalsIgnoreCase(Build.MODEL)) || ("Samsung".equalsIgnoreCase(str) && "SM-J710MN".equalsIgnoreCase(Build.MODEL))))))) && autoValue_Quality_ConstantQuality == AutoValue_Quality_ConstantQuality.FHD) {
            return true;
        }
        return false;
    }
}
