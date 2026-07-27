package com.anythink.basead.exoplayer;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.anythink.basead.exoplayer.ae;
import com.anythink.basead.exoplayer.h;
import com.anythink.basead.exoplayer.h.s;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.w;
import com.anythink.basead.exoplayer.x;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
final class j implements h {

    /* renamed from: w, reason: collision with root package name */
    private static final String f7985w = "ExoPlayerImpl";

    /* renamed from: A, reason: collision with root package name */
    private final Handler f7986A;

    /* renamed from: B, reason: collision with root package name */
    private final k f7987B;

    /* renamed from: C, reason: collision with root package name */
    private final Handler f7988C;

    /* renamed from: D, reason: collision with root package name */
    private final CopyOnWriteArraySet<w.c> f7989D;

    /* renamed from: E, reason: collision with root package name */
    private final ae.b f7990E;

    /* renamed from: F, reason: collision with root package name */
    private final ae.a f7991F;

    /* renamed from: G, reason: collision with root package name */
    private final ArrayDeque<a> f7992G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f7993H;

    /* renamed from: I, reason: collision with root package name */
    private int f7994I;
    private boolean J;

    /* renamed from: K, reason: collision with root package name */
    private int f7995K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f7996L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f7997M;

    /* renamed from: N, reason: collision with root package name */
    private v f7998N;

    /* renamed from: O, reason: collision with root package name */
    private g f7999O;

    /* renamed from: P, reason: collision with root package name */
    private u f8000P;

    /* renamed from: Q, reason: collision with root package name */
    private int f8001Q;

    /* renamed from: R, reason: collision with root package name */
    private int f8002R;

    /* renamed from: S, reason: collision with root package name */
    private long f8003S;

    /* renamed from: x, reason: collision with root package name */
    private final y[] f8004x;

    /* renamed from: y, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.i.h f8005y;

    /* renamed from: z, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.i.i f8006z;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final u f8008a;

        /* renamed from: b, reason: collision with root package name */
        private final Set<w.c> f8009b;

        /* renamed from: c, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.i.h f8010c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f8011d;

        /* renamed from: e, reason: collision with root package name */
        private final int f8012e;

        /* renamed from: f, reason: collision with root package name */
        private final int f8013f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f8014g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f8015h;
        private final boolean i;

        /* renamed from: j, reason: collision with root package name */
        private final boolean f8016j;

        /* renamed from: k, reason: collision with root package name */
        private final boolean f8017k;

        /* renamed from: l, reason: collision with root package name */
        private final boolean f8018l;

        public a(u uVar, u uVar2, Set<w.c> set, com.anythink.basead.exoplayer.i.h hVar, boolean z3, int i, int i6, boolean z6, boolean z9, boolean z10) {
            this.f8008a = uVar;
            this.f8009b = set;
            this.f8010c = hVar;
            this.f8011d = z3;
            this.f8012e = i;
            this.f8013f = i6;
            this.f8014g = z6;
            this.f8015h = z9;
            this.i = z10 || uVar2.f8753f != uVar.f8753f;
            this.f8016j = (uVar2.f8748a == uVar.f8748a && uVar2.f8749b == uVar.f8749b) ? false : true;
            this.f8017k = uVar2.f8754g != uVar.f8754g;
            this.f8018l = uVar2.i != uVar.i;
        }

