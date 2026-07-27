package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class EO extends AbstractC3832r8 {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f24710k = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f24711b;

    /* renamed from: c, reason: collision with root package name */
    public final XQ f24712c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24713d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24714e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f24715f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f24716g;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC3832r8[] f24717h;
    public final Object[] i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f24718j;

    public EO(AbstractC3832r8[] abstractC3832r8Arr, Object[] objArr, XQ xq) {
        this.f24712c = xq;
        this.f24711b = xq.f28650b.length;
        this.f24717h = abstractC3832r8Arr;
        int length = abstractC3832r8Arr.length;
        this.f24715f = new int[length];
        this.f24716g = new int[length];
        this.i = objArr;
        this.f24718j = new HashMap();
        int i = 0;
        int i4 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i < abstractC3832r8Arr.length) {
            AbstractC3832r8 abstractC3832r8 = abstractC3832r8Arr[i];
            this.f24717h[i10] = abstractC3832r8;
            this.f24716g[i10] = i4;
            this.f24715f[i10] = i9;
            i4 += abstractC3832r8.a();
            i9 += this.f24717h[i10].c();
            this.f24718j.put(objArr[i10], Integer.valueOf(i10));
            i++;
            i10++;
        }
        this.f24713d = i4;
        this.f24714e = i9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3832r8
    public final int a() {
        return this.f24713d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3832r8
    public final Y7 b(int i, Y7 y72, long j9) {
        int[] iArr = this.f24716g;
        int r9 = AbstractC3548lu.r(iArr, i + 1, false, false);
        int i4 = iArr[r9];
        int i9 = this.f24715f[r9];
        this.f24717h[r9].b(i - i4, y72, j9);
        Object obj = this.i[r9];
        if (!Y7.f28792m.equals(y72.f28794a)) {
            obj = Pair.create(obj, y72.f28794a);
        }
        y72.f28794a = obj;
        y72.f28803k += i9;
        y72.f28804l += i9;
        return y72;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3832r8
    public final int c() {
        return this.f24714e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3832r8
    public final L7 d(int i, L7 l72, boolean z8) {
        int[] iArr = this.f24715f;
        int r9 = AbstractC3548lu.r(iArr, i + 1, false, false);
        int i4 = this.f24716g[r9];
        this.f24717h[r9].d(i - iArr[r9], l72, z8);
        l72.f26108c += i4;
        if (z8) {
            Object obj = this.i[r9];
            Object obj2 = l72.f26107b;
            obj2.getClass();
            l72.f26107b = Pair.create(obj, obj2);
        }
        return l72;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3832r8
    public final int e(Object obj) {
        int e6;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.f24718j.get(obj2);
            int intValue = num == null ? -1 : num.intValue();
            if (intValue != -1 && (e6 = this.f24717h[intValue].e(obj3)) != -1) {
                return this.f24715f[intValue] + e6;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3832r8
    public final Object f(int i) {
        int[] iArr = this.f24715f;
        int r9 = AbstractC3548lu.r(iArr, i + 1, false, false);
        return Pair.create(this.i[r9], this.f24717h[r9].f(i - iArr[r9]));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3832r8
    public final int h(int i, int i4, boolean z8) {
        int[] iArr = this.f24716g;
        int r9 = AbstractC3548lu.r(iArr, i + 1, false, false);
        int i9 = iArr[r9];
        AbstractC3832r8[] abstractC3832r8Arr = this.f24717h;
        int h9 = abstractC3832r8Arr[r9].h(i - i9, i4 != 2 ? i4 : 0, z8);
        if (h9 != -1) {
            return i9 + h9;
        }
        int p6 = p(r9, z8);
        while (p6 != -1 && abstractC3832r8Arr[p6].g()) {
            p6 = p(p6, z8);
        }
        if (p6 != -1) {
            return abstractC3832r8Arr[p6].k(z8) + iArr[p6];
        }
        if (i4 == 2) {
            return k(z8);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3832r8
    public final int i(int i) {
        int[] iArr = this.f24716g;
        int r9 = AbstractC3548lu.r(iArr, i + 1, false, false);
        int i4 = iArr[r9];
        AbstractC3832r8[] abstractC3832r8Arr = this.f24717h;
        int i9 = abstractC3832r8Arr[r9].i(i - i4);
        if (i9 != -1) {
            return i4 + i9;
        }
        int q6 = q(r9, false);
        while (q6 != -1 && abstractC3832r8Arr[q6].g()) {
            q6 = q(q6, false);
        }
        if (q6 == -1) {
            return -1;
        }
        return abstractC3832r8Arr[q6].j(false) + iArr[q6];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3832r8
    public final int j(boolean z8) {
        int i;
        int i4 = this.f24711b;
        if (i4 != 0) {
            if (z8) {
                int[] iArr = this.f24712c.f28650b;
                int length = iArr.length;
                i = length > 0 ? iArr[length - 1] : -1;
            } else {
                i = i4 - 1;
            }
            do {
                AbstractC3832r8[] abstractC3832r8Arr = this.f24717h;
                if (!abstractC3832r8Arr[i].g()) {
                    return abstractC3832r8Arr[i].j(z8) + this.f24716g[i];
                }
                i = q(i, z8);
            } while (i != -1);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3832r8
    public final int k(boolean z8) {
        if (this.f24711b != 0) {
            int i = 0;
            if (z8) {
                int[] iArr = this.f24712c.f28650b;
                i = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                AbstractC3832r8[] abstractC3832r8Arr = this.f24717h;
                if (!abstractC3832r8Arr[i].g()) {
                    return abstractC3832r8Arr[i].k(z8) + this.f24716g[i];
                }
                i = p(i, z8);
            } while (i != -1);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3832r8
    public final L7 o(Object obj, L7 l72) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f24718j.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        int i = this.f24716g[intValue];
        this.f24717h[intValue].o(obj3, l72);
        l72.f26108c += i;
        l72.f26107b = obj;
        return l72;
    }

    public final int p(int i, boolean z8) {
        if (!z8) {
            if (i >= this.f24711b - 1) {
                return -1;
            }
            return i + 1;
        }
        XQ xq = this.f24712c;
        int i4 = xq.f28651c[i] + 1;
        int[] iArr = xq.f28650b;
        if (i4 < iArr.length) {
            return iArr[i4];
        }
        return -1;
    }

    public final int q(int i, boolean z8) {
        if (!z8) {
            if (i <= 0) {
                return -1;
            }
            return i - 1;
        }
        XQ xq = this.f24712c;
        int i4 = xq.f28651c[i] - 1;
        if (i4 >= 0) {
            return xq.f28650b[i4];
        }
        return -1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EO(List list, XQ xq) {
        this(r0, r1, xq);
        AbstractC3832r8[] abstractC3832r8Arr = new AbstractC3832r8[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        int i4 = 0;
        while (it.hasNext()) {
            abstractC3832r8Arr[i4] = ((InterfaceC3902sO) it.next()).d();
            i4++;
        }
        Object[] objArr = new Object[list.size()];
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((InterfaceC3902sO) it2.next()).a();
            i++;
        }
    }
}
