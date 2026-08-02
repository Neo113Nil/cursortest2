package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.exoplayer.source.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public final class u9r extends js2 implements hgg {
    public final boolean h;
    public final Uri i;
    public final va7 j;
    public final r0o k;
    public final rwd l;
    public final gra m;
    public final xeg n;
    public final long o;
    public final x0 p;
    public final c8k q;
    public final ArrayList r;
    public db7 s;
    public osh t;
    public ogg u;
    public t6t v;
    public long w;
    public n9r x;
    public Handler y;
    public onh z;

    static {
        ynh.a("media3.exoplayer.smoothstreaming");
    }

    public u9r(onh onhVar, va7 va7Var, c8k c8kVar, r0o r0oVar, rwd rwdVar, gra graVar, xeg xegVar, long j) {
        this.z = onhVar;
        gnh gnhVar = onhVar.b;
        gnhVar.getClass();
        Uri uri = gnhVar.a;
        this.x = null;
        if (uri.equals(Uri.EMPTY)) {
            uri = null;
        } else {
            String path = uri.getPath();
            if (path != null) {
                Matcher matcher = dvt.h.matcher(path);
                if (matcher.matches() && matcher.group(1) == null) {
                    uri = Uri.withAppendedPath(uri, "Manifest");
                }
            }
        }
        this.i = uri;
        this.j = va7Var;
        this.q = c8kVar;
        this.k = r0oVar;
        this.l = rwdVar;
        this.m = graVar;
        this.n = xegVar;
        this.o = j;
        this.p = t(null);
        this.h = false;
        this.r = new ArrayList();
    }

    public final void A() {
        b bVar;
        boolean z;
        m9r[] m9rVarArr;
        boolean z2 = false;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i >= arrayList.size()) {
                break;
            }
            t9r t9rVar = (t9r) arrayList.get(i);
            n9r n9rVar = this.x;
            t9rVar.l = n9rVar;
            for (wk4 wk4Var : t9rVar.m) {
                vr7 vr7Var = (vr7) wk4Var.e;
                m9r[] m9rVarArr2 = vr7Var.f.f;
                int i2 = vr7Var.b;
                m9r m9rVar = m9rVarArr2[i2];
                int i3 = m9rVar.k;
                long[] jArr = m9rVar.o;
                m9r m9rVar2 = n9rVar.f[i2];
                if (i3 == 0 || m9rVar2.k == 0) {
                    vr7Var.g += i3;
                } else {
                    int i4 = i3 - 1;
                    long c = m9rVar.c(i4) + jArr[i4];
                    long j = m9rVar2.o[0];
                    int i5 = vr7Var.g;
                    if (c <= j) {
                        vr7Var.g = i5 + i3;
                    } else {
                        vr7Var.g = dvt.e(jArr, j, true) + i5;
                    }
                }
                vr7Var.f = n9rVar;
            }
            voh vohVar = t9rVar.k;
            vohVar.getClass();
            vohVar.b(t9rVar);
            i++;
        }
        m9r[] m9rVarArr3 = this.x.f;
        int length = m9rVarArr3.length;
        long j2 = Long.MIN_VALUE;
        int i6 = 0;
        long j3 = Long.MAX_VALUE;
        while (i6 < length) {
            m9r m9rVar3 = m9rVarArr3[i6];
            int i7 = m9rVar3.k;
            long[] jArr2 = m9rVar3.o;
            if (i7 > 0) {
                z = z2;
                m9rVarArr = m9rVarArr3;
                j3 = Math.min(j3, jArr2[z ? 1 : 0]);
                int i8 = m9rVar3.k - 1;
                j2 = Math.max(j2, m9rVar3.c(i8) + jArr2[i8]);
            } else {
                z = z2;
                m9rVarArr = m9rVarArr3;
            }
            i6++;
            z2 = z;
            m9rVarArr3 = m9rVarArr;
        }
        n9r n9rVar2 = this.x;
        if (j3 == Long.MAX_VALUE) {
            long j4 = n9rVar2.d ? -9223372036854775807L : 0L;
            n9r n9rVar3 = this.x;
            boolean z3 = n9rVar3.d;
            bVar = new b(j4, 0L, 0L, 0L, true, z3, z3, n9rVar3, f());
        } else if (n9rVar2.d) {
            long j5 = n9rVar2.h;
            if (j5 != -9223372036854775807L && j5 > 0) {
                j3 = Math.max(j3, j2 - j5);
            }
            long j6 = j3;
            long j7 = j2 - j6;
            long Y = j7 - dvt.Y(this.o);
            if (Y < 5000000) {
                Y = Math.min(5000000L, j7 / 2);
            }
            bVar = new b(-9223372036854775807L, j7, j6, Y, true, true, true, this.x, f());
        } else {
            long j8 = n9rVar2.g;
            if (j8 == -9223372036854775807L) {
                j8 = j2 - j3;
            }
            long j9 = j8;
            long j10 = j3;
            bVar = new b(-9223372036854775807L, -9223372036854775807L, j10 + j9, j9, j10, 0L, true, false, false, this.x, f(), null);
        }
        y(bVar);
    }

    public final void B() {
        if (this.t.H()) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        Uri uri = this.i;
        vq1.C(uri, "The uri must be set.");
        d8k d8kVar = new d8k(this.s, new nb7(uri, 0L, 1, null, map, 0L, -1L, null, 1), 4, this.q);
        this.t.X(d8kVar, this, this.n.r(d8kVar.c));
    }

    @Override // defpackage.wvh
    public final boolean a(onh onhVar) {
        gnh gnhVar = f().b;
        gnhVar.getClass();
        gnh gnhVar2 = onhVar.b;
        return gnhVar2 != null && gnhVar2.a.equals(gnhVar.a) && gnhVar2.e.equals(gnhVar.e) && Objects.equals(gnhVar2.c, gnhVar.c);
    }

    @Override // defpackage.hgg
    public final void d(jgg jggVar, long j, long j2, boolean z) {
        d8k d8kVar = (d8k) jggVar;
        long j3 = d8kVar.a;
        nb7 nb7Var = d8kVar.b;
        ngr ngrVar = d8kVar.d;
        cfg cfgVar = new cfg(nb7Var, ngrVar.c, ngrVar.d, j2, ngrVar.b);
        this.n.getClass();
        this.p.L(cfgVar, d8kVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // defpackage.wvh
    public final synchronized onh f() {
        return this.z;
    }

    @Override // defpackage.hgg
    public final void g(jgg jggVar, long j, long j2) {
        d8k d8kVar = (d8k) jggVar;
        long j3 = d8kVar.a;
        nb7 nb7Var = d8kVar.b;
        ngr ngrVar = d8kVar.d;
        cfg cfgVar = new cfg(nb7Var, ngrVar.c, ngrVar.d, j2, ngrVar.b);
        this.n.getClass();
        this.p.M(cfgVar, d8kVar.c);
        this.x = (n9r) d8kVar.f;
        this.w = j - j2;
        A();
        if (this.x.d) {
            this.y.postDelayed(new bhp(6, this), Math.max(0L, (this.w + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    @Override // defpackage.wvh
    public final synchronized void i(onh onhVar) {
        this.z = onhVar;
    }

    @Override // defpackage.wvh
    public final woh n(uvh uvhVar, zi7 zi7Var, long j) {
        x0 t = t(uvhVar);
        cra craVar = new cra(this.d.c, 0, uvhVar);
        t9r t9rVar = new t9r(this.x, this.k, this.v, this.l, this.m, craVar, this.n, t, this.u, zi7Var);
        this.r.add(t9rVar);
        return t9rVar;
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
        this.p.R(cfgVar, d8kVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // defpackage.wvh
    public final void p() {
        this.u.b();
    }

    @Override // defpackage.wvh
    public final void s(woh wohVar) {
        t9r t9rVar = (t9r) wohVar;
        for (wk4 wk4Var : t9rVar.m) {
            wk4Var.C(null);
        }
        t9rVar.k = null;
        this.r.remove(wohVar);
    }

    @Override // defpackage.hgg
    public final mdr v(jgg jggVar, long j, long j2, IOException iOException, int i) {
        d8k d8kVar = (d8k) jggVar;
        long j3 = d8kVar.a;
        nb7 nb7Var = d8kVar.b;
        ngr ngrVar = d8kVar.d;
        cfg cfgVar = new cfg(nb7Var, ngrVar.c, ngrVar.d, j2, ngrVar.b);
        int i2 = d8kVar.c;
        long C = this.n.C(new j4x(iOException, i, 9));
        mdr mdrVar = C == -9223372036854775807L ? osh.m : new mdr(0, C, false);
        this.p.P(cfgVar, i2, iOException, !mdrVar.b());
        return mdrVar;
    }

    @Override // defpackage.js2
    public final void x(t6t t6tVar) {
        this.v = t6tVar;
        Looper myLooper = Looper.myLooper();
        ndl ndlVar = this.g;
        vq1.B(ndlVar);
        gra graVar = this.m;
        graVar.s(myLooper, ndlVar);
        graVar.q();
        if (this.h) {
            this.u = new gos(26);
            A();
            return;
        }
        this.s = this.j.a();
        osh oshVar = new osh("SsMediaSource");
        this.t = oshVar;
        this.u = oshVar;
        this.y = dvt.p(null);
        B();
    }

    @Override // defpackage.js2
    public final void z() {
        this.x = this.h ? this.x : null;
        this.s = null;
        this.w = 0L;
        osh oshVar = this.t;
        if (oshVar != null) {
            oshVar.P(null);
            this.t = null;
        }
        Handler handler = this.y;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.y = null;
        }
        this.m.a();
    }
}
