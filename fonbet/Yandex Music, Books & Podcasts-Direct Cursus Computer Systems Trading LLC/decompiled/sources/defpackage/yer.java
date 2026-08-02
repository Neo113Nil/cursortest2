package defpackage;

/* loaded from: classes4.dex */
public final class yer implements uvn {
    public final nrf a;
    public final onq b;
    public final String c;
    public final wfr d;
    public final hfr e;

    public yer(nrf nrfVar, onq onqVar, String str, wfr wfrVar, hfr hfrVar) {
        this.a = nrfVar;
        this.b = onqVar;
        this.c = str;
        this.d = wfrVar;
        this.e = hfrVar;
    }

    @Override // defpackage.drf
    public final nrf a() {
        return this.a;
    }

    @Override // defpackage.uvn
    public final onq e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yer)) {
            return false;
        }
        yer yerVar = (yer) obj;
        return this.a.equals(yerVar.a) && this.b.equals(yerVar.b) && this.c.equals(yerVar.c) && this.d == yerVar.d && this.e.equals(yerVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + k5r.c(eta.c(this.b, this.a.hashCode() * 31, 31), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder i = eta.i("StaticDivBlock(meta=", this.a, ", source=", this.b, ", screenId=");
        i.append(this.c);
        i.append(", size=");
        i.append(this.d);
        i.append(", condition=");
        i.append(this.e);
        i.append(")");
        return i.toString();
    }
}
