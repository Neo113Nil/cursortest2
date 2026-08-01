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
    public static final int f8281a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8282b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8283c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final String f8284d = "ExoPlayerImplInternal";

    /* renamed from: e, reason: collision with root package name */
    private static final int f8285e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static final int f8286f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static final int f8287g = 2;

    /* renamed from: h, reason: collision with root package name */
    private static final int f8288h = 3;
    private static final int i = 4;

    /* renamed from: j, reason: collision with root package name */
    private static final int f8289j = 5;

    /* renamed from: k, reason: collision with root package name */
    private static final int f8290k = 6;

    /* renamed from: l, reason: collision with root package name */
    private static final int f8291l = 7;

    /* renamed from: m, reason: collision with root package name */
    private static final int f8292m = 8;

    /* renamed from: n, reason: collision with root package name */
    private static final int f8293n = 9;

    /* renamed from: o, reason: collision with root package name */
    private static final int f8294o = 10;

    /* renamed from: p, reason: collision with root package name */
    private static final int f8295p = 11;

    /* renamed from: q, reason: collision with root package name */
    private static final int f8296q = 12;

    /* renamed from: r, reason: collision with root package name */
    private static final int f8297r = 13;

    /* renamed from: s, reason: collision with root package name */
    private static final int f8298s = 14;

    /* renamed from: t, reason: collision with root package name */
    private static final int f8299t = 15;

    /* renamed from: u, reason: collision with root package name */
    private static final int f8300u = 10;

    /* renamed from: v, reason: collision with root package name */
    private static final int f8301v = 10;

    /* renamed from: w, reason: collision with root package name */
    private static final int f8302w = 1000;

    /* renamed from: x, reason: collision with root package name */
    private static final long f8303x = 500;

    /* renamed from: A, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.i.h f8304A;

    /* renamed from: B, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.i.i f8305B;

    /* renamed from: C, reason: collision with root package name */
    private final p f8306C;

    /* renamed from: D, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.k f8307D;

    /* renamed from: E, reason: collision with root package name */
    private final HandlerThread f8308E;

    /* renamed from: F, reason: collision with root package name */
    private final Handler f8309F;

    /* renamed from: G, reason: collision with root package name */
    private final h f8310G;

    /* renamed from: H, reason: collision with root package name */
    private final ae.b f8311H;

    /* renamed from: I, reason: collision with root package name */
    private final ae.a f8312I;

    /* renamed from: L, reason: collision with root package name */
    private final e f8314L;

    /* renamed from: N, reason: collision with root package name */
    private final ArrayList<b> f8316N;

    /* renamed from: O, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.c f8317O;

    /* renamed from: R, reason: collision with root package name */
    private u f8320R;

    /* renamed from: S, reason: collision with root package name */
    private com.anythink.basead.exoplayer.h.s f8321S;

    /* renamed from: T, reason: collision with root package name */
    private y[] f8322T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f8323U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f8324V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f8325W;

    /* renamed from: X, reason: collision with root package name */
    private int f8326X;
    private boolean Y;

    /* renamed from: Z, reason: collision with root package name */
    private int f8327Z;
    private d aa;
    private long ab;
    private int ac;

    /* renamed from: y, reason: collision with root package name */
    private final y[] f8328y;

    /* renamed from: z, reason: collision with root package name */
    private final z[] f8329z;

    /* renamed from: P, reason: collision with root package name */
    private final s f8318P = new s();
    private final long J = 0;

    /* renamed from: K, reason: collision with root package name */
    private final boolean f8313K = false;

    /* renamed from: Q, reason: collision with root package name */
    private ac f8319Q = ac.f6315e;

    /* renamed from: M, reason: collision with root package name */
    private final c f8315M = new c(0);

    /* renamed from: com.anythink.basead.exoplayer.k$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f8330a;

        public AnonymousClass1(x xVar) {
            this.f8330a = xVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                k.f(this.f8330a);
            } catch (g e9) {
                Log.e(k.f8284d, "Unexpected error delivering message on external thread.", e9);
                throw new RuntimeException(e9);
            }
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final com.anythink.basead.exoplayer.h.s f8332a;

        /* renamed from: b, reason: collision with root package name */
        public final ae f8333b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f8334c;

        public a(com.anythink.basead.exoplayer.h.s sVar, ae aeVar, Object obj) {
            this.f8332a = sVar;
            this.f8333b = aeVar;
            this.f8334c = obj;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private u f8366a;

        /* renamed from: b, reason: collision with root package name */
        private int f8367b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f8368c;

        /* renamed from: d, reason: collision with root package name */
        private int f8369d;

        private c() {
        }

        public /* synthetic */ c(byte b9) {
            this();
        }

        public final boolean a(u uVar) {
            return uVar != this.f8366a || this.f8367b > 0 || this.f8368c;
        }

        public final void b(u uVar) {
            this.f8366a = uVar;
            this.f8367b = 0;
            this.f8368c = false;
        }

        public final void a(int i) {
            this.f8367b += i;
        }

        public final void b(int i) {
            if (this.f8368c && this.f8369d != 4) {
                com.anythink.basead.exoplayer.k.a.a(i == 4);
            } else {
                this.f8368c = true;
                this.f8369d = i;
            }
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final ae f8379a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8380b;

        /* renamed from: c, reason: collision with root package name */
        public final long f8381c;

        public d(ae aeVar, int i, long j6) {
            this.f8379a = aeVar;
            this.f8380b = i;
            this.f8381c = j6;
        }
    }

    public k(y[] yVarArr, com.anythink.basead.exoplayer.i.h hVar, com.anythink.basead.exoplayer.i.i iVar, p pVar, boolean z3, int i6, boolean z6, Handler handler, h hVar2, com.anythink.basead.exoplayer.k.c cVar) {
        this.f8328y = yVarArr;
        this.f8304A = hVar;
        this.f8305B = iVar;
        this.f8306C = pVar;
        this.f8324V = z3;
        this.f8326X = i6;
        this.Y = z6;
        this.f8309F = handler;
        this.f8310G = hVar2;
        this.f8317O = cVar;
        this.f8320R = new u(ae.f6341a, com.anythink.basead.exoplayer.b.f6382b, af.f7515a, iVar);
        this.f8329z = new z[yVarArr.length];
        for (int i9 = 0; i9 < yVarArr.length; i9++) {
            yVarArr[i9].a(i9);
            this.f8329z[i9] = yVarArr[i9].b();
        }
        this.f8314L = new e(this, cVar);
        this.f8316N = new ArrayList<>();
        this.f8322T = new y[0];
        this.f8311H = new ae.b();
        this.f8312I = new ae.a();
        hVar.a((h.a) this);
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f8308E = handlerThread;
        handlerThread.start();
        this.f8307D = cVar.a(handlerThread.getLooper(), this);
    }

    private void d(boolean z3) {
        u uVar = this.f8320R;
        if (uVar.f8754g != z3) {
            this.f8320R = uVar.a(z3);
        }
    }

    private void e(boolean z3) {
        this.f8325W = false;
        this.f8324V = z3;
        if (!z3) {
            f();
            g();
            return;
        }
        int i6 = this.f8320R.f8753f;
        if (i6 == 3) {
            e();
            this.f8307D.b(2);
        } else if (i6 == 2) {
            this.f8307D.b(2);
        }
    }

    private void f(boolean z3) {
        this.Y = z3;
        if (this.f8318P.a(z3)) {
            return;
        }
        g(true);
    }

    private void g(boolean z3) {
        s.a aVar = this.f8318P.c().f8695h.f8702a;
        long a9 = a(aVar, this.f8320R.f8756j, true);
        if (a9 != this.f8320R.f8756j) {
            u uVar = this.f8320R;
            this.f8320R = uVar.a(aVar, a9, uVar.f8752e);
            if (z3) {
                this.f8315M.b(4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0296, code lost:
    
        if (r20.f8306C.a(r4 - (r20.ab - r3.f8692e), r20.f8314L.e().f8759b, r20.f8325W) == false) goto L147;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void h() {
        long j6;
        int i6;
        q qVar;
        long b9 = this.f8317O.b();
        com.anythink.basead.exoplayer.h.s sVar = this.f8321S;
        boolean z3 = false;
        boolean z6 = true;
        if (sVar != null) {
            if (this.f8327Z > 0) {
                sVar.b();
            } else {
                this.f8318P.a(this.ab);
                if (this.f8318P.a()) {
                    r a9 = this.f8318P.a(this.ab, this.f8320R);
                    if (a9 == null) {
                        this.f8321S.b();
                    } else {
                        this.f8318P.a(this.f8329z, this.f8304A, this.f8306C.d(), this.f8321S, this.f8320R.f8748a.a(a9.f8702a.f7767a, this.f8312I, true).f6343b, a9).a(this, a9.f8703b);
                        d(true);
                    }
                }
                q b10 = this.f8318P.b();
                if (b10 == null || b10.a()) {
                    d(false);
                } else if (!this.f8320R.f8754g) {
                    r();
                }
                if (this.f8318P.f()) {
                    q c9 = this.f8318P.c();
                    q d2 = this.f8318P.d();
                    boolean z9 = false;
                    while (this.f8324V && c9 != d2 && this.ab >= c9.i.f8692e) {
                        if (z9) {
                            d();
                        }
                        int i9 = c9.f8695h.f8707f ? 0 : 3;
                        q h9 = this.f8318P.h();
                        a(c9);
                        u uVar = this.f8320R;
                        r rVar = h9.f8695h;
                        this.f8320R = uVar.a(rVar.f8702a, rVar.f8703b, rVar.f8705d);
                        this.f8315M.b(i9);
                        g();
                        z9 = true;
                        c9 = h9;
                    }
                    j6 = com.anythink.basead.exoplayer.b.f6382b;
                    if (d2.f8695h.f8708g) {
                        int i10 = 0;
                        while (true) {
                            y[] yVarArr = this.f8328y;
                            if (i10 >= yVarArr.length) {
                                break;
                            }
                            y yVar = yVarArr[i10];
                            com.anythink.basead.exoplayer.h.y yVar2 = d2.f8690c[i10];
                            if (yVar2 != null && yVar.f() == yVar2 && yVar.g()) {
                                yVar.h();
                            }
                            i10++;
                        }
                    } else {
                        q qVar2 = d2.i;
                        if (qVar2 != null && qVar2.f8693f) {
                            int i11 = 0;
                            while (true) {
                                y[] yVarArr2 = this.f8328y;
                                if (i11 >= yVarArr2.length) {
                                    com.anythink.basead.exoplayer.i.i iVar = d2.f8697k;
                                    q g4 = this.f8318P.g();
                                    com.anythink.basead.exoplayer.i.i iVar2 = g4.f8697k;
                                    boolean z10 = g4.f8688a.c() != com.anythink.basead.exoplayer.b.f6382b;
                                    int i12 = 0;
                                    while (true) {
                                        y[] yVarArr3 = this.f8328y;
                                        if (i12 >= yVarArr3.length) {
                                            break;
                                        }
                                        y yVar3 = yVarArr3[i12];
                                        if (iVar.a(i12)) {
                                            if (!z10) {
                                                if (!yVar3.i()) {
                                                    com.anythink.basead.exoplayer.i.f a10 = iVar2.f7983c.a(i12);
                                                    boolean a11 = iVar2.a(i12);
                                                    boolean z11 = this.f8329z[i12].a() == 5 ? true : z3;
                                                    aa aaVar = iVar.f7982b[i12];
                                                    aa aaVar2 = iVar2.f7982b[i12];
                                                    if (a11 && aaVar2.equals(aaVar) && !z11) {
                                                        yVar3.a(a(a10), g4.f8690c[i12], g4.f8692e);
                                                    }
                                                }
                                            }
                                            yVar3.h();
                                        }
                                        i12++;
                                        z3 = false;
                                    }
                                } else {
                                    y yVar4 = yVarArr2[i11];
                                    com.anythink.basead.exoplayer.h.y yVar5 = d2.f8690c[i11];
                                    if (yVar4.f() != yVar5 || (yVar5 != null && !yVar4.g())) {
                                        break;
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                        }
                    }
                    if (this.f8318P.f()) {
                        n();
                        a(b9, 10L);
                        return;
                    }
                    q c10 = this.f8318P.c();
                    com.anythink.basead.exoplayer.k.ad.a("doSomeWork");
                    g();
                    long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                    c10.f8688a.a(this.f8320R.f8756j - this.J, this.f8313K);
                    boolean z12 = true;
                    boolean z13 = true;
                    for (y yVar6 : this.f8322T) {
                        yVar6.a(this.ab, elapsedRealtime);
                        z13 = z13 && yVar6.v();
                        boolean z14 = yVar6.u() || yVar6.v() || ((qVar = this.f8318P.d().i) != null && qVar.f8693f && yVar6.g());
                        if (!z14) {
                            yVar6.j();
                        }
                        z12 = z12 && z14;
                    }
                    if (!z12) {
                        n();
                    }
                    long j9 = c10.f8695h.f8706e;
                    if (!z13 || ((j9 != j6 && j9 > this.f8320R.f8756j) || !c10.f8695h.f8708g)) {
                        u uVar2 = this.f8320R;
                        if (uVar2.f8753f == 2) {
                            if (this.f8322T.length == 0) {
                                z6 = m();
                            } else {
                                if (z12) {
                                    if (uVar2.f8754g) {
                                        q b11 = this.f8318P.b();
                                        long a12 = b11.a(!b11.f8695h.f8708g);
                                        if (a12 != Long.MIN_VALUE) {
                                        }
                                    }
                                }
                                z6 = false;
                            }
                            if (z6) {
                                b(3);
                                if (this.f8324V) {
                                    e();
                                }
                            }
                        }
                        if (this.f8320R.f8753f == 3 && (this.f8322T.length != 0 ? !z12 : !m())) {
                            this.f8325W = this.f8324V;
                            b(2);
                            f();
                        }
                    } else {
                        b(4);
                        f();
                    }
                    if (this.f8320R.f8753f == 2) {
                        for (y yVar7 : this.f8322T) {
                            yVar7.j();
                        }
                    }
                    if ((this.f8324V && this.f8320R.f8753f == 3) || (i6 = this.f8320R.f8753f) == 2) {
                        a(b9, 10L);
                    } else if (this.f8322T.length == 0 || i6 == 4) {
                        this.f8307D.b();
                    } else {
                        a(b9, 1000L);
                    }
                    com.anythink.basead.exoplayer.k.ad.a();
                    return;
                }
            }
        }
        j6 = com.anythink.basead.exoplayer.b.f6382b;
        if (this.f8318P.f()) {
        }
    }

    private void i() {
        a(true, true, true);
        this.f8306C.c();
        b(1);
        this.f8308E.quitSafely();
        synchronized (this) {
            this.f8323U = true;
            notifyAll();
        }
    }

    private int j() {
        ae aeVar = this.f8320R.f8748a;
        if (aeVar.a()) {
            return 0;
        }
        return aeVar.a(aeVar.b(this.Y), this.f8311H, false).f6353f;
    }

    private void k() {
        for (int size = this.f8316N.size() - 1; size >= 0; size--) {
            if (!a(this.f8316N.get(size))) {
                this.f8316N.get(size).f8359a.a(false);
                this.f8316N.remove(size);
            }
        }
        Collections.sort(this.f8316N);
    }

    private void l() {
        if (this.f8318P.f()) {
            float f3 = this.f8314L.e().f8759b;
            q d2 = this.f8318P.d();
            boolean z3 = true;
            for (q c9 = this.f8318P.c(); c9 != null && c9.f8693f; c9 = c9.i) {
                if (c9.a(f3)) {
                    if (z3) {
                        q c10 = this.f8318P.c();
                        boolean a9 = this.f8318P.a(c10);
                        boolean[] zArr = new boolean[this.f8328y.length];
                        long a10 = c10.a(this.f8320R.f8756j, a9, zArr);
                        a(c10.f8697k);
                        u uVar = this.f8320R;
                        if (uVar.f8753f != 4 && a10 != uVar.f8756j) {
                            u uVar2 = this.f8320R;
                            this.f8320R = uVar2.a(uVar2.f8750c, a10, uVar2.f8752e);
                            this.f8315M.b(4);
                            a(a10);
                        }
                        boolean[] zArr2 = new boolean[this.f8328y.length];
                        int i6 = 0;
                        int i9 = 0;
                        while (true) {
                            y[] yVarArr = this.f8328y;
                            if (i6 >= yVarArr.length) {
                                break;
                            }
                            y yVar = yVarArr[i6];
                            boolean z6 = yVar.a_() != 0;
                            zArr2[i6] = z6;
                            com.anythink.basead.exoplayer.h.y yVar2 = c10.f8690c[i6];
                            if (yVar2 != null) {
                                i9++;
                            }
                            if (z6) {
                                if (yVar2 != yVar.f()) {
                                    b(yVar);
                                } else if (zArr[i6]) {
                                    yVar.a(this.ab);
                                }
                            }
                            i6++;
                        }
                        this.f8320R = this.f8320R.a(c10.f8696j, c10.f8697k);
                        a(zArr2, i9);
                    } else {
                        this.f8318P.a(c9);
                        if (c9.f8693f) {
                            c9.b(Math.max(c9.f8695h.f8703b, this.ab - c9.f8692e));
                            a(c9.f8697k);
                        }
                    }
                    if (this.f8320R.f8753f != 4) {
                        r();
                        g();
                        this.f8307D.b(2);
                        return;
                    }
                    return;
                }
                if (c9 == d2) {
                    z3 = false;
                }
            }
        }
    }

    private boolean m() {
        q c9 = this.f8318P.c();
        long j6 = c9.f8695h.f8706e;
        if (j6 == com.anythink.basead.exoplayer.b.f6382b || this.f8320R.f8756j < j6) {
            return true;
        }
        q qVar = c9.i;
        if (qVar != null) {
            return qVar.f8693f || qVar.f8695h.f8702a.a();
        }
        return false;
    }

    private void n() {
        q b9 = this.f8318P.b();
        q d2 = this.f8318P.d();
        if (b9 == null || b9.f8693f) {
            return;
        }
        if (d2 == null || d2.i == b9) {
            for (y yVar : this.f8322T) {
                if (!yVar.g()) {
                    return;
                }
            }
            b9.f8688a.a();
        }
    }

    private void o() {
        b(4);
        a(false, true, false);
    }

    private void p() {
        com.anythink.basead.exoplayer.h.s sVar = this.f8321S;
        if (sVar == null) {
            return;
        }
        if (this.f8327Z > 0) {
            sVar.b();
            return;
        }
        this.f8318P.a(this.ab);
        if (this.f8318P.a()) {
            r a9 = this.f8318P.a(this.ab, this.f8320R);
            if (a9 == null) {
                this.f8321S.b();
            } else {
                this.f8318P.a(this.f8329z, this.f8304A, this.f8306C.d(), this.f8321S, this.f8320R.f8748a.a(a9.f8702a.f7767a, this.f8312I, true).f6343b, a9).a(this, a9.f8703b);
                d(true);
            }
        }
        q b9 = this.f8318P.b();
        int i6 = 0;
        if (b9 == null || b9.a()) {
            d(false);
        } else if (!this.f8320R.f8754g) {
            r();
        }
        if (!this.f8318P.f()) {
            return;
        }
        q c9 = this.f8318P.c();
        q d2 = this.f8318P.d();
        boolean z3 = false;
        while (this.f8324V && c9 != d2 && this.ab >= c9.i.f8692e) {
            if (z3) {
                d();
            }
            int i9 = c9.f8695h.f8707f ? 0 : 3;
            q h9 = this.f8318P.h();
            a(c9);
            u uVar = this.f8320R;
            r rVar = h9.f8695h;
            this.f8320R = uVar.a(rVar.f8702a, rVar.f8703b, rVar.f8705d);
            this.f8315M.b(i9);
            g();
            z3 = true;
            c9 = h9;
        }
        if (d2.f8695h.f8708g) {
            while (true) {
                y[] yVarArr = this.f8328y;
                if (i6 >= yVarArr.length) {
                    return;
                }
                y yVar = yVarArr[i6];
                com.anythink.basead.exoplayer.h.y yVar2 = d2.f8690c[i6];
                if (yVar2 != null && yVar.f() == yVar2 && yVar.g()) {
                    yVar.h();
                }
                i6++;
            }
        } else {
            q qVar = d2.i;
            if (qVar == null || !qVar.f8693f) {
                return;
            }
            int i10 = 0;
            while (true) {
                y[] yVarArr2 = this.f8328y;
                if (i10 < yVarArr2.length) {
                    y yVar3 = yVarArr2[i10];
                    com.anythink.basead.exoplayer.h.y yVar4 = d2.f8690c[i10];
                    if (yVar3.f() != yVar4) {
                        return;
                    }
                    if (yVar4 != null && !yVar3.g()) {
                        return;
                    } else {
                        i10++;
                    }
                } else {
                    com.anythink.basead.exoplayer.i.i iVar = d2.f8697k;
                    q g4 = this.f8318P.g();
                    com.anythink.basead.exoplayer.i.i iVar2 = g4.f8697k;
                    boolean z6 = g4.f8688a.c() != com.anythink.basead.exoplayer.b.f6382b;
                    int i11 = 0;
                    while (true) {
                        y[] yVarArr3 = this.f8328y;
                        if (i11 >= yVarArr3.length) {
                            return;
                        }
                        y yVar5 = yVarArr3[i11];
                        if (iVar.a(i11)) {
                            if (!z6) {
                                if (!yVar5.i()) {
                                    com.anythink.basead.exoplayer.i.f a10 = iVar2.f7983c.a(i11);
                                    boolean a11 = iVar2.a(i11);
                                    boolean z9 = this.f8329z[i11].a() == 5;
                                    aa aaVar = iVar.f7982b[i11];
                                    aa aaVar2 = iVar2.f7982b[i11];
                                    if (a11 && aaVar2.equals(aaVar) && !z9) {
                                        yVar5.a(a(a10), g4.f8690c[i11], g4.f8692e);
                                    }
                                }
                            }
                            yVar5.h();
                        }
                        i11++;
                    }
                }
            }
        }
    }

    private void q() {
        this.f8318P.a(this.ab);
        if (this.f8318P.a()) {
            r a9 = this.f8318P.a(this.ab, this.f8320R);
            if (a9 == null) {
                this.f8321S.b();
                return;
            }
            this.f8318P.a(this.f8329z, this.f8304A, this.f8306C.d(), this.f8321S, this.f8320R.f8748a.a(a9.f8702a.f7767a, this.f8312I, true).f6343b, a9).a(this, a9.f8703b);
            d(true);
        }
    }

    private void r() {
        q b9 = this.f8318P.b();
        long b10 = b9.b();
        if (b10 == Long.MIN_VALUE) {
            d(false);
            return;
        }
        boolean a9 = this.f8306C.a(b10 - (this.ab - b9.f8692e), this.f8314L.e().f8759b);
        d(a9);
        if (a9) {
            b9.a(this.ab);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.z.a
    public final /* synthetic */ void a(com.anythink.basead.exoplayer.h.r rVar) {
        this.f8307D.a(10, rVar).sendToTarget();
    }

    public final void c(boolean z3) {
        this.f8307D.a(6, z3 ? 1 : 0).sendToTarget();
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
        boolean z3;
        boolean z6;
        long j6;
        boolean z9;
        boolean z10;
        q qVar;
        int i6;
        long longValue;
        boolean z11;
        s.a aVar;
        long j9;
        int i9;
        c cVar;
        long j10;
        long j11;
        long j12;
        long j13;
        int i10 = 2;
        try {
            try {
                int i11 = message.what;
                long j14 = 0;
                long j15 = com.anythink.basead.exoplayer.b.f6382b;
                try {
                    switch (i11) {
                        case 0:
                            com.anythink.basead.exoplayer.h.s sVar = (com.anythink.basead.exoplayer.h.s) message.obj;
                            boolean z12 = message.arg1 != 0;
                            boolean z13 = message.arg2 != 0;
                            this.f8327Z++;
                            a(true, z12, z13);
                            this.f8306C.a();
                            this.f8321S = sVar;
                            b(2);
                            sVar.a(this.f8310G, true, this);
                            this.f8307D.b(2);
                            d();
                            return true;
                        case 1:
                            boolean z14 = message.arg1 != 0;
                            this.f8325W = false;
                            this.f8324V = z14;
                            if (z14) {
                                int i12 = this.f8320R.f8753f;
                                if (i12 == 3) {
                                    e();
                                    this.f8307D.b(2);
                                } else if (i12 == 2) {
                                    this.f8307D.b(2);
                                }
                            } else {
                                f();
                                g();
                            }
                            d();
                            return true;
                        case 2:
                            long b9 = this.f8317O.b();
                            com.anythink.basead.exoplayer.h.s sVar2 = this.f8321S;
                            if (sVar2 != null) {
                                if (this.f8327Z > 0) {
                                    sVar2.b();
                                } else {
                                    this.f8318P.a(this.ab);
                                    if (this.f8318P.a()) {
                                        r a9 = this.f8318P.a(this.ab, this.f8320R);
                                        if (a9 == null) {
                                            this.f8321S.b();
                                        } else {
                                            this.f8318P.a(this.f8329z, this.f8304A, this.f8306C.d(), this.f8321S, this.f8320R.f8748a.a(a9.f8702a.f7767a, this.f8312I, true).f6343b, a9).a(this, a9.f8703b);
                                            d(true);
                                        }
                                    }
                                    q b10 = this.f8318P.b();
                                    if (b10 == null || b10.a()) {
                                        d(false);
                                    } else if (!this.f8320R.f8754g) {
                                        r();
                                    }
                                    if (this.f8318P.f()) {
                                        q c9 = this.f8318P.c();
                                        q d2 = this.f8318P.d();
                                        boolean z15 = false;
                                        while (this.f8324V && c9 != d2 && this.ab >= c9.i.f8692e) {
                                            if (z15) {
                                                d();
                                            }
                                            int i13 = c9.f8695h.f8707f ? 0 : 3;
                                            q h9 = this.f8318P.h();
                                            a(c9);
                                            u uVar = this.f8320R;
                                            r rVar = h9.f8695h;
                                            this.f8320R = uVar.a(rVar.f8702a, rVar.f8703b, rVar.f8705d);
                                            this.f8315M.b(i13);
                                            g();
                                            c9 = h9;
                                            j15 = j15;
                                            z15 = true;
                                        }
                                        j6 = j15;
                                        if (d2.f8695h.f8708g) {
                                            int i14 = 0;
                                            while (true) {
                                                y[] yVarArr = this.f8328y;
                                                if (i14 < yVarArr.length) {
                                                    y yVar = yVarArr[i14];
                                                    com.anythink.basead.exoplayer.h.y yVar2 = d2.f8690c[i14];
                                                    if (yVar2 != null && yVar.f() == yVar2 && yVar.g()) {
                                                        yVar.h();
                                                    }
                                                    i14++;
                                                }
                                            }
                                        } else {
                                            q qVar2 = d2.i;
                                            if (qVar2 != null && qVar2.f8693f) {
                                                while (true) {
                                                    y[] yVarArr2 = this.f8328y;
                                                    if (i6 < yVarArr2.length) {
                                                        y yVar3 = yVarArr2[i6];
                                                        com.anythink.basead.exoplayer.h.y yVar4 = d2.f8690c[i6];
                                                        i6 = (yVar3.f() == yVar4 && (yVar4 == null || yVar3.g())) ? i6 + 1 : 0;
                                                    } else {
                                                        com.anythink.basead.exoplayer.i.i iVar = d2.f8697k;
                                                        q g4 = this.f8318P.g();
                                                        com.anythink.basead.exoplayer.i.i iVar2 = g4.f8697k;
                                                        boolean z16 = g4.f8688a.c() != j6;
                                                        int i15 = 0;
                                                        while (true) {
                                                            y[] yVarArr3 = this.f8328y;
                                                            if (i15 < yVarArr3.length) {
                                                                y yVar5 = yVarArr3[i15];
                                                                if (iVar.a(i15)) {
                                                                    if (!z16) {
                                                                        if (!yVar5.i()) {
                                                                            com.anythink.basead.exoplayer.i.f a10 = iVar2.f7983c.a(i15);
                                                                            boolean a11 = iVar2.a(i15);
                                                                            boolean z17 = this.f8329z[i15].a() == 5;
                                                                            aa aaVar = iVar.f7982b[i15];
                                                                            aa aaVar2 = iVar2.f7982b[i15];
                                                                            if (a11 && aaVar2.equals(aaVar) && !z17) {
                                                                                yVar5.a(a(a10), g4.f8690c[i15], g4.f8692e);
                                                                            }
                                                                        }
                                                                    }
                                                                    yVar5.h();
                                                                }
                                                                i15++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (this.f8318P.f()) {
                                            n();
                                            a(b9, 10L);
                                        } else {
                                            q c10 = this.f8318P.c();
                                            com.anythink.basead.exoplayer.k.ad.a("doSomeWork");
                                            g();
                                            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                                            c10.f8688a.a(this.f8320R.f8756j - this.J, this.f8313K);
                                            boolean z18 = true;
                                            boolean z19 = true;
                                            for (y yVar6 : this.f8322T) {
                                                yVar6.a(this.ab, elapsedRealtime);
                                                z19 = z19 && yVar6.v();
                                                if (!yVar6.u() && !yVar6.v() && ((qVar = this.f8318P.d().i) == null || !qVar.f8693f || !yVar6.g())) {
                                                    z10 = false;
                                                    if (!z10) {
                                                        yVar6.j();
                                                    }
                                                    z18 = !z18 && z10;
                                                }
                                                z10 = true;
                                                if (!z10) {
                                                }
                                                if (z18) {
                                                }
                                            }
                                            if (!z18) {
                                                n();
                                            }
                                            long j16 = c10.f8695h.f8706e;
                                            if (!z19 || ((j16 != j6 && j16 > this.f8320R.f8756j) || !c10.f8695h.f8708g)) {
                                                u uVar2 = this.f8320R;
                                                if (uVar2.f8753f == 2) {
                                                    if (this.f8322T.length == 0) {
                                                        z9 = m();
                                                    } else {
                                                        if (z18) {
                                                            if (uVar2.f8754g) {
                                                                q b11 = this.f8318P.b();
                                                                long a12 = b11.a(!b11.f8695h.f8708g);
                                                                if (a12 != Long.MIN_VALUE) {
                                                                    if (this.f8306C.a(a12 - (this.ab - b11.f8692e), this.f8314L.e().f8759b, this.f8325W)) {
                                                                    }
                                                                }
                                                            }
                                                            z9 = true;
                                                        }
                                                        z9 = false;
                                                    }
                                                    if (z9) {
                                                        b(3);
                                                        if (this.f8324V) {
                                                            e();
                                                        }
                                                    }
                                                }
                                                if (this.f8320R.f8753f == 3) {
                                                    if (this.f8322T.length == 0) {
                                                        if (m()) {
                                                        }
                                                        this.f8325W = this.f8324V;
                                                        b(2);
                                                        f();
                                                    }
                                                }
                                            } else {
                                                b(4);
                                                f();
                                            }
                                            if (this.f8320R.f8753f == 2) {
                                                for (y yVar7 : this.f8322T) {
                                                    yVar7.j();
                                                }
                                            }
                                            if (this.f8324V) {
                                                if (this.f8320R.f8753f != 3) {
                                                }
                                                a(b9, 10L);
                                                com.anythink.basead.exoplayer.k.ad.a();
                                            }
                                            int i16 = this.f8320R.f8753f;
                                            if (i16 == 2) {
                                                a(b9, 10L);
                                                com.anythink.basead.exoplayer.k.ad.a();
                                            } else {
                                                if (this.f8322T.length == 0 || i16 == 4) {
                                                    this.f8307D.b();
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
                            if (this.f8318P.f()) {
                            }
                            d();
                            return true;
                        case 3:
                            d dVar = (d) message.obj;
                            this.f8315M.a(1);
                            Pair<Integer, Long> a13 = a(dVar, true);
                            try {
                                if (a13 == null) {
                                    aVar = new s.a(j());
                                    longValue = -9223372036854775807L;
                                    j9 = -9223372036854775807L;
                                } else {
                                    int intValue = ((Integer) a13.first).intValue();
                                    long longValue2 = ((Long) a13.second).longValue();
                                    s.a a14 = this.f8318P.a(intValue, longValue2);
                                    if (!a14.a()) {
                                        longValue = ((Long) a13.second).longValue();
                                        z11 = dVar.f8381c == com.anythink.basead.exoplayer.b.f6382b;
                                        aVar = a14;
                                        j9 = longValue2;
                                        if (this.f8321S != null && this.f8327Z <= 0) {
                                            if (longValue != com.anythink.basead.exoplayer.b.f6382b) {
                                                b(4);
                                                a(false, true, false);
                                                j10 = longValue;
                                                this.f8320R = this.f8320R.a(aVar, j10, j9);
                                                if (z11) {
                                                    cVar = this.f8315M;
                                                    i9 = 2;
                                                    cVar.b(i9);
                                                }
                                                d();
                                                return true;
                                            }
                                            if (aVar.equals(this.f8320R.f8750c)) {
                                                q c11 = this.f8318P.c();
                                                j11 = (c11 == null || longValue == 0) ? longValue : c11.f8688a.a(longValue, this.f8319Q);
                                                if (com.anythink.basead.exoplayer.b.a(j11) == com.anythink.basead.exoplayer.b.a(this.f8320R.f8756j)) {
                                                    this.f8320R = this.f8320R.a(aVar, this.f8320R.f8756j, j9);
                                                    if (z11) {
                                                        cVar = this.f8315M;
                                                        i9 = 2;
                                                        cVar.b(i9);
                                                    }
                                                    d();
                                                    return true;
                                                }
                                            } else {
                                                j11 = longValue;
                                            }
                                            long a15 = a(aVar, j11);
                                            z11 |= longValue != a15;
                                            j10 = a15;
                                            this.f8320R = this.f8320R.a(aVar, j10, j9);
                                            if (z11) {
                                            }
                                            d();
                                            return true;
                                        }
                                        this.aa = dVar;
                                        j10 = longValue;
                                        this.f8320R = this.f8320R.a(aVar, j10, j9);
                                        if (z11) {
                                        }
                                        d();
                                        return true;
                                    }
                                    aVar = a14;
                                    j9 = longValue2;
                                    longValue = 0;
                                }
                                if (this.f8321S != null) {
                                    if (longValue != com.anythink.basead.exoplayer.b.f6382b) {
                                    }
                                }
                                this.aa = dVar;
                                j10 = longValue;
                                this.f8320R = this.f8320R.a(aVar, j10, j9);
                                if (z11) {
                                }
                                d();
                                return true;
                            } finally {
                                this.f8320R = this.f8320R.a(aVar, longValue, j9);
                                if (z11) {
                                    this.f8315M.b(2);
                                }
                            }
                            z11 = true;
                            break;
                        case 4:
                            this.f8314L.a((v) message.obj);
                            d();
                            return true;
                        case 5:
                            this.f8319Q = (ac) message.obj;
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
                            if (aVar2.f8332a == this.f8321S) {
                                ae aeVar = this.f8320R.f8748a;
                                ae aeVar2 = aVar2.f8333b;
                                Object obj = aVar2.f8334c;
                                this.f8318P.a(aeVar2);
                                this.f8320R = this.f8320R.a(aeVar2, obj);
                                for (int size = this.f8316N.size() - 1; size >= 0; size--) {
                                    if (!a(this.f8316N.get(size))) {
                                        this.f8316N.get(size).f8359a.a(false);
                                        this.f8316N.remove(size);
                                    }
                                }
                                Collections.sort(this.f8316N);
                                int i17 = this.f8327Z;
                                if (i17 > 0) {
                                    this.f8315M.a(i17);
                                    this.f8327Z = 0;
                                    d dVar2 = this.aa;
                                    if (dVar2 != null) {
                                        Pair<Integer, Long> a16 = a(dVar2, true);
                                        this.aa = null;
                                        if (a16 == null) {
                                            o();
                                        } else {
                                            int intValue2 = ((Integer) a16.first).intValue();
                                            long longValue3 = ((Long) a16.second).longValue();
                                            s.a a17 = this.f8318P.a(intValue2, longValue3);
                                            this.f8320R = this.f8320R.a(a17, a17.a() ? 0L : longValue3, longValue3);
                                        }
                                    } else if (this.f8320R.f8751d == com.anythink.basead.exoplayer.b.f6382b) {
                                        if (aeVar2.a()) {
                                            o();
                                        } else {
                                            Pair<Integer, Long> a18 = a(aeVar2, aeVar2.b(this.Y));
                                            int intValue3 = ((Integer) a18.first).intValue();
                                            long longValue4 = ((Long) a18.second).longValue();
                                            s.a a19 = this.f8318P.a(intValue3, longValue4);
                                            this.f8320R = this.f8320R.a(a19, a19.a() ? 0L : longValue4, longValue4);
                                        }
                                    }
                                } else {
                                    u uVar3 = this.f8320R;
                                    int i18 = uVar3.f8750c.f7767a;
                                    long j17 = uVar3.f8752e;
                                    if (!aeVar.a()) {
                                        q e9 = this.f8318P.e();
                                        int a20 = aeVar2.a(e9 == null ? aeVar.a(i18, this.f8312I, true).f6343b : e9.f8689b);
                                        if (a20 == -1) {
                                            int a21 = a(i18, aeVar, aeVar2);
                                            if (a21 == -1) {
                                                o();
                                            } else {
                                                Pair<Integer, Long> a22 = a(aeVar2, aeVar2.a(a21, this.f8312I, false).f6344c);
                                                int intValue4 = ((Integer) a22.first).intValue();
                                                long longValue5 = ((Long) a22.second).longValue();
                                                s.a a23 = this.f8318P.a(intValue4, longValue5);
                                                aeVar2.a(intValue4, this.f8312I, true);
                                                if (e9 != null) {
                                                    Object obj2 = this.f8312I.f6343b;
                                                    e9.f8695h = e9.f8695h.a();
                                                    while (true) {
                                                        e9 = e9.i;
                                                        if (e9 != null) {
                                                            if (e9.f8689b.equals(obj2)) {
                                                                e9.f8695h = this.f8318P.a(e9.f8695h, intValue4);
                                                            } else {
                                                                e9.f8695h = e9.f8695h.a();
                                                            }
                                                        }
                                                    }
                                                }
                                                if (!a23.a()) {
                                                    j14 = longValue5;
                                                }
                                                this.f8320R = this.f8320R.a(a23, a(a23, j14), longValue5);
                                            }
                                        } else {
                                            if (a20 != i18) {
                                                this.f8320R = this.f8320R.a(a20);
                                            }
                                            s.a aVar3 = this.f8320R.f8750c;
                                            if (aVar3.a()) {
                                                s.a a24 = this.f8318P.a(a20, j17);
                                                if (!a24.equals(aVar3)) {
                                                    if (!a24.a()) {
                                                        j14 = j17;
                                                    }
                                                    this.f8320R = this.f8320R.a(a24, a(a24, j14), j17);
                                                }
                                            }
                                            if (!this.f8318P.a(aVar3, this.ab)) {
                                                g(false);
                                            }
                                        }
                                    } else if (!aeVar2.a()) {
                                        s.a a25 = this.f8318P.a(i18, j17);
                                        u uVar4 = this.f8320R;
                                        if (a25.a()) {
                                            j13 = j17;
                                            j12 = 0;
                                        } else {
                                            j12 = j17;
                                            j13 = j12;
                                        }
                                        this.f8320R = uVar4.a(a25, j12, j13);
                                    }
                                }
                            }
                            d();
                            return true;
                        case 9:
                            try {
                                if (this.f8318P.a((com.anythink.basead.exoplayer.h.r) message.obj)) {
                                    q b12 = this.f8318P.b();
                                    float f3 = this.f8314L.e().f8759b;
                                    b12.f8693f = true;
                                    b12.f8696j = b12.f8688a.b();
                                    b12.a(f3);
                                    long b13 = b12.b(b12.f8695h.f8703b);
                                    long j18 = b12.f8692e;
                                    r rVar2 = b12.f8695h;
                                    b12.f8692e = (rVar2.f8703b - b13) + j18;
                                    b12.f8695h = new r(rVar2.f8702a, b13, rVar2.f8704c, rVar2.f8705d, rVar2.f8706e, rVar2.f8707f, rVar2.f8708g);
                                    a(b12.f8697k);
                                    if (!this.f8318P.f()) {
                                        a(this.f8318P.h().f8695h.f8703b);
                                        a((q) null);
                                    }
                                    r();
                                }
                                d();
                                return true;
                            } catch (g e10) {
                                e = e10;
                                i10 = 2;
                                z6 = false;
                                Log.e(f8284d, "Playback error.", e);
                                a(z6, z6);
                                this.f8309F.obtainMessage(i10, e).sendToTarget();
                                d();
                                return true;
                            } catch (IOException e11) {
                                e = e11;
                                i10 = 2;
                                z3 = false;
                                Log.e(f8284d, "Source error.", e);
                                a(z3, z3);
                                this.f8309F.obtainMessage(i10, g.a(e)).sendToTarget();
                                d();
                                return true;
                            } catch (RuntimeException e12) {
                                e = e12;
                                Log.e(f8284d, "Internal runtime error.", e);
                                a(false, false);
                                this.f8309F.obtainMessage(2, g.a(e)).sendToTarget();
                                d();
                                return true;
                            }
                        case 10:
                            if (this.f8318P.a((com.anythink.basead.exoplayer.h.r) message.obj)) {
                                this.f8318P.a(this.ab);
                                r();
                            }
                            d();
                            return true;
                        case 11:
                            if (this.f8318P.f()) {
                                float f9 = this.f8314L.e().f8759b;
                                q c12 = this.f8318P.c();
                                q d9 = this.f8318P.d();
                                boolean z20 = true;
                                while (true) {
                                    if (c12 != null && c12.f8693f) {
                                        if (c12.a(f9)) {
                                            if (z20) {
                                                q c13 = this.f8318P.c();
                                                boolean a26 = this.f8318P.a(c13);
                                                boolean[] zArr = new boolean[this.f8328y.length];
                                                long a27 = c13.a(this.f8320R.f8756j, a26, zArr);
                                                a(c13.f8697k);
                                                u uVar5 = this.f8320R;
                                                if (uVar5.f8753f != 4 && a27 != uVar5.f8756j) {
                                                    u uVar6 = this.f8320R;
                                                    this.f8320R = uVar6.a(uVar6.f8750c, a27, uVar6.f8752e);
                                                    this.f8315M.b(4);
                                                    a(a27);
                                                }
                                                boolean[] zArr2 = new boolean[this.f8328y.length];
                                                int i19 = 0;
                                                int i20 = 0;
                                                while (true) {
                                                    y[] yVarArr4 = this.f8328y;
                                                    if (i19 < yVarArr4.length) {
                                                        y yVar8 = yVarArr4[i19];
                                                        boolean z21 = yVar8.a_() != 0;
                                                        zArr2[i19] = z21;
                                                        com.anythink.basead.exoplayer.h.y yVar9 = c13.f8690c[i19];
                                                        if (yVar9 != null) {
                                                            i20++;
                                                        }
                                                        if (z21) {
                                                            if (yVar9 != yVar8.f()) {
                                                                b(yVar8);
                                                            } else if (zArr[i19]) {
                                                                yVar8.a(this.ab);
                                                            }
                                                        }
                                                        i19++;
                                                    } else {
                                                        this.f8320R = this.f8320R.a(c13.f8696j, c13.f8697k);
                                                        a(zArr2, i20);
                                                    }
                                                }
                                            } else {
                                                this.f8318P.a(c12);
                                                if (c12.f8693f) {
                                                    c12.b(Math.max(c12.f8695h.f8703b, this.ab - c12.f8692e));
                                                    a(c12.f8697k);
                                                }
                                            }
                                            if (this.f8320R.f8753f != 4) {
                                                r();
                                                g();
                                                this.f8307D.b(2);
                                            }
                                        } else {
                                            if (c12 == d9) {
                                                z20 = false;
                                            }
                                            c12 = c12.i;
                                        }
                                    }
                                }
                            }
                            d();
                            return true;
                        case 12:
                            int i21 = message.arg1;
                            this.f8326X = i21;
                            if (!this.f8318P.a(i21)) {
                                g(true);
                            }
                            d();
                            return true;
                        case 13:
                            boolean z22 = message.arg1 != 0;
                            this.Y = z22;
                            if (!this.f8318P.a(z22)) {
                                g(true);
                            }
                            d();
                            return true;
                        case 14:
                            x xVar = (x) message.obj;
                            if (xVar.f() == com.anythink.basead.exoplayer.b.f6382b) {
                                d(xVar);
                            } else {
                                if (this.f8321S != null && this.f8327Z <= 0) {
                                    b bVar = new b(xVar);
                                    if (a(bVar)) {
                                        this.f8316N.add(bVar);
                                        Collections.sort(this.f8316N);
                                    } else {
                                        xVar.a(false);
                                    }
                                }
                                this.f8316N.add(new b(xVar));
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
            z6 = false;
        } catch (IOException e17) {
            e = e17;
            z3 = false;
        }
    }

    public final void b(boolean z3) {
        this.f8307D.a(13, z3 ? 1 : 0).sendToTarget();
    }

    @Override // com.anythink.basead.exoplayer.i.h.a
    public final void c() {
        this.f8307D.b(11);
    }

    public static final class b implements Comparable<b> {

        /* renamed from: a, reason: collision with root package name */
        public final x f8359a;

        /* renamed from: b, reason: collision with root package name */
        public int f8360b;

        /* renamed from: c, reason: collision with root package name */
        public long f8361c;

        /* renamed from: d, reason: collision with root package name */
        public Object f8362d;

        public b(x xVar) {
            this.f8359a = xVar;
        }

        public final void a(int i, long j6, Object obj) {
            this.f8360b = i;
            this.f8361c = j6;
            this.f8362d = obj;
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(b bVar) {
            b bVar2 = bVar;
            Object obj = this.f8362d;
            if ((obj == null) != (bVar2.f8362d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i = this.f8360b - bVar2.f8360b;
            return i != 0 ? i : com.anythink.basead.exoplayer.k.af.b(this.f8361c, bVar2.f8361c);
        }

        private int a(b bVar) {
            Object obj = this.f8362d;
            if ((obj == null) != (bVar.f8362d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i = this.f8360b - bVar.f8360b;
            return i != 0 ? i : com.anythink.basead.exoplayer.k.af.b(this.f8361c, bVar.f8361c);
        }
    }

    private void c(int i6) {
        this.f8326X = i6;
        if (this.f8318P.a(i6)) {
            return;
        }
        g(true);
    }

    private void d() {
        if (this.f8315M.a(this.f8320R)) {
            this.f8309F.obtainMessage(0, this.f8315M.f8367b, this.f8315M.f8368c ? this.f8315M.f8369d : -1, this.f8320R).sendToTarget();
            this.f8315M.b(this.f8320R);
        }
    }

    public final void a(com.anythink.basead.exoplayer.h.s sVar, boolean z3, boolean z6) {
        this.f8307D.a(z3 ? 1 : 0, z6 ? 1 : 0, sVar).sendToTarget();
    }

    public final void b(v vVar) {
        this.f8307D.a(4, vVar).sendToTarget();
    }

    private void f() {
        this.f8314L.b();
        for (y yVar : this.f8322T) {
            a(yVar);
        }
    }

    public final Looper b() {
        return this.f8308E.getLooper();
    }

    private void b(com.anythink.basead.exoplayer.h.r rVar) {
        this.f8307D.a(10, rVar).sendToTarget();
    }

    private void b(int i6) {
        u uVar = this.f8320R;
        if (uVar.f8753f != i6) {
            this.f8320R = uVar.b(i6);
        }
    }

    private void c(v vVar) {
        this.f8314L.a(vVar);
    }

    public final void a(boolean z3) {
        this.f8307D.a(1, z3 ? 1 : 0).sendToTarget();
    }

    private void c(x xVar) {
        if (xVar.f() == com.anythink.basead.exoplayer.b.f6382b) {
            d(xVar);
            return;
        }
        if (this.f8321S != null && this.f8327Z <= 0) {
            b bVar = new b(xVar);
            if (a(bVar)) {
                this.f8316N.add(bVar);
                Collections.sort(this.f8316N);
                return;
            } else {
                xVar.a(false);
                return;
            }
        }
        this.f8316N.add(new b(xVar));
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

    public final void a(int i6) {
        this.f8307D.a(12, i6).sendToTarget();
    }

    private void b(com.anythink.basead.exoplayer.h.s sVar, boolean z3, boolean z6) {
        this.f8327Z++;
        a(true, z3, z6);
        this.f8306C.a();
        this.f8321S = sVar;
        b(2);
        sVar.a(this.f8310G, true, this);
        this.f8307D.b(2);
    }

    private void g() {
        long a9;
        if (this.f8318P.f()) {
            q c9 = this.f8318P.c();
            long c10 = c9.f8688a.c();
            if (c10 != com.anythink.basead.exoplayer.b.f6382b) {
                a(c10);
                if (c10 != this.f8320R.f8756j) {
                    u uVar = this.f8320R;
                    this.f8320R = uVar.a(uVar.f8750c, c10, uVar.f8752e);
                    this.f8315M.b(4);
                }
            } else {
                long c11 = this.f8314L.c();
                this.ab = c11;
                long j6 = c11 - c9.f8692e;
                b(this.f8320R.f8756j, j6);
                this.f8320R.f8756j = j6;
            }
            u uVar2 = this.f8320R;
            if (this.f8322T.length == 0) {
                a9 = c9.f8695h.f8706e;
            } else {
                a9 = c9.a(true);
            }
            uVar2.f8757k = a9;
        }
    }

    public final void a(ae aeVar, int i6, long j6) {
        this.f8307D.a(3, new d(aeVar, i6, j6)).sendToTarget();
    }

    private void e() {
        this.f8325W = false;
        this.f8314L.a();
        for (y yVar : this.f8322T) {
            yVar.b_();
        }
    }

    public final void a(ac acVar) {
        this.f8307D.a(5, acVar).sendToTarget();
    }

    @Override // com.anythink.basead.exoplayer.x.a
    public final synchronized void a(x xVar) {
        if (this.f8323U) {
            Log.w(f8284d, "Ignoring messages sent after release.");
            xVar.a(false);
        } else {
            this.f8307D.a(14, xVar).sendToTarget();
        }
    }

    private void d(x xVar) {
        if (xVar.e().getLooper() == this.f8307D.a()) {
            f(xVar);
            int i6 = this.f8320R.f8753f;
            if (i6 == 3 || i6 == 2) {
                this.f8307D.b(2);
                return;
            }
            return;
        }
        this.f8307D.a(15, xVar).sendToTarget();
    }

    private void e(x xVar) {
        xVar.e().post(new AnonymousClass1(xVar));
    }

    private void b(ac acVar) {
        this.f8319Q = acVar;
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
        if (this.f8316N.isEmpty() || this.f8320R.f8750c.a()) {
            return;
        }
        u uVar = this.f8320R;
        if (uVar.f8751d == j6) {
            j6--;
        }
        int i6 = uVar.f8750c.f7767a;
        int i9 = this.ac;
        if (i9 > 0) {
            bVar = this.f8316N.get(i9 - 1);
            while (bVar != null) {
                int i10 = bVar.f8360b;
                if (i10 <= i6 && (i10 != i6 || bVar.f8361c <= j6)) {
                    break;
                }
                int i11 = this.ac;
                int i12 = i11 - 1;
                this.ac = i12;
                if (i12 > 0) {
                    bVar = this.f8316N.get(i11 - 2);
                }
            }
            if (this.ac < this.f8316N.size()) {
                bVar2 = this.f8316N.get(this.ac);
                while (bVar2 != null && bVar2.f8362d != null) {
                    int i13 = bVar2.f8360b;
                    if (i13 >= i6 && (i13 != i6 || bVar2.f8361c > j6)) {
                        break;
                    }
                    int i14 = this.ac + 1;
                    this.ac = i14;
                    if (i14 < this.f8316N.size()) {
                        bVar2 = this.f8316N.get(this.ac);
                    }
                }
                while (bVar2 != null && bVar2.f8362d != null && bVar2.f8360b == i6) {
                    long j10 = bVar2.f8361c;
                    if (j10 <= j6 || j10 > j9) {
                        return;
                    }
                    d(bVar2.f8359a);
                    if (!bVar2.f8359a.h() && !bVar2.f8359a.j()) {
                        this.ac++;
                    } else {
                        this.f8316N.remove(this.ac);
                    }
                    bVar2 = this.ac < this.f8316N.size() ? this.f8316N.get(this.ac) : null;
                }
                return;
            }
            bVar2 = null;
        }
        bVar = null;
    }

    private void c(com.anythink.basead.exoplayer.h.r rVar) {
        if (this.f8318P.a(rVar)) {
            q b9 = this.f8318P.b();
            float f3 = this.f8314L.e().f8759b;
            b9.f8693f = true;
            b9.f8696j = b9.f8688a.b();
            b9.a(f3);
            long b10 = b9.b(b9.f8695h.f8703b);
            long j6 = b9.f8692e;
            r rVar2 = b9.f8695h;
            b9.f8692e = (rVar2.f8703b - b10) + j6;
            b9.f8695h = new r(rVar2.f8702a, b10, rVar2.f8704c, rVar2.f8705d, rVar2.f8706e, rVar2.f8707f, rVar2.f8708g);
            a(b9.f8697k);
            if (!this.f8318P.f()) {
                a(this.f8318P.h().f8695h.f8703b);
                a((q) null);
            }
            r();
        }
    }

    private void d(com.anythink.basead.exoplayer.h.r rVar) {
        if (this.f8318P.a(rVar)) {
            this.f8318P.a(this.ab);
            r();
        }
    }

    public final synchronized void a() {
        if (!this.f8323U && this.f8308E.isAlive()) {
            this.f8307D.b(7);
            long j6 = 500;
            long a9 = this.f8317O.a() + 500;
            boolean z3 = false;
            while (!this.f8323U && j6 > 0) {
                try {
                    wait(j6);
                } catch (InterruptedException unused) {
                    z3 = true;
                }
                j6 = a9 - this.f8317O.a();
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.h.s.b
    public final void a(com.anythink.basead.exoplayer.h.s sVar, ae aeVar, Object obj) {
        this.f8307D.a(8, new a(sVar, aeVar, obj)).sendToTarget();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.anythink.basead.exoplayer.h.r.a
    public final void a(com.anythink.basead.exoplayer.h.r rVar) {
        this.f8307D.a(9, rVar).sendToTarget();
    }

    @Override // com.anythink.basead.exoplayer.e.a
    public final void a(v vVar) {
        this.f8309F.obtainMessage(1, vVar).sendToTarget();
        float f3 = vVar.f8759b;
        for (q e9 = this.f8318P.e(); e9 != null; e9 = e9.i) {
            com.anythink.basead.exoplayer.i.i iVar = e9.f8697k;
            if (iVar != null) {
                for (com.anythink.basead.exoplayer.i.f fVar : iVar.f7983c.a()) {
                    if (fVar != null) {
                        fVar.a(f3);
                    }
                }
            }
        }
    }

    private boolean c(y yVar) {
        q qVar = this.f8318P.d().i;
        return qVar != null && qVar.f8693f && yVar.g();
    }

    private void b(y yVar) {
        this.f8314L.b(yVar);
        a(yVar);
        yVar.l();
    }

    private void a(long j6, long j9) {
        this.f8307D.b();
        this.f8307D.a(j6 + j9);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(d dVar) {
        long longValue;
        boolean z3;
        s.a aVar;
        long j6;
        long j9;
        long j10;
        boolean z6 = true;
        this.f8315M.a(1);
        Pair<Integer, Long> a9 = a(dVar, true);
        if (a9 == null) {
            aVar = new s.a(j());
            z3 = true;
            longValue = -9223372036854775807L;
            j6 = -9223372036854775807L;
        } else {
            int intValue = ((Integer) a9.first).intValue();
            long longValue2 = ((Long) a9.second).longValue();
            s.a a10 = this.f8318P.a(intValue, longValue2);
            if (a10.a()) {
                z3 = true;
                longValue = 0;
            } else {
                longValue = ((Long) a9.second).longValue();
                z3 = dVar.f8381c == com.anythink.basead.exoplayer.b.f6382b;
            }
            aVar = a10;
            j6 = longValue2;
        }
        try {
            if (this.f8321S != null && this.f8327Z <= 0) {
                if (longValue == com.anythink.basead.exoplayer.b.f6382b) {
                    b(4);
                    a(false, true, false);
                    j9 = longValue;
                    this.f8320R = this.f8320R.a(aVar, j9, j6);
                    if (!z3) {
                        return;
                    }
                    this.f8315M.b(2);
                }
                if (aVar.equals(this.f8320R.f8750c)) {
                    q c9 = this.f8318P.c();
                    j10 = (c9 == null || longValue == 0) ? longValue : c9.f8688a.a(longValue, this.f8319Q);
                    if (com.anythink.basead.exoplayer.b.a(j10) == com.anythink.basead.exoplayer.b.a(this.f8320R.f8756j)) {
                        this.f8320R = this.f8320R.a(aVar, this.f8320R.f8756j, j6);
                        if (!z3) {
                            return;
                        }
                        this.f8315M.b(2);
                    }
                } else {
                    j10 = longValue;
                }
                long a11 = a(aVar, j10);
                if (longValue == a11) {
                    z6 = false;
                }
                z3 |= z6;
                j9 = a11;
                this.f8320R = this.f8320R.a(aVar, j9, j6);
                if (!z3) {
                }
                this.f8315M.b(2);
            }
            this.aa = dVar;
            j9 = longValue;
            this.f8320R = this.f8320R.a(aVar, j9, j6);
            if (!z3) {
            }
            this.f8315M.b(2);
        } catch (Throwable th) {
            this.f8320R = this.f8320R.a(aVar, longValue, j6);
            if (z3) {
                this.f8315M.b(2);
            }
            throw th;
        }
    }

    private long a(s.a aVar, long j6) {
        return a(aVar, j6, this.f8318P.c() != this.f8318P.d());
    }

    private long a(s.a aVar, long j6, boolean z3) {
        f();
        this.f8325W = false;
        b(2);
        q c9 = this.f8318P.c();
        q qVar = c9;
        while (true) {
            if (qVar == null) {
                break;
            }
            if (a(aVar, j6, qVar)) {
                this.f8318P.a(qVar);
                break;
            }
            qVar = this.f8318P.h();
        }
        if (c9 != qVar || z3) {
            for (y yVar : this.f8322T) {
                b(yVar);
            }
            this.f8322T = new y[0];
            c9 = null;
        }
        if (qVar != null) {
            a(c9);
            if (qVar.f8694g) {
                j6 = qVar.f8688a.b(j6);
                qVar.f8688a.a(j6 - this.J, this.f8313K);
            }
            a(j6);
            r();
        } else {
            this.f8318P.b(true);
            a(j6);
        }
        this.f8307D.b(2);
        return j6;
    }

    private boolean a(s.a aVar, long j6, q qVar) {
        if (aVar.equals(qVar.f8695h.f8702a) && qVar.f8693f) {
            this.f8320R.f8748a.a(qVar.f8695h.f8702a.f7767a, this.f8312I, false);
            int b9 = this.f8312I.b(j6);
            if (b9 == -1 || this.f8312I.a(b9) == qVar.f8695h.f8704c) {
                return true;
            }
        }
        return false;
    }

    private void a(long j6) {
        if (this.f8318P.f()) {
            j6 += this.f8318P.c().f8692e;
        }
        this.ab = j6;
        this.f8314L.a(j6);
        for (y yVar : this.f8322T) {
            yVar.a(this.ab);
        }
    }

    private void a(boolean z3, boolean z6) {
        a(true, z3, z3);
        this.f8315M.a(this.f8327Z + (z6 ? 1 : 0));
        this.f8327Z = 0;
        this.f8306C.b();
        b(1);
    }

    private void a(boolean z3, boolean z6, boolean z9) {
        com.anythink.basead.exoplayer.h.s sVar;
        this.f8307D.b();
        this.f8325W = false;
        this.f8314L.b();
        this.ab = 0L;
        for (y yVar : this.f8322T) {
            try {
                b(yVar);
            } catch (g | RuntimeException e9) {
                Log.e(f8284d, "Stop failed.", e9);
            }
        }
        this.f8322T = new y[0];
        this.f8318P.b(!z6);
        d(false);
        if (z6) {
            this.aa = null;
        }
        if (z9) {
            this.f8318P.a(ae.f6341a);
            Iterator<b> it = this.f8316N.iterator();
            while (it.hasNext()) {
                it.next().f8359a.a(false);
            }
            this.f8316N.clear();
            this.ac = 0;
        }
        ae aeVar = z9 ? ae.f6341a : this.f8320R.f8748a;
        Object obj = z9 ? null : this.f8320R.f8749b;
        s.a aVar = z6 ? new s.a(j()) : this.f8320R.f8750c;
        long j6 = com.anythink.basead.exoplayer.b.f6382b;
        long j9 = z6 ? -9223372036854775807L : this.f8320R.f8756j;
        if (!z6) {
            j6 = this.f8320R.f8752e;
        }
        long j10 = j6;
        u uVar = this.f8320R;
        this.f8320R = new u(aeVar, obj, aVar, j9, j10, uVar.f8753f, false, z9 ? af.f7515a : uVar.f8755h, z9 ? this.f8305B : uVar.i);
        if (!z3 || (sVar = this.f8321S) == null) {
            return;
        }
        sVar.a(this);
        this.f8321S = null;
    }

    private boolean h(boolean z3) {
        if (this.f8322T.length == 0) {
            return m();
        }
        if (!z3) {
            return false;
        }
        if (!this.f8320R.f8754g) {
            return true;
        }
        q b9 = this.f8318P.b();
        long a9 = b9.a(!b9.f8695h.f8708g);
        return a9 == Long.MIN_VALUE || this.f8306C.a(a9 - (this.ab - b9.f8692e), this.f8314L.e().f8759b, this.f8325W);
    }

    private boolean a(b bVar) {
        Object obj = bVar.f8362d;
        if (obj == null) {
            Pair<Integer, Long> a9 = a(new d(bVar.f8359a.a(), bVar.f8359a.g(), com.anythink.basead.exoplayer.b.b(bVar.f8359a.f())), false);
            if (a9 == null) {
                return false;
            }
            bVar.a(((Integer) a9.first).intValue(), ((Long) a9.second).longValue(), this.f8320R.f8748a.a(((Integer) a9.first).intValue(), this.f8312I, true).f6343b);
        } else {
            int a10 = this.f8320R.f8748a.a(obj);
            if (a10 == -1) {
                return false;
            }
            bVar.f8360b = a10;
        }
        return true;
    }

    private static void a(y yVar) {
        if (yVar.a_() == 2) {
            yVar.k();
        }
    }

    private void a(com.anythink.basead.exoplayer.i.i iVar) {
        this.f8306C.a(this.f8328y, iVar.f7983c);
    }

    private void a(float f3) {
        for (q e9 = this.f8318P.e(); e9 != null; e9 = e9.i) {
            com.anythink.basead.exoplayer.i.i iVar = e9.f8697k;
            if (iVar != null) {
                for (com.anythink.basead.exoplayer.i.f fVar : iVar.f7983c.a()) {
                    if (fVar != null) {
                        fVar.a(f3);
                    }
                }
            }
        }
    }

    private void a(a aVar) {
        if (aVar.f8332a != this.f8321S) {
            return;
        }
        ae aeVar = this.f8320R.f8748a;
        ae aeVar2 = aVar.f8333b;
        Object obj = aVar.f8334c;
        this.f8318P.a(aeVar2);
        this.f8320R = this.f8320R.a(aeVar2, obj);
        for (int size = this.f8316N.size() - 1; size >= 0; size--) {
            if (!a(this.f8316N.get(size))) {
                this.f8316N.get(size).f8359a.a(false);
                this.f8316N.remove(size);
            }
        }
        Collections.sort(this.f8316N);
        int i6 = this.f8327Z;
        if (i6 > 0) {
            this.f8315M.a(i6);
            this.f8327Z = 0;
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
                s.a a10 = this.f8318P.a(intValue, longValue);
                this.f8320R = this.f8320R.a(a10, a10.a() ? 0L : longValue, longValue);
                return;
            }
            if (this.f8320R.f8751d == com.anythink.basead.exoplayer.b.f6382b) {
                if (aeVar2.a()) {
                    o();
                    return;
                }
                Pair<Integer, Long> a11 = a(aeVar2, aeVar2.b(this.Y));
                int intValue2 = ((Integer) a11.first).intValue();
                long longValue2 = ((Long) a11.second).longValue();
                s.a a12 = this.f8318P.a(intValue2, longValue2);
                this.f8320R = this.f8320R.a(a12, a12.a() ? 0L : longValue2, longValue2);
                return;
            }
            return;
        }
        u uVar = this.f8320R;
        int i9 = uVar.f8750c.f7767a;
        long j6 = uVar.f8752e;
        if (aeVar.a()) {
            if (aeVar2.a()) {
                return;
            }
            s.a a13 = this.f8318P.a(i9, j6);
            this.f8320R = this.f8320R.a(a13, a13.a() ? 0L : j6, j6);
            return;
        }
        q e9 = this.f8318P.e();
        int a14 = aeVar2.a(e9 == null ? aeVar.a(i9, this.f8312I, true).f6343b : e9.f8689b);
        if (a14 == -1) {
            int a15 = a(i9, aeVar, aeVar2);
            if (a15 == -1) {
                o();
                return;
            }
            Pair<Integer, Long> a16 = a(aeVar2, aeVar2.a(a15, this.f8312I, false).f6344c);
            int intValue3 = ((Integer) a16.first).intValue();
            long longValue3 = ((Long) a16.second).longValue();
            s.a a17 = this.f8318P.a(intValue3, longValue3);
            aeVar2.a(intValue3, this.f8312I, true);
            if (e9 != null) {
                Object obj2 = this.f8312I.f6343b;
                e9.f8695h = e9.f8695h.a();
                while (true) {
                    e9 = e9.i;
                    if (e9 == null) {
                        break;
                    } else if (e9.f8689b.equals(obj2)) {
                        e9.f8695h = this.f8318P.a(e9.f8695h, intValue3);
                    } else {
                        e9.f8695h = e9.f8695h.a();
                    }
                }
            }
            this.f8320R = this.f8320R.a(a17, a(a17, a17.a() ? 0L : longValue3), longValue3);
            return;
        }
        if (a14 != i9) {
            this.f8320R = this.f8320R.a(a14);
        }
        s.a aVar2 = this.f8320R.f8750c;
        if (aVar2.a()) {
            s.a a18 = this.f8318P.a(a14, j6);
            if (!a18.equals(aVar2)) {
                this.f8320R = this.f8320R.a(a18, a(a18, a18.a() ? 0L : j6), j6);
                return;
            }
        }
        if (this.f8318P.a(aVar2, this.ab)) {
            return;
        }
        g(false);
    }

    private int a(int i6, ae aeVar, ae aeVar2) {
        int c9 = aeVar.c();
        int i9 = 0;
        int i10 = i6;
        int i11 = -1;
        while (i9 < c9 && i11 == -1) {
            ae aeVar3 = aeVar;
            i10 = aeVar3.a(i10, this.f8312I, this.f8311H, this.f8326X, this.Y);
            if (i10 == -1) {
                break;
            }
            i11 = aeVar2.a(aeVar3.a(i10, this.f8312I, true).f6343b);
            i9++;
            aeVar = aeVar3;
        }
        return i11;
    }

    private Pair<Integer, Long> a(d dVar, boolean z3) {
        int a9;
        ae aeVar = this.f8320R.f8748a;
        ae aeVar2 = dVar.f8379a;
        if (aeVar.a()) {
            return null;
        }
        ae aeVar3 = aeVar2.a() ? aeVar : aeVar2;
        try {
            Pair<Integer, Long> a10 = aeVar3.a(this.f8311H, this.f8312I, dVar.f8380b, dVar.f8381c);
            if (aeVar == aeVar3) {
                return a10;
            }
            int a11 = aeVar.a(aeVar3.a(((Integer) a10.first).intValue(), this.f8312I, true).f6343b);
            if (a11 != -1) {
                return Pair.create(Integer.valueOf(a11), (Long) a10.second);
            }
            if (!z3 || (a9 = a(((Integer) a10.first).intValue(), aeVar3, aeVar)) == -1) {
                return null;
            }
            return a(aeVar, aeVar.a(a9, this.f8312I, false).f6344c);
        } catch (IndexOutOfBoundsException unused) {
            throw new o(aeVar, dVar.f8380b, dVar.f8381c);
        }
    }

    private Pair<Integer, Long> a(ae aeVar, int i6) {
        return aeVar.a(this.f8311H, this.f8312I, i6, com.anythink.basead.exoplayer.b.f6382b);
    }

    private void a(q qVar) {
        q c9 = this.f8318P.c();
        if (c9 == null || qVar == c9) {
            return;
        }
        boolean[] zArr = new boolean[this.f8328y.length];
        int i6 = 0;
        int i9 = 0;
        while (true) {
            y[] yVarArr = this.f8328y;
            if (i6 < yVarArr.length) {
                y yVar = yVarArr[i6];
                zArr[i6] = yVar.a_() != 0;
                if (c9.f8697k.a(i6)) {
                    i9++;
                }
                if (zArr[i6] && (!c9.f8697k.a(i6) || (yVar.i() && yVar.f() == qVar.f8690c[i6]))) {
                    b(yVar);
                }
                i6++;
            } else {
                this.f8320R = this.f8320R.a(c9.f8696j, c9.f8697k);
                a(zArr, i9);
                return;
            }
        }
    }

    private void a(boolean[] zArr, int i6) {
        this.f8322T = new y[i6];
        q c9 = this.f8318P.c();
        int i9 = 0;
        for (int i10 = 0; i10 < this.f8328y.length; i10++) {
            if (c9.f8697k.a(i10)) {
                a(i10, zArr[i10], i9);
                i9++;
            }
        }
    }

    private void a(int i6, boolean z3, int i9) {
        q c9 = this.f8318P.c();
        y yVar = this.f8328y[i6];
        this.f8322T[i9] = yVar;
        if (yVar.a_() == 0) {
            com.anythink.basead.exoplayer.i.i iVar = c9.f8697k;
            aa aaVar = iVar.f7982b[i6];
            m[] a9 = a(iVar.f7983c.a(i6));
            boolean z6 = this.f8324V && this.f8320R.f8753f == 3;
            yVar.a(aaVar, a9, c9.f8690c[i6], this.ab, !z3 && z6, c9.f8692e);
            this.f8314L.a(yVar);
            if (z6) {
                yVar.b_();
            }
        }
    }

    private static m[] a(com.anythink.basead.exoplayer.i.f fVar) {
        int g4 = fVar != null ? fVar.g() : 0;
        m[] mVarArr = new m[g4];
        for (int i6 = 0; i6 < g4; i6++) {
            mVarArr[i6] = fVar.a(i6);
        }
        return mVarArr;
    }
}
