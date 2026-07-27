package com.google.android.gms.internal.ads;

import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.s4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3869s4 implements InterfaceC3384j4 {

    /* renamed from: a, reason: collision with root package name */
    public final C4274ze f33876a;

    /* renamed from: b, reason: collision with root package name */
    public String f33877b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC3543m1 f33878c;

    /* renamed from: d, reason: collision with root package name */
    public C3815r4 f33879d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f33880e;

    /* renamed from: l, reason: collision with root package name */
    public long f33886l;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f33881f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    public final C4085w4 f33882g = new C4085w4(32);

    /* renamed from: h, reason: collision with root package name */
    public final C4085w4 f33883h = new C4085w4(33);
    public final C4085w4 i = new C4085w4(34);

    /* renamed from: j, reason: collision with root package name */
    public final C4085w4 f33884j = new C4085w4(39);

    /* renamed from: k, reason: collision with root package name */
    public final C4085w4 f33885k = new C4085w4(40);

    /* renamed from: m, reason: collision with root package name */
    public long f33887m = com.anythink.basead.exoplayer.b.f6382b;

    /* renamed from: n, reason: collision with root package name */
    public final Cr f33888n = new Cr();

    public C3869s4(C4274ze c4274ze) {
        this.f33876a = c4274ze;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void a(S0 s02, F4 f42) {
        f42.a();
        f42.b();
        this.f33877b = f42.f24746e;
        f42.b();
        InterfaceC3543m1 C8 = s02.C(f42.f24745d, 2);
        this.f33878c = C8;
        this.f33879d = new C3815r4(C8);
        this.f33876a.k(s02, f42);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Cr cr) {
        int i;
        int i6;
        int i9;
        int i10 = 3;
        this.f33878c.getClass();
        String str = AbstractC3159eu.f29993a;
        while (cr.B() > 0) {
            int i11 = cr.f24253b;
            int i12 = cr.f24254c;
            byte[] bArr = cr.f24252a;
            this.f33886l += cr.B();
            this.f33878c.a(cr.B(), cr);
            while (i11 < i12) {
                int Q8 = SK.Q(bArr, i11, i12, this.f33881f);
                if (Q8 == i12) {
                    g(bArr, i11, i12);
                    return;
                }
                int i13 = bArr[Q8 + 3] & 126;
                if (Q8 > 0) {
                    int i14 = Q8 - 1;
                    if (bArr[i14] == 0) {
                        i6 = 4;
                        i = i14;
                        i9 = i - i11;
                        if (i9 > 0) {
                            g(bArr, i11, i);
                        }
                        int i15 = i12 - i;
                        int i16 = i12;
                        long j6 = this.f33886l - i15;
                        h(j6, this.f33887m, i15, i9 >= 0 ? -i9 : 0);
                        f(j6, this.f33887m, i15, i13 >> 1);
                        i11 = i + i6;
                        i12 = i16;
                        i10 = 3;
                    }
                }
                i = Q8;
                i6 = i10;
                i9 = i - i11;
                if (i9 > 0) {
                }
                int i152 = i12 - i;
                int i162 = i12;
                long j62 = this.f33886l - i152;
                h(j62, this.f33887m, i152, i9 >= 0 ? -i9 : 0);
                f(j62, this.f33887m, i152, i13 >> 1);
                i11 = i + i6;
                i12 = i162;
                i10 = 3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void c() {
        this.f33886l = 0L;
        this.f33887m = com.anythink.basead.exoplayer.b.f6382b;
        SK.S(this.f33881f);
        this.f33882g.e();
        this.f33883h.e();
        this.i.e();
        this.f33884j.e();
        this.f33885k.e();
        ((C2712Ol) this.f33876a.f35362w).l(0);
        C3815r4 c3815r4 = this.f33879d;
        if (c3815r4 != null) {
            c3815r4.f33514f = false;
            c3815r4.f33515g = false;
            c3815r4.f33516h = false;
            c3815r4.i = false;
            c3815r4.f33517j = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void d(int i, long j6) {
        this.f33887m = j6;
    }

    public final void f(long j6, long j9, int i, int i6) {
        C3815r4 c3815r4 = this.f33879d;
        boolean z3 = this.f33880e;
        c3815r4.f33515g = false;
        c3815r4.f33516h = false;
        c3815r4.f33513e = j9;
        c3815r4.f33512d = 0;
        c3815r4.f33510b = j6;
        if (i6 >= 32 && i6 != 40) {
            if (c3815r4.i && !c3815r4.f33517j) {
                if (z3) {
                    c3815r4.a(i);
                }
                c3815r4.i = false;
            }
            if (i6 <= 35 || i6 == 39) {
                c3815r4.f33516h = !c3815r4.f33517j;
                c3815r4.f33517j = true;
            }
        }
        boolean z6 = i6 >= 16 && i6 <= 21;
        c3815r4.f33511c = z6;
        c3815r4.f33514f = z6 || i6 <= 9;
        if (!this.f33880e) {
            this.f33882g.g(i6);
            this.f33883h.g(i6);
            this.i.g(i6);
        }
        this.f33884j.g(i6);
        this.f33885k.g(i6);
    }

    public final void g(byte[] bArr, int i, int i6) {
        C3815r4 c3815r4 = this.f33879d;
        if (c3815r4.f33514f) {
            int i9 = c3815r4.f33512d;
            int i10 = (i + 2) - i9;
            if (i10 < i6) {
                c3815r4.f33515g = (bArr[i10] & com.anythink.core.common.s.a.c.f16316a) != 0;
                c3815r4.f33514f = false;
            } else {
                c3815r4.f33512d = (i6 - i) + i9;
            }
        }
        if (!this.f33880e) {
            this.f33882g.h(bArr, i, i6);
            this.f33883h.h(bArr, i, i6);
            this.i.h(bArr, i, i6);
        }
        this.f33884j.h(bArr, i, i6);
        this.f33885k.h(bArr, i, i6);
    }

    public final void h(long j6, long j9, int i, int i6) {
        C3815r4 c3815r4 = this.f33879d;
        boolean z3 = this.f33880e;
        if (c3815r4.f33517j && c3815r4.f33515g) {
            c3815r4.f33520m = c3815r4.f33511c;
            c3815r4.f33517j = false;
        } else if (c3815r4.f33516h || c3815r4.f33515g) {
            if (z3 && c3815r4.i) {
                c3815r4.a(i + ((int) (j6 - c3815r4.f33510b)));
            }
            c3815r4.f33518k = c3815r4.f33510b;
            c3815r4.f33519l = c3815r4.f33513e;
            c3815r4.f33520m = c3815r4.f33511c;
            c3815r4.i = true;
        }
        boolean z6 = this.f33880e;
        C2712Ol c2712Ol = (C2712Ol) this.f33876a.f35362w;
        if (!z6) {
            C4085w4 c4085w4 = this.f33882g;
            c4085w4.i(i6);
            C4085w4 c4085w42 = this.f33883h;
            c4085w42.i(i6);
            C4085w4 c4085w43 = this.i;
            c4085w43.i(i6);
            if (c4085w4.f34797d && c4085w42.f34797d && c4085w43.f34797d) {
                String str = this.f33877b;
                int i9 = c4085w4.f34798e;
                byte[] bArr = new byte[c4085w42.f34798e + i9 + c4085w43.f34798e];
                System.arraycopy((byte[]) c4085w4.f34799f, 0, bArr, 0, i9);
                System.arraycopy((byte[]) c4085w42.f34799f, 0, bArr, c4085w4.f34798e, c4085w42.f34798e);
                System.arraycopy((byte[]) c4085w43.f34799f, 0, bArr, c4085w4.f34798e + c4085w42.f34798e, c4085w43.f34798e);
                C3971tz O8 = SK.O((byte[]) c4085w42.f34799f, 3, c4085w42.f34798e, null);
                C4132wy c4132wy = O8.f34434b;
                String a9 = c4132wy != null ? AbstractC4228ym.a(c4132wy.f34910a, c4132wy.f34911b, c4132wy.f34912c, c4132wy.f34913d, c4132wy.f34914e, c4132wy.f34915f) : null;
                C3299hP c3299hP = new C3299hP();
                c3299hP.f30780a = str;
                c3299hP.d("video/mp2t");
                c3299hP.e(com.anythink.basead.exoplayer.k.o.i);
                c3299hP.f30788j = a9;
                c3299hP.f30799u = O8.f34437e;
                c3299hP.f30800v = O8.f34438f;
                c3299hP.f30801w = O8.f34439g;
                c3299hP.f30802x = O8.f34440h;
                c3299hP.f30770E = new KJ(O8.f34442k, O8.f34443l, O8.f34444m, null, O8.f34435c + 8, O8.f34436d + 8);
                c3299hP.f30767B = O8.i;
                c3299hP.f30794p = O8.f34441j;
                c3299hP.f30771F = O8.f34433a + 1;
                c3299hP.f30795q = Collections.singletonList(bArr);
                DP dp = new DP(c3299hP);
                this.f33878c.e(dp);
                int i10 = dp.f24433q;
                AbstractC2772Sd.H(i10 != -1);
                c2712Ol.j(i10);
                this.f33880e = true;
            }
        }
        C4085w4 c4085w44 = this.f33884j;
        boolean i11 = c4085w44.i(i6);
        Cr cr = this.f33888n;
        if (i11) {
            cr.z(SK.b(c4085w44.f34798e, (byte[]) c4085w44.f34799f), (byte[]) c4085w44.f34799f);
            cr.G(5);
            c2712Ol.k(j9, cr);
        }
        C4085w4 c4085w45 = this.f33885k;
        if (c4085w45.i(i6)) {
            cr.z(SK.b(c4085w45.f34798e, (byte[]) c4085w45.f34799f), (byte[]) c4085w45.f34799f);
            cr.G(5);
            c2712Ol.k(j9, cr);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void p() {
        this.f33878c.getClass();
        String str = AbstractC3159eu.f29993a;
        ((C2712Ol) this.f33876a.f35362w).l(0);
        h(this.f33886l, this.f33887m, 0, 0);
        f(this.f33886l, this.f33887m, 0, 48);
    }
}
