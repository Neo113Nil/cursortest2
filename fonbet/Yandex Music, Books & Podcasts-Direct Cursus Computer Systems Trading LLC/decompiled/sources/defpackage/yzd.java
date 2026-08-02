package defpackage;

import android.net.Uri;
import android.os.Looper;
import androidx.media3.exoplayer.source.b;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class yzd extends js2 {
    public final vm7 h;
    public final sld i;
    public final rwd j;
    public final gra k;
    public final xeg l;
    public final boolean m;
    public final int n;
    public final ym7 o;
    public final long p;
    public fnh q;
    public t6t r;
    public onh s;

    static {
        ynh.a("media3.exoplayer.hls");
    }

    public yzd(onh onhVar, sld sldVar, vm7 vm7Var, rwd rwdVar, gra graVar, xeg xegVar, ym7 ym7Var, long j, boolean z, int i) {
        this.s = onhVar;
        this.q = onhVar.c;
        this.i = sldVar;
        this.h = vm7Var;
        this.j = rwdVar;
        this.k = graVar;
        this.l = xegVar;
        this.o = ym7Var;
        this.p = j;
        this.m = z;
        this.n = i;
    }

    public static szd A(List list, long j) {
        szd szdVar = null;
        for (int i = 0; i < list.size(); i++) {
            szd szdVar2 = (szd) list.get(i);
            long j2 = szdVar2.e;
            if (j2 > j || !szdVar2.l) {
                if (j2 > j) {
                    break;
                }
            } else {
                szdVar = szdVar2;
            }
        }
        return szdVar;
    }

    public final void B(xzd xzdVar) {
        long j;
        b bVar;
        long j2;
        long j3;
        long j4;
        boolean z = xzdVar.p;
        boolean z2 = xzdVar.g;
        yde ydeVar = xzdVar.r;
        long j5 = xzdVar.u;
        long j6 = xzdVar.e;
        int i = xzdVar.d;
        long j7 = xzdVar.h;
        long m0 = z ? dvt.m0(j7) : -9223372036854775807L;
        long j8 = (i == 2 || i == 1) ? m0 : -9223372036854775807L;
        ym7 ym7Var = this.o;
        h0e h0eVar = ym7Var.j;
        h0eVar.getClass();
        nzd nzdVar = new nzd(h0eVar, xzdVar);
        long j9 = 0;
        if (ym7Var.m) {
            wzd wzdVar = xzdVar.v;
            long j10 = j7 - ym7Var.n;
            boolean z3 = xzdVar.o;
            long j11 = z3 ? j10 + j5 : -9223372036854775807L;
            long Y = xzdVar.p ? dvt.Y(dvt.H(this.p)) - (j7 + j5) : 0L;
            long j12 = this.q.a;
            if (j12 != -9223372036854775807L) {
                j3 = dvt.Y(j12);
            } else {
                if (j6 != -9223372036854775807L) {
                    j2 = j5 - j6;
                } else {
                    j2 = wzdVar.d;
                    if (j2 == -9223372036854775807L || xzdVar.n == -9223372036854775807L) {
                        j2 = wzdVar.c;
                        if (j2 == -9223372036854775807L) {
                            j2 = 3 * xzdVar.m;
                        }
                    }
                }
                j3 = j2 + Y;
            }
            long j13 = j5 + Y;
            long j14 = dvt.j(j3, Y, j13);
            fnh fnhVar = f().c;
            boolean z4 = fnhVar.d == -3.4028235E38f && fnhVar.e == -3.4028235E38f && wzdVar.c == -9223372036854775807L && wzdVar.d == -9223372036854775807L;
            dnh dnhVar = new dnh();
            dnhVar.a = dvt.m0(j14);
            dnhVar.d = z4 ? 1.0f : this.q.d;
            dnhVar.e = z4 ? 1.0f : this.q.e;
            fnh fnhVar2 = new fnh(dnhVar);
            this.q = fnhVar2;
            if (j6 == -9223372036854775807L) {
                j6 = j13 - dvt.Y(fnhVar2.a);
            }
            if (z2) {
                j9 = j6;
            } else {
                szd A = A(xzdVar.s, j6);
                if (A != null) {
                    j4 = A.e;
                } else if (!ydeVar.isEmpty()) {
                    uzd uzdVar = (uzd) ydeVar.get(dvt.c(ydeVar, Long.valueOf(j6), true));
                    szd A2 = A(uzdVar.m, j6);
                    j4 = A2 != null ? A2.e : uzdVar.e;
                }
                j9 = j4;
            }
            bVar = new b(j8, m0, j11, xzdVar.u, j10, j9, true, !z3, i == 2 && xzdVar.f, nzdVar, f(), this.q);
        } else {
            if (j6 == -9223372036854775807L || ydeVar.isEmpty()) {
                j = 0;
            } else {
                if (!z2 && j6 != j5) {
                    j6 = ((uzd) ydeVar.get(dvt.c(ydeVar, Long.valueOf(j6), true))).e;
                }
                j = j6;
            }
            long j15 = xzdVar.u;
            bVar = new b(j8, m0, j15, j15, 0L, j, true, false, true, nzdVar, f(), null);
        }
        y(bVar);
    }

    @Override // defpackage.wvh
    public final boolean a(onh onhVar) {
        onh f = f();
        gnh gnhVar = f.b;
        gnhVar.getClass();
        gnh gnhVar2 = onhVar.b;
        return gnhVar2 != null && gnhVar2.a.equals(gnhVar.a) && gnhVar2.e.equals(gnhVar.e) && Objects.equals(gnhVar2.c, gnhVar.c) && f.c.equals(onhVar.c);
    }

    @Override // defpackage.wvh
    public final synchronized onh f() {
        return this.s;
    }

    @Override // defpackage.wvh
    public final synchronized void i(onh onhVar) {
        this.s = onhVar;
    }

    @Override // defpackage.wvh
    public final woh n(uvh uvhVar, zi7 zi7Var, long j) {
        x0 t = t(uvhVar);
        cra craVar = new cra(this.d.c, 0, uvhVar);
        t6t t6tVar = this.r;
        ndl ndlVar = this.g;
        vq1.B(ndlVar);
        return new pzd(this.h, this.o, this.i, t6tVar, this.k, craVar, this.l, t, zi7Var, this.j, this.m, this.n, ndlVar);
    }

    @Override // defpackage.wvh
    public final void p() {
        ym7 ym7Var = this.o;
        osh oshVar = ym7Var.g;
        if (oshVar != null) {
            oshVar.b();
        }
        Uri uri = ym7Var.k;
        if (uri != null) {
            xm7 xm7Var = (xm7) ym7Var.d.get(uri);
            xm7Var.b.b();
            IOException iOException = xm7Var.j;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // defpackage.wvh
    public final void s(woh wohVar) {
        pzd pzdVar = (pzd) wohVar;
        pzdVar.b.e.remove(pzdVar);
        for (t0e t0eVar : pzdVar.t) {
            if (t0eVar.D) {
                for (s0e s0eVar : t0eVar.v) {
                    s0eVar.h();
                    zqa zqaVar = s0eVar.h;
                    if (zqaVar != null) {
                        zqaVar.x(s0eVar.e);
                        s0eVar.h = null;
                        s0eVar.g = null;
                    }
                }
            }
            lzd lzdVar = t0eVar.d;
            xm7 xm7Var = (xm7) lzdVar.g.d.get(lzdVar.e[lzdVar.q.r()]);
            if (xm7Var != null) {
                xm7Var.k = false;
            }
            lzdVar.n = null;
            t0eVar.j.P(t0eVar);
            t0eVar.r.removeCallbacksAndMessages(null);
            t0eVar.H = true;
            t0eVar.s.clear();
        }
        pzdVar.q = null;
    }

    @Override // defpackage.js2
    public final void x(t6t t6tVar) {
        this.r = t6tVar;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        ndl ndlVar = this.g;
        vq1.B(ndlVar);
        gra graVar = this.k;
        graVar.s(myLooper, ndlVar);
        graVar.q();
        x0 t = t(null);
        gnh gnhVar = f().b;
        gnhVar.getClass();
        Uri uri = gnhVar.a;
        ym7 ym7Var = this.o;
        ym7Var.getClass();
        ym7Var.h = dvt.p(null);
        ym7Var.f = t;
        ym7Var.i = this;
        Map map = Collections.EMPTY_MAP;
        vq1.C(uri, "The uri must be set.");
        d8k d8kVar = new d8k(((va7) ym7Var.a.b).a(), new nb7(uri, 0L, 1, null, map, 0L, -1L, null, 1), 4, ym7Var.b.o());
        vq1.A(ym7Var.g == null);
        osh oshVar = new osh("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        ym7Var.g = oshVar;
        oshVar.X(d8kVar, ym7Var, ym7Var.c.r(d8kVar.c));
    }

    @Override // defpackage.js2
    public final void z() {
        ym7 ym7Var = this.o;
        ym7Var.k = null;
        ym7Var.l = null;
        ym7Var.j = null;
        ym7Var.n = -9223372036854775807L;
        ym7Var.g.P(null);
        ym7Var.g = null;
        HashMap hashMap = ym7Var.d;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((xm7) it.next()).b.P(null);
        }
        ym7Var.h.removeCallbacksAndMessages(null);
        ym7Var.h = null;
        hashMap.clear();
        this.k.a();
    }
}
