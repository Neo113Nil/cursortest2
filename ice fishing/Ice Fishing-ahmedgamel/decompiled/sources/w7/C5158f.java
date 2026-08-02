package w7;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: w7.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5158f implements Map, Serializable, J7.d {

    /* renamed from: G, reason: collision with root package name */
    public static final C5158f f41731G;

    /* renamed from: A, reason: collision with root package name */
    public int f41732A;

    /* renamed from: B, reason: collision with root package name */
    public int f41733B;

    /* renamed from: C, reason: collision with root package name */
    public C5159g f41734C;

    /* renamed from: D, reason: collision with root package name */
    public C5160h f41735D;

    /* renamed from: E, reason: collision with root package name */
    public C5159g f41736E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f41737F;

    /* renamed from: n, reason: collision with root package name */
    public Object[] f41738n;

    /* renamed from: u, reason: collision with root package name */
    public Object[] f41739u;

    /* renamed from: v, reason: collision with root package name */
    public int[] f41740v;

    /* renamed from: w, reason: collision with root package name */
    public int[] f41741w;

    /* renamed from: x, reason: collision with root package name */
    public int f41742x;

    /* renamed from: y, reason: collision with root package name */
    public int f41743y;

    /* renamed from: z, reason: collision with root package name */
    public int f41744z;

    static {
        C5158f c5158f = new C5158f(0);
        c5158f.f41737F = true;
        f41731G = c5158f;
    }

    public C5158f() {
        this(8);
    }

    public final int a(Object obj) {
        d();
        while (true) {
            int k9 = k(obj);
            int i = this.f41742x * 2;
            int length = this.f41741w.length / 2;
            if (i > length) {
                i = length;
            }
            int i4 = 0;
            while (true) {
                int[] iArr = this.f41741w;
                int i6 = iArr[k9];
                if (i6 <= 0) {
                    int i9 = this.f41743y;
                    Object[] objArr = this.f41738n;
                    if (i9 < objArr.length) {
                        int i10 = i9 + 1;
                        this.f41743y = i10;
                        objArr[i9] = obj;
                        this.f41740v[i9] = k9;
                        iArr[k9] = i10;
                        this.f41733B++;
                        this.f41732A++;
                        if (i4 > this.f41742x) {
                            this.f41742x = i4;
                        }
                        return i9;
                    }
                    h(1);
                } else {
                    if (kotlin.jvm.internal.h.a(this.f41738n[i6 - 1], obj)) {
                        return -i6;
                    }
                    i4++;
                    if (i4 > i) {
                        l(this.f41741w.length * 2);
                        break;
                    }
                    k9 = k9 == 0 ? this.f41741w.length - 1 : k9 - 1;
                }
            }
        }
    }

    public final C5158f c() {
        d();
        this.f41737F = true;
        if (this.f41733B > 0) {
            return this;
        }
        C5158f c5158f = f41731G;
        kotlin.jvm.internal.h.c(c5158f, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c5158f;
    }

    @Override // java.util.Map
    public final void clear() {
        d();
        int i = this.f41743y - 1;
        if (i >= 0) {
            int i4 = 0;
            while (true) {
                int[] iArr = this.f41740v;
                int i6 = iArr[i4];
                if (i6 >= 0) {
                    this.f41741w[i6] = 0;
                    iArr[i4] = -1;
                }
                if (i4 == i) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        Z2.d.p(this.f41738n, 0, this.f41743y);
        Object[] objArr = this.f41739u;
        if (objArr != null) {
            Z2.d.p(objArr, 0, this.f41743y);
        }
        this.f41733B = 0;
        this.f41743y = 0;
        this.f41732A++;
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
        if (this.f41737F) {
            throw new UnsupportedOperationException();
        }
    }

    public final void e(boolean z6) {
        int i;
        Object[] objArr = this.f41739u;
        int i4 = 0;
        int i6 = 0;
        while (true) {
            i = this.f41743y;
            if (i4 >= i) {
                break;
            }
            int[] iArr = this.f41740v;
            int i9 = iArr[i4];
            if (i9 >= 0) {
                Object[] objArr2 = this.f41738n;
                objArr2[i6] = objArr2[i4];
                if (objArr != null) {
                    objArr[i6] = objArr[i4];
                }
                if (z6) {
                    iArr[i6] = i9;
                    this.f41741w[i9] = i6 + 1;
                }
                i6++;
            }
            i4++;
        }
        Z2.d.p(this.f41738n, i6, i);
        if (objArr != null) {
            Z2.d.p(objArr, i6, this.f41743y);
        }
        this.f41743y = i6;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C5159g c5159g = this.f41736E;
        if (c5159g != null) {
            return c5159g;
        }
        C5159g c5159g2 = new C5159g(this, 0);
        this.f41736E = c5159g2;
        return c5159g2;
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
        return this.f41733B == map.size() && f(map.entrySet());
    }

    public final boolean f(Collection m9) {
        kotlin.jvm.internal.h.e(m9, "m");
        for (Object obj : m9) {
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
        Object[] objArr = this.f41739u;
        kotlin.jvm.internal.h.b(objArr);
        return kotlin.jvm.internal.h.a(objArr[i], entry.getValue());
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int i = i(obj);
        if (i < 0) {
            return null;
        }
        Object[] objArr = this.f41739u;
        kotlin.jvm.internal.h.b(objArr);
        return objArr[i];
    }

    public final void h(int i) {
        Object[] objArr;
        Object[] objArr2 = this.f41738n;
        int length = objArr2.length;
        int i4 = this.f41743y;
        int i6 = length - i4;
        int i9 = i4 - this.f41733B;
        if (i6 < i && i6 + i9 >= i && i9 >= objArr2.length / 4) {
            e(true);
            return;
        }
        int i10 = i4 + i;
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        if (i10 > objArr2.length) {
            int length2 = objArr2.length;
            int i11 = length2 + (length2 >> 1);
            if (i11 - i10 < 0) {
                i11 = i10;
            }
            if (i11 - 2147483639 > 0) {
                i11 = i10 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr2, i11);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            this.f41738n = copyOf;
            Object[] objArr3 = this.f41739u;
            if (objArr3 != null) {
                objArr = Arrays.copyOf(objArr3, i11);
                kotlin.jvm.internal.h.d(objArr, "copyOf(...)");
            } else {
                objArr = null;
            }
            this.f41739u = objArr;
            int[] copyOf2 = Arrays.copyOf(this.f41740v, i11);
            kotlin.jvm.internal.h.d(copyOf2, "copyOf(...)");
            this.f41740v = copyOf2;
            int highestOneBit = Integer.highestOneBit((i11 >= 1 ? i11 : 1) * 3);
            if (highestOneBit > this.f41741w.length) {
                l(highestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        C5156d c5156d = new C5156d(this, 0);
        int i = 0;
        while (c5156d.hasNext()) {
            int i4 = c5156d.f2130n;
            C5158f c5158f = (C5158f) c5156d.f2133w;
            if (i4 >= c5158f.f41743y) {
                throw new NoSuchElementException();
            }
            c5156d.f2130n = i4 + 1;
            c5156d.f2131u = i4;
            Object obj = c5158f.f41738n[i4];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = c5158f.f41739u;
            kotlin.jvm.internal.h.b(objArr);
            Object obj2 = objArr[c5156d.f2131u];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c5156d.e();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        int k9 = k(obj);
        int i = this.f41742x;
        while (true) {
            int i4 = this.f41741w[k9];
            if (i4 == 0) {
                return -1;
            }
            if (i4 > 0) {
                int i6 = i4 - 1;
                if (kotlin.jvm.internal.h.a(this.f41738n[i6], obj)) {
                    return i6;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            k9 = k9 == 0 ? this.f41741w.length - 1 : k9 - 1;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f41733B == 0;
    }

    public final int j(Object obj) {
        int i = this.f41743y;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f41740v[i] >= 0) {
                Object[] objArr = this.f41739u;
                kotlin.jvm.internal.h.b(objArr);
                if (kotlin.jvm.internal.h.a(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    public final int k(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f41744z;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C5159g c5159g = this.f41734C;
        if (c5159g != null) {
            return c5159g;
        }
        C5159g c5159g2 = new C5159g(this, 1);
        this.f41734C = c5159g2;
        return c5159g2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f41740v[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i) {
        this.f41732A++;
        int i4 = 0;
        if (this.f41743y > this.f41733B) {
            e(false);
        }
        this.f41741w = new int[i];
        this.f41744z = Integer.numberOfLeadingZeros(i) + 1;
        while (i4 < this.f41743y) {
            int i6 = i4 + 1;
            int k9 = k(this.f41738n[i4]);
            int i9 = this.f41742x;
            while (true) {
                int[] iArr = this.f41741w;
                if (iArr[k9] == 0) {
                    break;
                }
                i9--;
                if (i9 < 0) {
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
        Object[] objArr = this.f41738n;
        kotlin.jvm.internal.h.e(objArr, "<this>");
        objArr[i] = null;
        Object[] objArr2 = this.f41739u;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i4 = this.f41740v[i];
        int i6 = this.f41742x * 2;
        int length = this.f41741w.length / 2;
        if (i6 > length) {
            i6 = length;
        }
        int i9 = i6;
        int i10 = 0;
        int i11 = i4;
        while (true) {
            i4 = i4 == 0 ? this.f41741w.length - 1 : i4 - 1;
            i10++;
            if (i10 > this.f41742x) {
                this.f41741w[i11] = 0;
                break;
            }
            int[] iArr = this.f41741w;
            int i12 = iArr[i4];
            if (i12 == 0) {
                iArr[i11] = 0;
                break;
            }
            if (i12 < 0) {
                iArr[i11] = -1;
            } else {
                int i13 = i12 - 1;
                int k9 = k(this.f41738n[i13]) - i4;
                int[] iArr2 = this.f41741w;
                if ((k9 & (iArr2.length - 1)) >= i10) {
                    iArr2[i11] = i12;
                    this.f41740v[i13] = i11;
                }
                i9--;
                if (i9 >= 0) {
                    this.f41741w[i11] = -1;
                    break;
                }
            }
            i11 = i4;
            i10 = 0;
            i9--;
            if (i9 >= 0) {
            }
        }
        this.f41740v[i] = -1;
        this.f41733B--;
        this.f41732A++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        d();
        int a9 = a(obj);
        Object[] objArr = this.f41739u;
        if (objArr == null) {
            int length = this.f41738n.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f41739u = objArr;
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
            Object[] objArr = this.f41739u;
            if (objArr == null) {
                int length = this.f41738n.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f41739u = objArr;
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
        Object[] objArr = this.f41739u;
        kotlin.jvm.internal.h.b(objArr);
        Object obj2 = objArr[i];
        m(i);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f41733B;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f41733B * 3) + 2);
        sb.append("{");
        C5156d c5156d = new C5156d(this, 0);
        int i = 0;
        while (c5156d.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i4 = c5156d.f2130n;
            C5158f c5158f = (C5158f) c5156d.f2133w;
            if (i4 >= c5158f.f41743y) {
                throw new NoSuchElementException();
            }
            c5156d.f2130n = i4 + 1;
            c5156d.f2131u = i4;
            Object obj = c5158f.f41738n[i4];
            if (obj == c5158f) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = c5158f.f41739u;
            kotlin.jvm.internal.h.b(objArr);
            Object obj2 = objArr[c5156d.f2131u];
            if (obj2 == c5158f) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            c5156d.e();
            i++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final Collection values() {
        C5160h c5160h = this.f41735D;
        if (c5160h != null) {
            return c5160h;
        }
        C5160h c5160h2 = new C5160h(this);
        this.f41735D = c5160h2;
        return c5160h2;
    }

    public C5158f(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f41738n = objArr;
        this.f41739u = null;
        this.f41740v = iArr;
        this.f41741w = new int[highestOneBit];
        this.f41742x = 2;
        this.f41743y = 0;
        this.f41744z = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }
}
