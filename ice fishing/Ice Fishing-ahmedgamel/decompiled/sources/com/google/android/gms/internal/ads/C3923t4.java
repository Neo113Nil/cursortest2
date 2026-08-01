package com.google.android.gms.internal.ads;

import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.t4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3923t4 implements InterfaceC3384j4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f34194a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34195b;

    /* renamed from: c, reason: collision with root package name */
    public final Cr f34196c;

    /* renamed from: d, reason: collision with root package name */
    public final C4233yr f34197d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC3543m1 f34198e;

    /* renamed from: f, reason: collision with root package name */
    public String f34199f;

    /* renamed from: g, reason: collision with root package name */
    public DP f34200g;

    /* renamed from: h, reason: collision with root package name */
    public int f34201h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f34202j;

    /* renamed from: k, reason: collision with root package name */
    public int f34203k;

    /* renamed from: l, reason: collision with root package name */
    public long f34204l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f34205m;

    /* renamed from: n, reason: collision with root package name */
    public int f34206n;

    /* renamed from: o, reason: collision with root package name */
    public int f34207o;

    /* renamed from: p, reason: collision with root package name */
    public int f34208p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f34209q;

    /* renamed from: r, reason: collision with root package name */
    public long f34210r;

    /* renamed from: s, reason: collision with root package name */
    public int f34211s;

    /* renamed from: t, reason: collision with root package name */
    public long f34212t;

    /* renamed from: u, reason: collision with root package name */
    public int f34213u;

    /* renamed from: v, reason: collision with root package name */
    public String f34214v;

    public C3923t4(String str, int i) {
        this.f34194a = str;
        this.f34195b = i;
        Cr cr = new Cr(1024);
        this.f34196c = cr;
        byte[] bArr = cr.f24252a;
        this.f34197d = new C4233yr(bArr, bArr.length);
        this.f34204l = com.anythink.basead.exoplayer.b.f6382b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void a(S0 s02, F4 f42) {
        f42.a();
        f42.b();
        this.f34198e = s02.C(f42.f24745d, 1);
        f42.b();
        this.f34199f = f42.f24746e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x019f, code lost:
    
        if (r23.f34205m == false) goto L68;
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Cr cr) {
        int h9;
        int i;
        int i6;
        boolean g4;
        int i9;
        this.f34198e.getClass();
        while (cr.B() > 0) {
            int i10 = this.f34201h;
            if (i10 != 0) {
                if (i10 != 1) {
                    C4233yr c4233yr = this.f34197d;
                    Cr cr2 = this.f34196c;
                    if (i10 != 2) {
                        int min = Math.min(cr.B(), this.f34202j - this.i);
                        cr.H(c4233yr.f35232a, this.i, min);
                        int i11 = this.i + min;
                        this.i = i11;
                        if (i11 == this.f34202j) {
                            c4233yr.d(0);
                            if (!c4233yr.g()) {
                                this.f34205m = true;
                                int h10 = c4233yr.h(1);
                                if (h10 == 1) {
                                    i6 = c4233yr.h(1);
                                    i = 1;
                                } else {
                                    i = h10;
                                    i6 = 0;
                                }
                                this.f34206n = i6;
                                if (i6 != 0) {
                                    throw U4.a(null, null);
                                }
                                if (i == 1) {
                                    c4233yr.h((c4233yr.h(2) + 1) * 8);
                                    i = 1;
                                }
                                if (!c4233yr.g()) {
                                    throw U4.a(null, null);
                                }
                                this.f34207o = c4233yr.h(6);
                                int h11 = c4233yr.h(4);
                                int h12 = c4233yr.h(3);
                                if (h11 != 0 || h12 != 0) {
                                    throw U4.a(null, null);
                                }
                                if (i == 0) {
                                    int i12 = (c4233yr.f35233b * 8) + c4233yr.f35234c;
                                    int b9 = c4233yr.b();
                                    C3921t2 p9 = AbstractC2639Kg.p(c4233yr, true);
                                    this.f34214v = (String) p9.f34193v;
                                    this.f34211s = p9.f34191n;
                                    this.f34213u = p9.f34192u;
                                    int b10 = b9 - c4233yr.b();
                                    c4233yr.d(i12);
                                    byte[] bArr = new byte[(b10 + 7) / 8];
                                    c4233yr.j(b10, bArr);
                                    C3299hP c3299hP = new C3299hP();
                                    c3299hP.f30780a = this.f34199f;
                                    c3299hP.d("video/mp2t");
                                    c3299hP.e(com.anythink.basead.exoplayer.k.o.f8460r);
                                    c3299hP.f30788j = this.f34214v;
                                    c3299hP.f30772G = this.f34213u;
                                    c3299hP.f30774I = this.f34211s;
                                    c3299hP.f30795q = Collections.singletonList(bArr);
                                    c3299hP.f30783d = this.f34194a;
                                    c3299hP.f30785f = this.f34195b;
                                    DP dp = new DP(c3299hP);
                                    if (!dp.equals(this.f34200g)) {
                                        this.f34200g = dp;
                                        this.f34212t = 1024000000 / dp.J;
                                        this.f34198e.e(dp);
                                    }
                                } else {
                                    int b11 = c4233yr.b();
                                    C3921t2 p10 = AbstractC2639Kg.p(c4233yr, true);
                                    this.f34214v = (String) p10.f34193v;
                                    this.f34211s = p10.f34191n;
                                    this.f34213u = p10.f34192u;
                                    c4233yr.f(c4233yr.h((c4233yr.h(2) + 1) * 8) - (b11 - c4233yr.b()));
                                }
                                int h13 = c4233yr.h(3);
                                this.f34208p = h13;
                                if (h13 == 0) {
                                    c4233yr.f(8);
                                } else if (h13 == 1) {
                                    c4233yr.f(9);
                                } else if (h13 == 3 || h13 == 4 || h13 == 5) {
                                    c4233yr.f(6);
                                } else {
                                    if (h13 != 6 && h13 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    c4233yr.f(1);
                                }
                                boolean g9 = c4233yr.g();
                                this.f34209q = g9;
                                this.f34210r = 0L;
                                if (g9) {
                                    if (i != 1) {
                                        do {
                                            g4 = c4233yr.g();
                                            this.f34210r = (this.f34210r << 8) + c4233yr.h(8);
                                        } while (g4);
                                    } else {
                                        this.f34210r = c4233yr.h((c4233yr.h(2) + 1) * 8);
                                    }
                                }
                                if (c4233yr.g()) {
                                    c4233yr.f(8);
                                }
                            }
                            if (this.f34206n != 0) {
                                throw U4.a(null, null);
                            }
                            if (this.f34207o != 0) {
                                throw U4.a(null, null);
                            }
                            if (this.f34208p != 0) {
                                throw U4.a(null, null);
                            }
                            int i13 = 0;
                            do {
                                h9 = c4233yr.h(8);
                                i13 += h9;
                            } while (h9 == 255);
                            int i14 = (c4233yr.f35233b * 8) + c4233yr.f35234c;
                            if ((i14 & 7) == 0) {
                                cr2.E(i14 >> 3);
                            } else {
                                c4233yr.j(i13 * 8, cr2.f24252a);
                                cr2.E(0);
                            }
                            this.f34198e.a(i13, cr2);
                            AbstractC2772Sd.H(this.f34204l != com.anythink.basead.exoplayer.b.f6382b);
                            this.f34198e.c(this.f34204l, 1, i13, 0, null);
                            this.f34204l += this.f34212t;
                            if (this.f34209q) {
                                c4233yr.f((int) this.f34210r);
                            }
                            this.f34201h = 0;
                        } else {
                            continue;
                        }
                    } else {
                        int K7 = ((this.f34203k & (-225)) << 8) | cr.K();
                        this.f34202j = K7;
                        if (K7 > cr2.f24252a.length) {
                            cr2.y(K7);
                            byte[] bArr2 = cr2.f24252a;
                            int length = bArr2.length;
                            c4233yr.f35232a = bArr2;
                            i9 = 0;
                            c4233yr.f35233b = 0;
                            c4233yr.f35234c = 0;
                            c4233yr.f35235d = length;
                        } else {
                            i9 = 0;
                        }
                        this.i = i9;
                        this.f34201h = 3;
                    }
                } else {
                    int K8 = cr.K();
                    if ((K8 & 224) == 224) {
                        this.f34203k = K8;
                        this.f34201h = 2;
                    } else if (K8 != 86) {
                        this.f34201h = 0;
                    }
                }
            } else if (cr.K() == 86) {
                this.f34201h = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void c() {
        this.f34201h = 0;
        this.f34204l = com.anythink.basead.exoplayer.b.f6382b;
        this.f34205m = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void d(int i, long j6) {
        this.f34204l = j6;
    }
}
