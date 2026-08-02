package com.google.android.gms.internal.ads;

import O.C0349t;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.s1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3889s1 implements Q0 {

    /* renamed from: d, reason: collision with root package name */
    public final V2 f34566d;

    /* renamed from: e, reason: collision with root package name */
    public int f34567e;

    /* renamed from: g, reason: collision with root package name */
    public C3943t1 f34569g;

    /* renamed from: j, reason: collision with root package name */
    public long f34571j;

    /* renamed from: k, reason: collision with root package name */
    public C4051v1 f34572k;

    /* renamed from: o, reason: collision with root package name */
    public int f34576o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f34577p;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f34565c = true;

    /* renamed from: a, reason: collision with root package name */
    public final Cr f34563a = new Cr(12);

    /* renamed from: b, reason: collision with root package name */
    public final C0349t f34564b = new C0349t();

    /* renamed from: f, reason: collision with root package name */
    public S0 f34568f = new V2(15);
    public C4051v1[] i = new C4051v1[0];

    /* renamed from: m, reason: collision with root package name */
    public long f34574m = -1;

    /* renamed from: n, reason: collision with root package name */
    public long f34575n = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f34573l = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f34570h = com.anythink.basead.exoplayer.b.f7168b;

    public C3889s1(V2 v22) {
        this.f34566d = v22;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03be  */
    @Override // com.google.android.gms.internal.ads.Q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(R0 r02, U0 u02) {
        boolean z6;
        C4051v1 c4051v1;
        int i;
        long j6;
        int i4;
        C4051v1 c4051v12;
        long j9 = this.f34571j;
        if (j9 != -1) {
            long j10 = ((K0) r02).f26571w;
            if (j9 < j10 || j9 > 262144 + j10) {
                u02.f28641n = j9;
                z6 = true;
                this.f34571j = -1L;
                if (!z6) {
                    return 1;
                }
                int i6 = this.f34567e;
                C4051v1 c4051v13 = null;
                if (i6 == 0) {
                    if (!d(r02)) {
                        throw U4.a(null, "AVI Header List not found");
                    }
                    ((K0) r02).a(12, false);
                    this.f34567e = 1;
                    return 0;
                }
                C0349t c0349t = this.f34564b;
                Cr cr = this.f34563a;
                if (i6 == 1) {
                    ((K0) r02).A(cr.f24997a, 0, 12, false);
                    cr.E(0);
                    c0349t.getClass();
                    c0349t.f2221a = cr.c();
                    c0349t.f2222b = cr.c();
                    int i9 = c0349t.f2221a;
                    if (i9 != 1414744396) {
                        StringBuilder sb = new StringBuilder(Wv.b(i9, 22));
                        sb.append("LIST expected, found: ");
                        sb.append(i9);
                        throw U4.a(null, sb.toString());
                    }
                    int c9 = cr.c();
                    if (c9 == 1819436136) {
                        this.f34573l = c0349t.f2222b;
                        this.f34567e = 2;
                        return 0;
                    }
                    StringBuilder sb2 = new StringBuilder(Wv.b(c9, 22));
                    sb2.append("hdrl expected, found: ");
                    sb2.append(c9);
                    throw U4.a(null, sb2.toString());
                }
                if (i6 == 2) {
                    int i10 = 2;
                    int i11 = this.f34573l - 4;
                    Cr cr2 = new Cr(i11);
                    ((K0) r02).A(cr2.f24997a, 0, i11, false);
                    C4105w1 a9 = C4105w1.a(1819436136, cr2);
                    int i12 = a9.f35554b;
                    if (i12 != 1819436136) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(i12).length() + 28);
                        sb3.append("Unexpected header list type ");
                        sb3.append(i12);
                        throw U4.a(null, sb3.toString());
                    }
                    C3943t1 c3943t1 = (C3943t1) a9.b(C3943t1.class);
                    if (c3943t1 == null) {
                        throw U4.a(null, "AviHeader not found");
                    }
                    this.f34569g = c3943t1;
                    this.f34570h = c3943t1.f34973c * c3943t1.f34971a;
                    ArrayList arrayList = new ArrayList();
                    C3523lC c3523lC = a9.f35553a;
                    int i13 = c3523lC.f32527w;
                    int i14 = 0;
                    int i15 = 0;
                    while (i14 < i13) {
                        InterfaceC3782q1 interfaceC3782q1 = (InterfaceC3782q1) c3523lC.get(i14);
                        if (interfaceC3782q1.c() == 1819440243) {
                            C4105w1 c4105w1 = (C4105w1) interfaceC3782q1;
                            int i16 = i15 + 1;
                            C3997u1 c3997u1 = (C3997u1) c4105w1.b(C3997u1.class);
                            C4159x1 c4159x1 = (C4159x1) c4105w1.b(C4159x1.class);
                            if (c3997u1 == null) {
                                AbstractC2991bG.y("AviExtractor", "Missing Stream Header");
                            } else if (c4159x1 == null) {
                                AbstractC2991bG.y("AviExtractor", "Missing Stream Format");
                            } else {
                                long w3 = AbstractC3182eu.w(c3997u1.f35226d, c3997u1.f35224b * 1000000, c3997u1.f35225c, RoundingMode.DOWN);
                                DP dp = c4159x1.f35700a;
                                C3322hP c3322hP = new C3322hP(dp);
                                c3322hP.c(i15);
                                int i17 = c3997u1.f35227e;
                                if (i17 != 0) {
                                    c3322hP.f31559o = i17;
                                }
                                C4213y1 c4213y1 = (C4213y1) c4105w1.b(C4213y1.class);
                                if (c4213y1 != null) {
                                    c3322hP.f31547b = c4213y1.f35866a;
                                }
                                int f2 = H4.f(dp.f25176o);
                                if (f2 != 1) {
                                    if (f2 == i10) {
                                        f2 = 2;
                                    }
                                }
                                InterfaceC3566m1 C8 = this.f34568f.C(i15, f2);
                                C8.e(new DP(c3322hP));
                                this.f34570h = Math.max(this.f34570h, w3);
                                c4051v1 = new C4051v1(i15, c3997u1, C8);
                                if (c4051v1 != null) {
                                    arrayList.add(c4051v1);
                                }
                                i15 = i16;
                            }
                            c4051v1 = null;
                            if (c4051v1 != null) {
                            }
                            i15 = i16;
                        }
                        i14++;
                        i10 = 2;
                    }
                    this.i = (C4051v1[]) arrayList.toArray(new C4051v1[0]);
                    this.f34568f.B();
                    this.f34567e = 3;
                    return 0;
                }
                int i18 = 4;
                if (i6 == 3) {
                    long j11 = this.f34574m;
                    if (j11 != -1 && ((K0) r02).f26571w != j11) {
                        this.f34571j = j11;
                        return 0;
                    }
                    ((K0) r02).E(cr.f24997a, 0, 12, false);
                    K0 k02 = (K0) r02;
                    k02.f26573y = 0;
                    cr.E(0);
                    c0349t.getClass();
                    c0349t.f2221a = cr.c();
                    c0349t.f2222b = cr.c();
                    int c10 = cr.c();
                    int i19 = c0349t.f2221a;
                    if (i19 == 1179011410) {
                        k02.a(12, false);
                        return 0;
                    }
                    if (i19 != 1414744396 || c10 != 1769369453) {
                        this.f34571j = k02.f26571w + c0349t.f2222b + 8;
                        return 0;
                    }
                    long j12 = k02.f26571w;
                    this.f34574m = j12;
                    long j13 = j12 + c0349t.f2222b + 8;
                    this.f34575n = j13;
                    if (!this.f34577p) {
                        C3943t1 c3943t12 = this.f34569g;
                        c3943t12.getClass();
                        if ((c3943t12.f34972b & 16) == 16) {
                            this.f34567e = 4;
                            this.f34571j = j13;
                            return 0;
                        }
                        this.f34568f.D(new V0(this.f34570h, 0L));
                        this.f34577p = true;
                    }
                    this.f34571j = k02.f26571w + 12;
                    this.f34567e = 6;
                    return 0;
                }
                if (i6 == 4) {
                    ((K0) r02).A(cr.f24997a, 0, 8, false);
                    cr.E(0);
                    int c11 = cr.c();
                    int c12 = cr.c();
                    if (c11 != 829973609) {
                        this.f34571j = ((K0) r02).f26571w + c12;
                        return 0;
                    }
                    this.f34567e = 5;
                    this.f34576o = c12;
                    return 0;
                }
                if (i6 != 5) {
                    if (((K0) r02).f26571w >= this.f34575n) {
                        return -1;
                    }
                    C4051v1 c4051v14 = this.f34572k;
                    if (c4051v14 != null) {
                        int i20 = c4051v14.f35395h;
                        InterfaceC3566m1 interfaceC3566m1 = c4051v14.f35389b;
                        int d9 = i20 - interfaceC3566m1.d(r02, i20, false);
                        c4051v14.f35395h = d9;
                        boolean z9 = d9 == 0;
                        if (z9) {
                            if (c4051v14.f35394g > 0) {
                                int i21 = c4051v14.i;
                                interfaceC3566m1.c((c4051v14.f35392e * i21) / c4051v14.f35393f, Arrays.binarySearch(c4051v14.f35400n, i21) >= 0 ? 1 : 0, c4051v14.f35394g, 0, null);
                            }
                            c4051v14.i++;
                        }
                        if (!z9) {
                            return 0;
                        }
                        this.f34572k = null;
                        return 0;
                    }
                    K0 k03 = (K0) r02;
                    if ((k03.f26571w & 1) == 1) {
                        k03.a(1, false);
                    }
                    k03.E(cr.f24997a, 0, 12, false);
                    cr.E(0);
                    int c13 = cr.c();
                    if (c13 == 1414744396) {
                        cr.E(8);
                        k03.a(cr.c() != 1769369453 ? 8 : 12, false);
                        k03.f26573y = 0;
                        return 0;
                    }
                    int c14 = cr.c();
                    if (c13 == 1263424842) {
                        this.f34571j = k03.f26571w + c14 + 8;
                        return 0;
                    }
                    k03.a(8, false);
                    k03.f26573y = 0;
                    for (C4051v1 c4051v15 : this.i) {
                        if (c4051v15.f35390c == c13 || c4051v15.f35391d == c13) {
                            c4051v13 = c4051v15;
                            break;
                        }
                    }
                    if (c4051v13 == null) {
                        this.f34571j = k03.f26571w + c14;
                        return 0;
                    }
                    c4051v13.f35394g = c14;
                    c4051v13.f35395h = c14;
                    this.f34572k = c4051v13;
                    return 0;
                }
                Cr cr3 = new Cr(this.f34576o);
                ((K0) r02).A(cr3.f24997a, 0, this.f34576o, false);
                if (cr3.B() < 16) {
                    i = 0;
                    j6 = 0;
                } else {
                    int i22 = cr3.f24998b;
                    cr3.G(8);
                    long c15 = cr3.c();
                    i = 0;
                    long j14 = this.f34574m;
                    j6 = c15 > j14 ? 0L : j14 + 8;
                    cr3.E(i22);
                }
                while (cr3.B() >= 16) {
                    int c16 = cr3.c();
                    int c17 = cr3.c();
                    long c18 = cr3.c() + j6;
                    cr3.G(i18);
                    C4051v1[] c4051v1Arr = this.i;
                    int length = c4051v1Arr.length;
                    int i23 = i;
                    while (true) {
                        if (i23 >= length) {
                            c4051v12 = null;
                            break;
                        }
                        c4051v12 = c4051v1Arr[i23];
                        if (c4051v12.f35390c == c16 || c4051v12.f35391d == c16) {
                            break;
                        }
                        i23++;
                    }
                    if (c4051v12 != null) {
                        int i24 = (c17 & 16) == 16 ? 1 : i;
                        if (c4051v12.f35398l == -1) {
                            c4051v12.f35398l = c18;
                        }
                        if (i24 != 0) {
                            if (c4051v12.f35397k == c4051v12.f35400n.length) {
                                long[] jArr = c4051v12.f35399m;
                                c4051v12.f35399m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                int[] iArr = c4051v12.f35400n;
                                c4051v12.f35400n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                            }
                            long[] jArr2 = c4051v12.f35399m;
                            int i25 = c4051v12.f35397k;
                            jArr2[i25] = c18;
                            c4051v12.f35400n[i25] = c4051v12.f35396j;
                            c4051v12.f35397k = i25 + 1;
                        }
                        c4051v12.f35396j++;
                    }
                    i18 = 4;
                }
                C4051v1[] c4051v1Arr2 = this.i;
                int length2 = c4051v1Arr2.length;
                for (int i26 = i; i26 < length2; i26++) {
                    C4051v1 c4051v16 = c4051v1Arr2[i26];
                    c4051v16.f35399m = Arrays.copyOf(c4051v16.f35399m, c4051v16.f35397k);
                    c4051v16.f35400n = Arrays.copyOf(c4051v16.f35400n, c4051v16.f35397k);
                    if ((c4051v16.f35390c & 1651965952) == 1651965952 && c4051v16.f35388a.f35228f != 0 && (i4 = c4051v16.f35397k) > 0) {
                        c4051v16.f35393f = i4;
                    }
                }
                this.f34577p = true;
                if (this.i.length == 0) {
                    this.f34568f.D(new V0(this.f34570h, 0L));
                } else {
                    this.f34568f.D(new V0(this, this.f34570h));
                }
                this.f34567e = 6;
                this.f34571j = this.f34574m;
                return i;
            }
            ((K0) r02).a((int) (j9 - j10), false);
        }
        z6 = false;
        this.f34571j = -1L;
        if (!z6) {
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        this.f34567e = 0;
        if (this.f34565c) {
            s02 = new com.bumptech.glide.manager.n(s02, (InterfaceC3837r3) this.f34566d);
        }
        this.f34568f = s02;
        this.f34571j = -1L;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        this.f34571j = -1L;
        this.f34572k = null;
        for (C4051v1 c4051v1 : this.i) {
            if (c4051v1.f35397k == 0) {
                c4051v1.i = 0;
            } else {
                c4051v1.i = c4051v1.f35400n[AbstractC3182eu.s(c4051v1.f35399m, j6, true)];
            }
        }
        if (j6 == 0) {
            this.f34567e = this.i.length != 0 ? 3 : 0;
        } else {
            this.f34567e = 6;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        Cr cr = this.f34563a;
        ((K0) r02).E(cr.f24997a, 0, 12, false);
        cr.E(0);
        if (cr.c() == 1179011410) {
            cr.G(4);
            if (cr.c() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void e() {
    }
}
