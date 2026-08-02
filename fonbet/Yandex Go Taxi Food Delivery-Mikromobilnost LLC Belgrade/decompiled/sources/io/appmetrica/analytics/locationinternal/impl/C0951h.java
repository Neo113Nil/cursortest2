package io.appmetrica.analytics.locationinternal.impl;

import defpackage.b64;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0951h {
    public final long a;
    public final long b;

    public C0951h(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0951h.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C0951h c0951h = (C0951h) obj;
        return this.a == c0951h.a && this.b == c0951h.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CacheControl(cellsAroundTtl=");
        sb.append(this.a);
        sb.append(", wifiAroundTtl=");
        return b64.o(sb, this.b, ')');
    }
}
