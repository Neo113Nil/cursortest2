package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.d4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3086d4 implements InterfaceC3407j4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30465a;

    /* renamed from: b, reason: collision with root package name */
    public final C4256yr f30466b;

    /* renamed from: c, reason: collision with root package name */
    public final Cr f30467c;

    /* renamed from: d, reason: collision with root package name */
    public final String f30468d;

    /* renamed from: e, reason: collision with root package name */
    public final int f30469e;

    /* renamed from: f, reason: collision with root package name */
    public final String f30470f;

    /* renamed from: g, reason: collision with root package name */
    public String f30471g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC3566m1 f30472h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f30473j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f30474k;

    /* renamed from: l, reason: collision with root package name */
    public long f30475l;

    /* renamed from: m, reason: collision with root package name */
    public DP f30476m;

    /* renamed from: n, reason: collision with root package name */
    public int f30477n;

    /* renamed from: o, reason: collision with root package name */
    public long f30478o;

    public C3086d4(int i, int i4, String str, String str2) {
        this.f30465a = i4;
        switch (i4) {
            case 1:
                C4256yr c4256yr = new C4256yr(new byte[16], 16);
                this.f30466b = c4256yr;
                this.f30467c = new Cr(c4256yr.f36016a);
                this.i = 0;
                this.f30473j = 0;
                this.f30474k = false;
                this.f30478o = com.anythink.basead.exoplayer.b.f7168b;
                this.f30468d = str;
                this.f30469e = i;
                this.f30470f = str2;
                break;
            default:
                C4256yr c4256yr2 = new C4256yr(new byte[128], 128);
                this.f30466b = c4256yr2;
                this.f30467c = new Cr(c4256yr2.f36016a);
                this.i = 0;
                this.f30478o = com.anythink.basead.exoplayer.b.f7168b;
                this.f30468d = str;
                this.f30469e = i;
                this.f30470f = str2;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void a(S0 s02, F4 f42) {
        switch (this.f30465a) {
            case 0:
                f42.a();
                f42.b();
                this.f30471g = f42.f25502e;
                f42.b();
                this.f30472h = s02.C(f42.f25501d, 1);
                break;
            default:
                f42.a();
                f42.b();
                this.f30471g = f42.f25502e;
                f42.b();
                this.f30472h = s02.C(f42.f25501d, 1);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0121  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Cr cr) {
        int i;
        int E8;
        int i4;
        int i6;
        int i9;
        String str;
        int i10;
        int h3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Object[] objArr;
        switch (this.f30465a) {
            case 0:
                this.f30472h.getClass();
                while (cr.B() > 0) {
                    int i20 = this.i;
                    Cr cr2 = this.f30467c;
                    if (i20 == 0) {
                        while (true) {
                            if (cr.B() <= 0) {
                                break;
                            }
                            if (this.f30474k) {
                                int K7 = cr.K();
                                if (K7 == 119) {
                                    this.f30474k = false;
                                    this.i = 1;
                                    byte[] bArr = cr2.f24997a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.f30473j = 2;
                                } else {
                                    this.f30474k = K7 == 11;
                                }
                            } else {
                                this.f30474k = cr.K() == 11;
                            }
                        }
                    } else if (i20 != 1) {
                        int min = Math.min(cr.B(), this.f30477n - this.f30473j);
                        this.f30472h.a(min, cr);
                        int i21 = this.f30473j + min;
                        this.f30473j = i21;
                        if (i21 == this.f30477n) {
                            AbstractC2792Sd.H(this.f30478o != com.anythink.basead.exoplayer.b.f7168b);
                            this.f30472h.c(this.f30478o, 1, this.f30477n, 0, null);
                            this.f30478o += this.f30475l;
                            this.i = 0;
                        }
                    } else {
                        byte[] bArr2 = cr2.f24997a;
                        int min2 = Math.min(cr.B(), 128 - this.f30473j);
                        cr.H(bArr2, this.f30473j, min2);
                        int i22 = this.f30473j + min2;
                        this.f30473j = i22;
                        if (i22 == 128) {
                            C4256yr c4256yr = this.f30466b;
                            c4256yr.d(0);
                            int i23 = (c4256yr.f36017b * 8) + c4256yr.f36018c;
                            c4256yr.f(40);
                            int h9 = c4256yr.h(5);
                            c4256yr.d(i23);
                            int[] iArr = AbstractC3066cl.f30361x;
                            int[] iArr2 = AbstractC3066cl.f30359v;
                            if (h9 > 10) {
                                c4256yr.f(16);
                                int h10 = c4256yr.h(2);
                                char c9 = h10 != 0 ? h10 != 1 ? h10 != 2 ? (char) 65535 : (char) 2 : (char) 1 : (char) 0;
                                c4256yr.f(3);
                                int h11 = c4256yr.h(11) + 1;
                                int h12 = c4256yr.h(2);
                                if (h12 == 3) {
                                    i10 = AbstractC3066cl.f30360w[c4256yr.h(2)];
                                    h3 = 3;
                                    i11 = 6;
                                } else {
                                    h3 = c4256yr.h(2);
                                    int i24 = AbstractC3066cl.f30358u[h3];
                                    i10 = iArr2[h12];
                                    i11 = i24;
                                }
                                E8 = h11 + h11;
                                int i25 = (E8 * i10) / (i11 * 32);
                                int h13 = c4256yr.h(3);
                                boolean g9 = c4256yr.g();
                                i6 = iArr[h13] + (g9 ? 1 : 0);
                                c4256yr.f(10);
                                if (c4256yr.g()) {
                                    c4256yr.f(8);
                                }
                                if (h13 == 0) {
                                    c4256yr.f(5);
                                    if (c4256yr.g()) {
                                        c4256yr.f(8);
                                    }
                                    i12 = 0;
                                    h13 = 0;
                                } else {
                                    i12 = h13;
                                }
                                if (c9 == 1) {
                                    if (c4256yr.g()) {
                                        c4256yr.f(16);
                                    }
                                    c9 = 1;
                                }
                                if (c4256yr.g()) {
                                    if (i12 > 2) {
                                        c4256yr.f(2);
                                    }
                                    if ((i12 & 1) == 0 || i12 <= 2) {
                                        i16 = 6;
                                    } else {
                                        i16 = 6;
                                        c4256yr.f(6);
                                    }
                                    if ((i12 & 4) != 0) {
                                        c4256yr.f(i16);
                                    }
                                    if (g9 && c4256yr.g()) {
                                        c4256yr.f(5);
                                    }
                                    if (c9 == 0) {
                                        if (c4256yr.g()) {
                                            i17 = 6;
                                            c4256yr.f(6);
                                        } else {
                                            i17 = 6;
                                        }
                                        if (i12 == 0 && c4256yr.g()) {
                                            c4256yr.f(i17);
                                        }
                                        if (c4256yr.g()) {
                                            c4256yr.f(i17);
                                        }
                                        int h14 = c4256yr.h(2);
                                        if (h14 == 1) {
                                            c4256yr.f(5);
                                            i18 = 2;
                                        } else {
                                            if (h14 == 2) {
                                                c4256yr.f(12);
                                            } else if (h14 == 3) {
                                                int h15 = c4256yr.h(5);
                                                if (c4256yr.g()) {
                                                    c4256yr.f(5);
                                                    if (c4256yr.g()) {
                                                        i19 = 4;
                                                        c4256yr.f(4);
                                                    } else {
                                                        i19 = 4;
                                                    }
                                                    if (c4256yr.g()) {
                                                        c4256yr.f(i19);
                                                    }
                                                    if (c4256yr.g()) {
                                                        c4256yr.f(i19);
                                                    }
                                                    if (c4256yr.g()) {
                                                        c4256yr.f(i19);
                                                    }
                                                    if (c4256yr.g()) {
                                                        c4256yr.f(i19);
                                                    }
                                                    if (c4256yr.g()) {
                                                        c4256yr.f(i19);
                                                    }
                                                    if (c4256yr.g()) {
                                                        c4256yr.f(i19);
                                                    }
                                                    if (c4256yr.g()) {
                                                        if (c4256yr.g()) {
                                                            c4256yr.f(i19);
                                                        }
                                                        if (c4256yr.g()) {
                                                            c4256yr.f(i19);
                                                        }
                                                    }
                                                }
                                                if (c4256yr.g()) {
                                                    c4256yr.f(5);
                                                    if (c4256yr.g()) {
                                                        c4256yr.f(7);
                                                        if (c4256yr.g()) {
                                                            c4256yr.f(8);
                                                            i18 = 2;
                                                            c4256yr.f((h15 + i18) * 8);
                                                            c4256yr.k();
                                                        }
                                                    }
                                                }
                                                i18 = 2;
                                                c4256yr.f((h15 + i18) * 8);
                                                c4256yr.k();
                                            }
                                            i18 = 2;
                                        }
                                        if (i12 < i18) {
                                            if (c4256yr.g()) {
                                                c4256yr.f(14);
                                            }
                                            if (h13 == 0 && c4256yr.g()) {
                                                c4256yr.f(14);
                                            }
                                        }
                                        if (c4256yr.g()) {
                                            if (h3 == 0) {
                                                c4256yr.f(5);
                                                i13 = 0;
                                                c9 = 0;
                                                if (c4256yr.g()) {
                                                    c4256yr.f(5);
                                                    if (i12 == 2) {
                                                        c4256yr.f(4);
                                                        i12 = 2;
                                                    }
                                                    if (i12 >= 6) {
                                                        c4256yr.f(2);
                                                    }
                                                    if (c4256yr.g()) {
                                                        i15 = 8;
                                                        c4256yr.f(8);
                                                    } else {
                                                        i15 = 8;
                                                    }
                                                    if (i12 == 0 && c4256yr.g()) {
                                                        c4256yr.f(i15);
                                                    }
                                                    if (h12 < 3) {
                                                        c4256yr.e();
                                                    }
                                                }
                                                if (c9 == 0 && i13 != 3) {
                                                    c4256yr.e();
                                                }
                                                if (c9 == 2 || !(i13 == 3 || c4256yr.g())) {
                                                    i14 = 6;
                                                } else {
                                                    i14 = 6;
                                                    c4256yr.f(6);
                                                }
                                                str = (!c4256yr.g() && c4256yr.h(i14) == 1 && c4256yr.h(8) == 1) ? com.anythink.basead.exoplayer.k.o.f9207B : com.anythink.basead.exoplayer.k.o.f9206A;
                                                i9 = i11 * 256;
                                                i = i25;
                                            } else {
                                                for (int i26 = 0; i26 < i11; i26++) {
                                                    if (c4256yr.g()) {
                                                        c4256yr.f(5);
                                                    }
                                                }
                                            }
                                        }
                                        i13 = h3;
                                        c9 = 0;
                                        if (c4256yr.g()) {
                                        }
                                        if (c9 == 0) {
                                            c4256yr.e();
                                        }
                                        if (c9 == 2) {
                                        }
                                        i14 = 6;
                                        if (!c4256yr.g()) {
                                        }
                                        i9 = i11 * 256;
                                        i = i25;
                                    }
                                }
                                i13 = h3;
                                if (c4256yr.g()) {
                                }
                                if (c9 == 0) {
                                }
                                if (c9 == 2) {
                                }
                                i14 = 6;
                                if (!c4256yr.g()) {
                                }
                                i9 = i11 * 256;
                                i = i25;
                            } else {
                                c4256yr.f(32);
                                int h16 = c4256yr.h(2);
                                String str2 = h16 == 3 ? null : com.anythink.basead.exoplayer.k.o.f9254z;
                                int h17 = c4256yr.h(6);
                                i = AbstractC3066cl.f30362y[h17 / 2] * 1000;
                                E8 = AbstractC3066cl.E(h16, h17);
                                c4256yr.f(8);
                                int h18 = c4256yr.h(3);
                                if ((h18 & 1) == 0 || h18 == 1) {
                                    i4 = 2;
                                } else {
                                    i4 = 2;
                                    c4256yr.f(2);
                                }
                                if ((h18 & 4) != 0) {
                                    c4256yr.f(i4);
                                }
                                if (h18 == i4) {
                                    c4256yr.f(i4);
                                }
                                int i27 = h16 < 3 ? iArr2[h16] : -1;
                                i6 = iArr[h18] + (c4256yr.g() ? 1 : 0);
                                i9 = 1536;
                                str = str2;
                                i10 = i27;
                            }
                            DP dp = this.f30476m;
                            if (dp == null || i6 != dp.f25154H || i10 != dp.J || !Objects.equals(str, dp.f25176o)) {
                                C3322hP c3322hP = new C3322hP();
                                c3322hP.f31546a = this.f30471g;
                                c3322hP.d(this.f30470f);
                                c3322hP.e(str);
                                c3322hP.f31538G = i6;
                                c3322hP.f31540I = i10;
                                c3322hP.f31549d = this.f30468d;
                                c3322hP.f31551f = this.f30469e;
                                c3322hP.i = i;
                                if (com.anythink.basead.exoplayer.k.o.f9254z.equals(str)) {
                                    c3322hP.f31553h = i;
                                }
                                DP dp2 = new DP(c3322hP);
                                this.f30476m = dp2;
                                this.f30472h.e(dp2);
                            }
                            this.f30477n = E8;
                            this.f30475l = (i9 * 1000000) / this.f30476m.J;
                            cr2.E(0);
                            this.f30472h.a(128, cr2);
                            this.i = 2;
                        }
                    }
                }
                break;
            default:
                this.f30472h.getClass();
                while (cr.B() > 0) {
                    int i28 = this.i;
                    Cr cr3 = this.f30467c;
                    if (i28 == 0) {
                        while (cr.B() > 0) {
                            if (this.f30474k) {
                                int K8 = cr.K();
                                this.f30474k = K8 == 172;
                                byte b9 = com.anythink.core.common.s.a.c.f17104b;
                                if (K8 != 64) {
                                    if (K8 == 65) {
                                    }
                                } else if (K8 != 65) {
                                    objArr = false;
                                    this.i = 1;
                                    byte[] bArr3 = cr3.f24997a;
                                    bArr3[0] = -84;
                                    if (true == objArr) {
                                        b9 = 65;
                                    }
                                    bArr3[1] = b9;
                                    this.f30473j = 2;
                                }
                                objArr = true;
                                this.i = 1;
                                byte[] bArr32 = cr3.f24997a;
                                bArr32[0] = -84;
                                if (true == objArr) {
                                }
                                bArr32[1] = b9;
                                this.f30473j = 2;
                            } else {
                                this.f30474k = cr.K() == 172;
                            }
                        }
                    } else if (i28 != 1) {
                        int min3 = Math.min(cr.B(), this.f30477n - this.f30473j);
                        this.f30472h.a(min3, cr);
                        int i29 = this.f30473j + min3;
                        this.f30473j = i29;
                        if (i29 == this.f30477n) {
                            AbstractC2792Sd.H(this.f30478o != com.anythink.basead.exoplayer.b.f7168b);
                            this.f30472h.c(this.f30478o, 1, this.f30477n, 0, null);
                            this.f30478o += this.f30475l;
                            this.i = 0;
                        }
                    } else {
                        byte[] bArr4 = cr3.f24997a;
                        int min4 = Math.min(cr.B(), 16 - this.f30473j);
                        cr.H(bArr4, this.f30473j, min4);
                        int i30 = this.f30473j + min4;
                        this.f30473j = i30;
                        if (i30 == 16) {
                            C4256yr c4256yr2 = this.f30466b;
                            c4256yr2.d(0);
                            A3.r n9 = MA.n(c4256yr2);
                            DP dp3 = this.f30476m;
                            int i31 = n9.f184a;
                            if (dp3 == null || dp3.f25154H != 2 || i31 != dp3.J || !"audio/ac4".equals(dp3.f25176o)) {
                                C3322hP c3322hP2 = new C3322hP();
                                c3322hP2.f31546a = this.f30471g;
                                c3322hP2.d(this.f30470f);
                                c3322hP2.e("audio/ac4");
                                c3322hP2.f31538G = 2;
                                c3322hP2.f31540I = i31;
                                c3322hP2.f31549d = this.f30468d;
                                c3322hP2.f31551f = this.f30469e;
                                DP dp4 = new DP(c3322hP2);
                                this.f30476m = dp4;
                                this.f30472h.e(dp4);
                            }
                            this.f30477n = n9.f185b;
                            this.f30475l = (n9.f186c * 1000000) / this.f30476m.J;
                            cr3.E(0);
                            this.f30472h.a(16, cr3);
                            this.i = 2;
                        }
                    }
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void c() {
        switch (this.f30465a) {
            case 0:
                this.i = 0;
                this.f30473j = 0;
                this.f30474k = false;
                this.f30478o = com.anythink.basead.exoplayer.b.f7168b;
                break;
            default:
                this.i = 0;
                this.f30473j = 0;
                this.f30474k = false;
                this.f30478o = com.anythink.basead.exoplayer.b.f7168b;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void d(int i, long j6) {
        switch (this.f30465a) {
            case 0:
                this.f30478o = j6;
                break;
            default:
                this.f30478o = j6;
                break;
        }
    }
}
