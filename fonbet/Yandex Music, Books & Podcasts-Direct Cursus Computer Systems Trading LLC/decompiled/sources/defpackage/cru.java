package defpackage;

/* loaded from: classes4.dex */
public final class cru implements bru {
    public final lpu a;
    public final String b;
    public final rmb c;

    public cru(lpu lpuVar, String str, rmb rmbVar) {
        this.a = lpuVar;
        this.b = str;
        this.c = rmbVar;
    }

    @Override // defpackage.bru
    public final void a() {
        String G = wdg.G(this.b);
        rmb.k(this.c, G, y7g.I(0, 0, G), null, 4);
        this.a.a(G);
    }
}