        public final void a() {
            if (this.f8016j || this.f8013f == 0) {
                for (w.c cVar : this.f8009b) {
                    u uVar = this.f8008a;
                    cVar.onTimelineChanged(uVar.f8748a, uVar.f8749b, this.f8013f);
                }
            }
            if (this.f8011d) {
                Iterator<w.c> it = this.f8009b.iterator();
                while (it.hasNext()) {
                    it.next().onPositionDiscontinuity(this.f8012e);
                }
            }
            if (this.f8018l) {
                this.f8010c.a(this.f8008a.i.f7984d);
                for (w.c cVar2 : this.f8009b) {
                    u uVar2 = this.f8008a;
                    cVar2.onTracksChanged(uVar2.f8755h, uVar2.i.f7983c);
                }
            }
            if (this.f8017k) {
                Iterator<w.c> it2 = this.f8009b.iterator();
                while (it2.hasNext()) {
                    it2.next().onLoadingChanged(this.f8008a.f8754g);
                }
            }
            if (this.i) {
                Iterator<w.c> it3 = this.f8009b.iterator();
                while (it3.hasNext()) {
                    it3.next().onPlayerStateChanged(this.f8015h, this.f8008a.f8753f);
                }
            }
            if (this.f8014g) {
                Iterator<w.c> it4 = this.f8009b.iterator();
                while (it4.hasNext()) {
                    it4.next().onSeekProcessed();
                }
            }
        }
    }

    public j(y[] yVarArr, com.anythink.basead.exoplayer.i.h hVar, p pVar, com.anythink.basead.exoplayer.k.c cVar) {
        Log.i(f7985w, "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.8.4] [" + af.f8350e + "]");
        com.anythink.basead.exoplayer.k.a.b(yVarArr.length > 0);
        this.f8004x = (y[]) com.anythink.basead.exoplayer.k.a.a(yVarArr);
        this.f8005y = (com.anythink.basead.exoplayer.i.h) com.anythink.basead.exoplayer.k.a.a(hVar);
        this.f7993H = false;
        this.f7994I = 0;
        this.J = false;
        this.f7989D = new CopyOnWriteArraySet<>();
        com.anythink.basead.exoplayer.i.i iVar = new com.anythink.basead.exoplayer.i.i(new aa[yVarArr.length], new com.anythink.basead.exoplayer.i.f[yVarArr.length], null);
        this.f8006z = iVar;
        this.f7990E = new ae.b();
        this.f7991F = new ae.a();
        this.f7998N = v.f8758a;
        Handler handler = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()) { // from class: com.anythink.basead.exoplayer.j.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                j.this.a(message);
            }
        };
        this.f7986A = handler;
        this.f8000P = new u(ae.f6341a, 0L, com.anythink.basead.exoplayer.h.af.f7515a, iVar);
        this.f7992G = new ArrayDeque<>();
        k kVar = new k(yVarArr, hVar, iVar, pVar, this.f7993H, this.f7994I, this.J, handler, this, cVar);
        this.f7987B = kVar;
        this.f7988C = new Handler(kVar.b());
    }

    private boolean H() {
        return this.f8000P.f8748a.a() || this.f7995K > 0;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int A() {
        if (y()) {
            return this.f8000P.f8750c.f7769c;
        }
        return -1;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final long B() {
        if (!y()) {
            return t();
        }
        u uVar = this.f8000P;
        uVar.f8748a.a(uVar.f8750c.f7767a, this.f7991F, false);
        return b.a(this.f8000P.f8752e) + this.f7991F.a();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int C() {
        return this.f8004x.length;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final com.anythink.basead.exoplayer.h.af D() {
        return this.f8000P.f8755h;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final com.anythink.basead.exoplayer.i.g E() {
        return this.f8000P.i.f7983c;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final ae F() {
        return this.f8000P.f8748a;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final Object G() {
        return this.f8000P.f8749b;
    }

    @Override // com.anythink.basead.exoplayer.h
    public final Looper a() {
        return this.f7987B.b();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final w.g b() {
        return null;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final w.e c() {
        return null;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int d() {
        return this.f8000P.f8753f;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final g e() {
        return this.f7999O;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final boolean f() {
        return this.f7993H;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int g() {
        return this.f7994I;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final boolean h() {
        return this.J;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final boolean i() {
        return this.f8000P.f8754g;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void j() {
        b(p());
    }

    @Override // com.anythink.basead.exoplayer.w
    public final v k() {
        return this.f7998N;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final Object l() {
        int p9 = p();
        if (p9 > this.f8000P.f8748a.b()) {
            return null;
        }
        return this.f8000P.f8748a.a(p9, this.f7990E, true).f6348a;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void m() {
        c(false);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void n() {
        Log.i(f7985w, "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.8.4] [" + af.f8350e + "] [" + l.a() + "]");
        this.f7987B.a();
        this.f7986A.removeCallbacksAndMessages(null);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int o() {
        return H() ? this.f8002R : this.f8000P.f8750c.f7767a;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int p() {
        if (H()) {
            return this.f8001Q;
        }
        u uVar = this.f8000P;
        return uVar.f8748a.a(uVar.f8750c.f7767a, this.f7991F, false).f6344c;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int q() {
        ae aeVar = this.f8000P.f8748a;
        if (aeVar.a()) {
            return -1;
        }
        return aeVar.a(p(), this.f7994I, this.J);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int r() {
        ae aeVar = this.f8000P.f8748a;
        if (aeVar.a()) {
            return -1;
        }
        return aeVar.b(p(), this.f7994I, this.J);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final long s() {
        ae aeVar = this.f8000P.f8748a;
        if (aeVar.a()) {
            return b.f6382b;
        }
        if (!y()) {
            return b.a(aeVar.a(p(), this.f7990E, false).i);
        }
        s.a aVar = this.f8000P.f8750c;
        aeVar.a(aVar.f7767a, this.f7991F, false);
        return b.a(this.f7991F.c(aVar.f7768b, aVar.f7769c));
    }

    @Override // com.anythink.basead.exoplayer.w
    public final long t() {
        return H() ? this.f8003S : b(this.f8000P.f8756j);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final long u() {
        return H() ? this.f8003S : b(this.f8000P.f8757k);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int v() {
        long u3 = u();
        long s9 = s();
        if (u3 == b.f6382b || s9 == b.f6382b) {
            return 0;
        }
        if (s9 == 0) {
            return 100;
        }
        return af.a((int) ((u3 * 100) / s9), 0, 100);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final boolean w() {
        ae aeVar = this.f8000P.f8748a;
        return !aeVar.a() && aeVar.a(p(), this.f7990E, false).f6352e;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final boolean x() {
        ae aeVar = this.f8000P.f8748a;
        return !aeVar.a() && aeVar.a(p(), this.f7990E, false).f6351d;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final boolean y() {
        return !H() && this.f8000P.f8750c.a();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int z() {
        if (y()) {
            return this.f8000P.f8750c.f7768b;
        }
        return -1;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void a(w.c cVar) {
        this.f7989D.add(cVar);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void b(w.c cVar) {
        this.f7989D.remove(cVar);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void c(boolean z3) {
        if (z3) {
            this.f7999O = null;
        }
        u a9 = a(z3, z3, 1);
        this.f7995K++;
        this.f7987B.c(z3);
        a(a9, false, 4, 1, false, false);
    }

    @Override // com.anythink.basead.exoplayer.h
    public final void a(com.anythink.basead.exoplayer.h.s sVar) {
        a(sVar, true, true);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void b(boolean z3) {
        if (this.J != z3) {
            this.J = z3;
            this.f7987B.b(z3);
            Iterator<w.c> it = this.f7989D.iterator();
            while (it.hasNext()) {
                it.next().onShuffleModeEnabledChanged(z3);
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.h
    public final void a(com.anythink.basead.exoplayer.h.s sVar, boolean z3, boolean z6) {
        this.f7999O = null;
        u a9 = a(z3, z6, 2);
        this.f7996L = true;
        this.f7995K++;
        this.f7987B.a(sVar, z3, z6);
        a(a9, false, 4, 1, false, false);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int c(int i) {
        return this.f8004x[i].a();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void b(int i) {
        a(i, b.f6382b);
    }

    @Override // com.anythink.basead.exoplayer.h
    public final void b(h.c... cVarArr) {
        ArrayList arrayList = new ArrayList();
        for (h.c cVar : cVarArr) {
            arrayList.add(a(cVar.f7585a).a(cVar.f7586b).a(cVar.f7587c).i());
        }
        Iterator it = arrayList.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            x xVar = (x) it.next();
            boolean z6 = true;
            while (z6) {
                try {
                    xVar.k();
                    z6 = false;
                } catch (InterruptedException unused) {
                    z3 = true;
                } catch (TimeoutException e9) {
                    e9.getMessage();
                }
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void a(boolean z3) {
        if (this.f7993H != z3) {
            this.f7993H = z3;
            this.f7987B.a(z3);
            a(this.f8000P, false, 4, 1, false, true);
        }
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void a(int i) {
        if (this.f7994I != i) {
            this.f7994I = i;
            this.f7987B.a(i);
            Iterator<w.c> it = this.f7989D.iterator();
            while (it.hasNext()) {
                it.next().onRepeatModeChanged(i);
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void a(long j6) {
        a(p(), j6);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void a(int i, long j6) {
        long b9;
        int i6;
        ae aeVar = this.f8000P.f8748a;
        if (i >= 0 && (aeVar.a() || i < aeVar.b())) {
            this.f7997M = true;
            this.f7995K++;
            if (y()) {
                Log.w(f7985w, "seekTo ignored because an ad is playing");
                this.f7986A.obtainMessage(0, 1, -1, this.f8000P).sendToTarget();
                return;
            }
            this.f8001Q = i;
            if (aeVar.a()) {
                this.f8003S = j6 == b.f6382b ? 0L : j6;
                this.f8002R = 0;
                i6 = i;
            } else {
                if (j6 == b.f6382b) {
                    b9 = aeVar.a(i, this.f7990E, false).f6355h;
                } else {
                    b9 = b.b(j6);
                }
                long j9 = b9;
                i6 = i;
                Pair<Integer, Long> a9 = aeVar.a(this.f7990E, this.f7991F, i6, j9);
                this.f8003S = b.a(j9);
                this.f8002R = ((Integer) a9.first).intValue();
            }
            this.f7987B.a(aeVar, i6, b.b(j6));
            Iterator<w.c> it = this.f7989D.iterator();
            while (it.hasNext()) {
                it.next().onPositionDiscontinuity(1);
            }
            return;
        }
        throw new o(aeVar, i, j6);
    }

    private long b(long j6) {
        long a9 = b.a(j6);
        if (this.f8000P.f8750c.a()) {
            return a9;
        }
        u uVar = this.f8000P;
        uVar.f8748a.a(uVar.f8750c.f7767a, this.f7991F, false);
        return this.f7991F.a() + a9;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void a(v vVar) {
        if (vVar == null) {
            vVar = v.f8758a;
        }
        this.f7987B.b(vVar);
    }

    @Override // com.anythink.basead.exoplayer.h
    public final void a(ac acVar) {
        if (acVar == null) {
            acVar = ac.f6315e;
        }
        this.f7987B.a(acVar);
    }

    @Override // com.anythink.basead.exoplayer.h
    public final void a(h.c... cVarArr) {
        for (h.c cVar : cVarArr) {
            a(cVar.f7585a).a(cVar.f7586b).a(cVar.f7587c).i();
        }
    }

    @Override // com.anythink.basead.exoplayer.h
    public final x a(x.b bVar) {
        return new x(this.f7987B, bVar, this.f8000P.f8748a, p(), this.f7988C);
    }

    public final void a(Message message) {
        int i;
        boolean z3;
        int i6 = message.what;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    g gVar = (g) message.obj;
                    this.f7999O = gVar;
                    Iterator<w.c> it = this.f7989D.iterator();
                    while (it.hasNext()) {
                        it.next().onPlayerError(gVar);
                    }
                    return;
                }
                throw new IllegalStateException();
            }
            v vVar = (v) message.obj;
            if (this.f7998N.equals(vVar)) {
                return;
            }
            this.f7998N = vVar;
            Iterator<w.c> it2 = this.f7989D.iterator();
            while (it2.hasNext()) {
                it2.next().onPlaybackParametersChanged(vVar);
            }
            return;
        }
        u uVar = (u) message.obj;
        int i9 = message.arg1;
        int i10 = message.arg2;
        boolean z6 = i10 != -1;
        int i11 = this.f7995K - i9;
        this.f7995K = i11;
        if (i11 == 0) {
            if (uVar.f8751d == b.f6382b) {
                uVar = uVar.a(uVar.f8750c, 0L, uVar.f8752e);
            }
            u uVar2 = uVar;
            if ((!this.f8000P.f8748a.a() || this.f7996L) && uVar2.f8748a.a()) {
                this.f8002R = 0;
                this.f8001Q = 0;
                this.f8003S = 0L;
            }
            if (this.f7996L) {
                z3 = false;
                i = 0;
            } else {
                i = 2;
                z3 = false;
            }
            boolean z9 = this.f7997M;
            this.f7996L = z3;
            this.f7997M = z3;
            a(uVar2, z6, i10, i, z9, false);
        }
    }

    private void a(u uVar, int i, boolean z3, int i6) {
        int i9 = this.f7995K - i;
        this.f7995K = i9;
        if (i9 == 0) {
            u a9 = uVar.f8751d == b.f6382b ? uVar.a(uVar.f8750c, 0L, uVar.f8752e) : uVar;
            if ((!this.f8000P.f8748a.a() || this.f7996L) && a9.f8748a.a()) {
                this.f8002R = 0;
                this.f8001Q = 0;
                this.f8003S = 0L;
            }
            int i10 = this.f7996L ? 0 : 2;
            boolean z6 = this.f7997M;
            this.f7996L = false;
            this.f7997M = false;
            a(a9, z3, i6, i10, z6, false);
        }
    }

    private u a(boolean z3, boolean z6, int i) {
        if (z3) {
            this.f8001Q = 0;
            this.f8002R = 0;
            this.f8003S = 0L;
        } else {
            this.f8001Q = p();
            this.f8002R = o();
            this.f8003S = t();
        }
        ae aeVar = z6 ? ae.f6341a : this.f8000P.f8748a;
        Object obj = z6 ? null : this.f8000P.f8749b;
        u uVar = this.f8000P;
        return new u(aeVar, obj, uVar.f8750c, uVar.f8751d, uVar.f8752e, i, false, z6 ? com.anythink.basead.exoplayer.h.af.f7515a : uVar.f8755h, z6 ? this.f8006z : uVar.i);
    }

    private void a(u uVar, boolean z3, int i, int i6, boolean z6, boolean z9) {
        boolean isEmpty = this.f7992G.isEmpty();
        this.f7992G.addLast(new a(uVar, this.f8000P, this.f7989D, this.f8005y, z3, i, i6, z6, this.f7993H, z9));
        this.f8000P = uVar;
        if (isEmpty) {
            while (!this.f7992G.isEmpty()) {
                this.f7992G.peekFirst().a();
                this.f7992G.removeFirst();
            }
        }
    }
}
