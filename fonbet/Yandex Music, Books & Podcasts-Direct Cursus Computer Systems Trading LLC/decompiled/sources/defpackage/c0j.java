package defpackage;

import kotlinx.coroutines.a;

/* loaded from: classes.dex */
public final class c0j implements gp0 {
    public final yk3 a;
    public final a b;

    public c0j(yk3 yk3Var, f2j f2jVar, a aVar) {
        aVar.getClass();
        this.a = yk3Var;
        this.b = aVar;
    }

    @Override // defpackage.gp0
    public final pjc a(kkp kkpVar, c11 c11Var) {
        pjc p;
        nuj nujVar = (nuj) kkpVar.b;
        boolean z = nujVar instanceof s6n;
        yk3 yk3Var = this.a;
        if (z) {
            p = yk3Var.p(kkpVar);
        } else {
            if (!(nujVar instanceof jqi)) {
                xq0.q("");
                return null;
            }
            p = yk3Var.p(kkpVar);
        }
        return zsd.k0(p, this.b);
    }
}
