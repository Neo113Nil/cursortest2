package androidx.camera.camera2.pipe;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;

/* loaded from: classes3.dex */
public final class FrameNumber {
    public final long value;

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m47toStringimpl(long j) {
        return Recorder$$ExternalSyntheticOutline2.m(j, "Frame-");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FrameNumber) {
            return this.value == ((FrameNumber) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.value);
    }

    public final String toString() {
        return m47toStringimpl(this.value);
    }
}
