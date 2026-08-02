package androidx.camera.camera2.pipe.core;

/* loaded from: classes3.dex */
public final class TimestampNs {
    public final long value;

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m82toStringimpl(long j) {
        return "TimestampNs(value=" + j + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TimestampNs) {
            return this.value == ((TimestampNs) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.value);
    }

    public final String toString() {
        return m82toStringimpl(this.value);
    }
}
