package androidx.compose.ui.unit;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class DpOffset {
    public final long packedValue;

    /* renamed from: getX-D9Ej5fM, reason: not valid java name */
    public static final float m1039getXD9Ej5fM(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getY-D9Ej5fM, reason: not valid java name */
    public static final float m1040getYD9Ej5fM(long j) {
        return Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1041toStringimpl(long j) {
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) Dp.m1038toStringimpl(m1039getXD9Ej5fM(j))) + ", " + ((Object) Dp.m1038toStringimpl(m1040getYD9Ej5fM(j))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DpOffset) {
            return this.packedValue == ((DpOffset) obj).packedValue;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.packedValue);
    }

    public final String toString() {
        return m1041toStringimpl(this.packedValue);
    }
}
