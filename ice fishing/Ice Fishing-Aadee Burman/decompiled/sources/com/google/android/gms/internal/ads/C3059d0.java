package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.d0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3059d0 implements A0 {

    /* renamed from: a, reason: collision with root package name */
    public RB f29654a;

    /* renamed from: b, reason: collision with root package name */
    public DP f29655b;

    /* renamed from: c, reason: collision with root package name */
    public long f29656c;

    /* renamed from: d, reason: collision with root package name */
    public long f29657d;

    /* renamed from: e, reason: collision with root package name */
    public int f29658e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C3274h0 f29659f;

    public C3059d0(C3274h0 c3274h0, Context context) {
        this.f29659f = c3274h0;
        AbstractC3159eu.l(context);
        PB pb = RB.f27177u;
        this.f29654a = C3500lC.f31745x;
        this.f29657d = com.anythink.basead.exoplayer.b.f6382b;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void I() {
        C3274h0 c3274h0 = this.f29659f;
        if (c3274h0.f30711n == 2) {
            return;
        }
        C3212ft c3212ft = c3274h0.f30708k;
        if (c3212ft != null) {
            c3212ft.f30468a.removeCallbacksAndMessages(null);
        }
        c3274h0.f30709l = null;
        c3274h0.f30711n = 2;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void N() {
        C3274h0 c3274h0 = this.f29659f;
        if (c3274h0.f30707j.d() == 0) {
            c3274h0.f30703e.N();
            return;
        }
        H3.q qVar = new H3.q();
        if (c3274h0.f30707j.d() <= 0) {
            c3274h0.f30707j = qVar;
        } else {
            ((AbstractC3220g0) c3274h0.f30707j.e()).getClass();
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final boolean Z(boolean z3) {
        this.f29659f.f30703e.f26908a.getClass();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void c() {
        C3274h0 c3274h0 = this.f29659f;
        if (c3274h0.f30702d) {
            c3274h0.f30703e.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final boolean d() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void f() {
        C3274h0 c3274h0 = this.f29659f;
        if (c3274h0.f30702d) {
            c3274h0.f30703e.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final boolean j() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final Surface k() {
        AbstractC2772Sd.H(false);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void l0(boolean z3) {
        this.f29657d = com.anythink.basead.exoplayer.b.f6382b;
        C3274h0 c3274h0 = this.f29659f;
        if (c3274h0.f30711n == 1) {
            c3274h0.f30710m++;
            c3274h0.f30703e.l0(z3);
            while (c3274h0.f30707j.d() > 1) {
                c3274h0.f30707j.e();
            }
            if (c3274h0.f30707j.d() == 1) {
                ((AbstractC3220g0) c3274h0.f30707j.e()).getClass();
                PB pb = RB.f27177u;
                C3500lC c3500lC = C3500lC.f31745x;
                throw null;
            }
            c3274h0.f30712o = com.anythink.basead.exoplayer.b.f6382b;
            C3212ft c3212ft = c3274h0.f30708k;
            c3212ft.getClass();
            c3212ft.e(new RunnableC3111e(2, c3274h0));
        }
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void m() {
        C3274h0 c3274h0 = this.f29659f;
        c3274h0.getClass();
        Nr.f26557c.getClass();
        c3274h0.f30709l = null;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void m0(float f3) {
        C3274h0 c3274h0 = this.f29659f;
        c3274h0.i.b(f3);
        c3274h0.f30703e.m0(f3);
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void n() {
        long j6 = this.f29657d;
        C3274h0 c3274h0 = this.f29659f;
        c3274h0.getClass();
        if (c3274h0.f30712o >= j6) {
            c3274h0.f30703e.n();
        }
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void n0(Surface surface, Nr nr) {
        C3274h0 c3274h0 = this.f29659f;
        Pair pair = c3274h0.f30709l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((Nr) c3274h0.f30709l.second).equals(nr)) {
            return;
        }
        c3274h0.f30709l = Pair.create(surface, nr);
        nr.getClass();
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void p0(long j6, long j9) {
        this.f29659f.f30703e.p0(j6 + this.f29656c, j9);
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void q0(int i) {
        this.f29659f.f30703e.q0(i);
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void r0(InterfaceC3328i0 interfaceC3328i0) {
        this.f29659f.f30703e.f26917k = interfaceC3328i0;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void s0(List list) {
        if (this.f29654a.equals(list)) {
            return;
        }
        this.f29654a = RB.n(list);
        DP dp = this.f29655b;
        if (dp == null) {
            return;
        }
        C3299hP c3299hP = new C3299hP(dp);
        KJ kj = dp.f24407F;
        if (kj == null || !kj.d()) {
            kj = KJ.f25896h;
        }
        c3299hP.f30770E = kj;
        c3299hP.b();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final boolean t0(long j6, X x9) {
        int i;
        AbstractC2772Sd.H(false);
        long j9 = j6 + this.f29656c;
        C3274h0 c3274h0 = this.f29659f;
        C3488l0 c3488l0 = c3274h0.i;
        long j10 = c3488l0.f31676a == com.anythink.basead.exoplayer.b.f6382b ? -9223372036854775807L : (long) (((j9 - r3) * c3488l0.f31678c) + c3488l0.f31677b);
        if (j10 != com.anythink.basead.exoplayer.b.f6382b && j10 < c3274h0.f30706h && (i = this.f29658e) < 2) {
            this.f29658e = i + 1;
            x9.a();
            return true;
        }
        int i6 = c3274h0.f30713p;
        if (i6 == -1 || i6 != 0) {
            return false;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void u0(boolean z3) {
        C3274h0 c3274h0 = this.f29659f;
        if (c3274h0.f30702d) {
            c3274h0.f30703e.f26908a.getClass();
        }
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void v0(long j6) {
        this.f29656c = j6;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void w0(DP dp, long j6, int i, List list) {
        AbstractC2772Sd.H(false);
        this.f29654a = RB.n(list);
        this.f29655b = dp;
        this.f29659f.getClass();
        C3299hP c3299hP = new C3299hP(dp);
        KJ kj = dp.f24407F;
        if (kj == null || !kj.d()) {
            kj = KJ.f25896h;
        }
        c3299hP.f30770E = kj;
        c3299hP.b();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final boolean x0(DP dp) {
        C3274h0 c3274h0 = this.f29659f;
        boolean z3 = false;
        boolean z6 = true;
        AbstractC2772Sd.H(c3274h0.f30711n == 0);
        KJ kj = dp.f24407F;
        if (kj == null || !kj.d()) {
            kj = KJ.f25896h;
        }
        try {
            int i = kj.f25899c;
            if (i == 7) {
                int i6 = Build.VERSION.SDK_INT;
                if (i6 < 34) {
                    if (i6 >= 33 && AbstractC2772Sd.E("EGL_EXT_gl_colorspace_bt2020_pq")) {
                        Looper myLooper = Looper.myLooper();
                        myLooper.getClass();
                        c3274h0.f30708k = c3274h0.f30704f.x(myLooper, null);
                        c3274h0.f30700b.a();
                        throw null;
                    }
                }
                i = 7;
            }
            if (i == 6) {
                if (Build.VERSION.SDK_INT >= 33 && AbstractC2772Sd.E("EGL_EXT_gl_colorspace_bt2020_pq")) {
                    z3 = true;
                }
                z6 = z3;
            } else if (i == 7) {
                z6 = AbstractC2772Sd.E("EGL_EXT_gl_colorspace_bt2020_hlg");
            }
            if (!z6 && Build.VERSION.SDK_INT >= 29) {
                String str = AbstractC3159eu.f29993a;
                Locale locale = Locale.US;
                AbstractC2968bG.y("PlaybackVidGraphWrapper", "Color transfer " + i + " is not supported. Falling back to OpenGl tone mapping.");
                KJ kj2 = KJ.f25896h;
                Looper myLooper2 = Looper.myLooper();
                myLooper2.getClass();
                c3274h0.f30708k = c3274h0.f30704f.x(myLooper2, null);
                c3274h0.f30700b.a();
                throw null;
            }
            if (i == 2 || i == 10) {
                KJ kj3 = KJ.f25896h;
            }
            Looper myLooper22 = Looper.myLooper();
            myLooper22.getClass();
            c3274h0.f30708k = c3274h0.f30704f.x(myLooper22, null);
            c3274h0.f30700b.a();
            throw null;
        } catch (C2561Fn e9) {
            throw new C4243z0(e9, dp);
        }
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void o0(W w6) {
    }
}
