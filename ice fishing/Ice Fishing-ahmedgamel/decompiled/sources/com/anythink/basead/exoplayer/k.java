package com.anythink.basead.exoplayer;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.anythink.basead.exoplayer.ae;
import com.anythink.basead.exoplayer.e;
import com.anythink.basead.exoplayer.h.af;
import com.anythink.basead.exoplayer.h.r;
import com.anythink.basead.exoplayer.h.s;
import com.anythink.basead.exoplayer.i.h;
import com.anythink.basead.exoplayer.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
final class k implements Handler.Callback, e.a, r.a, s.b, h.a, x.a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f9067a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f9068b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f9069c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final String f9070d = "ExoPlayerImplInternal";

    /* renamed from: e, reason: collision with root package name */
    private static final int f9071e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static final int f9072f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static final int f9073g = 2;

    /* renamed from: h, reason: collision with root package name */
    private static final int f9074h = 3;
    private static final int i = 4;

    /* renamed from: j, reason: collision with root package name */
    private static final int f9075j = 5;

    /* renamed from: k, reason: collision with root package name */
    private static final int f9076k = 6;

    /* renamed from: l, reason: collision with root package name */
    private static final int f9077l = 7;

    /* renamed from: m, reason: collision with root package name */
    private static final int f9078m = 8;

    /* renamed from: n, reason: collision with root package name */
    private static final int f9079n = 9;

    /* renamed from: o, reason: collision with root package name */
    private static final int f9080o = 10;

    /* renamed from: p, reason: collision with root package name */
    private static final int f9081p = 11;

    /* renamed from: q, reason: collision with root package name */
    private static final int f9082q = 12;

    /* renamed from: r, reason: collision with root package name */
    private static final int f9083r = 13;

    /* renamed from: s, reason: collision with root package name */
    private static final int f9084s = 14;

    /* renamed from: t, reason: collision with root package name */
    private static final int f9085t = 15;

    /* renamed from: u, reason: collision with root package name */
    private static final int f9086u = 10;

    /* renamed from: v, reason: collision with root package name */
    private static final int f9087v = 10;

    /* renamed from: w, reason: collision with root package name */
    private static final int f9088w = 1000;

    /* renamed from: x, reason: collision with root package name */
    private static final long f9089x = 500;

    /* renamed from: A, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.i.h f9090A;

    /* renamed from: B, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.i.i f9091B;

    /* renamed from: C, reason: collision with root package name */
    private final p f9092C;

    /* renamed from: D, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.k f9093D;

    /* renamed from: E, reason: collision with root package name */
    private final HandlerThread f9094E;

    /* renamed from: F, reason: collision with root package name */
    private final Handler f9095F;

    /* renamed from: G, reason: collision with root package name */
    private final h f9096G;

    /* renamed from: H, reason: collision with root package name */
    private final ae.b f9097H;

    /* renamed from: I, reason: collision with root package name */
    private final ae.a f9098I;

    /* renamed from: L, reason: collision with root package name */
    private final e f9100L;

    /* renamed from: N, reason: collision with root package name */
    private final ArrayList<b> f9102N;

    /* renamed from: O, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.c f9103O;

    /* renamed from: R, reason: collision with root package name */
    private u f9106R;

    /* renamed from: S, reason: collision with root package name */
    private com.anythink.basead.exoplayer.h.s f9107S;

    /* renamed from: T, reason: collision with root package name */
    private y[] f9108T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f9109U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f9110V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f9111W;

    /* renamed from: X, reason: collision with root package name */
    private int f9112X;
    private boolean Y;

    /* renamed from: Z, reason: collision with root package name */
    private int f9113Z;
    private d aa;
    private long ab;
    private int ac;

    /* renamed from: y, reason: collision with root package name */
    private final y[] f9114y;

    /* renamed from: z, reason: collision with root package name */
    private final z[] f9115z;

    /* renamed from: P, reason: collision with root package name */
    private final s f9104P = new s();
    private final long J = 0;

    /* renamed from: K, reason: collision with root package name */
    private final boolean f9099K = false;

    /* renamed from: Q, reason: collision with root package name */
    private ac f9105Q = ac.f7101e;

    /* renamed from: M, reason: collision with root package name */
    private final c f9101M = new c(0);

    /* renamed from: com.anythink.basead.exoplayer.k$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f9116a;

        public AnonymousClass1(x xVar) {
            this.f9116a = xVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                k.f(this.f9116a);
            } catch (g e9) {
                Log.e(k.f9070d, "Unexpected error delivering message on external thread.", e9);
                throw new RuntimeException(e9);
            }
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final com.anythink.basead.exoplayer.h.s f9118a;

        /* renamed from: b, reason: collision with root package name */
        public final ae f9119b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f9120c;

        public a(com.anythink.basead.exoplayer.h.s sVar, ae aeVar, Object obj) {
            this.f9118a = sVar;
            this.f9119b = aeVar;
            this.f9120c = obj;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private u f9152a;

        /* renamed from: b, reason: collision with root package name */
        private int f9153b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f9154c;

        /* renamed from: d, reason: collision with root package name */
        private int f9155d;

        private c() {
        }

        public /* synthetic */ c(byte b9) {
            this();
        }

        public final boolean a(u uVar) {
            return uVar != this.f9152a || this.f9153b > 0 || this.f9154c;
        }

        public final void b(u uVar) {
            this.f9152a = uVar;
            this.f9153b = 0;
            this.f9154c = false;
        }

        public final void a(int i) {
            this.f9153b += i;
        }

        public final void b(int i) {
            if (this.f9154c && this.f9155d != 4) {
                com.anythink.basead.exoplayer.k.a.a(i == 4);
            } else {
                this.f9154c = true;
                this.f9155d = i;
            }
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final ae f9165a;

        /* renamed from: b, reason: collision with root package name */
        public final int f9166b;

        /* renamed from: c, reason: collision with root package name */
        public final long f9167c;

        public d(ae aeVar, int i, long j6) {
            this.f9165a = aeVar;
            this.f9166b = i;
            this.f9167c = j6;
        }
    }

    public k(y[] yVarArr, com.anythink.basead.exoplayer.i.h hVar, com.anythink.basead.exoplayer.i.i iVar, p pVar, boolean z6, int i4, boolean z9, Handler handler, h hVar2, com.anythink.basead.exoplayer.k.c cVar) {
        this.f9114y = yVarArr;
        this.f9090A = hVar;
        this.f9091B = iVar;
        this.f9092C = pVar;
        this.f9110V = z6;
        this.f9112X = i4;
        this.Y = z9;
        this.f9095F = handler;
        this.f9096G = hVar2;
        this.f9103O = cVar;
        this.f9106R = new u(ae.f7127a, com.anythink.basead.exoplayer.b.f7168b, af.f8301a, iVar);
        this.f9115z = new z[yVarArr.length];
        for (int i6 = 0; i6 < yVarArr.length; i6++) {
            yVarArr[i6].a(i6);
            this.f9115z[i6] = yVarArr[i6].b();
        }
        this.f9100L = new e(this, cVar);
        this.f9102N = new ArrayList<>();
        this.f9108T = new y[0];
        this.f9097H = new ae.b();
        this.f9098I = new ae.a();
        hVar.a((h.a) this);
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f9094E = handlerThread;
        handlerThread.start();
        this.f9093D = cVar.a(handlerThread.getLooper(), this);
    }

    private void d(boolean z6) {
        u uVar = this.f9106R;
        if (uVar.f9540g != z6) {
            this.f9106R = uVar.a(z6);
        }
    }

    private void e(boolean z6) {
        this.f9111W = false;
        this.f9110V = z6;
        if (!z6) {
            f();
            g();
            return;
        }
        int i4 = this.f9106R.f9539f;
        if (i4 == 3) {
            e();
            this.f9093D.b(2);
        } else if (i4 == 2) {
            this.f9093D.b(2);
        }
    }

    private void f(boolean z6) {
        this.Y = z6;
        if (this.f9104P.a(z6)) {
            return;
        }
        g(true);
    }

    private void g(boolean z6) {
        s.a aVar = this.f9104P.c().f9481h.f9488a;
        long a9 = a(aVar, this.f9106R.f9542j, true);
        if (a9 != this.f9106R.f9542j) {
            u uVar = this.f9106R;
            this.f9106R = uVar.a(aVar, a9, uVar.f9538e);
            if (z6) {
                this.f9101M.b(4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0296, code lost:
    
        if (r20.f9092C.a(r4 - (r20.ab - r3.f9478e), r20.f9100L.e().f9545b, r20.f9111W) == false) goto L147;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void h() {
        long j6;
        int i4;
        q qVar;
        long b9 = this.f9103O.b();
        com.anythink.basead.exoplayer.h.s sVar = this.f9107S;
        boolean z6 = false;
        boolean z9 = true;
        if (sVar != null) {
            if (this.f9113Z > 0) {
                sVar.b();
            } else {
                this.f9104P.a(this.ab);
                if (this.f9104P.a()) {
                    r a9 = this.f9104P.a(this.ab, this.f9106R);
                    if (a9 == null) {
                        this.f9107S.b();
                    } else {
                        this.f9104P.a(this.f9115z, this.f9090A, this.f9092C.d(), this.f9107S, this.f9106R.f9534a.a(a9.f9488a.f8553a, this.f9098I, true).f7129b, a9).a(this, a9.f9489b);
                        d(true);
                    }
                }
                q b10 = this.f9104P.b();
                if (b10 == null || b10.a()) {
                    d(false);
                } else if (!this.f9106R.f9540g) {
                    r();
                }
                if (this.f9104P.f()) {
                    q c9 = this.f9104P.c();
                    q d9 = this.f9104P.d();
                    boolean z10 = false;
                    while (this.f9110V && c9 != d9 && this.ab >= c9.i.f9478e) {
                        if (z10) {
                            d();
                        }
                        int i6 = c9.f9481h.f9493f ? 0 : 3;
                        q h3 = this.f9104P.h();
                        a(c9);
                        u uVar = this.f9106R;
                        r rVar = h3.f9481h;
                        this.f9106R = uVar.a(rVar.f9488a, rVar.f9489b, rVar.f9491d);
                        this.f9101M.b(i6);
                        g();
                        z10 = true;
                        c9 = h3;
                    }
                    j6 = com.anythink.basead.exoplayer.b.f7168b;
                    if (d9.f9481h.f9494g) {
                        int i9 = 0;
                        while (true) {
                            y[] yVarArr = this.f9114y;
                            if (i9 >= yVarArr.length) {
                                break;
                            }
                            y yVar = yVarArr[i9];
                            com.anythink.basead.exoplayer.h.y yVar2 = d9.f9476c[i9];
                            if (yVar2 != null && yVar.f() == yVar2 && yVar.g()) {
                                yVar.h();
                            }
                            i9++;
                        }
                    } else {
                        q qVar2 = d9.i;
                        if (qVar2 != null && qVar2.f9479f) {
                            int i10 = 0;
                            while (true) {
                                y[] yVarArr2 = this.f9114y;
                                if (i10 >= yVarArr2.length) {
                                    com.anythink.basead.exoplayer.i.i iVar = d9.f9483k;
                                    q g9 = this.f9104P.g();
                                    com.anythink.basead.exoplayer.i.i iVar2 = g9.f9483k;
                                    boolean z11 = g9.f9474a.c() != com.anythink.basead.exoplayer.b.f7168b;
                                    int i11 = 0;
                                    while (true) {
                                        y[] yVarArr3 = this.f9114y;
                                        if (i11 >= yVarArr3.length) {
                                            break;
                                        }
                                        y yVar3 = yVarArr3[i11];
                                        if (iVar.a(i11)) {
                                            if (!z11) {
                                                if (!yVar3.i()) {
                                                    com.anythink.basead.exoplayer.i.f a10 = iVar2.f8769c.a(i11);
                                                    boolean a11 = iVar2.a(i11);
                                                    boolean z12 = this.f9115z[i11].a() == 5 ? true : z6;
                                                    aa aaVar = iVar.f8768b[i11];
                                                    aa aaVar2 = iVar2.f8768b[i11];
                                                    if (a11 && aaVar2.equals(aaVar) && !z12) {
                                                        yVar3.a(a(a10), g9.f9476c[i11], g9.f9478e);
                                                    }
                                                }
                                            }
                                            yVar3.h();
                                        }
                                        i11++;
                                        z6 = false;
                                    }
                                } else {
                                    y yVar4 = yVarArr2[i10];
                                    com.anythink.basead.exoplayer.h.y yVar5 = d9.f9476c[i10];
                                    if (yVar4.f() != yVar5 || (yVar5 != null && !yVar4.g())) {
                                        break;
                                    } else {
                                        i10++;
                                    }
                                }
                            }
                        }
                    }
                    if (this.f9104P.f()) {
                        n();
                        a(b9, 10L);
                        return;
                    }
                    q c10 = this.f9104P.c();
                    com.anythink.basead.exoplayer.k.ad.a("doSomeWork");
                    g();
                    long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                    c10.f9474a.a(this.f9106R.f9542j - this.J, this.f9099K);
                    boolean z13 = true;
                    boolean z14 = true;
                    for (y yVar6 : this.f9108T) {
                        yVar6.a(this.ab, elapsedRealtime);
                        z14 = z14 && yVar6.v();
                        boolean z15 = yVar6.u() || yVar6.v() || ((qVar = this.f9104P.d().i) != null && qVar.f9479f && yVar6.g());
                        if (!z15) {
                            yVar6.j();
                        }
                        z13 = z13 && z15;
                    }
                    if (!z13) {
                        n();
                    }
                    long j9 = c10.f9481h.f9492e;
                    if (!z14 || ((j9 != j6 && j9 > this.f9106R.f9542j) || !c10.f9481h.f9494g)) {
                        u uVar2 = this.f9106R;
                        if (uVar2.f9539f == 2) {
                            if (this.f9108T.length == 0) {
                                z9 = m();
                            } else {
                                if (z13) {
                                    if (uVar2.f9540g) {
                                        q b11 = this.f9104P.b();
                                        long a12 = b11.a(!b11.f9481h.f9494g);
                                        if (a12 != Long.MIN_VALUE) {
                                        }
                                    }
                                }
                                z9 = false;
                            }
                            if (z9) {
                                b(3);
                                if (this.f9110V) {
                                    e();
                                }
                            }
                        }
                        if (this.f9106R.f9539f == 3 && (this.f9108T.length != 0 ? !z13 : !m())) {
                            this.f9111W = this.f9110V;
                            b(2);
                            f();
                        }
                    } else {
                        b(4);
                        f();
                    }
                    if (this.f9106R.f9539f == 2) {
                        for (y yVar7 : this.f9108T) {
                            yVar7.j();
                        }
                    }
                    if ((this.f9110V && this.f9106R.f9539f == 3) || (i4 = this.f9106R.f9539f) == 2) {
                        a(b9, 10L);
                    } else if (this.f9108T.length == 0 || i4 == 4) {
                        this.f9093D.b();
                    } else {
                        a(b9, 1000L);
                    }
                    com.anythink.basead.exoplayer.k.ad.a();
                    return;
                }
            }
        }
        j6 = com.anythink.basead.exoplayer.b.f7168b;
        if (this.f9104P.f()) {
        }
    }

    private void i() {
        a(true, true, true);
        this.f9092C.c();
        b(1);
        this.f9094E.quitSafely();
        synchronized (this) {
            this.f9109U = true;
            notifyAll();
        }
    }

    private int j() {
        ae aeVar = this.f9106R.f9534a;
        if (aeVar.a()) {
            return 0;
        }
        return aeVar.a(aeVar.b(this.Y), this.f9097H, false).f7139f;
    }

    private void k() {
        for (int size = this.f9102N.size() - 1; size >= 0; size--) {
            if (!a(this.f9102N.get(size))) {
                this.f9102N.get(size).f9145a.a(false);
                this.f9102N.remove(size);
            }
        }
        Collections.sort(this.f9102N);
    }

    private void l() {
        if (this.f9104P.f()) {
            float f2 = this.f9100L.e().f9545b;
            q d9 = this.f9104P.d();
            boolean z6 = true;
            for (q c9 = this.f9104P.c(); c9 != null && c9.f9479f; c9 = c9.i) {
                if (c9.a(f2)) {
                    if (z6) {
                        q c10 = this.f9104P.c();
                        boolean a9 = this.f9104P.a(c10);
                        boolean[] zArr = new boolean[this.f9114y.length];
                        long a10 = c10.a(this.f9106R.f9542j, a9, zArr);
                        a(c10.f9483k);
                        u uVar = this.f9106R;
                        if (uVar.f9539f != 4 && a10 != uVar.f9542j) {
                            u uVar2 = this.f9106R;
                            this.f9106R = uVar2.a(uVar2.f9536c, a10, uVar2.f9538e);
                            this.f9101M.b(4);
                            a(a10);
                        }
                        boolean[] zArr2 = new boolean[this.f9114y.length];
                        int i4 = 0;
                        int i6 = 0;
                        while (true) {
                            y[] yVarArr = this.f9114y;
                            if (i4 >= yVarArr.length) {
                                break;
                            }
                            y yVar = yVarArr[i4];
                            boolean z9 = yVar.a_() != 0;
                            zArr2[i4] = z9;
                            com.anythink.basead.exoplayer.h.y yVar2 = c10.f9476c[i4];
                            if (yVar2 != null) {
                                i6++;
                            }
                            if (z9) {
                                if (yVar2 != yVar.f()) {
                                    b(yVar);
                                } else if (zArr[i4]) {
                                    yVar.a(this.ab);
                                }
                            }
                            i4++;
                        }
                        this.f9106R = this.f9106R.a(c10.f9482j, c10.f9483k);
                        a(zArr2, i6);
                    } else {
                        this.f9104P.a(c9);
                        if (c9.f9479f) {
                            c9.b(Math.max(c9.f9481h.f9489b, this.ab - c9.f9478e));
                            a(c9.f9483k);
                        }
                    }
                    if (this.f9106R.f9539f != 4) {
                        r();
                        g();
                        this.f9093D.b(2);
                        return;
                    }
                    return;
                }
                if (c9 == d9) {
                    z6 = false;
                }
            }
        }
    }

    private boolean m() {
        q c9 = this.f9104P.c();
        long j6 = c9.f9481h.f9492e;
        if (j6 == com.anythink.basead.exoplayer.b.f7168b || this.f9106R.f9542j < j6) {
            return true;
        }
        q qVar = c9.i;
        if (qVar != null) {
            return qVar.f9479f || qVar.f9481h.f9488a.a();
        }
        return false;
    }

    private void n() {
        q b9 = this.f9104P.b();
        q d9 = this.f9104P.d();
        if (b9 == null || b9.f9479f) {
            return;
        }
        if (d9 == null || d9.i == b9) {
            for (y yVar : this.f9108T) {
                if (!yVar.g()) {
                    return;
                }
            }
            b9.f9474a.a();
        }
    }

    private void o() {
        b(4);
        a(false, true, false);
    }

    private void p() {
        com.anythink.basead.exoplayer.h.s sVar = this.f9107S;
        if (sVar == null) {
            return;
        }
        if (this.f9113Z > 0) {
            sVar.b();
            return;
        }
        this.f9104P.a(this.ab);
        if (this.f9104P.a()) {
            r a9 = this.f9104P.a(this.ab, this.f9106R);
            if (a9 == null) {
                this.f9107S.b();
            } else {
                this.f9104P.a(this.f9115z, this.f9090A, this.f9092C.d(), this.f9107S, this.f9106R.f9534a.a(a9.f9488a.f8553a, this.f9098I, true).f7129b, a9).a(this, a9.f9489b);
                d(true);
            }
        }
        q b9 = this.f9104P.b();
        int i4 = 0;
        if (b9 == null || b9.a()) {
            d(false);
        } else if (!this.f9106R.f9540g) {
            r();
        }
        if (!this.f9104P.f()) {
            return;
        }
        q c9 = this.f9104P.c();
        q d9 = this.f9104P.d();
        boolean z6 = false;
        while (this.f9110V && c9 != d9 && this.ab >= c9.i.f9478e) {
            if (z6) {
                d();
            }
            int i6 = c9.f9481h.f9493f ? 0 : 3;
            q h3 = this.f9104P.h();
            a(c9);
            u uVar = this.f9106R;
            r rVar = h3.f9481h;
            this.f9106R = uVar.a(rVar.f9488a, rVar.f9489b, rVar.f9491d);
            this.f9101M.b(i6);
            g();
            z6 = true;
            c9 = h3;
        }
        if (d9.f9481h.f9494g) {
            while (true) {
                y[] yVarArr = this.f9114y;
                if (i4 >= yVarArr.length) {
                    return;
                }
                y yVar = yVarArr[i4];
                com.anythink.basead.exoplayer.h.y yVar2 = d9.f9476c[i4];
                if (yVar2 != null && yVar.f() == yVar2 && yVar.g()) {
                    yVar.h();
                }
                i4++;
            }
        } else {
            q qVar = d9.i;
            if (qVar == null || !qVar.f9479f) {
                return;
            }
            int i9 = 0;
            while (true) {
                y[] yVarArr2 = this.f9114y;
                if (i9 < yVarArr2.length) {
                    y yVar3 = yVarArr2[i9];
                    com.anythink.basead.exoplayer.h.y yVar4 = d9.f9476c[i9];
                    if (yVar3.f() != yVar4) {
                        return;
                    }
                    if (yVar4 != null && !yVar3.g()) {
                        return;
                    } else {
                        i9++;
                    }
                } else {
                    com.anythink.basead.exoplayer.i.i iVar = d9.f9483k;
                    q g9 = this.f9104P.g();
                    com.anythink.basead.exoplayer.i.i iVar2 = g9.f9483k;
                    boolean z9 = g9.f9474a.c() != com.anythink.basead.exoplayer.b.f7168b;
                    int i10 = 0;
                    while (true) {
                        y[] yVarArr3 = this.f9114y;
                        if (i10 >= yVarArr3.length) {
                            return;
                        }
                        y yVar5 = yVarArr3[i10];
                        if (iVar.a(i10)) {
                            if (!z9) {
                                if (!yVar5.i()) {
                                    com.anythink.basead.exoplayer.i.f a10 = iVar2.f8769c.a(i10);
                                    boolean a11 = iVar2.a(i10);
                                    boolean z10 = this.f9115z[i10].a() == 5;
                                    aa aaVar = iVar.f8768b[i10];
                                    aa aaVar2 = iVar2.f8768b[i10];
                                    if (a11 && aaVar2.equals(aaVar) && !z10) {
                                        yVar5.a(a(a10), g9.f9476c[i10], g9.f9478e);
                                    }
                                }
                            }
                            yVar5.h();
                        }
                        i10++;
                    }
                }
            }
        }
    }

    private void q() {
        this.f9104P.a(this.ab);
        if (this.f9104P.a()) {
            r a9 = this.f9104P.a(this.ab, this.f9106R);
            if (a9 == null) {
                this.f9107S.b();
                return;
            }
            this.f9104P.a(this.f9115z, this.f9090A, this.f9092C.d(), this.f9107S, this.f9106R.f9534a.a(a9.f9488a.f8553a, this.f9098I, true).f7129b, a9).a(this, a9.f9489b);
            d(true);
        }
    }

    private void r() {
        q b9 = this.f9104P.b();
        long b10 = b9.b();
        if (b10 == Long.MIN_VALUE) {
            d(false);
            return;
        }
        boolean a9 = this.f9092C.a(b10 - (this.ab - b9.f9478e), this.f9100L.e().f9545b);
        d(a9);
        if (a9) {
            b9.a(this.ab);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.z.a
    public final /* synthetic */ void a(com.anythink.basead.exoplayer.h.r rVar) {
        this.f9093D.a(10, rVar).sendToTarget();
    }

    public final void c(boolean z6) {
        this.f9093D.a(6, z6 ? 1 : 0).sendToTarget();
    }

    /* JADX WARN: Code restructure failed: missing block: B:387:0x07f2, code lost:
    
        if (r13 == false) goto L399;
     */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04b0 A[Catch: all -> 0x04b9, TryCatch #3 {all -> 0x04b9, blocks: (B:190:0x04a2, B:192:0x04a6, B:197:0x04b0, B:203:0x04bc, B:205:0x04c6, B:209:0x04d2, B:210:0x04dc, B:212:0x04ec, B:216:0x0505, B:219:0x0510, B:223:0x0514), top: B:189:0x04a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0522 A[Catch: RuntimeException -> 0x002a, IOException -> 0x0217, g -> 0x021c, TryCatch #6 {RuntimeException -> 0x002a, blocks: (B:3:0x0009, B:5:0x0014, B:8:0x0018, B:9:0x08a6, B:11:0x0035, B:13:0x0041, B:14:0x0046, B:16:0x004a, B:19:0x004f, B:21:0x005a, B:22:0x0066, B:23:0x006b, B:24:0x0077, B:27:0x007e, B:29:0x0088, B:31:0x008d, B:33:0x0099, B:34:0x009e, B:36:0x00a6, B:38:0x00bd, B:40:0x00c3, B:45:0x00cc, B:49:0x00d1, B:51:0x00f5, B:53:0x00fb, B:54:0x0111, B:55:0x0118, B:57:0x011d, B:60:0x0128, B:62:0x0130, B:64:0x0134, B:66:0x013a, B:69:0x013e, B:71:0x0142, B:68:0x0147, B:77:0x014a, B:78:0x0178, B:80:0x017e, B:81:0x015a, B:83:0x0163, B:87:0x018b, B:89:0x0197, B:470:0x01e8, B:472:0x0206, B:473:0x0221, B:90:0x0237, B:92:0x0243, B:94:0x0262, B:96:0x0270, B:98:0x0283, B:101:0x0286, B:103:0x028f, B:105:0x029b, B:107:0x02a5, B:108:0x02aa, B:111:0x02cb, B:113:0x02d3, B:115:0x02db, B:117:0x02e1, B:118:0x02e6, B:121:0x0311, B:123:0x0319, B:125:0x0327, B:127:0x032d, B:130:0x0342, B:132:0x034a, B:134:0x0352, B:135:0x035e, B:137:0x0365, B:139:0x036b, B:140:0x0370, B:142:0x039b, B:143:0x03a7, B:145:0x03ab, B:152:0x03b3, B:148:0x03be, B:155:0x03c7, B:158:0x03cf, B:161:0x03e1, B:162:0x03e9, B:164:0x03f3, B:166:0x03ff, B:169:0x0407, B:171:0x0417, B:173:0x0421, B:174:0x035c, B:175:0x0427, B:177:0x042d, B:181:0x0436, B:183:0x043b, B:184:0x0443, B:185:0x044e, B:187:0x045e, B:199:0x0518, B:201:0x0522, B:202:0x04ff, B:213:0x04f0, B:215:0x04fc, B:226:0x0526, B:228:0x0532, B:229:0x0538, B:230:0x046d, B:233:0x048e, B:239:0x0539, B:241:0x0543, B:243:0x0547, B:244:0x054e, B:246:0x055d, B:248:0x0569, B:249:0x056f, B:250:0x05a5, B:252:0x05ad, B:254:0x05b5, B:256:0x05bb, B:257:0x05c2, B:259:0x05ca, B:260:0x05d7, B:263:0x05dd, B:266:0x05e9, B:267:0x05ec, B:271:0x05f5, B:275:0x0621, B:278:0x062a, B:280:0x062f, B:282:0x0637, B:284:0x063d, B:286:0x0643, B:288:0x0646, B:293:0x06dd, B:295:0x06e7, B:296:0x06ef, B:298:0x071a, B:300:0x0723, B:303:0x072c, B:305:0x0732, B:307:0x0738, B:309:0x0742, B:311:0x0746, B:316:0x0752, B:321:0x075c, B:328:0x0763, B:329:0x0766, B:333:0x0770, B:335:0x0778, B:337:0x077e, B:338:0x07ff, B:340:0x0806, B:342:0x080c, B:344:0x0814, B:346:0x0818, B:350:0x082b, B:351:0x0841, B:352:0x0823, B:355:0x082f, B:358:0x0836, B:359:0x083c, B:360:0x0786, B:362:0x078d, B:364:0x0792, B:366:0x07d3, B:368:0x07db, B:370:0x0799, B:373:0x079f, B:375:0x07b7, B:379:0x07df, B:381:0x07e6, B:383:0x07eb, B:386:0x07f4, B:388:0x0649, B:390:0x064d, B:394:0x0654, B:396:0x0659, B:399:0x0667, B:404:0x066f, B:408:0x0672, B:412:0x068a, B:414:0x068f, B:417:0x0699, B:419:0x069f, B:422:0x06b7, B:424:0x06c1, B:427:0x06c9, B:432:0x06d7, B:429:0x06da, B:440:0x05bf, B:442:0x0845, B:446:0x084e, B:448:0x0854, B:449:0x085b, B:451:0x0862, B:454:0x086f, B:456:0x0875, B:459:0x0880, B:462:0x0887), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04bc A[Catch: all -> 0x04b9, TryCatch #3 {all -> 0x04b9, blocks: (B:190:0x04a2, B:192:0x04a6, B:197:0x04b0, B:203:0x04bc, B:205:0x04c6, B:209:0x04d2, B:210:0x04dc, B:212:0x04ec, B:216:0x0505, B:219:0x0510, B:223:0x0514), top: B:189:0x04a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x06e7 A[Catch: RuntimeException -> 0x002a, IOException -> 0x0217, g -> 0x021c, TryCatch #6 {RuntimeException -> 0x002a, blocks: (B:3:0x0009, B:5:0x0014, B:8:0x0018, B:9:0x08a6, B:11:0x0035, B:13:0x0041, B:14:0x0046, B:16:0x004a, B:19:0x004f, B:21:0x005a, B:22:0x0066, B:23:0x006b, B:24:0x0077, B:27:0x007e, B:29:0x0088, B:31:0x008d, B:33:0x0099, B:34:0x009e, B:36:0x00a6, B:38:0x00bd, B:40:0x00c3, B:45:0x00cc, B:49:0x00d1, B:51:0x00f5, B:53:0x00fb, B:54:0x0111, B:55:0x0118, B:57:0x011d, B:60:0x0128, B:62:0x0130, B:64:0x0134, B:66:0x013a, B:69:0x013e, B:71:0x0142, B:68:0x0147, B:77:0x014a, B:78:0x0178, B:80:0x017e, B:81:0x015a, B:83:0x0163, B:87:0x018b, B:89:0x0197, B:470:0x01e8, B:472:0x0206, B:473:0x0221, B:90:0x0237, B:92:0x0243, B:94:0x0262, B:96:0x0270, B:98:0x0283, B:101:0x0286, B:103:0x028f, B:105:0x029b, B:107:0x02a5, B:108:0x02aa, B:111:0x02cb, B:113:0x02d3, B:115:0x02db, B:117:0x02e1, B:118:0x02e6, B:121:0x0311, B:123:0x0319, B:125:0x0327, B:127:0x032d, B:130:0x0342, B:132:0x034a, B:134:0x0352, B:135:0x035e, B:137:0x0365, B:139:0x036b, B:140:0x0370, B:142:0x039b, B:143:0x03a7, B:145:0x03ab, B:152:0x03b3, B:148:0x03be, B:155:0x03c7, B:158:0x03cf, B:161:0x03e1, B:162:0x03e9, B:164:0x03f3, B:166:0x03ff, B:169:0x0407, B:171:0x0417, B:173:0x0421, B:174:0x035c, B:175:0x0427, B:177:0x042d, B:181:0x0436, B:183:0x043b, B:184:0x0443, B:185:0x044e, B:187:0x045e, B:199:0x0518, B:201:0x0522, B:202:0x04ff, B:213:0x04f0, B:215:0x04fc, B:226:0x0526, B:228:0x0532, B:229:0x0538, B:230:0x046d, B:233:0x048e, B:239:0x0539, B:241:0x0543, B:243:0x0547, B:244:0x054e, B:246:0x055d, B:248:0x0569, B:249:0x056f, B:250:0x05a5, B:252:0x05ad, B:254:0x05b5, B:256:0x05bb, B:257:0x05c2, B:259:0x05ca, B:260:0x05d7, B:263:0x05dd, B:266:0x05e9, B:267:0x05ec, B:271:0x05f5, B:275:0x0621, B:278:0x062a, B:280:0x062f, B:282:0x0637, B:284:0x063d, B:286:0x0643, B:288:0x0646, B:293:0x06dd, B:295:0x06e7, B:296:0x06ef, B:298:0x071a, B:300:0x0723, B:303:0x072c, B:305:0x0732, B:307:0x0738, B:309:0x0742, B:311:0x0746, B:316:0x0752, B:321:0x075c, B:328:0x0763, B:329:0x0766, B:333:0x0770, B:335:0x0778, B:337:0x077e, B:338:0x07ff, B:340:0x0806, B:342:0x080c, B:344:0x0814, B:346:0x0818, B:350:0x082b, B:351:0x0841, B:352:0x0823, B:355:0x082f, B:358:0x0836, B:359:0x083c, B:360:0x0786, B:362:0x078d, B:364:0x0792, B:366:0x07d3, B:368:0x07db, B:370:0x0799, B:373:0x079f, B:375:0x07b7, B:379:0x07df, B:381:0x07e6, B:383:0x07eb, B:386:0x07f4, B:388:0x0649, B:390:0x064d, B:394:0x0654, B:396:0x0659, B:399:0x0667, B:404:0x066f, B:408:0x0672, B:412:0x068a, B:414:0x068f, B:417:0x0699, B:419:0x069f, B:422:0x06b7, B:424:0x06c1, B:427:0x06c9, B:432:0x06d7, B:429:0x06da, B:440:0x05bf, B:442:0x0845, B:446:0x084e, B:448:0x0854, B:449:0x085b, B:451:0x0862, B:454:0x086f, B:456:0x0875, B:459:0x0880, B:462:0x0887), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x06ef A[Catch: RuntimeException -> 0x002a, IOException -> 0x0217, g -> 0x021c, TryCatch #6 {RuntimeException -> 0x002a, blocks: (B:3:0x0009, B:5:0x0014, B:8:0x0018, B:9:0x08a6, B:11:0x0035, B:13:0x0041, B:14:0x0046, B:16:0x004a, B:19:0x004f, B:21:0x005a, B:22:0x0066, B:23:0x006b, B:24:0x0077, B:27:0x007e, B:29:0x0088, B:31:0x008d, B:33:0x0099, B:34:0x009e, B:36:0x00a6, B:38:0x00bd, B:40:0x00c3, B:45:0x00cc, B:49:0x00d1, B:51:0x00f5, B:53:0x00fb, B:54:0x0111, B:55:0x0118, B:57:0x011d, B:60:0x0128, B:62:0x0130, B:64:0x0134, B:66:0x013a, B:69:0x013e, B:71:0x0142, B:68:0x0147, B:77:0x014a, B:78:0x0178, B:80:0x017e, B:81:0x015a, B:83:0x0163, B:87:0x018b, B:89:0x0197, B:470:0x01e8, B:472:0x0206, B:473:0x0221, B:90:0x0237, B:92:0x0243, B:94:0x0262, B:96:0x0270, B:98:0x0283, B:101:0x0286, B:103:0x028f, B:105:0x029b, B:107:0x02a5, B:108:0x02aa, B:111:0x02cb, B:113:0x02d3, B:115:0x02db, B:117:0x02e1, B:118:0x02e6, B:121:0x0311, B:123:0x0319, B:125:0x0327, B:127:0x032d, B:130:0x0342, B:132:0x034a, B:134:0x0352, B:135:0x035e, B:137:0x0365, B:139:0x036b, B:140:0x0370, B:142:0x039b, B:143:0x03a7, B:145:0x03ab, B:152:0x03b3, B:148:0x03be, B:155:0x03c7, B:158:0x03cf, B:161:0x03e1, B:162:0x03e9, B:164:0x03f3, B:166:0x03ff, B:169:0x0407, B:171:0x0417, B:173:0x0421, B:174:0x035c, B:175:0x0427, B:177:0x042d, B:181:0x0436, B:183:0x043b, B:184:0x0443, B:185:0x044e, B:187:0x045e, B:199:0x0518, B:201:0x0522, B:202:0x04ff, B:213:0x04f0, B:215:0x04fc, B:226:0x0526, B:228:0x0532, B:229:0x0538, B:230:0x046d, B:233:0x048e, B:239:0x0539, B:241:0x0543, B:243:0x0547, B:244:0x054e, B:246:0x055d, B:248:0x0569, B:249:0x056f, B:250:0x05a5, B:252:0x05ad, B:254:0x05b5, B:256:0x05bb, B:257:0x05c2, B:259:0x05ca, B:260:0x05d7, B:263:0x05dd, B:266:0x05e9, B:267:0x05ec, B:271:0x05f5, B:275:0x0621, B:278:0x062a, B:280:0x062f, B:282:0x0637, B:284:0x063d, B:286:0x0643, B:288:0x0646, B:293:0x06dd, B:295:0x06e7, B:296:0x06ef, B:298:0x071a, B:300:0x0723, B:303:0x072c, B:305:0x0732, B:307:0x0738, B:309:0x0742, B:311:0x0746, B:316:0x0752, B:321:0x075c, B:328:0x0763, B:329:0x0766, B:333:0x0770, B:335:0x0778, B:337:0x077e, B:338:0x07ff, B:340:0x0806, B:342:0x080c, B:344:0x0814, B:346:0x0818, B:350:0x082b, B:351:0x0841, B:352:0x0823, B:355:0x082f, B:358:0x0836, B:359:0x083c, B:360:0x0786, B:362:0x078d, B:364:0x0792, B:366:0x07d3, B:368:0x07db, B:370:0x0799, B:373:0x079f, B:375:0x07b7, B:379:0x07df, B:381:0x07e6, B:383:0x07eb, B:386:0x07f4, B:388:0x0649, B:390:0x064d, B:394:0x0654, B:396:0x0659, B:399:0x0667, B:404:0x066f, B:408:0x0672, B:412:0x068a, B:414:0x068f, B:417:0x0699, B:419:0x069f, B:422:0x06b7, B:424:0x06c1, B:427:0x06c9, B:432:0x06d7, B:429:0x06da, B:440:0x05bf, B:442:0x0845, B:446:0x084e, B:448:0x0854, B:449:0x085b, B:451:0x0862, B:454:0x086f, B:456:0x0875, B:459:0x0880, B:462:0x0887), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0752 A[Catch: RuntimeException -> 0x002a, IOException -> 0x0217, g -> 0x021c, TryCatch #6 {RuntimeException -> 0x002a, blocks: (B:3:0x0009, B:5:0x0014, B:8:0x0018, B:9:0x08a6, B:11:0x0035, B:13:0x0041, B:14:0x0046, B:16:0x004a, B:19:0x004f, B:21:0x005a, B:22:0x0066, B:23:0x006b, B:24:0x0077, B:27:0x007e, B:29:0x0088, B:31:0x008d, B:33:0x0099, B:34:0x009e, B:36:0x00a6, B:38:0x00bd, B:40:0x00c3, B:45:0x00cc, B:49:0x00d1, B:51:0x00f5, B:53:0x00fb, B:54:0x0111, B:55:0x0118, B:57:0x011d, B:60:0x0128, B:62:0x0130, B:64:0x0134, B:66:0x013a, B:69:0x013e, B:71:0x0142, B:68:0x0147, B:77:0x014a, B:78:0x0178, B:80:0x017e, B:81:0x015a, B:83:0x0163, B:87:0x018b, B:89:0x0197, B:470:0x01e8, B:472:0x0206, B:473:0x0221, B:90:0x0237, B:92:0x0243, B:94:0x0262, B:96:0x0270, B:98:0x0283, B:101:0x0286, B:103:0x028f, B:105:0x029b, B:107:0x02a5, B:108:0x02aa, B:111:0x02cb, B:113:0x02d3, B:115:0x02db, B:117:0x02e1, B:118:0x02e6, B:121:0x0311, B:123:0x0319, B:125:0x0327, B:127:0x032d, B:130:0x0342, B:132:0x034a, B:134:0x0352, B:135:0x035e, B:137:0x0365, B:139:0x036b, B:140:0x0370, B:142:0x039b, B:143:0x03a7, B:145:0x03ab, B:152:0x03b3, B:148:0x03be, B:155:0x03c7, B:158:0x03cf, B:161:0x03e1, B:162:0x03e9, B:164:0x03f3, B:166:0x03ff, B:169:0x0407, B:171:0x0417, B:173:0x0421, B:174:0x035c, B:175:0x0427, B:177:0x042d, B:181:0x0436, B:183:0x043b, B:184:0x0443, B:185:0x044e, B:187:0x045e, B:199:0x0518, B:201:0x0522, B:202:0x04ff, B:213:0x04f0, B:215:0x04fc, B:226:0x0526, B:228:0x0532, B:229:0x0538, B:230:0x046d, B:233:0x048e, B:239:0x0539, B:241:0x0543, B:243:0x0547, B:244:0x054e, B:246:0x055d, B:248:0x0569, B:249:0x056f, B:250:0x05a5, B:252:0x05ad, B:254:0x05b5, B:256:0x05bb, B:257:0x05c2, B:259:0x05ca, B:260:0x05d7, B:263:0x05dd, B:266:0x05e9, B:267:0x05ec, B:271:0x05f5, B:275:0x0621, B:278:0x062a, B:280:0x062f, B:282:0x0637, B:284:0x063d, B:286:0x0643, B:288:0x0646, B:293:0x06dd, B:295:0x06e7, B:296:0x06ef, B:298:0x071a, B:300:0x0723, B:303:0x072c, B:305:0x0732, B:307:0x0738, B:309:0x0742, B:311:0x0746, B:316:0x0752, B:321:0x075c, B:328:0x0763, B:329:0x0766, B:333:0x0770, B:335:0x0778, B:337:0x077e, B:338:0x07ff, B:340:0x0806, B:342:0x080c, B:344:0x0814, B:346:0x0818, B:350:0x082b, B:351:0x0841, B:352:0x0823, B:355:0x082f, B:358:0x0836, B:359:0x083c, B:360:0x0786, B:362:0x078d, B:364:0x0792, B:366:0x07d3, B:368:0x07db, B:370:0x0799, B:373:0x079f, B:375:0x07b7, B:379:0x07df, B:381:0x07e6, B:383:0x07eb, B:386:0x07f4, B:388:0x0649, B:390:0x064d, B:394:0x0654, B:396:0x0659, B:399:0x0667, B:404:0x066f, B:408:0x0672, B:412:0x068a, B:414:0x068f, B:417:0x0699, B:419:0x069f, B:422:0x06b7, B:424:0x06c1, B:427:0x06c9, B:432:0x06d7, B:429:0x06da, B:440:0x05bf, B:442:0x0845, B:446:0x084e, B:448:0x0854, B:449:0x085b, B:451:0x0862, B:454:0x086f, B:456:0x0875, B:459:0x0880, B:462:0x0887), top: B:2:0x0009 }] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        boolean z6;
        boolean z9;
        long j6;
        boolean z10;
        boolean z11;
        q qVar;
        int i4;
        long longValue;
        boolean z12;
        s.a aVar;
        long j9;
        int i6;
        c cVar;
        long j10;
        long j11;
        long j12;
        long j13;
        int i9 = 2;
        try {
            try {
                int i10 = message.what;
                long j14 = 0;
                long j15 = com.anythink.basead.exoplayer.b.f7168b;
                try {
                    switch (i10) {
                        case 0:
                            com.anythink.basead.exoplayer.h.s sVar = (com.anythink.basead.exoplayer.h.s) message.obj;
                            boolean z13 = message.arg1 != 0;
                            boolean z14 = message.arg2 != 0;
                            this.f9113Z++;
                            a(true, z13, z14);
                            this.f9092C.a();
                            this.f9107S = sVar;
                            b(2);
                            sVar.a(this.f9096G, true, this);
                            this.f9093D.b(2);
                            d();
                            return true;
                        case 1:
                            boolean z15 = message.arg1 != 0;
                            this.f9111W = false;
                            this.f9110V = z15;
                            if (z15) {
                                int i11 = this.f9106R.f9539f;
                                if (i11 == 3) {
                                    e();
                                    this.f9093D.b(2);
                                } else if (i11 == 2) {
                                    this.f9093D.b(2);
                                }
                            } else {
                                f();
                                g();
                            }
                            d();
                            return true;
                        case 2:
                            long b9 = this.f9103O.b();
                            com.anythink.basead.exoplayer.h.s sVar2 = this.f9107S;
                            if (sVar2 != null) {
                                if (this.f9113Z > 0) {
                                    sVar2.b();
                                } else {
                                    this.f9104P.a(this.ab);
                                    if (this.f9104P.a()) {
                                        r a9 = this.f9104P.a(this.ab, this.f9106R);
                                        if (a9 == null) {
                                            this.f9107S.b();
                                        } else {
                                            this.f9104P.a(this.f9115z, this.f9090A, this.f9092C.d(), this.f9107S, this.f9106R.f9534a.a(a9.f9488a.f8553a, this.f9098I, true).f7129b, a9).a(this, a9.f9489b);
                                            d(true);
                                        }
                                    }
                                    q b10 = this.f9104P.b();
                                    if (b10 == null || b10.a()) {
                                        d(false);
                                    } else if (!this.f9106R.f9540g) {
                                        r();
                                    }
                                    if (this.f9104P.f()) {
                                        q c9 = this.f9104P.c();
                                        q d9 = this.f9104P.d();
                                        boolean z16 = false;
                                        while (this.f9110V && c9 != d9 && this.ab >= c9.i.f9478e) {
                                            if (z16) {
                                                d();
                                            }
                                            int i12 = c9.f9481h.f9493f ? 0 : 3;
                                            q h3 = this.f9104P.h();
                                            a(c9);
                                            u uVar = this.f9106R;
                                            r rVar = h3.f9481h;
                                            this.f9106R = uVar.a(rVar.f9488a, rVar.f9489b, rVar.f9491d);
                                            this.f9101M.b(i12);
                                            g();
                                            c9 = h3;
                                            j15 = j15;
                                            z16 = true;
                                        }
                                        j6 = j15;
                                        if (d9.f9481h.f9494g) {
                                            int i13 = 0;
                                            while (true) {
                                                y[] yVarArr = this.f9114y;
                                                if (i13 < yVarArr.length) {
                                                    y yVar = yVarArr[i13];
                                                    com.anythink.basead.exoplayer.h.y yVar2 = d9.f9476c[i13];
                                                    if (yVar2 != null && yVar.f() == yVar2 && yVar.g()) {
                                                        yVar.h();
                                                    }
                                                    i13++;
                                                }
                                            }
                                        } else {
                                            q qVar2 = d9.i;
                                            if (qVar2 != null && qVar2.f9479f) {
                                                while (true) {
                                                    y[] yVarArr2 = this.f9114y;
                                                    if (i4 < yVarArr2.length) {
                                                        y yVar3 = yVarArr2[i4];
                                                        com.anythink.basead.exoplayer.h.y yVar4 = d9.f9476c[i4];
                                                        i4 = (yVar3.f() == yVar4 && (yVar4 == null || yVar3.g())) ? i4 + 1 : 0;
                                                    } else {
                                                        com.anythink.basead.exoplayer.i.i iVar = d9.f9483k;
                                                        q g9 = this.f9104P.g();
                                                        com.anythink.basead.exoplayer.i.i iVar2 = g9.f9483k;
                                                        boolean z17 = g9.f9474a.c() != j6;
                                                        int i14 = 0;
                                                        while (true) {
                                                            y[] yVarArr3 = this.f9114y;
                                                            if (i14 < yVarArr3.length) {
                                                                y yVar5 = yVarArr3[i14];
                                                                if (iVar.a(i14)) {
                                                                    if (!z17) {
                                                                        if (!yVar5.i()) {
                                                                            com.anythink.basead.exoplayer.i.f a10 = iVar2.f8769c.a(i14);
                                                                            boolean a11 = iVar2.a(i14);
                                                                            boolean z18 = this.f9115z[i14].a() == 5;
                                                                            aa aaVar = iVar.f8768b[i14];
                                                                            aa aaVar2 = iVar2.f8768b[i14];
                                                                            if (a11 && aaVar2.equals(aaVar) && !z18) {
                                                                                yVar5.a(a(a10), g9.f9476c[i14], g9.f9478e);
                                                                            }
                                                                        }
                                                                    }
                                                                    yVar5.h();
                                                                }
                                                                i14++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (this.f9104P.f()) {
                                            n();
                                            a(b9, 10L);
                                        } else {
                                            q c10 = this.f9104P.c();
                                            com.anythink.basead.exoplayer.k.ad.a("doSomeWork");
                                            g();
                                            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                                            c10.f9474a.a(this.f9106R.f9542j - this.J, this.f9099K);
                                            boolean z19 = true;
                                            boolean z20 = true;
                                            for (y yVar6 : this.f9108T) {
                                                yVar6.a(this.ab, elapsedRealtime);
                                                z20 = z20 && yVar6.v();
                                                if (!yVar6.u() && !yVar6.v() && ((qVar = this.f9104P.d().i) == null || !qVar.f9479f || !yVar6.g())) {
                                                    z11 = false;
                                                    if (!z11) {
                                                        yVar6.j();
                                                    }
                                                    z19 = !z19 && z11;
                                                }
                                                z11 = true;
                                                if (!z11) {
                                                }
                                                if (z19) {
                                                }
                                            }
                                            if (!z19) {
                                                n();
                                            }
                                            long j16 = c10.f9481h.f9492e;
                                            if (!z20 || ((j16 != j6 && j16 > this.f9106R.f9542j) || !c10.f9481h.f9494g)) {
                                                u uVar2 = this.f9106R;
                                                if (uVar2.f9539f == 2) {
                                                    if (this.f9108T.length == 0) {
                                                        z10 = m();
                                                    } else {
                                                        if (z19) {
                                                            if (uVar2.f9540g) {
                                                                q b11 = this.f9104P.b();
                                                                long a12 = b11.a(!b11.f9481h.f9494g);
                                                                if (a12 != Long.MIN_VALUE) {
                                                                    if (this.f9092C.a(a12 - (this.ab - b11.f9478e), this.f9100L.e().f9545b, this.f9111W)) {
                                                                    }
                                                                }
                                                            }
                                                            z10 = true;
                                                        }
                                                        z10 = false;
                                                    }
                                                    if (z10) {
                                                        b(3);
                                                        if (this.f9110V) {
                                                            e();
                                                        }
                                                    }
                                                }
                                                if (this.f9106R.f9539f == 3) {
                                                    if (this.f9108T.length == 0) {
                                                        if (m()) {
                                                        }
                                                        this.f9111W = this.f9110V;
                                                        b(2);
                                                        f();
                                                    }
                                                }
                                            } else {
                                                b(4);
                                                f();
                                            }
                                            if (this.f9106R.f9539f == 2) {
                                                for (y yVar7 : this.f9108T) {
                                                    yVar7.j();
                                                }
                                            }
                                            if (this.f9110V) {
                                                if (this.f9106R.f9539f != 3) {
                                                }
                                                a(b9, 10L);
                                                com.anythink.basead.exoplayer.k.ad.a();
                                            }
                                            int i15 = this.f9106R.f9539f;
                                            if (i15 == 2) {
                                                a(b9, 10L);
                                                com.anythink.basead.exoplayer.k.ad.a();
                                            } else {
                                                if (this.f9108T.length == 0 || i15 == 4) {
                                                    this.f9093D.b();
                                                } else {
                                                    a(b9, 1000L);
                                                }
                                                com.anythink.basead.exoplayer.k.ad.a();
                                            }
                                        }
                                        d();
                                        return true;
                                    }
                                }
                            }
                            j6 = -9223372036854775807L;
                            if (this.f9104P.f()) {
                            }
                            d();
                            return true;
                        case 3:
                            d dVar = (d) message.obj;
                            this.f9101M.a(1);
                            Pair<Integer, Long> a13 = a(dVar, true);
                            try {
                                if (a13 == null) {
                                    aVar = new s.a(j());
                                    longValue = -9223372036854775807L;
                                    j9 = -9223372036854775807L;
                                } else {
                                    int intValue = ((Integer) a13.first).intValue();
                                    long longValue2 = ((Long) a13.second).longValue();
                                    s.a a14 = this.f9104P.a(intValue, longValue2);
                                    if (!a14.a()) {
                                        longValue = ((Long) a13.second).longValue();
                                        z12 = dVar.f9167c == com.anythink.basead.exoplayer.b.f7168b;
                                        aVar = a14;
                                        j9 = longValue2;
                                        if (this.f9107S != null && this.f9113Z <= 0) {
                                            if (longValue != com.anythink.basead.exoplayer.b.f7168b) {
                                                b(4);
                                                a(false, true, false);
                                                j10 = longValue;
                                                this.f9106R = this.f9106R.a(aVar, j10, j9);
                                                if (z12) {
                                                    cVar = this.f9101M;
                                                    i6 = 2;
                                                    cVar.b(i6);
                                                }
                                                d();
                                                return true;
                                            }
                                            if (aVar.equals(this.f9106R.f9536c)) {
                                                q c11 = this.f9104P.c();
                                                j11 = (c11 == null || longValue == 0) ? longValue : c11.f9474a.a(longValue, this.f9105Q);
                                                if (com.anythink.basead.exoplayer.b.a(j11) == com.anythink.basead.exoplayer.b.a(this.f9106R.f9542j)) {
                                                    this.f9106R = this.f9106R.a(aVar, this.f9106R.f9542j, j9);
                                                    if (z12) {
                                                        cVar = this.f9101M;
                                                        i6 = 2;
                                                        cVar.b(i6);
                                                    }
                                                    d();
                                                    return true;
                                                }
                                            } else {
                                                j11 = longValue;
                                            }
                                            long a15 = a(aVar, j11);
                                            z12 |= longValue != a15;
                                            j10 = a15;
                                            this.f9106R = this.f9106R.a(aVar, j10, j9);
                                            if (z12) {
                                            }
                                            d();
                                            return true;
                                        }
                                        this.aa = dVar;
                                        j10 = longValue;
                                        this.f9106R = this.f9106R.a(aVar, j10, j9);
                                        if (z12) {
                                        }
                                        d();
                                        return true;
                                    }
                                    aVar = a14;
                                    j9 = longValue2;
                                    longValue = 0;
                                }
                                if (this.f9107S != null) {
                                    if (longValue != com.anythink.basead.exoplayer.b.f7168b) {
                                    }
                                }
                                this.aa = dVar;
                                j10 = longValue;
                                this.f9106R = this.f9106R.a(aVar, j10, j9);
                                if (z12) {
                                }
                                d();
                                return true;
                            } finally {
                                this.f9106R = this.f9106R.a(aVar, longValue, j9);
                                if (z12) {
                                    this.f9101M.b(2);
                                }
                            }
                            z12 = true;
                            break;
                        case 4:
                            this.f9100L.a((v) message.obj);
                            d();
                            return true;
                        case 5:
                            this.f9105Q = (ac) message.obj;
                            d();
                            return true;
                        case 6:
                            a(message.arg1 != 0, true);
                            d();
                            return true;
                        case 7:
                            i();
                            return true;
                        case 8:
                            a aVar2 = (a) message.obj;
                            if (aVar2.f9118a == this.f9107S) {
                                ae aeVar = this.f9106R.f9534a;
                                ae aeVar2 = aVar2.f9119b;
                                Object obj = aVar2.f9120c;
                                this.f9104P.a(aeVar2);
                                this.f9106R = this.f9106R.a(aeVar2, obj);
                                for (int size = this.f9102N.size() - 1; size >= 0; size--) {
                                    if (!a(this.f9102N.get(size))) {
                                        this.f9102N.get(size).f9145a.a(false);
                                        this.f9102N.remove(size);
                                    }
                                }
                                Collections.sort(this.f9102N);
                                int i16 = this.f9113Z;
                                if (i16 > 0) {
                                    this.f9101M.a(i16);
                                    this.f9113Z = 0;
                                    d dVar2 = this.aa;
                                    if (dVar2 != null) {
                                        Pair<Integer, Long> a16 = a(dVar2, true);
                                        this.aa = null;
                                        if (a16 == null) {
                                            o();
                                        } else {
                                            int intValue2 = ((Integer) a16.first).intValue();
                                            long longValue3 = ((Long) a16.second).longValue();
                                            s.a a17 = this.f9104P.a(intValue2, longValue3);
                                            this.f9106R = this.f9106R.a(a17, a17.a() ? 0L : longValue3, longValue3);
                                        }
                                    } else if (this.f9106R.f9537d == com.anythink.basead.exoplayer.b.f7168b) {
                                        if (aeVar2.a()) {
                                            o();
                                        } else {
                                            Pair<Integer, Long> a18 = a(aeVar2, aeVar2.b(this.Y));
                                            int intValue3 = ((Integer) a18.first).intValue();
                                            long longValue4 = ((Long) a18.second).longValue();
                                            s.a a19 = this.f9104P.a(intValue3, longValue4);
                                            this.f9106R = this.f9106R.a(a19, a19.a() ? 0L : longValue4, longValue4);
                                        }
                                    }
                                } else {
                                    u uVar3 = this.f9106R;
                                    int i17 = uVar3.f9536c.f8553a;
                                    long j17 = uVar3.f9538e;
                                    if (!aeVar.a()) {
                                        q e9 = this.f9104P.e();
                                        int a20 = aeVar2.a(e9 == null ? aeVar.a(i17, this.f9098I, true).f7129b : e9.f9475b);
                                        if (a20 == -1) {
                                            int a21 = a(i17, aeVar, aeVar2);
                                            if (a21 == -1) {
                                                o();
                                            } else {
                                                Pair<Integer, Long> a22 = a(aeVar2, aeVar2.a(a21, this.f9098I, false).f7130c);
                                                int intValue4 = ((Integer) a22.first).intValue();
                                                long longValue5 = ((Long) a22.second).longValue();
                                                s.a a23 = this.f9104P.a(intValue4, longValue5);
                                                aeVar2.a(intValue4, this.f9098I, true);
                                                if (e9 != null) {
                                                    Object obj2 = this.f9098I.f7129b;
                                                    e9.f9481h = e9.f9481h.a();
                                                    while (true) {
                                                        e9 = e9.i;
                                                        if (e9 != null) {
                                                            if (e9.f9475b.equals(obj2)) {
                                                                e9.f9481h = this.f9104P.a(e9.f9481h, intValue4);
                                                            } else {
                                                                e9.f9481h = e9.f9481h.a();
                                                            }
                                                        }
                                                    }
                                                }
                                                if (!a23.a()) {
                                                    j14 = longValue5;
                                                }
                                                this.f9106R = this.f9106R.a(a23, a(a23, j14), longValue5);
                                            }
                                        } else {
                                            if (a20 != i17) {
                                                this.f9106R = this.f9106R.a(a20);
                                            }
                                            s.a aVar3 = this.f9106R.f9536c;
                                            if (aVar3.a()) {
                                                s.a a24 = this.f9104P.a(a20, j17);
                                                if (!a24.equals(aVar3)) {
                                                    if (!a24.a()) {
                                                        j14 = j17;
                                                    }
                                                    this.f9106R = this.f9106R.a(a24, a(a24, j14), j17);
                                                }
                                            }
                                            if (!this.f9104P.a(aVar3, this.ab)) {
                                                g(false);
                                            }
                                        }
                                    } else if (!aeVar2.a()) {
                                        s.a a25 = this.f9104P.a(i17, j17);
                                        u uVar4 = this.f9106R;
                                        if (a25.a()) {
                                            j13 = j17;
                                            j12 = 0;
                                        } else {
                                            j12 = j17;
                                            j13 = j12;
                                        }
                                        this.f9106R = uVar4.a(a25, j12, j13);
                                    }
                                }
                            }
                            d();
                            return true;
                        case 9:
                            try {
                                if (this.f9104P.a((com.anythink.basead.exoplayer.h.r) message.obj)) {
                                    q b12 = this.f9104P.b();
                                    float f2 = this.f9100L.e().f9545b;
                                    b12.f9479f = true;
                                    b12.f9482j = b12.f9474a.b();
                                    b12.a(f2);
                                    long b13 = b12.b(b12.f9481h.f9489b);
                                    long j18 = b12.f9478e;
                                    r rVar2 = b12.f9481h;
                                    b12.f9478e = (rVar2.f9489b - b13) + j18;
                                    b12.f9481h = new r(rVar2.f9488a, b13, rVar2.f9490c, rVar2.f9491d, rVar2.f9492e, rVar2.f9493f, rVar2.f9494g);
                                    a(b12.f9483k);
                                    if (!this.f9104P.f()) {
                                        a(this.f9104P.h().f9481h.f9489b);
                                        a((q) null);
                                    }
                                    r();
                                }
                                d();
                                return true;
                            } catch (g e10) {
                                e = e10;
                                i9 = 2;
                                z9 = false;
                                Log.e(f9070d, "Playback error.", e);
                                a(z9, z9);
                                this.f9095F.obtainMessage(i9, e).sendToTarget();
                                d();
                                return true;
                            } catch (IOException e11) {
                                e = e11;
                                i9 = 2;
                                z6 = false;
                                Log.e(f9070d, "Source error.", e);
                                a(z6, z6);
                                this.f9095F.obtainMessage(i9, g.a(e)).sendToTarget();
                                d();
                                return true;
                            } catch (RuntimeException e12) {
                                e = e12;
                                Log.e(f9070d, "Internal runtime error.", e);
                                a(false, false);
                                this.f9095F.obtainMessage(2, g.a(e)).sendToTarget();
                                d();
                                return true;
                            }
                        case 10:
                            if (this.f9104P.a((com.anythink.basead.exoplayer.h.r) message.obj)) {
                                this.f9104P.a(this.ab);
                                r();
                            }
                            d();
                            return true;
                        case 11:
                            if (this.f9104P.f()) {
                                float f9 = this.f9100L.e().f9545b;
                                q c12 = this.f9104P.c();
                                q d10 = this.f9104P.d();
                                boolean z21 = true;
                                while (true) {
                                    if (c12 != null && c12.f9479f) {
                                        if (c12.a(f9)) {
                                            if (z21) {
                                                q c13 = this.f9104P.c();
                                                boolean a26 = this.f9104P.a(c13);
                                                boolean[] zArr = new boolean[this.f9114y.length];
                                                long a27 = c13.a(this.f9106R.f9542j, a26, zArr);
                                                a(c13.f9483k);
                                                u uVar5 = this.f9106R;
                                                if (uVar5.f9539f != 4 && a27 != uVar5.f9542j) {
                                                    u uVar6 = this.f9106R;
                                                    this.f9106R = uVar6.a(uVar6.f9536c, a27, uVar6.f9538e);
                                                    this.f9101M.b(4);
                                                    a(a27);
                                                }
                                                boolean[] zArr2 = new boolean[this.f9114y.length];
                                                int i18 = 0;
                                                int i19 = 0;
                                                while (true) {
                                                    y[] yVarArr4 = this.f9114y;
                                                    if (i18 < yVarArr4.length) {
                                                        y yVar8 = yVarArr4[i18];
                                                        boolean z22 = yVar8.a_() != 0;
                                                        zArr2[i18] = z22;
                                                        com.anythink.basead.exoplayer.h.y yVar9 = c13.f9476c[i18];
                                                        if (yVar9 != null) {
                                                            i19++;
                                                        }
                                                        if (z22) {
                                                            if (yVar9 != yVar8.f()) {
                                                                b(yVar8);
                                                            } else if (zArr[i18]) {
                                                                yVar8.a(this.ab);
                                                            }
                                                        }
                                                        i18++;
                                                    } else {
                                                        this.f9106R = this.f9106R.a(c13.f9482j, c13.f9483k);
                                                        a(zArr2, i19);
                                                    }
                                                }
                                            } else {
                                                this.f9104P.a(c12);
                                                if (c12.f9479f) {
                                                    c12.b(Math.max(c12.f9481h.f9489b, this.ab - c12.f9478e));
                                                    a(c12.f9483k);
                                                }
                                            }
                                            if (this.f9106R.f9539f != 4) {
                                                r();
                                                g();
                                                this.f9093D.b(2);
                                            }
                                        } else {
                                            if (c12 == d10) {
                                                z21 = false;
                                            }
                                            c12 = c12.i;
                                        }
                                    }
                                }
                            }
                            d();
                            return true;
                        case 12:
                            int i20 = message.arg1;
                            this.f9112X = i20;
                            if (!this.f9104P.a(i20)) {
                                g(true);
                            }
                            d();
                            return true;
                        case 13:
                            boolean z23 = message.arg1 != 0;
                            this.Y = z23;
                            if (!this.f9104P.a(z23)) {
                                g(true);
                            }
                            d();
                            return true;
                        case 14:
                            x xVar = (x) message.obj;
                            if (xVar.f() == com.anythink.basead.exoplayer.b.f7168b) {
                                d(xVar);
                            } else {
                                if (this.f9107S != null && this.f9113Z <= 0) {
                                    b bVar = new b(xVar);
                                    if (a(bVar)) {
                                        this.f9102N.add(bVar);
                                        Collections.sort(this.f9102N);
                                    } else {
                                        xVar.a(false);
                                    }
                                }
                                this.f9102N.add(new b(xVar));
                            }
                            d();
                            return true;
                        case 15:
                            x xVar2 = (x) message.obj;
                            xVar2.e().post(new AnonymousClass1(xVar2));
                            d();
                            return true;
                        default:
                            return false;
                    }
                } catch (g e13) {
                    e = e13;
                } catch (IOException e14) {
                    e = e14;
                }
            } catch (RuntimeException e15) {
                e = e15;
            }
        } catch (g e16) {
            e = e16;
            z9 = false;
        } catch (IOException e17) {
            e = e17;
            z6 = false;
        }
    }

    public final void b(boolean z6) {
        this.f9093D.a(13, z6 ? 1 : 0).sendToTarget();
    }

    @Override // com.anythink.basead.exoplayer.i.h.a
    public final void c() {
        this.f9093D.b(11);
    }

    public static final class b implements Comparable<b> {

        /* renamed from: a, reason: collision with root package name */
        public final x f9145a;

        /* renamed from: b, reason: collision with root package name */
        public int f9146b;

        /* renamed from: c, reason: collision with root package name */
        public long f9147c;

        /* renamed from: d, reason: collision with root package name */
        public Object f9148d;

        public b(x xVar) {
            this.f9145a = xVar;
        }

        public final void a(int i, long j6, Object obj) {
            this.f9146b = i;
            this.f9147c = j6;
            this.f9148d = obj;
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(b bVar) {
            b bVar2 = bVar;
            Object obj = this.f9148d;
            if ((obj == null) != (bVar2.f9148d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i = this.f9146b - bVar2.f9146b;
            return i != 0 ? i : com.anythink.basead.exoplayer.k.af.b(this.f9147c, bVar2.f9147c);
        }

        private int a(b bVar) {
            Object obj = this.f9148d;
            if ((obj == null) != (bVar.f9148d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i = this.f9146b - bVar.f9146b;
            return i != 0 ? i : com.anythink.basead.exoplayer.k.af.b(this.f9147c, bVar.f9147c);
        }
    }

    private void c(int i4) {
        this.f9112X = i4;
        if (this.f9104P.a(i4)) {
            return;
        }
        g(true);
    }

    private void d() {
        if (this.f9101M.a(this.f9106R)) {
            this.f9095F.obtainMessage(0, this.f9101M.f9153b, this.f9101M.f9154c ? this.f9101M.f9155d : -1, this.f9106R).sendToTarget();
            this.f9101M.b(this.f9106R);
        }
    }

    public final void a(com.anythink.basead.exoplayer.h.s sVar, boolean z6, boolean z9) {
        this.f9093D.a(z6 ? 1 : 0, z9 ? 1 : 0, sVar).sendToTarget();
    }

    public final void b(v vVar) {
        this.f9093D.a(4, vVar).sendToTarget();
    }

    private void f() {
        this.f9100L.b();
        for (y yVar : this.f9108T) {
            a(yVar);
        }
    }

    public final Looper b() {
        return this.f9094E.getLooper();
    }

    private void b(com.anythink.basead.exoplayer.h.r rVar) {
        this.f9093D.a(10, rVar).sendToTarget();
    }

    private void b(int i4) {
        u uVar = this.f9106R;
        if (uVar.f9539f != i4) {
            this.f9106R = uVar.b(i4);
        }
    }

    private void c(v vVar) {
        this.f9100L.a(vVar);
    }

    public final void a(boolean z6) {
        this.f9093D.a(1, z6 ? 1 : 0).sendToTarget();
    }

    private void c(x xVar) {
        if (xVar.f() == com.anythink.basead.exoplayer.b.f7168b) {
            d(xVar);
            return;
        }
        if (this.f9107S != null && this.f9113Z <= 0) {
            b bVar = new b(xVar);
            if (a(bVar)) {
                this.f9102N.add(bVar);
                Collections.sort(this.f9102N);
                return;
            } else {
                xVar.a(false);
                return;
            }
        }
        this.f9102N.add(new b(xVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(x xVar) {
        if (xVar.j()) {
            return;
        }
        try {
            xVar.b().a(xVar.c(), xVar.d());
        } finally {
            xVar.a(true);
        }
    }

    public final void a(int i4) {
        this.f9093D.a(12, i4).sendToTarget();
    }

    private void b(com.anythink.basead.exoplayer.h.s sVar, boolean z6, boolean z9) {
        this.f9113Z++;
        a(true, z6, z9);
        this.f9092C.a();
        this.f9107S = sVar;
        b(2);
        sVar.a(this.f9096G, true, this);
        this.f9093D.b(2);
    }

    private void g() {
        long a9;
        if (this.f9104P.f()) {
            q c9 = this.f9104P.c();
            long c10 = c9.f9474a.c();
            if (c10 != com.anythink.basead.exoplayer.b.f7168b) {
                a(c10);
                if (c10 != this.f9106R.f9542j) {
                    u uVar = this.f9106R;
                    this.f9106R = uVar.a(uVar.f9536c, c10, uVar.f9538e);
                    this.f9101M.b(4);
                }
            } else {
                long c11 = this.f9100L.c();
                this.ab = c11;
                long j6 = c11 - c9.f9478e;
                b(this.f9106R.f9542j, j6);
                this.f9106R.f9542j = j6;
            }
            u uVar2 = this.f9106R;
            if (this.f9108T.length == 0) {
                a9 = c9.f9481h.f9492e;
            } else {
                a9 = c9.a(true);
            }
            uVar2.f9543k = a9;
        }
    }

    public final void a(ae aeVar, int i4, long j6) {
        this.f9093D.a(3, new d(aeVar, i4, j6)).sendToTarget();
    }

    private void e() {
        this.f9111W = false;
        this.f9100L.a();
        for (y yVar : this.f9108T) {
            yVar.b_();
        }
    }

    public final void a(ac acVar) {
        this.f9093D.a(5, acVar).sendToTarget();
    }

    @Override // com.anythink.basead.exoplayer.x.a
    public final synchronized void a(x xVar) {
        if (this.f9109U) {
            Log.w(f9070d, "Ignoring messages sent after release.");
            xVar.a(false);
        } else {
            this.f9093D.a(14, xVar).sendToTarget();
        }
    }

    private void d(x xVar) {
        if (xVar.e().getLooper() == this.f9093D.a()) {
            f(xVar);
            int i4 = this.f9106R.f9539f;
            if (i4 == 3 || i4 == 2) {
                this.f9093D.b(2);
                return;
            }
            return;
        }
        this.f9093D.a(15, xVar).sendToTarget();
    }

    private void e(x xVar) {
        xVar.e().post(new AnonymousClass1(xVar));
    }

    private void b(ac acVar) {
        this.f9105Q = acVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x006b, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0034, code lost:
    
        r1 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void b(long j6, long j9) {
        b bVar;
        b bVar2;
        if (this.f9102N.isEmpty() || this.f9106R.f9536c.a()) {
            return;
        }
        u uVar = this.f9106R;
        if (uVar.f9537d == j6) {
            j6--;
        }
        int i4 = uVar.f9536c.f8553a;
        int i6 = this.ac;
        if (i6 > 0) {
            bVar = this.f9102N.get(i6 - 1);
            while (bVar != null) {
                int i9 = bVar.f9146b;
                if (i9 <= i4 && (i9 != i4 || bVar.f9147c <= j6)) {
                    break;
                }
                int i10 = this.ac;
                int i11 = i10 - 1;
                this.ac = i11;
                if (i11 > 0) {
                    bVar = this.f9102N.get(i10 - 2);
                }
            }
            if (this.ac < this.f9102N.size()) {
                bVar2 = this.f9102N.get(this.ac);
                while (bVar2 != null && bVar2.f9148d != null) {
                    int i12 = bVar2.f9146b;
                    if (i12 >= i4 && (i12 != i4 || bVar2.f9147c > j6)) {
                        break;
                    }
                    int i13 = this.ac + 1;
                    this.ac = i13;
                    if (i13 < this.f9102N.size()) {
                        bVar2 = this.f9102N.get(this.ac);
                    }
                }
                while (bVar2 != null && bVar2.f9148d != null && bVar2.f9146b == i4) {
                    long j10 = bVar2.f9147c;
                    if (j10 <= j6 || j10 > j9) {
                        return;
                    }
                    d(bVar2.f9145a);
                    if (!bVar2.f9145a.h() && !bVar2.f9145a.j()) {
                        this.ac++;
                    } else {
                        this.f9102N.remove(this.ac);
                    }
                    bVar2 = this.ac < this.f9102N.size() ? this.f9102N.get(this.ac) : null;
                }
                return;
            }
            bVar2 = null;
        }
        bVar = null;
    }

    private void c(com.anythink.basead.exoplayer.h.r rVar) {
        if (this.f9104P.a(rVar)) {
            q b9 = this.f9104P.b();
            float f2 = this.f9100L.e().f9545b;
            b9.f9479f = true;
            b9.f9482j = b9.f9474a.b();
            b9.a(f2);
            long b10 = b9.b(b9.f9481h.f9489b);
            long j6 = b9.f9478e;
            r rVar2 = b9.f9481h;
            b9.f9478e = (rVar2.f9489b - b10) + j6;
            b9.f9481h = new r(rVar2.f9488a, b10, rVar2.f9490c, rVar2.f9491d, rVar2.f9492e, rVar2.f9493f, rVar2.f9494g);
            a(b9.f9483k);
            if (!this.f9104P.f()) {
                a(this.f9104P.h().f9481h.f9489b);
                a((q) null);
            }
            r();
        }
    }

    private void d(com.anythink.basead.exoplayer.h.r rVar) {
        if (this.f9104P.a(rVar)) {
            this.f9104P.a(this.ab);
            r();
        }
    }

    public final synchronized void a() {
        if (!this.f9109U && this.f9094E.isAlive()) {
            this.f9093D.b(7);
            long j6 = 500;
            long a9 = this.f9103O.a() + 500;
            boolean z6 = false;
            while (!this.f9109U && j6 > 0) {
                try {
                    wait(j6);
                } catch (InterruptedException unused) {
                    z6 = true;
                }
                j6 = a9 - this.f9103O.a();
            }
            if (z6) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.h.s.b
    public final void a(com.anythink.basead.exoplayer.h.s sVar, ae aeVar, Object obj) {
        this.f9093D.a(8, new a(sVar, aeVar, obj)).sendToTarget();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.anythink.basead.exoplayer.h.r.a
    public final void a(com.anythink.basead.exoplayer.h.r rVar) {
        this.f9093D.a(9, rVar).sendToTarget();
    }

    @Override // com.anythink.basead.exoplayer.e.a
    public final void a(v vVar) {
        this.f9095F.obtainMessage(1, vVar).sendToTarget();
        float f2 = vVar.f9545b;
        for (q e9 = this.f9104P.e(); e9 != null; e9 = e9.i) {
            com.anythink.basead.exoplayer.i.i iVar = e9.f9483k;
            if (iVar != null) {
                for (com.anythink.basead.exoplayer.i.f fVar : iVar.f8769c.a()) {
                    if (fVar != null) {
                        fVar.a(f2);
                    }
                }
            }
        }
    }

    private boolean c(y yVar) {
        q qVar = this.f9104P.d().i;
        return qVar != null && qVar.f9479f && yVar.g();
    }

    private void b(y yVar) {
        this.f9100L.b(yVar);
        a(yVar);
        yVar.l();
    }

    private void a(long j6, long j9) {
        this.f9093D.b();
        this.f9093D.a(j6 + j9);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(d dVar) {
        long longValue;
        boolean z6;
        s.a aVar;
        long j6;
        long j9;
        long j10;
        boolean z9 = true;
        this.f9101M.a(1);
        Pair<Integer, Long> a9 = a(dVar, true);
        if (a9 == null) {
            aVar = new s.a(j());
            z6 = true;
            longValue = -9223372036854775807L;
            j6 = -9223372036854775807L;
        } else {
            int intValue = ((Integer) a9.first).intValue();
            long longValue2 = ((Long) a9.second).longValue();
            s.a a10 = this.f9104P.a(intValue, longValue2);
            if (a10.a()) {
                z6 = true;
                longValue = 0;
            } else {
                longValue = ((Long) a9.second).longValue();
                z6 = dVar.f9167c == com.anythink.basead.exoplayer.b.f7168b;
            }
            aVar = a10;
            j6 = longValue2;
        }
        try {
            if (this.f9107S != null && this.f9113Z <= 0) {
                if (longValue == com.anythink.basead.exoplayer.b.f7168b) {
                    b(4);
                    a(false, true, false);
                    j9 = longValue;
                    this.f9106R = this.f9106R.a(aVar, j9, j6);
                    if (!z6) {
                        return;
                    }
                    this.f9101M.b(2);
                }
                if (aVar.equals(this.f9106R.f9536c)) {
                    q c9 = this.f9104P.c();
                    j10 = (c9 == null || longValue == 0) ? longValue : c9.f9474a.a(longValue, this.f9105Q);
                    if (com.anythink.basead.exoplayer.b.a(j10) == com.anythink.basead.exoplayer.b.a(this.f9106R.f9542j)) {
                        this.f9106R = this.f9106R.a(aVar, this.f9106R.f9542j, j6);
                        if (!z6) {
                            return;
                        }
                        this.f9101M.b(2);
                    }
                } else {
                    j10 = longValue;
                }
                long a11 = a(aVar, j10);
                if (longValue == a11) {
                    z9 = false;
                }
                z6 |= z9;
                j9 = a11;
                this.f9106R = this.f9106R.a(aVar, j9, j6);
                if (!z6) {
                }
                this.f9101M.b(2);
            }
            this.aa = dVar;
            j9 = longValue;
            this.f9106R = this.f9106R.a(aVar, j9, j6);
            if (!z6) {
            }
            this.f9101M.b(2);
        } catch (Throwable th) {
            this.f9106R = this.f9106R.a(aVar, longValue, j6);
            if (z6) {
                this.f9101M.b(2);
            }
            throw th;
        }
    }

    private long a(s.a aVar, long j6) {
        return a(aVar, j6, this.f9104P.c() != this.f9104P.d());
    }

    private long a(s.a aVar, long j6, boolean z6) {
        f();
        this.f9111W = false;
        b(2);
        q c9 = this.f9104P.c();
        q qVar = c9;
        while (true) {
            if (qVar == null) {
                break;
            }
            if (a(aVar, j6, qVar)) {
                this.f9104P.a(qVar);
                break;
            }
            qVar = this.f9104P.h();
        }
        if (c9 != qVar || z6) {
            for (y yVar : this.f9108T) {
                b(yVar);
            }
            this.f9108T = new y[0];
            c9 = null;
        }
        if (qVar != null) {
            a(c9);
            if (qVar.f9480g) {
                j6 = qVar.f9474a.b(j6);
                qVar.f9474a.a(j6 - this.J, this.f9099K);
            }
            a(j6);
            r();
        } else {
            this.f9104P.b(true);
            a(j6);
        }
        this.f9093D.b(2);
        return j6;
    }

    private boolean a(s.a aVar, long j6, q qVar) {
        if (aVar.equals(qVar.f9481h.f9488a) && qVar.f9479f) {
            this.f9106R.f9534a.a(qVar.f9481h.f9488a.f8553a, this.f9098I, false);
            int b9 = this.f9098I.b(j6);
            if (b9 == -1 || this.f9098I.a(b9) == qVar.f9481h.f9490c) {
                return true;
            }
        }
        return false;
    }

    private void a(long j6) {
        if (this.f9104P.f()) {
            j6 += this.f9104P.c().f9478e;
        }
        this.ab = j6;
        this.f9100L.a(j6);
        for (y yVar : this.f9108T) {
            yVar.a(this.ab);
        }
    }

    private void a(boolean z6, boolean z9) {
        a(true, z6, z6);
        this.f9101M.a(this.f9113Z + (z9 ? 1 : 0));
        this.f9113Z = 0;
        this.f9092C.b();
        b(1);
    }

    private void a(boolean z6, boolean z9, boolean z10) {
        com.anythink.basead.exoplayer.h.s sVar;
        this.f9093D.b();
        this.f9111W = false;
        this.f9100L.b();
        this.ab = 0L;
        for (y yVar : this.f9108T) {
            try {
                b(yVar);
            } catch (g | RuntimeException e9) {
                Log.e(f9070d, "Stop failed.", e9);
            }
        }
        this.f9108T = new y[0];
        this.f9104P.b(!z9);
        d(false);
        if (z9) {
            this.aa = null;
        }
        if (z10) {
            this.f9104P.a(ae.f7127a);
            Iterator<b> it = this.f9102N.iterator();
            while (it.hasNext()) {
                it.next().f9145a.a(false);
            }
            this.f9102N.clear();
            this.ac = 0;
        }
        ae aeVar = z10 ? ae.f7127a : this.f9106R.f9534a;
        Object obj = z10 ? null : this.f9106R.f9535b;
        s.a aVar = z9 ? new s.a(j()) : this.f9106R.f9536c;
        long j6 = com.anythink.basead.exoplayer.b.f7168b;
        long j9 = z9 ? -9223372036854775807L : this.f9106R.f9542j;
        if (!z9) {
            j6 = this.f9106R.f9538e;
        }
        long j10 = j6;
        u uVar = this.f9106R;
        this.f9106R = new u(aeVar, obj, aVar, j9, j10, uVar.f9539f, false, z10 ? af.f8301a : uVar.f9541h, z10 ? this.f9091B : uVar.i);
        if (!z6 || (sVar = this.f9107S) == null) {
            return;
        }
        sVar.a(this);
        this.f9107S = null;
    }

    private boolean h(boolean z6) {
        if (this.f9108T.length == 0) {
            return m();
        }
        if (!z6) {
            return false;
        }
        if (!this.f9106R.f9540g) {
            return true;
        }
        q b9 = this.f9104P.b();
        long a9 = b9.a(!b9.f9481h.f9494g);
        return a9 == Long.MIN_VALUE || this.f9092C.a(a9 - (this.ab - b9.f9478e), this.f9100L.e().f9545b, this.f9111W);
    }

    private boolean a(b bVar) {
        Object obj = bVar.f9148d;
        if (obj == null) {
            Pair<Integer, Long> a9 = a(new d(bVar.f9145a.a(), bVar.f9145a.g(), com.anythink.basead.exoplayer.b.b(bVar.f9145a.f())), false);
            if (a9 == null) {
                return false;
            }
            bVar.a(((Integer) a9.first).intValue(), ((Long) a9.second).longValue(), this.f9106R.f9534a.a(((Integer) a9.first).intValue(), this.f9098I, true).f7129b);
        } else {
            int a10 = this.f9106R.f9534a.a(obj);
            if (a10 == -1) {
                return false;
            }
            bVar.f9146b = a10;
        }
        return true;
    }

    private static void a(y yVar) {
        if (yVar.a_() == 2) {
            yVar.k();
        }
    }

    private void a(com.anythink.basead.exoplayer.i.i iVar) {
        this.f9092C.a(this.f9114y, iVar.f8769c);
    }

    private void a(float f2) {
        for (q e9 = this.f9104P.e(); e9 != null; e9 = e9.i) {
            com.anythink.basead.exoplayer.i.i iVar = e9.f9483k;
            if (iVar != null) {
                for (com.anythink.basead.exoplayer.i.f fVar : iVar.f8769c.a()) {
                    if (fVar != null) {
                        fVar.a(f2);
                    }
                }
            }
        }
    }

    private void a(a aVar) {
        if (aVar.f9118a != this.f9107S) {
            return;
        }
        ae aeVar = this.f9106R.f9534a;
        ae aeVar2 = aVar.f9119b;
        Object obj = aVar.f9120c;
        this.f9104P.a(aeVar2);
        this.f9106R = this.f9106R.a(aeVar2, obj);
        for (int size = this.f9102N.size() - 1; size >= 0; size--) {
            if (!a(this.f9102N.get(size))) {
                this.f9102N.get(size).f9145a.a(false);
                this.f9102N.remove(size);
            }
        }
        Collections.sort(this.f9102N);
        int i4 = this.f9113Z;
        if (i4 > 0) {
            this.f9101M.a(i4);
            this.f9113Z = 0;
            d dVar = this.aa;
            if (dVar != null) {
                Pair<Integer, Long> a9 = a(dVar, true);
                this.aa = null;
                if (a9 == null) {
                    o();
                    return;
                }
                int intValue = ((Integer) a9.first).intValue();
                long longValue = ((Long) a9.second).longValue();
                s.a a10 = this.f9104P.a(intValue, longValue);
                this.f9106R = this.f9106R.a(a10, a10.a() ? 0L : longValue, longValue);
                return;
            }
            if (this.f9106R.f9537d == com.anythink.basead.exoplayer.b.f7168b) {
                if (aeVar2.a()) {
                    o();
                    return;
                }
                Pair<Integer, Long> a11 = a(aeVar2, aeVar2.b(this.Y));
                int intValue2 = ((Integer) a11.first).intValue();
                long longValue2 = ((Long) a11.second).longValue();
                s.a a12 = this.f9104P.a(intValue2, longValue2);
                this.f9106R = this.f9106R.a(a12, a12.a() ? 0L : longValue2, longValue2);
                return;
            }
            return;
        }
        u uVar = this.f9106R;
        int i6 = uVar.f9536c.f8553a;
        long j6 = uVar.f9538e;
        if (aeVar.a()) {
            if (aeVar2.a()) {
                return;
            }
            s.a a13 = this.f9104P.a(i6, j6);
            this.f9106R = this.f9106R.a(a13, a13.a() ? 0L : j6, j6);
            return;
        }
        q e9 = this.f9104P.e();
        int a14 = aeVar2.a(e9 == null ? aeVar.a(i6, this.f9098I, true).f7129b : e9.f9475b);
        if (a14 == -1) {
            int a15 = a(i6, aeVar, aeVar2);
            if (a15 == -1) {
                o();
                return;
            }
            Pair<Integer, Long> a16 = a(aeVar2, aeVar2.a(a15, this.f9098I, false).f7130c);
            int intValue3 = ((Integer) a16.first).intValue();
            long longValue3 = ((Long) a16.second).longValue();
            s.a a17 = this.f9104P.a(intValue3, longValue3);
            aeVar2.a(intValue3, this.f9098I, true);
            if (e9 != null) {
                Object obj2 = this.f9098I.f7129b;
                e9.f9481h = e9.f9481h.a();
                while (true) {
                    e9 = e9.i;
                    if (e9 == null) {
                        break;
                    } else if (e9.f9475b.equals(obj2)) {
                        e9.f9481h = this.f9104P.a(e9.f9481h, intValue3);
                    } else {
                        e9.f9481h = e9.f9481h.a();
                    }
                }
            }
            this.f9106R = this.f9106R.a(a17, a(a17, a17.a() ? 0L : longValue3), longValue3);
            return;
        }
        if (a14 != i6) {
            this.f9106R = this.f9106R.a(a14);
        }
        s.a aVar2 = this.f9106R.f9536c;
        if (aVar2.a()) {
            s.a a18 = this.f9104P.a(a14, j6);
            if (!a18.equals(aVar2)) {
                this.f9106R = this.f9106R.a(a18, a(a18, a18.a() ? 0L : j6), j6);
                return;
            }
        }
        if (this.f9104P.a(aVar2, this.ab)) {
            return;
        }
        g(false);
    }

    private int a(int i4, ae aeVar, ae aeVar2) {
        int c9 = aeVar.c();
        int i6 = 0;
        int i9 = i4;
        int i10 = -1;
        while (i6 < c9 && i10 == -1) {
            ae aeVar3 = aeVar;
            i9 = aeVar3.a(i9, this.f9098I, this.f9097H, this.f9112X, this.Y);
            if (i9 == -1) {
                break;
            }
            i10 = aeVar2.a(aeVar3.a(i9, this.f9098I, true).f7129b);
            i6++;
            aeVar = aeVar3;
        }
        return i10;
    }

    private Pair<Integer, Long> a(d dVar, boolean z6) {
        int a9;
        ae aeVar = this.f9106R.f9534a;
        ae aeVar2 = dVar.f9165a;
        if (aeVar.a()) {
            return null;
        }
        ae aeVar3 = aeVar2.a() ? aeVar : aeVar2;
        try {
            Pair<Integer, Long> a10 = aeVar3.a(this.f9097H, this.f9098I, dVar.f9166b, dVar.f9167c);
            if (aeVar == aeVar3) {
                return a10;
            }
            int a11 = aeVar.a(aeVar3.a(((Integer) a10.first).intValue(), this.f9098I, true).f7129b);
            if (a11 != -1) {
                return Pair.create(Integer.valueOf(a11), (Long) a10.second);
            }
            if (!z6 || (a9 = a(((Integer) a10.first).intValue(), aeVar3, aeVar)) == -1) {
                return null;
            }
            return a(aeVar, aeVar.a(a9, this.f9098I, false).f7130c);
        } catch (IndexOutOfBoundsException unused) {
            throw new o(aeVar, dVar.f9166b, dVar.f9167c);
        }
    }

    private Pair<Integer, Long> a(ae aeVar, int i4) {
        return aeVar.a(this.f9097H, this.f9098I, i4, com.anythink.basead.exoplayer.b.f7168b);
    }

    private void a(q qVar) {
        q c9 = this.f9104P.c();
        if (c9 == null || qVar == c9) {
            return;
        }
        boolean[] zArr = new boolean[this.f9114y.length];
        int i4 = 0;
        int i6 = 0;
        while (true) {
            y[] yVarArr = this.f9114y;
            if (i4 < yVarArr.length) {
                y yVar = yVarArr[i4];
                zArr[i4] = yVar.a_() != 0;
                if (c9.f9483k.a(i4)) {
                    i6++;
                }
                if (zArr[i4] && (!c9.f9483k.a(i4) || (yVar.i() && yVar.f() == qVar.f9476c[i4]))) {
                    b(yVar);
                }
                i4++;
            } else {
                this.f9106R = this.f9106R.a(c9.f9482j, c9.f9483k);
                a(zArr, i6);
                return;
            }
        }
    }

    private void a(boolean[] zArr, int i4) {
        this.f9108T = new y[i4];
        q c9 = this.f9104P.c();
        int i6 = 0;
        for (int i9 = 0; i9 < this.f9114y.length; i9++) {
            if (c9.f9483k.a(i9)) {
                a(i9, zArr[i9], i6);
                i6++;
            }
        }
    }

    private void a(int i4, boolean z6, int i6) {
        q c9 = this.f9104P.c();
        y yVar = this.f9114y[i4];
        this.f9108T[i6] = yVar;
        if (yVar.a_() == 0) {
            com.anythink.basead.exoplayer.i.i iVar = c9.f9483k;
            aa aaVar = iVar.f8768b[i4];
            m[] a9 = a(iVar.f8769c.a(i4));
            boolean z9 = this.f9110V && this.f9106R.f9539f == 3;
            yVar.a(aaVar, a9, c9.f9476c[i4], this.ab, !z6 && z9, c9.f9478e);
            this.f9100L.a(yVar);
            if (z9) {
                yVar.b_();
            }
        }
    }

    private static m[] a(com.anythink.basead.exoplayer.i.f fVar) {
        int g9 = fVar != null ? fVar.g() : 0;
        m[] mVarArr = new m[g9];
        for (int i4 = 0; i4 < g9; i4++) {
            mVarArr[i4] = fVar.a(i4);
        }
        return mVarArr;
    }
}
