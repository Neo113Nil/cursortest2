package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class s5w {
    public final long a;

    public static long a(int i, int i2) {
        return (i2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (i << 32);
    }

    public static String b(long j) {
        StringBuilder sb = new StringBuilder(Extension.O_BRAKE);
        sb.append((int) (j >> 32));
        sb.append(Extension.FIX_SPACE);
        return oyr.s(sb, (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s5w) {
            return this.a == ((s5w) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
