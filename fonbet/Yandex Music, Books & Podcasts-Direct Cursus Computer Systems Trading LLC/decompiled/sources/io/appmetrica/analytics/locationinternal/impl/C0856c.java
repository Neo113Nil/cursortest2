package io.appmetrica.analytics.locationinternal.impl;

import defpackage.jj4;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0856c {
    public final C0887k1 a;
    public final I0 b;
    public final C0906r0 c;
    public final LocationFilter d;

    public C0856c(C0887k1 c0887k1, I0 i0, C0906r0 c0906r0, LocationFilter locationFilter) {
        this.a = c0887k1;
        this.b = i0;
        this.c = c0906r0;
        this.d = locationFilter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0856c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            C0856c c0856c = (C0856c) obj;
            return Intrinsics.d(this.a, c0856c.a) && Intrinsics.d(this.b, c0856c.b) && Intrinsics.d(this.c, c0856c.c) && Intrinsics.d(this.d, c0856c.d);
        }
        jj4.j("null cannot be cast to non-null type io.appmetrica.analytics.locationinternal.impl.model.Arguments");
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Arguments(flushingArguments=" + this.a + ", locationArguments=" + this.b + ", lbsArguments=" + this.c + ", locationFilter=" + this.d + ')';
    }
}
