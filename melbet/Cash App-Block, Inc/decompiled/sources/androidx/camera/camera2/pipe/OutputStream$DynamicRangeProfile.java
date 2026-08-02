package androidx.camera.camera2.pipe;

/* loaded from: classes3.dex */
public final class OutputStream$DynamicRangeProfile {
    public final long value;

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m49toStringimpl(long j) {
        return "DynamicRangeProfile(value=" + j + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OutputStream$DynamicRangeProfile) {
            return this.value == ((OutputStream$DynamicRangeProfile) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.value);
    }

    public final String toString() {
        return m49toStringimpl(this.value);
    }
}
