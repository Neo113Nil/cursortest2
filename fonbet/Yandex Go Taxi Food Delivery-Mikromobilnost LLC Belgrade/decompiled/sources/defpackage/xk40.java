package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xk40 extends n351 implements ion {
    public final CharSequence c;
    public final CharSequence d;
    public final hts0 e;
    public final jvs0 f;
    public final a570 g;
    public final x2s h;
    public final String i;

    public xk40(CharSequence charSequence, CharSequence charSequence2, hts0 hts0Var, jvs0 jvs0Var, a570 a570Var, x2s x2sVar, String str) {
        super("multi-address", false, 14);
        this.c = charSequence;
        this.d = charSequence2;
        this.e = hts0Var;
        this.f = jvs0Var;
        this.g = a570Var;
        this.h = x2sVar;
        this.i = str;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk40)) {
            return false;
        }
        xk40 xk40Var = (xk40) obj;
        return jl40.l(this.c, xk40Var.c) && jl40.l(this.d, xk40Var.d) && jl40.l(this.e, xk40Var.e) && jl40.l(this.f, xk40Var.f) && this.g.equals(xk40Var.g) && this.h.equals(xk40Var.h) && jl40.l(this.i, xk40Var.i);
    }

    public final int hashCode() {
        int b = smw0.b(this.c.hashCode() * 31, 31, this.d);
        hts0 hts0Var = this.e;
        int hashCode = (b + (hts0Var == null ? 0 : hts0Var.hashCode())) * 31;
        jvs0 jvs0Var = this.f;
        int a = tse0.a(this.h, (this.g.hashCode() + ((hashCode + (jvs0Var == null ? 0 : jvs0Var.hashCode())) * 31)) * 31, 31);
        String str = this.i;
        return a + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.c, this.d, "MultiAddressModel(title=", ", description=", ", lead=");
        r.append(this.e);
        r.append(", trail=");
        r.append(this.f);
        r.append(", widgetAction=");
        r.append(this.g);
        r.append(", analyticsData=");
        r.append(this.h);
        r.append(", id=");
        return oyr.t(r, this.i, Extension.C_BRAKE);
    }
}
