package defpackage;

import android.os.Handler;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public final class uv7 implements wvh {
    public final osh a;
    public final wvh b;
    public final tyi c;
    public final ConcurrentHashMap d;

    public uv7(osh oshVar, wvh wvhVar, tyi tyiVar) {
        wvhVar.getClass();
        this.a = oshVar;
        this.b = wvhVar;
        this.c = tyiVar;
        this.d = new ConcurrentHashMap();
    }

    @Override // defpackage.wvh
    public final void b(Handler handler, bwh bwhVar) {
        handler.getClass();
        this.b.b(handler, bwhVar);
    }

    @Override // defpackage.wvh
    public final void c(bwh bwhVar) {
        this.b.c(bwhVar);
    }

    @Override // defpackage.wvh
    public final void e(dra draVar) {
        this.b.e(draVar);
    }

    @Override // defpackage.wvh
    public final onh f() {
        return this.b.f();
    }

    @Override // defpackage.wvh
    public final void h(vvh vvhVar) {
        wvh wvhVar = this.b;
        vvh vvhVar2 = (vvh) this.d.remove(vvhVar);
        if (vvhVar2 != null) {
            vvhVar = vvhVar2;
        }
        wvhVar.h(vvhVar);
        if (this.d.isEmpty()) {
            osh oshVar = this.a;
            synchronized (oshVar) {
                try {
                    nsh nshVar = (nsh) oshVar.c;
                    if (nshVar != null) {
                        nshVar.J();
                    }
                    gld.L(((c43) oshVar.a).a, null);
                } catch (Throwable th) {
                    throw th;
                }
            }
            xdr xdrVar = (xdr) this.c.i;
            Boolean bool = Boolean.FALSE;
            xdrVar.getClass();
            xdrVar.m(null, bool);
        }
    }

    @Override // defpackage.wvh
    public final void j(vvh vvhVar) {
        this.b.j(vvhVar);
    }

    @Override // defpackage.wvh
    public final void k(Handler handler, dra draVar) {
        handler.getClass();
        this.b.k(handler, draVar);
    }

    @Override // defpackage.wvh
    public final void l(vvh vvhVar, t6t t6tVar, ndl ndlVar) {
        ndlVar.getClass();
        vv7 vv7Var = new vv7(this, vvhVar);
        this.b.l(vv7Var, t6tVar, ndlVar);
        this.d.put(vvhVar, vv7Var);
        xdr xdrVar = (xdr) this.c.i;
        Boolean bool = Boolean.TRUE;
        xdrVar.getClass();
        xdrVar.m(null, bool);
    }

    @Override // defpackage.wvh
    public final void m(vvh vvhVar) {
        this.b.m(vvhVar);
    }

    @Override // defpackage.wvh
    public final woh n(uvh uvhVar, zi7 zi7Var, long j) {
        zi7Var.getClass();
        return this.b.n(uvhVar, zi7Var, j);
    }

    @Override // defpackage.wvh
    public final void p() {
        this.b.p();
    }

    @Override // defpackage.wvh
    public final void s(woh wohVar) {
        wohVar.getClass();
        this.b.s(wohVar);
    }
}
