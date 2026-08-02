package com.google.android.gms.internal.ads;

import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.t4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3946t4 implements InterfaceC3407j4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f34980a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34981b;

    /* renamed from: c, reason: collision with root package name */
    public final Cr f34982c;

    /* renamed from: d, reason: collision with root package name */
    public final C4256yr f34983d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC3566m1 f34984e;

    /* renamed from: f, reason: collision with root package name */
    public String f34985f;

    /* renamed from: g, reason: collision with root package name */
    public DP f34986g;

    /* renamed from: h, reason: collision with root package name */
    public int f34987h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f34988j;

    /* renamed from: k, reason: collision with root package name */
    public int f34989k;

    /* renamed from: l, reason: collision with root package name */
    public long f34990l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f34991m;

    /* renamed from: n, reason: collision with root package name */
    public int f34992n;

    /* renamed from: o, reason: collision with root package name */
    public int f34993o;

    /* renamed from: p, reason: collision with root package name */
    public int f34994p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f34995q;

    /* renamed from: r, reason: collision with root package name */
    public long f34996r;

    /* renamed from: s, reason: collision with root package name */
    public int f34997s;

    /* renamed from: t, reason: collision with root package name */
    public long f34998t;

    /* renamed from: u, reason: collision with root package name */
    public int f34999u;

    /* renamed from: v, reason: collision with root package name */
    public String f35000v;

    public C3946t4(String str, int i) {
        this.f34980a = str;
        this.f34981b = i;
        Cr cr = new Cr(1024);
        this.f34982c = cr;
        byte[] bArr = cr.f24997a;
        this.f34983d = new C4256yr(bArr, bArr.length);
        this.f34990l = com.anythink.basead.exoplayer.b.f7168b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void a(S0 s02, F4 f42) {
        f42.a();
        f42.b();
        this.f34984e = s02.C(f42.f25501d, 1);
        f42.b();
        this.f34985f = f42.f25502e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x019f, code lost:
    
        if (r23.f34991m == false) goto L68;
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Cr cr) {
        int h3;
        int i;
        int i4;
        boolean g9;
        int i6;
        this.f34984e.getClass();
        while (cr.B() > 0) {
            int i9 = this.f34987h;
            if (i9 != 0) {
                if (i9 != 1) {
                    C4256yr c4256yr = this.f34983d;
                    Cr cr2 = this.f34982c;
                    if (i9 != 2) {
                        int min = Math.min(cr.B(), this.f34988j - this.i);
                        cr.H(c4256yr.f36016a, this.i, min);
                        int i10 = this.i + min;
                        this.i = i10;
                        if (i10 == this.f34988j) {
                            c4256yr.d(0);
                            if (!c4256yr.g()) {
                                this.f34991m = true;
                                int h9 = c4256yr.h(1);
                                if (h9 == 1) {
                                    i4 = c4256yr.h(1);
                                    i = 1;
                                } else {
                                    i = h9;
                                    i4 = 0;
                                }
                                this.f34992n = i4;
                                if (i4 != 0) {
                                    throw U4.a(null, null);
                                }
                                if (i == 1) {
                                    c4256yr.h((c4256yr.h(2) + 1) * 8);
                                    i = 1;
                                }
                                if (!c4256yr.g()) {
                                    throw U4.a(null, null);
                                }
                                this.f34993o = c4256yr.h(6);
                                int h10 = c4256yr.h(4);
                                int h11 = c4256yr.h(3);
                                if (h10 != 0 || h11 != 0) {
                                    throw U4.a(null, null);
                                }
                                if (i == 0) {
                                    int i11 = (c4256yr.f36017b * 8) + c4256yr.f36018c;
                                    int b9 = c4256yr.b();
                                    C3944t2 p9 = AbstractC2659Kg.p(c4256yr, true);
                                    this.f35000v = (String) p9.f34979v;
                                    this.f34997s = p9.f34977n;
                                    this.f34999u = p9.f34978u;
                                    int b10 = b9 - c4256yr.b();
                                    c4256yr.d(i11);
                                    byte[] bArr = new byte[(b10 + 7) / 8];
                                    c4256yr.j(b10, bArr);
                                    C3322hP c3322hP = new C3322hP();
                                    c3322hP.f31546a = this.f34985f;
                                    c3322hP.d("video/mp2t");
                                    c3322hP.e(com.anythink.basead.exoplayer.k.o.f9246r);
                                    c3322hP.f31554j = this.f35000v;
                                    c3322hP.f31538G = this.f34999u;
                                    c3322hP.f31540I = this.f34997s;
                                    c3322hP.f31561q = Collections.singletonList(bArr);
                                    c3322hP.f31549d = this.f34980a;
                                    c3322hP.f31551f = this.f34981b;
                                    DP dp = new DP(c3322hP);
                                    if (!dp.equals(this.f34986g)) {
                                        this.f34986g = dp;
                                        this.f34998t = 1024000000 / dp.J;
                                        this.f34984e.e(dp);
                                    }
                                } else {
                                    int b11 = c4256yr.b();
                                    C3944t2 p10 = AbstractC2659Kg.p(c4256yr, true);
                                    this.f35000v = (String) p10.f34979v;
                                    this.f34997s = p10.f34977n;
                                    this.f34999u = p10.f34978u;
                                    c4256yr.f(c4256yr.h((c4256yr.h(2) + 1) * 8) - (b11 - c4256yr.b()));
                                }
                                int h12 = c4256yr.h(3);
                                this.f34994p = h12;
                                if (h12 == 0) {
                                    c4256yr.f(8);
                                } else if (h12 == 1) {
                                    c4256yr.f(9);
                                } else if (h12 == 3 || h12 == 4 || h12 == 5) {
                                    c4256yr.f(6);
                                } else {
                                    if (h12 != 6 && h12 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    c4256yr.f(1);
                                }
                                boolean g10 = c4256yr.g();
                                this.f34995q = g10;
                                this.f34996r = 0L;
                                if (g10) {
                                    if (i != 1) {
                                        do {
                                            g9 = c4256yr.g();
                                            this.f34996r = (this.f34996r << 8) + c4256yr.h(8);
                                        } while (g9);
                                    } else {
                                        this.f34996r = c4256yr.h((c4256yr.h(2) + 1) * 8);
                                    }
                                }
                                if (c4256yr.g()) {
                                    c4256yr.f(8);
                                }
                            }
                            if (this.f34992n != 0) {
                                throw U4.a(null, null);
                            }
                            if (this.f34993o != 0) {
                                throw U4.a(null, null);
                            }
                            if (this.f34994p != 0) {
                                throw U4.a(null, null);
                            }
                            int i12 = 0;
                            do {
                                h3 = c4256yr.h(8);
                                i12 += h3;
                            } while (h3 == 255);
                            int i13 = (c4256yr.f36017b * 8) + c4256yr.f36018c;
                            if ((i13 & 7) == 0) {
                                cr2.E(i13 >> 3);
                            } else {
                                c4256yr.j(i12 * 8, cr2.f24997a);
                                cr2.E(0);
                            }
                            this.f34984e.a(i12, cr2);
                            AbstractC2792Sd.H(this.f34990l != com.anythink.basead.exoplayer.b.f7168b);
                            this.f34984e.c(this.f34990l, 1, i12, 0, null);
                            this.f34990l += this.f34998t;
                            if (this.f34995q) {
                                c4256yr.f((int) this.f34996r);
                            }
                            this.f34987h = 0;
                        } else {
                            continue;
                        }
                    } else {
                        int K7 = ((this.f34989k & (-225)) << 8) | cr.K();
                        this.f34988j = K7;
                        if (K7 > cr2.f24997a.length) {
                            cr2.y(K7);
                            byte[] bArr2 = cr2.f24997a;
                            int length = bArr2.length;
                            c4256yr.f36016a = bArr2;
                            i6 = 0;
                            c4256yr.f36017b = 0;
                            c4256yr.f36018c = 0;
                            c4256yr.f36019d = length;
                        } else {
                            i6 = 0;
                        }
                        this.i = i6;
                        this.f34987h = 3;
                    }
                } else {
                    int K8 = cr.K();
                    if ((K8 & 224) == 224) {
                        this.f34989k = K8;
                        this.f34987h = 2;
                    } else if (K8 != 86) {
                        this.f34987h = 0;
                    }
                }
            } else if (cr.K() == 86) {
                this.f34987h = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void c() {
        this.f34987h = 0;
        this.f34990l = com.anythink.basead.exoplayer.b.f7168b;
        this.f34991m = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void d(int i, long j6) {
        this.f34990l = j6;
    }
}
