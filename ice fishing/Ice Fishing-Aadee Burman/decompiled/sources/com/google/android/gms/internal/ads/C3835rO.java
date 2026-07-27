package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.rO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3835rO extends AbstractC3604n8 {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f33581k = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f33582b;

    /* renamed from: c, reason: collision with root package name */
    public final KQ f33583c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33584d;

    /* renamed from: e, reason: collision with root package name */
    public final int f33585e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f33586f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f33587g;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC3604n8[] f33588h;
    public final Object[] i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f33589j;

    public C3835rO(AbstractC3604n8[] abstractC3604n8Arr, Object[] objArr, KQ kq) {
        this.f33583c = kq;
        this.f33582b = kq.f25924b.length;
        this.f33588h = abstractC3604n8Arr;
        int length = abstractC3604n8Arr.length;
        this.f33586f = new int[length];
        this.f33587g = new int[length];
        this.i = objArr;
        this.f33589j = new HashMap();
        int i = 0;
        int i6 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i < abstractC3604n8Arr.length) {
            AbstractC3604n8 abstractC3604n8 = abstractC3604n8Arr[i];
            this.f33588h[i10] = abstractC3604n8;
            this.f33587g[i10] = i6;
            this.f33586f[i10] = i9;
            i6 += abstractC3604n8.a();
            i9 += this.f33588h[i10].c();
            this.f33589j.put(objArr[i10], Integer.valueOf(i10));
            i++;
            i10++;
        }
        this.f33584d = i6;
        this.f33585e = i9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3604n8
    public final int a() {
        return this.f33584d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3604n8
    public final U7 b(int i, U7 u72, long j6) {
        int[] iArr = this.f33587g;
        int r9 = AbstractC3159eu.r(iArr, i + 1, false, false);
        int i6 = iArr[r9];
        int i9 = this.f33586f[r9];
        this.f33588h[r9].b(i - i6, u72, j6);
        Object obj = this.i[r9];
        if (!U7.f27891m.equals(u72.f27893a)) {
            obj = Pair.create(obj, u72.f27893a);
        }
        u72.f27893a = obj;
        u72.f27902k += i9;
        u72.f27903l += i9;
        return u72;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3604n8
    public final int c() {
        return this.f33585e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3604n8
    public final K7 d(int i, K7 k72, boolean z3) {
        int[] iArr = this.f33586f;
        int r9 = AbstractC3159eu.r(iArr, i + 1, false, false);
        int i6 = this.f33587g[r9];
        this.f33588h[r9].d(i - iArr[r9], k72, z3);
        k72.f25867c += i6;
        if (z3) {
            Object obj = this.i[r9];
            Object obj2 = k72.f25866b;
            obj2.getClass();
            k72.f25866b = Pair.create(obj, obj2);
        }
        return k72;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3604n8
    public final int e(Object obj) {
        int e9;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.f33589j.get(obj2);
            int intValue = num == null ? -1 : num.intValue();
            if (intValue != -1 && (e9 = this.f33588h[intValue].e(obj3)) != -1) {
                return this.f33586f[intValue] + e9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3604n8
    public final Object f(int i) {
        int[] iArr = this.f33586f;
        int r9 = AbstractC3159eu.r(iArr, i + 1, false, false);
        return Pair.create(this.i[r9], this.f33588h[r9].f(i - iArr[r9]));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3604n8
    public final int h(int i, int i6, boolean z3) {
        int[] iArr = this.f33587g;
        int r9 = AbstractC3159eu.r(iArr, i + 1, false, false);
        int i9 = iArr[r9];
        AbstractC3604n8[] abstractC3604n8Arr = this.f33588h;
        int h9 = abstractC3604n8Arr[r9].h(i - i9, i6 != 2 ? i6 : 0, z3);
        if (h9 != -1) {
            return i9 + h9;
        }
        int p9 = p(r9, z3);
        while (p9 != -1 && abstractC3604n8Arr[p9].g()) {
            p9 = p(p9, z3);
        }
        if (p9 != -1) {
            return abstractC3604n8Arr[p9].k(z3) + iArr[p9];
        }
        if (i6 == 2) {
            return k(z3);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3604n8
    public final int i(int i) {
        int[] iArr = this.f33587g;
        int r9 = AbstractC3159eu.r(iArr, i + 1, false, false);
        int i6 = iArr[r9];
        AbstractC3604n8[] abstractC3604n8Arr = this.f33588h;
        int i9 = abstractC3604n8Arr[r9].i(i - i6);
        if (i9 != -1) {
            return i6 + i9;
        }
        int q8 = q(r9, false);
        while (q8 != -1 && abstractC3604n8Arr[q8].g()) {
            q8 = q(q8, false);
        }
        if (q8 == -1) {
            return -1;
        }
        return abstractC3604n8Arr[q8].j(false) + iArr[q8];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3604n8
    public final int j(boolean z3) {
        int i;
        int i6 = this.f33582b;
        if (i6 != 0) {
            if (z3) {
                int[] iArr = this.f33583c.f25924b;
                int length = iArr.length;
                i = length > 0 ? iArr[length - 1] : -1;
            } else {
                i = i6 - 1;
            }
            do {
                AbstractC3604n8[] abstractC3604n8Arr = this.f33588h;
                if (!abstractC3604n8Arr[i].g()) {
                    return abstractC3604n8Arr[i].j(z3) + this.f33587g[i];
                }
                i = q(i, z3);
            } while (i != -1);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3604n8
    public final int k(boolean z3) {
        if (this.f33582b != 0) {
            int i = 0;
            if (z3) {
                int[] iArr = this.f33583c.f25924b;
                i = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                AbstractC3604n8[] abstractC3604n8Arr = this.f33588h;
                if (!abstractC3604n8Arr[i].g()) {
                    return abstractC3604n8Arr[i].k(z3) + this.f33587g[i];
                }
                i = p(i, z3);
            } while (i != -1);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3604n8
    public final K7 o(Object obj, K7 k72) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f33589j.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        int i = this.f33587g[intValue];
        this.f33588h[intValue].o(obj3, k72);
        k72.f25867c += i;
        k72.f25866b = obj;
        return k72;
    }

    public final int p(int i, boolean z3) {
        if (!z3) {
            if (i >= this.f33582b - 1) {
                return -1;
            }
            return i + 1;
        }
        KQ kq = this.f33583c;
        int i6 = kq.f25925c[i] + 1;
        int[] iArr = kq.f25924b;
        if (i6 < iArr.length) {
            return iArr[i6];
        }
        return -1;
    }

    public final int q(int i, boolean z3) {
        if (!z3) {
            if (i <= 0) {
                return -1;
            }
            return i - 1;
        }
        KQ kq = this.f33583c;
        int i6 = kq.f25925c[i] - 1;
        if (i6 >= 0) {
            return kq.f25924b[i6];
        }
        return -1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3835rO(List list, KQ kq) {
        this(r0, r1, kq);
        AbstractC3604n8[] abstractC3604n8Arr = new AbstractC3604n8[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        int i6 = 0;
        while (it.hasNext()) {
            abstractC3604n8Arr[i6] = ((InterfaceC3190fO) it.next()).f();
            i6++;
        }
        Object[] objArr = new Object[list.size()];
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((InterfaceC3190fO) it2.next()).c();
            i++;
        }
    }
}
