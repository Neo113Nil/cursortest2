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
    public static final Object f24941C = new Object();

    /* renamed from: A, reason: collision with root package name */
    public transient EB f24942A;

    /* renamed from: B, reason: collision with root package name */
    public transient C4254zB f24943B;

    /* renamed from: n, reason: collision with root package name */
    public transient Object f24944n;

    /* renamed from: u, reason: collision with root package name */
    public transient int[] f24945u;

    /* renamed from: v, reason: collision with root package name */
    public transient Object[] f24946v;

    /* renamed from: w, reason: collision with root package name */
    public transient Object[] f24947w;

    /* renamed from: x, reason: collision with root package name */
    public transient int f24948x = Math.min(Math.max(3, 1), 1073741823);

    /* renamed from: y, reason: collision with root package name */
    public transient int f24949y;

    /* renamed from: z, reason: collision with root package name */
    public transient EB f24950z;

    public GB() {
    }

    public final int[] a() {
        int[] iArr = this.f24945u;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] c() {
        Object[] objArr = this.f24946v;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (e()) {
            return;
        }
        this.f24948x += 32;
        Map f3 = f();
        if (f3 != null) {
            this.f24948x = Math.min(Math.max(size(), 3), 1073741823);
            f3.clear();
            this.f24944n = null;
            this.f24949y = 0;
            return;
        }
        Arrays.fill(c(), 0, this.f24949y, (Object) null);
        Arrays.fill(d(), 0, this.f24949y, (Object) null);
        Object obj = this.f24944n;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(a(), 0, this.f24949y, 0);
        this.f24949y = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map f3 = f();
        return f3 != null ? f3.containsKey(obj) : j(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map f3 = f();
        if (f3 != null) {
            return f3.containsValue(obj);
        }
        for (int i = 0; i < this.f24949y; i++) {
            if (Objects.equals(obj, d()[i])) {
                return true;
            }
        }
        return false;
    }

    public final Object[] d() {
        Object[] objArr = this.f24947w;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final boolean e() {
        return this.f24944n == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        EB eb = this.f24942A;
        if (eb != null) {
            return eb;
        }
        EB eb2 = new EB(this, 0);
        this.f24942A = eb2;
        return eb2;
    }

    public final Map f() {
        Object obj = this.f24944n;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void g(int i, int i6) {
        Object obj = this.f24944n;
        Objects.requireNonNull(obj);
        int[] a9 = a();
        Object[] c9 = c();
        Object[] d2 = d();
        int size = size();
        int i9 = size - 1;
        if (i >= i9) {
            c9[i] = null;
            d2[i] = null;
            a9[i] = 0;
            return;
        }
        int i10 = i + 1;
        Object obj2 = c9[i9];
        c9[i] = obj2;
        d2[i] = d2[i9];
        c9[i9] = null;
        d2[i9] = null;
        a9[i] = a9[i9];
        a9[i9] = 0;
        int o6 = AbstractC2639Kg.o(obj2) & i6;
        int q8 = AbstractC2968bG.q(o6, obj);
        if (q8 == size) {
            AbstractC2968bG.x(o6, i10, obj);
            return;
        }
        while (true) {
            int i11 = q8 - 1;
            int i12 = a9[i11];
            int i13 = i12 & i6;
            if (i13 == size) {
                a9[i11] = (i12 & (~i6)) | (i6 & i10);
                return;
            }
            q8 = i13;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map f3 = f();
        if (f3 != null) {
            return f3.get(obj);
        }
        int j6 = j(obj);
        if (j6 == -1) {
            return null;
        }
        return d()[j6];
    }

    public final int h() {
        return (1 << (this.f24948x & 31)) - 1;
    }

    public final int i(int i, int i6, int i9, int i10) {
        int i11 = i6 - 1;
        Object e9 = AbstractC2968bG.e(i6);
        if (i10 != 0) {
            AbstractC2968bG.x(i9 & i11, i10 + 1, e9);
        }
        Object obj = this.f24944n;
        Objects.requireNonNull(obj);
        int[] a9 = a();
        for (int i12 = 0; i12 <= i; i12++) {
            int q8 = AbstractC2968bG.q(i12, obj);
            while (q8 != 0) {
                int i13 = q8 - 1;
                int i14 = a9[i13];
                int i15 = ((~i) & i14) | i12;
                int i16 = i15 & i11;
                int q9 = AbstractC2968bG.q(i16, e9);
                AbstractC2968bG.x(i16, q8, e9);
                a9[i13] = ((~i11) & i15) | (q9 & i11);
                q8 = i14 & i;
            }
        }
        this.f24944n = e9;
        this.f24948x = ((32 - Integer.numberOfLeadingZeros(i11)) & 31) | (this.f24948x & (-32));
        return i11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final int j(Object obj) {
        if (e()) {
            return -1;
        }
        int o6 = AbstractC2639Kg.o(obj);
        int h9 = h();
        Object obj2 = this.f24944n;
        Objects.requireNonNull(obj2);
        int q8 = AbstractC2968bG.q(o6 & h9, obj2);
        if (q8 != 0) {
            int i = ~h9;
            int i6 = o6 & i;
            do {
                int i9 = q8 - 1;
                int i10 = a()[i9];
                if ((i10 & i) == i6 && Objects.equals(obj, c()[i9])) {
                    return i9;
                }
                q8 = i10 & h9;
            } while (q8 != 0);
        }
        return -1;
    }

    public final Object k(Object obj) {
        if (!e()) {
            int h9 = h();
            Object obj2 = this.f24944n;
            Objects.requireNonNull(obj2);
            int E8 = AbstractC2968bG.E(obj, null, h9, obj2, a(), c(), null);
            if (E8 != -1) {
                Object obj3 = d()[E8];
                g(E8, h9);
                this.f24949y--;
                this.f24948x += 32;
                return obj3;
            }
        }
        return f24941C;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        EB eb = this.f24950z;
        if (eb != null) {
            return eb;
        }
        EB eb2 = new EB(this, 1);
        this.f24950z = eb2;
        return eb2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        int i6 = 32;
        if (e()) {
            AbstractC2772Sd.I("Arrays already allocated", e());
            int i9 = this.f24948x;
            int max = Math.max(i9 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f24944n = AbstractC2968bG.e(max2);
            this.f24948x = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.f24948x & (-32));
            this.f24945u = new int[i9];
            this.f24946v = new Object[i9];
            this.f24947w = new Object[i9];
        }
        Map f3 = f();
        if (f3 != null) {
            return f3.put(obj, obj2);
        }
        int[] a9 = a();
        Object[] c9 = c();
        Object[] d2 = d();
        int i10 = this.f24949y;
        int i11 = i10 + 1;
        int o6 = AbstractC2639Kg.o(obj);
        int h9 = h();
        int i12 = o6 & h9;
        Object obj3 = this.f24944n;
        Objects.requireNonNull(obj3);
        int q8 = AbstractC2968bG.q(i12, obj3);
        if (q8 == 0) {
            if (i11 > h9) {
                h9 = i(h9, (h9 + 1) * (h9 < 32 ? 4 : 2), o6, i10);
            } else {
                Object obj4 = this.f24944n;
                Objects.requireNonNull(obj4);
                AbstractC2968bG.x(i12, i11, obj4);
            }
            i = 1;
        } else {
            int i13 = ~h9;
            int i14 = o6 & i13;
            int i15 = 0;
            while (true) {
                int i16 = q8 - 1;
                int i17 = a9[i16];
                i = 1;
                int i18 = i17 & i13;
                int i19 = i6;
                if (i18 == i14 && Objects.equals(obj, c9[i16])) {
                    Object obj5 = d2[i16];
                    d2[i16] = obj2;
                    return obj5;
                }
                int i20 = i17 & h9;
                int i21 = i15 + 1;
                if (i20 != 0) {
                    i15 = i21;
                    q8 = i20;
                    i6 = i19;
                } else {
                    if (i21 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(h() + 1, 1.0f);
                        int i22 = isEmpty() ? -1 : 0;
                        while (i22 >= 0) {
                            linkedHashMap.put(c()[i22], d()[i22]);
                            int i23 = i22 + 1;
                            i22 = i23 < this.f24949y ? i23 : -1;
                        }
                        this.f24944n = linkedHashMap;
                        this.f24945u = null;
                        this.f24946v = null;
                        this.f24947w = null;
                        this.f24948x += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i11 > h9) {
                        h9 = i(h9, (h9 + 1) * (h9 < i19 ? 4 : 2), o6, i10);
                    } else {
                        a9[i16] = i18 | (i11 & h9);
                    }
                }
            }
        }
        int length = a().length;
        if (i11 > length) {
            int i24 = i;
            int min = Math.min(1073741823, (Math.max(i24, length >>> 1) + length) | i24);
            if (min != length) {
                this.f24945u = Arrays.copyOf(a(), min);
                this.f24946v = Arrays.copyOf(c(), min);
                this.f24947w = Arrays.copyOf(d(), min);
            }
        }
        a()[i10] = (~h9) & o6;
        c()[i10] = obj;
        d()[i10] = obj2;
        this.f24949y = i11;
        this.f24948x += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map f3 = f();
        if (f3 != null) {
            return f3.remove(obj);
        }
        Object k9 = k(obj);
        if (k9 == f24941C) {
            return null;
        }
        return k9;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map f3 = f();
        return f3 != null ? f3.size() : this.f24949y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C4254zB c4254zB = this.f24943B;
        if (c4254zB != null) {
            return c4254zB;
        }
        C4254zB c4254zB2 = new C4254zB(1, this);
        this.f24943B = c4254zB2;
        return c4254zB2;
    }

    public GB(int i) {
    }
}
