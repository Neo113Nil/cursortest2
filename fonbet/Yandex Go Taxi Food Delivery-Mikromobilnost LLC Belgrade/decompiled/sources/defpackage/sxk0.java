package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class sxk0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        ora1.c(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public sxk0(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final long a() {
        return this.h;
    }

    public final long b() {
        return this.g;
    }

    public final float c() {
        return this.d - this.b;
    }

    public final float d() {
        return this.a;
    }

    public final float e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxk0)) {
            return false;
        }
        sxk0 sxk0Var = (sxk0) obj;
        return Float.compare(this.a, sxk0Var.a) == 0 && Float.compare(this.b, sxk0Var.b) == 0 && Float.compare(this.c, sxk0Var.c) == 0 && Float.compare(this.d, sxk0Var.d) == 0 && vre.a(this.e, sxk0Var.e) && vre.a(this.f, sxk0Var.f) && vre.a(this.g, sxk0Var.g) && vre.a(this.h, sxk0Var.h);
    }

    public final long f() {
        return this.e;
    }

    public final long g() {
        return this.f;
    }

    public final float h() {
        return this.c - this.a;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + qv10.c(qv10.c(qv10.c(g8e.c(this.d, g8e.c(this.c, g8e.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        String str = mwa1.d(this.a) + Extension.FIX_SPACE + mwa1.d(this.b) + Extension.FIX_SPACE + mwa1.d(this.c) + Extension.FIX_SPACE + mwa1.d(this.d);
        long j = this.e;
        long j2 = this.f;
        boolean a = vre.a(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (!a || !vre.a(j2, j3) || !vre.a(j3, j4)) {
            StringBuilder x = unr0.x("RoundRect(rect=", str, ", topLeft=");
            x.append((Object) vre.b(j));
            x.append(", topRight=");
            x.append((Object) vre.b(j2));
            x.append(", bottomRight=");
            x.append((Object) vre.b(j3));
            x.append(", bottomLeft=");
            x.append((Object) vre.b(j4));
            x.append(')');
            return x.toString();
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        if (intBitsToFloat == Float.intBitsToFloat(i2)) {
            StringBuilder x2 = unr0.x("RoundRect(rect=", str, ", radius=");
            x2.append(mwa1.d(Float.intBitsToFloat(i)));
            x2.append(')');
            return x2.toString();
        }
        StringBuilder x3 = unr0.x("RoundRect(rect=", str, ", x=");
        x3.append(mwa1.d(Float.intBitsToFloat(i)));
        x3.append(", y=");
        x3.append(mwa1.d(Float.intBitsToFloat(i2)));
        x3.append(')');
        return x3.toString();
    }
}
