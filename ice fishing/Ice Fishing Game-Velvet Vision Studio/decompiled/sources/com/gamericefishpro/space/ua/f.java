package com.gamericefishpro.space.ua;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f extends a implements Set {
    public static final /* synthetic */ int i = 0;
    public transient d e;

    public static int i(int i2) {
        int iMax = Math.max(i2, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static f l(int i2, Object... objArr) {
        if (i2 == 0) {
            return n.C;
        }
        if (i2 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new o(obj);
        }
        int i3 = i(i2);
        Object[] objArr2 = new Object[i3];
        int i4 = i3 - 1;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i2; i7++) {
            Object obj2 = objArr[i7];
            if (obj2 == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i7);
                throw new NullPointerException(sb.toString());
            }
            int iHashCode = obj2.hashCode();
            int iE = com.gamericefishpro.space.b9.a.E(iHashCode);
            while (true) {
                int i8 = iE & i4;
                Object obj3 = objArr2[i8];
                if (obj3 == null) {
                    objArr[i6] = obj2;
                    objArr2[i8] = obj2;
                    i5 += iHashCode;
                    i6++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iE++;
            }
        }
        Arrays.fill(objArr, i6, i2, (Object) null);
        if (i6 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new o(obj4);
        }
        if (i(i6) < i3 / 2) {
            return l(i6, objArr);
        }
        int length = objArr.length;
        if (i6 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i6);
        }
        return new n(i5, i4, i6, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof f) && (this instanceof n) && (((f) obj) instanceof n) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() != set.size() || !containsAll(set)) {
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public d h() {
        d dVar = this.e;
        if (dVar != null) {
            return dVar;
        }
        d dVarM = m();
        this.e = dVarM;
        return dVarM;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i2 = ~(~(i2 + (next != null ? next.hashCode() : 0)));
        }
        return i2;
    }

    public d m() {
        Object[] array = toArray(a.d);
        b bVar = d.e;
        return d.h(array.length, array);
    }
}
