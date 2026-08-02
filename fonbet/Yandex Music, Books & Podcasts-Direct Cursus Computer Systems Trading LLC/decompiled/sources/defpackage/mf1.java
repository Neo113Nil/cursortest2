package defpackage;

/* loaded from: classes3.dex */
public final class mf1 implements uvn {
    public final nrf a;
    public final onq b;
    public final f73 c;
    public final String d;

    public mf1(nrf nrfVar, onq onqVar, f73 f73Var, String str) {
        this.a = nrfVar;
        this.b = onqVar;
        this.c = f73Var;
        this.d = str;
    }

    @Override // defpackage.drf
    public final nrf a() {
        return this.a;
    }

    @Override // defpackage.wfm
    public final f73 d() {
        return this.c;
    }

    @Override // defpackage.uvn
    public final onq e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mf1)) {
            return false;
        }
        mf1 mf1Var = (mf1) obj;
        return this.a.equals(mf1Var.a) && this.b.equals(mf1Var.b) && this.c == mf1Var.c && this.d.equals(mf1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + eta.b(this.c, eta.c(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder i = eta.i("ArtistPreSaveBlock(meta=", this.a, ", source=", this.b, ", showPolicy=");
        i.append(this.c);
        i.append(", title=");
        i.append(this.d);
        i.append(")");
        return i.toString();
    }
}
