package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.eO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3136eO {

    /* renamed from: c, reason: collision with root package name */
    public final BO f29916c;

    /* renamed from: d, reason: collision with root package name */
    public final C3212ft f29917d;

    /* renamed from: e, reason: collision with root package name */
    public long f29918e;

    /* renamed from: f, reason: collision with root package name */
    public int f29919f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f29920g;

    /* renamed from: h, reason: collision with root package name */
    public C3029cO f29921h;
    public C3029cO i;

    /* renamed from: j, reason: collision with root package name */
    public C3029cO f29922j;

    /* renamed from: k, reason: collision with root package name */
    public C3029cO f29923k;

    /* renamed from: l, reason: collision with root package name */
    public C3029cO f29924l;

    /* renamed from: m, reason: collision with root package name */
    public int f29925m;

    /* renamed from: n, reason: collision with root package name */
    public Object f29926n;

    /* renamed from: o, reason: collision with root package name */
    public long f29927o;

    /* renamed from: q, reason: collision with root package name */
    public final C4019ut f29929q;

    /* renamed from: a, reason: collision with root package name */
    public final K7 f29914a = new K7();

    /* renamed from: b, reason: collision with root package name */
    public final U7 f29915b = new U7();

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f29928p = new ArrayList();

    public C3136eO(BO bo, C3212ft c3212ft, C4019ut c4019ut) {
        this.f29916c = bo;
        this.f29917d = c3212ft;
        this.f29929q = c4019ut;
    }

    public static C3676oQ a(AbstractC3604n8 abstractC3604n8, Object obj, long j6, U7 u72, K7 k72) {
        abstractC3604n8.o(obj, k72);
        abstractC3604n8.b(k72.f25867c, u72, 0L);
        abstractC3604n8.e(obj);
        k72.f25870f.getClass();
        abstractC3604n8.o(obj, k72);
        k72.f25870f.a(-1);
        return new C3676oQ(obj, j6, -1);
    }

    public final C3029cO A(InterfaceC3622nQ interfaceC3622nQ) {
        for (int i = 0; i < this.f29928p.size(); i++) {
            C3029cO c3029cO = (C3029cO) this.f29928p.get(i);
            if (c3029cO.f29473a == interfaceC3622nQ) {
                return c3029cO;
            }
        }
        return null;
    }

    public final void B() {
        if (this.f29925m == 0) {
            return;
        }
        C3029cO c3029cO = this.f29921h;
        c3029cO.getClass();
        this.f29926n = c3029cO.f29474b;
        this.f29927o = c3029cO.f29479g.f29760a.f32908d;
        while (c3029cO != null) {
            c3029cO.h();
            c3029cO = c3029cO.f29484m;
        }
        this.f29921h = null;
        this.f29923k = null;
        this.i = null;
        this.f29922j = null;
        this.f29925m = 0;
        b();
    }

    public final int C(AbstractC3604n8 abstractC3604n8, long j6, long j9, long j10) {
        long j11;
        C3083dO c3083dO;
        int i;
        C3083dO a9;
        AbstractC3604n8 abstractC3604n82 = abstractC3604n8;
        C3029cO c3029cO = this.f29921h;
        C3029cO c3029cO2 = null;
        while (c3029cO != null) {
            C3083dO c3083dO2 = c3029cO.f29479g;
            C3676oQ c3676oQ = c3083dO2.f29760a;
            if (c3029cO2 != null) {
                C3083dO e9 = e(abstractC3604n82, c3029cO2, j6);
                if (e9 != null && c3676oQ.equals(e9.f29760a)) {
                    long j12 = c3083dO2.f29761b;
                    long j13 = e9.f29761b;
                    j11 = com.anythink.basead.exoplayer.b.f6382b;
                    long j14 = c3083dO2.f29762c;
                    if (j12 == j13) {
                        c3083dO = c3083dO2;
                        i = 0;
                    } else if (j14 != com.anythink.basead.exoplayer.b.f6382b) {
                        c3083dO = c3083dO2;
                        i = 0;
                        long j15 = e9.f29762c;
                        if (j15 != com.anythink.basead.exoplayer.b.f6382b) {
                            if (Math.abs((j13 - j15) - (j12 - j14)) >= 5000000) {
                            }
                        }
                    }
                    a9 = j12 != j13 ? e9.a(j12, j14) : e9;
                }
                return y(c3029cO2);
            }
            a9 = D(abstractC3604n82, c3083dO2);
            c3083dO = c3083dO2;
            j11 = com.anythink.basead.exoplayer.b.f6382b;
            i = 0;
            long j16 = a9.f29763d;
            C3083dO c3083dO3 = c3083dO;
            long j17 = c3083dO3.f29763d;
            c3029cO.f29479g = j17 == j16 ? a9 : new C3083dO(a9.f29760a, a9.f29761b, a9.f29762c, j17, a9.f29764e, a9.f29765f, a9.f29766g, a9.f29767h);
            long j18 = c3083dO3.f29764e;
            long j19 = a9.f29764e;
            if (j18 != j19) {
                long j20 = j19 == j11 ? Long.MAX_VALUE : j19 + c3029cO.f29487p;
                int i6 = (c3029cO != this.i || (j9 != Long.MIN_VALUE && j9 < j20)) ? i : 1;
                int i9 = (c3029cO != this.f29922j || (j10 != Long.MIN_VALUE && j10 < j20)) ? i : 1;
                int y7 = y(c3029cO);
                if (y7 != 0) {
                    return y7;
                }
                int i10 = (i6 == 0 || (j18 == j11 && c3676oQ.f32909e == -1)) ? i : 1;
                return i9 != 0 ? i10 | 2 : i10;
            }
            c3029cO2 = c3029cO;
            c3029cO = c3029cO.f29484m;
            abstractC3604n82 = abstractC3604n8;
        }
        return 0;
    }

    public final C3083dO D(AbstractC3604n8 abstractC3604n8, C3083dO c3083dO) {
        C3676oQ c3676oQ = c3083dO.f29760a;
        boolean b9 = c3676oQ.b();
        int i = c3676oQ.f32909e;
        boolean z3 = !b9 && i == -1;
        boolean h9 = h(abstractC3604n8, c3676oQ);
        boolean i6 = i(abstractC3604n8, c3676oQ, z3);
        long j6 = j(abstractC3604n8, c3676oQ);
        Object obj = c3676oQ.f32905a;
        K7 k72 = this.f29914a;
        abstractC3604n8.o(obj, k72);
        if (c3676oQ.b()) {
            k72.c(c3676oQ.f32906b);
        } else if (i != -1) {
            k72.c(i);
        }
        return new C3083dO(c3676oQ, c3083dO.f29761b, c3083dO.f29762c, c3083dO.f29763d, j6, z3, h9, i6);
    }

    public final C3676oQ E(C3566mO c3566mO, AbstractC3604n8 abstractC3604n8, Object obj, boolean z3, boolean z6) {
        long c9;
        int e9;
        K7 k72 = this.f29914a;
        int i = abstractC3604n8.o(obj, k72).f25867c;
        Object obj2 = this.f29926n;
        if (obj2 == null || (e9 = abstractC3604n8.e(obj2)) == -1 || abstractC3604n8.d(e9, k72, false).f25867c != i) {
            C3029cO c3029cO = this.f29921h;
            while (true) {
                if (c3029cO == null) {
                    C3029cO c3029cO2 = this.f29921h;
                    while (true) {
                        if (c3029cO2 != null) {
                            int e10 = abstractC3604n8.e(c3029cO2.f29474b);
                            if (e10 != -1 && abstractC3604n8.d(e10, k72, false).f25867c == i) {
                                c9 = c3029cO2.f29479g.f29760a.f32908d;
                                break;
                            }
                            c3029cO2 = c3029cO2.f29484m;
                        } else {
                            c9 = c(obj);
                            if (c9 == -1) {
                                c9 = this.f29918e;
                                this.f29918e = 1 + c9;
                                if (this.f29921h == null) {
                                    this.f29926n = obj;
                                    this.f29927o = c9;
                                }
                            }
                        }
                    }
                } else {
                    if (c3029cO.f29474b.equals(obj)) {
                        c9 = c3029cO.f29479g.f29760a.f32908d;
                        break;
                    }
                    c3029cO = c3029cO.f29484m;
                }
            }
        } else {
            c9 = this.f29927o;
        }
        long j6 = c9;
        if (!z3 && !z6) {
            C3676oQ c3676oQ = c3566mO.f31949b;
            C3676oQ a9 = a(abstractC3604n8, obj, j6, this.f29915b, k72);
            if (c3676oQ.b() && c3676oQ.equals(a9)) {
                return c3676oQ;
            }
            abstractC3604n8.o(obj, k72);
            return new C3676oQ(obj, j6, -1);
        }
        abstractC3604n8.o(obj, k72);
        int i6 = k72.f25867c;
        U7 u72 = this.f29915b;
        abstractC3604n8.b(i6, u72, 0L);
        for (int e11 = abstractC3604n8.e(obj); e11 >= u72.f27902k; e11--) {
            abstractC3604n8.d(e11, k72, true);
            k72.f25870f.getClass();
            k72.f25870f.a(-1);
        }
        return a(abstractC3604n8, obj, j6, u72, k72);
    }

    public final void b() {
        PB pb = RB.f27177u;
        OB ob = new OB(4);
        for (C3029cO c3029cO = this.f29921h; c3029cO != null; c3029cO = c3029cO.f29484m) {
            ob.a(c3029cO.f29479g.f29760a);
        }
        C3029cO c3029cO2 = this.i;
        this.f29917d.e(new RunnableC3865s0(13, this, ob, c3029cO2 == null ? null : c3029cO2.f29479g.f29760a));
    }

    public final long c(Object obj) {
        for (int i = 0; i < this.f29928p.size(); i++) {
            C3029cO c3029cO = (C3029cO) this.f29928p.get(i);
            if (c3029cO.f29474b.equals(obj)) {
                return c3029cO.f29479g.f29760a.f32908d;
            }
        }
        return -1L;
    }

    public final int d(AbstractC3604n8 abstractC3604n8) {
        AbstractC3604n8 abstractC3604n82;
        C3029cO c3029cO;
        C3029cO c3029cO2 = this.f29921h;
        if (c3029cO2 == null) {
            return 0;
        }
        int e9 = abstractC3604n8.e(c3029cO2.f29474b);
        while (true) {
            abstractC3604n82 = abstractC3604n8;
            e9 = abstractC3604n82.l(e9, this.f29914a, this.f29915b, this.f29919f, this.f29920g);
            while (true) {
                c3029cO = c3029cO2.f29484m;
                if (c3029cO == null || c3029cO2.f29479g.f29765f) {
                    break;
                }
                c3029cO2 = c3029cO;
            }
            if (e9 == -1 || c3029cO == null || abstractC3604n82.e(c3029cO.f29474b) != e9) {
                break;
            }
            c3029cO2 = c3029cO;
            abstractC3604n8 = abstractC3604n82;
        }
        int y7 = y(c3029cO2);
        c3029cO2.f29479g = D(abstractC3604n82, c3029cO2.f29479g);
        return y7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0156, code lost:
    
        return f(r24, r0, r4, r5, r2.f29763d, r13.f32908d);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3083dO e(AbstractC3604n8 abstractC3604n8, C3029cO c3029cO, long j6) {
        int i;
        C2897a a9;
        int i6;
        int[] iArr;
        int i9;
        AbstractC3604n8 abstractC3604n82;
        K7 k72;
        long j9;
        long j10;
        long j11;
        long j12;
        Pair n9;
        int i10;
        AbstractC3604n8 abstractC3604n83;
        long j13;
        U7 u72;
        Object obj;
        long j14;
        K7 k73;
        long j15;
        long j16;
        Pair n10;
        long c9;
        C3083dO c3083dO = c3029cO.f29479g;
        long j17 = c3029cO.f29487p;
        long j18 = c3083dO.f29764e;
        long j19 = (j17 + j18) - j6;
        boolean z3 = c3083dO.f29765f;
        K7 k74 = this.f29914a;
        long j20 = c3083dO.f29763d;
        C3676oQ c3676oQ = c3083dO.f29760a;
        if (z3) {
            Object obj2 = c3676oQ.f32905a;
            int e9 = abstractC3604n8.e(obj2);
            int i11 = this.f29919f;
            boolean z6 = this.f29920g;
            K7 k75 = this.f29914a;
            U7 u73 = this.f29915b;
            int l9 = abstractC3604n8.l(e9, k75, u73, i11, z6);
            if (l9 != -1) {
                int i12 = abstractC3604n8.d(l9, k75, true).f25867c;
                Object obj3 = k75.f25866b;
                obj3.getClass();
                if (abstractC3604n8.b(i12, u73, 0L).f27902k == l9) {
                    int i13 = k75.f25867c;
                    if (k75.f25868d == com.anythink.basead.exoplayer.b.f6382b) {
                        abstractC3604n8.b(i13, u73, 0L);
                        if (u73.f27899g && !u73.i) {
                            j13 = Math.max(0L, j19);
                            n10 = abstractC3604n8.n(u73, k75, i12, com.anythink.basead.exoplayer.b.f6382b, j13);
                            if (n10 != null) {
                                Object obj4 = n10.first;
                                long longValue = ((Long) n10.second).longValue();
                                C3029cO c3029cO2 = c3029cO.f29484m;
                                if (c3029cO2 == null || !c3029cO2.f29474b.equals(obj4)) {
                                    c9 = c(obj4);
                                    if (c9 == -1) {
                                        c9 = this.f29918e;
                                        this.f29918e = 1 + c9;
                                    }
                                } else {
                                    c9 = c3029cO2.f29479g.f29760a.f32908d;
                                }
                                abstractC3604n83 = abstractC3604n8;
                                j14 = longValue;
                                u72 = u73;
                                obj = obj4;
                                k73 = k75;
                                j15 = c9;
                                j16 = -9223372036854775807L;
                            }
                        }
                    }
                    j13 = -9223372036854775807L;
                    n10 = abstractC3604n8.n(u73, k75, i12, com.anythink.basead.exoplayer.b.f6382b, j13);
                    if (n10 != null) {
                    }
                } else {
                    abstractC3604n83 = abstractC3604n8;
                    j13 = -9223372036854775807L;
                    u72 = u73;
                    obj = obj3;
                    j14 = 0;
                    k73 = k75;
                    j15 = c3676oQ.f32908d;
                    j16 = 0;
                }
                C3676oQ a10 = a(abstractC3604n83, obj, j15, u72, k73);
                K7 k76 = k73;
                if (j16 != com.anythink.basead.exoplayer.b.f6382b && j20 != com.anythink.basead.exoplayer.b.f6382b) {
                    abstractC3604n83.o(obj2, k76).f25870f.getClass();
                    k76.f25870f.getClass();
                }
                Object obj5 = a10.f32905a;
                abstractC3604n83.o(obj5, k74);
                return a10.b() ? f(abstractC3604n83, obj5, a10.f32906b, a10.f32907c, j16, a10.f32908d) : g(abstractC3604n8, obj5, j14, j13, j16, a10.f32908d);
            }
            return null;
        }
        Object obj6 = c3676oQ.f32905a;
        abstractC3604n8.o(obj6, k74);
        if (c3676oQ.b()) {
            C3842re c3842re = k74.f25870f;
            int i14 = c3676oQ.f32906b;
            if (c3842re.a(i14).f28983a == -1) {
                return null;
            }
            C2897a a11 = k74.f25870f.a(i14);
            int i15 = c3676oQ.f32907c + 1;
            while (true) {
                int[] iArr2 = a11.f28986d;
                if (i15 >= iArr2.length || (i10 = iArr2[i15]) == 0 || i10 == 1) {
                    break;
                }
                i15++;
            }
            if (j20 == com.anythink.basead.exoplayer.b.f6382b) {
                int i16 = k74.f25867c;
                long j21 = k74.f25868d;
                U7 u74 = this.f29915b;
                if (j21 == com.anythink.basead.exoplayer.b.f6382b) {
                    abstractC3604n8.b(i16, u74, 0L);
                    if (u74.f27899g && !u74.i) {
                        j12 = Math.max(0L, j19);
                        abstractC3604n82 = abstractC3604n8;
                        k72 = k74;
                        n9 = abstractC3604n82.n(u74, k72, k74.f25867c, com.anythink.basead.exoplayer.b.f6382b, j12);
                        if (n9 != null) {
                            return null;
                        }
                        j10 = ((Long) n9.second).longValue();
                        j9 = j12;
                        j11 = -9223372036854775807L;
                    }
                }
                j12 = -9223372036854775807L;
                abstractC3604n82 = abstractC3604n8;
                k72 = k74;
                n9 = abstractC3604n82.n(u74, k72, k74.f25867c, com.anythink.basead.exoplayer.b.f6382b, j12);
                if (n9 != null) {
                }
            } else {
                abstractC3604n82 = abstractC3604n8;
                k72 = k74;
                j9 = -9223372036854775807L;
                j10 = j20;
                j11 = j10;
            }
            abstractC3604n82.o(obj6, k72);
            k72.f25870f.a(i14).getClass();
            k72.f25870f.a(i14).getClass();
            return g(abstractC3604n82, obj6, Math.max(0L, j10), j9, j11, c3676oQ.f32908d);
        }
        int i17 = c3676oQ.f32909e;
        if (i17 != -1) {
            k74.f25870f.getClass();
            if (i17 == -1) {
                k74.f25870f.a(-1);
                i = -1;
                a9 = k74.f25870f.a(i);
                i6 = 0;
                while (true) {
                    iArr = a9.f28986d;
                    if (i6 >= iArr.length || (i9 = iArr[i6]) == 0 || i9 == 1) {
                        break;
                    }
                    i6++;
                }
                k74.c(i);
                if (i6 == k74.f25870f.a(i).f28983a) {
                    return f(abstractC3604n8, obj6, i, i6, j18, c3676oQ.f32908d);
                }
                abstractC3604n8.o(obj6, k74);
                k74.f25870f.a(i).getClass();
                k74.f25870f.a(i).getClass();
                return g(abstractC3604n8, obj6, 0L, com.anythink.basead.exoplayer.b.f6382b, j18, c3676oQ.f32908d);
            }
        }
        i = i17;
        a9 = k74.f25870f.a(i);
        i6 = 0;
        while (true) {
            iArr = a9.f28986d;
            if (i6 >= iArr.length) {
                break;
            }
            break;
            i6++;
        }
        k74.c(i);
        if (i6 == k74.f25870f.a(i).f28983a) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r4.f25870f.getClass();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3083dO f(AbstractC3604n8 abstractC3604n8, Object obj, int i, int i6, long j6, long j9) {
        int i9;
        C3676oQ c3676oQ = new C3676oQ(obj, i, i6, j9, -1);
        K7 k72 = this.f29914a;
        long b9 = abstractC3604n8.o(obj, k72).b(i, i6);
        C2897a a9 = k72.f25870f.a(i);
        int i10 = 0;
        while (true) {
            int[] iArr = a9.f28986d;
            if (i10 >= iArr.length || (i9 = iArr[i10]) == 0 || i9 == 1) {
                break;
            }
            i10++;
        }
        k72.c(i);
        long j10 = 0;
        if (b9 != com.anythink.basead.exoplayer.b.f6382b && b9 <= 0) {
            j10 = Math.max(0L, (-1) + b9);
        }
        return new C3083dO(c3676oQ, j10, com.anythink.basead.exoplayer.b.f6382b, j6, b9, false, false, false);
    }

    public final C3083dO g(AbstractC3604n8 abstractC3604n8, Object obj, long j6, long j9, long j10, long j11) {
        K7 k72 = this.f29914a;
        abstractC3604n8.o(obj, k72);
        k72.getClass();
        C3676oQ c3676oQ = new C3676oQ(obj, j11, -1);
        boolean z3 = !c3676oQ.b();
        boolean h9 = h(abstractC3604n8, c3676oQ);
        boolean i = i(abstractC3604n8, c3676oQ, z3);
        long j12 = j(abstractC3604n8, c3676oQ);
        return new C3083dO(c3676oQ, (j12 == com.anythink.basead.exoplayer.b.f6382b || j6 < j12) ? j6 : Math.max(0L, (-1) + j12), j9, j10, j12, z3, h9, i);
    }

    public final boolean h(AbstractC3604n8 abstractC3604n8, C3676oQ c3676oQ) {
        if (!c3676oQ.b() && c3676oQ.f32909e == -1) {
            Object obj = c3676oQ.f32905a;
            if (abstractC3604n8.b(abstractC3604n8.o(obj, this.f29914a).f25867c, this.f29915b, 0L).f27903l == abstractC3604n8.e(obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean i(AbstractC3604n8 abstractC3604n8, C3676oQ c3676oQ, boolean z3) {
        int e9 = abstractC3604n8.e(c3676oQ.f32905a);
        K7 k72 = this.f29914a;
        int i = abstractC3604n8.d(e9, k72, false).f25867c;
        U7 u72 = this.f29915b;
        return !abstractC3604n8.b(i, u72, 0L).f27899g && abstractC3604n8.l(e9, k72, u72, this.f29919f, this.f29920g) == -1 && z3;
    }

    public final long j(AbstractC3604n8 abstractC3604n8, C3676oQ c3676oQ) {
        Object obj = c3676oQ.f32905a;
        K7 k72 = this.f29914a;
        abstractC3604n8.o(obj, k72);
        if (c3676oQ.b()) {
            return k72.b(c3676oQ.f32906b, c3676oQ.f32907c);
        }
        int i = c3676oQ.f32909e;
        if (i == -1) {
            return k72.f25868d;
        }
        k72.f25870f.a(i).getClass();
        return 0L;
    }

    public final int k(AbstractC3604n8 abstractC3604n8, int i) {
        this.f29919f = i;
        return d(abstractC3604n8);
    }

    public final int l(AbstractC3604n8 abstractC3604n8, boolean z3) {
        this.f29920g = z3;
        return d(abstractC3604n8);
    }

    public final void m(FN fn) {
        fn.getClass();
        r();
    }

    public final void n(long j6) {
        C3029cO c3029cO = this.f29923k;
        if (c3029cO != null) {
            AbstractC2772Sd.H(c3029cO.f29484m == null);
            if (c3029cO.f29477e) {
                c3029cO.f29473a.k(j6 - c3029cO.f29487p);
            }
        }
    }

    public final boolean o() {
        C3029cO c3029cO = this.f29923k;
        if (c3029cO != null) {
            return !c3029cO.f29479g.f29767h && c3029cO.b() && this.f29923k.f29479g.f29764e != com.anythink.basead.exoplayer.b.f6382b && this.f29925m < 100;
        }
        return true;
    }

    public final C3083dO p(long j6, C3566mO c3566mO) {
        C3029cO c3029cO = this.f29923k;
        if (c3029cO != null) {
            return e(c3566mO.f31948a, c3029cO, j6);
        }
        AbstractC3604n8 abstractC3604n8 = c3566mO.f31948a;
        C3676oQ c3676oQ = c3566mO.f31949b;
        long j9 = c3566mO.f31950c;
        long j10 = c3566mO.f31964r;
        Object obj = c3676oQ.f32905a;
        abstractC3604n8.o(obj, this.f29914a);
        if (!c3676oQ.b()) {
            return g(abstractC3604n8, obj, j10, com.anythink.basead.exoplayer.b.f6382b, j9, c3676oQ.f32908d);
        }
        return f(abstractC3604n8, obj, c3676oQ.f32906b, c3676oQ.f32907c, j9, c3676oQ.f32908d);
    }

    public final C3029cO q(C3083dO c3083dO) {
        C3029cO c3029cO;
        C3029cO c3029cO2 = this.f29923k;
        long j6 = c3083dO.f29761b;
        long j9 = c3029cO2 == null ? 1000000000000L : (c3029cO2.f29487p + c3029cO2.f29479g.f29764e) - j6;
        int i = 0;
        while (true) {
            if (i >= this.f29928p.size()) {
                c3029cO = null;
                break;
            }
            C3083dO c3083dO2 = ((C3029cO) this.f29928p.get(i)).f29479g;
            long j10 = c3083dO2.f29764e;
            if ((j10 == com.anythink.basead.exoplayer.b.f6382b || j10 == c3083dO.f29764e) && c3083dO2.f29761b == j6 && c3083dO2.f29760a.equals(c3083dO.f29760a)) {
                c3029cO = (C3029cO) this.f29928p.remove(i);
                break;
            }
            i++;
        }
        if (c3029cO == null) {
            VN vn = (VN) this.f29929q.f34603u;
            InterfaceC4026v h9 = vn.f28187y.h(vn.f28158M);
            vn.f28148F0.getClass();
            c3029cO = new C3029cO(vn.f28179u, j9, vn.f28183w, h9, vn.f28156K, c3083dO, vn.f28185x);
        } else {
            c3029cO.f29479g = c3083dO;
            c3029cO.f29487p = j9;
        }
        C3029cO c3029cO3 = this.f29923k;
        if (c3029cO3 == null) {
            this.f29921h = c3029cO;
            this.i = c3029cO;
            this.f29922j = c3029cO;
        } else if (c3029cO != c3029cO3.f29484m) {
            c3029cO3.l();
            c3029cO3.f29484m = c3029cO;
        }
        this.f29926n = null;
        this.f29923k = c3029cO;
        this.f29925m++;
        b();
        return c3029cO;
    }

    public final void r() {
        if (this.f29928p.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f29928p.size(); i++) {
            ((C3029cO) this.f29928p.get(i)).h();
        }
        this.f29928p = arrayList;
        this.f29924l = null;
        z();
    }

    public final C3029cO s() {
        return this.f29921h;
    }

    public final C3029cO t() {
        return this.i;
    }

    public final C3029cO u() {
        return this.f29922j;
    }

    public final C3029cO v() {
        C3029cO c3029cO = this.f29922j;
        C3029cO c3029cO2 = this.i;
        if (c3029cO == c3029cO2) {
            c3029cO2.getClass();
            this.f29922j = c3029cO2.f29484m;
        }
        c3029cO2.getClass();
        this.i = c3029cO2.f29484m;
        b();
        C3029cO c3029cO3 = this.i;
        c3029cO3.getClass();
        return c3029cO3;
    }

    public final void w() {
        C3029cO c3029cO;
        C3029cO c3029cO2 = this.f29922j;
        if (c3029cO2 == null || (c3029cO = c3029cO2.f29484m) == null) {
            throw null;
        }
        this.f29922j = c3029cO;
        b();
    }

    public final C3029cO x() {
        C3029cO c3029cO = this.f29921h;
        if (c3029cO == null) {
            return null;
        }
        if (c3029cO == this.i) {
            this.i = c3029cO.f29484m;
        }
        if (c3029cO == this.f29922j) {
            this.f29922j = c3029cO.f29484m;
        }
        c3029cO.h();
        int i = this.f29925m - 1;
        this.f29925m = i;
        if (i == 0) {
            this.f29923k = null;
            C3029cO c3029cO2 = this.f29921h;
            this.f29926n = c3029cO2.f29474b;
            this.f29927o = c3029cO2.f29479g.f29760a.f32908d;
        }
        this.f29921h = this.f29921h.f29484m;
        b();
        return this.f29921h;
    }

    public final int y(C3029cO c3029cO) {
        c3029cO.getClass();
        int i = 0;
        if (c3029cO.equals(this.f29923k)) {
            return 0;
        }
        this.f29923k = c3029cO;
        int i6 = 0;
        while (true) {
            c3029cO = c3029cO.f29484m;
            if (c3029cO == null) {
                break;
            }
            if (c3029cO == this.i) {
                C3029cO c3029cO2 = this.f29921h;
                this.i = c3029cO2;
                this.f29922j = c3029cO2;
                i6 = 3;
            }
            if (c3029cO == this.f29922j) {
                this.f29922j = this.i;
                i6 |= 2;
            }
            c3029cO.h();
            this.f29925m--;
        }
        C3029cO c3029cO3 = this.f29923k;
        c3029cO3.getClass();
        if (c3029cO3.f29484m != null) {
            c3029cO3.l();
            c3029cO3.f29484m = null;
            while (true) {
                C3918t c3918t = c3029cO3.f29486o;
                if (i >= c3918t.f34177n) {
                    break;
                }
                c3918t.c(i);
                InterfaceC3757q interfaceC3757q = ((InterfaceC3757q[]) c3029cO3.f29486o.f34179v)[i];
                i++;
            }
        }
        b();
        return i6;
    }

    public final void z() {
        C3029cO c3029cO = this.f29924l;
        if (c3029cO == null || c3029cO.c()) {
            this.f29924l = null;
            for (int i = 0; i < this.f29928p.size(); i++) {
                C3029cO c3029cO2 = (C3029cO) this.f29928p.get(i);
                if (!c3029cO2.c()) {
                    this.f29924l = c3029cO2;
                    return;
                }
            }
        }
    }
}
