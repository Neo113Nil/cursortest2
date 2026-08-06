package j1;

import R1.l;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.i;

/* renamed from: j1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0969c implements Map, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public static final C0969c f8042n;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f8043a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f8044b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f8045c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f8046d;

    /* renamed from: e, reason: collision with root package name */
    public int f8047e;

    /* renamed from: f, reason: collision with root package name */
    public int f8048f;

    /* renamed from: g, reason: collision with root package name */
    public int f8049g;

    /* renamed from: h, reason: collision with root package name */
    public int f8050h;

    /* renamed from: i, reason: collision with root package name */
    public int f8051i;

    /* renamed from: j, reason: collision with root package name */
    public C0970d f8052j;

    /* renamed from: k, reason: collision with root package name */
    public C0971e f8053k;

    /* renamed from: l, reason: collision with root package name */
    public C0970d f8054l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8055m;

    static {
        C0969c c0969c = new C0969c(0);
        c0969c.f8055m = true;
        f8042n = c0969c;
    }

    public C0969c(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i2];
        int[] iArr = new int[i2];
        int highestOneBit = Integer.highestOneBit((i2 < 1 ? 1 : i2) * 3);
        this.f8043a = objArr;
        this.f8044b = null;
        this.f8045c = iArr;
        this.f8046d = new int[highestOneBit];
        this.f8047e = 2;
        this.f8048f = 0;
        this.f8049g = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    public final int a(Object obj) {
        b();
        while (true) {
            int i2 = i(obj);
            int i3 = this.f8047e * 2;
            int length = this.f8046d.length / 2;
            if (i3 > length) {
                i3 = length;
            }
            int i4 = 0;
            while (true) {
                int[] iArr = this.f8046d;
                int i5 = iArr[i2];
                if (i5 <= 0) {
                    int i6 = this.f8048f;
                    Object[] objArr = this.f8043a;
                    if (i6 < objArr.length) {
                        int i7 = i6 + 1;
                        this.f8048f = i7;
                        objArr[i6] = obj;
                        this.f8045c[i6] = i2;
                        iArr[i2] = i7;
                        this.f8051i++;
                        this.f8050h++;
                        if (i4 > this.f8047e) {
                            this.f8047e = i4;
                        }
                        return i6;
                    }
                    f(1);
                } else {
                    if (i.a(this.f8043a[i5 - 1], obj)) {
                        return -i5;
                    }
                    i4++;
                    if (i4 > i3) {
                        j(this.f8046d.length * 2);
                        break;
                    }
                    i2 = i2 == 0 ? this.f8046d.length - 1 : i2 - 1;
                }
            }
        }
    }

    public final void b() {
        if (this.f8055m) {
            throw new UnsupportedOperationException();
        }
    }

    public final void c(boolean z2) {
        int i2;
        Object[] objArr = this.f8044b;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i2 = this.f8048f;
            if (i3 >= i2) {
                break;
            }
            int[] iArr = this.f8045c;
            int i5 = iArr[i3];
            if (i5 >= 0) {
                Object[] objArr2 = this.f8043a;
                objArr2[i4] = objArr2[i3];
                if (objArr != null) {
                    objArr[i4] = objArr[i3];
                }
                if (z2) {
                    iArr[i4] = i5;
                    this.f8046d[i5] = i4 + 1;
                }
                i4++;
            }
            i3++;
        }
        l.z(this.f8043a, i4, i2);
        if (objArr != null) {
            l.z(objArr, i4, this.f8048f);
        }
        this.f8048f = i4;
    }

    @Override // java.util.Map
    public final void clear() {
        b();
        int i2 = this.f8048f - 1;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                int[] iArr = this.f8045c;
                int i4 = iArr[i3];
                if (i4 >= 0) {
                    this.f8046d[i4] = 0;
                    iArr[i3] = -1;
                }
                if (i3 == i2) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        l.z(this.f8043a, 0, this.f8048f);
        Object[] objArr = this.f8044b;
        if (objArr != null) {
            l.z(objArr, 0, this.f8048f);
        }
        this.f8051i = 0;
        this.f8048f = 0;
        this.f8050h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public final boolean d(Collection m2) {
        i.e(m2, "m");
        for (Object obj : m2) {
            if (obj != null) {
                try {
                    if (!e((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean e(Map.Entry entry) {
        i.e(entry, "entry");
        int g2 = g(entry.getKey());
        if (g2 < 0) {
            return false;
        }
        Object[] objArr = this.f8044b;
        i.b(objArr);
        return i.a(objArr[g2], entry.getValue());
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C0970d c0970d = this.f8054l;
        if (c0970d != null) {
            return c0970d;
        }
        C0970d c0970d2 = new C0970d(this, 0);
        this.f8054l = c0970d2;
        return c0970d2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f8051i != map.size() || !d(map.entrySet())) {
                }
            }
            return false;
        }
        return true;
    }

    public final void f(int i2) {
        Object[] objArr;
        Object[] objArr2 = this.f8043a;
        int length = objArr2.length;
        int i3 = this.f8048f;
        int i4 = length - i3;
        int i5 = i3 - this.f8051i;
        if (i4 < i2 && i4 + i5 >= i2 && i5 >= objArr2.length / 4) {
            c(true);
            return;
        }
        int i6 = i3 + i2;
        if (i6 < 0) {
            throw new OutOfMemoryError();
        }
        if (i6 > objArr2.length) {
            int length2 = objArr2.length;
            int i7 = length2 + (length2 >> 1);
            if (i7 - i6 < 0) {
                i7 = i6;
            }
            if (i7 - 2147483639 > 0) {
                i7 = i6 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr2, i7);
            i.d(copyOf, "copyOf(...)");
            this.f8043a = copyOf;
            Object[] objArr3 = this.f8044b;
            if (objArr3 != null) {
                objArr = Arrays.copyOf(objArr3, i7);
                i.d(objArr, "copyOf(...)");
            } else {
                objArr = null;
            }
            this.f8044b = objArr;
            int[] copyOf2 = Arrays.copyOf(this.f8045c, i7);
            i.d(copyOf2, "copyOf(...)");
            this.f8045c = copyOf2;
            int highestOneBit = Integer.highestOneBit((i7 >= 1 ? i7 : 1) * 3);
            if (highestOneBit > this.f8046d.length) {
                j(highestOneBit);
            }
        }
    }

    public final int g(Object obj) {
        int i2 = i(obj);
        int i3 = this.f8047e;
        while (true) {
            int i4 = this.f8046d[i2];
            if (i4 == 0) {
                return -1;
            }
            if (i4 > 0) {
                int i5 = i4 - 1;
                if (i.a(this.f8043a[i5], obj)) {
                    return i5;
                }
            }
            i3--;
            if (i3 < 0) {
                return -1;
            }
            i2 = i2 == 0 ? this.f8046d.length - 1 : i2 - 1;
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int g2 = g(obj);
        if (g2 < 0) {
            return null;
        }
        Object[] objArr = this.f8044b;
        i.b(objArr);
        return objArr[g2];
    }

    public final int h(Object obj) {
        int i2 = this.f8048f;
        while (true) {
            i2--;
            if (i2 < 0) {
                return -1;
            }
            if (this.f8045c[i2] >= 0) {
                Object[] objArr = this.f8044b;
                i.b(objArr);
                if (i.a(objArr[i2], obj)) {
                    return i2;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        C0967a c0967a = new C0967a(this, 0);
        int i2 = 0;
        while (c0967a.hasNext()) {
            int i3 = c0967a.f8035b;
            C0969c c0969c = c0967a.f8034a;
            if (i3 >= c0969c.f8048f) {
                throw new NoSuchElementException();
            }
            c0967a.f8035b = i3 + 1;
            c0967a.f8036c = i3;
            Object obj = c0969c.f8043a[i3];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = c0969c.f8044b;
            i.b(objArr);
            Object obj2 = objArr[c0967a.f8036c];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c0967a.b();
            i2 += hashCode ^ hashCode2;
        }
        return i2;
    }

    public final int i(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f8049g;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f8051i == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f8045c[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(int i2) {
        this.f8050h++;
        int i3 = 0;
        if (this.f8048f > this.f8051i) {
            c(false);
        }
        this.f8046d = new int[i2];
        this.f8049g = Integer.numberOfLeadingZeros(i2) + 1;
        while (i3 < this.f8048f) {
            int i4 = i3 + 1;
            int i5 = i(this.f8043a[i3]);
            int i6 = this.f8047e;
            while (true) {
                int[] iArr = this.f8046d;
                if (iArr[i5] == 0) {
                    break;
                }
                i6--;
                if (i6 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                i5 = i5 == 0 ? iArr.length - 1 : i5 - 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0024->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int i2) {
        Object[] objArr = this.f8043a;
        i.e(objArr, "<this>");
        objArr[i2] = null;
        Object[] objArr2 = this.f8044b;
        if (objArr2 != null) {
            objArr2[i2] = null;
        }
        int i3 = this.f8045c[i2];
        int i4 = this.f8047e * 2;
        int length = this.f8046d.length / 2;
        if (i4 > length) {
            i4 = length;
        }
        int i5 = i4;
        int i6 = 0;
        int i7 = i3;
        while (true) {
            i3 = i3 == 0 ? this.f8046d.length - 1 : i3 - 1;
            i6++;
            if (i6 > this.f8047e) {
                this.f8046d[i7] = 0;
                break;
            }
            int[] iArr = this.f8046d;
            int i8 = iArr[i3];
            if (i8 == 0) {
                iArr[i7] = 0;
                break;
            }
            if (i8 < 0) {
                iArr[i7] = -1;
            } else {
                int i9 = i8 - 1;
                int i10 = i(this.f8043a[i9]) - i3;
                int[] iArr2 = this.f8046d;
                if ((i10 & (iArr2.length - 1)) >= i6) {
                    iArr2[i7] = i8;
                    this.f8045c[i9] = i7;
                }
                i5--;
                if (i5 >= 0) {
                    this.f8046d[i7] = -1;
                    break;
                }
            }
            i7 = i3;
            i6 = 0;
            i5--;
            if (i5 >= 0) {
            }
        }
        this.f8045c[i2] = -1;
        this.f8051i--;
        this.f8050h++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0970d c0970d = this.f8052j;
        if (c0970d != null) {
            return c0970d;
        }
        C0970d c0970d2 = new C0970d(this, 1);
        this.f8052j = c0970d2;
        return c0970d2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        b();
        int a2 = a(obj);
        Object[] objArr = this.f8044b;
        if (objArr == null) {
            int length = this.f8043a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f8044b = objArr;
        }
        if (a2 >= 0) {
            objArr[a2] = obj2;
            return null;
        }
        int i2 = (-a2) - 1;
        Object obj3 = objArr[i2];
        objArr[i2] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        i.e(from, "from");
        b();
        Set<Map.Entry> entrySet = from.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        f(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a2 = a(entry.getKey());
            Object[] objArr = this.f8044b;
            if (objArr == null) {
                int length = this.f8043a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f8044b = objArr;
            }
            if (a2 >= 0) {
                objArr[a2] = entry.getValue();
            } else {
                int i2 = (-a2) - 1;
                if (!i.a(entry.getValue(), objArr[i2])) {
                    objArr[i2] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        b();
        int g2 = g(obj);
        if (g2 < 0) {
            return null;
        }
        Object[] objArr = this.f8044b;
        i.b(objArr);
        Object obj2 = objArr[g2];
        k(g2);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f8051i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f8051i * 3) + 2);
        sb.append("{");
        C0967a c0967a = new C0967a(this, 0);
        int i2 = 0;
        while (c0967a.hasNext()) {
            if (i2 > 0) {
                sb.append(", ");
            }
            int i3 = c0967a.f8035b;
            C0969c c0969c = c0967a.f8034a;
            if (i3 >= c0969c.f8048f) {
                throw new NoSuchElementException();
            }
            c0967a.f8035b = i3 + 1;
            c0967a.f8036c = i3;
            Object obj = c0969c.f8043a[i3];
            if (obj == c0969c) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = c0969c.f8044b;
            i.b(objArr);
            Object obj2 = objArr[c0967a.f8036c];
            if (obj2 == c0969c) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            c0967a.b();
            i2++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        i.d(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final Collection values() {
        C0971e c0971e = this.f8053k;
        if (c0971e != null) {
            return c0971e;
        }
        C0971e c0971e2 = new C0971e(this);
        this.f8053k = c0971e2;
        return c0971e2;
    }
}
