package androidx.compose.foundation.lazy.grid;

/* loaded from: classes3.dex */
public final class GridItemSpan {
    public final long packedValue;

    public final boolean equals(Object obj) {
        if (obj instanceof GridItemSpan) {
            return this.packedValue == ((GridItemSpan) obj).packedValue;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.packedValue);
    }

    public final String toString() {
        return "GridItemSpan(packedValue=" + this.packedValue + ')';
    }
}
