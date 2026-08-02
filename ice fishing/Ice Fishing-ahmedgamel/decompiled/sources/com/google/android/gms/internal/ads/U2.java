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
    public static final /* synthetic */ int f28646G = 0;

    /* renamed from: A, reason: collision with root package name */
    public int f28647A;

    /* renamed from: B, reason: collision with root package name */
    public long f28648B;

    /* renamed from: C, reason: collision with root package name */
    public S0 f28649C;

    /* renamed from: D, reason: collision with root package name */
    public T2[] f28650D;

    /* renamed from: E, reason: collision with root package name */
    public long[][] f28651E;

    /* renamed from: F, reason: collision with root package name */
    public int f28652F;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3837r3 f28653a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28654b;

    /* renamed from: c, reason: collision with root package name */
    public final Cr f28655c;

    /* renamed from: d, reason: collision with root package name */
    public final Cr f28656d;

    /* renamed from: e, reason: collision with root package name */
    public final Cr f28657e;

    /* renamed from: f, reason: collision with root package name */
    public final Cr f28658f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f28659g;

    /* renamed from: h, reason: collision with root package name */
    public final X2 f28660h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f28661j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f28662k;

    /* renamed from: l, reason: collision with root package name */
    public C3523lC f28663l;

    /* renamed from: m, reason: collision with root package name */
    public int f28664m;

    /* renamed from: n, reason: collision with root package name */
    public int f28665n;

    /* renamed from: o, reason: collision with root package name */
    public long f28666o;

    /* renamed from: p, reason: collision with root package name */
    public int f28667p;

    /* renamed from: q, reason: collision with root package name */
    public Cr f28668q;

    /* renamed from: r, reason: collision with root package name */
    public int f28669r;

    /* renamed from: s, reason: collision with root package name */
    public int f28670s;

    /* renamed from: t, reason: collision with root package name */
    public int f28671t;

    /* renamed from: u, reason: collision with root package name */
    public int f28672u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f28673v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f28674w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f28675x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f28676y;

    /* renamed from: z, reason: collision with root package name */
    public int f28677z;

    static {
        int i = AbstractC2659Kg.f26727M;
    }

    public U2() {
        this(InterfaceC3837r3.f34276h0, 16);
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
        int i4;
        boolean z6;
        int i6;
        long j6;
        char c10;
        char c11;
        boolean z9;
        int i9;
        while (true) {
            int i10 = this.f28664m;
            ArrayDeque arrayDeque = this.f28659g;
            Cr cr = this.f28657e;
            if (i10 == 0) {
                int i11 = this.f28667p;
                Cr cr2 = this.f28658f;
                if (i11 == 0) {
                    if (!r02.A(cr2.f24997a, 0, 8, true)) {
                        return -1;
                    }
                    this.f28667p = 8;
                    cr2.E(0);
                    this.f28666o = cr2.P();
                    this.f28665n = cr2.b();
                }
                long j9 = this.f28666o;
                if (j9 == 1) {
                    r02.u(cr2.f24997a, 8, 8);
                    this.f28667p += 8;
                    this.f28666o = cr2.j();
                } else if (j9 == 0) {
                    long s9 = r02.s();
                    if (s9 == -1) {
                        Iw iw = (Iw) arrayDeque.peek();
                        s9 = iw != null ? iw.f26372c : -1L;
                    }
                    if (s9 != -1) {
                        this.f28666o = (s9 - r02.p()) + this.f28667p;
                    }
                }
                long j10 = this.f28666o;
                int i12 = this.f28667p;
                long j11 = i12;
                if (j10 < j11) {
                    if (this.f28665n != 1718773093 || i12 != 8) {
                        break;
                    }
                    this.f28666o = j11;
                    i12 = 8;
                }
                int i13 = this.f28665n;
                if (i13 == 1836019574 || i13 == 1953653099 || i13 == 1835297121 || i13 == 1835626086 || i13 == 1937007212 || i13 == 1701082227 || i13 == 1835365473 || i13 == 1635284069 || i13 == 1953654118) {
                    long p9 = r02.p();
                    long j12 = this.f28666o;
                    long j13 = p9 + j12;
                    long j14 = this.f28667p;
                    if (j12 != j14 && this.f28665n == 1835365473) {
                        cr.y(8);
                        r02.x(cr.f24997a, 0, 8);
                        J2.f(cr);
                        r02.v(cr.f24998b);
                        r02.l();
                    }
                    long j15 = j13 - j14;
                    arrayDeque.push(new Iw(this.f28665n, j15));
                    if (this.f28666o == this.f28667p) {
                        g(j15);
                    } else {
                        this.f28664m = 0;
                        this.f28667p = 0;
                    }
                } else {
                    if (i13 == 1835296868 || i13 == 1836476516 || i13 == 1751411826 || i13 == 1937011556 || i13 == 1937011827 || i13 == 1937011571 || i13 == 1668576371 || i13 == 1701606260 || i13 == 1937011555 || i13 == 1937011578 || i13 == 1937013298 || i13 == 1937007471 || i13 == 1668232756 || i13 == 1953196132 || i13 == 1718909296 || i13 == 1969517665 || i13 == 1801812339 || i13 == 1768715124 || i13 == 1667785072) {
                        AbstractC2792Sd.H(i12 == 8);
                        AbstractC2792Sd.H(this.f28666o <= 2147483647L);
                        Cr cr3 = new Cr((int) this.f28666o);
                        System.arraycopy(cr2.f24997a, 0, cr3.f24997a, 0, 8);
                        this.f28668q = cr3;
                    } else {
                        this.f28668q = null;
                    }
                    this.f28664m = 1;
                }
            } else {
                if (i10 != 1) {
                    if (i10 == 2) {
                        long p10 = r02.p();
                        int i14 = this.f28669r;
                        if (i14 == -1) {
                            int i15 = 0;
                            boolean z10 = true;
                            boolean z11 = true;
                            int i16 = -1;
                            int i17 = -1;
                            long j16 = Long.MAX_VALUE;
                            long j17 = Long.MAX_VALUE;
                            long j18 = Long.MAX_VALUE;
                            while (true) {
                                T2[] t2Arr = this.f28650D;
                                if (i15 >= t2Arr.length) {
                                    break;
                                }
                                T2 t22 = t2Arr[i15];
                                int i18 = t22.f28465e;
                                C3031c3 c3031c3 = t22.f28462b;
                                if (i18 != c3031c3.f30200b) {
                                    long j19 = c3031c3.f30201c[i18];
                                    long[][] jArr = this.f28651E;
                                    jArr.getClass();
                                    long j20 = jArr[i15][i18];
                                    long j21 = j19 - p10;
                                    boolean z12 = j21 < 0 || j21 >= 262144;
                                    if (z12) {
                                        z6 = z11;
                                    } else {
                                        if (!z11) {
                                            z6 = false;
                                        }
                                        i17 = i15;
                                        z6 = z12;
                                        j18 = j21;
                                        j17 = j20;
                                        if (j20 >= j16) {
                                            i16 = i15;
                                            z10 = z12;
                                            z11 = z6;
                                            j16 = j20;
                                        } else {
                                            z11 = z6;
                                        }
                                    }
                                    if (z12 == z6) {
                                    }
                                    if (j20 >= j16) {
                                    }
                                }
                                i15++;
                            }
                            i14 = (j16 == Long.MAX_VALUE || !z10 || j17 < j16 + 10485760) ? i17 : i16;
                            this.f28669r = i14;
                            if (i14 == -1) {
                                return -1;
                            }
                        }
                        T2 t23 = this.f28650D[i14];
                        InterfaceC3566m1 interfaceC3566m1 = t23.f28463c;
                        int i19 = t23.f28465e;
                        C3031c3 c3031c32 = t23.f28462b;
                        long j22 = this.f28648B + c3031c32.f30201c[i19];
                        int[] iArr = c3031c32.f30202d;
                        int i20 = iArr[i19];
                        long j23 = (j22 - p10) + this.f28670s;
                        if (j23 < 0 || j23 >= 262144) {
                            u02.f28641n = j22;
                            return 1;
                        }
                        Z2 z22 = t23.f28461a;
                        if (z22.f29609h == 1) {
                            j23 += 8;
                            i20 -= 8;
                        }
                        int i21 = i20;
                        r02.v((int) j23);
                        DP dp = z22.f29608g;
                        String str = dp.f25176o;
                        boolean equals = Objects.equals(str, com.anythink.basead.exoplayer.k.o.f9237h);
                        int i22 = this.f28654b;
                        if (!equals ? !Objects.equals(str, com.anythink.basead.exoplayer.k.o.i) ? Objects.equals(str, "video/apv") : (i22 & 128) != 0 : (i22 & 32) != 0) {
                            c9 = 1;
                        } else {
                            c9 = 1;
                            this.f28673v = true;
                        }
                        C3620n1 c3620n1 = t23.f28464d;
                        int i23 = z22.f29611k;
                        if (i23 == 0) {
                            DP dp2 = t23.f28466f;
                            if ("audio/ac4".equals(str)) {
                                if (this.f28671t == 0) {
                                    MA.z(i21, cr);
                                    interfaceC3566m1.a(7, cr);
                                    this.f28671t += 7;
                                }
                                i21 += 7;
                            } else if (dp2 != null && Objects.equals(str, com.anythink.basead.exoplayer.k.o.f9248t)) {
                                cr.y(4);
                                r02.x(cr.f24997a, 0, 4);
                                r02.l();
                                C3029c1 c3029c1 = new C3029c1();
                                if (c3029c1.a(cr.b()) && !Objects.equals(dp2.f25176o, (String) c3029c1.f30197g)) {
                                    C3322hP c3322hP = new C3322hP(dp2);
                                    String str2 = (String) c3029c1.f30197g;
                                    str2.getClass();
                                    c3322hP.e(str2);
                                    dp2 = new DP(c3322hP);
                                }
                                interfaceC3566m1.e(dp2);
                                t23.f28466f = null;
                            } else if (dp2 != null && AbstractC2991bG.n(str)) {
                                interfaceC3566m1.e(AbstractC2991bG.P(r02, i21, dp2));
                                t23.f28466f = null;
                            } else if (c3620n1 != null) {
                                c3620n1.a(r02);
                            }
                            while (true) {
                                int i24 = this.f28671t;
                                if (i24 >= i21) {
                                    break;
                                }
                                int d9 = interfaceC3566m1.d(r02, i21 - i24, false);
                                this.f28670s += d9;
                                this.f28671t += d9;
                                this.f28672u -= d9;
                            }
                        } else {
                            Cr cr4 = this.f28656d;
                            byte[] bArr = cr4.f24997a;
                            bArr[0] = 0;
                            bArr[c9] = 0;
                            bArr[2] = 0;
                            int i25 = 4 - i23;
                            i21 += i25;
                            while (this.f28671t < i21) {
                                int i26 = this.f28672u;
                                if (i26 == 0) {
                                    if (this.f28673v || SK.x(dp) + i23 > iArr[i19] - this.f28670s) {
                                        i = i23;
                                        i4 = 0;
                                    } else {
                                        int x9 = SK.x(dp);
                                        i = i23 + x9;
                                        i4 = x9;
                                    }
                                    r02.u(bArr, i25, i);
                                    this.f28670s += i;
                                    cr4.E(0);
                                    int b9 = cr4.b();
                                    if (b9 < 0) {
                                        throw U4.a(null, "Invalid NAL length");
                                    }
                                    this.f28672u = b9 - i4;
                                    Cr cr5 = this.f28655c;
                                    cr5.E(0);
                                    interfaceC3566m1.a(4, cr5);
                                    this.f28671t += 4;
                                    if (i4 > 0) {
                                        interfaceC3566m1.a(i4, cr4);
                                        this.f28671t += i4;
                                        if (SK.G(bArr, i4, dp)) {
                                            this.f28673v = true;
                                        }
                                    }
                                } else {
                                    int d10 = interfaceC3566m1.d(r02, i26, false);
                                    this.f28670s += d10;
                                    this.f28671t += d10;
                                    this.f28672u -= d10;
                                }
                            }
                        }
                        int i27 = i21;
                        long j24 = c3031c32.f30204f[i19];
                        int i28 = c3031c32.f30205g[i19];
                        if (!this.f28673v) {
                            i28 |= 67108864;
                        }
                        int i29 = i28;
                        if (c3620n1 != null) {
                            c3620n1.b(interfaceC3566m1, j24, i29, i27, 0, null);
                            if (i19 + 1 == c3031c32.f30200b) {
                                c3620n1.c(interfaceC3566m1, null);
                            }
                        } else {
                            interfaceC3566m1.c(j24, i29, i27, 0, null);
                        }
                        t23.f28465e++;
                        this.f28669r = -1;
                        this.f28670s = 0;
                        this.f28671t = 0;
                        this.f28672u = 0;
                        this.f28673v = false;
                        return 0;
                    }
                    if (i10 != 3) {
                        ArrayList arrayList = this.f28661j;
                        C3031c3 c3031c33 = (C3031c3) arrayList.get(this.f28677z);
                        int i30 = this.f28647A;
                        int i31 = c3031c33.f30200b;
                        ArrayList arrayList2 = this.f28662k;
                        if (i30 < i31) {
                            long j25 = c3031c33.f30201c[i30];
                            if (r02.p() != j25) {
                                u02.f28641n = j25;
                                return 1;
                            }
                            int i32 = c3031c33.f30202d[this.f28647A];
                            cr.y(i32);
                            r02.u(cr.f24997a, 0, i32);
                            String k9 = cr.k(Math.min(cr.L(), cr.B()), StandardCharsets.UTF_8);
                            int i33 = this.f28647A;
                            long[] jArr2 = c3031c33.f30204f;
                            long t6 = AbstractC3182eu.t(jArr2[i33]);
                            int i34 = this.f28647A + 1;
                            arrayList2.add(new O1(t6, i34 < i31 ? AbstractC3182eu.t(jArr2[i34]) : AbstractC3182eu.t(c3031c33.i), false, new C3323hQ(null, k9)));
                            this.f28647A++;
                            return 0;
                        }
                        for (T2 t24 : this.f28650D) {
                            if (t24.f28461a.f29612l == c3031c33.f30199a.f29602a) {
                                DP dp3 = t24.f28466f;
                                dp3.getClass();
                                ArrayList arrayList3 = new ArrayList();
                                O3 o32 = dp3.f25173l;
                                if (o32 != null) {
                                    arrayList3.addAll(o32.a(InterfaceC3945t3.class, Y0.f29406w));
                                }
                                arrayList3.addAll(arrayList2);
                                C3322hP c3322hP2 = new C3322hP(dp3);
                                c3322hP2.f31555k = new O3(arrayList3);
                                DP dp4 = new DP(c3322hP2);
                                String str3 = dp4.f25176o;
                                if (Objects.equals(str3, com.anythink.basead.exoplayer.k.o.f9248t) || AbstractC2991bG.n(str3)) {
                                    t24.f28466f = dp4;
                                } else {
                                    t24.f28463c.e(dp4);
                                    t24.f28466f = null;
                                }
                            }
                        }
                        this.f28677z++;
                        this.f28647A = 0;
                        arrayList2.clear();
                        if (this.f28677z != arrayList.size()) {
                            return 0;
                        }
                        this.f28664m = 2;
                        return 0;
                    }
                    ArrayList arrayList4 = this.i;
                    X2 x22 = this.f28660h;
                    int i35 = x22.f29254b;
                    if (i35 != 0) {
                        if (i35 != 1) {
                            ArrayList arrayList5 = x22.f29253a;
                            int i36 = 8;
                            short s10 = 2817;
                            if (i35 != 2) {
                                long p11 = r02.p();
                                int s11 = (int) ((r02.s() - r02.p()) - x22.f29255c);
                                Cr cr6 = new Cr(s11);
                                r02.u(cr6.f24997a, 0, s11);
                                for (int i37 = 0; i37 < arrayList5.size(); i37++) {
                                    W2 w22 = (W2) arrayList5.get(i37);
                                    cr6.E((int) (w22.f29106a - p11));
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
                                    int i38 = w22.f29107b - (c12 + 8);
                                    if (c11 == 2192) {
                                        ArrayList arrayList6 = new ArrayList();
                                        List q8 = X2.f29252e.q(cr6.k(i38, charset));
                                        int i39 = 0;
                                        while (i39 < q8.size()) {
                                            List q9 = X2.f29251d.q((CharSequence) q8.get(i39));
                                            if (q9.size() != 3) {
                                                throw U4.a(null, null);
                                            }
                                            try {
                                                ArrayList arrayList7 = arrayList6;
                                                arrayList7.add(new C3353i2(1 << (Integer.parseInt((String) q9.get(2)) - 1), Long.parseLong((String) q9.get(0)), Long.parseLong((String) q9.get(1))));
                                                i39++;
                                                arrayList6 = arrayList7;
                                            } catch (NumberFormatException e9) {
                                                throw U4.a(e9, null);
                                            }
                                        }
                                        arrayList4.add(new C3405j2(arrayList6));
                                    } else if (c11 != 2816 && c11 != 2817 && c11 != 2819 && c11 != 2820) {
                                        throw new IllegalStateException();
                                    }
                                }
                                u02.f28641n = 0L;
                            } else {
                                long s12 = r02.s();
                                int i40 = x22.f29255c - 20;
                                Cr cr7 = new Cr(i40);
                                r02.u(cr7.f24997a, 0, i40);
                                int i41 = 0;
                                while (i41 < i40 / 12) {
                                    cr7.G(2);
                                    cr7.v(2);
                                    byte[] bArr2 = cr7.f24997a;
                                    int i42 = cr7.f24998b;
                                    int i43 = i42 + 1;
                                    cr7.f24998b = i43;
                                    int i44 = bArr2[i42] & 255;
                                    cr7.f24998b = i42 + 2;
                                    short s13 = (short) (((bArr2[i43] & 255) << 8) | i44);
                                    if (s13 != 2192 && s13 != 2816 && s13 != s10 && s13 != 2819) {
                                        if (s13 != 2820) {
                                            cr7.G(i36);
                                            j6 = s12;
                                            i41++;
                                            s12 = j6;
                                            s10 = 2817;
                                            i36 = 8;
                                        }
                                    }
                                    j6 = s12;
                                    arrayList5.add(new W2((j6 - x22.f29255c) - cr7.c(), cr7.c()));
                                    i41++;
                                    s12 = j6;
                                    s10 = 2817;
                                    i36 = 8;
                                }
                                if (arrayList5.isEmpty()) {
                                    u02.f28641n = 0L;
                                } else {
                                    x22.f29254b = 3;
                                    u02.f28641n = ((W2) arrayList5.get(0)).f29106a;
                                }
                            }
                        } else {
                            Cr cr8 = new Cr(8);
                            r02.u(cr8.f24997a, 0, 8);
                            x22.f29255c = cr8.c() + 8;
                            if (cr8.b() != 1397048916) {
                                u02.f28641n = 0L;
                            } else {
                                u02.f28641n = r02.p() - (x22.f29255c - 12);
                                x22.f29254b = 2;
                            }
                        }
                        i6 = 1;
                    } else {
                        long s14 = r02.s();
                        u02.f28641n = (s14 == -1 || s14 < 8) ? 0L : s14 - 8;
                        i6 = 1;
                        x22.f29254b = 1;
                    }
                    if (u02.f28641n != 0) {
                        return i6;
                    }
                    this.f28664m = 0;
                    this.f28667p = 0;
                    return i6;
                }
                long j26 = this.f28666o - this.f28667p;
                long p12 = r02.p() + j26;
                Cr cr9 = this.f28668q;
                if (cr9 != null) {
                    r02.u(cr9.f24997a, this.f28667p, (int) j26);
                    if (this.f28665n == 1718909296) {
                        this.f28674w = true;
                        cr9.E(8);
                        if (cr9.b() != 1903435808) {
                            cr9.G(4);
                            while (cr9.B() > 0) {
                                if (cr9.b() != 1903435808) {
                                }
                            }
                            i9 = 0;
                            this.f28652F = i9;
                        }
                        i9 = 1;
                        this.f28652F = i9;
                    } else if (!arrayDeque.isEmpty()) {
                        ((Iw) arrayDeque.peek()).f26373d.add(new Zw(this.f28665n, cr9));
                    }
                } else {
                    if (!this.f28674w && this.f28665n == 1835295092) {
                        this.f28652F = 1;
                    }
                    if (j26 < 262144) {
                        r02.v((int) j26);
                    } else {
                        u02.f28641n = r02.p() + j26;
                        z9 = true;
                        g(p12);
                        if (!this.f28675x) {
                            this.f28676y = true;
                            u02.f28641n = 0L;
                            this.f28675x = false;
                        } else if (!z9) {
                            continue;
                        }
                        if (this.f28664m == 2) {
                            return 1;
                        }
                    }
                }
                z9 = false;
                g(p12);
                if (!this.f28675x) {
                }
                if (this.f28664m == 2) {
                }
            }
        }
        throw U4.c("Atom size less than header length (unsupported).");
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        if ((this.f28654b & 16) == 0) {
            s02 = new com.bumptech.glide.manager.n(s02, this.f28653a);
        }
        this.f28649C = s02;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        this.f28659g.clear();
        this.f28667p = 0;
        this.f28669r = -1;
        this.f28670s = 0;
        this.f28671t = 0;
        this.f28672u = 0;
        this.f28673v = false;
        this.f28677z = 0;
        this.f28647A = 0;
        this.f28661j.clear();
        this.f28662k.clear();
        if (j6 == 0) {
            if (this.f28664m != 3) {
                this.f28664m = 0;
                this.f28667p = 0;
                return;
            } else {
                X2 x22 = this.f28660h;
                x22.f29253a.clear();
                x22.f29254b = 0;
                this.i.clear();
                return;
            }
        }
        for (T2 t22 : this.f28650D) {
            C3031c3 c3031c3 = t22.f28462b;
            int a9 = c3031c3.a(j9);
            if (a9 == -1) {
                a9 = c3031c3.b(j9);
            }
            t22.f28465e = a9;
            C3620n1 c3620n1 = t22.f28464d;
            if (c3620n1 != null) {
                c3620n1.f33436b = false;
                c3620n1.f33437c = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        C3523lC c3523lC;
        InterfaceC3352i1 u6 = AbstractC2659Kg.u(r02, false);
        if (u6 != null) {
            c3523lC = RB.j(u6);
        } else {
            PB pb = RB.f27933u;
            c3523lC = C3523lC.f32525x;
        }
        this.f28663l = c3523lC;
        return u6 == null;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final /* synthetic */ List f() {
        return this.f28663l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if (((com.google.android.gms.internal.ads.C3668nw) r1).f33595a.equals("auxiliary.tracks.interleaved") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        if (((com.google.android.gms.internal.ads.C3668nw) r12).f33595a.equals("auxiliary.tracks.map") != false) goto L40;
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
        int i4;
        long j10;
        int i6;
        O3 o34;
        O3 o35;
        DP dp;
        Z2 z22;
        int i9;
        int i10;
        int i11;
        T2 t22;
        ArrayList arrayList5;
        int i12;
        int i13;
        int i14;
        InterfaceC3945t3 interfaceC3945t3;
        InterfaceC3945t3 interfaceC3945t32;
        int i15;
        loop0: while (true) {
            int i16 = 0;
            int i17 = 1;
            while (true) {
                ArrayDeque arrayDeque = this.f28659g;
                if (arrayDeque.isEmpty() || ((Iw) arrayDeque.peek()).f26372c != j6) {
                    break loop0;
                }
                Iw iw = (Iw) arrayDeque.pop();
                if (iw.f31925b == 1836019574) {
                    Iw j11 = iw.j(1835365473);
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = this.f28661j;
                    if (j11 != null) {
                        o32 = J2.e(j11);
                        if (this.f28676y) {
                            o32.getClass();
                            InterfaceC3945t3[] interfaceC3945t3Arr = o32.f27368a;
                            int length = interfaceC3945t3Arr.length;
                            int i18 = i16;
                            while (true) {
                                if (i18 >= length) {
                                    j9 = 0;
                                    interfaceC3945t3 = null;
                                    break;
                                }
                                InterfaceC3945t3 interfaceC3945t33 = interfaceC3945t3Arr[i18];
                                j9 = 0;
                                if (C3668nw.class.isAssignableFrom(interfaceC3945t33.getClass())) {
                                    interfaceC3945t3 = (InterfaceC3945t3) C3668nw.class.cast(interfaceC3945t33);
                                }
                                interfaceC3945t3 = null;
                                if (interfaceC3945t3 != null) {
                                    break;
                                } else {
                                    i18 += i17;
                                }
                            }
                            C3668nw c3668nw = (C3668nw) interfaceC3945t3;
                            if (c3668nw != null && c3668nw.f33596b[i16] == 0) {
                                this.f28648B = j9 + 16;
                            }
                            int length2 = interfaceC3945t3Arr.length;
                            int i19 = i16;
                            while (true) {
                                if (i19 >= length2) {
                                    interfaceC3945t32 = null;
                                    break;
                                }
                                InterfaceC3945t3 interfaceC3945t34 = interfaceC3945t3Arr[i19];
                                if (C3668nw.class.isAssignableFrom(interfaceC3945t34.getClass())) {
                                    interfaceC3945t32 = (InterfaceC3945t3) C3668nw.class.cast(interfaceC3945t34);
                                }
                                interfaceC3945t32 = null;
                                if (interfaceC3945t32 != null) {
                                    break;
                                } else {
                                    i19 += i17;
                                }
                            }
                            C3668nw c3668nw2 = (C3668nw) interfaceC3945t32;
                            c3668nw2.getClass();
                            ArrayList b9 = c3668nw2.b();
                            arrayList6 = new ArrayList(b9.size());
                            for (int i20 = i16; i20 < b9.size(); i20 += i17) {
                                int intValue = ((Integer) b9.get(i20)).intValue();
                                if (intValue == 0) {
                                    i15 = i17;
                                } else if (intValue != i17) {
                                    i15 = 3;
                                    if (intValue != 2) {
                                        i15 = intValue != 3 ? i16 : 4;
                                    }
                                } else {
                                    i15 = 2;
                                }
                                arrayList6.add(Integer.valueOf(i15));
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
                    int i21 = this.f28652F;
                    Z0 z02 = new Z0();
                    Zw i22 = iw.i(1969517665);
                    if (i22 != null) {
                        o33 = J2.c(i22);
                        z02.a(o33);
                    } else {
                        o33 = null;
                    }
                    Zw i23 = iw.i(1836476516);
                    i23.getClass();
                    int i24 = i17 != i21 ? i16 : i17;
                    InterfaceC3945t3[] interfaceC3945t3Arr2 = new InterfaceC3945t3[i17];
                    interfaceC3945t3Arr2[i16] = J2.d(i23.f29750c);
                    O3 o36 = new O3(interfaceC3945t3Arr2);
                    ArrayList arrayList9 = arrayList7;
                    O3 o37 = o33;
                    int i25 = i16;
                    O3 o38 = o36;
                    ArrayList b10 = J2.b(iw, z02, com.anythink.basead.exoplayer.b.f7168b, null, false, i24, L2.f26821b);
                    if (this.f28676y) {
                        boolean z6 = arrayList.size() == b10.size() ? i17 : i25;
                        Locale locale = Locale.US;
                        AbstractC2792Sd.I("The number of auxiliary track types from metadata (" + arrayList.size() + ") is not same as the number of auxiliary tracks (" + b10.size() + ")", z6);
                    }
                    ArrayList arrayList10 = new ArrayList();
                    Iterator it = b10.iterator();
                    while (it.hasNext()) {
                        int i26 = ((C3031c3) it.next()).f30199a.f29612l;
                        if (i26 != -1) {
                            Integer valueOf = Integer.valueOf(i26);
                            if (!arrayList10.contains(valueOf)) {
                                arrayList10.add(valueOf);
                            }
                        }
                    }
                    arrayList9.clear();
                    Iterator it2 = b10.iterator();
                    while (it2.hasNext()) {
                        C3031c3 c3031c3 = (C3031c3) it2.next();
                        if (arrayList10.contains(Integer.valueOf(c3031c3.f30199a.f29602a))) {
                            arrayList9.add(c3031c3);
                        }
                    }
                    String g9 = AbstractC2792Sd.g(b10);
                    int i27 = i17;
                    int i28 = -1;
                    int i29 = i25;
                    int i30 = i29;
                    long j12 = com.anythink.basead.exoplayer.b.f7168b;
                    while (i30 < b10.size()) {
                        C3031c3 c3031c32 = (C3031c3) b10.get(i30);
                        int i31 = c3031c32.f30200b;
                        if (i31 == 0) {
                            arrayList2 = arrayList9;
                        } else {
                            arrayList2 = arrayList9;
                            Z2 z23 = c3031c32.f30199a;
                            if (z23.f29613m) {
                                arrayList3 = b10;
                                S0 s02 = this.f28649C;
                                int i32 = i29 + 1;
                                ArrayList arrayList11 = arrayList8;
                                int i33 = z23.f29603b;
                                InterfaceC3566m1 C8 = s02.C(i29, i33);
                                T2 t23 = new T2(z23, c3031c32, C8);
                                long j13 = z23.f29606e;
                                if (j13 == com.anythink.basead.exoplayer.b.f7168b) {
                                    j13 = c3031c32.i;
                                }
                                C8.getClass();
                                long max = Math.max(j12, j13);
                                DP dp2 = z23.f29608g;
                                String str = dp2.f25176o;
                                boolean equals = com.anythink.basead.exoplayer.k.o.f9208C.equals(str);
                                int i34 = c3031c32.f30203e;
                                int i35 = equals ? i34 * 16 : i34 + 30;
                                C3322hP c3322hP = new C3322hP(dp2);
                                c3322hP.f31559o = i35;
                                if (i33 == 2) {
                                    int i36 = this.f28654b & 8;
                                    int i37 = dp2.f25168f;
                                    if (i36 != 0) {
                                        i37 |= i28 == -1 ? i27 : 2;
                                    }
                                    if (this.f28676y) {
                                        i37 |= 32768;
                                        c3322hP.f31552g = ((Integer) arrayList.get(i30)).intValue();
                                    }
                                    c3322hP.f31551f = i37;
                                    i33 = 2;
                                }
                                if (H4.b(str)) {
                                    long[] jArr = c3031c32.f30204f;
                                    arrayList4 = arrayList;
                                    if (jArr.length > 0) {
                                        int[] iArr = c3031c32.f30206h;
                                        boolean z9 = c3031c32.f30207j;
                                        int min = Math.min(!z9 ? iArr.length : i31, 20);
                                        AbstractC2792Sd.H(j13 != com.anythink.basead.exoplayer.b.f7168b ? i27 : i25);
                                        i4 = i28;
                                        long min2 = Math.min(j13, 10000000L);
                                        int i38 = i25;
                                        int i39 = i38;
                                        int i40 = -1;
                                        while (i38 < min) {
                                            int i41 = z9 ? i38 : iArr[i38];
                                            long j14 = jArr[i41];
                                            if (j14 > min2) {
                                                break;
                                            }
                                            if (j14 >= j9) {
                                                i14 = min;
                                                int i42 = c3031c32.f30202d[i41];
                                                if (i42 > i39) {
                                                    i39 = i42;
                                                    i40 = i41;
                                                }
                                            } else {
                                                i14 = min;
                                            }
                                            i38++;
                                            min = i14;
                                        }
                                        if (i40 != -1) {
                                            j10 = jArr[i40];
                                            if (j10 != com.anythink.basead.exoplayer.b.f7168b) {
                                                Q1 q12 = new Q1(j10);
                                                i6 = i27;
                                                InterfaceC3945t3[] interfaceC3945t3Arr3 = new InterfaceC3945t3[i6];
                                                interfaceC3945t3Arr3[i25] = q12;
                                                o34 = new O3(interfaceC3945t3Arr3);
                                            } else {
                                                i6 = i27;
                                                o34 = null;
                                            }
                                            if (i33 == i6 && (i12 = z02.f29596a) != -1 && (i13 = z02.f29597b) != -1) {
                                                c3322hP.f31541K = i12;
                                                c3322hP.f31542L = i13;
                                            }
                                            ArrayList arrayList12 = this.i;
                                            O3 o39 = arrayList12.isEmpty() ? null : new O3(arrayList12);
                                            o35 = o38;
                                            SK.l(i33, o32, c3322hP, dp2.f25173l, o39, o37, o35, o34);
                                            c3322hP.d(g9);
                                            dp = new DP(c3322hP);
                                            if (!Objects.equals(str, com.anythink.basead.exoplayer.k.o.f9248t) || AbstractC2991bG.n(str)) {
                                                z22 = z23;
                                                i9 = 1;
                                            } else {
                                                i9 = i25;
                                                z22 = z23;
                                            }
                                            i10 = z22.f29612l;
                                            if (i10 != -1) {
                                                Iterator it3 = arrayList2.iterator();
                                                while (it3.hasNext()) {
                                                    if (((C3031c3) it3.next()).f30199a.f29602a == i10) {
                                                        i11 = 1;
                                                        break;
                                                    }
                                                }
                                            }
                                            i11 = i25;
                                            if (i9 == 0 || i11 != 0) {
                                                t22 = t23;
                                                t22.f28466f = dp;
                                            } else {
                                                C8.e(dp);
                                                t22 = t23;
                                            }
                                            int i43 = i4;
                                            i28 = (i33 == 2 || i43 != -1) ? i43 : arrayList11.size();
                                            arrayList5 = arrayList11;
                                            arrayList5.add(t22);
                                            i29 = i32;
                                            j12 = max;
                                            i30++;
                                            arrayList8 = arrayList5;
                                            o38 = o35;
                                            arrayList9 = arrayList2;
                                            b10 = arrayList3;
                                            arrayList = arrayList4;
                                            i27 = 1;
                                        }
                                        j10 = -9223372036854775807L;
                                        if (j10 != com.anythink.basead.exoplayer.b.f7168b) {
                                        }
                                        if (i33 == i6) {
                                            c3322hP.f31541K = i12;
                                            c3322hP.f31542L = i13;
                                        }
                                        ArrayList arrayList122 = this.i;
                                        if (arrayList122.isEmpty()) {
                                        }
                                        o35 = o38;
                                        SK.l(i33, o32, c3322hP, dp2.f25173l, o39, o37, o35, o34);
                                        c3322hP.d(g9);
                                        dp = new DP(c3322hP);
                                        if (Objects.equals(str, com.anythink.basead.exoplayer.k.o.f9248t)) {
                                        }
                                        z22 = z23;
                                        i9 = 1;
                                        i10 = z22.f29612l;
                                        if (i10 != -1) {
                                        }
                                        i11 = i25;
                                        if (i9 == 0) {
                                        }
                                        t22 = t23;
                                        t22.f28466f = dp;
                                        int i432 = i4;
                                        if (i33 == 2) {
                                        }
                                        arrayList5 = arrayList11;
                                        arrayList5.add(t22);
                                        i29 = i32;
                                        j12 = max;
                                        i30++;
                                        arrayList8 = arrayList5;
                                        o38 = o35;
                                        arrayList9 = arrayList2;
                                        b10 = arrayList3;
                                        arrayList = arrayList4;
                                        i27 = 1;
                                    }
                                } else {
                                    arrayList4 = arrayList;
                                }
                                i4 = i28;
                                j10 = -9223372036854775807L;
                                if (j10 != com.anythink.basead.exoplayer.b.f7168b) {
                                }
                                if (i33 == i6) {
                                }
                                ArrayList arrayList1222 = this.i;
                                if (arrayList1222.isEmpty()) {
                                }
                                o35 = o38;
                                SK.l(i33, o32, c3322hP, dp2.f25173l, o39, o37, o35, o34);
                                c3322hP.d(g9);
                                dp = new DP(c3322hP);
                                if (Objects.equals(str, com.anythink.basead.exoplayer.k.o.f9248t)) {
                                }
                                z22 = z23;
                                i9 = 1;
                                i10 = z22.f29612l;
                                if (i10 != -1) {
                                }
                                i11 = i25;
                                if (i9 == 0) {
                                }
                                t22 = t23;
                                t22.f28466f = dp;
                                int i4322 = i4;
                                if (i33 == 2) {
                                }
                                arrayList5 = arrayList11;
                                arrayList5.add(t22);
                                i29 = i32;
                                j12 = max;
                                i30++;
                                arrayList8 = arrayList5;
                                o38 = o35;
                                arrayList9 = arrayList2;
                                b10 = arrayList3;
                                arrayList = arrayList4;
                                i27 = 1;
                            }
                        }
                        arrayList4 = arrayList;
                        arrayList5 = arrayList8;
                        arrayList3 = b10;
                        o35 = o38;
                        i30++;
                        arrayList8 = arrayList5;
                        o38 = o35;
                        arrayList9 = arrayList2;
                        b10 = arrayList3;
                        arrayList = arrayList4;
                        i27 = 1;
                    }
                    ArrayList arrayList13 = arrayList9;
                    int i44 = i28;
                    int i45 = -1;
                    T2[] t2Arr = (T2[]) arrayList8.toArray(new T2[i25]);
                    this.f28650D = t2Arr;
                    int length3 = t2Arr.length;
                    long[][] jArr2 = new long[length3][];
                    int[] iArr2 = new int[length3];
                    long[] jArr3 = new long[length3];
                    boolean[] zArr = new boolean[length3];
                    for (int i46 = 0; i46 < t2Arr.length; i46++) {
                        jArr2[i46] = new long[t2Arr[i46].f28462b.f30200b];
                        jArr3[i46] = t2Arr[i46].f28462b.f30204f[0];
                    }
                    long j15 = j9;
                    int i47 = 0;
                    while (i47 < t2Arr.length) {
                        long j16 = Long.MAX_VALUE;
                        int i48 = i45;
                        for (int i49 = 0; i49 < t2Arr.length; i49++) {
                            if (!zArr[i49]) {
                                long j17 = jArr3[i49];
                                if (j17 <= j16) {
                                    i48 = i49;
                                    j16 = j17;
                                }
                            }
                        }
                        int i50 = iArr2[i48];
                        long[] jArr4 = jArr2[i48];
                        jArr4[i50] = j15;
                        C3031c3 c3031c33 = t2Arr[i48].f28462b;
                        T2[] t2Arr2 = t2Arr;
                        boolean[] zArr2 = zArr;
                        j15 += c3031c33.f30202d[i50];
                        int i51 = i50 + 1;
                        iArr2[i48] = i51;
                        if (i51 < jArr4.length) {
                            jArr3[i48] = c3031c33.f30204f[i51];
                        } else {
                            zArr2[i48] = true;
                            i47++;
                        }
                        t2Arr = t2Arr2;
                        zArr = zArr2;
                        i45 = -1;
                    }
                    this.f28651E = jArr2;
                    this.f28649C.B();
                    this.f28649C.D(new S2(j12, this.f28650D, i44));
                    arrayDeque.clear();
                    if (!this.f28675x) {
                        i = 1;
                        this.f28664m = true != arrayList13.isEmpty() ? 4 : 2;
                    }
                } else {
                    i = i17;
                    if (!arrayDeque.isEmpty()) {
                        ((Iw) arrayDeque.peek()).f26374e.add(iw);
                    }
                }
                i17 = i;
                i16 = 0;
            }
        }
        int i52 = this.f28664m;
        if (i52 == 4 || i52 == 2) {
            return;
        }
        this.f28664m = 0;
        this.f28667p = 0;
    }

    public U2(InterfaceC3837r3 interfaceC3837r3, int i) {
        this.f28653a = interfaceC3837r3;
        this.f28654b = i;
        PB pb = RB.f27933u;
        this.f28663l = C3523lC.f32525x;
        this.f28664m = 0;
        this.f28660h = new X2();
        this.i = new ArrayList();
        this.f28658f = new Cr(16);
        this.f28659g = new ArrayDeque();
        this.f28655c = new Cr(SK.m0);
        this.f28656d = new Cr(6);
        this.f28657e = new Cr();
        this.f28669r = -1;
        this.f28649C = S0.f28105g0;
        this.f28650D = new T2[0];
        this.f28661j = new ArrayList();
        this.f28662k = new ArrayList();
    }
}
