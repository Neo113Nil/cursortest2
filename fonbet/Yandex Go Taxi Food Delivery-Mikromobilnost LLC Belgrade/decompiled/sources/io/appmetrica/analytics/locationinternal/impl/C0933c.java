package io.appmetrica.analytics.locationinternal.impl;

import defpackage.jl40;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0933c {
    public final C0962k1 a;
    public final I0 b;
    public final C0981r0 c;
    public final LocationFilter d;

    public C0933c(C0962k1 c0962k1, I0 i0, C0981r0 c0981r0, LocationFilter locationFilter) {
        this.a = c0962k1;
        this.b = i0;
        this.c = c0981r0;
        this.d = locationFilter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0933c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C0933c c0933c = (C0933c) obj;
        return jl40.l(this.a, c0933c.a) && jl40.l(this.b, c0933c.b) && jl40.l(this.c, c0933c.c) && jl40.l(this.d, c0933c.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Arguments(flushingArguments=" + this.a + ", locationArguments=" + this.b + ", lbsArguments=" + this.c + ", locationFilter=" + this.d + ')';
    }
}
