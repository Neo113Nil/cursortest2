package defpackage;

/* loaded from: classes4.dex */
public final class wvu {
    public final g0l a;

    public wvu(g0l g0lVar) {
        g0lVar.getClass();
        this.a = g0lVar;
    }

    public static /* synthetic */ void b(wvu wvuVar, s9p s9pVar, pfn pfnVar, kxi kxiVar, x5l x5lVar, boolean z, int i) {
        if ((i & 16) != 0) {
            z = true;
        }
        wvuVar.a(s9pVar, pfnVar, kxiVar, x5lVar, z, new r0q(0));
    }

    public final void a(s9p s9pVar, pfn pfnVar, kxi kxiVar, x5l x5lVar, boolean z, t0q t0qVar) {
        s9pVar.getClass();
        kxiVar.getClass();
        x5lVar.getClass();
        if (pfnVar == null) {
            pfnVar = new qfn("radio-mobile-default");
        }
        g0l.s(this.a, s9pVar, kxiVar, x5lVar, pfnVar, z ? b0l.b : c0l.b, t0qVar, null, null, 400);
    }
}
