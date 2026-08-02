package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xc1 extends n351 {
    public final boolean c;
    public final boolean d;
    public final wc1 e;
    public final Object f;
    public final String g;

    public xc1(boolean z, boolean z2, wc1 wc1Var, Object obj, String str) {
        super("ads-banner", false, 14);
        this.c = z;
        this.d = z2;
        this.e = wc1Var;
        this.f = obj;
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc1)) {
            return false;
        }
        xc1 xc1Var = (xc1) obj;
        return this.c == xc1Var.c && this.d == xc1Var.d && this.e.equals(xc1Var.e) && jl40.l(this.f, xc1Var.f) && jl40.l(this.g, xc1Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + unr0.e(Boolean.hashCode(this.c) * 31, 31, this.d)) * 31;
        Object obj = this.f;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.g;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u = qv10.u("AdsBannerState(showWhenSectionCollapsed=", ", isCollapsed=", ", adsBannerSettings=", this.c, this.d);
        u.append(this.e);
        u.append(", meta=");
        u.append(this.f);
        u.append(", metricaLabel=");
        return oyr.t(u, this.g, Extension.C_BRAKE);
    }
}
