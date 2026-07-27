package com.google.android.gms.internal.ads;

import android.util.Pair;

/* renamed from: com.google.android.gms.internal.ads.n8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3604n8 {

    /* renamed from: a, reason: collision with root package name */
    public static final C3980u7 f32690a = new C3980u7();

    static {
        String str = AbstractC3159eu.f29993a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public abstract int a();

    public abstract U7 b(int i, U7 u72, long j6);

    public abstract int c();

    public abstract K7 d(int i, K7 k72, boolean z3);

    public abstract int e(Object obj);

    public final boolean equals(Object obj) {
        int j6;
        if (this != obj) {
            if (obj instanceof AbstractC3604n8) {
                AbstractC3604n8 abstractC3604n8 = (AbstractC3604n8) obj;
                if (abstractC3604n8.a() == a() && abstractC3604n8.c() == c()) {
                    U7 u72 = new U7();
                    K7 k72 = new K7();
                    U7 u73 = new U7();
                    K7 k73 = new K7();
                    int i = 0;
                    while (true) {
                        if (i >= a()) {
                            int i6 = 0;
                            while (true) {
                                if (i6 >= c()) {
                                    int k9 = k(true);
                                    if (k9 == abstractC3604n8.k(true) && (j6 = j(true)) == abstractC3604n8.j(true)) {
                                        while (k9 != j6) {
                                            int h9 = h(k9, 0, true);
                                            if (h9 == abstractC3604n8.h(k9, 0, true)) {
                                                k9 = h9;
                                            }
                                        }
                                    }
                                } else {
                                    if (!d(i6, k72, true).equals(abstractC3604n8.d(i6, k73, true))) {
                                        break;
                                    }
                                    i6++;
                                }
                            }
                        } else {
                            if (!b(i, u72, 0L).equals(abstractC3604n8.b(i, u73, 0L))) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract Object f(int i);

    public final boolean g() {
        return a() == 0;
    }

    public int h(int i, int i6, boolean z3) {
        if (i6 == 0) {
            if (i == j(z3)) {
                return -1;
            }
            return i + 1;
        }
        if (i6 == 1) {
            return i;
        }
        if (i6 == 2) {
            return i == j(z3) ? k(z3) : i + 1;
        }
        throw new IllegalStateException();
    }

    public final int hashCode() {
        int i;
        U7 u72 = new U7();
        K7 k72 = new K7();
        int a9 = a() + 217;
        int i6 = 0;
        while (true) {
            i = a9 * 31;
            if (i6 >= a()) {
                break;
            }
            a9 = i + b(i6, u72, 0L).hashCode();
            i6++;
        }
        int c9 = c() + i;
        for (int i9 = 0; i9 < c(); i9++) {
            c9 = (c9 * 31) + d(i9, k72, true).hashCode();
        }
        int k9 = k(true);
        while (k9 != -1) {
            c9 = (c9 * 31) + k9;
            k9 = h(k9, 0, true);
        }
        return c9;
    }

    public int i(int i) {
        if (i == k(false)) {
            return -1;
        }
        return i - 1;
    }

    public int j(boolean z3) {
        if (g()) {
            return -1;
        }
        return a() - 1;
    }

    public int k(boolean z3) {
        return g() ? -1 : 0;
    }

    public final int l(int i, K7 k72, U7 u72, int i6, boolean z3) {
        int i9 = d(i, k72, false).f25867c;
        if (b(i9, u72, 0L).f27903l != i) {
            return i + 1;
        }
        int h9 = h(i9, i6, z3);
        if (h9 == -1) {
            return -1;
        }
        return b(h9, u72, 0L).f27902k;
    }

    public final Pair m(U7 u72, K7 k72, int i, long j6) {
        Pair n9 = n(u72, k72, i, j6, 0L);
        n9.getClass();
        return n9;
    }

    public final Pair n(U7 u72, K7 k72, int i, long j6, long j9) {
        AbstractC2772Sd.K(i, a());
        b(i, u72, j9);
        if (j6 == com.anythink.basead.exoplayer.b.f6382b) {
            u72.getClass();
            j6 = 0;
        }
        int i6 = u72.f27902k;
        d(i6, k72, false);
        while (i6 < u72.f27903l) {
            k72.getClass();
            if (j6 == 0) {
                break;
            }
            int i9 = i6 + 1;
            d(i9, k72, false).getClass();
            if (j6 < 0) {
                break;
            }
            i6 = i9;
        }
        d(i6, k72, true);
        k72.getClass();
        long j10 = k72.f25868d;
        if (j10 != com.anythink.basead.exoplayer.b.f6382b) {
            j6 = Math.min(j6, j10 - 1);
        }
        long max = Math.max(0L, j6);
        Object obj = k72.f25866b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public K7 o(Object obj, K7 k72) {
        return d(e(obj), k72, true);
    }
}
