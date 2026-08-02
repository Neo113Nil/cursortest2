package io.appmetrica.analytics.locationinternal.impl;

import defpackage.eta;
import defpackage.jj4;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0876h {
    public final long a;
    public final long b;

    public C0876h(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0876h.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            C0876h c0876h = (C0876h) obj;
            return this.a == c0876h.a && this.b == c0876h.b;
        }
        jj4.j("null cannot be cast to non-null type io.appmetrica.analytics.locationinternal.impl.model.CacheControl");
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CacheControl(cellsAroundTtl=");
        sb.append(this.a);
        sb.append(", wifiAroundTtl=");
        return eta.g(sb, this.b, ')');
    }
}
