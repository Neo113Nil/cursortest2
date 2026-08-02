package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.ads.Wv;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class K extends G implements Set {

    /* renamed from: u, reason: collision with root package name */
    public transient J f36324u;

    public static int f(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static K g(Object[] objArr, int i) {
        if (i == 0) {
            return N.f36341B;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new P(obj);
        }
        int f2 = f(i);
        Object[] objArr2 = new Object[f2];
        int i4 = f2 - 1;
        int i6 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                throw new NullPointerException(Wv.f(i10, "at index "));
            }
            int hashCode = obj2.hashCode();
            int rotateLeft = (int) (Integer.rotateLeft((int) (hashCode * (-862048943)), 15) * 461845907);
            while (true) {
                int i11 = rotateLeft & i4;
                Object obj3 = objArr2[i11];
                if (obj3 == null) {
                    objArr[i9] = obj2;
                    objArr2[i11] = obj2;
                    i6 += hashCode;
                    i9++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    rotateLeft++;
                }
            }
        }
        Arrays.fill(objArr, i9, i, (Object) null);
        if (i9 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new P(obj4);
        }
        if (f(i9) < f2 / 2) {
            return g(objArr, i9);
        }
        if (i9 < 3) {
            objArr = Arrays.copyOf(objArr, i9);
        }
        return new N(i6, i4, i9, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof K) && (this instanceof N)) {
            K k9 = (K) obj;
            k9.getClass();
            if ((k9 instanceof N) && hashCode() != obj.hashCode()) {
                return false;
            }
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
