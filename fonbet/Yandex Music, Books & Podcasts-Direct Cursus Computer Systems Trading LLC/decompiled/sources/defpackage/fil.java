package defpackage;

/* loaded from: classes4.dex */
public final class fil {
    public final l1g a;

    public fil(l1g l1gVar) {
        this.a = l1gVar;
    }

    public final void a() {
        zwk zwkVar;
        j1g j1gVar;
        n7q n7qVar;
        l1g l1gVar = this.a;
        d6l x = p6g.x((e6l) l1gVar.b.a.c.getValue());
        mwk b = (x == null || (n7qVar = x.a) == null) ? null : n7qVar.b();
        if (b == null || (zwkVar = (zwk) l1gVar.d.get(b)) == null) {
            return;
        }
        mwk mwkVar = zwkVar.b;
        kll kllVar = zwkVar.a;
        t3g t3gVar = kllVar.a;
        j1g j1gVar2 = zwkVar.c;
        if (j1gVar2 != null) {
            int ordinal = j1gVar2.ordinal();
            if (ordinal == 0) {
                mwkVar.getClass();
                t3gVar.z(mwkVar);
                j1gVar = j1g.b;
            } else {
                if (ordinal != 1 && ordinal != 2) {
                    b6e.s();
                    return;
                }
                mwkVar.getClass();
                t3gVar.s(mwkVar);
                fx fxVar = fx.a;
                gj gjVar = mwkVar.c().c;
                if (gjVar != null) {
                    gx gxVar = kllVar.b;
                    mqs a = mwkVar.a();
                    gxVar.a(fxVar, a != null ? a.a : null, gjVar);
                }
                j1gVar = j1g.a;
            }
            xdr xdrVar = zwkVar.d;
            xwk xwkVar = new xwk(j1gVar, System.currentTimeMillis());
            xdrVar.getClass();
            xdrVar.m(null, xwkVar);
        }
    }
}
