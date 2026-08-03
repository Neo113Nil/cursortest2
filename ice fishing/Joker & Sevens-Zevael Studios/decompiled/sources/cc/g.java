package cc;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g implements Map, Serializable, qc.e {

    /* renamed from: t, reason: collision with root package name */
    public static final g f1314t;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f1315g;

    /* renamed from: h, reason: collision with root package name */
    public Object[] f1316h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f1317i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f1318j;

    /* renamed from: k, reason: collision with root package name */
    public int f1319k;

    /* renamed from: l, reason: collision with root package name */
    public int f1320l;

    /* renamed from: m, reason: collision with root package name */
    public int f1321m;

    /* renamed from: n, reason: collision with root package name */
    public int f1322n;

    /* renamed from: o, reason: collision with root package name */
    public int f1323o;

    /* renamed from: p, reason: collision with root package name */
    public h f1324p;

    /* renamed from: q, reason: collision with root package name */
    public i f1325q;

    /* renamed from: r, reason: collision with root package name */
    public h f1326r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1327s;

    static {
        g gVar = new g(0);
        gVar.f1327s = true;
        f1314t = gVar;
    }

    public g() {
        this(8);
    }

    public final int a(Object obj) {
        d();
        while (true) {
            int k3 = k(obj);
            int i10 = this.f1319k * 2;
            int length = this.f1318j.length / 2;
            if (i10 > length) {
                i10 = length;
            }
            int i11 = 0;
            while (true) {
                int[] iArr = this.f1318j;
                int i12 = iArr[k3];
                if (i12 <= 0) {
                    int i13 = this.f1320l;
                    Object[] objArr = this.f1315g;
                    if (i13 < objArr.length) {
                        int i14 = i13 + 1;
                        this.f1320l = i14;
                        objArr[i13] = obj;
                        this.f1317i[i13] = k3;
                        iArr[k3] = i14;
                        this.f1323o++;
                        this.f1322n++;
                        if (i11 > this.f1319k) {
                            this.f1319k = i11;
                        }
                        return i13;
                    }
                    h(1);
                } else {
                    if (pc.j.a(this.f1315g[i12 - 1], obj)) {
                        return -i12;
                    }
                    i11++;
                    if (i11 > i10) {
                        l(this.f1318j.length * 2);
                        break;
                    }
                    k3 = k3 == 0 ? this.f1318j.length - 1 : k3 - 1;
                }
            }
        }
    }

    public final g b() {
        d();
        this.f1327s = true;
        if (this.f1323o > 0) {
            return this;
        }
        g gVar = f1314t;
        pc.j.c(gVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return gVar;
    }

    @Override // java.util.Map
    public final void clear() {
        d();
        int i10 = this.f1320l - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.f1317i;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.f1318j[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        v6.a.Q(this.f1315g, 0, this.f1320l);
        Object[] objArr = this.f1316h;
        if (objArr != null) {
            v6.a.Q(objArr, 0, this.f1320l);
        }
        this.f1323o = 0;
        this.f1320l = 0;
        this.f1322n++;
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
        if (this.f1327s) {
            throw new UnsupportedOperationException();
        }
    }

    public final void e(boolean z10) {
        int i10;
        Object[] objArr = this.f1316h;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f1320l;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.f1317i;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                Object[] objArr2 = this.f1315g;
                objArr2[i12] = objArr2[i11];
                if (objArr != null) {
                    objArr[i12] = objArr[i11];
                }
                if (z10) {
                    iArr[i12] = i13;
                    this.f1318j[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        v6.a.Q(this.f1315g, i12, i10);
        if (objArr != null) {
            v6.a.Q(objArr, i12, this.f1320l);
        }
        this.f1320l = i12;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        h hVar = this.f1326r;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this, 0);
        this.f1326r = hVar2;
        return hVar2;
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
        return this.f1323o == map.size() && f(map.entrySet());
    }

    public final boolean f(Collection collection) {
        pc.j.e(collection, "m");
        for (Object obj : collection) {
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
        pc.j.e(entry, "entry");
        int i10 = i(entry.getKey());
        if (i10 < 0) {
            return false;
        }
        Object[] objArr = this.f1316h;
        pc.j.b(objArr);
        return pc.j.a(objArr[i10], entry.getValue());
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int i10 = i(obj);
        if (i10 < 0) {
            return null;
        }
        Object[] objArr = this.f1316h;
        pc.j.b(objArr);
        return objArr[i10];
    }

    public final void h(int i10) {
        Object[] objArr;
        Object[] objArr2 = this.f1315g;
        int length = objArr2.length;
        int i11 = this.f1320l;
        int i12 = length - i11;
        int i13 = i11 - this.f1323o;
        if (i12 < i10 && i12 + i13 >= i10 && i13 >= objArr2.length / 4) {
            e(true);
            return;
        }
        int i14 = i11 + i10;
        if (i14 < 0) {
            throw new OutOfMemoryError();
        }
        if (i14 > objArr2.length) {
            int length2 = objArr2.length;
            int i15 = length2 + (length2 >> 1);
            if (i15 - i14 < 0) {
                i15 = i14;
            }
            if (i15 - 2147483639 > 0) {
                i15 = i14 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr2, i15);
            pc.j.d(copyOf, "copyOf(...)");
            this.f1315g = copyOf;
            Object[] objArr3 = this.f1316h;
            if (objArr3 != null) {
                objArr = Arrays.copyOf(objArr3, i15);
                pc.j.d(objArr, "copyOf(...)");
            } else {
                objArr = null;
            }
            this.f1316h = objArr;
            int[] copyOf2 = Arrays.copyOf(this.f1317i, i15);
            pc.j.d(copyOf2, "copyOf(...)");
            this.f1317i = copyOf2;
            int highestOneBit = Integer.highestOneBit((i15 >= 1 ? i15 : 1) * 3);
            if (highestOneBit > this.f1318j.length) {
                l(highestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        d dVar = new d(this, 0);
        int i10 = 0;
        while (dVar.hasNext()) {
            int i11 = dVar.f1310g;
            g gVar = (g) dVar.f1313j;
            if (i11 >= gVar.f1320l) {
                throw new NoSuchElementException();
            }
            dVar.f1310g = i11 + 1;
            dVar.f1311h = i11;
            Object obj = gVar.f1315g[i11];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = gVar.f1316h;
            pc.j.b(objArr);
            Object obj2 = objArr[dVar.f1311h];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            dVar.c();
            i10 += hashCode ^ hashCode2;
        }
        return i10;
    }

    public final int i(Object obj) {
        int k3 = k(obj);
        int i10 = this.f1319k;
        while (true) {
            int i11 = this.f1318j[k3];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (pc.j.a(this.f1315g[i12], obj)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            k3 = k3 == 0 ? this.f1318j.length - 1 : k3 - 1;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f1323o == 0;
    }

    public final int j(Object obj) {
        int i10 = this.f1320l;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f1317i[i10] >= 0) {
                Object[] objArr = this.f1316h;
                pc.j.b(objArr);
                if (pc.j.a(objArr[i10], obj)) {
                    return i10;
                }
            }
        }
    }

    public final int k(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f1321m;
    }

    @Override // java.util.Map
    public final Set keySet() {
        h hVar = this.f1324p;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this, 1);
        this.f1324p = hVar2;
        return hVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f1317i[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i10) {
        this.f1322n++;
        int i11 = 0;
        if (this.f1320l > this.f1323o) {
            e(false);
        }
        this.f1318j = new int[i10];
        this.f1321m = Integer.numberOfLeadingZeros(i10) + 1;
        while (i11 < this.f1320l) {
            int i12 = i11 + 1;
            int k3 = k(this.f1315g[i11]);
            int i13 = this.f1319k;
            while (true) {
                int[] iArr = this.f1318j;
                if (iArr[k3] == 0) {
                    break;
                }
                i13--;
                if (i13 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                k3 = k3 == 0 ? iArr.length - 1 : k3 - 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0024->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(int i10) {
        Object[] objArr = this.f1315g;
        pc.j.e(objArr, "<this>");
        objArr[i10] = null;
        Object[] objArr2 = this.f1316h;
        if (objArr2 != null) {
            objArr2[i10] = null;
        }
        int i11 = this.f1317i[i10];
        int i12 = this.f1319k * 2;
        int length = this.f1318j.length / 2;
        if (i12 > length) {
            i12 = length;
        }
        int i13 = i12;
        int i14 = 0;
        int i15 = i11;
        while (true) {
            i11 = i11 == 0 ? this.f1318j.length - 1 : i11 - 1;
            i14++;
            if (i14 > this.f1319k) {
                this.f1318j[i15] = 0;
                break;
            }
            int[] iArr = this.f1318j;
            int i16 = iArr[i11];
            if (i16 == 0) {
                iArr[i15] = 0;
                break;
            }
            if (i16 < 0) {
                iArr[i15] = -1;
            } else {
                int i17 = i16 - 1;
                int k3 = k(this.f1315g[i17]) - i11;
                int[] iArr2 = this.f1318j;
                if ((k3 & (iArr2.length - 1)) >= i14) {
                    iArr2[i15] = i16;
                    this.f1317i[i17] = i15;
                }
                i13--;
                if (i13 >= 0) {
                    this.f1318j[i15] = -1;
                    break;
                }
            }
            i15 = i11;
            i14 = 0;
            i13--;
            if (i13 >= 0) {
            }
        }
        this.f1317i[i10] = -1;
        this.f1323o--;
        this.f1322n++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        d();
        int a6 = a(obj);
        Object[] objArr = this.f1316h;
        if (objArr == null) {
            int length = this.f1315g.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f1316h = objArr;
        }
        if (a6 >= 0) {
            objArr[a6] = obj2;
            return null;
        }
        int i10 = (-a6) - 1;
        Object obj3 = objArr[i10];
        objArr[i10] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        pc.j.e(map, "from");
        d();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        h(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a6 = a(entry.getKey());
            Object[] objArr = this.f1316h;
            if (objArr == null) {
                int length = this.f1315g.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f1316h = objArr;
            }
            if (a6 >= 0) {
                objArr[a6] = entry.getValue();
            } else {
                int i10 = (-a6) - 1;
                if (!pc.j.a(entry.getValue(), objArr[i10])) {
                    objArr[i10] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        d();
        int i10 = i(obj);
        if (i10 < 0) {
            return null;
        }
        Object[] objArr = this.f1316h;
        pc.j.b(objArr);
        Object obj2 = objArr[i10];
        m(i10);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f1323o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f1323o * 3) + 2);
        sb.append("{");
        int i10 = 0;
        d dVar = new d(this, 0);
        while (dVar.hasNext()) {
            if (i10 > 0) {
                sb.append(", ");
            }
            int i11 = dVar.f1310g;
            g gVar = (g) dVar.f1313j;
            if (i11 >= gVar.f1320l) {
                throw new NoSuchElementException();
            }
            dVar.f1310g = i11 + 1;
            dVar.f1311h = i11;
            Object obj = gVar.f1315g[i11];
            if (obj == gVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = gVar.f1316h;
            pc.j.b(objArr);
            Object obj2 = objArr[dVar.f1311h];
            if (obj2 == gVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            dVar.c();
            i10++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        pc.j.d(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final Collection values() {
        i iVar = this.f1325q;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(0, this);
        this.f1325q = iVar2;
        return iVar2;
    }

    public g(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i10];
        int[] iArr = new int[i10];
        int highestOneBit = Integer.highestOneBit((i10 < 1 ? 1 : i10) * 3);
        this.f1315g = objArr;
        this.f1316h = null;
        this.f1317i = iArr;
        this.f1318j = new int[highestOneBit];
        this.f1319k = 2;
        this.f1320l = 0;
        this.f1321m = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }
}
