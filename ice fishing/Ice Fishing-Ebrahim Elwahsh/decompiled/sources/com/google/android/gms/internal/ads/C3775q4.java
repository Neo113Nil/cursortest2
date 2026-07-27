package com.google.android.gms.internal.ads;

import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.q4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3775q4 implements InterfaceC3291h4 {

    /* renamed from: a, reason: collision with root package name */
    public final C4017ue f33631a;

    /* renamed from: b, reason: collision with root package name */
    public String f33632b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC3448k1 f33633c;

    /* renamed from: d, reason: collision with root package name */
    public C3721p4 f33634d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f33635e;

    /* renamed from: l, reason: collision with root package name */
    public long f33641l;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f33636f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    public final C3990u4 f33637g = new C3990u4(32);

    /* renamed from: h, reason: collision with root package name */
    public final C3990u4 f33638h = new C3990u4(33);
    public final C3990u4 i = new C3990u4(34);

    /* renamed from: j, reason: collision with root package name */
    public final C3990u4 f33639j = new C3990u4(39);

    /* renamed from: k, reason: collision with root package name */
    public final C3990u4 f33640k = new C3990u4(40);

    /* renamed from: m, reason: collision with root package name */
    public long f33642m = com.anythink.basead.exoplayer.b.f6539b;

    /* renamed from: n, reason: collision with root package name */
    public final Lr f33643n = new Lr();

    public C3775q4(C4017ue c4017ue) {
        this.f33631a = c4017ue;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void a() {
        this.f33641l = 0L;
        this.f33642m = com.anythink.basead.exoplayer.b.f6539b;
        PA.V(this.f33636f);
        this.f33637g.e();
        this.f33638h.e();
        this.i.e();
        this.f33639j.e();
        this.f33640k.e();
        ((C2728Pl) this.f33631a.f34632w).l(0);
        C3721p4 c3721p4 = this.f33634d;
        if (c3721p4 != null) {
            c3721p4.f33322f = false;
            c3721p4.f33323g = false;
            c3721p4.f33324h = false;
            c3721p4.i = false;
            c3721p4.f33325j = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void b(boolean z8) {
        this.f33633c.getClass();
        String str = AbstractC3548lu.f32613a;
        if (z8) {
            ((C2728Pl) this.f33631a.f34632w).l(0);
            h(this.f33641l, this.f33642m, 0, 0);
            f(this.f33641l, this.f33642m, 0, 48);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Lr lr) {
        int i;
        int i4;
        int i9;
        int i10 = 3;
        this.f33633c.getClass();
        String str = AbstractC3548lu.f32613a;
        while (lr.B() > 0) {
            int i11 = lr.f26234b;
            int i12 = lr.f26235c;
            byte[] bArr = lr.f26233a;
            this.f33641l += lr.B();
            this.f33633c.a(lr.B(), lr);
            while (i11 < i12) {
                int R8 = PA.R(bArr, i11, i12, this.f33636f);
                if (R8 == i12) {
                    g(bArr, i11, i12);
                    return;
                }
                int i13 = bArr[R8 + 3] & 126;
                if (R8 > 0) {
                    int i14 = R8 - 1;
                    if (bArr[i14] == 0) {
                        i4 = 4;
                        i = i14;
                        i9 = i - i11;
                        if (i9 > 0) {
                            g(bArr, i11, i);
                        }
                        int i15 = i12 - i;
                        int i16 = i12;
                        long j9 = this.f33641l - i15;
                        h(j9, this.f33642m, i15, i9 >= 0 ? -i9 : 0);
                        f(j9, this.f33642m, i15, i13 >> 1);
                        i11 = i + i4;
                        i12 = i16;
                        i10 = 3;
                    }
                }
                i = R8;
                i4 = i10;
                i9 = i - i11;
                if (i9 > 0) {
                }
                int i152 = i12 - i;
                int i162 = i12;
                long j92 = this.f33641l - i152;
                h(j92, this.f33642m, i152, i9 >= 0 ? -i9 : 0);
                f(j92, this.f33642m, i152, i13 >> 1);
                i11 = i + i4;
                i12 = i162;
                i10 = 3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void d(int i, long j9) {
        this.f33642m = j9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void e(Q0 q02, D4 d42) {
        d42.a();
        d42.b();
        this.f33632b = d42.f24338e;
        d42.b();
        InterfaceC3448k1 x3 = q02.x(d42.f24337d, 2);
        this.f33633c = x3;
        this.f33634d = new C3721p4(x3);
        this.f33631a.l(q02, d42);
    }

    public final void f(long j9, long j10, int i, int i4) {
        C3721p4 c3721p4 = this.f33634d;
        boolean z8 = this.f33635e;
        c3721p4.f33323g = false;
        c3721p4.f33324h = false;
        c3721p4.f33321e = j10;
        c3721p4.f33320d = 0;
        c3721p4.f33318b = j9;
        if (i4 >= 32 && i4 != 40) {
            if (c3721p4.i && !c3721p4.f33325j) {
                if (z8) {
                    c3721p4.a(i);
                }
                c3721p4.i = false;
            }
            if (i4 <= 35 || i4 == 39) {
                c3721p4.f33324h = !c3721p4.f33325j;
                c3721p4.f33325j = true;
            }
        }
        boolean z9 = i4 >= 16 && i4 <= 21;
        c3721p4.f33319c = z9;
        c3721p4.f33322f = z9 || i4 <= 9;
        if (!this.f33635e) {
            this.f33637g.g(i4);
            this.f33638h.g(i4);
            this.i.g(i4);
        }
        this.f33639j.g(i4);
        this.f33640k.g(i4);
    }

    public final void g(byte[] bArr, int i, int i4) {
        C3721p4 c3721p4 = this.f33634d;
        if (c3721p4.f33322f) {
            int i9 = c3721p4.f33320d;
            int i10 = (i + 2) - i9;
            if (i10 < i4) {
                c3721p4.f33323g = (bArr[i10] & com.anythink.core.common.s.a.c.f16474a) != 0;
                c3721p4.f33322f = false;
            } else {
                c3721p4.f33320d = (i4 - i) + i9;
            }
        }
        if (!this.f33635e) {
            this.f33637g.h(bArr, i, i4);
            this.f33638h.h(bArr, i, i4);
            this.i.h(bArr, i, i4);
        }
        this.f33639j.h(bArr, i, i4);
        this.f33640k.h(bArr, i, i4);
    }

    public final void h(long j9, long j10, int i, int i4) {
        C3721p4 c3721p4 = this.f33634d;
        boolean z8 = this.f33635e;
        if (c3721p4.f33325j && c3721p4.f33323g) {
            c3721p4.f33328m = c3721p4.f33319c;
            c3721p4.f33325j = false;
        } else if (c3721p4.f33324h || c3721p4.f33323g) {
            if (z8 && c3721p4.i) {
                c3721p4.a(i + ((int) (j9 - c3721p4.f33318b)));
            }
            c3721p4.f33326k = c3721p4.f33318b;
            c3721p4.f33327l = c3721p4.f33321e;
            c3721p4.f33328m = c3721p4.f33319c;
            c3721p4.i = true;
        }
        boolean z9 = this.f33635e;
        C2728Pl c2728Pl = (C2728Pl) this.f33631a.f34632w;
        if (!z9) {
            C3990u4 c3990u4 = this.f33637g;
            c3990u4.i(i4);
            C3990u4 c3990u42 = this.f33638h;
            c3990u42.i(i4);
            C3990u4 c3990u43 = this.i;
            c3990u43.i(i4);
            if (c3990u4.f34531d && c3990u42.f34531d && c3990u43.f34531d) {
                String str = this.f33632b;
                int i9 = c3990u4.f34532e;
                byte[] bArr = new byte[c3990u42.f34532e + i9 + c3990u43.f34532e];
                System.arraycopy((byte[]) c3990u4.f34533f, 0, bArr, 0, i9);
                System.arraycopy((byte[]) c3990u42.f34533f, 0, bArr, c3990u4.f34532e, c3990u42.f34532e);
                System.arraycopy((byte[]) c3990u43.f34533f, 0, bArr, c3990u4.f34532e + c3990u42.f34532e, c3990u43.f34532e);
                Fz O8 = PA.O((byte[]) c3990u42.f34533f, 3, c3990u42.f34532e, null);
                Ky ky = O8.f25067b;
                String a9 = ky != null ? AbstractC4295zm.a(ky.f26069a, ky.f26070b, ky.f26071c, ky.f26072d, ky.f26073e, ky.f26074f) : null;
                C4065vP c4065vP = new C4065vP();
                c4065vP.f34773a = str;
                c4065vP.d("video/mp2t");
                c4065vP.e(com.anythink.basead.exoplayer.k.o.i);
                c4065vP.f34781j = a9;
                c4065vP.f34792u = O8.f25070e;
                c4065vP.f34793v = O8.f25071f;
                c4065vP.f34794w = O8.f25072g;
                c4065vP.f34795x = O8.f25073h;
                c4065vP.f34763D = new C2980bK(O8.f25075k, O8.f25076l, O8.f25077m, null, O8.f25068c + 8, O8.f25069d + 8);
                c4065vP.f34760A = O8.i;
                c4065vP.f34787p = O8.f25074j;
                c4065vP.f34764E = O8.f25066a + 1;
                c4065vP.f34788q = Collections.singletonList(bArr);
                TP tp = new TP(c4065vP);
                this.f33633c.e(tp);
                int i10 = tp.f27778q;
                PA.T(i10 != -1);
                c2728Pl.j(i10);
                this.f33635e = true;
            }
        }
        C3990u4 c3990u44 = this.f33639j;
        boolean i11 = c3990u44.i(i4);
        Lr lr = this.f33643n;
        if (i11) {
            lr.z(PA.f(c3990u44.f34532e, (byte[]) c3990u44.f34533f), (byte[]) c3990u44.f34533f);
            lr.G(5);
            c2728Pl.k(j10, lr);
        }
        C3990u4 c3990u45 = this.f33640k;
        if (c3990u45.i(i4)) {
            lr.z(PA.f(c3990u45.f34532e, (byte[]) c3990u45.f34533f), (byte[]) c3990u45.f34533f);
            lr.G(5);
            c2728Pl.k(j10, lr);
        }
    }
}
