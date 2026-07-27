package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.q4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3762q4 implements InterfaceC3384j4 {

    /* renamed from: a, reason: collision with root package name */
    public final C4274ze f33184a;

    /* renamed from: e, reason: collision with root package name */
    public long f33188e;

    /* renamed from: g, reason: collision with root package name */
    public String f33190g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC3543m1 f33191h;
    public C3708p4 i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f33192j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f33194l;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f33189f = new boolean[3];

    /* renamed from: b, reason: collision with root package name */
    public final C4085w4 f33185b = new C4085w4(7);

    /* renamed from: c, reason: collision with root package name */
    public final C4085w4 f33186c = new C4085w4(8);

    /* renamed from: d, reason: collision with root package name */
    public final C4085w4 f33187d = new C4085w4(6);

    /* renamed from: k, reason: collision with root package name */
    public long f33193k = com.anythink.basead.exoplayer.b.f6382b;

    /* renamed from: m, reason: collision with root package name */
    public final Cr f33195m = new Cr();

    public C3762q4(C4274ze c4274ze) {
        this.f33184a = c4274ze;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void a(S0 s02, F4 f42) {
        f42.a();
        f42.b();
        this.f33190g = f42.f24746e;
        f42.b();
        InterfaceC3543m1 C8 = s02.C(f42.f24745d, 2);
        this.f33191h = C8;
        this.i = new C3708p4(C8);
        this.f33184a.k(s02, f42);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Cr cr) {
        C4085w4 c4085w4;
        C4085w4 c4085w42;
        C4085w4 c4085w43;
        int i;
        int i6;
        int i9;
        this.f33191h.getClass();
        String str = AbstractC3159eu.f29993a;
        int i10 = cr.f24253b;
        int i11 = cr.f24254c;
        byte[] bArr = cr.f24252a;
        this.f33188e += cr.B();
        this.f33191h.a(cr.B(), cr);
        while (true) {
            int Q8 = SK.Q(bArr, i10, i11, this.f33189f);
            c4085w4 = this.f33187d;
            c4085w42 = this.f33186c;
            c4085w43 = this.f33185b;
            if (Q8 == i11) {
                break;
            }
            int i12 = bArr[Q8 + 3] & 31;
            if (Q8 > 0) {
                int i13 = Q8 - 1;
                if (bArr[i13] == 0) {
                    i6 = 4;
                    i = i13;
                    i9 = i - i10;
                    if (i9 > 0) {
                        if (!this.f33192j) {
                            c4085w43.h(bArr, i10, i);
                            c4085w42.h(bArr, i10, i);
                        }
                        c4085w4.h(bArr, i10, i);
                    }
                    int i14 = i11 - i;
                    long j6 = this.f33188e - i14;
                    g(j6, this.f33193k, i14, i9 >= 0 ? -i9 : 0);
                    f(i12, j6, this.f33193k);
                    i10 = i + i6;
                }
            }
            i = Q8;
            i6 = 3;
            i9 = i - i10;
            if (i9 > 0) {
            }
            int i142 = i11 - i;
            long j62 = this.f33188e - i142;
            g(j62, this.f33193k, i142, i9 >= 0 ? -i9 : 0);
            f(i12, j62, this.f33193k);
            i10 = i + i6;
        }
        if (!this.f33192j) {
            c4085w43.h(bArr, i10, i11);
            c4085w42.h(bArr, i10, i11);
        }
        c4085w4.h(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void c() {
        this.f33188e = 0L;
        this.f33194l = false;
        this.f33193k = com.anythink.basead.exoplayer.b.f6382b;
        SK.S(this.f33189f);
        this.f33185b.e();
        this.f33186c.e();
        this.f33187d.e();
        ((C2712Ol) this.f33184a.f35362w).l(0);
        C3708p4 c3708p4 = this.i;
        if (c3708p4 != null) {
            c3708p4.f33025g = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void d(int i, long j6) {
        this.f33193k = j6;
        int i6 = i & 2;
        this.f33194l = (i6 != 0) | this.f33194l;
    }

    public final void f(int i, long j6, long j9) {
        if (!this.f33192j) {
            this.f33185b.g(i);
            this.f33186c.g(i);
        }
        this.f33187d.g(i);
        C3708p4 c3708p4 = this.i;
        boolean z3 = this.f33194l;
        c3708p4.f33022d = i;
        c3708p4.f33024f = j9;
        c3708p4.f33023e = j6;
        c3708p4.f33028k = z3;
    }

    public final void g(long j6, long j9, int i, int i6) {
        boolean z3 = this.f33192j;
        boolean z6 = true;
        C2712Ol c2712Ol = (C2712Ol) this.f33184a.f35362w;
        if (!z3) {
            C4085w4 c4085w4 = this.f33185b;
            c4085w4.i(i6);
            C4085w4 c4085w42 = this.f33186c;
            c4085w42.i(i6);
            if (this.f33192j) {
                if (c4085w4.f34797d) {
                    C3390jA I8 = SK.I((byte[]) c4085w4.f34799f, 4, c4085w4.f34798e);
                    c2712Ol.j(I8.f31211m);
                    this.i.f33020b.append(I8.f31203d, I8);
                    c4085w4.e();
                } else if (c4085w42.f34797d) {
                    C0 c02 = new C0((byte[]) c4085w42.f34799f, 4, c4085w42.f34798e);
                    int n9 = c02.n();
                    c02.n();
                    c02.e();
                    c02.k();
                    this.i.f33021c.append(n9, new C3586mr(n9));
                    c4085w42.e();
                }
            } else if (c4085w4.f34797d && c4085w42.f34797d) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf((byte[]) c4085w4.f34799f, c4085w4.f34798e));
                arrayList.add(Arrays.copyOf((byte[]) c4085w42.f34799f, c4085w42.f34798e));
                C3390jA I9 = SK.I((byte[]) c4085w4.f34799f, 4, c4085w4.f34798e);
                C0 c03 = new C0((byte[]) c4085w42.f34799f, 4, c4085w42.f34798e);
                int n10 = c03.n();
                c03.n();
                c03.e();
                c03.k();
                C3586mr c3586mr = new C3586mr(n10);
                byte[] bArr = AbstractC4228ym.f35218a;
                String format = String.format("avc1.%02X%02X%02X", Integer.valueOf(I9.f31200a), Integer.valueOf(I9.f31201b), Integer.valueOf(I9.f31202c));
                InterfaceC3543m1 interfaceC3543m1 = this.f33191h;
                C3299hP c3299hP = new C3299hP();
                c3299hP.f30780a = this.f33190g;
                c3299hP.d("video/mp2t");
                c3299hP.e(com.anythink.basead.exoplayer.k.o.f8451h);
                c3299hP.f30788j = format;
                c3299hP.f30799u = I9.f31204e;
                c3299hP.f30800v = I9.f31205f;
                c3299hP.f30770E = new KJ(I9.f31208j, I9.f31209k, I9.f31210l, null, I9.f31207h + 8, I9.i + 8);
                c3299hP.f30767B = I9.f31206g;
                c3299hP.f30795q = arrayList;
                int i9 = I9.f31211m;
                c3299hP.f30794p = i9;
                interfaceC3543m1.e(new DP(c3299hP));
                this.f33192j = true;
                c2712Ol.j(i9);
                this.i.f33020b.append(I9.f31203d, I9);
                this.i.f33021c.append(n10, c3586mr);
                c4085w4.e();
                c4085w42.e();
            }
        }
        C4085w4 c4085w43 = this.f33187d;
        if (c4085w43.i(i6)) {
            int b9 = SK.b(c4085w43.f34798e, (byte[]) c4085w43.f34799f);
            byte[] bArr2 = (byte[]) c4085w43.f34799f;
            Cr cr = this.f33195m;
            cr.z(b9, bArr2);
            cr.E(4);
            c2712Ol.k(j9, cr);
        }
        C3708p4 c3708p4 = this.i;
        boolean z9 = this.f33192j;
        if (c3708p4.f33022d == 9) {
            if (z9 && c3708p4.f33025g) {
                long j10 = c3708p4.f33023e;
                int i10 = i + ((int) (j6 - j10));
                long j11 = c3708p4.i;
                if (j11 != com.anythink.basead.exoplayer.b.f6382b) {
                    long j12 = c3708p4.f33026h;
                    if (j10 != j12) {
                        c3708p4.f33019a.c(j11, c3708p4.f33027j ? 1 : 0, (int) (j10 - j12), i10, null);
                    }
                }
            }
            c3708p4.f33026h = c3708p4.f33023e;
            c3708p4.i = c3708p4.f33024f;
            c3708p4.f33027j = false;
            c3708p4.f33025g = true;
        }
        boolean z10 = c3708p4.f33028k;
        boolean z11 = c3708p4.f33027j;
        int i11 = c3708p4.f33022d;
        if (i11 != 5 && (!z10 || i11 != 1)) {
            z6 = false;
        }
        boolean z12 = z11 | z6;
        c3708p4.f33027j = z12;
        c3708p4.f33022d = 24;
        if (z12) {
            this.f33194l = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void p() {
        this.f33191h.getClass();
        String str = AbstractC3159eu.f29993a;
        ((C2712Ol) this.f33184a.f35362w).l(0);
        g(this.f33188e, this.f33193k, 0, 0);
        f(9, this.f33188e, this.f33193k);
        g(this.f33188e, this.f33193k, 0, 0);
    }
}
