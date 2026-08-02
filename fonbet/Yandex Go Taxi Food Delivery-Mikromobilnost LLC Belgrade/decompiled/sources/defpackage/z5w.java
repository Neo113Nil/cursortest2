package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class z5w {
    public final long a;

    public /* synthetic */ z5w(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static final long b(long j, long j2) {
        return ((((int) (j >> 32)) - ((int) (j2 >> 32))) << 32) | ((((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - ((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    }

    public static final long c(long j, long j2) {
        return ((((int) (j >> 32)) + ((int) (j2 >> 32))) << 32) | ((((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + ((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    }

    public static String d(long j) {
        StringBuilder sb = new StringBuilder(Extension.O_BRAKE);
        sb.append((int) (j >> 32));
        sb.append(Extension.FIX_SPACE);
        return oyr.s(sb, (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z5w) {
            return this.a == ((z5w) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}
