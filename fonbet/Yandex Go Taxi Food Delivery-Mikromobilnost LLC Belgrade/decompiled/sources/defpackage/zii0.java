package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class zii0 {
    public static final zii0 e = new zii0(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public zii0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static zii0 b(zii0 zii0Var, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = zii0Var.a;
        }
        float f4 = (i & 2) != 0 ? zii0Var.b : Float.NEGATIVE_INFINITY;
        if ((i & 4) != 0) {
            f2 = zii0Var.c;
        }
        if ((i & 8) != 0) {
            f3 = zii0Var.d;
        }
        return new zii0(f, f4, f2, f3);
    }

    public final boolean a(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        return (intBitsToFloat >= this.a) & (intBitsToFloat < this.c) & (intBitsToFloat2 >= this.b) & (intBitsToFloat2 < this.d);
    }

    public final long c() {
        float f = this.c;
        float f2 = this.a;
        float a = n.a(f, f2, 2.0f, f2);
        float f3 = this.b;
        float a2 = n.a(this.d, f3, 2.0f, f3);
        return (Float.floatToRawIntBits(a) << 32) | (Float.floatToRawIntBits(a2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    }

    public final long d() {
        float f = this.c - this.a;
        float f2 = this.d - this.b;
        return (Float.floatToRawIntBits(f2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(f) << 32);
    }

    public final long e() {
        return (Float.floatToRawIntBits(this.a) << 32) | (Float.floatToRawIntBits(this.b) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zii0)) {
            return false;
        }
        zii0 zii0Var = (zii0) obj;
        return Float.compare(this.a, zii0Var.a) == 0 && Float.compare(this.b, zii0Var.b) == 0 && Float.compare(this.c, zii0Var.c) == 0 && Float.compare(this.d, zii0Var.d) == 0;
    }

    public final zii0 f(zii0 zii0Var) {
        return new zii0(Math.max(this.a, zii0Var.a), Math.max(this.b, zii0Var.b), Math.min(this.c, zii0Var.c), Math.min(this.d, zii0Var.d));
    }

    public final boolean g() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final boolean h(zii0 zii0Var) {
        return (this.a < zii0Var.c) & (zii0Var.a < this.c) & (this.b < zii0Var.d) & (zii0Var.b < this.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + g8e.c(this.c, g8e.c(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final zii0 i(float f, float f2) {
        return new zii0(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final zii0 j(long j) {
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i) + this.a;
        int i2 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        return new zii0(intBitsToFloat, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + mwa1.d(this.a) + Extension.FIX_SPACE + mwa1.d(this.b) + Extension.FIX_SPACE + mwa1.d(this.c) + Extension.FIX_SPACE + mwa1.d(this.d) + ')';
    }
}
