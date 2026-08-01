package com.google.android.gms.internal.ads;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class Q implements A0 {

    /* renamed from: a, reason: collision with root package name */
    public final C3434k0 f26908a;

    /* renamed from: b, reason: collision with root package name */
    public final C3488l0 f26909b;

    /* renamed from: c, reason: collision with root package name */
    public final C3758q0 f26910c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f26911d;

    /* renamed from: e, reason: collision with root package name */
    public final U f26912e;

    /* renamed from: f, reason: collision with root package name */
    public Surface f26913f;

    /* renamed from: g, reason: collision with root package name */
    public DP f26914g;

    /* renamed from: h, reason: collision with root package name */
    public long f26915h;
    public InterfaceC4189y0 i;

    /* renamed from: j, reason: collision with root package name */
    public Executor f26916j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC3328i0 f26917k;

    public Q(C3434k0 c3434k0, C3488l0 c3488l0, V2 v22) {
        this.f26908a = c3434k0;
        this.f26909b = c3488l0;
        c3434k0.f31366h = v22;
        U u3 = new U(new Ux(1, c3434k0));
        this.f26912e = u3;
        this.f26910c = new C3758q0(new S0.c(this), c3434k0, c3488l0, u3);
        this.f26911d = new ArrayDeque();
        this.f26914g = new DP(new C3299hP());
        this.f26915h = com.anythink.basead.exoplayer.b.f6382b;
        this.i = InterfaceC4189y0.f35079a;
        this.f26916j = N.f26383n;
        this.f26917k = O.f26574u;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void I() {
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void N() {
        C3434k0 c3434k0 = this.f26908a;
        if (c3434k0.f31362d == 0) {
            c3434k0.f31362d = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final boolean Z(boolean z3) {
        return this.f26908a.d(z3);
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void c() {
        this.f26909b.c();
        this.f26908a.b();
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final boolean d() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void e() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void f() {
        this.f26909b.c();
        C3434k0 c3434k0 = this.f26908a;
        c3434k0.f31361c = false;
        C3704p0 c3704p0 = c3434k0.f31360b;
        c3704p0.f32989c = false;
        AbstractC3542m0 abstractC3542m0 = c3704p0.f32988b;
        if (abstractC3542m0 != null) {
            abstractC3542m0.b();
        }
        c3704p0.c();
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final boolean j() {
        C3758q0 c3758q0 = this.f26910c;
        long j6 = c3758q0.f33176j;
        return j6 != com.anythink.basead.exoplayer.b.f6382b && c3758q0.i == j6;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final Surface k() {
        Surface surface = this.f26913f;
        surface.getClass();
        return surface;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void l0(boolean z3) {
        if (z3) {
            C3434k0 c3434k0 = this.f26908a;
            c3434k0.f31360b.a();
            c3434k0.f31363e = com.anythink.basead.exoplayer.b.f6382b;
            c3434k0.f31362d = Math.min(c3434k0.f31362d, 1);
            c3434k0.f31367j = false;
        }
        this.f26909b.c();
        C3758q0 c3758q0 = this.f26910c;
        C0 c02 = c3758q0.f33172e;
        c02.f24003u = 0;
        c02.f24004v = -1;
        c02.f24005w = 0;
        c3758q0.f33175h = com.anythink.basead.exoplayer.b.f6382b;
        c3758q0.i = com.anythink.basead.exoplayer.b.f6382b;
        c3758q0.f33176j = com.anythink.basead.exoplayer.b.f6382b;
        H3.q qVar = c3758q0.f33171d;
        if (qVar.d() > 0) {
            AbstractC2772Sd.i(qVar.d() > 0);
            while (qVar.d() > 1) {
                qVar.e();
            }
            Object e9 = qVar.e();
            e9.getClass();
            c3758q0.f33178l = ((Long) e9).longValue();
        }
        H3.q qVar2 = c3758q0.f33170c;
        if (qVar2.d() > 0) {
            AbstractC2772Sd.i(qVar2.d() > 0);
            while (qVar2.d() > 1) {
                qVar2.e();
            }
            Object e10 = qVar2.e();
            e10.getClass();
            qVar2.c(0L, (C3035cd) e10);
        }
        this.f26911d.clear();
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void m() {
        this.f26913f = null;
        this.f26908a.c(null);
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void m0(float f3) {
        this.f26908a.f(f3);
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void n() {
        C3758q0 c3758q0 = this.f26910c;
        long j6 = c3758q0.f33175h;
        if (j6 == com.anythink.basead.exoplayer.b.f6382b) {
            j6 = Long.MIN_VALUE;
            c3758q0.f33175h = Long.MIN_VALUE;
            c3758q0.i = Long.MIN_VALUE;
        }
        c3758q0.f33176j = j6;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void n0(Surface surface, Nr nr) {
        this.f26913f = surface;
        this.f26908a.c(surface);
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void o0(W w6) {
        GD gd = GD.f24952n;
        this.i = w6;
        this.f26916j = gd;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void p0(long j6, long j9) {
        try {
            this.f26910c.a(j6, j9);
        } catch (DN e9) {
            throw new C4243z0(e9, this.f26914g);
        }
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void q0(int i) {
        C3704p0 c3704p0 = this.f26908a.f31360b;
        if (c3704p0.f32994h == i) {
            return;
        }
        c3704p0.f32994h = i;
        c3704p0.b(true);
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void r0(InterfaceC3328i0 interfaceC3328i0) {
        this.f26917k = interfaceC3328i0;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void s0(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final boolean t0(long j6, X x9) {
        this.f26911d.add(x9);
        C3758q0 c3758q0 = this.f26910c;
        C0 c02 = c3758q0.f33172e;
        int i = c02.f24005w;
        long[] jArr = (long[]) c02.f24007y;
        int length = jArr.length;
        if (i == length) {
            int i6 = length + length;
            if (i6 < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[i6];
            int i9 = c02.f24003u;
            int i10 = length - i9;
            System.arraycopy(jArr, i9, jArr2, 0, i10);
            System.arraycopy((long[]) c02.f24007y, 0, jArr2, i10, i9);
            c02.f24003u = 0;
            c02.f24004v = c02.f24005w - 1;
            c02.f24007y = jArr2;
            c02.f24006x = i6 - 1;
            jArr = jArr2;
        }
        int i11 = (c02.f24004v + 1) & c02.f24006x;
        c02.f24004v = i11;
        jArr[i11] = j6;
        c02.f24005w++;
        c3758q0.f33175h = j6;
        c3758q0.f33176j = com.anythink.basead.exoplayer.b.f6382b;
        this.f26916j.execute(new RunnableC3111e(1, this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void u0(boolean z3) {
        this.f26908a.getClass();
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void v0(long j6) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void w0(DP dp, long j6, int i, List list) {
        AbstractC2772Sd.H(list.isEmpty());
        int i6 = dp.f24438v;
        DP dp2 = this.f26914g;
        int i9 = dp2.f24438v;
        C3758q0 c3758q0 = this.f26910c;
        int i10 = dp.f24439w;
        if (i6 != i9 || i10 != dp2.f24439w) {
            long j9 = c3758q0.f33175h;
            c3758q0.f33170c.c(j9 == com.anythink.basead.exoplayer.b.f6382b ? 0L : j9 + 1, new C3035cd(i6, i10, 1.0f));
        }
        float f3 = this.f26914g.f24442z;
        float f9 = dp.f24442z;
        if (f9 != f3) {
            U u3 = this.f26912e;
            u3.f27841f = f9;
            u3.f27836a.a();
            u3.f27837b.a();
            u3.f27838c = false;
            u3.f27839d = com.anythink.basead.exoplayer.b.f6382b;
            u3.f27840e = 0;
            u3.c();
        }
        this.f26914g = dp;
        if (j6 != this.f26915h) {
            if (c3758q0.f33172e.f24005w == 0) {
                c3758q0.f33168a.a(i);
                c3758q0.f33178l = j6;
            } else {
                long j10 = c3758q0.f33175h;
                c3758q0.f33171d.c(j10 == com.anythink.basead.exoplayer.b.f6382b ? -4611686018427387904L : j10 + 1, Long.valueOf(j6));
            }
            this.f26915h = j6;
        }
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final boolean x0(DP dp) {
        return true;
    }
}
