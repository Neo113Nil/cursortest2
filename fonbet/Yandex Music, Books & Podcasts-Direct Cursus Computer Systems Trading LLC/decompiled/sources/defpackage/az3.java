package defpackage;

/* loaded from: classes3.dex */
public final class az3 extends bfu {
    public final String k;
    public final oy3 l;
    public final xdr m;
    public final xdr n;
    public final bz2 o;

    public az3(String str, oy3 oy3Var, fnb fnbVar) {
        this.k = str;
        this.l = oy3Var;
        xdr a = ydr.a(uy3.a);
        this.m = a;
        this.n = a;
        this.o = new bz2(fnbVar);
        G();
    }

    public final void G() {
        xdr xdrVar;
        Object value;
        do {
            xdrVar = this.m;
            value = xdrVar.getValue();
        } while (!xdrVar.k(value, uy3.a));
        x97.y(ot0.F(this), null, null, new zy3(this, null), 3);
    }

    public final void H(int i) {
        xdr xdrVar;
        Object value;
        Object value2 = this.n.getValue();
        vy3 vy3Var = value2 instanceof vy3 ? (vy3) value2 : null;
        if (vy3Var != null) {
            do {
                xdrVar = this.m;
                value = xdrVar.getValue();
            } while (!xdrVar.k(value, new vy3(vy3Var.a, i)));
        }
    }
}
