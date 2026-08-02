package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.eO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3159eO {

    /* renamed from: c, reason: collision with root package name */
    public final BO f30708c;

    /* renamed from: d, reason: collision with root package name */
    public final C3235ft f30709d;

    /* renamed from: e, reason: collision with root package name */
    public long f30710e;

    /* renamed from: f, reason: collision with root package name */
    public int f30711f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f30712g;

    /* renamed from: h, reason: collision with root package name */
    public C3052cO f30713h;
    public C3052cO i;

    /* renamed from: j, reason: collision with root package name */
    public C3052cO f30714j;

    /* renamed from: k, reason: collision with root package name */
    public C3052cO f30715k;

    /* renamed from: l, reason: collision with root package name */
    public C3052cO f30716l;

    /* renamed from: m, reason: collision with root package name */
    public int f30717m;

    /* renamed from: n, reason: collision with root package name */
    public Object f30718n;

    /* renamed from: o, reason: collision with root package name */
    public long f30719o;

    /* renamed from: q, reason: collision with root package name */
    public final C4042ut f30721q;

    /* renamed from: a, reason: collision with root package name */
    public final K7 f30706a = new K7();

    /* renamed from: b, reason: collision with root package name */
    public final U7 f30707b = new U7();

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f30720p = new ArrayList();

    public C3159eO(BO bo, C3235ft c3235ft, C4042ut c4042ut) {
        this.f30708c = bo;
        this.f30709d = c3235ft;
        this.f30721q = c4042ut;
    }

    public static C3860rQ a(AbstractC3627n8 abstractC3627n8, Object obj, long j6, U7 u72, K7 k72) {
        abstractC3627n8.o(obj, k72);
        abstractC3627n8.b(k72.f26619c, u72, 0L);
        abstractC3627n8.e(obj);
        k72.f26622f.getClass();
        abstractC3627n8.o(obj, k72);
        k72.f26622f.a(-1);
        return new C3860rQ(obj, j6, -1);
    }

    public final C3052cO A(InterfaceC3807qQ interfaceC3807qQ) {
        for (int i = 0; i < this.f30720p.size(); i++) {
            C3052cO c3052cO = (C3052cO) this.f30720p.get(i);
            if (c3052cO.f30256a == interfaceC3807qQ) {
                return c3052cO;
            }
        }
        return null;
    }

    public final void B() {
        if (this.f30717m == 0) {
            return;
        }
        C3052cO c3052cO = this.f30713h;
        c3052cO.getClass();
        this.f30718n = c3052cO.f30257b;
        this.f30719o = c3052cO.f30262g.f30532a.f34409d;
        while (c3052cO != null) {
            c3052cO.h();
            c3052cO = c3052cO.f30267m;
        }
        this.f30713h = null;
        this.f30715k = null;
        this.i = null;
        this.f30714j = null;
        this.f30717m = 0;
        b();
    }

    public final int C(AbstractC3627n8 abstractC3627n8, long j6, long j9, long j10) {
        long j11;
        C3106dO c3106dO;
        int i;
        C3106dO a9;
        AbstractC3627n8 abstractC3627n82 = abstractC3627n8;
        C3052cO c3052cO = this.f30713h;
        C3052cO c3052cO2 = null;
        while (c3052cO != null) {
            C3106dO c3106dO2 = c3052cO.f30262g;
            C3860rQ c3860rQ = c3106dO2.f30532a;
            if (c3052cO2 != null) {
                C3106dO e9 = e(abstractC3627n82, c3052cO2, j6);
                if (e9 != null && c3860rQ.equals(e9.f30532a)) {
                    long j12 = c3106dO2.f30533b;
                    long j13 = e9.f30533b;
                    j11 = com.anythink.basead.exoplayer.b.f7168b;
                    long j14 = c3106dO2.f30534c;
                    if (j12 == j13) {
                        c3106dO = c3106dO2;
                        i = 0;
                    } else if (j14 != com.anythink.basead.exoplayer.b.f7168b) {
                        c3106dO = c3106dO2;
                        i = 0;
                        long j15 = e9.f30534c;
                        if (j15 != com.anythink.basead.exoplayer.b.f7168b) {
                            if (Math.abs((j13 - j15) - (j12 - j14)) >= 5000000) {
                            }
                        }
                    }
                    a9 = j12 != j13 ? e9.a(j12, j14) : e9;
                }
                return y(c3052cO2);
            }
            a9 = D(abstractC3627n82, c3106dO2);
            c3106dO = c3106dO2;
            j11 = com.anythink.basead.exoplayer.b.f7168b;
            i = 0;
            long j16 = a9.f30535d;
            C3106dO c3106dO3 = c3106dO;
            long j17 = c3106dO3.f30535d;
            c3052cO.f30262g = j17 == j16 ? a9 : new C3106dO(a9.f30532a, a9.f30533b, a9.f30534c, j17, a9.f30536e, a9.f30537f, a9.f30538g, a9.f30539h);
            long j18 = c3106dO3.f30536e;
            long j19 = a9.f30536e;
            if (j18 != j19) {
                long j20 = j19 == j11 ? Long.MAX_VALUE : j19 + c3052cO.f30270p;
                int i4 = (c3052cO != this.i || (j9 != Long.MIN_VALUE && j9 < j20)) ? i : 1;
                int i6 = (c3052cO != this.f30714j || (j10 != Long.MIN_VALUE && j10 < j20)) ? i : 1;
                int y7 = y(c3052cO);
                if (y7 != 0) {
                    return y7;
                }
                int i9 = (i4 == 0 || (j18 == j11 && c3860rQ.f34410e == -1)) ? i : 1;
                return i6 != 0 ? i9 | 2 : i9;
            }
            c3052cO2 = c3052cO;
            c3052cO = c3052cO.f30267m;
            abstractC3627n82 = abstractC3627n8;
        }
        return 0;
    }

    public final C3106dO D(AbstractC3627n8 abstractC3627n8, C3106dO c3106dO) {
        C3860rQ c3860rQ = c3106dO.f30532a;
        boolean b9 = c3860rQ.b();
        int i = c3860rQ.f34410e;
        boolean z6 = !b9 && i == -1;
        boolean h3 = h(abstractC3627n8, c3860rQ);
        boolean i4 = i(abstractC3627n8, c3860rQ, z6);
        long j6 = j(abstractC3627n8, c3860rQ);
        Object obj = c3860rQ.f34406a;
        K7 k72 = this.f30706a;
        abstractC3627n8.o(obj, k72);
        if (c3860rQ.b()) {
            k72.c(c3860rQ.f34407b);
        } else if (i != -1) {
            k72.c(i);
        }
        return new C3106dO(c3860rQ, c3106dO.f30533b, c3106dO.f30534c, c3106dO.f30535d, j6, z6, h3, i4);
    }

    public final C3860rQ E(C3589mO c3589mO, AbstractC3627n8 abstractC3627n8, Object obj, boolean z6, boolean z9) {
        long c9;
        int e9;
        K7 k72 = this.f30706a;
        int i = abstractC3627n8.o(obj, k72).f26619c;
        Object obj2 = this.f30718n;
        if (obj2 == null || (e9 = abstractC3627n8.e(obj2)) == -1 || abstractC3627n8.d(e9, k72, false).f26619c != i) {
            C3052cO c3052cO = this.f30713h;
            while (true) {
                if (c3052cO == null) {
                    C3052cO c3052cO2 = this.f30713h;
                    while (true) {
                        if (c3052cO2 != null) {
                            int e10 = abstractC3627n8.e(c3052cO2.f30257b);
                            if (e10 != -1 && abstractC3627n8.d(e10, k72, false).f26619c == i) {
                                c9 = c3052cO2.f30262g.f30532a.f34409d;
                                break;
                            }
                            c3052cO2 = c3052cO2.f30267m;
                        } else {
                            c9 = c(obj);
                            if (c9 == -1) {
                                c9 = this.f30710e;
                                this.f30710e = 1 + c9;
                                if (this.f30713h == null) {
                                    this.f30718n = obj;
                                    this.f30719o = c9;
                                }
                            }
                        }
                    }
                } else {
                    if (c3052cO.f30257b.equals(obj)) {
                        c9 = c3052cO.f30262g.f30532a.f34409d;
                        break;
                    }
                    c3052cO = c3052cO.f30267m;
                }
            }
        } else {
            c9 = this.f30719o;
        }
        long j6 = c9;
        if (!z6 && !z9) {
            C3860rQ c3860rQ = c3589mO.f32729b;
            C3860rQ a9 = a(abstractC3627n8, obj, j6, this.f30707b, k72);
            if (c3860rQ.b() && c3860rQ.equals(a9)) {
                return c3860rQ;
            }
            abstractC3627n8.o(obj, k72);
            return new C3860rQ(obj, j6, -1);
        }
        abstractC3627n8.o(obj, k72);
        int i4 = k72.f26619c;
        U7 u72 = this.f30707b;
        abstractC3627n8.b(i4, u72, 0L);
        for (int e11 = abstractC3627n8.e(obj); e11 >= u72.f28699k; e11--) {
            abstractC3627n8.d(e11, k72, true);
            k72.f26622f.getClass();
            k72.f26622f.a(-1);
        }
        return a(abstractC3627n8, obj, j6, u72, k72);
    }

    public final void b() {
        PB pb = RB.f27933u;
        OB ob = new OB(4);
        for (C3052cO c3052cO = this.f30713h; c3052cO != null; c3052cO = c3052cO.f30267m) {
            ob.a(c3052cO.f30262g.f30532a);
        }
        C3052cO c3052cO2 = this.i;
        this.f30709d.e(new RunnableC3888s0(13, this, ob, c3052cO2 == null ? null : c3052cO2.f30262g.f30532a));
    }

    public final long c(Object obj) {
        for (int i = 0; i < this.f30720p.size(); i++) {
            C3052cO c3052cO = (C3052cO) this.f30720p.get(i);
            if (c3052cO.f30257b.equals(obj)) {
                return c3052cO.f30262g.f30532a.f34409d;
            }
        }
        return -1L;
    }

    public final int d(AbstractC3627n8 abstractC3627n8) {
        AbstractC3627n8 abstractC3627n82;
        C3052cO c3052cO;
        C3052cO c3052cO2 = this.f30713h;
        if (c3052cO2 == null) {
            return 0;
        }
        int e9 = abstractC3627n8.e(c3052cO2.f30257b);
        while (true) {
            abstractC3627n82 = abstractC3627n8;
            e9 = abstractC3627n82.l(e9, this.f30706a, this.f30707b, this.f30711f, this.f30712g);
            while (true) {
                c3052cO = c3052cO2.f30267m;
                if (c3052cO == null || c3052cO2.f30262g.f30537f) {
                    break;
                }
                c3052cO2 = c3052cO;
            }
            if (e9 == -1 || c3052cO == null || abstractC3627n82.e(c3052cO.f30257b) != e9) {
                break;
            }
            c3052cO2 = c3052cO;
            abstractC3627n8 = abstractC3627n82;
        }
        int y7 = y(c3052cO2);
        c3052cO2.f30262g = D(abstractC3627n82, c3052cO2.f30262g);
        return y7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0156, code lost:
    
        return f(r24, r0, r4, r5, r2.f30535d, r13.f34409d);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3106dO e(AbstractC3627n8 abstractC3627n8, C3052cO c3052cO, long j6) {
        int i;
        C2920a a9;
        int i4;
        int[] iArr;
        int i6;
        AbstractC3627n8 abstractC3627n82;
        K7 k72;
        long j9;
        long j10;
        long j11;
        long j12;
        Pair n9;
        int i9;
        AbstractC3627n8 abstractC3627n83;
        long j13;
        U7 u72;
        Object obj;
        long j14;
        K7 k73;
        long j15;
        long j16;
        Pair n10;
        long c9;
        C3106dO c3106dO = c3052cO.f30262g;
        long j17 = c3052cO.f30270p;
        long j18 = c3106dO.f30536e;
        long j19 = (j17 + j18) - j6;
        boolean z6 = c3106dO.f30537f;
        K7 k74 = this.f30706a;
        long j20 = c3106dO.f30535d;
        C3860rQ c3860rQ = c3106dO.f30532a;
        if (z6) {
            Object obj2 = c3860rQ.f34406a;
            int e9 = abstractC3627n8.e(obj2);
            int i10 = this.f30711f;
            boolean z9 = this.f30712g;
            K7 k75 = this.f30706a;
            U7 u73 = this.f30707b;
            int l9 = abstractC3627n8.l(e9, k75, u73, i10, z9);
            if (l9 != -1) {
                int i11 = abstractC3627n8.d(l9, k75, true).f26619c;
                Object obj3 = k75.f26618b;
                obj3.getClass();
                if (abstractC3627n8.b(i11, u73, 0L).f28699k == l9) {
                    int i12 = k75.f26619c;
                    if (k75.f26620d == com.anythink.basead.exoplayer.b.f7168b) {
                        abstractC3627n8.b(i12, u73, 0L);
                        if (u73.f28696g && !u73.i) {
                            j13 = Math.max(0L, j19);
                            n10 = abstractC3627n8.n(u73, k75, i11, com.anythink.basead.exoplayer.b.f7168b, j13);
                            if (n10 != null) {
                                Object obj4 = n10.first;
                                long longValue = ((Long) n10.second).longValue();
                                C3052cO c3052cO2 = c3052cO.f30267m;
                                if (c3052cO2 == null || !c3052cO2.f30257b.equals(obj4)) {
                                    c9 = c(obj4);
                                    if (c9 == -1) {
                                        c9 = this.f30710e;
                                        this.f30710e = 1 + c9;
                                    }
                                } else {
                                    c9 = c3052cO2.f30262g.f30532a.f34409d;
                                }
                                abstractC3627n83 = abstractC3627n8;
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
                    n10 = abstractC3627n8.n(u73, k75, i11, com.anythink.basead.exoplayer.b.f7168b, j13);
                    if (n10 != null) {
                    }
                } else {
                    abstractC3627n83 = abstractC3627n8;
                    j13 = -9223372036854775807L;
                    u72 = u73;
                    obj = obj3;
                    j14 = 0;
                    k73 = k75;
                    j15 = c3860rQ.f34409d;
                    j16 = 0;
                }
                C3860rQ a10 = a(abstractC3627n83, obj, j15, u72, k73);
                K7 k76 = k73;
                if (j16 != com.anythink.basead.exoplayer.b.f7168b && j20 != com.anythink.basead.exoplayer.b.f7168b) {
                    abstractC3627n83.o(obj2, k76).f26622f.getClass();
                    k76.f26622f.getClass();
                }
                Object obj5 = a10.f34406a;
                abstractC3627n83.o(obj5, k74);
                return a10.b() ? f(abstractC3627n83, obj5, a10.f34407b, a10.f34408c, j16, a10.f34409d) : g(abstractC3627n8, obj5, j14, j13, j16, a10.f34409d);
            }
            return null;
        }
        Object obj6 = c3860rQ.f34406a;
        abstractC3627n8.o(obj6, k74);
        if (c3860rQ.b()) {
            C3865re c3865re = k74.f26622f;
            int i13 = c3860rQ.f34407b;
            if (c3865re.a(i13).f29753a == -1) {
                return null;
            }
            C2920a a11 = k74.f26622f.a(i13);
            int i14 = c3860rQ.f34408c + 1;
            while (true) {
                int[] iArr2 = a11.f29756d;
                if (i14 >= iArr2.length || (i9 = iArr2[i14]) == 0 || i9 == 1) {
                    break;
                }
                i14++;
            }
            if (j20 == com.anythink.basead.exoplayer.b.f7168b) {
                int i15 = k74.f26619c;
                long j21 = k74.f26620d;
                U7 u74 = this.f30707b;
                if (j21 == com.anythink.basead.exoplayer.b.f7168b) {
                    abstractC3627n8.b(i15, u74, 0L);
                    if (u74.f28696g && !u74.i) {
                        j12 = Math.max(0L, j19);
                        abstractC3627n82 = abstractC3627n8;
                        k72 = k74;
                        n9 = abstractC3627n82.n(u74, k72, k74.f26619c, com.anythink.basead.exoplayer.b.f7168b, j12);
                        if (n9 != null) {
                            return null;
                        }
                        j10 = ((Long) n9.second).longValue();
                        j9 = j12;
                        j11 = -9223372036854775807L;
                    }
                }
                j12 = -9223372036854775807L;
                abstractC3627n82 = abstractC3627n8;
                k72 = k74;
                n9 = abstractC3627n82.n(u74, k72, k74.f26619c, com.anythink.basead.exoplayer.b.f7168b, j12);
                if (n9 != null) {
                }
            } else {
                abstractC3627n82 = abstractC3627n8;
                k72 = k74;
                j9 = -9223372036854775807L;
                j10 = j20;
                j11 = j10;
            }
            abstractC3627n82.o(obj6, k72);
            k72.f26622f.a(i13).getClass();
            k72.f26622f.a(i13).getClass();
            return g(abstractC3627n82, obj6, Math.max(0L, j10), j9, j11, c3860rQ.f34409d);
        }
        int i16 = c3860rQ.f34410e;
        if (i16 != -1) {
            k74.f26622f.getClass();
            if (i16 == -1) {
                k74.f26622f.a(-1);
                i = -1;
                a9 = k74.f26622f.a(i);
                i4 = 0;
                while (true) {
                    iArr = a9.f29756d;
                    if (i4 >= iArr.length || (i6 = iArr[i4]) == 0 || i6 == 1) {
                        break;
                    }
                    i4++;
                }
                k74.c(i);
                if (i4 == k74.f26622f.a(i).f29753a) {
                    return f(abstractC3627n8, obj6, i, i4, j18, c3860rQ.f34409d);
                }
                abstractC3627n8.o(obj6, k74);
                k74.f26622f.a(i).getClass();
                k74.f26622f.a(i).getClass();
                return g(abstractC3627n8, obj6, 0L, com.anythink.basead.exoplayer.b.f7168b, j18, c3860rQ.f34409d);
            }
        }
        i = i16;
        a9 = k74.f26622f.a(i);
        i4 = 0;
        while (true) {
            iArr = a9.f29756d;
            if (i4 >= iArr.length) {
                break;
            }
            break;
            i4++;
        }
        k74.c(i);
        if (i4 == k74.f26622f.a(i).f29753a) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r4.f26622f.getClass();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3106dO f(AbstractC3627n8 abstractC3627n8, Object obj, int i, int i4, long j6, long j9) {
        int i6;
        C3860rQ c3860rQ = new C3860rQ(obj, i, i4, j9, -1);
        K7 k72 = this.f30706a;
        long b9 = abstractC3627n8.o(obj, k72).b(i, i4);
        C2920a a9 = k72.f26622f.a(i);
        int i9 = 0;
        while (true) {
            int[] iArr = a9.f29756d;
            if (i9 >= iArr.length || (i6 = iArr[i9]) == 0 || i6 == 1) {
                break;
            }
            i9++;
        }
        k72.c(i);
        long j10 = 0;
        if (b9 != com.anythink.basead.exoplayer.b.f7168b && b9 <= 0) {
            j10 = Math.max(0L, (-1) + b9);
        }
        return new C3106dO(c3860rQ, j10, com.anythink.basead.exoplayer.b.f7168b, j6, b9, false, false, false);
    }

    public final C3106dO g(AbstractC3627n8 abstractC3627n8, Object obj, long j6, long j9, long j10, long j11) {
        K7 k72 = this.f30706a;
        abstractC3627n8.o(obj, k72);
        k72.getClass();
        C3860rQ c3860rQ = new C3860rQ(obj, j11, -1);
        boolean z6 = !c3860rQ.b();
        boolean h3 = h(abstractC3627n8, c3860rQ);
        boolean i = i(abstractC3627n8, c3860rQ, z6);
        long j12 = j(abstractC3627n8, c3860rQ);
        return new C3106dO(c3860rQ, (j12 == com.anythink.basead.exoplayer.b.f7168b || j6 < j12) ? j6 : Math.max(0L, (-1) + j12), j9, j10, j12, z6, h3, i);
    }

    public final boolean h(AbstractC3627n8 abstractC3627n8, C3860rQ c3860rQ) {
        if (!c3860rQ.b() && c3860rQ.f34410e == -1) {
            Object obj = c3860rQ.f34406a;
            if (abstractC3627n8.b(abstractC3627n8.o(obj, this.f30706a).f26619c, this.f30707b, 0L).f28700l == abstractC3627n8.e(obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean i(AbstractC3627n8 abstractC3627n8, C3860rQ c3860rQ, boolean z6) {
        int e9 = abstractC3627n8.e(c3860rQ.f34406a);
        K7 k72 = this.f30706a;
        int i = abstractC3627n8.d(e9, k72, false).f26619c;
        U7 u72 = this.f30707b;
        return !abstractC3627n8.b(i, u72, 0L).f28696g && abstractC3627n8.l(e9, k72, u72, this.f30711f, this.f30712g) == -1 && z6;
    }

    public final long j(AbstractC3627n8 abstractC3627n8, C3860rQ c3860rQ) {
        Object obj = c3860rQ.f34406a;
        K7 k72 = this.f30706a;
        abstractC3627n8.o(obj, k72);
        if (c3860rQ.b()) {
            return k72.b(c3860rQ.f34407b, c3860rQ.f34408c);
        }
        int i = c3860rQ.f34410e;
        if (i == -1) {
            return k72.f26620d;
        }
        k72.f26622f.a(i).getClass();
        return 0L;
    }

    public final int k(AbstractC3627n8 abstractC3627n8, int i) {
        this.f30711f = i;
        return d(abstractC3627n8);
    }

    public final int l(AbstractC3627n8 abstractC3627n8, boolean z6) {
        this.f30712g = z6;
        return d(abstractC3627n8);
    }

    public final void m(FN fn) {
        fn.getClass();
        r();
    }

    public final void n(long j6) {
        C3052cO c3052cO = this.f30715k;
        if (c3052cO != null) {
            AbstractC2792Sd.H(c3052cO.f30267m == null);
            if (c3052cO.f30260e) {
                c3052cO.f30256a.k(j6 - c3052cO.f30270p);
            }
        }
    }

    public final boolean o() {
        C3052cO c3052cO = this.f30715k;
        if (c3052cO != null) {
            return !c3052cO.f30262g.f30539h && c3052cO.b() && this.f30715k.f30262g.f30536e != com.anythink.basead.exoplayer.b.f7168b && this.f30717m < 100;
        }
        return true;
    }

    public final C3106dO p(long j6, C3589mO c3589mO) {
        C3052cO c3052cO = this.f30715k;
        if (c3052cO != null) {
            return e(c3589mO.f32728a, c3052cO, j6);
        }
        AbstractC3627n8 abstractC3627n8 = c3589mO.f32728a;
        C3860rQ c3860rQ = c3589mO.f32729b;
        long j9 = c3589mO.f32730c;
        long j10 = c3589mO.f32744r;
        Object obj = c3860rQ.f34406a;
        abstractC3627n8.o(obj, this.f30706a);
        if (!c3860rQ.b()) {
            return g(abstractC3627n8, obj, j10, com.anythink.basead.exoplayer.b.f7168b, j9, c3860rQ.f34409d);
        }
        return f(abstractC3627n8, obj, c3860rQ.f34407b, c3860rQ.f34408c, j9, c3860rQ.f34409d);
    }

    public final C3052cO q(C3106dO c3106dO) {
        C3052cO c3052cO;
        C3052cO c3052cO2 = this.f30715k;
        long j6 = c3106dO.f30533b;
        long j9 = c3052cO2 == null ? 1000000000000L : (c3052cO2.f30270p + c3052cO2.f30262g.f30536e) - j6;
        int i = 0;
        while (true) {
            if (i >= this.f30720p.size()) {
                c3052cO = null;
                break;
            }
            C3106dO c3106dO2 = ((C3052cO) this.f30720p.get(i)).f30262g;
            long j10 = c3106dO2.f30536e;
            if ((j10 == com.anythink.basead.exoplayer.b.f7168b || j10 == c3106dO.f30536e) && c3106dO2.f30533b == j6 && c3106dO2.f30532a.equals(c3106dO.f30532a)) {
                c3052cO = (C3052cO) this.f30720p.remove(i);
                break;
            }
            i++;
        }
        if (c3052cO == null) {
            VN vn = (VN) this.f30721q.f35366u;
            InterfaceC4049v h3 = vn.f28983y.h(vn.f28950M);
            vn.f28936A0.getClass();
            c3052cO = new C3052cO(vn.f28975u, j9, vn.f28979w, h3, vn.f28948K, c3106dO, vn.f28981x);
        } else {
            c3052cO.f30262g = c3106dO;
            c3052cO.f30270p = j9;
        }
        C3052cO c3052cO3 = this.f30715k;
        if (c3052cO3 == null) {
            this.f30713h = c3052cO;
            this.i = c3052cO;
            this.f30714j = c3052cO;
        } else if (c3052cO != c3052cO3.f30267m) {
            c3052cO3.l();
            c3052cO3.f30267m = c3052cO;
        }
        this.f30718n = null;
        this.f30715k = c3052cO;
        this.f30717m++;
        b();
        return c3052cO;
    }

    public final void r() {
        if (this.f30720p.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f30720p.size(); i++) {
            ((C3052cO) this.f30720p.get(i)).h();
        }
        this.f30720p = arrayList;
        this.f30716l = null;
        z();
    }

    public final C3052cO s() {
        return this.f30713h;
    }

    public final C3052cO t() {
        return this.i;
    }

    public final C3052cO u() {
        return this.f30714j;
    }

    public final C3052cO v() {
        C3052cO c3052cO = this.f30714j;
        C3052cO c3052cO2 = this.i;
        if (c3052cO == c3052cO2) {
            c3052cO2.getClass();
            this.f30714j = c3052cO2.f30267m;
        }
        c3052cO2.getClass();
        this.i = c3052cO2.f30267m;
        b();
        C3052cO c3052cO3 = this.i;
        c3052cO3.getClass();
        return c3052cO3;
    }

    public final void w() {
        C3052cO c3052cO;
        C3052cO c3052cO2 = this.f30714j;
        if (c3052cO2 == null || (c3052cO = c3052cO2.f30267m) == null) {
            throw null;
        }
        this.f30714j = c3052cO;
        b();
    }

    public final C3052cO x() {
        C3052cO c3052cO = this.f30713h;
        if (c3052cO == null) {
            return null;
        }
        if (c3052cO == this.i) {
            this.i = c3052cO.f30267m;
        }
        if (c3052cO == this.f30714j) {
            this.f30714j = c3052cO.f30267m;
        }
        c3052cO.h();
        int i = this.f30717m - 1;
        this.f30717m = i;
        if (i == 0) {
            this.f30715k = null;
            C3052cO c3052cO2 = this.f30713h;
            this.f30718n = c3052cO2.f30257b;
            this.f30719o = c3052cO2.f30262g.f30532a.f34409d;
        }
        this.f30713h = this.f30713h.f30267m;
        b();
        return this.f30713h;
    }

    public final int y(C3052cO c3052cO) {
        c3052cO.getClass();
        int i = 0;
        if (c3052cO.equals(this.f30715k)) {
            return 0;
        }
        this.f30715k = c3052cO;
        int i4 = 0;
        while (true) {
            c3052cO = c3052cO.f30267m;
            if (c3052cO == null) {
                break;
            }
            if (c3052cO == this.i) {
                C3052cO c3052cO2 = this.f30713h;
                this.i = c3052cO2;
                this.f30714j = c3052cO2;
                i4 = 3;
            }
            if (c3052cO == this.f30714j) {
                this.f30714j = this.i;
                i4 |= 2;
            }
            c3052cO.h();
            this.f30717m--;
        }
        C3052cO c3052cO3 = this.f30715k;
        c3052cO3.getClass();
        if (c3052cO3.f30267m != null) {
            c3052cO3.l();
            c3052cO3.f30267m = null;
            while (true) {
                C3941t c3941t = c3052cO3.f30269o;
                if (i >= c3941t.f34963n) {
                    break;
                }
                c3941t.c(i);
                InterfaceC3780q interfaceC3780q = ((InterfaceC3780q[]) c3052cO3.f30269o.f34965v)[i];
                i++;
            }
        }
        b();
        return i4;
    }

    public final void z() {
        C3052cO c3052cO = this.f30716l;
        if (c3052cO == null || c3052cO.c()) {
            this.f30716l = null;
            for (int i = 0; i < this.f30720p.size(); i++) {
                C3052cO c3052cO2 = (C3052cO) this.f30720p.get(i);
                if (!c3052cO2.c()) {
                    this.f30716l = c3052cO2;
                    return;
                }
            }
        }
    }
}
