package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.AutoValue_Quality_ConstantQuality;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes3.dex */
public class ReportedVideoQualityNotSupportedQuirk implements VideoQualityQuirk, SurfaceProcessingQuirk {
    public static boolean isHuaweiMate20() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "HMA-L29".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean isHuaweiMate20Pro() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "LYA-AL00".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean isHuaweiP40Lite() {
        return "Huawei".equalsIgnoreCase(Build.MANUFACTURER) && Arrays.asList("JNY-L21A", "JNY-L01A", "JNY-L21B", "JNY-L22A", "JNY-L02A", "JNY-L22B", "JNY-LX1").contains(Build.MODEL.toUpperCase(Locale.US));
    }

    public static boolean isOppoPht110() {
        return "OPPO".equalsIgnoreCase(Build.BRAND) && "PHT110".equalsIgnoreCase(Build.MODEL);
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public final boolean isProblematicVideoQuality(CameraInfoInternal cameraInfoInternal, AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality) {
        if (isHuaweiMate20() || isHuaweiMate20Pro()) {
            if (autoValue_Quality_ConstantQuality != AutoValue_Quality_ConstantQuality.UHD) {
                return false;
            }
        } else if ("Vivo".equalsIgnoreCase(Build.BRAND) && "vivo 1820".equalsIgnoreCase(Build.MODEL)) {
            if (autoValue_Quality_ConstantQuality != AutoValue_Quality_ConstantQuality.HD && autoValue_Quality_ConstantQuality != AutoValue_Quality_ConstantQuality.FHD) {
                return false;
            }
        } else if (isHuaweiP40Lite()) {
            if (cameraInfoInternal.getLensFacing() != 0) {
                return false;
            }
            if (autoValue_Quality_ConstantQuality != AutoValue_Quality_ConstantQuality.FHD && autoValue_Quality_ConstantQuality != AutoValue_Quality_ConstantQuality.HD) {
                return false;
            }
        } else if (!isOppoPht110() || cameraInfoInternal.getLensFacing() != 1 || autoValue_Quality_ConstantQuality != AutoValue_Quality_ConstantQuality.UHD) {
            return false;
        }
        return true;
    }

    @Override // androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk
    public final boolean workaroundBySurfaceProcessing() {
        return isHuaweiMate20() || isHuaweiMate20Pro() || isHuaweiP40Lite() || isOppoPht110();
    }
}
