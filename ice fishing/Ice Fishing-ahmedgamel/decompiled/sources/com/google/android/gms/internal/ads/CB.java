package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class CB extends AbstractC3446kC implements Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        CB cb = C2761Rj.f27321a;
        Integer valueOf = Integer.valueOf(((C4279zj) obj).f35442p);
        CB cb2 = C2761Rj.f27321a;
        return valueOf.compareTo(Integer.valueOf(((C4279zj) obj2).f35442p));
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
        Object obj2 = L2.f26027h;
        if (!obj2.equals(obj2)) {
            return false;
        }
        Object obj3 = C3392jC.f31213u;
        return obj3.equals(obj3);
    }

    public final int hashCode() {
        return Objects.hash(L2.f26027h, C3392jC.f31213u);
    }

    public final String toString() {
        String obj = L2.f26027h.toString();
        return D.y.s(new StringBuilder(obj.length() + 31), "Ordering.natural().onResultOf(", obj, ")");
    }
}
