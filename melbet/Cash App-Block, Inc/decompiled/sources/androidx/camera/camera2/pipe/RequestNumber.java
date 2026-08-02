package androidx.camera.camera2.pipe;

/* loaded from: classes3.dex */
public final class RequestNumber {
    public final long value;

    public final boolean equals(Object obj) {
        if (obj instanceof RequestNumber) {
            return this.value == ((RequestNumber) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.value);
    }

    public final String toString() {
        return "RequestNumber(value=" + this.value + ')';
    }
}
