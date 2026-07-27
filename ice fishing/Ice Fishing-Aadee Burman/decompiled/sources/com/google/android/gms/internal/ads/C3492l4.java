package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.l4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3492l4 implements InterfaceC3384j4 {

    /* renamed from: r, reason: collision with root package name */
    public static final double[] f31689r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f31690a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC3543m1 f31691b;

    /* renamed from: c, reason: collision with root package name */
    public final C3481ku f31692c;

    /* renamed from: d, reason: collision with root package name */
    public final String f31693d;

    /* renamed from: e, reason: collision with root package name */
    public final Cr f31694e;

    /* renamed from: f, reason: collision with root package name */
    public final C4085w4 f31695f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f31696g = new boolean[4];

    /* renamed from: h, reason: collision with root package name */
    public final C3438k4 f31697h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f31698j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f31699k;

    /* renamed from: l, reason: collision with root package name */
    public long f31700l;

    /* renamed from: m, reason: collision with root package name */
    public long f31701m;

    /* renamed from: n, reason: collision with root package name */
    public long f31702n;

    /* renamed from: o, reason: collision with root package name */
    public long f31703o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f31704p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f31705q;

    public C3492l4(C3481ku c3481ku, String str) {
        Cr cr;
        this.f31692c = c3481ku;
        this.f31693d = str;
        C3438k4 c3438k4 = new C3438k4();
        c3438k4.f31376d = new byte[128];
        this.f31697h = c3438k4;
        if (c3481ku != null) {
            this.f31695f = new C4085w4(178);
            cr = new Cr();
        } else {
            cr = null;
            this.f31695f = null;
        }
        this.f31694e = cr;
        this.f31701m = com.anythink.basead.exoplayer.b.f6382b;
        this.f31703o = com.anythink.basead.exoplayer.b.f6382b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void a(S0 s02, F4 f42) {
        f42.a();
        f42.b();
        this.f31690a = f42.f24746e;
        f42.b();
        this.f31691b = s02.C(f42.f24745d, 2);
        C3481ku c3481ku = this.f31692c;
        if (c3481ku != null) {
            c3481ku.j(s02, f42);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f7  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Cr cr) {
        C3438k4 c3438k4;
        C4085w4 c4085w4;
        char c9;
        int i;
        int i6;
        long j6;
        boolean z3;
        boolean z6;
        long j9;
        int i9;
        float f3;
        int i10;
        int i11;
        char c10 = 3;
        this.f31691b.getClass();
        int i12 = cr.f24253b;
        int i13 = cr.f24254c;
        byte[] bArr = cr.f24252a;
        this.i += cr.B();
        this.f31691b.a(cr.B(), cr);
        while (true) {
            int Q8 = SK.Q(bArr, i12, i13, this.f31696g);
            c3438k4 = this.f31697h;
            c4085w4 = this.f31695f;
            if (Q8 == i13) {
                break;
            }
            int i14 = Q8 + 3;
            int i15 = cr.f24252a[i14] & 255;
            int i16 = Q8 - i12;
            if (this.f31699k) {
                c9 = c10;
            } else {
                if (i16 > 0) {
                    c3438k4.a(bArr, i12, Q8);
                }
                int i17 = i16 < 0 ? -i16 : 0;
                if (c3438k4.f31373a) {
                    int i18 = c3438k4.f31374b - i17;
                    c3438k4.f31374b = i18;
                    if (c3438k4.f31375c == 0 && i15 == 181) {
                        c3438k4.f31375c = i18;
                    } else {
                        c3438k4.f31373a = false;
                        String str = this.f31690a;
                        str.getClass();
                        byte[] copyOf = Arrays.copyOf(c3438k4.f31376d, c3438k4.f31374b);
                        int i19 = copyOf[4] & 255;
                        byte b9 = copyOf[5];
                        int i20 = copyOf[6] & 255;
                        int i21 = (i19 << 4) | ((b9 & 255) >> 4);
                        int i22 = (copyOf[7] & 240) >> 4;
                        int i23 = ((b9 & 15) << 8) | i20;
                        if (i22 != 2) {
                            if (i22 == 3) {
                                i10 = i23 * 16;
                                i11 = i21 * 9;
                            } else if (i22 != 4) {
                                f3 = 1.0f;
                            } else {
                                i10 = i23 * 121;
                                i11 = i21 * 100;
                            }
                            f3 = i10 / i11;
                        } else {
                            f3 = (i23 * 4) / (i21 * 3);
                        }
                        C3299hP c3299hP = new C3299hP();
                        c3299hP.f30780a = str;
                        c3299hP.d(this.f31693d);
                        c3299hP.e(com.anythink.basead.exoplayer.k.o.f8456n);
                        c3299hP.f30799u = i21;
                        c3299hP.f30800v = i23;
                        c3299hP.f30767B = f3;
                        c3299hP.f30795q = Collections.singletonList(copyOf);
                        DP dp = new DP(c3299hP);
                        int i24 = (copyOf[7] & 15) - 1;
                        long j10 = 0;
                        if (i24 >= 0 && i24 < 8) {
                            double d2 = f31689r[i24];
                            byte b10 = copyOf[c3438k4.f31375c + 9];
                            int i25 = (b10 & 96) >> 5;
                            if (i25 != (b10 & 31)) {
                                d2 = ((i25 + 1.0d) / (r5 + 1)) * d2;
                            }
                            j10 = (long) (1000000.0d / d2);
                        }
                        Pair create = Pair.create(dp, Long.valueOf(j10));
                        this.f31691b.e((DP) create.first);
                        this.f31700l = ((Long) create.second).longValue();
                        this.f31699k = true;
                        c9 = 3;
                    }
                } else if (i15 == 179) {
                    c3438k4.f31373a = true;
                }
                c9 = 3;
                c3438k4.a(C3438k4.f31372e, 0, 3);
            }
            if (c4085w4 != null) {
                if (i16 > 0) {
                    c4085w4.h(bArr, i12, Q8);
                    i9 = 0;
                } else {
                    i9 = -i16;
                }
                if (c4085w4.i(i9)) {
                    int b11 = SK.b(c4085w4.f34798e, (byte[]) c4085w4.f34799f);
                    String str2 = AbstractC3159eu.f29993a;
                    byte[] bArr2 = (byte[]) c4085w4.f34799f;
                    Cr cr2 = this.f31694e;
                    cr2.z(b11, bArr2);
                    this.f31692c.m(this.f31703o, cr2);
                }
                if (i15 == 178) {
                    if (cr.f24252a[Q8 + 2] == 1) {
                        c4085w4.g(178);
                    }
                    i = 178;
                    if (i != 0 || i == 179) {
                        i6 = i13 - Q8;
                        if (this.f31705q && this.f31699k) {
                            j9 = this.f31703o;
                            if (j9 != com.anythink.basead.exoplayer.b.f6382b) {
                                this.f31691b.c(j9, this.f31704p ? 1 : 0, ((int) (this.i - this.f31702n)) - i6, i6, null);
                            }
                        }
                        if (this.f31698j || this.f31705q) {
                            this.f31702n = this.i - i6;
                            j6 = this.f31701m;
                            if (j6 == com.anythink.basead.exoplayer.b.f6382b) {
                                long j11 = this.f31703o;
                                j6 = j11 != com.anythink.basead.exoplayer.b.f6382b ? j11 + this.f31700l : -9223372036854775807L;
                            }
                            this.f31703o = j6;
                            z3 = false;
                            this.f31704p = false;
                            this.f31701m = com.anythink.basead.exoplayer.b.f6382b;
                            z6 = true;
                            this.f31698j = true;
                        } else {
                            z6 = true;
                            z3 = false;
                        }
                        if (i == 0) {
                            z3 = z6;
                        }
                        this.f31705q = z3;
                    } else if (i == 184) {
                        this.f31704p = true;
                    }
                    c10 = c9;
                    i12 = i14;
                }
            }
            i = i15;
            if (i != 0) {
            }
            i6 = i13 - Q8;
            if (this.f31705q) {
                j9 = this.f31703o;
                if (j9 != com.anythink.basead.exoplayer.b.f6382b) {
                }
            }
            if (this.f31698j) {
            }
            this.f31702n = this.i - i6;
            j6 = this.f31701m;
            if (j6 == com.anythink.basead.exoplayer.b.f6382b) {
            }
            this.f31703o = j6;
            z3 = false;
            this.f31704p = false;
            this.f31701m = com.anythink.basead.exoplayer.b.f6382b;
            z6 = true;
            this.f31698j = true;
            if (i == 0) {
            }
            this.f31705q = z3;
            c10 = c9;
            i12 = i14;
        }
        if (!this.f31699k) {
            c3438k4.a(bArr, i12, i13);
        }
        if (c4085w4 != null) {
            c4085w4.h(bArr, i12, i13);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void c() {
        SK.S(this.f31696g);
        C3438k4 c3438k4 = this.f31697h;
        c3438k4.f31373a = false;
        c3438k4.f31374b = 0;
        c3438k4.f31375c = 0;
        C4085w4 c4085w4 = this.f31695f;
        if (c4085w4 != null) {
            c4085w4.e();
        }
        this.i = 0L;
        this.f31698j = false;
        this.f31701m = com.anythink.basead.exoplayer.b.f6382b;
        this.f31703o = com.anythink.basead.exoplayer.b.f6382b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void d(int i, long j6) {
        this.f31701m = j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3384j4
    public final void p() {
        InterfaceC3543m1 interfaceC3543m1 = this.f31691b;
        interfaceC3543m1.getClass();
        long j6 = this.f31703o;
        if (j6 != com.anythink.basead.exoplayer.b.f6382b) {
            boolean z3 = this.f31704p;
            interfaceC3543m1.c(j6, z3 ? 1 : 0, (int) (this.i - this.f31702n), 0, null);
        }
    }
}
