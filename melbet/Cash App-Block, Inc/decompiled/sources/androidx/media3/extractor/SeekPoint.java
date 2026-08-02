package androidx.media3.extractor;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;

/* loaded from: classes3.dex */
public final class SeekPoint {
    public static final SeekPoint START = new SeekPoint(0, 0);
    public final long position;
    public final long timeUs;

    public SeekPoint(long j, long j2) {
        this.timeUs = j;
        this.position = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SeekPoint.class == obj.getClass()) {
            SeekPoint seekPoint = (SeekPoint) obj;
            if (this.timeUs == seekPoint.timeUs && this.position == seekPoint.position) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.timeUs) * 31) + ((int) this.position);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.timeUs);
        sb.append(", position=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.position, "]", sb);
    }
}
