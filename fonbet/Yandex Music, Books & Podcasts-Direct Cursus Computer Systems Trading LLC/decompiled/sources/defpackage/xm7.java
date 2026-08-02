package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class xm7 implements hgg {
    public final Uri a;
    public final osh b = new osh("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final db7 c;
    public xzd d;
    public long e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public IOException j;
    public boolean k;
    public final /* synthetic */ ym7 l;

    public xm7(ym7 ym7Var, Uri uri) {
        this.l = ym7Var;
        this.a = uri;
        this.c = ((va7) ym7Var.a.b).a();
    }

    public static boolean a(xm7 xm7Var, long j) {
        xm7Var.h = SystemClock.elapsedRealtime() + j;
        Uri uri = xm7Var.a;
        ym7 ym7Var = xm7Var.l;
        if (!uri.equals(ym7Var.k)) {
            return false;
        }
        List list = ym7Var.j.e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            xm7 xm7Var2 = (xm7) ym7Var.d.get(((g0e) list.get(i)).a);
            xm7Var2.getClass();
            if (elapsedRealtime > xm7Var2.h) {
                Uri uri2 = xm7Var2.a;
                ym7Var.k = uri2;
                xm7Var2.f(ym7Var.b(uri2));
                return false;
            }
        }
        return true;
    }

    public final Uri b() {
        xzd xzdVar = this.d;
        Uri uri = this.a;
        if (xzdVar != null) {
            wzd wzdVar = xzdVar.v;
            if (wzdVar.a != -9223372036854775807L || wzdVar.e) {
                Uri.Builder buildUpon = uri.buildUpon();
                xzd xzdVar2 = this.d;
                if (xzdVar2.v.e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(xzdVar2.k + xzdVar2.r.size()));
                    xzd xzdVar3 = this.d;
                    if (xzdVar3.n != -9223372036854775807L) {
                        yde ydeVar = xzdVar3.s;
                        int size = ydeVar.size();
                        if (!ydeVar.isEmpty() && ((szd) ild.x(ydeVar)).m) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                wzd wzdVar2 = this.d.v;
                if (wzdVar2.a != -9223372036854775807L) {
                    buildUpon.appendQueryParameter("_HLS_skip", wzdVar2.b ? "v2" : "YES");
                }
                return buildUpon.build();
            }
        }
        return uri;
    }

    public final void c(boolean z) {
        f(z ? b() : this.a);
    }

    @Override // defpackage.hgg
    public final void d(jgg jggVar, long j, long j2, boolean z) {
        d8k d8kVar = (d8k) jggVar;
        long j3 = d8kVar.a;
        nb7 nb7Var = d8kVar.b;
        ngr ngrVar = d8kVar.d;
        cfg cfgVar = new cfg(nb7Var, ngrVar.c, ngrVar.d, j2, ngrVar.b);
        ym7 ym7Var = this.l;
        ym7Var.c.getClass();
        ym7Var.f.L(cfgVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void e(Uri uri) {
        ym7 ym7Var = this.l;
        c8k f = ym7Var.b.f(ym7Var.j, this.d);
        Map map = Collections.EMPTY_MAP;
        vq1.C(uri, "The uri must be set.");
        d8k d8kVar = new d8k(this.c, new nb7(uri, 0L, 1, null, map, 0L, -1L, null, 1), 4, f);
        this.b.X(d8kVar, this, ym7Var.c.r(d8kVar.c));
    }

    public final void f(Uri uri) {
        this.h = 0L;
        if (this.i) {
            return;
        }
        osh oshVar = this.b;
        if (oshVar.I() || oshVar.H()) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.g;
        if (elapsedRealtime >= j) {
            e(uri);
        } else {
            this.i = true;
            this.l.h.postDelayed(new jt6(18, this, uri), j - elapsedRealtime);
        }
    }

    @Override // defpackage.hgg
    public final void g(jgg jggVar, long j, long j2) {
        d8k d8kVar = (d8k) jggVar;
        i0e i0eVar = (i0e) d8kVar.f;
        nb7 nb7Var = d8kVar.b;
        ngr ngrVar = d8kVar.d;
        cfg cfgVar = new cfg(nb7Var, ngrVar.c, ngrVar.d, j2, ngrVar.b);
        if (i0eVar instanceof xzd) {
            h((xzd) i0eVar, cfgVar);
            this.l.f.M(cfgVar, 4);
        } else {
            r7k b = r7k.b("Loaded playlist has unexpected type.", null);
            this.j = b;
            this.l.f.P(cfgVar, 4, b, true);
        }
        this.l.c.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(xzd xzdVar, cfg cfgVar) {
        boolean z;
        CopyOnWriteArrayList copyOnWriteArrayList;
        boolean z2;
        long j;
        long j2;
        long j3;
        int i;
        yde ydeVar;
        xzd xzdVar2;
        IOException iOException;
        long j4;
        IOException o0eVar;
        boolean z3;
        xzd xzdVar3;
        int size;
        int size2;
        int size3;
        xzd xzdVar4 = this.d;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.e = elapsedRealtime;
        ym7 ym7Var = this.l;
        CopyOnWriteArrayList copyOnWriteArrayList2 = ym7Var.e;
        if (xzdVar4 != null) {
            long j5 = xzdVar.k;
            long j6 = xzdVar4.k;
            if (j5 <= j6 && (j5 < j6 || ((size = xzdVar.r.size() - xzdVar4.r.size()) == 0 ? !((size2 = xzdVar.s.size()) > (size3 = xzdVar4.s.size()) || (size2 == size3 && xzdVar.o && !xzdVar4.o)) : size <= 0))) {
                z = false;
                yde ydeVar2 = xzdVar.r;
                long j7 = xzdVar.k;
                long j8 = 0;
                if (z) {
                    if (!xzdVar.o) {
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        z2 = true;
                        xzdVar2 = xzdVar4;
                        j4 = j7;
                    } else if (xzdVar4.o) {
                        xzdVar2 = xzdVar4;
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        j4 = j7;
                        iOException = null;
                        z2 = true;
                    } else {
                        z2 = true;
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        j4 = j7;
                        xzdVar2 = new xzd(xzdVar4.d, xzdVar4.a, xzdVar4.b, xzdVar4.e, xzdVar4.g, xzdVar4.h, xzdVar4.i, xzdVar4.j, xzdVar4.k, xzdVar4.l, xzdVar4.m, xzdVar4.n, xzdVar4.c, true, xzdVar4.p, xzdVar4.q, xzdVar4.r, xzdVar4.s, xzdVar4.v, xzdVar4.t, xzdVar4.w);
                    }
                    iOException = null;
                } else {
                    copyOnWriteArrayList = copyOnWriteArrayList2;
                    z2 = true;
                    if (xzdVar.p) {
                        j = xzdVar.h;
                    } else {
                        xzd xzdVar5 = ym7Var.l;
                        j = xzdVar5 != null ? xzdVar5.h : 0L;
                        if (xzdVar4 != null) {
                            long j9 = xzdVar4.h;
                            long j10 = xzdVar4.k;
                            yde ydeVar3 = xzdVar4.r;
                            j2 = j;
                            int size4 = ydeVar3.size();
                            int i2 = (int) (j7 - j10);
                            uzd uzdVar = i2 < ydeVar3.size() ? (uzd) ydeVar3.get(i2) : null;
                            if (uzdVar != null) {
                                j3 = uzdVar.e;
                            } else {
                                if (size4 == j7 - j10) {
                                    j3 = xzdVar4.u;
                                }
                                if (xzdVar.i) {
                                    xzd xzdVar6 = ym7Var.l;
                                    int i3 = xzdVar6 != null ? xzdVar6.j : 0;
                                    if (xzdVar4 != null) {
                                        int i4 = (int) (j7 - xzdVar4.k);
                                        yde ydeVar4 = xzdVar4.r;
                                        uzd uzdVar2 = i4 < ydeVar4.size() ? (uzd) ydeVar4.get(i4) : null;
                                        if (uzdVar2 != null) {
                                            i3 = (xzdVar4.j + uzdVar2.d) - ((uzd) ydeVar2.get(0)).d;
                                            i = i3;
                                            ydeVar = ydeVar2;
                                        }
                                    }
                                    i = i3;
                                    ydeVar = ydeVar2;
                                } else {
                                    i = xzdVar.j;
                                    ydeVar = ydeVar2;
                                }
                                iOException = null;
                                j4 = j7;
                                xzdVar2 = new xzd(xzdVar.d, xzdVar.a, xzdVar.b, xzdVar.e, xzdVar.g, j2, true, i, xzdVar.k, xzdVar.l, xzdVar.m, xzdVar.n, xzdVar.c, xzdVar.o, xzdVar.p, xzdVar.q, ydeVar, xzdVar.s, xzdVar.v, xzdVar.t, xzdVar.w);
                            }
                            j = j9 + j3;
                        }
                    }
                    j2 = j;
                    if (xzdVar.i) {
                    }
                    iOException = null;
                    j4 = j7;
                    xzdVar2 = new xzd(xzdVar.d, xzdVar.a, xzdVar.b, xzdVar.e, xzdVar.g, j2, true, i, xzdVar.k, xzdVar.l, xzdVar.m, xzdVar.n, xzdVar.c, xzdVar.o, xzdVar.p, xzdVar.q, ydeVar, xzdVar.s, xzdVar.v, xzdVar.t, xzdVar.w);
                }
                this.d = xzdVar2;
                Uri uri = this.a;
                if (xzdVar2 == xzdVar4) {
                    this.j = iOException;
                    this.f = elapsedRealtime;
                    if (uri.equals(ym7Var.k)) {
                        if (ym7Var.l == null) {
                            ym7Var.m = !xzdVar2.o;
                            ym7Var.n = xzdVar2.h;
                        }
                        ym7Var.l = xzdVar2;
                        ym7Var.i.B(xzdVar2);
                    }
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((m0e) it.next()).b();
                    }
                } else if (!xzdVar2.o) {
                    long size5 = j4 + xzdVar.r.size();
                    xzd xzdVar7 = this.d;
                    if (size5 < xzdVar7.k) {
                        o0eVar = new n0e();
                        z3 = z2;
                    } else {
                        o0eVar = ((double) (elapsedRealtime - this.f)) > ((double) dvt.m0(xzdVar7.m)) * 3.5d ? new o0e() : iOException;
                        z3 = false;
                    }
                    if (o0eVar != null) {
                        this.j = o0eVar;
                        j4x j4xVar = new j4x(o0eVar, z2 ? 1 : 0, 9);
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (it2.hasNext()) {
                            ((m0e) it2.next()).d(uri, j4xVar, z3);
                        }
                    }
                }
                xzdVar3 = this.d;
                if (!xzdVar3.v.e) {
                    long j11 = xzdVar3.m;
                    if (xzdVar3 == xzdVar4) {
                        j11 /= 2;
                    }
                    j8 = j11;
                }
                this.g = (dvt.m0(j8) + elapsedRealtime) - cfgVar.d;
                if (this.d.o) {
                    if (uri.equals(ym7Var.k) || this.k) {
                        f(b());
                        return;
                    }
                    return;
                }
                return;
            }
        } else {
            xzdVar.getClass();
        }
        z = true;
        yde ydeVar22 = xzdVar.r;
        long j72 = xzdVar.k;
        long j82 = 0;
        if (z) {
        }
        this.d = xzdVar2;
        Uri uri2 = this.a;
        if (xzdVar2 == xzdVar4) {
        }
        xzdVar3 = this.d;
        if (!xzdVar3.v.e) {
        }
        this.g = (dvt.m0(j82) + elapsedRealtime) - cfgVar.d;
        if (this.d.o) {
        }
    }

    @Override // defpackage.hgg
    public final void o(jgg jggVar, long j, long j2, int i) {
        cfg cfgVar;
        d8k d8kVar = (d8k) jggVar;
        if (i == 0) {
            long j3 = d8kVar.a;
            cfgVar = new cfg(d8kVar.b);
        } else {
            long j4 = d8kVar.a;
            nb7 nb7Var = d8kVar.b;
            ngr ngrVar = d8kVar.d;
            cfgVar = new cfg(nb7Var, ngrVar.c, ngrVar.d, j2, ngrVar.b);
        }
        this.l.f.R(cfgVar, d8kVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // defpackage.hgg
    public final mdr v(jgg jggVar, long j, long j2, IOException iOException, int i) {
        mdr mdrVar = osh.l;
        d8k d8kVar = (d8k) jggVar;
        long j3 = d8kVar.a;
        int i2 = d8kVar.c;
        nb7 nb7Var = d8kVar.b;
        ngr ngrVar = d8kVar.d;
        Uri uri = ngrVar.c;
        cfg cfgVar = new cfg(nb7Var, uri, ngrVar.d, j2, ngrVar.b);
        boolean z = uri.getQueryParameter("_HLS_msn") != null;
        boolean z2 = iOException instanceof j0e;
        ym7 ym7Var = this.l;
        if (z || z2) {
            int i3 = iOException instanceof i6e ? ((i6e) iOException).d : Integer.MAX_VALUE;
            if (z2 || i3 == 400 || i3 == 503) {
                this.g = SystemClock.elapsedRealtime();
                c(false);
                x0 x0Var = ym7Var.f;
                int i4 = dvt.a;
                x0Var.P(cfgVar, i2, iOException, true);
                return mdrVar;
            }
        }
        j4x j4xVar = new j4x(iOException, i, 9);
        Iterator it = ym7Var.e.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= !((m0e) it.next()).d(this.a, j4xVar, false);
        }
        xeg xegVar = ym7Var.c;
        if (z3) {
            long C = xegVar.C(j4xVar);
            mdrVar = C != -9223372036854775807L ? new mdr(0, C, false) : osh.m;
        }
        boolean b = mdrVar.b();
        ym7Var.f.P(cfgVar, i2, iOException, !b);
        if (!b) {
            xegVar.getClass();
        }
        return mdrVar;
    }
}
