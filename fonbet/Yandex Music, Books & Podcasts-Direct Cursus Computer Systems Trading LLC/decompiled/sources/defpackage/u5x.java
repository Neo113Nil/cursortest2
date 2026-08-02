package defpackage;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class u5x extends r4x implements Set {
    public static final /* synthetic */ int e = 0;
    public transient q5x d;

    public static u5x s(int i, Object... objArr) {
        if (i == 0) {
            return r6x.l;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new y6x(obj);
        }
        int t = t(i);
        Object[] objArr2 = new Object[t];
        int i2 = t - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                jj4.j(k5r.i(i5, "at index "));
                return null;
            }
            int hashCode = obj2.hashCode();
            int rotateLeft = (int) (Integer.rotateLeft((int) (hashCode * (-862048943)), 15) * 461845907);
            while (true) {
                int i6 = rotateLeft & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    rotateLeft++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new y6x(obj4);
        }
        if (t(i4) < t / 2) {
            return s(i4, objArr);
        }
        if (i4 <= 0) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new r6x(i3, i2, i4, objArr, objArr2);
    }

    public static int t(int i) {
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

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof u5x) && (this instanceof r6x) && (((u5x) obj) instanceof r6x) && ((r6x) this).g != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (size() == set.size()) {
                return containsAll(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return bfg.R(this);
    }

    public q5x u() {
        q5x q5xVar = this.d;
        if (q5xVar != null) {
            return q5xVar;
        }
        q5x v = v();
        this.d = v;
        return v;
    }

    public q5x v() {
        Object[] array = toArray(r4x.b);
        t4x t4xVar = q5x.d;
        return q5x.u(array.length, array);
    }
}
