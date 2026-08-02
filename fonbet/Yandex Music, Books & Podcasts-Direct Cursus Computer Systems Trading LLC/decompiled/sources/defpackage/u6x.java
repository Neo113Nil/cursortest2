package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class u6x extends a6x implements Set {
    public transient i6x b;

    public static int s(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        }
        if (max < 1073741824) {
            return 1073741824;
        }
        xq0.x("collection too large");
        return 0;
    }

    public static u6x u(int i, Object... objArr) {
        if (i == 0) {
            return v7x.i;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new x7x(obj);
        }
        int s = s(i);
        Object[] objArr2 = new Object[s];
        int i2 = s - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                jj4.j(k5r.i(i5, "at index "));
                return null;
            }
            int hashCode = obj2.hashCode();
            int L = neg.L(hashCode);
            while (true) {
                int i6 = L & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    L++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new x7x(obj4);
        }
        if (s(i4) < s / 2) {
            return u(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new v7x(i3, i2, i4, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof u6x) && (this instanceof v7x) && (((u6x) obj) instanceof v7x) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    @Override // defpackage.a6x
    public i6x o() {
        i6x i6xVar = this.b;
        if (i6xVar != null) {
            return i6xVar;
        }
        i6x t = t();
        this.b = t;
        return t;
    }

    public i6x t() {
        Object[] array = toArray(a6x.a);
        e6x e6xVar = i6x.b;
        return i6x.u(array.length, array);
    }
}
