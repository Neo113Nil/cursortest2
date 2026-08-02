package androidx.camera.video.internal;

import androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_AudioProfileProxy;
import androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_VideoProfileProxy;
import androidx.camera.core.impl.EncoderProfilesProxy;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.List;

/* loaded from: classes3.dex */
public final class AutoValue_VideoValidatedEncoderProfilesProxy implements EncoderProfilesProxy {
    public final List audioProfiles;
    public final AutoValue_EncoderProfilesProxy_AudioProfileProxy defaultAudioProfile;
    public final int defaultDurationSeconds;
    public final AutoValue_EncoderProfilesProxy_VideoProfileProxy defaultVideoProfile;
    public final int recommendedFileFormat;
    public final List videoProfiles;

    public AutoValue_VideoValidatedEncoderProfilesProxy(int i, int i2, List list, List list2, AutoValue_EncoderProfilesProxy_AudioProfileProxy autoValue_EncoderProfilesProxy_AudioProfileProxy, AutoValue_EncoderProfilesProxy_VideoProfileProxy autoValue_EncoderProfilesProxy_VideoProfileProxy) {
        this.defaultDurationSeconds = i;
        this.recommendedFileFormat = i2;
        if (list == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null audioProfiles");
            throw null;
        }
        this.audioProfiles = list;
        if (list2 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null videoProfiles");
            throw null;
        }
        this.videoProfiles = list2;
        this.defaultAudioProfile = autoValue_EncoderProfilesProxy_AudioProfileProxy;
        if (autoValue_EncoderProfilesProxy_VideoProfileProxy != null) {
            this.defaultVideoProfile = autoValue_EncoderProfilesProxy_VideoProfileProxy;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("Null defaultVideoProfile");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutoValue_VideoValidatedEncoderProfilesProxy) {
            AutoValue_VideoValidatedEncoderProfilesProxy autoValue_VideoValidatedEncoderProfilesProxy = (AutoValue_VideoValidatedEncoderProfilesProxy) obj;
            if (this.defaultDurationSeconds == autoValue_VideoValidatedEncoderProfilesProxy.defaultDurationSeconds && this.recommendedFileFormat == autoValue_VideoValidatedEncoderProfilesProxy.recommendedFileFormat && this.audioProfiles.equals(autoValue_VideoValidatedEncoderProfilesProxy.audioProfiles) && this.videoProfiles.equals(autoValue_VideoValidatedEncoderProfilesProxy.videoProfiles)) {
                AutoValue_EncoderProfilesProxy_AudioProfileProxy autoValue_EncoderProfilesProxy_AudioProfileProxy = autoValue_VideoValidatedEncoderProfilesProxy.defaultAudioProfile;
                AutoValue_EncoderProfilesProxy_AudioProfileProxy autoValue_EncoderProfilesProxy_AudioProfileProxy2 = this.defaultAudioProfile;
                if (autoValue_EncoderProfilesProxy_AudioProfileProxy2 != null ? autoValue_EncoderProfilesProxy_AudioProfileProxy2.equals(autoValue_EncoderProfilesProxy_AudioProfileProxy) : autoValue_EncoderProfilesProxy_AudioProfileProxy == null) {
                    if (this.defaultVideoProfile.equals(autoValue_VideoValidatedEncoderProfilesProxy.defaultVideoProfile)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final List getAudioProfiles() {
        return this.audioProfiles;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final int getDefaultDurationSeconds() {
        return this.defaultDurationSeconds;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final int getRecommendedFileFormat() {
        return this.recommendedFileFormat;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final List getVideoProfiles() {
        return this.videoProfiles;
    }

    public final int hashCode() {
        int hashCode = (((((((this.defaultDurationSeconds ^ 1000003) * 1000003) ^ this.recommendedFileFormat) * 1000003) ^ this.audioProfiles.hashCode()) * 1000003) ^ this.videoProfiles.hashCode()) * 1000003;
        AutoValue_EncoderProfilesProxy_AudioProfileProxy autoValue_EncoderProfilesProxy_AudioProfileProxy = this.defaultAudioProfile;
        return this.defaultVideoProfile.hashCode() ^ ((hashCode ^ (autoValue_EncoderProfilesProxy_AudioProfileProxy == null ? 0 : autoValue_EncoderProfilesProxy_AudioProfileProxy.hashCode())) * 1000003);
    }

    public final String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.defaultDurationSeconds + ", recommendedFileFormat=" + this.recommendedFileFormat + ", audioProfiles=" + this.audioProfiles + ", videoProfiles=" + this.videoProfiles + ", defaultAudioProfile=" + this.defaultAudioProfile + ", defaultVideoProfile=" + this.defaultVideoProfile + "}";
    }
}
