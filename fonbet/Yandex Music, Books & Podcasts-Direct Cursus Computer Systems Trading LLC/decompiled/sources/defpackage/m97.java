package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.net.BindException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* loaded from: classes.dex */
public final class m97 implements hgg, yno {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ m97(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yno
    public void b() {
        wio wioVar = (wio) this.b;
        wioVar.b.post(new tio(wioVar, 1));
    }

    public void c(pg5 pg5Var) {
        wio wioVar = (wio) this.b;
        if (!(pg5Var instanceof xio) || wioVar.v) {
            wioVar.l = pg5Var;
        } else {
            wio.g(wioVar);
        }
    }

    @Override // defpackage.hgg
    public final void d(jgg jggVar, long j, long j2, boolean z) {
        switch (this.a) {
            case 0:
                ((n97) this.b).C((d8k) jggVar, j2);
                break;
            case 1:
                break;
        }
    }

    public void e(long j, yde ydeVar) {
        cio cioVar;
        ArrayList arrayList = new ArrayList(ydeVar.size());
        for (int i = 0; i < ydeVar.size(); i++) {
            String path = ((fjo) ydeVar.get(i)).c.getPath();
            path.getClass();
            arrayList.add(path);
        }
        for (int i2 = 0; i2 < ((wio) this.b).f.size(); i2++) {
            if (!arrayList.contains(((uio) ((wio) this.b).f.get(i2)).b.b.b.getPath())) {
                yio yioVar = (yio) ((wio) this.b).g.b;
                yioVar.m = false;
                yioVar.B();
                if (((wio) this.b).j()) {
                    wio wioVar = (wio) this.b;
                    wioVar.q = true;
                    wioVar.n = -9223372036854775807L;
                    wioVar.m = -9223372036854775807L;
                    wioVar.o = -9223372036854775807L;
                }
            }
        }
        for (int i3 = 0; i3 < ydeVar.size(); i3++) {
            fjo fjoVar = (fjo) ydeVar.get(i3);
            wio wioVar2 = (wio) this.b;
            Uri uri = fjoVar.c;
            ArrayList arrayList2 = wioVar2.e;
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList2.size()) {
                    cioVar = null;
                    break;
                }
                if (!((vio) arrayList2.get(i4)).d) {
                    uio uioVar = ((vio) arrayList2.get(i4)).a;
                    if (uioVar.b.b.b.equals(uri)) {
                        cioVar = uioVar.b;
                        break;
                    }
                }
                i4++;
            }
            if (cioVar != null) {
                long j2 = fjoVar.a;
                if (j2 != -9223372036854775807L) {
                    dio dioVar = cioVar.h;
                    dioVar.getClass();
                    if (!dioVar.h) {
                        cioVar.h.i = j2;
                    }
                }
                int i5 = fjoVar.b;
                dio dioVar2 = cioVar.h;
                dioVar2.getClass();
                if (!dioVar2.h) {
                    cioVar.h.j = i5;
                }
                if (((wio) this.b).j()) {
                    wio wioVar3 = (wio) this.b;
                    if (wioVar3.n == wioVar3.m) {
                        long j3 = fjoVar.a;
                        cioVar.k = j;
                        cioVar.l = j3;
                    }
                }
            }
        }
        boolean j4 = ((wio) this.b).j();
        wio wioVar4 = (wio) this.b;
        if (!j4) {
            long j5 = wioVar4.o;
            if (j5 == -9223372036854775807L || !wioVar4.v) {
                return;
            }
            wioVar4.h(j5);
            ((wio) this.b).o = -9223372036854775807L;
            return;
        }
        long j6 = wioVar4.n;
        long j7 = wioVar4.m;
        if (j6 == j7) {
            wioVar4.n = -9223372036854775807L;
            wioVar4.m = -9223372036854775807L;
        } else {
            wioVar4.n = -9223372036854775807L;
            wioVar4.h(j7);
        }
    }

    public void f(IOException iOException, String str) {
        ((wio) this.b).k = iOException == null ? new IOException(str) : new IOException(str, iOException);
    }

    @Override // defpackage.hgg
    public final void g(jgg jggVar, long j, long j2) {
        boolean z;
        switch (this.a) {
            case 0:
                d8k d8kVar = (d8k) jggVar;
                n97 n97Var = (n97) this.b;
                long j3 = d8kVar.a;
                nb7 nb7Var = d8kVar.b;
                ngr ngrVar = d8kVar.d;
                cfg cfgVar = new cfg(nb7Var, ngrVar.c, ngrVar.d, j2, ngrVar.b);
                n97Var.m.getClass();
                n97Var.q.M(cfgVar, d8kVar.c);
                n97Var.L = ((Long) d8kVar.f).longValue() - j;
                n97Var.E(true);
                return;
            case 1:
                cio cioVar = (cio) jggVar;
                wio wioVar = (wio) this.b;
                long r = wioVar.r();
                ArrayList arrayList = wioVar.e;
                if (r == 0) {
                    if (wioVar.v) {
                        return;
                    }
                    wio.g(wioVar);
                    return;
                }
                int i = 0;
                while (true) {
                    if (i < arrayList.size()) {
                        vio vioVar = (vio) arrayList.get(i);
                        if (vioVar.a.b == cioVar) {
                            vioVar.a();
                        } else {
                            i++;
                        }
                    }
                }
                wioVar.d.o = 1;
                return;
            default:
                qxp qxpVar = (qxp) this.b;
                synchronized (i4w.u) {
                    z = i4w.v;
                }
                if (z) {
                    qxpVar.p();
                    return;
                } else {
                    ((n97) qxpVar.a).D(new IOException(new ConcurrentModificationException()));
                    return;
                }
        }
    }

    @Override // defpackage.hgg
    public final mdr v(jgg jggVar, long j, long j2, IOException iOException, int i) {
        switch (this.a) {
            case 0:
                d8k d8kVar = (d8k) jggVar;
                n97 n97Var = (n97) this.b;
                x0 x0Var = n97Var.q;
                long j3 = d8kVar.a;
                nb7 nb7Var = d8kVar.b;
                ngr ngrVar = d8kVar.d;
                x0Var.P(new cfg(nb7Var, ngrVar.c, ngrVar.d, j2, ngrVar.b), d8kVar.c, iOException, true);
                n97Var.m.getClass();
                n97Var.D(iOException);
                break;
            case 1:
                cio cioVar = (cio) jggVar;
                wio wioVar = (wio) this.b;
                if (!wioVar.s) {
                    wioVar.k = iOException;
                } else if (iOException.getCause() instanceof BindException) {
                    int i2 = wioVar.u;
                    wioVar.u = i2 + 1;
                    if (i2 < 3) {
                        break;
                    }
                } else {
                    wioVar.l = new pg5(cioVar.b.b.toString(), iOException);
                }
                break;
            default:
                ((n97) ((qxp) this.b).a).D(iOException);
                break;
        }
        return osh.l;
    }

    private final void a(jgg jggVar, long j, long j2, boolean z) {
    }
}
