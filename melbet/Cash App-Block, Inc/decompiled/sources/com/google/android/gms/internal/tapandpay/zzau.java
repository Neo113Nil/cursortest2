package com.google.android.gms.internal.tapandpay;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class zzau extends zzaq implements Set {
    public transient zzat zza;

    public static int zzf(int i) {
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
        a$$ExternalSyntheticBUOutline0.m$3("collection too large");
        return 0;
    }

    public static zzau zzk(int i, Object... objArr) {
        if (i == 0) {
            return zzay.zza;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new zzaz(obj);
        }
        int zzf = zzf(i);
        Object[] objArr2 = new Object[zzf];
        int i2 = zzf - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                a$$ExternalSyntheticBUOutline0.m$2(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i5, "at index "));
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
            obj4.getClass();
            return new zzaz(obj4);
        }
        if (zzf(i4) < zzf / 2) {
            return zzk(i4, objArr);
        }
        if (i4 <= 0) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new zzay(i3, i2, i4, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzau) && (this instanceof zzay) && (((zzau) obj) instanceof zzay) && hashCode() != obj.hashCode()) {
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
    public abstract int hashCode();
}
