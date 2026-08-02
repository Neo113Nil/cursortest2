package com.google.android.gms.internal.ads;

import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.s4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3892s4 implements InterfaceC3407j4 {

    /* renamed from: a, reason: collision with root package name */
    public final C4297ze f34644a;

    /* renamed from: b, reason: collision with root package name */
    public String f34645b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC3566m1 f34646c;

    /* renamed from: d, reason: collision with root package name */
    public C3838r4 f34647d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f34648e;

    /* renamed from: l, reason: collision with root package name */
    public long f34654l;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f34649f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    public final C4108w4 f34650g = new C4108w4(32);

    /* renamed from: h, reason: collision with root package name */
    public final C4108w4 f34651h = new C4108w4(33);
    public final C4108w4 i = new C4108w4(34);

    /* renamed from: j, reason: collision with root package name */
    public final C4108w4 f34652j = new C4108w4(39);

    /* renamed from: k, reason: collision with root package name */
    public final C4108w4 f34653k = new C4108w4(40);

    /* renamed from: m, reason: collision with root package name */
    public long f34655m = com.anythink.basead.exoplayer.b.f7168b;

    /* renamed from: n, reason: collision with root package name */
    public final Cr f34656n = new Cr();

    public C3892s4(C4297ze c4297ze) {
        this.f34644a = c4297ze;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void a(S0 s02, F4 f42) {
        f42.a();
        f42.b();
        this.f34645b = f42.f25502e;
        f42.b();
        InterfaceC3566m1 C8 = s02.C(f42.f25501d, 2);
        this.f34646c = C8;
        this.f34647d = new C3838r4(C8);
        this.f34644a.k(s02, f42);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Cr cr) {
        int i;
        int i4;
        int i6;
        int i9 = 3;
        this.f34646c.getClass();
        String str = AbstractC3182eu.f30782a;
        while (cr.B() > 0) {
            int i10 = cr.f24998b;
            int i11 = cr.f24999c;
            byte[] bArr = cr.f24997a;
            this.f34654l += cr.B();
            this.f34646c.a(cr.B(), cr);
            while (i10 < i11) {
                int Q8 = SK.Q(bArr, i10, i11, this.f34649f);
                if (Q8 == i11) {
                    g(bArr, i10, i11);
                    return;
                }
                int i12 = bArr[Q8 + 3] & 126;
                if (Q8 > 0) {
                    int i13 = Q8 - 1;
                    if (bArr[i13] == 0) {
                        i4 = 4;
                        i = i13;
                        i6 = i - i10;
                        if (i6 > 0) {
                            g(bArr, i10, i);
                        }
                        int i14 = i11 - i;
                        int i15 = i11;
                        long j6 = this.f34654l - i14;
                        h(j6, this.f34655m, i14, i6 >= 0 ? -i6 : 0);
                        f(j6, this.f34655m, i14, i12 >> 1);
                        i10 = i + i4;
                        i11 = i15;
                        i9 = 3;
                    }
                }
                i = Q8;
                i4 = i9;
                i6 = i - i10;
                if (i6 > 0) {
                }
                int i142 = i11 - i;
                int i152 = i11;
                long j62 = this.f34654l - i142;
                h(j62, this.f34655m, i142, i6 >= 0 ? -i6 : 0);
                f(j62, this.f34655m, i142, i12 >> 1);
                i10 = i + i4;
                i11 = i152;
                i9 = 3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void c() {
        this.f34654l = 0L;
        this.f34655m = com.anythink.basead.exoplayer.b.f7168b;
        SK.S(this.f34649f);
        this.f34650g.e();
        this.f34651h.e();
        this.i.e();
        this.f34652j.e();
        this.f34653k.e();
        ((C2749Pl) this.f34644a.f36135w).l(0);
        C3838r4 c3838r4 = this.f34647d;
        if (c3838r4 != null) {
            c3838r4.f34282f = false;
            c3838r4.f34283g = false;
            c3838r4.f34284h = false;
            c3838r4.i = false;
            c3838r4.f34285j = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void d(int i, long j6) {
        this.f34655m = j6;
    }

    public final void f(long j6, long j9, int i, int i4) {
        C3838r4 c3838r4 = this.f34647d;
        boolean z6 = this.f34648e;
        c3838r4.f34283g = false;
        c3838r4.f34284h = false;
        c3838r4.f34281e = j9;
        c3838r4.f34280d = 0;
        c3838r4.f34278b = j6;
        if (i4 >= 32 && i4 != 40) {
            if (c3838r4.i && !c3838r4.f34285j) {
                if (z6) {
                    c3838r4.a(i);
                }
                c3838r4.i = false;
            }
            if (i4 <= 35 || i4 == 39) {
                c3838r4.f34284h = !c3838r4.f34285j;
                c3838r4.f34285j = true;
            }
        }
        boolean z9 = i4 >= 16 && i4 <= 21;
        c3838r4.f34279c = z9;
        c3838r4.f34282f = z9 || i4 <= 9;
        if (!this.f34648e) {
            this.f34650g.g(i4);
            this.f34651h.g(i4);
            this.i.g(i4);
        }
        this.f34652j.g(i4);
        this.f34653k.g(i4);
    }

    public final void g(byte[] bArr, int i, int i4) {
        C3838r4 c3838r4 = this.f34647d;
        if (c3838r4.f34282f) {
            int i6 = c3838r4.f34280d;
            int i9 = (i + 2) - i6;
            if (i9 < i4) {
                c3838r4.f34283g = (bArr[i9] & com.anythink.core.common.s.a.c.f17103a) != 0;
                c3838r4.f34282f = false;
            } else {
                c3838r4.f34280d = (i4 - i) + i6;
            }
        }
        if (!this.f34648e) {
            this.f34650g.h(bArr, i, i4);
            this.f34651h.h(bArr, i, i4);
            this.i.h(bArr, i, i4);
        }
        this.f34652j.h(bArr, i, i4);
        this.f34653k.h(bArr, i, i4);
    }

    public final void h(long j6, long j9, int i, int i4) {
        C3838r4 c3838r4 = this.f34647d;
        boolean z6 = this.f34648e;
        if (c3838r4.f34285j && c3838r4.f34283g) {
            c3838r4.f34288m = c3838r4.f34279c;
            c3838r4.f34285j = false;
        } else if (c3838r4.f34284h || c3838r4.f34283g) {
            if (z6 && c3838r4.i) {
                c3838r4.a(i + ((int) (j6 - c3838r4.f34278b)));
            }
            c3838r4.f34286k = c3838r4.f34278b;
            c3838r4.f34287l = c3838r4.f34281e;
            c3838r4.f34288m = c3838r4.f34279c;
            c3838r4.i = true;
        }
        boolean z9 = this.f34648e;
        C2749Pl c2749Pl = (C2749Pl) this.f34644a.f36135w;
        if (!z9) {
            C4108w4 c4108w4 = this.f34650g;
            c4108w4.i(i4);
            C4108w4 c4108w42 = this.f34651h;
            c4108w42.i(i4);
            C4108w4 c4108w43 = this.i;
            c4108w43.i(i4);
            if (c4108w4.f35566d && c4108w42.f35566d && c4108w43.f35566d) {
                String str = this.f34645b;
                int i6 = c4108w4.f35567e;
                byte[] bArr = new byte[c4108w42.f35567e + i6 + c4108w43.f35567e];
                System.arraycopy((byte[]) c4108w4.f35568f, 0, bArr, 0, i6);
                System.arraycopy((byte[]) c4108w42.f35568f, 0, bArr, c4108w4.f35567e, c4108w42.f35567e);
                System.arraycopy((byte[]) c4108w43.f35568f, 0, bArr, c4108w4.f35567e + c4108w42.f35567e, c4108w43.f35567e);
                C3994tz O8 = SK.O((byte[]) c4108w42.f35568f, 3, c4108w42.f35567e, null);
                C4155wy c4155wy = O8.f35208b;
                String a9 = c4155wy != null ? AbstractC4305zm.a(c4155wy.f35691a, c4155wy.f35692b, c4155wy.f35693c, c4155wy.f35694d, c4155wy.f35695e, c4155wy.f35696f) : null;
                C3322hP c3322hP = new C3322hP();
                c3322hP.f31546a = str;
                c3322hP.d("video/mp2t");
                c3322hP.e(com.anythink.basead.exoplayer.k.o.i);
                c3322hP.f31554j = a9;
                c3322hP.f31565u = O8.f35211e;
                c3322hP.f31566v = O8.f35212f;
                c3322hP.f31567w = O8.f35213g;
                c3322hP.f31568x = O8.f35214h;
                c3322hP.f31536E = new KJ(O8.f35216k, O8.f35217l, O8.f35218m, null, O8.f35209c + 8, O8.f35210d + 8);
                c3322hP.f31533B = O8.i;
                c3322hP.f31560p = O8.f35215j;
                c3322hP.f31537F = O8.f35207a + 1;
                c3322hP.f31561q = Collections.singletonList(bArr);
                DP dp = new DP(c3322hP);
                this.f34646c.e(dp);
                int i9 = dp.f25178q;
                AbstractC2792Sd.H(i9 != -1);
                c2749Pl.j(i9);
                this.f34648e = true;
            }
        }
        C4108w4 c4108w44 = this.f34652j;
        boolean i10 = c4108w44.i(i4);
        Cr cr = this.f34656n;
        if (i10) {
            cr.z(SK.b(c4108w44.f35567e, (byte[]) c4108w44.f35568f), (byte[]) c4108w44.f35568f);
            cr.G(5);
            c2749Pl.k(j9, cr);
        }
        C4108w4 c4108w45 = this.f34653k;
        if (c4108w45.i(i4)) {
            cr.z(SK.b(c4108w45.f35567e, (byte[]) c4108w45.f35568f), (byte[]) c4108w45.f35568f);
            cr.G(5);
            c2749Pl.k(j9, cr);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void p() {
        this.f34646c.getClass();
        String str = AbstractC3182eu.f30782a;
        ((C2749Pl) this.f34644a.f36135w).l(0);
        h(this.f34654l, this.f34655m, 0, 0);
        f(this.f34654l, this.f34655m, 0, 48);
    }
}
