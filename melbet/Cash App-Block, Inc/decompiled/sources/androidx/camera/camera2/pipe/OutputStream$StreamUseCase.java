package androidx.camera.camera2.pipe;

/* loaded from: classes3.dex */
public final class OutputStream$StreamUseCase {
    public final long value;

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m51equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OutputStream$StreamUseCase) {
            return this.value == ((OutputStream$StreamUseCase) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.value);
    }

    public final String toString() {
        return "StreamUseCase(value=" + this.value + ')';
    }
}
