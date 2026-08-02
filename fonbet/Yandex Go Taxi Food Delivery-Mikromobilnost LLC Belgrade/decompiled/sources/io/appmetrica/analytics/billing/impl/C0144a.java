package io.appmetrica.analytics.billing.impl;

import defpackage.jl40;
import defpackage.unr0;
import java.util.List;

/* renamed from: io.appmetrica.analytics.billing.impl.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0144a {
    public final List a;
    public final boolean b;

    public C0144a(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0144a)) {
            return false;
        }
        C0144a c0144a = (C0144a) obj;
        return jl40.l(this.a, c0144a.a) && this.b == c0144a.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoInappCollectingInfo(billingInfos=");
        sb.append(this.a);
        sb.append(", firstInappCheckOccurred=");
        return unr0.u(sb, this.b, ')');
    }
}
