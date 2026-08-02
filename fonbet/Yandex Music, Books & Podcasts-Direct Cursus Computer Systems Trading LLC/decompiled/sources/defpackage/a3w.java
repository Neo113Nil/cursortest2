package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class a3w implements z2w {
    public final k6t a;
    public final k1l b;
    public final q7l c;
    public final z6u d;
    public final g0l e;
    public final kxi f;
    public final nxv g;
    public final cq4 h;
    public final p0w i;
    public final xdr j = ydr.a(new xzv(false));
    public final xdr k = ydr.a("");
    public final xdr l;
    public rar m;

    public a3w(k6t k6tVar, f7l f7lVar, k1l k1lVar, q7l q7lVar, z6u z6uVar, g0l g0lVar, kxi kxiVar, nxv nxvVar, cq4 cq4Var, p0w p0wVar) {
        this.a = k6tVar;
        this.b = k1lVar;
        this.c = q7lVar;
        this.d = z6uVar;
        this.e = g0lVar;
        this.f = kxiVar;
        this.g = nxvVar;
        this.h = cq4Var;
        this.i = p0wVar;
        xdr xdrVar = f7lVar.d;
        this.l = xdrVar;
        x97.y(cq4Var, null, null, new y6v(xdrVar, (Continuation) null, this, 16), 3);
    }

    public final void a(String str) {
        b();
        xdr xdrVar = this.j;
        xzv xzvVar = new xzv(((zzv) xdrVar.getValue()).c());
        xdrVar.getClass();
        Continuation continuation = null;
        xdrVar.m(null, xzvVar);
        rar rarVar = this.m;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.m = x97.y(this.h, null, null, new y6v(this, str, continuation, 17), 3);
    }

    public final void b() {
        this.c.b();
        xdr xdrVar = this.j;
        xzv xzvVar = new xzv(((zzv) xdrVar.getValue()).c());
        xdrVar.getClass();
        xdrVar.m(null, xzvVar);
    }
}
