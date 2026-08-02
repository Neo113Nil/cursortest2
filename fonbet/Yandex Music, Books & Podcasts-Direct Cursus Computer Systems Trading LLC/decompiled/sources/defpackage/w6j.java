package defpackage;

/* loaded from: classes3.dex */
public final class w6j {
    public final ile a;
    public final eke b;
    public final c72 c;
    public final jyr d;
    public final fkn e;

    public w6j(mm6 mm6Var, ile ileVar, eke ekeVar) {
        mm6Var.getClass();
        ileVar.getClass();
        ekeVar.getClass();
        this.a = ileVar;
        this.b = ekeVar;
        bdt I = hag.I(uaa.class);
        l18 l18Var = l18.b;
        jyr b = l18Var.b(I, true);
        jyr b2 = l18Var.b(hag.I(f7l.class), true);
        c72 c72Var = (c72) ileVar.d.getValue();
        this.c = c72Var;
        this.d = btf.b(new d1j(4, this));
        jyr jyrVar = ileVar.a;
        this.e = zsd.F0(zsd.P(((e6q) ((uaa) b.getValue())).e, ((f7l) b2.getValue()).c, ((z22) c72Var).l(), new kvh(((z66) jyrVar.getValue()).c(), 12), new ezi(this, null, 1)), mm6Var, new hdr(5000L, Long.MAX_VALUE), a((lja) ((e6q) ((uaa) b.getValue())).e.getValue(), p6g.x((e6l) ((f7l) b2.getValue()).c.getValue()), true, ((x66) ((z66) jyrVar.getValue()).c().getValue()).b));
    }

    public final g7j a(lja ljaVar, d6l d6lVar, boolean z, u0j u0jVar) {
        if (!((lwc) this.a.c.getValue()).a()) {
            if (u0jVar == u0j.a) {
                return b7j.a;
            }
            jyr jyrVar = dvu.e;
            if (kwl.d()) {
                n7q n7qVar = d6lVar != null ? d6lVar.a : null;
                boolean isEmpty = ljaVar.a.isEmpty();
                if (!isEmpty) {
                    vuu vuuVar = (vuu) this.d.getValue();
                    vuuVar.getClass();
                    boolean z2 = (n7qVar != null ? (mwk) wdg.A(n7qVar, new n7b(vuuVar)) : null) != null;
                    if (z2) {
                        return c7j.b;
                    }
                    if (!z2) {
                        return z6j.b;
                    }
                    b6e.s();
                    return null;
                }
                if (!isEmpty) {
                    b6e.s();
                    return null;
                }
                if (z) {
                    return f7j.b;
                }
                if (!z) {
                    return e7j.b;
                }
                b6e.s();
                return null;
            }
            boolean isEmpty2 = ljaVar.a.isEmpty();
            if (!isEmpty2) {
                return a7j.b;
            }
            if (!isEmpty2) {
                b6e.s();
                return null;
            }
        }
        return x6j.a;
    }
}
