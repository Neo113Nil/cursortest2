package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.l4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3515l4 implements InterfaceC3407j4 {

    /* renamed from: r, reason: collision with root package name */
    public static final double[] f32469r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f32470a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC3566m1 f32471b;

    /* renamed from: c, reason: collision with root package name */
    public final C3504ku f32472c;

    /* renamed from: d, reason: collision with root package name */
    public final String f32473d;

    /* renamed from: e, reason: collision with root package name */
    public final Cr f32474e;

    /* renamed from: f, reason: collision with root package name */
    public final C4108w4 f32475f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f32476g = new boolean[4];

    /* renamed from: h, reason: collision with root package name */
    public final C3461k4 f32477h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f32478j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f32479k;

    /* renamed from: l, reason: collision with root package name */
    public long f32480l;

    /* renamed from: m, reason: collision with root package name */
    public long f32481m;

    /* renamed from: n, reason: collision with root package name */
    public long f32482n;

    /* renamed from: o, reason: collision with root package name */
    public long f32483o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f32484p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f32485q;

    public C3515l4(C3504ku c3504ku, String str) {
        Cr cr;
        this.f32472c = c3504ku;
        this.f32473d = str;
        C3461k4 c3461k4 = new C3461k4();
        c3461k4.f32155d = new byte[128];
        this.f32477h = c3461k4;
        if (c3504ku != null) {
            this.f32475f = new C4108w4(178);
            cr = new Cr();
        } else {
            cr = null;
            this.f32475f = null;
        }
        this.f32474e = cr;
        this.f32481m = com.anythink.basead.exoplayer.b.f7168b;
        this.f32483o = com.anythink.basead.exoplayer.b.f7168b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void a(S0 s02, F4 f42) {
        f42.a();
        f42.b();
        this.f32470a = f42.f25502e;
        f42.b();
        this.f32471b = s02.C(f42.f25501d, 2);
        C3504ku c3504ku = this.f32472c;
        if (c3504ku != null) {
            c3504ku.j(s02, f42);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f7  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Cr cr) {
        C3461k4 c3461k4;
        C4108w4 c4108w4;
        char c9;
        int i;
        int i4;
        long j6;
        boolean z6;
        boolean z9;
        long j9;
        int i6;
        float f2;
        int i9;
        int i10;
        char c10 = 3;
        this.f32471b.getClass();
        int i11 = cr.f24998b;
        int i12 = cr.f24999c;
        byte[] bArr = cr.f24997a;
        this.i += cr.B();
        this.f32471b.a(cr.B(), cr);
        while (true) {
            int Q8 = SK.Q(bArr, i11, i12, this.f32476g);
            c3461k4 = this.f32477h;
            c4108w4 = this.f32475f;
            if (Q8 == i12) {
                break;
            }
            int i13 = Q8 + 3;
            int i14 = cr.f24997a[i13] & 255;
            int i15 = Q8 - i11;
            if (this.f32479k) {
                c9 = c10;
            } else {
                if (i15 > 0) {
                    c3461k4.a(bArr, i11, Q8);
                }
                int i16 = i15 < 0 ? -i15 : 0;
                if (c3461k4.f32152a) {
                    int i17 = c3461k4.f32153b - i16;
                    c3461k4.f32153b = i17;
                    if (c3461k4.f32154c == 0 && i14 == 181) {
                        c3461k4.f32154c = i17;
                    } else {
                        c3461k4.f32152a = false;
                        String str = this.f32470a;
                        str.getClass();
                        byte[] copyOf = Arrays.copyOf(c3461k4.f32155d, c3461k4.f32153b);
                        int i18 = copyOf[4] & 255;
                        byte b9 = copyOf[5];
                        int i19 = copyOf[6] & 255;
                        int i20 = (i18 << 4) | ((b9 & 255) >> 4);
                        int i21 = (copyOf[7] & 240) >> 4;
                        int i22 = ((b9 & 15) << 8) | i19;
                        if (i21 != 2) {
                            if (i21 == 3) {
                                i9 = i22 * 16;
                                i10 = i20 * 9;
                            } else if (i21 != 4) {
                                f2 = 1.0f;
                            } else {
                                i9 = i22 * 121;
                                i10 = i20 * 100;
                            }
                            f2 = i9 / i10;
                        } else {
                            f2 = (i22 * 4) / (i20 * 3);
                        }
                        C3322hP c3322hP = new C3322hP();
                        c3322hP.f31546a = str;
                        c3322hP.d(this.f32473d);
                        c3322hP.e(com.anythink.basead.exoplayer.k.o.f9242n);
                        c3322hP.f31565u = i20;
                        c3322hP.f31566v = i22;
                        c3322hP.f31533B = f2;
                        c3322hP.f31561q = Collections.singletonList(copyOf);
                        DP dp = new DP(c3322hP);
                        int i23 = (copyOf[7] & 15) - 1;
                        long j10 = 0;
                        if (i23 >= 0 && i23 < 8) {
                            double d9 = f32469r[i23];
                            byte b10 = copyOf[c3461k4.f32154c + 9];
                            int i24 = (b10 & 96) >> 5;
                            if (i24 != (b10 & 31)) {
                                d9 = ((i24 + 1.0d) / (r5 + 1)) * d9;
                            }
                            j10 = (long) (1000000.0d / d9);
                        }
                        Pair create = Pair.create(dp, Long.valueOf(j10));
                        this.f32471b.e((DP) create.first);
                        this.f32480l = ((Long) create.second).longValue();
                        this.f32479k = true;
                        c9 = 3;
                    }
                } else if (i14 == 179) {
                    c3461k4.f32152a = true;
                }
                c9 = 3;
                c3461k4.a(C3461k4.f32151e, 0, 3);
            }
            if (c4108w4 != null) {
                if (i15 > 0) {
                    c4108w4.h(bArr, i11, Q8);
                    i6 = 0;
                } else {
                    i6 = -i15;
                }
                if (c4108w4.i(i6)) {
                    int b11 = SK.b(c4108w4.f35567e, (byte[]) c4108w4.f35568f);
                    String str2 = AbstractC3182eu.f30782a;
                    byte[] bArr2 = (byte[]) c4108w4.f35568f;
                    Cr cr2 = this.f32474e;
                    cr2.z(b11, bArr2);
                    this.f32472c.m(this.f32483o, cr2);
                }
                if (i14 == 178) {
                    if (cr.f24997a[Q8 + 2] == 1) {
                        c4108w4.g(178);
                    }
                    i = 178;
                    if (i != 0 || i == 179) {
                        i4 = i12 - Q8;
                        if (this.f32485q && this.f32479k) {
                            j9 = this.f32483o;
                            if (j9 != com.anythink.basead.exoplayer.b.f7168b) {
                                this.f32471b.c(j9, this.f32484p ? 1 : 0, ((int) (this.i - this.f32482n)) - i4, i4, null);
                            }
                        }
                        if (this.f32478j || this.f32485q) {
                            this.f32482n = this.i - i4;
                            j6 = this.f32481m;
                            if (j6 == com.anythink.basead.exoplayer.b.f7168b) {
                                long j11 = this.f32483o;
                                j6 = j11 != com.anythink.basead.exoplayer.b.f7168b ? j11 + this.f32480l : -9223372036854775807L;
                            }
                            this.f32483o = j6;
                            z6 = false;
                            this.f32484p = false;
                            this.f32481m = com.anythink.basead.exoplayer.b.f7168b;
                            z9 = true;
                            this.f32478j = true;
                        } else {
                            z9 = true;
                            z6 = false;
                        }
                        if (i == 0) {
                            z6 = z9;
                        }
                        this.f32485q = z6;
                    } else if (i == 184) {
                        this.f32484p = true;
                    }
                    c10 = c9;
                    i11 = i13;
                }
            }
            i = i14;
            if (i != 0) {
            }
            i4 = i12 - Q8;
            if (this.f32485q) {
                j9 = this.f32483o;
                if (j9 != com.anythink.basead.exoplayer.b.f7168b) {
                }
            }
            if (this.f32478j) {
            }
            this.f32482n = this.i - i4;
            j6 = this.f32481m;
            if (j6 == com.anythink.basead.exoplayer.b.f7168b) {
            }
            this.f32483o = j6;
            z6 = false;
            this.f32484p = false;
            this.f32481m = com.anythink.basead.exoplayer.b.f7168b;
            z9 = true;
            this.f32478j = true;
            if (i == 0) {
            }
            this.f32485q = z6;
            c10 = c9;
            i11 = i13;
        }
        if (!this.f32479k) {
            c3461k4.a(bArr, i11, i12);
        }
        if (c4108w4 != null) {
            c4108w4.h(bArr, i11, i12);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void c() {
        SK.S(this.f32476g);
        C3461k4 c3461k4 = this.f32477h;
        c3461k4.f32152a = false;
        c3461k4.f32153b = 0;
        c3461k4.f32154c = 0;
        C4108w4 c4108w4 = this.f32475f;
        if (c4108w4 != null) {
            c4108w4.e();
        }
        this.i = 0L;
        this.f32478j = false;
        this.f32481m = com.anythink.basead.exoplayer.b.f7168b;
        this.f32483o = com.anythink.basead.exoplayer.b.f7168b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void d(int i, long j6) {
        this.f32481m = j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3407j4
    public final void p() {
        InterfaceC3566m1 interfaceC3566m1 = this.f32471b;
        interfaceC3566m1.getClass();
        long j6 = this.f32483o;
        if (j6 != com.anythink.basead.exoplayer.b.f7168b) {
            boolean z6 = this.f32484p;
            interfaceC3566m1.c(j6, z6 ? 1 : 0, (int) (this.i - this.f32482n), 0, null);
        }
    }
}
