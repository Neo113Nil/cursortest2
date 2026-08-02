package io.appmetrica.analytics.locationinternal.impl;

import defpackage.jl40;
import defpackage.unr0;
import java.util.List;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.v0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0993v0 {
    public final List a;
    public final List b;

    public C0993v0(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0993v0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C0993v0 c0993v0 = (C0993v0) obj;
        return jl40.l(this.a, c0993v0.a) && jl40.l(this.b, c0993v0.b);
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
        return unr0.t(sb, this.b, ')');
    }
}
