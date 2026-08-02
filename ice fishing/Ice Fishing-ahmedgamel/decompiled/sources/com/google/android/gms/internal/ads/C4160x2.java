package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.x2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4160x2 implements Q0 {

    /* renamed from: e, reason: collision with root package name */
    public FQ f35705e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC3566m1 f35706f;

    /* renamed from: h, reason: collision with root package name */
    public int f35708h;
    public O3 i;

    /* renamed from: j, reason: collision with root package name */
    public O3 f35709j;

    /* renamed from: l, reason: collision with root package name */
    public long f35711l;

    /* renamed from: m, reason: collision with root package name */
    public long f35712m;

    /* renamed from: o, reason: collision with root package name */
    public int f35714o;

    /* renamed from: p, reason: collision with root package name */
    public B2 f35715p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f35716q;

    /* renamed from: a, reason: collision with root package name */
    public final Cr f35701a = new Cr(10);

    /* renamed from: b, reason: collision with root package name */
    public final C3029c1 f35702b = new C3029c1();

    /* renamed from: c, reason: collision with root package name */
    public final Z0 f35703c = new Z0();

    /* renamed from: k, reason: collision with root package name */
    public long f35710k = com.anythink.basead.exoplayer.b.f7168b;

    /* renamed from: d, reason: collision with root package name */
    public final Qx f35704d = new Qx(2);

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC3566m1 f35707g = new O0();

    /* renamed from: n, reason: collision with root package name */
    public long f35713n = -1;

    static {
        int i = AbstractC2991bG.f30056R;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0384, code lost:
    
        if (r5.a(r12) != false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x03bb, code lost:
    
        if (((com.google.android.gms.internal.ads.C3245g2) r7).f29779a.equals("TLEN") != false) goto L171;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0364  */
    @Override // com.google.android.gms.internal.ads.Q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(R0 r02, U0 u02) {
        C3029c1 c3029c1;
        int i;
        int i4;
        int d9;
        int i6;
        Z0 z02;
        int b9;
        long[] jArr;
        int i9;
        int i10;
        C4268z2 c4268z2;
        C4268z2 c4268z22;
        boolean z6;
        O3 o32;
        long j6;
        long j9;
        B2 c3998u2;
        O3 o33;
        InterfaceC3945t3 interfaceC3945t3;
        InterfaceC3945t3 interfaceC3945t32;
        char c9;
        long u6;
        B2 c4052v2;
        B2 b22;
        O3 o34;
        int K7;
        this.f35706f.getClass();
        String str = AbstractC3182eu.f30782a;
        if (this.f35708h == 0) {
            try {
                g((K0) r02, false);
            } catch (EOFException unused) {
            }
        }
        B2 b23 = this.f35715p;
        C3029c1 c3029c12 = this.f35702b;
        Cr cr = this.f35701a;
        if (b23 == null) {
            Cr cr2 = new Cr(c3029c12.f30192b);
            ((K0) r02).E(cr2.f24997a, 0, c3029c12.f30192b, false);
            int i11 = 21;
            if ((c3029c12.f30191a & 1) != 0) {
                if (c3029c12.f30194d != 1) {
                    i11 = 36;
                }
            } else if (c3029c12.f30194d == 1) {
                i11 = 13;
            }
            if (cr2.f24999c >= i11 + 4) {
                cr2.E(i11);
                i6 = cr2.b();
                if (i6 != 1483304551) {
                    if (i6 == 1231971951) {
                        i6 = 1231971951;
                    }
                }
                z02 = this.f35703c;
                if (i6 != 1231971951) {
                    if (i6 == 1447187017) {
                        K0 k02 = (K0) r02;
                        long j10 = k02.f26571w;
                        cr2.G(6);
                        int b10 = cr2.b();
                        long j11 = c3029c12.f30192b;
                        long j12 = b10;
                        if (cr2.b() > 0) {
                            long v9 = AbstractC3182eu.v(c3029c12.f30193c, (r4 * c3029c12.f30196f) - 1);
                            int L2 = cr2.L();
                            int L6 = cr2.L();
                            int L8 = cr2.L();
                            cr2.G(2);
                            long[] jArr2 = new long[L2];
                            long[] jArr3 = new long[L2];
                            long j13 = c3029c12.f30192b + j10;
                            int i12 = 0;
                            while (i12 < L2) {
                                long j14 = j11;
                                int i13 = i12;
                                jArr2[i13] = (i12 * v9) / L2;
                                jArr3[i13] = j13;
                                if (L8 == 1) {
                                    K7 = cr2.K();
                                } else if (L8 == 2) {
                                    K7 = cr2.L();
                                } else if (L8 == 3) {
                                    K7 = cr2.O();
                                } else if (L8 == 4) {
                                    K7 = cr2.h();
                                }
                                j13 += K7 * L6;
                                i12 = i13 + 1;
                                j11 = j14;
                                L6 = L6;
                                L8 = L8;
                            }
                            long j15 = j10 + j11 + j12;
                            long j16 = k02.f26570v;
                            if (j16 != -1 && j16 != j15) {
                                StringBuilder sb = new StringBuilder(String.valueOf(j16).length() + 27 + String.valueOf(j15).length());
                                com.IceFishing.LiveIceFishing.k.z(sb, "VBRI data size mismatch: ", j16, ", ");
                                sb.append(j15);
                                AbstractC2991bG.y("VbriSeeker", sb.toString());
                            }
                            if (j15 != j13) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(j13).length() + String.valueOf(j15).length() + 43 + 28);
                                com.IceFishing.LiveIceFishing.k.z(sb2, "VBRI bytes and ToC mismatch (using max): ", j15, ", ");
                                sb2.append(j13);
                                sb2.append("\nSeeking will be inaccurate.");
                                AbstractC2991bG.y("VbriSeeker", sb2.toString());
                                j15 = Math.max(j15, j13);
                            }
                            c3998u2 = new C2(jArr2, jArr3, v9, j15, c3029c12.f30195e);
                            k02.a(c3029c12.f30192b, false);
                            c3029c1 = c3029c12;
                            o33 = this.i;
                            K0 k03 = (K0) r02;
                            long j17 = k03.f26571w;
                            if (o33 != null) {
                            }
                            c4052v2 = null;
                            if (this.f35716q) {
                            }
                            this.f35715p = b22;
                            this.f35705e.D(b22);
                            o34 = this.i;
                            if (o34 == null) {
                            }
                            C3322hP c3322hP = new C3322hP();
                            c3322hP.d(com.anythink.basead.exoplayer.k.o.f9248t);
                            c3322hP.e((String) c3029c1.f30197g);
                            c3322hP.f31559o = 4096;
                            c3322hP.f31538G = c3029c1.f30194d;
                            c3322hP.f31540I = c3029c1.f30193c;
                            c3322hP.f31541K = z02.f29596a;
                            c3322hP.f31542L = z02.f29597b;
                            c3322hP.f31555k = o34;
                            if (this.f35715p.g() != -2147483647) {
                            }
                            this.f35707g.e(new DP(c3322hP));
                            this.f35712m = k03.f26571w;
                        }
                        c3998u2 = null;
                        k02.a(c3029c12.f30192b, false);
                        c3029c1 = c3029c12;
                        o33 = this.i;
                        K0 k032 = (K0) r02;
                        long j172 = k032.f26571w;
                        if (o33 != null) {
                        }
                        c4052v2 = null;
                        if (this.f35716q) {
                        }
                        this.f35715p = b22;
                        this.f35705e.D(b22);
                        o34 = this.i;
                        if (o34 == null) {
                        }
                        C3322hP c3322hP2 = new C3322hP();
                        c3322hP2.d(com.anythink.basead.exoplayer.k.o.f9248t);
                        c3322hP2.e((String) c3029c1.f30197g);
                        c3322hP2.f31559o = 4096;
                        c3322hP2.f31538G = c3029c1.f30194d;
                        c3322hP2.f31540I = c3029c1.f30193c;
                        c3322hP2.f31541K = z02.f29596a;
                        c3322hP2.f31542L = z02.f29597b;
                        c3322hP2.f31555k = o34;
                        if (this.f35715p.g() != -2147483647) {
                        }
                        this.f35707g.e(new DP(c3322hP2));
                        this.f35712m = k032.f26571w;
                    } else if (i6 != 1483304551) {
                        ((K0) r02).f26573y = 0;
                        c3029c1 = c3029c12;
                        c3998u2 = null;
                        o33 = this.i;
                        K0 k0322 = (K0) r02;
                        long j1722 = k0322.f26571w;
                        if (o33 != null) {
                            ZA za = ZA.f29626n;
                            InterfaceC3945t3[] interfaceC3945t3Arr = o33.f27368a;
                            int length = interfaceC3945t3Arr.length;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= length) {
                                    interfaceC3945t3 = null;
                                    break;
                                }
                                InterfaceC3945t3 interfaceC3945t33 = interfaceC3945t3Arr[i14];
                                if (C3137e2.class.isAssignableFrom(interfaceC3945t33.getClass())) {
                                    interfaceC3945t3 = (InterfaceC3945t3) C3137e2.class.cast(interfaceC3945t33);
                                }
                                interfaceC3945t3 = null;
                                if (interfaceC3945t3 != null) {
                                    break;
                                }
                                i14++;
                            }
                            C3137e2 c3137e2 = (C3137e2) interfaceC3945t3;
                            if (c3137e2 != null) {
                                InterfaceC3945t3[] interfaceC3945t3Arr2 = o33.f27368a;
                                int length2 = interfaceC3945t3Arr2.length;
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= length2) {
                                        interfaceC3945t32 = null;
                                        break;
                                    }
                                    InterfaceC3945t3 interfaceC3945t34 = interfaceC3945t3Arr2[i15];
                                    if (C3245g2.class.isAssignableFrom(interfaceC3945t34.getClass())) {
                                        interfaceC3945t32 = (InterfaceC3945t3) C3245g2.class.cast(interfaceC3945t34);
                                    }
                                    interfaceC3945t32 = null;
                                    if (interfaceC3945t32 != null) {
                                        break;
                                    }
                                    i15++;
                                }
                                C3245g2 c3245g2 = (C3245g2) interfaceC3945t32;
                                if (c3245g2 == null) {
                                    u6 = -9223372036854775807L;
                                    c9 = 0;
                                } else {
                                    c9 = 0;
                                    u6 = AbstractC3182eu.u(Long.parseLong((String) c3245g2.f31258c.get(0)));
                                }
                                int[] iArr = c3137e2.f30662e;
                                int length3 = iArr.length;
                                int i16 = length3 + 1;
                                long[] jArr4 = new long[i16];
                                long[] jArr5 = new long[i16];
                                jArr4[c9] = j1722;
                                jArr5[c9] = 0;
                                long j18 = 0;
                                int i17 = 1;
                                while (i17 <= length3) {
                                    int i18 = i17 - 1;
                                    long j19 = j1722 + c3137e2.f30660c + iArr[i18];
                                    j18 += c3137e2.f30661d + c3137e2.f30663f[i18];
                                    jArr4[i17] = j19;
                                    jArr5[i17] = j18;
                                    i17++;
                                    iArr = iArr;
                                    j1722 = j19;
                                }
                                c4052v2 = new C4052v2(u6, jArr4, jArr5);
                                if (this.f35716q) {
                                    B2 b24 = c4052v2 != null ? c4052v2 : c3998u2 == null ? null : c3998u2;
                                    if (b24 == null) {
                                        k0322.E(cr.f24997a, 0, 4, false);
                                        cr.E(0);
                                        c3029c1.a(cr.b());
                                        b22 = new C3998u2(k0322.f26570v, k0322.f26571w, c3029c1.f30195e, c3029c1.f30192b, true);
                                    } else {
                                        b22 = b24;
                                    }
                                    InterfaceC3566m1 interfaceC3566m1 = this.f35706f;
                                    b22.c();
                                    interfaceC3566m1.getClass();
                                } else {
                                    b22 = new A2(com.anythink.basead.exoplayer.b.f7168b, 0L);
                                }
                                this.f35715p = b22;
                                this.f35705e.D(b22);
                                o34 = this.i;
                                if (o34 == null) {
                                    O3 o35 = this.f35709j;
                                    if (o35 != null) {
                                        o34 = o34.b(o35);
                                    }
                                } else {
                                    o34 = this.f35709j;
                                }
                                C3322hP c3322hP22 = new C3322hP();
                                c3322hP22.d(com.anythink.basead.exoplayer.k.o.f9248t);
                                c3322hP22.e((String) c3029c1.f30197g);
                                c3322hP22.f31559o = 4096;
                                c3322hP22.f31538G = c3029c1.f30194d;
                                c3322hP22.f31540I = c3029c1.f30193c;
                                c3322hP22.f31541K = z02.f29596a;
                                c3322hP22.f31542L = z02.f29597b;
                                c3322hP22.f31555k = o34;
                                if (this.f35715p.g() != -2147483647) {
                                    c3322hP22.f31553h = this.f35715p.g();
                                }
                                this.f35707g.e(new DP(c3322hP22));
                                this.f35712m = k0322.f26571w;
                            }
                        }
                        c4052v2 = null;
                        if (this.f35716q) {
                        }
                        this.f35715p = b22;
                        this.f35705e.D(b22);
                        o34 = this.i;
                        if (o34 == null) {
                        }
                        C3322hP c3322hP222 = new C3322hP();
                        c3322hP222.d(com.anythink.basead.exoplayer.k.o.f9248t);
                        c3322hP222.e((String) c3029c1.f30197g);
                        c3322hP222.f31559o = 4096;
                        c3322hP222.f31538G = c3029c1.f30194d;
                        c3322hP222.f31540I = c3029c1.f30193c;
                        c3322hP222.f31541K = z02.f29596a;
                        c3322hP222.f31542L = z02.f29597b;
                        c3322hP222.f31555k = o34;
                        if (this.f35715p.g() != -2147483647) {
                        }
                        this.f35707g.e(new DP(c3322hP222));
                        this.f35712m = k0322.f26571w;
                    }
                }
                b9 = cr2.b();
                int h3 = (b9 & 1) != 0 ? cr2.h() : -1;
                long P8 = (b9 & 2) != 0 ? cr2.P() : -1L;
                if ((b9 & 4) == 4) {
                    long[] jArr6 = new long[100];
                    int i19 = 0;
                    for (int i20 = 100; i19 < i20; i20 = 100) {
                        long[] jArr7 = jArr6;
                        jArr7[i19] = cr2.K();
                        i19++;
                        jArr6 = jArr7;
                    }
                    jArr = jArr6;
                } else {
                    jArr = null;
                }
                if ((b9 & 8) != 0) {
                    cr2.G(4);
                }
                if (cr2.B() >= 24) {
                    cr2.G(11);
                    float intBitsToFloat = Float.intBitsToFloat(cr2.b());
                    int L9 = cr2.L();
                    int L10 = cr2.L();
                    C4214y2 a9 = C4214y2.a(L9);
                    C4214y2 a10 = C4214y2.a(L10);
                    c4268z2 = (intBitsToFloat <= 0.0f && a9 == null && a10 == null) ? null : new C4268z2(intBitsToFloat, a9, a10);
                    cr2.G(2);
                    int O8 = cr2.O();
                    i10 = O8 >> 12;
                    i9 = O8 & 4095;
                } else {
                    i9 = -1;
                    i10 = -1;
                    c4268z2 = null;
                }
                long j20 = h3;
                int i21 = c3029c12.f30192b;
                int i22 = c3029c12.f30193c;
                int i23 = c3029c12.f30195e;
                int i24 = c3029c12.f30196f;
                c4268z22 = c4268z2;
                if ((z02.f29596a != -1 || z02.f29597b == -1) && i10 != -1 && i9 != -1) {
                    z02.f29596a = i10;
                    z02.f29597b = i9;
                }
                if (c4268z22 != null) {
                    z6 = false;
                    o32 = new O3(c4268z22);
                } else {
                    z6 = false;
                    o32 = null;
                }
                this.f35709j = o32;
                K0 k04 = (K0) r02;
                c3029c1 = c3029c12;
                long j21 = k04.f26571w;
                k04.a(i21, z6);
                long j22 = k04.f26570v;
                if (i6 == 1483304551) {
                    long v10 = (j20 == -1 || j20 == 0) ? -9223372036854775807L : AbstractC3182eu.v(i22, (j20 * i24) - 1);
                    if (v10 != com.anythink.basead.exoplayer.b.f7168b) {
                        if (P8 != -1 && j22 != -1 && j21 + P8 != j22) {
                            long j23 = j22 - j21;
                            StringBuilder sb3 = new StringBuilder(String.valueOf(P8).length() + String.valueOf(j23).length() + 53 + 23);
                            com.IceFishing.LiveIceFishing.k.z(sb3, "Data size mismatch between stream (", j23, ") and Xing frame (");
                            sb3.append(P8);
                            sb3.append("), using smaller value.");
                            AbstractC2991bG.t("XingSeeker", sb3.toString());
                            P8 = Math.min(P8, j23);
                        }
                        c3998u2 = new D2(j21, i21, v10, i23, P8, jArr);
                        o33 = this.i;
                        K0 k03222 = (K0) r02;
                        long j17222 = k03222.f26571w;
                        if (o33 != null) {
                        }
                        c4052v2 = null;
                        if (this.f35716q) {
                        }
                        this.f35715p = b22;
                        this.f35705e.D(b22);
                        o34 = this.i;
                        if (o34 == null) {
                        }
                        C3322hP c3322hP2222 = new C3322hP();
                        c3322hP2222.d(com.anythink.basead.exoplayer.k.o.f9248t);
                        c3322hP2222.e((String) c3029c1.f30197g);
                        c3322hP2222.f31559o = 4096;
                        c3322hP2222.f31538G = c3029c1.f30194d;
                        c3322hP2222.f31540I = c3029c1.f30193c;
                        c3322hP2222.f31541K = z02.f29596a;
                        c3322hP2222.f31542L = z02.f29597b;
                        c3322hP2222.f31555k = o34;
                        if (this.f35715p.g() != -2147483647) {
                        }
                        this.f35707g.e(new DP(c3322hP2222));
                        this.f35712m = k03222.f26571w;
                    }
                    c3998u2 = null;
                    o33 = this.i;
                    K0 k032222 = (K0) r02;
                    long j172222 = k032222.f26571w;
                    if (o33 != null) {
                    }
                    c4052v2 = null;
                    if (this.f35716q) {
                    }
                    this.f35715p = b22;
                    this.f35705e.D(b22);
                    o34 = this.i;
                    if (o34 == null) {
                    }
                    C3322hP c3322hP22222 = new C3322hP();
                    c3322hP22222.d(com.anythink.basead.exoplayer.k.o.f9248t);
                    c3322hP22222.e((String) c3029c1.f30197g);
                    c3322hP22222.f31559o = 4096;
                    c3322hP22222.f31538G = c3029c1.f30194d;
                    c3322hP22222.f31540I = c3029c1.f30193c;
                    c3322hP22222.f31541K = z02.f29596a;
                    c3322hP22222.f31542L = z02.f29597b;
                    c3322hP22222.f31555k = o34;
                    if (this.f35715p.g() != -2147483647) {
                    }
                    this.f35707g.e(new DP(c3322hP22222));
                    this.f35712m = k032222.f26571w;
                } else {
                    long v11 = (j20 == -1 || j20 == 0) ? -9223372036854775807L : AbstractC3182eu.v(i22, (i24 * j20) - 1);
                    if (v11 != com.anythink.basead.exoplayer.b.f7168b) {
                        if (P8 != -1) {
                            long j24 = j21 + P8;
                            j6 = P8 - i21;
                            j9 = j24;
                        } else if (j22 != -1) {
                            j6 = (j22 - j21) - i21;
                            j9 = j22;
                        }
                        long j25 = j6;
                        RoundingMode roundingMode = RoundingMode.HALF_UP;
                        c3998u2 = new C3998u2(j9, j21 + i21, UC.a(AbstractC3182eu.w(j25, 8000000L, v11, roundingMode)), UC.a(SK.f(j25, j20, roundingMode)), true);
                        o33 = this.i;
                        K0 k0322222 = (K0) r02;
                        long j1722222 = k0322222.f26571w;
                        if (o33 != null) {
                        }
                        c4052v2 = null;
                        if (this.f35716q) {
                        }
                        this.f35715p = b22;
                        this.f35705e.D(b22);
                        o34 = this.i;
                        if (o34 == null) {
                        }
                        C3322hP c3322hP222222 = new C3322hP();
                        c3322hP222222.d(com.anythink.basead.exoplayer.k.o.f9248t);
                        c3322hP222222.e((String) c3029c1.f30197g);
                        c3322hP222222.f31559o = 4096;
                        c3322hP222222.f31538G = c3029c1.f30194d;
                        c3322hP222222.f31540I = c3029c1.f30193c;
                        c3322hP222222.f31541K = z02.f29596a;
                        c3322hP222222.f31542L = z02.f29597b;
                        c3322hP222222.f31555k = o34;
                        if (this.f35715p.g() != -2147483647) {
                        }
                        this.f35707g.e(new DP(c3322hP222222));
                        this.f35712m = k0322222.f26571w;
                    }
                    c3998u2 = null;
                    o33 = this.i;
                    K0 k03222222 = (K0) r02;
                    long j17222222 = k03222222.f26571w;
                    if (o33 != null) {
                    }
                    c4052v2 = null;
                    if (this.f35716q) {
                    }
                    this.f35715p = b22;
                    this.f35705e.D(b22);
                    o34 = this.i;
                    if (o34 == null) {
                    }
                    C3322hP c3322hP2222222 = new C3322hP();
                    c3322hP2222222.d(com.anythink.basead.exoplayer.k.o.f9248t);
                    c3322hP2222222.e((String) c3029c1.f30197g);
                    c3322hP2222222.f31559o = 4096;
                    c3322hP2222222.f31538G = c3029c1.f30194d;
                    c3322hP2222222.f31540I = c3029c1.f30193c;
                    c3322hP2222222.f31541K = z02.f29596a;
                    c3322hP2222222.f31542L = z02.f29597b;
                    c3322hP2222222.f31555k = o34;
                    if (this.f35715p.g() != -2147483647) {
                    }
                    this.f35707g.e(new DP(c3322hP2222222));
                    this.f35712m = k03222222.f26571w;
                }
            }
            if (cr2.f24999c >= 40) {
                cr2.E(36);
                if (cr2.b() == 1447187017) {
                    i6 = 1447187017;
                    z02 = this.f35703c;
                    if (i6 != 1231971951) {
                    }
                    b9 = cr2.b();
                    if ((b9 & 1) != 0) {
                    }
                    if ((b9 & 2) != 0) {
                    }
                    if ((b9 & 4) == 4) {
                    }
                    if ((b9 & 8) != 0) {
                    }
                    if (cr2.B() >= 24) {
                    }
                    long j202 = h3;
                    int i212 = c3029c12.f30192b;
                    int i222 = c3029c12.f30193c;
                    int i232 = c3029c12.f30195e;
                    int i242 = c3029c12.f30196f;
                    c4268z22 = c4268z2;
                    if (z02.f29596a != -1) {
                    }
                    z02.f29596a = i10;
                    z02.f29597b = i9;
                    if (c4268z22 != null) {
                    }
                    this.f35709j = o32;
                    K0 k042 = (K0) r02;
                    c3029c1 = c3029c12;
                    long j212 = k042.f26571w;
                    k042.a(i212, z6);
                    long j222 = k042.f26570v;
                    if (i6 == 1483304551) {
                    }
                }
            }
            i6 = 0;
            z02 = this.f35703c;
            if (i6 != 1231971951) {
            }
            b9 = cr2.b();
            if ((b9 & 1) != 0) {
            }
            if ((b9 & 2) != 0) {
            }
            if ((b9 & 4) == 4) {
            }
            if ((b9 & 8) != 0) {
            }
            if (cr2.B() >= 24) {
            }
            long j2022 = h3;
            int i2122 = c3029c12.f30192b;
            int i2222 = c3029c12.f30193c;
            int i2322 = c3029c12.f30195e;
            int i2422 = c3029c12.f30196f;
            c4268z22 = c4268z2;
            if (z02.f29596a != -1) {
            }
            z02.f29596a = i10;
            z02.f29597b = i9;
            if (c4268z22 != null) {
            }
            this.f35709j = o32;
            K0 k0422 = (K0) r02;
            c3029c1 = c3029c12;
            long j2122 = k0422.f26571w;
            k0422.a(i2122, z6);
            long j2222 = k0422.f26570v;
            if (i6 == 1483304551) {
            }
        } else {
            c3029c1 = c3029c12;
            long j26 = this.f35712m;
            if (j26 != 0) {
                long j27 = ((K0) r02).f26571w;
                if (j27 < j26) {
                    i = 0;
                    ((K0) r02).a((int) (j26 - j27), false);
                    i4 = this.f35714o;
                    if (i4 == 0) {
                        ((K0) r02).f26573y = i;
                        K0 k05 = (K0) r02;
                        if (!h(k05)) {
                            cr.E(i);
                            int b11 = cr.b();
                            if (((-128000) & b11) != (this.f35708h & (-128000)) || SK.a(b11) == -1) {
                                k05.a(1, false);
                                this.f35708h = 0;
                                return 0;
                            }
                            c3029c1.a(b11);
                            if (this.f35710k == com.anythink.basead.exoplayer.b.f7168b) {
                                this.f35710k = this.f35715p.k(k05.f26571w);
                            }
                            int i25 = c3029c1.f30192b;
                            this.f35714o = i25;
                            this.f35713n = k05.f26571w + i25;
                            i4 = i25;
                            i = 0;
                        }
                        return -1;
                    }
                    d9 = this.f35707g.d(r02, i4, true);
                    if (d9 != -1) {
                        return -1;
                    }
                    int i26 = this.f35714o - d9;
                    this.f35714o = i26;
                    if (i26 > 0) {
                        return i;
                    }
                    this.f35707g.c(((this.f35711l * 1000000) / c3029c1.f30193c) + this.f35710k, 1, c3029c1.f30192b, 0, null);
                    this.f35711l += c3029c1.f30196f;
                    this.f35714o = 0;
                    return 0;
                }
            }
        }
        i = 0;
        i4 = this.f35714o;
        if (i4 == 0) {
        }
        d9 = this.f35707g.d(r02, i4, true);
        if (d9 != -1) {
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        FQ fq = (FQ) s02;
        this.f35705e = fq;
        InterfaceC3566m1 C8 = fq.C(0, 1);
        this.f35706f = C8;
        this.f35707g = C8;
        this.f35705e.B();
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        this.f35708h = 0;
        this.f35710k = com.anythink.basead.exoplayer.b.f7168b;
        this.f35711l = 0L;
        this.f35714o = 0;
        this.f35713n = -1L;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        return g((K0) r02, true);
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void e() {
    }

    public final boolean g(K0 k02, boolean z6) {
        int i;
        int i4;
        int a9;
        k02.f26573y = 0;
        if (k02.f26571w == 0) {
            O3 e9 = this.f35704d.e(k02, null, 131072);
            this.i = e9;
            if (e9 != null) {
                this.f35703c.a(e9);
            }
            i = (int) k02.q();
            if (!z6) {
                k02.a(i, false);
            }
            i4 = 0;
        } else {
            i = 0;
            i4 = 0;
        }
        int i6 = i4;
        int i9 = i6;
        while (true) {
            if (!h(k02)) {
                Cr cr = this.f35701a;
                cr.E(0);
                int b9 = cr.b();
                if ((i4 == 0 || ((-128000) & b9) == (i4 & (-128000))) && (a9 = SK.a(b9)) != -1) {
                    i6++;
                    if (i6 != 1) {
                        if (i6 == 4) {
                            break;
                        }
                    } else {
                        this.f35702b.a(b9);
                        i4 = b9;
                    }
                    k02.d(a9 - 4, false);
                } else {
                    int i10 = i9 + 1;
                    if (i9 == 131072) {
                        if (z6) {
                            return false;
                        }
                        i();
                        throw new EOFException();
                    }
                    if (z6) {
                        k02.f26573y = 0;
                        k02.d(i + i10, false);
                    } else {
                        k02.a(1, false);
                    }
                    i6 = 0;
                    i9 = i10;
                    i4 = 0;
                }
            } else if (i6 <= 0) {
                i();
                throw new EOFException();
            }
        }
        if (z6) {
            k02.a(i + i9, false);
        } else {
            k02.f26573y = 0;
        }
        this.f35708h = i4;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r9.q() > (r2 - 4)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(K0 k02) {
        B2 b22 = this.f35715p;
        if (b22 != null) {
            long h3 = b22.h();
            if (h3 != -1) {
            }
        }
        return !k02.E(this.f35701a.f24997a, 0, 4, true);
    }

    public final void i() {
        B2 b22 = this.f35715p;
        if ((b22 instanceof C3998u2) && ((C3998u2) b22).f()) {
            long j6 = this.f35713n;
            if (j6 == -1 || j6 == this.f35715p.h()) {
                return;
            }
            C3998u2 c3998u2 = (C3998u2) this.f35715p;
            this.f35715p = new C3998u2(this.f35713n, c3998u2.f35236h, c3998u2.i, c3998u2.f35237j, false);
            FQ fq = this.f35705e;
            fq.getClass();
            fq.D(this.f35715p);
            this.f35706f.getClass();
            this.f35715p.c();
        }
    }
}
