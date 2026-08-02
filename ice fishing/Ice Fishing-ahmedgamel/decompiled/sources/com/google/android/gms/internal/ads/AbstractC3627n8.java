package com.google.android.gms.internal.ads;

import android.util.Pair;

/* renamed from: com.google.android.gms.internal.ads.n8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3627n8 {

    /* renamed from: a, reason: collision with root package name */
    public static final C4003u7 f33468a = new C4003u7();

    static {
        String str = AbstractC3182eu.f30782a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public abstract int a();

    public abstract U7 b(int i, U7 u72, long j6);

    public abstract int c();

    public abstract K7 d(int i, K7 k72, boolean z6);

    public abstract int e(Object obj);

    public final boolean equals(Object obj) {
        int j6;
        if (this != obj) {
            if (obj instanceof AbstractC3627n8) {
                AbstractC3627n8 abstractC3627n8 = (AbstractC3627n8) obj;
                if (abstractC3627n8.a() == a() && abstractC3627n8.c() == c()) {
                    U7 u72 = new U7();
                    K7 k72 = new K7();
                    U7 u73 = new U7();
                    K7 k73 = new K7();
                    int i = 0;
                    while (true) {
                        if (i >= a()) {
                            int i4 = 0;
                            while (true) {
                                if (i4 >= c()) {
                                    int k9 = k(true);
                                    if (k9 == abstractC3627n8.k(true) && (j6 = j(true)) == abstractC3627n8.j(true)) {
                                        while (k9 != j6) {
                                            int h3 = h(k9, 0, true);
                                            if (h3 == abstractC3627n8.h(k9, 0, true)) {
                                                k9 = h3;
                                            }
                                        }
                                    }
                                } else {
                                    if (!d(i4, k72, true).equals(abstractC3627n8.d(i4, k73, true))) {
                                        break;
                                    }
                                    i4++;
                                }
                            }
                        } else {
                            if (!b(i, u72, 0L).equals(abstractC3627n8.b(i, u73, 0L))) {
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

    public int h(int i, int i4, boolean z6) {
        if (i4 == 0) {
            if (i == j(z6)) {
                return -1;
            }
            return i + 1;
        }
        if (i4 == 1) {
            return i;
        }
        if (i4 == 2) {
            return i == j(z6) ? k(z6) : i + 1;
        }
        throw new IllegalStateException();
    }

    public final int hashCode() {
        int i;
        U7 u72 = new U7();
        K7 k72 = new K7();
        int a9 = a() + 217;
        int i4 = 0;
        while (true) {
            i = a9 * 31;
            if (i4 >= a()) {
                break;
            }
            a9 = i + b(i4, u72, 0L).hashCode();
            i4++;
        }
        int c9 = c() + i;
        for (int i6 = 0; i6 < c(); i6++) {
            c9 = (c9 * 31) + d(i6, k72, true).hashCode();
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

    public int j(boolean z6) {
        if (g()) {
            return -1;
        }
        return a() - 1;
    }

    public int k(boolean z6) {
        return g() ? -1 : 0;
    }

    public final int l(int i, K7 k72, U7 u72, int i4, boolean z6) {
        int i6 = d(i, k72, false).f26619c;
        if (b(i6, u72, 0L).f28700l != i) {
            return i + 1;
        }
        int h3 = h(i6, i4, z6);
        if (h3 == -1) {
            return -1;
        }
        return b(h3, u72, 0L).f28699k;
    }

    public final Pair m(U7 u72, K7 k72, int i, long j6) {
        Pair n9 = n(u72, k72, i, j6, 0L);
        n9.getClass();
        return n9;
    }

    public final Pair n(U7 u72, K7 k72, int i, long j6, long j9) {
        AbstractC2792Sd.K(i, a());
        b(i, u72, j9);
        if (j6 == com.anythink.basead.exoplayer.b.f7168b) {
            u72.getClass();
            j6 = 0;
        }
        int i4 = u72.f28699k;
        d(i4, k72, false);
        while (i4 < u72.f28700l) {
            k72.getClass();
            if (j6 == 0) {
                break;
            }
            int i6 = i4 + 1;
            d(i6, k72, false).getClass();
            if (j6 < 0) {
                break;
            }
            i4 = i6;
        }
        d(i4, k72, true);
        k72.getClass();
        long j10 = k72.f26620d;
        if (j10 != com.anythink.basead.exoplayer.b.f7168b) {
            j6 = Math.min(j6, j10 - 1);
        }
        long max = Math.max(0L, j6);
        Object obj = k72.f26618b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public K7 o(Object obj, K7 k72) {
        return d(e(obj), k72, true);
    }
}
