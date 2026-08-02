package yads;

import defpackage.mja1;
import defpackage.ny61;
import defpackage.p481;
import defpackage.q8a1;
import defpackage.w4a1;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes7.dex */
public abstract class y31 extends n31 implements Set {
    public static final /* synthetic */ int c = 0;
    public transient t31 b;

    public static int k(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max < 1073741824) {
            return 1073741824;
        }
        ny61.g("collection too large");
        return 0;
    }

    public static y31 l(int i, Object... objArr) {
        if (i == 0) {
            return cl2.C;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new ay2(obj);
        }
        int k = k(i);
        Object[] objArr2 = new Object[k];
        int i2 = k - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                ny61.t(q8a1.c(i5, "at index "));
                return null;
            }
            int hashCode = obj2.hashCode();
            int a = w4a1.a(hashCode);
            while (true) {
                int i6 = a & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                a++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new ay2(obj4);
        }
        if (k(i4) < k / 2) {
            return l(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new cl2(objArr, i3, objArr2, i2, i4);
    }

    @Override // yads.n31
    public t31 b() {
        t31 t31Var = this.b;
        if (t31Var != null) {
            return t31Var;
        }
        t31 m = m();
        this.b = m;
        return m;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof y31) && (this instanceof cl2) && (((y31) obj) instanceof cl2) && ((cl2) this).x != obj.hashCode()) {
            return false;
        }
        return mja1.e(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return mja1.c(this);
    }

    public t31 m() {
        Object[] array = toArray(n31.a);
        p481 p481Var = t31.b;
        return t31.p(array.length, array);
    }

    @Override // yads.n31
    public Object writeReplace() {
        return new x31(toArray(n31.a));
    }
}
