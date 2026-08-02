package androidx.camera.camera2.pipe.core;

/* loaded from: classes3.dex */
public final class DurationNs {
    public final long value;

    /* renamed from: compareTo-zYRVrok, reason: not valid java name */
    public static final int m81compareTozYRVrok(long j, long j2) {
        if (j == j2) {
            return 0;
        }
        return j < j2 ? -1 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DurationNs) {
            return this.value == ((DurationNs) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.value);
    }

    public final String toString() {
        return "DurationNs(value=" + this.value + ')';
    }
}
