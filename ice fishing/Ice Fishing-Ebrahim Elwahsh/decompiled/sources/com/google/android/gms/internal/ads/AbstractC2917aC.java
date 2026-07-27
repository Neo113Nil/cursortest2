package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.aC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2917aC extends QB implements Set {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f29181v = 0;

    /* renamed from: u, reason: collision with root package name */
    public transient UB f29182u;

    public static AbstractC2917aC i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length;
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return o(objArr2, i);
    }

    public static int j(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            PA.u("collection too large", max < 1073741824);
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static AbstractC2917aC k(Set set) {
        if ((set instanceof AbstractC2917aC) && !(set instanceof SortedSet)) {
            AbstractC2917aC abstractC2917aC = (AbstractC2917aC) set;
            if (!abstractC2917aC.g()) {
                return abstractC2917aC;
            }
        }
        Object[] array = set.toArray();
        return o(array, array.length);
    }

    public static AbstractC2917aC l(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? o((Object[]) objArr.clone(), length) : new C2972bC(objArr[0]) : C3998uC.f34563C;
    }

    public static ZB n(int i) {
        AbstractC2720Pd.p(i, "expectedSize");
        ZB zb = new ZB(i);
        zb.f28971d = new Object[j(i)];
        return zb;
    }

    public static AbstractC2917aC o(Object[] objArr, int i) {
        if (i == 0) {
            return C3998uC.f34563C;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new C2972bC(obj);
        }
        int j9 = j(i);
        Object[] objArr2 = new Object[j9];
        int i4 = j9 - 1;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            Object obj2 = objArr[i11];
            PA.s(i11, obj2);
            int hashCode = obj2.hashCode();
            int n9 = AbstractC3194fG.n(hashCode);
            while (true) {
                int i12 = n9 & i4;
                Object obj3 = objArr2[i12];
                if (obj3 == null) {
                    objArr[i10] = obj2;
                    objArr2[i12] = obj2;
                    i9 += hashCode;
                    i10++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    n9++;
                }
            }
        }
        Arrays.fill(objArr, i10, i, (Object) null);
        if (i10 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new C2972bC(obj4);
        }
        if (j(i10) < j9 / 2) {
            return o(objArr, i10);
        }
        int length = objArr.length;
        if (i10 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i10);
        }
        return new C3998uC(i9, i4, i10, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC2917aC) && (this instanceof C3998uC)) {
            AbstractC2917aC abstractC2917aC = (AbstractC2917aC) obj;
            abstractC2917aC.getClass();
            if ((abstractC2917aC instanceof C3998uC) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return AbstractC3194fG.v(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.QB
    public UB f() {
        UB ub = this.f29182u;
        if (ub != null) {
            return ub;
        }
        UB m8 = m();
        this.f29182u = m8;
        return m8;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC3194fG.s(this);
    }

    public UB m() {
        Object[] array = toArray(QB.f27126n);
        SB sb = UB.f27942u;
        return UB.p(array, array.length);
    }
}
