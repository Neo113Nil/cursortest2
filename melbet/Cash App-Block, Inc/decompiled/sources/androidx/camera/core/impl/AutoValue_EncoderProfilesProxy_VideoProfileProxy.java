package androidx.camera.core.impl;

import android.util.Size;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class AutoValue_EncoderProfilesProxy_VideoProfileProxy {
    public final int bitDepth;
    public final int bitrate;
    public final int chromaSubsampling;
    public final int codec;
    public final int frameRate;
    public final int hdrFormat;
    public final int height;
    public final String mediaType;
    public final int profile;
    public final int width;

    public AutoValue_EncoderProfilesProxy_VideoProfileProxy(int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.codec = i;
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null mediaType");
            throw null;
        }
        this.mediaType = str;
        this.bitrate = i2;
        this.frameRate = i3;
        this.width = i4;
        this.height = i5;
        this.profile = i6;
        this.bitDepth = i7;
        this.chromaSubsampling = i8;
        this.hdrFormat = i9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutoValue_EncoderProfilesProxy_VideoProfileProxy) {
            AutoValue_EncoderProfilesProxy_VideoProfileProxy autoValue_EncoderProfilesProxy_VideoProfileProxy = (AutoValue_EncoderProfilesProxy_VideoProfileProxy) obj;
            if (this.codec == autoValue_EncoderProfilesProxy_VideoProfileProxy.codec && this.mediaType.equals(autoValue_EncoderProfilesProxy_VideoProfileProxy.mediaType) && this.bitrate == autoValue_EncoderProfilesProxy_VideoProfileProxy.bitrate && this.frameRate == autoValue_EncoderProfilesProxy_VideoProfileProxy.frameRate && this.width == autoValue_EncoderProfilesProxy_VideoProfileProxy.width && this.height == autoValue_EncoderProfilesProxy_VideoProfileProxy.height && this.profile == autoValue_EncoderProfilesProxy_VideoProfileProxy.profile && this.bitDepth == autoValue_EncoderProfilesProxy_VideoProfileProxy.bitDepth && this.chromaSubsampling == autoValue_EncoderProfilesProxy_VideoProfileProxy.chromaSubsampling && this.hdrFormat == autoValue_EncoderProfilesProxy_VideoProfileProxy.hdrFormat) {
                return true;
            }
        }
        return false;
    }

    public final Size getResolution() {
        return new Size(this.width, this.height);
    }

    public final int hashCode() {
        return this.hdrFormat ^ ((((((((((((((((((this.codec ^ 1000003) * 1000003) ^ this.mediaType.hashCode()) * 1000003) ^ this.bitrate) * 1000003) ^ this.frameRate) * 1000003) ^ this.width) * 1000003) ^ this.height) * 1000003) ^ this.profile) * 1000003) ^ this.bitDepth) * 1000003) ^ this.chromaSubsampling) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoProfileProxy{codec=");
        sb.append(this.codec);
        sb.append(", mediaType=");
        sb.append(this.mediaType);
        sb.append(", bitrate=");
        sb.append(this.bitrate);
        sb.append(", frameRate=");
        sb.append(this.frameRate);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", profile=");
        sb.append(this.profile);
        sb.append(", bitDepth=");
        sb.append(this.bitDepth);
        sb.append(", chromaSubsampling=");
        sb.append(this.chromaSubsampling);
        sb.append(", hdrFormat=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.hdrFormat, "}", sb);
    }
}
