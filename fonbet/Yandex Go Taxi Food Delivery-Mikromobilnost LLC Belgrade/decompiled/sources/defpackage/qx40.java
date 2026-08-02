package defpackage;

import androidx.collection.c;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public final class qx40 implements Set, fgx {
    public final hz40 a;

    public qx40(hz40 hz40Var) {
        this.a = hz40Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.a.h();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (!ym11.i(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return jl40.l(this.a.d(entry.getKey()), entry.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection<Map.Entry> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : collection2) {
            if (!jl40.l(this.a.d(entry.getKey()), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.f();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new c(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        r18 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
    
        r12 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(Object obj) {
        boolean z;
        int i;
        boolean z2 = false;
        if (!ym11.i(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int hashCode = (key != null ? key.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & HProv.PP_VERSION_TIMESTAMP;
        hz40 hz40Var = this.a;
        int i4 = hz40Var.d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = hz40Var.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                z = z2;
                if (jl40.l(hz40Var.b[i], key)) {
                    break loop0;
                }
                j3 &= j3 - 1;
                z2 = z;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
            z2 = z;
        }
        if (i < 0 || !jl40.l(hz40Var.c[i], entry.getValue())) {
            return z;
        }
        hz40Var.n(i);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        hz40 hz40Var = this.a;
        long[] jArr = hz40Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i = 0;
        boolean z = false;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Iterator it = collection.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                if (jl40.l(entry.getKey(), hz40Var.b[i4]) && jl40.l(entry.getValue(), hz40Var.c[i4])) {
                                    hz40Var.n(i4);
                                    z = true;
                                    break;
                                }
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return z;
                }
            }
            if (i == length) {
                return z;
            }
            i++;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        hz40 hz40Var = this.a;
        long[] jArr = hz40Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i = 0;
        boolean z = false;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Iterator it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                hz40Var.n(i4);
                                z = true;
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (!jl40.l(entry.getKey(), hz40Var.b[i4]) || !jl40.l(entry.getValue(), hz40Var.c[i4])) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return z;
                }
            }
            if (i == length) {
                return z;
            }
            i++;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.a.e;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return vng.J(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return vng.K(this, objArr);
    }
}
