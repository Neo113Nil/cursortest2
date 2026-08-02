package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class zri {
    public final dn9 a;
    public final oq7 b;
    public final k1l c;
    public final yks d;
    public final xdr e;
    public final fkn f;

    public zri(mm6 mm6Var, dn9 dn9Var, oq7 oq7Var, k1l k1lVar, fdj fdjVar, r1l r1lVar) {
        mm6Var.getClass();
        this.a = dn9Var;
        this.b = oq7Var;
        this.c = k1lVar;
        this.d = new yks(1, fdjVar, r1lVar, oq7Var);
        Continuation continuation = null;
        xdr a = ydr.a(null);
        this.e = a;
        this.f = zsd.F0(zsd.b0(new u21(10, new clc(new fs(26, new fs(25, new cla(y1g.L(oq7Var.a), 3))), new jud(2, 5, continuation)), new bca(a, 18), new t81(3, 13, continuation))), mm6Var, lbq.a, null);
    }

    public final void a(kri kriVar) {
        Object obj;
        if (kriVar instanceof fri) {
            fri friVar = (fri) kriVar;
            obj = new lbj(friVar.a, friVar.b);
        } else if (kriVar instanceof hri) {
            hri hriVar = (hri) kriVar;
            obj = new obj(hriVar.a, hriVar.b);
        } else {
            if (!(kriVar instanceof iri) && !(kriVar instanceof jri) && !kriVar.equals(gri.a)) {
                b6e.s();
                return;
            }
            obj = nbj.a;
        }
        xdr xdrVar = this.e;
        xdrVar.getClass();
        xdrVar.m(null, obj);
    }
}
