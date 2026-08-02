package defpackage;

import java.util.Arrays;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public class ycs0 {
    public int[] a;
    public Object[] b;
    public int c;

    public ycs0(int i) {
        this.a = i == 0 ? cvw.a : new int[i];
        this.b = i == 0 ? cvw.c : new Object[i << 1];
    }

    public final int a(Object obj) {
        int i = this.c * 2;
        Object[] objArr = this.b;
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
        int i2 = this.c;
        int[] iArr = this.a;
        if (iArr.length < i) {
            this.a = Arrays.copyOf(iArr, i);
            this.b = Arrays.copyOf(this.b, i * 2);
        }
        if (this.c == i2) {
            return;
        }
        ny61.y();
    }

    public final int c(int i, Object obj) {
        int i2 = this.c;
        if (i2 == 0) {
            return -1;
        }
        int c = cvw.c(this.a, i2, i);
        if (c < 0 || jl40.l(obj, this.b[c << 1])) {
            return c;
        }
        int i3 = c + 1;
        while (i3 < i2 && this.a[i3] == i) {
            if (jl40.l(obj, this.b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = c - 1; i4 >= 0 && this.a[i4] == i; i4--) {
            if (jl40.l(obj, this.b[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public void clear() {
        if (this.c > 0) {
            this.a = cvw.a;
            this.b = cvw.c;
            this.c = 0;
        }
        if (this.c <= 0) {
            return;
        }
        ny61.y();
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
        int i = this.c;
        if (i == 0) {
            return -1;
        }
        int c = cvw.c(this.a, i, 0);
        if (c < 0 || this.b[c << 1] == null) {
            return c;
        }
        int i2 = c + 1;
        while (i2 < i && this.a[i2] == 0) {
            if (this.b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = c - 1; i3 >= 0 && this.a[i3] == 0; i3--) {
            if (this.b[i3 << 1] == null) {
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
            if (obj instanceof ycs0) {
                int i = this.c;
                if (i != ((ycs0) obj).c) {
                    return false;
                }
                ycs0 ycs0Var = (ycs0) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object f = f(i2);
                    Object j = j(i2);
                    Object obj2 = ycs0Var.get(f);
                    if (j == null) {
                        if (obj2 != null || !ycs0Var.containsKey(f)) {
                            return false;
                        }
                    } else if (!j.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.c != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.c;
            for (int i4 = 0; i4 < i3; i4++) {
                Object f2 = f(i4);
                Object j2 = j(i4);
                Object obj3 = ((Map) obj).get(f2);
                if (j2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(f2)) {
                        return false;
                    }
                } else if (!j2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        if (i >= 0 && i < this.c) {
            return this.b[i << 1];
        }
        xva1.b("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public void g(ycs0 ycs0Var) {
        int i = ycs0Var.c;
        b(this.c + i);
        if (this.c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(ycs0Var.f(i2), ycs0Var.j(i2));
            }
        } else if (i > 0) {
            f73.d(0, 0, i, ycs0Var.a, this.a);
            f73.g(ycs0Var.b, 0, this.b, 0, i << 1);
            this.c = i;
        }
    }

    public Object get(Object obj) {
        int d = d(obj);
        if (d >= 0) {
            return this.b[(d << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d = d(obj);
        return d >= 0 ? this.b[(d << 1) + 1] : obj2;
    }

    public Object h(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.c)) {
            xva1.b("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        Object[] objArr = this.b;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.a;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                f73.d(i, i5, i2, iArr, iArr);
                Object[] objArr2 = this.b;
                f73.g(objArr2, i3, objArr2, i5 << 1, i2 << 1);
            }
            Object[] objArr3 = this.b;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.a = Arrays.copyOf(iArr, i7);
            this.b = Arrays.copyOf(this.b, i7 << 1);
            if (i2 != this.c) {
                ny61.y();
                return null;
            }
            if (i > 0) {
                f73.d(0, 0, i, iArr, this.a);
                f73.g(objArr, 0, this.b, 0, i3);
            }
            if (i < i4) {
                int i8 = i + 1;
                f73.d(i, i8, i2, iArr, this.a);
                f73.g(objArr, i3, this.b, i8 << 1, i2 << 1);
            }
        }
        if (i2 == this.c) {
            this.c = i4;
            return obj;
        }
        ny61.y();
        return null;
    }

    public int hashCode() {
        int[] iArr = this.a;
        Object[] objArr = this.b;
        int i = this.c;
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

    public Object i(int i, Object obj) {
        if (i < 0 || i >= this.c) {
            xva1.b("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.b;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final boolean isEmpty() {
        return this.c <= 0;
    }

    public final Object j(int i) {
        if (i >= 0 && i < this.c) {
            return this.b[(i << 1) + 1];
        }
        xva1.b("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public Object put(Object obj, Object obj2) {
        int i = this.c;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int c = obj != null ? c(hashCode, obj) : e();
        if (c >= 0) {
            int i2 = (c << 1) + 1;
            Object[] objArr = this.b;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~c;
        int[] iArr = this.a;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.a = Arrays.copyOf(iArr, i4);
            this.b = Arrays.copyOf(this.b, i4 << 1);
            if (i != this.c) {
                ny61.y();
                return null;
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.a;
            int i5 = i3 + 1;
            f73.d(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.b;
            f73.g(objArr2, i5 << 1, objArr2, i3 << 1, this.c << 1);
        }
        int i6 = this.c;
        if (i == i6) {
            int[] iArr3 = this.a;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.b;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.c = i6 + 1;
                return null;
            }
        }
        ny61.y();
        return null;
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int d = d(obj);
        if (d < 0 || !jl40.l(obj2, j(d))) {
            return false;
        }
        h(d);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d = d(obj);
        if (d < 0 || !jl40.l(obj2, j(d))) {
            return false;
        }
        i(d, obj3);
        return true;
    }

    public final int size() {
        return this.c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 28);
        sb.append('{');
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(Extension.FIX_SPACE);
            }
            Object f = f(i2);
            if (f != sb) {
                sb.append(f);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object j = j(i2);
            if (j != sb) {
                sb.append(j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object remove(Object obj) {
        int d = d(obj);
        if (d >= 0) {
            return h(d);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d = d(obj);
        if (d >= 0) {
            return i(d, obj2);
        }
        return null;
    }

    public ycs0() {
        this(0);
    }
}
