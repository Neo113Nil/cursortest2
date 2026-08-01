package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class U2 implements Q0 {

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ int f27849G = 0;

    /* renamed from: A, reason: collision with root package name */
    public int f27850A;

    /* renamed from: B, reason: collision with root package name */
    public long f27851B;

    /* renamed from: C, reason: collision with root package name */
    public S0 f27852C;

    /* renamed from: D, reason: collision with root package name */
    public T2[] f27853D;

    /* renamed from: E, reason: collision with root package name */
    public long[][] f27854E;

    /* renamed from: F, reason: collision with root package name */
    public int f27855F;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3814r3 f27856a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27857b;

    /* renamed from: c, reason: collision with root package name */
    public final Cr f27858c;

    /* renamed from: d, reason: collision with root package name */
    public final Cr f27859d;

    /* renamed from: e, reason: collision with root package name */
    public final Cr f27860e;

    /* renamed from: f, reason: collision with root package name */
    public final Cr f27861f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f27862g;

    /* renamed from: h, reason: collision with root package name */
    public final X2 f27863h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f27864j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f27865k;

    /* renamed from: l, reason: collision with root package name */
    public C3500lC f27866l;

    /* renamed from: m, reason: collision with root package name */
    public int f27867m;

    /* renamed from: n, reason: collision with root package name */
    public int f27868n;

    /* renamed from: o, reason: collision with root package name */
    public long f27869o;

    /* renamed from: p, reason: collision with root package name */
    public int f27870p;

    /* renamed from: q, reason: collision with root package name */
    public Cr f27871q;

    /* renamed from: r, reason: collision with root package name */
    public int f27872r;

    /* renamed from: s, reason: collision with root package name */
    public int f27873s;

    /* renamed from: t, reason: collision with root package name */
    public int f27874t;

    /* renamed from: u, reason: collision with root package name */
    public int f27875u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f27876v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f27877w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f27878x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f27879y;

    /* renamed from: z, reason: collision with root package name */
    public int f27880z;

    static {
        int i = AbstractC2639Kg.f25949M;
    }

    public U2() {
        this(InterfaceC3814r3.m0, 16);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x03b3, code lost:
    
        if (r36 < r32) goto L169;
     */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x066c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0659 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x03c6  */
    @Override // com.google.android.gms.internal.ads.Q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(R0 r02, U0 u02) {
        char c9;
        int i;
        int i6;
        boolean z3;
        int i9;
        long j6;
        char c10;
        char c11;
        boolean z6;
        int i10;
        while (true) {
            int i11 = this.f27867m;
            ArrayDeque arrayDeque = this.f27862g;
            Cr cr = this.f27860e;
            if (i11 == 0) {
                int i12 = this.f27870p;
                Cr cr2 = this.f27861f;
                if (i12 == 0) {
                    if (!r02.z(cr2.f24252a, 0, 8, true)) {
                        return -1;
                    }
                    this.f27870p = 8;
                    cr2.E(0);
                    this.f27869o = cr2.P();
                    this.f27868n = cr2.b();
                }
                long j9 = this.f27869o;
                if (j9 == 1) {
                    r02.u(cr2.f24252a, 8, 8);
                    this.f27870p += 8;
                    this.f27869o = cr2.j();
                } else if (j9 == 0) {
                    long s9 = r02.s();
                    if (s9 == -1) {
                        Iw iw = (Iw) arrayDeque.peek();
                        s9 = iw != null ? iw.f25619c : -1L;
                    }
                    if (s9 != -1) {
                        this.f27869o = (s9 - r02.p()) + this.f27870p;
                    }
                }
                long j10 = this.f27869o;
                int i13 = this.f27870p;
                long j11 = i13;
                if (j10 < j11) {
                    if (this.f27868n != 1718773093 || i13 != 8) {
                        break;
                    }
                    this.f27869o = j11;
                    i13 = 8;
                }
                int i14 = this.f27868n;
                if (i14 == 1836019574 || i14 == 1953653099 || i14 == 1835297121 || i14 == 1835626086 || i14 == 1937007212 || i14 == 1701082227 || i14 == 1835365473 || i14 == 1635284069 || i14 == 1953654118) {
                    long p9 = r02.p();
                    long j12 = this.f27869o;
                    long j13 = p9 + j12;
                    long j14 = this.f27870p;
                    if (j12 != j14 && this.f27868n == 1835365473) {
                        cr.y(8);
                        r02.y(cr.f24252a, 0, 8);
                        J2.f(cr);
                        r02.v(cr.f24253b);
                        r02.l();
                    }
                    long j15 = j13 - j14;
                    arrayDeque.push(new Iw(this.f27868n, j15));
                    if (this.f27869o == this.f27870p) {
                        g(j15);
                    } else {
                        this.f27867m = 0;
                        this.f27870p = 0;
                    }
                } else {
                    if (i14 == 1835296868 || i14 == 1836476516 || i14 == 1751411826 || i14 == 1937011556 || i14 == 1937011827 || i14 == 1937011571 || i14 == 1668576371 || i14 == 1701606260 || i14 == 1937011555 || i14 == 1937011578 || i14 == 1937013298 || i14 == 1937007471 || i14 == 1668232756 || i14 == 1953196132 || i14 == 1718909296 || i14 == 1969517665 || i14 == 1801812339 || i14 == 1768715124 || i14 == 1667785072) {
                        AbstractC2772Sd.H(i13 == 8);
                        AbstractC2772Sd.H(this.f27869o <= 2147483647L);
                        Cr cr3 = new Cr((int) this.f27869o);
                        System.arraycopy(cr2.f24252a, 0, cr3.f24252a, 0, 8);
                        this.f27871q = cr3;
                    } else {
                        this.f27871q = null;
                    }
                    this.f27867m = 1;
                }
            } else {
                if (i11 != 1) {
                    if (i11 == 2) {
                        long p10 = r02.p();
                        int i15 = this.f27872r;
                        if (i15 == -1) {
                            int i16 = 0;
                            boolean z9 = true;
                            boolean z10 = true;
                            int i17 = -1;
                            int i18 = -1;
                            long j16 = Long.MAX_VALUE;
                            long j17 = Long.MAX_VALUE;
                            long j18 = Long.MAX_VALUE;
                            while (true) {
                                T2[] t2Arr = this.f27853D;
                                if (i16 >= t2Arr.length) {
                                    break;
                                }
                                T2 t22 = t2Arr[i16];
                                int i19 = t22.f27682e;
                                C3008c3 c3008c3 = t22.f27679b;
                                if (i19 != c3008c3.f29417b) {
                                    long j19 = c3008c3.f29418c[i19];
                                    long[][] jArr = this.f27854E;
                                    jArr.getClass();
                                    long j20 = jArr[i16][i19];
                                    long j21 = j19 - p10;
                                    boolean z11 = j21 < 0 || j21 >= 262144;
                                    if (z11) {
                                        z3 = z10;
                                    } else {
                                        if (!z10) {
                                            z3 = false;
                                        }
                                        i18 = i16;
                                        z3 = z11;
                                        j18 = j21;
                                        j17 = j20;
                                        if (j20 >= j16) {
                                            i17 = i16;
                                            z9 = z11;
                                            z10 = z3;
                                            j16 = j20;
                                        } else {
                                            z10 = z3;
                                        }
                                    }
                                    if (z11 == z3) {
                                    }
                                    if (j20 >= j16) {
                                    }
                                }
                                i16++;
                            }
                            i15 = (j16 == Long.MAX_VALUE || !z9 || j17 < j16 + 10485760) ? i18 : i17;
                            this.f27872r = i15;
                            if (i15 == -1) {
                                return -1;
                            }
                        }
                        T2 t23 = this.f27853D[i15];
                        InterfaceC3543m1 interfaceC3543m1 = t23.f27680c;
                        int i20 = t23.f27682e;
                        C3008c3 c3008c32 = t23.f27679b;
                        long j22 = this.f27851B + c3008c32.f29418c[i20];
                        int[] iArr = c3008c32.f29419d;
                        int i21 = iArr[i20];
                        long j23 = (j22 - p10) + this.f27873s;
                        if (j23 < 0 || j23 >= 262144) {
                            u02.f27844n = j22;
                            return 1;
                        }
                        Z2 z22 = t23.f27678a;
                        if (z22.f28829h == 1) {
                            j23 += 8;
                            i21 -= 8;
                        }
                        int i22 = i21;
                        r02.v((int) j23);
                        DP dp = z22.f28828g;
                        String str = dp.f24431o;
                        boolean equals = Objects.equals(str, com.anythink.basead.exoplayer.k.o.f8451h);
                        int i23 = this.f27857b;
                        if (!equals ? !Objects.equals(str, com.anythink.basead.exoplayer.k.o.i) ? Objects.equals(str, "video/apv") : (i23 & 128) != 0 : (i23 & 32) != 0) {
                            c9 = 1;
                        } else {
                            c9 = 1;
                            this.f27876v = true;
                        }
                        C3597n1 c3597n1 = t23.f27681d;
                        int i24 = z22.f28831k;
                        if (i24 == 0) {
                            DP dp2 = t23.f27683f;
                            if ("audio/ac4".equals(str)) {
                                if (this.f27874t == 0) {
                                    MA.z(i22, cr);
                                    interfaceC3543m1.a(7, cr);
                                    this.f27874t += 7;
                                }
                                i22 += 7;
                            } else if (dp2 != null && Objects.equals(str, com.anythink.basead.exoplayer.k.o.f8462t)) {
                                cr.y(4);
                                r02.y(cr.f24252a, 0, 4);
                                r02.l();
                                C3006c1 c3006c1 = new C3006c1();
                                if (c3006c1.a(cr.b()) && !Objects.equals(dp2.f24431o, (String) c3006c1.f29414g)) {
                                    C3299hP c3299hP = new C3299hP(dp2);
                                    String str2 = (String) c3006c1.f29414g;
                                    str2.getClass();
                                    c3299hP.e(str2);
                                    dp2 = new DP(c3299hP);
                                }
                                interfaceC3543m1.e(dp2);
                                t23.f27683f = null;
                            } else if (dp2 != null && AbstractC2968bG.n(str)) {
                                interfaceC3543m1.e(AbstractC2968bG.P(r02, i22, dp2));
                                t23.f27683f = null;
                            } else if (c3597n1 != null) {
                                c3597n1.a(r02);
                            }
                            while (true) {
                                int i25 = this.f27874t;
                                if (i25 >= i22) {
                                    break;
                                }
                                int d2 = interfaceC3543m1.d(r02, i22 - i25, false);
                                this.f27873s += d2;
                                this.f27874t += d2;
                                this.f27875u -= d2;
                            }
                        } else {
                            Cr cr4 = this.f27859d;
                            byte[] bArr = cr4.f24252a;
                            bArr[0] = 0;
                            bArr[c9] = 0;
                            bArr[2] = 0;
                            int i26 = 4 - i24;
                            i22 += i26;
                            while (this.f27874t < i22) {
                                int i27 = this.f27875u;
                                if (i27 == 0) {
                                    if (this.f27876v || SK.x(dp) + i24 > iArr[i20] - this.f27873s) {
                                        i = i24;
                                        i6 = 0;
                                    } else {
                                        int x9 = SK.x(dp);
                                        i = i24 + x9;
                                        i6 = x9;
                                    }
                                    r02.u(bArr, i26, i);
                                    this.f27873s += i;
                                    cr4.E(0);
                                    int b9 = cr4.b();
                                    if (b9 < 0) {
                                        throw U4.a(null, "Invalid NAL length");
                                    }
                                    this.f27875u = b9 - i6;
                                    Cr cr5 = this.f27858c;
                                    cr5.E(0);
                                    interfaceC3543m1.a(4, cr5);
                                    this.f27874t += 4;
                                    if (i6 > 0) {
                                        interfaceC3543m1.a(i6, cr4);
                                        this.f27874t += i6;
                                        if (SK.G(bArr, i6, dp)) {
                                            this.f27876v = true;
                                        }
                                    }
                                } else {
                                    int d9 = interfaceC3543m1.d(r02, i27, false);
                                    this.f27873s += d9;
                                    this.f27874t += d9;
                                    this.f27875u -= d9;
                                }
                            }
                        }
                        int i28 = i22;
                        long j24 = c3008c32.f29421f[i20];
                        int i29 = c3008c32.f29422g[i20];
                        if (!this.f27876v) {
                            i29 |= 67108864;
                        }
                        int i30 = i29;
                        if (c3597n1 != null) {
                            c3597n1.b(interfaceC3543m1, j24, i30, i28, 0, null);
                            if (i20 + 1 == c3008c32.f29417b) {
                                c3597n1.c(interfaceC3543m1, null);
                            }
                        } else {
                            interfaceC3543m1.c(j24, i30, i28, 0, null);
                        }
                        t23.f27682e++;
                        this.f27872r = -1;
                        this.f27873s = 0;
                        this.f27874t = 0;
                        this.f27875u = 0;
                        this.f27876v = false;
                        return 0;
                    }
                    if (i11 != 3) {
                        ArrayList arrayList = this.f27864j;
                        C3008c3 c3008c33 = (C3008c3) arrayList.get(this.f27880z);
                        int i31 = this.f27850A;
                        int i32 = c3008c33.f29417b;
                        ArrayList arrayList2 = this.f27865k;
                        if (i31 < i32) {
                            long j25 = c3008c33.f29418c[i31];
                            if (r02.p() != j25) {
                                u02.f27844n = j25;
                                return 1;
                            }
                            int i33 = c3008c33.f29419d[this.f27850A];
                            cr.y(i33);
                            r02.u(cr.f24252a, 0, i33);
                            String k9 = cr.k(Math.min(cr.L(), cr.B()), StandardCharsets.UTF_8);
                            int i34 = this.f27850A;
                            long[] jArr2 = c3008c33.f29421f;
                            long t6 = AbstractC3159eu.t(jArr2[i34]);
                            int i35 = this.f27850A + 1;
                            arrayList2.add(new O1(t6, i35 < i32 ? AbstractC3159eu.t(jArr2[i35]) : AbstractC3159eu.t(c3008c33.i), false, new C3138eQ(null, k9)));
                            this.f27850A++;
                            return 0;
                        }
                        for (T2 t24 : this.f27853D) {
                            if (t24.f27678a.f28832l == c3008c33.f29416a.f28822a) {
                                DP dp3 = t24.f27683f;
                                dp3.getClass();
                                ArrayList arrayList3 = new ArrayList();
                                O3 o32 = dp3.f24428l;
                                if (o32 != null) {
                                    arrayList3.addAll(o32.a(InterfaceC3922t3.class, Y0.f28629w));
                                }
                                arrayList3.addAll(arrayList2);
                                C3299hP c3299hP2 = new C3299hP(dp3);
                                c3299hP2.f30789k = new O3(arrayList3);
                                DP dp4 = new DP(c3299hP2);
                                String str3 = dp4.f24431o;
                                if (Objects.equals(str3, com.anythink.basead.exoplayer.k.o.f8462t) || AbstractC2968bG.n(str3)) {
                                    t24.f27683f = dp4;
                                } else {
                                    t24.f27680c.e(dp4);
                                    t24.f27683f = null;
                                }
                            }
                        }
                        this.f27880z++;
                        this.f27850A = 0;
                        arrayList2.clear();
                        if (this.f27880z != arrayList.size()) {
                            return 0;
                        }
                        this.f27867m = 2;
                        return 0;
                    }
                    ArrayList arrayList4 = this.i;
                    X2 x22 = this.f27863h;
                    int i36 = x22.f28474b;
                    if (i36 != 0) {
                        if (i36 != 1) {
                            ArrayList arrayList5 = x22.f28473a;
                            int i37 = 8;
                            short s10 = 2817;
                            if (i36 != 2) {
                                long p11 = r02.p();
                                int s11 = (int) ((r02.s() - r02.p()) - x22.f28475c);
                                Cr cr6 = new Cr(s11);
                                r02.u(cr6.f24252a, 0, s11);
                                for (int i38 = 0; i38 < arrayList5.size(); i38++) {
                                    W2 w22 = (W2) arrayList5.get(i38);
                                    cr6.E((int) (w22.f28308a - p11));
                                    cr6.G(4);
                                    int c12 = cr6.c();
                                    Charset charset = StandardCharsets.UTF_8;
                                    String k10 = cr6.k(c12, charset);
                                    switch (k10.hashCode()) {
                                        case -1711564334:
                                            if (k10.equals("SlowMotion_Data")) {
                                                c10 = 0;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1332107749:
                                            if (k10.equals("Super_SlowMotion_Edit_Data")) {
                                                c10 = 3;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1251387154:
                                            if (k10.equals("Super_SlowMotion_Data")) {
                                                c10 = 1;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -830665521:
                                            if (k10.equals("Super_SlowMotion_Deflickering_On")) {
                                                c10 = 4;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1760745220:
                                            if (k10.equals("Super_SlowMotion_BGM")) {
                                                c10 = 2;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        default:
                                            c10 = 65535;
                                            break;
                                    }
                                    if (c10 == 0) {
                                        c11 = 2192;
                                    } else if (c10 == 1) {
                                        c11 = 2816;
                                    } else if (c10 == 2) {
                                        c11 = 2817;
                                    } else if (c10 == 3) {
                                        c11 = 2819;
                                    } else {
                                        if (c10 != 4) {
                                            throw U4.a(null, "Invalid SEF name");
                                        }
                                        c11 = 2820;
                                    }
                                    int i39 = w22.f28309b - (c12 + 8);
                                    if (c11 == 2192) {
                                        ArrayList arrayList6 = new ArrayList();
                                        List q8 = X2.f28472e.q(cr6.k(i39, charset));
                                        int i40 = 0;
                                        while (i40 < q8.size()) {
                                            List q9 = X2.f28471d.q((CharSequence) q8.get(i40));
                                            if (q9.size() != 3) {
                                                throw U4.a(null, null);
                                            }
                                            try {
                                                ArrayList arrayList7 = arrayList6;
                                                arrayList7.add(new C3330i2(1 << (Integer.parseInt((String) q9.get(2)) - 1), Long.parseLong((String) q9.get(0)), Long.parseLong((String) q9.get(1))));
                                                i40++;
                                                arrayList6 = arrayList7;
                                            } catch (NumberFormatException e9) {
                                                throw U4.a(e9, null);
                                            }
                                        }
                                        arrayList4.add(new C3382j2(arrayList6));
                                    } else if (c11 != 2816 && c11 != 2817 && c11 != 2819 && c11 != 2820) {
                                        throw new IllegalStateException();
                                    }
                                }
                                u02.f27844n = 0L;
                            } else {
                                long s12 = r02.s();
                                int i41 = x22.f28475c - 20;
                                Cr cr7 = new Cr(i41);
                                r02.u(cr7.f24252a, 0, i41);
                                int i42 = 0;
                                while (i42 < i41 / 12) {
                                    cr7.G(2);
                                    cr7.v(2);
                                    byte[] bArr2 = cr7.f24252a;
                                    int i43 = cr7.f24253b;
                                    int i44 = i43 + 1;
                                    cr7.f24253b = i44;
                                    int i45 = bArr2[i43] & 255;
                                    cr7.f24253b = i43 + 2;
                                    short s13 = (short) (((bArr2[i44] & 255) << 8) | i45);
                                    if (s13 != 2192 && s13 != 2816 && s13 != s10 && s13 != 2819) {
                                        if (s13 != 2820) {
                                            cr7.G(i37);
                                            j6 = s12;
                                            i42++;
                                            s12 = j6;
                                            s10 = 2817;
                                            i37 = 8;
                                        }
                                    }
                                    j6 = s12;
                                    arrayList5.add(new W2((j6 - x22.f28475c) - cr7.c(), cr7.c()));
                                    i42++;
                                    s12 = j6;
                                    s10 = 2817;
                                    i37 = 8;
                                }
                                if (arrayList5.isEmpty()) {
                                    u02.f27844n = 0L;
                                } else {
                                    x22.f28474b = 3;
                                    u02.f27844n = ((W2) arrayList5.get(0)).f28308a;
                                }
                            }
                        } else {
                            Cr cr8 = new Cr(8);
                            r02.u(cr8.f24252a, 0, 8);
                            x22.f28475c = cr8.c() + 8;
                            if (cr8.b() != 1397048916) {
                                u02.f27844n = 0L;
                            } else {
                                u02.f27844n = r02.p() - (x22.f28475c - 12);
                                x22.f28474b = 2;
                            }
                        }
                        i9 = 1;
                    } else {
                        long s14 = r02.s();
                        u02.f27844n = (s14 == -1 || s14 < 8) ? 0L : s14 - 8;
                        i9 = 1;
                        x22.f28474b = 1;
                    }
                    if (u02.f27844n != 0) {
                        return i9;
                    }
                    this.f27867m = 0;
                    this.f27870p = 0;
                    return i9;
                }
                long j26 = this.f27869o - this.f27870p;
                long p12 = r02.p() + j26;
                Cr cr9 = this.f27871q;
                if (cr9 != null) {
                    r02.u(cr9.f24252a, this.f27870p, (int) j26);
                    if (this.f27868n == 1718909296) {
                        this.f27877w = true;
                        cr9.E(8);
                        if (cr9.b() != 1903435808) {
                            cr9.G(4);
                            while (cr9.B() > 0) {
                                if (cr9.b() != 1903435808) {
                                }
                            }
                            i10 = 0;
                            this.f27855F = i10;
                        }
                        i10 = 1;
                        this.f27855F = i10;
                    } else if (!arrayDeque.isEmpty()) {
                        ((Iw) arrayDeque.peek()).f25620d.add(new Zw(this.f27868n, cr9));
                    }
                } else {
                    if (!this.f27877w && this.f27868n == 1835295092) {
                        this.f27855F = 1;
                    }
                    if (j26 < 262144) {
                        r02.v((int) j26);
                    } else {
                        u02.f27844n = r02.p() + j26;
                        z6 = true;
                        g(p12);
                        if (!this.f27878x) {
                            this.f27879y = true;
                            u02.f27844n = 0L;
                            this.f27878x = false;
                        } else if (!z6) {
                            continue;
                        }
                        if (this.f27867m == 2) {
                            return 1;
                        }
                    }
                }
                z6 = false;
                g(p12);
                if (!this.f27878x) {
                }
                if (this.f27867m == 2) {
                }
            }
        }
        throw U4.c("Atom size less than header length (unsupported).");
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        if ((this.f27857b & 16) == 0) {
            s02 = new com.bumptech.glide.manager.o(s02, this.f27856a);
        }
        this.f27852C = s02;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        this.f27862g.clear();
        this.f27870p = 0;
        this.f27872r = -1;
        this.f27873s = 0;
        this.f27874t = 0;
        this.f27875u = 0;
        this.f27876v = false;
        this.f27880z = 0;
        this.f27850A = 0;
        this.f27864j.clear();
        this.f27865k.clear();
        if (j6 == 0) {
            if (this.f27867m != 3) {
                this.f27867m = 0;
                this.f27870p = 0;
                return;
            } else {
                X2 x22 = this.f27863h;
                x22.f28473a.clear();
                x22.f28474b = 0;
                this.i.clear();
                return;
            }
        }
        for (T2 t22 : this.f27853D) {
            C3008c3 c3008c3 = t22.f27679b;
            int a9 = c3008c3.a(j9);
            if (a9 == -1) {
                a9 = c3008c3.b(j9);
            }
            t22.f27682e = a9;
            C3597n1 c3597n1 = t22.f27681d;
            if (c3597n1 != null) {
                c3597n1.f32658b = false;
                c3597n1.f32659c = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        C3500lC c3500lC;
        InterfaceC3329i1 u3 = AbstractC2639Kg.u(r02, false);
        if (u3 != null) {
            c3500lC = RB.j(u3);
        } else {
            PB pb = RB.f27177u;
            c3500lC = C3500lC.f31745x;
        }
        this.f27866l = c3500lC;
        return u3 == null;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final /* synthetic */ List f() {
        return this.f27866l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if (((com.google.android.gms.internal.ads.C3591mw) r1).f32627a.equals("auxiliary.tracks.interleaved") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        if (((com.google.android.gms.internal.ads.C3591mw) r12).f32627a.equals("auxiliary.tracks.map") != false) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0382 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0398 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0314  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(long j6) {
        int i;
        long j9;
        ArrayList arrayList;
        O3 o32;
        O3 o33;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i6;
        long j10;
        int i9;
        O3 o34;
        O3 o35;
        DP dp;
        Z2 z22;
        int i10;
        int i11;
        int i12;
        T2 t22;
        ArrayList arrayList5;
        int i13;
        int i14;
        int i15;
        InterfaceC3922t3 interfaceC3922t3;
        InterfaceC3922t3 interfaceC3922t32;
        int i16;
        loop0: while (true) {
            int i17 = 0;
            int i18 = 1;
            while (true) {
                ArrayDeque arrayDeque = this.f27862g;
                if (arrayDeque.isEmpty() || ((Iw) arrayDeque.peek()).f25619c != j6) {
                    break loop0;
                }
                Iw iw = (Iw) arrayDeque.pop();
                if (iw.f31138b == 1836019574) {
                    Iw j11 = iw.j(1835365473);
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = this.f27864j;
                    if (j11 != null) {
                        o32 = J2.e(j11);
                        if (this.f27879y) {
                            o32.getClass();
                            InterfaceC3922t3[] interfaceC3922t3Arr = o32.f26586a;
                            int length = interfaceC3922t3Arr.length;
                            int i19 = i17;
                            while (true) {
                                if (i19 >= length) {
                                    j9 = 0;
                                    interfaceC3922t3 = null;
                                    break;
                                }
                                InterfaceC3922t3 interfaceC3922t33 = interfaceC3922t3Arr[i19];
                                j9 = 0;
                                if (C3591mw.class.isAssignableFrom(interfaceC3922t33.getClass())) {
                                    interfaceC3922t3 = (InterfaceC3922t3) C3591mw.class.cast(interfaceC3922t33);
                                }
                                interfaceC3922t3 = null;
                                if (interfaceC3922t3 != null) {
                                    break;
                                } else {
                                    i19 += i18;
                                }
                            }
                            C3591mw c3591mw = (C3591mw) interfaceC3922t3;
                            if (c3591mw != null && c3591mw.f32628b[i17] == 0) {
                                this.f27851B = j9 + 16;
                            }
                            int length2 = interfaceC3922t3Arr.length;
                            int i20 = i17;
                            while (true) {
                                if (i20 >= length2) {
                                    interfaceC3922t32 = null;
                                    break;
                                }
                                InterfaceC3922t3 interfaceC3922t34 = interfaceC3922t3Arr[i20];
                                if (C3591mw.class.isAssignableFrom(interfaceC3922t34.getClass())) {
                                    interfaceC3922t32 = (InterfaceC3922t3) C3591mw.class.cast(interfaceC3922t34);
                                }
                                interfaceC3922t32 = null;
                                if (interfaceC3922t32 != null) {
                                    break;
                                } else {
                                    i20 += i18;
                                }
                            }
                            C3591mw c3591mw2 = (C3591mw) interfaceC3922t32;
                            c3591mw2.getClass();
                            ArrayList b9 = c3591mw2.b();
                            arrayList6 = new ArrayList(b9.size());
                            for (int i21 = i17; i21 < b9.size(); i21 += i18) {
                                int intValue = ((Integer) b9.get(i21)).intValue();
                                if (intValue == 0) {
                                    i16 = i18;
                                } else if (intValue != i18) {
                                    i16 = 3;
                                    if (intValue != 2) {
                                        i16 = intValue != 3 ? i17 : 4;
                                    }
                                } else {
                                    i16 = 2;
                                }
                                arrayList6.add(Integer.valueOf(i16));
                            }
                        } else {
                            j9 = 0;
                        }
                        arrayList = arrayList6;
                    } else {
                        j9 = 0;
                        arrayList = arrayList6;
                        o32 = null;
                    }
                    ArrayList arrayList8 = new ArrayList();
                    int i22 = this.f27855F;
                    Z0 z02 = new Z0();
                    Zw i23 = iw.i(1969517665);
                    if (i23 != null) {
                        o33 = J2.c(i23);
                        z02.a(o33);
                    } else {
                        o33 = null;
                    }
                    Zw i24 = iw.i(1836476516);
                    i24.getClass();
                    int i25 = i18 != i22 ? i17 : i18;
                    InterfaceC3922t3[] interfaceC3922t3Arr2 = new InterfaceC3922t3[i18];
                    interfaceC3922t3Arr2[i17] = J2.d(i24.f28980c);
                    O3 o36 = new O3(interfaceC3922t3Arr2);
                    ArrayList arrayList9 = arrayList7;
                    O3 o37 = o33;
                    int i26 = i17;
                    O3 o38 = o36;
                    ArrayList b10 = J2.b(iw, z02, com.anythink.basead.exoplayer.b.f6382b, null, false, i25, L2.f26021b);
                    if (this.f27879y) {
                        boolean z3 = arrayList.size() == b10.size() ? i18 : i26;
                        Locale locale = Locale.US;
                        AbstractC2772Sd.I("The number of auxiliary track types from metadata (" + arrayList.size() + ") is not same as the number of auxiliary tracks (" + b10.size() + ")", z3);
                    }
                    ArrayList arrayList10 = new ArrayList();
                    Iterator it = b10.iterator();
                    while (it.hasNext()) {
                        int i27 = ((C3008c3) it.next()).f29416a.f28832l;
                        if (i27 != -1) {
                            Integer valueOf = Integer.valueOf(i27);
                            if (!arrayList10.contains(valueOf)) {
                                arrayList10.add(valueOf);
                            }
                        }
                    }
                    arrayList9.clear();
                    Iterator it2 = b10.iterator();
                    while (it2.hasNext()) {
                        C3008c3 c3008c3 = (C3008c3) it2.next();
                        if (arrayList10.contains(Integer.valueOf(c3008c3.f29416a.f28822a))) {
                            arrayList9.add(c3008c3);
                        }
                    }
                    String g4 = AbstractC2772Sd.g(b10);
                    int i28 = i18;
                    int i29 = -1;
                    int i30 = i26;
                    int i31 = i30;
                    long j12 = com.anythink.basead.exoplayer.b.f6382b;
                    while (i31 < b10.size()) {
                        C3008c3 c3008c32 = (C3008c3) b10.get(i31);
                        int i32 = c3008c32.f29417b;
                        if (i32 == 0) {
                            arrayList2 = arrayList9;
                        } else {
                            arrayList2 = arrayList9;
                            Z2 z23 = c3008c32.f29416a;
                            if (z23.f28833m) {
                                arrayList3 = b10;
                                S0 s02 = this.f27852C;
                                int i33 = i30 + 1;
                                ArrayList arrayList11 = arrayList8;
                                int i34 = z23.f28823b;
                                InterfaceC3543m1 C8 = s02.C(i30, i34);
                                T2 t23 = new T2(z23, c3008c32, C8);
                                long j13 = z23.f28826e;
                                if (j13 == com.anythink.basead.exoplayer.b.f6382b) {
                                    j13 = c3008c32.i;
                                }
                                C8.getClass();
                                long max = Math.max(j12, j13);
                                DP dp2 = z23.f28828g;
                                String str = dp2.f24431o;
                                boolean equals = com.anythink.basead.exoplayer.k.o.f8422C.equals(str);
                                int i35 = c3008c32.f29420e;
                                int i36 = equals ? i35 * 16 : i35 + 30;
                                C3299hP c3299hP = new C3299hP(dp2);
                                c3299hP.f30793o = i36;
                                if (i34 == 2) {
                                    int i37 = this.f27857b & 8;
                                    int i38 = dp2.f24423f;
                                    if (i37 != 0) {
                                        i38 |= i29 == -1 ? i28 : 2;
                                    }
                                    if (this.f27879y) {
                                        i38 |= 32768;
                                        c3299hP.f30786g = ((Integer) arrayList.get(i31)).intValue();
                                    }
                                    c3299hP.f30785f = i38;
                                    i34 = 2;
                                }
                                if (H4.b(str)) {
                                    long[] jArr = c3008c32.f29421f;
                                    arrayList4 = arrayList;
                                    if (jArr.length > 0) {
                                        int[] iArr = c3008c32.f29423h;
                                        boolean z6 = c3008c32.f29424j;
                                        int min = Math.min(!z6 ? iArr.length : i32, 20);
                                        AbstractC2772Sd.H(j13 != com.anythink.basead.exoplayer.b.f6382b ? i28 : i26);
                                        i6 = i29;
                                        long min2 = Math.min(j13, 10000000L);
                                        int i39 = i26;
                                        int i40 = i39;
                                        int i41 = -1;
                                        while (i39 < min) {
                                            int i42 = z6 ? i39 : iArr[i39];
                                            long j14 = jArr[i42];
                                            if (j14 > min2) {
                                                break;
                                            }
                                            if (j14 >= j9) {
                                                i15 = min;
                                                int i43 = c3008c32.f29419d[i42];
                                                if (i43 > i40) {
                                                    i40 = i43;
                                                    i41 = i42;
                                                }
                                            } else {
                                                i15 = min;
                                            }
                                            i39++;
                                            min = i15;
                                        }
                                        if (i41 != -1) {
                                            j10 = jArr[i41];
                                            if (j10 != com.anythink.basead.exoplayer.b.f6382b) {
                                                Q1 q12 = new Q1(j10);
                                                i9 = i28;
                                                InterfaceC3922t3[] interfaceC3922t3Arr3 = new InterfaceC3922t3[i9];
                                                interfaceC3922t3Arr3[i26] = q12;
                                                o34 = new O3(interfaceC3922t3Arr3);
                                            } else {
                                                i9 = i28;
                                                o34 = null;
                                            }
                                            if (i34 == i9 && (i13 = z02.f28816a) != -1 && (i14 = z02.f28817b) != -1) {
                                                c3299hP.f30775K = i13;
                                                c3299hP.f30776L = i14;
                                            }
                                            ArrayList arrayList12 = this.i;
                                            O3 o39 = arrayList12.isEmpty() ? null : new O3(arrayList12);
                                            o35 = o38;
                                            SK.l(i34, o32, c3299hP, dp2.f24428l, o39, o37, o35, o34);
                                            c3299hP.d(g4);
                                            dp = new DP(c3299hP);
                                            if (!Objects.equals(str, com.anythink.basead.exoplayer.k.o.f8462t) || AbstractC2968bG.n(str)) {
                                                z22 = z23;
                                                i10 = 1;
                                            } else {
                                                i10 = i26;
                                                z22 = z23;
                                            }
                                            i11 = z22.f28832l;
                                            if (i11 != -1) {
                                                Iterator it3 = arrayList2.iterator();
                                                while (it3.hasNext()) {
                                                    if (((C3008c3) it3.next()).f29416a.f28822a == i11) {
                                                        i12 = 1;
                                                        break;
                                                    }
                                                }
                                            }
                                            i12 = i26;
                                            if (i10 == 0 || i12 != 0) {
                                                t22 = t23;
                                                t22.f27683f = dp;
                                            } else {
                                                C8.e(dp);
                                                t22 = t23;
                                            }
                                            int i44 = i6;
                                            i29 = (i34 == 2 || i44 != -1) ? i44 : arrayList11.size();
                                            arrayList5 = arrayList11;
                                            arrayList5.add(t22);
                                            i30 = i33;
                                            j12 = max;
                                            i31++;
                                            arrayList8 = arrayList5;
                                            o38 = o35;
                                            arrayList9 = arrayList2;
                                            b10 = arrayList3;
                                            arrayList = arrayList4;
                                            i28 = 1;
                                        }
                                        j10 = -9223372036854775807L;
                                        if (j10 != com.anythink.basead.exoplayer.b.f6382b) {
                                        }
                                        if (i34 == i9) {
                                            c3299hP.f30775K = i13;
                                            c3299hP.f30776L = i14;
                                        }
                                        ArrayList arrayList122 = this.i;
                                        if (arrayList122.isEmpty()) {
                                        }
                                        o35 = o38;
                                        SK.l(i34, o32, c3299hP, dp2.f24428l, o39, o37, o35, o34);
                                        c3299hP.d(g4);
                                        dp = new DP(c3299hP);
                                        if (Objects.equals(str, com.anythink.basead.exoplayer.k.o.f8462t)) {
                                        }
                                        z22 = z23;
                                        i10 = 1;
                                        i11 = z22.f28832l;
                                        if (i11 != -1) {
                                        }
                                        i12 = i26;
                                        if (i10 == 0) {
                                        }
                                        t22 = t23;
                                        t22.f27683f = dp;
                                        int i442 = i6;
                                        if (i34 == 2) {
                                        }
                                        arrayList5 = arrayList11;
                                        arrayList5.add(t22);
                                        i30 = i33;
                                        j12 = max;
                                        i31++;
                                        arrayList8 = arrayList5;
                                        o38 = o35;
                                        arrayList9 = arrayList2;
                                        b10 = arrayList3;
                                        arrayList = arrayList4;
                                        i28 = 1;
                                    }
                                } else {
                                    arrayList4 = arrayList;
                                }
                                i6 = i29;
                                j10 = -9223372036854775807L;
                                if (j10 != com.anythink.basead.exoplayer.b.f6382b) {
                                }
                                if (i34 == i9) {
                                }
                                ArrayList arrayList1222 = this.i;
                                if (arrayList1222.isEmpty()) {
                                }
                                o35 = o38;
                                SK.l(i34, o32, c3299hP, dp2.f24428l, o39, o37, o35, o34);
                                c3299hP.d(g4);
                                dp = new DP(c3299hP);
                                if (Objects.equals(str, com.anythink.basead.exoplayer.k.o.f8462t)) {
                                }
                                z22 = z23;
                                i10 = 1;
                                i11 = z22.f28832l;
                                if (i11 != -1) {
                                }
                                i12 = i26;
                                if (i10 == 0) {
                                }
                                t22 = t23;
                                t22.f27683f = dp;
                                int i4422 = i6;
                                if (i34 == 2) {
                                }
                                arrayList5 = arrayList11;
                                arrayList5.add(t22);
                                i30 = i33;
                                j12 = max;
                                i31++;
                                arrayList8 = arrayList5;
                                o38 = o35;
                                arrayList9 = arrayList2;
                                b10 = arrayList3;
                                arrayList = arrayList4;
                                i28 = 1;
                            }
                        }
                        arrayList4 = arrayList;
                        arrayList5 = arrayList8;
                        arrayList3 = b10;
                        o35 = o38;
                        i31++;
                        arrayList8 = arrayList5;
                        o38 = o35;
                        arrayList9 = arrayList2;
                        b10 = arrayList3;
                        arrayList = arrayList4;
                        i28 = 1;
                    }
                    ArrayList arrayList13 = arrayList9;
                    int i45 = i29;
                    int i46 = -1;
                    T2[] t2Arr = (T2[]) arrayList8.toArray(new T2[i26]);
                    this.f27853D = t2Arr;
                    int length3 = t2Arr.length;
                    long[][] jArr2 = new long[length3][];
                    int[] iArr2 = new int[length3];
                    long[] jArr3 = new long[length3];
                    boolean[] zArr = new boolean[length3];
                    for (int i47 = 0; i47 < t2Arr.length; i47++) {
                        jArr2[i47] = new long[t2Arr[i47].f27679b.f29417b];
                        jArr3[i47] = t2Arr[i47].f27679b.f29421f[0];
                    }
                    long j15 = j9;
                    int i48 = 0;
                    while (i48 < t2Arr.length) {
                        long j16 = Long.MAX_VALUE;
                        int i49 = i46;
                        for (int i50 = 0; i50 < t2Arr.length; i50++) {
                            if (!zArr[i50]) {
                                long j17 = jArr3[i50];
                                if (j17 <= j16) {
                                    i49 = i50;
                                    j16 = j17;
                                }
                            }
                        }
                        int i51 = iArr2[i49];
                        long[] jArr4 = jArr2[i49];
                        jArr4[i51] = j15;
                        C3008c3 c3008c33 = t2Arr[i49].f27679b;
                        T2[] t2Arr2 = t2Arr;
                        boolean[] zArr2 = zArr;
                        j15 += c3008c33.f29419d[i51];
                        int i52 = i51 + 1;
                        iArr2[i49] = i52;
                        if (i52 < jArr4.length) {
                            jArr3[i49] = c3008c33.f29421f[i52];
                        } else {
                            zArr2[i49] = true;
                            i48++;
                        }
                        t2Arr = t2Arr2;
                        zArr = zArr2;
                        i46 = -1;
                    }
                    this.f27854E = jArr2;
                    this.f27852C.B();
                    this.f27852C.D(new S2(j12, this.f27853D, i45));
                    arrayDeque.clear();
                    if (!this.f27878x) {
                        i = 1;
                        this.f27867m = true != arrayList13.isEmpty() ? 4 : 2;
                    }
                } else {
                    i = i18;
                    if (!arrayDeque.isEmpty()) {
                        ((Iw) arrayDeque.peek()).f25621e.add(iw);
                    }
                }
                i18 = i;
                i17 = 0;
            }
        }
        int i53 = this.f27867m;
        if (i53 == 4 || i53 == 2) {
            return;
        }
        this.f27867m = 0;
        this.f27870p = 0;
    }

    public U2(InterfaceC3814r3 interfaceC3814r3, int i) {
        this.f27856a = interfaceC3814r3;
        this.f27857b = i;
        PB pb = RB.f27177u;
        this.f27866l = C3500lC.f31745x;
        this.f27867m = 0;
        this.f27863h = new X2();
        this.i = new ArrayList();
        this.f27861f = new Cr(16);
        this.f27862g = new ArrayDeque();
        this.f27858c = new Cr(SK.f27460r0);
        this.f27859d = new Cr(6);
        this.f27860e = new Cr();
        this.f27872r = -1;
        this.f27852C = S0.f27391l0;
        this.f27853D = new T2[0];
        this.f27864j = new ArrayList();
        this.f27865k = new ArrayList();
    }
}
