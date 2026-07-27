package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class B1 implements O0 {

    /* renamed from: d, reason: collision with root package name */
    public PQ f23946d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC3448k1 f23947e;

    /* renamed from: g, reason: collision with root package name */
    public R3 f23949g;

    /* renamed from: h, reason: collision with root package name */
    public U0 f23950h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f23951j;

    /* renamed from: k, reason: collision with root package name */
    public A1 f23952k;

    /* renamed from: l, reason: collision with root package name */
    public int f23953l;

    /* renamed from: m, reason: collision with root package name */
    public long f23954m;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f23943a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    public final Lr f23944b = new Lr(new byte[32768], 0);

    /* renamed from: c, reason: collision with root package name */
    public final S0 f23945c = new S0();

    /* renamed from: f, reason: collision with root package name */
    public int f23948f = 0;

    static {
        int i = PA.f26868T;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void a(Q0 q02) {
        PQ pq = (PQ) q02;
        this.f23946d = pq;
        this.f23947e = pq.x(0, 1);
        pq.v();
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final boolean b(P0 p02) {
        J0 j02 = (J0) p02;
        R3 e6 = new Rx(2).e(j02, T2.f27686H, 0);
        if (e6 != null) {
            int length = e6.f27306a.length;
        }
        Lr lr = new Lr(4);
        j02.I(lr.f26233a, 0, 4, false);
        return lr.P() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void c(long j9, long j10) {
        if (j9 == 0) {
            this.f23948f = 0;
        } else {
            A1 a12 = this.f23952k;
            if (a12 != null) {
                a12.a(j10);
            }
        }
        this.f23954m = j10 != 0 ? -1L : 0L;
        this.f23953l = 0;
        this.f23944b.y(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0099  */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v27 */
    @Override // com.google.android.gms.internal.ads.O0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(P0 p02, S0 s02) {
        U0 u02;
        int i;
        InterfaceC3015c1 t02;
        long j9;
        boolean z8;
        long j10;
        boolean z9;
        long o9;
        long j11;
        boolean z10 = true;
        int i4 = this.f23948f;
        R3 r32 = null;
        if (i4 == 0) {
            ((J0) p02).f25677y = 0;
            J0 j02 = (J0) p02;
            long m8 = j02.m();
            R3 e6 = new Rx(2).e(j02, null, 0);
            if (e6 != null && e6.f27306a.length != 0) {
                r32 = e6;
            }
            j02.b((int) (j02.m() - m8), false);
            this.f23949g = r32;
            this.f23948f = 1;
            return 0;
        }
        byte[] bArr = this.f23943a;
        if (i4 == 1) {
            ((J0) p02).I(bArr, 0, 42, false);
            ((J0) p02).f25677y = 0;
            this.f23948f = 2;
            return 0;
        }
        int i9 = 3;
        int i10 = 4;
        if (i4 == 2) {
            Lr lr = new Lr(4);
            ((J0) p02).E(lr.f26233a, 0, 4, false);
            if (lr.P() != 1716281667) {
                throw W4.a(null, "Failed to read FLAC stream marker.");
            }
            this.f23948f = 3;
            return 0;
        }
        if (i4 != 3) {
            long j12 = 0;
            if (i4 == 4) {
                ((J0) p02).f25677y = 0;
                Lr lr2 = new Lr(2);
                J0 j03 = (J0) p02;
                j03.I(lr2.f26233a, 0, 2, false);
                int L8 = lr2.L();
                if ((L8 >> 2) != 16382) {
                    j03.f25677y = 0;
                    throw W4.a(null, "First frame does not start with sync code.");
                }
                j03.f25677y = 0;
                this.f23951j = L8;
                PQ pq = this.f23946d;
                String str = AbstractC3548lu.f32613a;
                long j13 = j03.f25675w;
                U0 u03 = this.f23950h;
                u03.getClass();
                C2881Yl c2881Yl = u03.f27909k;
                if (c2881Yl == null || ((long[]) c2881Yl.f28862u).length <= 0) {
                    long j14 = j03.f25674v;
                    if (j14 == -1 || u03.f27908j <= 0) {
                        i = 0;
                        t02 = new T0(u03.a(), 0L);
                    } else {
                        int i11 = this.f23951j;
                        Vx vx = new Vx(2, u03);
                        C4257z1 c4257z1 = new C4257z1(u03, i11);
                        long a9 = u03.a();
                        int i12 = u03.f27902c;
                        int i13 = u03.f27903d;
                        if (i13 > 0) {
                            j9 = ((i13 + i12) / 2) + 1;
                            i = 0;
                        } else {
                            int i14 = u03.f27901b;
                            long j15 = 4096;
                            int i15 = u03.f27900a;
                            if (i15 == i14 && i15 > 0) {
                                j15 = i15;
                            }
                            i = 0;
                            j9 = (((j15 * u03.f27906g) * u03.f27907h) / 8) + 64;
                        }
                        A1 a12 = new A1(vx, c4257z1, a9, u03.f27908j, j13, j14, j9, Math.max(6, i12));
                        this.f23952k = a12;
                        t02 = a12.f23798a;
                    }
                } else {
                    t02 = new T0(u03, j13);
                    i = 0;
                }
                pq.w(t02);
                this.f23948f = 5;
                return i;
            }
            this.f23947e.getClass();
            U0 u04 = this.f23950h;
            u04.getClass();
            A1 a13 = this.f23952k;
            if (a13 != null && a13.f23800c != null) {
                return a13.b((J0) p02, s02);
            }
            if (this.f23954m == -1) {
                ((J0) p02).f25677y = 0;
                J0 j04 = (J0) p02;
                j04.d(1, false);
                byte[] bArr2 = new byte[1];
                j04.I(bArr2, 0, 1, false);
                int i16 = bArr2[0] & 1;
                boolean z11 = 1 == i16;
                j04.d(2, false);
                r9 = 1 != i16 ? 6 : 7;
                Lr lr3 = new Lr(r9);
                byte[] bArr3 = lr3.f26233a;
                int i17 = 0;
                while (i17 < r9) {
                    int c4 = j04.c(bArr3, i17, r9 - i17);
                    if (c4 == -1) {
                        break;
                    }
                    i17 += c4;
                }
                lr3.C(i17);
                j04.f25677y = 0;
                try {
                    o9 = lr3.o();
                    if (!z11) {
                        o9 *= u04.f27901b;
                    }
                    j11 = u04.f27908j;
                } catch (NumberFormatException unused) {
                }
                if (j11 == 0 || o9 <= j11) {
                    j12 = o9;
                    if (z10) {
                        throw W4.a(null, null);
                    }
                    this.f23954m = j12;
                }
                z10 = false;
                if (z10) {
                }
            } else {
                Lr lr4 = this.f23944b;
                int i18 = lr4.f26235c;
                if (i18 < 32768) {
                    int z12 = ((J0) p02).z(lr4.f26233a, i18, 32768 - i18);
                    z8 = z12 == -1;
                    if (!z8) {
                        lr4.C(i18 + z12);
                    } else if (lr4.B() == 0) {
                        long j16 = this.f23954m * 1000000;
                        U0 u05 = this.f23950h;
                        String str2 = AbstractC3548lu.f32613a;
                        this.f23947e.b(j16 / u05.f27904e, 1, this.f23953l, 0, null);
                        return -1;
                    }
                } else {
                    z8 = false;
                }
                int i19 = lr4.f26234b;
                int i20 = this.f23953l;
                int i21 = this.i;
                if (i20 < i21) {
                    lr4.G(Math.min(i21 - i20, lr4.B()));
                }
                this.f23950h.getClass();
                int i22 = lr4.f26234b;
                while (true) {
                    int i23 = lr4.f26235c - 16;
                    S0 s03 = this.f23945c;
                    if (i22 <= i23) {
                        lr4.E(i22);
                        if (AbstractC2655Lg.l(lr4, this.f23950h, this.f23951j, s03)) {
                            lr4.E(i22);
                            j10 = s03.f27467n;
                            break;
                        }
                        i22++;
                    } else {
                        if (z8) {
                            while (true) {
                                int i24 = lr4.f26235c;
                                if (i22 > i24 - this.i) {
                                    lr4.E(i24);
                                    break;
                                }
                                lr4.E(i22);
                                try {
                                    z9 = AbstractC2655Lg.l(lr4, this.f23950h, this.f23951j, s03);
                                } catch (IndexOutOfBoundsException unused2) {
                                    z9 = false;
                                }
                                if (lr4.f26234b <= lr4.f26235c && z9) {
                                    lr4.E(i22);
                                    j10 = s03.f27467n;
                                    break;
                                }
                                i22++;
                            }
                        } else {
                            lr4.E(i22);
                        }
                        j10 = -1;
                    }
                }
                int i25 = lr4.f26234b - i19;
                lr4.E(i19);
                this.f23947e.a(i25, lr4);
                int i26 = this.f23953l + i25;
                this.f23953l = i26;
                if (j10 != -1) {
                    long j17 = this.f23954m * 1000000;
                    U0 u06 = this.f23950h;
                    String str3 = AbstractC3548lu.f32613a;
                    this.f23947e.b(j17 / u06.f27904e, 1, i26, 0, null);
                    this.f23953l = 0;
                    this.f23954m = j10;
                }
                int length = lr4.f26233a.length - lr4.f26235c;
                if (lr4.B() < 16 && length < 16) {
                    int B8 = lr4.B();
                    byte[] bArr4 = lr4.f26233a;
                    System.arraycopy(bArr4, lr4.f26234b, bArr4, 0, B8);
                    lr4.E(0);
                    lr4.C(B8);
                }
            }
            return 0;
        }
        ?? r12 = 0;
        U0 u07 = this.f23950h;
        while (true) {
            ((J0) p02).f25677y = r12;
            byte[] bArr5 = new byte[i10];
            Er er = new Er(bArr5, i10);
            J0 j05 = (J0) p02;
            j05.I(bArr5, r12, i10, r12);
            boolean g9 = er.g();
            int h9 = er.h(r9);
            int h10 = er.h(24) + i10;
            if (h9 == 0) {
                byte[] bArr6 = new byte[38];
                j05.E(bArr6, r12, 38, r12);
                u07 = new U0(bArr6, i10);
            } else {
                if (u07 == null) {
                    throw new IllegalArgumentException();
                }
                if (h9 == i9) {
                    Lr lr5 = new Lr(h10);
                    j05.E(lr5.f26233a, 0, h10, false);
                    u07 = new U0(u07.f27900a, u07.f27901b, u07.f27902c, u07.f27903d, u07.f27904e, u07.f27906g, u07.f27907h, u07.f27908j, AbstractC3217fl.E(lr5), u07.f27910l);
                } else {
                    R3 r33 = u07.f27910l;
                    if (h9 == i10) {
                        Lr lr6 = new Lr(h10);
                        j05.E(lr6.f26233a, 0, h10, false);
                        lr6.G(i10);
                        R3 a10 = AbstractC3556m1.a(Arrays.asList((String[]) C3686oN.h(lr6, false, false).f23905u));
                        if (r33 != null) {
                            a10 = r33.b(a10);
                        }
                        u02 = new U0(u07.f27900a, u07.f27901b, u07.f27902c, u07.f27903d, u07.f27904e, u07.f27906g, u07.f27907h, u07.f27908j, u07.f27909k, a10);
                    } else if (h9 == 6) {
                        Lr lr7 = new Lr(h10);
                        j05.E(lr7.f26233a, 0, h10, false);
                        lr7.G(4);
                        R3 r34 = new R3(UB.j(Q1.b(lr7)));
                        if (r33 != null) {
                            r34 = r33.b(r34);
                        }
                        u02 = new U0(u07.f27900a, u07.f27901b, u07.f27902c, u07.f27903d, u07.f27904e, u07.f27906g, u07.f27907h, u07.f27908j, u07.f27909k, r34);
                    } else {
                        j05.b(h10, false);
                    }
                    u07 = u02;
                }
            }
            String str4 = AbstractC3548lu.f32613a;
            this.f23950h = u07;
            if (g9) {
                this.i = Math.max(u07.f27902c, 6);
                TP b9 = this.f23950h.b(bArr, this.f23949g);
                InterfaceC3448k1 interfaceC3448k1 = this.f23947e;
                C4065vP c4065vP = new C4065vP(b9);
                c4065vP.d(com.anythink.basead.exoplayer.k.o.f8586K);
                interfaceC3448k1.e(new TP(c4065vP));
                InterfaceC3448k1 interfaceC3448k12 = this.f23947e;
                this.f23950h.a();
                interfaceC3448k12.getClass();
                this.f23948f = 4;
                return 0;
            }
            i10 = 4;
            r12 = 0;
            i9 = 3;
            r9 = 7;
        }
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void f() {
    }
}
