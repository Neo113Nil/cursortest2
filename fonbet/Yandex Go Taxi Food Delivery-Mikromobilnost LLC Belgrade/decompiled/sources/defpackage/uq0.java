package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class uq0 extends s151 {
    public final String a;
    public final hhg b;
    public final y901 c;
    public final boolean d;
    public final Object e;
    public final String f;

    public uq0(String str, hhg hhgVar, y901 y901Var, boolean z, Object obj, String str2) {
        this.a = str;
        this.b = hhgVar;
        this.c = y901Var;
        this.d = z;
        this.e = obj;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq0)) {
            return false;
        }
        uq0 uq0Var = (uq0) obj;
        return jl40.l(this.a, uq0Var.a) && jl40.l(this.b, uq0Var.b) && jl40.l(this.c, uq0Var.c) && this.d == uq0Var.d && jl40.l(this.e, uq0Var.e) && jl40.l(this.f, uq0Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 961;
        y901 y901Var = this.c;
        int e = unr0.e((hashCode + (y901Var == null ? 0 : y901Var.hashCode())) * 31, 31, this.d);
        Object obj = this.e;
        int hashCode2 = (e + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.f;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AddressButtonModel(text=" + this.a + ", action=" + this.b + ", accessibilityLabel=null, trailButtonModel=" + this.c + ", showWhenSectionCollapsed=" + this.d + ", meta=" + this.e + ", metricaLabel=" + this.f + Extension.C_BRAKE;
    }
}
