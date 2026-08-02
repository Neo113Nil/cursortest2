package androidx.camera.video.internal.workaround;

import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.AutoValue_Quality_ConstantQuality;
import androidx.camera.video.internal.compat.quirk.VideoQualityQuirk;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class QualityValidatedEncoderProfilesProvider implements EncoderProfilesProvider {
    public static final HashMap CAMCORDER_TO_VIDEO_QUALITY_MAP;
    public final CameraInfoInternal mCameraInfo;
    public final EncoderProfilesProvider mProvider;
    public final Quirks mQuirks;

    static {
        HashMap hashMap = new HashMap();
        CAMCORDER_TO_VIDEO_QUALITY_MAP = hashMap;
        hashMap.put(1, AutoValue_Quality_ConstantQuality.HIGHEST);
        hashMap.put(8, AutoValue_Quality_ConstantQuality.UHD);
        hashMap.put(6, AutoValue_Quality_ConstantQuality.FHD);
        hashMap.put(5, AutoValue_Quality_ConstantQuality.HD);
        hashMap.put(4, AutoValue_Quality_ConstantQuality.SD);
        hashMap.put(0, AutoValue_Quality_ConstantQuality.LOWEST);
    }

    public QualityValidatedEncoderProfilesProvider(EncoderProfilesProvider encoderProfilesProvider, CameraInfoInternal cameraInfoInternal, Quirks quirks) {
        this.mProvider = encoderProfilesProvider;
        this.mCameraInfo = cameraInfoInternal;
        this.mQuirks = quirks;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final EncoderProfilesProxy getAll(int i) {
        if (hasProfile(i)) {
            return this.mProvider.getAll(i);
        }
        return null;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final boolean hasProfile(int i) {
        if (!this.mProvider.hasProfile(i)) {
            return false;
        }
        AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality = (AutoValue_Quality_ConstantQuality) CAMCORDER_TO_VIDEO_QUALITY_MAP.get(Integer.valueOf(i));
        if (autoValue_Quality_ConstantQuality == null) {
            return true;
        }
        Iterator it = this.mQuirks.getAll(VideoQualityQuirk.class).iterator();
        while (it.hasNext()) {
            VideoQualityQuirk videoQualityQuirk = (VideoQualityQuirk) it.next();
            if (videoQualityQuirk != null && videoQualityQuirk.isProblematicVideoQuality(this.mCameraInfo, autoValue_Quality_ConstantQuality) && (!(videoQualityQuirk instanceof SurfaceProcessingQuirk) || !((SurfaceProcessingQuirk) videoQualityQuirk).workaroundBySurfaceProcessing())) {
                return false;
            }
        }
        return true;
    }
}
