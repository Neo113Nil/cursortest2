package s;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class q0 {

    /* renamed from: g, reason: collision with root package name */
    public int[] f6323g;

    /* renamed from: h, reason: collision with root package name */
    public Object[] f6324h;

    /* renamed from: i, reason: collision with root package name */
    public int f6325i;

    public q0(int i10) {
        this.f6323g = i10 == 0 ? t.a.f6507a : new int[i10];
        this.f6324h = i10 == 0 ? t.a.f6509c : new Object[i10 << 1];
    }

    public final int a(Object obj) {
        int i10 = this.f6325i * 2;
        Object[] objArr = this.f6324h;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public final int b(int i10, Object obj) {
        int i11 = this.f6325i;
        if (i11 == 0) {
            return -1;
        }
        int a6 = t.a.a(i11, i10, this.f6323g);
        if (a6 < 0 || pc.j.a(obj, this.f6324h[a6 << 1])) {
            return a6;
        }
        int i12 = a6 + 1;
        while (i12 < i11 && this.f6323g[i12] == i10) {
            if (pc.j.a(obj, this.f6324h[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = a6 - 1; i13 >= 0 && this.f6323g[i13] == i10; i13--) {
            if (pc.j.a(obj, this.f6324h[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public final int c(Object obj) {
        return obj == null ? d() : b(obj.hashCode(), obj);
    }

    public final void clear() {
        if (this.f6325i > 0) {
            this.f6323g = t.a.f6507a;
            this.f6324h = t.a.f6509c;
            this.f6325i = 0;
        }
        if (this.f6325i > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return c(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d() {
        int i10 = this.f6325i;
        if (i10 == 0) {
            return -1;
        }
        int a6 = t.a.a(i10, 0, this.f6323g);
        if (a6 < 0 || this.f6324h[a6 << 1] == null) {
            return a6;
        }
        int i11 = a6 + 1;
        while (i11 < i10 && this.f6323g[i11] == 0) {
            if (this.f6324h[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = a6 - 1; i12 >= 0 && this.f6323g[i12] == 0; i12--) {
            if (this.f6324h[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final Object e(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f6325i) {
            z10 = true;
        }
        if (z10) {
            return this.f6324h[i10 << 1];
        }
        t.a.c("Expected index to be within 0..size()-1, but was " + i10);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof q0) {
                int i10 = this.f6325i;
                if (i10 != ((q0) obj).f6325i) {
                    return false;
                }
                q0 q0Var = (q0) obj;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object e10 = e(i11);
                    Object h10 = h(i11);
                    Object obj2 = q0Var.get(e10);
                    if (h10 == null) {
                        if (obj2 != null || !q0Var.containsKey(e10)) {
                            return false;
                        }
                    } else if (!h10.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f6325i != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f6325i;
            for (int i13 = 0; i13 < i12; i13++) {
                Object e11 = e(i13);
                Object h11 = h(i13);
                Object obj3 = ((Map) obj).get(e11);
                if (h11 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(e11)) {
                        return false;
                    }
                } else if (!h11.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f6325i)) {
            t.a.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        Object[] objArr = this.f6324h;
        int i12 = i10 << 1;
        Object obj = objArr[i12 + 1];
        if (i11 <= 1) {
            clear();
            return obj;
        }
        int i13 = i11 - 1;
        int[] iArr = this.f6323g;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                bc.l.P(i10, i14, i11, iArr, iArr);
                Object[] objArr2 = this.f6324h;
                bc.l.R(objArr2, objArr2, i12, i14 << 1, i11 << 1);
            }
            Object[] objArr3 = this.f6324h;
            int i15 = i13 << 1;
            objArr3[i15] = null;
            objArr3[i15 + 1] = null;
        } else {
            int i16 = i11 > 8 ? i11 + (i11 >> 1) : 8;
            int[] copyOf = Arrays.copyOf(iArr, i16);
            pc.j.d(copyOf, "copyOf(...)");
            this.f6323g = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f6324h, i16 << 1);
            pc.j.d(copyOf2, "copyOf(...)");
            this.f6324h = copyOf2;
            if (i11 != this.f6325i) {
                throw new ConcurrentModificationException();
            }
            if (i10 > 0) {
                bc.l.P(0, 0, i10, iArr, this.f6323g);
                bc.l.R(objArr, this.f6324h, 0, 0, i12);
            }
            if (i10 < i13) {
                int i17 = i10 + 1;
                bc.l.P(i10, i17, i11, iArr, this.f6323g);
                bc.l.R(objArr, this.f6324h, i12, i17 << 1, i11 << 1);
            }
        }
        if (i11 != this.f6325i) {
            throw new ConcurrentModificationException();
        }
        this.f6325i = i13;
        return obj;
    }

    public final Object g(int i10, Object obj) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f6325i) {
            z10 = true;
        }
        if (!z10) {
            t.a.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f6324h;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    public Object get(Object obj) {
        int c3 = c(obj);
        if (c3 >= 0) {
            return this.f6324h[(c3 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int c3 = c(obj);
        return c3 >= 0 ? this.f6324h[(c3 << 1) + 1] : obj2;
    }

    public final Object h(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f6325i) {
            z10 = true;
        }
        if (z10) {
            return this.f6324h[(i10 << 1) + 1];
        }
        t.a.c("Expected index to be within 0..size()-1, but was " + i10);
        throw null;
    }

    public final int hashCode() {
        int[] iArr = this.f6323g;
        Object[] objArr = this.f6324h;
        int i10 = this.f6325i;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            i13 += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return i13;
    }

    public final boolean isEmpty() {
        return this.f6325i <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i10 = this.f6325i;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int b2 = obj != null ? b(hashCode, obj) : d();
        if (b2 >= 0) {
            int i11 = (b2 << 1) + 1;
            Object[] objArr = this.f6324h;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~b2;
        int[] iArr = this.f6323g;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i13);
            pc.j.d(copyOf, "copyOf(...)");
            this.f6323g = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f6324h, i13 << 1);
            pc.j.d(copyOf2, "copyOf(...)");
            this.f6324h = copyOf2;
            if (i10 != this.f6325i) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f6323g;
            int i14 = i12 + 1;
            bc.l.P(i14, i12, i10, iArr2, iArr2);
            Object[] objArr2 = this.f6324h;
            bc.l.R(objArr2, objArr2, i14 << 1, i12 << 1, this.f6325i << 1);
        }
        int i15 = this.f6325i;
        if (i10 == i15) {
            int[] iArr3 = this.f6323g;
            if (i12 < iArr3.length) {
                iArr3[i12] = hashCode;
                Object[] objArr3 = this.f6324h;
                int i16 = i12 << 1;
                objArr3[i16] = obj;
                objArr3[i16 + 1] = obj2;
                this.f6325i = i15 + 1;
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
        int c3 = c(obj);
        if (c3 >= 0) {
            return f(c3);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int c3 = c(obj);
        if (c3 >= 0) {
            return g(c3, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f6325i;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f6325i * 28);
        sb.append('{');
        int i10 = this.f6325i;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            Object e10 = e(i11);
            if (e10 != sb) {
                sb.append(e10);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object h10 = h(i11);
            if (h10 != sb) {
                sb.append(h10);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        pc.j.d(sb2, "toString(...)");
        return sb2;
    }

    public final boolean remove(Object obj, Object obj2) {
        int c3 = c(obj);
        if (c3 < 0 || !pc.j.a(obj2, h(c3))) {
            return false;
        }
        f(c3);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int c3 = c(obj);
        if (c3 < 0 || !pc.j.a(obj2, h(c3))) {
            return false;
        }
        g(c3, obj3);
        return true;
    }
}
