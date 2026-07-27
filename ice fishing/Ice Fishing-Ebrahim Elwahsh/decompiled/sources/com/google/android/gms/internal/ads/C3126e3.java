package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.e3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3126e3 implements O0 {

    /* renamed from: a, reason: collision with root package name */
    public PQ f30279a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC3450k3 f30280b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30281c;

    static {
        int i = AbstractC3035cL.J;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void a(Q0 q02) {
        this.f30279a = (PQ) q02;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final boolean b(P0 p02) {
        try {
            return g((J0) p02);
        } catch (W4 unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void c(long j9, long j10) {
        AbstractC3450k3 abstractC3450k3 = this.f30280b;
        if (abstractC3450k3 != null) {
            C3236g3 c3236g3 = abstractC3450k3.f32236a;
            C3290h3 c3290h3 = c3236g3.f30943a;
            c3290h3.f31136a = 0;
            c3290h3.f31137b = 0L;
            c3290h3.f31138c = 0;
            c3290h3.f31139d = 0;
            c3290h3.f31140e = 0;
            c3236g3.f30944b.y(0);
            c3236g3.f30945c = -1;
            c3236g3.f30947e = false;
            if (j9 == 0) {
                abstractC3450k3.a(!abstractC3450k3.f32246l);
                return;
            }
            if (abstractC3450k3.f32243h != 0) {
                long j11 = (abstractC3450k3.i * j10) / 1000000;
                abstractC3450k3.f32240e = j11;
                InterfaceC3344i3 interfaceC3344i3 = abstractC3450k3.f32239d;
                String str = AbstractC3548lu.f32613a;
                interfaceC3344i3.b(j11);
                abstractC3450k3.f32243h = 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0178 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0179  */
    @Override // com.google.android.gms.internal.ads.O0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(P0 p02, S0 s02) {
        int i;
        Lr lr;
        byte[] bArr;
        this.f30279a.getClass();
        if (this.f30280b == null) {
            J0 j02 = (J0) p02;
            if (!g(j02)) {
                throw W4.a(null, "Failed to determine bitstream type");
            }
            j02.f25677y = 0;
        }
        if (!this.f30281c) {
            InterfaceC3448k1 x3 = this.f30279a.x(0, 1);
            this.f30279a.v();
            AbstractC3450k3 abstractC3450k3 = this.f30280b;
            abstractC3450k3.f32238c = this.f30279a;
            abstractC3450k3.f32237b = x3;
            abstractC3450k3.a(true);
            this.f30281c = true;
        }
        AbstractC3450k3 abstractC3450k32 = this.f30280b;
        abstractC3450k32.f32237b.getClass();
        String str = AbstractC3548lu.f32613a;
        int i4 = abstractC3450k32.f32243h;
        C3236g3 c3236g3 = abstractC3450k32.f32236a;
        if (i4 != 0) {
            if (i4 == 1) {
                ((J0) p02).b((int) abstractC3450k32.f32241f, false);
                abstractC3450k32.f32243h = 2;
                return 0;
            }
            if (i4 != 2) {
                return -1;
            }
            J0 j03 = (J0) p02;
            long h9 = abstractC3450k32.f32239d.h(j03);
            if (h9 >= 0) {
                s02.f27467n = h9;
                return 1;
            }
            if (h9 < -1) {
                abstractC3450k32.d(-(h9 + 2));
            }
            if (!abstractC3450k32.f32246l) {
                InterfaceC3015c1 mo6i = abstractC3450k32.f32239d.mo6i();
                mo6i.getClass();
                abstractC3450k32.f32238c.w(mo6i);
                InterfaceC3448k1 interfaceC3448k1 = abstractC3450k32.f32237b;
                mo6i.a();
                interfaceC3448k1.getClass();
                abstractC3450k32.f32246l = true;
            }
            if (abstractC3450k32.f32245k <= 0 && !c3236g3.a(j03)) {
                abstractC3450k32.f32243h = 3;
                return -1;
            }
            abstractC3450k32.f32245k = 0L;
            Lr lr2 = c3236g3.f30944b;
            long b9 = abstractC3450k32.b(lr2);
            if (b9 >= 0) {
                long j9 = abstractC3450k32.f32242g;
                if (j9 + b9 >= abstractC3450k32.f32240e) {
                    abstractC3450k32.f32237b.a(lr2.f26235c, lr2);
                    abstractC3450k32.f32237b.b((j9 * 1000000) / abstractC3450k32.i, 1, lr2.f26235c, 0, null);
                    abstractC3450k32.f32240e = -1L;
                }
            }
            abstractC3450k32.f32242g += b9;
            return 0;
        }
        while (true) {
            J0 j04 = (J0) p02;
            if (!c3236g3.a(j04)) {
                abstractC3450k32.f32243h = 3;
                return -1;
            }
            long j10 = j04.f25675w;
            long j11 = abstractC3450k32.f32241f;
            abstractC3450k32.f32245k = j10 - j11;
            C2881Yl c2881Yl = abstractC3450k32.f32244j;
            Lr lr3 = c3236g3.f30944b;
            if (abstractC3450k32.c(lr3, j11, c2881Yl)) {
                abstractC3450k32.f32241f = ((J0) p02).f25675w;
            } else {
                TP tp = (TP) abstractC3450k32.f32244j.f28862u;
                abstractC3450k32.i = tp.f27756I;
                if (!abstractC3450k32.f32247m) {
                    abstractC3450k32.f32237b.e(tp);
                    abstractC3450k32.f32247m = true;
                }
                E2 e22 = (E2) abstractC3450k32.f32244j.f28863v;
                if (e22 != null) {
                    abstractC3450k32.f32239d = e22;
                } else {
                    long j12 = ((J0) p02).f25674v;
                    if (j12 != -1) {
                        C3290h3 c3290h3 = c3236g3.f30943a;
                        boolean z8 = (c3290h3.f31136a & 4) != 0;
                        long j13 = abstractC3450k32.f32241f;
                        int i9 = c3290h3.f31139d + c3290h3.f31140e;
                        long j14 = c3290h3.f31137b;
                        long j15 = i9;
                        i = 2;
                        lr = lr3;
                        abstractC3450k32.f32239d = new C3017c3(abstractC3450k32, j13, j12, j15, j14, z8);
                        abstractC3450k32.f32243h = i;
                        bArr = lr.f26233a;
                        if (bArr.length != 65025) {
                            return 0;
                        }
                        lr.z(lr.f26235c, Arrays.copyOf(bArr, Math.max(65025, lr.f26235c)));
                        return 0;
                    }
                    abstractC3450k32.f32239d = new T2(17);
                }
                i = 2;
                lr = lr3;
                abstractC3450k32.f32243h = i;
                bArr = lr.f26233a;
                if (bArr.length != 65025) {
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void f() {
    }

    public final boolean g(J0 j02) {
        C3290h3 c3290h3 = new C3290h3();
        if (c3290h3.b(j02, true) && (c3290h3.f31136a & 2) == 2) {
            int min = Math.min(c3290h3.f31140e, 8);
            Lr lr = new Lr(min);
            j02.I(lr.f26233a, 0, min, false);
            lr.E(0);
            if (lr.B() >= 5 && lr.K() == 127 && lr.P() == 1179402563) {
                this.f30280b = new C3072d3();
                return true;
            }
            lr.E(0);
            try {
                if (C3686oN.m(1, lr, true)) {
                    this.f30280b = new C3504l3();
                    return true;
                }
            } catch (W4 unused) {
            }
            lr.E(0);
            if (C3396j3.e(lr, C3396j3.f32062o)) {
                this.f30280b = new C3396j3();
                return true;
            }
        }
        return false;
    }
}
