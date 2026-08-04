package a;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Map {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Object[] f4e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f5f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Object[] f6g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f7h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f8a = c.f12a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f9b = c.f13b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f11d;

    public static int b(int[] iArr, int i2, int i3) {
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            try {
                int i7 = iArr[i6];
                if (i7 < i3) {
                    i5 = i6 + 1;
                } else {
                    if (i7 <= i3) {
                        return i6;
                    }
                    i4 = i6 - 1;
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
        return ~i5;
    }

    public static void g(int[] iArr, int i2, Object[] objArr) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (f7h < 10) {
                    objArr[0] = f6g;
                    objArr[1] = iArr;
                    for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f6g = objArr;
                    f7h++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (b.class) {
                if (f5f < 10) {
                    objArr[0] = f4e;
                    objArr[1] = iArr;
                    for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f4e = objArr;
                    f5f++;
                }
            }
        }
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (b.class) {
                Object[] objArr = f6g;
                if (objArr != null) {
                    this.f9b = objArr;
                    f6g = (Object[]) objArr[0];
                    this.f8a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f7h--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (b.class) {
                Object[] objArr2 = f4e;
                if (objArr2 != null) {
                    this.f9b = objArr2;
                    f4e = (Object[]) objArr2[0];
                    this.f8a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f5f--;
                    return;
                }
            }
        }
        this.f8a = new int[i2];
        this.f9b = new Object[i2 << 1];
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void clear() {
        int i2 = this.f10c;
        if (i2 > 0) {
            int[] iArr = this.f8a;
            Object[] objArr = this.f9b;
            this.f8a = c.f12a;
            this.f9b = c.f13b;
            this.f10c = 0;
            g(iArr, i2, objArr);
        }
        if (this.f10c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final boolean containsKey(Object obj) {
        return k(obj) >= 0;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final boolean containsValue(Object obj) {
        return m(obj) >= 0;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f11d == null) {
            this.f11d = new a(this);
        }
        a aVar = this.f11d;
        if (aVar.f0a == null) {
            aVar.f0a = new e(aVar, 0);
        }
        return aVar.f0a;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f10c != bVar.f10c) {
                return false;
            }
            for (int i2 = 0; i2 < this.f10c; i2++) {
                try {
                    Object[] objArr = this.f9b;
                    int i3 = i2 << 1;
                    Object obj2 = objArr[i3];
                    Object obj3 = objArr[i3 + 1];
                    Object obj4 = bVar.get(obj2);
                    if (obj3 == null) {
                        if (obj4 != null || !bVar.containsKey(obj2)) {
                            return false;
                        }
                    } else if (!obj3.equals(obj4)) {
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
            if (this.f10c != map.size()) {
                return false;
            }
            for (int i4 = 0; i4 < this.f10c; i4++) {
                try {
                    Object[] objArr2 = this.f9b;
                    int i5 = i4 << 1;
                    Object obj5 = objArr2[i5];
                    Object obj6 = objArr2[i5 + 1];
                    Object obj7 = map.get(obj5);
                    if (obj6 == null) {
                        if (obj7 != null || !map.containsKey(obj5)) {
                            return false;
                        }
                    } else if (!obj6.equals(obj7)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Object get(Object obj) {
        int iK = k(obj);
        if (iK >= 0) {
            return this.f9b[(iK << 1) + 1];
        }
        return null;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        int[] iArr = this.f8a;
        Object[] objArr = this.f9b;
        int i2 = this.f10c;
        int i3 = 1;
        int i4 = 0;
        int iHashCode = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return iHashCode;
    }

    public final int j(int i2, Object obj) {
        int i3 = this.f10c;
        if (i3 == 0) {
            return -1;
        }
        int iB = b(this.f8a, i3, i2);
        if (iB >= 0 && !obj.equals(this.f9b[iB << 1])) {
            int i4 = iB + 1;
            while (i4 < i3 && this.f8a[i4] == i2) {
                if (obj.equals(this.f9b[i4 << 1])) {
                    return i4;
                }
                i4++;
            }
            do {
                iB--;
                if (iB < 0 || this.f8a[iB] != i2) {
                    return ~i4;
                }
            } while (!obj.equals(this.f9b[iB << 1]));
        }
        return iB;
    }

    public final int k(Object obj) {
        return obj == null ? l() : j(obj.hashCode(), obj);
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f11d == null) {
            this.f11d = new a(this);
        }
        a aVar = this.f11d;
        if (aVar.f1b == null) {
            aVar.f1b = new e(aVar, 1);
        }
        return aVar.f1b;
    }

    public final int l() {
        int i2 = this.f10c;
        if (i2 == 0) {
            return -1;
        }
        int iB = b(this.f8a, i2, 0);
        if (iB < 0 || this.f9b[iB << 1] == null) {
            return iB;
        }
        int i3 = iB + 1;
        while (i3 < i2 && this.f8a[i3] == 0) {
            if (this.f9b[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iB - 1; i4 >= 0 && this.f8a[i4] == 0; i4--) {
            if (this.f9b[i4 << 1] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    public final int m(Object obj) {
        int i2 = this.f10c * 2;
        Object[] objArr = this.f9b;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
        } else {
            for (int i4 = 1; i4 < i2; i4 += 2) {
                if (obj.equals(objArr[i4])) {
                    return i4 >> 1;
                }
            }
        }
        return -1;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final boolean isEmpty() {
        return this.f10c <= 0;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final Object put(Object obj, Object obj2) {
        int i2;
        int iJ;
        int i3 = this.f10c;
        if (obj == null) {
            iJ = l();
            i2 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i2 = iHashCode;
            iJ = j(iHashCode, obj);
        }
        if (iJ >= 0) {
            int i4 = (iJ << 1) + 1;
            Object[] objArr = this.f9b;
            Object obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        int i5 = ~iJ;
        int[] iArr = this.f8a;
        if (i3 >= iArr.length) {
            int i6 = 8;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i6 = 4;
            }
            Object[] objArr2 = this.f9b;
            a(i6);
            if (i3 != this.f10c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f8a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f9b, 0, objArr2.length);
            }
            g(iArr, i3, objArr2);
        }
        if (i5 < i3) {
            int[] iArr3 = this.f8a;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.f9b;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.f10c - i5) << 1);
        }
        int i8 = this.f10c;
        if (i3 == i8) {
            int[] iArr4 = this.f8a;
            if (i5 < iArr4.length) {
                iArr4[i5] = i2;
                Object[] objArr4 = this.f9b;
                int i9 = i5 << 1;
                objArr4[i9] = obj;
                objArr4[i9 + 1] = obj2;
                this.f10c = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final Object remove(Object obj) {
        int iK = k(obj);
        if (iK >= 0) {
            return q(iK);
        }
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f10c;
        int i2 = this.f10c;
        int[] iArr = this.f8a;
        if (iArr.length < size) {
            Object[] objArr = this.f9b;
            a(size);
            if (this.f10c > 0) {
                System.arraycopy(iArr, 0, this.f8a, 0, i2);
                System.arraycopy(objArr, 0, this.f9b, 0, i2 << 1);
            }
            g(iArr, i2, objArr);
        }
        if (this.f10c != i2) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final Object q(int i2) {
        Object[] objArr = this.f9b;
        int i3 = i2 << 1;
        Object obj = objArr[i3 + 1];
        int i4 = this.f10c;
        int i5 = 0;
        if (i4 <= 1) {
            g(this.f8a, i4, objArr);
            this.f8a = c.f12a;
            this.f9b = c.f13b;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.f8a;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    int i8 = i6 - i2;
                    System.arraycopy(iArr, i7, iArr, i2, i8);
                    Object[] objArr2 = this.f9b;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i3, i8 << 1);
                }
                Object[] objArr3 = this.f9b;
                int i9 = i6 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                a(i4 > 8 ? i4 + (i4 >> 1) : 8);
                if (i4 != this.f10c) {
                    throw new ConcurrentModificationException();
                }
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f8a, 0, i2);
                    System.arraycopy(objArr, 0, this.f9b, 0, i3);
                }
                if (i2 < i6) {
                    int i10 = i2 + 1;
                    int i11 = i6 - i2;
                    System.arraycopy(iArr, i10, this.f8a, i2, i11);
                    System.arraycopy(objArr, i10 << 1, this.f9b, i3, i11 << 1);
                }
            }
            i5 = i6;
        }
        if (i4 != this.f10c) {
            throw new ConcurrentModificationException();
        }
        this.f10c = i5;
        return obj;
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f10c * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f10c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            int i3 = i2 << 1;
            Object obj = this.f9b[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object obj2 = this.f9b[i3 + 1];
            if (obj2 != this) {
                sb.append(obj2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f10c;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f11d == null) {
            this.f11d = new a(this);
        }
        a aVar = this.f11d;
        if (aVar.f2c == null) {
            aVar.f2c = new g(aVar);
        }
        return aVar.f2c;
    }
}
