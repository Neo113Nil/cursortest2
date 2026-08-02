package com.yandex.plus.pay.ui.tarifficator.api;

import defpackage.k5r;
import defpackage.q5b;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b {
    public final Set a;
    public final a b;
    public final Map c;

    public b(q5b q5bVar, a aVar, Map map) {
        q5bVar.getClass();
        aVar.getClass();
        map.getClass();
        this.a = q5bVar;
        this.b = aVar;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.a, bVar.a) && this.b == bVar.b && Intrinsics.d(this.c, bVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 961)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusTarifficatorPaymentConfiguration(screensToSkip=");
        sb.append(this.a);
        sb.append(", paymentMethodId=null, preferredMode=");
        sb.append(this.b);
        sb.append(", externalCallerPayload=");
        return k5r.p(sb, this.c, ')');
    }
}
