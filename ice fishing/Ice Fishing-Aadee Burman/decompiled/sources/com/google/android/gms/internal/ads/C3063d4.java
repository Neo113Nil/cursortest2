package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.d4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3063d4 implements InterfaceC3384j4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29693a;

    /* renamed from: b, reason: collision with root package name */
    public final C4233yr f29694b;

    /* renamed from: c, reason: collision with root package name */
    public final Cr f29695c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29696d;

    /* renamed from: e, reason: collision with root package name */
    public final int f29697e;

    /* renamed from: f, reason: collision with root package name */
    public final String f29698f;

    /* renamed from: g, reason: collision with root package name */
    public String f29699g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC3543m1 f29700h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f29701j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f29702k;

    /* renamed from: l, reason: collision with root package name */
    public long f29703l;

    /* renamed from: m, reason: collision with root package name */
    public DP f29704m;

    /* renamed from: n, reason: collision with root package name */
    public int f29705n;

    /* renamed from: o, reason: collision with root package name */
    public long f29706o;

    public C3063d4(int i, int i6, String str, String str2) {
        this.f29693a = i6;
        switch (i6) {
            case 1:
                C4233yr c4233yr = new C4233yr(new byte[16], 16);
                this.f29694b = c4233yr;
                this.f29695c = new Cr(c4233yr.f35232a);
                this.i = 0;
                this.f29701j = 0;
                this.f29702k = false;
                this.f29706o = com.anythink.basead.exoplayer.b.f6382b;
                this.f29696d = str;
                this.f29697e = i;
                this.f29698f = str2;
                break;
            default:
                C4233yr c4233yr2 = new C4233yr(new byte[128], 128);
                this.f29694b = c4233yr2;
                this.f29695c = new Cr(c4233yr2.f35232a);
                this.i = 0;
                this.f29706o = com.anythink.basead.exoplayer.b.f6382b;
                this.f29696d = str;
                this.f29697e = i;
                this.f29698f = str2;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void a(S0 s02, F4 f42) {
        switch (this.f29693a) {
            case 0:
                f42.a();
                f42.b();
                this.f29699g = f42.f24746e;
                f42.b();
                this.f29700h = s02.C(f42.f24745d, 1);
                break;
            default:
                f42.a();
                f42.b();
                this.f29699g = f42.f24746e;
                f42.b();
                this.f29700h = s02.C(f42.f24745d, 1);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0121  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Cr cr) {
        int i;
        int E8;
        int i6;
        int i9;
        int i10;
        String str;
        int i11;
        int h9;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Object[] objArr;
        switch (this.f29693a) {
            case 0:
                this.f29700h.getClass();
                while (cr.B() > 0) {
                    int i21 = this.i;
                    Cr cr2 = this.f29695c;
                    if (i21 == 0) {
                        while (true) {
                            if (cr.B() <= 0) {
                                break;
                            }
                            if (this.f29702k) {
                                int K7 = cr.K();
                                if (K7 == 119) {
                                    this.f29702k = false;
                                    this.i = 1;
                                    byte[] bArr = cr2.f24252a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.f29701j = 2;
                                } else {
                                    this.f29702k = K7 == 11;
                                }
                            } else {
                                this.f29702k = cr.K() == 11;
                            }
                        }
                    } else if (i21 != 1) {
                        int min = Math.min(cr.B(), this.f29705n - this.f29701j);
                        this.f29700h.a(min, cr);
                        int i22 = this.f29701j + min;
                        this.f29701j = i22;
                        if (i22 == this.f29705n) {
                            AbstractC2772Sd.H(this.f29706o != com.anythink.basead.exoplayer.b.f6382b);
                            this.f29700h.c(this.f29706o, 1, this.f29705n, 0, null);
                            this.f29706o += this.f29703l;
                            this.i = 0;
                        }
                    } else {
                        byte[] bArr2 = cr2.f24252a;
                        int min2 = Math.min(cr.B(), 128 - this.f29701j);
                        cr.H(bArr2, this.f29701j, min2);
                        int i23 = this.f29701j + min2;
                        this.f29701j = i23;
                        if (i23 == 128) {
                            C4233yr c4233yr = this.f29694b;
                            c4233yr.d(0);
                            int i24 = (c4233yr.f35233b * 8) + c4233yr.f35234c;
                            c4233yr.f(40);
                            int h10 = c4233yr.h(5);
                            c4233yr.d(i24);
                            int[] iArr = AbstractC3043cl.f29576x;
                            int[] iArr2 = AbstractC3043cl.f29574v;
                            if (h10 > 10) {
                                c4233yr.f(16);
                                int h11 = c4233yr.h(2);
                                char c9 = h11 != 0 ? h11 != 1 ? h11 != 2 ? (char) 65535 : (char) 2 : (char) 1 : (char) 0;
                                c4233yr.f(3);
                                int h12 = c4233yr.h(11) + 1;
                                int h13 = c4233yr.h(2);
                                if (h13 == 3) {
                                    i11 = AbstractC3043cl.f29575w[c4233yr.h(2)];
                                    h9 = 3;
                                    i12 = 6;
                                } else {
                                    h9 = c4233yr.h(2);
                                    int i25 = AbstractC3043cl.f29573u[h9];
                                    i11 = iArr2[h13];
                                    i12 = i25;
                                }
                                E8 = h12 + h12;
                                int i26 = (E8 * i11) / (i12 * 32);
                                int h14 = c4233yr.h(3);
                                boolean g4 = c4233yr.g();
                                i9 = iArr[h14] + (g4 ? 1 : 0);
                                c4233yr.f(10);
                                if (c4233yr.g()) {
                                    c4233yr.f(8);
                                }
                                if (h14 == 0) {
                                    c4233yr.f(5);
                                    if (c4233yr.g()) {
                                        c4233yr.f(8);
                                    }
                                    i13 = 0;
                                    h14 = 0;
                                } else {
                                    i13 = h14;
                                }
                                if (c9 == 1) {
                                    if (c4233yr.g()) {
                                        c4233yr.f(16);
                                    }
                                    c9 = 1;
                                }
                                if (c4233yr.g()) {
                                    if (i13 > 2) {
                                        c4233yr.f(2);
                                    }
                                    if ((i13 & 1) == 0 || i13 <= 2) {
                                        i17 = 6;
                                    } else {
                                        i17 = 6;
                                        c4233yr.f(6);
                                    }
                                    if ((i13 & 4) != 0) {
                                        c4233yr.f(i17);
                                    }
                                    if (g4 && c4233yr.g()) {
                                        c4233yr.f(5);
                                    }
                                    if (c9 == 0) {
                                        if (c4233yr.g()) {
                                            i18 = 6;
                                            c4233yr.f(6);
                                        } else {
                                            i18 = 6;
                                        }
                                        if (i13 == 0 && c4233yr.g()) {
                                            c4233yr.f(i18);
                                        }
                                        if (c4233yr.g()) {
                                            c4233yr.f(i18);
                                        }
                                        int h15 = c4233yr.h(2);
                                        if (h15 == 1) {
                                            c4233yr.f(5);
                                            i19 = 2;
                                        } else {
                                            if (h15 == 2) {
                                                c4233yr.f(12);
                                            } else if (h15 == 3) {
                                                int h16 = c4233yr.h(5);
                                                if (c4233yr.g()) {
                                                    c4233yr.f(5);
                                                    if (c4233yr.g()) {
                                                        i20 = 4;
                                                        c4233yr.f(4);
                                                    } else {
                                                        i20 = 4;
                                                    }
                                                    if (c4233yr.g()) {
                                                        c4233yr.f(i20);
                                                    }
                                                    if (c4233yr.g()) {
                                                        c4233yr.f(i20);
                                                    }
                                                    if (c4233yr.g()) {
                                                        c4233yr.f(i20);
                                                    }
                                                    if (c4233yr.g()) {
                                                        c4233yr.f(i20);
                                                    }
                                                    if (c4233yr.g()) {
                                                        c4233yr.f(i20);
                                                    }
                                                    if (c4233yr.g()) {
                                                        c4233yr.f(i20);
                                                    }
                                                    if (c4233yr.g()) {
                                                        if (c4233yr.g()) {
                                                            c4233yr.f(i20);
                                                        }
                                                        if (c4233yr.g()) {
                                                            c4233yr.f(i20);
                                                        }
                                                    }
                                                }
                                                if (c4233yr.g()) {
                                                    c4233yr.f(5);
                                                    if (c4233yr.g()) {
                                                        c4233yr.f(7);
                                                        if (c4233yr.g()) {
                                                            c4233yr.f(8);
                                                            i19 = 2;
                                                            c4233yr.f((h16 + i19) * 8);
                                                            c4233yr.k();
                                                        }
                                                    }
                                                }
                                                i19 = 2;
                                                c4233yr.f((h16 + i19) * 8);
                                                c4233yr.k();
                                            }
                                            i19 = 2;
                                        }
                                        if (i13 < i19) {
                                            if (c4233yr.g()) {
                                                c4233yr.f(14);
                                            }
                                            if (h14 == 0 && c4233yr.g()) {
                                                c4233yr.f(14);
                                            }
                                        }
                                        if (c4233yr.g()) {
                                            if (h9 == 0) {
                                                c4233yr.f(5);
                                                i14 = 0;
                                                c9 = 0;
                                                if (c4233yr.g()) {
                                                    c4233yr.f(5);
                                                    if (i13 == 2) {
                                                        c4233yr.f(4);
                                                        i13 = 2;
                                                    }
                                                    if (i13 >= 6) {
                                                        c4233yr.f(2);
                                                    }
                                                    if (c4233yr.g()) {
                                                        i16 = 8;
                                                        c4233yr.f(8);
                                                    } else {
                                                        i16 = 8;
                                                    }
                                                    if (i13 == 0 && c4233yr.g()) {
                                                        c4233yr.f(i16);
                                                    }
                                                    if (h13 < 3) {
                                                        c4233yr.e();
                                                    }
                                                }
                                                if (c9 == 0 && i14 != 3) {
                                                    c4233yr.e();
                                                }
                                                if (c9 == 2 || !(i14 == 3 || c4233yr.g())) {
                                                    i15 = 6;
                                                } else {
                                                    i15 = 6;
                                                    c4233yr.f(6);
                                                }
                                                str = (!c4233yr.g() && c4233yr.h(i15) == 1 && c4233yr.h(8) == 1) ? com.anythink.basead.exoplayer.k.o.f8421B : com.anythink.basead.exoplayer.k.o.f8420A;
                                                i10 = i12 * 256;
                                                i = i26;
                                            } else {
                                                for (int i27 = 0; i27 < i12; i27++) {
                                                    if (c4233yr.g()) {
                                                        c4233yr.f(5);
                                                    }
                                                }
                                            }
                                        }
                                        i14 = h9;
                                        c9 = 0;
                                        if (c4233yr.g()) {
                                        }
                                        if (c9 == 0) {
                                            c4233yr.e();
                                        }
                                        if (c9 == 2) {
                                        }
                                        i15 = 6;
                                        if (!c4233yr.g()) {
                                        }
                                        i10 = i12 * 256;
                                        i = i26;
                                    }
                                }
                                i14 = h9;
                                if (c4233yr.g()) {
                                }
                                if (c9 == 0) {
                                }
                                if (c9 == 2) {
                                }
                                i15 = 6;
                                if (!c4233yr.g()) {
                                }
                                i10 = i12 * 256;
                                i = i26;
                            } else {
                                c4233yr.f(32);
                                int h17 = c4233yr.h(2);
                                String str2 = h17 == 3 ? null : com.anythink.basead.exoplayer.k.o.f8468z;
                                int h18 = c4233yr.h(6);
                                i = AbstractC3043cl.f29577y[h18 / 2] * 1000;
                                E8 = AbstractC3043cl.E(h17, h18);
                                c4233yr.f(8);
                                int h19 = c4233yr.h(3);
                                if ((h19 & 1) == 0 || h19 == 1) {
                                    i6 = 2;
                                } else {
                                    i6 = 2;
                                    c4233yr.f(2);
                                }
                                if ((h19 & 4) != 0) {
                                    c4233yr.f(i6);
                                }
                                if (h19 == i6) {
                                    c4233yr.f(i6);
                                }
                                int i28 = h17 < 3 ? iArr2[h17] : -1;
                                i9 = iArr[h19] + (c4233yr.g() ? 1 : 0);
                                i10 = 1536;
                                str = str2;
                                i11 = i28;
                            }
                            DP dp = this.f29704m;
                            if (dp == null || i9 != dp.f24409H || i11 != dp.J || !Objects.equals(str, dp.f24431o)) {
                                C3299hP c3299hP = new C3299hP();
                                c3299hP.f30780a = this.f29699g;
                                c3299hP.d(this.f29698f);
                                c3299hP.e(str);
                                c3299hP.f30772G = i9;
                                c3299hP.f30774I = i11;
                                c3299hP.f30783d = this.f29696d;
                                c3299hP.f30785f = this.f29697e;
                                c3299hP.i = i;
                                if (com.anythink.basead.exoplayer.k.o.f8468z.equals(str)) {
                                    c3299hP.f30787h = i;
                                }
                                DP dp2 = new DP(c3299hP);
                                this.f29704m = dp2;
                                this.f29700h.e(dp2);
                            }
                            this.f29705n = E8;
                            this.f29703l = (i10 * 1000000) / this.f29704m.J;
                            cr2.E(0);
                            this.f29700h.a(128, cr2);
                            this.i = 2;
                        }
                    }
                }
                break;
            default:
                this.f29700h.getClass();
                while (cr.B() > 0) {
                    int i29 = this.i;
                    Cr cr3 = this.f29695c;
                    if (i29 == 0) {
                        while (cr.B() > 0) {
                            if (this.f29702k) {
                                int K8 = cr.K();
                                this.f29702k = K8 == 172;
                                byte b9 = com.anythink.core.common.s.a.c.f16317b;
                                if (K8 != 64) {
                                    if (K8 == 65) {
                                    }
                                } else if (K8 != 65) {
                                    objArr = false;
                                    this.i = 1;
                                    byte[] bArr3 = cr3.f24252a;
                                    bArr3[0] = -84;
                                    if (true == objArr) {
                                        b9 = 65;
                                    }
                                    bArr3[1] = b9;
                                    this.f29701j = 2;
                                }
                                objArr = true;
                                this.i = 1;
                                byte[] bArr32 = cr3.f24252a;
                                bArr32[0] = -84;
                                if (true == objArr) {
                                }
                                bArr32[1] = b9;
                                this.f29701j = 2;
                            } else {
                                this.f29702k = cr.K() == 172;
                            }
                        }
                    } else if (i29 != 1) {
                        int min3 = Math.min(cr.B(), this.f29705n - this.f29701j);
                        this.f29700h.a(min3, cr);
                        int i30 = this.f29701j + min3;
                        this.f29701j = i30;
                        if (i30 == this.f29705n) {
                            AbstractC2772Sd.H(this.f29706o != com.anythink.basead.exoplayer.b.f6382b);
                            this.f29700h.c(this.f29706o, 1, this.f29705n, 0, null);
                            this.f29706o += this.f29703l;
                            this.i = 0;
                        }
                    } else {
                        byte[] bArr4 = cr3.f24252a;
                        int min4 = Math.min(cr.B(), 16 - this.f29701j);
                        cr.H(bArr4, this.f29701j, min4);
                        int i31 = this.f29701j + min4;
                        this.f29701j = i31;
                        if (i31 == 16) {
                            C4233yr c4233yr2 = this.f29694b;
                            c4233yr2.d(0);
                            X2.b n9 = MA.n(c4233yr2);
                            DP dp3 = this.f29704m;
                            int i32 = n9.f3771a;
                            if (dp3 == null || dp3.f24409H != 2 || i32 != dp3.J || !"audio/ac4".equals(dp3.f24431o)) {
                                C3299hP c3299hP2 = new C3299hP();
                                c3299hP2.f30780a = this.f29699g;
                                c3299hP2.d(this.f29698f);
                                c3299hP2.e("audio/ac4");
                                c3299hP2.f30772G = 2;
                                c3299hP2.f30774I = i32;
                                c3299hP2.f30783d = this.f29696d;
                                c3299hP2.f30785f = this.f29697e;
                                DP dp4 = new DP(c3299hP2);
                                this.f29704m = dp4;
                                this.f29700h.e(dp4);
                            }
                            this.f29705n = n9.f3772b;
                            this.f29703l = (n9.f3773c * 1000000) / this.f29704m.J;
                            cr3.E(0);
                            this.f29700h.a(16, cr3);
                            this.i = 2;
                        }
                    }
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void c() {
        switch (this.f29693a) {
            case 0:
                this.i = 0;
                this.f29701j = 0;
                this.f29702k = false;
                this.f29706o = com.anythink.basead.exoplayer.b.f6382b;
                break;
            default:
                this.i = 0;
                this.f29701j = 0;
                this.f29702k = false;
                this.f29706o = com.anythink.basead.exoplayer.b.f6382b;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void d(int i, long j6) {
        switch (this.f29693a) {
            case 0:
                this.f29706o = j6;
                break;
            default:
                this.f29706o = j6;
                break;
        }
    }
}
