package defpackage;

import java.net.SocketTimeoutException;

/* loaded from: classes6.dex */
public final /* synthetic */ class hj2 implements bse {
    public final /* synthetic */ int a;

    @Override // defpackage.bse
    public final l3o b(ukn uknVar) {
        l3o f;
        switch (this.a) {
            case 0:
                d0o d0oVar = (d0o) uknVar.i;
                try {
                    f = uknVar.f(d0oVar);
                } catch (SocketTimeoutException e) {
                    weo.s("ij2", e, "Retrying socket timeout", new Object[0]);
                    f = uknVar.f(d0oVar);
                }
                int i = f.d;
                if (!ij2.c.contains(Integer.valueOf(i))) {
                    return f;
                }
                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
                weo.r("ij2", "Retrying error : %d", Integer.valueOf(i));
                f.close();
                return uknVar.f(d0oVar);
            default:
                k3o g = uknVar.f((d0o) uknVar.i).g();
                g.f.I("Pragma");
                String d = dfi.d(znm.c, "max-age=");
                pv9 pv9Var = g.f;
                pv9Var.getClass();
                qwp.D("Cache-Control");
                qwp.G(d, "Cache-Control");
                pv9Var.I("Cache-Control");
                pv9Var.m("Cache-Control", d);
                return g.a();
        }
    }
}
