package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishOkHttpRoom {
    public final long CatchingFishParcelableFAB;

    public static final long CatchingFishParcelableFAB(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long CatchingFishSnackbar(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CatchingFishOkHttpRoom) {
            return this.CatchingFishParcelableFAB == ((CatchingFishOkHttpRoom) obj).CatchingFishParcelableFAB;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.CatchingFishParcelableFAB);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j = this.CatchingFishParcelableFAB;
        sb.append(Float.intBitsToFloat((int) (j >> 32)));
        sb.append(", ");
        sb.append(Float.intBitsToFloat((int) (j & 4294967295L)));
        sb.append(") px/sec");
        return sb.toString();
    }
}
