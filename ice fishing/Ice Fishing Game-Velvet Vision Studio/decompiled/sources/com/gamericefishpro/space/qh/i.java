package com.gamericefishpro.space.qh;

import com.gamericefishpro.space.i9.y3;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Map, Serializable, com.gamericefishpro.space.fi.e {
    public static final e G = new e(null);
    public static final i H;
    public int A;
    public int B;
    public com.gamericefishpro.space.y0.e C;
    public k D;
    public j E;
    public boolean F;
    public Object[] d;
    public Object[] e;
    public int[] i;
    public int[] v;
    public int w;
    public int y;
    public int z;

    static {
        i iVar = new i(0);
        iVar.F = true;
        H = iVar;
    }

    public i() {
        this(8);
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int iL = l(obj);
            int i = this.w * 2;
            int length = this.v.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.v;
                int i3 = iArr[iL];
                if (i3 <= 0) {
                    int i4 = this.y;
                    Object[] objArr = this.d;
                    if (i4 >= objArr.length) {
                        i(1);
                        break;
                    }
                    int i5 = i4 + 1;
                    this.y = i5;
                    objArr[i4] = obj;
                    this.i[i4] = iL;
                    iArr[iL] = i5;
                    this.B++;
                    this.A++;
                    if (i2 > this.w) {
                        this.w = i2;
                    }
                    return i4;
                }
                if (Intrinsics.a(this.d[i3 - 1], obj)) {
                    return -i3;
                }
                i2++;
                if (i2 > i) {
                    m(this.v.length * 2);
                    break;
                }
                iL = iL == 0 ? this.v.length - 1 : iL - 1;
            }
        }
    }

    public final i b() {
        c();
        this.F = true;
        if (this.B > 0) {
            return this;
        }
        i iVar = H;
        Intrinsics.c(iVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return iVar;
    }

    public final void c() {
        if (this.F) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.y - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.i;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.v[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        y3.K(this.d, 0, this.y);
        Object[] objArr = this.e;
        if (objArr != null) {
            y3.K(objArr, 0, this.y);
        }
        this.B = 0;
        this.y = 0;
        this.A++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return j(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return k(obj) >= 0;
    }

    public final void d(boolean z) {
        int i;
        Object[] objArr = this.e;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.y;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.i;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.d;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.v[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        y3.K(this.d, i3, i);
        if (objArr != null) {
            y3.K(objArr, i3, this.y);
        }
        this.y = i3;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        j jVar = this.E;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this);
        this.E = jVar2;
        return jVar2;
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
        return this.B == map.size() && f(map.entrySet());
    }

    public final boolean f(Collection m) {
        Intrinsics.checkNotNullParameter(m, "m");
        for (Object obj : m) {
            if (obj != null) {
                try {
                    if (!h((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iJ = j(obj);
        if (iJ < 0) {
            return null;
        }
        Object[] objArr = this.e;
        Intrinsics.b(objArr);
        return objArr[iJ];
    }

    public final boolean h(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        int iJ = j(entry.getKey());
        if (iJ < 0) {
            return false;
        }
        Object[] objArr = this.e;
        Intrinsics.b(objArr);
        return Intrinsics.a(objArr[iJ], entry.getValue());
    }

    @Override // java.util.Map
    public final int hashCode() {
        Intrinsics.checkNotNullParameter(this, "map");
        f fVar = new f(this, 0);
        int i = 0;
        while (fVar.hasNext()) {
            int i2 = fVar.d;
            i iVar = (i) fVar.v;
            if (i2 >= iVar.y) {
                throw new NoSuchElementException();
            }
            fVar.d = i2 + 1;
            fVar.e = i2;
            Object obj = iVar.d[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = iVar.e;
            Intrinsics.b(objArr);
            Object obj2 = objArr[fVar.e];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            fVar.c();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final void i(int i) {
        Object[] objArrCopyOf;
        Object[] objArr = this.d;
        int length = objArr.length;
        int i2 = this.y;
        int i3 = length - i2;
        int i4 = i2 - this.B;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            com.gamericefishpro.space.ph.c cVar = com.gamericefishpro.space.ph.f.d;
            int length2 = objArr.length;
            cVar.getClass();
            int iD = com.gamericefishpro.space.ph.c.d(length2, i5);
            Object[] objArr2 = this.d;
            Intrinsics.checkNotNullParameter(objArr2, "<this>");
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, iD);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
            this.d = objArrCopyOf2;
            Object[] objArr3 = this.e;
            if (objArr3 != null) {
                Intrinsics.checkNotNullParameter(objArr3, "<this>");
                objArrCopyOf = Arrays.copyOf(objArr3, iD);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.e = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.i, iD);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.i = iArrCopyOf;
            G.getClass();
            int iHighestOneBit = Integer.highestOneBit((iD >= 1 ? iD : 1) * 3);
            if (iHighestOneBit > this.v.length) {
                m(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.B == 0;
    }

    public final int j(Object obj) {
        int iL = l(obj);
        int i = this.w;
        while (true) {
            int i2 = this.v[iL];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (Intrinsics.a(this.d[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iL = iL == 0 ? this.v.length - 1 : iL - 1;
        }
    }

    public final int k(Object obj) {
        int i = this.y;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.i[i] >= 0) {
                Object[] objArr = this.e;
                Intrinsics.b(objArr);
                if (Intrinsics.a(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        com.gamericefishpro.space.y0.e eVar = this.C;
        if (eVar != null) {
            return eVar;
        }
        com.gamericefishpro.space.y0.e eVar2 = new com.gamericefishpro.space.y0.e(this);
        this.C = eVar2;
        return eVar2;
    }

    public final int l(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.z;
    }

    public final void m(int i) {
        int[] iArr;
        this.A++;
        int i2 = 0;
        if (this.y > this.B) {
            d(false);
        }
        this.v = new int[i];
        G.getClass();
        this.z = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.y) {
            int i3 = i2 + 1;
            int iL = l(this.d[i2]);
            int i4 = this.w;
            while (true) {
                iArr = this.v;
                if (iArr[iL] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                iL = iL == 0 ? iArr.length - 1 : iL - 1;
            }
            iArr[iL] = i3;
            this.i[i2] = iL;
            i2 = i3;
        }
    }

    public final void n(int i) {
        Object[] objArr = this.d;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        objArr[i] = null;
        Object[] objArr2 = this.e;
        if (objArr2 != null) {
            Intrinsics.checkNotNullParameter(objArr2, "<this>");
            objArr2[i] = null;
        }
        int length = this.i[i];
        int i2 = this.w * 2;
        int length2 = this.v.length / 2;
        if (i2 > length2) {
            i2 = length2;
        }
        int i3 = i2;
        int i4 = 0;
        int i5 = length;
        do {
            length = length == 0 ? this.v.length - 1 : length - 1;
            i4++;
            if (i4 > this.w) {
                this.v[i5] = 0;
            } else {
                int[] iArr = this.v;
                int i6 = iArr[length];
                if (i6 == 0) {
                    iArr[i5] = 0;
                } else {
                    if (i6 < 0) {
                        iArr[i5] = -1;
                    } else {
                        int i7 = i6 - 1;
                        int iL = l(this.d[i7]) - length;
                        int[] iArr2 = this.v;
                        if ((iL & (iArr2.length - 1)) >= i4) {
                            iArr2[i5] = i6;
                            this.i[i7] = i5;
                        }
                        i3--;
                    }
                    i5 = length;
                    i4 = 0;
                    i3--;
                }
            }
            this.i[i] = -1;
            this.B--;
            this.A++;
        } while (i3 >= 0);
        this.v[i5] = -1;
        this.i[i] = -1;
        this.B--;
        this.A++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int iA = a(obj);
        Object[] objArr = this.e;
        if (objArr == null) {
            int length = this.d.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.e = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        Intrinsics.checkNotNullParameter(from, "from");
        c();
        Set<Map.Entry> setEntrySet = from.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        i(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.e;
            if (objArr == null) {
                int length = this.d.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.e = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!Intrinsics.a(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int iJ = j(obj);
        if (iJ < 0) {
            return null;
        }
        Object[] objArr = this.e;
        Intrinsics.b(objArr);
        Object obj2 = objArr[iJ];
        n(iJ);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.B;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.B * 3) + 2);
        sb.append("{");
        Intrinsics.checkNotNullParameter(this, "map");
        int i = 0;
        f fVar = new f(this, 0);
        while (fVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            Intrinsics.checkNotNullParameter(sb, "sb");
            int i2 = fVar.d;
            i iVar = (i) fVar.v;
            if (i2 >= iVar.y) {
                throw new NoSuchElementException();
            }
            fVar.d = i2 + 1;
            fVar.e = i2;
            Object obj = iVar.d[i2];
            if (obj == iVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = iVar.e;
            Intrinsics.b(objArr);
            Object obj2 = objArr[fVar.e];
            if (obj2 == iVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            fVar.c();
            i++;
        }
        sb.append("}");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        k kVar = this.D;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this);
        this.D = kVar2;
        return kVar2;
    }

    public i(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        G.getClass();
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.d = objArr;
        this.e = null;
        this.i = iArr;
        this.v = new int[iHighestOneBit];
        this.w = 2;
        this.y = 0;
        this.z = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
