package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public abstract class XB extends NB implements Set {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f29283v = 0;

    /* renamed from: u, reason: collision with root package name */
    public transient RB f29284u;

    public static XB i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
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
            AbstractC2792Sd.q("collection too large", max < 1073741824);
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static XB k(Set set) {
        if ((set instanceof XB) && !(set instanceof SortedSet)) {
            XB xb = (XB) set;
            if (!xb.g()) {
                return xb;
            }
        }
        Object[] array = set.toArray();
        return o(array, array.length);
    }

    public static XB l(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? o((Object[]) objArr.clone(), length) : new YB(objArr[0]) : C3846rC.f34305C;
    }

    public static WB n(int i) {
        MA.q(i, "expectedSize");
        WB wb = new WB(i);
        wb.f29120d = new Object[j(i)];
        return wb;
    }

    public static XB o(Object[] objArr, int i) {
        if (i == 0) {
            return C3846rC.f34305C;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new YB(obj);
        }
        int j6 = j(i);
        Object[] objArr2 = new Object[j6];
        int i4 = j6 - 1;
        int i6 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            Object obj2 = objArr[i10];
            AbstractC2792Sd.o(i10, obj2);
            int hashCode = obj2.hashCode();
            int n9 = AbstractC2659Kg.n(hashCode);
            while (true) {
                int i11 = n9 & i4;
                Object obj3 = objArr2[i11];
                if (obj3 == null) {
                    objArr[i9] = obj2;
                    objArr2[i11] = obj2;
                    i6 += hashCode;
                    i9++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    n9++;
                }
            }
        }
        Arrays.fill(objArr, i9, i, (Object) null);
        if (i9 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new YB(obj4);
        }
        if (j(i9) < j6 / 2) {
            return o(objArr, i9);
        }
        int length = objArr.length;
        if (i9 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i9);
        }
        return new C3846rC(i6, i4, i9, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof XB) && (this instanceof C3846rC)) {
            XB xb = (XB) obj;
            xb.getClass();
            if ((xb instanceof C3846rC) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return AbstractC2659Kg.y(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.NB
    public RB f() {
        RB rb = this.f29284u;
        if (rb != null) {
            return rb;
        }
        RB m9 = m();
        this.f29284u = m9;
        return m9;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC2659Kg.t(this);
    }

    public RB m() {
        Object[] array = toArray(NB.f27255n);
        PB pb = RB.f27933u;
        return RB.p(array, array.length);
    }
}
