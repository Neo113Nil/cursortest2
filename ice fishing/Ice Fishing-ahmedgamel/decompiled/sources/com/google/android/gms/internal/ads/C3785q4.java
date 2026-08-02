package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.q4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3785q4 implements InterfaceC3407j4 {

    /* renamed from: a, reason: collision with root package name */
    public final C4297ze f33968a;

    /* renamed from: e, reason: collision with root package name */
    public long f33972e;

    /* renamed from: g, reason: collision with root package name */
    public String f33974g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC3566m1 f33975h;
    public C3731p4 i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f33976j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f33978l;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f33973f = new boolean[3];

    /* renamed from: b, reason: collision with root package name */
    public final C4108w4 f33969b = new C4108w4(7);

    /* renamed from: c, reason: collision with root package name */
    public final C4108w4 f33970c = new C4108w4(8);

    /* renamed from: d, reason: collision with root package name */
    public final C4108w4 f33971d = new C4108w4(6);

    /* renamed from: k, reason: collision with root package name */
    public long f33977k = com.anythink.basead.exoplayer.b.f7168b;

    /* renamed from: m, reason: collision with root package name */
    public final Cr f33979m = new Cr();

    public C3785q4(C4297ze c4297ze) {
        this.f33968a = c4297ze;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void a(S0 s02, F4 f42) {
        f42.a();
        f42.b();
        this.f33974g = f42.f25502e;
        f42.b();
        InterfaceC3566m1 C8 = s02.C(f42.f25501d, 2);
        this.f33975h = C8;
        this.i = new C3731p4(C8);
        this.f33968a.k(s02, f42);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Cr cr) {
        C4108w4 c4108w4;
        C4108w4 c4108w42;
        C4108w4 c4108w43;
        int i;
        int i4;
        int i6;
        this.f33975h.getClass();
        String str = AbstractC3182eu.f30782a;
        int i9 = cr.f24998b;
        int i10 = cr.f24999c;
        byte[] bArr = cr.f24997a;
        this.f33972e += cr.B();
        this.f33975h.a(cr.B(), cr);
        while (true) {
            int Q8 = SK.Q(bArr, i9, i10, this.f33973f);
            c4108w4 = this.f33971d;
            c4108w42 = this.f33970c;
            c4108w43 = this.f33969b;
            if (Q8 == i10) {
                break;
            }
            int i11 = bArr[Q8 + 3] & 31;
            if (Q8 > 0) {
                int i12 = Q8 - 1;
                if (bArr[i12] == 0) {
                    i4 = 4;
                    i = i12;
                    i6 = i - i9;
                    if (i6 > 0) {
                        if (!this.f33976j) {
                            c4108w43.h(bArr, i9, i);
                            c4108w42.h(bArr, i9, i);
                        }
                        c4108w4.h(bArr, i9, i);
                    }
                    int i13 = i10 - i;
                    long j6 = this.f33972e - i13;
                    g(j6, this.f33977k, i13, i6 >= 0 ? -i6 : 0);
                    f(i11, j6, this.f33977k);
                    i9 = i + i4;
                }
            }
            i = Q8;
            i4 = 3;
            i6 = i - i9;
            if (i6 > 0) {
            }
            int i132 = i10 - i;
            long j62 = this.f33972e - i132;
            g(j62, this.f33977k, i132, i6 >= 0 ? -i6 : 0);
            f(i11, j62, this.f33977k);
            i9 = i + i4;
        }
        if (!this.f33976j) {
            c4108w43.h(bArr, i9, i10);
            c4108w42.h(bArr, i9, i10);
        }
        c4108w4.h(bArr, i9, i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void c() {
        this.f33972e = 0L;
        this.f33978l = false;
        this.f33977k = com.anythink.basead.exoplayer.b.f7168b;
        SK.S(this.f33973f);
        this.f33969b.e();
        this.f33970c.e();
        this.f33971d.e();
        ((C2749Pl) this.f33968a.f36135w).l(0);
        C3731p4 c3731p4 = this.i;
        if (c3731p4 != null) {
            c3731p4.f33815g = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void d(int i, long j6) {
        this.f33977k = j6;
        int i4 = i & 2;
        this.f33978l = (i4 != 0) | this.f33978l;
    }

    public final void f(int i, long j6, long j9) {
        if (!this.f33976j) {
            this.f33969b.g(i);
            this.f33970c.g(i);
        }
        this.f33971d.g(i);
        C3731p4 c3731p4 = this.i;
        boolean z6 = this.f33978l;
        c3731p4.f33812d = i;
        c3731p4.f33814f = j9;
        c3731p4.f33813e = j6;
        c3731p4.f33818k = z6;
    }

    public final void g(long j6, long j9, int i, int i4) {
        boolean z6 = this.f33976j;
        boolean z9 = true;
        C2749Pl c2749Pl = (C2749Pl) this.f33968a.f36135w;
        if (!z6) {
            C4108w4 c4108w4 = this.f33969b;
            c4108w4.i(i4);
            C4108w4 c4108w42 = this.f33970c;
            c4108w42.i(i4);
            if (this.f33976j) {
                if (c4108w4.f35566d) {
                    C3413jA I8 = SK.I((byte[]) c4108w4.f35568f, 4, c4108w4.f35567e);
                    c2749Pl.j(I8.f31998m);
                    this.i.f33810b.append(I8.f31990d, I8);
                    c4108w4.e();
                } else if (c4108w42.f35566d) {
                    C0 c02 = new C0((byte[]) c4108w42.f35568f, 4, c4108w42.f35567e);
                    int n9 = c02.n();
                    c02.n();
                    c02.e();
                    c02.k();
                    this.i.f33811c.append(n9, new C3609mr(n9));
                    c4108w42.e();
                }
            } else if (c4108w4.f35566d && c4108w42.f35566d) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf((byte[]) c4108w4.f35568f, c4108w4.f35567e));
                arrayList.add(Arrays.copyOf((byte[]) c4108w42.f35568f, c4108w42.f35567e));
                C3413jA I9 = SK.I((byte[]) c4108w4.f35568f, 4, c4108w4.f35567e);
                C0 c03 = new C0((byte[]) c4108w42.f35568f, 4, c4108w42.f35567e);
                int n10 = c03.n();
                c03.n();
                c03.e();
                c03.k();
                C3609mr c3609mr = new C3609mr(n10);
                byte[] bArr = AbstractC4305zm.f36216a;
                String format = String.format("avc1.%02X%02X%02X", Integer.valueOf(I9.f31987a), Integer.valueOf(I9.f31988b), Integer.valueOf(I9.f31989c));
                InterfaceC3566m1 interfaceC3566m1 = this.f33975h;
                C3322hP c3322hP = new C3322hP();
                c3322hP.f31546a = this.f33974g;
                c3322hP.d("video/mp2t");
                c3322hP.e(com.anythink.basead.exoplayer.k.o.f9237h);
                c3322hP.f31554j = format;
                c3322hP.f31565u = I9.f31991e;
                c3322hP.f31566v = I9.f31992f;
                c3322hP.f31536E = new KJ(I9.f31995j, I9.f31996k, I9.f31997l, null, I9.f31994h + 8, I9.i + 8);
                c3322hP.f31533B = I9.f31993g;
                c3322hP.f31561q = arrayList;
                int i6 = I9.f31998m;
                c3322hP.f31560p = i6;
                interfaceC3566m1.e(new DP(c3322hP));
                this.f33976j = true;
                c2749Pl.j(i6);
                this.i.f33810b.append(I9.f31990d, I9);
                this.i.f33811c.append(n10, c3609mr);
                c4108w4.e();
                c4108w42.e();
            }
        }
        C4108w4 c4108w43 = this.f33971d;
        if (c4108w43.i(i4)) {
            int b9 = SK.b(c4108w43.f35567e, (byte[]) c4108w43.f35568f);
            byte[] bArr2 = (byte[]) c4108w43.f35568f;
            Cr cr = this.f33979m;
            cr.z(b9, bArr2);
            cr.E(4);
            c2749Pl.k(j9, cr);
        }
        C3731p4 c3731p4 = this.i;
        boolean z10 = this.f33976j;
        if (c3731p4.f33812d == 9) {
            if (z10 && c3731p4.f33815g) {
                long j10 = c3731p4.f33813e;
                int i9 = i + ((int) (j6 - j10));
                long j11 = c3731p4.i;
                if (j11 != com.anythink.basead.exoplayer.b.f7168b) {
                    long j12 = c3731p4.f33816h;
                    if (j10 != j12) {
                        c3731p4.f33809a.c(j11, c3731p4.f33817j ? 1 : 0, (int) (j10 - j12), i9, null);
                    }
                }
            }
            c3731p4.f33816h = c3731p4.f33813e;
            c3731p4.i = c3731p4.f33814f;
            c3731p4.f33817j = false;
            c3731p4.f33815g = true;
        }
        boolean z11 = c3731p4.f33818k;
        boolean z12 = c3731p4.f33817j;
        int i10 = c3731p4.f33812d;
        if (i10 != 5 && (!z11 || i10 != 1)) {
            z9 = false;
        }
        boolean z13 = z12 | z9;
        c3731p4.f33817j = z13;
        c3731p4.f33812d = 24;
        if (z13) {
            this.f33978l = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void p() {
        this.f33975h.getClass();
        String str = AbstractC3182eu.f30782a;
        ((C2749Pl) this.f33968a.f36135w).l(0);
        g(this.f33972e, this.f33977k, 0, 0);
        f(9, this.f33972e, this.f33977k);
        g(this.f33972e, this.f33977k, 0, 0);
    }
}
