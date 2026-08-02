package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class wmb implements cnb {
    public final pmb a;
    public final llc b;
    public final r1a0 c;
    public final boolean d;
    public final snb e;

    public wmb(pmb pmbVar, llc llcVar, r1a0 r1a0Var, boolean z, snb snbVar) {
        this.a = pmbVar;
        this.b = llcVar;
        this.c = r1a0Var;
        this.d = z;
        this.e = snbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmb)) {
            return false;
        }
        wmb wmbVar = (wmb) obj;
        return this.a.equals(wmbVar.a) && this.b.equals(wmbVar.b) && this.c.equals(wmbVar.c) && this.d == wmbVar.d && jl40.l(this.e, wmbVar.e);
    }

    @Override // defpackage.cnb
    public final snb getAnalytics() {
        return this.e;
    }

    public final int hashCode() {
        int e = unr0.e((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        snb snbVar = this.e;
        return e + (snbVar == null ? 0 : snbVar.hashCode());
    }

    public final String toString() {
        return "Success(screen=" + this.a + ", commandContext=" + this.b + ", paymentInfoContext=" + this.c + ", isPartialUpdate=" + this.d + ", analytics=" + this.e + Extension.C_BRAKE;
    }
}
