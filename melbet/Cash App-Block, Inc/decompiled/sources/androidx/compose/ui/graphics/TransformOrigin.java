package androidx.compose.ui.graphics;

/* loaded from: classes.dex */
public final class TransformOrigin {
    public static final /* synthetic */ int $r8$clinit = 0;
    public static final long Center = ColorKt.TransformOrigin(0.5f, 0.5f);
    public final long packedValue;

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m714equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m715toStringimpl(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TransformOrigin) {
            return this.packedValue == ((TransformOrigin) obj).packedValue;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.packedValue);
    }

    public final String toString() {
        return m715toStringimpl(this.packedValue);
    }
}
