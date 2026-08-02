package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xmm0 {
    public final Object a;
    public final xts0 b;
    public final cd3 c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final String g;

    public xmm0(Object obj, xts0 xts0Var, cd3 cd3Var, String str, boolean z, boolean z2, String str2) {
        this.a = obj;
        this.b = xts0Var;
        this.c = cd3Var;
        this.d = str;
        this.e = z;
        this.f = z2;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmm0)) {
            return false;
        }
        xmm0 xmm0Var = (xmm0) obj;
        return jl40.l(this.a, xmm0Var.a) && this.b.equals(xmm0Var.b) && jl40.l(this.c, xmm0Var.c) && jl40.l(this.d, xmm0Var.d) && this.e == xmm0Var.e && this.f == xmm0Var.f && jl40.l(this.g, xmm0Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        cd3 cd3Var = this.c;
        int e = unr0.e(unr0.e(unr0.b((hashCode + (cd3Var == null ? 0 : cd3Var.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        return e + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScenarioSelectorOptionModel(value=");
        sb.append(this.a);
        sb.append(", slot=");
        sb.append(this.b);
        sb.append(", selectedImage=");
        sb.append(this.c);
        sb.append(", backgroundColor=");
        sb.append(this.d);
        sb.append(", isDefault=");
        nnm.v(", isEnabled=", ", metricaLabel=", sb, this.e, this.f);
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }
}
