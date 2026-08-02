package androidx.camera.video;

import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.video.internal.AutoValue_VideoValidatedEncoderProfilesProxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class RecorderVideoCapabilities implements VideoCapabilities {
    public final EncoderProfilesResolver mEncoderProfilesResolver;

    public RecorderVideoCapabilities(EncoderProfilesResolver encoderProfilesResolver, CameraInfoInternal cameraInfoInternal) {
        this.mEncoderProfilesResolver = encoderProfilesResolver;
        cameraInfoInternal.isVideoStabilizationSupported();
    }

    @Override // androidx.camera.video.VideoCapabilities
    public final Size getResolution(AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality, DynamicRange dynamicRange) {
        AutoValue_VideoValidatedEncoderProfilesProxy profiles;
        EncoderProfilesResolver encoderProfilesResolver = this.mEncoderProfilesResolver;
        encoderProfilesResolver.getClass();
        autoValue_Quality_ConstantQuality.getClass();
        CapabilitiesByQuality capabilities = encoderProfilesResolver.getCapabilities(dynamicRange);
        if (capabilities == null || (profiles = capabilities.getProfiles(autoValue_Quality_ConstantQuality)) == null) {
            return null;
        }
        return profiles.defaultVideoProfile.getResolution();
    }

    @Override // androidx.camera.video.VideoCapabilities
    public final Set getSupportedDynamicRanges() {
        return this.mEncoderProfilesResolver.supportedDynamicRanges;
    }

    @Override // androidx.camera.video.VideoCapabilities
    public final List getSupportedQualities(DynamicRange dynamicRange) {
        EncoderProfilesResolver encoderProfilesResolver = this.mEncoderProfilesResolver;
        encoderProfilesResolver.getClass();
        CapabilitiesByQuality capabilities = encoderProfilesResolver.getCapabilities(dynamicRange);
        return capabilities != null ? new ArrayList(capabilities.mSupportedProfilesMap.keySet()) : EmptyList.INSTANCE;
    }
}
