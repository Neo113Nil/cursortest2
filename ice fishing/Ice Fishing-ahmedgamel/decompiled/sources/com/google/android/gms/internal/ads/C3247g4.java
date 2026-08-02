package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.g4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3247g4 implements InterfaceC3407j4 {

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f31261x = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f31262a;

    /* renamed from: d, reason: collision with root package name */
    public final String f31265d;

    /* renamed from: e, reason: collision with root package name */
    public final int f31266e;

    /* renamed from: f, reason: collision with root package name */
    public final String f31267f;

    /* renamed from: g, reason: collision with root package name */
    public String f31268g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC3566m1 f31269h;
    public InterfaceC3566m1 i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f31273m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f31274n;

    /* renamed from: q, reason: collision with root package name */
    public int f31277q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f31278r;

    /* renamed from: t, reason: collision with root package name */
    public int f31280t;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC3566m1 f31282v;

    /* renamed from: w, reason: collision with root package name */
    public long f31283w;

    /* renamed from: b, reason: collision with root package name */
    public final C4256yr f31263b = new C4256yr(new byte[7], 7);

    /* renamed from: c, reason: collision with root package name */
    public final Cr f31264c = new Cr(Arrays.copyOf(f31261x, 10));

    /* renamed from: o, reason: collision with root package name */
    public int f31275o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f31276p = -1;

    /* renamed from: s, reason: collision with root package name */
    public long f31279s = com.anythink.basead.exoplayer.b.f7168b;

    /* renamed from: u, reason: collision with root package name */
    public long f31281u = com.anythink.basead.exoplayer.b.f7168b;

    /* renamed from: j, reason: collision with root package name */
    public int f31270j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f31271k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f31272l = 256;

    public C3247g4(String str, int i, String str2, boolean z6) {
        this.f31262a = z6;
        this.f31265d = str;
        this.f31266e = i;
        this.f31267f = str2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void a(S0 s02, F4 f42) {
        f42.a();
        f42.b();
        this.f31268g = f42.f25502e;
        f42.b();
        InterfaceC3566m1 C8 = s02.C(f42.f25501d, 1);
        this.f31269h = C8;
        this.f31282v = C8;
        if (!this.f31262a) {
            this.i = new O0();
            return;
        }
        f42.a();
        f42.b();
        InterfaceC3566m1 C9 = s02.C(f42.f25501d, 5);
        this.i = C9;
        C3322hP c3322hP = new C3322hP();
        f42.b();
        c3322hP.f31546a = f42.f25502e;
        c3322hP.d(this.f31267f);
        c3322hP.e(com.anythink.basead.exoplayer.k.o.f9226V);
        C9.e(new DP(c3322hP));
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
    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Cr cr) {
        boolean z6;
        int i;
        int i4;
        int i6;
        byte b9;
        int i9;
        int i10;
        int i11;
        char c9;
        int i12;
        boolean z9;
        int i13;
        int i14;
        int i15;
        ?? r22 = 0;
        int i16 = -1;
        int i17 = 2;
        ?? r52 = 1;
        this.f31269h.getClass();
        String str = AbstractC3182eu.f30782a;
        while (cr.B() > 0) {
            int i18 = this.f31270j;
            C4256yr c4256yr = this.f31263b;
            int i19 = 3;
            int i20 = 4;
            Cr cr2 = this.f31264c;
            if (i18 == 0) {
                int i21 = 7;
                byte[] bArr = cr.f24997a;
                int i22 = cr.f24998b;
                int i23 = cr.f24999c;
                while (true) {
                    if (i22 >= i23) {
                        z6 = r22;
                        i = i16;
                        i4 = i17;
                        boolean z10 = r52 == true ? 1 : 0;
                        cr.E(i22);
                        r52 = r52;
                        break;
                    }
                    i6 = i22 + 1;
                    b9 = bArr[i22];
                    i9 = i19;
                    int i24 = b9 & 255;
                    if (this.f31272l != 512 || (((((byte) i24) & 255) | 65280) & 65526) != 65520) {
                        i = i16;
                        i10 = r52 == true ? 1 : 0;
                    } else {
                        if (this.f31274n) {
                            i = i16;
                            i14 = r52 == true ? 1 : 0;
                            break;
                        }
                        int i25 = i22 - 1;
                        cr.E(i22);
                        byte[] bArr2 = c4256yr.f36016a;
                        if (cr.B() < r52) {
                            i10 = r52 == true ? 1 : 0;
                        } else {
                            cr.H(bArr2, r22, r52 == true ? 1 : 0);
                            c4256yr.d(i20);
                            int h3 = c4256yr.h(r52 == true ? 1 : 0);
                            int i26 = this.f31275o;
                            if (i26 == -1 || h3 == i26) {
                                if (this.f31276p != -1) {
                                    byte[] bArr3 = c4256yr.f36016a;
                                    if (cr.B() < r52) {
                                        i14 = r52 == true ? 1 : 0;
                                        break;
                                    }
                                    cr.H(bArr3, r22, r52 == true ? 1 : 0);
                                    c4256yr.d(2);
                                    i15 = 4;
                                    int h9 = c4256yr.h(4);
                                    i14 = r52 == true ? 1 : 0;
                                    if (h9 == this.f31276p) {
                                        cr.E(i6);
                                    } else {
                                        i10 = i14;
                                    }
                                } else {
                                    i14 = r52 == true ? 1 : 0;
                                    i15 = 4;
                                }
                                byte[] bArr4 = c4256yr.f36016a;
                                if (cr.B() < i15) {
                                    break;
                                }
                                cr.H(bArr4, r22, i15);
                                c4256yr.d(14);
                                int h10 = c4256yr.h(13);
                                if (h10 >= i21) {
                                    byte[] bArr5 = cr.f24997a;
                                    int i27 = cr.f24999c;
                                    int i28 = i25 + h10;
                                    if (i28 >= i27) {
                                        break;
                                    }
                                    byte b10 = bArr5[i28];
                                    i = -1;
                                    if (b10 != -1) {
                                        if (b10 == 73) {
                                            int i29 = i28 + 1;
                                            if (i29 == i27) {
                                                break;
                                            }
                                            if (bArr5[i29] == 68) {
                                                int i30 = i28 + 2;
                                                if (i30 == i27) {
                                                    break;
                                                } else if (bArr5[i30] == 51) {
                                                    break;
                                                }
                                            }
                                        }
                                    } else {
                                        int i31 = i28 + 1;
                                        if (i31 == i27) {
                                            break;
                                        }
                                        byte b11 = bArr5[i31];
                                        if ((((b11 & 255) | 65280) & 65526) == 65520 && ((b11 & 8) >> 3) == h3) {
                                            break;
                                        }
                                    }
                                } else {
                                    i = -1;
                                }
                                i10 = i14;
                            } else {
                                i10 = r52 == true ? 1 : 0;
                                i = -1;
                            }
                        }
                        i = -1;
                    }
                    int i32 = this.f31272l;
                    int i33 = i32 | i24;
                    if (i33 == 329) {
                        i11 = 2;
                        c9 = 256;
                        i12 = 3;
                        z9 = false;
                        i13 = 768;
                    } else if (i33 == 511) {
                        i11 = 2;
                        c9 = 256;
                        i12 = 3;
                        z9 = false;
                        i13 = 512;
                    } else if (i33 == 836) {
                        i11 = 2;
                        c9 = 256;
                        i12 = 3;
                        z9 = false;
                        i13 = 1024;
                    } else {
                        if (i33 == 1075) {
                            i4 = 2;
                            this.f31270j = 2;
                            this.f31271k = 3;
                            z6 = false;
                            this.f31280t = 0;
                            cr2.E(0);
                            cr.E(i6);
                            r52 = i10;
                            break;
                        }
                        c9 = 256;
                        if (i32 != 256) {
                            this.f31272l = 256;
                            i16 = i;
                            r22 = 0;
                            i19 = 3;
                            i20 = 4;
                            i21 = 7;
                            r52 = i10;
                            i17 = 2;
                        } else {
                            i11 = 2;
                            i12 = 3;
                            z9 = false;
                            int i34 = i11;
                            i16 = i;
                            r22 = z9;
                            i19 = i12;
                            r52 = i10;
                            i17 = i34;
                            i22 = i6;
                            i20 = 4;
                            i21 = 7;
                        }
                    }
                    this.f31272l = i13;
                    int i342 = i11;
                    i16 = i;
                    r22 = z9;
                    i19 = i12;
                    r52 = i10;
                    i17 = i342;
                    i22 = i6;
                    i20 = 4;
                    i21 = 7;
                }
                this.f31277q = (b9 & 8) >> 3;
                int i35 = i14;
                this.f31273m = i35 != ((b9 & 1) ^ 1) ? 0 : i35;
                if (this.f31274n) {
                    this.f31270j = i9;
                    this.f31271k = 0;
                } else {
                    this.f31270j = i35;
                    this.f31271k = 0;
                }
                cr.E(i6);
                i16 = i;
                r52 = i35;
                r22 = 0;
                i17 = 2;
            } else if (i18 != r52) {
                if (i18 == i17) {
                    byte[] bArr6 = cr2.f24997a;
                    int min = Math.min(cr.B(), 10 - this.f31271k);
                    cr.H(bArr6, this.f31271k, min);
                    int i36 = this.f31271k + min;
                    this.f31271k = i36;
                    if (i36 == 10) {
                        this.i.a(10, cr2);
                        cr2.E(6);
                        InterfaceC3566m1 interfaceC3566m1 = this.i;
                        int g9 = cr2.g() + 10;
                        this.f31270j = 4;
                        this.f31271k = 10;
                        this.f31282v = interfaceC3566m1;
                        this.f31283w = 0L;
                        this.f31280t = g9;
                    }
                } else if (i18 != 3) {
                    int min2 = Math.min(cr.B(), this.f31280t - this.f31271k);
                    this.f31282v.a(min2, cr);
                    int i37 = this.f31271k + min2;
                    this.f31271k = i37;
                    if (i37 == this.f31280t) {
                        AbstractC2792Sd.H(this.f31281u != com.anythink.basead.exoplayer.b.f7168b ? r52 == true ? 1 : 0 : r22 == true ? 1 : 0);
                        this.f31282v.c(this.f31281u, 1, this.f31280t, 0, null);
                        this.f31281u += this.f31283w;
                        this.f31270j = r22 == true ? 1 : 0;
                        this.f31271k = r22 == true ? 1 : 0;
                        this.f31272l = 256;
                    }
                } else {
                    int i38 = r52 != this.f31273m ? 5 : 7;
                    byte[] bArr7 = c4256yr.f36016a;
                    int min3 = Math.min(cr.B(), i38 - this.f31271k);
                    cr.H(bArr7, this.f31271k, min3);
                    int i39 = this.f31271k + min3;
                    this.f31271k = i39;
                    if (i39 == i38) {
                        c4256yr.d(r22 == true ? 1 : 0);
                        if (this.f31278r) {
                            c4256yr.f(10);
                        } else {
                            int h11 = c4256yr.h(i17) + (r52 == true ? 1 : 0);
                            if (h11 != i17) {
                                StringBuilder sb = new StringBuilder(String.valueOf(h11).length() + 50);
                                sb.append("Detected audio object type: ");
                                sb.append(h11);
                                sb.append(", but assuming AAC LC.");
                                AbstractC2991bG.y("AdtsReader", sb.toString());
                            }
                            c4256yr.f(5);
                            int h12 = c4256yr.h(3);
                            int i40 = this.f31276p;
                            byte b12 = (byte) (((i40 >> 1) & 7) | 16);
                            byte b13 = (byte) (((h12 << 3) & 120) | ((i40 << 7) & 128));
                            byte[] bArr8 = new byte[i17];
                            bArr8[r22 == true ? 1 : 0] = b12;
                            bArr8[r52 == true ? 1 : 0] = b13;
                            C3944t2 p9 = AbstractC2659Kg.p(new C4256yr(bArr8, i17), r22);
                            C3322hP c3322hP = new C3322hP();
                            c3322hP.f31546a = this.f31268g;
                            c3322hP.d(this.f31267f);
                            c3322hP.e(com.anythink.basead.exoplayer.k.o.f9246r);
                            c3322hP.f31554j = (String) p9.f34979v;
                            c3322hP.f31538G = p9.f34978u;
                            c3322hP.f31540I = p9.f34977n;
                            c3322hP.f31561q = Collections.singletonList(bArr8);
                            c3322hP.f31549d = this.f31265d;
                            c3322hP.f31551f = this.f31266e;
                            DP dp = new DP(c3322hP);
                            this.f31279s = 1024000000 / dp.J;
                            this.f31269h.e(dp);
                            this.f31278r = r52;
                        }
                        c4256yr.f(4);
                        int h13 = c4256yr.h(13);
                        int i41 = h13 - 7;
                        if (this.f31273m) {
                            i41 = h13 - 9;
                        }
                        InterfaceC3566m1 interfaceC3566m12 = this.f31269h;
                        long j6 = this.f31279s;
                        this.f31270j = 4;
                        this.f31271k = r22 == true ? 1 : 0;
                        this.f31282v = interfaceC3566m12;
                        this.f31283w = j6;
                        this.f31280t = i41;
                    }
                }
            } else if (cr.B() != 0) {
                c4256yr.f36016a[r22 == true ? 1 : 0] = cr.f24997a[cr.f24998b];
                c4256yr.d(i17);
                int h14 = c4256yr.h(4);
                int i42 = this.f31276p;
                if (i42 == i16 || h14 == i42) {
                    if (!this.f31274n) {
                        this.f31274n = r52;
                        this.f31275o = this.f31277q;
                        this.f31276p = h14;
                    }
                    this.f31270j = 3;
                    this.f31271k = r22 == true ? 1 : 0;
                } else {
                    this.f31274n = r22;
                    this.f31270j = r22 == true ? 1 : 0;
                    this.f31271k = r22 == true ? 1 : 0;
                    this.f31272l = 256;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void c() {
        this.f31281u = com.anythink.basead.exoplayer.b.f7168b;
        this.f31274n = false;
        this.f31270j = 0;
        this.f31271k = 0;
        this.f31272l = 256;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void d(int i, long j6) {
        this.f31281u = j6;
    }
}
