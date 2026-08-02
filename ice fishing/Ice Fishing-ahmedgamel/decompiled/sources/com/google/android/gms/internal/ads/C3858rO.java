package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.rO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3858rO extends AbstractC3627n8 {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f34349k = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f34350b;

    /* renamed from: c, reason: collision with root package name */
    public final NQ f34351c;

    /* renamed from: d, reason: collision with root package name */
    public final int f34352d;

    /* renamed from: e, reason: collision with root package name */
    public final int f34353e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f34354f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f34355g;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC3627n8[] f34356h;
    public final Object[] i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f34357j;

    public C3858rO(AbstractC3627n8[] abstractC3627n8Arr, Object[] objArr, NQ nq) {
        this.f34351c = nq;
        this.f34350b = nq.f27274b.length;
        this.f34356h = abstractC3627n8Arr;
        int length = abstractC3627n8Arr.length;
        this.f34354f = new int[length];
        this.f34355g = new int[length];
        this.i = objArr;
        this.f34357j = new HashMap();
        int i = 0;
        int i4 = 0;
        int i6 = 0;
        int i9 = 0;
        while (i < abstractC3627n8Arr.length) {
            AbstractC3627n8 abstractC3627n8 = abstractC3627n8Arr[i];
            this.f34356h[i9] = abstractC3627n8;
            this.f34355g[i9] = i4;
            this.f34354f[i9] = i6;
            i4 += abstractC3627n8.a();
            i6 += this.f34356h[i9].c();
            this.f34357j.put(objArr[i9], Integer.valueOf(i9));
            i++;
            i9++;
        }
        this.f34352d = i4;
        this.f34353e = i6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3627n8
    public final int a() {
        return this.f34352d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3627n8
    public final U7 b(int i, U7 u72, long j6) {
        int[] iArr = this.f34355g;
        int r9 = AbstractC3182eu.r(iArr, i + 1, false, false);
        int i4 = iArr[r9];
        int i6 = this.f34354f[r9];
        this.f34356h[r9].b(i - i4, u72, j6);
        Object obj = this.i[r9];
        if (!U7.f28688m.equals(u72.f28690a)) {
            obj = Pair.create(obj, u72.f28690a);
        }
        u72.f28690a = obj;
        u72.f28699k += i6;
        u72.f28700l += i6;
        return u72;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3627n8
    public final int c() {
        return this.f34353e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3627n8
    public final K7 d(int i, K7 k72, boolean z6) {
        int[] iArr = this.f34354f;
        int r9 = AbstractC3182eu.r(iArr, i + 1, false, false);
        int i4 = this.f34355g[r9];
        this.f34356h[r9].d(i - iArr[r9], k72, z6);
        k72.f26619c += i4;
        if (z6) {
            Object obj = this.i[r9];
            Object obj2 = k72.f26618b;
            obj2.getClass();
            k72.f26618b = Pair.create(obj, obj2);
        }
        return k72;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3627n8
    public final int e(Object obj) {
        int e9;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.f34357j.get(obj2);
            int intValue = num == null ? -1 : num.intValue();
            if (intValue != -1 && (e9 = this.f34356h[intValue].e(obj3)) != -1) {
                return this.f34354f[intValue] + e9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3627n8
    public final Object f(int i) {
        int[] iArr = this.f34354f;
        int r9 = AbstractC3182eu.r(iArr, i + 1, false, false);
        return Pair.create(this.i[r9], this.f34356h[r9].f(i - iArr[r9]));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3627n8
    public final int h(int i, int i4, boolean z6) {
        int[] iArr = this.f34355g;
        int r9 = AbstractC3182eu.r(iArr, i + 1, false, false);
        int i6 = iArr[r9];
        AbstractC3627n8[] abstractC3627n8Arr = this.f34356h;
        int h3 = abstractC3627n8Arr[r9].h(i - i6, i4 != 2 ? i4 : 0, z6);
        if (h3 != -1) {
            return i6 + h3;
        }
        int p9 = p(r9, z6);
        while (p9 != -1 && abstractC3627n8Arr[p9].g()) {
            p9 = p(p9, z6);
        }
        if (p9 != -1) {
            return abstractC3627n8Arr[p9].k(z6) + iArr[p9];
        }
        if (i4 == 2) {
            return k(z6);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3627n8
    public final int i(int i) {
        int[] iArr = this.f34355g;
        int r9 = AbstractC3182eu.r(iArr, i + 1, false, false);
        int i4 = iArr[r9];
        AbstractC3627n8[] abstractC3627n8Arr = this.f34356h;
        int i6 = abstractC3627n8Arr[r9].i(i - i4);
        if (i6 != -1) {
            return i4 + i6;
        }
        int q8 = q(r9, false);
        while (q8 != -1 && abstractC3627n8Arr[q8].g()) {
            q8 = q(q8, false);
        }
        if (q8 == -1) {
            return -1;
        }
        return abstractC3627n8Arr[q8].j(false) + iArr[q8];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3627n8
    public final int j(boolean z6) {
        int i;
        int i4 = this.f34350b;
        if (i4 != 0) {
            if (z6) {
                int[] iArr = this.f34351c.f27274b;
                int length = iArr.length;
                i = length > 0 ? iArr[length - 1] : -1;
            } else {
                i = i4 - 1;
            }
            do {
                AbstractC3627n8[] abstractC3627n8Arr = this.f34356h;
                if (!abstractC3627n8Arr[i].g()) {
                    return abstractC3627n8Arr[i].j(z6) + this.f34355g[i];
                }
                i = q(i, z6);
            } while (i != -1);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3627n8
    public final int k(boolean z6) {
        if (this.f34350b != 0) {
            int i = 0;
            if (z6) {
                int[] iArr = this.f34351c.f27274b;
                i = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                AbstractC3627n8[] abstractC3627n8Arr = this.f34356h;
                if (!abstractC3627n8Arr[i].g()) {
                    return abstractC3627n8Arr[i].k(z6) + this.f34355g[i];
                }
                i = p(i, z6);
            } while (i != -1);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3627n8
    public final K7 o(Object obj, K7 k72) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f34357j.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        int i = this.f34355g[intValue];
        this.f34356h[intValue].o(obj3, k72);
        k72.f26619c += i;
        k72.f26618b = obj;
        return k72;
    }

    public final int p(int i, boolean z6) {
        if (!z6) {
            if (i >= this.f34350b - 1) {
                return -1;
            }
            return i + 1;
        }
        NQ nq = this.f34351c;
        int i4 = nq.f27275c[i] + 1;
        int[] iArr = nq.f27274b;
        if (i4 < iArr.length) {
            return iArr[i4];
        }
        return -1;
    }

    public final int q(int i, boolean z6) {
        if (!z6) {
            if (i <= 0) {
                return -1;
            }
            return i - 1;
        }
        NQ nq = this.f34351c;
        int i4 = nq.f27275c[i] - 1;
        if (i4 >= 0) {
            return nq.f27274b[i4];
        }
        return -1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3858rO(List list, NQ nq) {
        this(r0, r1, nq);
        AbstractC3627n8[] abstractC3627n8Arr = new AbstractC3627n8[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        int i4 = 0;
        while (it.hasNext()) {
            abstractC3627n8Arr[i4] = ((InterfaceC3213fO) it.next()).f();
            i4++;
        }
        Object[] objArr = new Object[list.size()];
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((InterfaceC3213fO) it2.next()).c();
            i++;
        }
    }
}
