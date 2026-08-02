package defpackage;

/* loaded from: classes4.dex */
public final class mg5 {
    public final nmf a;
    public final wvu b;
    public final oq7 c;
    public final tf6 d;
    public final fkn e;

    public mg5(nmf nmfVar, wvu wvuVar, oq7 oq7Var) {
        oq7Var.getClass();
        this.a = nmfVar;
        this.b = wvuVar;
        this.c = oq7Var;
        this.d = gld.e(dm6.b);
        this.e = nmfVar.c;
    }

    public static void a(mg5 mg5Var, s9p s9pVar, kxi kxiVar, w5l w5lVar, chn chnVar, int i) {
        if ((i & 8) != 0) {
            chnVar = null;
        }
        r0q r0qVar = new r0q(0);
        mg5Var.getClass();
        mg5Var.b.a(s9pVar, chnVar, kxiVar, w5lVar, true, r0qVar);
    }

    public final void b(s9p s9pVar, kxi kxiVar, x5l x5lVar, pfn pfnVar) {
        n7q n7qVar;
        l7q l7qVar;
        s9pVar.getClass();
        kxiVar.getClass();
        x5lVar.getClass();
        oq7 oq7Var = this.c;
        e6l e6lVar = (e6l) oq7Var.a.c.getValue();
        y7q y7qVar = (y7q) oq7Var.b.f.a.getValue();
        uvu uvuVar = null;
        x7q x7qVar = y7qVar instanceof x7q ? (x7q) y7qVar : null;
        s9p s9pVar2 = (x7qVar == null || (l7qVar = x7qVar.b) == null) ? null : (s9p) ldg.k(l7qVar, y9w.g);
        d6l x = p6g.x(e6lVar);
        if (x != null && (n7qVar = x.a) != null) {
            uvuVar = (uvu) wdg.A(n7qVar, new jzk(7));
        }
        boolean b = uvuVar != null ? s9pVar.b(uvuVar.a) : false;
        wvu wvuVar = this.b;
        if (b) {
            g0l.d(wvuVar.a);
        } else if (s9pVar2 == null || !s9pVar.b(s9pVar2)) {
            wvu.b(wvuVar, s9pVar, pfnVar, kxiVar, x5lVar, true, 32);
        }
    }
}
