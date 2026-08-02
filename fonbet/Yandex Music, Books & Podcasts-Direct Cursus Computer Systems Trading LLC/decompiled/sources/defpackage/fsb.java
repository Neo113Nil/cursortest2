package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import com.yandex.pulse.metrics.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class fsb implements Handler.Callback, voh, z0t {
    public static final long I0 = dvt.m0(10000);
    public final rw1 A;
    public boolean A0;
    public hap B;
    public pqb B0;
    public rzk C;
    public final long C0;
    public csb D;
    public long D0;
    public boolean E;
    public rqb E0;
    public boolean F;
    public long F0;
    public boolean G;
    public boolean G0;
    public boolean H;
    public float H0;
    public long I;
    public boolean J;
    public int K;
    public boolean L;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final ixn[] a;
    public final at2[] b;
    public final boolean[] c;
    public final ct7 d;
    public final c1t e;
    public final heg f;
    public final yk2 g;
    public final hzr h;
    public final anx i;
    public final Looper j;
    public final ris k;
    public final ois l;
    public final long m;
    public final boolean n;
    public final go7 o;
    public final ArrayList p;
    public final dzr q;
    public final prb r;
    public final zoh s;
    public final nwh t;
    public final bo7 u;
    public final long v;
    public int v0;
    public final ndl w;
    public esb w0;
    public final uj7 x;
    public long x0;
    public final hzr y;
    public long y0;
    public final boolean z;
    public int z0;

    public fsb(Context context, at2[] at2VarArr, at2[] at2VarArr2, ct7 ct7Var, c1t c1tVar, heg hegVar, yk2 yk2Var, int i, boolean z, uj7 uj7Var, hap hapVar, bo7 bo7Var, long j, Looper looper, dzr dzrVar, prb prbVar, ndl ndlVar) {
        Looper looper2;
        rqb rqbVar = rqb.a;
        this.F0 = -9223372036854775807L;
        this.r = prbVar;
        this.d = ct7Var;
        this.e = c1tVar;
        this.f = hegVar;
        this.g = yk2Var;
        this.K = i;
        this.L = z;
        this.B = hapVar;
        this.u = bo7Var;
        this.v = j;
        this.C0 = j;
        boolean z2 = false;
        this.F = false;
        this.q = dzrVar;
        this.w = ndlVar;
        this.E0 = rqbVar;
        this.x = uj7Var;
        this.H0 = 1.0f;
        this.D0 = -9223372036854775807L;
        this.I = -9223372036854775807L;
        this.m = hegVar.g(ndlVar);
        this.n = hegVar.b(ndlVar);
        mis misVar = sis.a;
        rzk j2 = rzk.j(c1tVar);
        this.C = j2;
        this.D = new csb(j2);
        this.b = new at2[at2VarArr.length];
        this.c = new boolean[at2VarArr.length];
        ct7Var.getClass();
        this.a = new ixn[at2VarArr.length];
        boolean z3 = false;
        for (int i2 = 0; i2 < at2VarArr.length; i2++) {
            at2 at2Var = at2VarArr[i2];
            at2Var.e = i2;
            at2Var.f = ndlVar;
            at2Var.g = dzrVar;
            this.b[i2] = at2Var;
            at2 at2Var2 = this.b[i2];
            synchronized (at2Var2.a) {
                at2Var2.q = ct7Var;
            }
            at2 at2Var3 = at2VarArr2[i2];
            if (at2Var3 != null) {
                at2Var3.e = at2VarArr.length + i2;
                at2Var3.f = ndlVar;
                at2Var3.g = dzrVar;
                z3 = true;
            }
            ixn[] ixnVarArr = this.a;
            at2 at2Var4 = at2VarArr[i2];
            ixn ixnVar = new ixn();
            ixnVar.e = at2Var4;
            ixnVar.c = i2;
            ixnVar.f = at2Var3;
            ixnVar.d = 0;
            ixnVar.a = false;
            ixnVar.b = false;
            ixnVarArr[i2] = ixnVar;
        }
        this.z = z3;
        this.o = new go7(this, dzrVar);
        this.p = new ArrayList();
        this.k = new ris();
        this.l = new ois();
        ct7Var.a = this;
        ct7Var.b = yk2Var;
        this.A0 = true;
        hzr a = dzrVar.a(looper, null);
        this.y = a;
        this.s = new zoh(uj7Var, a, new g3a(8, this));
        nwh nwhVar = new nwh();
        nwhVar.b = ndlVar;
        nwhVar.g = this;
        nwhVar.k = new ueq();
        nwhVar.d = new IdentityHashMap();
        nwhVar.e = new HashMap();
        nwhVar.c = new ArrayList();
        nwhVar.i = uj7Var;
        nwhVar.j = a;
        nwhVar.f = new HashMap();
        nwhVar.h = new HashSet();
        this.t = nwhVar;
        anx anxVar = new anx();
        anxVar.b = new Object();
        anxVar.c = null;
        anxVar.d = null;
        anxVar.a = 0;
        this.i = anxVar;
        synchronized (anxVar.b) {
            try {
                if (((Looper) anxVar.c) == null) {
                    if (anxVar.a == 0 && ((HandlerThread) anxVar.d) == null) {
                        z2 = true;
                    }
                    vq1.A(z2);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    anxVar.d = handlerThread;
                    handlerThread.start();
                    anxVar.c = ((HandlerThread) anxVar.d).getLooper();
                }
                anxVar.a++;
                looper2 = (Looper) anxVar.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.j = looper2;
        this.h = dzrVar.a(looper2, this);
        this.A = new rw1(context, looper2, this);
    }

    public static Pair Q(sis sisVar, esb esbVar, boolean z, int i, boolean z2, ris risVar, ois oisVar) {
        int R;
        sis sisVar2 = esbVar.a;
        if (sisVar.p()) {
            return null;
        }
        sis sisVar3 = sisVar2.p() ? sisVar : sisVar2;
        try {
            Pair i2 = sisVar3.i(risVar, oisVar, esbVar.b, esbVar.c);
            if (!sisVar.equals(sisVar3)) {
                if (sisVar.b(i2.first) == -1) {
                    if (!z || (R = R(risVar, oisVar, i, z2, i2.first, sisVar3, sisVar)) == -1) {
                        return null;
                    }
                    return sisVar.i(risVar, oisVar, R, -9223372036854775807L);
                }
                if (sisVar3.g(i2.first, oisVar).f && sisVar3.m(oisVar.c, risVar, 0L).n == sisVar3.b(i2.first)) {
                    return sisVar.i(risVar, oisVar, sisVar.g(i2.first, oisVar).c, esbVar.c);
                }
            }
            return i2;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int R(ris risVar, ois oisVar, int i, boolean z, Object obj, sis sisVar, sis sisVar2) {
        ris risVar2 = risVar;
        sis sisVar3 = sisVar;
        Object obj2 = sisVar3.m(sisVar3.g(obj, oisVar).c, risVar, 0L).a;
        for (int i2 = 0; i2 < sisVar2.o(); i2++) {
            if (sisVar2.m(i2, risVar, 0L).a.equals(obj2)) {
                return i2;
            }
        }
        int b = sisVar3.b(obj);
        int h = sisVar3.h();
        int i3 = -1;
        int i4 = 0;
        while (i4 < h && i3 == -1) {
            sis sisVar4 = sisVar3;
            int d = sisVar4.d(b, oisVar, risVar2, i, z);
            if (d == -1) {
                break;
            }
            i3 = sisVar2.b(sisVar4.l(d));
            i4++;
            sisVar3 = sisVar4;
            b = d;
            risVar2 = risVar;
        }
        if (i3 == -1) {
            return -1;
        }
        return sisVar2.f(i3, oisVar, false).c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ahp, java.lang.Object, woh] */
    public static boolean y(xoh xohVar) {
        if (xohVar != null) {
            try {
                ?? r1 = xohVar.a;
                if (xohVar.e) {
                    for (aoo aooVar : xohVar.c) {
                        if (aooVar != null) {
                            aooVar.b();
                        }
                    }
                } else {
                    r1.k();
                }
                if ((!xohVar.e ? 0L : r1.e()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, woh] */
    /* JADX WARN: Type inference failed for: r1v24, types: [ahp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [ahp, java.lang.Object] */
    public final void A() {
        boolean k;
        if (y(this.s.l)) {
            xoh xohVar = this.s.l;
            long o = o(!xohVar.e ? 0L : xohVar.a.e());
            xoh xohVar2 = this.s.i;
            long j = this.x0;
            long j2 = xohVar.p;
            if (xohVar != xohVar2) {
                j -= j2;
                j2 = xohVar.g.b;
            }
            long j3 = j - j2;
            long a = m0(this.C.a, xohVar.g.a) ? this.u.a() : -9223372036854775807L;
            ndl ndlVar = this.w;
            sis sisVar = this.C.a;
            float f = this.o.m().a;
            boolean z = this.C.l;
            geg gegVar = new geg(ndlVar, j3, o, f, this.H, a);
            k = this.f.k(gegVar);
            xoh xohVar3 = this.s.i;
            if (!k && xohVar3.e && o < 500000 && (this.m > 0 || this.n)) {
                xohVar3.a.s(this.C.s, false);
                k = this.f.k(gegVar);
            }
        } else {
            k = false;
        }
        this.J = k;
        if (k) {
            xoh xohVar4 = this.s.l;
            xohVar4.getClass();
            chg chgVar = new chg();
            chgVar.a = this.x0 - xohVar4.p;
            float f2 = this.o.m().a;
            vq1.v(f2 > 0.0f || f2 == -3.4028235E38f);
            chgVar.b = f2;
            long j4 = this.I;
            vq1.v(j4 >= 0 || j4 == -9223372036854775807L);
            chgVar.c = j4;
            dhg dhgVar = new dhg(chgVar);
            vq1.A(xohVar4.m == null);
            xohVar4.a.n(dhgVar);
        }
        q0();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ahp, java.lang.Object, woh] */
    public final void B() {
        zoh zohVar = this.s;
        zohVar.l();
        xoh xohVar = zohVar.m;
        if (xohVar != null) {
            ?? r1 = xohVar.a;
            if ((!xohVar.d || xohVar.e) && !r1.f()) {
                if (this.f.f(this.C.a, xohVar.g.a, xohVar.e ? r1.r() : 0L)) {
                    if (!xohVar.d) {
                        long j = xohVar.g.b;
                        xohVar.d = true;
                        r1.l(this, j);
                        return;
                    }
                    chg chgVar = new chg();
                    chgVar.a = this.x0 - xohVar.p;
                    float f = this.o.m().a;
                    vq1.v(f > 0.0f || f == -3.4028235E38f);
                    chgVar.b = f;
                    long j2 = this.I;
                    vq1.v(j2 >= 0 || j2 == -9223372036854775807L);
                    chgVar.c = j2;
                    dhg dhgVar = new dhg(chgVar);
                    vq1.A(xohVar.m == null);
                    r1.n(dhgVar);
                }
            }
        }
    }

    public final void C() {
        csb csbVar = this.D;
        rzk rzkVar = this.C;
        boolean z = csbVar.d | (((rzk) csbVar.f) != rzkVar);
        csbVar.d = z;
        csbVar.f = rzkVar;
        if (z) {
            xrb xrbVar = this.r.b;
            xrbVar.j.e(new jt6(27, xrbVar, csbVar));
            this.D = new csb(this.C);
        }
    }

    public final void D(int i) {
        ixn ixnVar = this.a[i];
        try {
            xoh xohVar = this.s.i;
            xohVar.getClass();
            at2 d = ixnVar.d(xohVar);
            d.getClass();
            aoo aooVar = d.i;
            aooVar.getClass();
            aooVar.b();
        } catch (IOException | RuntimeException e) {
            int i2 = ((at2) ixnVar.e).b;
            if (i2 != 3 && i2 != 5) {
                throw e;
            }
            c1t c1tVar = this.s.i.o;
            vq1.L("ExoPlayerImplInternal", "Disabling track due to error: ".concat(dsc.c(((zsb[]) c1tVar.d)[i].s())), e);
            c1t c1tVar2 = new c1t((gxn[]) ((gxn[]) c1tVar.c).clone(), (zsb[]) ((zsb[]) c1tVar.d).clone(), (e3t) c1tVar.e, c1tVar.f);
            ((gxn[]) c1tVar2.c)[i] = null;
            ((zsb[]) c1tVar2.d)[i] = null;
            h(i);
            xoh xohVar2 = this.s.i;
            xohVar2.a(c1tVar2, this.C.s, false, new boolean[xohVar2.j.length]);
        }
    }

    public final void E(final int i, final boolean z) {
        boolean[] zArr = this.c;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.y.e(new Runnable() { // from class: yrb
                @Override // java.lang.Runnable
                public final void run() {
                    fsb fsbVar = fsb.this;
                    uj7 uj7Var = fsbVar.x;
                    ixn[] ixnVarArr = fsbVar.a;
                    final int i2 = i;
                    final int i3 = ((at2) ixnVarArr[i2].e).b;
                    final c80 c0 = uj7Var.c0();
                    final boolean z2 = z;
                    uj7Var.d0(c0, 1033, new ycg() { // from class: tj7
                        @Override // defpackage.ycg
                        public final void invoke(Object obj) {
                            ((d80) obj).getClass();
                        }
                    });
                }
            });
        }
    }

    public final void F() {
        u(this.t.g(), true);
    }

    public final void G(bsb bsbVar) {
        sis g;
        this.D.e(1);
        int i = bsbVar.a;
        int i2 = bsbVar.b;
        int i3 = bsbVar.c;
        ueq ueqVar = bsbVar.d;
        nwh nwhVar = this.t;
        ArrayList arrayList = (ArrayList) nwhVar.c;
        vq1.v(i >= 0 && i <= i2 && i2 <= arrayList.size() && i3 >= 0);
        nwhVar.k = ueqVar;
        if (i == i2 || i == i3) {
            g = nwhVar.g();
        } else {
            int min = Math.min(i, i3);
            int max = Math.max(((i2 - i) + i3) - 1, i2 - 1);
            int i4 = ((mwh) arrayList.get(min)).d;
            dvt.X(i, i2, i3, arrayList);
            while (min <= max) {
                mwh mwhVar = (mwh) arrayList.get(min);
                mwhVar.d = i4;
                i4 += mwhVar.a.o.e.o();
                min++;
            }
            g = nwhVar.g();
        }
        u(g, false);
    }

    public final void H() {
        this.D.e(1);
        M(false, false, false, true);
        this.f.j(this.w);
        i0(this.C.a.p() ? 4 : 2);
        rzk rzkVar = this.C;
        boolean z = rzkVar.l;
        t0(this.A.c(rzkVar.e, z), rzkVar.n, rzkVar.m, z);
        t6t c = this.g.c();
        nwh nwhVar = this.t;
        ArrayList arrayList = (ArrayList) nwhVar.c;
        vq1.A(!nwhVar.a);
        nwhVar.l = c;
        for (int i = 0; i < arrayList.size(); i++) {
            mwh mwhVar = (mwh) arrayList.get(i);
            nwhVar.t(mwhVar);
            ((HashSet) nwhVar.h).add(mwhVar);
        }
        nwhVar.a = true;
        this.h.g(2);
    }

    public final void I() {
        xs7 xs7Var;
        try {
            M(true, false, true, false);
            J();
            this.f.h(this.w);
            rw1 rw1Var = this.A;
            rw1Var.c = null;
            rw1Var.a();
            rw1Var.b(0);
            ct7 ct7Var = this.d;
            ct7Var.getClass();
            if (dvt.a >= 32 && (xs7Var = ct7Var.h) != null) {
                xs7Var.d();
            }
            ct7Var.a = null;
            ct7Var.b = null;
            i0(1);
            this.i.C();
            synchronized (this) {
                this.E = true;
                notifyAll();
            }
        } catch (Throwable th) {
            this.i.C();
            synchronized (this) {
                this.E = true;
                notifyAll();
                throw th;
            }
        }
    }

    public final void J() {
        for (int i = 0; i < this.a.length; i++) {
            at2 at2Var = this.b[i];
            synchronized (at2Var.a) {
                at2Var.q = null;
            }
            ixn ixnVar = this.a[i];
            at2 at2Var2 = (at2) ixnVar.e;
            vq1.A(at2Var2.h == 0);
            at2Var2.x();
            ixnVar.a = false;
            at2 at2Var3 = (at2) ixnVar.f;
            if (at2Var3 != null) {
                vq1.A(at2Var3.h == 0);
                at2Var3.x();
                ixnVar.b = false;
            }
        }
    }

    public final void K(int i, int i2, ueq ueqVar) {
        this.D.e(1);
        nwh nwhVar = this.t;
        nwhVar.getClass();
        vq1.v(i >= 0 && i <= i2 && i2 <= ((ArrayList) nwhVar.c).size());
        nwhVar.k = ueqVar;
        nwhVar.v(i, i2);
        u(nwhVar.g(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L() {
        int i;
        int i2;
        float f = this.o.m().a;
        zoh zohVar = this.s;
        xoh xohVar = zohVar.i;
        xoh xohVar2 = zohVar.j;
        c1t c1tVar = null;
        xoh xohVar3 = xohVar;
        boolean z = true;
        while (xohVar3 != null && xohVar3.e) {
            rzk rzkVar = this.C;
            c1t j = xohVar3.j(f, rzkVar.a, rzkVar.l);
            c1t c1tVar2 = xohVar3 == this.s.i ? j : c1tVar;
            c1t c1tVar3 = xohVar3.o;
            zsb[] zsbVarArr = (zsb[]) j.d;
            if (c1tVar3 != null && ((zsb[]) c1tVar3.d).length == zsbVarArr.length) {
                for (int i3 = 0; i3 < zsbVarArr.length; i3++) {
                    if (j.q(c1tVar3, i3)) {
                    }
                }
                if (xohVar3 == xohVar2) {
                    z = false;
                }
                xohVar3 = xohVar3.m;
                c1tVar = c1tVar2;
            }
            zoh zohVar2 = this.s;
            if (z) {
                xoh xohVar4 = zohVar2.i;
                boolean z2 = (zohVar2.o(xohVar4) & 1) != 0;
                boolean[] zArr = new boolean[this.a.length];
                c1tVar2.getClass();
                long a = xohVar4.a(c1tVar2, this.C.s, z2, zArr);
                rzk rzkVar2 = this.C;
                boolean z3 = (rzkVar2.e == 4 || a == rzkVar2.s) ? false : true;
                rzk rzkVar3 = this.C;
                i = 4;
                this.C = x(rzkVar3.b, a, rzkVar3.c, rzkVar3.d, z3, 5);
                if (z3) {
                    O(a);
                }
                f();
                boolean[] zArr2 = new boolean[this.a.length];
                int i4 = 0;
                while (true) {
                    ixn[] ixnVarArr = this.a;
                    if (i4 >= ixnVarArr.length) {
                        break;
                    }
                    int c = ixnVarArr[i4].c();
                    zArr2[i4] = this.a[i4].g();
                    ixn ixnVar = this.a[i4];
                    aoo aooVar = xohVar4.c[i4];
                    go7 go7Var = this.o;
                    long j2 = this.x0;
                    boolean z4 = zArr[i4];
                    at2 at2Var = (at2) ixnVar.e;
                    if (ixn.h(at2Var)) {
                        if (aooVar != at2Var.i) {
                            ixnVar.a(at2Var, go7Var);
                        } else if (z4) {
                            at2Var.n = false;
                            at2Var.l = j2;
                            at2Var.m = j2;
                            at2Var.w(j2, false);
                        }
                    }
                    at2 at2Var2 = (at2) ixnVar.f;
                    if (at2Var2 != null && ixn.h(at2Var2)) {
                        if (aooVar != at2Var2.i) {
                            ixnVar.a(at2Var2, go7Var);
                        } else if (z4) {
                            at2Var2.n = false;
                            at2Var2.l = j2;
                            at2Var2.m = j2;
                            at2Var2.w(j2, false);
                        }
                    }
                    if (c - this.a[i4].c() > 0) {
                        E(i4, false);
                    }
                    this.v0 -= c - this.a[i4].c();
                    i4++;
                }
                k(zArr2, this.x0);
                xohVar4.h = true;
            } else {
                i = 4;
                zohVar2.o(xohVar3);
                if (xohVar3.e) {
                    long max = Math.max(xohVar3.g.b, this.x0 - xohVar3.p);
                    if (this.z && d() && this.s.k == xohVar3) {
                        f();
                    }
                    i2 = 4;
                    xohVar3.a(j, max, false, new boolean[xohVar3.j.length]);
                    t(true);
                    if (this.C.e == i2) {
                        A();
                        u0();
                        this.h.g(2);
                        return;
                    }
                    return;
                }
            }
            i2 = i;
            t(true);
            if (this.C.e == i2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        long j2;
        long j3;
        boolean z5;
        sis sisVar;
        sis sisVar2;
        uvh uvhVar;
        List list;
        this.h.f(2);
        this.B0 = null;
        w0(false, true);
        go7 go7Var = this.o;
        go7Var.f = false;
        lrh lrhVar = go7Var.a;
        if (lrhVar.a) {
            lrhVar.a(lrhVar.t());
            lrhVar.a = false;
        }
        this.x0 = 1000000000000L;
        for (int i = 0; i < this.a.length; i++) {
            try {
                h(i);
            } catch (RuntimeException e) {
                e = e;
                vq1.L("ExoPlayerImplInternal", "Disable failed.", e);
                if (z) {
                }
                this.v0 = 0;
                rzk rzkVar = this.C;
                uvh uvhVar2 = rzkVar.b;
                long j4 = rzkVar.s;
                if (!this.C.b.b()) {
                }
                j = this.C.c;
                if (z2) {
                }
                this.s.b();
                this.J = false;
                sisVar = this.C.a;
                if (z3) {
                }
                sisVar2 = sisVar;
                uvhVar = uvhVar2;
                rzk rzkVar2 = this.C;
                int i2 = rzkVar2.e;
                if (z4) {
                }
                yvs yvsVar = z5 ? yvs.d : rzkVar2.h;
                c1t c1tVar = z5 ? this.e : rzkVar2.i;
                if (z5) {
                }
                this.C = new rzk(sisVar2, uvhVar, j3, j2, i2, r14, false, yvsVar, c1tVar, list, uvhVar, rzkVar2.l, rzkVar2.m, rzkVar2.n, rzkVar2.o, j2, 0L, j2, 0L, false);
                if (z3) {
                }
            } catch (pqb e2) {
                e = e2;
                vq1.L("ExoPlayerImplInternal", "Disable failed.", e);
                if (z) {
                }
                this.v0 = 0;
                rzk rzkVar3 = this.C;
                uvh uvhVar22 = rzkVar3.b;
                long j42 = rzkVar3.s;
                if (!this.C.b.b()) {
                }
                j = this.C.c;
                if (z2) {
                }
                this.s.b();
                this.J = false;
                sisVar = this.C.a;
                if (z3) {
                }
                sisVar2 = sisVar;
                uvhVar = uvhVar22;
                rzk rzkVar22 = this.C;
                int i22 = rzkVar22.e;
                if (z4) {
                }
                yvs yvsVar2 = z5 ? yvs.d : rzkVar22.h;
                c1t c1tVar2 = z5 ? this.e : rzkVar22.i;
                if (z5) {
                }
                this.C = new rzk(sisVar2, uvhVar, j3, j2, i22, r14, false, yvsVar2, c1tVar2, list, uvhVar, rzkVar22.l, rzkVar22.m, rzkVar22.n, rzkVar22.o, j2, 0L, j2, 0L, false);
                if (z3) {
                }
            }
        }
        this.F0 = -9223372036854775807L;
        if (z) {
            for (ixn ixnVar : this.a) {
                try {
                    ixnVar.l();
                } catch (RuntimeException e3) {
                    vq1.L("ExoPlayerImplInternal", "Reset failed.", e3);
                }
            }
        }
        this.v0 = 0;
        rzk rzkVar32 = this.C;
        uvh uvhVar222 = rzkVar32.b;
        long j422 = rzkVar32.s;
        if (!this.C.b.b()) {
            rzk rzkVar4 = this.C;
            ois oisVar = this.l;
            uvh uvhVar3 = rzkVar4.b;
            sis sisVar3 = rzkVar4.a;
            if (!sisVar3.p() && !sisVar3.g(uvhVar3.a, oisVar).f) {
                j = this.C.s;
                if (z2) {
                    j2 = j422;
                    j3 = j;
                    z5 = false;
                } else {
                    this.w0 = null;
                    Pair n = n(this.C.a);
                    uvhVar222 = (uvh) n.first;
                    long longValue = ((Long) n.second).longValue();
                    z5 = uvhVar222.equals(this.C.b) ? false : true;
                    j2 = longValue;
                    j3 = -9223372036854775807L;
                }
                this.s.b();
                this.J = false;
                sisVar = this.C.a;
                if (z3 || !(sisVar instanceof h1m)) {
                    sisVar2 = sisVar;
                } else {
                    h1m h1mVar = (h1m) sisVar;
                    ueq ueqVar = (ueq) this.t.k;
                    sis[] sisVarArr = h1mVar.k;
                    sis[] sisVarArr2 = new sis[sisVarArr.length];
                    for (int i3 = 0; i3 < sisVarArr.length; i3++) {
                        sisVarArr2[i3] = new g1m(sisVarArr[i3]);
                    }
                    sisVar2 = new h1m(sisVarArr2, h1mVar.l, ueqVar);
                    if (uvhVar222.b != -1) {
                        sisVar2.g(uvhVar222.a, this.l);
                        int i4 = this.l.c;
                        ris risVar = this.k;
                        sisVar2.m(i4, risVar, 0L);
                        if (risVar.a()) {
                            uvhVar = new uvh(uvhVar222.d, uvhVar222.a);
                            rzk rzkVar222 = this.C;
                            int i222 = rzkVar222.e;
                            pqb pqbVar = z4 ? null : rzkVar222.f;
                            yvs yvsVar22 = z5 ? yvs.d : rzkVar222.h;
                            c1t c1tVar22 = z5 ? this.e : rzkVar222.i;
                            if (z5) {
                                ude udeVar = yde.b;
                                list = qsn.e;
                            } else {
                                list = rzkVar222.j;
                            }
                            this.C = new rzk(sisVar2, uvhVar, j3, j2, i222, pqbVar, false, yvsVar22, c1tVar22, list, uvhVar, rzkVar222.l, rzkVar222.m, rzkVar222.n, rzkVar222.o, j2, 0L, j2, 0L, false);
                            if (z3) {
                                zoh zohVar = this.s;
                                if (!zohVar.q.isEmpty()) {
                                    ArrayList arrayList = new ArrayList();
                                    for (int i5 = 0; i5 < zohVar.q.size(); i5++) {
                                        ((xoh) zohVar.q.get(i5)).i();
                                    }
                                    zohVar.q = arrayList;
                                    zohVar.m = null;
                                    zohVar.l();
                                }
                                nwh nwhVar = this.t;
                                HashMap hashMap = (HashMap) nwhVar.f;
                                for (lwh lwhVar : hashMap.values()) {
                                    try {
                                        lwhVar.a.h(lwhVar.b);
                                    } catch (RuntimeException e4) {
                                        vq1.L("MediaSourceList", "Failed to release child source.", e4);
                                    }
                                    wvh wvhVar = lwhVar.a;
                                    kwh kwhVar = lwhVar.c;
                                    wvhVar.c(kwhVar);
                                    lwhVar.a.e(kwhVar);
                                }
                                hashMap.clear();
                                ((HashSet) nwhVar.h).clear();
                                nwhVar.a = false;
                                return;
                            }
                            return;
                        }
                    }
                }
                uvhVar = uvhVar222;
                rzk rzkVar2222 = this.C;
                int i2222 = rzkVar2222.e;
                if (z4) {
                }
                yvs yvsVar222 = z5 ? yvs.d : rzkVar2222.h;
                c1t c1tVar222 = z5 ? this.e : rzkVar2222.i;
                if (z5) {
                }
                this.C = new rzk(sisVar2, uvhVar, j3, j2, i2222, pqbVar, false, yvsVar222, c1tVar222, list, uvhVar, rzkVar2222.l, rzkVar2222.m, rzkVar2222.n, rzkVar2222.o, j2, 0L, j2, 0L, false);
                if (z3) {
                }
            }
        }
        j = this.C.c;
        if (z2) {
        }
        this.s.b();
        this.J = false;
        sisVar = this.C.a;
        if (z3) {
        }
        sisVar2 = sisVar;
        uvhVar = uvhVar222;
        rzk rzkVar22222 = this.C;
        int i22222 = rzkVar22222.e;
        if (z4) {
        }
        yvs yvsVar2222 = z5 ? yvs.d : rzkVar22222.h;
        c1t c1tVar2222 = z5 ? this.e : rzkVar22222.i;
        if (z5) {
        }
        this.C = new rzk(sisVar2, uvhVar, j3, j2, i22222, pqbVar, false, yvsVar2222, c1tVar2222, list, uvhVar, rzkVar22222.l, rzkVar22222.m, rzkVar22222.n, rzkVar22222.o, j2, 0L, j2, 0L, false);
        if (z3) {
        }
    }

    public final void N() {
        xoh xohVar = this.s.i;
        this.G = xohVar != null && xohVar.g.i && this.F;
    }

    public final void O(long j) {
        xoh xohVar = this.s.i;
        long j2 = j + (xohVar == null ? 1000000000000L : xohVar.p);
        this.x0 = j2;
        this.o.a.a(j2);
        for (ixn ixnVar : this.a) {
            long j3 = this.x0;
            at2 d = ixnVar.d(xohVar);
            if (d != null) {
                d.n = false;
                d.l = j3;
                d.m = j3;
                d.w(j3, false);
            }
        }
        for (xoh xohVar2 = r0.i; xohVar2 != null; xohVar2 = xohVar2.m) {
            for (zsb zsbVar : (zsb[]) xohVar2.o.d) {
                if (zsbVar != null) {
                    zsbVar.k();
                }
            }
        }
    }

    public final void P(sis sisVar, sis sisVar2) {
        if (sisVar.p() && sisVar2.p()) {
            return;
        }
        ArrayList arrayList = this.p;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            eta.q(arrayList.get(size));
            throw null;
        }
    }

    public final void S(long j) {
        this.h.a.sendEmptyMessageAtTime(2, j + ((this.C.e != 3 || l0()) ? I0 : 1000L));
    }

    public final void T(boolean z) {
        uvh uvhVar = this.s.i.g.a;
        long V = V(uvhVar, this.C.s, true, false);
        if (V != this.C.s) {
            rzk rzkVar = this.C;
            this.C = x(uvhVar, V, rzkVar.c, rzkVar.d, z, 5);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:20|(7:(9:64|65|(1:83)(1:71)|72|(1:82)|79|80|11|12)(1:22)|42|43|44|10|11|12)|23|24|(1:26)(1:60)|27|(1:29)(1:59)|30|31|32|(1:34)(1:57)|35|36|37|38|39|40|41) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0151, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0152, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0153, code lost:
    
        r5 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0155, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0157, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0158, code lost:
    
        r5 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a1 A[Catch: all -> 0x00a4, TRY_LEAVE, TryCatch #1 {all -> 0x00a4, blocks: (B:6:0x0097, B:8:0x00a1, B:16:0x00af, B:18:0x00b3, B:19:0x00b6, B:20:0x00be, B:67:0x00cc, B:71:0x00d4), top: B:5:0x0097 }] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, woh] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(esb esbVar) {
        long longValue;
        uvh q;
        long j;
        boolean z;
        long j2;
        boolean z2;
        uvh uvhVar;
        long j3;
        long c;
        long j4;
        rzk rzkVar;
        int i;
        long j5;
        uvh uvhVar2;
        int i2;
        long j6;
        long V;
        rzk rzkVar2;
        uvh uvhVar3;
        sis sisVar;
        long j7;
        fsb fsbVar = this;
        fsbVar.D.e(1);
        Pair Q = Q(fsbVar.C.a, esbVar, true, fsbVar.K, fsbVar.L, fsbVar.k, fsbVar.l);
        try {
            if (Q == null) {
                Pair n = fsbVar.n(fsbVar.C.a);
                q = (uvh) n.first;
                longValue = ((Long) n.second).longValue();
                z = !fsbVar.C.a.p();
                j2 = -9223372036854775807L;
            } else {
                Object obj = Q.first;
                longValue = ((Long) Q.second).longValue();
                long j8 = esbVar.c == -9223372036854775807L ? -9223372036854775807L : longValue;
                q = fsbVar.s.q(fsbVar.C.a, obj, longValue);
                if (!q.b()) {
                    j = 0;
                    z = esbVar.c == -9223372036854775807L;
                    j2 = j8;
                    if (fsbVar.C.a.p()) {
                        rzk rzkVar3 = fsbVar.C;
                        if (Q == null) {
                            if (rzkVar3.e != 1) {
                                fsbVar.i0(4);
                            }
                            fsbVar.M(false, true, false, true);
                        } else {
                            try {
                                if (q.equals(rzkVar3.b)) {
                                    try {
                                        xoh xohVar = fsbVar.s.i;
                                        c = (xohVar == null || !xohVar.e || longValue == j) ? longValue : xohVar.a.c(longValue, fsbVar.B);
                                        if (dvt.m0(c) != dvt.m0(fsbVar.C.s) || ((i = (rzkVar = fsbVar.C).e) != 2 && i != 3)) {
                                            z2 = z;
                                            j4 = j2;
                                            uvhVar = q;
                                        }
                                        j5 = rzkVar.s;
                                        z2 = z;
                                        uvhVar2 = q;
                                        i2 = 2;
                                        j6 = j5;
                                        fsbVar.C = fsbVar.x(uvhVar2, j5, j2, j6, z2, i2);
                                        return;
                                    } catch (Throwable th) {
                                        th = th;
                                        z2 = z;
                                        uvhVar = q;
                                        j3 = longValue;
                                        fsbVar.C = fsbVar.x(uvhVar, j3, j2, j3, z2, 2);
                                        throw th;
                                    }
                                }
                                z2 = z;
                                j4 = j2;
                                uvhVar = q;
                                c = longValue;
                                fsbVar.v0(sisVar, uvhVar3, sisVar, rzkVar2.b, j7, true);
                                uvhVar2 = uvhVar3;
                                j2 = j7;
                                j5 = V;
                                i2 = 2;
                                j6 = j5;
                                fsbVar = this;
                                fsbVar.C = fsbVar.x(uvhVar2, j5, j2, j6, z2, i2);
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                uvhVar = uvhVar3;
                                j2 = j7;
                                j3 = V;
                                fsbVar.C = fsbVar.x(uvhVar, j3, j2, j3, z2, 2);
                                throw th;
                            }
                            boolean z3 = fsbVar.C.e == 4;
                            zoh zohVar = fsbVar.s;
                            V = fsbVar.V(uvhVar, c, zohVar.i != zohVar.j, z3);
                            z2 |= longValue != V;
                            rzkVar2 = fsbVar.C;
                            uvhVar3 = uvhVar;
                            sisVar = rzkVar2.a;
                            j7 = j4;
                        }
                    } else {
                        fsbVar.w0 = esbVar;
                    }
                    z2 = z;
                    uvhVar2 = q;
                    j5 = longValue;
                    i2 = 2;
                    j6 = j5;
                    fsbVar = this;
                    fsbVar.C = fsbVar.x(uvhVar2, j5, j2, j6, z2, i2);
                    return;
                }
                fsbVar.C.a.g(q.a, fsbVar.l);
                longValue = fsbVar.l.f(q.b) == q.c ? fsbVar.l.g.b : 0L;
                z = true;
                j2 = j8;
            }
            if (fsbVar.C.a.p()) {
            }
            z2 = z;
            uvhVar2 = q;
            j5 = longValue;
            i2 = 2;
            j6 = j5;
            fsbVar = this;
            fsbVar.C = fsbVar.x(uvhVar2, j5, j2, j6, z2, i2);
            return;
        } catch (Throwable th3) {
            th = th3;
            z2 = z;
        }
        j = 0;
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, woh] */
    public final long V(uvh uvhVar, long j, boolean z, boolean z2) {
        ixn[] ixnVarArr;
        p0();
        w0(false, true);
        if (z2 || this.C.e == 3) {
            i0(2);
        }
        zoh zohVar = this.s;
        xoh xohVar = zohVar.i;
        xoh xohVar2 = xohVar;
        while (xohVar2 != null && !uvhVar.equals(xohVar2.g.a)) {
            xohVar2 = xohVar2.m;
        }
        if (z || xohVar != xohVar2 || (xohVar2 != null && xohVar2.p + j < 0)) {
            int i = 0;
            while (true) {
                ixnVarArr = this.a;
                if (i >= ixnVarArr.length) {
                    break;
                }
                h(i);
                i++;
            }
            this.F0 = -9223372036854775807L;
            if (xohVar2 != null) {
                while (zohVar.i != xohVar2) {
                    zohVar.a();
                }
                zohVar.o(xohVar2);
                xohVar2.p = 1000000000000L;
                k(new boolean[ixnVarArr.length], zohVar.j.e());
                xohVar2.h = true;
            }
        }
        f();
        if (xohVar2 != null) {
            ?? r10 = xohVar2.a;
            zohVar.o(xohVar2);
            if (!xohVar2.e) {
                xohVar2.g = xohVar2.g.b(j);
            } else if (xohVar2.f) {
                j = r10.h(j);
                r10.s(j - this.m, this.n);
            }
            O(j);
            A();
        } else {
            zohVar.b();
            O(j);
        }
        t(false);
        this.h.g(2);
        return j;
    }

    public final void W(pgl pglVar) {
        pglVar.getClass();
        hzr hzrVar = this.h;
        if (pglVar.e != this.j) {
            hzrVar.c(15, pglVar).b();
            return;
        }
        synchronized (pglVar) {
        }
        try {
            pglVar.a.a(pglVar.c, pglVar.d);
            pglVar.a(true);
            int i = this.C.e;
            if (i == 3 || i == 2) {
                hzrVar.g(2);
            }
        } catch (Throwable th) {
            pglVar.a(true);
            throw th;
        }
    }

    public final void X(pgl pglVar) {
        Looper looper = pglVar.e;
        if (looper.getThread().isAlive()) {
            this.q.a(looper, null).e(new sr7(13, this, pglVar));
        } else {
            vq1.n0("TAG", "Trying to send message on a dead thread.");
            pglVar.a(false);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        if (r7.a == 1) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(dv1 dv1Var, boolean z) {
        int i;
        ct7 ct7Var = this.d;
        if (!ct7Var.i.equals(dv1Var)) {
            ct7Var.i = dv1Var;
            ct7Var.e();
        }
        if (!z) {
            dv1Var = null;
        }
        rw1 rw1Var = this.A;
        if (!Objects.equals(rw1Var.d, dv1Var)) {
            rw1Var.d = dv1Var;
            if (dv1Var != null) {
                int i2 = dv1Var.c;
                i = 3;
                switch (i2) {
                    case 0:
                        vq1.n0("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                        i = 1;
                        break;
                    case 1:
                    case 14:
                        i = 1;
                        break;
                    case 2:
                    case 4:
                        i = 2;
                        break;
                    case 3:
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 13:
                        break;
                    case 11:
                        break;
                    case 15:
                    default:
                        dfi.o(i2, "Unidentified audio usage: ", "AudioFocusManager");
                        break;
                    case 16:
                        i = 4;
                        break;
                }
                rw1Var.f = i;
                vq1.u("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i != 1 || i == 0);
            }
            i = 0;
            rw1Var.f = i;
            vq1.u("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i != 1 || i == 0);
        }
        rzk rzkVar = this.C;
        boolean z2 = rzkVar.l;
        t0(rw1Var.c(rzkVar.e, z2), rzkVar.n, rzkVar.m, z2);
    }

    public final void Z(boolean z, AtomicBoolean atomicBoolean) {
        if (this.X != z) {
            this.X = z;
            if (!z) {
                for (ixn ixnVar : this.a) {
                    ixnVar.l();
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    @Override // defpackage.z0t
    public final void a() {
        this.h.g(10);
    }

    public final void a0(asb asbVar) {
        this.D.e(1);
        int i = asbVar.c;
        ueq ueqVar = asbVar.b;
        ArrayList arrayList = asbVar.a;
        if (i != -1) {
            this.w0 = new esb(new h1m(arrayList, ueqVar), asbVar.c, asbVar.d);
        }
        nwh nwhVar = this.t;
        ArrayList arrayList2 = (ArrayList) nwhVar.c;
        nwhVar.v(0, arrayList2.size());
        u(nwhVar.a(arrayList2.size(), arrayList, ueqVar), false);
    }

    @Override // defpackage.zgp
    public final void b(ahp ahpVar) {
        this.h.c(9, (woh) ahpVar).b();
    }

    public final void b0(boolean z) {
        this.F = z;
        N();
        if (this.G) {
            zoh zohVar = this.s;
            if (zohVar.j != zohVar.i) {
                T(true);
                t(false);
            }
        }
    }

    public final void c(asb asbVar, int i) {
        this.D.e(1);
        nwh nwhVar = this.t;
        if (i == -1) {
            i = ((ArrayList) nwhVar.c).size();
        }
        u(nwhVar.a(i, asbVar.a, asbVar.b), false);
    }

    public final void c0(p0l p0lVar) {
        this.h.f(16);
        go7 go7Var = this.o;
        go7Var.r(p0lVar);
        p0l m = go7Var.m();
        w(m, m.a, true, true);
    }

    public final boolean d() {
        if (!this.z) {
            return false;
        }
        for (ixn ixnVar : this.a) {
            if (ixnVar.f()) {
                return true;
            }
        }
        return false;
    }

    public final void d0(rqb rqbVar) {
        this.E0 = rqbVar;
        sis sisVar = this.C.a;
        zoh zohVar = this.s;
        zohVar.getClass();
        rqbVar.getClass();
        if (zohVar.q.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < zohVar.q.size(); i++) {
            ((xoh) zohVar.q.get(i)).i();
        }
        zohVar.q = arrayList;
        zohVar.m = null;
        zohVar.l();
    }

    public final void e() {
        L();
        T(true);
    }

    public final void e0(int i) {
        this.K = i;
        sis sisVar = this.C.a;
        zoh zohVar = this.s;
        zohVar.g = i;
        int s = zohVar.s(sisVar);
        if ((s & 1) != 0) {
            T(true);
        } else if ((s & 2) != 0) {
            f();
        }
        t(false);
    }

    public final void f() {
        at2 at2Var;
        if (this.z && d()) {
            for (ixn ixnVar : this.a) {
                int c = ixnVar.c();
                if (ixnVar.f()) {
                    int i = ixnVar.d;
                    boolean z = i == 4 || i == 2;
                    int i2 = i != 4 ? 0 : 1;
                    if (z) {
                        at2Var = (at2) ixnVar.e;
                    } else {
                        at2Var = (at2) ixnVar.f;
                        at2Var.getClass();
                    }
                    ixnVar.a(at2Var, this.o);
                    ixnVar.j(z);
                    ixnVar.d = i2;
                }
                this.v0 -= c - ixnVar.c();
            }
            this.F0 = -9223372036854775807L;
        }
    }

    public final void f0(hap hapVar) {
        this.B = hapVar;
    }

    @Override // defpackage.voh
    public final void g(woh wohVar) {
        this.h.c(8, wohVar).b();
    }

    public final void g0(boolean z) {
        this.L = z;
        sis sisVar = this.C.a;
        zoh zohVar = this.s;
        zohVar.h = z;
        int s = zohVar.s(sisVar);
        if ((s & 1) != 0) {
            T(true);
        } else if ((s & 2) != 0) {
            f();
        }
        t(false);
    }

    public final void h(int i) {
        ixn[] ixnVarArr = this.a;
        int c = ixnVarArr[i].c();
        ixn ixnVar = ixnVarArr[i];
        at2 at2Var = (at2) ixnVar.e;
        go7 go7Var = this.o;
        ixnVar.a(at2Var, go7Var);
        at2 at2Var2 = (at2) ixnVar.f;
        if (at2Var2 != null) {
            boolean z = (at2Var2.h == 0 || ixnVar.d == 3) ? false : true;
            ixnVar.a(at2Var2, go7Var);
            ixnVar.j(false);
            if (z) {
                at2 at2Var3 = (at2) ixnVar.e;
                at2Var2.getClass();
                at2Var2.a(17, at2Var3);
            }
        }
        ixnVar.d = 0;
        E(i, false);
        this.v0 -= c;
    }

    public final void h0(ueq ueqVar) {
        this.D.e(1);
        nwh nwhVar = this.t;
        int size = ((ArrayList) nwhVar.c).size();
        if (ueqVar.b.length != size) {
            ueqVar = new ueq(new Random(ueqVar.a.nextLong())).a(0, size);
        }
        nwhVar.k = ueqVar;
        u(nwhVar.g(), false);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i;
        int i2;
        xoh xohVar;
        xoh xohVar2;
        xoh xohVar3;
        try {
            switch (message.what) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i3 = message.arg2;
                    this.D.e(1);
                    t0(this.A.c(this.C.e, z), i3 >> 4, i3 & 15, z);
                    break;
                case 2:
                    i();
                    break;
                case 3:
                    U((esb) message.obj);
                    break;
                case 4:
                    c0((p0l) message.obj);
                    break;
                case 5:
                    f0((hap) message.obj);
                    break;
                case 6:
                    o0(false, true);
                    break;
                case 7:
                    I();
                    return true;
                case 8:
                    v((woh) message.obj);
                    break;
                case 9:
                    r((woh) message.obj);
                    break;
                case 10:
                    L();
                    break;
                case 11:
                    e0(message.arg1);
                    break;
                case 12:
                    g0(message.arg1 != 0);
                    break;
                case 13:
                    Z(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    W((pgl) message.obj);
                    break;
                case 15:
                    X((pgl) message.obj);
                    break;
                case 16:
                    p0l p0lVar = (p0l) message.obj;
                    w(p0lVar, p0lVar.a, true, false);
                    break;
                case 17:
                    a0((asb) message.obj);
                    break;
                case 18:
                    c((asb) message.obj, message.arg1);
                    break;
                case 19:
                    G((bsb) message.obj);
                    break;
                case 20:
                    K(message.arg1, message.arg2, (ueq) message.obj);
                    break;
                case 21:
                    h0((ueq) message.obj);
                    break;
                case 22:
                    F();
                    break;
                case 23:
                    b0(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    e();
                    break;
                case 26:
                    L();
                    T(true);
                    break;
                case 27:
                    s0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                    d0((rqb) message.obj);
                    break;
                case 29:
                    H();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    j0(pair.first, (AtomicBoolean) pair.second);
                    break;
                case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                    Y((dv1) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    k0(((Float) message.obj).floatValue());
                    break;
                case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                    p(message.arg1);
                    break;
                case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                    q();
                    break;
            }
        } catch (hb7 e) {
            s(e.a, e);
        } catch (RuntimeException e2) {
            pqb pqbVar = new pqb(2, e2, ((e2 instanceof IllegalStateException) || (e2 instanceof IllegalArgumentException)) ? 1004 : 1000);
            vq1.L("ExoPlayerImplInternal", "Playback error", pqbVar);
            o0(true, false);
            this.C = this.C.f(pqbVar);
        } catch (pqb e3) {
            e = e3;
            int i4 = e.j;
            ixn[] ixnVarArr = this.a;
            zoh zohVar = this.s;
            if (i4 == 1 && (xohVar2 = zohVar.j) != null) {
                int length = ixnVarArr.length;
                int i5 = e.l;
                e = e.b(((!ixnVarArr[i5 % length].i(i5) || (xohVar3 = xohVar2.m) == null) ? xohVar2.g : xohVar3.g).a);
            }
            int i6 = e.j;
            hzr hzrVar = this.h;
            if (i6 == 1) {
                int i7 = e.l;
                if (ixnVarArr[i7 % ixnVarArr.length].i(i7)) {
                    this.G0 = true;
                    f();
                    xoh h = zohVar.h();
                    xoh xohVar4 = zohVar.i;
                    if (xohVar4 != h) {
                        while (xohVar4 != null) {
                            xoh xohVar5 = xohVar4.m;
                            if (xohVar5 == h) {
                                break;
                            }
                            xohVar4 = xohVar5;
                        }
                    }
                    zohVar.o(xohVar4);
                    if (this.C.e != 4) {
                        A();
                        hzrVar.g(2);
                    }
                }
            }
            pqb pqbVar2 = this.B0;
            if (pqbVar2 != null) {
                pqbVar2.addSuppressed(e);
                e = this.B0;
            }
            if (e.j == 1 && zohVar.i != zohVar.j) {
                while (true) {
                    xohVar = zohVar.i;
                    if (xohVar == zohVar.j) {
                        break;
                    }
                    zohVar.a();
                }
                vq1.x(xohVar);
                C();
                yoh yohVar = xohVar.g;
                uvh uvhVar = yohVar.a;
                long j = yohVar.b;
                this.C = x(uvhVar, j, yohVar.c, j, true, 0);
            }
            if (e.p && (this.B0 == null || (i2 = e.a) == 5004 || i2 == 5003)) {
                vq1.o0("ExoPlayerImplInternal", "Recoverable renderer error", e);
                if (this.B0 == null) {
                    this.B0 = e;
                }
                gzr c = hzrVar.c(25, e);
                Handler handler = hzrVar.a;
                Message message2 = c.a;
                message2.getClass();
                handler.sendMessageAtFrontOfQueue(message2);
                c.a();
            } else {
                vq1.L("ExoPlayerImplInternal", "Playback error", e);
                o0(true, false);
                this.C = this.C.f(e);
            }
        } catch (r7k e4) {
            boolean z2 = e4.a;
            int i8 = e4.b;
            if (i8 == 1) {
                i = z2 ? 3001 : 3003;
            } else {
                if (i8 == 4) {
                    i = z2 ? 3002 : 3004;
                }
                s(r3, e4);
            }
            r3 = i;
            s(r3, e4);
        } catch (yqa e5) {
            s(e5.a, e5);
        } catch (yy2 e6) {
            s(1002, e6);
        } catch (IOException e7) {
            s(2000, e7);
        }
        C();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x0394, code lost:
    
        if (defpackage.ixn.h(r7) == false) goto L207;
     */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0695 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x08ab  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0919  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0912  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0874  */
    /* JADX WARN: Type inference failed for: r1v72, types: [java.lang.Object, woh] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, woh] */
    /* JADX WARN: Type inference failed for: r2v77, types: [java.lang.Object, woh] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, woh] */
    /* JADX WARN: Type inference failed for: r4v45, types: [java.lang.Object, woh] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        int i;
        long j;
        long j2;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean l;
        boolean z2;
        rzk rzkVar;
        boolean z3;
        int i6;
        boolean z4;
        yoh d;
        xoh xohVar;
        int i7;
        xoh xohVar2;
        ixn[] ixnVarArr;
        zoh zohVar;
        boolean z5;
        xoh xohVar3;
        xoh xohVar4;
        xoh a;
        boolean z6;
        int i8;
        int i9;
        ixn[] ixnVarArr2;
        int i10;
        boolean z7;
        boolean z8;
        long j3;
        int i11;
        xoh xohVar5;
        xoh xohVar6;
        int i12;
        this.q.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        this.h.f(2);
        long j4 = -9223372036854775807L;
        if (this.C.a.p() || !this.t.a) {
            i = 1;
            j = uptimeMillis;
            j2 = -9223372036854775807L;
            i2 = 3;
            i3 = 4;
        } else {
            this.s.n(this.x0);
            zoh zohVar2 = this.s;
            xoh xohVar7 = zohVar2.l;
            if (xohVar7 == null || (!xohVar7.g.j && xohVar7.g() && zohVar2.l.g.e != -9223372036854775807L && zohVar2.n < 100)) {
                zoh zohVar3 = this.s;
                long j5 = this.x0;
                rzk rzkVar2 = this.C;
                xoh xohVar8 = zohVar3.l;
                if (xohVar8 == null) {
                    j = uptimeMillis;
                    d = zohVar3.e(rzkVar2.a, rzkVar2.b, rzkVar2.c, rzkVar2.s);
                } else {
                    j = uptimeMillis;
                    d = zohVar3.d(rzkVar2.a, xohVar8, j5);
                }
                if (d != null) {
                    zoh zohVar4 = this.s;
                    xoh xohVar9 = zohVar4.l;
                    long j6 = xohVar9 == null ? 1000000000000L : (xohVar9.p + xohVar9.g.e) - d.b;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= zohVar4.q.size()) {
                            xohVar = null;
                            break;
                        }
                        yoh yohVar = ((xoh) zohVar4.q.get(i13)).g;
                        long j7 = yohVar.e;
                        long j8 = d.e;
                        if ((j7 == -9223372036854775807L || j7 == j8) && yohVar.b == d.b && yohVar.a.equals(d.a)) {
                            xohVar = (xoh) zohVar4.q.remove(i13);
                            break;
                        }
                        i13++;
                    }
                    if (xohVar == null) {
                        fsb fsbVar = (fsb) zohVar4.e.b;
                        at2[] at2VarArr = fsbVar.b;
                        ct7 ct7Var = fsbVar.d;
                        zi7 d2 = fsbVar.f.d();
                        nwh nwhVar = fsbVar.t;
                        c1t c1tVar = fsbVar.e;
                        fsbVar.E0.getClass();
                        xohVar = new xoh(at2VarArr, j6, ct7Var, d2, nwhVar, d, c1tVar);
                    } else {
                        xohVar.g = d;
                        xohVar.p = j6;
                    }
                    xoh xohVar10 = zohVar4.l;
                    if (xohVar10 == null) {
                        zohVar4.i = xohVar;
                        zohVar4.j = xohVar;
                        zohVar4.k = xohVar;
                    } else if (xohVar != xohVar10.m) {
                        xohVar10.b();
                        xohVar10.m = xohVar;
                        xohVar10.c();
                    }
                    zohVar4.o = null;
                    zohVar4.l = xohVar;
                    zohVar4.n++;
                    zohVar4.m();
                    if (!xohVar.d) {
                        long j9 = d.b;
                        xohVar.d = true;
                        xohVar.a.l(this, j9);
                    } else if (xohVar.e) {
                        this.h.c(8, xohVar.a).b();
                    }
                    if (this.s.i == xohVar) {
                        O(d.b);
                    }
                    t(false);
                }
            } else {
                j = uptimeMillis;
            }
            if (this.J) {
                this.J = y(this.s.l);
                q0();
            } else {
                A();
            }
            zoh zohVar5 = this.s;
            if (!this.G && this.z && !this.G0 && !d() && (xohVar5 = zohVar5.k) != null && xohVar5 == zohVar5.j && (xohVar6 = xohVar5.m) != null && xohVar6.e) {
                zohVar5.k = xohVar6;
                zohVar5.m();
                vq1.B(zohVar5.k);
                ixn[] ixnVarArr3 = this.a;
                xoh xohVar11 = zohVar5.k;
                if (xohVar11 != null) {
                    c1t c1tVar2 = xohVar11.o;
                    for (int i14 = 0; i14 < ixnVarArr3.length; i14++) {
                        if (c1tVar2.r(i14)) {
                            ixn ixnVar = ixnVarArr3[i14];
                            if (((at2) ixnVar.f) != null && !ixnVar.f()) {
                                ixn ixnVar2 = ixnVarArr3[i14];
                                vq1.A(!ixnVar2.f());
                                if (ixn.h((at2) ixnVar2.e)) {
                                    i12 = 3;
                                } else {
                                    at2 at2Var = (at2) ixnVar2.f;
                                    i12 = (at2Var == null || at2Var.h == 0) ? 2 : 4;
                                }
                                ixnVar2.d = i12;
                                j(xohVar11, i14, false, xohVar11.e());
                            }
                        }
                    }
                    if (d()) {
                        this.F0 = xohVar11.a.i();
                        if (!xohVar11.g()) {
                            zohVar5.o(xohVar11);
                            t(false);
                            A();
                        }
                    }
                }
            }
            boolean z9 = this.z;
            ixn[] ixnVarArr4 = this.a;
            zoh zohVar6 = this.s;
            xoh xohVar12 = zohVar6.j;
            if (xohVar12 != null) {
                if (xohVar12.m == null || this.G) {
                    j2 = -9223372036854775807L;
                    i7 = 3;
                    if (xohVar12.g.j || this.G) {
                        for (ixn ixnVar3 : ixnVarArr4) {
                            if (ixnVar3.d(xohVar12) != null) {
                                at2 d3 = ixnVar3.d(xohVar12);
                                d3.getClass();
                                if (d3.l()) {
                                    long j10 = xohVar12.g.e;
                                    long j11 = (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? -9223372036854775807L : xohVar12.p + j10;
                                    at2 d4 = ixnVar3.d(xohVar12);
                                    d4.getClass();
                                    ixn.m(d4, j11);
                                }
                            }
                        }
                    }
                    zoh zohVar7 = this.s;
                    xohVar2 = zohVar7.j;
                    if (xohVar2 != null && zohVar7.i != xohVar2 && !xohVar2.h) {
                        ixnVarArr2 = this.a;
                        c1t c1tVar3 = xohVar2.o;
                        z7 = true;
                        for (i10 = 0; i10 < ixnVarArr2.length; i10++) {
                            int c = ixnVarArr2[i10].c();
                            ixn ixnVar4 = ixnVarArr2[i10];
                            go7 go7Var = this.o;
                            int k = ixnVar4.k((at2) ixnVar4.e, xohVar2, c1tVar3, go7Var);
                            int k2 = ixnVar4.k((at2) ixnVar4.f, xohVar2, c1tVar3, go7Var);
                            if (k == 1) {
                                k = k2;
                            }
                            if ((k & 2) != 0 && (z8 = this.Z) && z8) {
                                this.Z = false;
                                if (this.C.p) {
                                    this.h.g(2);
                                }
                            }
                            this.v0 -= c - ixnVarArr2[i10].c();
                            z7 &= (k & 1) != 0;
                        }
                        if (z7) {
                            for (int i15 = 0; i15 < ixnVarArr2.length; i15++) {
                                if (c1tVar3.r(i15)) {
                                    if (!(ixnVarArr2[i15].d(xohVar2) != null)) {
                                        j(xohVar2, i15, false, xohVar2.e());
                                    }
                                }
                            }
                        }
                        if (z7) {
                            zohVar7.j.h = true;
                        }
                    }
                    ixnVarArr = this.a;
                    zohVar = this.s;
                    z5 = false;
                    while (l0() && !this.G && (xohVar3 = zohVar.i) != null && (xohVar4 = xohVar3.m) != null && this.x0 >= xohVar4.e() && xohVar4.h) {
                        if (z5) {
                            C();
                        }
                        this.G0 = false;
                        a = zohVar.a();
                        a.getClass();
                        if (this.C.b.a.equals(a.g.a.a)) {
                            uvh uvhVar = this.C.b;
                            if (uvhVar.b == -1) {
                                uvh uvhVar2 = a.g.a;
                                if (uvhVar2.b == -1 && uvhVar.e != uvhVar2.e) {
                                    z6 = true;
                                    yoh yohVar2 = a.g;
                                    uvh uvhVar3 = yohVar2.a;
                                    long j12 = yohVar2.b;
                                    i8 = i7;
                                    this.C = x(uvhVar3, j12, yohVar2.c, j12, !z6, 0);
                                    N();
                                    u0();
                                    if (d() && a == zohVar.k) {
                                        for (ixn ixnVar5 : ixnVarArr) {
                                            int i16 = ixnVar5.d;
                                            if (i16 == i8 || i16 == 4) {
                                                boolean z10 = i16 == 4;
                                                at2 at2Var2 = (at2) ixnVar5.e;
                                                at2 at2Var3 = (at2) ixnVar5.f;
                                                if (z10) {
                                                    at2Var3.getClass();
                                                    at2Var3.a(17, at2Var2);
                                                } else {
                                                    at2Var3.getClass();
                                                    at2Var2.a(17, at2Var3);
                                                }
                                                ixnVar5.d = ixnVar5.d == 4 ? 0 : 1;
                                            } else if (i16 == 2) {
                                                ixnVar5.d = 0;
                                            }
                                        }
                                    }
                                    if (this.C.e == i8) {
                                        n0();
                                    }
                                    c1t c1tVar4 = zohVar.i.o;
                                    for (i9 = 0; i9 < ixnVarArr.length; i9++) {
                                        if (c1tVar4.r(i9)) {
                                            ixn ixnVar6 = ixnVarArr[i9];
                                            at2 at2Var4 = (at2) ixnVar6.f;
                                            at2 at2Var5 = (at2) ixnVar6.e;
                                            if (ixn.h(at2Var5)) {
                                                at2Var5.i();
                                            } else if (at2Var4 != null) {
                                                if (at2Var4.h != 0) {
                                                    at2Var4.i();
                                                }
                                            }
                                        }
                                    }
                                    z5 = true;
                                    i7 = i8;
                                }
                            }
                        }
                        z6 = false;
                        yoh yohVar22 = a.g;
                        uvh uvhVar32 = yohVar22.a;
                        long j122 = yohVar22.b;
                        i8 = i7;
                        this.C = x(uvhVar32, j122, yohVar22.c, j122, !z6, 0);
                        N();
                        u0();
                        if (d()) {
                            while (r6 < r1) {
                            }
                        }
                        if (this.C.e == i8) {
                        }
                        c1t c1tVar42 = zohVar.i.o;
                        while (i9 < ixnVarArr.length) {
                        }
                        z5 = true;
                        i7 = i8;
                    }
                    i2 = i7;
                    i = 1;
                    i3 = 4;
                    this.E0.getClass();
                } else if (xohVar12.e) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < ixnVarArr4.length) {
                            ixn ixnVar7 = ixnVarArr4[i17];
                            if (!ixnVar7.e(xohVar12, (at2) ixnVar7.e) || !ixnVar7.e(xohVar12, (at2) ixnVar7.f)) {
                                break;
                            } else {
                                i17++;
                            }
                        } else if (!d() || zohVar6.k != zohVar6.j) {
                            xoh xohVar13 = xohVar12.m;
                            if (xohVar13.e || this.x0 >= xohVar13.e()) {
                                c1t c1tVar5 = xohVar12.o;
                                xoh xohVar14 = zohVar6.k;
                                xoh xohVar15 = zohVar6.j;
                                if (xohVar14 == xohVar15) {
                                    vq1.B(xohVar15);
                                    zohVar6.k = xohVar15.m;
                                }
                                xoh xohVar16 = zohVar6.j;
                                vq1.B(xohVar16);
                                zohVar6.j = xohVar16.m;
                                zohVar6.m();
                                xoh xohVar17 = zohVar6.j;
                                vq1.B(xohVar17);
                                c1t c1tVar6 = xohVar17.o;
                                sis sisVar = this.C.a;
                                v0(sisVar, xohVar17.g.a, sisVar, xohVar12.g.a, -9223372036854775807L, false);
                                if (xohVar17.e && ((z9 && this.F0 != -9223372036854775807L) || xohVar17.a.i() != -9223372036854775807L)) {
                                    this.F0 = -9223372036854775807L;
                                    boolean z11 = z9 && !this.G0;
                                    if (z11) {
                                        int i18 = 0;
                                        while (true) {
                                            if (i18 >= ixnVarArr4.length) {
                                                break;
                                            }
                                            boolean r = c1tVar6.r(i18);
                                            zsb[] zsbVarArr = (zsb[]) c1tVar6.d;
                                            if (r && !l5i.a(zsbVarArr[i18].s().n, zsbVarArr[i18].s().k) && !ixnVarArr4[i18].f()) {
                                                z11 = false;
                                                break;
                                            }
                                            i18++;
                                        }
                                    }
                                    if (!z11) {
                                        long e = xohVar17.e();
                                        for (ixn ixnVar8 : ixnVarArr4) {
                                            at2 at2Var6 = (at2) ixnVar8.f;
                                            at2 at2Var7 = (at2) ixnVar8.e;
                                            if (ixn.h(at2Var7) && (i11 = ixnVar8.d) != 4 && i11 != 2) {
                                                ixn.m(at2Var7, e);
                                            }
                                            if (at2Var6 != null) {
                                                if ((at2Var6.h != 0) && ixnVar8.d != 3) {
                                                    ixn.m(at2Var6, e);
                                                }
                                            }
                                        }
                                        if (!xohVar17.g()) {
                                            zohVar6.o(xohVar17);
                                            t(false);
                                            A();
                                        }
                                    }
                                }
                                int length = ixnVarArr4.length;
                                int i19 = 0;
                                while (i19 < length) {
                                    ixn ixnVar9 = ixnVarArr4[i19];
                                    long e2 = xohVar17.e();
                                    at2 at2Var8 = (at2) ixnVar9.e;
                                    int i20 = ixnVar9.c;
                                    boolean r2 = c1tVar5.r(i20);
                                    boolean r3 = c1tVar6.r(i20);
                                    at2 at2Var9 = (at2) ixnVar9.f;
                                    if (at2Var9 != null) {
                                        int i21 = ixnVar9.d;
                                        j3 = j4;
                                        if (i21 != 3) {
                                            if (i21 == 0) {
                                            }
                                            if (r2 && !at2Var9.n) {
                                                boolean z12 = at2Var8.b != -2;
                                                gxn gxnVar = ((gxn[]) c1tVar5.c)[i20];
                                                gxn gxnVar2 = ((gxn[]) c1tVar6.c)[i20];
                                                if (r3 || !Objects.equals(gxnVar2, gxnVar) || z12 || ixnVar9.f()) {
                                                    ixn.m(at2Var9, e2);
                                                }
                                            }
                                            i19++;
                                            j4 = j3;
                                        }
                                    } else {
                                        j3 = j4;
                                    }
                                    at2Var9 = at2Var8;
                                    if (r2) {
                                        if (at2Var8.b != -2) {
                                        }
                                        gxn gxnVar3 = ((gxn[]) c1tVar5.c)[i20];
                                        gxn gxnVar22 = ((gxn[]) c1tVar6.c)[i20];
                                        if (r3) {
                                        }
                                        ixn.m(at2Var9, e2);
                                    }
                                    i19++;
                                    j4 = j3;
                                }
                            }
                        }
                    }
                }
            }
            j2 = j4;
            i7 = 3;
            zoh zohVar72 = this.s;
            xohVar2 = zohVar72.j;
            if (xohVar2 != null) {
                ixnVarArr2 = this.a;
                c1t c1tVar32 = xohVar2.o;
                z7 = true;
                while (i10 < ixnVarArr2.length) {
                }
                if (z7) {
                }
                if (z7) {
                }
            }
            ixnVarArr = this.a;
            zohVar = this.s;
            z5 = false;
            while (l0()) {
                if (z5) {
                }
                this.G0 = false;
                a = zohVar.a();
                a.getClass();
                if (this.C.b.a.equals(a.g.a.a)) {
                }
                z6 = false;
                yoh yohVar222 = a.g;
                uvh uvhVar322 = yohVar222.a;
                long j1222 = yohVar222.b;
                i8 = i7;
                this.C = x(uvhVar322, j1222, yohVar222.c, j1222, !z6, 0);
                N();
                u0();
                if (d()) {
                }
                if (this.C.e == i8) {
                }
                c1t c1tVar422 = zohVar.i.o;
                while (i9 < ixnVarArr.length) {
                }
                z5 = true;
                i7 = i8;
            }
            i2 = i7;
            i = 1;
            i3 = 4;
            this.E0.getClass();
        }
        int i22 = this.C.e;
        if (i22 == i || i22 == i3) {
            return;
        }
        xoh xohVar18 = this.s.i;
        if (xohVar18 == null) {
            S(j);
            return;
        }
        long j13 = j;
        Trace.beginSection("doSomeWork");
        u0();
        if (xohVar18.e) {
            this.q.getClass();
            this.y0 = dvt.Y(SystemClock.elapsedRealtime());
            xohVar18.a.s(this.C.s - this.m, this.n);
            i4 = i;
            i5 = i4;
            int i23 = 0;
            while (true) {
                ixn[] ixnVarArr5 = this.a;
                if (i23 >= ixnVarArr5.length) {
                    break;
                }
                ixn ixnVar10 = ixnVarArr5[i23];
                if (ixnVar10.c() == 0) {
                    E(i23, false);
                } else {
                    long j14 = this.x0;
                    long j15 = this.y0;
                    at2 at2Var10 = (at2) ixnVar10.f;
                    at2 at2Var11 = (at2) ixnVar10.e;
                    if (ixn.h(at2Var11)) {
                        at2Var11.E(j14, j15);
                    }
                    if (at2Var10 != null) {
                        if (at2Var10.h != 0) {
                            at2Var10.E(j14, j15);
                        }
                    }
                    if (i5 != 0) {
                        at2 at2Var12 = (at2) ixnVar10.f;
                        at2 at2Var13 = (at2) ixnVar10.e;
                        boolean n = ixn.h(at2Var13) ? at2Var13.n() : true;
                        if (at2Var12 != null) {
                            if (at2Var12.h != 0) {
                                n &= at2Var12.n();
                            }
                        }
                        if (n) {
                            i5 = 1;
                            at2 d5 = ixnVar10.d(xohVar18);
                            z4 = d5 != null || d5.l() || d5.p() || d5.n();
                            E(i23, z4);
                            i4 = (i4 == 0 && z4) ? 1 : 0;
                            if (z4) {
                                D(i23);
                            }
                        }
                    }
                    i5 = 0;
                    at2 d52 = ixnVar10.d(xohVar18);
                    if (d52 != null) {
                    }
                    E(i23, z4);
                    if (i4 == 0) {
                    }
                    if (z4) {
                    }
                }
                i23++;
            }
        } else {
            xohVar18.a.k();
            i4 = 1;
            i5 = 1;
        }
        long j16 = xohVar18.g.e;
        boolean z13 = i5 != 0 && xohVar18.e && (j16 == j2 || j16 <= this.C.s);
        if (z13 && this.G) {
            this.G = false;
            int i24 = this.C.n;
            this.D.e(0);
            t0(this.A.c(this.C.e, false), i24, 5, false);
        }
        if (!z13 || !xohVar18.g.j) {
            rzk rzkVar3 = this.C;
            if (rzkVar3.e == 2) {
                zoh zohVar8 = this.s;
                if (this.v0 == 0) {
                    l = z();
                } else if (i4 == 0) {
                    l = false;
                } else {
                    if (rzkVar3.g) {
                        xoh xohVar19 = zohVar8.i;
                        long a2 = m0(rzkVar3.a, xohVar19.g.a) ? this.u.a() : j2;
                        xoh xohVar20 = zohVar8.l;
                        boolean z14 = xohVar20.g() && xohVar20.g.j;
                        boolean z15 = xohVar20.g.a.b() && !xohVar20.e;
                        if (!z14 && !z15) {
                            long o = o(xohVar20.d());
                            heg hegVar = this.f;
                            ndl ndlVar = this.w;
                            sis sisVar2 = this.C.a;
                            long j17 = this.x0 - xohVar19.p;
                            float f = this.o.m().a;
                            boolean z16 = this.C.l;
                            l = hegVar.l(new geg(ndlVar, j17, o, f, this.H, a2));
                        }
                    }
                    l = true;
                }
                if (l) {
                    i0(i2);
                    this.B0 = null;
                    if (l0()) {
                        w0(false, false);
                        go7 go7Var2 = this.o;
                        z = true;
                        go7Var2.f = true;
                        go7Var2.a.b();
                        n0();
                        if (this.C.e == 2) {
                            int i25 = 0;
                            while (true) {
                                ixn[] ixnVarArr6 = this.a;
                                if (i25 < ixnVarArr6.length) {
                                    if (ixnVarArr6[i25].d(xohVar18) != null ? z : false) {
                                        D(i25);
                                    }
                                    i25++;
                                } else {
                                    rzk rzkVar4 = this.C;
                                    if (!rzkVar4.g && rzkVar4.r < 500000 && y(this.s.l) && l0()) {
                                        z2 = z;
                                        if (z2) {
                                            this.D0 = j2;
                                        } else {
                                            long j18 = j2;
                                            long j19 = this.D0;
                                            dzr dzrVar = this.q;
                                            if (j19 == j18) {
                                                dzrVar.getClass();
                                                this.D0 = SystemClock.elapsedRealtime();
                                            } else {
                                                dzrVar.getClass();
                                                if (SystemClock.elapsedRealtime() - this.D0 >= 4000) {
                                                    xq0.q("Playback stuck buffering and not loading");
                                                    return;
                                                }
                                            }
                                        }
                                        boolean z17 = (l0() || this.C.e != i2) ? false : z;
                                        if (this.Z || !this.Y || !z17) {
                                            z = false;
                                        }
                                        rzkVar = this.C;
                                        if (rzkVar.p == z) {
                                            z3 = z;
                                            this.C = new rzk(rzkVar.a, rzkVar.b, rzkVar.c, rzkVar.d, rzkVar.e, rzkVar.f, rzkVar.g, rzkVar.h, rzkVar.i, rzkVar.j, rzkVar.k, rzkVar.l, rzkVar.m, rzkVar.n, rzkVar.o, rzkVar.q, rzkVar.r, rzkVar.s, rzkVar.t, z3);
                                        } else {
                                            z3 = z;
                                        }
                                        this.Y = false;
                                        if (!z3 && (i6 = this.C.e) != 4 && (z17 || i6 == 2 || (i6 == 3 && this.v0 != 0))) {
                                            S(j13);
                                        }
                                        Trace.endSection();
                                    }
                                }
                            }
                        }
                        z2 = false;
                        if (z2) {
                        }
                        if (l0()) {
                        }
                        if (this.Z) {
                        }
                        z = false;
                        rzkVar = this.C;
                        if (rzkVar.p == z) {
                        }
                        this.Y = false;
                        if (!z3) {
                            S(j13);
                        }
                        Trace.endSection();
                    }
                }
            }
            z = true;
            if (this.C.e == i2 && (this.v0 != 0 ? i4 == 0 : !z())) {
                w0(l0(), false);
                i0(2);
                if (this.H) {
                    for (xoh xohVar21 = this.s.i; xohVar21 != null; xohVar21 = xohVar21.m) {
                        for (zsb zsbVar : (zsb[]) xohVar21.o.d) {
                            if (zsbVar != null) {
                                zsbVar.u();
                            }
                        }
                    }
                    bo7 bo7Var = this.u;
                    switch (bo7Var.a) {
                        case 0:
                            long j20 = bo7Var.i;
                            if (j20 != -9223372036854775807L) {
                                long j21 = j20 + bo7Var.c;
                                bo7Var.i = j21;
                                long j22 = bo7Var.h;
                                if (j22 != -9223372036854775807L && j21 > j22) {
                                    bo7Var.i = j22;
                                }
                                bo7Var.m = -9223372036854775807L;
                                break;
                            }
                            break;
                        default:
                            long j23 = bo7Var.i;
                            if (j23 != -9223372036854775807L) {
                                long j24 = j23 + bo7Var.c;
                                bo7Var.i = j24;
                                long j25 = bo7Var.h;
                                if (j25 != -9223372036854775807L && j24 > j25) {
                                    bo7Var.i = j25;
                                }
                                bo7Var.m = -9223372036854775807L;
                                break;
                            }
                            break;
                    }
                }
                p0();
            }
            if (this.C.e == 2) {
            }
            z2 = false;
            if (z2) {
            }
            if (l0()) {
            }
            if (this.Z) {
            }
            z = false;
            rzkVar = this.C;
            if (rzkVar.p == z) {
            }
            this.Y = false;
            if (!z3) {
            }
            Trace.endSection();
        }
        i0(i3);
        p0();
        z = true;
        if (this.C.e == 2) {
        }
        z2 = false;
        if (z2) {
        }
        if (l0()) {
        }
        if (this.Z) {
        }
        z = false;
        rzkVar = this.C;
        if (rzkVar.p == z) {
        }
        this.Y = false;
        if (!z3) {
        }
        Trace.endSection();
    }

    public final void i0(int i) {
        rzk rzkVar = this.C;
        if (rzkVar.e != i) {
            if (i != 2) {
                this.D0 = -9223372036854775807L;
            }
            this.C = rzkVar.h(i);
        }
    }

    public final void j(xoh xohVar, int i, boolean z, long j) {
        ixn ixnVar = this.a[i];
        boolean g = ixnVar.g();
        at2 at2Var = (at2) ixnVar.e;
        if (g) {
            return;
        }
        boolean z2 = xohVar == this.s.i;
        c1t c1tVar = xohVar.o;
        gxn gxnVar = ((gxn[]) c1tVar.c)[i];
        zsb zsbVar = ((zsb[]) c1tVar.d)[i];
        boolean z3 = l0() && this.C.e == 3;
        boolean z4 = !z && z3;
        this.v0++;
        aoo aooVar = xohVar.c[i];
        long j2 = xohVar.p;
        uvh uvhVar = xohVar.g.a;
        at2 at2Var2 = (at2) ixnVar.f;
        int length = zsbVar != null ? zsbVar.length() : 0;
        dsc[] dscVarArr = new dsc[length];
        for (int i2 = 0; i2 < length; i2++) {
            zsbVar.getClass();
            dscVarArr[i2] = zsbVar.e(i2);
        }
        int i3 = ixnVar.d;
        go7 go7Var = this.o;
        if (i3 == 0 || i3 == 2 || i3 == 4) {
            ixnVar.a = true;
            vq1.A(at2Var.h == 0);
            at2Var.d = gxnVar;
            at2Var.h = 1;
            at2Var.v(z4, z2);
            at2Var.F(dscVarArr, aooVar, j, j2, uvhVar);
            at2Var.n = false;
            at2Var.l = j;
            at2Var.m = j;
            at2Var.w(j, z4);
            go7Var.a(at2Var);
        } else {
            ixnVar.b = true;
            at2Var2.getClass();
            vq1.A(at2Var2.h == 0);
            at2Var2.d = gxnVar;
            at2Var2.h = 1;
            at2Var2.v(z4, z2);
            at2Var2.F(dscVarArr, aooVar, j, j2, uvhVar);
            at2Var2.n = false;
            at2Var2.l = j;
            at2Var2.m = j;
            at2Var2.w(j, z4);
            go7Var.a(at2Var2);
        }
        zrb zrbVar = new zrb(this);
        at2 d = ixnVar.d(xohVar);
        d.getClass();
        d.a(11, zrbVar);
        if (z3 && z2) {
            ixnVar.n();
        }
    }

    public final void j0(Object obj, AtomicBoolean atomicBoolean) {
        for (ixn ixnVar : this.a) {
            at2 at2Var = (at2) ixnVar.e;
            if (at2Var.b == 2) {
                int i = ixnVar.d;
                if (i == 4 || i == 1) {
                    at2 at2Var2 = (at2) ixnVar.f;
                    at2Var2.getClass();
                    at2Var2.a(1, obj);
                } else {
                    at2Var.a(1, obj);
                }
            }
        }
        int i2 = this.C.e;
        if (i2 == 3 || i2 == 2) {
            this.h.g(2);
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void k(boolean[] zArr, long j) {
        ixn[] ixnVarArr;
        long j2;
        xoh xohVar = this.s.j;
        c1t c1tVar = xohVar.o;
        int i = 0;
        while (true) {
            ixnVarArr = this.a;
            if (i >= ixnVarArr.length) {
                break;
            }
            if (!c1tVar.r(i)) {
                ixnVarArr[i].l();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < ixnVarArr.length) {
            if (c1tVar.r(i2) && ixnVarArr[i2].d(xohVar) == null) {
                j2 = j;
                j(xohVar, i2, zArr[i2], j2);
            } else {
                j2 = j;
            }
            i2++;
            j = j2;
        }
    }

    public final void k0(float f) {
        this.H0 = f;
        float f2 = f * this.A.g;
        for (ixn ixnVar : this.a) {
            at2 at2Var = (at2) ixnVar.e;
            if (at2Var.b == 1) {
                at2Var.a(2, Float.valueOf(f2));
                at2 at2Var2 = (at2) ixnVar.f;
                if (at2Var2 != null) {
                    at2Var2.a(2, Float.valueOf(f2));
                }
            }
        }
    }

    public final long l(sis sisVar, Object obj, long j) {
        ois oisVar = this.l;
        int i = sisVar.g(obj, oisVar).c;
        ris risVar = this.k;
        sisVar.n(i, risVar);
        if (risVar.f != -9223372036854775807L && risVar.a() && risVar.i) {
            return dvt.Y(dvt.H(risVar.g) - risVar.f) - (j + oisVar.e);
        }
        return -9223372036854775807L;
    }

    public final boolean l0() {
        rzk rzkVar = this.C;
        return rzkVar.l && rzkVar.n == 0;
    }

    public final long m(xoh xohVar) {
        if (xohVar == null) {
            return 0L;
        }
        long j = xohVar.p;
        if (!xohVar.e) {
            return j;
        }
        int i = 0;
        while (true) {
            ixn[] ixnVarArr = this.a;
            if (i >= ixnVarArr.length) {
                return j;
            }
            if (ixnVarArr[i].d(xohVar) != null) {
                at2 d = ixnVarArr[i].d(xohVar);
                Objects.requireNonNull(d);
                long j2 = d.m;
                if (j2 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j = Math.max(j2, j);
            }
            i++;
        }
    }

    public final boolean m0(sis sisVar, uvh uvhVar) {
        if (uvhVar.b() || sisVar.p()) {
            return false;
        }
        int i = sisVar.g(uvhVar.a, this.l).c;
        ris risVar = this.k;
        sisVar.n(i, risVar);
        return risVar.a() && risVar.i && risVar.f != -9223372036854775807L;
    }

    public final Pair n(sis sisVar) {
        if (sisVar.p()) {
            return Pair.create(rzk.u, 0L);
        }
        Pair i = sisVar.i(this.k, this.l, sisVar.a(this.L), -9223372036854775807L);
        uvh q = this.s.q(sisVar, i.first, 0L);
        long longValue = ((Long) i.second).longValue();
        if (q.b()) {
            Object obj = q.a;
            ois oisVar = this.l;
            sisVar.g(obj, oisVar);
            longValue = q.c == oisVar.f(q.b) ? oisVar.g.b : 0L;
        }
        return Pair.create(q, Long.valueOf(longValue));
    }

    public final void n0() {
        xoh xohVar = this.s.i;
        if (xohVar == null) {
            return;
        }
        c1t c1tVar = xohVar.o;
        int i = 0;
        while (true) {
            ixn[] ixnVarArr = this.a;
            if (i >= ixnVarArr.length) {
                return;
            }
            if (c1tVar.r(i)) {
                ixnVarArr[i].n();
            }
            i++;
        }
    }

    public final long o(long j) {
        xoh xohVar = this.s.l;
        if (xohVar == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.x0 - xohVar.p));
    }

    public final void o0(boolean z, boolean z2) {
        M(z || !this.X, false, true, false);
        this.D.e(z2 ? 1 : 0);
        this.f.i(this.w);
        this.A.c(1, this.C.l);
        i0(1);
    }

    public final void p(int i) {
        rzk rzkVar = this.C;
        t0(i, rzkVar.n, rzkVar.m, rzkVar.l);
    }

    public final void p0() {
        go7 go7Var = this.o;
        go7Var.f = false;
        lrh lrhVar = go7Var.a;
        if (lrhVar.a) {
            lrhVar.a(lrhVar.t());
            lrhVar.a = false;
        }
        for (ixn ixnVar : this.a) {
            at2 at2Var = (at2) ixnVar.f;
            at2 at2Var2 = (at2) ixnVar.e;
            if (ixn.h(at2Var2)) {
                ixn.b(at2Var2);
            }
            if (at2Var != null && at2Var.h != 0) {
                ixn.b(at2Var);
            }
        }
    }

    public final void q() {
        k0(this.H0);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [ahp, java.lang.Object] */
    public final void q0() {
        xoh xohVar = this.s.l;
        boolean z = this.J || (xohVar != null && xohVar.a.f());
        rzk rzkVar = this.C;
        if (z != rzkVar.g) {
            this.C = rzkVar.b(z);
        }
    }

    public final void r(woh wohVar) {
        zoh zohVar = this.s;
        xoh xohVar = zohVar.l;
        if (xohVar != null && xohVar.a == wohVar) {
            zohVar.n(this.x0);
            A();
            return;
        }
        xoh xohVar2 = zohVar.m;
        if (xohVar2 == null || xohVar2.a != wohVar) {
            return;
        }
        B();
    }

    public final void r0(yvs yvsVar, c1t c1tVar) {
        zoh zohVar = this.s;
        xoh xohVar = zohVar.l;
        xohVar.getClass();
        xoh xohVar2 = zohVar.i;
        long j = this.x0;
        long j2 = xohVar.p;
        if (xohVar != xohVar2) {
            j -= j2;
            j2 = xohVar.g.b;
        }
        long j3 = j - j2;
        long o = o(xohVar.d());
        long a = m0(this.C.a, xohVar.g.a) ? this.u.a() : -9223372036854775807L;
        sis sisVar = this.C.a;
        float f = this.o.m().a;
        boolean z = this.C.l;
        this.f.c(new geg(this.w, j3, o, f, this.H, a), yvsVar, (zsb[]) c1tVar.d);
    }

    public final void s(int i, IOException iOException) {
        pqb pqbVar = new pqb(0, iOException, i);
        xoh xohVar = this.s.i;
        if (xohVar != null) {
            pqbVar = pqbVar.b(xohVar.g.a);
        }
        vq1.L("ExoPlayerImplInternal", "Playback error", pqbVar);
        o0(false, false);
        this.C = this.C.f(pqbVar);
    }

    public final void s0(int i, int i2, List list) {
        this.D.e(1);
        nwh nwhVar = this.t;
        nwhVar.getClass();
        ArrayList arrayList = (ArrayList) nwhVar.c;
        vq1.v(i >= 0 && i <= i2 && i2 <= arrayList.size());
        vq1.v(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((mwh) arrayList.get(i3)).a.i((onh) list.get(i3 - i));
        }
        u(nwhVar.g(), false);
    }

    public final void t(boolean z) {
        xoh xohVar = this.s.l;
        uvh uvhVar = xohVar == null ? this.C.b : xohVar.g.a;
        boolean equals = this.C.k.equals(uvhVar);
        if (!equals) {
            this.C = this.C.c(uvhVar);
        }
        rzk rzkVar = this.C;
        rzkVar.q = xohVar == null ? rzkVar.s : xohVar.d();
        rzk rzkVar2 = this.C;
        rzkVar2.r = o(rzkVar2.q);
        if ((!equals || z) && xohVar != null && xohVar.e) {
            r0(xohVar.n, xohVar.o);
        }
    }

    public final void t0(int i, int i2, int i3, boolean z) {
        boolean z2 = z && i != -1;
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = 0;
        }
        rzk rzkVar = this.C;
        if (rzkVar.l == z2 && rzkVar.n == i2 && rzkVar.m == i3) {
            return;
        }
        this.C = rzkVar.e(i3, i2, z2);
        w0(false, false);
        zoh zohVar = this.s;
        for (xoh xohVar = zohVar.i; xohVar != null; xohVar = xohVar.m) {
            for (zsb zsbVar : (zsb[]) xohVar.o.d) {
                if (zsbVar != null) {
                    zsbVar.p(z2);
                }
            }
        }
        if (!l0()) {
            p0();
            u0();
            zohVar.n(this.x0);
            return;
        }
        int i4 = this.C.e;
        hzr hzrVar = this.h;
        if (i4 != 3) {
            if (i4 == 2) {
                hzrVar.g(2);
            }
        } else {
            go7 go7Var = this.o;
            go7Var.f = true;
            go7Var.a.b();
            n0();
            hzrVar.g(2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0316 A[Catch: all -> 0x0311, TryCatch #2 {all -> 0x0311, blocks: (B:137:0x030d, B:138:0x0316, B:140:0x031c, B:31:0x0337, B:63:0x0345, B:65:0x034b, B:67:0x0355, B:69:0x0362), top: B:29:0x02d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x042d A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14, types: [esb] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r19v16, types: [uvh] */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r20v16 */
    /* JADX WARN: Type inference failed for: r20v19 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r2v37, types: [zoh] */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r33v1 */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r33v3 */
    /* JADX WARN: Type inference failed for: r33v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r33v5 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v27, types: [sis] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(sis sisVar, boolean z) {
        uvh uvhVar;
        ris risVar;
        Object obj;
        long j;
        int i;
        long j2;
        Object obj2;
        boolean z2;
        ?? r33;
        boolean z3;
        int i2;
        boolean z4;
        int i3;
        int i4;
        sis sisVar2;
        long j3;
        long j4;
        boolean z5;
        uvh uvhVar2;
        dsb dsbVar;
        int i5;
        long longValue;
        int i6;
        boolean z6;
        boolean z7;
        long j5;
        boolean z8;
        int i7;
        ?? r20;
        int i8;
        int i9;
        sis sisVar3;
        uvh uvhVar3;
        ?? r14;
        int i10;
        boolean z9;
        boolean z10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        int i14;
        sis sisVar4;
        sis sisVar5;
        long m;
        long j6;
        int t;
        xoh xohVar;
        boolean z12;
        int i15;
        esb esbVar;
        zoh zohVar;
        rzk rzkVar = this.C;
        esb esbVar2 = this.w0;
        zoh zohVar2 = this.s;
        int i16 = this.K;
        boolean z13 = this.L;
        ris risVar2 = this.k;
        ois oisVar = this.l;
        if (sisVar.p()) {
            ?? r19 = rzk.u;
            r20 = 0;
            j3 = -9223372036854775807L;
            sisVar2 = sisVar;
            dsbVar = new dsb(r19, 0L, -9223372036854775807L, false, true, false);
            i9 = -1;
            i8 = r19;
        } else {
            uvh uvhVar4 = rzkVar.b;
            Object obj3 = uvhVar4.a;
            sis sisVar6 = rzkVar.a;
            boolean p = sisVar6.p();
            boolean z14 = p || sisVar6.g(uvhVar4.a, oisVar).f;
            long j7 = (rzkVar.b.b() || z14) ? rzkVar.c : rzkVar.s;
            if (esbVar2 != null) {
                uvhVar = uvhVar4;
                Pair Q = Q(sisVar, esbVar2, true, i16, z13, risVar2, oisVar);
                if (Q == null) {
                    i6 = sisVar.a(z13);
                    j5 = j7;
                    z7 = false;
                    i7 = 1;
                    z8 = false;
                } else {
                    long j8 = esbVar2.c;
                    Object obj4 = Q.first;
                    if (j8 == -9223372036854775807L) {
                        i6 = sisVar.g(obj4, oisVar).c;
                        longValue = j7;
                        z6 = false;
                    } else {
                        longValue = ((Long) Q.second).longValue();
                        obj3 = obj4;
                        i6 = -1;
                        z6 = true;
                    }
                    boolean z15 = z6;
                    z7 = rzkVar.e == 4;
                    j5 = longValue;
                    z8 = z15;
                    i7 = 0;
                }
                i = i6;
                j2 = j5;
                risVar = risVar2;
                z2 = z7;
                obj = obj3;
                r33 = i7;
                z3 = z8;
                i4 = -1;
                j = j7;
            } else {
                uvhVar = uvhVar4;
                if (rzkVar.a.p()) {
                    i = sisVar.a(z13);
                    risVar = risVar2;
                    j2 = j7;
                    j = j2;
                    obj = obj3;
                    i3 = -1;
                } else if (sisVar.b(obj3) == -1) {
                    i2 = -1;
                    obj = obj3;
                    int R = R(risVar2, oisVar, i16, z13, obj, rzkVar.a, sisVar);
                    risVar = risVar2;
                    oisVar = oisVar;
                    if (R == -1) {
                        i = sisVar.a(z13);
                        z4 = true;
                    } else {
                        i = R;
                        z4 = false;
                    }
                    r33 = z4;
                    j2 = j7;
                    j = j2;
                    z2 = false;
                    z3 = false;
                    i4 = i2;
                } else {
                    risVar = risVar2;
                    obj = obj3;
                    int i17 = -1;
                    if (j7 == -9223372036854775807L) {
                        i = sisVar.g(obj, oisVar).c;
                        j2 = j7;
                        j = j2;
                        i3 = i17;
                    } else if (z14) {
                        rzkVar.a.g(uvhVar.a, oisVar);
                        j = j7;
                        if (rzkVar.a.m(oisVar.c, risVar, 0L).n == rzkVar.a.b(uvhVar.a)) {
                            Pair i18 = sisVar.i(risVar, oisVar, sisVar.g(obj, oisVar).c, j + oisVar.e);
                            obj2 = i18.first;
                            j2 = ((Long) i18.second).longValue();
                        } else {
                            obj2 = obj;
                            j2 = j;
                        }
                        obj = obj2;
                        i = -1;
                        z2 = false;
                        r33 = false;
                        z3 = true;
                        i4 = i17;
                    } else {
                        j = j7;
                        i = -1;
                        j2 = j;
                        i3 = i17;
                    }
                }
                z2 = false;
                r33 = false;
                i2 = i3;
                z3 = false;
                i4 = i2;
            }
            if (i != i4) {
                sisVar2 = sisVar;
                Pair i19 = sisVar2.i(risVar, oisVar, i, -9223372036854775807L);
                obj = i19.first;
                j2 = ((Long) i19.second).longValue();
                j4 = -9223372036854775807L;
            } else {
                sisVar2 = sisVar;
                j3 = j2;
                j4 = j2;
            }
            uvh q = zohVar2.q(sisVar2, obj, j2);
            int i20 = q.e;
            boolean z16 = uvhVar.a.equals(obj) && !uvhVar.b() && !q.b() && (i20 == i4 || ((i5 = uvhVar.e) != i4 && i20 >= i5));
            ois g = sisVar2.g(obj, oisVar);
            if (!z14 && j == j4) {
                Object obj5 = uvhVar.a;
                int i21 = uvhVar.c;
                int i22 = uvhVar.b;
                if (obj5.equals(q.a) && (!uvhVar.b() || !g.h(i22) ? !(!q.b() || !g.h(q.b)) : !(g.e(i22, i21) == 4 || g.e(i22, i21) == 2))) {
                    z5 = true;
                    uvhVar2 = (!z16 || z5) ? uvhVar : q;
                    if (uvhVar2.b()) {
                        if (uvhVar2.equals(uvhVar)) {
                            j2 = rzkVar.s;
                        } else {
                            sisVar2.g(uvhVar2.a, oisVar);
                            j2 = uvhVar2.c == oisVar.f(uvhVar2.b) ? oisVar.g.b : 0L;
                        }
                    }
                    dsbVar = new dsb(uvhVar2, j2, j4, z2, r33, z3);
                    i9 = i4;
                    i8 = i7;
                    r20 = p;
                }
            }
            z5 = false;
            if (z16) {
            }
            if (uvhVar2.b()) {
            }
            dsbVar = new dsb(uvhVar2, j2, j4, z2, r33, z3);
            i9 = i4;
            i8 = i7;
            r20 = p;
        }
        uvh uvhVar5 = dsbVar.a;
        long j9 = dsbVar.c;
        boolean z17 = dsbVar.d;
        long j10 = dsbVar.b;
        boolean z18 = (this.C.b.equals(uvhVar5) && j10 == this.C.s) ? false : true;
        try {
            if (dsbVar.e) {
                try {
                    z10 = true;
                    if (this.C.e != 1) {
                        i11 = 4;
                        i12 = 4;
                        try {
                            i0(4);
                        } catch (Throwable th) {
                            th = th;
                            sisVar3 = sisVar2;
                            uvhVar3 = uvhVar5;
                            j3 = j10;
                            z9 = z10;
                            i10 = i11;
                            r14 = 0;
                            rzk rzkVar2 = this.C;
                            sis sisVar7 = rzkVar2.a;
                            uvh uvhVar6 = rzkVar2.b;
                            uvh uvhVar7 = uvhVar3;
                            v0(sisVar3, uvhVar7, sisVar7, uvhVar6, dsbVar.f ? j3 : -9223372036854775807L, false);
                            if (!z18) {
                            }
                            rzk rzkVar3 = this.C;
                            Object obj6 = rzkVar3.b.a;
                            sis sisVar8 = rzkVar3.a;
                            if (z18) {
                            }
                            this.C = x(uvhVar7, j3, j9, this.C.d, (z18 || !z || sisVar8.p() || sisVar8.g(obj6, this.l).f) ? false : z9, sisVar3.b(obj6) == -1 ? i10 : 3);
                            N();
                            P(sisVar3, this.C.a);
                            this.C = this.C.i(sisVar3);
                            if (!sisVar3.p()) {
                            }
                            t(false);
                            this.h.g(2);
                            throw th;
                        }
                    } else {
                        i12 = 4;
                    }
                    M(false, false, false, true);
                    i11 = i12;
                } catch (Throwable th2) {
                    th = th2;
                    z10 = true;
                    i11 = 4;
                    sisVar3 = sisVar2;
                    uvhVar3 = uvhVar5;
                    j3 = j10;
                    z9 = z10;
                    i10 = i11;
                    r14 = 0;
                    rzk rzkVar22 = this.C;
                    sis sisVar72 = rzkVar22.a;
                    uvh uvhVar62 = rzkVar22.b;
                    uvh uvhVar72 = uvhVar3;
                    v0(sisVar3, uvhVar72, sisVar72, uvhVar62, dsbVar.f ? j3 : -9223372036854775807L, false);
                    if (!z18) {
                    }
                    rzk rzkVar32 = this.C;
                    Object obj62 = rzkVar32.b.a;
                    sis sisVar82 = rzkVar32.a;
                    if (z18) {
                    }
                    this.C = x(uvhVar72, j3, j9, this.C.d, (z18 || !z || sisVar82.p() || sisVar82.g(obj62, this.l).f) ? false : z9, sisVar3.b(obj62) == -1 ? i10 : 3);
                    N();
                    P(sisVar3, this.C.a);
                    this.C = this.C.i(sisVar3);
                    if (!sisVar3.p()) {
                    }
                    t(false);
                    this.h.g(2);
                    throw th;
                }
            } else {
                z10 = true;
                i11 = 4;
            }
            ixn[] ixnVarArr = this.a;
            int length = ixnVarArr.length;
            int i23 = 0;
            ?? r8 = i11;
            int i24 = i9;
            while (i23 < length) {
                ixn ixnVar = ixnVarArr[i23];
                at2 at2Var = (at2) ixnVar.e;
                if (!Objects.equals(at2Var.p, sisVar2)) {
                    at2Var.p = sisVar2;
                }
                at2 at2Var2 = (at2) ixnVar.f;
                if (at2Var2 != null && !Objects.equals(at2Var2.p, sisVar2)) {
                    at2Var2.p = sisVar2;
                }
                i23++;
                r8 = 4;
                i24 = -1;
            }
            try {
                if (z18) {
                    r8 = sisVar2;
                    j3 = j10;
                    esbVar = null;
                    esbVar = null;
                    i14 = 0;
                    i24 = 0;
                    i15 = 4;
                    i15 = 4;
                    i13 = 4;
                    i8 = 4;
                    z12 = true;
                    z12 = true;
                    z11 = true;
                    r20 = 1;
                    if (!r8.p()) {
                        for (xoh xohVar2 = this.s.i; xohVar2 != null; xohVar2 = xohVar2.m) {
                            if (xohVar2.g.a.equals(uvhVar5)) {
                                xohVar2.g = this.s.i(r8, xohVar2.g);
                                xohVar2.k();
                            }
                        }
                        try {
                            zohVar = this.s;
                            uvhVar3 = uvhVar5;
                        } catch (Throwable th3) {
                            th = th3;
                            uvhVar3 = uvhVar5;
                            sisVar4 = r8;
                            i14 = i24;
                            i13 = i8;
                            z11 = r20;
                            sisVar3 = sisVar4;
                            r14 = i14;
                            i10 = i13;
                            z9 = z11;
                            rzk rzkVar222 = this.C;
                            sis sisVar722 = rzkVar222.a;
                            uvh uvhVar622 = rzkVar222.b;
                            uvh uvhVar722 = uvhVar3;
                            v0(sisVar3, uvhVar722, sisVar722, uvhVar622, dsbVar.f ? j3 : -9223372036854775807L, false);
                            if (!z18 || j9 != this.C.c) {
                                rzk rzkVar322 = this.C;
                                Object obj622 = rzkVar322.b.a;
                                sis sisVar822 = rzkVar322.a;
                                this.C = x(uvhVar722, j3, j9, this.C.d, (z18 || !z || sisVar822.p() || sisVar822.g(obj622, this.l).f) ? false : z9, sisVar3.b(obj622) == -1 ? i10 : 3);
                            }
                            N();
                            P(sisVar3, this.C.a);
                            this.C = this.C.i(sisVar3);
                            if (!sisVar3.p()) {
                                this.w0 = r14;
                            }
                            t(false);
                            this.h.g(2);
                            throw th;
                        }
                        try {
                            j3 = V(uvhVar3, j3, zohVar.i != zohVar.j, z17);
                            rzk rzkVar4 = this.C;
                            uvh uvhVar8 = uvhVar3;
                            v0(sisVar, uvhVar8, rzkVar4.a, rzkVar4.b, !dsbVar.f ? j3 : -9223372036854775807L, false);
                            if (!z18 || j9 != this.C.c) {
                                rzk rzkVar5 = this.C;
                                Object obj7 = rzkVar5.b.a;
                                sis sisVar9 = rzkVar5.a;
                                this.C = x(uvhVar8, j3, j9, this.C.d, (z18 || !z || sisVar9.p() || sisVar9.g(obj7, this.l).f) ? false : z12, sisVar.b(obj7) != -1 ? i15 : 3);
                            }
                            N();
                            P(sisVar, this.C.a);
                            this.C = this.C.i(sisVar);
                            if (!sisVar.p()) {
                                this.w0 = esbVar;
                            }
                            t(false);
                            this.h.g(2);
                        } catch (Throwable th4) {
                            th = th4;
                            j3 = j3;
                            sisVar4 = r8;
                            sisVar3 = sisVar4;
                            r14 = i14;
                            i10 = i13;
                            z9 = z11;
                            rzk rzkVar2222 = this.C;
                            sis sisVar7222 = rzkVar2222.a;
                            uvh uvhVar6222 = rzkVar2222.b;
                            uvh uvhVar7222 = uvhVar3;
                            v0(sisVar3, uvhVar7222, sisVar7222, uvhVar6222, dsbVar.f ? j3 : -9223372036854775807L, false);
                            if (!z18) {
                            }
                            rzk rzkVar3222 = this.C;
                            Object obj6222 = rzkVar3222.b.a;
                            sis sisVar8222 = rzkVar3222.a;
                            if (z18) {
                            }
                            this.C = x(uvhVar7222, j3, j9, this.C.d, (z18 || !z || sisVar8222.p() || sisVar8222.g(obj6222, this.l).f) ? false : z9, sisVar3.b(obj6222) == -1 ? i10 : 3);
                            N();
                            P(sisVar3, this.C.a);
                            this.C = this.C.i(sisVar3);
                            if (!sisVar3.p()) {
                            }
                            t(false);
                            this.h.g(2);
                            throw th;
                        }
                    }
                } else {
                    try {
                        xoh xohVar3 = this.s.j;
                        m = xohVar3 == null ? 0L : m(xohVar3);
                    } catch (Throwable th5) {
                        th = th5;
                        sisVar5 = sisVar2;
                    }
                    try {
                        try {
                            try {
                                if (d() && (xohVar = this.s.k) != null) {
                                    j6 = m(xohVar);
                                    j3 = j10;
                                    i24 = 0;
                                    esbVar = null;
                                    esbVar = null;
                                    esbVar = null;
                                    i8 = 4;
                                    i15 = 4;
                                    i15 = 4;
                                    i15 = 4;
                                    r20 = 1;
                                    z12 = true;
                                    z12 = true;
                                    z12 = true;
                                    t = this.s.t(sisVar, this.x0, m, j6);
                                    if ((t & 1) == 0) {
                                        T(false);
                                    } else if ((t & 2) != 0) {
                                        f();
                                    }
                                }
                                t = this.s.t(sisVar, this.x0, m, j6);
                                if ((t & 1) == 0) {
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                r8 = sisVar;
                                uvhVar3 = uvhVar5;
                                sisVar4 = r8;
                                i14 = i24;
                                i13 = i8;
                                z11 = r20;
                                sisVar3 = sisVar4;
                                r14 = i14;
                                i10 = i13;
                                z9 = z11;
                                rzk rzkVar22222 = this.C;
                                sis sisVar72222 = rzkVar22222.a;
                                uvh uvhVar62222 = rzkVar22222.b;
                                uvh uvhVar72222 = uvhVar3;
                                v0(sisVar3, uvhVar72222, sisVar72222, uvhVar62222, dsbVar.f ? j3 : -9223372036854775807L, false);
                                if (!z18) {
                                }
                                rzk rzkVar32222 = this.C;
                                Object obj62222 = rzkVar32222.b.a;
                                sis sisVar82222 = rzkVar32222.a;
                                if (z18) {
                                }
                                this.C = x(uvhVar72222, j3, j9, this.C.d, (z18 || !z || sisVar82222.p() || sisVar82222.g(obj62222, this.l).f) ? false : z9, sisVar3.b(obj62222) == -1 ? i10 : 3);
                                N();
                                P(sisVar3, this.C.a);
                                this.C = this.C.i(sisVar3);
                                if (!sisVar3.p()) {
                                }
                                t(false);
                                this.h.g(2);
                                throw th;
                            }
                            i24 = 0;
                            esbVar = null;
                            esbVar = null;
                            esbVar = null;
                            i8 = 4;
                            i15 = 4;
                            i15 = 4;
                            i15 = 4;
                            r20 = 1;
                            z12 = true;
                            z12 = true;
                            z12 = true;
                        } catch (Throwable th7) {
                            th = th7;
                            r8 = sisVar;
                            i24 = 0;
                            i8 = 4;
                            r20 = 1;
                            uvhVar3 = uvhVar5;
                            sisVar4 = r8;
                            i14 = i24;
                            i13 = i8;
                            z11 = r20;
                            sisVar3 = sisVar4;
                            r14 = i14;
                            i10 = i13;
                            z9 = z11;
                            rzk rzkVar222222 = this.C;
                            sis sisVar722222 = rzkVar222222.a;
                            uvh uvhVar622222 = rzkVar222222.b;
                            uvh uvhVar722222 = uvhVar3;
                            v0(sisVar3, uvhVar722222, sisVar722222, uvhVar622222, dsbVar.f ? j3 : -9223372036854775807L, false);
                            if (!z18) {
                            }
                            rzk rzkVar322222 = this.C;
                            Object obj622222 = rzkVar322222.b.a;
                            sis sisVar822222 = rzkVar322222.a;
                            if (z18) {
                            }
                            this.C = x(uvhVar722222, j3, j9, this.C.d, (z18 || !z || sisVar822222.p() || sisVar822222.g(obj622222, this.l).f) ? false : z9, sisVar3.b(obj622222) == -1 ? i10 : 3);
                            N();
                            P(sisVar3, this.C.a);
                            this.C = this.C.i(sisVar3);
                            if (!sisVar3.p()) {
                            }
                            t(false);
                            this.h.g(2);
                            throw th;
                        }
                        j3 = j10;
                    } catch (Throwable th8) {
                        th = th8;
                        sisVar5 = sisVar;
                        j3 = j10;
                        r8 = sisVar5;
                        i24 = 0;
                        i8 = 4;
                        r20 = 1;
                        uvhVar3 = uvhVar5;
                        sisVar4 = r8;
                        i14 = i24;
                        i13 = i8;
                        z11 = r20;
                        sisVar3 = sisVar4;
                        r14 = i14;
                        i10 = i13;
                        z9 = z11;
                        rzk rzkVar2222222 = this.C;
                        sis sisVar7222222 = rzkVar2222222.a;
                        uvh uvhVar6222222 = rzkVar2222222.b;
                        uvh uvhVar7222222 = uvhVar3;
                        v0(sisVar3, uvhVar7222222, sisVar7222222, uvhVar6222222, dsbVar.f ? j3 : -9223372036854775807L, false);
                        if (!z18) {
                        }
                        rzk rzkVar3222222 = this.C;
                        Object obj6222222 = rzkVar3222222.b.a;
                        sis sisVar8222222 = rzkVar3222222.a;
                        if (z18) {
                        }
                        this.C = x(uvhVar7222222, j3, j9, this.C.d, (z18 || !z || sisVar8222222.p() || sisVar8222222.g(obj6222222, this.l).f) ? false : z9, sisVar3.b(obj6222222) == -1 ? i10 : 3);
                        N();
                        P(sisVar3, this.C.a);
                        this.C = this.C.i(sisVar3);
                        if (!sisVar3.p()) {
                        }
                        t(false);
                        this.h.g(2);
                        throw th;
                    }
                    j6 = 0;
                }
                uvhVar3 = uvhVar5;
                rzk rzkVar42 = this.C;
                uvh uvhVar82 = uvhVar3;
                v0(sisVar, uvhVar82, rzkVar42.a, rzkVar42.b, !dsbVar.f ? j3 : -9223372036854775807L, false);
                if (!z18) {
                }
                rzk rzkVar52 = this.C;
                Object obj72 = rzkVar52.b.a;
                sis sisVar92 = rzkVar52.a;
                if (z18) {
                }
                this.C = x(uvhVar82, j3, j9, this.C.d, (z18 || !z || sisVar92.p() || sisVar92.g(obj72, this.l).f) ? false : z12, sisVar.b(obj72) != -1 ? i15 : 3);
                N();
                P(sisVar, this.C.a);
                this.C = this.C.i(sisVar);
                if (!sisVar.p()) {
                }
                t(false);
                this.h.g(2);
            } catch (Throwable th9) {
                th = th9;
            }
        } catch (Throwable th10) {
            th = th10;
            sisVar3 = sisVar2;
            uvhVar3 = uvhVar5;
            j3 = j10;
            r14 = 0;
            i10 = 4;
            z9 = true;
        }
    }

    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, woh] */
    public final void u0() {
        boolean z;
        xoh xohVar = this.s.i;
        if (xohVar == null) {
            return;
        }
        long i = xohVar.e ? xohVar.a.i() : -9223372036854775807L;
        if (i != -9223372036854775807L) {
            if (!xohVar.g()) {
                this.s.o(xohVar);
                t(false);
                A();
            }
            O(i);
            if (i != this.C.s) {
                rzk rzkVar = this.C;
                this.C = x(rzkVar.b, i, rzkVar.c, i, true, 5);
            }
        } else {
            go7 go7Var = this.o;
            boolean z2 = xohVar != this.s.j;
            lrh lrhVar = go7Var.a;
            at2 at2Var = go7Var.c;
            if (at2Var == null || at2Var.n() || ((z2 && go7Var.c.h != 2) || (!go7Var.c.p() && (z2 || go7Var.c.l())))) {
                go7Var.e = true;
                if (go7Var.f) {
                    lrhVar.b();
                }
            } else {
                fih fihVar = go7Var.d;
                fihVar.getClass();
                long t = fihVar.t();
                if (go7Var.e) {
                    if (t >= lrhVar.t()) {
                        go7Var.e = false;
                        if (go7Var.f) {
                            lrhVar.b();
                        }
                    } else if (lrhVar.a) {
                        lrhVar.a(lrhVar.t());
                        lrhVar.a = false;
                    }
                }
                lrhVar.a(t);
                p0l m = fihVar.m();
                if (!m.equals((p0l) lrhVar.e)) {
                    lrhVar.r(m);
                    go7Var.b.h.c(16, m).b();
                }
            }
            long t2 = go7Var.t();
            this.x0 = t2;
            long j = t2 - xohVar.p;
            long j2 = this.C.s;
            if (!this.p.isEmpty() && !this.C.b.b()) {
                if (this.A0) {
                    this.A0 = false;
                }
                rzk rzkVar2 = this.C;
                rzkVar2.a.b(rzkVar2.b.a);
                int min = Math.min(this.z0, this.p.size());
                if (min > 0 && this.p.get(min - 1) != null) {
                    l1j.f();
                    return;
                } else {
                    if (min < this.p.size() && this.p.get(min) != null) {
                        l1j.f();
                        return;
                    }
                    this.z0 = min;
                }
            }
            if (this.o.s()) {
                boolean z3 = !this.D.e;
                rzk rzkVar3 = this.C;
                this.C = x(rzkVar3.b, j, rzkVar3.c, j, z3, 6);
            } else {
                rzk rzkVar4 = this.C;
                rzkVar4.s = j;
                rzkVar4.t = SystemClock.elapsedRealtime();
            }
        }
        this.C.q = this.s.l.d();
        rzk rzkVar5 = this.C;
        rzkVar5.r = o(rzkVar5.q);
        rzk rzkVar6 = this.C;
        if (rzkVar6.l && rzkVar6.e == 3 && m0(rzkVar6.a, rzkVar6.b)) {
            rzk rzkVar7 = this.C;
            float f = 1.0f;
            if (rzkVar7.o.a == 1.0f) {
                bo7 bo7Var = this.u;
                long l = l(rzkVar7.a, rzkVar7.b.a, rzkVar7.s);
                long j3 = this.C.r;
                switch (bo7Var.a) {
                    case 0:
                        z = false;
                        if (bo7Var.d != -9223372036854775807L) {
                            long j4 = l - j3;
                            long j5 = bo7Var.n;
                            if (j5 == -9223372036854775807L) {
                                bo7Var.n = j4;
                                bo7Var.o = 0L;
                            } else {
                                bo7Var.n = Math.max(j4, (long) ((j4 * 9.999871E-4f) + (j5 * 0.999f)));
                                bo7Var.o = (long) ((9.999871E-4f * Math.abs(j4 - r10)) + (0.999f * bo7Var.o));
                            }
                            if (bo7Var.m != -9223372036854775807L && SystemClock.elapsedRealtime() - bo7Var.m < 1000) {
                                f = bo7Var.l;
                                break;
                            } else {
                                bo7Var.m = SystemClock.elapsedRealtime();
                                long j6 = (bo7Var.o * 3) + bo7Var.n;
                                if (bo7Var.i > j6) {
                                    float Y = dvt.Y(1000L);
                                    bo7Var.i = cb0.D(j6, bo7Var.f, bo7Var.i - (((long) ((bo7Var.l - 1.0f) * Y)) + ((long) ((bo7Var.j - 1.0f) * Y))));
                                } else {
                                    long j7 = dvt.j(l - ((long) (Math.max(0.0f, bo7Var.l - 1.0f) / 1.0E-7f)), bo7Var.i, j6);
                                    bo7Var.i = j7;
                                    long j8 = bo7Var.h;
                                    if (j8 != -9223372036854775807L && j7 > j8) {
                                        bo7Var.i = j8;
                                    }
                                }
                                long j9 = l - bo7Var.i;
                                if (Math.abs(j9) < bo7Var.b) {
                                    bo7Var.l = 1.0f;
                                } else {
                                    bo7Var.l = dvt.h((1.0E-7f * j9) + 1.0f, bo7Var.k, bo7Var.j);
                                }
                                f = bo7Var.l;
                                break;
                            }
                        }
                        break;
                    default:
                        z = false;
                        if (bo7Var.d != -9223372036854775807L) {
                            long j10 = l - j3;
                            long j11 = bo7Var.n;
                            if (j11 == -9223372036854775807L) {
                                bo7Var.n = j10;
                                bo7Var.o = 0L;
                            } else {
                                bo7Var.n = Math.max(j10, (long) ((j10 * 9.999871E-4f) + (j11 * 0.999f)));
                                bo7Var.o = (long) ((9.999871E-4f * Math.abs(j10 - r10)) + (0.999f * bo7Var.o));
                            }
                            if (bo7Var.m != -9223372036854775807L && SystemClock.elapsedRealtime() - bo7Var.m < 1000) {
                                f = bo7Var.l;
                                break;
                            } else {
                                bo7Var.m = SystemClock.elapsedRealtime();
                                long j12 = (bo7Var.o * 3) + bo7Var.n;
                                if (bo7Var.i > j12) {
                                    float Y2 = dvt.Y(1000L);
                                    bo7Var.i = cb0.D(j12, bo7Var.f, bo7Var.i - (((long) ((bo7Var.l - 1.0f) * Y2)) + ((long) ((bo7Var.j - 1.0f) * Y2))));
                                } else {
                                    long j13 = dvt.j(l - ((long) (Math.max(0.0f, bo7Var.l - 1.0f) / 1.0E-7f)), bo7Var.i, j12);
                                    bo7Var.i = j13;
                                    long j14 = bo7Var.h;
                                    if (j14 != -9223372036854775807L && j13 > j14) {
                                        bo7Var.i = j14;
                                    }
                                }
                                long j15 = l - bo7Var.i;
                                if (Math.abs(j15) < bo7Var.b) {
                                    bo7Var.l = 1.0f;
                                } else {
                                    bo7Var.l = dvt.h((1.0E-7f * j15) + 1.0f, bo7Var.k, bo7Var.j);
                                }
                                f = bo7Var.l;
                                break;
                            }
                        }
                        break;
                }
                if (this.o.m().a != f) {
                    p0l a = this.C.o.a(f);
                    this.h.f(16);
                    this.o.r(a);
                    boolean z4 = z;
                    w(this.C.o, this.o.m().a, z4, z4);
                }
            }
        }
    }

    public final void v(woh wohVar) {
        xoh xohVar;
        zoh zohVar = this.s;
        xoh xohVar2 = zohVar.l;
        go7 go7Var = this.o;
        if (xohVar2 != null && xohVar2.a == wohVar) {
            xohVar2.getClass();
            if (!xohVar2.e) {
                float f = go7Var.m().a;
                rzk rzkVar = this.C;
                xohVar2.f(f, rzkVar.a, rzkVar.l);
            }
            r0(xohVar2.n, xohVar2.o);
            if (xohVar2 == zohVar.i) {
                O(xohVar2.g.b);
                k(new boolean[this.a.length], zohVar.j.e());
                xohVar2.h = true;
                rzk rzkVar2 = this.C;
                uvh uvhVar = rzkVar2.b;
                long j = xohVar2.g.b;
                this.C = x(uvhVar, j, rzkVar2.c, j, false, 5);
            }
            A();
            return;
        }
        int i = 0;
        while (true) {
            if (i >= zohVar.q.size()) {
                xohVar = null;
                break;
            }
            xohVar = (xoh) zohVar.q.get(i);
            if (xohVar.a == wohVar) {
                break;
            } else {
                i++;
            }
        }
        if (xohVar != null) {
            vq1.A(true ^ xohVar.e);
            float f2 = go7Var.m().a;
            rzk rzkVar3 = this.C;
            xohVar.f(f2, rzkVar3.a, rzkVar3.l);
            xoh xohVar3 = zohVar.m;
            if (xohVar3 == null || xohVar3.a != wohVar) {
                return;
            }
            B();
        }
    }

    public final void v0(sis sisVar, uvh uvhVar, sis sisVar2, uvh uvhVar2, long j, boolean z) {
        boolean m0 = m0(sisVar, uvhVar);
        Object obj = uvhVar.a;
        if (!m0) {
            p0l p0lVar = uvhVar.b() ? p0l.d : this.C.o;
            go7 go7Var = this.o;
            if (go7Var.m().equals(p0lVar)) {
                return;
            }
            this.h.f(16);
            go7Var.r(p0lVar);
            w(this.C.o, p0lVar.a, false, false);
            return;
        }
        ois oisVar = this.l;
        int i = sisVar.g(obj, oisVar).c;
        ris risVar = this.k;
        sisVar.n(i, risVar);
        fnh fnhVar = risVar.j;
        bo7 bo7Var = this.u;
        switch (bo7Var.a) {
            case 0:
                bo7Var.d = dvt.Y(fnhVar.a);
                bo7Var.g = dvt.Y(fnhVar.b);
                bo7Var.h = dvt.Y(fnhVar.c);
                float f = fnhVar.d;
                if (f == -3.4028235E38f) {
                    f = 0.97f;
                }
                bo7Var.k = f;
                float f2 = fnhVar.e;
                if (f2 == -3.4028235E38f) {
                    f2 = 1.03f;
                }
                bo7Var.j = f2;
                if (f == 1.0f && f2 == 1.0f) {
                    bo7Var.d = -9223372036854775807L;
                }
                bo7Var.b();
                break;
            default:
                bo7Var.d = dvt.Y(fnhVar.a);
                bo7Var.g = dvt.Y(fnhVar.b);
                bo7Var.h = dvt.Y(fnhVar.c);
                float f3 = fnhVar.d;
                if (f3 == -3.4028235E38f) {
                    f3 = 0.97f;
                }
                bo7Var.k = f3;
                float f4 = fnhVar.e;
                if (f4 == -3.4028235E38f) {
                    f4 = 1.03f;
                }
                bo7Var.j = f4;
                if (f3 == 1.0f && f4 == 1.0f) {
                    bo7Var.d = -9223372036854775807L;
                }
                bo7Var.c();
                break;
        }
        if (j != -9223372036854775807L) {
            bo7Var.d(l(sisVar, obj, j));
            return;
        }
        if (!Objects.equals(!sisVar2.p() ? sisVar2.m(sisVar2.g(uvhVar2.a, oisVar).c, risVar, 0L).a : null, risVar.a) || z) {
            bo7Var.d(-9223372036854775807L);
        }
    }

    public final void w(p0l p0lVar, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.D.e(1);
            }
            this.C = this.C.g(p0lVar);
        }
        float f2 = p0lVar.a;
        xoh xohVar = this.s.i;
        while (true) {
            i = 0;
            if (xohVar == null) {
                break;
            }
            zsb[] zsbVarArr = (zsb[]) xohVar.o.d;
            int length = zsbVarArr.length;
            while (i < length) {
                zsb zsbVar = zsbVarArr[i];
                if (zsbVar != null) {
                    zsbVar.i(f2);
                }
                i++;
            }
            xohVar = xohVar.m;
        }
        ixn[] ixnVarArr = this.a;
        int length2 = ixnVarArr.length;
        while (i < length2) {
            ixn ixnVar = ixnVarArr[i];
            float f3 = p0lVar.a;
            ((at2) ixnVar.e).G(f, f3);
            at2 at2Var = (at2) ixnVar.f;
            if (at2Var != null) {
                at2Var.G(f, f3);
            }
            i++;
        }
    }

    public final void w0(boolean z, boolean z2) {
        long j;
        this.H = z;
        if (!z || z2) {
            j = -9223372036854775807L;
        } else {
            this.q.getClass();
            j = SystemClock.elapsedRealtime();
        }
        this.I = j;
    }

    public final rzk x(uvh uvhVar, long j, long j2, long j3, boolean z, int i) {
        qsn qsnVar;
        boolean z2;
        this.A0 = (!this.A0 && j == this.C.s && uvhVar.equals(this.C.b)) ? false : true;
        N();
        rzk rzkVar = this.C;
        yvs yvsVar = rzkVar.h;
        c1t c1tVar = rzkVar.i;
        List list = rzkVar.j;
        if (this.t.a) {
            xoh xohVar = this.s.i;
            yvsVar = xohVar == null ? yvs.d : xohVar.n;
            c1tVar = xohVar == null ? this.e : xohVar.o;
            zsb[] zsbVarArr = (zsb[]) c1tVar.d;
            tde tdeVar = new tde(4);
            boolean z3 = false;
            for (zsb zsbVar : zsbVarArr) {
                if (zsbVar != null) {
                    u2i u2iVar = zsbVar.e(0).l;
                    if (u2iVar == null) {
                        tdeVar.a(new u2i(new n2i[0]));
                    } else {
                        tdeVar.a(u2iVar);
                        z3 = true;
                    }
                }
            }
            if (z3) {
                qsnVar = tdeVar.f();
            } else {
                ude udeVar = yde.b;
                qsnVar = qsn.e;
            }
            list = qsnVar;
            if (xohVar != null) {
                yoh yohVar = xohVar.g;
                if (yohVar.c != j2) {
                    xohVar.g = yohVar.a(j2);
                }
            }
            ixn[] ixnVarArr = this.a;
            zoh zohVar = this.s;
            xoh xohVar2 = zohVar.i;
            if (xohVar2 == zohVar.j && xohVar2 != null) {
                c1t c1tVar2 = xohVar2.o;
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    if (i2 >= ixnVarArr.length) {
                        z2 = true;
                        break;
                    }
                    if (c1tVar2.r(i2)) {
                        if (((at2) ixnVarArr[i2].e).b != 1) {
                            z2 = false;
                            break;
                        }
                        if (((gxn[]) c1tVar2.c)[i2].a != 0) {
                            z4 = true;
                        }
                    }
                    i2++;
                }
                boolean z5 = z4 && z2;
                if (z5 != this.Z) {
                    this.Z = z5;
                    if (!z5 && this.C.p) {
                        this.h.g(2);
                    }
                }
            }
        } else if (!uvhVar.equals(rzkVar.b)) {
            yvsVar = yvs.d;
            c1tVar = this.e;
            list = qsn.e;
        }
        yvs yvsVar2 = yvsVar;
        c1t c1tVar3 = c1tVar;
        List list2 = list;
        if (z) {
            csb csbVar = this.D;
            if (!csbVar.e || csbVar.c == 5) {
                csbVar.d = true;
                csbVar.e = true;
                csbVar.c = i;
            } else {
                vq1.v(i == 5);
            }
        }
        rzk rzkVar2 = this.C;
        return rzkVar2.d(uvhVar, j, j2, j3, o(rzkVar2.q), yvsVar2, c1tVar3, list2);
    }

    public final synchronized void x0(yqr yqrVar, long j) {
        this.q.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!((Boolean) yqrVar.get()).booleanValue() && j > 0) {
            try {
                this.q.getClass();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            this.q.getClass();
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final boolean z() {
        xoh xohVar = this.s.i;
        long j = xohVar.g.e;
        if (xohVar.e) {
            return j == -9223372036854775807L || this.C.s < j || !l0();
        }
        return false;
    }
}
