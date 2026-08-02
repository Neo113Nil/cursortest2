package defpackage;

/* loaded from: classes3.dex */
public final class bt8 extends bfu {
    public final String k;
    public final gs8 l;
    public final vs8 m;
    public final wx2 n;
    public final xdr o;
    public final fkn p;
    public final xdr q;

    public bt8(String str, gs8 gs8Var, vs8 vs8Var, wx2 wx2Var) {
        gs8Var.getClass();
        this.k = str;
        this.l = gs8Var;
        this.m = vs8Var;
        this.n = wx2Var;
        xdr a = ydr.a(ss8.a);
        this.o = a;
        this.p = new fkn(a);
        this.q = ydr.a(0);
    }

    public final void a(String str) {
        Object value = this.p.a.getValue();
        ts8 ts8Var = value instanceof ts8 ? (ts8) value : null;
        if (ts8Var != null) {
            rs8 rs8Var = ts8Var.a;
            ys8 ys8Var = rs8Var.d;
            String str2 = rs8Var.a;
            wx2 wx2Var = this.n;
            wx2Var.getClass();
            str2.getClass();
            ((nmb) wx2Var.a.getValue()).d(wx2.a(ys8Var), str2);
            if (str.length() > 0) {
                this.l.a(this.k, rs8Var.b, str);
            }
        }
    }
}
