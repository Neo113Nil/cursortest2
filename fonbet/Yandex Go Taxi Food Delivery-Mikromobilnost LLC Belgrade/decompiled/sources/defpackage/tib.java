package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class tib implements wib {
    public final khu0 a;
    public final boolean b;
    public final clq0 c;
    public final nnb d;

    public tib(khu0 khu0Var, boolean z, clq0 clq0Var, nnb nnbVar) {
        this.a = khu0Var;
        this.b = z;
        this.c = clq0Var;
        this.d = nnbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tib)) {
            return false;
        }
        tib tibVar = (tib) obj;
        return this.a.equals(tibVar.a) && this.b == tibVar.b && this.c.equals(tibVar.c) && this.d.equals(tibVar.d);
    }

    @Override // defpackage.wib
    public final nnb getAnalytics() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "OpenStopSelector(selectorData=" + this.a + ", byUser=" + this.b + ", selectorAnalyticsContext=" + this.c + ", analytics=" + this.d + Extension.C_BRAKE;
    }
}
