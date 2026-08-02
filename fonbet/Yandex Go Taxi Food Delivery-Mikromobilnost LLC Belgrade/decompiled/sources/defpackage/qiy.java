package defpackage;

import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class qiy extends zfr0 {
    public final List c;
    public final List d;
    public final long e;
    public final long f;
    public final int g;

    public qiy(List list, ArrayList arrayList, long j, long j2, int i) {
        this.c = list;
        this.d = arrayList;
        this.e = j;
        this.f = j2;
        this.g = i;
    }

    @Override // defpackage.zfr0
    public final Shader b(long j) {
        long j2 = this.e;
        int i = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
            i = (int) (j >> 32);
        }
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
            i2 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        }
        float intBitsToFloat2 = Float.intBitsToFloat(i2);
        long j3 = this.f;
        int i3 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float intBitsToFloat3 = Float.intBitsToFloat(i3);
        int i4 = (int) (j3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        }
        float intBitsToFloat4 = Float.intBitsToFloat(i4);
        return xab1.b((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), this.c, this.d, this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qiy)) {
            return false;
        }
        qiy qiyVar = (qiy) obj;
        return jl40.l(this.c, qiyVar.c) && jl40.l(this.d, qiyVar.d) && wu60.c(this.e, qiyVar.e) && wu60.c(this.f, qiyVar.f) && this.g == qiyVar.g;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        List list = this.d;
        return Integer.hashCode(this.g) + qv10.c(qv10.c((hashCode + (list != null ? list.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        String str;
        long j = this.e;
        String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) wu60.h(j)) + Extension.FIX_SPACE;
        } else {
            str = "";
        }
        long j2 = this.f;
        if (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) wu60.h(j2)) + Extension.FIX_SPACE;
        }
        StringBuilder sb = new StringBuilder("LinearGradient(colors=");
        sb.append(this.c);
        sb.append(", stops=");
        oyr.D(Extension.FIX_SPACE, str, str2, sb, this.d);
        sb.append("tileMode=");
        sb.append((Object) kpb1.c(this.g));
        sb.append(')');
        return sb.toString();
    }
}
