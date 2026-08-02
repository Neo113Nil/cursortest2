package androidx.camera.video.internal.audio;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;

/* loaded from: classes3.dex */
public final class AutoValue_AudioStream_PacketInfo {
    public final int sizeInBytes;
    public final long timestampNs;

    public AutoValue_AudioStream_PacketInfo(int i, long j) {
        this.sizeInBytes = i;
        this.timestampNs = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutoValue_AudioStream_PacketInfo) {
            AutoValue_AudioStream_PacketInfo autoValue_AudioStream_PacketInfo = (AutoValue_AudioStream_PacketInfo) obj;
            if (this.sizeInBytes == autoValue_AudioStream_PacketInfo.sizeInBytes && this.timestampNs == autoValue_AudioStream_PacketInfo.timestampNs) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.sizeInBytes ^ 1000003) * 1000003;
        long j = this.timestampNs;
        return ((int) ((j >>> 32) ^ j)) ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PacketInfo{sizeInBytes=");
        sb.append(this.sizeInBytes);
        sb.append(", timestampNs=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.timestampNs, "}", sb);
    }
}
