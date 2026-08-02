package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class uib implements wib {
    public final zlb a;
    public final nnb b;

    public uib(zlb zlbVar, nnb nnbVar) {
        this.a = zlbVar;
        this.b = nnbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uib)) {
            return false;
        }
        uib uibVar = (uib) obj;
        return jl40.l(this.a, uibVar.a) && this.b.equals(uibVar.b);
    }

    @Override // defpackage.wib
    public final nnb getAnalytics() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Retry(retryAction=" + this.a + ", analytics=" + this.b + Extension.C_BRAKE;
    }
}
