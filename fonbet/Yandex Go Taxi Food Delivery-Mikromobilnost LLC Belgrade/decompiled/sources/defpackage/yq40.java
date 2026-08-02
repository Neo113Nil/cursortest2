package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public final class yq40 {
    public final ah00 a;
    public final h3y b;
    public final tit0 c;
    public final net0 d;
    public final xvw e;
    public final ber f;

    public yq40(ah00 ah00Var, h3y h3yVar, tit0 tit0Var, net0 net0Var, xvw xvwVar, ber berVar) {
        this.a = ah00Var;
        this.b = h3yVar;
        this.c = tit0Var;
        this.d = net0Var;
        this.e = xvwVar;
        this.f = berVar;
    }

    public final void a(ArrayList arrayList, jr40 jr40Var, wq40 wq40Var, List list) {
        uq40 uq40Var = (uq40) this.b.get();
        uq40Var.a.f(arrayList, list);
        uq40Var.z.g();
        if (jr40Var == null || wq40Var == null) {
            return;
        }
        jpv0 b = uq40Var.A.b();
        b.getClass();
        if (!(b instanceof fpv0) || uq40Var.p.b() || uq40Var.x.a()) {
            uq40Var.E.a = wq40Var.c;
            this.c.m = true;
            this.e.a();
        }
    }
}
