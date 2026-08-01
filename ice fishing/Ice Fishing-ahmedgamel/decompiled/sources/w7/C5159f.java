package w7;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: w7.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5159f implements Map, Serializable, J7.d {

    /* renamed from: G, reason: collision with root package name */
    public static final C5159f f41677G;

    /* renamed from: A, reason: collision with root package name */
    public int f41678A;

    /* renamed from: B, reason: collision with root package name */
    public int f41679B;

    /* renamed from: C, reason: collision with root package name */
    public C5160g f41680C;

    /* renamed from: D, reason: collision with root package name */
    public C5161h f41681D;

    /* renamed from: E, reason: collision with root package name */
    public C5160g f41682E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f41683F;

    /* renamed from: n, reason: collision with root package name */
    public Object[] f41684n;

    /* renamed from: u, reason: collision with root package name */
    public Object[] f41685u;

    /* renamed from: v, reason: collision with root package name */
    public int[] f41686v;

    /* renamed from: w, reason: collision with root package name */
    public int[] f41687w;

    /* renamed from: x, reason: collision with root package name */
    public int f41688x;

    /* renamed from: y, reason: collision with root package name */
    public int f41689y;

    /* renamed from: z, reason: collision with root package name */
    public int f41690z;

    static {
        C5159f c5159f = new C5159f(0);
        c5159f.f41683F = true;
        f41677G = c5159f;
    }

    public C5159f() {
        this(8);
    }

    public final int a(Object obj) {
        d();
        while (true) {
            int k9 = k(obj);
            int i = this.f41688x * 2;
            int length = this.f41687w.length / 2;
            if (i > length) {
                i = length;
            }
            int i6 = 0;
            while (true) {
                int[] iArr = this.f41687w;
                int i9 = iArr[k9];
                if (i9 <= 0) {
                    int i10 = this.f41689y;
                    Object[] objArr = this.f41684n;
                    if (i10 < objArr.length) {
                        int i11 = i10 + 1;
                        this.f41689y = i11;
                        objArr[i10] = obj;
                        this.f41686v[i10] = k9;
                        iArr[k9] = i11;
                        this.f41679B++;
                        this.f41678A++;
                        if (i6 > this.f41688x) {
                            this.f41688x = i6;
                        }
                        return i10;
                    }
                    h(1);
                } else {
                    if (kotlin.jvm.internal.h.a(this.f41684n[i9 - 1], obj)) {
                        return -i9;
                    }
                    i6++;
                    if (i6 > i) {
                        l(this.f41687w.length * 2);
                        break;
                    }
                    k9 = k9 == 0 ? this.f41687w.length - 1 : k9 - 1;
                }
            }
        }
    }

    public final C5159f c() {
        d();
        this.f41683F = true;
        if (this.f41679B > 0) {
            return this;
        }
        C5159f c5159f = f41677G;
        kotlin.jvm.internal.h.c(c5159f, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c5159f;
    }

    @Override // java.util.Map
    public final void clear() {
        d();
        int i = this.f41689y - 1;
        if (i >= 0) {
            int i6 = 0;
            while (true) {
                int[] iArr = this.f41686v;
                int i9 = iArr[i6];
                if (i9 >= 0) {
                    this.f41687w[i9] = 0;
                    iArr[i6] = -1;
                }
                if (i6 == i) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        com.bumptech.glide.d.i(this.f41684n, 0, this.f41689y);
        Object[] objArr = this.f41685u;
        if (objArr != null) {
            com.bumptech.glide.d.i(objArr, 0, this.f41689y);
        }
        this.f41679B = 0;
        this.f41689y = 0;
        this.f41678A++;
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
        if (this.f41683F) {
            throw new UnsupportedOperationException();
        }
    }

    public final void e(boolean z3) {
        int i;
        Object[] objArr = this.f41685u;
        int i6 = 0;
        int i9 = 0;
        while (true) {
            i = this.f41689y;
            if (i6 >= i) {
                break;
            }
            int[] iArr = this.f41686v;
            int i10 = iArr[i6];
            if (i10 >= 0) {
                Object[] objArr2 = this.f41684n;
                objArr2[i9] = objArr2[i6];
                if (objArr != null) {
                    objArr[i9] = objArr[i6];
                }
                if (z3) {
                    iArr[i9] = i10;
                    this.f41687w[i10] = i9 + 1;
                }
                i9++;
            }
            i6++;
        }
        com.bumptech.glide.d.i(this.f41684n, i9, i);
        if (objArr != null) {
            com.bumptech.glide.d.i(objArr, i9, this.f41689y);
        }
        this.f41689y = i9;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C5160g c5160g = this.f41682E;
        if (c5160g != null) {
            return c5160g;
        }
        C5160g c5160g2 = new C5160g(this, 0);
        this.f41682E = c5160g2;
        return c5160g2;
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
        return this.f41679B == map.size() && f(map.entrySet());
    }

    public final boolean f(Collection m4) {
        kotlin.jvm.internal.h.e(m4, "m");
        for (Object obj : m4) {
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
        Object[] objArr = this.f41685u;
        kotlin.jvm.internal.h.b(objArr);
        return kotlin.jvm.internal.h.a(objArr[i], entry.getValue());
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int i = i(obj);
        if (i < 0) {
            return null;
        }
        Object[] objArr = this.f41685u;
        kotlin.jvm.internal.h.b(objArr);
        return objArr[i];
    }

    public final void h(int i) {
        Object[] objArr;
        Object[] objArr2 = this.f41684n;
        int length = objArr2.length;
        int i6 = this.f41689y;
        int i9 = length - i6;
        int i10 = i6 - this.f41679B;
        if (i9 < i && i9 + i10 >= i && i10 >= objArr2.length / 4) {
            e(true);
            return;
        }
        int i11 = i6 + i;
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
            this.f41684n = copyOf;
            Object[] objArr3 = this.f41685u;
            if (objArr3 != null) {
                objArr = Arrays.copyOf(objArr3, i12);
                kotlin.jvm.internal.h.d(objArr, "copyOf(...)");
            } else {
                objArr = null;
            }
            this.f41685u = objArr;
            int[] copyOf2 = Arrays.copyOf(this.f41686v, i12);
            kotlin.jvm.internal.h.d(copyOf2, "copyOf(...)");
            this.f41686v = copyOf2;
            int highestOneBit = Integer.highestOneBit((i12 >= 1 ? i12 : 1) * 3);
            if (highestOneBit > this.f41687w.length) {
                l(highestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        C5157d c5157d = new C5157d(this, 0);
        int i = 0;
        while (c5157d.hasNext()) {
            int i6 = c5157d.f2042n;
            C5159f c5159f = (C5159f) c5157d.f2045w;
            if (i6 >= c5159f.f41689y) {
                throw new NoSuchElementException();
            }
            c5157d.f2042n = i6 + 1;
            c5157d.f2043u = i6;
            Object obj = c5159f.f41684n[i6];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = c5159f.f41685u;
            kotlin.jvm.internal.h.b(objArr);
            Object obj2 = objArr[c5157d.f2043u];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c5157d.e();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        int k9 = k(obj);
        int i = this.f41688x;
        while (true) {
            int i6 = this.f41687w[k9];
            if (i6 == 0) {
                return -1;
            }
            if (i6 > 0) {
                int i9 = i6 - 1;
                if (kotlin.jvm.internal.h.a(this.f41684n[i9], obj)) {
                    return i9;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            k9 = k9 == 0 ? this.f41687w.length - 1 : k9 - 1;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f41679B == 0;
    }

    public final int j(Object obj) {
        int i = this.f41689y;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f41686v[i] >= 0) {
                Object[] objArr = this.f41685u;
                kotlin.jvm.internal.h.b(objArr);
                if (kotlin.jvm.internal.h.a(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    public final int k(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f41690z;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C5160g c5160g = this.f41680C;
        if (c5160g != null) {
            return c5160g;
        }
        C5160g c5160g2 = new C5160g(this, 1);
        this.f41680C = c5160g2;
        return c5160g2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f41686v[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i) {
        this.f41678A++;
        int i6 = 0;
        if (this.f41689y > this.f41679B) {
            e(false);
        }
        this.f41687w = new int[i];
        this.f41690z = Integer.numberOfLeadingZeros(i) + 1;
        while (i6 < this.f41689y) {
            int i9 = i6 + 1;
            int k9 = k(this.f41684n[i6]);
            int i10 = this.f41688x;
            while (true) {
                int[] iArr = this.f41687w;
                if (iArr[k9] == 0) {
                    break;
                }
                i10--;
                if (i10 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                k9 = k9 == 0 ? iArr.length - 1 : k9 - 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0024->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(int i) {
        Object[] objArr = this.f41684n;
        kotlin.jvm.internal.h.e(objArr, "<this>");
        objArr[i] = null;
        Object[] objArr2 = this.f41685u;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i6 = this.f41686v[i];
        int i9 = this.f41688x * 2;
        int length = this.f41687w.length / 2;
        if (i9 > length) {
            i9 = length;
        }
        int i10 = i9;
        int i11 = 0;
        int i12 = i6;
        while (true) {
            i6 = i6 == 0 ? this.f41687w.length - 1 : i6 - 1;
            i11++;
            if (i11 > this.f41688x) {
                this.f41687w[i12] = 0;
                break;
            }
            int[] iArr = this.f41687w;
            int i13 = iArr[i6];
            if (i13 == 0) {
                iArr[i12] = 0;
                break;
            }
            if (i13 < 0) {
                iArr[i12] = -1;
            } else {
                int i14 = i13 - 1;
                int k9 = k(this.f41684n[i14]) - i6;
                int[] iArr2 = this.f41687w;
                if ((k9 & (iArr2.length - 1)) >= i11) {
                    iArr2[i12] = i13;
                    this.f41686v[i14] = i12;
                }
                i10--;
                if (i10 >= 0) {
                    this.f41687w[i12] = -1;
                    break;
                }
            }
            i12 = i6;
            i11 = 0;
            i10--;
            if (i10 >= 0) {
            }
        }
        this.f41686v[i] = -1;
        this.f41679B--;
        this.f41678A++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        d();
        int a9 = a(obj);
        Object[] objArr = this.f41685u;
        if (objArr == null) {
            int length = this.f41684n.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f41685u = objArr;
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
            Object[] objArr = this.f41685u;
            if (objArr == null) {
                int length = this.f41684n.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f41685u = objArr;
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
        Object[] objArr = this.f41685u;
        kotlin.jvm.internal.h.b(objArr);
        Object obj2 = objArr[i];
        m(i);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f41679B;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f41679B * 3) + 2);
        sb.append("{");
        C5157d c5157d = new C5157d(this, 0);
        int i = 0;
        while (c5157d.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i6 = c5157d.f2042n;
            C5159f c5159f = (C5159f) c5157d.f2045w;
            if (i6 >= c5159f.f41689y) {
                throw new NoSuchElementException();
            }
            c5157d.f2042n = i6 + 1;
            c5157d.f2043u = i6;
            Object obj = c5159f.f41684n[i6];
            if (obj == c5159f) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = c5159f.f41685u;
            kotlin.jvm.internal.h.b(objArr);
            Object obj2 = objArr[c5157d.f2043u];
            if (obj2 == c5159f) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            c5157d.e();
            i++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final Collection values() {
        C5161h c5161h = this.f41681D;
        if (c5161h != null) {
            return c5161h;
        }
        C5161h c5161h2 = new C5161h(this);
        this.f41681D = c5161h2;
        return c5161h2;
    }

    public C5159f(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f41684n = objArr;
        this.f41685u = null;
        this.f41686v = iArr;
        this.f41687w = new int[highestOneBit];
        this.f41688x = 2;
        this.f41689y = 0;
        this.f41690z = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }
}
