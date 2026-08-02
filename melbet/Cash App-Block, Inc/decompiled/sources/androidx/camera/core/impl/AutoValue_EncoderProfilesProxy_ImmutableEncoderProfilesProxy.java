package androidx.camera.core.impl;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy implements EncoderProfilesProxy {
    public final List audioProfiles;
    public final int defaultDurationSeconds;
    public final int recommendedFileFormat;
    public final List videoProfiles;

    public AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy(int i, int i2, List list, List list2) {
        this.defaultDurationSeconds = i;
        this.recommendedFileFormat = i2;
        if (list == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null audioProfiles");
            throw null;
        }
        this.audioProfiles = list;
        if (list2 != null) {
            this.videoProfiles = list2;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("Null videoProfiles");
            throw null;
        }
    }

    public static AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy create(int i, int i2, List list, List list2) {
        return new AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy(i, i2, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy) {
            AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy = (AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy) obj;
            if (this.defaultDurationSeconds == autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy.defaultDurationSeconds && this.recommendedFileFormat == autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy.recommendedFileFormat && this.audioProfiles.equals(autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy.audioProfiles) && this.videoProfiles.equals(autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy.videoProfiles)) {
                return true;
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
        return this.videoProfiles.hashCode() ^ ((((((this.defaultDurationSeconds ^ 1000003) * 1000003) ^ this.recommendedFileFormat) * 1000003) ^ this.audioProfiles.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableEncoderProfilesProxy{defaultDurationSeconds=");
        sb.append(this.defaultDurationSeconds);
        sb.append(", recommendedFileFormat=");
        sb.append(this.recommendedFileFormat);
        sb.append(", audioProfiles=");
        sb.append(this.audioProfiles);
        sb.append(", videoProfiles=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.videoProfiles, "}");
    }
}
