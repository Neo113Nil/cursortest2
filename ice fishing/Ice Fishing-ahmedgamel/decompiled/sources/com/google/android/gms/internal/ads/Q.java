package com.google.android.gms.internal.ads;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class Q implements A0 {

    /* renamed from: a, reason: collision with root package name */
    public final C3457k0 f27695a;

    /* renamed from: b, reason: collision with root package name */
    public final C3511l0 f27696b;

    /* renamed from: c, reason: collision with root package name */
    public final C3781q0 f27697c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f27698d;

    /* renamed from: e, reason: collision with root package name */
    public final U f27699e;

    /* renamed from: f, reason: collision with root package name */
    public Surface f27700f;

    /* renamed from: g, reason: collision with root package name */
    public DP f27701g;

    /* renamed from: h, reason: collision with root package name */
    public long f27702h;
    public InterfaceC4212y0 i;

    /* renamed from: j, reason: collision with root package name */
    public Executor f27703j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC3351i0 f27704k;

    public Q(C3457k0 c3457k0, C3511l0 c3511l0, V2 v22) {
        this.f27695a = c3457k0;
        this.f27696b = c3511l0;
        c3457k0.f32145h = v22;
        U u6 = new U(new Ux(1, c3457k0));
        this.f27699e = u6;
        this.f27697c = new C3781q0(new S0.c(this), c3457k0, c3511l0, u6);
        this.f27698d = new ArrayDeque();
        this.f27701g = new DP(new C3322hP());
        this.f27702h = com.anythink.basead.exoplayer.b.f7168b;
        this.i = InterfaceC4212y0.f35865a;
        this.f27703j = N.f27168n;
        this.f27704k = O.f27356u;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void H() {
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void N() {
        C3457k0 c3457k0 = this.f27695a;
        if (c3457k0.f32141d == 0) {
            c3457k0.f32141d = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final boolean Z(boolean z6) {
        return this.f27695a.d(z6);
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void c() {
        this.f27696b.c();
        this.f27695a.b();
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
        this.f27696b.c();
        C3457k0 c3457k0 = this.f27695a;
        c3457k0.f32140c = false;
        C3727p0 c3727p0 = c3457k0.f32139b;
        c3727p0.f33779c = false;
        AbstractC3565m0 abstractC3565m0 = c3727p0.f33778b;
        if (abstractC3565m0 != null) {
            abstractC3565m0.b();
        }
        c3727p0.c();
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final boolean j() {
        C3781q0 c3781q0 = this.f27697c;
        long j6 = c3781q0.f33960j;
        return j6 != com.anythink.basead.exoplayer.b.f7168b && c3781q0.i == j6;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final Surface k() {
        Surface surface = this.f27700f;
        surface.getClass();
        return surface;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void l0(boolean z6) {
        if (z6) {
            C3457k0 c3457k0 = this.f27695a;
            c3457k0.f32139b.a();
            c3457k0.f32142e = com.anythink.basead.exoplayer.b.f7168b;
            c3457k0.f32141d = Math.min(c3457k0.f32141d, 1);
            c3457k0.f32146j = false;
        }
        this.f27696b.c();
        C3781q0 c3781q0 = this.f27697c;
        C0 c02 = c3781q0.f33956e;
        c02.f24766u = 0;
        c02.f24767v = -1;
        c02.f24768w = 0;
        c3781q0.f33959h = com.anythink.basead.exoplayer.b.f7168b;
        c3781q0.i = com.anythink.basead.exoplayer.b.f7168b;
        c3781q0.f33960j = com.anythink.basead.exoplayer.b.f7168b;
        J3.q qVar = c3781q0.f33955d;
        if (qVar.d() > 0) {
            AbstractC2792Sd.i(qVar.d() > 0);
            while (qVar.d() > 1) {
                qVar.e();
            }
            Object e9 = qVar.e();
            e9.getClass();
            c3781q0.f33962l = ((Long) e9).longValue();
        }
        J3.q qVar2 = c3781q0.f33954c;
        if (qVar2.d() > 0) {
            AbstractC2792Sd.i(qVar2.d() > 0);
            while (qVar2.d() > 1) {
                qVar2.e();
            }
            Object e10 = qVar2.e();
            e10.getClass();
            qVar2.c(0L, (C3058cd) e10);
        }
        this.f27698d.clear();
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void m() {
        this.f27700f = null;
        this.f27695a.c(null);
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void m0(float f2) {
        this.f27695a.f(f2);
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void n() {
        C3781q0 c3781q0 = this.f27697c;
        long j6 = c3781q0.f33959h;
        if (j6 == com.anythink.basead.exoplayer.b.f7168b) {
            j6 = Long.MIN_VALUE;
            c3781q0.f33959h = Long.MIN_VALUE;
            c3781q0.i = Long.MIN_VALUE;
        }
        c3781q0.f33960j = j6;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void n0(Surface surface, Nr nr) {
        this.f27700f = surface;
        this.f27695a.c(surface);
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void o0(W w3) {
        GD gd = GD.f25742n;
        this.i = w3;
        this.f27703j = gd;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void p0(long j6, long j9) {
        try {
            this.f27697c.a(j6, j9);
        } catch (DN e9) {
            throw new C4266z0(e9, this.f27701g);
        }
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void q0(int i) {
        C3727p0 c3727p0 = this.f27695a.f32139b;
        if (c3727p0.f33784h == i) {
            return;
        }
        c3727p0.f33784h = i;
        c3727p0.b(true);
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void r0(InterfaceC3351i0 interfaceC3351i0) {
        this.f27704k = interfaceC3351i0;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void s0(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final boolean t0(long j6, X x9) {
        this.f27698d.add(x9);
        C3781q0 c3781q0 = this.f27697c;
        C0 c02 = c3781q0.f33956e;
        int i = c02.f24768w;
        long[] jArr = (long[]) c02.f24770y;
        int length = jArr.length;
        if (i == length) {
            int i4 = length + length;
            if (i4 < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[i4];
            int i6 = c02.f24766u;
            int i9 = length - i6;
            System.arraycopy(jArr, i6, jArr2, 0, i9);
            System.arraycopy((long[]) c02.f24770y, 0, jArr2, i9, i6);
            c02.f24766u = 0;
            c02.f24767v = c02.f24768w - 1;
            c02.f24770y = jArr2;
            c02.f24769x = i4 - 1;
            jArr = jArr2;
        }
        int i10 = (c02.f24767v + 1) & c02.f24769x;
        c02.f24767v = i10;
        jArr[i10] = j6;
        c02.f24768w++;
        c3781q0.f33959h = j6;
        c3781q0.f33960j = com.anythink.basead.exoplayer.b.f7168b;
        this.f27703j.execute(new RunnableC3134e(1, this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void u0(boolean z6) {
        this.f27695a.getClass();
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void v0(long j6) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final void w0(DP dp, long j6, int i, List list) {
        AbstractC2792Sd.H(list.isEmpty());
        int i4 = dp.f25183v;
        DP dp2 = this.f27701g;
        int i6 = dp2.f25183v;
        C3781q0 c3781q0 = this.f27697c;
        int i9 = dp.f25184w;
        if (i4 != i6 || i9 != dp2.f25184w) {
            long j9 = c3781q0.f33959h;
            c3781q0.f33954c.c(j9 == com.anythink.basead.exoplayer.b.f7168b ? 0L : j9 + 1, new C3058cd(i4, i9, 1.0f));
        }
        float f2 = this.f27701g.f25187z;
        float f9 = dp.f25187z;
        if (f9 != f2) {
            U u6 = this.f27699e;
            u6.f28638f = f9;
            u6.f28633a.a();
            u6.f28634b.a();
            u6.f28635c = false;
            u6.f28636d = com.anythink.basead.exoplayer.b.f7168b;
            u6.f28637e = 0;
            u6.c();
        }
        this.f27701g = dp;
        if (j6 != this.f27702h) {
            if (c3781q0.f33956e.f24768w == 0) {
                c3781q0.f33952a.a(i);
                c3781q0.f33962l = j6;
            } else {
                long j10 = c3781q0.f33959h;
                c3781q0.f33955d.c(j10 == com.anythink.basead.exoplayer.b.f7168b ? -4611686018427387904L : j10 + 1, Long.valueOf(j6));
            }
            this.f27702h = j6;
        }
    }

    @Override // com.google.android.gms.internal.ads.A0
    public final boolean x0(DP dp) {
        return true;
    }
}
