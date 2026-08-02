package com.yandex.plus.pay.ui.core.api.tarifficator;

import com.yandex.plus.pay.ui.api.feature.payment.g;
import defpackage.dfi;
import defpackage.k5r;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements d {
    public final g a;
    public final boolean b;
    public final Map c;
    public final boolean d;

    public b(g gVar, boolean z, Map map, int i) {
        map = (i & 4) != 0 ? null : map;
        boolean z2 = (i & 8) == 0;
        gVar.getClass();
        this.a = gVar;
        this.b = z;
        this.c = map;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.a, bVar.a) && this.b == bVar.b && Intrinsics.d(this.c, bVar.c) && this.d == bVar.d;
    }

    public final int hashCode() {
        int e = k5r.e(this.a.hashCode() * 31, 31, this.b);
        Map map = this.c;
        return Boolean.hashCode(this.d) + ((e + (map == null ? 0 : map.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentError(reason=");
        sb.append(this.a);
        sb.append(", errorScreenSkipped=");
        sb.append(this.b);
        sb.append(", payload=");
        sb.append(this.c);
        sb.append(", failedToStart=");
        return dfi.j(sb, this.d, ')');
    }
}
