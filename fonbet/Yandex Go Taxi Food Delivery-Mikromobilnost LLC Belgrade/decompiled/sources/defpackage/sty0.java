package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes.dex */
public final class sty0 {
    public static final tty0[] b = {new tty0(0), new tty0(4294967296L), new tty0(8589934592L)};
    public static final long c = uh6.K(Float.NaN, 0);
    public final long a;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static final long b(long j) {
        return b[(int) ((j & 1095216660480L) >>> 32)].a;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
    }

    public static final boolean d(long j) {
        return (j & 1095216660480L) == 8589934592L;
    }

    public static String e(long j) {
        long b2 = b(j);
        if (tty0.a(b2, 0L)) {
            return "Unspecified";
        }
        if (tty0.a(b2, 4294967296L)) {
            return c(j) + ".sp";
        }
        if (!tty0.a(b2, 8589934592L)) {
            return "Invalid";
        }
        return c(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sty0) {
            return this.a == ((sty0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return e(this.a);
    }
}
