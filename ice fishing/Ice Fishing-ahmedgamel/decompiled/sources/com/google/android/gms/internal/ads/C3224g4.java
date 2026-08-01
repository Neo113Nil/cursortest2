package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.g4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3224g4 implements InterfaceC3384j4 {

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f30495x = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f30496a;

    /* renamed from: d, reason: collision with root package name */
    public final String f30499d;

    /* renamed from: e, reason: collision with root package name */
    public final int f30500e;

    /* renamed from: f, reason: collision with root package name */
    public final String f30501f;

    /* renamed from: g, reason: collision with root package name */
    public String f30502g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC3543m1 f30503h;
    public InterfaceC3543m1 i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f30507m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f30508n;

    /* renamed from: q, reason: collision with root package name */
    public int f30511q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f30512r;

    /* renamed from: t, reason: collision with root package name */
    public int f30514t;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC3543m1 f30516v;

    /* renamed from: w, reason: collision with root package name */
    public long f30517w;

    /* renamed from: b, reason: collision with root package name */
    public final C4233yr f30497b = new C4233yr(new byte[7], 7);

    /* renamed from: c, reason: collision with root package name */
    public final Cr f30498c = new Cr(Arrays.copyOf(f30495x, 10));

    /* renamed from: o, reason: collision with root package name */
    public int f30509o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f30510p = -1;

    /* renamed from: s, reason: collision with root package name */
    public long f30513s = com.anythink.basead.exoplayer.b.f6382b;

    /* renamed from: u, reason: collision with root package name */
    public long f30515u = com.anythink.basead.exoplayer.b.f6382b;

    /* renamed from: j, reason: collision with root package name */
    public int f30504j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f30505k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f30506l = 256;

    public C3224g4(String str, int i, String str2, boolean z3) {
        this.f30496a = z3;
        this.f30499d = str;
        this.f30500e = i;
        this.f30501f = str2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void a(S0 s02, F4 f42) {
        f42.a();
        f42.b();
        this.f30502g = f42.f24746e;
        f42.b();
        InterfaceC3543m1 C8 = s02.C(f42.f24745d, 1);
        this.f30503h = C8;
        this.f30516v = C8;
        if (!this.f30496a) {
            this.i = new O0();
            return;
        }
        f42.a();
        f42.b();
        InterfaceC3543m1 C9 = s02.C(f42.f24745d, 5);
        this.i = C9;
        C3299hP c3299hP = new C3299hP();
        f42.b();
        c3299hP.f30780a = f42.f24746e;
        c3299hP.d(this.f30501f);
        c3299hP.e(com.anythink.basead.exoplayer.k.o.f8440V);
        C9.e(new DP(c3299hP));
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x022b, code lost:
    
        r2 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0316, code lost:
    
        r4 = r3;
        r3 = r2;
        r2 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.google.android.gms.internal.ads.Cr] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Cr cr) {
        boolean z3;
        int i;
        int i6;
        int i9;
        byte b9;
        int i10;
        int i11;
        int i12;
        char c9;
        int i13;
        boolean z6;
        int i14;
        int i15;
        int i16;
        ?? r22 = 0;
        int i17 = -1;
        int i18 = 2;
        ?? r52 = 1;
        this.f30503h.getClass();
        String str = AbstractC3159eu.f29993a;
        while (cr.B() > 0) {
            int i19 = this.f30504j;
            C4233yr c4233yr = this.f30497b;
            int i20 = 3;
            int i21 = 4;
            Cr cr2 = this.f30498c;
            if (i19 == 0) {
                int i22 = 7;
                byte[] bArr = cr.f24252a;
                int i23 = cr.f24253b;
                int i24 = cr.f24254c;
                while (true) {
                    if (i23 >= i24) {
                        z3 = r22;
                        i = i17;
                        i6 = i18;
                        boolean z9 = r52 == true ? 1 : 0;
                        cr.E(i23);
                        r52 = r52;
                        break;
                    }
                    i9 = i23 + 1;
                    b9 = bArr[i23];
                    i10 = i20;
                    int i25 = b9 & 255;
                    if (this.f30506l != 512 || (((((byte) i25) & 255) | 65280) & 65526) != 65520) {
                        i = i17;
                        i11 = r52 == true ? 1 : 0;
                    } else {
                        if (this.f30508n) {
                            i = i17;
                            i15 = r52 == true ? 1 : 0;
                            break;
                        }
                        int i26 = i23 - 1;
                        cr.E(i23);
                        byte[] bArr2 = c4233yr.f35232a;
                        if (cr.B() < r52) {
                            i11 = r52 == true ? 1 : 0;
                        } else {
                            cr.H(bArr2, r22, r52 == true ? 1 : 0);
                            c4233yr.d(i21);
                            int h9 = c4233yr.h(r52 == true ? 1 : 0);
                            int i27 = this.f30509o;
                            if (i27 == -1 || h9 == i27) {
                                if (this.f30510p != -1) {
                                    byte[] bArr3 = c4233yr.f35232a;
                                    if (cr.B() < r52) {
                                        i15 = r52 == true ? 1 : 0;
                                        break;
                                    }
                                    cr.H(bArr3, r22, r52 == true ? 1 : 0);
                                    c4233yr.d(2);
                                    i16 = 4;
                                    int h10 = c4233yr.h(4);
                                    i15 = r52 == true ? 1 : 0;
                                    if (h10 == this.f30510p) {
                                        cr.E(i9);
                                    } else {
                                        i11 = i15;
                                    }
                                } else {
                                    i15 = r52 == true ? 1 : 0;
                                    i16 = 4;
                                }
                                byte[] bArr4 = c4233yr.f35232a;
                                if (cr.B() < i16) {
                                    break;
                                }
                                cr.H(bArr4, r22, i16);
                                c4233yr.d(14);
                                int h11 = c4233yr.h(13);
                                if (h11 >= i22) {
                                    byte[] bArr5 = cr.f24252a;
                                    int i28 = cr.f24254c;
                                    int i29 = i26 + h11;
                                    if (i29 >= i28) {
                                        break;
                                    }
                                    byte b10 = bArr5[i29];
                                    i = -1;
                                    if (b10 != -1) {
                                        if (b10 == 73) {
                                            int i30 = i29 + 1;
                                            if (i30 == i28) {
                                                break;
                                            }
                                            if (bArr5[i30] == 68) {
                                                int i31 = i29 + 2;
                                                if (i31 == i28) {
                                                    break;
                                                } else if (bArr5[i31] == 51) {
                                                    break;
                                                }
                                            }
                                        }
                                    } else {
                                        int i32 = i29 + 1;
                                        if (i32 == i28) {
                                            break;
                                        }
                                        byte b11 = bArr5[i32];
                                        if ((((b11 & 255) | 65280) & 65526) == 65520 && ((b11 & 8) >> 3) == h9) {
                                            break;
                                        }
                                    }
                                } else {
                                    i = -1;
                                }
                                i11 = i15;
                            } else {
                                i11 = r52 == true ? 1 : 0;
                                i = -1;
                            }
                        }
                        i = -1;
                    }
                    int i33 = this.f30506l;
                    int i34 = i33 | i25;
                    if (i34 == 329) {
                        i12 = 2;
                        c9 = 256;
                        i13 = 3;
                        z6 = false;
                        i14 = 768;
                    } else if (i34 == 511) {
                        i12 = 2;
                        c9 = 256;
                        i13 = 3;
                        z6 = false;
                        i14 = 512;
                    } else if (i34 == 836) {
                        i12 = 2;
                        c9 = 256;
                        i13 = 3;
                        z6 = false;
                        i14 = 1024;
                    } else {
                        if (i34 == 1075) {
                            i6 = 2;
                            this.f30504j = 2;
                            this.f30505k = 3;
                            z3 = false;
                            this.f30514t = 0;
                            cr2.E(0);
                            cr.E(i9);
                            r52 = i11;
                            break;
                        }
                        c9 = 256;
                        if (i33 != 256) {
                            this.f30506l = 256;
                            i17 = i;
                            r22 = 0;
                            i20 = 3;
                            i21 = 4;
                            i22 = 7;
                            r52 = i11;
                            i18 = 2;
                        } else {
                            i12 = 2;
                            i13 = 3;
                            z6 = false;
                            int i35 = i12;
                            i17 = i;
                            r22 = z6;
                            i20 = i13;
                            r52 = i11;
                            i18 = i35;
                            i23 = i9;
                            i21 = 4;
                            i22 = 7;
                        }
                    }
                    this.f30506l = i14;
                    int i352 = i12;
                    i17 = i;
                    r22 = z6;
                    i20 = i13;
                    r52 = i11;
                    i18 = i352;
                    i23 = i9;
                    i21 = 4;
                    i22 = 7;
                }
                this.f30511q = (b9 & 8) >> 3;
                int i36 = i15;
                this.f30507m = i36 != ((b9 & 1) ^ 1) ? 0 : i36;
                if (this.f30508n) {
                    this.f30504j = i10;
                    this.f30505k = 0;
                } else {
                    this.f30504j = i36;
                    this.f30505k = 0;
                }
                cr.E(i9);
                i17 = i;
                r52 = i36;
                r22 = 0;
                i18 = 2;
            } else if (i19 != r52) {
                if (i19 == i18) {
                    byte[] bArr6 = cr2.f24252a;
                    int min = Math.min(cr.B(), 10 - this.f30505k);
                    cr.H(bArr6, this.f30505k, min);
                    int i37 = this.f30505k + min;
                    this.f30505k = i37;
                    if (i37 == 10) {
                        this.i.a(10, cr2);
                        cr2.E(6);
                        InterfaceC3543m1 interfaceC3543m1 = this.i;
                        int g4 = cr2.g() + 10;
                        this.f30504j = 4;
                        this.f30505k = 10;
                        this.f30516v = interfaceC3543m1;
                        this.f30517w = 0L;
                        this.f30514t = g4;
                    }
                } else if (i19 != 3) {
                    int min2 = Math.min(cr.B(), this.f30514t - this.f30505k);
                    this.f30516v.a(min2, cr);
                    int i38 = this.f30505k + min2;
                    this.f30505k = i38;
                    if (i38 == this.f30514t) {
                        AbstractC2772Sd.H(this.f30515u != com.anythink.basead.exoplayer.b.f6382b ? r52 == true ? 1 : 0 : r22 == true ? 1 : 0);
                        this.f30516v.c(this.f30515u, 1, this.f30514t, 0, null);
                        this.f30515u += this.f30517w;
                        this.f30504j = r22 == true ? 1 : 0;
                        this.f30505k = r22 == true ? 1 : 0;
                        this.f30506l = 256;
                    }
                } else {
                    int i39 = r52 != this.f30507m ? 5 : 7;
                    byte[] bArr7 = c4233yr.f35232a;
                    int min3 = Math.min(cr.B(), i39 - this.f30505k);
                    cr.H(bArr7, this.f30505k, min3);
                    int i40 = this.f30505k + min3;
                    this.f30505k = i40;
                    if (i40 == i39) {
                        c4233yr.d(r22 == true ? 1 : 0);
                        if (this.f30512r) {
                            c4233yr.f(10);
                        } else {
                            int h12 = c4233yr.h(i18) + (r52 == true ? 1 : 0);
                            if (h12 != i18) {
                                StringBuilder sb = new StringBuilder(String.valueOf(h12).length() + 50);
                                sb.append("Detected audio object type: ");
                                sb.append(h12);
                                sb.append(", but assuming AAC LC.");
                                AbstractC2968bG.y("AdtsReader", sb.toString());
                            }
                            c4233yr.f(5);
                            int h13 = c4233yr.h(3);
                            int i41 = this.f30510p;
                            byte b12 = (byte) (((i41 >> 1) & 7) | 16);
                            byte b13 = (byte) (((h13 << 3) & 120) | ((i41 << 7) & 128));
                            byte[] bArr8 = new byte[i18];
                            bArr8[r22 == true ? 1 : 0] = b12;
                            bArr8[r52 == true ? 1 : 0] = b13;
                            C3921t2 p9 = AbstractC2639Kg.p(new C4233yr(bArr8, i18), r22);
                            C3299hP c3299hP = new C3299hP();
                            c3299hP.f30780a = this.f30502g;
                            c3299hP.d(this.f30501f);
                            c3299hP.e(com.anythink.basead.exoplayer.k.o.f8460r);
                            c3299hP.f30788j = (String) p9.f34193v;
                            c3299hP.f30772G = p9.f34192u;
                            c3299hP.f30774I = p9.f34191n;
                            c3299hP.f30795q = Collections.singletonList(bArr8);
                            c3299hP.f30783d = this.f30499d;
                            c3299hP.f30785f = this.f30500e;
                            DP dp = new DP(c3299hP);
                            this.f30513s = 1024000000 / dp.J;
                            this.f30503h.e(dp);
                            this.f30512r = r52;
                        }
                        c4233yr.f(4);
                        int h14 = c4233yr.h(13);
                        int i42 = h14 - 7;
                        if (this.f30507m) {
                            i42 = h14 - 9;
                        }
                        InterfaceC3543m1 interfaceC3543m12 = this.f30503h;
                        long j6 = this.f30513s;
                        this.f30504j = 4;
                        this.f30505k = r22 == true ? 1 : 0;
                        this.f30516v = interfaceC3543m12;
                        this.f30517w = j6;
                        this.f30514t = i42;
                    }
                }
            } else if (cr.B() != 0) {
                c4233yr.f35232a[r22 == true ? 1 : 0] = cr.f24252a[cr.f24253b];
                c4233yr.d(i18);
                int h15 = c4233yr.h(4);
                int i43 = this.f30510p;
                if (i43 == i17 || h15 == i43) {
                    if (!this.f30508n) {
                        this.f30508n = r52;
                        this.f30509o = this.f30511q;
                        this.f30510p = h15;
                    }
                    this.f30504j = 3;
                    this.f30505k = r22 == true ? 1 : 0;
                } else {
                    this.f30508n = r22;
                    this.f30504j = r22 == true ? 1 : 0;
                    this.f30505k = r22 == true ? 1 : 0;
                    this.f30506l = 256;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void c() {
        this.f30515u = com.anythink.basead.exoplayer.b.f6382b;
        this.f30508n = false;
        this.f30504j = 0;
        this.f30505k = 0;
        this.f30506l = 256;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void d(int i, long j6) {
        this.f30515u = j6;
    }
}
