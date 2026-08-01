package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3595n extends AbstractC3487l {

    /* renamed from: A, reason: collision with root package name */
    public final boolean f32637A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f32638B;

    /* renamed from: C, reason: collision with root package name */
    public final int f32639C;

    /* renamed from: D, reason: collision with root package name */
    public final int f32640D;

    /* renamed from: E, reason: collision with root package name */
    public final int f32641E;

    /* renamed from: F, reason: collision with root package name */
    public final int f32642F;

    /* renamed from: G, reason: collision with root package name */
    public final int f32643G;

    /* renamed from: H, reason: collision with root package name */
    public final int f32644H;

    /* renamed from: I, reason: collision with root package name */
    public final int f32645I;
    public final boolean J;

    /* renamed from: K, reason: collision with root package name */
    public final int f32646K;

    /* renamed from: L, reason: collision with root package name */
    public final int f32647L;

    /* renamed from: M, reason: collision with root package name */
    public final boolean f32648M;

    /* renamed from: N, reason: collision with root package name */
    public final boolean f32649N;

    /* renamed from: O, reason: collision with root package name */
    public final boolean f32650O;

    /* renamed from: P, reason: collision with root package name */
    public final int f32651P;

    /* renamed from: Q, reason: collision with root package name */
    public final boolean f32652Q;

    /* renamed from: R, reason: collision with root package name */
    public final String f32653R;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f32654x;

    /* renamed from: y, reason: collision with root package name */
    public final C3327i f32655y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f32656z;

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
    public C3595n(int i, A8 a82, int i6, C3327i c3327i, int i9, String str, boolean z3) {
        super(i, a82, i6);
        boolean z6;
        boolean z9;
        int i10;
        C3500lC c3500lC;
        int i11;
        int i12;
        String str2;
        int i13;
        int i14;
        int i15;
        C3500lC c3500lC2;
        boolean z10;
        boolean z11;
        int i16;
        char c9;
        boolean z12;
        DP dp;
        boolean z13;
        int i17;
        int i18;
        DP dp2;
        int i19;
        int i20;
        float f3;
        int i21;
        DP dp3;
        int i22;
        int i23;
        int i24;
        this.f32655y = c3327i;
        int i25 = 1;
        int i26 = true != c3327i.f30984x ? 16 : 24;
        if (z3 && (((i22 = (dp3 = this.f31675w).f24438v) == -1 || i22 <= c3327i.f25685a) && ((i23 = dp3.f24439w) == -1 || i23 <= c3327i.f25686b))) {
            float f9 = dp3.f24442z;
            if ((f9 == -1.0f || f9 <= c3327i.f25687c) && ((i24 = dp3.f24426j) == -1 || i24 <= c3327i.f25688d)) {
                z6 = true;
                this.f32654x = z6;
                if (z3 && (((i19 = (dp2 = this.f31675w).f24438v) == -1 || i19 >= 0) && ((i20 = dp2.f24439w) == -1 || i20 >= 0))) {
                    f3 = dp2.f24442z;
                    if ((f3 != -1.0f || f3 >= 0.0f) && ((i21 = dp2.f24426j) == -1 || i21 >= 0)) {
                        z9 = true;
                        this.f32656z = z9;
                        this.f32637A = RP.K(i9, false);
                        DP dp4 = this.f31675w;
                        float f10 = dp4.f24442z;
                        this.f32638B = f10 == -1.0f && f10 >= 10.0f;
                        this.f32639C = dp4.f24426j;
                        int i27 = dp4.f24438v;
                        this.f32640D = (i27 != -1 || (i18 = dp4.f24439w) == -1) ? -1 : i27 * i18;
                        i10 = 0;
                        while (true) {
                            c3500lC = c3327i.f25694k;
                            i11 = Integer.MAX_VALUE;
                            if (i10 < c3500lC.f31747w) {
                                i12 = 0;
                                i10 = Integer.MAX_VALUE;
                                break;
                            } else {
                                i12 = C3649o.f(this.f31675w, (String) c3500lC.get(i10), false);
                                if (i12 > 0) {
                                    break;
                                } else {
                                    i10++;
                                }
                            }
                        }
                        this.f32642F = i10;
                        this.f32643G = i12;
                        int i28 = this.f31675w.f24423f;
                        this.f32644H = (i28 == 0 && i28 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
                        int i29 = this.f31675w.f24423f;
                        this.J = (i29 == 0 && (i29 & 1) == 0) ? false : true;
                        this.f32646K = C3649o.f(this.f31675w, str, C3649o.e(str) != null);
                        DP dp5 = this.f31675w;
                        str2 = dp5.f24431o;
                        i13 = i9 & 384;
                        i14 = 256;
                        if (i13 == 256) {
                            String d2 = WP.d(dp5);
                            str2 = d2 != null ? d2 : str2;
                            i13 = 256;
                        }
                        i15 = 0;
                        while (true) {
                            c3500lC2 = c3327i.i;
                            if (i15 < c3500lC2.f31747w) {
                                if (str2 != null && str2.equals(c3500lC2.get(i15))) {
                                    i11 = i15;
                                    break;
                                }
                                i15++;
                            } else {
                                break;
                            }
                        }
                        this.f32641E = i11;
                        this.f32645I = C3649o.g(this.f31675w, c3327i.f25693j);
                        if (i13 != 128) {
                            z10 = true;
                        } else {
                            if (i13 == 256) {
                                z10 = true;
                                this.f32648M = z10;
                                z11 = i14 == 128;
                                this.f32649N = z11;
                                this.f32650O = (i9 & 64) == 64;
                                this.f32653R = str2;
                                if (str2 != null) {
                                    i16 = 4;
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
                                            if (str2.equals(com.anythink.basead.exoplayer.k.o.f8451h)) {
                                                c9 = 4;
                                                break;
                                            }
                                            c9 = 65535;
                                            break;
                                        case 1599127257:
                                            if (str2.equals(com.anythink.basead.exoplayer.k.o.f8453k)) {
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
                                        i16 = 5;
                                    } else if (c9 != 1) {
                                        if (c9 == 2) {
                                            i16 = 3;
                                        } else if (c9 == 3) {
                                            i16 = 2;
                                        } else if (c9 == 4) {
                                            i16 = 1;
                                        }
                                    }
                                    this.f32651P = i16;
                                    if (z11) {
                                        KJ kj = this.f31675w.f24407F;
                                        KJ kj2 = KJ.f25896h;
                                        if (kj != null && ((i17 = kj.f25899c) == 7 || i17 == 6)) {
                                            z12 = true;
                                            this.f32652Q = z12;
                                            dp = this.f31675w;
                                            if ((dp.f24423f & 16384) == 0) {
                                                C3327i c3327i2 = this.f32655y;
                                                if (RP.K(i9, c3327i2.f30979B) && ((z13 = this.f32654x) || c3327i2.f30983w)) {
                                                    if (RP.K(i9, false) && this.f32656z && z13 && dp.f24426j != -1 && (i26 & i9) != 0) {
                                                        i25 = 2;
                                                    }
                                                    this.f32647L = i25;
                                                }
                                            }
                                            i25 = 0;
                                            this.f32647L = i25;
                                        }
                                    }
                                    z12 = false;
                                    this.f32652Q = z12;
                                    dp = this.f31675w;
                                    if ((dp.f24423f & 16384) == 0) {
                                    }
                                    i25 = 0;
                                    this.f32647L = i25;
                                }
                                i16 = 0;
                                this.f32651P = i16;
                                if (z11) {
                                }
                                z12 = false;
                                this.f32652Q = z12;
                                dp = this.f31675w;
                                if ((dp.f24423f & 16384) == 0) {
                                }
                                i25 = 0;
                                this.f32647L = i25;
                            }
                            z10 = false;
                        }
                        i14 = i13;
                        this.f32648M = z10;
                        if (i14 == 128) {
                        }
                        this.f32649N = z11;
                        this.f32650O = (i9 & 64) == 64;
                        this.f32653R = str2;
                        if (str2 != null) {
                        }
                        i16 = 0;
                        this.f32651P = i16;
                        if (z11) {
                        }
                        z12 = false;
                        this.f32652Q = z12;
                        dp = this.f31675w;
                        if ((dp.f24423f & 16384) == 0) {
                        }
                        i25 = 0;
                        this.f32647L = i25;
                    }
                }
                z9 = false;
                this.f32656z = z9;
                this.f32637A = RP.K(i9, false);
                DP dp42 = this.f31675w;
                float f102 = dp42.f24442z;
                this.f32638B = f102 == -1.0f && f102 >= 10.0f;
                this.f32639C = dp42.f24426j;
                int i272 = dp42.f24438v;
                this.f32640D = (i272 != -1 || (i18 = dp42.f24439w) == -1) ? -1 : i272 * i18;
                i10 = 0;
                while (true) {
                    c3500lC = c3327i.f25694k;
                    i11 = Integer.MAX_VALUE;
                    if (i10 < c3500lC.f31747w) {
                    }
                    i10++;
                }
                this.f32642F = i10;
                this.f32643G = i12;
                int i282 = this.f31675w.f24423f;
                this.f32644H = (i282 == 0 && i282 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
                int i292 = this.f31675w.f24423f;
                this.J = (i292 == 0 && (i292 & 1) == 0) ? false : true;
                this.f32646K = C3649o.f(this.f31675w, str, C3649o.e(str) != null);
                DP dp52 = this.f31675w;
                str2 = dp52.f24431o;
                i13 = i9 & 384;
                i14 = 256;
                if (i13 == 256) {
                }
                i15 = 0;
                while (true) {
                    c3500lC2 = c3327i.i;
                    if (i15 < c3500lC2.f31747w) {
                    }
                    i15++;
                }
                this.f32641E = i11;
                this.f32645I = C3649o.g(this.f31675w, c3327i.f25693j);
                if (i13 != 128) {
                }
                i14 = i13;
                this.f32648M = z10;
                if (i14 == 128) {
                }
                this.f32649N = z11;
                this.f32650O = (i9 & 64) == 64;
                this.f32653R = str2;
                if (str2 != null) {
                }
                i16 = 0;
                this.f32651P = i16;
                if (z11) {
                }
                z12 = false;
                this.f32652Q = z12;
                dp = this.f31675w;
                if ((dp.f24423f & 16384) == 0) {
                }
                i25 = 0;
                this.f32647L = i25;
            }
        }
        z6 = false;
        this.f32654x = z6;
        if (z3) {
            f3 = dp2.f24442z;
            if (f3 != -1.0f) {
            }
            z9 = true;
            this.f32656z = z9;
            this.f32637A = RP.K(i9, false);
            DP dp422 = this.f31675w;
            float f1022 = dp422.f24442z;
            this.f32638B = f1022 == -1.0f && f1022 >= 10.0f;
            this.f32639C = dp422.f24426j;
            int i2722 = dp422.f24438v;
            this.f32640D = (i2722 != -1 || (i18 = dp422.f24439w) == -1) ? -1 : i2722 * i18;
            i10 = 0;
            while (true) {
                c3500lC = c3327i.f25694k;
                i11 = Integer.MAX_VALUE;
                if (i10 < c3500lC.f31747w) {
                }
                i10++;
            }
            this.f32642F = i10;
            this.f32643G = i12;
            int i2822 = this.f31675w.f24423f;
            this.f32644H = (i2822 == 0 && i2822 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
            int i2922 = this.f31675w.f24423f;
            this.J = (i2922 == 0 && (i2922 & 1) == 0) ? false : true;
            this.f32646K = C3649o.f(this.f31675w, str, C3649o.e(str) != null);
            DP dp522 = this.f31675w;
            str2 = dp522.f24431o;
            i13 = i9 & 384;
            i14 = 256;
            if (i13 == 256) {
            }
            i15 = 0;
            while (true) {
                c3500lC2 = c3327i.i;
                if (i15 < c3500lC2.f31747w) {
                }
                i15++;
            }
            this.f32641E = i11;
            this.f32645I = C3649o.g(this.f31675w, c3327i.f25693j);
            if (i13 != 128) {
            }
            i14 = i13;
            this.f32648M = z10;
            if (i14 == 128) {
            }
            this.f32649N = z11;
            this.f32650O = (i9 & 64) == 64;
            this.f32653R = str2;
            if (str2 != null) {
            }
            i16 = 0;
            this.f32651P = i16;
            if (z11) {
            }
            z12 = false;
            this.f32652Q = z12;
            dp = this.f31675w;
            if ((dp.f24423f & 16384) == 0) {
            }
            i25 = 0;
            this.f32647L = i25;
        }
        z9 = false;
        this.f32656z = z9;
        this.f32637A = RP.K(i9, false);
        DP dp4222 = this.f31675w;
        float f10222 = dp4222.f24442z;
        this.f32638B = f10222 == -1.0f && f10222 >= 10.0f;
        this.f32639C = dp4222.f24426j;
        int i27222 = dp4222.f24438v;
        this.f32640D = (i27222 != -1 || (i18 = dp4222.f24439w) == -1) ? -1 : i27222 * i18;
        i10 = 0;
        while (true) {
            c3500lC = c3327i.f25694k;
            i11 = Integer.MAX_VALUE;
            if (i10 < c3500lC.f31747w) {
            }
            i10++;
        }
        this.f32642F = i10;
        this.f32643G = i12;
        int i28222 = this.f31675w.f24423f;
        this.f32644H = (i28222 == 0 && i28222 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
        int i29222 = this.f31675w.f24423f;
        this.J = (i29222 == 0 && (i29222 & 1) == 0) ? false : true;
        this.f32646K = C3649o.f(this.f31675w, str, C3649o.e(str) != null);
        DP dp5222 = this.f31675w;
        str2 = dp5222.f24431o;
        i13 = i9 & 384;
        i14 = 256;
        if (i13 == 256) {
        }
        i15 = 0;
        while (true) {
            c3500lC2 = c3327i.i;
            if (i15 < c3500lC2.f31747w) {
            }
            i15++;
        }
        this.f32641E = i11;
        this.f32645I = C3649o.g(this.f31675w, c3327i.f25693j);
        if (i13 != 128) {
        }
        i14 = i13;
        this.f32648M = z10;
        if (i14 == 128) {
        }
        this.f32649N = z11;
        this.f32650O = (i9 & 64) == 64;
        this.f32653R = str2;
        if (str2 != null) {
        }
        i16 = 0;
        this.f32651P = i16;
        if (z11) {
        }
        z12 = false;
        this.f32652Q = z12;
        dp = this.f31675w;
        if ((dp.f24423f & 16384) == 0) {
        }
        i25 = 0;
        this.f32647L = i25;
    }

    public static int c(C3595n c3595n, C3595n c3595n2) {
        KB d2 = KB.f25874a.d(c3595n.f32637A, c3595n2.f32637A);
        Integer valueOf = Integer.valueOf(c3595n.f32642F);
        Integer valueOf2 = Integer.valueOf(c3595n2.f32642F);
        C3392jC c3392jC = C3392jC.f31214v;
        return d2.a(valueOf, valueOf2, c3392jC).b(c3595n.f32643G, c3595n2.f32643G).b(c3595n.f32644H, c3595n2.f32644H).a(Integer.valueOf(c3595n.f32645I), Integer.valueOf(c3595n2.f32645I), c3392jC).d(c3595n.J, c3595n2.J).b(c3595n.f32646K, c3595n2.f32646K).d(c3595n.f32638B, c3595n2.f32638B).d(c3595n.f32654x, c3595n2.f32654x).d(c3595n.f32656z, c3595n2.f32656z).a(Integer.valueOf(c3595n.f32641E), Integer.valueOf(c3595n2.f32641E), c3392jC).d(c3595n.f32648M, c3595n2.f32648M).d(c3595n.f32650O, c3595n2.f32650O).e();
    }

    public static int d(C3595n c3595n, C3595n c3595n2) {
        Comparator c3877sC = (c3595n.f32654x && c3595n.f32637A) ? C3649o.f32822k : new C3877sC();
        IB ib = KB.f25874a;
        c3595n.f32655y.getClass();
        KB a9 = ib.d(c3595n.f32652Q, c3595n2.f32652Q).a(Integer.valueOf(c3595n.f32640D), Integer.valueOf(c3595n2.f32640D), c3877sC);
        if (c3595n.f32648M && c3595n.f32650O) {
            a9 = a9.b(c3595n.f32651P, c3595n2.f32651P);
        }
        return a9.d(c3595n.f32649N, c3595n2.f32649N).a(Integer.valueOf(c3595n.f32639C), Integer.valueOf(c3595n2.f32639C), c3877sC).e();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3487l
    public final int a() {
        return this.f32647L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3487l
    public final /* bridge */ /* synthetic */ boolean b(AbstractC3487l abstractC3487l) {
        C3595n c3595n = (C3595n) abstractC3487l;
        if (!Objects.equals(this.f32653R, c3595n.f32653R)) {
            return false;
        }
        this.f32655y.getClass();
        return this.f32648M == c3595n.f32648M && this.f32650O == c3595n.f32650O;
    }
}
