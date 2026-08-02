package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class rvs0 implements fws0, fib, hz {
    public final boolean a;
    public final String b;
    public final Object c;
    public final r9x0 d;
    public final r9x0 e;
    public final String f;
    public final String g;

    public rvs0(r9x0 r9x0Var, r9x0 r9x0Var2, Object obj, String str, String str2, String str3, boolean z) {
        this.a = z;
        this.b = str;
        this.c = obj;
        this.d = r9x0Var;
        this.e = r9x0Var2;
        this.f = str2;
        this.g = str3;
    }

    @Override // defpackage.fib
    public final boolean a() {
        return false;
    }

    @Override // defpackage.fib
    public final r9x0 b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvs0)) {
            return false;
        }
        rvs0 rvs0Var = (rvs0) obj;
        return this.a == rvs0Var.a && jl40.l(this.b, rvs0Var.b) && jl40.l(this.c, rvs0Var.c) && jl40.l(this.d, rvs0Var.d) && jl40.l(this.e, rvs0Var.e) && jl40.l(this.f, rvs0Var.f) && jl40.l(this.g, rvs0Var.g);
    }

    @Override // defpackage.fib, defpackage.hz
    public final r9x0 getAction() {
        return this.d;
    }

    @Override // defpackage.fib
    public final String getKey() {
        return this.b;
    }

    @Override // defpackage.fib
    public final Object getValue() {
        return this.c;
    }

    public final int hashCode() {
        int c = smw0.c(unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        r9x0 r9x0Var = this.d;
        int hashCode = (c + (r9x0Var == null ? 0 : r9x0Var.hashCode())) * 31;
        r9x0 r9x0Var2 = this.e;
        int hashCode2 = (hashCode + (r9x0Var2 == null ? 0 : r9x0Var2.hashCode())) * 31;
        String str = this.f;
        int e = unr0.e((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, false);
        String str2 = this.g;
        return e + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = ly3.v("TrailCheckboxControl(isEnabled=", ", key=", this.b, ", value=", this.a);
        v.append(this.c);
        v.append(", action=");
        v.append(this.d);
        v.append(", actionOnUnselect=");
        v.append(this.e);
        v.append(", metricaLabel=");
        v.append(this.f);
        v.append(", disabledUnselect=false, presentationId=");
        return oyr.t(v, this.g, Extension.C_BRAKE);
    }
}
