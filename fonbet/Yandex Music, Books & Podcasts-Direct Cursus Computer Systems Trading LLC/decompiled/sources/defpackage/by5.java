package defpackage;

/* loaded from: classes3.dex */
public final class by5 implements uvn {
    public final nrf a;
    public final onq b;
    public final f73 c;

    public by5(f73 f73Var, nrf nrfVar, onq onqVar) {
        this.a = nrfVar;
        this.b = onqVar;
        this.c = f73Var;
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
        if (!(obj instanceof by5)) {
            return false;
        }
        by5 by5Var = (by5) obj;
        return this.a.equals(by5Var.a) && this.b.equals(by5Var.b) && this.c == by5Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + eta.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder i = eta.i("ConcertPlaceBlock(meta=", this.a, ", source=", this.b, ", showPolicy=");
        i.append(this.c);
        i.append(")");
        return i.toString();
    }
}
