package s;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class k {

    /* renamed from: w, reason: collision with root package name */
    public static Object[] f40270w;

    /* renamed from: x, reason: collision with root package name */
    public static int f40271x;

    /* renamed from: y, reason: collision with root package name */
    public static Object[] f40272y;

    /* renamed from: z, reason: collision with root package name */
    public static int f40273z;

    /* renamed from: n, reason: collision with root package name */
    public int[] f40274n;

    /* renamed from: u, reason: collision with root package name */
    public Object[] f40275u;

    /* renamed from: v, reason: collision with root package name */
    public int f40276v;

    public k() {
        this.f40274n = d.f40247a;
        this.f40275u = d.f40249c;
        this.f40276v = 0;
    }

    public static void c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (k.class) {
                try {
                    if (f40273z < 10) {
                        objArr[0] = f40272y;
                        objArr[1] = iArr;
                        for (int i4 = (i << 1) - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f40272y = objArr;
                        f40273z++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (k.class) {
                try {
                    if (f40271x < 10) {
                        objArr[0] = f40270w;
                        objArr[1] = iArr;
                        for (int i6 = (i << 1) - 1; i6 >= 2; i6--) {
                            objArr[i6] = null;
                        }
                        f40270w = objArr;
                        f40271x++;
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
                    Object[] objArr = f40272y;
                    if (objArr != null) {
                        this.f40275u = objArr;
                        f40272y = (Object[]) objArr[0];
                        this.f40274n = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f40273z--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (k.class) {
                try {
                    Object[] objArr2 = f40270w;
                    if (objArr2 != null) {
                        this.f40275u = objArr2;
                        f40270w = (Object[]) objArr2[0];
                        this.f40274n = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f40271x--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f40274n = new int[i];
        this.f40275u = new Object[i << 1];
    }

    public final void b(int i) {
        int i4 = this.f40276v;
        int[] iArr = this.f40274n;
        if (iArr.length < i) {
            Object[] objArr = this.f40275u;
            a(i);
            if (this.f40276v > 0) {
                System.arraycopy(iArr, 0, this.f40274n, 0, i4);
                System.arraycopy(objArr, 0, this.f40275u, 0, i4 << 1);
            }
            c(iArr, objArr, i4);
        }
        if (this.f40276v != i4) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f40276v;
        if (i > 0) {
            int[] iArr = this.f40274n;
            Object[] objArr = this.f40275u;
            this.f40274n = d.f40247a;
            this.f40275u = d.f40249c;
            this.f40276v = 0;
            c(iArr, objArr, i);
        }
        if (this.f40276v > 0) {
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
        int i4 = this.f40276v;
        if (i4 == 0) {
            return -1;
        }
        try {
            int a9 = d.a(i4, i, this.f40274n);
            if (a9 < 0 || obj.equals(this.f40275u[a9 << 1])) {
                return a9;
            }
            int i6 = a9 + 1;
            while (i6 < i4 && this.f40274n[i6] == i) {
                if (obj.equals(this.f40275u[i6 << 1])) {
                    return i6;
                }
                i6++;
            }
            for (int i9 = a9 - 1; i9 >= 0 && this.f40274n[i9] == i; i9--) {
                if (obj.equals(this.f40275u[i9 << 1])) {
                    return i9;
                }
            }
            return ~i6;
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
            if (this.f40276v != kVar.f40276v) {
                return false;
            }
            for (int i = 0; i < this.f40276v; i++) {
                try {
                    Object h3 = h(i);
                    Object l9 = l(i);
                    Object orDefault = kVar.getOrDefault(h3, null);
                    if (l9 == null) {
                        if (orDefault != null || !kVar.containsKey(h3)) {
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
            if (this.f40276v != map.size()) {
                return false;
            }
            for (int i4 = 0; i4 < this.f40276v; i4++) {
                try {
                    Object h9 = h(i4);
                    Object l10 = l(i4);
                    Object obj2 = map.get(h9);
                    if (l10 == null) {
                        if (obj2 != null || !map.containsKey(h9)) {
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
        int i = this.f40276v;
        if (i == 0) {
            return -1;
        }
        try {
            int a9 = d.a(i, 0, this.f40274n);
            if (a9 < 0 || this.f40275u[a9 << 1] == null) {
                return a9;
            }
            int i4 = a9 + 1;
            while (i4 < i && this.f40274n[i4] == 0) {
                if (this.f40275u[i4 << 1] == null) {
                    return i4;
                }
                i4++;
            }
            for (int i6 = a9 - 1; i6 >= 0 && this.f40274n[i6] == 0; i6--) {
                if (this.f40275u[i6 << 1] == null) {
                    return i6;
                }
            }
            return ~i4;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int g(Object obj) {
        int i = this.f40276v * 2;
        Object[] objArr = this.f40275u;
        if (obj == null) {
            for (int i4 = 1; i4 < i; i4 += 2) {
                if (objArr[i4] == null) {
                    return i4 >> 1;
                }
            }
            return -1;
        }
        for (int i6 = 1; i6 < i; i6 += 2) {
            if (obj.equals(objArr[i6])) {
                return i6 >> 1;
            }
        }
        return -1;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int e9 = e(obj);
        return e9 >= 0 ? this.f40275u[(e9 << 1) + 1] : obj2;
    }

    public final Object h(int i) {
        return this.f40275u[i << 1];
    }

    public int hashCode() {
        int[] iArr = this.f40274n;
        Object[] objArr = this.f40275u;
        int i = this.f40276v;
        int i4 = 1;
        int i6 = 0;
        int i9 = 0;
        while (i6 < i) {
            Object obj = objArr[i4];
            i9 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i6];
            i6++;
            i4 += 2;
        }
        return i9;
    }

    public void i(k kVar) {
        int i = kVar.f40276v;
        b(this.f40276v + i);
        if (this.f40276v != 0) {
            for (int i4 = 0; i4 < i; i4++) {
                put(kVar.h(i4), kVar.l(i4));
            }
        } else if (i > 0) {
            System.arraycopy(kVar.f40274n, 0, this.f40274n, 0, i);
            System.arraycopy(kVar.f40275u, 0, this.f40275u, 0, i << 1);
            this.f40276v = i;
        }
    }

    public final boolean isEmpty() {
        return this.f40276v <= 0;
    }

    public Object j(int i) {
        Object[] objArr = this.f40275u;
        int i4 = i << 1;
        Object obj = objArr[i4 + 1];
        int i6 = this.f40276v;
        int i9 = 0;
        if (i6 <= 1) {
            c(this.f40274n, objArr, i6);
            this.f40274n = d.f40247a;
            this.f40275u = d.f40249c;
        } else {
            int i10 = i6 - 1;
            int[] iArr = this.f40274n;
            if (iArr.length <= 8 || i6 >= iArr.length / 3) {
                if (i < i10) {
                    int i11 = i + 1;
                    int i12 = i10 - i;
                    System.arraycopy(iArr, i11, iArr, i, i12);
                    Object[] objArr2 = this.f40275u;
                    System.arraycopy(objArr2, i11 << 1, objArr2, i4, i12 << 1);
                }
                Object[] objArr3 = this.f40275u;
                int i13 = i10 << 1;
                objArr3[i13] = null;
                objArr3[i13 + 1] = null;
            } else {
                a(i6 > 8 ? i6 + (i6 >> 1) : 8);
                if (i6 != this.f40276v) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f40274n, 0, i);
                    System.arraycopy(objArr, 0, this.f40275u, 0, i4);
                }
                if (i < i10) {
                    int i14 = i + 1;
                    int i15 = i10 - i;
                    System.arraycopy(iArr, i14, this.f40274n, i, i15);
                    System.arraycopy(objArr, i14 << 1, this.f40275u, i4, i15 << 1);
                }
            }
            i9 = i10;
        }
        if (i6 != this.f40276v) {
            throw new ConcurrentModificationException();
        }
        this.f40276v = i9;
        return obj;
    }

    public Object k(int i, Object obj) {
        int i4 = (i << 1) + 1;
        Object[] objArr = this.f40275u;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        return obj2;
    }

    public final Object l(int i) {
        return this.f40275u[(i << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i;
        int d9;
        int i4 = this.f40276v;
        if (obj == null) {
            d9 = f();
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            d9 = d(hashCode, obj);
        }
        if (d9 >= 0) {
            int i6 = (d9 << 1) + 1;
            Object[] objArr = this.f40275u;
            Object obj3 = objArr[i6];
            objArr[i6] = obj2;
            return obj3;
        }
        int i9 = ~d9;
        int[] iArr = this.f40274n;
        if (i4 >= iArr.length) {
            int i10 = 8;
            if (i4 >= 8) {
                i10 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i10 = 4;
            }
            Object[] objArr2 = this.f40275u;
            a(i10);
            if (i4 != this.f40276v) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f40274n;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f40275u, 0, objArr2.length);
            }
            c(iArr, objArr2, i4);
        }
        if (i9 < i4) {
            int[] iArr3 = this.f40274n;
            int i11 = i9 + 1;
            System.arraycopy(iArr3, i9, iArr3, i11, i4 - i9);
            Object[] objArr3 = this.f40275u;
            System.arraycopy(objArr3, i9 << 1, objArr3, i11 << 1, (this.f40276v - i9) << 1);
        }
        int i12 = this.f40276v;
        if (i4 == i12) {
            int[] iArr4 = this.f40274n;
            if (i9 < iArr4.length) {
                iArr4[i9] = i;
                Object[] objArr4 = this.f40275u;
                int i13 = i9 << 1;
                objArr4[i13] = obj;
                objArr4[i13 + 1] = obj2;
                this.f40276v = i12 + 1;
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
        return this.f40276v;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f40276v * 28);
        sb.append('{');
        for (int i = 0; i < this.f40276v; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object h3 = h(i);
            if (h3 != this) {
                sb.append(h3);
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
