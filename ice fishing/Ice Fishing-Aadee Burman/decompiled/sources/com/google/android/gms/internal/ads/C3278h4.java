package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.h4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3278h4 implements InterfaceC3384j4 {

    /* renamed from: a, reason: collision with root package name */
    public final Cr f30719a;

    /* renamed from: c, reason: collision with root package name */
    public final String f30721c;

    /* renamed from: d, reason: collision with root package name */
    public final int f30722d;

    /* renamed from: f, reason: collision with root package name */
    public String f30724f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC3543m1 f30725g;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f30727j;

    /* renamed from: k, reason: collision with root package name */
    public int f30728k;

    /* renamed from: l, reason: collision with root package name */
    public long f30729l;

    /* renamed from: m, reason: collision with root package name */
    public DP f30730m;

    /* renamed from: n, reason: collision with root package name */
    public int f30731n;

    /* renamed from: o, reason: collision with root package name */
    public int f30732o;

    /* renamed from: p, reason: collision with root package name */
    public int f30733p;

    /* renamed from: s, reason: collision with root package name */
    public boolean f30736s;

    /* renamed from: v, reason: collision with root package name */
    public boolean f30739v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f30740w;

    /* renamed from: h, reason: collision with root package name */
    public int f30726h = 0;

    /* renamed from: t, reason: collision with root package name */
    public long f30737t = com.anythink.basead.exoplayer.b.f6382b;

    /* renamed from: u, reason: collision with root package name */
    public long f30738u = com.anythink.basead.exoplayer.b.f6382b;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f30720b = new AtomicInteger();

    /* renamed from: q, reason: collision with root package name */
    public int f30734q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f30735r = -1;

    /* renamed from: e, reason: collision with root package name */
    public final String f30723e = "video/mp2t";

    public C3278h4(String str, int i, int i6) {
        this.f30719a = new Cr(new byte[i6]);
        this.f30721c = str;
        this.f30722d = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void a(S0 s02, F4 f42) {
        f42.a();
        f42.b();
        this.f30724f = f42.f24746e;
        f42.b();
        this.f30725g = s02.C(f42.f24745d, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void b(Cr cr) {
        int i;
        int i6;
        int i9;
        byte b9;
        int i10;
        int i11;
        int i12;
        long j6;
        int i13;
        int i14;
        int i15;
        int i16 = 4;
        boolean z3 = true;
        this.f30725g.getClass();
        while (cr.B() > 0) {
            int i17 = this.f30726h;
            Cr cr2 = this.f30719a;
            int i18 = 2;
            switch (i17) {
                case 0:
                    while (true) {
                        if (cr.B() > 0) {
                            int i19 = this.f30728k << 8;
                            this.f30728k = i19;
                            int K7 = i19 | cr.K();
                            this.f30728k = K7;
                            int o6 = AbstractC2968bG.o(K7);
                            this.f30733p = o6;
                            if (o6 != 0) {
                                g(this.f30728k);
                                this.f30728k = 0;
                                if (this.f30740w && this.f30733p == 2) {
                                    this.i = 0;
                                } else {
                                    int i20 = this.f30733p;
                                    if (i20 == 1) {
                                        this.f30740w = false;
                                        i = 1;
                                        i20 = 1;
                                    } else {
                                        i = i20;
                                    }
                                    if (i20 == 3 || i20 == 4) {
                                        this.f30726h = 4;
                                    } else if (i == 1) {
                                        this.f30726h = 1;
                                    } else {
                                        this.f30726h = 2;
                                    }
                                    z3 = true;
                                    i16 = 4;
                                }
                            }
                        }
                    }
                    i16 = 4;
                    z3 = true;
                    break;
                case 1:
                    int i21 = i16;
                    if (f(cr, cr2.f24252a, 18)) {
                        this.f30739v = z3;
                        byte[] bArr = cr2.f24252a;
                        if (this.f30730m == null) {
                            String str = this.f30724f;
                            C4233yr S8 = AbstractC2968bG.S(bArr);
                            S8.f(60);
                            int i22 = AbstractC2968bG.f29271n[S8.h(6)];
                            int i23 = AbstractC2968bG.f29272u[S8.h(i21)];
                            int h9 = S8.h(5);
                            int i24 = h9 >= 29 ? -1 : (AbstractC2968bG.f29273v[h9] * 1000) / 2;
                            S8.f(10);
                            int i25 = i22 + (S8.h(2) > 0 ? 1 : 0);
                            C3299hP c3299hP = new C3299hP();
                            c3299hP.f30780a = str;
                            c3299hP.d("video/mp2t");
                            c3299hP.e(com.anythink.basead.exoplayer.k.o.f8423D);
                            c3299hP.f30787h = i24;
                            c3299hP.f30772G = i25;
                            c3299hP.f30774I = i23;
                            c3299hP.f30796r = null;
                            c3299hP.f30783d = this.f30721c;
                            c3299hP.f30785f = this.f30722d;
                            this.f30730m = new DP(c3299hP);
                            this.f30736s = true;
                        }
                        this.f30731n = AbstractC2968bG.B(bArr);
                        byte b10 = bArr[0];
                        if (b10 != -2) {
                            if (b10 == -1) {
                                i9 = (bArr[4] & 7) << 4;
                                b9 = bArr[7];
                            } else if (b10 != 31) {
                                i9 = (bArr[4] & 1) << 6;
                                i10 = bArr[5] & 252;
                                i6 = (i10 >> 2) | i9;
                            } else {
                                i9 = (bArr[5] & 7) << 4;
                                b9 = bArr[6];
                            }
                            i10 = b9 & 60;
                            i6 = (i10 >> 2) | i9;
                        } else {
                            i6 = ((bArr[4] & 252) >> 2) | ((bArr[5] & 1) << 6);
                        }
                        this.f30729l = UC.a(AbstractC3159eu.v(this.f30730m.J, (i6 + 1) * 32));
                        cr2.E(0);
                        this.f30725g.a(18, cr2);
                        this.f30726h = 6;
                        i16 = 4;
                        z3 = true;
                    } else {
                        i16 = 4;
                    }
                case 2:
                    i11 = i16;
                    if (f(cr, cr2.f24252a, 7)) {
                        C4233yr S9 = AbstractC2968bG.S(cr2.f24252a);
                        S9.f(42);
                        z3 = true;
                        this.f30734q = S9.h(true != S9.g() ? 8 : 12) + 1;
                        this.f30726h = 3;
                        i16 = i11;
                    } else {
                        i16 = i11;
                        z3 = true;
                    }
                case 3:
                    i11 = i16;
                    if (f(cr, cr2.f24252a, this.f30734q)) {
                        P0 G7 = AbstractC2968bG.G(cr2.f24252a);
                        h(G7);
                        this.f30731n = G7.f26709d;
                        long j9 = G7.f26710e;
                        if (j9 != com.anythink.basead.exoplayer.b.f6382b) {
                            this.f30729l = j9;
                        }
                        cr2.E(0);
                        this.f30725g.a(this.f30734q, cr2);
                        this.f30726h = 6;
                    }
                    i16 = i11;
                    z3 = true;
                case 4:
                    i11 = i16;
                    if (f(cr, cr2.f24252a, 6)) {
                        C4233yr S10 = AbstractC2968bG.S(cr2.f24252a);
                        S10.f(32);
                        int R8 = AbstractC2968bG.R(S10, AbstractC2968bG.f29253B) + 1;
                        this.f30735r = R8;
                        int i26 = this.i;
                        if (i26 > R8) {
                            int i27 = i26 - R8;
                            this.i = i26 - i27;
                            cr.E(cr.f24253b - i27);
                        }
                        this.f30726h = 5;
                    }
                    i16 = i11;
                    z3 = true;
                case 5:
                    if (f(cr, cr2.f24252a, this.f30735r)) {
                        AtomicInteger atomicInteger = this.f30720b;
                        byte[] bArr2 = cr2.f24252a;
                        C4233yr S11 = AbstractC2968bG.S(bArr2);
                        int h10 = S11.h(32);
                        int R9 = AbstractC2968bG.R(S11, AbstractC2968bG.f29275x);
                        int i28 = R9 + 1;
                        char c9 = h10 == 1078008818 ? z3 ? 1 : 0 : (char) 0;
                        if (c9 == 0) {
                            i11 = i16;
                            i12 = -2147483647;
                            j6 = -9223372036854775807L;
                        } else {
                            if (!S11.g()) {
                                throw U4.c("Only supports full channel mask-based audio presentation");
                            }
                            int i29 = R9 - 1;
                            i11 = i16;
                            int i30 = bArr2[i29] << 8;
                            boolean z6 = bArr2[R9] & 255;
                            String str2 = AbstractC3159eu.f29993a;
                            int i31 = 0;
                            char c10 = 65535;
                            while (i31 < i29) {
                                byte b11 = bArr2[i31];
                                boolean z9 = z3;
                                int i32 = ((c10 >> '\f') ^ ((b11 & 255) >> 4)) & com.anythink.basead.exoplayer.k.p.f8473b;
                                int[] iArr = AbstractC3159eu.f30000h;
                                char c11 = (char) (iArr[i32] ^ ((char) (c10 << 4)));
                                c10 = (char) (((char) (c11 << 4)) ^ iArr[((b11 & 15) ^ (c11 >> '\f')) & com.anythink.basead.exoplayer.k.p.f8473b]);
                                i31++;
                                z3 = z9;
                            }
                            boolean z10 = z3;
                            if ((((char) i30) | z6) != c10) {
                                throw U4.a(null, "CRC check failed");
                            }
                            int h11 = S11.h(2);
                            if (h11 == 0) {
                                i13 = 512;
                            } else if (h11 == z10) {
                                i13 = 480;
                            } else {
                                if (h11 != 2) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(h11).length() + 51);
                                    sb.append("Unsupported base duration index in DTS UHD header: ");
                                    sb.append(h11);
                                    throw U4.a(null, sb.toString());
                                }
                                i13 = 384;
                            }
                            int h12 = S11.h(3) + 1;
                            int h13 = S11.h(2);
                            if (h13 == 0) {
                                i14 = 32000;
                            } else if (h13 == 1) {
                                i14 = 44100;
                            } else {
                                if (h13 != 2) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(h13).length() + 48);
                                    sb2.append("Unsupported clock rate index in DTS UHD header: ");
                                    sb2.append(h13);
                                    throw U4.a(null, sb2.toString());
                                }
                                i14 = 48000;
                            }
                            if (S11.g()) {
                                S11.f(36);
                            }
                            i12 = (1 << S11.h(2)) * i14;
                            j6 = AbstractC3159eu.w(i13 * h12, 1000000L, i14, RoundingMode.DOWN);
                        }
                        int i33 = i12;
                        int i34 = 0;
                        for (char c12 = 0; c12 < c9; c12 = 1) {
                            i34 += AbstractC2968bG.R(S11, AbstractC2968bG.f29276y);
                        }
                        for (int i35 = 0; i35 <= 0; i35++) {
                            if (c9 != 0) {
                                atomicInteger.set(AbstractC2968bG.R(S11, AbstractC2968bG.f29277z));
                            }
                            i34 += atomicInteger.get() != 0 ? AbstractC2968bG.R(S11, AbstractC2968bG.f29252A) : 0;
                        }
                        int i36 = i28 + i34;
                        P0 p02 = new P0("audio/vnd.dts.uhd;profile=p2", 2, i33, i36, j6);
                        if (this.f30733p == 3) {
                            h(p02);
                        }
                        this.f30731n = i36;
                        if (j6 == com.anythink.basead.exoplayer.b.f6382b) {
                            j6 = 0;
                        }
                        this.f30729l = j6;
                        cr2.E(0);
                        this.f30725g.a(this.f30735r, cr2);
                        this.f30726h = 6;
                        i16 = i11;
                        z3 = true;
                    } else {
                        continue;
                    }
                case 6:
                    int min = Math.min(cr.B(), this.f30731n - this.i);
                    this.f30725g.a(min, cr);
                    int i37 = this.i + min;
                    this.i = i37;
                    int i38 = this.f30731n;
                    if (i37 == i38) {
                        if (this.f30733p == z3) {
                            this.f30732o = i38;
                            this.i = 0;
                            this.f30727j = 0;
                            this.f30726h = 7;
                        } else {
                            AbstractC2772Sd.H(this.f30737t != com.anythink.basead.exoplayer.b.f6382b ? z3 ? 1 : 0 : false);
                            int i39 = this.f30731n;
                            int i40 = this.f30733p;
                            if (i40 == 2) {
                                i15 = this.f30732o;
                            } else {
                                i18 = i40;
                                i15 = 0;
                            }
                            int i41 = i39 + i15;
                            long j10 = this.f30737t;
                            this.f30725g.c(j10, i18 == i16 ? 0 : z3 ? 1 : 0, i41, 0, null);
                            this.f30737t += this.f30729l;
                            long j11 = this.f30738u;
                            if (j11 != com.anythink.basead.exoplayer.b.f6382b) {
                                if (j11 != j10) {
                                    this.f30737t = j11;
                                }
                                this.f30738u = com.anythink.basead.exoplayer.b.f6382b;
                            }
                            this.f30732o = 0;
                            this.f30726h = 0;
                        }
                    }
                default:
                    while (cr.B() > 0 && this.i < i16) {
                        int i42 = this.f30727j << 8;
                        this.f30727j = i42;
                        this.f30727j = i42 | cr.K();
                        this.i += z3 ? 1 : 0;
                    }
                    if (this.i == i16) {
                        if (AbstractC2968bG.o(this.f30727j) == 2) {
                            g(this.f30727j);
                            this.f30733p = 2;
                            this.f30727j = 0;
                            this.f30726h = 2;
                        } else {
                            if (this.f30736s) {
                                InterfaceC3543m1 interfaceC3543m1 = this.f30725g;
                                DP dp = this.f30730m;
                                dp.getClass();
                                interfaceC3543m1.e(dp);
                                this.f30736s = false;
                            }
                            AbstractC2772Sd.H(this.f30737t != com.anythink.basead.exoplayer.b.f6382b ? z3 ? 1 : 0 : false);
                            long j12 = this.f30737t;
                            this.f30725g.c(j12, 1, this.f30732o, 0, null);
                            this.f30737t += this.f30729l;
                            long j13 = this.f30738u;
                            if (j13 != com.anythink.basead.exoplayer.b.f6382b) {
                                if (j13 != j12) {
                                    this.f30737t = j13;
                                }
                                this.f30738u = com.anythink.basead.exoplayer.b.f6382b;
                            }
                            this.f30732o = 0;
                            int i43 = this.f30727j;
                            this.f30728k = i43;
                            this.f30727j = 0;
                            int o9 = AbstractC2968bG.o(i43);
                            this.f30733p = o9;
                            if (o9 == 3 || o9 == i16) {
                                g(i43);
                                this.f30728k = 0;
                                this.f30726h = i16;
                            } else if (o9 == z3) {
                                g(i43);
                                this.f30728k = 0;
                                this.f30726h = z3 ? 1 : 0;
                            } else {
                                this.i = 0;
                                this.f30726h = 0;
                            }
                        }
                    }
                    break;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void c() {
        this.f30726h = 0;
        this.i = 0;
        this.f30728k = 0;
        this.f30727j = 0;
        this.f30732o = 0;
        this.f30737t = com.anythink.basead.exoplayer.b.f6382b;
        this.f30738u = com.anythink.basead.exoplayer.b.f6382b;
        this.f30720b.set(0);
        this.f30736s = false;
        this.f30740w = this.f30739v;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void d(int i, long j6) {
        if (j6 != com.anythink.basead.exoplayer.b.f6382b) {
            if (this.f30726h != 0) {
                this.f30738u = j6;
            } else {
                this.f30737t = j6;
                this.f30738u = com.anythink.basead.exoplayer.b.f6382b;
            }
        }
    }

    public final boolean f(Cr cr, byte[] bArr, int i) {
        int min = Math.min(cr.B(), i - this.i);
        cr.H(bArr, this.i, min);
        int i6 = this.i + min;
        this.i = i6;
        return i6 == i;
    }

    public final void g(int i) {
        byte b9 = (byte) ((i >> 24) & com.anythink.basead.exoplayer.k.p.f8473b);
        byte[] bArr = this.f30719a.f24252a;
        bArr[0] = b9;
        bArr[1] = (byte) ((i >> 16) & com.anythink.basead.exoplayer.k.p.f8473b);
        bArr[2] = (byte) ((i >> 8) & com.anythink.basead.exoplayer.k.p.f8473b);
        bArr[3] = (byte) (i & com.anythink.basead.exoplayer.k.p.f8473b);
        this.i = 4;
    }

    public final void h(P0 p02) {
        int i;
        int i6 = p02.f26707b;
        if (i6 == -2147483647 || (i = p02.f26708c) == -1) {
            return;
        }
        String str = p02.f26706a;
        if (str == null) {
            DP dp = this.f30730m;
            str = dp != null ? dp.f24431o : null;
        }
        DP dp2 = this.f30730m;
        if (dp2 != null && !this.f30736s && i == dp2.f24409H && i6 == dp2.J && Objects.equals(str, dp2.f24431o)) {
            return;
        }
        DP dp3 = this.f30730m;
        C3299hP c3299hP = dp3 == null ? new C3299hP() : new C3299hP(dp3);
        c3299hP.f30780a = this.f30724f;
        c3299hP.d(this.f30723e);
        c3299hP.e(str);
        c3299hP.f30772G = i;
        c3299hP.f30774I = i6;
        c3299hP.f30783d = this.f30721c;
        c3299hP.f30785f = this.f30722d;
        DP dp4 = new DP(c3299hP);
        this.f30730m = dp4;
        this.f30725g.e(dp4);
        this.f30736s = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void p() {
        if (this.f30726h == 7) {
            InterfaceC3543m1 interfaceC3543m1 = this.f30725g;
            interfaceC3543m1.getClass();
            if (this.f30736s) {
                DP dp = this.f30730m;
                dp.getClass();
                interfaceC3543m1.e(dp);
                this.f30736s = false;
            }
            long j6 = this.f30737t;
            if (j6 != com.anythink.basead.exoplayer.b.f6382b) {
                this.f30725g.c(j6, 1, this.f30732o, 0, null);
                this.f30737t += this.f30729l;
            }
            this.f30732o = 0;
            this.i = 0;
            this.f30728k = 0;
            this.f30727j = 0;
            this.f30726h = 0;
        }
    }
}
