package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.x2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4137x2 implements Q0 {

    /* renamed from: e, reason: collision with root package name */
    public CQ f34924e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC3543m1 f34925f;

    /* renamed from: h, reason: collision with root package name */
    public int f34927h;
    public O3 i;

    /* renamed from: j, reason: collision with root package name */
    public O3 f34928j;

    /* renamed from: l, reason: collision with root package name */
    public long f34930l;

    /* renamed from: m, reason: collision with root package name */
    public long f34931m;

    /* renamed from: o, reason: collision with root package name */
    public int f34933o;

    /* renamed from: p, reason: collision with root package name */
    public B2 f34934p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f34935q;

    /* renamed from: a, reason: collision with root package name */
    public final Cr f34920a = new Cr(10);

    /* renamed from: b, reason: collision with root package name */
    public final C3006c1 f34921b = new C3006c1();

    /* renamed from: c, reason: collision with root package name */
    public final Z0 f34922c = new Z0();

    /* renamed from: k, reason: collision with root package name */
    public long f34929k = com.anythink.basead.exoplayer.b.f6382b;

    /* renamed from: d, reason: collision with root package name */
    public final Qx f34923d = new Qx(2);

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC3543m1 f34926g = new O0();

    /* renamed from: n, reason: collision with root package name */
    public long f34932n = -1;

    static {
        int i = AbstractC2968bG.f29268R;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0384, code lost:
    
        if (r5.a(r12) != false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x03bb, code lost:
    
        if (((com.google.android.gms.internal.ads.C3222g2) r7).f29009a.equals("TLEN") != false) goto L171;
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
        C3006c1 c3006c1;
        int i;
        int i6;
        int d2;
        int i9;
        Z0 z02;
        int b9;
        long[] jArr;
        int i10;
        int i11;
        C4245z2 c4245z2;
        C4245z2 c4245z22;
        boolean z3;
        O3 o32;
        long j6;
        long j9;
        B2 c3975u2;
        O3 o33;
        InterfaceC3922t3 interfaceC3922t3;
        InterfaceC3922t3 interfaceC3922t32;
        char c9;
        long u3;
        B2 c4029v2;
        B2 b22;
        O3 o34;
        int K7;
        this.f34925f.getClass();
        String str = AbstractC3159eu.f29993a;
        if (this.f34927h == 0) {
            try {
                g((K0) r02, false);
            } catch (EOFException unused) {
            }
        }
        B2 b23 = this.f34934p;
        C3006c1 c3006c12 = this.f34921b;
        Cr cr = this.f34920a;
        if (b23 == null) {
            Cr cr2 = new Cr(c3006c12.f29409b);
            ((K0) r02).A(cr2.f24252a, 0, c3006c12.f29409b, false);
            int i12 = 21;
            if ((c3006c12.f29408a & 1) != 0) {
                if (c3006c12.f29411d != 1) {
                    i12 = 36;
                }
            } else if (c3006c12.f29411d == 1) {
                i12 = 13;
            }
            if (cr2.f24254c >= i12 + 4) {
                cr2.E(i12);
                i9 = cr2.b();
                if (i9 != 1483304551) {
                    if (i9 == 1231971951) {
                        i9 = 1231971951;
                    }
                }
                z02 = this.f34922c;
                if (i9 != 1231971951) {
                    if (i9 == 1447187017) {
                        K0 k02 = (K0) r02;
                        long j10 = k02.f25819w;
                        cr2.G(6);
                        int b10 = cr2.b();
                        long j11 = c3006c12.f29409b;
                        long j12 = b10;
                        if (cr2.b() > 0) {
                            long v9 = AbstractC3159eu.v(c3006c12.f29410c, (r4 * c3006c12.f29413f) - 1);
                            int L6 = cr2.L();
                            int L8 = cr2.L();
                            int L9 = cr2.L();
                            cr2.G(2);
                            long[] jArr2 = new long[L6];
                            long[] jArr3 = new long[L6];
                            long j13 = c3006c12.f29409b + j10;
                            int i13 = 0;
                            while (i13 < L6) {
                                long j14 = j11;
                                int i14 = i13;
                                jArr2[i14] = (i13 * v9) / L6;
                                jArr3[i14] = j13;
                                if (L9 == 1) {
                                    K7 = cr2.K();
                                } else if (L9 == 2) {
                                    K7 = cr2.L();
                                } else if (L9 == 3) {
                                    K7 = cr2.O();
                                } else if (L9 == 4) {
                                    K7 = cr2.h();
                                }
                                j13 += K7 * L8;
                                i13 = i14 + 1;
                                j11 = j14;
                                L8 = L8;
                                L9 = L9;
                            }
                            long j15 = j10 + j11 + j12;
                            long j16 = k02.f25818v;
                            if (j16 != -1 && j16 != j15) {
                                StringBuilder sb = new StringBuilder(String.valueOf(j16).length() + 27 + String.valueOf(j15).length());
                                D.y.x(sb, "VBRI data size mismatch: ", j16, ", ");
                                sb.append(j15);
                                AbstractC2968bG.y("VbriSeeker", sb.toString());
                            }
                            if (j15 != j13) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(j13).length() + String.valueOf(j15).length() + 43 + 28);
                                D.y.x(sb2, "VBRI bytes and ToC mismatch (using max): ", j15, ", ");
                                sb2.append(j13);
                                sb2.append("\nSeeking will be inaccurate.");
                                AbstractC2968bG.y("VbriSeeker", sb2.toString());
                                j15 = Math.max(j15, j13);
                            }
                            c3975u2 = new C2(jArr2, jArr3, v9, j15, c3006c12.f29412e);
                            k02.a(c3006c12.f29409b, false);
                            c3006c1 = c3006c12;
                            o33 = this.i;
                            K0 k03 = (K0) r02;
                            long j17 = k03.f25819w;
                            if (o33 != null) {
                            }
                            c4029v2 = null;
                            if (this.f34935q) {
                            }
                            this.f34934p = b22;
                            this.f34924e.D(b22);
                            o34 = this.i;
                            if (o34 == null) {
                            }
                            C3299hP c3299hP = new C3299hP();
                            c3299hP.d(com.anythink.basead.exoplayer.k.o.f8462t);
                            c3299hP.e((String) c3006c1.f29414g);
                            c3299hP.f30793o = 4096;
                            c3299hP.f30772G = c3006c1.f29411d;
                            c3299hP.f30774I = c3006c1.f29410c;
                            c3299hP.f30775K = z02.f28816a;
                            c3299hP.f30776L = z02.f28817b;
                            c3299hP.f30789k = o34;
                            if (this.f34934p.g() != -2147483647) {
                            }
                            this.f34926g.e(new DP(c3299hP));
                            this.f34931m = k03.f25819w;
                        }
                        c3975u2 = null;
                        k02.a(c3006c12.f29409b, false);
                        c3006c1 = c3006c12;
                        o33 = this.i;
                        K0 k032 = (K0) r02;
                        long j172 = k032.f25819w;
                        if (o33 != null) {
                        }
                        c4029v2 = null;
                        if (this.f34935q) {
                        }
                        this.f34934p = b22;
                        this.f34924e.D(b22);
                        o34 = this.i;
                        if (o34 == null) {
                        }
                        C3299hP c3299hP2 = new C3299hP();
                        c3299hP2.d(com.anythink.basead.exoplayer.k.o.f8462t);
                        c3299hP2.e((String) c3006c1.f29414g);
                        c3299hP2.f30793o = 4096;
                        c3299hP2.f30772G = c3006c1.f29411d;
                        c3299hP2.f30774I = c3006c1.f29410c;
                        c3299hP2.f30775K = z02.f28816a;
                        c3299hP2.f30776L = z02.f28817b;
                        c3299hP2.f30789k = o34;
                        if (this.f34934p.g() != -2147483647) {
                        }
                        this.f34926g.e(new DP(c3299hP2));
                        this.f34931m = k032.f25819w;
                    } else if (i9 != 1483304551) {
                        ((K0) r02).f25821y = 0;
                        c3006c1 = c3006c12;
                        c3975u2 = null;
                        o33 = this.i;
                        K0 k0322 = (K0) r02;
                        long j1722 = k0322.f25819w;
                        if (o33 != null) {
                            ZA za = ZA.f28846n;
                            InterfaceC3922t3[] interfaceC3922t3Arr = o33.f26586a;
                            int length = interfaceC3922t3Arr.length;
                            int i15 = 0;
                            while (true) {
                                if (i15 >= length) {
                                    interfaceC3922t3 = null;
                                    break;
                                }
                                InterfaceC3922t3 interfaceC3922t33 = interfaceC3922t3Arr[i15];
                                if (C3114e2.class.isAssignableFrom(interfaceC3922t33.getClass())) {
                                    interfaceC3922t3 = (InterfaceC3922t3) C3114e2.class.cast(interfaceC3922t33);
                                }
                                interfaceC3922t3 = null;
                                if (interfaceC3922t3 != null) {
                                    break;
                                }
                                i15++;
                            }
                            C3114e2 c3114e2 = (C3114e2) interfaceC3922t3;
                            if (c3114e2 != null) {
                                InterfaceC3922t3[] interfaceC3922t3Arr2 = o33.f26586a;
                                int length2 = interfaceC3922t3Arr2.length;
                                int i16 = 0;
                                while (true) {
                                    if (i16 >= length2) {
                                        interfaceC3922t32 = null;
                                        break;
                                    }
                                    InterfaceC3922t3 interfaceC3922t34 = interfaceC3922t3Arr2[i16];
                                    if (C3222g2.class.isAssignableFrom(interfaceC3922t34.getClass())) {
                                        interfaceC3922t32 = (InterfaceC3922t3) C3222g2.class.cast(interfaceC3922t34);
                                    }
                                    interfaceC3922t32 = null;
                                    if (interfaceC3922t32 != null) {
                                        break;
                                    }
                                    i16++;
                                }
                                C3222g2 c3222g2 = (C3222g2) interfaceC3922t32;
                                if (c3222g2 == null) {
                                    u3 = -9223372036854775807L;
                                    c9 = 0;
                                } else {
                                    c9 = 0;
                                    u3 = AbstractC3159eu.u(Long.parseLong((String) c3222g2.f30492c.get(0)));
                                }
                                int[] iArr = c3114e2.f29870e;
                                int length3 = iArr.length;
                                int i17 = length3 + 1;
                                long[] jArr4 = new long[i17];
                                long[] jArr5 = new long[i17];
                                jArr4[c9] = j1722;
                                jArr5[c9] = 0;
                                long j18 = 0;
                                int i18 = 1;
                                while (i18 <= length3) {
                                    int i19 = i18 - 1;
                                    long j19 = j1722 + c3114e2.f29868c + iArr[i19];
                                    j18 += c3114e2.f29869d + c3114e2.f29871f[i19];
                                    jArr4[i18] = j19;
                                    jArr5[i18] = j18;
                                    i18++;
                                    iArr = iArr;
                                    j1722 = j19;
                                }
                                c4029v2 = new C4029v2(u3, jArr4, jArr5);
                                if (this.f34935q) {
                                    B2 b24 = c4029v2 != null ? c4029v2 : c3975u2 == null ? null : c3975u2;
                                    if (b24 == null) {
                                        k0322.A(cr.f24252a, 0, 4, false);
                                        cr.E(0);
                                        c3006c1.a(cr.b());
                                        b22 = new C3975u2(k0322.f25818v, k0322.f25819w, c3006c1.f29412e, c3006c1.f29409b, true);
                                    } else {
                                        b22 = b24;
                                    }
                                    InterfaceC3543m1 interfaceC3543m1 = this.f34925f;
                                    b22.c();
                                    interfaceC3543m1.getClass();
                                } else {
                                    b22 = new A2(com.anythink.basead.exoplayer.b.f6382b, 0L);
                                }
                                this.f34934p = b22;
                                this.f34924e.D(b22);
                                o34 = this.i;
                                if (o34 == null) {
                                    O3 o35 = this.f34928j;
                                    if (o35 != null) {
                                        o34 = o34.b(o35);
                                    }
                                } else {
                                    o34 = this.f34928j;
                                }
                                C3299hP c3299hP22 = new C3299hP();
                                c3299hP22.d(com.anythink.basead.exoplayer.k.o.f8462t);
                                c3299hP22.e((String) c3006c1.f29414g);
                                c3299hP22.f30793o = 4096;
                                c3299hP22.f30772G = c3006c1.f29411d;
                                c3299hP22.f30774I = c3006c1.f29410c;
                                c3299hP22.f30775K = z02.f28816a;
                                c3299hP22.f30776L = z02.f28817b;
                                c3299hP22.f30789k = o34;
                                if (this.f34934p.g() != -2147483647) {
                                    c3299hP22.f30787h = this.f34934p.g();
                                }
                                this.f34926g.e(new DP(c3299hP22));
                                this.f34931m = k0322.f25819w;
                            }
                        }
                        c4029v2 = null;
                        if (this.f34935q) {
                        }
                        this.f34934p = b22;
                        this.f34924e.D(b22);
                        o34 = this.i;
                        if (o34 == null) {
                        }
                        C3299hP c3299hP222 = new C3299hP();
                        c3299hP222.d(com.anythink.basead.exoplayer.k.o.f8462t);
                        c3299hP222.e((String) c3006c1.f29414g);
                        c3299hP222.f30793o = 4096;
                        c3299hP222.f30772G = c3006c1.f29411d;
                        c3299hP222.f30774I = c3006c1.f29410c;
                        c3299hP222.f30775K = z02.f28816a;
                        c3299hP222.f30776L = z02.f28817b;
                        c3299hP222.f30789k = o34;
                        if (this.f34934p.g() != -2147483647) {
                        }
                        this.f34926g.e(new DP(c3299hP222));
                        this.f34931m = k0322.f25819w;
                    }
                }
                b9 = cr2.b();
                int h9 = (b9 & 1) != 0 ? cr2.h() : -1;
                long P8 = (b9 & 2) != 0 ? cr2.P() : -1L;
                if ((b9 & 4) == 4) {
                    long[] jArr6 = new long[100];
                    int i20 = 0;
                    for (int i21 = 100; i20 < i21; i21 = 100) {
                        long[] jArr7 = jArr6;
                        jArr7[i20] = cr2.K();
                        i20++;
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
                    int L10 = cr2.L();
                    int L11 = cr2.L();
                    C4191y2 a9 = C4191y2.a(L10);
                    C4191y2 a10 = C4191y2.a(L11);
                    c4245z2 = (intBitsToFloat <= 0.0f && a9 == null && a10 == null) ? null : new C4245z2(intBitsToFloat, a9, a10);
                    cr2.G(2);
                    int O8 = cr2.O();
                    i11 = O8 >> 12;
                    i10 = O8 & 4095;
                } else {
                    i10 = -1;
                    i11 = -1;
                    c4245z2 = null;
                }
                long j20 = h9;
                int i22 = c3006c12.f29409b;
                int i23 = c3006c12.f29410c;
                int i24 = c3006c12.f29412e;
                int i25 = c3006c12.f29413f;
                c4245z22 = c4245z2;
                if ((z02.f28816a != -1 || z02.f28817b == -1) && i11 != -1 && i10 != -1) {
                    z02.f28816a = i11;
                    z02.f28817b = i10;
                }
                if (c4245z22 != null) {
                    z3 = false;
                    o32 = new O3(c4245z22);
                } else {
                    z3 = false;
                    o32 = null;
                }
                this.f34928j = o32;
                K0 k04 = (K0) r02;
                c3006c1 = c3006c12;
                long j21 = k04.f25819w;
                k04.a(i22, z3);
                long j22 = k04.f25818v;
                if (i9 == 1483304551) {
                    long v10 = (j20 == -1 || j20 == 0) ? -9223372036854775807L : AbstractC3159eu.v(i23, (j20 * i25) - 1);
                    if (v10 != com.anythink.basead.exoplayer.b.f6382b) {
                        if (P8 != -1 && j22 != -1 && j21 + P8 != j22) {
                            long j23 = j22 - j21;
                            StringBuilder sb3 = new StringBuilder(String.valueOf(P8).length() + String.valueOf(j23).length() + 53 + 23);
                            D.y.x(sb3, "Data size mismatch between stream (", j23, ") and Xing frame (");
                            sb3.append(P8);
                            sb3.append("), using smaller value.");
                            AbstractC2968bG.t("XingSeeker", sb3.toString());
                            P8 = Math.min(P8, j23);
                        }
                        c3975u2 = new D2(j21, i22, v10, i24, P8, jArr);
                        o33 = this.i;
                        K0 k03222 = (K0) r02;
                        long j17222 = k03222.f25819w;
                        if (o33 != null) {
                        }
                        c4029v2 = null;
                        if (this.f34935q) {
                        }
                        this.f34934p = b22;
                        this.f34924e.D(b22);
                        o34 = this.i;
                        if (o34 == null) {
                        }
                        C3299hP c3299hP2222 = new C3299hP();
                        c3299hP2222.d(com.anythink.basead.exoplayer.k.o.f8462t);
                        c3299hP2222.e((String) c3006c1.f29414g);
                        c3299hP2222.f30793o = 4096;
                        c3299hP2222.f30772G = c3006c1.f29411d;
                        c3299hP2222.f30774I = c3006c1.f29410c;
                        c3299hP2222.f30775K = z02.f28816a;
                        c3299hP2222.f30776L = z02.f28817b;
                        c3299hP2222.f30789k = o34;
                        if (this.f34934p.g() != -2147483647) {
                        }
                        this.f34926g.e(new DP(c3299hP2222));
                        this.f34931m = k03222.f25819w;
                    }
                    c3975u2 = null;
                    o33 = this.i;
                    K0 k032222 = (K0) r02;
                    long j172222 = k032222.f25819w;
                    if (o33 != null) {
                    }
                    c4029v2 = null;
                    if (this.f34935q) {
                    }
                    this.f34934p = b22;
                    this.f34924e.D(b22);
                    o34 = this.i;
                    if (o34 == null) {
                    }
                    C3299hP c3299hP22222 = new C3299hP();
                    c3299hP22222.d(com.anythink.basead.exoplayer.k.o.f8462t);
                    c3299hP22222.e((String) c3006c1.f29414g);
                    c3299hP22222.f30793o = 4096;
                    c3299hP22222.f30772G = c3006c1.f29411d;
                    c3299hP22222.f30774I = c3006c1.f29410c;
                    c3299hP22222.f30775K = z02.f28816a;
                    c3299hP22222.f30776L = z02.f28817b;
                    c3299hP22222.f30789k = o34;
                    if (this.f34934p.g() != -2147483647) {
                    }
                    this.f34926g.e(new DP(c3299hP22222));
                    this.f34931m = k032222.f25819w;
                } else {
                    long v11 = (j20 == -1 || j20 == 0) ? -9223372036854775807L : AbstractC3159eu.v(i23, (i25 * j20) - 1);
                    if (v11 != com.anythink.basead.exoplayer.b.f6382b) {
                        if (P8 != -1) {
                            long j24 = j21 + P8;
                            j6 = P8 - i22;
                            j9 = j24;
                        } else if (j22 != -1) {
                            j6 = (j22 - j21) - i22;
                            j9 = j22;
                        }
                        long j25 = j6;
                        RoundingMode roundingMode = RoundingMode.HALF_UP;
                        c3975u2 = new C3975u2(j9, j21 + i22, UC.a(AbstractC3159eu.w(j25, 8000000L, v11, roundingMode)), UC.a(SK.f(j25, j20, roundingMode)), true);
                        o33 = this.i;
                        K0 k0322222 = (K0) r02;
                        long j1722222 = k0322222.f25819w;
                        if (o33 != null) {
                        }
                        c4029v2 = null;
                        if (this.f34935q) {
                        }
                        this.f34934p = b22;
                        this.f34924e.D(b22);
                        o34 = this.i;
                        if (o34 == null) {
                        }
                        C3299hP c3299hP222222 = new C3299hP();
                        c3299hP222222.d(com.anythink.basead.exoplayer.k.o.f8462t);
                        c3299hP222222.e((String) c3006c1.f29414g);
                        c3299hP222222.f30793o = 4096;
                        c3299hP222222.f30772G = c3006c1.f29411d;
                        c3299hP222222.f30774I = c3006c1.f29410c;
                        c3299hP222222.f30775K = z02.f28816a;
                        c3299hP222222.f30776L = z02.f28817b;
                        c3299hP222222.f30789k = o34;
                        if (this.f34934p.g() != -2147483647) {
                        }
                        this.f34926g.e(new DP(c3299hP222222));
                        this.f34931m = k0322222.f25819w;
                    }
                    c3975u2 = null;
                    o33 = this.i;
                    K0 k03222222 = (K0) r02;
                    long j17222222 = k03222222.f25819w;
                    if (o33 != null) {
                    }
                    c4029v2 = null;
                    if (this.f34935q) {
                    }
                    this.f34934p = b22;
                    this.f34924e.D(b22);
                    o34 = this.i;
                    if (o34 == null) {
                    }
                    C3299hP c3299hP2222222 = new C3299hP();
                    c3299hP2222222.d(com.anythink.basead.exoplayer.k.o.f8462t);
                    c3299hP2222222.e((String) c3006c1.f29414g);
                    c3299hP2222222.f30793o = 4096;
                    c3299hP2222222.f30772G = c3006c1.f29411d;
                    c3299hP2222222.f30774I = c3006c1.f29410c;
                    c3299hP2222222.f30775K = z02.f28816a;
                    c3299hP2222222.f30776L = z02.f28817b;
                    c3299hP2222222.f30789k = o34;
                    if (this.f34934p.g() != -2147483647) {
                    }
                    this.f34926g.e(new DP(c3299hP2222222));
                    this.f34931m = k03222222.f25819w;
                }
            }
            if (cr2.f24254c >= 40) {
                cr2.E(36);
                if (cr2.b() == 1447187017) {
                    i9 = 1447187017;
                    z02 = this.f34922c;
                    if (i9 != 1231971951) {
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
                    long j202 = h9;
                    int i222 = c3006c12.f29409b;
                    int i232 = c3006c12.f29410c;
                    int i242 = c3006c12.f29412e;
                    int i252 = c3006c12.f29413f;
                    c4245z22 = c4245z2;
                    if (z02.f28816a != -1) {
                    }
                    z02.f28816a = i11;
                    z02.f28817b = i10;
                    if (c4245z22 != null) {
                    }
                    this.f34928j = o32;
                    K0 k042 = (K0) r02;
                    c3006c1 = c3006c12;
                    long j212 = k042.f25819w;
                    k042.a(i222, z3);
                    long j222 = k042.f25818v;
                    if (i9 == 1483304551) {
                    }
                }
            }
            i9 = 0;
            z02 = this.f34922c;
            if (i9 != 1231971951) {
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
            long j2022 = h9;
            int i2222 = c3006c12.f29409b;
            int i2322 = c3006c12.f29410c;
            int i2422 = c3006c12.f29412e;
            int i2522 = c3006c12.f29413f;
            c4245z22 = c4245z2;
            if (z02.f28816a != -1) {
            }
            z02.f28816a = i11;
            z02.f28817b = i10;
            if (c4245z22 != null) {
            }
            this.f34928j = o32;
            K0 k0422 = (K0) r02;
            c3006c1 = c3006c12;
            long j2122 = k0422.f25819w;
            k0422.a(i2222, z3);
            long j2222 = k0422.f25818v;
            if (i9 == 1483304551) {
            }
        } else {
            c3006c1 = c3006c12;
            long j26 = this.f34931m;
            if (j26 != 0) {
                long j27 = ((K0) r02).f25819w;
                if (j27 < j26) {
                    i = 0;
                    ((K0) r02).a((int) (j26 - j27), false);
                    i6 = this.f34933o;
                    if (i6 == 0) {
                        ((K0) r02).f25821y = i;
                        K0 k05 = (K0) r02;
                        if (!h(k05)) {
                            cr.E(i);
                            int b11 = cr.b();
                            if (((-128000) & b11) != (this.f34927h & (-128000)) || SK.a(b11) == -1) {
                                k05.a(1, false);
                                this.f34927h = 0;
                                return 0;
                            }
                            c3006c1.a(b11);
                            if (this.f34929k == com.anythink.basead.exoplayer.b.f6382b) {
                                this.f34929k = this.f34934p.k(k05.f25819w);
                            }
                            int i26 = c3006c1.f29409b;
                            this.f34933o = i26;
                            this.f34932n = k05.f25819w + i26;
                            i6 = i26;
                            i = 0;
                        }
                        return -1;
                    }
                    d2 = this.f34926g.d(r02, i6, true);
                    if (d2 != -1) {
                        return -1;
                    }
                    int i27 = this.f34933o - d2;
                    this.f34933o = i27;
                    if (i27 > 0) {
                        return i;
                    }
                    this.f34926g.c(((this.f34930l * 1000000) / c3006c1.f29410c) + this.f34929k, 1, c3006c1.f29409b, 0, null);
                    this.f34930l += c3006c1.f29413f;
                    this.f34933o = 0;
                    return 0;
                }
            }
        }
        i = 0;
        i6 = this.f34933o;
        if (i6 == 0) {
        }
        d2 = this.f34926g.d(r02, i6, true);
        if (d2 != -1) {
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        CQ cq = (CQ) s02;
        this.f34924e = cq;
        InterfaceC3543m1 C8 = cq.C(0, 1);
        this.f34925f = C8;
        this.f34926g = C8;
        this.f34924e.B();
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        this.f34927h = 0;
        this.f34929k = com.anythink.basead.exoplayer.b.f6382b;
        this.f34930l = 0L;
        this.f34933o = 0;
        this.f34932n = -1L;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        return g((K0) r02, true);
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void e() {
    }

    public final boolean g(K0 k02, boolean z3) {
        int i;
        int i6;
        int a9;
        k02.f25821y = 0;
        if (k02.f25819w == 0) {
            O3 e9 = this.f34923d.e(k02, null, 131072);
            this.i = e9;
            if (e9 != null) {
                this.f34922c.a(e9);
            }
            i = (int) k02.q();
            if (!z3) {
                k02.a(i, false);
            }
            i6 = 0;
        } else {
            i = 0;
            i6 = 0;
        }
        int i9 = i6;
        int i10 = i9;
        while (true) {
            if (!h(k02)) {
                Cr cr = this.f34920a;
                cr.E(0);
                int b9 = cr.b();
                if ((i6 == 0 || ((-128000) & b9) == (i6 & (-128000))) && (a9 = SK.a(b9)) != -1) {
                    i9++;
                    if (i9 != 1) {
                        if (i9 == 4) {
                            break;
                        }
                    } else {
                        this.f34921b.a(b9);
                        i6 = b9;
                    }
                    k02.c(a9 - 4, false);
                } else {
                    int i11 = i10 + 1;
                    if (i10 == 131072) {
                        if (z3) {
                            return false;
                        }
                        i();
                        throw new EOFException();
                    }
                    if (z3) {
                        k02.f25821y = 0;
                        k02.c(i + i11, false);
                    } else {
                        k02.a(1, false);
                    }
                    i9 = 0;
                    i10 = i11;
                    i6 = 0;
                }
            } else if (i9 <= 0) {
                i();
                throw new EOFException();
            }
        }
        if (z3) {
            k02.a(i + i10, false);
        } else {
            k02.f25821y = 0;
        }
        this.f34927h = i6;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r9.q() > (r2 - 4)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(K0 k02) {
        B2 b22 = this.f34934p;
        if (b22 != null) {
            long h9 = b22.h();
            if (h9 != -1) {
            }
        }
        return !k02.A(this.f34920a.f24252a, 0, 4, true);
    }

    public final void i() {
        B2 b22 = this.f34934p;
        if ((b22 instanceof C3975u2) && ((C3975u2) b22).f()) {
            long j6 = this.f34932n;
            if (j6 == -1 || j6 == this.f34934p.h()) {
                return;
            }
            C3975u2 c3975u2 = (C3975u2) this.f34934p;
            this.f34934p = new C3975u2(this.f34932n, c3975u2.f34462h, c3975u2.i, c3975u2.f34463j, false);
            CQ cq = this.f34924e;
            cq.getClass();
            cq.D(this.f34934p);
            this.f34925f.getClass();
            this.f34934p.c();
        }
    }
}
