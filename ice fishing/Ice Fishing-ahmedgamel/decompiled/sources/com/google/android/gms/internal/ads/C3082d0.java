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
public final class C3082d0 implements A0 {

    /* renamed from: a, reason: collision with root package name */
    public RB f30426a;

    /* renamed from: b, reason: collision with root package name */
    public DP f30427b;

    /* renamed from: c, reason: collision with root package name */
    public long f30428c;

    /* renamed from: d, reason: collision with root package name */
    public long f30429d;

    /* renamed from: e, reason: collision with root package name */
    public int f30430e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C3297h0 f30431f;

    public C3082d0(C3297h0 c3297h0, Context context) {
        this.f30431f = c3297h0;
        AbstractC3182eu.l(context);
        PB pb = RB.f27933u;
        this.f30426a = C3523lC.f32525x;
        this.f30429d = com.anythink.basead.exoplayer.b.f7168b;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void H() {
        C3297h0 c3297h0 = this.f30431f;
        if (c3297h0.f31477n == 2) {
            return;
        }
        C3235ft c3235ft = c3297h0.f31474k;
        if (c3235ft != null) {
            c3235ft.f31231a.removeCallbacksAndMessages(null);
        }
        c3297h0.f31475l = null;
        c3297h0.f31477n = 2;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void N() {
        C3297h0 c3297h0 = this.f30431f;
        if (c3297h0.f31473j.d() == 0) {
            c3297h0.f31469e.N();
            return;
        }
        J3.q qVar = new J3.q();
        if (c3297h0.f31473j.d() <= 0) {
            c3297h0.f31473j = qVar;
        } else {
            ((AbstractC3243g0) c3297h0.f31473j.e()).getClass();
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final boolean Z(boolean z6) {
        this.f30431f.f31469e.f27695a.getClass();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void c() {
        C3297h0 c3297h0 = this.f30431f;
        if (c3297h0.f31468d) {
            c3297h0.f31469e.c();
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
        C3297h0 c3297h0 = this.f30431f;
        if (c3297h0.f31468d) {
            c3297h0.f31469e.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final boolean j() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final Surface k() {
        AbstractC2792Sd.H(false);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void l0(boolean z6) {
        this.f30429d = com.anythink.basead.exoplayer.b.f7168b;
        C3297h0 c3297h0 = this.f30431f;
        if (c3297h0.f31477n == 1) {
            c3297h0.f31476m++;
            c3297h0.f31469e.l0(z6);
            while (c3297h0.f31473j.d() > 1) {
                c3297h0.f31473j.e();
            }
            if (c3297h0.f31473j.d() == 1) {
                ((AbstractC3243g0) c3297h0.f31473j.e()).getClass();
                PB pb = RB.f27933u;
                C3523lC c3523lC = C3523lC.f32525x;
                throw null;
            }
            c3297h0.f31478o = com.anythink.basead.exoplayer.b.f7168b;
            C3235ft c3235ft = c3297h0.f31474k;
            c3235ft.getClass();
            c3235ft.e(new RunnableC3134e(2, c3297h0));
        }
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void m() {
        C3297h0 c3297h0 = this.f30431f;
        c3297h0.getClass();
        Nr.f27339c.getClass();
        c3297h0.f31475l = null;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void m0(float f2) {
        C3297h0 c3297h0 = this.f30431f;
        c3297h0.i.b(f2);
        c3297h0.f31469e.m0(f2);
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void n() {
        long j6 = this.f30429d;
        C3297h0 c3297h0 = this.f30431f;
        c3297h0.getClass();
        if (c3297h0.f31478o >= j6) {
            c3297h0.f31469e.n();
        }
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void n0(Surface surface, Nr nr) {
        C3297h0 c3297h0 = this.f30431f;
        Pair pair = c3297h0.f31475l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((Nr) c3297h0.f31475l.second).equals(nr)) {
            return;
        }
        c3297h0.f31475l = Pair.create(surface, nr);
        nr.getClass();
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void p0(long j6, long j9) {
        this.f30431f.f31469e.p0(j6 + this.f30428c, j9);
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void q0(int i) {
        this.f30431f.f31469e.q0(i);
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void r0(InterfaceC3351i0 interfaceC3351i0) {
        this.f30431f.f31469e.f27704k = interfaceC3351i0;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void s0(List list) {
        if (this.f30426a.equals(list)) {
            return;
        }
        this.f30426a = RB.n(list);
        DP dp = this.f30427b;
        if (dp == null) {
            return;
        }
        C3322hP c3322hP = new C3322hP(dp);
        KJ kj = dp.f25152F;
        if (kj == null || !kj.d()) {
            kj = KJ.f26648h;
        }
        c3322hP.f31536E = kj;
        c3322hP.b();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final boolean t0(long j6, X x9) {
        int i;
        AbstractC2792Sd.H(false);
        long j9 = j6 + this.f30428c;
        C3297h0 c3297h0 = this.f30431f;
        C3511l0 c3511l0 = c3297h0.i;
        long j10 = c3511l0.f32456a == com.anythink.basead.exoplayer.b.f7168b ? -9223372036854775807L : (long) (((j9 - r3) * c3511l0.f32458c) + c3511l0.f32457b);
        if (j10 != com.anythink.basead.exoplayer.b.f7168b && j10 < c3297h0.f31472h && (i = this.f30430e) < 2) {
            this.f30430e = i + 1;
            x9.a();
            return true;
        }
        int i4 = c3297h0.f31479p;
        if (i4 == -1 || i4 != 0) {
            return false;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void u0(boolean z6) {
        C3297h0 c3297h0 = this.f30431f;
        if (c3297h0.f31468d) {
            c3297h0.f31469e.f27695a.getClass();
        }
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void v0(long j6) {
        this.f30428c = j6;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void w0(DP dp, long j6, int i, List list) {
        AbstractC2792Sd.H(false);
        this.f30426a = RB.n(list);
        this.f30427b = dp;
        this.f30431f.getClass();
        C3322hP c3322hP = new C3322hP(dp);
        KJ kj = dp.f25152F;
        if (kj == null || !kj.d()) {
            kj = KJ.f26648h;
        }
        c3322hP.f31536E = kj;
        c3322hP.b();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final boolean x0(DP dp) {
        C3297h0 c3297h0 = this.f30431f;
        boolean z6 = false;
        boolean z9 = true;
        AbstractC2792Sd.H(c3297h0.f31477n == 0);
        KJ kj = dp.f25152F;
        if (kj == null || !kj.d()) {
            kj = KJ.f26648h;
        }
        try {
            int i = kj.f26651c;
            if (i == 7) {
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 34) {
                    if (i4 >= 33 && AbstractC2792Sd.E("EGL_EXT_gl_colorspace_bt2020_pq")) {
                        Looper myLooper = Looper.myLooper();
                        myLooper.getClass();
                        c3297h0.f31474k = c3297h0.f31470f.x(myLooper, null);
                        c3297h0.f31466b.a();
                        throw null;
                    }
                }
                i = 7;
            }
            if (i == 6) {
                if (Build.VERSION.SDK_INT >= 33 && AbstractC2792Sd.E("EGL_EXT_gl_colorspace_bt2020_pq")) {
                    z6 = true;
                }
                z9 = z6;
            } else if (i == 7) {
                z9 = AbstractC2792Sd.E("EGL_EXT_gl_colorspace_bt2020_hlg");
            }
            if (!z9 && Build.VERSION.SDK_INT >= 29) {
                String str = AbstractC3182eu.f30782a;
                Locale locale = Locale.US;
                AbstractC2991bG.y("PlaybackVidGraphWrapper", "Color transfer " + i + " is not supported. Falling back to OpenGl tone mapping.");
                KJ kj2 = KJ.f26648h;
                Looper myLooper2 = Looper.myLooper();
                myLooper2.getClass();
                c3297h0.f31474k = c3297h0.f31470f.x(myLooper2, null);
                c3297h0.f31466b.a();
                throw null;
            }
            if (i == 2 || i == 10) {
                KJ kj3 = KJ.f26648h;
            }
            Looper myLooper22 = Looper.myLooper();
            myLooper22.getClass();
            c3297h0.f31474k = c3297h0.f31470f.x(myLooper22, null);
            c3297h0.f31466b.a();
            throw null;
        } catch (C2598Gn e9) {
            throw new C4266z0(e9, dp);
        }
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void o0(W w3) {
    }
}
