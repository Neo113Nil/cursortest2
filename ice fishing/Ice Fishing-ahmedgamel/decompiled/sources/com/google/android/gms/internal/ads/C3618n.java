package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3618n extends AbstractC3510l {

    /* renamed from: A, reason: collision with root package name */
    public final boolean f33415A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f33416B;

    /* renamed from: C, reason: collision with root package name */
    public final int f33417C;

    /* renamed from: D, reason: collision with root package name */
    public final int f33418D;

    /* renamed from: E, reason: collision with root package name */
    public final int f33419E;

    /* renamed from: F, reason: collision with root package name */
    public final int f33420F;

    /* renamed from: G, reason: collision with root package name */
    public final int f33421G;

    /* renamed from: H, reason: collision with root package name */
    public final int f33422H;

    /* renamed from: I, reason: collision with root package name */
    public final int f33423I;
    public final boolean J;

    /* renamed from: K, reason: collision with root package name */
    public final int f33424K;

    /* renamed from: L, reason: collision with root package name */
    public final int f33425L;

    /* renamed from: M, reason: collision with root package name */
    public final boolean f33426M;

    /* renamed from: N, reason: collision with root package name */
    public final boolean f33427N;

    /* renamed from: O, reason: collision with root package name */
    public final boolean f33428O;

    /* renamed from: P, reason: collision with root package name */
    public final int f33429P;

    /* renamed from: Q, reason: collision with root package name */
    public final boolean f33430Q;

    /* renamed from: R, reason: collision with root package name */
    public final String f33431R;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f33432x;

    /* renamed from: y, reason: collision with root package name */
    public final C3350i f33433y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f33434z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x010f A[EDGE_INSN: B:162:0x010f->B:82:0x010f BREAK  A[LOOP:1: B:75:0x00f9->B:160:0x010d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3618n(int i, A8 a82, int i4, C3350i c3350i, int i6, String str, boolean z6) {
        super(i, a82, i4);
        boolean z9;
        boolean z10;
        int i9;
        C3523lC c3523lC;
        int i10;
        int i11;
        String str2;
        int i12;
        int i13;
        int i14;
        C3523lC c3523lC2;
        boolean z11;
        boolean z12;
        int i15;
        char c9;
        boolean z13;
        DP dp;
        boolean z14;
        int i16;
        int i17;
        DP dp2;
        int i18;
        int i19;
        float f2;
        int i20;
        DP dp3;
        int i21;
        int i22;
        int i23;
        this.f33433y = c3350i;
        int i24 = 1;
        int i25 = true != c3350i.f31757x ? 16 : 24;
        if (z6 && (((i21 = (dp3 = this.f32455w).f25183v) == -1 || i21 <= c3350i.f26439a) && ((i22 = dp3.f25184w) == -1 || i22 <= c3350i.f26440b))) {
            float f9 = dp3.f25187z;
            if ((f9 == -1.0f || f9 <= c3350i.f26441c) && ((i23 = dp3.f25171j) == -1 || i23 <= c3350i.f26442d)) {
                z9 = true;
                this.f33432x = z9;
                if (z6 && (((i18 = (dp2 = this.f32455w).f25183v) == -1 || i18 >= 0) && ((i19 = dp2.f25184w) == -1 || i19 >= 0))) {
                    f2 = dp2.f25187z;
                    if ((f2 != -1.0f || f2 >= 0.0f) && ((i20 = dp2.f25171j) == -1 || i20 >= 0)) {
                        z10 = true;
                        this.f33434z = z10;
                        this.f33415A = SP.K(i6, false);
                        DP dp4 = this.f32455w;
                        float f10 = dp4.f25187z;
                        this.f33416B = f10 == -1.0f && f10 >= 10.0f;
                        this.f33417C = dp4.f25171j;
                        int i26 = dp4.f25183v;
                        this.f33418D = (i26 != -1 || (i17 = dp4.f25184w) == -1) ? -1 : i26 * i17;
                        i9 = 0;
                        while (true) {
                            c3523lC = c3350i.f26448k;
                            i10 = Integer.MAX_VALUE;
                            if (i9 < c3523lC.f32527w) {
                                i11 = 0;
                                i9 = Integer.MAX_VALUE;
                                break;
                            } else {
                                i11 = C3672o.f(this.f32455w, (String) c3523lC.get(i9), false);
                                if (i11 > 0) {
                                    break;
                                } else {
                                    i9++;
                                }
                            }
                        }
                        this.f33420F = i9;
                        this.f33421G = i11;
                        int i27 = this.f32455w.f25168f;
                        this.f33422H = (i27 == 0 && i27 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
                        int i28 = this.f32455w.f25168f;
                        this.J = (i28 == 0 && (i28 & 1) == 0) ? false : true;
                        this.f33424K = C3672o.f(this.f32455w, str, C3672o.e(str) != null);
                        DP dp5 = this.f32455w;
                        str2 = dp5.f25176o;
                        i12 = i6 & 384;
                        i13 = 256;
                        if (i12 == 256) {
                            String d9 = ZP.d(dp5);
                            str2 = d9 != null ? d9 : str2;
                            i12 = 256;
                        }
                        i14 = 0;
                        while (true) {
                            c3523lC2 = c3350i.i;
                            if (i14 < c3523lC2.f32527w) {
                                if (str2 != null && str2.equals(c3523lC2.get(i14))) {
                                    i10 = i14;
                                    break;
                                }
                                i14++;
                            } else {
                                break;
                            }
                        }
                        this.f33419E = i10;
                        this.f33423I = C3672o.g(this.f32455w, c3350i.f26447j);
                        if (i12 != 128) {
                            z11 = true;
                        } else {
                            if (i12 == 256) {
                                z11 = true;
                                this.f33426M = z11;
                                z12 = i13 == 128;
                                this.f33427N = z12;
                                this.f33428O = (i6 & 64) == 64;
                                this.f33431R = str2;
                                if (str2 != null) {
                                    i15 = 4;
                                    switch (str2.hashCode()) {
                                        case -1851077871:
                                            if (str2.equals("video/dolby-vision")) {
                                                c9 = 0;
                                                break;
                                            }
                                            c9 = 65535;
                                            break;
                                        case -1662735862:
                                            if (str2.equals("video/av01")) {
                                                c9 = 1;
                                                break;
                                            }
                                            c9 = 65535;
                                            break;
                                        case -1662541442:
                                            if (str2.equals(com.anythink.basead.exoplayer.k.o.i)) {
                                                c9 = 2;
                                                break;
                                            }
                                            c9 = 65535;
                                            break;
                                        case 1331836730:
                                            if (str2.equals(com.anythink.basead.exoplayer.k.o.f9237h)) {
                                                c9 = 4;
                                                break;
                                            }
                                            c9 = 65535;
                                            break;
                                        case 1599127257:
                                            if (str2.equals(com.anythink.basead.exoplayer.k.o.f9239k)) {
                                                c9 = 3;
                                                break;
                                            }
                                            c9 = 65535;
                                            break;
                                        default:
                                            c9 = 65535;
                                            break;
                                    }
                                    if (c9 == 0) {
                                        i15 = 5;
                                    } else if (c9 != 1) {
                                        if (c9 == 2) {
                                            i15 = 3;
                                        } else if (c9 == 3) {
                                            i15 = 2;
                                        } else if (c9 == 4) {
                                            i15 = 1;
                                        }
                                    }
                                    this.f33429P = i15;
                                    if (z12) {
                                        KJ kj = this.f32455w.f25152F;
                                        KJ kj2 = KJ.f26648h;
                                        if (kj != null && ((i16 = kj.f26651c) == 7 || i16 == 6)) {
                                            z13 = true;
                                            this.f33430Q = z13;
                                            dp = this.f32455w;
                                            if ((dp.f25168f & 16384) == 0) {
                                                C3350i c3350i2 = this.f33433y;
                                                if (SP.K(i6, c3350i2.f31752B) && ((z14 = this.f33432x) || c3350i2.f31756w)) {
                                                    if (SP.K(i6, false) && this.f33434z && z14 && dp.f25171j != -1 && (i25 & i6) != 0) {
                                                        i24 = 2;
                                                    }
                                                    this.f33425L = i24;
                                                }
                                            }
                                            i24 = 0;
                                            this.f33425L = i24;
                                        }
                                    }
                                    z13 = false;
                                    this.f33430Q = z13;
                                    dp = this.f32455w;
                                    if ((dp.f25168f & 16384) == 0) {
                                    }
                                    i24 = 0;
                                    this.f33425L = i24;
                                }
                                i15 = 0;
                                this.f33429P = i15;
                                if (z12) {
                                }
                                z13 = false;
                                this.f33430Q = z13;
                                dp = this.f32455w;
                                if ((dp.f25168f & 16384) == 0) {
                                }
                                i24 = 0;
                                this.f33425L = i24;
                            }
                            z11 = false;
                        }
                        i13 = i12;
                        this.f33426M = z11;
                        if (i13 == 128) {
                        }
                        this.f33427N = z12;
                        this.f33428O = (i6 & 64) == 64;
                        this.f33431R = str2;
                        if (str2 != null) {
                        }
                        i15 = 0;
                        this.f33429P = i15;
                        if (z12) {
                        }
                        z13 = false;
                        this.f33430Q = z13;
                        dp = this.f32455w;
                        if ((dp.f25168f & 16384) == 0) {
                        }
                        i24 = 0;
                        this.f33425L = i24;
                    }
                }
                z10 = false;
                this.f33434z = z10;
                this.f33415A = SP.K(i6, false);
                DP dp42 = this.f32455w;
                float f102 = dp42.f25187z;
                this.f33416B = f102 == -1.0f && f102 >= 10.0f;
                this.f33417C = dp42.f25171j;
                int i262 = dp42.f25183v;
                this.f33418D = (i262 != -1 || (i17 = dp42.f25184w) == -1) ? -1 : i262 * i17;
                i9 = 0;
                while (true) {
                    c3523lC = c3350i.f26448k;
                    i10 = Integer.MAX_VALUE;
                    if (i9 < c3523lC.f32527w) {
                    }
                    i9++;
                }
                this.f33420F = i9;
                this.f33421G = i11;
                int i272 = this.f32455w.f25168f;
                this.f33422H = (i272 == 0 && i272 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
                int i282 = this.f32455w.f25168f;
                this.J = (i282 == 0 && (i282 & 1) == 0) ? false : true;
                this.f33424K = C3672o.f(this.f32455w, str, C3672o.e(str) != null);
                DP dp52 = this.f32455w;
                str2 = dp52.f25176o;
                i12 = i6 & 384;
                i13 = 256;
                if (i12 == 256) {
                }
                i14 = 0;
                while (true) {
                    c3523lC2 = c3350i.i;
                    if (i14 < c3523lC2.f32527w) {
                    }
                    i14++;
                }
                this.f33419E = i10;
                this.f33423I = C3672o.g(this.f32455w, c3350i.f26447j);
                if (i12 != 128) {
                }
                i13 = i12;
                this.f33426M = z11;
                if (i13 == 128) {
                }
                this.f33427N = z12;
                this.f33428O = (i6 & 64) == 64;
                this.f33431R = str2;
                if (str2 != null) {
                }
                i15 = 0;
                this.f33429P = i15;
                if (z12) {
                }
                z13 = false;
                this.f33430Q = z13;
                dp = this.f32455w;
                if ((dp.f25168f & 16384) == 0) {
                }
                i24 = 0;
                this.f33425L = i24;
            }
        }
        z9 = false;
        this.f33432x = z9;
        if (z6) {
            f2 = dp2.f25187z;
            if (f2 != -1.0f) {
            }
            z10 = true;
            this.f33434z = z10;
            this.f33415A = SP.K(i6, false);
            DP dp422 = this.f32455w;
            float f1022 = dp422.f25187z;
            this.f33416B = f1022 == -1.0f && f1022 >= 10.0f;
            this.f33417C = dp422.f25171j;
            int i2622 = dp422.f25183v;
            this.f33418D = (i2622 != -1 || (i17 = dp422.f25184w) == -1) ? -1 : i2622 * i17;
            i9 = 0;
            while (true) {
                c3523lC = c3350i.f26448k;
                i10 = Integer.MAX_VALUE;
                if (i9 < c3523lC.f32527w) {
                }
                i9++;
            }
            this.f33420F = i9;
            this.f33421G = i11;
            int i2722 = this.f32455w.f25168f;
            this.f33422H = (i2722 == 0 && i2722 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
            int i2822 = this.f32455w.f25168f;
            this.J = (i2822 == 0 && (i2822 & 1) == 0) ? false : true;
            this.f33424K = C3672o.f(this.f32455w, str, C3672o.e(str) != null);
            DP dp522 = this.f32455w;
            str2 = dp522.f25176o;
            i12 = i6 & 384;
            i13 = 256;
            if (i12 == 256) {
            }
            i14 = 0;
            while (true) {
                c3523lC2 = c3350i.i;
                if (i14 < c3523lC2.f32527w) {
                }
                i14++;
            }
            this.f33419E = i10;
            this.f33423I = C3672o.g(this.f32455w, c3350i.f26447j);
            if (i12 != 128) {
            }
            i13 = i12;
            this.f33426M = z11;
            if (i13 == 128) {
            }
            this.f33427N = z12;
            this.f33428O = (i6 & 64) == 64;
            this.f33431R = str2;
            if (str2 != null) {
            }
            i15 = 0;
            this.f33429P = i15;
            if (z12) {
            }
            z13 = false;
            this.f33430Q = z13;
            dp = this.f32455w;
            if ((dp.f25168f & 16384) == 0) {
            }
            i24 = 0;
            this.f33425L = i24;
        }
        z10 = false;
        this.f33434z = z10;
        this.f33415A = SP.K(i6, false);
        DP dp4222 = this.f32455w;
        float f10222 = dp4222.f25187z;
        this.f33416B = f10222 == -1.0f && f10222 >= 10.0f;
        this.f33417C = dp4222.f25171j;
        int i26222 = dp4222.f25183v;
        this.f33418D = (i26222 != -1 || (i17 = dp4222.f25184w) == -1) ? -1 : i26222 * i17;
        i9 = 0;
        while (true) {
            c3523lC = c3350i.f26448k;
            i10 = Integer.MAX_VALUE;
            if (i9 < c3523lC.f32527w) {
            }
            i9++;
        }
        this.f33420F = i9;
        this.f33421G = i11;
        int i27222 = this.f32455w.f25168f;
        this.f33422H = (i27222 == 0 && i27222 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
        int i28222 = this.f32455w.f25168f;
        this.J = (i28222 == 0 && (i28222 & 1) == 0) ? false : true;
        this.f33424K = C3672o.f(this.f32455w, str, C3672o.e(str) != null);
        DP dp5222 = this.f32455w;
        str2 = dp5222.f25176o;
        i12 = i6 & 384;
        i13 = 256;
        if (i12 == 256) {
        }
        i14 = 0;
        while (true) {
            c3523lC2 = c3350i.i;
            if (i14 < c3523lC2.f32527w) {
            }
            i14++;
        }
        this.f33419E = i10;
        this.f33423I = C3672o.g(this.f32455w, c3350i.f26447j);
        if (i12 != 128) {
        }
        i13 = i12;
        this.f33426M = z11;
        if (i13 == 128) {
        }
        this.f33427N = z12;
        this.f33428O = (i6 & 64) == 64;
        this.f33431R = str2;
        if (str2 != null) {
        }
        i15 = 0;
        this.f33429P = i15;
        if (z12) {
        }
        z13 = false;
        this.f33430Q = z13;
        dp = this.f32455w;
        if ((dp.f25168f & 16384) == 0) {
        }
        i24 = 0;
        this.f33425L = i24;
    }

    public static int c(C3618n c3618n, C3618n c3618n2) {
        KB d9 = KB.f26626a.d(c3618n.f33415A, c3618n2.f33415A);
        Integer valueOf = Integer.valueOf(c3618n.f33420F);
        Integer valueOf2 = Integer.valueOf(c3618n2.f33420F);
        C3415jC c3415jC = C3415jC.f32001v;
        return d9.a(valueOf, valueOf2, c3415jC).b(c3618n.f33421G, c3618n2.f33421G).b(c3618n.f33422H, c3618n2.f33422H).a(Integer.valueOf(c3618n.f33423I), Integer.valueOf(c3618n2.f33423I), c3415jC).d(c3618n.J, c3618n2.J).b(c3618n.f33424K, c3618n2.f33424K).d(c3618n.f33416B, c3618n2.f33416B).d(c3618n.f33432x, c3618n2.f33432x).d(c3618n.f33434z, c3618n2.f33434z).a(Integer.valueOf(c3618n.f33419E), Integer.valueOf(c3618n2.f33419E), c3415jC).d(c3618n.f33426M, c3618n2.f33426M).d(c3618n.f33428O, c3618n2.f33428O).e();
    }

    public static int d(C3618n c3618n, C3618n c3618n2) {
        Comparator c3900sC = (c3618n.f33432x && c3618n.f33415A) ? C3672o.f33609k : new C3900sC();
        IB ib = KB.f26626a;
        c3618n.f33433y.getClass();
        KB a9 = ib.d(c3618n.f33430Q, c3618n2.f33430Q).a(Integer.valueOf(c3618n.f33418D), Integer.valueOf(c3618n2.f33418D), c3900sC);
        if (c3618n.f33426M && c3618n.f33428O) {
            a9 = a9.b(c3618n.f33429P, c3618n2.f33429P);
        }
        return a9.d(c3618n.f33427N, c3618n2.f33427N).a(Integer.valueOf(c3618n.f33417C), Integer.valueOf(c3618n2.f33417C), c3900sC).e();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3510l
    public final int a() {
        return this.f33425L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3510l
    public final /* bridge */ /* synthetic */ boolean b(AbstractC3510l abstractC3510l) {
        C3618n c3618n = (C3618n) abstractC3510l;
        if (!Objects.equals(this.f33431R, c3618n.f33431R)) {
            return false;
        }
        this.f33433y.getClass();
        return this.f33426M == c3618n.f33426M && this.f33428O == c3618n.f33428O;
    }
}
