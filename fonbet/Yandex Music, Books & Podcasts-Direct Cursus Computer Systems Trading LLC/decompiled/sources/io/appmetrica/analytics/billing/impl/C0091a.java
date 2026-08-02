package io.appmetrica.analytics.billing.impl;

import defpackage.dfi;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.billing.impl.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0091a {
    public final List a;
    public final boolean b;

    public C0091a(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0091a)) {
            return false;
        }
        C0091a c0091a = (C0091a) obj;
        return Intrinsics.d(this.a, c0091a.a) && this.b == c0091a.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoInappCollectingInfo(billingInfos=");
        sb.append(this.a);
        sb.append(", firstInappCheckOccurred=");
        return dfi.j(sb, this.b, ')');
    }
}
