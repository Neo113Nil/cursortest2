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
    private static final String f8771w = "ExoPlayerImpl";

    /* renamed from: A, reason: collision with root package name */
    private final Handler f8772A;

    /* renamed from: B, reason: collision with root package name */
    private final k f8773B;

    /* renamed from: C, reason: collision with root package name */
    private final Handler f8774C;

    /* renamed from: D, reason: collision with root package name */
    private final CopyOnWriteArraySet<w.c> f8775D;

    /* renamed from: E, reason: collision with root package name */
    private final ae.b f8776E;

    /* renamed from: F, reason: collision with root package name */
    private final ae.a f8777F;

    /* renamed from: G, reason: collision with root package name */
    private final ArrayDeque<a> f8778G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f8779H;

    /* renamed from: I, reason: collision with root package name */
    private int f8780I;
    private boolean J;

    /* renamed from: K, reason: collision with root package name */
    private int f8781K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f8782L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f8783M;

    /* renamed from: N, reason: collision with root package name */
    private v f8784N;

    /* renamed from: O, reason: collision with root package name */
    private g f8785O;

    /* renamed from: P, reason: collision with root package name */
    private u f8786P;

    /* renamed from: Q, reason: collision with root package name */
    private int f8787Q;

    /* renamed from: R, reason: collision with root package name */
    private int f8788R;

    /* renamed from: S, reason: collision with root package name */
    private long f8789S;

    /* renamed from: x, reason: collision with root package name */
    private final y[] f8790x;

    /* renamed from: y, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.i.h f8791y;

    /* renamed from: z, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.i.i f8792z;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final u f8794a;

        /* renamed from: b, reason: collision with root package name */
        private final Set<w.c> f8795b;

        /* renamed from: c, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.i.h f8796c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f8797d;

        /* renamed from: e, reason: collision with root package name */
        private final int f8798e;

        /* renamed from: f, reason: collision with root package name */
        private final int f8799f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f8800g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f8801h;
        private final boolean i;

        /* renamed from: j, reason: collision with root package name */
        private final boolean f8802j;

        /* renamed from: k, reason: collision with root package name */
        private final boolean f8803k;

        /* renamed from: l, reason: collision with root package name */
        private final boolean f8804l;

        public a(u uVar, u uVar2, Set<w.c> set, com.anythink.basead.exoplayer.i.h hVar, boolean z6, int i, int i4, boolean z9, boolean z10, boolean z11) {
            this.f8794a = uVar;
            this.f8795b = set;
            this.f8796c = hVar;
            this.f8797d = z6;
            this.f8798e = i;
            this.f8799f = i4;
            this.f8800g = z9;
            this.f8801h = z10;
            this.i = z11 || uVar2.f9539f != uVar.f9539f;
            this.f8802j = (uVar2.f9534a == uVar.f9534a && uVar2.f9535b == uVar.f9535b) ? false : true;
            this.f8803k = uVar2.f9540g != uVar.f9540g;
            this.f8804l = uVar2.i != uVar.i;
        }

        public final void a() {
            if (this.f8802j || this.f8799f == 0) {
                for (w.c cVar : this.f8795b) {
                    u uVar = this.f8794a;
                    cVar.onTimelineChanged(uVar.f9534a, uVar.f9535b, this.f8799f);
                }
            }
            if (this.f8797d) {
                Iterator<w.c> it = this.f8795b.iterator();
                while (it.hasNext()) {
                    it.next().onPositionDiscontinuity(this.f8798e);
                }
            }
            if (this.f8804l) {
                this.f8796c.a(this.f8794a.i.f8770d);
                for (w.c cVar2 : this.f8795b) {
                    u uVar2 = this.f8794a;
                    cVar2.onTracksChanged(uVar2.f9541h, uVar2.i.f8769c);
                }
            }
            if (this.f8803k) {
                Iterator<w.c> it2 = this.f8795b.iterator();
                while (it2.hasNext()) {
                    it2.next().onLoadingChanged(this.f8794a.f9540g);
                }
            }
            if (this.i) {
                Iterator<w.c> it3 = this.f8795b.iterator();
                while (it3.hasNext()) {
                    it3.next().onPlayerStateChanged(this.f8801h, this.f8794a.f9539f);
                }
            }
            if (this.f8800g) {
                Iterator<w.c> it4 = this.f8795b.iterator();
                while (it4.hasNext()) {
                    it4.next().onSeekProcessed();
                }
            }
        }
    }

    public j(y[] yVarArr, com.anythink.basead.exoplayer.i.h hVar, p pVar, com.anythink.basead.exoplayer.k.c cVar) {
        Log.i(f8771w, "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.8.4] [" + af.f9136e + "]");
        com.anythink.basead.exoplayer.k.a.b(yVarArr.length > 0);
        this.f8790x = (y[]) com.anythink.basead.exoplayer.k.a.a(yVarArr);
        this.f8791y = (com.anythink.basead.exoplayer.i.h) com.anythink.basead.exoplayer.k.a.a(hVar);
        this.f8779H = false;
        this.f8780I = 0;
        this.J = false;
        this.f8775D = new CopyOnWriteArraySet<>();
        com.anythink.basead.exoplayer.i.i iVar = new com.anythink.basead.exoplayer.i.i(new aa[yVarArr.length], new com.anythink.basead.exoplayer.i.f[yVarArr.length], null);
        this.f8792z = iVar;
        this.f8776E = new ae.b();
        this.f8777F = new ae.a();
        this.f8784N = v.f9544a;
        Handler handler = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()) { // from class: com.anythink.basead.exoplayer.j.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                j.this.a(message);
            }
        };
        this.f8772A = handler;
        this.f8786P = new u(ae.f7127a, 0L, com.anythink.basead.exoplayer.h.af.f8301a, iVar);
        this.f8778G = new ArrayDeque<>();
        k kVar = new k(yVarArr, hVar, iVar, pVar, this.f8779H, this.f8780I, this.J, handler, this, cVar);
        this.f8773B = kVar;
        this.f8774C = new Handler(kVar.b());
    }

    private boolean H() {
        return this.f8786P.f9534a.a() || this.f8781K > 0;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int A() {
        if (y()) {
            return this.f8786P.f9536c.f8555c;
        }
        return -1;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final long B() {
        if (!y()) {
            return t();
        }
        u uVar = this.f8786P;
        uVar.f9534a.a(uVar.f9536c.f8553a, this.f8777F, false);
        return b.a(this.f8786P.f9538e) + this.f8777F.a();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int C() {
        return this.f8790x.length;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final com.anythink.basead.exoplayer.h.af D() {
        return this.f8786P.f9541h;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final com.anythink.basead.exoplayer.i.g E() {
        return this.f8786P.i.f8769c;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final ae F() {
        return this.f8786P.f9534a;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final Object G() {
        return this.f8786P.f9535b;
    }

    @Override // com.anythink.basead.exoplayer.h
    public final Looper a() {
        return this.f8773B.b();
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
        return this.f8786P.f9539f;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final g e() {
        return this.f8785O;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final boolean f() {
        return this.f8779H;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int g() {
        return this.f8780I;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final boolean h() {
        return this.J;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final boolean i() {
        return this.f8786P.f9540g;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void j() {
        b(p());
    }

    @Override // com.anythink.basead.exoplayer.w
    public final v k() {
        return this.f8784N;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final Object l() {
        int p9 = p();
        if (p9 > this.f8786P.f9534a.b()) {
            return null;
        }
        return this.f8786P.f9534a.a(p9, this.f8776E, true).f7134a;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void m() {
        c(false);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void n() {
        Log.i(f8771w, "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.8.4] [" + af.f9136e + "] [" + l.a() + "]");
        this.f8773B.a();
        this.f8772A.removeCallbacksAndMessages(null);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int o() {
        return H() ? this.f8788R : this.f8786P.f9536c.f8553a;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int p() {
        if (H()) {
            return this.f8787Q;
        }
        u uVar = this.f8786P;
        return uVar.f9534a.a(uVar.f9536c.f8553a, this.f8777F, false).f7130c;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int q() {
        ae aeVar = this.f8786P.f9534a;
        if (aeVar.a()) {
            return -1;
        }
        return aeVar.a(p(), this.f8780I, this.J);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int r() {
        ae aeVar = this.f8786P.f9534a;
        if (aeVar.a()) {
            return -1;
        }
        return aeVar.b(p(), this.f8780I, this.J);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final long s() {
        ae aeVar = this.f8786P.f9534a;
        if (aeVar.a()) {
            return b.f7168b;
        }
        if (!y()) {
            return b.a(aeVar.a(p(), this.f8776E, false).i);
        }
        s.a aVar = this.f8786P.f9536c;
        aeVar.a(aVar.f8553a, this.f8777F, false);
        return b.a(this.f8777F.c(aVar.f8554b, aVar.f8555c));
    }

    @Override // com.anythink.basead.exoplayer.w
    public final long t() {
        return H() ? this.f8789S : b(this.f8786P.f9542j);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final long u() {
        return H() ? this.f8789S : b(this.f8786P.f9543k);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int v() {
        long u6 = u();
        long s9 = s();
        if (u6 == b.f7168b || s9 == b.f7168b) {
            return 0;
        }
        if (s9 == 0) {
            return 100;
        }
        return af.a((int) ((u6 * 100) / s9), 0, 100);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final boolean w() {
        ae aeVar = this.f8786P.f9534a;
        return !aeVar.a() && aeVar.a(p(), this.f8776E, false).f7138e;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final boolean x() {
        ae aeVar = this.f8786P.f9534a;
        return !aeVar.a() && aeVar.a(p(), this.f8776E, false).f7137d;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final boolean y() {
        return !H() && this.f8786P.f9536c.a();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int z() {
        if (y()) {
            return this.f8786P.f9536c.f8554b;
        }
        return -1;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void a(w.c cVar) {
        this.f8775D.add(cVar);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void b(w.c cVar) {
        this.f8775D.remove(cVar);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void c(boolean z6) {
        if (z6) {
            this.f8785O = null;
        }
        u a9 = a(z6, z6, 1);
        this.f8781K++;
        this.f8773B.c(z6);
        a(a9, false, 4, 1, false, false);
    }

    @Override // com.anythink.basead.exoplayer.h
    public final void a(com.anythink.basead.exoplayer.h.s sVar) {
        a(sVar, true, true);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void b(boolean z6) {
        if (this.J != z6) {
            this.J = z6;
            this.f8773B.b(z6);
            Iterator<w.c> it = this.f8775D.iterator();
            while (it.hasNext()) {
                it.next().onShuffleModeEnabledChanged(z6);
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.h
    public final void a(com.anythink.basead.exoplayer.h.s sVar, boolean z6, boolean z9) {
        this.f8785O = null;
        u a9 = a(z6, z9, 2);
        this.f8782L = true;
        this.f8781K++;
        this.f8773B.a(sVar, z6, z9);
        a(a9, false, 4, 1, false, false);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int c(int i) {
        return this.f8790x[i].a();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void b(int i) {
        a(i, b.f7168b);
    }

    @Override // com.anythink.basead.exoplayer.h
    public final void b(h.c... cVarArr) {
        ArrayList arrayList = new ArrayList();
        for (h.c cVar : cVarArr) {
            arrayList.add(a(cVar.f8371a).a(cVar.f8372b).a(cVar.f8373c).i());
        }
        Iterator it = arrayList.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            x xVar = (x) it.next();
            boolean z9 = true;
            while (z9) {
                try {
                    xVar.k();
                    z9 = false;
                } catch (InterruptedException unused) {
                    z6 = true;
                } catch (TimeoutException e9) {
                    e9.getMessage();
                }
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void a(boolean z6) {
        if (this.f8779H != z6) {
            this.f8779H = z6;
            this.f8773B.a(z6);
            a(this.f8786P, false, 4, 1, false, true);
        }
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void a(int i) {
        if (this.f8780I != i) {
            this.f8780I = i;
            this.f8773B.a(i);
            Iterator<w.c> it = this.f8775D.iterator();
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
        int i4;
        ae aeVar = this.f8786P.f9534a;
        if (i >= 0 && (aeVar.a() || i < aeVar.b())) {
            this.f8783M = true;
            this.f8781K++;
            if (y()) {
                Log.w(f8771w, "seekTo ignored because an ad is playing");
                this.f8772A.obtainMessage(0, 1, -1, this.f8786P).sendToTarget();
                return;
            }
            this.f8787Q = i;
            if (aeVar.a()) {
                this.f8789S = j6 == b.f7168b ? 0L : j6;
                this.f8788R = 0;
                i4 = i;
            } else {
                if (j6 == b.f7168b) {
                    b9 = aeVar.a(i, this.f8776E, false).f7141h;
                } else {
                    b9 = b.b(j6);
                }
                long j9 = b9;
                i4 = i;
                Pair<Integer, Long> a9 = aeVar.a(this.f8776E, this.f8777F, i4, j9);
                this.f8789S = b.a(j9);
                this.f8788R = ((Integer) a9.first).intValue();
            }
            this.f8773B.a(aeVar, i4, b.b(j6));
            Iterator<w.c> it = this.f8775D.iterator();
            while (it.hasNext()) {
                it.next().onPositionDiscontinuity(1);
            }
            return;
        }
        throw new o(aeVar, i, j6);
    }

    private long b(long j6) {
        long a9 = b.a(j6);
        if (this.f8786P.f9536c.a()) {
            return a9;
        }
        u uVar = this.f8786P;
        uVar.f9534a.a(uVar.f9536c.f8553a, this.f8777F, false);
        return this.f8777F.a() + a9;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void a(v vVar) {
        if (vVar == null) {
            vVar = v.f9544a;
        }
        this.f8773B.b(vVar);
    }

    @Override // com.anythink.basead.exoplayer.h
    public final void a(ac acVar) {
        if (acVar == null) {
            acVar = ac.f7101e;
        }
        this.f8773B.a(acVar);
    }

    @Override // com.anythink.basead.exoplayer.h
    public final void a(h.c... cVarArr) {
        for (h.c cVar : cVarArr) {
            a(cVar.f8371a).a(cVar.f8372b).a(cVar.f8373c).i();
        }
    }

    @Override // com.anythink.basead.exoplayer.h
    public final x a(x.b bVar) {
        return new x(this.f8773B, bVar, this.f8786P.f9534a, p(), this.f8774C);
    }

    public final void a(Message message) {
        int i;
        boolean z6;
        int i4 = message.what;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    g gVar = (g) message.obj;
                    this.f8785O = gVar;
                    Iterator<w.c> it = this.f8775D.iterator();
                    while (it.hasNext()) {
                        it.next().onPlayerError(gVar);
                    }
                    return;
                }
                throw new IllegalStateException();
            }
            v vVar = (v) message.obj;
            if (this.f8784N.equals(vVar)) {
                return;
            }
            this.f8784N = vVar;
            Iterator<w.c> it2 = this.f8775D.iterator();
            while (it2.hasNext()) {
                it2.next().onPlaybackParametersChanged(vVar);
            }
            return;
        }
        u uVar = (u) message.obj;
        int i6 = message.arg1;
        int i9 = message.arg2;
        boolean z9 = i9 != -1;
        int i10 = this.f8781K - i6;
        this.f8781K = i10;
        if (i10 == 0) {
            if (uVar.f9537d == b.f7168b) {
                uVar = uVar.a(uVar.f9536c, 0L, uVar.f9538e);
            }
            u uVar2 = uVar;
            if ((!this.f8786P.f9534a.a() || this.f8782L) && uVar2.f9534a.a()) {
                this.f8788R = 0;
                this.f8787Q = 0;
                this.f8789S = 0L;
            }
            if (this.f8782L) {
                z6 = false;
                i = 0;
            } else {
                i = 2;
                z6 = false;
            }
            boolean z10 = this.f8783M;
            this.f8782L = z6;
            this.f8783M = z6;
            a(uVar2, z9, i9, i, z10, false);
        }
    }

    private void a(u uVar, int i, boolean z6, int i4) {
        int i6 = this.f8781K - i;
        this.f8781K = i6;
        if (i6 == 0) {
            u a9 = uVar.f9537d == b.f7168b ? uVar.a(uVar.f9536c, 0L, uVar.f9538e) : uVar;
            if ((!this.f8786P.f9534a.a() || this.f8782L) && a9.f9534a.a()) {
                this.f8788R = 0;
                this.f8787Q = 0;
                this.f8789S = 0L;
            }
            int i9 = this.f8782L ? 0 : 2;
            boolean z9 = this.f8783M;
            this.f8782L = false;
            this.f8783M = false;
            a(a9, z6, i4, i9, z9, false);
        }
    }

    private u a(boolean z6, boolean z9, int i) {
        if (z6) {
            this.f8787Q = 0;
            this.f8788R = 0;
            this.f8789S = 0L;
        } else {
            this.f8787Q = p();
            this.f8788R = o();
            this.f8789S = t();
        }
        ae aeVar = z9 ? ae.f7127a : this.f8786P.f9534a;
        Object obj = z9 ? null : this.f8786P.f9535b;
        u uVar = this.f8786P;
        return new u(aeVar, obj, uVar.f9536c, uVar.f9537d, uVar.f9538e, i, false, z9 ? com.anythink.basead.exoplayer.h.af.f8301a : uVar.f9541h, z9 ? this.f8792z : uVar.i);
    }

    private void a(u uVar, boolean z6, int i, int i4, boolean z9, boolean z10) {
        boolean isEmpty = this.f8778G.isEmpty();
        this.f8778G.addLast(new a(uVar, this.f8786P, this.f8775D, this.f8791y, z6, i, i4, z9, this.f8779H, z10));
        this.f8786P = uVar;
        if (isEmpty) {
            while (!this.f8778G.isEmpty()) {
                this.f8778G.peekFirst().a();
                this.f8778G.removeFirst();
            }
        }
    }
}
