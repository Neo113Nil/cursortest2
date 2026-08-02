package androidx.camera.camera2.pipe;

/* loaded from: classes3.dex */
public final class ConfigQueryResult {
    public final int value;

    public final boolean equals(Object obj) {
        if (obj instanceof ConfigQueryResult) {
            return this.value == ((ConfigQueryResult) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        int i = this.value;
        return i == 1 ? "SUPPORTED" : i == 2 ? "UNSUPPORTED" : "UNKNOWN";
    }
}
