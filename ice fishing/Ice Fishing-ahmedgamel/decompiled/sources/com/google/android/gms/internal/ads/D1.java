package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class D1 implements Q0 {

    /* renamed from: d, reason: collision with root package name */
    public CQ f24304d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC3543m1 f24305e;

    /* renamed from: g, reason: collision with root package name */
    public O3 f24307g;

    /* renamed from: h, reason: collision with root package name */
    public W0 f24308h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f24309j;

    /* renamed from: k, reason: collision with root package name */
    public C1 f24310k;

    /* renamed from: l, reason: collision with root package name */
    public int f24311l;

    /* renamed from: m, reason: collision with root package name */
    public long f24312m;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f24301a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    public final Cr f24302b = new Cr(new byte[32768], 0);

    /* renamed from: c, reason: collision with root package name */
    public final U0 f24303c = new U0();

    /* renamed from: f, reason: collision with root package name */
    public int f24306f = 0;

    static {
        int i = AbstractC2772Sd.f27501K;
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
        InterfaceC3113e1 v02;
        long j6;
        boolean z3;
        long j9;
        boolean z6;
        long o6;
        long j10;
        boolean z9 = true;
        int i6 = this.f24306f;
        O3 o32 = null;
        if (i6 == 0) {
            ((K0) r02).f25821y = 0;
            K0 k02 = (K0) r02;
            long q8 = k02.q();
            O3 e9 = new Qx(2).e(k02, null, 0);
            if (e9 != null && e9.f26586a.length != 0) {
                o32 = e9;
            }
            k02.a((int) (k02.q() - q8), false);
            this.f24307g = o32;
            this.f24306f = 1;
            return 0;
        }
        byte[] bArr = this.f24301a;
        if (i6 == 1) {
            ((K0) r02).A(bArr, 0, 42, false);
            ((K0) r02).f25821y = 0;
            this.f24306f = 2;
            return 0;
        }
        int i9 = 3;
        int i10 = 4;
        if (i6 == 2) {
            Cr cr = new Cr(4);
            ((K0) r02).z(cr.f24252a, 0, 4, false);
            if (cr.P() != 1716281667) {
                throw U4.a(null, "Failed to read FLAC stream marker.");
            }
            this.f24306f = 3;
            return 0;
        }
        if (i6 != 3) {
            long j11 = 0;
            if (i6 == 4) {
                ((K0) r02).f25821y = 0;
                Cr cr2 = new Cr(2);
                K0 k03 = (K0) r02;
                k03.A(cr2.f24252a, 0, 2, false);
                int L6 = cr2.L();
                if ((L6 >> 2) != 16382) {
                    k03.f25821y = 0;
                    throw U4.a(null, "First frame does not start with sync code.");
                }
                k03.f25821y = 0;
                this.f24309j = L6;
                CQ cq = this.f24304d;
                String str = AbstractC3159eu.f29993a;
                long j12 = k03.f25819w;
                W0 w03 = this.f24308h;
                w03.getClass();
                S0.s sVar = w03.f28300k;
                if (sVar == null || ((long[]) sVar.f2840u).length <= 0) {
                    long j13 = k03.f25818v;
                    if (j13 == -1 || w03.f28299j <= 0) {
                        i = 0;
                        v02 = new V0(w03.a(), 0L);
                    } else {
                        int i11 = this.f24309j;
                        Ux ux = new Ux(2, w03);
                        B1 b12 = new B1(w03, i11);
                        long a9 = w03.a();
                        int i12 = w03.f28293c;
                        int i13 = w03.f28294d;
                        if (i13 > 0) {
                            j6 = ((i13 + i12) / 2) + 1;
                            i = 0;
                        } else {
                            int i14 = w03.f28292b;
                            long j14 = 4096;
                            int i15 = w03.f28291a;
                            if (i15 == i14 && i15 > 0) {
                                j14 = i15;
                            }
                            i = 0;
                            j6 = (((j14 * w03.f28297g) * w03.f28298h) / 8) + 64;
                        }
                        C1 c12 = new C1(ux, b12, a9, w03.f28299j, j12, j13, j6, Math.max(6, i12));
                        this.f24310k = c12;
                        v02 = c12.f24008a;
                    }
                } else {
                    v02 = new V0(w03, j12);
                    i = 0;
                }
                cq.D(v02);
                this.f24306f = 5;
                return i;
            }
            this.f24305e.getClass();
            W0 w04 = this.f24308h;
            w04.getClass();
            C1 c13 = this.f24310k;
            if (c13 != null && c13.f24010c != null) {
                return c13.b((K0) r02, u02);
            }
            if (this.f24312m == -1) {
                ((K0) r02).f25821y = 0;
                K0 k04 = (K0) r02;
                k04.c(1, false);
                byte[] bArr2 = new byte[1];
                k04.A(bArr2, 0, 1, false);
                int i16 = bArr2[0] & 1;
                boolean z10 = 1 == i16;
                k04.c(2, false);
                r9 = 1 != i16 ? 6 : 7;
                Cr cr3 = new Cr(r9);
                byte[] bArr3 = cr3.f24252a;
                int i17 = 0;
                while (i17 < r9) {
                    int b9 = k04.b(bArr3, i17, r9 - i17);
                    if (b9 == -1) {
                        break;
                    }
                    i17 += b9;
                }
                cr3.C(i17);
                k04.f25821y = 0;
                try {
                    o6 = cr3.o();
                    if (!z10) {
                        o6 *= w04.f28292b;
                    }
                    j10 = w04.f28299j;
                } catch (NumberFormatException unused) {
                }
                if (j10 == 0 || o6 <= j10) {
                    j11 = o6;
                    if (z9) {
                        throw U4.a(null, null);
                    }
                    this.f24312m = j11;
                }
                z9 = false;
                if (z9) {
                }
            } else {
                Cr cr4 = this.f24302b;
                int i18 = cr4.f24254c;
                if (i18 < 32768) {
                    int m4 = ((K0) r02).m(cr4.f24252a, i18, 32768 - i18);
                    z3 = m4 == -1;
                    if (!z3) {
                        cr4.C(i18 + m4);
                    } else if (cr4.B() == 0) {
                        long j15 = this.f24312m * 1000000;
                        W0 w05 = this.f24308h;
                        String str2 = AbstractC3159eu.f29993a;
                        this.f24305e.c(j15 / w05.f28295e, 1, this.f24311l, 0, null);
                        return -1;
                    }
                } else {
                    z3 = false;
                }
                int i19 = cr4.f24253b;
                int i20 = this.f24311l;
                int i21 = this.i;
                if (i20 < i21) {
                    cr4.G(Math.min(i21 - i20, cr4.B()));
                }
                this.f24308h.getClass();
                int i22 = cr4.f24253b;
                while (true) {
                    int i23 = cr4.f24254c - 16;
                    U0 u03 = this.f24303c;
                    if (i22 <= i23) {
                        cr4.E(i22);
                        if (AbstractC2968bG.m(cr4, this.f24308h, this.f24309j, u03)) {
                            cr4.E(i22);
                            j9 = u03.f27844n;
                            break;
                        }
                        i22++;
                    } else {
                        if (z3) {
                            while (true) {
                                int i24 = cr4.f24254c;
                                if (i22 > i24 - this.i) {
                                    cr4.E(i24);
                                    break;
                                }
                                cr4.E(i22);
                                try {
                                    z6 = AbstractC2968bG.m(cr4, this.f24308h, this.f24309j, u03);
                                } catch (IndexOutOfBoundsException unused2) {
                                    z6 = false;
                                }
                                if (cr4.f24253b <= cr4.f24254c && z6) {
                                    cr4.E(i22);
                                    j9 = u03.f27844n;
                                    break;
                                }
                                i22++;
                            }
                        } else {
                            cr4.E(i22);
                        }
                        j9 = -1;
                    }
                }
                int i25 = cr4.f24253b - i19;
                cr4.E(i19);
                this.f24305e.a(i25, cr4);
                int i26 = this.f24311l + i25;
                this.f24311l = i26;
                if (j9 != -1) {
                    long j16 = this.f24312m * 1000000;
                    W0 w06 = this.f24308h;
                    String str3 = AbstractC3159eu.f29993a;
                    this.f24305e.c(j16 / w06.f28295e, 1, i26, 0, null);
                    this.f24311l = 0;
                    this.f24312m = j9;
                }
                int length = cr4.f24252a.length - cr4.f24254c;
                if (cr4.B() < 16 && length < 16) {
                    int B9 = cr4.B();
                    byte[] bArr4 = cr4.f24252a;
                    System.arraycopy(bArr4, cr4.f24253b, bArr4, 0, B9);
                    cr4.E(0);
                    cr4.C(B9);
                }
            }
            return 0;
        }
        ?? r12 = 0;
        W0 w07 = this.f24308h;
        while (true) {
            ((K0) r02).f25821y = r12;
            byte[] bArr5 = new byte[i10];
            C4233yr c4233yr = new C4233yr(bArr5, i10);
            K0 k05 = (K0) r02;
            k05.A(bArr5, r12, i10, r12);
            boolean g4 = c4233yr.g();
            int h9 = c4233yr.h(r9);
            int h10 = c4233yr.h(24) + i10;
            if (h9 == 0) {
                byte[] bArr6 = new byte[38];
                k05.z(bArr6, r12, 38, r12);
                w07 = new W0(bArr6, i10);
            } else {
                if (w07 == null) {
                    throw new IllegalArgumentException();
                }
                if (h9 == i9) {
                    Cr cr5 = new Cr(h10);
                    k05.z(cr5.f24252a, 0, h10, false);
                    w07 = new W0(w07.f28291a, w07.f28292b, w07.f28293c, w07.f28294d, w07.f28295e, w07.f28297g, w07.f28298h, w07.f28299j, SK.z(cr5), w07.f28301l);
                } else {
                    O3 o33 = w07.f28301l;
                    if (h9 == i10) {
                        Cr cr6 = new Cr(h10);
                        k05.z(cr6.f24252a, 0, h10, false);
                        cr6.G(i10);
                        O3 a10 = AbstractC3651o1.a(Arrays.asList((String[]) QC.h(cr6, false, false).f35055u));
                        if (o33 != null) {
                            a10 = o33.b(a10);
                        }
                        w02 = new W0(w07.f28291a, w07.f28292b, w07.f28293c, w07.f28294d, w07.f28295e, w07.f28297g, w07.f28298h, w07.f28299j, w07.f28300k, a10);
                    } else if (h9 == 6) {
                        Cr cr7 = new Cr(h10);
                        k05.z(cr7.f24252a, 0, h10, false);
                        cr7.G(4);
                        O3 o34 = new O3(RB.j(S1.b(cr7)));
                        if (o33 != null) {
                            o34 = o33.b(o34);
                        }
                        w02 = new W0(w07.f28291a, w07.f28292b, w07.f28293c, w07.f28294d, w07.f28295e, w07.f28297g, w07.f28298h, w07.f28299j, w07.f28300k, o34);
                    } else {
                        k05.a(h10, false);
                    }
                    w07 = w02;
                }
            }
            String str4 = AbstractC3159eu.f29993a;
            this.f24308h = w07;
            if (g4) {
                this.i = Math.max(w07.f28293c, 6);
                DP b10 = this.f24308h.b(bArr, this.f24307g);
                InterfaceC3543m1 interfaceC3543m1 = this.f24305e;
                C3299hP c3299hP = new C3299hP(b10);
                c3299hP.d(com.anythink.basead.exoplayer.k.o.f8429K);
                interfaceC3543m1.e(new DP(c3299hP));
                InterfaceC3543m1 interfaceC3543m12 = this.f24305e;
                this.f24308h.a();
                interfaceC3543m12.getClass();
                this.f24306f = 4;
                return 0;
            }
            i10 = 4;
            r12 = 0;
            i9 = 3;
            r9 = 7;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        CQ cq = (CQ) s02;
        this.f24304d = cq;
        this.f24305e = cq.C(0, 1);
        cq.B();
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        if (j6 == 0) {
            this.f24306f = 0;
        } else {
            C1 c12 = this.f24310k;
            if (c12 != null) {
                c12.a(j9);
            }
        }
        this.f24312m = j9 != 0 ? -1L : 0L;
        this.f24311l = 0;
        this.f24302b.y(0);
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        K0 k02 = (K0) r02;
        O3 e9 = new Qx(2).e(k02, V2.f28071H, 0);
        if (e9 != null) {
            int length = e9.f26586a.length;
        }
        Cr cr = new Cr(4);
        k02.A(cr.f24252a, 0, 4, false);
        return cr.P() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void e() {
    }
}
