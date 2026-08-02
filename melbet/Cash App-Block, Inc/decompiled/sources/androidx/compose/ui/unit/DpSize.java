package androidx.compose.ui.unit;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class DpSize {
    public final long packedValue;

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1042equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public static final float m1043getHeightD9Ej5fM(long j) {
        return Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public static final float m1044getWidthD9Ej5fM(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1045toStringimpl(long j) {
        if (j == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) Dp.m1038toStringimpl(m1044getWidthD9Ej5fM(j))) + " x " + ((Object) Dp.m1038toStringimpl(m1043getHeightD9Ej5fM(j)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DpSize) {
            return this.packedValue == ((DpSize) obj).packedValue;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.packedValue);
    }

    public final String toString() {
        return m1045toStringimpl(this.packedValue);
    }
}
