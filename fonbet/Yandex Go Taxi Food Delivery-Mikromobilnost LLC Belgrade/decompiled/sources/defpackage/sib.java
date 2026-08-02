package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class sib implements wib {
    public final qlj a;
    public final boolean b;
    public final clq0 c;
    public final nnb d;

    public sib(qlj qljVar, boolean z, clq0 clq0Var, nnb nnbVar) {
        this.a = qljVar;
        this.b = z;
        this.c = clq0Var;
        this.d = nnbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sib)) {
            return false;
        }
        sib sibVar = (sib) obj;
        return this.a.equals(sibVar.a) && this.b == sibVar.b && this.c.equals(sibVar.c) && this.d.equals(sibVar.d);
    }

    @Override // defpackage.wib
    public final nnb getAnalytics() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "OpenDirectionSelector(selectorData=" + this.a + ", byUser=" + this.b + ", selectorAnalyticsContext=" + this.c + ", analytics=" + this.d + Extension.C_BRAKE;
    }
}
