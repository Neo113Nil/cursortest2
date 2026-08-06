package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class a91 {
    public final long GWasM1elztuh;
    public static final b91[] Yi7zF1RB1 = {new b91(0), new b91(4294967296L), new b91(8589934592L)};
    public static final long X1lG3V04pd = o50.EXrPz3p7hFb(Float.NaN, 0);

    public static final boolean GWasM1elztuh(long j, long j2) {
        return j == j2;
    }

    public static final float X1lG3V04pd(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long Yi7zF1RB1(long j) {
        return Yi7zF1RB1[(int) ((j & 1095216660480L) >>> 32)].GWasM1elztuh;
    }

    public static String xqGvceK5x(long j) {
        long Yi7zF1RB12 = Yi7zF1RB1(j);
        if (b91.GWasM1elztuh(Yi7zF1RB12, 0L)) {
            return "Unspecified";
        }
        if (b91.GWasM1elztuh(Yi7zF1RB12, 4294967296L)) {
            return X1lG3V04pd(j) + ".sp";
        }
        if (!b91.GWasM1elztuh(Yi7zF1RB12, 8589934592L)) {
            return "Invalid";
        }
        return X1lG3V04pd(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a91) {
            return this.GWasM1elztuh == ((a91) obj).GWasM1elztuh;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.GWasM1elztuh);
    }

    public final String toString() {
        return xqGvceK5x(this.GWasM1elztuh);
    }
}
