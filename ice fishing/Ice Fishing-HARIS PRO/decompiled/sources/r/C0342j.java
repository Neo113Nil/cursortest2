package r;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import s.AbstractC0346a;

/* renamed from: r.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0342j {

    /* renamed from: a, reason: collision with root package name */
    public int[] f4320a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f4321b;

    /* renamed from: c, reason: collision with root package name */
    public int f4322c;

    public C0342j(int i) {
        this.f4320a = i == 0 ? AbstractC0346a.f4337a : new int[i];
        this.f4321b = i == 0 ? AbstractC0346a.f4338b : new Object[i << 1];
    }

    public final int a(Object obj) {
        int i = this.f4322c * 2;
        Object[] objArr = this.f4321b;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i) {
        int i2 = this.f4322c;
        int[] iArr = this.f4320a;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, i);
            D1.i.d(copyOf, "copyOf(this, newSize)");
            this.f4320a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f4321b, i * 2);
            D1.i.d(copyOf2, "copyOf(this, newSize)");
            this.f4321b = copyOf2;
        }
        if (this.f4322c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i, Object obj) {
        int i2 = this.f4322c;
        if (i2 == 0) {
            return -1;
        }
        int a2 = AbstractC0346a.a(i2, i, this.f4320a);
        if (a2 < 0 || D1.i.a(obj, this.f4321b[a2 << 1])) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.f4320a[i3] == i) {
            if (D1.i.a(obj, this.f4321b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a2 - 1; i4 >= 0 && this.f4320a[i4] == i; i4--) {
            if (D1.i.a(obj, this.f4321b[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final void clear() {
        if (this.f4322c > 0) {
            this.f4320a = AbstractC0346a.f4337a;
            this.f4321b = AbstractC0346a.f4338b;
            this.f4322c = 0;
        }
        if (this.f4322c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i = this.f4322c;
        if (i == 0) {
            return -1;
        }
        int a2 = AbstractC0346a.a(i, 0, this.f4320a);
        if (a2 < 0 || this.f4321b[a2 << 1] == null) {
            return a2;
        }
        int i2 = a2 + 1;
        while (i2 < i && this.f4320a[i2] == 0) {
            if (this.f4321b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = a2 - 1; i3 >= 0 && this.f4320a[i3] == 0; i3--) {
            if (this.f4321b[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C0342j) {
                int i = this.f4322c;
                if (i != ((C0342j) obj).f4322c) {
                    return false;
                }
                C0342j c0342j = (C0342j) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object f2 = f(i2);
                    Object i3 = i(i2);
                    Object obj2 = c0342j.get(f2);
                    if (i3 == null) {
                        if (obj2 != null || !c0342j.containsKey(f2)) {
                            return false;
                        }
                    } else if (!i3.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f4322c != ((Map) obj).size()) {
                return false;
            }
            int i4 = this.f4322c;
            for (int i5 = 0; i5 < i4; i5++) {
                Object f3 = f(i5);
                Object i6 = i(i5);
                Object obj3 = ((Map) obj).get(f3);
                if (i6 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(f3)) {
                        return false;
                    }
                } else if (!i6.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        if (i < 0 || i >= this.f4322c) {
            throw new IllegalArgumentException(D1.h.e("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        return this.f4321b[i << 1];
    }

    public final Object g(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f4322c)) {
            throw new IllegalArgumentException(D1.h.e("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        Object[] objArr = this.f4321b;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
        } else {
            int i4 = i2 - 1;
            int[] iArr = this.f4320a;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                if (i < i4) {
                    int i5 = i + 1;
                    u1.f.E(i, i5, i2, iArr, iArr);
                    Object[] objArr2 = this.f4321b;
                    u1.f.F(objArr2, objArr2, i3, i5 << 1, i2 << 1);
                }
                Object[] objArr3 = this.f4321b;
                int i6 = i4 << 1;
                objArr3[i6] = null;
                objArr3[i6 + 1] = null;
            } else {
                int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
                int[] copyOf = Arrays.copyOf(iArr, i7);
                D1.i.d(copyOf, "copyOf(this, newSize)");
                this.f4320a = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f4321b, i7 << 1);
                D1.i.d(copyOf2, "copyOf(this, newSize)");
                this.f4321b = copyOf2;
                if (i2 != this.f4322c) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    u1.f.E(0, 0, i, iArr, this.f4320a);
                    u1.f.F(objArr, this.f4321b, 0, 0, i3);
                }
                if (i < i4) {
                    int i8 = i + 1;
                    u1.f.E(i, i8, i2, iArr, this.f4320a);
                    u1.f.F(objArr, this.f4321b, i3, i8 << 1, i2 << 1);
                }
            }
            if (i2 != this.f4322c) {
                throw new ConcurrentModificationException();
            }
            this.f4322c = i4;
        }
        return obj;
    }

    public Object get(Object obj) {
        int d2 = d(obj);
        if (d2 >= 0) {
            return this.f4321b[(d2 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d2 = d(obj);
        return d2 >= 0 ? this.f4321b[(d2 << 1) + 1] : obj2;
    }

    public final Object h(int i, Object obj) {
        if (i < 0 || i >= this.f4322c) {
            throw new IllegalArgumentException(D1.h.e("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f4321b;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f4320a;
        Object[] objArr = this.f4321b;
        int i = this.f4322c;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public final Object i(int i) {
        if (i < 0 || i >= this.f4322c) {
            throw new IllegalArgumentException(D1.h.e("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        return this.f4321b[(i << 1) + 1];
    }

    public final boolean isEmpty() {
        return this.f4322c <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.f4322c;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int c2 = obj != null ? c(hashCode, obj) : e();
        if (c2 >= 0) {
            int i2 = (c2 << 1) + 1;
            Object[] objArr = this.f4321b;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~c2;
        int[] iArr = this.f4320a;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i4);
            D1.i.d(copyOf, "copyOf(this, newSize)");
            this.f4320a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f4321b, i4 << 1);
            D1.i.d(copyOf2, "copyOf(this, newSize)");
            this.f4321b = copyOf2;
            if (i != this.f4322c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.f4320a;
            int i5 = i3 + 1;
            u1.f.E(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.f4321b;
            u1.f.F(objArr2, objArr2, i5 << 1, i3 << 1, this.f4322c << 1);
        }
        int i6 = this.f4322c;
        if (i == i6) {
            int[] iArr3 = this.f4320a;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.f4321b;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.f4322c = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int d2 = d(obj);
        if (d2 >= 0) {
            return g(d2);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d2 = d(obj);
        if (d2 >= 0) {
            return h(d2, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f4322c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4322c * 28);
        sb.append('{');
        int i = this.f4322c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object f2 = f(i2);
            if (f2 != sb) {
                sb.append(f2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object i3 = i(i2);
            if (i3 != sb) {
                sb.append(i3);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        D1.i.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public final boolean remove(Object obj, Object obj2) {
        int d2 = d(obj);
        if (d2 < 0 || !D1.i.a(obj2, i(d2))) {
            return false;
        }
        g(d2);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d2 = d(obj);
        if (d2 < 0 || !D1.i.a(obj2, i(d2))) {
            return false;
        }
        h(d2, obj3);
        return true;
    }
}
