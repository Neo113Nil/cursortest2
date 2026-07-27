package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class FB extends AbstractC3621nC implements Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        FB fb = C2794Tj.f27817a;
        Integer valueOf = Integer.valueOf(((C2522Dj) obj).f24545p);
        FB fb2 = C2794Tj.f27817a;
        return valueOf.compareTo(Integer.valueOf(((C2522Dj) obj2).f24545p));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FB)) {
            return false;
        }
        ((FB) obj).getClass();
        Object obj2 = J2.f25697h;
        if (!obj2.equals(obj2)) {
            return false;
        }
        Object obj3 = C3567mC.f32672u;
        return obj3.equals(obj3);
    }

    public final int hashCode() {
        return Objects.hash(J2.f25697h, C3567mC.f32672u);
    }

    public final String toString() {
        String obj = J2.f25697h.toString();
        return D.y.o(new StringBuilder(obj.length() + 31), "Ordering.natural().onResultOf(", obj, ")");
    }
}
