package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes3.dex */
public class CameraUseInconsistentTimebaseQuirk implements Quirk {
    public static final HashSet BUILD_HARDWARE_SET = new HashSet(Arrays.asList("samsungexynos7570", "samsungexynos7870", "qcom"));
    public static final HashSet BUILD_SOC_MODEL_SET = new HashSet(Arrays.asList("sm4350", "sm6375", "sm7325"));
    public static final HashSet BUILD_MODEL_SET = new HashSet(Arrays.asList("m2007j20cg", "m2007j20ct"));

    public static boolean load() {
        String str;
        if (Build.VERSION.SDK_INT >= 31) {
            str = Build.SOC_MODEL;
            if (BUILD_SOC_MODEL_SET.contains(str.toLowerCase())) {
                return true;
            }
        }
        if ("SAMSUNG".equalsIgnoreCase(Build.BRAND)) {
            if (BUILD_HARDWARE_SET.contains(Build.HARDWARE.toLowerCase())) {
                return true;
            }
        }
        return BUILD_MODEL_SET.contains(Build.MODEL.toLowerCase());
    }
}
