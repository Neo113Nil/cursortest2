package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class yn00 implements fo00 {
    public final zwy0 a;
    public final zwy0 b;

    public yn00(zwy0 zwy0Var, zwy0 zwy0Var2) {
        this.a = zwy0Var;
        this.b = zwy0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yn00)) {
            return false;
        }
        yn00 yn00Var = (yn00) obj;
        return jl40.l(this.a, yn00Var.a) && jl40.l(this.b, yn00Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zwy0 zwy0Var = this.b;
        return hashCode + (zwy0Var == null ? 0 : zwy0Var.hashCode());
    }

    public final String toString() {
        return "SupermapUniversalLSelectedPinStyle(imageAssetBitmap=" + this.a + ", badgeAssetBitmap=" + this.b + Extension.C_BRAKE;
    }
}
