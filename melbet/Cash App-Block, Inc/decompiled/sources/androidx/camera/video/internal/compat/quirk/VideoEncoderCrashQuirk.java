package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.video.AutoValue_Quality_ConstantQuality;

/* loaded from: classes3.dex */
public class VideoEncoderCrashQuirk implements VideoQualityQuirk {
    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public final boolean isProblematicVideoQuality(CameraInfoInternal cameraInfoInternal, AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality) {
        return "positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL) && cameraInfoInternal.getLensFacing() == 0 && autoValue_Quality_ConstantQuality == AutoValue_Quality_ConstantQuality.SD;
    }
}
