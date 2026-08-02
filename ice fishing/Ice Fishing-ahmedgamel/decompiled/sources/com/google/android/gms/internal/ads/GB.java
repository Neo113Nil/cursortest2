package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class GB extends AbstractMap implements Serializable {

    /* renamed from: C, reason: collision with root package name */
    public static final Object f25731C = new Object();

    /* renamed from: A, reason: collision with root package name */
    public transient EB f25732A;

    /* renamed from: B, reason: collision with root package name */
    public transient C4277zB f25733B;

    /* renamed from: n, reason: collision with root package name */
    public transient Object f25734n;

    /* renamed from: u, reason: collision with root package name */
    public transient int[] f25735u;

    /* renamed from: v, reason: collision with root package name */
    public transient Object[] f25736v;

    /* renamed from: w, reason: collision with root package name */
    public transient Object[] f25737w;

    /* renamed from: x, reason: collision with root package name */
    public transient int f25738x = Math.min(Math.max(3, 1), 1073741823);

    /* renamed from: y, reason: collision with root package name */
    public transient int f25739y;

    /* renamed from: z, reason: collision with root package name */
    public transient EB f25740z;

    public GB() {
    }

    public final int[] a() {
        int[] iArr = this.f25735u;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] c() {
        Object[] objArr = this.f25736v;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (e()) {
            return;
        }
        this.f25738x += 32;
        Map f2 = f();
        if (f2 != null) {
            this.f25738x = Math.min(Math.max(size(), 3), 1073741823);
            f2.clear();
            this.f25734n = null;
            this.f25739y = 0;
            return;
        }
        Arrays.fill(c(), 0, this.f25739y, (Object) null);
        Arrays.fill(d(), 0, this.f25739y, (Object) null);
        Object obj = this.f25734n;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(a(), 0, this.f25739y, 0);
        this.f25739y = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map f2 = f();
        return f2 != null ? f2.containsKey(obj) : j(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map f2 = f();
        if (f2 != null) {
            return f2.containsValue(obj);
        }
        for (int i = 0; i < this.f25739y; i++) {
            if (Objects.equals(obj, d()[i])) {
                return true;
            }
        }
        return false;
    }

    public final Object[] d() {
        Object[] objArr = this.f25737w;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final boolean e() {
        return this.f25734n == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        EB eb = this.f25732A;
        if (eb != null) {
            return eb;
        }
        EB eb2 = new EB(this, 0);
        this.f25732A = eb2;
        return eb2;
    }

    public final Map f() {
        Object obj = this.f25734n;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void g(int i, int i4) {
        Object obj = this.f25734n;
        Objects.requireNonNull(obj);
        int[] a9 = a();
        Object[] c9 = c();
        Object[] d9 = d();
        int size = size();
        int i6 = size - 1;
        if (i >= i6) {
            c9[i] = null;
            d9[i] = null;
            a9[i] = 0;
            return;
        }
        int i9 = i + 1;
        Object obj2 = c9[i6];
        c9[i] = obj2;
        d9[i] = d9[i6];
        c9[i6] = null;
        d9[i6] = null;
        a9[i] = a9[i6];
        a9[i6] = 0;
        int o4 = AbstractC2659Kg.o(obj2) & i4;
        int q8 = AbstractC2991bG.q(o4, obj);
        if (q8 == size) {
            AbstractC2991bG.x(o4, i9, obj);
            return;
        }
        while (true) {
            int i10 = q8 - 1;
            int i11 = a9[i10];
            int i12 = i11 & i4;
            if (i12 == size) {
                a9[i10] = (i11 & (~i4)) | (i4 & i9);
                return;
            }
            q8 = i12;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map f2 = f();
        if (f2 != null) {
            return f2.get(obj);
        }
        int j6 = j(obj);
        if (j6 == -1) {
            return null;
        }
        return d()[j6];
    }

    public final int h() {
        return (1 << (this.f25738x & 31)) - 1;
    }

    public final int i(int i, int i4, int i6, int i9) {
        int i10 = i4 - 1;
        Object e9 = AbstractC2991bG.e(i4);
        if (i9 != 0) {
            AbstractC2991bG.x(i6 & i10, i9 + 1, e9);
        }
        Object obj = this.f25734n;
        Objects.requireNonNull(obj);
        int[] a9 = a();
        for (int i11 = 0; i11 <= i; i11++) {
            int q8 = AbstractC2991bG.q(i11, obj);
            while (q8 != 0) {
                int i12 = q8 - 1;
                int i13 = a9[i12];
                int i14 = ((~i) & i13) | i11;
                int i15 = i14 & i10;
                int q9 = AbstractC2991bG.q(i15, e9);
                AbstractC2991bG.x(i15, q8, e9);
                a9[i12] = ((~i10) & i14) | (q9 & i10);
                q8 = i13 & i;
            }
        }
        this.f25734n = e9;
        this.f25738x = ((32 - Integer.numberOfLeadingZeros(i10)) & 31) | (this.f25738x & (-32));
        return i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final int j(Object obj) {
        if (e()) {
            return -1;
        }
        int o4 = AbstractC2659Kg.o(obj);
        int h3 = h();
        Object obj2 = this.f25734n;
        Objects.requireNonNull(obj2);
        int q8 = AbstractC2991bG.q(o4 & h3, obj2);
        if (q8 != 0) {
            int i = ~h3;
            int i4 = o4 & i;
            do {
                int i6 = q8 - 1;
                int i9 = a()[i6];
                if ((i9 & i) == i4 && Objects.equals(obj, c()[i6])) {
                    return i6;
                }
                q8 = i9 & h3;
            } while (q8 != 0);
        }
        return -1;
    }

    public final Object k(Object obj) {
        if (!e()) {
            int h3 = h();
            Object obj2 = this.f25734n;
            Objects.requireNonNull(obj2);
            int E8 = AbstractC2991bG.E(obj, null, h3, obj2, a(), c(), null);
            if (E8 != -1) {
                Object obj3 = d()[E8];
                g(E8, h3);
                this.f25739y--;
                this.f25738x += 32;
                return obj3;
            }
        }
        return f25731C;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        EB eb = this.f25740z;
        if (eb != null) {
            return eb;
        }
        EB eb2 = new EB(this, 1);
        this.f25740z = eb2;
        return eb2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        int i4 = 32;
        if (e()) {
            AbstractC2792Sd.I("Arrays already allocated", e());
            int i6 = this.f25738x;
            int max = Math.max(i6 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f25734n = AbstractC2991bG.e(max2);
            this.f25738x = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.f25738x & (-32));
            this.f25735u = new int[i6];
            this.f25736v = new Object[i6];
            this.f25737w = new Object[i6];
        }
        Map f2 = f();
        if (f2 != null) {
            return f2.put(obj, obj2);
        }
        int[] a9 = a();
        Object[] c9 = c();
        Object[] d9 = d();
        int i9 = this.f25739y;
        int i10 = i9 + 1;
        int o4 = AbstractC2659Kg.o(obj);
        int h3 = h();
        int i11 = o4 & h3;
        Object obj3 = this.f25734n;
        Objects.requireNonNull(obj3);
        int q8 = AbstractC2991bG.q(i11, obj3);
        if (q8 == 0) {
            if (i10 > h3) {
                h3 = i(h3, (h3 + 1) * (h3 < 32 ? 4 : 2), o4, i9);
            } else {
                Object obj4 = this.f25734n;
                Objects.requireNonNull(obj4);
                AbstractC2991bG.x(i11, i10, obj4);
            }
            i = 1;
        } else {
            int i12 = ~h3;
            int i13 = o4 & i12;
            int i14 = 0;
            while (true) {
                int i15 = q8 - 1;
                int i16 = a9[i15];
                i = 1;
                int i17 = i16 & i12;
                int i18 = i4;
                if (i17 == i13 && Objects.equals(obj, c9[i15])) {
                    Object obj5 = d9[i15];
                    d9[i15] = obj2;
                    return obj5;
                }
                int i19 = i16 & h3;
                int i20 = i14 + 1;
                if (i19 != 0) {
                    i14 = i20;
                    q8 = i19;
                    i4 = i18;
                } else {
                    if (i20 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(h() + 1, 1.0f);
                        int i21 = isEmpty() ? -1 : 0;
                        while (i21 >= 0) {
                            linkedHashMap.put(c()[i21], d()[i21]);
                            int i22 = i21 + 1;
                            i21 = i22 < this.f25739y ? i22 : -1;
                        }
                        this.f25734n = linkedHashMap;
                        this.f25735u = null;
                        this.f25736v = null;
                        this.f25737w = null;
                        this.f25738x += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i10 > h3) {
                        h3 = i(h3, (h3 + 1) * (h3 < i18 ? 4 : 2), o4, i9);
                    } else {
                        a9[i15] = i17 | (i10 & h3);
                    }
                }
            }
        }
        int length = a().length;
        if (i10 > length) {
            int i23 = i;
            int min = Math.min(1073741823, (Math.max(i23, length >>> 1) + length) | i23);
            if (min != length) {
                this.f25735u = Arrays.copyOf(a(), min);
                this.f25736v = Arrays.copyOf(c(), min);
                this.f25737w = Arrays.copyOf(d(), min);
            }
        }
        a()[i9] = (~h3) & o4;
        c()[i9] = obj;
        d()[i9] = obj2;
        this.f25739y = i10;
        this.f25738x += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map f2 = f();
        if (f2 != null) {
            return f2.remove(obj);
        }
        Object k9 = k(obj);
        if (k9 == f25731C) {
            return null;
        }
        return k9;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map f2 = f();
        return f2 != null ? f2.size() : this.f25739y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C4277zB c4277zB = this.f25733B;
        if (c4277zB != null) {
            return c4277zB;
        }
        C4277zB c4277zB2 = new C4277zB(1, this);
        this.f25733B = c4277zB2;
        return c4277zB2;
    }

    public GB(int i) {
    }
}
