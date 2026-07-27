package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.u2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3988u2 implements O0 {

    /* renamed from: e, reason: collision with root package name */
    public PQ f34512e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC3448k1 f34513f;

    /* renamed from: h, reason: collision with root package name */
    public int f34515h;
    public R3 i;

    /* renamed from: j, reason: collision with root package name */
    public R3 f34516j;

    /* renamed from: l, reason: collision with root package name */
    public long f34518l;

    /* renamed from: m, reason: collision with root package name */
    public long f34519m;

    /* renamed from: o, reason: collision with root package name */
    public int f34521o;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC4204y2 f34522p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f34523q;

    /* renamed from: a, reason: collision with root package name */
    public final Lr f34508a = new Lr(10);

    /* renamed from: b, reason: collision with root package name */
    public final C2906a1 f34509b = new C2906a1();

    /* renamed from: c, reason: collision with root package name */
    public final X0 f34510c = new X0();

    /* renamed from: k, reason: collision with root package name */
    public long f34517k = com.anythink.basead.exoplayer.b.f6539b;

    /* renamed from: d, reason: collision with root package name */
    public final Rx f34511d = new Rx(2);

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC3448k1 f34514g = new M0();

    /* renamed from: n, reason: collision with root package name */
    public long f34520n = -1;

    static {
        int i = AbstractC2655Lg.f26181Q;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void a(Q0 q02) {
        PQ pq = (PQ) q02;
        this.f34512e = pq;
        InterfaceC3448k1 x3 = pq.x(0, 1);
        this.f34513f = x3;
        this.f34514g = x3;
        this.f34512e.v();
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final boolean b(P0 p02) {
        return g((J0) p02, true);
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void c(long j9, long j10) {
        this.f34515h = 0;
        this.f34517k = com.anythink.basead.exoplayer.b.f6539b;
        this.f34518l = 0L;
        this.f34521o = 0;
        this.f34520n = -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0384, code lost:
    
        if (r5.b(r12) != false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x03bb, code lost:
    
        if (((com.google.android.gms.internal.ads.C3071d2) r7).f28771a.equals("TLEN") != false) goto L171;
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
    @Override // com.google.android.gms.internal.ads.O0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(P0 p02, S0 s02) {
        C2906a1 c2906a1;
        int i;
        int i4;
        int d2;
        int i9;
        X0 x02;
        int b9;
        long[] jArr;
        int i10;
        int i11;
        C4096w2 c4096w2;
        C4096w2 c4096w22;
        boolean z8;
        R3 r32;
        long j9;
        long j10;
        InterfaceC4204y2 c3880s2;
        R3 r33;
        InterfaceC4043v3 interfaceC4043v3;
        InterfaceC4043v3 interfaceC4043v32;
        char c4;
        long u7;
        InterfaceC4204y2 c3934t2;
        InterfaceC4204y2 interfaceC4204y2;
        R3 r34;
        int K8;
        this.f34513f.getClass();
        String str = AbstractC3548lu.f32613a;
        if (this.f34515h == 0) {
            try {
                g((J0) p02, false);
            } catch (EOFException unused) {
            }
        }
        InterfaceC4204y2 interfaceC4204y22 = this.f34522p;
        C2906a1 c2906a12 = this.f34509b;
        Lr lr = this.f34508a;
        if (interfaceC4204y22 == null) {
            Lr lr2 = new Lr(c2906a12.f29154b);
            ((J0) p02).I(lr2.f26233a, 0, c2906a12.f29154b, false);
            int i12 = 21;
            if ((c2906a12.f29153a & 1) != 0) {
                if (c2906a12.f29156d != 1) {
                    i12 = 36;
                }
            } else if (c2906a12.f29156d == 1) {
                i12 = 13;
            }
            if (lr2.f26235c >= i12 + 4) {
                lr2.E(i12);
                i9 = lr2.b();
                if (i9 != 1483304551) {
                    if (i9 == 1231971951) {
                        i9 = 1231971951;
                    }
                }
                x02 = this.f34510c;
                if (i9 != 1231971951) {
                    if (i9 == 1447187017) {
                        J0 j02 = (J0) p02;
                        long j11 = j02.f25675w;
                        lr2.G(6);
                        int b10 = lr2.b();
                        long j12 = c2906a12.f29154b;
                        long j13 = b10;
                        if (lr2.b() > 0) {
                            long v6 = AbstractC3548lu.v(c2906a12.f29155c, (r4 * c2906a12.f29158f) - 1);
                            int L8 = lr2.L();
                            int L9 = lr2.L();
                            int L10 = lr2.L();
                            lr2.G(2);
                            long[] jArr2 = new long[L8];
                            long[] jArr3 = new long[L8];
                            long j14 = c2906a12.f29154b + j11;
                            int i13 = 0;
                            while (i13 < L8) {
                                long j15 = j12;
                                int i14 = i13;
                                jArr2[i14] = (i13 * v6) / L8;
                                jArr3[i14] = j14;
                                if (L10 == 1) {
                                    K8 = lr2.K();
                                } else if (L10 == 2) {
                                    K8 = lr2.L();
                                } else if (L10 == 3) {
                                    K8 = lr2.O();
                                } else if (L10 == 4) {
                                    K8 = lr2.h();
                                }
                                j14 += K8 * L9;
                                i13 = i14 + 1;
                                j12 = j15;
                                L9 = L9;
                                L10 = L10;
                            }
                            long j16 = j11 + j12 + j13;
                            long j17 = j02.f25674v;
                            if (j17 != -1 && j17 != j16) {
                                StringBuilder sb = new StringBuilder(String.valueOf(j17).length() + 27 + String.valueOf(j16).length());
                                com.anythink.basead.b.c.i.x(sb, "VBRI data size mismatch: ", j17, ", ");
                                sb.append(j16);
                                AbstractC3217fl.I("VbriSeeker", sb.toString());
                            }
                            if (j16 != j14) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(j14).length() + String.valueOf(j16).length() + 43 + 28);
                                com.anythink.basead.b.c.i.x(sb2, "VBRI bytes and ToC mismatch (using max): ", j16, ", ");
                                sb2.append(j14);
                                sb2.append("\nSeeking will be inaccurate.");
                                AbstractC3217fl.I("VbriSeeker", sb2.toString());
                                j16 = Math.max(j16, j14);
                            }
                            c3880s2 = new C4258z2(jArr2, jArr3, v6, j16, c2906a12.f29157e);
                            j02.b(c2906a12.f29154b, false);
                            c2906a1 = c2906a12;
                            r33 = this.i;
                            J0 j03 = (J0) p02;
                            long j18 = j03.f25675w;
                            if (r33 != null) {
                            }
                            c3934t2 = null;
                            if (this.f34523q) {
                            }
                            this.f34522p = interfaceC4204y2;
                            this.f34512e.w(interfaceC4204y2);
                            r34 = this.i;
                            if (r34 == null) {
                            }
                            C4065vP c4065vP = new C4065vP();
                            c4065vP.d(com.anythink.basead.exoplayer.k.o.f8619t);
                            c4065vP.e((String) c2906a1.f29159g);
                            c4065vP.f34786o = 4096;
                            c4065vP.f34765F = c2906a1.f29156d;
                            c4065vP.f34767H = c2906a1.f29155c;
                            c4065vP.J = x02.f28581a;
                            c4065vP.f34769K = x02.f28582b;
                            c4065vP.f34782k = r34;
                            if (this.f34522p.g() != -2147483647) {
                            }
                            this.f34514g.e(new TP(c4065vP));
                            this.f34519m = j03.f25675w;
                        }
                        c3880s2 = null;
                        j02.b(c2906a12.f29154b, false);
                        c2906a1 = c2906a12;
                        r33 = this.i;
                        J0 j032 = (J0) p02;
                        long j182 = j032.f25675w;
                        if (r33 != null) {
                        }
                        c3934t2 = null;
                        if (this.f34523q) {
                        }
                        this.f34522p = interfaceC4204y2;
                        this.f34512e.w(interfaceC4204y2);
                        r34 = this.i;
                        if (r34 == null) {
                        }
                        C4065vP c4065vP2 = new C4065vP();
                        c4065vP2.d(com.anythink.basead.exoplayer.k.o.f8619t);
                        c4065vP2.e((String) c2906a1.f29159g);
                        c4065vP2.f34786o = 4096;
                        c4065vP2.f34765F = c2906a1.f29156d;
                        c4065vP2.f34767H = c2906a1.f29155c;
                        c4065vP2.J = x02.f28581a;
                        c4065vP2.f34769K = x02.f28582b;
                        c4065vP2.f34782k = r34;
                        if (this.f34522p.g() != -2147483647) {
                        }
                        this.f34514g.e(new TP(c4065vP2));
                        this.f34519m = j032.f25675w;
                    } else if (i9 != 1483304551) {
                        ((J0) p02).f25677y = 0;
                        c2906a1 = c2906a12;
                        c3880s2 = null;
                        r33 = this.i;
                        J0 j0322 = (J0) p02;
                        long j1822 = j0322.f25675w;
                        if (r33 != null) {
                            EnumC3025cB enumC3025cB = EnumC3025cB.f29647n;
                            InterfaceC4043v3[] interfaceC4043v3Arr = r33.f27306a;
                            int length = interfaceC4043v3Arr.length;
                            int i15 = 0;
                            while (true) {
                                if (i15 >= length) {
                                    interfaceC4043v3 = null;
                                    break;
                                }
                                InterfaceC4043v3 interfaceC4043v33 = interfaceC4043v3Arr[i15];
                                if (C2962b2.class.isAssignableFrom(interfaceC4043v33.getClass())) {
                                    interfaceC4043v3 = (InterfaceC4043v3) C2962b2.class.cast(interfaceC4043v33);
                                }
                                interfaceC4043v3 = null;
                                if (interfaceC4043v3 != null) {
                                    break;
                                }
                                i15++;
                            }
                            C2962b2 c2962b2 = (C2962b2) interfaceC4043v3;
                            if (c2962b2 != null) {
                                InterfaceC4043v3[] interfaceC4043v3Arr2 = r33.f27306a;
                                int length2 = interfaceC4043v3Arr2.length;
                                int i16 = 0;
                                while (true) {
                                    if (i16 >= length2) {
                                        interfaceC4043v32 = null;
                                        break;
                                    }
                                    InterfaceC4043v3 interfaceC4043v34 = interfaceC4043v3Arr2[i16];
                                    if (C3071d2.class.isAssignableFrom(interfaceC4043v34.getClass())) {
                                        interfaceC4043v32 = (InterfaceC4043v3) C3071d2.class.cast(interfaceC4043v34);
                                    }
                                    interfaceC4043v32 = null;
                                    if (interfaceC4043v32 != null) {
                                        break;
                                    }
                                    i16++;
                                }
                                C3071d2 c3071d2 = (C3071d2) interfaceC4043v32;
                                if (c3071d2 == null) {
                                    u7 = -9223372036854775807L;
                                    c4 = 0;
                                } else {
                                    c4 = 0;
                                    u7 = AbstractC3548lu.u(Long.parseLong((String) c3071d2.f29777c.get(0)));
                                }
                                int[] iArr = c2962b2.f29384e;
                                int length3 = iArr.length;
                                int i17 = length3 + 1;
                                long[] jArr4 = new long[i17];
                                long[] jArr5 = new long[i17];
                                jArr4[c4] = j1822;
                                jArr5[c4] = 0;
                                long j19 = 0;
                                int i18 = 1;
                                while (i18 <= length3) {
                                    int i19 = i18 - 1;
                                    long j20 = j1822 + c2962b2.f29382c + iArr[i19];
                                    j19 += c2962b2.f29383d + c2962b2.f29385f[i19];
                                    jArr4[i18] = j20;
                                    jArr5[i18] = j19;
                                    i18++;
                                    iArr = iArr;
                                    j1822 = j20;
                                }
                                c3934t2 = new C3934t2(u7, jArr4, jArr5);
                                if (this.f34523q) {
                                    InterfaceC4204y2 interfaceC4204y23 = c3934t2 != null ? c3934t2 : c3880s2 == null ? null : c3880s2;
                                    if (interfaceC4204y23 == null) {
                                        j0322.I(lr.f26233a, 0, 4, false);
                                        lr.E(0);
                                        c2906a1.a(lr.b());
                                        interfaceC4204y2 = new C3880s2(j0322.f25674v, j0322.f25675w, c2906a1.f29157e, c2906a1.f29154b, true);
                                    } else {
                                        interfaceC4204y2 = interfaceC4204y23;
                                    }
                                    InterfaceC3448k1 interfaceC3448k1 = this.f34513f;
                                    interfaceC4204y2.a();
                                    interfaceC3448k1.getClass();
                                } else {
                                    interfaceC4204y2 = new C4150x2(com.anythink.basead.exoplayer.b.f6539b, 0L);
                                }
                                this.f34522p = interfaceC4204y2;
                                this.f34512e.w(interfaceC4204y2);
                                r34 = this.i;
                                if (r34 == null) {
                                    R3 r35 = this.f34516j;
                                    if (r35 != null) {
                                        r34 = r34.b(r35);
                                    }
                                } else {
                                    r34 = this.f34516j;
                                }
                                C4065vP c4065vP22 = new C4065vP();
                                c4065vP22.d(com.anythink.basead.exoplayer.k.o.f8619t);
                                c4065vP22.e((String) c2906a1.f29159g);
                                c4065vP22.f34786o = 4096;
                                c4065vP22.f34765F = c2906a1.f29156d;
                                c4065vP22.f34767H = c2906a1.f29155c;
                                c4065vP22.J = x02.f28581a;
                                c4065vP22.f34769K = x02.f28582b;
                                c4065vP22.f34782k = r34;
                                if (this.f34522p.g() != -2147483647) {
                                    c4065vP22.f34780h = this.f34522p.g();
                                }
                                this.f34514g.e(new TP(c4065vP22));
                                this.f34519m = j0322.f25675w;
                            }
                        }
                        c3934t2 = null;
                        if (this.f34523q) {
                        }
                        this.f34522p = interfaceC4204y2;
                        this.f34512e.w(interfaceC4204y2);
                        r34 = this.i;
                        if (r34 == null) {
                        }
                        C4065vP c4065vP222 = new C4065vP();
                        c4065vP222.d(com.anythink.basead.exoplayer.k.o.f8619t);
                        c4065vP222.e((String) c2906a1.f29159g);
                        c4065vP222.f34786o = 4096;
                        c4065vP222.f34765F = c2906a1.f29156d;
                        c4065vP222.f34767H = c2906a1.f29155c;
                        c4065vP222.J = x02.f28581a;
                        c4065vP222.f34769K = x02.f28582b;
                        c4065vP222.f34782k = r34;
                        if (this.f34522p.g() != -2147483647) {
                        }
                        this.f34514g.e(new TP(c4065vP222));
                        this.f34519m = j0322.f25675w;
                    }
                }
                b9 = lr2.b();
                int h9 = (b9 & 1) != 0 ? lr2.h() : -1;
                long P8 = (b9 & 2) != 0 ? lr2.P() : -1L;
                if ((b9 & 4) == 4) {
                    long[] jArr6 = new long[100];
                    int i20 = 0;
                    for (int i21 = 100; i20 < i21; i21 = 100) {
                        long[] jArr7 = jArr6;
                        jArr7[i20] = lr2.K();
                        i20++;
                        jArr6 = jArr7;
                    }
                    jArr = jArr6;
                } else {
                    jArr = null;
                }
                if ((b9 & 8) != 0) {
                    lr2.G(4);
                }
                if (lr2.B() >= 24) {
                    lr2.G(11);
                    float intBitsToFloat = Float.intBitsToFloat(lr2.b());
                    int L11 = lr2.L();
                    int L12 = lr2.L();
                    C4042v2 a9 = C4042v2.a(L11);
                    C4042v2 a10 = C4042v2.a(L12);
                    c4096w2 = (intBitsToFloat <= 0.0f && a9 == null && a10 == null) ? null : new C4096w2(intBitsToFloat, a9, a10);
                    lr2.G(2);
                    int O8 = lr2.O();
                    i11 = O8 >> 12;
                    i10 = O8 & 4095;
                } else {
                    i10 = -1;
                    i11 = -1;
                    c4096w2 = null;
                }
                long j21 = h9;
                int i22 = c2906a12.f29154b;
                int i23 = c2906a12.f29155c;
                int i24 = c2906a12.f29157e;
                int i25 = c2906a12.f29158f;
                c4096w22 = c4096w2;
                if ((x02.f28581a != -1 || x02.f28582b == -1) && i11 != -1 && i10 != -1) {
                    x02.f28581a = i11;
                    x02.f28582b = i10;
                }
                if (c4096w22 != null) {
                    z8 = false;
                    r32 = new R3(c4096w22);
                } else {
                    z8 = false;
                    r32 = null;
                }
                this.f34516j = r32;
                J0 j04 = (J0) p02;
                c2906a1 = c2906a12;
                long j22 = j04.f25675w;
                j04.b(i22, z8);
                long j23 = j04.f25674v;
                if (i9 == 1483304551) {
                    long v9 = (j21 == -1 || j21 == 0) ? -9223372036854775807L : AbstractC3548lu.v(i23, (j21 * i25) - 1);
                    if (v9 != com.anythink.basead.exoplayer.b.f6539b) {
                        if (P8 != -1 && j23 != -1 && j22 + P8 != j23) {
                            long j24 = j23 - j22;
                            StringBuilder sb3 = new StringBuilder(String.valueOf(P8).length() + String.valueOf(j24).length() + 53 + 23);
                            com.anythink.basead.b.c.i.x(sb3, "Data size mismatch between stream (", j24, ") and Xing frame (");
                            sb3.append(P8);
                            sb3.append("), using smaller value.");
                            AbstractC3217fl.y("XingSeeker", sb3.toString());
                            P8 = Math.min(P8, j24);
                        }
                        c3880s2 = new B2(j22, i22, v9, i24, P8, jArr);
                        r33 = this.i;
                        J0 j03222 = (J0) p02;
                        long j18222 = j03222.f25675w;
                        if (r33 != null) {
                        }
                        c3934t2 = null;
                        if (this.f34523q) {
                        }
                        this.f34522p = interfaceC4204y2;
                        this.f34512e.w(interfaceC4204y2);
                        r34 = this.i;
                        if (r34 == null) {
                        }
                        C4065vP c4065vP2222 = new C4065vP();
                        c4065vP2222.d(com.anythink.basead.exoplayer.k.o.f8619t);
                        c4065vP2222.e((String) c2906a1.f29159g);
                        c4065vP2222.f34786o = 4096;
                        c4065vP2222.f34765F = c2906a1.f29156d;
                        c4065vP2222.f34767H = c2906a1.f29155c;
                        c4065vP2222.J = x02.f28581a;
                        c4065vP2222.f34769K = x02.f28582b;
                        c4065vP2222.f34782k = r34;
                        if (this.f34522p.g() != -2147483647) {
                        }
                        this.f34514g.e(new TP(c4065vP2222));
                        this.f34519m = j03222.f25675w;
                    }
                    c3880s2 = null;
                    r33 = this.i;
                    J0 j032222 = (J0) p02;
                    long j182222 = j032222.f25675w;
                    if (r33 != null) {
                    }
                    c3934t2 = null;
                    if (this.f34523q) {
                    }
                    this.f34522p = interfaceC4204y2;
                    this.f34512e.w(interfaceC4204y2);
                    r34 = this.i;
                    if (r34 == null) {
                    }
                    C4065vP c4065vP22222 = new C4065vP();
                    c4065vP22222.d(com.anythink.basead.exoplayer.k.o.f8619t);
                    c4065vP22222.e((String) c2906a1.f29159g);
                    c4065vP22222.f34786o = 4096;
                    c4065vP22222.f34765F = c2906a1.f29156d;
                    c4065vP22222.f34767H = c2906a1.f29155c;
                    c4065vP22222.J = x02.f28581a;
                    c4065vP22222.f34769K = x02.f28582b;
                    c4065vP22222.f34782k = r34;
                    if (this.f34522p.g() != -2147483647) {
                    }
                    this.f34514g.e(new TP(c4065vP22222));
                    this.f34519m = j032222.f25675w;
                } else {
                    long v10 = (j21 == -1 || j21 == 0) ? -9223372036854775807L : AbstractC3548lu.v(i23, (i25 * j21) - 1);
                    if (v10 != com.anythink.basead.exoplayer.b.f6539b) {
                        if (P8 != -1) {
                            long j25 = j22 + P8;
                            j9 = P8 - i22;
                            j10 = j25;
                        } else if (j23 != -1) {
                            j9 = (j23 - j22) - i22;
                            j10 = j23;
                        }
                        long j26 = j9;
                        RoundingMode roundingMode = RoundingMode.HALF_UP;
                        c3880s2 = new C3880s2(j10, j22 + i22, AbstractC3194fG.c(AbstractC3548lu.w(j26, 8000000L, v10, roundingMode)), AbstractC3194fG.c(AbstractC3217fl.e(j26, j21, roundingMode)), true);
                        r33 = this.i;
                        J0 j0322222 = (J0) p02;
                        long j1822222 = j0322222.f25675w;
                        if (r33 != null) {
                        }
                        c3934t2 = null;
                        if (this.f34523q) {
                        }
                        this.f34522p = interfaceC4204y2;
                        this.f34512e.w(interfaceC4204y2);
                        r34 = this.i;
                        if (r34 == null) {
                        }
                        C4065vP c4065vP222222 = new C4065vP();
                        c4065vP222222.d(com.anythink.basead.exoplayer.k.o.f8619t);
                        c4065vP222222.e((String) c2906a1.f29159g);
                        c4065vP222222.f34786o = 4096;
                        c4065vP222222.f34765F = c2906a1.f29156d;
                        c4065vP222222.f34767H = c2906a1.f29155c;
                        c4065vP222222.J = x02.f28581a;
                        c4065vP222222.f34769K = x02.f28582b;
                        c4065vP222222.f34782k = r34;
                        if (this.f34522p.g() != -2147483647) {
                        }
                        this.f34514g.e(new TP(c4065vP222222));
                        this.f34519m = j0322222.f25675w;
                    }
                    c3880s2 = null;
                    r33 = this.i;
                    J0 j03222222 = (J0) p02;
                    long j18222222 = j03222222.f25675w;
                    if (r33 != null) {
                    }
                    c3934t2 = null;
                    if (this.f34523q) {
                    }
                    this.f34522p = interfaceC4204y2;
                    this.f34512e.w(interfaceC4204y2);
                    r34 = this.i;
                    if (r34 == null) {
                    }
                    C4065vP c4065vP2222222 = new C4065vP();
                    c4065vP2222222.d(com.anythink.basead.exoplayer.k.o.f8619t);
                    c4065vP2222222.e((String) c2906a1.f29159g);
                    c4065vP2222222.f34786o = 4096;
                    c4065vP2222222.f34765F = c2906a1.f29156d;
                    c4065vP2222222.f34767H = c2906a1.f29155c;
                    c4065vP2222222.J = x02.f28581a;
                    c4065vP2222222.f34769K = x02.f28582b;
                    c4065vP2222222.f34782k = r34;
                    if (this.f34522p.g() != -2147483647) {
                    }
                    this.f34514g.e(new TP(c4065vP2222222));
                    this.f34519m = j03222222.f25675w;
                }
            }
            if (lr2.f26235c >= 40) {
                lr2.E(36);
                if (lr2.b() == 1447187017) {
                    i9 = 1447187017;
                    x02 = this.f34510c;
                    if (i9 != 1231971951) {
                    }
                    b9 = lr2.b();
                    if ((b9 & 1) != 0) {
                    }
                    if ((b9 & 2) != 0) {
                    }
                    if ((b9 & 4) == 4) {
                    }
                    if ((b9 & 8) != 0) {
                    }
                    if (lr2.B() >= 24) {
                    }
                    long j212 = h9;
                    int i222 = c2906a12.f29154b;
                    int i232 = c2906a12.f29155c;
                    int i242 = c2906a12.f29157e;
                    int i252 = c2906a12.f29158f;
                    c4096w22 = c4096w2;
                    if (x02.f28581a != -1) {
                    }
                    x02.f28581a = i11;
                    x02.f28582b = i10;
                    if (c4096w22 != null) {
                    }
                    this.f34516j = r32;
                    J0 j042 = (J0) p02;
                    c2906a1 = c2906a12;
                    long j222 = j042.f25675w;
                    j042.b(i222, z8);
                    long j232 = j042.f25674v;
                    if (i9 == 1483304551) {
                    }
                }
            }
            i9 = 0;
            x02 = this.f34510c;
            if (i9 != 1231971951) {
            }
            b9 = lr2.b();
            if ((b9 & 1) != 0) {
            }
            if ((b9 & 2) != 0) {
            }
            if ((b9 & 4) == 4) {
            }
            if ((b9 & 8) != 0) {
            }
            if (lr2.B() >= 24) {
            }
            long j2122 = h9;
            int i2222 = c2906a12.f29154b;
            int i2322 = c2906a12.f29155c;
            int i2422 = c2906a12.f29157e;
            int i2522 = c2906a12.f29158f;
            c4096w22 = c4096w2;
            if (x02.f28581a != -1) {
            }
            x02.f28581a = i11;
            x02.f28582b = i10;
            if (c4096w22 != null) {
            }
            this.f34516j = r32;
            J0 j0422 = (J0) p02;
            c2906a1 = c2906a12;
            long j2222 = j0422.f25675w;
            j0422.b(i2222, z8);
            long j2322 = j0422.f25674v;
            if (i9 == 1483304551) {
            }
        } else {
            c2906a1 = c2906a12;
            long j27 = this.f34519m;
            if (j27 != 0) {
                long j28 = ((J0) p02).f25675w;
                if (j28 < j27) {
                    i = 0;
                    ((J0) p02).b((int) (j27 - j28), false);
                    i4 = this.f34521o;
                    if (i4 == 0) {
                        ((J0) p02).f25677y = i;
                        J0 j05 = (J0) p02;
                        if (!h(j05)) {
                            lr.E(i);
                            int b11 = lr.b();
                            if (((-128000) & b11) != (this.f34515h & (-128000)) || AbstractC3194fG.b(b11) == -1) {
                                j05.b(1, false);
                                this.f34515h = 0;
                                return 0;
                            }
                            c2906a1.a(b11);
                            if (this.f34517k == com.anythink.basead.exoplayer.b.f6539b) {
                                this.f34517k = this.f34522p.f(j05.f25675w);
                            }
                            int i26 = c2906a1.f29154b;
                            this.f34521o = i26;
                            this.f34520n = j05.f25675w + i26;
                            i4 = i26;
                            i = 0;
                        }
                        return -1;
                    }
                    d2 = this.f34514g.d(p02, i4, true);
                    if (d2 != -1) {
                        return -1;
                    }
                    int i27 = this.f34521o - d2;
                    this.f34521o = i27;
                    if (i27 > 0) {
                        return i;
                    }
                    this.f34514g.b(((this.f34518l * 1000000) / c2906a1.f29155c) + this.f34517k, 1, c2906a1.f29154b, 0, null);
                    this.f34518l += c2906a1.f29158f;
                    this.f34521o = 0;
                    return 0;
                }
            }
        }
        i = 0;
        i4 = this.f34521o;
        if (i4 == 0) {
        }
        d2 = this.f34514g.d(p02, i4, true);
        if (d2 != -1) {
        }
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void f() {
    }

    public final boolean g(J0 j02, boolean z8) {
        int i;
        int i4;
        int b9;
        j02.f25677y = 0;
        if (j02.f25675w == 0) {
            R3 e6 = this.f34511d.e(j02, null, 131072);
            this.i = e6;
            if (e6 != null) {
                this.f34510c.a(e6);
            }
            i = (int) j02.m();
            if (!z8) {
                j02.b(i, false);
            }
            i4 = 0;
        } else {
            i = 0;
            i4 = 0;
        }
        int i9 = i4;
        int i10 = i9;
        while (true) {
            if (!h(j02)) {
                Lr lr = this.f34508a;
                lr.E(0);
                int b10 = lr.b();
                if ((i4 == 0 || ((-128000) & b10) == (i4 & (-128000))) && (b9 = AbstractC3194fG.b(b10)) != -1) {
                    i9++;
                    if (i9 != 1) {
                        if (i9 == 4) {
                            break;
                        }
                    } else {
                        this.f34509b.a(b10);
                        i4 = b10;
                    }
                    j02.d(b9 - 4, false);
                } else {
                    int i11 = i10 + 1;
                    if (i10 == 131072) {
                        if (z8) {
                            return false;
                        }
                        i();
                        throw new EOFException();
                    }
                    if (z8) {
                        j02.f25677y = 0;
                        j02.d(i + i11, false);
                    } else {
                        j02.b(1, false);
                    }
                    i9 = 0;
                    i10 = i11;
                    i4 = 0;
                }
            } else if (i9 <= 0) {
                i();
                throw new EOFException();
            }
        }
        if (z8) {
            j02.b(i + i10, false);
        } else {
            j02.f25677y = 0;
        }
        this.f34515h = i4;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r9.m() > (r2 - 4)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(J0 j02) {
        InterfaceC4204y2 interfaceC4204y2 = this.f34522p;
        if (interfaceC4204y2 != null) {
            long e6 = interfaceC4204y2.e();
            if (e6 != -1) {
            }
        }
        return !j02.I(this.f34508a.f26233a, 0, 4, true);
    }

    public final void i() {
        InterfaceC4204y2 interfaceC4204y2 = this.f34522p;
        if ((interfaceC4204y2 instanceof C3880s2) && ((C3880s2) interfaceC4204y2).d()) {
            long j9 = this.f34520n;
            if (j9 == -1 || j9 == this.f34522p.e()) {
                return;
            }
            C3880s2 c3880s2 = (C3880s2) this.f34522p;
            this.f34522p = new C3880s2(this.f34520n, c3880s2.f34178h, c3880s2.i, c3880s2.f34179j, false);
            PQ pq = this.f34512e;
            pq.getClass();
            pq.w(this.f34522p);
            this.f34513f.getClass();
            this.f34522p.a();
        }
    }
}
