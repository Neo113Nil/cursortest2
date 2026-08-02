package defpackage;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class gr5 extends jib {
    public final /* synthetic */ int b = 0;
    public final Object c;

    public gr5(ryi ryiVar) {
        this.c = ryiVar;
        btf.b(grb.A0);
    }

    @Override // defpackage.jib
    public final void a(mkn mknVar) {
        switch (this.b) {
            case 0:
                synchronized (((ArrayList) this.c)) {
                    Iterator it = ((ArrayList) this.c).iterator();
                    while (it.hasNext()) {
                        ((jib) it.next()).a(mknVar);
                    }
                }
                return;
            default:
                ((ryi) this.c).a();
                return;
        }
    }

    @Override // defpackage.jib
    public final void b(mkn mknVar, IOException iOException) {
        switch (this.b) {
            case 0:
                synchronized (((ArrayList) this.c)) {
                    Iterator it = ((ArrayList) this.c).iterator();
                    while (it.hasNext()) {
                        ((jib) it.next()).b(mknVar, iOException);
                    }
                }
                return;
            default:
                ((ryi) this.c).a();
                return;
        }
    }

    @Override // defpackage.jib
    public final void c(mkn mknVar) {
        switch (this.b) {
            case 0:
                synchronized (((ArrayList) this.c)) {
                    Iterator it = ((ArrayList) this.c).iterator();
                    while (it.hasNext()) {
                        ((jib) it.next()).c(mknVar);
                    }
                }
                return;
            default:
                ryi ryiVar = (ryi) this.c;
                ryiVar.c = mknVar.b.a.i;
                ryiVar.d = ((Number) ryiVar.b.invoke()).longValue();
                return;
        }
    }

    @Override // defpackage.jib
    public final void d(es3 es3Var, InetSocketAddress inetSocketAddress, Proxy proxy, izm izmVar) {
        int i = this.b;
        inetSocketAddress.getClass();
        switch (i) {
            case 0:
                synchronized (((ArrayList) this.c)) {
                    Iterator it = ((ArrayList) this.c).iterator();
                    while (it.hasNext()) {
                        ((jib) it.next()).d(es3Var, inetSocketAddress, proxy, izmVar);
                    }
                }
                return;
            default:
                ryi ryiVar = (ryi) this.c;
                String str = izmVar != null ? izmVar.a : null;
                ryiVar.i = ((Number) ryiVar.b.invoke()).longValue();
                if (str == null) {
                    str = "";
                }
                ryiVar.j = str;
                return;
        }
    }

    @Override // defpackage.jib
    public final void e(es3 es3Var, InetSocketAddress inetSocketAddress, Proxy proxy, IOException iOException) {
        int i = this.b;
        inetSocketAddress.getClass();
        switch (i) {
            case 0:
                synchronized (((ArrayList) this.c)) {
                    Iterator it = ((ArrayList) this.c).iterator();
                    while (it.hasNext()) {
                        ((jib) it.next()).e(es3Var, inetSocketAddress, proxy, iOException);
                    }
                }
                return;
            default:
                ryi ryiVar = (ryi) this.c;
                ryiVar.j = "";
                ryiVar.a();
                return;
        }
    }

    @Override // defpackage.jib
    public final void f(es3 es3Var, InetSocketAddress inetSocketAddress, Proxy proxy) {
        int i = this.b;
        inetSocketAddress.getClass();
        switch (i) {
            case 0:
                synchronized (((ArrayList) this.c)) {
                    Iterator it = ((ArrayList) this.c).iterator();
                    while (it.hasNext()) {
                        ((jib) it.next()).f(es3Var, inetSocketAddress, proxy);
                    }
                }
                return;
            default:
                ryi ryiVar = (ryi) this.c;
                ryiVar.g = ((Number) ryiVar.b.invoke()).longValue();
                return;
        }
    }

    @Override // defpackage.jib
    public final void g(es3 es3Var, okn oknVar) {
        int i = this.b;
        oknVar.getClass();
        switch (i) {
            case 0:
                synchronized (((ArrayList) this.c)) {
                    Iterator it = ((ArrayList) this.c).iterator();
                    while (it.hasNext()) {
                        ((jib) it.next()).g(es3Var, oknVar);
                    }
                }
                return;
            default:
                ryi ryiVar = (ryi) this.c;
                ypb ypbVar = ryiVar.b;
                if (ryiVar.g == 0) {
                    long longValue = ((Number) ypbVar.invoke()).longValue();
                    ryiVar.g = longValue;
                    ryiVar.h = longValue;
                    ryiVar.i = ((Number) ypbVar.invoke()).longValue();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.jib
    public final void h(es3 es3Var, okn oknVar) {
        int i = this.b;
        oknVar.getClass();
        switch (i) {
            case 0:
                synchronized (((ArrayList) this.c)) {
                    Iterator it = ((ArrayList) this.c).iterator();
                    while (it.hasNext()) {
                        ((jib) it.next()).h(es3Var, oknVar);
                    }
                }
                return;
            default:
                ryi ryiVar = (ryi) this.c;
                if (ryiVar.m == 0) {
                    ryiVar.m = ((Number) ryiVar.b.invoke()).longValue();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.jib
    public final void i(es3 es3Var, String str, List list) {
        switch (this.b) {
            case 0:
                synchronized (((ArrayList) this.c)) {
                    Iterator it = ((ArrayList) this.c).iterator();
                    while (it.hasNext()) {
                        ((jib) it.next()).i(es3Var, str, list);
                    }
                }
                return;
            default:
                ryi ryiVar = (ryi) this.c;
                ryiVar.f = ((Number) ryiVar.b.invoke()).longValue();
                return;
        }
    }

    @Override // defpackage.jib
    public final void j(es3 es3Var, String str) {
        switch (this.b) {
            case 0:
                synchronized (((ArrayList) this.c)) {
                    Iterator it = ((ArrayList) this.c).iterator();
                    while (it.hasNext()) {
                        ((jib) it.next()).j(es3Var, str);
                    }
                }
                return;
            default:
                ryi ryiVar = (ryi) this.c;
                ryiVar.e = ((Number) ryiVar.b.invoke()).longValue();
                return;
        }
    }

    @Override // defpackage.jib
    public void k(es3 es3Var, long j) {
        switch (this.b) {
            case 0:
                synchronized (((ArrayList) this.c)) {
                    Iterator it = ((ArrayList) this.c).iterator();
                    while (it.hasNext()) {
                        ((jib) it.next()).k(es3Var, j);
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.jib
    public void l(es3 es3Var) {
        switch (this.b) {
            case 0:
                synchronized (((ArrayList) this.c)) {
                    Iterator it = ((ArrayList) this.c).iterator();
                    while (it.hasNext()) {
                        ((jib) it.next()).l(es3Var);
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.jib
    public void m(es3 es3Var, d0o d0oVar) {
        switch (this.b) {
            case 0:
                d0oVar.getClass();
                synchronized (((ArrayList) this.c)) {
                    Iterator it = ((ArrayList) this.c).iterator();
                    while (it.hasNext()) {
                        ((jib) it.next()).m(es3Var, d0oVar);
                    }
                }
                return;
            default:
                super.m(es3Var, d0oVar);
                return;
        }
    }

    @Override // defpackage.jib
    public final void n(es3 es3Var) {
        switch (this.b) {
            case 0:
                synchronized (((ArrayList) this.c)) {
                    Iterator it = ((ArrayList) this.c).iterator();
                    while (it.hasNext()) {
                        ((jib) it.next()).n(es3Var);
                    }
                }
                return;
            default:
                ryi ryiVar = (ryi) this.c;
                ryiVar.k = ((Number) ryiVar.b.invoke()).longValue();
                return;
        }
    }

    @Override // defpackage.jib
    public final void o(es3 es3Var, long j) {
        switch (this.b) {
            case 0:
                synchronized (((ArrayList) this.c)) {
                    Iterator it = ((ArrayList) this.c).iterator();
                    while (it.hasNext()) {
                        ((jib) it.next()).o(es3Var, j);
                    }
                }
                return;
            default:
                ryi ryiVar = (ryi) this.c;
                ryiVar.m = ((Number) ryiVar.b.invoke()).longValue();
                ryiVar.n = j;
                return;
        }
    }

    @Override // defpackage.jib
    public void p(es3 es3Var) {
        switch (this.b) {
            case 0:
                synchronized (((ArrayList) this.c)) {
                    Iterator it = ((ArrayList) this.c).iterator();
                    while (it.hasNext()) {
                        ((jib) it.next()).p(es3Var);
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.jib
    public void q(es3 es3Var, l3o l3oVar) {
        switch (this.b) {
            case 0:
                synchronized (((ArrayList) this.c)) {
                    Iterator it = ((ArrayList) this.c).iterator();
                    while (it.hasNext()) {
                        ((jib) it.next()).q(es3Var, l3oVar);
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.jib
    public final void r(es3 es3Var) {
        switch (this.b) {
            case 0:
                synchronized (((ArrayList) this.c)) {
                    Iterator it = ((ArrayList) this.c).iterator();
                    while (it.hasNext()) {
                        ((jib) it.next()).r(es3Var);
                    }
                }
                return;
            default:
                ryi ryiVar = (ryi) this.c;
                ryiVar.l = ((Number) ryiVar.b.invoke()).longValue();
                return;
        }
    }

    @Override // defpackage.jib
    public void s(es3 es3Var, hsd hsdVar) {
        switch (this.b) {
            case 0:
                synchronized (((ArrayList) this.c)) {
                    Iterator it = ((ArrayList) this.c).iterator();
                    while (it.hasNext()) {
                        ((jib) it.next()).s(es3Var, hsdVar);
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.jib
    public final void t(es3 es3Var) {
        switch (this.b) {
            case 0:
                synchronized (((ArrayList) this.c)) {
                    Iterator it = ((ArrayList) this.c).iterator();
                    while (it.hasNext()) {
                        ((jib) it.next()).t(es3Var);
                    }
                }
                return;
            default:
                ryi ryiVar = (ryi) this.c;
                ryiVar.h = ((Number) ryiVar.b.invoke()).longValue();
                return;
        }
    }

    public gr5(ArrayList arrayList) {
        this.c = arrayList;
    }
}
