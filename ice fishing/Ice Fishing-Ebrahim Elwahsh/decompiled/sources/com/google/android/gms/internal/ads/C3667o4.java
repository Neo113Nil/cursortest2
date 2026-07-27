package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.o4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3667o4 implements InterfaceC3291h4 {

    /* renamed from: a, reason: collision with root package name */
    public final C4017ue f33088a;

    /* renamed from: e, reason: collision with root package name */
    public long f33092e;

    /* renamed from: g, reason: collision with root package name */
    public String f33094g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC3448k1 f33095h;
    public C3613n4 i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f33096j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f33098l;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f33093f = new boolean[3];

    /* renamed from: b, reason: collision with root package name */
    public final C3990u4 f33089b = new C3990u4(7);

    /* renamed from: c, reason: collision with root package name */
    public final C3990u4 f33090c = new C3990u4(8);

    /* renamed from: d, reason: collision with root package name */
    public final C3990u4 f33091d = new C3990u4(6);

    /* renamed from: k, reason: collision with root package name */
    public long f33097k = com.anythink.basead.exoplayer.b.f6539b;

    /* renamed from: m, reason: collision with root package name */
    public final Lr f33099m = new Lr();

    public C3667o4(C4017ue c4017ue) {
        this.f33088a = c4017ue;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void a() {
        this.f33092e = 0L;
        this.f33098l = false;
        this.f33097k = com.anythink.basead.exoplayer.b.f6539b;
        PA.V(this.f33093f);
        this.f33089b.e();
        this.f33090c.e();
        this.f33091d.e();
        ((C2728Pl) this.f33088a.f34632w).l(0);
        C3613n4 c3613n4 = this.i;
        if (c3613n4 != null) {
            c3613n4.f32826g = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void b(boolean z8) {
        this.f33095h.getClass();
        String str = AbstractC3548lu.f32613a;
        if (z8) {
            ((C2728Pl) this.f33088a.f34632w).l(0);
            g(this.f33092e, this.f33097k, 0, 0);
            f(9, this.f33092e, this.f33097k);
            g(this.f33092e, this.f33097k, 0, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Lr lr) {
        C3990u4 c3990u4;
        C3990u4 c3990u42;
        C3990u4 c3990u43;
        int i;
        int i4;
        int i9;
        this.f33095h.getClass();
        String str = AbstractC3548lu.f32613a;
        int i10 = lr.f26234b;
        int i11 = lr.f26235c;
        byte[] bArr = lr.f26233a;
        this.f33092e += lr.B();
        this.f33095h.a(lr.B(), lr);
        while (true) {
            int R8 = PA.R(bArr, i10, i11, this.f33093f);
            c3990u4 = this.f33091d;
            c3990u42 = this.f33090c;
            c3990u43 = this.f33089b;
            if (R8 == i11) {
                break;
            }
            int i12 = bArr[R8 + 3] & 31;
            if (R8 > 0) {
                int i13 = R8 - 1;
                if (bArr[i13] == 0) {
                    i4 = 4;
                    i = i13;
                    i9 = i - i10;
                    if (i9 > 0) {
                        if (!this.f33096j) {
                            c3990u43.h(bArr, i10, i);
                            c3990u42.h(bArr, i10, i);
                        }
                        c3990u4.h(bArr, i10, i);
                    }
                    int i14 = i11 - i;
                    long j9 = this.f33092e - i14;
                    g(j9, this.f33097k, i14, i9 >= 0 ? -i9 : 0);
                    f(i12, j9, this.f33097k);
                    i10 = i + i4;
                }
            }
            i = R8;
            i4 = 3;
            i9 = i - i10;
            if (i9 > 0) {
            }
            int i142 = i11 - i;
            long j92 = this.f33092e - i142;
            g(j92, this.f33097k, i142, i9 >= 0 ? -i9 : 0);
            f(i12, j92, this.f33097k);
            i10 = i + i4;
        }
        if (!this.f33096j) {
            c3990u43.h(bArr, i10, i11);
            c3990u42.h(bArr, i10, i11);
        }
        c3990u4.h(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void d(int i, long j9) {
        this.f33097k = j9;
        int i4 = i & 2;
        this.f33098l = (i4 != 0) | this.f33098l;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void e(Q0 q02, D4 d42) {
        d42.a();
        d42.b();
        this.f33094g = d42.f24338e;
        d42.b();
        InterfaceC3448k1 x3 = q02.x(d42.f24337d, 2);
        this.f33095h = x3;
        this.i = new C3613n4(x3);
        this.f33088a.l(q02, d42);
    }

    public final void f(int i, long j9, long j10) {
        if (!this.f33096j) {
            this.f33089b.g(i);
            this.f33090c.g(i);
        }
        this.f33091d.g(i);
        C3613n4 c3613n4 = this.i;
        boolean z8 = this.f33098l;
        c3613n4.f32823d = i;
        c3613n4.f32825f = j10;
        c3613n4.f32824e = j9;
        c3613n4.f32829k = z8;
    }

    public final void g(long j9, long j10, int i, int i4) {
        boolean z8 = this.f33096j;
        boolean z9 = true;
        C2728Pl c2728Pl = (C2728Pl) this.f33088a.f34632w;
        if (!z8) {
            C3990u4 c3990u4 = this.f33089b;
            c3990u4.i(i4);
            C3990u4 c3990u42 = this.f33090c;
            c3990u42.i(i4);
            if (this.f33096j) {
                if (c3990u4.f34531d) {
                    C3834rA I2 = PA.I((byte[]) c3990u4.f34533f, 4, c3990u4.f34532e);
                    c2728Pl.j(I2.f33981m);
                    this.i.f32821b.append(I2.f33973d, I2);
                    c3990u4.e();
                } else if (c3990u42.f34531d) {
                    B0 b02 = new B0((byte[]) c3990u42.f34533f, 4, c3990u42.f34532e);
                    int n9 = b02.n();
                    b02.n();
                    b02.f();
                    b02.k();
                    this.i.f32822c.append(n9, new Dr(n9));
                    c3990u42.e();
                }
            } else if (c3990u4.f34531d && c3990u42.f34531d) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf((byte[]) c3990u4.f34533f, c3990u4.f34532e));
                arrayList.add(Arrays.copyOf((byte[]) c3990u42.f34533f, c3990u42.f34532e));
                C3834rA I8 = PA.I((byte[]) c3990u4.f34533f, 4, c3990u4.f34532e);
                B0 b03 = new B0((byte[]) c3990u42.f34533f, 4, c3990u42.f34532e);
                int n10 = b03.n();
                b03.n();
                b03.f();
                b03.k();
                Dr dr = new Dr(n10);
                byte[] bArr = AbstractC4295zm.f35602a;
                String format = String.format("avc1.%02X%02X%02X", Integer.valueOf(I8.f33970a), Integer.valueOf(I8.f33971b), Integer.valueOf(I8.f33972c));
                InterfaceC3448k1 interfaceC3448k1 = this.f33095h;
                C4065vP c4065vP = new C4065vP();
                c4065vP.f34773a = this.f33094g;
                c4065vP.d("video/mp2t");
                c4065vP.e(com.anythink.basead.exoplayer.k.o.f8608h);
                c4065vP.f34781j = format;
                c4065vP.f34792u = I8.f33974e;
                c4065vP.f34793v = I8.f33975f;
                c4065vP.f34763D = new C2980bK(I8.f33978j, I8.f33979k, I8.f33980l, null, I8.f33977h + 8, I8.i + 8);
                c4065vP.f34760A = I8.f33976g;
                c4065vP.f34788q = arrayList;
                int i9 = I8.f33981m;
                c4065vP.f34787p = i9;
                interfaceC3448k1.e(new TP(c4065vP));
                this.f33096j = true;
                c2728Pl.j(i9);
                this.i.f32821b.append(I8.f33973d, I8);
                this.i.f32822c.append(n10, dr);
                c3990u4.e();
                c3990u42.e();
            }
        }
        C3990u4 c3990u43 = this.f33091d;
        if (c3990u43.i(i4)) {
            int f6 = PA.f(c3990u43.f34532e, (byte[]) c3990u43.f34533f);
            byte[] bArr2 = (byte[]) c3990u43.f34533f;
            Lr lr = this.f33099m;
            lr.z(f6, bArr2);
            lr.E(4);
            c2728Pl.k(j10, lr);
        }
        C3613n4 c3613n4 = this.i;
        boolean z10 = this.f33096j;
        if (c3613n4.f32823d == 9) {
            if (z10 && c3613n4.f32826g) {
                long j11 = c3613n4.f32824e;
                int i10 = i + ((int) (j9 - j11));
                long j12 = c3613n4.i;
                if (j12 != com.anythink.basead.exoplayer.b.f6539b) {
                    long j13 = c3613n4.f32827h;
                    if (j11 != j13) {
                        c3613n4.f32820a.b(j12, c3613n4.f32828j ? 1 : 0, (int) (j11 - j13), i10, null);
                    }
                }
            }
            c3613n4.f32827h = c3613n4.f32824e;
            c3613n4.i = c3613n4.f32825f;
            c3613n4.f32828j = false;
            c3613n4.f32826g = true;
        }
        boolean z11 = c3613n4.f32829k;
        boolean z12 = c3613n4.f32828j;
        int i11 = c3613n4.f32823d;
        if (i11 != 5 && (!z11 || i11 != 1)) {
            z9 = false;
        }
        boolean z13 = z12 | z9;
        c3613n4.f32828j = z13;
        c3613n4.f32823d = 24;
        if (z13) {
            this.f33098l = false;
        }
    }
}
