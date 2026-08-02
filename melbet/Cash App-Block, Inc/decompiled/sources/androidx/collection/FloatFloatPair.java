package androidx.collection;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class FloatFloatPair {
    public final long packedValue;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m127constructorimpl(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f) << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FloatFloatPair) {
            return this.packedValue == ((FloatFloatPair) obj).packedValue;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.packedValue);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j = this.packedValue;
        sb.append(Float.intBitsToFloat((int) (j >> 32)));
        sb.append(", ");
        sb.append(Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)));
        sb.append(')');
        return sb.toString();
    }
}
