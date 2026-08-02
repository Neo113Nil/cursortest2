package androidx.compose.ui.unit;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class IntSize {
    public final long packedValue;

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1054equalsimpl(Object obj, long j) {
        return (obj instanceof IntSize) && j == ((IntSize) obj).packedValue;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1055equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1056toStringimpl(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & BodyPartID.bodyIdMax));
    }

    public final boolean equals(Object obj) {
        return m1054equalsimpl(obj, this.packedValue);
    }

    public final int hashCode() {
        return Long.hashCode(this.packedValue);
    }

    public final String toString() {
        return m1056toStringimpl(this.packedValue);
    }
}
