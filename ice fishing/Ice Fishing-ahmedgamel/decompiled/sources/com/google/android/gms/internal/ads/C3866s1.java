package com.google.android.gms.internal.ads;

import O.C0344t;
import com.icefishingapp.icefishing.AbstractC4404f;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.s1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3866s1 implements Q0 {

    /* renamed from: d, reason: collision with root package name */
    public final V2 f33798d;

    /* renamed from: e, reason: collision with root package name */
    public int f33799e;

    /* renamed from: g, reason: collision with root package name */
    public C3920t1 f33801g;

    /* renamed from: j, reason: collision with root package name */
    public long f33803j;

    /* renamed from: k, reason: collision with root package name */
    public C4028v1 f33804k;

    /* renamed from: o, reason: collision with root package name */
    public int f33808o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f33809p;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f33797c = true;

    /* renamed from: a, reason: collision with root package name */
    public final Cr f33795a = new Cr(12);

    /* renamed from: b, reason: collision with root package name */
    public final C0344t f33796b = new C0344t();

    /* renamed from: f, reason: collision with root package name */
    public S0 f33800f = new V2(15);
    public C4028v1[] i = new C4028v1[0];

    /* renamed from: m, reason: collision with root package name */
    public long f33806m = -1;

    /* renamed from: n, reason: collision with root package name */
    public long f33807n = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f33805l = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f33802h = com.anythink.basead.exoplayer.b.f6382b;

    public C3866s1(V2 v22) {
        this.f33798d = v22;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03be  */
    @Override // com.google.android.gms.internal.ads.Q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(R0 r02, U0 u02) {
        boolean z3;
        C4028v1 c4028v1;
        int i;
        long j6;
        int i6;
        C4028v1 c4028v12;
        long j9 = this.f33803j;
        if (j9 != -1) {
            long j10 = ((K0) r02).f25819w;
            if (j9 < j10 || j9 > 262144 + j10) {
                u02.f27844n = j9;
                z3 = true;
                this.f33803j = -1L;
                if (!z3) {
                    return 1;
                }
                int i9 = this.f33799e;
                C4028v1 c4028v13 = null;
                if (i9 == 0) {
                    if (!d(r02)) {
                        throw U4.a(null, "AVI Header List not found");
                    }
                    ((K0) r02).a(12, false);
                    this.f33799e = 1;
                    return 0;
                }
                C0344t c0344t = this.f33796b;
                Cr cr = this.f33795a;
                if (i9 == 1) {
                    ((K0) r02).z(cr.f24252a, 0, 12, false);
                    cr.E(0);
                    c0344t.getClass();
                    c0344t.f2133a = cr.c();
                    c0344t.f2134b = cr.c();
                    int i10 = c0344t.f2133a;
                    if (i10 != 1414744396) {
                        StringBuilder sb = new StringBuilder(AbstractC4404f.b(i10, 22));
                        sb.append("LIST expected, found: ");
                        sb.append(i10);
                        throw U4.a(null, sb.toString());
                    }
                    int c9 = cr.c();
                    if (c9 == 1819436136) {
                        this.f33805l = c0344t.f2134b;
                        this.f33799e = 2;
                        return 0;
                    }
                    StringBuilder sb2 = new StringBuilder(AbstractC4404f.b(c9, 22));
                    sb2.append("hdrl expected, found: ");
                    sb2.append(c9);
                    throw U4.a(null, sb2.toString());
                }
                if (i9 == 2) {
                    int i11 = 2;
                    int i12 = this.f33805l - 4;
                    Cr cr2 = new Cr(i12);
                    ((K0) r02).z(cr2.f24252a, 0, i12, false);
                    C4082w1 a9 = C4082w1.a(1819436136, cr2);
                    int i13 = a9.f34785b;
                    if (i13 != 1819436136) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(i13).length() + 28);
                        sb3.append("Unexpected header list type ");
                        sb3.append(i13);
                        throw U4.a(null, sb3.toString());
                    }
                    C3920t1 c3920t1 = (C3920t1) a9.b(C3920t1.class);
                    if (c3920t1 == null) {
                        throw U4.a(null, "AviHeader not found");
                    }
                    this.f33801g = c3920t1;
                    this.f33802h = c3920t1.f34187c * c3920t1.f34185a;
                    ArrayList arrayList = new ArrayList();
                    C3500lC c3500lC = a9.f34784a;
                    int i14 = c3500lC.f31747w;
                    int i15 = 0;
                    int i16 = 0;
                    while (i15 < i14) {
                        InterfaceC3759q1 interfaceC3759q1 = (InterfaceC3759q1) c3500lC.get(i15);
                        if (interfaceC3759q1.c() == 1819440243) {
                            C4082w1 c4082w1 = (C4082w1) interfaceC3759q1;
                            int i17 = i16 + 1;
                            C3974u1 c3974u1 = (C3974u1) c4082w1.b(C3974u1.class);
                            C4136x1 c4136x1 = (C4136x1) c4082w1.b(C4136x1.class);
                            if (c3974u1 == null) {
                                AbstractC2968bG.y("AviExtractor", "Missing Stream Header");
                            } else if (c4136x1 == null) {
                                AbstractC2968bG.y("AviExtractor", "Missing Stream Format");
                            } else {
                                long w6 = AbstractC3159eu.w(c3974u1.f34452d, c3974u1.f34450b * 1000000, c3974u1.f34451c, RoundingMode.DOWN);
                                DP dp = c4136x1.f34919a;
                                C3299hP c3299hP = new C3299hP(dp);
                                c3299hP.c(i16);
                                int i18 = c3974u1.f34453e;
                                if (i18 != 0) {
                                    c3299hP.f30793o = i18;
                                }
                                C4190y1 c4190y1 = (C4190y1) c4082w1.b(C4190y1.class);
                                if (c4190y1 != null) {
                                    c3299hP.f30781b = c4190y1.f35080a;
                                }
                                int f3 = H4.f(dp.f24431o);
                                if (f3 != 1) {
                                    if (f3 == i11) {
                                        f3 = 2;
                                    }
                                }
                                InterfaceC3543m1 C8 = this.f33800f.C(i16, f3);
                                C8.e(new DP(c3299hP));
                                this.f33802h = Math.max(this.f33802h, w6);
                                c4028v1 = new C4028v1(i16, c3974u1, C8);
                                if (c4028v1 != null) {
                                    arrayList.add(c4028v1);
                                }
                                i16 = i17;
                            }
                            c4028v1 = null;
                            if (c4028v1 != null) {
                            }
                            i16 = i17;
                        }
                        i15++;
                        i11 = 2;
                    }
                    this.i = (C4028v1[]) arrayList.toArray(new C4028v1[0]);
                    this.f33800f.B();
                    this.f33799e = 3;
                    return 0;
                }
                int i19 = 4;
                if (i9 == 3) {
                    long j11 = this.f33806m;
                    if (j11 != -1 && ((K0) r02).f25819w != j11) {
                        this.f33803j = j11;
                        return 0;
                    }
                    ((K0) r02).A(cr.f24252a, 0, 12, false);
                    K0 k02 = (K0) r02;
                    k02.f25821y = 0;
                    cr.E(0);
                    c0344t.getClass();
                    c0344t.f2133a = cr.c();
                    c0344t.f2134b = cr.c();
                    int c10 = cr.c();
                    int i20 = c0344t.f2133a;
                    if (i20 == 1179011410) {
                        k02.a(12, false);
                        return 0;
                    }
                    if (i20 != 1414744396 || c10 != 1769369453) {
                        this.f33803j = k02.f25819w + c0344t.f2134b + 8;
                        return 0;
                    }
                    long j12 = k02.f25819w;
                    this.f33806m = j12;
                    long j13 = j12 + c0344t.f2134b + 8;
                    this.f33807n = j13;
                    if (!this.f33809p) {
                        C3920t1 c3920t12 = this.f33801g;
                        c3920t12.getClass();
                        if ((c3920t12.f34186b & 16) == 16) {
                            this.f33799e = 4;
                            this.f33803j = j13;
                            return 0;
                        }
                        this.f33800f.D(new V0(this.f33802h, 0L));
                        this.f33809p = true;
                    }
                    this.f33803j = k02.f25819w + 12;
                    this.f33799e = 6;
                    return 0;
                }
                if (i9 == 4) {
                    ((K0) r02).z(cr.f24252a, 0, 8, false);
                    cr.E(0);
                    int c11 = cr.c();
                    int c12 = cr.c();
                    if (c11 != 829973609) {
                        this.f33803j = ((K0) r02).f25819w + c12;
                        return 0;
                    }
                    this.f33799e = 5;
                    this.f33808o = c12;
                    return 0;
                }
                if (i9 != 5) {
                    if (((K0) r02).f25819w >= this.f33807n) {
                        return -1;
                    }
                    C4028v1 c4028v14 = this.f33804k;
                    if (c4028v14 != null) {
                        int i21 = c4028v14.f34632h;
                        InterfaceC3543m1 interfaceC3543m1 = c4028v14.f34626b;
                        int d2 = i21 - interfaceC3543m1.d(r02, i21, false);
                        c4028v14.f34632h = d2;
                        boolean z6 = d2 == 0;
                        if (z6) {
                            if (c4028v14.f34631g > 0) {
                                int i22 = c4028v14.i;
                                interfaceC3543m1.c((c4028v14.f34629e * i22) / c4028v14.f34630f, Arrays.binarySearch(c4028v14.f34637n, i22) >= 0 ? 1 : 0, c4028v14.f34631g, 0, null);
                            }
                            c4028v14.i++;
                        }
                        if (!z6) {
                            return 0;
                        }
                        this.f33804k = null;
                        return 0;
                    }
                    K0 k03 = (K0) r02;
                    if ((k03.f25819w & 1) == 1) {
                        k03.a(1, false);
                    }
                    k03.A(cr.f24252a, 0, 12, false);
                    cr.E(0);
                    int c13 = cr.c();
                    if (c13 == 1414744396) {
                        cr.E(8);
                        k03.a(cr.c() != 1769369453 ? 8 : 12, false);
                        k03.f25821y = 0;
                        return 0;
                    }
                    int c14 = cr.c();
                    if (c13 == 1263424842) {
                        this.f33803j = k03.f25819w + c14 + 8;
                        return 0;
                    }
                    k03.a(8, false);
                    k03.f25821y = 0;
                    for (C4028v1 c4028v15 : this.i) {
                        if (c4028v15.f34627c == c13 || c4028v15.f34628d == c13) {
                            c4028v13 = c4028v15;
                            break;
                        }
                    }
                    if (c4028v13 == null) {
                        this.f33803j = k03.f25819w + c14;
                        return 0;
                    }
                    c4028v13.f34631g = c14;
                    c4028v13.f34632h = c14;
                    this.f33804k = c4028v13;
                    return 0;
                }
                Cr cr3 = new Cr(this.f33808o);
                ((K0) r02).z(cr3.f24252a, 0, this.f33808o, false);
                if (cr3.B() < 16) {
                    i = 0;
                    j6 = 0;
                } else {
                    int i23 = cr3.f24253b;
                    cr3.G(8);
                    long c15 = cr3.c();
                    i = 0;
                    long j14 = this.f33806m;
                    j6 = c15 > j14 ? 0L : j14 + 8;
                    cr3.E(i23);
                }
                while (cr3.B() >= 16) {
                    int c16 = cr3.c();
                    int c17 = cr3.c();
                    long c18 = cr3.c() + j6;
                    cr3.G(i19);
                    C4028v1[] c4028v1Arr = this.i;
                    int length = c4028v1Arr.length;
                    int i24 = i;
                    while (true) {
                        if (i24 >= length) {
                            c4028v12 = null;
                            break;
                        }
                        c4028v12 = c4028v1Arr[i24];
                        if (c4028v12.f34627c == c16 || c4028v12.f34628d == c16) {
                            break;
                        }
                        i24++;
                    }
                    if (c4028v12 != null) {
                        int i25 = (c17 & 16) == 16 ? 1 : i;
                        if (c4028v12.f34635l == -1) {
                            c4028v12.f34635l = c18;
                        }
                        if (i25 != 0) {
                            if (c4028v12.f34634k == c4028v12.f34637n.length) {
                                long[] jArr = c4028v12.f34636m;
                                c4028v12.f34636m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                int[] iArr = c4028v12.f34637n;
                                c4028v12.f34637n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                            }
                            long[] jArr2 = c4028v12.f34636m;
                            int i26 = c4028v12.f34634k;
                            jArr2[i26] = c18;
                            c4028v12.f34637n[i26] = c4028v12.f34633j;
                            c4028v12.f34634k = i26 + 1;
                        }
                        c4028v12.f34633j++;
                    }
                    i19 = 4;
                }
                C4028v1[] c4028v1Arr2 = this.i;
                int length2 = c4028v1Arr2.length;
                for (int i27 = i; i27 < length2; i27++) {
                    C4028v1 c4028v16 = c4028v1Arr2[i27];
                    c4028v16.f34636m = Arrays.copyOf(c4028v16.f34636m, c4028v16.f34634k);
                    c4028v16.f34637n = Arrays.copyOf(c4028v16.f34637n, c4028v16.f34634k);
                    if ((c4028v16.f34627c & 1651965952) == 1651965952 && c4028v16.f34625a.f34454f != 0 && (i6 = c4028v16.f34634k) > 0) {
                        c4028v16.f34630f = i6;
                    }
                }
                this.f33809p = true;
                if (this.i.length == 0) {
                    this.f33800f.D(new V0(this.f33802h, 0L));
                } else {
                    this.f33800f.D(new V0(this, this.f33802h));
                }
                this.f33799e = 6;
                this.f33803j = this.f33806m;
                return i;
            }
            ((K0) r02).a((int) (j9 - j10), false);
        }
        z3 = false;
        this.f33803j = -1L;
        if (!z3) {
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        this.f33799e = 0;
        if (this.f33797c) {
            s02 = new com.bumptech.glide.manager.o(s02, (InterfaceC3814r3) this.f33798d);
        }
        this.f33800f = s02;
        this.f33803j = -1L;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        this.f33803j = -1L;
        this.f33804k = null;
        for (C4028v1 c4028v1 : this.i) {
            if (c4028v1.f34634k == 0) {
                c4028v1.i = 0;
            } else {
                c4028v1.i = c4028v1.f34637n[AbstractC3159eu.s(c4028v1.f34636m, j6, true)];
            }
        }
        if (j6 == 0) {
            this.f33799e = this.i.length != 0 ? 3 : 0;
        } else {
            this.f33799e = 6;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        Cr cr = this.f33795a;
        ((K0) r02).A(cr.f24252a, 0, 12, false);
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
