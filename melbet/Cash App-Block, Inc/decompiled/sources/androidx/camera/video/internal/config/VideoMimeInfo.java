package androidx.camera.video.internal.config;

import androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_VideoProfileProxy;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class VideoMimeInfo {
    public final AutoValue_EncoderProfilesProxy_VideoProfileProxy compatibleVideoProfile;
    public final String mimeType;

    public VideoMimeInfo(String str, AutoValue_EncoderProfilesProxy_VideoProfileProxy autoValue_EncoderProfilesProxy_VideoProfileProxy) {
        str.getClass();
        this.mimeType = str;
        this.compatibleVideoProfile = autoValue_EncoderProfilesProxy_VideoProfileProxy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoMimeInfo)) {
            return false;
        }
        VideoMimeInfo videoMimeInfo = (VideoMimeInfo) obj;
        return Intrinsics.areEqual(this.mimeType, videoMimeInfo.mimeType) && Intrinsics.areEqual(this.compatibleVideoProfile, videoMimeInfo.compatibleVideoProfile);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(-1, this.mimeType.hashCode() * 31, 31);
        AutoValue_EncoderProfilesProxy_VideoProfileProxy autoValue_EncoderProfilesProxy_VideoProfileProxy = this.compatibleVideoProfile;
        return m + (autoValue_EncoderProfilesProxy_VideoProfileProxy == null ? 0 : autoValue_EncoderProfilesProxy_VideoProfileProxy.hashCode());
    }

    public final String toString() {
        return "VideoMimeInfo(mimeType=" + this.mimeType + ", profile=-1, compatibleVideoProfile=" + this.compatibleVideoProfile + ')';
    }
}
