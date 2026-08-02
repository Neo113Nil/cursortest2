package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.h4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3301h4 implements InterfaceC3407j4 {

    /* renamed from: a, reason: collision with root package name */
    public final Cr f31485a;

    /* renamed from: c, reason: collision with root package name */
    public final String f31487c;

    /* renamed from: d, reason: collision with root package name */
    public final int f31488d;

    /* renamed from: f, reason: collision with root package name */
    public String f31490f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC3566m1 f31491g;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f31493j;

    /* renamed from: k, reason: collision with root package name */
    public int f31494k;

    /* renamed from: l, reason: collision with root package name */
    public long f31495l;

    /* renamed from: m, reason: collision with root package name */
    public DP f31496m;

    /* renamed from: n, reason: collision with root package name */
    public int f31497n;

    /* renamed from: o, reason: collision with root package name */
    public int f31498o;

    /* renamed from: p, reason: collision with root package name */
    public int f31499p;

    /* renamed from: s, reason: collision with root package name */
    public boolean f31502s;

    /* renamed from: v, reason: collision with root package name */
    public boolean f31505v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f31506w;

    /* renamed from: h, reason: collision with root package name */
    public int f31492h = 0;

    /* renamed from: t, reason: collision with root package name */
    public long f31503t = com.anythink.basead.exoplayer.b.f7168b;

    /* renamed from: u, reason: collision with root package name */
    public long f31504u = com.anythink.basead.exoplayer.b.f7168b;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f31486b = new AtomicInteger();

    /* renamed from: q, reason: collision with root package name */
    public int f31500q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f31501r = -1;

    /* renamed from: e, reason: collision with root package name */
    public final String f31489e = "video/mp2t";

    public C3301h4(String str, int i, int i4) {
        this.f31485a = new Cr(new byte[i4]);
        this.f31487c = str;
        this.f31488d = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void a(S0 s02, F4 f42) {
        f42.a();
        f42.b();
        this.f31490f = f42.f25502e;
        f42.b();
        this.f31491g = s02.C(f42.f25501d, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void b(Cr cr) {
        int i;
        int i4;
        int i6;
        byte b9;
        int i9;
        int i10;
        int i11;
        long j6;
        int i12;
        int i13;
        int i14;
        int i15 = 4;
        boolean z6 = true;
        this.f31491g.getClass();
        while (cr.B() > 0) {
            int i16 = this.f31492h;
            Cr cr2 = this.f31485a;
            int i17 = 2;
            switch (i16) {
                case 0:
                    while (true) {
                        if (cr.B() > 0) {
                            int i18 = this.f31494k << 8;
                            this.f31494k = i18;
                            int K7 = i18 | cr.K();
                            this.f31494k = K7;
                            int o4 = AbstractC2991bG.o(K7);
                            this.f31499p = o4;
                            if (o4 != 0) {
                                g(this.f31494k);
                                this.f31494k = 0;
                                if (this.f31506w && this.f31499p == 2) {
                                    this.i = 0;
                                } else {
                                    int i19 = this.f31499p;
                                    if (i19 == 1) {
                                        this.f31506w = false;
                                        i = 1;
                                        i19 = 1;
                                    } else {
                                        i = i19;
                                    }
                                    if (i19 == 3 || i19 == 4) {
                                        this.f31492h = 4;
                                    } else if (i == 1) {
                                        this.f31492h = 1;
                                    } else {
                                        this.f31492h = 2;
                                    }
                                    z6 = true;
                                    i15 = 4;
                                }
                            }
                        }
                    }
                    i15 = 4;
                    z6 = true;
                    break;
                case 1:
                    int i20 = i15;
                    if (f(cr, cr2.f24997a, 18)) {
                        this.f31505v = z6;
                        byte[] bArr = cr2.f24997a;
                        if (this.f31496m == null) {
                            String str = this.f31490f;
                            C4256yr S8 = AbstractC2991bG.S(bArr);
                            S8.f(60);
                            int i21 = AbstractC2991bG.f30059n[S8.h(6)];
                            int i22 = AbstractC2991bG.f30060u[S8.h(i20)];
                            int h3 = S8.h(5);
                            int i23 = h3 >= 29 ? -1 : (AbstractC2991bG.f30061v[h3] * 1000) / 2;
                            S8.f(10);
                            int i24 = i21 + (S8.h(2) > 0 ? 1 : 0);
                            C3322hP c3322hP = new C3322hP();
                            c3322hP.f31546a = str;
                            c3322hP.d("video/mp2t");
                            c3322hP.e(com.anythink.basead.exoplayer.k.o.f9209D);
                            c3322hP.f31553h = i23;
                            c3322hP.f31538G = i24;
                            c3322hP.f31540I = i22;
                            c3322hP.f31562r = null;
                            c3322hP.f31549d = this.f31487c;
                            c3322hP.f31551f = this.f31488d;
                            this.f31496m = new DP(c3322hP);
                            this.f31502s = true;
                        }
                        this.f31497n = AbstractC2991bG.B(bArr);
                        byte b10 = bArr[0];
                        if (b10 != -2) {
                            if (b10 == -1) {
                                i6 = (bArr[4] & 7) << 4;
                                b9 = bArr[7];
                            } else if (b10 != 31) {
                                i6 = (bArr[4] & 1) << 6;
                                i9 = bArr[5] & 252;
                                i4 = (i9 >> 2) | i6;
                            } else {
                                i6 = (bArr[5] & 7) << 4;
                                b9 = bArr[6];
                            }
                            i9 = b9 & 60;
                            i4 = (i9 >> 2) | i6;
                        } else {
                            i4 = ((bArr[4] & 252) >> 2) | ((bArr[5] & 1) << 6);
                        }
                        this.f31495l = UC.a(AbstractC3182eu.v(this.f31496m.J, (i4 + 1) * 32));
                        cr2.E(0);
                        this.f31491g.a(18, cr2);
                        this.f31492h = 6;
                        i15 = 4;
                        z6 = true;
                    } else {
                        i15 = 4;
                    }
                case 2:
                    i10 = i15;
                    if (f(cr, cr2.f24997a, 7)) {
                        C4256yr S9 = AbstractC2991bG.S(cr2.f24997a);
                        S9.f(42);
                        z6 = true;
                        this.f31500q = S9.h(true != S9.g() ? 8 : 12) + 1;
                        this.f31492h = 3;
                        i15 = i10;
                    } else {
                        i15 = i10;
                        z6 = true;
                    }
                case 3:
                    i10 = i15;
                    if (f(cr, cr2.f24997a, this.f31500q)) {
                        P0 G2 = AbstractC2991bG.G(cr2.f24997a);
                        h(G2);
                        this.f31497n = G2.f27492d;
                        long j9 = G2.f27493e;
                        if (j9 != com.anythink.basead.exoplayer.b.f7168b) {
                            this.f31495l = j9;
                        }
                        cr2.E(0);
                        this.f31491g.a(this.f31500q, cr2);
                        this.f31492h = 6;
                    }
                    i15 = i10;
                    z6 = true;
                case 4:
                    i10 = i15;
                    if (f(cr, cr2.f24997a, 6)) {
                        C4256yr S10 = AbstractC2991bG.S(cr2.f24997a);
                        S10.f(32);
                        int R8 = AbstractC2991bG.R(S10, AbstractC2991bG.f30041B) + 1;
                        this.f31501r = R8;
                        int i25 = this.i;
                        if (i25 > R8) {
                            int i26 = i25 - R8;
                            this.i = i25 - i26;
                            cr.E(cr.f24998b - i26);
                        }
                        this.f31492h = 5;
                    }
                    i15 = i10;
                    z6 = true;
                case 5:
                    if (f(cr, cr2.f24997a, this.f31501r)) {
                        AtomicInteger atomicInteger = this.f31486b;
                        byte[] bArr2 = cr2.f24997a;
                        C4256yr S11 = AbstractC2991bG.S(bArr2);
                        int h9 = S11.h(32);
                        int R9 = AbstractC2991bG.R(S11, AbstractC2991bG.f30063x);
                        int i27 = R9 + 1;
                        char c9 = h9 == 1078008818 ? z6 ? 1 : 0 : (char) 0;
                        if (c9 == 0) {
                            i10 = i15;
                            i11 = -2147483647;
                            j6 = -9223372036854775807L;
                        } else {
                            if (!S11.g()) {
                                throw U4.c("Only supports full channel mask-based audio presentation");
                            }
                            int i28 = R9 - 1;
                            i10 = i15;
                            int i29 = bArr2[i28] << 8;
                            boolean z9 = bArr2[R9] & 255;
                            String str2 = AbstractC3182eu.f30782a;
                            int i30 = 0;
                            char c10 = 65535;
                            while (i30 < i28) {
                                byte b11 = bArr2[i30];
                                boolean z10 = z6;
                                int i31 = ((c10 >> '\f') ^ ((b11 & 255) >> 4)) & com.anythink.basead.exoplayer.k.p.f9259b;
                                int[] iArr = AbstractC3182eu.f30789h;
                                char c11 = (char) (iArr[i31] ^ ((char) (c10 << 4)));
                                c10 = (char) (((char) (c11 << 4)) ^ iArr[((b11 & 15) ^ (c11 >> '\f')) & com.anythink.basead.exoplayer.k.p.f9259b]);
                                i30++;
                                z6 = z10;
                            }
                            boolean z11 = z6;
                            if ((((char) i29) | z9) != c10) {
                                throw U4.a(null, "CRC check failed");
                            }
                            int h10 = S11.h(2);
                            if (h10 == 0) {
                                i12 = 512;
                            } else if (h10 == z11) {
                                i12 = 480;
                            } else {
                                if (h10 != 2) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(h10).length() + 51);
                                    sb.append("Unsupported base duration index in DTS UHD header: ");
                                    sb.append(h10);
                                    throw U4.a(null, sb.toString());
                                }
                                i12 = 384;
                            }
                            int h11 = S11.h(3) + 1;
                            int h12 = S11.h(2);
                            if (h12 == 0) {
                                i13 = 32000;
                            } else if (h12 == 1) {
                                i13 = 44100;
                            } else {
                                if (h12 != 2) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(h12).length() + 48);
                                    sb2.append("Unsupported clock rate index in DTS UHD header: ");
                                    sb2.append(h12);
                                    throw U4.a(null, sb2.toString());
                                }
                                i13 = 48000;
                            }
                            if (S11.g()) {
                                S11.f(36);
                            }
                            i11 = (1 << S11.h(2)) * i13;
                            j6 = AbstractC3182eu.w(i12 * h11, 1000000L, i13, RoundingMode.DOWN);
                        }
                        int i32 = i11;
                        int i33 = 0;
                        for (char c12 = 0; c12 < c9; c12 = 1) {
                            i33 += AbstractC2991bG.R(S11, AbstractC2991bG.f30064y);
                        }
                        for (int i34 = 0; i34 <= 0; i34++) {
                            if (c9 != 0) {
                                atomicInteger.set(AbstractC2991bG.R(S11, AbstractC2991bG.f30065z));
                            }
                            i33 += atomicInteger.get() != 0 ? AbstractC2991bG.R(S11, AbstractC2991bG.f30040A) : 0;
                        }
                        int i35 = i27 + i33;
                        P0 p02 = new P0("audio/vnd.dts.uhd;profile=p2", 2, i32, i35, j6);
                        if (this.f31499p == 3) {
                            h(p02);
                        }
                        this.f31497n = i35;
                        if (j6 == com.anythink.basead.exoplayer.b.f7168b) {
                            j6 = 0;
                        }
                        this.f31495l = j6;
                        cr2.E(0);
                        this.f31491g.a(this.f31501r, cr2);
                        this.f31492h = 6;
                        i15 = i10;
                        z6 = true;
                    } else {
                        continue;
                    }
                case 6:
                    int min = Math.min(cr.B(), this.f31497n - this.i);
                    this.f31491g.a(min, cr);
                    int i36 = this.i + min;
                    this.i = i36;
                    int i37 = this.f31497n;
                    if (i36 == i37) {
                        if (this.f31499p == z6) {
                            this.f31498o = i37;
                            this.i = 0;
                            this.f31493j = 0;
                            this.f31492h = 7;
                        } else {
                            AbstractC2792Sd.H(this.f31503t != com.anythink.basead.exoplayer.b.f7168b ? z6 ? 1 : 0 : false);
                            int i38 = this.f31497n;
                            int i39 = this.f31499p;
                            if (i39 == 2) {
                                i14 = this.f31498o;
                            } else {
                                i17 = i39;
                                i14 = 0;
                            }
                            int i40 = i38 + i14;
                            long j10 = this.f31503t;
                            this.f31491g.c(j10, i17 == i15 ? 0 : z6 ? 1 : 0, i40, 0, null);
                            this.f31503t += this.f31495l;
                            long j11 = this.f31504u;
                            if (j11 != com.anythink.basead.exoplayer.b.f7168b) {
                                if (j11 != j10) {
                                    this.f31503t = j11;
                                }
                                this.f31504u = com.anythink.basead.exoplayer.b.f7168b;
                            }
                            this.f31498o = 0;
                            this.f31492h = 0;
                        }
                    }
                default:
                    while (cr.B() > 0 && this.i < i15) {
                        int i41 = this.f31493j << 8;
                        this.f31493j = i41;
                        this.f31493j = i41 | cr.K();
                        this.i += z6 ? 1 : 0;
                    }
                    if (this.i == i15) {
                        if (AbstractC2991bG.o(this.f31493j) == 2) {
                            g(this.f31493j);
                            this.f31499p = 2;
                            this.f31493j = 0;
                            this.f31492h = 2;
                        } else {
                            if (this.f31502s) {
                                InterfaceC3566m1 interfaceC3566m1 = this.f31491g;
                                DP dp = this.f31496m;
                                dp.getClass();
                                interfaceC3566m1.e(dp);
                                this.f31502s = false;
                            }
                            AbstractC2792Sd.H(this.f31503t != com.anythink.basead.exoplayer.b.f7168b ? z6 ? 1 : 0 : false);
                            long j12 = this.f31503t;
                            this.f31491g.c(j12, 1, this.f31498o, 0, null);
                            this.f31503t += this.f31495l;
                            long j13 = this.f31504u;
                            if (j13 != com.anythink.basead.exoplayer.b.f7168b) {
                                if (j13 != j12) {
                                    this.f31503t = j13;
                                }
                                this.f31504u = com.anythink.basead.exoplayer.b.f7168b;
                            }
                            this.f31498o = 0;
                            int i42 = this.f31493j;
                            this.f31494k = i42;
                            this.f31493j = 0;
                            int o6 = AbstractC2991bG.o(i42);
                            this.f31499p = o6;
                            if (o6 == 3 || o6 == i15) {
                                g(i42);
                                this.f31494k = 0;
                                this.f31492h = i15;
                            } else if (o6 == z6) {
                                g(i42);
                                this.f31494k = 0;
                                this.f31492h = z6 ? 1 : 0;
                            } else {
                                this.i = 0;
                                this.f31492h = 0;
                            }
                        }
                    }
                    break;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void c() {
        this.f31492h = 0;
        this.i = 0;
        this.f31494k = 0;
        this.f31493j = 0;
        this.f31498o = 0;
        this.f31503t = com.anythink.basead.exoplayer.b.f7168b;
        this.f31504u = com.anythink.basead.exoplayer.b.f7168b;
        this.f31486b.set(0);
        this.f31502s = false;
        this.f31506w = this.f31505v;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void d(int i, long j6) {
        if (j6 != com.anythink.basead.exoplayer.b.f7168b) {
            if (this.f31492h != 0) {
                this.f31504u = j6;
            } else {
                this.f31503t = j6;
                this.f31504u = com.anythink.basead.exoplayer.b.f7168b;
            }
        }
    }

    public final boolean f(Cr cr, byte[] bArr, int i) {
        int min = Math.min(cr.B(), i - this.i);
        cr.H(bArr, this.i, min);
        int i4 = this.i + min;
        this.i = i4;
        return i4 == i;
    }

    public final void g(int i) {
        byte b9 = (byte) ((i >> 24) & com.anythink.basead.exoplayer.k.p.f9259b);
        byte[] bArr = this.f31485a.f24997a;
        bArr[0] = b9;
        bArr[1] = (byte) ((i >> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr[2] = (byte) ((i >> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr[3] = (byte) (i & com.anythink.basead.exoplayer.k.p.f9259b);
        this.i = 4;
    }

    public final void h(P0 p02) {
        int i;
        int i4 = p02.f27490b;
        if (i4 == -2147483647 || (i = p02.f27491c) == -1) {
            return;
        }
        String str = p02.f27489a;
        if (str == null) {
            DP dp = this.f31496m;
            str = dp != null ? dp.f25176o : null;
        }
        DP dp2 = this.f31496m;
        if (dp2 != null && !this.f31502s && i == dp2.f25154H && i4 == dp2.J && Objects.equals(str, dp2.f25176o)) {
            return;
        }
        DP dp3 = this.f31496m;
        C3322hP c3322hP = dp3 == null ? new C3322hP() : new C3322hP(dp3);
        c3322hP.f31546a = this.f31490f;
        c3322hP.d(this.f31489e);
        c3322hP.e(str);
        c3322hP.f31538G = i;
        c3322hP.f31540I = i4;
        c3322hP.f31549d = this.f31487c;
        c3322hP.f31551f = this.f31488d;
        DP dp4 = new DP(c3322hP);
        this.f31496m = dp4;
        this.f31491g.e(dp4);
        this.f31502s = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void p() {
        if (this.f31492h == 7) {
            InterfaceC3566m1 interfaceC3566m1 = this.f31491g;
            interfaceC3566m1.getClass();
            if (this.f31502s) {
                DP dp = this.f31496m;
                dp.getClass();
                interfaceC3566m1.e(dp);
                this.f31502s = false;
            }
            long j6 = this.f31503t;
            if (j6 != com.anythink.basead.exoplayer.b.f7168b) {
                this.f31491g.c(j6, 1, this.f31498o, 0, null);
                this.f31503t += this.f31495l;
            }
            this.f31498o = 0;
            this.i = 0;
            this.f31494k = 0;
            this.f31493j = 0;
            this.f31492h = 0;
        }
    }
}
