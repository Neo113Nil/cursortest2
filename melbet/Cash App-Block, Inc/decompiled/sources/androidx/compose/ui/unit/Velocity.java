package androidx.compose.ui.unit;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class Velocity {
    public final long packedValue;

    public /* synthetic */ Velocity(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Velocity m1064boximpl(long j) {
        return new Velocity(j);
    }

    /* renamed from: copy-OhffZ5M$default, reason: not valid java name */
    public static long m1065copyOhffZ5M$default(float f, float f2, int i, long j) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
        }
        return (Float.floatToRawIntBits(f2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f) << 32);
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1066equalsimpl0(long j) {
        return j == 0;
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final float m1067getXimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final float m1068getYimpl(long j) {
        return Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
    }

    /* renamed from: minus-AH228Gc, reason: not valid java name */
    public static final long m1069minusAH228Gc(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) - Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax);
    }

    /* renamed from: plus-AH228Gc, reason: not valid java name */
    public static final long m1070plusAH228Gc(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) + Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
        return (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    /* renamed from: times-adjELrA, reason: not valid java name */
    public static final long m1071timesadjELrA(long j, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) * f;
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1072toStringimpl(long j) {
        return "(" + m1067getXimpl(j) + ", " + m1068getYimpl(j) + ") px/sec";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Velocity) {
            return this.packedValue == ((Velocity) obj).packedValue;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.packedValue);
    }

    public final String toString() {
        return m1072toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m1073unboximpl() {
        return this.packedValue;
    }
}
