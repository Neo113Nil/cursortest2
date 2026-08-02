package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vbp0 implements xbp0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public vbp0(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbp0)) {
            return false;
        }
        vbp0 vbp0Var = (vbp0) obj;
        return this.a.equals(vbp0Var.a) && this.b.equals(vbp0Var.b) && jl40.l(this.c, vbp0Var.c) && this.d == vbp0Var.d;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return nnm.i(this.c, ", isPromotionBannersEnabled=", Extension.C_BRAKE, b64.v("Tracking(status=", this.a, ", tariffClass=", this.b, ", role="), this.d);
    }
}
