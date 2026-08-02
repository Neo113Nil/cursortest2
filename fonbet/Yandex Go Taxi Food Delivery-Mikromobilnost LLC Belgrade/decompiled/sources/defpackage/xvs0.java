package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xvs0 implements fws0, fib, hz {
    public final boolean a;
    public final String b;
    public final String c;
    public final Object d;
    public final r9x0 e;
    public final r9x0 f;
    public final String g;
    public final boolean h;

    public xvs0(boolean z, String str, String str2, Object obj, r9x0 r9x0Var, r9x0 r9x0Var2, String str3, boolean z2) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = obj;
        this.e = r9x0Var;
        this.f = r9x0Var2;
        this.g = str3;
        this.h = z2;
    }

    @Override // defpackage.fib
    public final boolean a() {
        return this.h;
    }

    @Override // defpackage.fib
    public final r9x0 b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xvs0)) {
            return false;
        }
        xvs0 xvs0Var = (xvs0) obj;
        return this.a == xvs0Var.a && jl40.l(this.b, xvs0Var.b) && jl40.l(this.c, xvs0Var.c) && jl40.l(this.d, xvs0Var.d) && jl40.l(this.e, xvs0Var.e) && jl40.l(this.f, xvs0Var.f) && jl40.l(this.g, xvs0Var.g) && this.h == xvs0Var.h;
    }

    @Override // defpackage.fib, defpackage.hz
    public final r9x0 getAction() {
        return this.e;
    }

    @Override // defpackage.fib
    public final String getKey() {
        return this.c;
    }

    @Override // defpackage.fib
    public final Object getValue() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int c = smw0.c(unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
        r9x0 r9x0Var = this.e;
        int hashCode2 = (c + (r9x0Var == null ? 0 : r9x0Var.hashCode())) * 31;
        r9x0 r9x0Var2 = this.f;
        int hashCode3 = (hashCode2 + (r9x0Var2 == null ? 0 : r9x0Var2.hashCode())) * 31;
        String str2 = this.g;
        return Boolean.hashCode(this.h) + ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = ly3.v("TrailRadio(isEnabled=", ", presentationId=", this.b, ", key=", this.a);
        v.append(this.c);
        v.append(", value=");
        v.append(this.d);
        v.append(", action=");
        v.append(this.e);
        v.append(", actionOnUnselect=");
        v.append(this.f);
        v.append(", metricaLabel=");
        return nnm.i(this.g, ", disabledUnselect=", Extension.C_BRAKE, v, this.h);
    }
}
