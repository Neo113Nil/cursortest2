package s7;

import a.AbstractC0415a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: s7.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5006f implements Map, Serializable, F7.d {

    /* renamed from: G, reason: collision with root package name */
    public static final C5006f f40506G;

    /* renamed from: A, reason: collision with root package name */
    public int f40507A;

    /* renamed from: B, reason: collision with root package name */
    public int f40508B;

    /* renamed from: C, reason: collision with root package name */
    public C5007g f40509C;

    /* renamed from: D, reason: collision with root package name */
    public C5008h f40510D;

    /* renamed from: E, reason: collision with root package name */
    public C5007g f40511E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f40512F;

    /* renamed from: n, reason: collision with root package name */
    public Object[] f40513n;

    /* renamed from: u, reason: collision with root package name */
    public Object[] f40514u;

    /* renamed from: v, reason: collision with root package name */
    public int[] f40515v;

    /* renamed from: w, reason: collision with root package name */
    public int[] f40516w;

    /* renamed from: x, reason: collision with root package name */
    public int f40517x;

    /* renamed from: y, reason: collision with root package name */
    public int f40518y;

    /* renamed from: z, reason: collision with root package name */
    public int f40519z;

    static {
        C5006f c5006f = new C5006f(0);
        c5006f.f40512F = true;
        f40506G = c5006f;
    }

    public C5006f() {
        this(8);
    }

    public final int a(Object obj) {
        d();
        while (true) {
            int k6 = k(obj);
            int i = this.f40517x * 2;
            int length = this.f40516w.length / 2;
            if (i > length) {
                i = length;
            }
            int i4 = 0;
            while (true) {
                int[] iArr = this.f40516w;
                int i9 = iArr[k6];
                if (i9 <= 0) {
                    int i10 = this.f40518y;
                    Object[] objArr = this.f40513n;
                    if (i10 < objArr.length) {
                        int i11 = i10 + 1;
                        this.f40518y = i11;
                        objArr[i10] = obj;
                        this.f40515v[i10] = k6;
                        iArr[k6] = i11;
                        this.f40508B++;
                        this.f40507A++;
                        if (i4 > this.f40517x) {
                            this.f40517x = i4;
                        }
                        return i10;
                    }
                    h(1);
                } else {
                    if (kotlin.jvm.internal.h.a(this.f40513n[i9 - 1], obj)) {
                        return -i9;
                    }
                    i4++;
                    if (i4 > i) {
                        l(this.f40516w.length * 2);
                        break;
                    }
                    k6 = k6 == 0 ? this.f40516w.length - 1 : k6 - 1;
                }
            }
        }
    }

    public final C5006f c() {
        d();
        this.f40512F = true;
        if (this.f40508B > 0) {
            return this;
        }
        C5006f c5006f = f40506G;
        kotlin.jvm.internal.h.c(c5006f, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c5006f;
    }

    @Override // java.util.Map
    public final void clear() {
        d();
        int i = this.f40518y - 1;
        if (i >= 0) {
            int i4 = 0;
            while (true) {
                int[] iArr = this.f40515v;
                int i9 = iArr[i4];
                if (i9 >= 0) {
                    this.f40516w[i9] = 0;
                    iArr[i4] = -1;
                }
                if (i4 == i) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        AbstractC0415a.y(this.f40513n, 0, this.f40518y);
        Object[] objArr = this.f40514u;
        if (objArr != null) {
            AbstractC0415a.y(objArr, 0, this.f40518y);
        }
        this.f40508B = 0;
        this.f40518y = 0;
        this.f40507A++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return i(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return j(obj) >= 0;
    }

    public final void d() {
        if (this.f40512F) {
            throw new UnsupportedOperationException();
        }
    }

    public final void e(boolean z8) {
        int i;
        Object[] objArr = this.f40514u;
        int i4 = 0;
        int i9 = 0;
        while (true) {
            i = this.f40518y;
            if (i4 >= i) {
                break;
            }
            int[] iArr = this.f40515v;
            int i10 = iArr[i4];
            if (i10 >= 0) {
                Object[] objArr2 = this.f40513n;
                objArr2[i9] = objArr2[i4];
                if (objArr != null) {
                    objArr[i9] = objArr[i4];
                }
                if (z8) {
                    iArr[i9] = i10;
                    this.f40516w[i10] = i9 + 1;
                }
                i9++;
            }
            i4++;
        }
        AbstractC0415a.y(this.f40513n, i9, i);
        if (objArr != null) {
            AbstractC0415a.y(objArr, i9, this.f40518y);
        }
        this.f40518y = i9;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C5007g c5007g = this.f40511E;
        if (c5007g != null) {
            return c5007g;
        }
        C5007g c5007g2 = new C5007g(this, 0);
        this.f40511E = c5007g2;
        return c5007g2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f40508B == map.size() && f(map.entrySet());
    }

    public final boolean f(Collection m8) {
        kotlin.jvm.internal.h.e(m8, "m");
        for (Object obj : m8) {
            if (obj != null) {
                try {
                    if (!g((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean g(Map.Entry entry) {
        kotlin.jvm.internal.h.e(entry, "entry");
        int i = i(entry.getKey());
        if (i < 0) {
            return false;
        }
        Object[] objArr = this.f40514u;
        kotlin.jvm.internal.h.b(objArr);
        return kotlin.jvm.internal.h.a(objArr[i], entry.getValue());
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int i = i(obj);
        if (i < 0) {
            return null;
        }
        Object[] objArr = this.f40514u;
        kotlin.jvm.internal.h.b(objArr);
        return objArr[i];
    }

    public final void h(int i) {
        Object[] objArr;
        Object[] objArr2 = this.f40513n;
        int length = objArr2.length;
        int i4 = this.f40518y;
        int i9 = length - i4;
        int i10 = i4 - this.f40508B;
        if (i9 < i && i9 + i10 >= i && i10 >= objArr2.length / 4) {
            e(true);
            return;
        }
        int i11 = i4 + i;
        if (i11 < 0) {
            throw new OutOfMemoryError();
        }
        if (i11 > objArr2.length) {
            int length2 = objArr2.length;
            int i12 = length2 + (length2 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            if (i12 - 2147483639 > 0) {
                i12 = i11 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr2, i12);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            this.f40513n = copyOf;
            Object[] objArr3 = this.f40514u;
            if (objArr3 != null) {
                objArr = Arrays.copyOf(objArr3, i12);
                kotlin.jvm.internal.h.d(objArr, "copyOf(...)");
            } else {
                objArr = null;
            }
            this.f40514u = objArr;
            int[] copyOf2 = Arrays.copyOf(this.f40515v, i12);
            kotlin.jvm.internal.h.d(copyOf2, "copyOf(...)");
            this.f40515v = copyOf2;
            int highestOneBit = Integer.highestOneBit((i12 >= 1 ? i12 : 1) * 3);
            if (highestOneBit > this.f40516w.length) {
                l(highestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        C5004d c5004d = new C5004d(this, 0);
        int i = 0;
        while (c5004d.hasNext()) {
            int i4 = c5004d.f2228n;
            C5006f c5006f = (C5006f) c5004d.f2231w;
            if (i4 >= c5006f.f40518y) {
                throw new NoSuchElementException();
            }
            c5004d.f2228n = i4 + 1;
            c5004d.f2229u = i4;
            Object obj = c5006f.f40513n[i4];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = c5006f.f40514u;
            kotlin.jvm.internal.h.b(objArr);
            Object obj2 = objArr[c5004d.f2229u];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c5004d.e();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        int k6 = k(obj);
        int i = this.f40517x;
        while (true) {
            int i4 = this.f40516w[k6];
            if (i4 == 0) {
                return -1;
            }
            if (i4 > 0) {
                int i9 = i4 - 1;
                if (kotlin.jvm.internal.h.a(this.f40513n[i9], obj)) {
                    return i9;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            k6 = k6 == 0 ? this.f40516w.length - 1 : k6 - 1;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f40508B == 0;
    }

    public final int j(Object obj) {
        int i = this.f40518y;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f40515v[i] >= 0) {
                Object[] objArr = this.f40514u;
                kotlin.jvm.internal.h.b(objArr);
                if (kotlin.jvm.internal.h.a(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    public final int k(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f40519z;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C5007g c5007g = this.f40509C;
        if (c5007g != null) {
            return c5007g;
        }
        C5007g c5007g2 = new C5007g(this, 1);
        this.f40509C = c5007g2;
        return c5007g2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f40515v[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i) {
        this.f40507A++;
        int i4 = 0;
        if (this.f40518y > this.f40508B) {
            e(false);
        }
        this.f40516w = new int[i];
        this.f40519z = Integer.numberOfLeadingZeros(i) + 1;
        while (i4 < this.f40518y) {
            int i9 = i4 + 1;
            int k6 = k(this.f40513n[i4]);
            int i10 = this.f40517x;
            while (true) {
                int[] iArr = this.f40516w;
                if (iArr[k6] == 0) {
                    break;
                }
                i10--;
                if (i10 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                k6 = k6 == 0 ? iArr.length - 1 : k6 - 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0024->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(int i) {
        Object[] objArr = this.f40513n;
        kotlin.jvm.internal.h.e(objArr, "<this>");
        objArr[i] = null;
        Object[] objArr2 = this.f40514u;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i4 = this.f40515v[i];
        int i9 = this.f40517x * 2;
        int length = this.f40516w.length / 2;
        if (i9 > length) {
            i9 = length;
        }
        int i10 = i9;
        int i11 = 0;
        int i12 = i4;
        while (true) {
            i4 = i4 == 0 ? this.f40516w.length - 1 : i4 - 1;
            i11++;
            if (i11 > this.f40517x) {
                this.f40516w[i12] = 0;
                break;
            }
            int[] iArr = this.f40516w;
            int i13 = iArr[i4];
            if (i13 == 0) {
                iArr[i12] = 0;
                break;
            }
            if (i13 < 0) {
                iArr[i12] = -1;
            } else {
                int i14 = i13 - 1;
                int k6 = k(this.f40513n[i14]) - i4;
                int[] iArr2 = this.f40516w;
                if ((k6 & (iArr2.length - 1)) >= i11) {
                    iArr2[i12] = i13;
                    this.f40515v[i14] = i12;
                }
                i10--;
                if (i10 >= 0) {
                    this.f40516w[i12] = -1;
                    break;
                }
            }
            i12 = i4;
            i11 = 0;
            i10--;
            if (i10 >= 0) {
            }
        }
        this.f40515v[i] = -1;
        this.f40508B--;
        this.f40507A++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        d();
        int a9 = a(obj);
        Object[] objArr = this.f40514u;
        if (objArr == null) {
            int length = this.f40513n.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f40514u = objArr;
        }
        if (a9 >= 0) {
            objArr[a9] = obj2;
            return null;
        }
        int i = (-a9) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        kotlin.jvm.internal.h.e(from, "from");
        d();
        Set<Map.Entry> entrySet = from.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        h(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a9 = a(entry.getKey());
            Object[] objArr = this.f40514u;
            if (objArr == null) {
                int length = this.f40513n.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f40514u = objArr;
            }
            if (a9 >= 0) {
                objArr[a9] = entry.getValue();
            } else {
                int i = (-a9) - 1;
                if (!kotlin.jvm.internal.h.a(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        d();
        int i = i(obj);
        if (i < 0) {
            return null;
        }
        Object[] objArr = this.f40514u;
        kotlin.jvm.internal.h.b(objArr);
        Object obj2 = objArr[i];
        m(i);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f40508B;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f40508B * 3) + 2);
        sb.append("{");
        C5004d c5004d = new C5004d(this, 0);
        int i = 0;
        while (c5004d.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i4 = c5004d.f2228n;
            C5006f c5006f = (C5006f) c5004d.f2231w;
            if (i4 >= c5006f.f40518y) {
                throw new NoSuchElementException();
            }
            c5004d.f2228n = i4 + 1;
            c5004d.f2229u = i4;
            Object obj = c5006f.f40513n[i4];
            if (obj == c5006f) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = c5006f.f40514u;
            kotlin.jvm.internal.h.b(objArr);
            Object obj2 = objArr[c5004d.f2229u];
            if (obj2 == c5006f) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            c5004d.e();
            i++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final Collection values() {
        C5008h c5008h = this.f40510D;
        if (c5008h != null) {
            return c5008h;
        }
        C5008h c5008h2 = new C5008h(this);
        this.f40510D = c5008h2;
        return c5008h2;
    }

    public C5006f(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f40513n = objArr;
        this.f40514u = null;
        this.f40515v = iArr;
        this.f40516w = new int[highestOneBit];
        this.f40517x = 2;
        this.f40518y = 0;
        this.f40519z = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }
}
