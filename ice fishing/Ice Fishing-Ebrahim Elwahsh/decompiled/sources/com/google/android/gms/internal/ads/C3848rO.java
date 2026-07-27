package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.rO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3848rO {

    /* renamed from: c, reason: collision with root package name */
    public final OO f34024c;

    /* renamed from: d, reason: collision with root package name */
    public final C3709ot f34025d;

    /* renamed from: e, reason: collision with root package name */
    public long f34026e;

    /* renamed from: f, reason: collision with root package name */
    public int f34027f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f34028g;

    /* renamed from: h, reason: collision with root package name */
    public C3741pO f34029h;
    public C3741pO i;

    /* renamed from: j, reason: collision with root package name */
    public C3741pO f34030j;

    /* renamed from: k, reason: collision with root package name */
    public C3741pO f34031k;

    /* renamed from: l, reason: collision with root package name */
    public C3741pO f34032l;

    /* renamed from: m, reason: collision with root package name */
    public int f34033m;

    /* renamed from: n, reason: collision with root package name */
    public Object f34034n;

    /* renamed from: o, reason: collision with root package name */
    public long f34035o;

    /* renamed from: q, reason: collision with root package name */
    public final C4086vt f34037q;

    /* renamed from: a, reason: collision with root package name */
    public final L7 f34022a = new L7();

    /* renamed from: b, reason: collision with root package name */
    public final Y7 f34023b = new Y7();

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f34036p = new ArrayList();

    public C3848rO(OO oo, C3709ot c3709ot, C4086vt c4086vt, TN tn) {
        this.f34024c = oo;
        this.f34025d = c3709ot;
        this.f34037q = c4086vt;
    }

    public static BQ a(AbstractC3832r8 abstractC3832r8, Object obj, long j9, Y7 y72, L7 l72) {
        abstractC3832r8.o(obj, l72);
        abstractC3832r8.b(l72.f26108c, y72, 0L);
        abstractC3832r8.e(obj);
        l72.f26111f.getClass();
        abstractC3832r8.o(obj, l72);
        l72.f26111f.a(-1);
        return new BQ(obj, j9, -1);
    }

    public final C3741pO A(AQ aq) {
        for (int i = 0; i < this.f34036p.size(); i++) {
            C3741pO c3741pO = (C3741pO) this.f34036p.get(i);
            if (c3741pO.f33385a == aq) {
                return c3741pO;
            }
        }
        return null;
    }

    public final void B() {
        if (this.f34033m == 0) {
            return;
        }
        C3741pO c3741pO = this.f34029h;
        c3741pO.getClass();
        this.f34034n = c3741pO.f33386b;
        this.f34035o = c3741pO.f33391g.f33713a.f24046d;
        while (c3741pO != null) {
            c3741pO.h();
            c3741pO = c3741pO.f33396m;
        }
        this.f34029h = null;
        this.f34031k = null;
        this.i = null;
        this.f34030j = null;
        this.f34033m = 0;
        b();
    }

    public final int C(AbstractC3832r8 abstractC3832r8, long j9, long j10, long j11) {
        long j12;
        C3795qO c3795qO;
        int i;
        C3795qO a9;
        AbstractC3832r8 abstractC3832r82 = abstractC3832r8;
        C3741pO c3741pO = this.f34029h;
        C3741pO c3741pO2 = null;
        while (c3741pO != null) {
            C3795qO c3795qO2 = c3741pO.f33391g;
            BQ bq = c3795qO2.f33713a;
            if (c3741pO2 != null) {
                C3795qO e6 = e(abstractC3832r82, c3741pO2, j9);
                if (e6 != null && bq.equals(e6.f33713a)) {
                    long j13 = c3795qO2.f33714b;
                    long j14 = e6.f33714b;
                    j12 = com.anythink.basead.exoplayer.b.f6539b;
                    long j15 = c3795qO2.f33715c;
                    if (j13 == j14) {
                        c3795qO = c3795qO2;
                        i = 0;
                    } else if (j15 != com.anythink.basead.exoplayer.b.f6539b) {
                        c3795qO = c3795qO2;
                        i = 0;
                        long j16 = e6.f33715c;
                        if (j16 != com.anythink.basead.exoplayer.b.f6539b) {
                            if (Math.abs((j14 - j16) - (j13 - j15)) >= 5000000) {
                            }
                        }
                    }
                    a9 = j13 != j14 ? e6.a(j13, j15) : e6;
                }
                return y(c3741pO2);
            }
            a9 = D(abstractC3832r82, c3795qO2);
            c3795qO = c3795qO2;
            j12 = com.anythink.basead.exoplayer.b.f6539b;
            i = 0;
            long j17 = a9.f33716d;
            C3795qO c3795qO3 = c3795qO;
            long j18 = c3795qO3.f33716d;
            c3741pO.f33391g = j18 == j17 ? a9 : new C3795qO(a9.f33713a, a9.f33714b, a9.f33715c, j18, a9.f33717e, a9.f33718f, a9.f33719g, a9.f33720h);
            long j19 = c3795qO3.f33717e;
            long j20 = a9.f33717e;
            if (j19 != j20) {
                long j21 = j20 == j12 ? Long.MAX_VALUE : j20 + c3741pO.f33399p;
                int i4 = (c3741pO != this.i || (j10 != Long.MIN_VALUE && j10 < j21)) ? i : 1;
                int i9 = (c3741pO != this.f34030j || (j11 != Long.MIN_VALUE && j11 < j21)) ? i : 1;
                int y6 = y(c3741pO);
                if (y6 != 0) {
                    return y6;
                }
                int i10 = (i4 == 0 || (j19 == j12 && bq.f24047e == -1)) ? i : 1;
                return i9 != 0 ? i10 | 2 : i10;
            }
            c3741pO2 = c3741pO;
            c3741pO = c3741pO.f33396m;
            abstractC3832r82 = abstractC3832r8;
        }
        return 0;
    }

    public final C3795qO D(AbstractC3832r8 abstractC3832r8, C3795qO c3795qO) {
        BQ bq = c3795qO.f33713a;
        boolean b9 = bq.b();
        int i = bq.f24047e;
        boolean z8 = !b9 && i == -1;
        boolean h9 = h(abstractC3832r8, bq);
        boolean i4 = i(abstractC3832r8, bq, z8);
        long j9 = j(abstractC3832r8, bq);
        Object obj = bq.f24043a;
        L7 l72 = this.f34022a;
        abstractC3832r8.o(obj, l72);
        if (bq.b()) {
            l72.c(bq.f24044b);
        } else if (i != -1) {
            l72.c(i);
        }
        return new C3795qO(bq, c3795qO.f33714b, c3795qO.f33715c, c3795qO.f33716d, j9, z8, h9, i4);
    }

    public final BQ E(AbstractC3832r8 abstractC3832r8, Object obj) {
        long c4;
        int e6;
        L7 l72 = this.f34022a;
        int i = abstractC3832r8.o(obj, l72).f26108c;
        Object obj2 = this.f34034n;
        if (obj2 == null || (e6 = abstractC3832r8.e(obj2)) == -1 || abstractC3832r8.d(e6, l72, false).f26108c != i) {
            C3741pO c3741pO = this.f34029h;
            while (true) {
                if (c3741pO == null) {
                    C3741pO c3741pO2 = this.f34029h;
                    while (true) {
                        if (c3741pO2 != null) {
                            int e9 = abstractC3832r8.e(c3741pO2.f33386b);
                            if (e9 != -1 && abstractC3832r8.d(e9, l72, false).f26108c == i) {
                                c4 = c3741pO2.f33391g.f33713a.f24046d;
                                break;
                            }
                            c3741pO2 = c3741pO2.f33396m;
                        } else {
                            c4 = c(obj);
                            if (c4 == -1) {
                                c4 = this.f34026e;
                                this.f34026e = 1 + c4;
                                if (this.f34029h == null) {
                                    this.f34034n = obj;
                                    this.f34035o = c4;
                                }
                            }
                        }
                    }
                } else {
                    if (c3741pO.f33386b.equals(obj)) {
                        c4 = c3741pO.f33391g.f33713a.f24046d;
                        break;
                    }
                    c3741pO = c3741pO.f33396m;
                }
            }
        } else {
            c4 = this.f34035o;
        }
        long j9 = c4;
        abstractC3832r8.o(obj, l72);
        int i4 = l72.f26108c;
        Y7 y72 = this.f34023b;
        abstractC3832r8.b(i4, y72, 0L);
        for (int e10 = abstractC3832r8.e(obj); e10 >= y72.f28803k; e10--) {
            abstractC3832r8.d(e10, l72, true);
            l72.f26111f.getClass();
            l72.f26111f.a(-1);
        }
        return a(abstractC3832r8, obj, j9, y72, l72);
    }

    public final void b() {
        SB sb = UB.f27942u;
        RB rb = new RB(4);
        for (C3741pO c3741pO = this.f34029h; c3741pO != null; c3741pO = c3741pO.f33396m) {
            rb.a(c3741pO.f33391g.f33713a);
        }
        C3741pO c3741pO2 = this.i;
        this.f34025d.e(new RunnableC3771q0(this, rb, c3741pO2 == null ? null : c3741pO2.f33391g.f33713a, 13));
    }

    public final long c(Object obj) {
        for (int i = 0; i < this.f34036p.size(); i++) {
            C3741pO c3741pO = (C3741pO) this.f34036p.get(i);
            if (c3741pO.f33386b.equals(obj)) {
                return c3741pO.f33391g.f33713a.f24046d;
            }
        }
        return -1L;
    }

    public final int d(AbstractC3832r8 abstractC3832r8) {
        AbstractC3832r8 abstractC3832r82;
        C3741pO c3741pO;
        C3741pO c3741pO2 = this.f34029h;
        if (c3741pO2 == null) {
            return 0;
        }
        int e6 = abstractC3832r8.e(c3741pO2.f33386b);
        while (true) {
            abstractC3832r82 = abstractC3832r8;
            e6 = abstractC3832r82.l(e6, this.f34022a, this.f34023b, this.f34027f, this.f34028g);
            while (true) {
                c3741pO = c3741pO2.f33396m;
                if (c3741pO == null || c3741pO2.f33391g.f33718f) {
                    break;
                }
                c3741pO2 = c3741pO;
            }
            if (e6 == -1 || c3741pO == null || abstractC3832r82.e(c3741pO.f33386b) != e6) {
                break;
            }
            c3741pO2 = c3741pO;
            abstractC3832r8 = abstractC3832r82;
        }
        int y6 = y(c3741pO2);
        c3741pO2.f33391g = D(abstractC3832r82, c3741pO2.f33391g);
        return y6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0156, code lost:
    
        return f(r24, r0, r4, r5, r2.f33716d, r13.f24046d);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3795qO e(AbstractC3832r8 abstractC3832r8, C3741pO c3741pO, long j9) {
        int i;
        C2904a a9;
        int i4;
        int[] iArr;
        int i9;
        AbstractC3832r8 abstractC3832r82;
        L7 l72;
        long j10;
        long j11;
        long j12;
        long j13;
        Pair n9;
        int i10;
        AbstractC3832r8 abstractC3832r83;
        long j14;
        Y7 y72;
        Object obj;
        long j15;
        L7 l73;
        long j16;
        long j17;
        Pair n10;
        long c4;
        C3795qO c3795qO = c3741pO.f33391g;
        long j18 = c3741pO.f33399p;
        long j19 = c3795qO.f33717e;
        long j20 = (j18 + j19) - j9;
        boolean z8 = c3795qO.f33718f;
        L7 l74 = this.f34022a;
        long j21 = c3795qO.f33716d;
        BQ bq = c3795qO.f33713a;
        if (z8) {
            Object obj2 = bq.f24043a;
            int e6 = abstractC3832r8.e(obj2);
            int i11 = this.f34027f;
            boolean z9 = this.f34028g;
            L7 l75 = this.f34022a;
            Y7 y73 = this.f34023b;
            int l9 = abstractC3832r8.l(e6, l75, y73, i11, z9);
            if (l9 != -1) {
                int i12 = abstractC3832r8.d(l9, l75, true).f26108c;
                Object obj3 = l75.f26107b;
                obj3.getClass();
                if (abstractC3832r8.b(i12, y73, 0L).f28803k == l9) {
                    int i13 = l75.f26108c;
                    if (l75.f26109d == com.anythink.basead.exoplayer.b.f6539b) {
                        abstractC3832r8.b(i13, y73, 0L);
                        if (y73.f28800g && !y73.i) {
                            j14 = Math.max(0L, j20);
                            n10 = abstractC3832r8.n(y73, l75, i12, com.anythink.basead.exoplayer.b.f6539b, j14);
                            if (n10 != null) {
                                Object obj4 = n10.first;
                                long longValue = ((Long) n10.second).longValue();
                                C3741pO c3741pO2 = c3741pO.f33396m;
                                if (c3741pO2 == null || !c3741pO2.f33386b.equals(obj4)) {
                                    c4 = c(obj4);
                                    if (c4 == -1) {
                                        c4 = this.f34026e;
                                        this.f34026e = 1 + c4;
                                    }
                                } else {
                                    c4 = c3741pO2.f33391g.f33713a.f24046d;
                                }
                                abstractC3832r83 = abstractC3832r8;
                                j15 = longValue;
                                y72 = y73;
                                obj = obj4;
                                l73 = l75;
                                j16 = c4;
                                j17 = -9223372036854775807L;
                            }
                        }
                    }
                    j14 = -9223372036854775807L;
                    n10 = abstractC3832r8.n(y73, l75, i12, com.anythink.basead.exoplayer.b.f6539b, j14);
                    if (n10 != null) {
                    }
                } else {
                    abstractC3832r83 = abstractC3832r8;
                    j14 = -9223372036854775807L;
                    y72 = y73;
                    obj = obj3;
                    j15 = 0;
                    l73 = l75;
                    j16 = bq.f24046d;
                    j17 = 0;
                }
                BQ a10 = a(abstractC3832r83, obj, j16, y72, l73);
                L7 l76 = l73;
                if (j17 != com.anythink.basead.exoplayer.b.f6539b && j21 != com.anythink.basead.exoplayer.b.f6539b) {
                    abstractC3832r83.o(obj2, l76).f26111f.getClass();
                    l76.f26111f.getClass();
                }
                Object obj5 = a10.f24043a;
                abstractC3832r83.o(obj5, l74);
                return a10.b() ? f(abstractC3832r83, obj5, a10.f24044b, a10.f24045c, j17, a10.f24046d) : g(abstractC3832r8, obj5, j15, j14, j17, a10.f24046d);
            }
            return null;
        }
        Object obj6 = bq.f24043a;
        abstractC3832r8.o(obj6, l74);
        if (bq.b()) {
            C4071ve c4071ve = l74.f26111f;
            int i14 = bq.f24044b;
            if (c4071ve.a(i14).f29138a == -1) {
                return null;
            }
            C2904a a11 = l74.f26111f.a(i14);
            int i15 = bq.f24045c + 1;
            while (true) {
                int[] iArr2 = a11.f29141d;
                if (i15 >= iArr2.length || (i10 = iArr2[i15]) == 0 || i10 == 1) {
                    break;
                }
                i15++;
            }
            if (j21 == com.anythink.basead.exoplayer.b.f6539b) {
                int i16 = l74.f26108c;
                long j22 = l74.f26109d;
                Y7 y74 = this.f34023b;
                if (j22 == com.anythink.basead.exoplayer.b.f6539b) {
                    abstractC3832r8.b(i16, y74, 0L);
                    if (y74.f28800g && !y74.i) {
                        j13 = Math.max(0L, j20);
                        abstractC3832r82 = abstractC3832r8;
                        l72 = l74;
                        n9 = abstractC3832r82.n(y74, l72, l74.f26108c, com.anythink.basead.exoplayer.b.f6539b, j13);
                        if (n9 != null) {
                            return null;
                        }
                        j11 = ((Long) n9.second).longValue();
                        j10 = j13;
                        j12 = -9223372036854775807L;
                    }
                }
                j13 = -9223372036854775807L;
                abstractC3832r82 = abstractC3832r8;
                l72 = l74;
                n9 = abstractC3832r82.n(y74, l72, l74.f26108c, com.anythink.basead.exoplayer.b.f6539b, j13);
                if (n9 != null) {
                }
            } else {
                abstractC3832r82 = abstractC3832r8;
                l72 = l74;
                j10 = -9223372036854775807L;
                j11 = j21;
                j12 = j11;
            }
            abstractC3832r82.o(obj6, l72);
            l72.f26111f.a(i14).getClass();
            l72.f26111f.a(i14).getClass();
            return g(abstractC3832r82, obj6, Math.max(0L, j11), j10, j12, bq.f24046d);
        }
        int i17 = bq.f24047e;
        if (i17 != -1) {
            l74.f26111f.getClass();
            if (i17 == -1) {
                l74.f26111f.a(-1);
                i = -1;
                a9 = l74.f26111f.a(i);
                i4 = 0;
                while (true) {
                    iArr = a9.f29141d;
                    if (i4 >= iArr.length || (i9 = iArr[i4]) == 0 || i9 == 1) {
                        break;
                    }
                    i4++;
                }
                l74.c(i);
                if (i4 == l74.f26111f.a(i).f29138a) {
                    return f(abstractC3832r8, obj6, i, i4, j19, bq.f24046d);
                }
                abstractC3832r8.o(obj6, l74);
                l74.f26111f.a(i).getClass();
                l74.f26111f.a(i).getClass();
                return g(abstractC3832r8, obj6, 0L, com.anythink.basead.exoplayer.b.f6539b, j19, bq.f24046d);
            }
        }
        i = i17;
        a9 = l74.f26111f.a(i);
        i4 = 0;
        while (true) {
            iArr = a9.f29141d;
            if (i4 >= iArr.length) {
                break;
            }
            break;
            i4++;
        }
        l74.c(i);
        if (i4 == l74.f26111f.a(i).f29138a) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r4.f26111f.getClass();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3795qO f(AbstractC3832r8 abstractC3832r8, Object obj, int i, int i4, long j9, long j10) {
        int i9;
        BQ bq = new BQ(obj, i, i4, j10, -1);
        L7 l72 = this.f34022a;
        long b9 = abstractC3832r8.o(obj, l72).b(i, i4);
        C2904a a9 = l72.f26111f.a(i);
        int i10 = 0;
        while (true) {
            int[] iArr = a9.f29141d;
            if (i10 >= iArr.length || (i9 = iArr[i10]) == 0 || i9 == 1) {
                break;
            }
            i10++;
        }
        l72.c(i);
        long j11 = 0;
        if (b9 != com.anythink.basead.exoplayer.b.f6539b && b9 <= 0) {
            j11 = Math.max(0L, (-1) + b9);
        }
        return new C3795qO(bq, j11, com.anythink.basead.exoplayer.b.f6539b, j9, b9, false, false, false);
    }

    public final C3795qO g(AbstractC3832r8 abstractC3832r8, Object obj, long j9, long j10, long j11, long j12) {
        L7 l72 = this.f34022a;
        abstractC3832r8.o(obj, l72);
        l72.getClass();
        BQ bq = new BQ(obj, j12, -1);
        boolean z8 = !bq.b();
        boolean h9 = h(abstractC3832r8, bq);
        boolean i = i(abstractC3832r8, bq, z8);
        long j13 = j(abstractC3832r8, bq);
        return new C3795qO(bq, (j13 == com.anythink.basead.exoplayer.b.f6539b || j9 < j13) ? j9 : Math.max(0L, (-1) + j13), j10, j11, j13, z8, h9, i);
    }

    public final boolean h(AbstractC3832r8 abstractC3832r8, BQ bq) {
        if (!bq.b() && bq.f24047e == -1) {
            Object obj = bq.f24043a;
            if (abstractC3832r8.b(abstractC3832r8.o(obj, this.f34022a).f26108c, this.f34023b, 0L).f28804l == abstractC3832r8.e(obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean i(AbstractC3832r8 abstractC3832r8, BQ bq, boolean z8) {
        int e6 = abstractC3832r8.e(bq.f24043a);
        L7 l72 = this.f34022a;
        int i = abstractC3832r8.d(e6, l72, false).f26108c;
        Y7 y72 = this.f34023b;
        return !abstractC3832r8.b(i, y72, 0L).f28800g && abstractC3832r8.l(e6, l72, y72, this.f34027f, this.f34028g) == -1 && z8;
    }

    public final long j(AbstractC3832r8 abstractC3832r8, BQ bq) {
        Object obj = bq.f24043a;
        L7 l72 = this.f34022a;
        abstractC3832r8.o(obj, l72);
        if (bq.b()) {
            return l72.b(bq.f24044b, bq.f24045c);
        }
        int i = bq.f24047e;
        if (i == -1) {
            return l72.f26109d;
        }
        l72.f26111f.a(i).getClass();
        return 0L;
    }

    public final int k(AbstractC3832r8 abstractC3832r8, int i) {
        this.f34027f = i;
        return d(abstractC3832r8);
    }

    public final int l(AbstractC3832r8 abstractC3832r8, boolean z8) {
        this.f34028g = z8;
        return d(abstractC3832r8);
    }

    public final void m(TN tn) {
        tn.getClass();
        r();
    }

    public final void n(long j9) {
        C3741pO c3741pO = this.f34031k;
        if (c3741pO != null) {
            PA.T(c3741pO.f33396m == null);
            if (c3741pO.f33389e) {
                c3741pO.f33385a.f(j9 - c3741pO.f33399p);
            }
        }
    }

    public final boolean o() {
        C3741pO c3741pO = this.f34031k;
        if (c3741pO != null) {
            return !c3741pO.f33391g.f33720h && c3741pO.b() && this.f34031k.f33391g.f33717e != com.anythink.basead.exoplayer.b.f6539b && this.f34033m < 100;
        }
        return true;
    }

    public final C3795qO p(long j9, C4280zO c4280zO) {
        C3741pO c3741pO = this.f34031k;
        if (c3741pO != null) {
            return e(c4280zO.f35530a, c3741pO, j9);
        }
        AbstractC3832r8 abstractC3832r8 = c4280zO.f35530a;
        BQ bq = c4280zO.f35531b;
        long j10 = c4280zO.f35532c;
        long j11 = c4280zO.f35546r;
        Object obj = bq.f24043a;
        abstractC3832r8.o(obj, this.f34022a);
        if (!bq.b()) {
            return g(abstractC3832r8, obj, j11, com.anythink.basead.exoplayer.b.f6539b, j10, bq.f24046d);
        }
        return f(abstractC3832r8, obj, bq.f24044b, bq.f24045c, j10, bq.f24046d);
    }

    public final C3741pO q(C3795qO c3795qO) {
        C3741pO c3741pO;
        C3741pO c3741pO2 = this.f34031k;
        long j9 = c3795qO.f33714b;
        long j10 = c3741pO2 == null ? 1000000000000L : (c3741pO2.f33399p + c3741pO2.f33391g.f33717e) - j9;
        int i = 0;
        while (true) {
            if (i >= this.f34036p.size()) {
                c3741pO = null;
                break;
            }
            C3795qO c3795qO2 = ((C3741pO) this.f34036p.get(i)).f33391g;
            long j11 = c3795qO2.f33717e;
            if ((j11 == com.anythink.basead.exoplayer.b.f6539b || j11 == c3795qO.f33717e) && c3795qO2.f33714b == j9 && c3795qO2.f33713a.equals(c3795qO.f33713a)) {
                c3741pO = (C3741pO) this.f34036p.remove(i);
                break;
            }
            i++;
        }
        if (c3741pO == null) {
            C3365iO c3365iO = (C3365iO) this.f34037q.f34886u;
            InterfaceC3985u d2 = c3365iO.f31380y.d(c3365iO.f31351M);
            c3365iO.f31340E0.getClass();
            c3741pO = new C3741pO(c3365iO.f31372u, j10, c3365iO.f31376w, d2, c3365iO.f31349K, c3795qO, c3365iO.f31378x);
        } else {
            c3741pO.f33391g = c3795qO;
            c3741pO.f33399p = j10;
        }
        C3741pO c3741pO3 = this.f34031k;
        if (c3741pO3 == null) {
            this.f34029h = c3741pO;
            this.i = c3741pO;
            this.f34030j = c3741pO;
        } else if (c3741pO != c3741pO3.f33396m) {
            c3741pO3.l();
            c3741pO3.f33396m = c3741pO;
        }
        this.f34034n = null;
        this.f34031k = c3741pO;
        this.f34033m++;
        b();
        return c3741pO;
    }

    public final void r() {
        if (this.f34036p.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f34036p.size(); i++) {
            ((C3741pO) this.f34036p.get(i)).h();
        }
        this.f34036p = arrayList;
        this.f34032l = null;
        z();
    }

    public final C3741pO s() {
        return this.f34029h;
    }

    public final C3741pO t() {
        return this.i;
    }

    public final C3741pO u() {
        return this.f34030j;
    }

    public final C3741pO v() {
        C3741pO c3741pO = this.f34030j;
        C3741pO c3741pO2 = this.i;
        if (c3741pO == c3741pO2) {
            c3741pO2.getClass();
            this.f34030j = c3741pO2.f33396m;
        }
        c3741pO2.getClass();
        this.i = c3741pO2.f33396m;
        b();
        C3741pO c3741pO3 = this.i;
        c3741pO3.getClass();
        return c3741pO3;
    }

    public final void w() {
        C3741pO c3741pO;
        C3741pO c3741pO2 = this.f34030j;
        if (c3741pO2 == null || (c3741pO = c3741pO2.f33396m) == null) {
            throw null;
        }
        this.f34030j = c3741pO;
        b();
    }

    public final C3741pO x() {
        C3741pO c3741pO = this.f34029h;
        if (c3741pO == null) {
            return null;
        }
        if (c3741pO == this.i) {
            this.i = c3741pO.f33396m;
        }
        if (c3741pO == this.f34030j) {
            this.f34030j = c3741pO.f33396m;
        }
        c3741pO.h();
        int i = this.f34033m - 1;
        this.f34033m = i;
        if (i == 0) {
            this.f34031k = null;
            C3741pO c3741pO2 = this.f34029h;
            this.f34034n = c3741pO2.f33386b;
            this.f34035o = c3741pO2.f33391g.f33713a.f24046d;
        }
        this.f34029h = this.f34029h.f33396m;
        b();
        return this.f34029h;
    }

    public final int y(C3741pO c3741pO) {
        c3741pO.getClass();
        int i = 0;
        if (c3741pO.equals(this.f34031k)) {
            return 0;
        }
        this.f34031k = c3741pO;
        int i4 = 0;
        while (true) {
            c3741pO = c3741pO.f33396m;
            if (c3741pO == null) {
                break;
            }
            if (c3741pO == this.i) {
                C3741pO c3741pO2 = this.f34029h;
                this.i = c3741pO2;
                this.f34030j = c3741pO2;
                i4 = 3;
            }
            if (c3741pO == this.f34030j) {
                this.f34030j = this.i;
                i4 |= 2;
            }
            c3741pO.h();
            this.f34033m--;
        }
        C3741pO c3741pO3 = this.f34031k;
        c3741pO3.getClass();
        if (c3741pO3.f33396m != null) {
            c3741pO3.l();
            c3741pO3.f33396m = null;
            while (true) {
                C3877s c3877s = c3741pO3.f33398o;
                if (i >= c3877s.f34149n) {
                    break;
                }
                c3877s.b(i);
                InterfaceC3716p interfaceC3716p = ((InterfaceC3716p[]) c3741pO3.f33398o.f34151v)[i];
                i++;
            }
        }
        b();
        return i4;
    }

    public final void z() {
        C3741pO c3741pO = this.f34032l;
        if (c3741pO == null || c3741pO.c()) {
            this.f34032l = null;
            for (int i = 0; i < this.f34036p.size(); i++) {
                C3741pO c3741pO2 = (C3741pO) this.f34036p.get(i);
                if (!c3741pO2.c()) {
                    this.f34032l = c3741pO2;
                    return;
                }
            }
        }
    }
}
