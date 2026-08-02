package yads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import defpackage.a181;
import defpackage.bf81;
import defpackage.cb81;
import defpackage.cj71;
import defpackage.ck71;
import defpackage.cq61;
import defpackage.cq71;
import defpackage.cz71;
import defpackage.dda1;
import defpackage.dg81;
import defpackage.e771;
import defpackage.ek71;
import defpackage.en71;
import defpackage.fe71;
import defpackage.fi71;
import defpackage.gk71;
import defpackage.gt71;
import defpackage.gy61;
import defpackage.hi81;
import defpackage.hp71;
import defpackage.ie81;
import defpackage.ii81;
import defpackage.kr81;
import defpackage.kv71;
import defpackage.lb71;
import defpackage.lf81;
import defpackage.lu81;
import defpackage.lw71;
import defpackage.nba1;
import defpackage.ny61;
import defpackage.og81;
import defpackage.oh71;
import defpackage.ov81;
import defpackage.p481;
import defpackage.pg61;
import defpackage.pr71;
import defpackage.pz71;
import defpackage.q581;
import defpackage.qd81;
import defpackage.qp81;
import defpackage.qzt0;
import defpackage.ra71;
import defpackage.rf71;
import defpackage.rl71;
import defpackage.s371;
import defpackage.sf81;
import defpackage.sn61;
import defpackage.td71;
import defpackage.tm61;
import defpackage.u191;
import defpackage.uk81;
import defpackage.v281;
import defpackage.v581;
import defpackage.vs81;
import defpackage.w511;
import defpackage.wl61;
import defpackage.wo81;
import defpackage.wx71;
import defpackage.xb71;
import defpackage.xi71;
import defpackage.xj71;
import defpackage.xl61;
import defpackage.y581;
import defpackage.yn81;
import defpackage.z281;
import defpackage.zj61;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public final class rn0 implements Handler.Callback, e771 {
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public y581 K;
    public long L;
    public int M;
    public boolean N;
    public zm0 O;
    public final gy61[] b;
    public final Set c;
    public final gy61[] d;
    public final kr81 e;
    public final lu81 f;
    public final hi81 g;
    public final cq61 h;
    public final rl71 i;
    public final HandlerThread j;
    public final Looper k;
    public final uk81 l;
    public final ie81 m;
    public final long n;
    public final wo81 o;
    public final ArrayList p;
    public final xb71 q;
    public final pz71 r;
    public final en71 s;
    public final ov81 t;
    public final bf81 u;
    public final long v;
    public lb71 w;
    public hp71 x;
    public lw71 y;
    public boolean z;
    public int E = 0;
    public boolean F = false;
    public boolean A = false;
    public long P = -9223372036854775807L;

    public rn0(gy61[] gy61VarArr, kr81 kr81Var, lu81 lu81Var, hi81 hi81Var, cq61 cq61Var, xl61 xl61Var, lb71 lb71Var, bf81 bf81Var, long j, Looper looper, xb71 xb71Var, pz71 pz71Var, wl61 wl61Var) {
        this.r = pz71Var;
        this.b = gy61VarArr;
        this.e = kr81Var;
        this.f = lu81Var;
        this.g = hi81Var;
        this.h = cq61Var;
        this.w = lb71Var;
        this.u = bf81Var;
        this.v = j;
        this.q = xb71Var;
        this.n = hi81Var.h;
        cb81 cb81Var = yn81.b;
        wx71 wx71Var = wx71.w;
        wk2 wk2Var = wk2.x;
        kv71 kv71Var = kv71.w;
        v281 v281Var = hp71.s;
        hp71 hp71Var = new hp71(cb81Var, v281Var, -9223372036854775807L, 0L, 1, null, false, wx71Var, lu81Var, wk2Var, v281Var, false, 0, kv71Var, 0L, 0L, 0L, false);
        this.x = hp71Var;
        this.y = new lw71(hp71Var);
        this.d = new gy61[gy61VarArr.length];
        for (int i = 0; i < gy61VarArr.length; i++) {
            gy61 gy61Var = gy61VarArr[i];
            gy61Var.e = i;
            gy61Var.f = wl61Var;
            this.d[i] = gy61Var;
        }
        this.o = new wo81(this, xb71Var);
        this.p = new ArrayList();
        this.c = Collections.newSetFromMap(new IdentityHashMap());
        this.l = new uk81();
        this.m = new ie81();
        kr81Var.a = this;
        kr81Var.b = cq61Var;
        this.N = true;
        Handler handler = new Handler(looper);
        this.s = new en71(xl61Var, handler);
        this.t = new ov81(this, xl61Var, handler, wl61Var);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.j = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.k = looper2;
        xb71Var.getClass();
        this.i = new rl71(new Handler(looper2, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:280:0x0544, code lost:
    
        if (l() == false) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x05ed, code lost:
    
        if (r6 >= r3.i) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0662, code lost:
    
        if (l() == false) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0665, code lost:
    
        if (r5 == false) goto L410;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:258:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x037e  */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, sn61] */
    /* JADX WARN: Type inference failed for: r1v69, types: [java.lang.Object, ra71] */
    /* JADX WARN: Type inference failed for: r1v92, types: [lu81] */
    /* JADX WARN: Type inference failed for: r1v99, types: [java.lang.Object, sn61] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, ra71] */
    /* JADX WARN: Type inference failed for: r3v109, types: [int] */
    /* JADX WARN: Type inference failed for: r3v120, types: [java.lang.Object, sn61] */
    /* JADX WARN: Type inference failed for: r3v124 */
    /* JADX WARN: Type inference failed for: r3v125 */
    /* JADX WARN: Type inference failed for: r3v69, types: [java.lang.Object, ra71] */
    /* JADX WARN: Type inference failed for: r4v36, types: [java.lang.Object, sn61] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, ra71] */
    /* JADX WARN: Type inference failed for: r6v64, types: [gk71[]] */
    /* JADX WARN: Type inference failed for: r6v65, types: [gk71] */
    /* JADX WARN: Type inference failed for: r6v73, types: [java.lang.Object, sn61] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26, types: [int] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        long j;
        int i;
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        boolean z2;
        boolean z3;
        boolean z4;
        hp71 hp71Var;
        boolean z5;
        boolean z6;
        int i2;
        td71 td71Var;
        dg81 dg81Var;
        long j6;
        boolean z7;
        td71 td71Var2;
        td71 td71Var3;
        long j7;
        xj71 b;
        td71 td71Var4;
        boolean z8;
        boolean z9;
        td71 td71Var5;
        td71 td71Var6;
        boolean z10;
        td71 td71Var7;
        td71 td71Var8;
        td71 a;
        boolean z11;
        boolean z12;
        boolean z13;
        this.q.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        this.i.a.removeMessages(2);
        if (this.x.a.c() || !this.t.k) {
            j = -9223372036854775807L;
            i = 3;
            z = true;
            j2 = 0;
        } else {
            en71 en71Var = this.s;
            long j8 = this.L;
            td71 td71Var9 = en71Var.j;
            if (td71Var9 != null) {
                if (td71Var9.l != null) {
                    ny61.k();
                    return;
                }
                if (td71Var9.d) {
                    z7 = true;
                    td71Var9.a.h(j8 - td71Var9.o);
                    en71 en71Var2 = this.s;
                    td71Var2 = en71Var2.j;
                    if (td71Var2 != null || (!td71Var2.f.i && td71Var2.d && ((!td71Var2.e || td71Var2.a.g() == Long.MIN_VALUE) && en71Var2.j.f.e != -9223372036854775807L && en71Var2.k < 100))) {
                        en71 en71Var3 = this.s;
                        long j9 = this.L;
                        hp71 hp71Var2 = this.x;
                        td71Var3 = en71Var3.j;
                        if (td71Var3 != null) {
                            yn81 yn81Var = hp71Var2.a;
                            v281 v281Var = hp71Var2.b;
                            j7 = -9223372036854775807L;
                            long j10 = hp71Var2.c;
                            long j11 = hp71Var2.r;
                            j2 = 0;
                            yn81Var.a(v281Var.a, en71Var3.a);
                            boolean a2 = v281Var.a();
                            Object obj = v281Var.a;
                            b = a2 ? en71Var3.c(yn81Var, obj, v281Var.b, v281Var.c, j10, v281Var.d) : en71Var3.d(yn81Var, obj, j11, j10, v281Var.d);
                        } else {
                            j7 = -9223372036854775807L;
                            j2 = 0;
                            b = en71Var3.b(hp71Var2.a, td71Var3, j9);
                        }
                        if (b != null) {
                            en71 en71Var4 = this.s;
                            gy61[] gy61VarArr = this.d;
                            kr81 kr81Var = this.e;
                            xi71 xi71Var = this.g.a;
                            ov81 ov81Var = this.t;
                            lu81 lu81Var = this.f;
                            td71 td71Var10 = en71Var4.j;
                            td71 td71Var11 = new td71(gy61VarArr, td71Var10 == null ? 1000000000000L : (td71Var10.o + td71Var10.f.e) - b.b, kr81Var, xi71Var, ov81Var, b, lu81Var);
                            td71 td71Var12 = en71Var4.j;
                            if (td71Var12 == null) {
                                en71Var4.h = td71Var11;
                                en71Var4.i = td71Var11;
                            } else if (td71Var11 != td71Var12.l) {
                                td71Var12.b();
                                td71Var12.l = td71Var11;
                            }
                            en71Var4.l = null;
                            en71Var4.j = td71Var11;
                            en71Var4.k++;
                            en71Var4.m();
                            td71Var11.a.x(this, b.b);
                            if (this.s.h == td71Var11) {
                                b(b.b);
                            }
                            a(false);
                        }
                    } else {
                        j7 = -9223372036854775807L;
                        j2 = 0;
                    }
                    if (this.D) {
                        d();
                    } else {
                        td71 td71Var13 = this.s.j;
                        if (td71Var13 != null) {
                            if ((!td71Var13.d ? j2 : td71Var13.a.i()) != Long.MIN_VALUE) {
                                z13 = z7;
                                this.D = z13;
                                n();
                            }
                        }
                        z13 = false;
                        this.D = z13;
                        n();
                    }
                    td71Var4 = this.s.i;
                    if (td71Var4 != null) {
                        if (td71Var4.l == null || this.B) {
                            z8 = false;
                            z9 = z7;
                            if (td71Var4.f.i || this.B) {
                                int i3 = 0;
                                while (true) {
                                    gy61[] gy61VarArr2 = this.b;
                                    if (i3 >= gy61VarArr2.length) {
                                        break;
                                    }
                                    gy61 gy61Var = gy61VarArr2[i3];
                                    dg81 dg81Var2 = td71Var4.c[i3];
                                    if (dg81Var2 != null && gy61Var.h == dg81Var2 && gy61Var.d()) {
                                        long j12 = td71Var4.f.e;
                                        a(gy61Var, (j12 == j7 || j12 == Long.MIN_VALUE) ? j7 : td71Var4.o + j12);
                                    }
                                    i3++;
                                }
                            }
                        } else if (td71Var4.d) {
                            int i4 = 0;
                            while (true) {
                                gy61[] gy61VarArr3 = this.b;
                                if (i4 < gy61VarArr3.length) {
                                    gy61 gy61Var2 = gy61VarArr3[i4];
                                    dg81 dg81Var3 = td71Var4.c[i4];
                                    if (gy61Var2.h != dg81Var3) {
                                        break;
                                    }
                                    if (dg81Var3 != null && !gy61Var2.d()) {
                                        td71 td71Var14 = td71Var4.l;
                                        if (!td71Var4.f.f) {
                                            break;
                                        }
                                        if (!td71Var14.d) {
                                            break;
                                        }
                                        if (!(gy61Var2 instanceof d43) && !(gy61Var2 instanceof fs1) && gy61Var2.k < td71Var14.f.b + td71Var14.o) {
                                            break;
                                        }
                                    }
                                    i4++;
                                } else {
                                    td71 td71Var15 = td71Var4.l;
                                    if (td71Var15.d || this.L >= td71Var15.f.b + td71Var15.o) {
                                        lu81 lu81Var2 = td71Var4.n;
                                        en71 en71Var5 = this.s;
                                        td71 td71Var16 = en71Var5.i;
                                        if (td71Var16 == null || (td71Var5 = td71Var16.l) == null) {
                                            ny61.k();
                                            return;
                                        }
                                        en71Var5.i = td71Var5;
                                        en71Var5.m();
                                        td71 td71Var17 = en71Var5.i;
                                        lu81 lu81Var3 = td71Var17.n;
                                        yn81 yn81Var2 = this.x.a;
                                        z8 = false;
                                        z9 = z7;
                                        a(yn81Var2, td71Var17.f.a, yn81Var2, td71Var4.f.a, -9223372036854775807L);
                                        if (!td71Var17.d || td71Var17.a.f() == j7) {
                                            for (int i5 = 0; i5 < this.b.length; i5++) {
                                                boolean a3 = lu81Var2.a(i5);
                                                boolean a4 = lu81Var3.a(i5);
                                                if (a3 && !this.b[i5].l) {
                                                    boolean z14 = this.d[i5].b == -2 ? z9 : false;
                                                    v581 v581Var = lu81Var2.b[i5];
                                                    v581 v581Var2 = lu81Var3.b[i5];
                                                    if (!a4 || !v581Var2.equals(v581Var) || z14) {
                                                        a(this.b[i5], td71Var17.f.b + td71Var17.o);
                                                    }
                                                }
                                            }
                                        } else {
                                            long j13 = td71Var17.f.b + td71Var17.o;
                                            for (gy61 gy61Var3 : this.b) {
                                                if (gy61Var3.h != null) {
                                                    a(gy61Var3, j13);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        en71 en71Var6 = this.s;
                        td71Var6 = en71Var6.i;
                        if (td71Var6 != null || en71Var6.h == td71Var6 || td71Var6.g) {
                            z = z9;
                        } else {
                            ?? r1 = td71Var6.n;
                            boolean z15 = z8;
                            boolean z16 = z15;
                            ?? r3 = z15;
                            while (true) {
                                gy61[] gy61VarArr4 = this.b;
                                if (r3 < gy61VarArr4.length) {
                                    gy61 gy61Var4 = gy61VarArr4[r3];
                                    if (b(gy61Var4)) {
                                        boolean z17 = gy61Var4.h != td71Var6.c[r3] ? z9 : z8;
                                        if (!r1.a(r3) || z17) {
                                            if (gy61Var4.l) {
                                                z12 = z9;
                                                if (gy61Var4.e()) {
                                                    a(gy61Var4);
                                                } else {
                                                    z16 = z12;
                                                }
                                            } else {
                                                ?? r6 = r1.c[r3];
                                                int g = r6 != 0 ? r6.g() : z8;
                                                qd81[] qd81VarArr = new qd81[g];
                                                for (?? r9 = z8; r9 < g; r9++) {
                                                    qd81VarArr[r9] = r6.b(r9);
                                                }
                                                dg81 dg81Var4 = td71Var6.c[r3];
                                                long j14 = td71Var6.f.b;
                                                z12 = z9;
                                                long j15 = td71Var6.o;
                                                long j16 = j14 + j15;
                                                if (gy61Var4.l) {
                                                    ny61.k();
                                                    return;
                                                }
                                                gy61Var4.h = dg81Var4;
                                                if (gy61Var4.k == Long.MIN_VALUE) {
                                                    gy61Var4.k = j16;
                                                }
                                                gy61Var4.i = qd81VarArr;
                                                gy61Var4.j = j15;
                                                gy61Var4.a(qd81VarArr, j16, j15);
                                            }
                                            z9 = z12;
                                            z8 = false;
                                            r3++;
                                        }
                                    }
                                    z12 = z9;
                                    z9 = z12;
                                    z8 = false;
                                    r3++;
                                } else {
                                    z = z9;
                                    if (!z16) {
                                        a(new boolean[gy61VarArr4.length]);
                                    }
                                }
                            }
                        }
                        z10 = false;
                        while (l() && !this.B && (td71Var7 = this.s.h) != null && (td71Var8 = td71Var7.l) != null && this.L >= td71Var8.f.b + td71Var8.o && td71Var8.g) {
                            if (z10) {
                                lw71 lw71Var = this.y;
                                hp71 hp71Var3 = this.x;
                                boolean z18 = lw71Var.a | (lw71Var.b != hp71Var3 ? z : false);
                                lw71Var.a = z18;
                                lw71Var.b = hp71Var3;
                                if (z18) {
                                    ek71 ek71Var = ((ck71) this.r).a;
                                    ek71Var.i.a.post(new fe71(3, ek71Var, lw71Var));
                                    this.y = new lw71(this.x);
                                    a = this.s.a();
                                    a.getClass();
                                    if (this.x.b.a.equals(a.f.a.a)) {
                                        v281 v281Var2 = this.x.b;
                                        if (v281Var2.b == -1) {
                                            v281 v281Var3 = a.f.a;
                                            if (v281Var3.b == -1 && v281Var2.e != v281Var3.e) {
                                                z11 = z;
                                                xj71 xj71Var = a.f;
                                                v281 v281Var4 = xj71Var.a;
                                                boolean z19 = z11;
                                                long j17 = xj71Var.b;
                                                this.x = a(v281Var4, j17, xj71Var.c, j17, !z19, 0);
                                                k();
                                                o();
                                                z10 = z;
                                            }
                                        }
                                    }
                                    z11 = false;
                                    xj71 xj71Var2 = a.f;
                                    v281 v281Var42 = xj71Var2.a;
                                    boolean z192 = z11;
                                    long j172 = xj71Var2.b;
                                    this.x = a(v281Var42, j172, xj71Var2.c, j172, !z192, 0);
                                    k();
                                    o();
                                    z10 = z;
                                }
                            }
                            a = this.s.a();
                            a.getClass();
                            if (this.x.b.a.equals(a.f.a.a)) {
                            }
                            z11 = false;
                            xj71 xj71Var22 = a.f;
                            v281 v281Var422 = xj71Var22.a;
                            boolean z1922 = z11;
                            long j1722 = xj71Var22.b;
                            this.x = a(v281Var422, j1722, xj71Var22.c, j1722, !z1922, 0);
                            k();
                            o();
                            z10 = z;
                        }
                        j = j7;
                        i = 3;
                    }
                    z8 = false;
                    z9 = z7;
                    en71 en71Var62 = this.s;
                    td71Var6 = en71Var62.i;
                    if (td71Var6 != null) {
                    }
                    z = z9;
                    z10 = false;
                    while (l()) {
                        if (z10) {
                        }
                        a = this.s.a();
                        a.getClass();
                        if (this.x.b.a.equals(a.f.a.a)) {
                        }
                        z11 = false;
                        xj71 xj71Var222 = a.f;
                        v281 v281Var4222 = xj71Var222.a;
                        boolean z19222 = z11;
                        long j17222 = xj71Var222.b;
                        this.x = a(v281Var4222, j17222, xj71Var222.c, j17222, !z19222, 0);
                        k();
                        o();
                        z10 = z;
                    }
                    j = j7;
                    i = 3;
                }
            }
            z7 = true;
            en71 en71Var22 = this.s;
            td71Var2 = en71Var22.j;
            if (td71Var2 != null) {
            }
            en71 en71Var32 = this.s;
            long j92 = this.L;
            hp71 hp71Var22 = this.x;
            td71Var3 = en71Var32.j;
            if (td71Var3 != null) {
            }
            if (b != null) {
            }
            if (this.D) {
            }
            td71Var4 = this.s.i;
            if (td71Var4 != null) {
            }
            z8 = false;
            z9 = z7;
            en71 en71Var622 = this.s;
            td71Var6 = en71Var622.i;
            if (td71Var6 != null) {
            }
            z = z9;
            z10 = false;
            while (l()) {
            }
            j = j7;
            i = 3;
        }
        int i6 = this.x.e;
        if (i6 == z || i6 == 4) {
            return;
        }
        td71 td71Var18 = this.s.h;
        if (td71Var18 == null) {
            this.i.a.sendEmptyMessageAtTime(2, uptimeMillis + 10);
            return;
        }
        dda1.i("doSomeWork");
        o();
        if (td71Var18.d) {
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            j3 = 10;
            j4 = 1000;
            td71Var18.a.a(this.x.r - this.n);
            int i7 = 0;
            boolean z20 = true;
            z3 = true;
            while (true) {
                gy61[] gy61VarArr5 = this.b;
                if (i7 >= gy61VarArr5.length) {
                    break;
                }
                gy61 gy61Var5 = gy61VarArr5[i7];
                if (b(gy61Var5)) {
                    j6 = j;
                    gy61Var5.a(this.L, elapsedRealtime);
                    z20 = z20 && gy61Var5.e();
                    boolean z21 = td71Var18.c[i7] != gy61Var5.h;
                    boolean z22 = z21 || (!z21 && gy61Var5.d()) || gy61Var5.f() || gy61Var5.e();
                    z3 = z3 && z22;
                    if (!z22) {
                        dg81 dg81Var5 = gy61Var5.h;
                        dg81Var5.getClass();
                        dg81Var5.a();
                    }
                } else {
                    j6 = j;
                }
                i7++;
                j = j6;
            }
            j5 = j;
            z2 = z20;
        } else {
            j3 = 10;
            j4 = 1000;
            j5 = j;
            td71Var18.a.j();
            z2 = true;
            z3 = true;
        }
        long j18 = td71Var18.f.e;
        boolean z23 = z2 && td71Var18.d && (j18 == j5 || j18 <= this.x.r);
        if (z23 && this.B) {
            this.B = false;
            a(false, this.x.m, false, 5);
        }
        if (z23 && td71Var18.f.i) {
            b(4);
            m();
        } else {
            hp71 hp71Var4 = this.x;
            if (hp71Var4.e == 2) {
                if (this.J == 0) {
                    td71 td71Var19 = this.s.h;
                    long j19 = td71Var19.f.e;
                    if (td71Var19.d) {
                        if (j19 != j5) {
                            if (hp71Var4.r >= j19) {
                            }
                        }
                        b(i);
                        this.O = null;
                        if (l()) {
                            this.C = false;
                            wo81 wo81Var = this.o;
                            z4 = true;
                            wo81Var.y = true;
                            qzt0 qzt0Var = wo81Var.a;
                            if (!qzt0Var.c) {
                                ((xb71) qzt0Var.w).getClass();
                                qzt0Var.b = SystemClock.elapsedRealtime();
                                qzt0Var.c = true;
                            }
                            for (gy61 gy61Var6 : this.b) {
                                if (b(gy61Var6)) {
                                    if (gy61Var6.g != 1) {
                                        ny61.k();
                                        return;
                                    } else {
                                        gy61Var6.g = 2;
                                        gy61Var6.i();
                                    }
                                }
                            }
                            if (this.x.e == 2) {
                                int i8 = 0;
                                while (true) {
                                    gy61[] gy61VarArr6 = this.b;
                                    if (i8 >= gy61VarArr6.length) {
                                        break;
                                    }
                                    if (b(gy61VarArr6[i8]) && (dg81Var = this.b[i8].h) == td71Var18.c[i8]) {
                                        dg81Var.getClass();
                                        dg81Var.a();
                                    }
                                    i8++;
                                }
                                hp71 hp71Var5 = this.x;
                                if (!hp71Var5.g && hp71Var5.q < 500000 && (td71Var = this.s.j) != null) {
                                    if ((!td71Var.d ? j2 : td71Var.a.i()) != Long.MIN_VALUE) {
                                        long j20 = this.P;
                                        xb71 xb71Var = this.q;
                                        if (j20 == -9223372036854775807L) {
                                            xb71Var.getClass();
                                            this.P = SystemClock.elapsedRealtime();
                                        } else {
                                            xb71Var.getClass();
                                            if (SystemClock.elapsedRealtime() - this.P >= 4000) {
                                                ny61.r("Playback stuck buffering and not loading");
                                                return;
                                            }
                                        }
                                        boolean z24 = (l() || this.x.e != 3) ? false : z4;
                                        if (this.I || !this.H || !z24) {
                                            z4 = false;
                                        }
                                        hp71Var = this.x;
                                        if (hp71Var.o == z4) {
                                            z5 = z24;
                                            z6 = z4;
                                            this.x = new hp71(hp71Var.a, hp71Var.b, hp71Var.c, hp71Var.d, hp71Var.e, hp71Var.f, hp71Var.g, hp71Var.h, hp71Var.i, hp71Var.j, hp71Var.k, hp71Var.l, hp71Var.m, hp71Var.n, hp71Var.p, hp71Var.q, hp71Var.r, z6);
                                        } else {
                                            z5 = z24;
                                            z6 = z4;
                                        }
                                        this.H = false;
                                        if (!z6 || (i2 = this.x.e) == 4) {
                                            return;
                                        }
                                        if (z5 || i2 == 2) {
                                            this.i.a.sendEmptyMessageAtTime(2, uptimeMillis + j3);
                                        } else if (i2 == 3 && this.J != 0) {
                                            this.i.a.sendEmptyMessageAtTime(2, uptimeMillis + j4);
                                        }
                                        dda1.h();
                                        return;
                                    }
                                }
                            }
                            this.P = -9223372036854775807L;
                            if (l()) {
                            }
                            if (this.I) {
                            }
                            z4 = false;
                            hp71Var = this.x;
                            if (hp71Var.o == z4) {
                            }
                            this.H = false;
                            if (z6) {
                                return;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (z3) {
                    if (hp71Var4.g) {
                        long j21 = a(hp71Var4.a, this.s.h.f.a) ? this.u.h : j5;
                        td71 td71Var20 = this.s.j;
                        boolean z25 = td71Var20.d && (!td71Var20.e || td71Var20.a.g() == Long.MIN_VALUE) && td71Var20.f.i;
                        boolean z26 = td71Var20.f.a.a() && !td71Var20.d;
                        if (!z25 && !z26) {
                            hi81 hi81Var = this.g;
                            long a5 = a(this.x.p);
                            float f = this.o.getPlaybackParameters().a;
                            boolean z27 = this.C;
                            hi81Var.getClass();
                            if (f != 1.0f) {
                                a5 = Math.round(a5 / f);
                            }
                            long j22 = z27 ? hi81Var.e : hi81Var.d;
                            if (j21 != j5) {
                                j22 = Math.min(j21 / 2, j22);
                            }
                            if (j22 > j2 && a5 < j22) {
                                if (!hi81Var.g) {
                                    xi71 xi71Var2 = hi81Var.a;
                                    synchronized (xi71Var2) {
                                        int i9 = xi71Var2.b * 65536;
                                    }
                                }
                            }
                            i = 3;
                        }
                    }
                    b(i);
                    this.O = null;
                    if (l()) {
                    }
                }
            }
            z4 = true;
            hp71 hp71Var6 = this.x;
            if (hp71Var6.e == 3) {
                if (this.J == 0) {
                    td71 td71Var21 = this.s.h;
                    long j23 = td71Var21.f.e;
                    if (td71Var21.d) {
                        if (j23 != j5) {
                            if (hp71Var6.r >= j23) {
                            }
                        }
                    }
                    this.C = l();
                    b(2);
                    if (this.C) {
                        for (td71 td71Var22 = this.s.h; td71Var22 != null; td71Var22 = td71Var22.l) {
                            for (gk71 gk71Var : td71Var22.n.c) {
                                if (gk71Var != null) {
                                    gk71Var.j();
                                }
                            }
                        }
                        bf81 bf81Var = this.u;
                        long j24 = bf81Var.h;
                        if (j24 != j5) {
                            long j25 = j24 + bf81Var.b;
                            bf81Var.h = j25;
                            long j26 = bf81Var.g;
                            if (j26 != j5 && j25 > j26) {
                                bf81Var.h = j26;
                            }
                            bf81Var.l = j5;
                        }
                    }
                    m();
                }
            }
            if (this.x.e == 2) {
            }
            this.P = -9223372036854775807L;
            if (l()) {
            }
            if (this.I) {
            }
            z4 = false;
            hp71Var = this.x;
            if (hp71Var.o == z4) {
            }
            this.H = false;
            if (z6) {
            }
        }
        z4 = true;
        if (this.x.e == 2) {
        }
        this.P = -9223372036854775807L;
        if (l()) {
        }
        if (this.I) {
        }
        z4 = false;
        hp71Var = this.x;
        if (hp71Var.o == z4) {
        }
        this.H = false;
        if (z6) {
        }
    }

    public final void b(long j) {
        td71 td71Var = this.s.h;
        long j2 = j + (td71Var == null ? 1000000000000L : td71Var.o);
        this.L = j2;
        this.o.a.c(j2);
        for (gy61 gy61Var : this.b) {
            if (b(gy61Var)) {
                long j3 = this.L;
                gy61Var.l = false;
                gy61Var.k = j3;
                gy61Var.a(j3, false);
            }
        }
        for (td71 td71Var2 = this.s.h; td71Var2 != null; td71Var2 = td71Var2.l) {
            for (gk71 gk71Var : td71Var2.n.c) {
                if (gk71Var != null) {
                    gk71Var.i();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, ra71] */
    public final void c(ra71 ra71Var) {
        td71 td71Var = this.s.j;
        if (td71Var != null) {
            gy61[] gy61VarArr = td71Var.i;
            ?? r3 = td71Var.a;
            if (r3 == ra71Var) {
                float f = this.o.getPlaybackParameters().a;
                yn81 yn81Var = this.x.a;
                td71Var.d = true;
                wx71 trackGroups = r3.getTrackGroups();
                td71Var.m = trackGroups;
                lu81 a = td71Var.j.a(gy61VarArr, trackGroups);
                for (gk71 gk71Var : a.c) {
                    if (gk71Var != null) {
                        gk71Var.l(f);
                    }
                }
                xj71 xj71Var = td71Var.f;
                long j = xj71Var.b;
                long j2 = xj71Var.e;
                if (j2 != -9223372036854775807L && j >= j2) {
                    j = Math.max(0L, j2 - 1);
                }
                long a2 = td71Var.a(a, j, false, new boolean[gy61VarArr.length]);
                long j3 = td71Var.o;
                xj71 xj71Var2 = td71Var.f;
                long j4 = xj71Var2.b;
                td71Var.o = (j4 - a2) + j3;
                if (a2 != j4) {
                    xj71Var2 = new xj71(xj71Var2.a, a2, xj71Var2.c, xj71Var2.d, xj71Var2.e, xj71Var2.f, xj71Var2.g, xj71Var2.h, xj71Var2.i);
                }
                td71Var.f = xj71Var2;
                a(td71Var.n);
                if (td71Var == this.s.h) {
                    b(td71Var.f.b);
                    a(new boolean[this.b.length]);
                    hp71 hp71Var = this.x;
                    v281 v281Var = hp71Var.b;
                    long j5 = td71Var.f.b;
                    this.x = a(v281Var, j5, hp71Var.c, j5, false, 5);
                }
                d();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, sn61] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, sn61] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, sn61] */
    public final void d() {
        int i;
        td71 td71Var = this.s.j;
        if (td71Var != null) {
            if ((!td71Var.d ? 0L : td71Var.a.i()) != Long.MIN_VALUE) {
                td71 td71Var2 = this.s.j;
                long a = a(td71Var2.d ? td71Var2.a.i() : 0L);
                td71 td71Var3 = this.s.h;
                hi81 hi81Var = this.g;
                float f = this.o.getPlaybackParameters().a;
                xi71 xi71Var = hi81Var.a;
                synchronized (xi71Var) {
                    i = xi71Var.b * 65536;
                }
                boolean z = i >= hi81Var.i;
                long j = hi81Var.b;
                if (f > 1.0f) {
                    int i2 = rf71.a;
                    if (f != 1.0f) {
                        j = Math.round(j * f);
                    }
                    j = Math.min(j, hi81Var.c);
                }
                if (a < Math.max(j, 500000L)) {
                    r1 = hi81Var.g || !z;
                    hi81Var.j = r1;
                    if (!r1 && a < 500000) {
                        nba1.e();
                    }
                } else if (a >= hi81Var.c || z) {
                    hi81Var.j = false;
                }
                r1 = hi81Var.j;
            }
        }
        this.D = r1;
        if (r1) {
            td71 td71Var4 = this.s.j;
            long j2 = this.L;
            if (td71Var4.l != null) {
                ny61.k();
                return;
            }
            td71Var4.a.k(j2 - td71Var4.o);
        }
        n();
    }

    public final void e(boolean z) {
        this.F = z;
        en71 en71Var = this.s;
        yn81 yn81Var = this.x.a;
        en71Var.g = z;
        if (!en71Var.i(yn81Var)) {
            b(true);
        }
        a(false);
    }

    public final void f() {
        this.y.a(1);
        throw null;
    }

    public final void g() {
        this.y.a(1);
        a(false, false, false, true);
        this.g.b(false);
        b(this.x.a.c() ? 4 : 2);
        ov81 ov81Var = this.t;
        cj71 cj71Var = (cj71) this.h;
        cj71Var.getClass();
        boolean z = ov81Var.k;
        ArrayList arrayList = ov81Var.b;
        if (z) {
            ny61.k();
            return;
        }
        ov81Var.l = cj71Var;
        for (int i = 0; i < arrayList.size(); i++) {
            vs81 vs81Var = (vs81) arrayList.get(i);
            ov81Var.d(vs81Var);
            ov81Var.i.add(vs81Var);
        }
        ov81Var.k = true;
        this.i.a.sendEmptyMessage(2);
    }

    public final synchronized boolean h() {
        if (!this.z && this.j.isAlive()) {
            this.i.a.sendEmptyMessage(7);
            a(new tm61(2, this), this.v);
            return this.z;
        }
        return true;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z;
        td71 td71Var;
        try {
            switch (message.what) {
                case 0:
                    g();
                    break;
                case 1:
                    a(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    a();
                    break;
                case 3:
                    a((y581) message.obj);
                    break;
                case 4:
                    a((kv71) message.obj);
                    break;
                case 5:
                    this.w = (lb71) message.obj;
                    break;
                case 6:
                    a(false, true);
                    break;
                case 7:
                    i();
                    return true;
                case 8:
                    c((ra71) message.obj);
                    break;
                case 9:
                    b((ra71) message.obj);
                    break;
                case 10:
                    j();
                    break;
                case 11:
                    a(message.arg1);
                    break;
                case 12:
                    e(message.arg1 != 0);
                    break;
                case 13:
                    a(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    s371 s371Var = (s371) message.obj;
                    s371Var.getClass();
                    c(s371Var);
                    break;
                case 15:
                    d((s371) message.obj);
                    break;
                case 16:
                    kv71 kv71Var = (kv71) message.obj;
                    a(kv71Var, kv71Var.a, true, false);
                    break;
                case 17:
                    a((gt71) message.obj);
                    break;
                case 18:
                    a((gt71) message.obj, message.arg1);
                    break;
                case 19:
                    if (message.obj != null) {
                        throw new ClassCastException();
                    }
                    f();
                    throw null;
                case 20:
                    a(message.arg1, message.arg2, (zj61) message.obj);
                    break;
                case 21:
                    a((zj61) message.obj);
                    break;
                case 22:
                    e();
                    break;
                case 23:
                    d(message.arg1 != 0);
                    break;
                case 24:
                    c(message.arg1 == 1);
                    break;
                case 25:
                    b(true);
                    break;
                default:
                    return false;
            }
        } catch (RuntimeException e) {
            zm0 zm0Var = new zm0(2, e, ((e instanceof IllegalStateException) || (e instanceof IllegalArgumentException)) ? 1004 : 1000);
            nba1.c("ExoPlayerImplInternal", nba1.b("Playback error", zm0Var));
            a(true, false);
            this.x = this.x.e(zm0Var);
        } catch (aa2 e2) {
            int i = e2.c;
            if (i == 1) {
                r4 = e2.b ? 3001 : 3003;
            } else if (i == 4) {
                r4 = e2.b ? 3002 : 3004;
            }
            a(e2, r4);
        } catch (h30 e3) {
            a(e3, e3.b);
        } catch (lk0 e4) {
            a(e4, e4.b);
        } catch (po e5) {
            a(e5, 1002);
        } catch (IOException e6) {
            a(e6, 2000);
        } catch (zm0 e7) {
            e = e7;
            if (e.d == 1 && (td71Var = this.s.i) != null) {
                v281 v281Var = td71Var.f.a;
                String message2 = e.getMessage();
                int i2 = rf71.a;
                e = new zm0(message2, e.getCause(), e.b, e.d, e.e, e.f, e.g, e.h, v281Var, e.c, e.j);
            }
            if (e.j && this.O == null) {
                nba1.b("Recoverable renderer error", e);
                nba1.e();
                this.O = e;
                rl71 rl71Var = this.i;
                fi71 b = rl71Var.b(25, e);
                Handler handler = rl71Var.a;
                Message message3 = b.a;
                message3.getClass();
                handler.sendMessageAtFrontOfQueue(message3);
                b.a();
                z = false;
            } else {
                zm0 zm0Var2 = this.O;
                if (zm0Var2 != null) {
                    zm0Var2.addSuppressed(e);
                    e = this.O;
                }
                nba1.c("ExoPlayerImplInternal", nba1.b("Playback error", e));
                z = false;
                a(true, false);
                this.x = this.x.e(e);
            }
        }
        z = false;
        lw71 lw71Var = this.y;
        hp71 hp71Var = this.x;
        boolean z2 = lw71Var.a | (lw71Var.b != hp71Var ? true : z);
        lw71Var.a = z2;
        lw71Var.b = hp71Var;
        if (!z2) {
            return true;
        }
        ek71 ek71Var = ((ck71) this.r).a;
        ek71Var.i.a.post(new fe71(3, ek71Var, lw71Var));
        this.y = new lw71(this.x);
        return true;
    }

    public final void i() {
        a(true, false, true, false);
        this.g.b(true);
        b(1);
        this.j.quit();
        synchronized (this) {
            this.z = true;
            notifyAll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v8 */
    public final void j() {
        int i;
        boolean z;
        int i2;
        float f = this.o.getPlaybackParameters().a;
        en71 en71Var = this.s;
        td71 td71Var = en71Var.h;
        td71 td71Var2 = en71Var.i;
        boolean z2 = true;
        for (td71 td71Var3 = td71Var; td71Var3 != null && td71Var3.d; td71Var3 = td71Var3.l) {
            yn81 yn81Var = this.x.a;
            lu81 a = td71Var3.j.a(td71Var3.i, td71Var3.m);
            boolean z3 = false;
            for (gk71 gk71Var : a.c) {
                if (gk71Var != null) {
                    gk71Var.l(f);
                }
            }
            lu81 lu81Var = td71Var3.n;
            if (lu81Var != null && lu81Var.c.length == a.c.length) {
                for (0; i2 < a.c.length; i2 + 1) {
                    i2 = (rf71.o(a.b[i2], lu81Var.b[i2]) && rf71.o(a.c[i2], lu81Var.c[i2])) ? i2 + 1 : 0;
                }
                if (td71Var3 == td71Var2) {
                    z2 = false;
                }
            }
            en71 en71Var2 = this.s;
            if (z2) {
                td71 td71Var4 = en71Var2.h;
                boolean h = en71Var2.h(td71Var4);
                boolean[] zArr = new boolean[this.b.length];
                long a2 = td71Var4.a(a, this.x.r, h, zArr);
                hp71 hp71Var = this.x;
                if (hp71Var.e == 4 || a2 == hp71Var.r) {
                    z = false;
                } else {
                    z = false;
                    z3 = true;
                }
                hp71 hp71Var2 = this.x;
                boolean z4 = z;
                i = 4;
                this.x = a(hp71Var2.b, a2, hp71Var2.c, hp71Var2.d, z3, 5);
                if (z3) {
                    b(a2);
                }
                boolean[] zArr2 = new boolean[this.b.length];
                ?? r8 = z4;
                while (true) {
                    gy61[] gy61VarArr = this.b;
                    if (r8 >= gy61VarArr.length) {
                        break;
                    }
                    gy61 gy61Var = gy61VarArr[r8];
                    boolean b = b(gy61Var);
                    zArr2[r8] = b;
                    dg81 dg81Var = td71Var4.c[r8];
                    if (b) {
                        if (dg81Var != gy61Var.h) {
                            a(gy61Var);
                        } else if (zArr[r8]) {
                            long j = this.L;
                            gy61Var.l = z4;
                            gy61Var.k = j;
                            gy61Var.a(j, z4);
                        }
                    }
                    r8++;
                }
                a(zArr2);
            } else {
                i = 4;
                en71Var2.h(td71Var3);
                if (td71Var3.d) {
                    td71Var3.a(a, Math.max(td71Var3.f.b, this.L - td71Var3.o), false, new boolean[td71Var3.i.length]);
                }
            }
            a(true);
            if (this.x.e != i) {
                d();
                o();
                this.i.a.sendEmptyMessage(2);
                return;
            }
            return;
        }
    }

    public final void k() {
        td71 td71Var = this.s.h;
        this.B = td71Var != null && td71Var.f.h && this.A;
    }

    public final boolean l() {
        hp71 hp71Var = this.x;
        return hp71Var.l && hp71Var.m == 0;
    }

    public final void m() {
        int i;
        wo81 wo81Var = this.o;
        wo81Var.y = false;
        qzt0 qzt0Var = wo81Var.a;
        if (qzt0Var.c) {
            qzt0Var.c(qzt0Var.a());
            qzt0Var.c = false;
        }
        for (gy61 gy61Var : this.b) {
            if (b(gy61Var) && (i = gy61Var.g) == 2) {
                if (i != 2) {
                    ny61.k();
                    return;
                } else {
                    gy61Var.g = 1;
                    gy61Var.j();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, sn61] */
    public final void n() {
        td71 td71Var = this.s.j;
        boolean z = this.D || (td71Var != null && td71Var.a.isLoading());
        hp71 hp71Var = this.x;
        if (z != hp71Var.g) {
            this.x = new hp71(hp71Var.a, hp71Var.b, hp71Var.c, hp71Var.d, hp71Var.e, hp71Var.f, z, hp71Var.h, hp71Var.i, hp71Var.j, hp71Var.k, hp71Var.l, hp71Var.m, hp71Var.n, hp71Var.p, hp71Var.q, hp71Var.r, hp71Var.o);
        }
    }

    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, ra71] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, sn61] */
    public final void o() {
        long j;
        long j2;
        float f;
        td71 td71Var = this.s.h;
        if (td71Var == null) {
            return;
        }
        long f2 = td71Var.d ? td71Var.a.f() : -9223372036854775807L;
        if (f2 != -9223372036854775807L) {
            b(f2);
            if (f2 != this.x.r) {
                hp71 hp71Var = this.x;
                this.x = a(hp71Var.b, f2, hp71Var.c, f2, true, 5);
            }
        } else {
            wo81 wo81Var = this.o;
            boolean z = td71Var != this.s.i;
            gy61 gy61Var = wo81Var.c;
            if (gy61Var == null || gy61Var.e() || (!wo81Var.c.f() && (z || wo81Var.c.d()))) {
                wo81Var.x = true;
                if (wo81Var.y) {
                    qzt0 qzt0Var = wo81Var.a;
                    if (!qzt0Var.c) {
                        ((xb71) qzt0Var.w).getClass();
                        qzt0Var.b = SystemClock.elapsedRealtime();
                        qzt0Var.c = true;
                    }
                }
            } else {
                lf81 lf81Var = wo81Var.w;
                lf81Var.getClass();
                long a = lf81Var.a();
                if (wo81Var.x) {
                    if (a < wo81Var.a.a()) {
                        qzt0 qzt0Var2 = wo81Var.a;
                        if (qzt0Var2.c) {
                            qzt0Var2.c(qzt0Var2.a());
                            qzt0Var2.c = false;
                        }
                    } else {
                        wo81Var.x = false;
                        if (wo81Var.y) {
                            qzt0 qzt0Var3 = wo81Var.a;
                            if (!qzt0Var3.c) {
                                ((xb71) qzt0Var3.w).getClass();
                                qzt0Var3.b = SystemClock.elapsedRealtime();
                                qzt0Var3.c = true;
                            }
                        }
                    }
                }
                wo81Var.a.c(a);
                kv71 playbackParameters = lf81Var.getPlaybackParameters();
                if (!playbackParameters.equals((kv71) wo81Var.a.x)) {
                    wo81Var.a.e(playbackParameters);
                    wo81Var.b.i.b(16, playbackParameters).b();
                }
            }
            long a2 = wo81Var.a();
            this.L = a2;
            long j3 = a2 - td71Var.o;
            long j4 = this.x.r;
            if (!this.p.isEmpty() && !this.x.b.a()) {
                if (this.N) {
                    this.N = false;
                }
                hp71 hp71Var2 = this.x;
                hp71Var2.a.a(hp71Var2.b.a);
                int min = Math.min(this.M, this.p.size());
                if (min > 0 && this.p.get(min - 1) != null) {
                    ny61.u();
                    return;
                } else {
                    if (min < this.p.size() && this.p.get(min) != null) {
                        ny61.u();
                        return;
                    }
                    this.M = min;
                }
            }
            this.x.r = j3;
        }
        td71 td71Var2 = this.s.j;
        hp71 hp71Var3 = this.x;
        if (td71Var2.d) {
            long g = td71Var2.e ? td71Var2.a.g() : Long.MIN_VALUE;
            j = g == Long.MIN_VALUE ? td71Var2.f.e : g;
        } else {
            j = td71Var2.f.b;
        }
        hp71Var3.p = j;
        hp71 hp71Var4 = this.x;
        hp71Var4.q = a(hp71Var4.p);
        hp71 hp71Var5 = this.x;
        if (hp71Var5.l && hp71Var5.e == 3 && a(hp71Var5.a, hp71Var5.b)) {
            hp71 hp71Var6 = this.x;
            float f3 = 1.0f;
            if (hp71Var6.n.a == 1.0f) {
                bf81 bf81Var = this.u;
                long a3 = a(hp71Var6.a, hp71Var6.b.a, hp71Var6.r);
                long a4 = a(this.x.p);
                if (bf81Var.c != -9223372036854775807L) {
                    long j5 = a3 - a4;
                    long j6 = bf81Var.m;
                    if (j6 == -9223372036854775807L) {
                        bf81Var.m = j5;
                        bf81Var.n = 0L;
                        j2 = -9223372036854775807L;
                    } else {
                        j2 = -9223372036854775807L;
                        bf81Var.m = Math.max(j5, (long) ((j5 * 9.999871E-4f) + (j6 * 0.999f)));
                        bf81Var.n = (long) ((Math.abs(j5 - r9) * 9.999871E-4f) + (bf81Var.n * 0.999f));
                    }
                    if (bf81Var.l == j2 || SystemClock.elapsedRealtime() - bf81Var.l >= 1000) {
                        bf81Var.l = SystemClock.elapsedRealtime();
                        long j7 = (bf81Var.n * 3) + bf81Var.m;
                        if (bf81Var.h > j7) {
                            float g2 = rf71.g(1000L);
                            f = 1.0E-7f;
                            long[] jArr = {j7, bf81Var.e, bf81Var.h - (((long) ((bf81Var.k - 1.0f) * g2)) + ((long) ((bf81Var.i - 1.0f) * g2)))};
                            long j8 = jArr[0];
                            for (int i = 1; i < 3; i++) {
                                long j9 = jArr[i];
                                if (j9 > j8) {
                                    j8 = j9;
                                }
                            }
                            bf81Var.h = j8;
                        } else {
                            f = 1.0E-7f;
                            long max = a3 - ((long) (Math.max(0.0f, bf81Var.k - 1.0f) / 1.0E-7f));
                            long j10 = bf81Var.h;
                            int i2 = rf71.a;
                            long max2 = Math.max(j10, Math.min(max, j7));
                            bf81Var.h = max2;
                            long j11 = bf81Var.g;
                            if (j11 != j2 && max2 > j11) {
                                bf81Var.h = j11;
                            }
                        }
                        long j12 = a3 - bf81Var.h;
                        if (Math.abs(j12) < bf81Var.a) {
                            bf81Var.k = 1.0f;
                        } else {
                            float f4 = (j12 * f) + 1.0f;
                            float f5 = bf81Var.j;
                            float f6 = bf81Var.i;
                            int i3 = rf71.a;
                            bf81Var.k = Math.max(f5, Math.min(f4, f6));
                        }
                        f3 = bf81Var.k;
                    } else {
                        f3 = bf81Var.k;
                    }
                }
                if (this.o.getPlaybackParameters().a != f3) {
                    this.o.e(new kv71(f3, this.x.n.b));
                    a(this.x.n, this.o.getPlaybackParameters().a, false, false);
                }
            }
        }
    }

    public final void e() {
        a(this.t.a(), true);
    }

    public final void b(int i) {
        hp71 hp71Var = this.x;
        if (hp71Var.e != i) {
            if (i != 2) {
                this.P = -9223372036854775807L;
            }
            this.x = hp71Var.a(i);
        }
    }

    public final void b(boolean z) {
        v281 v281Var = this.s.h.f.a;
        long a = a(v281Var, this.x.r, true, false);
        if (a != this.x.r) {
            hp71 hp71Var = this.x;
            this.x = a(v281Var, a, hp71Var.c, hp71Var.d, z, 5);
        }
    }

    public static boolean b(gy61 gy61Var) {
        return gy61Var.g != 0;
    }

    public final void b(s371 s371Var) {
        try {
            a(s371Var);
        } catch (zm0 e) {
            nba1.c("ExoPlayerImplInternal", nba1.b("Unexpected error delivering message on external thread.", e));
            ny61.j(e);
        }
    }

    public final long b() {
        td71 td71Var = this.s.i;
        if (td71Var == null) {
            return 0L;
        }
        long j = td71Var.o;
        if (!td71Var.d) {
            return j;
        }
        int i = 0;
        while (true) {
            gy61[] gy61VarArr = this.b;
            if (i >= gy61VarArr.length) {
                return j;
            }
            if (b(gy61VarArr[i])) {
                gy61 gy61Var = this.b[i];
                if (gy61Var.h != td71Var.c[i]) {
                    continue;
                } else {
                    long j2 = gy61Var.k;
                    if (j2 == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    j = Math.max(j2, j);
                }
            }
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, sn61] */
    public final void b(ra71 ra71Var) {
        ?? r1;
        td71 td71Var = this.s.j;
        if (td71Var == null || (r1 = td71Var.a) != ra71Var) {
            return;
        }
        long j = this.L;
        if (td71Var.l == null) {
            if (td71Var.d) {
                r1.h(j - td71Var.o);
            }
            d();
            return;
        }
        ny61.k();
    }

    public final void d(boolean z) {
        this.A = z;
        k();
        if (this.B) {
            en71 en71Var = this.s;
            if (en71Var.i != en71Var.h) {
                b(true);
                a(false);
            }
        }
    }

    public final void d(s371 s371Var) {
        Looper looper = s371Var.f;
        if (!looper.getThread().isAlive()) {
            nba1.e();
            s371Var.c(false);
        } else {
            this.q.getClass();
            new Handler(looper, null).post(new fe71(9, this, s371Var));
        }
    }

    public final /* synthetic */ Boolean c() {
        return Boolean.valueOf(this.z);
    }

    public final void c(boolean z) {
        if (z == this.I) {
            return;
        }
        this.I = z;
        if (z || !this.x.o) {
            return;
        }
        this.i.a.sendEmptyMessage(2);
    }

    public final void c(s371 s371Var) {
        if (s371Var.f == this.k) {
            a(s371Var);
            int i = this.x.e;
            if (i == 3 || i == 2) {
                this.i.a.sendEmptyMessage(2);
                return;
            }
            return;
        }
        this.i.b(15, s371Var).b();
    }

    public final void a(IOException iOException, int i) {
        zm0 zm0Var = new zm0(0, iOException, i);
        td71 td71Var = this.s.h;
        if (td71Var != null) {
            v281 v281Var = td71Var.f.a;
            String message = zm0Var.getMessage();
            int i2 = rf71.a;
            zm0Var = new zm0(message, zm0Var.getCause(), zm0Var.b, zm0Var.d, zm0Var.e, zm0Var.f, zm0Var.g, zm0Var.h, v281Var, zm0Var.c, zm0Var.j);
        }
        nba1.c("ExoPlayerImplInternal", nba1.b("Playback error", zm0Var));
        a(false, false);
        this.x = this.x.e(zm0Var);
    }

    public static void a(gy61 gy61Var, long j) {
        gy61Var.l = true;
        if (gy61Var instanceof d43) {
            d43 d43Var = (d43) gy61Var;
            if (d43Var.l) {
                d43Var.B = j;
            } else {
                ny61.k();
            }
        }
    }

    @Override // defpackage.e771
    public final void a(ra71 ra71Var) {
        this.i.b(8, ra71Var).b();
    }

    public final synchronized void a(pg61 pg61Var, long j) {
        this.q.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!((Boolean) pg61Var.get()).booleanValue() && j > 0) {
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

    public final void a(gt71 gt71Var) {
        this.y.a(1);
        int i = gt71Var.c;
        zj61 zj61Var = gt71Var.b;
        ArrayList arrayList = gt71Var.a;
        if (i != -1) {
            this.K = new y581(new ii81(arrayList, zj61Var), gt71Var.c, gt71Var.d);
        }
        ov81 ov81Var = this.t;
        ov81Var.c(0, ov81Var.b.size());
        a(ov81Var.b(ov81Var.b.size(), arrayList, zj61Var), false);
    }

    public final void a(gt71 gt71Var, int i) {
        this.y.a(1);
        ov81 ov81Var = this.t;
        if (i == -1) {
            i = ov81Var.b.size();
        }
        a(ov81Var.b(i, gt71Var.a, gt71Var.b), false);
    }

    public final void a(int i, int i2, zj61 zj61Var) {
        this.y.a(1);
        ov81 ov81Var = this.t;
        ov81Var.getClass();
        if (i >= 0 && i <= i2 && i2 <= ov81Var.b.size()) {
            ov81Var.j = zj61Var;
            ov81Var.c(i, i2);
            a(ov81Var.a(), false);
            return;
        }
        w511.q();
    }

    public final void a(zj61 zj61Var) {
        this.y.a(1);
        ov81 ov81Var = this.t;
        int size = ov81Var.b.size();
        if (zj61Var.b.length != size) {
            zj61Var = new zj61(new Random(zj61Var.a.nextLong())).a(size);
        }
        ov81Var.j = zj61Var;
        a(ov81Var.a(), false);
    }

    public final void a(boolean z, int i, boolean z2, int i2) {
        this.y.a(z2 ? 1 : 0);
        lw71 lw71Var = this.y;
        lw71Var.a = true;
        lw71Var.f = true;
        lw71Var.g = i2;
        hp71 hp71Var = this.x;
        this.x = new hp71(hp71Var.a, hp71Var.b, hp71Var.c, hp71Var.d, hp71Var.e, hp71Var.f, hp71Var.g, hp71Var.h, hp71Var.i, hp71Var.j, hp71Var.k, z, i, hp71Var.n, hp71Var.p, hp71Var.q, hp71Var.r, hp71Var.o);
        this.C = false;
        for (td71 td71Var = this.s.h; td71Var != null; td71Var = td71Var.l) {
            for (gk71 gk71Var : td71Var.n.c) {
                if (gk71Var != null) {
                    gk71Var.a(z);
                }
            }
        }
        if (!l()) {
            m();
            o();
            return;
        }
        int i3 = this.x.e;
        if (i3 != 3) {
            if (i3 == 2) {
                this.i.a.sendEmptyMessage(2);
                return;
            }
            return;
        }
        this.C = false;
        wo81 wo81Var = this.o;
        wo81Var.y = true;
        qzt0 qzt0Var = wo81Var.a;
        if (!qzt0Var.c) {
            ((xb71) qzt0Var.w).getClass();
            qzt0Var.b = SystemClock.elapsedRealtime();
            qzt0Var.c = true;
        }
        for (gy61 gy61Var : this.b) {
            if (b(gy61Var)) {
                if (gy61Var.g == 1) {
                    gy61Var.g = 2;
                    gy61Var.i();
                } else {
                    ny61.k();
                    return;
                }
            }
        }
        this.i.a.sendEmptyMessage(2);
    }

    public final void a(int i) {
        this.E = i;
        en71 en71Var = this.s;
        yn81 yn81Var = this.x.a;
        en71Var.f = i;
        if (!en71Var.i(yn81Var)) {
            b(true);
        }
        a(false);
    }

    @Override // defpackage.yj61
    public final void a(sn61 sn61Var) {
        this.i.b(9, (ra71) sn61Var).b();
    }

    public final long a(yn81 yn81Var, Object obj, long j) {
        long elapsedRealtime;
        yn81Var.a(yn81Var.a(obj, this.m).c, this.l, 0L);
        uk81 uk81Var = this.l;
        if (uk81Var.x != -9223372036854775807L && uk81Var.b()) {
            uk81 uk81Var2 = this.l;
            if (uk81Var2.A) {
                long j2 = uk81Var2.y;
                int i = rf71.a;
                if (j2 == -9223372036854775807L) {
                    elapsedRealtime = System.currentTimeMillis();
                } else {
                    elapsedRealtime = j2 + SystemClock.elapsedRealtime();
                }
                return rf71.g(elapsedRealtime - this.l.x) - (j + this.m.x);
            }
        }
        return -9223372036854775807L;
    }

    public final boolean a(yn81 yn81Var, v281 v281Var) {
        if (!v281Var.a() && !yn81Var.c()) {
            yn81Var.a(yn81Var.a(v281Var.a, this.m).c, this.l, 0L);
            if (this.l.b()) {
                uk81 uk81Var = this.l;
                if (uk81Var.A && uk81Var.x != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, ra71] */
    public final void a(y581 y581Var) {
        long longValue;
        v281 f;
        long j;
        boolean z;
        long j2;
        boolean z2;
        v281 v281Var;
        long j3;
        long D;
        long j4;
        hp71 hp71Var;
        int i;
        v281 v281Var2;
        boolean z3;
        long j5;
        this.y.a(1);
        Pair a = a(this.x.a, y581Var, true, this.E, this.F, this.l, this.m);
        if (a == null) {
            Pair a2 = a(this.x.a);
            f = (v281) a2.first;
            longValue = ((Long) a2.second).longValue();
            z = !this.x.a.c();
            j2 = -9223372036854775807L;
            j = 0;
        } else {
            Object obj = a.first;
            longValue = ((Long) a.second).longValue();
            long j6 = y581Var.c == -9223372036854775807L ? -9223372036854775807L : longValue;
            f = this.s.f(this.x.a, obj, longValue);
            if (f.a()) {
                this.x.a.a(f.a, this.m);
                longValue = this.m.a(f.b) == f.c ? this.m.z.b : 0L;
                j = 0;
            } else {
                j = 0;
                if (y581Var.c != -9223372036854775807L) {
                    z = false;
                    j2 = j6;
                }
            }
            z = true;
            j2 = j6;
        }
        try {
            if (this.x.a.c()) {
                this.K = y581Var;
            } else {
                hp71 hp71Var2 = this.x;
                if (a == null) {
                    if (hp71Var2.e != 1) {
                        b(4);
                    }
                    a(false, true, false, true);
                } else {
                    if (f.equals(hp71Var2.b)) {
                        try {
                            td71 td71Var = this.s.h;
                            D = (td71Var == null || !td71Var.d || longValue == j) ? longValue : td71Var.a.D(longValue, this.w);
                            if (rf71.u(D) != rf71.u(this.x.r) || ((i = (hp71Var = this.x).e) != 2 && i != 3)) {
                                z2 = z;
                                j4 = j2;
                                v281Var = f;
                            }
                            long j7 = hp71Var.r;
                            this.x = a(f, j7, j2, j7, z, 2);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            z2 = z;
                            v281Var = f;
                            j3 = longValue;
                            this.x = a(v281Var, j3, j2, j3, z2, 2);
                            throw th;
                        }
                    }
                    z2 = z;
                    j4 = j2;
                    v281Var = f;
                    D = longValue;
                    try {
                        boolean z4 = this.x.e == 4;
                        en71 en71Var = this.s;
                        long a3 = a(v281Var, D, en71Var.h != en71Var.i, z4);
                        boolean z5 = z2 | (longValue != a3);
                        try {
                            hp71 hp71Var3 = this.x;
                            v281 v281Var3 = v281Var;
                            try {
                                yn81 yn81Var = hp71Var3.a;
                                long j8 = j4;
                                try {
                                    a(yn81Var, v281Var3, yn81Var, hp71Var3.b, j8);
                                    v281Var2 = v281Var3;
                                    j2 = j8;
                                    z3 = z5;
                                    j5 = a3;
                                    this.x = a(v281Var2, j5, j2, j5, z3, 2);
                                } catch (Throwable th2) {
                                    th = th2;
                                    v281Var = v281Var3;
                                    j2 = j8;
                                    z2 = z5;
                                    j3 = a3;
                                    this.x = a(v281Var, j3, j2, j3, z2, 2);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                v281Var = v281Var3;
                                j2 = j4;
                                z2 = z5;
                                j3 = a3;
                                this.x = a(v281Var, j3, j2, j3, z2, 2);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        j2 = j4;
                        j3 = longValue;
                        this.x = a(v281Var, j3, j2, j3, z2, 2);
                        throw th;
                    }
                }
            }
            z3 = z;
            v281Var2 = f;
            j5 = longValue;
            this.x = a(v281Var2, j5, j2, j5, z3, 2);
        } catch (Throwable th6) {
            th = th6;
            z2 = z;
        }
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, ra71] */
    public final long a(v281 v281Var, long j, boolean z, boolean z2) {
        en71 en71Var;
        long j2;
        long j3;
        td71 td71Var;
        m();
        this.C = false;
        if (z2 || this.x.e == 3) {
            b(2);
        }
        td71 td71Var2 = this.s.h;
        td71 td71Var3 = td71Var2;
        while (td71Var3 != null && !v281Var.equals(td71Var3.f.a)) {
            td71Var3 = td71Var3.l;
        }
        if (z || td71Var2 != td71Var3 || (td71Var3 != null && j + td71Var3.o < 0)) {
            for (gy61 gy61Var : this.b) {
                a(gy61Var);
            }
            if (td71Var3 != null) {
                while (true) {
                    en71Var = this.s;
                    if (en71Var.h == td71Var3) {
                        break;
                    }
                    en71Var.a();
                }
                en71Var.h(td71Var3);
                td71Var3.o = 1000000000000L;
                a(new boolean[this.b.length]);
            }
        }
        en71 en71Var2 = this.s;
        if (td71Var3 != null) {
            ?? r4 = td71Var3.a;
            en71Var2.h(td71Var3);
            if (!td71Var3.d) {
                xj71 xj71Var = td71Var3.f;
                if (j == xj71Var.b) {
                    j3 = j;
                    td71Var = td71Var3;
                } else {
                    td71Var = td71Var3;
                    j3 = j;
                    xj71Var = new xj71(xj71Var.a, j, xj71Var.c, xj71Var.d, xj71Var.e, xj71Var.f, xj71Var.g, xj71Var.h, xj71Var.i);
                }
                td71Var.f = xj71Var;
            } else {
                j3 = j;
                if (td71Var3.e) {
                    j2 = r4.e(j3);
                    r4.a(j2 - this.n);
                    b(j2);
                    d();
                }
            }
            j2 = j3;
            b(j2);
            d();
        } else {
            en71Var2.l();
            b(j);
            j2 = j;
        }
        a(false);
        this.i.a.sendEmptyMessage(2);
        return j2;
    }

    public final void a(kv71 kv71Var) {
        this.o.e(kv71Var);
        kv71 playbackParameters = this.o.getPlaybackParameters();
        a(playbackParameters, playbackParameters.a, true, true);
    }

    public final void a(boolean z, AtomicBoolean atomicBoolean) {
        if (this.G != z) {
            this.G = z;
            if (!z) {
                for (gy61 gy61Var : this.b) {
                    if (!b(gy61Var) && this.c.remove(gy61Var)) {
                        if (gy61Var.g == 0) {
                            og81 og81Var = gy61Var.c;
                            og81Var.a = null;
                            og81Var.b = null;
                            gy61Var.h();
                        } else {
                            ny61.k();
                            return;
                        }
                    }
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

    public final void a(boolean z, boolean z2) {
        a(z || !this.G, false, true, false);
        this.y.a(z2 ? 1 : 0);
        this.g.b(true);
        b(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        boolean z5;
        List list;
        this.i.a.removeMessages(2);
        this.O = null;
        this.C = false;
        wo81 wo81Var = this.o;
        wo81Var.y = false;
        qzt0 qzt0Var = wo81Var.a;
        if (qzt0Var.c) {
            qzt0Var.c(qzt0Var.a());
            qzt0Var.c = false;
        }
        this.L = 1000000000000L;
        for (gy61 gy61Var : this.b) {
            try {
                a(gy61Var);
            } catch (RuntimeException | zm0 e) {
                nba1.c("ExoPlayerImplInternal", nba1.b("Disable failed.", e));
            }
        }
        if (z) {
            for (gy61 gy61Var2 : this.b) {
                if (this.c.remove(gy61Var2)) {
                    try {
                        if (gy61Var2.g == 0) {
                            og81 og81Var = gy61Var2.c;
                            og81Var.a = null;
                            og81Var.b = null;
                            gy61Var2.h();
                        } else {
                            throw new IllegalStateException();
                        }
                    } catch (RuntimeException e2) {
                        nba1.c("ExoPlayerImplInternal", nba1.b("Reset failed.", e2));
                    }
                }
            }
        }
        this.J = 0;
        hp71 hp71Var = this.x;
        v281 v281Var = hp71Var.b;
        long j2 = hp71Var.r;
        if (!this.x.b.a()) {
            hp71 hp71Var2 = this.x;
            ie81 ie81Var = this.m;
            v281 v281Var2 = hp71Var2.b;
            yn81 yn81Var = hp71Var2.a;
            if (!yn81Var.c() && !yn81Var.a(v281Var2.a, ie81Var).y) {
                j = this.x.r;
                if (z2) {
                    this.K = null;
                    Pair a = a(this.x.a);
                    v281Var = (v281) a.first;
                    j2 = ((Long) a.second).longValue();
                    j = -9223372036854775807L;
                    if (!v281Var.equals(this.x.b)) {
                        z5 = true;
                        long j3 = j2;
                        v281 v281Var3 = v281Var;
                        this.s.l();
                        this.D = false;
                        hp71 hp71Var3 = this.x;
                        yn81 yn81Var2 = hp71Var3.a;
                        int i = hp71Var3.e;
                        zm0 zm0Var = z4 ? null : hp71Var3.f;
                        wx71 wx71Var = z5 ? wx71.w : hp71Var3.h;
                        lu81 lu81Var = z5 ? this.f : hp71Var3.i;
                        if (z5) {
                            p481 p481Var = t31.b;
                            list = wk2.x;
                        } else {
                            list = hp71Var3.j;
                        }
                        this.x = new hp71(yn81Var2, v281Var3, j, j3, i, zm0Var, false, wx71Var, lu81Var, list, v281Var3, hp71Var3.l, hp71Var3.m, hp71Var3.n, j3, 0L, j3, false);
                        if (z3) {
                            ov81 ov81Var = this.t;
                            for (qp81 qp81Var : ov81Var.h.values()) {
                                try {
                                    qp81Var.a.c(qp81Var.b);
                                } catch (RuntimeException e3) {
                                    nba1.c("MediaSourceList", nba1.b("Failed to release child source.", e3));
                                }
                                qp81Var.a.a((sf81) qp81Var.c);
                                qp81Var.a.a((cz71) qp81Var.c);
                            }
                            ov81Var.h.clear();
                            ov81Var.i.clear();
                            ov81Var.k = false;
                            return;
                        }
                        return;
                    }
                }
                z5 = false;
                long j32 = j2;
                v281 v281Var32 = v281Var;
                this.s.l();
                this.D = false;
                hp71 hp71Var32 = this.x;
                yn81 yn81Var22 = hp71Var32.a;
                int i2 = hp71Var32.e;
                if (z4) {
                }
                wx71 wx71Var2 = z5 ? wx71.w : hp71Var32.h;
                lu81 lu81Var2 = z5 ? this.f : hp71Var32.i;
                if (z5) {
                }
                this.x = new hp71(yn81Var22, v281Var32, j, j32, i2, zm0Var, false, wx71Var2, lu81Var2, list, v281Var32, hp71Var32.l, hp71Var32.m, hp71Var32.n, j32, 0L, j32, false);
                if (z3) {
                }
            }
        }
        j = this.x.c;
        if (z2) {
        }
        z5 = false;
        long j322 = j2;
        v281 v281Var322 = v281Var;
        this.s.l();
        this.D = false;
        hp71 hp71Var322 = this.x;
        yn81 yn81Var222 = hp71Var322.a;
        int i22 = hp71Var322.e;
        if (z4) {
        }
        wx71 wx71Var22 = z5 ? wx71.w : hp71Var322.h;
        lu81 lu81Var22 = z5 ? this.f : hp71Var322.i;
        if (z5) {
        }
        this.x = new hp71(yn81Var222, v281Var322, j, j322, i22, zm0Var, false, wx71Var22, lu81Var22, list, v281Var322, hp71Var322.l, hp71Var322.m, hp71Var322.n, j322, 0L, j322, false);
        if (z3) {
        }
    }

    public final Pair a(yn81 yn81Var) {
        long j = 0;
        if (yn81Var.c()) {
            return Pair.create(hp71.s, 0L);
        }
        Pair a = yn81Var.a(this.l, this.m, yn81Var.a(this.F), -9223372036854775807L);
        v281 f = this.s.f(yn81Var, a.first, 0L);
        long longValue = ((Long) a.second).longValue();
        if (f.a()) {
            yn81Var.a(f.a, this.m);
            if (f.c == this.m.a(f.b)) {
                j = this.m.z.b;
            }
        } else {
            j = longValue;
        }
        return Pair.create(f, Long.valueOf(j));
    }

    public static void a(s371 s371Var) {
        synchronized (s371Var) {
        }
        try {
            s371Var.a.a(s371Var.d, s371Var.e);
        } finally {
            s371Var.c(true);
        }
    }

    public final void a(yn81 yn81Var, yn81 yn81Var2) {
        if (yn81Var.c() && yn81Var2.c()) {
            return;
        }
        int size = this.p.size() - 1;
        ArrayList arrayList = this.p;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            arrayList.get(size).getClass();
            ny61.u();
        }
    }

    public final void a(gy61 gy61Var) {
        if (b(gy61Var)) {
            wo81 wo81Var = this.o;
            if (gy61Var == wo81Var.c) {
                wo81Var.w = null;
                wo81Var.c = null;
                wo81Var.x = true;
            }
            int i = gy61Var.g;
            if (i == 2) {
                if (i == 2) {
                    gy61Var.g = 1;
                    gy61Var.j();
                } else {
                    ny61.k();
                    return;
                }
            }
            if (gy61Var.g == 1) {
                og81 og81Var = gy61Var.c;
                og81Var.a = null;
                og81Var.b = null;
                gy61Var.g = 0;
                gy61Var.h = null;
                gy61Var.i = null;
                gy61Var.l = false;
                gy61Var.g();
                this.J--;
                return;
            }
            ny61.k();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:215:0x01fe, code lost:
    
        if ((r6.b != -1 ? r6.w[r10] : 0) != 2) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0213, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0211, code lost:
    
        if (r6.z.a(r5.b).z != false) goto L101;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0218 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0363 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03c9  */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(yn81 yn81Var, boolean z) {
        long j;
        uk81 uk81Var;
        int i;
        long j2;
        Object obj;
        long j3;
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        yn81 yn81Var2;
        long j4;
        long j5;
        v281 f;
        ?? r7;
        long j6;
        z281 z281Var;
        long j7;
        int i4;
        boolean z6;
        int i5;
        yn81 yn81Var3;
        v281 v281Var;
        long j8;
        long j9;
        boolean z7;
        yn81 yn81Var4;
        Object obj2;
        long j10;
        int i6;
        boolean z8;
        long j11;
        yn81 yn81Var5;
        yn81 yn81Var6;
        en71 en71Var;
        hp71 hp71Var = this.x;
        y581 y581Var = this.K;
        en71 en71Var2 = this.s;
        int i7 = this.E;
        boolean z9 = this.F;
        uk81 uk81Var2 = this.l;
        ie81 ie81Var = this.m;
        if (yn81Var.c()) {
            yn81Var2 = yn81Var;
            z281Var = new z281(hp71.s, 0L, -9223372036854775807L, false, true, false);
        } else {
            v281 v281Var2 = hp71Var.b;
            Object obj3 = v281Var2.a;
            yn81 yn81Var7 = hp71Var.a;
            boolean z10 = yn81Var7.c() || yn81Var7.a(v281Var2.a, ie81Var).y;
            if (!hp71Var.b.a() && !z10) {
                j = hp71Var.r;
            } else {
                j = hp71Var.c;
            }
            if (y581Var != null) {
                Pair a = a(yn81Var, y581Var, true, i7, z9, uk81Var2, ie81Var);
                if (a == null) {
                    i2 = yn81Var.a(z9);
                    uk81Var = uk81Var2;
                    j3 = j;
                    obj = obj3;
                    i3 = -1;
                    z2 = false;
                    z3 = true;
                    z4 = false;
                    if (i2 == i3) {
                        yn81Var2 = yn81Var;
                        Pair a2 = yn81Var2.a(uk81Var, ie81Var, i2, -9223372036854775807L);
                        obj = a2.first;
                        j4 = ((Long) a2.second).longValue();
                        j5 = -9223372036854775807L;
                    } else {
                        yn81Var2 = yn81Var;
                        j4 = j3;
                        j5 = j4;
                    }
                    f = en71Var2.f(yn81Var2, obj, j4);
                    int i8 = f.e;
                    r7 = (v281Var2.a.equals(obj) || v281Var2.a() || f.a() || !(i8 != i3 || ((i4 = v281Var2.e) != i3 && i8 >= i4))) ? 0 : 1;
                    ie81 a3 = yn81Var2.a(obj, ie81Var);
                    if (!z10 && j == j5 && v281Var2.a.equals(f.a)) {
                        if (v281Var2.a()) {
                            if (a3.z.a(v281Var2.b).z) {
                                int i9 = v281Var2.b;
                                int i10 = v281Var2.c;
                                pr71 a4 = a3.z.a(i9);
                                if ((a4.b != -1 ? a4.w[i10] : 0) != 4) {
                                    int i11 = v281Var2.b;
                                    int i12 = v281Var2.c;
                                    pr71 a5 = a3.z.a(i11);
                                }
                            }
                        }
                        if (f.a()) {
                        }
                    }
                    boolean z11 = false;
                    if (r7 == 0 || z11) {
                        f = v281Var2;
                    }
                    if (f.a()) {
                        j6 = j4;
                    } else {
                        if (f.equals(v281Var2)) {
                            j7 = hp71Var.r;
                        } else {
                            yn81Var2.a(f.a, ie81Var);
                            if (f.c == ie81Var.a(f.b)) {
                                j7 = ie81Var.z.b;
                            } else {
                                j6 = 0;
                            }
                        }
                        j6 = j7;
                    }
                    z281Var = new z281(f, j6, j5, z2, z3, z4);
                } else {
                    long j12 = y581Var.c;
                    obj = a.first;
                    if (j12 == -9223372036854775807L) {
                        int i13 = yn81Var.a(obj, ie81Var).c;
                        j3 = j;
                        obj = obj3;
                        z6 = false;
                        i5 = i13;
                    } else {
                        j3 = ((Long) a.second).longValue();
                        z6 = true;
                        i5 = -1;
                    }
                    z4 = z6;
                    if (hp71Var.e == 4) {
                        uk81Var = uk81Var2;
                        i2 = i5;
                        i3 = -1;
                        z2 = true;
                    } else {
                        uk81Var = uk81Var2;
                        i2 = i5;
                        i3 = -1;
                        z2 = false;
                    }
                    z3 = false;
                    if (i2 == i3) {
                    }
                    f = en71Var2.f(yn81Var2, obj, j4);
                    int i82 = f.e;
                    if (v281Var2.a.equals(obj)) {
                    }
                    ie81 a32 = yn81Var2.a(obj, ie81Var);
                    if (!z10) {
                        if (v281Var2.a()) {
                        }
                        if (f.a()) {
                        }
                    }
                    boolean z112 = false;
                    if (r7 == 0) {
                    }
                    f = v281Var2;
                    if (f.a()) {
                    }
                    z281Var = new z281(f, j6, j5, z2, z3, z4);
                }
            } else {
                Object obj4 = obj3;
                if (hp71Var.a.c()) {
                    i2 = yn81Var.a(z9);
                    uk81Var = uk81Var2;
                } else {
                    if (yn81Var.a(obj4) == -1) {
                        Object a6 = a(uk81Var2, ie81Var, i7, z9, obj4, hp71Var.a, yn81Var);
                        uk81Var = uk81Var2;
                        ie81Var = ie81Var;
                        obj4 = obj4;
                        if (a6 == null) {
                            i = yn81Var.a(z9);
                            z5 = true;
                            i2 = i;
                            z3 = z5;
                            j3 = j;
                            obj = obj4;
                            i3 = -1;
                            z2 = false;
                            z4 = false;
                            if (i2 == i3) {
                            }
                            f = en71Var2.f(yn81Var2, obj, j4);
                            int i822 = f.e;
                            if (v281Var2.a.equals(obj)) {
                            }
                            ie81 a322 = yn81Var2.a(obj, ie81Var);
                            if (!z10) {
                            }
                            boolean z1122 = false;
                            if (r7 == 0) {
                            }
                            f = v281Var2;
                            if (f.a()) {
                            }
                            z281Var = new z281(f, j6, j5, z2, z3, z4);
                        } else {
                            i = yn81Var.a(a6, ie81Var).c;
                        }
                    } else {
                        uk81Var = uk81Var2;
                        if (j == -9223372036854775807L) {
                            i2 = yn81Var.a(obj4, ie81Var).c;
                        } else if (z10) {
                            hp71Var.a.a(v281Var2.a, ie81Var);
                            if (hp71Var.a.a(ie81Var.c, uk81Var, 0L).G == hp71Var.a.a(v281Var2.a)) {
                                Pair a7 = yn81Var.a(uk81Var, ie81Var, yn81Var.a(obj4, ie81Var).c, j + ie81Var.x);
                                obj = a7.first;
                                j2 = ((Long) a7.second).longValue();
                            } else {
                                j2 = j;
                                obj = obj4;
                            }
                            j3 = j2;
                            i2 = -1;
                            i3 = -1;
                            z2 = false;
                            z3 = false;
                            z4 = true;
                            if (i2 == i3) {
                            }
                            f = en71Var2.f(yn81Var2, obj, j4);
                            int i8222 = f.e;
                            if (v281Var2.a.equals(obj)) {
                            }
                            ie81 a3222 = yn81Var2.a(obj, ie81Var);
                            if (!z10) {
                            }
                            boolean z11222 = false;
                            if (r7 == 0) {
                            }
                            f = v281Var2;
                            if (f.a()) {
                            }
                            z281Var = new z281(f, j6, j5, z2, z3, z4);
                        } else {
                            i = -1;
                        }
                    }
                    z5 = false;
                    i2 = i;
                    z3 = z5;
                    j3 = j;
                    obj = obj4;
                    i3 = -1;
                    z2 = false;
                    z4 = false;
                    if (i2 == i3) {
                    }
                    f = en71Var2.f(yn81Var2, obj, j4);
                    int i82222 = f.e;
                    if (v281Var2.a.equals(obj)) {
                    }
                    ie81 a32222 = yn81Var2.a(obj, ie81Var);
                    if (!z10) {
                    }
                    boolean z112222 = false;
                    if (r7 == 0) {
                    }
                    f = v281Var2;
                    if (f.a()) {
                    }
                    z281Var = new z281(f, j6, j5, z2, z3, z4);
                }
                j3 = j;
                obj = obj4;
                i3 = -1;
                z2 = false;
                z3 = false;
                z4 = false;
                if (i2 == i3) {
                }
                f = en71Var2.f(yn81Var2, obj, j4);
                int i822222 = f.e;
                if (v281Var2.a.equals(obj)) {
                }
                ie81 a322222 = yn81Var2.a(obj, ie81Var);
                if (!z10) {
                }
                boolean z1122222 = false;
                if (r7 == 0) {
                }
                f = v281Var2;
                if (f.a()) {
                }
                z281Var = new z281(f, j6, j5, z2, z3, z4);
            }
        }
        v281 v281Var3 = z281Var.a;
        long j13 = z281Var.c;
        boolean z12 = z281Var.d;
        long j14 = z281Var.b;
        boolean z13 = (this.x.b.equals(v281Var3) && j14 == this.x.r) ? false : true;
        try {
            if (z281Var.e) {
                try {
                    z8 = true;
                    if (this.x.e != 1) {
                        try {
                            b(4);
                        } catch (Throwable th) {
                            th = th;
                            yn81Var3 = yn81Var2;
                            z7 = z8;
                            v281Var = v281Var3;
                            j8 = j13;
                            j9 = j14;
                            hp71 hp71Var2 = this.x;
                            yn81 yn81Var8 = hp71Var2.a;
                            v281 v281Var4 = hp71Var2.b;
                            v281 v281Var5 = v281Var;
                            yn81Var4 = yn81Var3;
                            a(yn81Var4, v281Var5, yn81Var8, v281Var4, !z281Var.f ? j9 : -9223372036854775807L);
                            if (!z13) {
                            }
                            hp71 hp71Var3 = this.x;
                            obj2 = hp71Var3.b.a;
                            yn81 yn81Var9 = hp71Var3.a;
                            if (z13) {
                            }
                            long j15 = this.x.d;
                            if (yn81Var4.a(obj2) != -1) {
                            }
                            this.x = a(v281Var5, j9, j10, j15, r7, i6);
                            k();
                            a(yn81Var4, this.x.a);
                            this.x = this.x.d(yn81Var4);
                            if (!yn81Var4.c()) {
                            }
                            a(false);
                            throw th;
                        }
                    }
                    a(false, false, false, true);
                } catch (Throwable th2) {
                    th = th2;
                    z8 = true;
                }
            } else {
                z8 = true;
            }
            try {
                if (!z13) {
                    try {
                        z7 = z8;
                        try {
                            try {
                                r7 = yn81Var;
                                if (!this.s.j(yn81Var, this.L, b())) {
                                    b(false);
                                    r7 = r7;
                                }
                                v281Var = v281Var3;
                                j11 = j14;
                                yn81Var5 = r7;
                                hp71 hp71Var4 = this.x;
                                v281 v281Var6 = v281Var;
                                yn81Var6 = yn81Var5;
                                a(yn81Var6, v281Var6, hp71Var4.a, hp71Var4.b, z281Var.f ? j11 : -9223372036854775807L);
                                if (!z13 || j13 != this.x.c) {
                                    hp71 hp71Var5 = this.x;
                                    Object obj5 = hp71Var5.b.a;
                                    yn81 yn81Var10 = hp71Var5.a;
                                    this.x = a(v281Var6, j11, j13, this.x.d, (z13 || !z || yn81Var10.c() || yn81Var10.a(obj5, this.m).y) ? false : z7, yn81Var6.a(obj5) == -1 ? 4 : 3);
                                }
                                k();
                                a(yn81Var6, this.x.a);
                                this.x = this.x.d(yn81Var6);
                                if (!yn81Var6.c()) {
                                    this.K = null;
                                }
                                a(false);
                            } catch (Throwable th3) {
                                th = th3;
                                r7 = yn81Var;
                                yn81Var3 = r7;
                                v281Var = v281Var3;
                                j8 = j13;
                                j9 = j14;
                                hp71 hp71Var22 = this.x;
                                yn81 yn81Var82 = hp71Var22.a;
                                v281 v281Var42 = hp71Var22.b;
                                v281 v281Var52 = v281Var;
                                yn81Var4 = yn81Var3;
                                a(yn81Var4, v281Var52, yn81Var82, v281Var42, !z281Var.f ? j9 : -9223372036854775807L);
                                if (!z13 || j8 != this.x.c) {
                                    hp71 hp71Var32 = this.x;
                                    obj2 = hp71Var32.b.a;
                                    yn81 yn81Var92 = hp71Var32.a;
                                    boolean z14 = (z13 || !z || yn81Var92.c() || yn81Var92.a(obj2, this.m).y) ? false : z7;
                                    long j152 = this.x.d;
                                    if (yn81Var4.a(obj2) != -1) {
                                        j10 = j8;
                                        i6 = 4;
                                    } else {
                                        j10 = j8;
                                        i6 = 3;
                                    }
                                    this.x = a(v281Var52, j9, j10, j152, z14, i6);
                                }
                                k();
                                a(yn81Var4, this.x.a);
                                this.x = this.x.d(yn81Var4);
                                if (!yn81Var4.c()) {
                                    this.K = null;
                                }
                                a(false);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r7 = yn81Var;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        r7 = yn81Var;
                        z7 = z8;
                    }
                } else {
                    yn81 yn81Var11 = yn81Var2;
                    z7 = z8;
                    boolean c = yn81Var11.c();
                    r7 = yn81Var11;
                    if (!c) {
                        try {
                            td71 td71Var = this.s.h;
                            while (td71Var != null) {
                                try {
                                    if (td71Var.f.a.equals(v281Var3)) {
                                        xj71 e = this.s.e(yn81Var11, td71Var.f);
                                        td71Var.f = e;
                                        Object obj6 = td71Var.a;
                                        if (obj6 instanceof oh71) {
                                            long j16 = e.d;
                                            if (j16 == -9223372036854775807L) {
                                                j16 = Long.MIN_VALUE;
                                            }
                                            oh71 oh71Var = (oh71) obj6;
                                            j9 = j14;
                                            try {
                                                oh71Var.x = 0L;
                                                oh71Var.y = j16;
                                                td71Var = td71Var.l;
                                                j14 = j9;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                yn81Var3 = yn81Var11;
                                                v281Var = v281Var3;
                                                j8 = j13;
                                                hp71 hp71Var222 = this.x;
                                                yn81 yn81Var822 = hp71Var222.a;
                                                v281 v281Var422 = hp71Var222.b;
                                                v281 v281Var522 = v281Var;
                                                yn81Var4 = yn81Var3;
                                                a(yn81Var4, v281Var522, yn81Var822, v281Var422, !z281Var.f ? j9 : -9223372036854775807L);
                                                if (!z13) {
                                                }
                                                hp71 hp71Var322 = this.x;
                                                obj2 = hp71Var322.b.a;
                                                yn81 yn81Var922 = hp71Var322.a;
                                                if (z13) {
                                                }
                                                long j1522 = this.x.d;
                                                if (yn81Var4.a(obj2) != -1) {
                                                }
                                                this.x = a(v281Var522, j9, j10, j1522, z14, i6);
                                                k();
                                                a(yn81Var4, this.x.a);
                                                this.x = this.x.d(yn81Var4);
                                                if (!yn81Var4.c()) {
                                                }
                                                a(false);
                                                throw th;
                                            }
                                        }
                                    }
                                    j9 = j14;
                                    td71Var = td71Var.l;
                                    j14 = j9;
                                } catch (Throwable th7) {
                                    th = th7;
                                    j9 = j14;
                                }
                            }
                            j9 = j14;
                            try {
                                en71Var = this.s;
                                v281Var = v281Var3;
                            } catch (Throwable th8) {
                                th = th8;
                                v281Var = v281Var3;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            v281Var = v281Var3;
                            j9 = j14;
                        }
                        try {
                            j11 = a(v281Var, j9, en71Var.h != en71Var.i ? z7 : false, z12);
                            yn81Var5 = yn81Var11;
                            hp71 hp71Var42 = this.x;
                            v281 v281Var62 = v281Var;
                            yn81Var6 = yn81Var5;
                            a(yn81Var6, v281Var62, hp71Var42.a, hp71Var42.b, z281Var.f ? j11 : -9223372036854775807L);
                            if (!z13) {
                            }
                            hp71 hp71Var52 = this.x;
                            Object obj52 = hp71Var52.b.a;
                            yn81 yn81Var102 = hp71Var52.a;
                            if (z13) {
                            }
                            this.x = a(v281Var62, j11, j13, this.x.d, (z13 || !z || yn81Var102.c() || yn81Var102.a(obj52, this.m).y) ? false : z7, yn81Var6.a(obj52) == -1 ? 4 : 3);
                            k();
                            a(yn81Var6, this.x.a);
                            this.x = this.x.d(yn81Var6);
                            if (!yn81Var6.c()) {
                            }
                            a(false);
                        } catch (Throwable th10) {
                            th = th10;
                            j9 = j9;
                            yn81Var3 = yn81Var11;
                            j8 = j13;
                            hp71 hp71Var2222 = this.x;
                            yn81 yn81Var8222 = hp71Var2222.a;
                            v281 v281Var4222 = hp71Var2222.b;
                            v281 v281Var5222 = v281Var;
                            yn81Var4 = yn81Var3;
                            a(yn81Var4, v281Var5222, yn81Var8222, v281Var4222, !z281Var.f ? j9 : -9223372036854775807L);
                            if (!z13) {
                            }
                            hp71 hp71Var3222 = this.x;
                            obj2 = hp71Var3222.b.a;
                            yn81 yn81Var9222 = hp71Var3222.a;
                            if (z13) {
                            }
                            long j15222 = this.x.d;
                            if (yn81Var4.a(obj2) != -1) {
                            }
                            this.x = a(v281Var5222, j9, j10, j15222, z14, i6);
                            k();
                            a(yn81Var4, this.x.a);
                            this.x = this.x.d(yn81Var4);
                            if (!yn81Var4.c()) {
                            }
                            a(false);
                            throw th;
                        }
                    }
                }
                v281Var = v281Var3;
                j11 = j14;
                yn81Var5 = r7;
                hp71 hp71Var422 = this.x;
                v281 v281Var622 = v281Var;
                yn81Var6 = yn81Var5;
                a(yn81Var6, v281Var622, hp71Var422.a, hp71Var422.b, z281Var.f ? j11 : -9223372036854775807L);
                if (!z13) {
                }
                hp71 hp71Var522 = this.x;
                Object obj522 = hp71Var522.b.a;
                yn81 yn81Var1022 = hp71Var522.a;
                if (z13) {
                }
                this.x = a(v281Var622, j11, j13, this.x.d, (z13 || !z || yn81Var1022.c() || yn81Var1022.a(obj522, this.m).y) ? false : z7, yn81Var6.a(obj522) == -1 ? 4 : 3);
                k();
                a(yn81Var6, this.x.a);
                this.x = this.x.d(yn81Var6);
                if (!yn81Var6.c()) {
                }
                a(false);
            } catch (Throwable th11) {
                th = th11;
            }
        } catch (Throwable th12) {
            th = th12;
            yn81Var3 = yn81Var2;
            v281Var = v281Var3;
            j8 = j13;
            j9 = j14;
            z7 = true;
        }
    }

    public final void a(yn81 yn81Var, v281 v281Var, yn81 yn81Var2, v281 v281Var2, long j) {
        if (!a(yn81Var, v281Var)) {
            kv71 kv71Var = v281Var.a() ? kv71.w : this.x.n;
            if (this.o.getPlaybackParameters().equals(kv71Var)) {
                return;
            }
            this.o.e(kv71Var);
            return;
        }
        yn81Var.a(yn81Var.a(v281Var.a, this.m).c, this.l, 0L);
        bf81 bf81Var = this.u;
        q581 q581Var = this.l.C;
        int i = rf71.a;
        bf81Var.getClass();
        bf81Var.c = rf71.g(q581Var.a);
        bf81Var.f = rf71.g(q581Var.b);
        bf81Var.g = rf71.g(q581Var.c);
        float f = q581Var.w;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        bf81Var.j = f;
        float f2 = q581Var.x;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        bf81Var.i = f2;
        if (f == 1.0f && f2 == 1.0f) {
            bf81Var.c = -9223372036854775807L;
        }
        bf81Var.a();
        if (j != -9223372036854775807L) {
            bf81 bf81Var2 = this.u;
            bf81Var2.d = a(yn81Var, v281Var.a, j);
            bf81Var2.a();
        } else {
            if (rf71.o(!yn81Var2.c() ? yn81Var2.a(yn81Var2.a(v281Var2.a, this.m).c, this.l, 0L).a : null, this.l.a)) {
                return;
            }
            bf81 bf81Var3 = this.u;
            bf81Var3.d = -9223372036854775807L;
            bf81Var3.a();
        }
    }

    public final void a(kv71 kv71Var, float f, boolean z, boolean z2) {
        kv71 kv71Var2;
        int i;
        if (z) {
            if (z2) {
                this.y.a(1);
            }
            hp71 hp71Var = this.x;
            hp71 hp71Var2 = new hp71(hp71Var.a, hp71Var.b, hp71Var.c, hp71Var.d, hp71Var.e, hp71Var.f, hp71Var.g, hp71Var.h, hp71Var.i, hp71Var.j, hp71Var.k, hp71Var.l, hp71Var.m, kv71Var, hp71Var.p, hp71Var.q, hp71Var.r, hp71Var.o);
            kv71Var2 = kv71Var;
            this.x = hp71Var2;
        } else {
            kv71Var2 = kv71Var;
        }
        float f2 = kv71Var2.a;
        td71 td71Var = this.s.h;
        while (true) {
            i = 0;
            if (td71Var == null) {
                break;
            }
            gk71[] gk71VarArr = td71Var.n.c;
            int length = gk71VarArr.length;
            while (i < length) {
                gk71 gk71Var = gk71VarArr[i];
                if (gk71Var != null) {
                    gk71Var.l(f2);
                }
                i++;
            }
            td71Var = td71Var.l;
        }
        gy61[] gy61VarArr = this.b;
        int length2 = gy61VarArr.length;
        while (i < length2) {
            gy61 gy61Var = gy61VarArr[i];
            if (gy61Var != null) {
                gy61Var.a(f, kv71Var2.a);
            }
            i++;
        }
    }

    public final hp71 a(v281 v281Var, long j, long j2, long j3, boolean z, int i) {
        wx71 wx71Var;
        lu81 lu81Var;
        List list;
        wx71 wx71Var2;
        lu81 lu81Var2;
        wk2 wk2Var;
        wx71 wx71Var3;
        lu81 lu81Var3;
        this.N = (!this.N && j == this.x.r && v281Var.equals(this.x.b)) ? false : true;
        k();
        hp71 hp71Var = this.x;
        wx71 wx71Var4 = hp71Var.h;
        lu81 lu81Var4 = hp71Var.i;
        List list2 = hp71Var.j;
        if (this.t.k) {
            td71 td71Var = this.s.h;
            if (td71Var == null) {
                wx71Var2 = wx71.w;
            } else {
                wx71Var2 = td71Var.m;
            }
            if (td71Var == null) {
                lu81Var2 = this.f;
            } else {
                lu81Var2 = td71Var.n;
            }
            gk71[] gk71VarArr = lu81Var2.c;
            a181 a181Var = new a181();
            boolean z2 = false;
            for (gk71 gk71Var : gk71VarArr) {
                if (gk71Var != null) {
                    cs1 cs1Var = gk71Var.b(0).C;
                    if (cs1Var == null) {
                        a181Var.d(new cs1(new bs1[0]));
                    } else {
                        a181Var.d(cs1Var);
                        z2 = true;
                    }
                }
            }
            if (z2) {
                wk2Var = a181Var.c();
            } else {
                p481 p481Var = t31.b;
                wk2Var = wk2.x;
            }
            wk2 wk2Var2 = wk2Var;
            if (td71Var != null) {
                xj71 xj71Var = td71Var.f;
                long j4 = xj71Var.c;
                if (j4 != j2) {
                    if (j2 == j4) {
                        wx71Var3 = wx71Var2;
                        lu81Var3 = lu81Var2;
                    } else {
                        wx71Var3 = wx71Var2;
                        lu81Var3 = lu81Var2;
                        xj71Var = new xj71(xj71Var.a, xj71Var.b, j2, xj71Var.d, xj71Var.e, xj71Var.f, xj71Var.g, xj71Var.h, xj71Var.i);
                    }
                    td71Var.f = xj71Var;
                    list = wk2Var2;
                    wx71Var = wx71Var3;
                    lu81Var = lu81Var3;
                }
            }
            wx71Var3 = wx71Var2;
            lu81Var3 = lu81Var2;
            list = wk2Var2;
            wx71Var = wx71Var3;
            lu81Var = lu81Var3;
        } else {
            if (!v281Var.equals(hp71Var.b)) {
                wx71Var4 = wx71.w;
                lu81Var4 = this.f;
                list2 = wk2.x;
            }
            wx71Var = wx71Var4;
            lu81Var = lu81Var4;
            list = list2;
        }
        if (z) {
            lw71 lw71Var = this.y;
            if (!lw71Var.d || lw71Var.e == 5) {
                lw71Var.a = true;
                lw71Var.d = true;
                lw71Var.e = i;
            } else if (i != 5) {
                w511.q();
                return null;
            }
        }
        hp71 hp71Var2 = this.x;
        return hp71Var2.c(v281Var, j, j2, j3, a(hp71Var2.p), wx71Var, lu81Var, list);
    }

    public final void a(boolean[] zArr) {
        int i;
        lf81 lf81Var;
        td71 td71Var = this.s.i;
        lu81 lu81Var = td71Var.n;
        for (int i2 = 0; i2 < this.b.length; i2++) {
            if (!lu81Var.a(i2) && this.c.remove(this.b[i2])) {
                gy61 gy61Var = this.b[i2];
                if (gy61Var.g == 0) {
                    og81 og81Var = gy61Var.c;
                    og81Var.a = null;
                    og81Var.b = null;
                    gy61Var.h();
                } else {
                    ny61.k();
                    return;
                }
            }
        }
        int i3 = 0;
        while (i3 < this.b.length) {
            if (lu81Var.a(i3)) {
                boolean z = zArr[i3];
                gy61 gy61Var2 = this.b[i3];
                if (!b(gy61Var2)) {
                    en71 en71Var = this.s;
                    td71 td71Var2 = en71Var.i;
                    boolean z2 = td71Var2 == en71Var.h;
                    lu81 lu81Var2 = td71Var2.n;
                    v581 v581Var = lu81Var2.b[i3];
                    gk71 gk71Var = lu81Var2.c[i3];
                    int g = gk71Var != null ? gk71Var.g() : 0;
                    qd81[] qd81VarArr = new qd81[g];
                    for (int i4 = 0; i4 < g; i4++) {
                        qd81VarArr[i4] = gk71Var.b(i4);
                    }
                    boolean z3 = l() && this.x.e == 3;
                    boolean z4 = !z && z3;
                    this.J++;
                    this.c.add(gy61Var2);
                    dg81 dg81Var = td71Var2.c[i3];
                    i = i3;
                    long j = this.L;
                    boolean z5 = z2;
                    long j2 = td71Var2.f.b;
                    long j3 = td71Var2.o;
                    boolean z6 = z3;
                    long j4 = j2 + j3;
                    if (gy61Var2.g == 0) {
                        gy61Var2.d = v581Var;
                        gy61Var2.g = 1;
                        gy61Var2.a(z5);
                        if (!gy61Var2.l) {
                            gy61Var2.h = dg81Var;
                            if (gy61Var2.k == Long.MIN_VALUE) {
                                gy61Var2.k = j4;
                            }
                            gy61Var2.i = qd81VarArr;
                            gy61Var2.j = j3;
                            gy61Var2.a(qd81VarArr, j4, j3);
                            gy61Var2.l = false;
                            gy61Var2.k = j;
                            gy61Var2.a(j, z4);
                            gy61Var2.a(11, new cq71(this));
                            wo81 wo81Var = this.o;
                            wo81Var.getClass();
                            lf81 b = gy61Var2.b();
                            if (b != null && b != (lf81Var = wo81Var.w)) {
                                if (lf81Var == null) {
                                    wo81Var.w = b;
                                    wo81Var.c = gy61Var2;
                                    ((u191) b).e((kv71) wo81Var.a.x);
                                } else {
                                    throw new zm0(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                                }
                            }
                            if (!z6) {
                                continue;
                            } else if (gy61Var2.g == 1) {
                                gy61Var2.g = 2;
                                gy61Var2.i();
                            } else {
                                ny61.k();
                                return;
                            }
                            i3 = i + 1;
                        } else {
                            ny61.k();
                            return;
                        }
                    } else {
                        ny61.k();
                        return;
                    }
                }
            }
            i = i3;
            i3 = i + 1;
        }
        td71Var.g = true;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, sn61] */
    public final void a(boolean z) {
        long j;
        td71 td71Var = this.s.j;
        v281 v281Var = td71Var == null ? this.x.b : td71Var.f.a;
        boolean equals = this.x.k.equals(v281Var);
        if (!equals) {
            this.x = this.x.b(v281Var);
        }
        hp71 hp71Var = this.x;
        if (td71Var == null) {
            j = hp71Var.r;
        } else if (!td71Var.d) {
            j = td71Var.f.b;
        } else {
            long g = td71Var.e ? td71Var.a.g() : Long.MIN_VALUE;
            j = g == Long.MIN_VALUE ? td71Var.f.e : g;
        }
        hp71Var.p = j;
        hp71 hp71Var2 = this.x;
        hp71Var2.q = a(hp71Var2.p);
        if ((!equals || z) && td71Var != null && td71Var.d) {
            a(td71Var.n);
        }
    }

    public final long a(long j) {
        td71 td71Var = this.s.j;
        if (td71Var == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.L - td71Var.o));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(lu81 lu81Var) {
        hi81 hi81Var = this.g;
        gy61[] gy61VarArr = this.b;
        gk71[] gk71VarArr = lu81Var.c;
        int i = hi81Var.f;
        if (i == -1) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = 13107200;
                if (i2 < gy61VarArr.length) {
                    if (gk71VarArr[i2] != null) {
                        switch (gy61VarArr[i2].b) {
                            case 0:
                                i4 = 144310272;
                                i3 += i4;
                                break;
                            case 1:
                                i3 += i4;
                                break;
                            case 2:
                                i4 = 131072000;
                                i3 += i4;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i4 = 131072;
                                i3 += i4;
                                break;
                            default:
                                w511.q();
                                break;
                        }
                        return;
                    }
                    i2++;
                } else {
                    i = Math.max(13107200, i3);
                }
            }
        }
        hi81Var.i = i;
        hi81Var.a.b(i);
    }

    public static Pair a(yn81 yn81Var, y581 y581Var, boolean z, int i, boolean z2, uk81 uk81Var, ie81 ie81Var) {
        Object a;
        yn81 yn81Var2 = y581Var.a;
        if (yn81Var.c()) {
            return null;
        }
        yn81 yn81Var3 = yn81Var2.c() ? yn81Var : yn81Var2;
        try {
            Pair a2 = yn81Var3.a(uk81Var, ie81Var, y581Var.b, y581Var.c);
            if (yn81Var.equals(yn81Var3)) {
                return a2;
            }
            if (yn81Var.a(a2.first) != -1) {
                return (yn81Var3.a(a2.first, ie81Var).y && yn81Var3.a(ie81Var.c, uk81Var, 0L).G == yn81Var3.a(a2.first)) ? yn81Var.a(uk81Var, ie81Var, yn81Var.a(a2.first, ie81Var).c, y581Var.c) : a2;
            }
            if (!z || (a = a(uk81Var, ie81Var, i, z2, a2.first, yn81Var3, yn81Var)) == null) {
                return null;
            }
            return yn81Var.a(uk81Var, ie81Var, yn81Var.a(a, ie81Var).c, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static Object a(uk81 uk81Var, ie81 ie81Var, int i, boolean z, Object obj, yn81 yn81Var, yn81 yn81Var2) {
        int a = yn81Var.a(obj);
        int a2 = yn81Var.a();
        int i2 = 0;
        int i3 = a;
        int i4 = -1;
        while (i2 < a2 && i4 == -1) {
            uk81 uk81Var2 = uk81Var;
            ie81 ie81Var2 = ie81Var;
            int i5 = i;
            boolean z2 = z;
            yn81 yn81Var3 = yn81Var;
            i3 = yn81Var3.a(i3, ie81Var2, uk81Var2, i5, z2);
            if (i3 == -1) {
                break;
            }
            i4 = yn81Var2.a(yn81Var3.a(i3));
            i2++;
            yn81Var = yn81Var3;
            ie81Var = ie81Var2;
            uk81Var = uk81Var2;
            i = i5;
            z = z2;
        }
        if (i4 == -1) {
            return null;
        }
        return yn81Var2.a(i4);
    }
}
