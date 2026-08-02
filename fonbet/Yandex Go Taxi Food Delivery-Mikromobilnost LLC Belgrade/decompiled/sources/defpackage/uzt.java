package defpackage;

/* loaded from: classes3.dex */
public final class uzt {
    public final szt a;

    public uzt(szt sztVar) {
        this.a = sztVar;
    }

    public final s921 a(tw51 tw51Var) {
        g0c a = qoi0.a(s921.class);
        tzt tztVar = new tzt(0, tw51Var);
        szt sztVar = this.a;
        w53 w53Var = sztVar.a;
        d0u d0uVar = (d0u) w53Var.get(a);
        if (d0uVar == null) {
            d0uVar = new d0u(tztVar.invoke());
            w53Var.put(a, d0uVar);
            szt.b(a, "ADD");
        }
        d0uVar.b++;
        szt.b(a, "INC");
        sztVar.a();
        return (s921) d0uVar.a;
    }

    public final void b() {
        g0c a = qoi0.a(s921.class);
        szt sztVar = this.a;
        w53 w53Var = sztVar.a;
        d0u d0uVar = (d0u) w53Var.get(a);
        if (d0uVar == null) {
            return;
        }
        d0uVar.b--;
        szt.b(a, "DEC");
        if (d0uVar.b == 0) {
            w53Var.remove(a);
            szt.b(a, "REMOVE");
        }
        sztVar.a();
    }
}
