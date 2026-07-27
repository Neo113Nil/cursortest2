package k;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class i {

    /* renamed from: h, reason: collision with root package name */
    public static Object[] f2663h;

    /* renamed from: i, reason: collision with root package name */
    public static int f2664i;

    /* renamed from: j, reason: collision with root package name */
    public static Object[] f2665j;

    /* renamed from: k, reason: collision with root package name */
    public static int f2666k;

    /* renamed from: e, reason: collision with root package name */
    public int[] f2667e = b.f2639a;

    /* renamed from: f, reason: collision with root package name */
    public Object[] f2668f = b.f2640b;

    /* renamed from: g, reason: collision with root package name */
    public int f2669g = 0;

    public static void b(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (i.class) {
                try {
                    if (f2666k < 10) {
                        objArr[0] = f2665j;
                        objArr[1] = iArr;
                        for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f2665j = objArr;
                        f2666k++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (i.class) {
                try {
                    if (f2664i < 10) {
                        objArr[0] = f2663h;
                        objArr[1] = iArr;
                        for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f2663h = objArr;
                        f2664i++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (i.class) {
                try {
                    Object[] objArr = f2665j;
                    if (objArr != null) {
                        this.f2668f = objArr;
                        f2665j = (Object[]) objArr[0];
                        this.f2667e = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f2666k--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i2 == 4) {
            synchronized (i.class) {
                try {
                    Object[] objArr2 = f2663h;
                    if (objArr2 != null) {
                        this.f2668f = objArr2;
                        f2663h = (Object[]) objArr2[0];
                        this.f2667e = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f2664i--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f2667e = new int[i2];
        this.f2668f = new Object[i2 << 1];
    }

    public final int c(int i2, Object obj) {
        int i3 = this.f2669g;
        if (i3 == 0) {
            return -1;
        }
        try {
            int a2 = b.a(i3, i2, this.f2667e);
            if (a2 < 0) {
                return a2;
            }
            if (obj.equals(this.f2668f[a2 << 1])) {
                return a2;
            }
            int i4 = a2 + 1;
            while (i4 < i3 && this.f2667e[i4] == i2) {
                if (obj.equals(this.f2668f[i4 << 1])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = a2 - 1; i5 >= 0 && this.f2667e[i5] == i2; i5--) {
                if (obj.equals(this.f2668f[i5 << 1])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i2 = this.f2669g;
        if (i2 > 0) {
            int[] iArr = this.f2667e;
            Object[] objArr = this.f2668f;
            this.f2667e = b.f2639a;
            this.f2668f = b.f2640b;
            this.f2669g = 0;
            b(iArr, objArr, i2);
        }
        if (this.f2669g > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return f(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i2 = this.f2669g;
        if (i2 == 0) {
            return -1;
        }
        try {
            int a2 = b.a(i2, 0, this.f2667e);
            if (a2 < 0) {
                return a2;
            }
            if (this.f2668f[a2 << 1] == null) {
                return a2;
            }
            int i3 = a2 + 1;
            while (i3 < i2 && this.f2667e[i3] == 0) {
                if (this.f2668f[i3 << 1] == null) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = a2 - 1; i4 >= 0 && this.f2667e[i4] == 0; i4--) {
                if (this.f2668f[i4 << 1] == null) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f2669g != iVar.f2669g) {
                return false;
            }
            for (int i2 = 0; i2 < this.f2669g; i2++) {
                try {
                    Object obj2 = this.f2668f[i2 << 1];
                    Object h2 = h(i2);
                    Object orDefault = iVar.getOrDefault(obj2, null);
                    if (h2 == null) {
                        if (orDefault != null || !iVar.containsKey(obj2)) {
                            return false;
                        }
                    } else if (!h2.equals(orDefault)) {
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
            if (this.f2669g != map.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.f2669g; i3++) {
                try {
                    Object obj3 = this.f2668f[i3 << 1];
                    Object h3 = h(i3);
                    Object obj4 = map.get(obj3);
                    if (h3 == null) {
                        if (obj4 != null || !map.containsKey(obj3)) {
                            return false;
                        }
                    } else if (!h3.equals(obj4)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(Object obj) {
        int i2 = this.f2669g * 2;
        Object[] objArr = this.f2668f;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public final Object g(int i2) {
        Object[] objArr = this.f2668f;
        int i3 = i2 << 1;
        Object obj = objArr[i3 + 1];
        int i4 = this.f2669g;
        int i5 = 0;
        if (i4 <= 1) {
            b(this.f2667e, objArr, i4);
            this.f2667e = b.f2639a;
            this.f2668f = b.f2640b;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.f2667e;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    int i8 = i6 - i2;
                    System.arraycopy(iArr, i7, iArr, i2, i8);
                    Object[] objArr2 = this.f2668f;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i3, i8 << 1);
                }
                Object[] objArr3 = this.f2668f;
                int i9 = i6 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                a(i4 > 8 ? i4 + (i4 >> 1) : 8);
                if (i4 != this.f2669g) {
                    throw new ConcurrentModificationException();
                }
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f2667e, 0, i2);
                    System.arraycopy(objArr, 0, this.f2668f, 0, i3);
                }
                if (i2 < i6) {
                    int i10 = i2 + 1;
                    int i11 = i6 - i2;
                    System.arraycopy(iArr, i10, this.f2667e, i2, i11);
                    System.arraycopy(objArr, i10 << 1, this.f2668f, i3, i11 << 1);
                }
            }
            i5 = i6;
        }
        if (i4 != this.f2669g) {
            throw new ConcurrentModificationException();
        }
        this.f2669g = i5;
        return obj;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d2 = d(obj);
        return d2 >= 0 ? this.f2668f[(d2 << 1) + 1] : obj2;
    }

    public final Object h(int i2) {
        return this.f2668f[(i2 << 1) + 1];
    }

    public final int hashCode() {
        int[] iArr = this.f2667e;
        Object[] objArr = this.f2668f;
        int i2 = this.f2669g;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            i5 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public final boolean isEmpty() {
        return this.f2669g <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i2;
        int c2;
        int i3 = this.f2669g;
        if (obj == null) {
            c2 = e();
            i2 = 0;
        } else {
            int hashCode = obj.hashCode();
            i2 = hashCode;
            c2 = c(hashCode, obj);
        }
        if (c2 >= 0) {
            int i4 = (c2 << 1) + 1;
            Object[] objArr = this.f2668f;
            Object obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        int i5 = ~c2;
        int[] iArr = this.f2667e;
        if (i3 >= iArr.length) {
            int i6 = 8;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i6 = 4;
            }
            Object[] objArr2 = this.f2668f;
            a(i6);
            if (i3 != this.f2669g) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f2667e;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f2668f, 0, objArr2.length);
            }
            b(iArr, objArr2, i3);
        }
        if (i5 < i3) {
            int[] iArr3 = this.f2667e;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.f2668f;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.f2669g - i5) << 1);
        }
        int i8 = this.f2669g;
        if (i3 == i8) {
            int[] iArr4 = this.f2667e;
            if (i5 < iArr4.length) {
                iArr4[i5] = i2;
                Object[] objArr4 = this.f2668f;
                int i9 = i5 << 1;
                objArr4[i9] = obj;
                objArr4[i9 + 1] = obj2;
                this.f2669g = i8 + 1;
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
        int d2 = d(obj);
        if (d2 >= 0) {
            return g(d2);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d2 = d(obj);
        if (d2 < 0) {
            return null;
        }
        int i2 = (d2 << 1) + 1;
        Object[] objArr = this.f2668f;
        Object obj3 = objArr[i2];
        objArr[i2] = obj2;
        return obj3;
    }

    public final int size() {
        return this.f2669g;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2669g * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f2669g; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f2668f[i2 << 1];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object h2 = h(i2);
            if (h2 != this) {
                sb.append(h2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int d2 = d(obj);
        if (d2 < 0) {
            return false;
        }
        Object h2 = h(d2);
        if (obj2 != h2 && (obj2 == null || !obj2.equals(h2))) {
            return false;
        }
        g(d2);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d2 = d(obj);
        if (d2 < 0) {
            return false;
        }
        Object h2 = h(d2);
        if (h2 != obj2 && (obj2 == null || !obj2.equals(h2))) {
            return false;
        }
        int i2 = (d2 << 1) + 1;
        Object[] objArr = this.f2668f;
        Object obj4 = objArr[i2];
        objArr[i2] = obj3;
        return true;
    }
}
