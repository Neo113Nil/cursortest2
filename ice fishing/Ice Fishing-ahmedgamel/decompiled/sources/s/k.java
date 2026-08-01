package s;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class k {

    /* renamed from: w, reason: collision with root package name */
    public static Object[] f40434w;

    /* renamed from: x, reason: collision with root package name */
    public static int f40435x;

    /* renamed from: y, reason: collision with root package name */
    public static Object[] f40436y;

    /* renamed from: z, reason: collision with root package name */
    public static int f40437z;

    /* renamed from: n, reason: collision with root package name */
    public int[] f40438n;

    /* renamed from: u, reason: collision with root package name */
    public Object[] f40439u;

    /* renamed from: v, reason: collision with root package name */
    public int f40440v;

    public k() {
        this.f40438n = d.f40411a;
        this.f40439u = d.f40413c;
        this.f40440v = 0;
    }

    public static void c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (k.class) {
                try {
                    if (f40437z < 10) {
                        objArr[0] = f40436y;
                        objArr[1] = iArr;
                        for (int i6 = (i << 1) - 1; i6 >= 2; i6--) {
                            objArr[i6] = null;
                        }
                        f40436y = objArr;
                        f40437z++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (k.class) {
                try {
                    if (f40435x < 10) {
                        objArr[0] = f40434w;
                        objArr[1] = iArr;
                        for (int i9 = (i << 1) - 1; i9 >= 2; i9--) {
                            objArr[i9] = null;
                        }
                        f40434w = objArr;
                        f40435x++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i) {
        if (i == 8) {
            synchronized (k.class) {
                try {
                    Object[] objArr = f40436y;
                    if (objArr != null) {
                        this.f40439u = objArr;
                        f40436y = (Object[]) objArr[0];
                        this.f40438n = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f40437z--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (k.class) {
                try {
                    Object[] objArr2 = f40434w;
                    if (objArr2 != null) {
                        this.f40439u = objArr2;
                        f40434w = (Object[]) objArr2[0];
                        this.f40438n = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f40435x--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f40438n = new int[i];
        this.f40439u = new Object[i << 1];
    }

    public final void b(int i) {
        int i6 = this.f40440v;
        int[] iArr = this.f40438n;
        if (iArr.length < i) {
            Object[] objArr = this.f40439u;
            a(i);
            if (this.f40440v > 0) {
                System.arraycopy(iArr, 0, this.f40438n, 0, i6);
                System.arraycopy(objArr, 0, this.f40439u, 0, i6 << 1);
            }
            c(iArr, objArr, i6);
        }
        if (this.f40440v != i6) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f40440v;
        if (i > 0) {
            int[] iArr = this.f40438n;
            Object[] objArr = this.f40439u;
            this.f40438n = d.f40411a;
            this.f40439u = d.f40413c;
            this.f40440v = 0;
            c(iArr, objArr, i);
        }
        if (this.f40440v > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public final int d(int i, Object obj) {
        int i6 = this.f40440v;
        if (i6 == 0) {
            return -1;
        }
        try {
            int a9 = d.a(i6, i, this.f40438n);
            if (a9 < 0 || obj.equals(this.f40439u[a9 << 1])) {
                return a9;
            }
            int i9 = a9 + 1;
            while (i9 < i6 && this.f40438n[i9] == i) {
                if (obj.equals(this.f40439u[i9 << 1])) {
                    return i9;
                }
                i9++;
            }
            for (int i10 = a9 - 1; i10 >= 0 && this.f40438n[i10] == i; i10--) {
                if (obj.equals(this.f40439u[i10 << 1])) {
                    return i10;
                }
            }
            return ~i9;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int e(Object obj) {
        return obj == null ? f() : d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f40440v != kVar.f40440v) {
                return false;
            }
            for (int i = 0; i < this.f40440v; i++) {
                try {
                    Object h9 = h(i);
                    Object l9 = l(i);
                    Object orDefault = kVar.getOrDefault(h9, null);
                    if (l9 == null) {
                        if (orDefault != null || !kVar.containsKey(h9)) {
                            return false;
                        }
                    } else if (!l9.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f40440v != map.size()) {
                return false;
            }
            for (int i6 = 0; i6 < this.f40440v; i6++) {
                try {
                    Object h10 = h(i6);
                    Object l10 = l(i6);
                    Object obj2 = map.get(h10);
                    if (l10 == null) {
                        if (obj2 != null || !map.containsKey(h10)) {
                            return false;
                        }
                    } else if (!l10.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        int i = this.f40440v;
        if (i == 0) {
            return -1;
        }
        try {
            int a9 = d.a(i, 0, this.f40438n);
            if (a9 < 0 || this.f40439u[a9 << 1] == null) {
                return a9;
            }
            int i6 = a9 + 1;
            while (i6 < i && this.f40438n[i6] == 0) {
                if (this.f40439u[i6 << 1] == null) {
                    return i6;
                }
                i6++;
            }
            for (int i9 = a9 - 1; i9 >= 0 && this.f40438n[i9] == 0; i9--) {
                if (this.f40439u[i9 << 1] == null) {
                    return i9;
                }
            }
            return ~i6;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int g(Object obj) {
        int i = this.f40440v * 2;
        Object[] objArr = this.f40439u;
        if (obj == null) {
            for (int i6 = 1; i6 < i; i6 += 2) {
                if (objArr[i6] == null) {
                    return i6 >> 1;
                }
            }
            return -1;
        }
        for (int i9 = 1; i9 < i; i9 += 2) {
            if (obj.equals(objArr[i9])) {
                return i9 >> 1;
            }
        }
        return -1;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int e9 = e(obj);
        return e9 >= 0 ? this.f40439u[(e9 << 1) + 1] : obj2;
    }

    public final Object h(int i) {
        return this.f40439u[i << 1];
    }

    public int hashCode() {
        int[] iArr = this.f40438n;
        Object[] objArr = this.f40439u;
        int i = this.f40440v;
        int i6 = 1;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i) {
            Object obj = objArr[i6];
            i10 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i9];
            i9++;
            i6 += 2;
        }
        return i10;
    }

    public void i(k kVar) {
        int i = kVar.f40440v;
        b(this.f40440v + i);
        if (this.f40440v != 0) {
            for (int i6 = 0; i6 < i; i6++) {
                put(kVar.h(i6), kVar.l(i6));
            }
        } else if (i > 0) {
            System.arraycopy(kVar.f40438n, 0, this.f40438n, 0, i);
            System.arraycopy(kVar.f40439u, 0, this.f40439u, 0, i << 1);
            this.f40440v = i;
        }
    }

    public final boolean isEmpty() {
        return this.f40440v <= 0;
    }

    public Object j(int i) {
        Object[] objArr = this.f40439u;
        int i6 = i << 1;
        Object obj = objArr[i6 + 1];
        int i9 = this.f40440v;
        int i10 = 0;
        if (i9 <= 1) {
            c(this.f40438n, objArr, i9);
            this.f40438n = d.f40411a;
            this.f40439u = d.f40413c;
        } else {
            int i11 = i9 - 1;
            int[] iArr = this.f40438n;
            if (iArr.length <= 8 || i9 >= iArr.length / 3) {
                if (i < i11) {
                    int i12 = i + 1;
                    int i13 = i11 - i;
                    System.arraycopy(iArr, i12, iArr, i, i13);
                    Object[] objArr2 = this.f40439u;
                    System.arraycopy(objArr2, i12 << 1, objArr2, i6, i13 << 1);
                }
                Object[] objArr3 = this.f40439u;
                int i14 = i11 << 1;
                objArr3[i14] = null;
                objArr3[i14 + 1] = null;
            } else {
                a(i9 > 8 ? i9 + (i9 >> 1) : 8);
                if (i9 != this.f40440v) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f40438n, 0, i);
                    System.arraycopy(objArr, 0, this.f40439u, 0, i6);
                }
                if (i < i11) {
                    int i15 = i + 1;
                    int i16 = i11 - i;
                    System.arraycopy(iArr, i15, this.f40438n, i, i16);
                    System.arraycopy(objArr, i15 << 1, this.f40439u, i6, i16 << 1);
                }
            }
            i10 = i11;
        }
        if (i9 != this.f40440v) {
            throw new ConcurrentModificationException();
        }
        this.f40440v = i10;
        return obj;
    }

    public Object k(int i, Object obj) {
        int i6 = (i << 1) + 1;
        Object[] objArr = this.f40439u;
        Object obj2 = objArr[i6];
        objArr[i6] = obj;
        return obj2;
    }

    public final Object l(int i) {
        return this.f40439u[(i << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i;
        int d2;
        int i6 = this.f40440v;
        if (obj == null) {
            d2 = f();
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            d2 = d(hashCode, obj);
        }
        if (d2 >= 0) {
            int i9 = (d2 << 1) + 1;
            Object[] objArr = this.f40439u;
            Object obj3 = objArr[i9];
            objArr[i9] = obj2;
            return obj3;
        }
        int i10 = ~d2;
        int[] iArr = this.f40438n;
        if (i6 >= iArr.length) {
            int i11 = 8;
            if (i6 >= 8) {
                i11 = (i6 >> 1) + i6;
            } else if (i6 < 4) {
                i11 = 4;
            }
            Object[] objArr2 = this.f40439u;
            a(i11);
            if (i6 != this.f40440v) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f40438n;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f40439u, 0, objArr2.length);
            }
            c(iArr, objArr2, i6);
        }
        if (i10 < i6) {
            int[] iArr3 = this.f40438n;
            int i12 = i10 + 1;
            System.arraycopy(iArr3, i10, iArr3, i12, i6 - i10);
            Object[] objArr3 = this.f40439u;
            System.arraycopy(objArr3, i10 << 1, objArr3, i12 << 1, (this.f40440v - i10) << 1);
        }
        int i13 = this.f40440v;
        if (i6 == i13) {
            int[] iArr4 = this.f40438n;
            if (i10 < iArr4.length) {
                iArr4[i10] = i;
                Object[] objArr4 = this.f40439u;
                int i14 = i10 << 1;
                objArr4[i14] = obj;
                objArr4[i14 + 1] = obj2;
                this.f40440v = i13 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    public final Object remove(Object obj) {
        int e9 = e(obj);
        if (e9 >= 0) {
            return j(e9);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int e9 = e(obj);
        if (e9 >= 0) {
            return k(e9, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f40440v;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f40440v * 28);
        sb.append('{');
        for (int i = 0; i < this.f40440v; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object h9 = h(i);
            if (h9 != this) {
                sb.append(h9);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object l9 = l(i);
            if (l9 != this) {
                sb.append(l9);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int e9 = e(obj);
        if (e9 < 0) {
            return false;
        }
        Object l9 = l(e9);
        if (obj2 != l9 && (obj2 == null || !obj2.equals(l9))) {
            return false;
        }
        j(e9);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int e9 = e(obj);
        if (e9 < 0) {
            return false;
        }
        Object l9 = l(e9);
        if (l9 != obj2 && (obj2 == null || !obj2.equals(l9))) {
            return false;
        }
        k(e9, obj3);
        return true;
    }

    public k(k kVar) {
        this();
        i(kVar);
    }
}
