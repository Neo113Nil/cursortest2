package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.j4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3397j4 implements InterfaceC3291h4 {

    /* renamed from: r, reason: collision with root package name */
    public static final double[] f32065r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f32066a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC3448k1 f32067b;

    /* renamed from: c, reason: collision with root package name */
    public final C3602mu f32068c;

    /* renamed from: d, reason: collision with root package name */
    public final String f32069d;

    /* renamed from: e, reason: collision with root package name */
    public final Lr f32070e;

    /* renamed from: f, reason: collision with root package name */
    public final C3990u4 f32071f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f32072g = new boolean[4];

    /* renamed from: h, reason: collision with root package name */
    public final C3345i4 f32073h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f32074j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f32075k;

    /* renamed from: l, reason: collision with root package name */
    public long f32076l;

    /* renamed from: m, reason: collision with root package name */
    public long f32077m;

    /* renamed from: n, reason: collision with root package name */
    public long f32078n;

    /* renamed from: o, reason: collision with root package name */
    public long f32079o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f32080p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f32081q;

    public C3397j4(C3602mu c3602mu, String str) {
        Lr lr;
        this.f32068c = c3602mu;
        this.f32069d = str;
        C3345i4 c3345i4 = new C3345i4();
        c3345i4.f31314d = new byte[128];
        this.f32073h = c3345i4;
        if (c3602mu != null) {
            this.f32071f = new C3990u4(178);
            lr = new Lr();
        } else {
            lr = null;
            this.f32071f = null;
        }
        this.f32070e = lr;
        this.f32077m = com.anythink.basead.exoplayer.b.f6539b;
        this.f32079o = com.anythink.basead.exoplayer.b.f6539b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void a() {
        PA.V(this.f32072g);
        C3345i4 c3345i4 = this.f32073h;
        c3345i4.f31311a = false;
        c3345i4.f31312b = 0;
        c3345i4.f31313c = 0;
        C3990u4 c3990u4 = this.f32071f;
        if (c3990u4 != null) {
            c3990u4.e();
        }
        this.i = 0L;
        this.f32074j = false;
        this.f32077m = com.anythink.basead.exoplayer.b.f6539b;
        this.f32079o = com.anythink.basead.exoplayer.b.f6539b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void b(boolean z8) {
        InterfaceC3448k1 interfaceC3448k1 = this.f32067b;
        interfaceC3448k1.getClass();
        if (z8) {
            boolean z9 = this.f32080p;
            long j9 = this.i - this.f32078n;
            interfaceC3448k1.b(this.f32079o, z9 ? 1 : 0, (int) j9, 0, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f7  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Lr lr) {
        C3345i4 c3345i4;
        C3990u4 c3990u4;
        char c4;
        int i;
        int i4;
        long j9;
        boolean z8;
        boolean z9;
        long j10;
        int i9;
        float f6;
        int i10;
        int i11;
        char c9 = 3;
        this.f32067b.getClass();
        int i12 = lr.f26234b;
        int i13 = lr.f26235c;
        byte[] bArr = lr.f26233a;
        this.i += lr.B();
        this.f32067b.a(lr.B(), lr);
        while (true) {
            int R8 = PA.R(bArr, i12, i13, this.f32072g);
            c3345i4 = this.f32073h;
            c3990u4 = this.f32071f;
            if (R8 == i13) {
                break;
            }
            int i14 = R8 + 3;
            int i15 = lr.f26233a[i14] & 255;
            int i16 = R8 - i12;
            if (this.f32075k) {
                c4 = c9;
            } else {
                if (i16 > 0) {
                    c3345i4.a(bArr, i12, R8);
                }
                int i17 = i16 < 0 ? -i16 : 0;
                if (c3345i4.f31311a) {
                    int i18 = c3345i4.f31312b - i17;
                    c3345i4.f31312b = i18;
                    if (c3345i4.f31313c == 0 && i15 == 181) {
                        c3345i4.f31313c = i18;
                    } else {
                        c3345i4.f31311a = false;
                        String str = this.f32066a;
                        str.getClass();
                        byte[] copyOf = Arrays.copyOf(c3345i4.f31314d, c3345i4.f31312b);
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
                                f6 = 1.0f;
                            } else {
                                i10 = i23 * 121;
                                i11 = i21 * 100;
                            }
                            f6 = i10 / i11;
                        } else {
                            f6 = (i23 * 4) / (i21 * 3);
                        }
                        C4065vP c4065vP = new C4065vP();
                        c4065vP.f34773a = str;
                        c4065vP.d(this.f32069d);
                        c4065vP.e(com.anythink.basead.exoplayer.k.o.f8613n);
                        c4065vP.f34792u = i21;
                        c4065vP.f34793v = i23;
                        c4065vP.f34760A = f6;
                        c4065vP.f34788q = Collections.singletonList(copyOf);
                        TP tp = new TP(c4065vP);
                        int i24 = (copyOf[7] & 15) - 1;
                        long j11 = 0;
                        if (i24 >= 0 && i24 < 8) {
                            double d2 = f32065r[i24];
                            byte b10 = copyOf[c3345i4.f31313c + 9];
                            int i25 = (b10 & 96) >> 5;
                            if (i25 != (b10 & 31)) {
                                d2 = ((i25 + 1.0d) / (r5 + 1)) * d2;
                            }
                            j11 = (long) (1000000.0d / d2);
                        }
                        Pair create = Pair.create(tp, Long.valueOf(j11));
                        this.f32067b.e((TP) create.first);
                        this.f32076l = ((Long) create.second).longValue();
                        this.f32075k = true;
                        c4 = 3;
                    }
                } else if (i15 == 179) {
                    c3345i4.f31311a = true;
                }
                c4 = 3;
                c3345i4.a(C3345i4.f31310e, 0, 3);
            }
            if (c3990u4 != null) {
                if (i16 > 0) {
                    c3990u4.h(bArr, i12, R8);
                    i9 = 0;
                } else {
                    i9 = -i16;
                }
                if (c3990u4.i(i9)) {
                    int f9 = PA.f(c3990u4.f34532e, (byte[]) c3990u4.f34533f);
                    String str2 = AbstractC3548lu.f32613a;
                    byte[] bArr2 = (byte[]) c3990u4.f34533f;
                    Lr lr2 = this.f32070e;
                    lr2.z(f9, bArr2);
                    this.f32068c.s(this.f32079o, lr2);
                }
                if (i15 == 178) {
                    if (lr.f26233a[R8 + 2] == 1) {
                        c3990u4.g(178);
                    }
                    i = 178;
                    if (i != 0 || i == 179) {
                        i4 = i13 - R8;
                        if (this.f32081q && this.f32075k) {
                            j10 = this.f32079o;
                            if (j10 != com.anythink.basead.exoplayer.b.f6539b) {
                                this.f32067b.b(j10, this.f32080p ? 1 : 0, ((int) (this.i - this.f32078n)) - i4, i4, null);
                            }
                        }
                        if (this.f32074j || this.f32081q) {
                            this.f32078n = this.i - i4;
                            j9 = this.f32077m;
                            if (j9 == com.anythink.basead.exoplayer.b.f6539b) {
                                long j12 = this.f32079o;
                                j9 = j12 != com.anythink.basead.exoplayer.b.f6539b ? j12 + this.f32076l : -9223372036854775807L;
                            }
                            this.f32079o = j9;
                            z8 = false;
                            this.f32080p = false;
                            this.f32077m = com.anythink.basead.exoplayer.b.f6539b;
                            z9 = true;
                            this.f32074j = true;
                        } else {
                            z9 = true;
                            z8 = false;
                        }
                        if (i == 0) {
                            z8 = z9;
                        }
                        this.f32081q = z8;
                    } else if (i == 184) {
                        this.f32080p = true;
                    }
                    c9 = c4;
                    i12 = i14;
                }
            }
            i = i15;
            if (i != 0) {
            }
            i4 = i13 - R8;
            if (this.f32081q) {
                j10 = this.f32079o;
                if (j10 != com.anythink.basead.exoplayer.b.f6539b) {
                }
            }
            if (this.f32074j) {
            }
            this.f32078n = this.i - i4;
            j9 = this.f32077m;
            if (j9 == com.anythink.basead.exoplayer.b.f6539b) {
            }
            this.f32079o = j9;
            z8 = false;
            this.f32080p = false;
            this.f32077m = com.anythink.basead.exoplayer.b.f6539b;
            z9 = true;
            this.f32074j = true;
            if (i == 0) {
            }
            this.f32081q = z8;
            c9 = c4;
            i12 = i14;
        }
        if (!this.f32075k) {
            c3345i4.a(bArr, i12, i13);
        }
        if (c3990u4 != null) {
            c3990u4.h(bArr, i12, i13);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void d(int i, long j9) {
        this.f32077m = j9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void e(Q0 q02, D4 d42) {
        d42.a();
        d42.b();
        this.f32066a = d42.f24338e;
        d42.b();
        this.f32067b = q02.x(d42.f24337d, 2);
        C3602mu c3602mu = this.f32068c;
        if (c3602mu != null) {
            c3602mu.i(q02, d42);
        }
    }
}
