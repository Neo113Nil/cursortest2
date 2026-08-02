package io.appmetrica.analytics.locationinternal.impl;

import defpackage.eta;
import defpackage.jj4;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.v0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0918v0 {
    public final List a;
    public final List b;

    public C0918v0(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0918v0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            C0918v0 c0918v0 = (C0918v0) obj;
            return Intrinsics.d(this.a, c0918v0.a) && Intrinsics.d(this.b, c0918v0.b);
        }
        jj4.j("null cannot be cast to non-null type io.appmetrica.analytics.locationinternal.impl.model.LbsInfo");
        return false;
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List list2 = this.b;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LbsInfo(wifi=");
        sb.append(this.a);
        sb.append(", cells=");
        return eta.h(sb, this.b, ')');
    }
}
