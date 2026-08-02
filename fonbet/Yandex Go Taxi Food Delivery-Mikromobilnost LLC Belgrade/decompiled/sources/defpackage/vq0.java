package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vq0 extends n351 {
    public final String c;
    public final ky d;
    public final String e;
    public final boolean f;
    public final Object g;
    public final aa01 h;
    public final boolean i;

    public vq0(String str, ky kyVar, String str2, boolean z, Object obj, aa01 aa01Var, boolean z2) {
        super("address-button", false, 14);
        this.c = str;
        this.d = kyVar;
        this.e = str2;
        this.f = z;
        this.g = obj;
        this.h = aa01Var;
        this.i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq0)) {
            return false;
        }
        vq0 vq0Var = (vq0) obj;
        return jl40.l(this.c, vq0Var.c) && this.d.equals(vq0Var.d) && jl40.l(this.e, vq0Var.e) && this.f == vq0Var.f && jl40.l(this.g, vq0Var.g) && jl40.l(this.h, vq0Var.h) && this.i == vq0Var.i;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + (this.c.hashCode() * 31)) * 31;
        String str = this.e;
        int e = unr0.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        Object obj = this.g;
        int hashCode2 = (e + (obj == null ? 0 : obj.hashCode())) * 31;
        aa01 aa01Var = this.h;
        return Boolean.hashCode(this.i) + ((hashCode2 + (aa01Var != null ? aa01Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddressButtonState(text=");
        sb.append(this.c);
        sb.append(", action=");
        sb.append(this.d);
        sb.append(", metricaLabel=");
        tse0.y(this.e, ", showWhenSectionCollapsed=", ", meta=", sb, this.f);
        sb.append(this.g);
        sb.append(", trailButtonState=");
        sb.append(this.h);
        sb.append(", isCollapsed=");
        return x4e.i(sb, this.i, Extension.C_BRAKE);
    }
}
