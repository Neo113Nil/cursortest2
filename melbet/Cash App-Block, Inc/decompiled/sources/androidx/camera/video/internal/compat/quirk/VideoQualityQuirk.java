package androidx.camera.video.internal.compat.quirk;

import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.Quirk;
import androidx.camera.video.AutoValue_Quality_ConstantQuality;

/* loaded from: classes3.dex */
public interface VideoQualityQuirk extends Quirk {
    boolean isProblematicVideoQuality(CameraInfoInternal cameraInfoInternal, AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality);
}
