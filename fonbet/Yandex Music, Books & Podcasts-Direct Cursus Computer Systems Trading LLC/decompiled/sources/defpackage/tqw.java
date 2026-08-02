package defpackage;

/* loaded from: classes4.dex */
public final class tqw {
    public final fmw a;
    public final zzp b;

    public tqw(fmw fmwVar, zzp zzpVar) {
        this.a = fmwVar;
        this.b = zzpVar;
    }

    public final boolean a(pqw pqwVar, bmw bmwVar) {
        pqwVar.getClass();
        maq maqVar = pqwVar.b;
        String str = "Replacing queue: " + maqVar.k().getId();
        String str2 = onw.j;
        ssg.a(4, str2, str, null);
        if (maqVar.j().isEmpty()) {
            ssg.a(4, str2, "Empty queue received: do not handle diffs", null);
            return false;
        }
        fpw c = pqwVar.c(this.b);
        boolean z = maqVar instanceof jbq;
        fmw fmwVar = this.a;
        if (z) {
            ((hmw) fmwVar).h((jbq) maqVar, c, t7g.u(c), bmwVar);
            return true;
        }
        if (maqVar instanceof vaq) {
            ((hmw) fmwVar).g((vaq) maqVar, c, t7g.u(c), bmwVar);
            return true;
        }
        if (maqVar instanceof eaq) {
            ((hmw) fmwVar).e((eaq) maqVar, c, t7g.u(c), bmwVar);
            return true;
        }
        if (!(maqVar instanceof raq)) {
            b6e.s();
            return false;
        }
        ssg.a(5, str2, "Unsupported " + ((raq) maqVar).b + " received: starting fallback radio", null);
        ((hmw) fmwVar).d(t7g.u(c));
        return false;
    }
}
