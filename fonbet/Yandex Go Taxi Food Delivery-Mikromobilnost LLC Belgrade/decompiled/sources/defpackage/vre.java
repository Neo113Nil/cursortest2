package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class vre {
    public final long a;

    public /* synthetic */ vre(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static String b(long j) {
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        if (intBitsToFloat == Float.intBitsToFloat(i2)) {
            return "CornerRadius.circular(" + mwa1.d(Float.intBitsToFloat(i)) + ')';
        }
        return "CornerRadius.elliptical(" + mwa1.d(Float.intBitsToFloat(i)) + Extension.FIX_SPACE + mwa1.d(Float.intBitsToFloat(i2)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vre) {
            return this.a == ((vre) obj).a;
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
