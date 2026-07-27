package com.anythink.basead.exoplayer;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.anythink.basead.exoplayer.ae;
import com.anythink.basead.exoplayer.h;
import com.anythink.basead.exoplayer.h.s;
import com.anythink.basead.exoplayer.k.C0544a;
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
    private static final String f8142w = "ExoPlayerImpl";

    /* renamed from: A, reason: collision with root package name */
    private final Handler f8143A;

    /* renamed from: B, reason: collision with root package name */
    private final k f8144B;

    /* renamed from: C, reason: collision with root package name */
    private final Handler f8145C;

    /* renamed from: D, reason: collision with root package name */
    private final CopyOnWriteArraySet<w.c> f8146D;

    /* renamed from: E, reason: collision with root package name */
    private final ae.b f8147E;

    /* renamed from: F, reason: collision with root package name */
    private final ae.a f8148F;

    /* renamed from: G, reason: collision with root package name */
    private final ArrayDeque<a> f8149G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f8150H;

    /* renamed from: I, reason: collision with root package name */
    private int f8151I;
    private boolean J;

    /* renamed from: K, reason: collision with root package name */
    private int f8152K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f8153L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f8154M;

    /* renamed from: N, reason: collision with root package name */
    private v f8155N;

    /* renamed from: O, reason: collision with root package name */
    private g f8156O;

    /* renamed from: P, reason: collision with root package name */
    private u f8157P;

    /* renamed from: Q, reason: collision with root package name */
    private int f8158Q;

    /* renamed from: R, reason: collision with root package name */
    private int f8159R;

    /* renamed from: S, reason: collision with root package name */
    private long f8160S;

    /* renamed from: x, reason: collision with root package name */
    private final y[] f8161x;

    /* renamed from: y, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.i.h f8162y;

    /* renamed from: z, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.i.i f8163z;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final u f8165a;

        /* renamed from: b, reason: collision with root package name */
        private final Set<w.c> f8166b;

        /* renamed from: c, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.i.h f8167c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f8168d;

        /* renamed from: e, reason: collision with root package name */
        private final int f8169e;

        /* renamed from: f, reason: collision with root package name */
        private final int f8170f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f8171g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f8172h;
        private final boolean i;

        /* renamed from: j, reason: collision with root package name */
        private final boolean f8173j;

        /* renamed from: k, reason: collision with root package name */
        private final boolean f8174k;

        /* renamed from: l, reason: collision with root package name */
        private final boolean f8175l;

        public a(u uVar, u uVar2, Set<w.c> set, com.anythink.basead.exoplayer.i.h hVar, boolean z8, int i, int i4, boolean z9, boolean z10, boolean z11) {
            this.f8165a = uVar;
            this.f8166b = set;
            this.f8167c = hVar;
            this.f8168d = z8;
            this.f8169e = i;
            this.f8170f = i4;
            this.f8171g = z9;
            this.f8172h = z10;
            this.i = z11 || uVar2.f8910f != uVar.f8910f;
            this.f8173j = (uVar2.f8905a == uVar.f8905a && uVar2.f8906b == uVar.f8906b) ? false : true;
            this.f8174k = uVar2.f8911g != uVar.f8911g;
            this.f8175l = uVar2.i != uVar.i;
        }

        public final void a() {
            if (this.f8173j || this.f8170f == 0) {
                for (w.c cVar : this.f8166b) {
                    u uVar = this.f8165a;
                    cVar.onTimelineChanged(uVar.f8905a, uVar.f8906b, this.f8170f);
                }
            }
            if (this.f8168d) {
                Iterator<w.c> it = this.f8166b.iterator();
                while (it.hasNext()) {
                    it.next().onPositionDiscontinuity(this.f8169e);
                }
            }
            if (this.f8175l) {
                this.f8167c.a(this.f8165a.i.f8141d);
                for (w.c cVar2 : this.f8166b) {
                    u uVar2 = this.f8165a;
                    cVar2.onTracksChanged(uVar2.f8912h, uVar2.i.f8140c);
                }
            }
            if (this.f8174k) {
                Iterator<w.c> it2 = this.f8166b.iterator();
                while (it2.hasNext()) {
                    it2.next().onLoadingChanged(this.f8165a.f8911g);
                }
            }
            if (this.i) {
                Iterator<w.c> it3 = this.f8166b.iterator();
                while (it3.hasNext()) {
                    it3.next().onPlayerStateChanged(this.f8172h, this.f8165a.f8910f);
                }
            }
            if (this.f8171g) {
                Iterator<w.c> it4 = this.f8166b.iterator();
                while (it4.hasNext()) {
                    it4.next().onSeekProcessed();
                }
            }
        }
    }

    public j(y[] yVarArr, com.anythink.basead.exoplayer.i.h hVar, p pVar, com.anythink.basead.exoplayer.k.c cVar) {
        Log.i(f8142w, "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.8.4] [" + af.f8507e + "]");
        C0544a.b(yVarArr.length > 0);
        this.f8161x = (y[]) C0544a.a(yVarArr);
        this.f8162y = (com.anythink.basead.exoplayer.i.h) C0544a.a(hVar);
        this.f8150H = false;
        this.f8151I = 0;
        this.J = false;
        this.f8146D = new CopyOnWriteArraySet<>();
        com.anythink.basead.exoplayer.i.i iVar = new com.anythink.basead.exoplayer.i.i(new aa[yVarArr.length], new com.anythink.basead.exoplayer.i.f[yVarArr.length], null);
        this.f8163z = iVar;
        this.f8147E = new ae.b();
        this.f8148F = new ae.a();
        this.f8155N = v.f8915a;
        Handler handler = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()) { // from class: com.anythink.basead.exoplayer.j.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                j.this.a(message);
            }
        };
        this.f8143A = handler;
        this.f8157P = new u(ae.f6498a, 0L, com.anythink.basead.exoplayer.h.af.f7672a, iVar);
        this.f8149G = new ArrayDeque<>();
        k kVar = new k(yVarArr, hVar, iVar, pVar, this.f8150H, this.f8151I, this.J, handler, this, cVar);
        this.f8144B = kVar;
        this.f8145C = new Handler(kVar.b());
    }

    private boolean H() {
        return this.f8157P.f8905a.a() || this.f8152K > 0;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int A() {
        if (y()) {
            return this.f8157P.f8907c.f7926c;
        }
        return -1;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final long B() {
        if (!y()) {
            return t();
        }
        u uVar = this.f8157P;
        uVar.f8905a.a(uVar.f8907c.f7924a, this.f8148F, false);
        return b.a(this.f8157P.f8909e) + this.f8148F.a();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int C() {
        return this.f8161x.length;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final com.anythink.basead.exoplayer.h.af D() {
        return this.f8157P.f8912h;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final com.anythink.basead.exoplayer.i.g E() {
        return this.f8157P.i.f8140c;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final ae F() {
        return this.f8157P.f8905a;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final Object G() {
        return this.f8157P.f8906b;
    }

    @Override // com.anythink.basead.exoplayer.h
    public final Looper a() {
        return this.f8144B.b();
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
        return this.f8157P.f8910f;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final g e() {
        return this.f8156O;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final boolean f() {
        return this.f8150H;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int g() {
        return this.f8151I;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final boolean h() {
        return this.J;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final boolean i() {
        return this.f8157P.f8911g;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void j() {
        b(p());
    }

    @Override // com.anythink.basead.exoplayer.w
    public final v k() {
        return this.f8155N;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final Object l() {
        int p6 = p();
        if (p6 > this.f8157P.f8905a.b()) {
            return null;
        }
        return this.f8157P.f8905a.a(p6, this.f8147E, true).f6505a;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void m() {
        c(false);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void n() {
        Log.i(f8142w, "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.8.4] [" + af.f8507e + "] [" + l.a() + "]");
        this.f8144B.a();
        this.f8143A.removeCallbacksAndMessages(null);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int o() {
        return H() ? this.f8159R : this.f8157P.f8907c.f7924a;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int p() {
        if (H()) {
            return this.f8158Q;
        }
        u uVar = this.f8157P;
        return uVar.f8905a.a(uVar.f8907c.f7924a, this.f8148F, false).f6501c;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int q() {
        ae aeVar = this.f8157P.f8905a;
        if (aeVar.a()) {
            return -1;
        }
        return aeVar.a(p(), this.f8151I, this.J);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int r() {
        ae aeVar = this.f8157P.f8905a;
        if (aeVar.a()) {
            return -1;
        }
        return aeVar.b(p(), this.f8151I, this.J);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final long s() {
        ae aeVar = this.f8157P.f8905a;
        if (aeVar.a()) {
            return b.f6539b;
        }
        if (!y()) {
            return b.a(aeVar.a(p(), this.f8147E, false).i);
        }
        s.a aVar = this.f8157P.f8907c;
        aeVar.a(aVar.f7924a, this.f8148F, false);
        return b.a(this.f8148F.c(aVar.f7925b, aVar.f7926c));
    }

    @Override // com.anythink.basead.exoplayer.w
    public final long t() {
        return H() ? this.f8160S : b(this.f8157P.f8913j);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final long u() {
        return H() ? this.f8160S : b(this.f8157P.f8914k);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int v() {
        long u7 = u();
        long s3 = s();
        if (u7 == b.f6539b || s3 == b.f6539b) {
            return 0;
        }
        if (s3 == 0) {
            return 100;
        }
        return af.a((int) ((u7 * 100) / s3), 0, 100);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final boolean w() {
        ae aeVar = this.f8157P.f8905a;
        return !aeVar.a() && aeVar.a(p(), this.f8147E, false).f6509e;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final boolean x() {
        ae aeVar = this.f8157P.f8905a;
        return !aeVar.a() && aeVar.a(p(), this.f8147E, false).f6508d;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final boolean y() {
        return !H() && this.f8157P.f8907c.a();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int z() {
        if (y()) {
            return this.f8157P.f8907c.f7925b;
        }
        return -1;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void a(w.c cVar) {
        this.f8146D.add(cVar);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void b(w.c cVar) {
        this.f8146D.remove(cVar);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void c(boolean z8) {
        if (z8) {
            this.f8156O = null;
        }
        u a9 = a(z8, z8, 1);
        this.f8152K++;
        this.f8144B.c(z8);
        a(a9, false, 4, 1, false, false);
    }

    @Override // com.anythink.basead.exoplayer.h
    public final void a(com.anythink.basead.exoplayer.h.s sVar) {
        a(sVar, true, true);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void b(boolean z8) {
        if (this.J != z8) {
            this.J = z8;
            this.f8144B.b(z8);
            Iterator<w.c> it = this.f8146D.iterator();
            while (it.hasNext()) {
                it.next().onShuffleModeEnabledChanged(z8);
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.h
    public final void a(com.anythink.basead.exoplayer.h.s sVar, boolean z8, boolean z9) {
        this.f8156O = null;
        u a9 = a(z8, z9, 2);
        this.f8153L = true;
        this.f8152K++;
        this.f8144B.a(sVar, z8, z9);
        a(a9, false, 4, 1, false, false);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int c(int i) {
        return this.f8161x[i].a();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void b(int i) {
        a(i, b.f6539b);
    }

    @Override // com.anythink.basead.exoplayer.h
    public final void b(h.c... cVarArr) {
        ArrayList arrayList = new ArrayList();
        for (h.c cVar : cVarArr) {
            arrayList.add(a(cVar.f7742a).a(cVar.f7743b).a(cVar.f7744c).i());
        }
        Iterator it = arrayList.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            x xVar = (x) it.next();
            boolean z9 = true;
            while (z9) {
                try {
                    xVar.k();
                    z9 = false;
                } catch (InterruptedException unused) {
                    z8 = true;
                } catch (TimeoutException e6) {
                    e6.getMessage();
                }
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void a(boolean z8) {
        if (this.f8150H != z8) {
            this.f8150H = z8;
            this.f8144B.a(z8);
            a(this.f8157P, false, 4, 1, false, true);
        }
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void a(int i) {
        if (this.f8151I != i) {
            this.f8151I = i;
            this.f8144B.a(i);
            Iterator<w.c> it = this.f8146D.iterator();
            while (it.hasNext()) {
                it.next().onRepeatModeChanged(i);
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void a(long j9) {
        a(p(), j9);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void a(int i, long j9) {
        long b9;
        int i4;
        ae aeVar = this.f8157P.f8905a;
        if (i >= 0 && (aeVar.a() || i < aeVar.b())) {
            this.f8154M = true;
            this.f8152K++;
            if (y()) {
                Log.w(f8142w, "seekTo ignored because an ad is playing");
                this.f8143A.obtainMessage(0, 1, -1, this.f8157P).sendToTarget();
                return;
            }
            this.f8158Q = i;
            if (aeVar.a()) {
                this.f8160S = j9 == b.f6539b ? 0L : j9;
                this.f8159R = 0;
                i4 = i;
            } else {
                if (j9 == b.f6539b) {
                    b9 = aeVar.a(i, this.f8147E, false).f6512h;
                } else {
                    b9 = b.b(j9);
                }
                long j10 = b9;
                i4 = i;
                Pair<Integer, Long> a9 = aeVar.a(this.f8147E, this.f8148F, i4, j10);
                this.f8160S = b.a(j10);
                this.f8159R = ((Integer) a9.first).intValue();
            }
            this.f8144B.a(aeVar, i4, b.b(j9));
            Iterator<w.c> it = this.f8146D.iterator();
            while (it.hasNext()) {
                it.next().onPositionDiscontinuity(1);
            }
            return;
        }
        throw new o(aeVar, i, j9);
    }

    private long b(long j9) {
        long a9 = b.a(j9);
        if (this.f8157P.f8907c.a()) {
            return a9;
        }
        u uVar = this.f8157P;
        uVar.f8905a.a(uVar.f8907c.f7924a, this.f8148F, false);
        return this.f8148F.a() + a9;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void a(v vVar) {
        if (vVar == null) {
            vVar = v.f8915a;
        }
        this.f8144B.b(vVar);
    }

    @Override // com.anythink.basead.exoplayer.h
    public final void a(ac acVar) {
        if (acVar == null) {
            acVar = ac.f6472e;
        }
        this.f8144B.a(acVar);
    }

    @Override // com.anythink.basead.exoplayer.h
    public final void a(h.c... cVarArr) {
        for (h.c cVar : cVarArr) {
            a(cVar.f7742a).a(cVar.f7743b).a(cVar.f7744c).i();
        }
    }

    @Override // com.anythink.basead.exoplayer.h
    public final x a(x.b bVar) {
        return new x(this.f8144B, bVar, this.f8157P.f8905a, p(), this.f8145C);
    }

    public final void a(Message message) {
        int i;
        boolean z8;
        int i4 = message.what;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    g gVar = (g) message.obj;
                    this.f8156O = gVar;
                    Iterator<w.c> it = this.f8146D.iterator();
                    while (it.hasNext()) {
                        it.next().onPlayerError(gVar);
                    }
                    return;
                }
                throw new IllegalStateException();
            }
            v vVar = (v) message.obj;
            if (this.f8155N.equals(vVar)) {
                return;
            }
            this.f8155N = vVar;
            Iterator<w.c> it2 = this.f8146D.iterator();
            while (it2.hasNext()) {
                it2.next().onPlaybackParametersChanged(vVar);
            }
            return;
        }
        u uVar = (u) message.obj;
        int i9 = message.arg1;
        int i10 = message.arg2;
        boolean z9 = i10 != -1;
        int i11 = this.f8152K - i9;
        this.f8152K = i11;
        if (i11 == 0) {
            if (uVar.f8908d == b.f6539b) {
                uVar = uVar.a(uVar.f8907c, 0L, uVar.f8909e);
            }
            u uVar2 = uVar;
            if ((!this.f8157P.f8905a.a() || this.f8153L) && uVar2.f8905a.a()) {
                this.f8159R = 0;
                this.f8158Q = 0;
                this.f8160S = 0L;
            }
            if (this.f8153L) {
                z8 = false;
                i = 0;
            } else {
                i = 2;
                z8 = false;
            }
            boolean z10 = this.f8154M;
            this.f8153L = z8;
            this.f8154M = z8;
            a(uVar2, z9, i10, i, z10, false);
        }
    }

    private void a(u uVar, int i, boolean z8, int i4) {
        int i9 = this.f8152K - i;
        this.f8152K = i9;
        if (i9 == 0) {
            u a9 = uVar.f8908d == b.f6539b ? uVar.a(uVar.f8907c, 0L, uVar.f8909e) : uVar;
            if ((!this.f8157P.f8905a.a() || this.f8153L) && a9.f8905a.a()) {
                this.f8159R = 0;
                this.f8158Q = 0;
                this.f8160S = 0L;
            }
            int i10 = this.f8153L ? 0 : 2;
            boolean z9 = this.f8154M;
            this.f8153L = false;
            this.f8154M = false;
            a(a9, z8, i4, i10, z9, false);
        }
    }

    private u a(boolean z8, boolean z9, int i) {
        if (z8) {
            this.f8158Q = 0;
            this.f8159R = 0;
            this.f8160S = 0L;
        } else {
            this.f8158Q = p();
            this.f8159R = o();
            this.f8160S = t();
        }
        ae aeVar = z9 ? ae.f6498a : this.f8157P.f8905a;
        Object obj = z9 ? null : this.f8157P.f8906b;
        u uVar = this.f8157P;
        return new u(aeVar, obj, uVar.f8907c, uVar.f8908d, uVar.f8909e, i, false, z9 ? com.anythink.basead.exoplayer.h.af.f7672a : uVar.f8912h, z9 ? this.f8163z : uVar.i);
    }

    private void a(u uVar, boolean z8, int i, int i4, boolean z9, boolean z10) {
        boolean isEmpty = this.f8149G.isEmpty();
        this.f8149G.addLast(new a(uVar, this.f8157P, this.f8146D, this.f8162y, z8, i, i4, z9, this.f8150H, z10));
        this.f8157P = uVar;
        if (isEmpty) {
            while (!this.f8149G.isEmpty()) {
                this.f8149G.peekFirst().a();
                this.f8149G.removeFirst();
            }
        }
    }
}
