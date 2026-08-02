package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class rvi extends bfu {
    public final xdr k = ydr.a(gvi.a);
    public final xdr l = ydr.a(Boolean.FALSE);
    public final xdr m = ydr.a(Boolean.TRUE);
    public final j0q n = new j0q();
    public final jyr o;
    public final jac p;
    public final jyr q;
    public final iwe r;
    public final fkn s;
    public jsi t;

    public rvi(rui ruiVar) {
        l18 l18Var = l18.b;
        this.o = l18Var.b(hag.I(gui.class), true);
        jac b = ((iaj) l18Var.b(hag.I(iaj.class), true).getValue()).b();
        this.p = b;
        this.q = l18Var.b(hag.I(z66.class), true);
        bdt I = hag.I(u3g.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.r = new iwe((u3g) qdcVar.C(I));
        this.s = zsd.F0(b.m(3), ot0.F(this), new hdr(5000L, Long.MAX_VALUE), tui.d);
        ssg.a(3, null, "load initial", null);
        x97.y(ot0.F(this), null, null, new ovi(this, null, 1), 3);
        G();
    }

    public final void G() {
        Continuation continuation = null;
        ox6.B(new u21(10, new njf(new fs(27, new clc(this.l, new jud(2, 7, continuation))), this, 18), this.s, new cle(this, continuation, 6)), ot0.F(this), new fmi(2, this));
    }
}
