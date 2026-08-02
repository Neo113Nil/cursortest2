package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n97 extends js2 {
    public osh A;
    public t6t B;
    public g97 C;
    public Handler D;
    public fnh E;
    public Uri F;
    public final Uri G;
    public d97 H;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public int X;
    public long Y;
    public int Z;
    public final boolean h;
    public final va7 i;
    public final b97 j;
    public final rwd k;
    public final gra l;
    public final xeg m;
    public final kkp n;
    public final long o;
    public final long p;
    public final x0 q;
    public final c8k r;
    public final ozw s;
    public final Object t;
    public final SparseArray u;
    public final j97 v;
    public onh v0;
    public final j97 w;
    public final znk x;
    public final ogg y;
    public db7 z;

    static {
        ynh.a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [j97] */
    /* JADX WARN: Type inference failed for: r2v12, types: [j97] */
    public n97(onh onhVar, va7 va7Var, c8k c8kVar, b97 b97Var, rwd rwdVar, gra graVar, xeg xegVar, long j, long j2) {
        this.v0 = onhVar;
        this.E = onhVar.c;
        gnh gnhVar = onhVar.b;
        gnhVar.getClass();
        Uri uri = gnhVar.a;
        this.F = uri;
        this.G = uri;
        this.H = null;
        this.i = va7Var;
        this.r = c8kVar;
        this.j = b97Var;
        this.l = graVar;
        this.m = xegVar;
        this.o = j;
        this.p = j2;
        this.k = rwdVar;
        this.n = new kkp(20);
        this.h = false;
        this.q = t(null);
        this.t = new Object();
        this.u = new SparseArray();
        this.x = new znk(22, this);
        this.Y = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.s = new ozw(23, this);
        this.y = new efo(21, this);
        final int i = 0;
        this.v = new Runnable(this) { // from class: j97
            public final /* synthetic */ n97 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.b.G();
                        break;
                    default:
                        this.b.E(false);
                        break;
                }
            }
        };
        final int i2 = 1;
        this.w = new Runnable(this) { // from class: j97
            public final /* synthetic */ n97 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.b.G();
                        break;
                    default:
                        this.b.E(false);
                        break;
                }
            }
        };
    }

    public static boolean A(pkk pkkVar) {
        List list = pkkVar.c;
        for (int i = 0; i < list.size(); i++) {
            int i2 = ((nj) list.get(i)).b;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    public final void B() {
        boolean z;
        osh oshVar = this.A;
        qxp qxpVar = new qxp(this);
        synchronized (i4w.u) {
            z = i4w.v;
        }
        if (z) {
            qxpVar.p();
            return;
        }
        if (oshVar == null) {
            oshVar = new osh("SntpClient");
        }
        oshVar.X(new ovk(), new m97(2, qxpVar), 1);
    }

    public final void C(d8k d8kVar, long j) {
        long j2 = d8kVar.a;
        nb7 nb7Var = d8kVar.b;
        ngr ngrVar = d8kVar.d;
        cfg cfgVar = new cfg(nb7Var, ngrVar.c, ngrVar.d, j, ngrVar.b);
        this.m.getClass();
        this.q.L(cfgVar, d8kVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void D(IOException iOException) {
        vq1.L("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.L = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        E(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:230:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x019e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(boolean z) {
        long j;
        long j2;
        long j3;
        boolean z2;
        d97 d97Var;
        long j4;
        boolean z3;
        long j5;
        long j6;
        int i;
        long j7;
        float f;
        long j8;
        float f2;
        long Y;
        long min;
        boolean z4;
        o97 b;
        long j9;
        long j10;
        boolean z5;
        int i2;
        long j11;
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.u;
            if (i3 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i3);
            if (keyAt >= this.Z) {
                i97 i97Var = (i97) sparseArray.valueAt(i3);
                d97 d97Var2 = this.H;
                int i4 = keyAt - this.Z;
                i97Var.v = d97Var2;
                i97Var.w = i4;
                qcl qclVar = i97Var.m;
                qclVar.h = false;
                qclVar.f = d97Var2;
                Iterator it = qclVar.e.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < qclVar.f.h) {
                        it.remove();
                    }
                }
                wk4[] wk4VarArr = i97Var.s;
                if (wk4VarArr != null) {
                    for (wk4 wk4Var : wk4VarArr) {
                        ((c97) wk4Var.e).h(d97Var2, i4);
                    }
                    i97Var.r.b(i97Var);
                }
                i97Var.x = d97Var2.b(i4).d;
                for (xib xibVar : i97Var.t) {
                    Iterator it2 = i97Var.x.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            zib zibVar = (zib) it2.next();
                            if (zibVar.a().equals(xibVar.e.a())) {
                                xibVar.a(zibVar, d97Var2.d && i4 == d97Var2.m.size() - 1);
                            }
                        }
                    }
                }
            }
            i3++;
        }
        pkk b2 = this.H.b(0);
        int size = this.H.m.size() - 1;
        pkk b3 = this.H.b(size);
        long d = this.H.d(size);
        long Y2 = dvt.Y(dvt.H(this.L));
        long d2 = this.H.d(0);
        long j12 = b2.b;
        List list = b2.c;
        long Y3 = dvt.Y(j12);
        boolean A = A(b2);
        int i5 = 0;
        long j13 = Y3;
        while (true) {
            j = d;
            if (i5 >= list.size()) {
                j2 = 0;
                Y3 = j13;
                break;
            }
            nj njVar = (nj) list.get(i5);
            List list2 = njVar.c;
            int i6 = njVar.b;
            j2 = 0;
            boolean z6 = (i6 == 1 || i6 == 2) ? false : true;
            if ((A && z6) || list2.isEmpty()) {
                j11 = d2;
            } else {
                o97 b4 = ((a0o) list2.get(0)).b();
                if (b4 == null || b4.J(d2, Y2) == 0) {
                    break;
                }
                j11 = d2;
                j13 = Math.max(j13, b4.c(b4.i(d2, Y2)) + Y3);
            }
            i5++;
            d = j;
            d2 = j11;
        }
        long j14 = b3.b;
        List list3 = b3.c;
        long Y4 = dvt.Y(j14);
        boolean A2 = A(b3);
        long j15 = Long.MAX_VALUE;
        int i7 = 0;
        while (true) {
            if (i7 >= list3.size()) {
                j3 = j15;
                break;
            }
            nj njVar2 = (nj) list3.get(i7);
            List list4 = njVar2.c;
            int i8 = njVar2.b;
            if (i8 != 1 && i8 != 2) {
                z4 = true;
                if ((A2 || !z4) && !list4.isEmpty()) {
                    b = ((a0o) list4.get(0)).b();
                    if (b != null) {
                        j3 = Y4 + j;
                        break;
                    }
                    j9 = Y4;
                    j10 = j;
                    long J = b.J(j10, Y2);
                    if (J == j2) {
                        j3 = j9;
                        break;
                    }
                    z5 = A2;
                    i2 = i7;
                    long i9 = (b.i(j10, Y2) + J) - 1;
                    j15 = Math.min(j15, b.f(i9, j10) + b.c(i9) + j9);
                } else {
                    i2 = i7;
                    j9 = Y4;
                    j10 = j;
                    z5 = A2;
                }
                i7 = i2 + 1;
                j = j10;
                A2 = z5;
                Y4 = j9;
            }
            z4 = false;
            if (A2) {
            }
            b = ((a0o) list4.get(0)).b();
            if (b != null) {
            }
        }
        if (this.H.d) {
            for (int i10 = 0; i10 < list3.size(); i10++) {
                o97 b5 = ((a0o) ((nj) list3.get(i10)).c.get(0)).b();
                if (b5 != null && !b5.G()) {
                }
            }
            z2 = true;
            if (z2) {
                long j16 = this.H.f;
                if (j16 != -9223372036854775807L) {
                    Y3 = Math.max(Y3, j3 - dvt.Y(j16));
                }
            }
            long j17 = j3 - Y3;
            d97Var = this.H;
            if (d97Var.d) {
                j4 = -9223372036854775807L;
                z3 = z2;
                j5 = -9223372036854775807L;
                j6 = j2;
            } else {
                vq1.A(d97Var.a != -9223372036854775807L);
                long Y5 = (Y2 - dvt.Y(this.H.a)) - Y3;
                fnh fnhVar = f().c;
                long m0 = dvt.m0(Y5);
                long j18 = fnhVar.c;
                if (j18 != -9223372036854775807L) {
                    j7 = Math.min(m0, j18);
                } else {
                    dnh dnhVar = this.H.j;
                    if (dnhVar != null) {
                        long j19 = dnhVar.c;
                        if (j19 != -9223372036854775807L) {
                            j7 = Math.min(m0, j19);
                        }
                    }
                    j7 = m0;
                }
                long m02 = dvt.m0(Y5 - j17);
                if (m02 < j2 && j7 > j2) {
                    m02 = j2;
                }
                j4 = -9223372036854775807L;
                long j20 = this.H.c;
                if (j20 != -9223372036854775807L) {
                    m02 = Math.min(m02 + j20, m0);
                }
                long j21 = m02;
                long j22 = fnhVar.b;
                if (j22 != -9223372036854775807L) {
                    j21 = dvt.j(j22, j21, m0);
                } else {
                    dnh dnhVar2 = this.H.j;
                    if (dnhVar2 != null) {
                        long j23 = dnhVar2.b;
                        if (j23 != -9223372036854775807L) {
                            j21 = dvt.j(j23, j21, m0);
                        }
                    }
                }
                long j24 = j21;
                long j25 = j24 > j7 ? j24 : j7;
                long j26 = this.E.a;
                if (j26 == -9223372036854775807L) {
                    d97 d97Var3 = this.H;
                    dnh dnhVar3 = d97Var3.j;
                    if (dnhVar3 != null) {
                        long j27 = dnhVar3.a;
                        if (j27 != -9223372036854775807L) {
                            j26 = j27;
                        }
                    }
                    j26 = d97Var3.g;
                    if (j26 == -9223372036854775807L) {
                        j26 = this.o;
                    }
                }
                if (j26 < j24) {
                    j26 = j24;
                }
                long j28 = this.p;
                if (j26 > j25) {
                    j26 = dvt.j(dvt.m0(Y5 - Math.min(j28, j17 / 2)), j24, j25);
                }
                long j29 = j25;
                z3 = z2;
                float f3 = fnhVar.d;
                if (f3 == -3.4028235E38f) {
                    dnh dnhVar4 = this.H.j;
                    f3 = dnhVar4 != null ? dnhVar4.d : -3.4028235E38f;
                }
                float f4 = fnhVar.e;
                if (f4 == -3.4028235E38f) {
                    dnh dnhVar5 = this.H.j;
                    f4 = dnhVar5 != null ? dnhVar5.e : -3.4028235E38f;
                }
                if (f3 == -3.4028235E38f && f4 == -3.4028235E38f) {
                    f = f4;
                    dnh dnhVar6 = this.H.j;
                    j8 = Y5;
                    if (dnhVar6 == null || dnhVar6.a == -9223372036854775807L) {
                        f3 = 1.0f;
                        f2 = 1.0f;
                        dnh dnhVar7 = new dnh();
                        dnhVar7.a = j26;
                        dnhVar7.b = j24;
                        dnhVar7.c = j29;
                        dnhVar7.d = f3;
                        dnhVar7.e = f2;
                        this.E = new fnh(dnhVar7);
                        long m03 = dvt.m0(Y3) + this.H.a;
                        Y = j8 - dvt.Y(this.E.a);
                        min = Math.min(j28, j17 / 2);
                        if (Y >= min) {
                            j6 = min;
                            j5 = m03;
                        } else {
                            j5 = m03;
                            j6 = Y;
                        }
                    }
                } else {
                    f = f4;
                    j8 = Y5;
                }
                f2 = f;
                dnh dnhVar72 = new dnh();
                dnhVar72.a = j26;
                dnhVar72.b = j24;
                dnhVar72.c = j29;
                dnhVar72.d = f3;
                dnhVar72.e = f2;
                this.E = new fnh(dnhVar72);
                long m032 = dvt.m0(Y3) + this.H.a;
                Y = j8 - dvt.Y(this.E.a);
                min = Math.min(j28, j17 / 2);
                if (Y >= min) {
                }
            }
            long Y6 = Y3 - dvt.Y(b2.b);
            d97 d97Var4 = this.H;
            y(new k97(d97Var4.a, j5, this.L, this.Z, Y6, j17, j6, d97Var4, f(), !this.H.d ? this.E : null));
            if (this.h) {
                Handler handler = this.D;
                j97 j97Var = this.w;
                handler.removeCallbacks(j97Var);
                if (z3) {
                    Handler handler2 = this.D;
                    d97 d97Var5 = this.H;
                    long H = dvt.H(this.L);
                    int size2 = d97Var5.m.size() - 1;
                    pkk b6 = d97Var5.b(size2);
                    long j30 = b6.b;
                    List list5 = b6.c;
                    long Y7 = dvt.Y(j30);
                    long d3 = d97Var5.d(size2);
                    long Y8 = dvt.Y(H);
                    long Y9 = dvt.Y(d97Var5.a);
                    long Y10 = dvt.Y(d97Var5.e);
                    if (Y10 == j4 || Y10 >= 5000000) {
                        Y10 = 5000000;
                    }
                    int i11 = 0;
                    while (i11 < list5.size()) {
                        List list6 = ((nj) list5.get(i11)).c;
                        if (list6.isEmpty()) {
                            i = i11;
                        } else {
                            i = i11;
                            o97 b7 = ((a0o) list6.get(0)).b();
                            if (b7 != null) {
                                long j31 = (b7.j(d3, Y8) + (Y9 + Y7)) - Y8;
                                if (j31 > j2 && (j31 < Y10 - 100000 || (j31 > Y10 && j31 < Y10 + 100000))) {
                                    Y10 = j31;
                                }
                            }
                        }
                        i11 = i + 1;
                    }
                    handler2.postDelayed(j97Var, bzf.y(Y10, 1000L, RoundingMode.CEILING));
                }
                if (this.I) {
                    G();
                    return;
                }
                if (z) {
                    d97 d97Var6 = this.H;
                    if (d97Var6.d) {
                        long j32 = d97Var6.e;
                        if (j32 != j4) {
                            if (j32 == j2) {
                                j32 = 5000;
                            }
                            this.D.postDelayed(this.v, Math.max(j2, (this.J + j32) - SystemClock.elapsedRealtime()));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        z2 = false;
        if (z2) {
        }
        long j172 = j3 - Y3;
        d97Var = this.H;
        if (d97Var.d) {
        }
        long Y62 = Y3 - dvt.Y(b2.b);
        d97 d97Var42 = this.H;
        y(new k97(d97Var42.a, j5, this.L, this.Z, Y62, j172, j6, d97Var42, f(), !this.H.d ? this.E : null));
        if (this.h) {
        }
    }

    public final void F(y3e y3eVar, c8k c8kVar) {
        db7 db7Var = this.z;
        Uri parse = Uri.parse(y3eVar.c);
        Map map = Collections.EMPTY_MAP;
        vq1.C(parse, "The uri must be set.");
        this.A.X(new d8k(db7Var, new nb7(parse, 0L, 1, null, map, 0L, -1L, null, 1), 5, c8kVar), new m97(0, this), 1);
    }

    public final void G() {
        Uri uri;
        this.D.removeCallbacks(this.v);
        if (this.A.H()) {
            return;
        }
        if (this.A.I()) {
            this.I = true;
            return;
        }
        synchronized (this.t) {
            uri = this.F;
        }
        this.I = false;
        Map map = Collections.EMPTY_MAP;
        vq1.C(uri, "The uri must be set.");
        this.A.X(new d8k(this.z, new nb7(uri, 0L, 1, null, map, 0L, -1L, null, 1), 4, this.r), this.s, this.m.r(4));
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
        return this.v0;
    }

    @Override // defpackage.wvh
    public final synchronized void i(onh onhVar) {
        this.v0 = onhVar;
    }

    @Override // defpackage.wvh
    public final woh n(uvh uvhVar, zi7 zi7Var, long j) {
        int intValue = ((Integer) uvhVar.a).intValue() - this.Z;
        x0 t = t(uvhVar);
        cra craVar = new cra(this.d.c, 0, uvhVar);
        int i = this.Z + intValue;
        d97 d97Var = this.H;
        t6t t6tVar = this.B;
        long j2 = this.L;
        ndl ndlVar = this.g;
        vq1.B(ndlVar);
        i97 i97Var = new i97(i, d97Var, this.n, intValue, this.j, t6tVar, this.l, craVar, this.m, t, j2, this.y, zi7Var, this.k, this.x, ndlVar);
        this.u.put(i, i97Var);
        return i97Var;
    }

    @Override // defpackage.wvh
    public final void p() {
        this.y.b();
    }

    @Override // defpackage.wvh
    public final void s(woh wohVar) {
        i97 i97Var = (i97) wohVar;
        qcl qclVar = i97Var.m;
        qclVar.i = true;
        qclVar.d.removeCallbacksAndMessages(null);
        for (wk4 wk4Var : i97Var.s) {
            wk4Var.C(i97Var);
        }
        i97Var.r = null;
        this.u.remove(i97Var.a);
    }

    @Override // defpackage.js2
    public final void x(t6t t6tVar) {
        this.B = t6tVar;
        Looper myLooper = Looper.myLooper();
        ndl ndlVar = this.g;
        vq1.B(ndlVar);
        gra graVar = this.l;
        graVar.s(myLooper, ndlVar);
        graVar.q();
        if (this.h) {
            E(false);
            return;
        }
        this.z = this.i.a();
        this.A = new osh("DashMediaSource");
        this.D = dvt.p(null);
        G();
    }

    @Override // defpackage.js2
    public final void z() {
        this.I = false;
        this.z = null;
        osh oshVar = this.A;
        if (oshVar != null) {
            oshVar.P(null);
            this.A = null;
        }
        this.J = 0L;
        this.K = 0L;
        this.F = this.G;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
        this.L = -9223372036854775807L;
        this.X = 0;
        this.Y = -9223372036854775807L;
        this.u.clear();
        kkp kkpVar = this.n;
        ((HashMap) kkpVar.b).clear();
        ((HashMap) kkpVar.c).clear();
        ((HashMap) kkpVar.d).clear();
        this.l.a();
    }
}
