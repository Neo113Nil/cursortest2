package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class xn00 implements fo00 {
    public final zwy0 a;
    public final zwy0 b;
    public final CharSequence c;
    public final CharSequence d;
    public final boolean e;

    public xn00(zwy0 zwy0Var, zwy0 zwy0Var2, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        this.a = zwy0Var;
        this.b = zwy0Var2;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn00)) {
            return false;
        }
        xn00 xn00Var = (xn00) obj;
        return jl40.l(this.a, xn00Var.a) && jl40.l(this.b, xn00Var.b) && jl40.l(this.c, xn00Var.c) && jl40.l(this.d, xn00Var.d) && this.e == xn00Var.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zwy0 zwy0Var = this.b;
        int hashCode2 = (hashCode + (zwy0Var == null ? 0 : zwy0Var.hashCode())) * 31;
        CharSequence charSequence = this.c;
        int hashCode3 = (hashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.d;
        return Boolean.hashCode(this.e) + ((hashCode3 + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SupermapUniversalLPinStyle(imageAssetBitmap=");
        sb.append(this.a);
        sb.append(", badgeAssetBitmap=");
        sb.append(this.b);
        sb.append(", title=");
        vfc.A(sb, this.c, ", subtitle=", this.d, ", isOrganization=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
