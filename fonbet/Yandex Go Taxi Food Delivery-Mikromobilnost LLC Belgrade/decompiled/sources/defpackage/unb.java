package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class unb implements xnb {
    public final c311 a;
    public final List b;
    public final dge c;
    public final sda0 d;
    public final el1 e;
    public final tnb f;
    public final r1a0 g;
    public final nib h;
    public final blb i;
    public final boolean j;

    public unb(c311 c311Var, List list, dge dgeVar, sda0 sda0Var, el1 el1Var, tnb tnbVar, r1a0 r1a0Var, nib nibVar, blb blbVar, boolean z) {
        this.a = c311Var;
        this.b = list;
        this.c = dgeVar;
        this.d = sda0Var;
        this.e = el1Var;
        this.f = tnbVar;
        this.g = r1a0Var;
        this.h = nibVar;
        this.i = blbVar;
        this.j = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unb)) {
            return false;
        }
        unb unbVar = (unb) obj;
        return jl40.l(this.a, unbVar.a) && jl40.l(this.b, unbVar.b) && jl40.l(this.c, unbVar.c) && this.d.equals(unbVar.d) && jl40.l(this.e, unbVar.e) && jl40.l(this.f, unbVar.f) && jl40.l(this.g, unbVar.g) && this.h.equals(unbVar.h) && jl40.l(this.i, unbVar.i) && this.j == unbVar.j;
    }

    @Override // defpackage.xnb
    public final blb getNavigation() {
        return this.i;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        el1 el1Var = this.e;
        int hashCode2 = (hashCode + (el1Var == null ? 0 : el1Var.hashCode())) * 31;
        tnb tnbVar = this.f;
        int hashCode3 = (this.h.a.hashCode() + ((this.g.hashCode() + ((hashCode2 + (tnbVar == null ? 0 : tnbVar.hashCode())) * 31)) * 31)) * 31;
        blb blbVar = this.i;
        return Boolean.hashCode(this.j) + ((hashCode3 + (blbVar != null ? blbVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Content(transportInfo=" + this.a + ", sections=" + this.b + ", footer=" + this.c + ", paymentMethods=" + this.d + ", userAgreement=" + this.e + ", notification=" + this.f + ", paymentInfoContext=" + this.g + ", backAction=" + this.h + ", navigation=" + this.i + ", isLoading=" + this.j + Extension.C_BRAKE;
    }
}
