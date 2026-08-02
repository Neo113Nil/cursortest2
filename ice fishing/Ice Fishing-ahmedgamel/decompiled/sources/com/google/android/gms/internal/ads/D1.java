package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class D1 implements Q0 {

    /* renamed from: d, reason: collision with root package name */
    public FQ f25049d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC3566m1 f25050e;

    /* renamed from: g, reason: collision with root package name */
    public O3 f25052g;

    /* renamed from: h, reason: collision with root package name */
    public W0 f25053h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f25054j;

    /* renamed from: k, reason: collision with root package name */
    public C1 f25055k;

    /* renamed from: l, reason: collision with root package name */
    public int f25056l;

    /* renamed from: m, reason: collision with root package name */
    public long f25057m;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f25046a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    public final Cr f25047b = new Cr(new byte[32768], 0);

    /* renamed from: c, reason: collision with root package name */
    public final U0 f25048c = new U0();

    /* renamed from: f, reason: collision with root package name */
    public int f25051f = 0;

    static {
        int i = AbstractC2792Sd.f28293K;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0099  */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v27 */
    @Override // com.google.android.gms.internal.ads.Q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(R0 r02, U0 u02) {
        W0 w02;
        int i;
        InterfaceC3136e1 v02;
        long j6;
        boolean z6;
        long j9;
        boolean z9;
        long o4;
        long j10;
        boolean z10 = true;
        int i4 = this.f25051f;
        O3 o32 = null;
        if (i4 == 0) {
            ((K0) r02).f26573y = 0;
            K0 k02 = (K0) r02;
            long q8 = k02.q();
            O3 e9 = new Qx(2).e(k02, null, 0);
            if (e9 != null && e9.f27368a.length != 0) {
                o32 = e9;
            }
            k02.a((int) (k02.q() - q8), false);
            this.f25052g = o32;
            this.f25051f = 1;
            return 0;
        }
        byte[] bArr = this.f25046a;
        if (i4 == 1) {
            ((K0) r02).E(bArr, 0, 42, false);
            ((K0) r02).f26573y = 0;
            this.f25051f = 2;
            return 0;
        }
        int i6 = 3;
        int i9 = 4;
        if (i4 == 2) {
            Cr cr = new Cr(4);
            ((K0) r02).A(cr.f24997a, 0, 4, false);
            if (cr.P() != 1716281667) {
                throw U4.a(null, "Failed to read FLAC stream marker.");
            }
            this.f25051f = 3;
            return 0;
        }
        if (i4 != 3) {
            long j11 = 0;
            if (i4 == 4) {
                ((K0) r02).f26573y = 0;
                Cr cr2 = new Cr(2);
                K0 k03 = (K0) r02;
                k03.E(cr2.f24997a, 0, 2, false);
                int L2 = cr2.L();
                if ((L2 >> 2) != 16382) {
                    k03.f26573y = 0;
                    throw U4.a(null, "First frame does not start with sync code.");
                }
                k03.f26573y = 0;
                this.f25054j = L2;
                FQ fq = this.f25049d;
                String str = AbstractC3182eu.f30782a;
                long j12 = k03.f26571w;
                W0 w03 = this.f25053h;
                w03.getClass();
                S0.s sVar = w03.f29098k;
                if (sVar == null || ((long[]) sVar.f2969u).length <= 0) {
                    long j13 = k03.f26570v;
                    if (j13 == -1 || w03.f29097j <= 0) {
                        i = 0;
                        v02 = new V0(w03.a(), 0L);
                    } else {
                        int i10 = this.f25054j;
                        Ux ux = new Ux(2, w03);
                        B1 b12 = new B1(w03, i10);
                        long a9 = w03.a();
                        int i11 = w03.f29091c;
                        int i12 = w03.f29092d;
                        if (i12 > 0) {
                            j6 = ((i12 + i11) / 2) + 1;
                            i = 0;
                        } else {
                            int i13 = w03.f29090b;
                            long j14 = 4096;
                            int i14 = w03.f29089a;
                            if (i14 == i13 && i14 > 0) {
                                j14 = i14;
                            }
                            i = 0;
                            j6 = (((j14 * w03.f29095g) * w03.f29096h) / 8) + 64;
                        }
                        C1 c12 = new C1(ux, b12, a9, w03.f29097j, j12, j13, j6, Math.max(6, i11));
                        this.f25055k = c12;
                        v02 = c12.f24771a;
                    }
                } else {
                    v02 = new V0(w03, j12);
                    i = 0;
                }
                fq.D(v02);
                this.f25051f = 5;
                return i;
            }
            this.f25050e.getClass();
            W0 w04 = this.f25053h;
            w04.getClass();
            C1 c13 = this.f25055k;
            if (c13 != null && c13.f24773c != null) {
                return c13.b((K0) r02, u02);
            }
            if (this.f25057m == -1) {
                ((K0) r02).f26573y = 0;
                K0 k04 = (K0) r02;
                k04.d(1, false);
                byte[] bArr2 = new byte[1];
                k04.E(bArr2, 0, 1, false);
                int i15 = bArr2[0] & 1;
                boolean z11 = 1 == i15;
                k04.d(2, false);
                r9 = 1 != i15 ? 6 : 7;
                Cr cr3 = new Cr(r9);
                byte[] bArr3 = cr3.f24997a;
                int i16 = 0;
                while (i16 < r9) {
                    int c9 = k04.c(bArr3, i16, r9 - i16);
                    if (c9 == -1) {
                        break;
                    }
                    i16 += c9;
                }
                cr3.C(i16);
                k04.f26573y = 0;
                try {
                    o4 = cr3.o();
                    if (!z11) {
                        o4 *= w04.f29090b;
                    }
                    j10 = w04.f29097j;
                } catch (NumberFormatException unused) {
                }
                if (j10 == 0 || o4 <= j10) {
                    j11 = o4;
                    if (z10) {
                        throw U4.a(null, null);
                    }
                    this.f25057m = j11;
                }
                z10 = false;
                if (z10) {
                }
            } else {
                Cr cr4 = this.f25047b;
                int i17 = cr4.f24999c;
                if (i17 < 32768) {
                    int r9 = ((K0) r02).r(cr4.f24997a, i17, 32768 - i17);
                    z6 = r9 == -1;
                    if (!z6) {
                        cr4.C(i17 + r9);
                    } else if (cr4.B() == 0) {
                        long j15 = this.f25057m * 1000000;
                        W0 w05 = this.f25053h;
                        String str2 = AbstractC3182eu.f30782a;
                        this.f25050e.c(j15 / w05.f29093e, 1, this.f25056l, 0, null);
                        return -1;
                    }
                } else {
                    z6 = false;
                }
                int i18 = cr4.f24998b;
                int i19 = this.f25056l;
                int i20 = this.i;
                if (i19 < i20) {
                    cr4.G(Math.min(i20 - i19, cr4.B()));
                }
                this.f25053h.getClass();
                int i21 = cr4.f24998b;
                while (true) {
                    int i22 = cr4.f24999c - 16;
                    U0 u03 = this.f25048c;
                    if (i21 <= i22) {
                        cr4.E(i21);
                        if (AbstractC2991bG.m(cr4, this.f25053h, this.f25054j, u03)) {
                            cr4.E(i21);
                            j9 = u03.f28641n;
                            break;
                        }
                        i21++;
                    } else {
                        if (z6) {
                            while (true) {
                                int i23 = cr4.f24999c;
                                if (i21 > i23 - this.i) {
                                    cr4.E(i23);
                                    break;
                                }
                                cr4.E(i21);
                                try {
                                    z9 = AbstractC2991bG.m(cr4, this.f25053h, this.f25054j, u03);
                                } catch (IndexOutOfBoundsException unused2) {
                                    z9 = false;
                                }
                                if (cr4.f24998b <= cr4.f24999c && z9) {
                                    cr4.E(i21);
                                    j9 = u03.f28641n;
                                    break;
                                }
                                i21++;
                            }
                        } else {
                            cr4.E(i21);
                        }
                        j9 = -1;
                    }
                }
                int i24 = cr4.f24998b - i18;
                cr4.E(i18);
                this.f25050e.a(i24, cr4);
                int i25 = this.f25056l + i24;
                this.f25056l = i25;
                if (j9 != -1) {
                    long j16 = this.f25057m * 1000000;
                    W0 w06 = this.f25053h;
                    String str3 = AbstractC3182eu.f30782a;
                    this.f25050e.c(j16 / w06.f29093e, 1, i25, 0, null);
                    this.f25056l = 0;
                    this.f25057m = j9;
                }
                int length = cr4.f24997a.length - cr4.f24999c;
                if (cr4.B() < 16 && length < 16) {
                    int B3 = cr4.B();
                    byte[] bArr4 = cr4.f24997a;
                    System.arraycopy(bArr4, cr4.f24998b, bArr4, 0, B3);
                    cr4.E(0);
                    cr4.C(B3);
                }
            }
            return 0;
        }
        ?? r1 = 0;
        W0 w07 = this.f25053h;
        while (true) {
            ((K0) r02).f26573y = r1;
            byte[] bArr5 = new byte[i9];
            C4256yr c4256yr = new C4256yr(bArr5, i9);
            K0 k05 = (K0) r02;
            k05.E(bArr5, r1, i9, r1);
            boolean g9 = c4256yr.g();
            int h3 = c4256yr.h(r9);
            int h9 = c4256yr.h(24) + i9;
            if (h3 == 0) {
                byte[] bArr6 = new byte[38];
                k05.A(bArr6, r1, 38, r1);
                w07 = new W0(bArr6, i9);
            } else {
                if (w07 == null) {
                    throw new IllegalArgumentException();
                }
                if (h3 == i6) {
                    Cr cr5 = new Cr(h9);
                    k05.A(cr5.f24997a, 0, h9, false);
                    w07 = new W0(w07.f29089a, w07.f29090b, w07.f29091c, w07.f29092d, w07.f29093e, w07.f29095g, w07.f29096h, w07.f29097j, SK.z(cr5), w07.f29099l);
                } else {
                    O3 o33 = w07.f29099l;
                    if (h3 == i9) {
                        Cr cr6 = new Cr(h9);
                        k05.A(cr6.f24997a, 0, h9, false);
                        cr6.G(i9);
                        O3 a10 = AbstractC3674o1.a(Arrays.asList((String[]) QC.h(cr6, false, false).f35841u));
                        if (o33 != null) {
                            a10 = o33.b(a10);
                        }
                        w02 = new W0(w07.f29089a, w07.f29090b, w07.f29091c, w07.f29092d, w07.f29093e, w07.f29095g, w07.f29096h, w07.f29097j, w07.f29098k, a10);
                    } else if (h3 == 6) {
                        Cr cr7 = new Cr(h9);
                        k05.A(cr7.f24997a, 0, h9, false);
                        cr7.G(4);
                        O3 o34 = new O3(RB.j(S1.b(cr7)));
                        if (o33 != null) {
                            o34 = o33.b(o34);
                        }
                        w02 = new W0(w07.f29089a, w07.f29090b, w07.f29091c, w07.f29092d, w07.f29093e, w07.f29095g, w07.f29096h, w07.f29097j, w07.f29098k, o34);
                    } else {
                        k05.a(h9, false);
                    }
                    w07 = w02;
                }
            }
            String str4 = AbstractC3182eu.f30782a;
            this.f25053h = w07;
            if (g9) {
                this.i = Math.max(w07.f29091c, 6);
                DP b9 = this.f25053h.b(bArr, this.f25052g);
                InterfaceC3566m1 interfaceC3566m1 = this.f25050e;
                C3322hP c3322hP = new C3322hP(b9);
                c3322hP.d(com.anythink.basead.exoplayer.k.o.f9215K);
                interfaceC3566m1.e(new DP(c3322hP));
                InterfaceC3566m1 interfaceC3566m12 = this.f25050e;
                this.f25053h.a();
                interfaceC3566m12.getClass();
                this.f25051f = 4;
                return 0;
            }
            i9 = 4;
            r1 = 0;
            i6 = 3;
            r9 = 7;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        FQ fq = (FQ) s02;
        this.f25049d = fq;
        this.f25050e = fq.C(0, 1);
        fq.B();
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        if (j6 == 0) {
            this.f25051f = 0;
        } else {
            C1 c12 = this.f25055k;
            if (c12 != null) {
                c12.a(j9);
            }
        }
        this.f25057m = j9 != 0 ? -1L : 0L;
        this.f25056l = 0;
        this.f25047b.y(0);
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        K0 k02 = (K0) r02;
        O3 e9 = new Qx(2).e(k02, V2.f28868H, 0);
        if (e9 != null) {
            int length = e9.f27368a.length;
        }
        Cr cr = new Cr(4);
        k02.E(cr.f24997a, 0, 4, false);
        return cr.P() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void e() {
    }
}
