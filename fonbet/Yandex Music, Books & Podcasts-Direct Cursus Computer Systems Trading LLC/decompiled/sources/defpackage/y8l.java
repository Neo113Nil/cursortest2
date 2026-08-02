package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class y8l implements w5n {
    public final /* synthetic */ g3a a;
    public final /* synthetic */ a9l b;

    public y8l(g3a g3aVar, a9l a9lVar) {
        this.a = g3aVar;
        this.b = a9lVar;
    }

    @Override // defpackage.w5n
    public final void b() {
        v7g.L(this.b.a, new lik(vik.f, null, null));
    }

    @Override // defpackage.w5n
    public final void d(uft uftVar, uft uftVar2) {
        uftVar2.getClass();
        Continuation continuation = null;
        a9l a9lVar = this.b;
        p5n b = uftVar != null ? a9l.b(a9lVar, uftVar) : null;
        p5n b2 = a9l.b(a9lVar, uftVar2);
        grl grlVar = ((kub) this.a.b).b;
        grlVar.getClass();
        x97.y(ot0.F(grlVar), null, null, new b5l(grlVar, b2, continuation, 14), 3);
        nwh nwhVar = grlVar.C;
        if (b == null) {
            b = b2;
        }
        nwhVar.getClass();
        v5n v5nVar = (v5n) nwhVar.g;
        wjb wjbVar = wjb.ExpandedPlayerScreen;
        v5nVar.getClass();
        u5n u5nVar = (u5n) v5nVar.b.getValue();
        String G = v5nVar.a.G();
        snb a = v5n.a(b);
        snb a2 = v5n.a(b2);
        u5nVar.getClass();
        G.getClass();
        u5nVar.a.a(G, wjbVar, xjb.SoundQuality, a2.a, a.a);
    }

    @Override // defpackage.w5n
    public final void a() {
    }

    @Override // defpackage.w5n
    public final void c() {
    }
}
