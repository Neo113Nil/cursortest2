package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class CB extends AbstractC3469kC implements Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        CB cb = C2781Rj.f28005a;
        Integer valueOf = Integer.valueOf(((C4302zj) obj).f36215p);
        CB cb2 = C2781Rj.f28005a;
        return valueOf.compareTo(Integer.valueOf(((C4302zj) obj2).f36215p));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CB)) {
            return false;
        }
        ((CB) obj).getClass();
        Object obj2 = L2.f26827h;
        if (!obj2.equals(obj2)) {
            return false;
        }
        Object obj3 = C3415jC.f32000u;
        return obj3.equals(obj3);
    }

    public final int hashCode() {
        return Objects.hash(L2.f26827h, C3415jC.f32000u);
    }

    public final String toString() {
        String obj = L2.f26827h.toString();
        return D.x.p(new StringBuilder(obj.length() + 31), "Ordering.natural().onResultOf(", obj, ")");
    }
}
