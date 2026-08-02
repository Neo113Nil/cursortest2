package io.appmetrica.analytics.location.impl;

import defpackage.jl40;
import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;

/* loaded from: classes9.dex */
public final class i {
    public final LocationFilter a;
    public final CacheArguments b;

    public /* synthetic */ i() {
        this(new LocationFilter(0L, 0.0f, 3, null), new CacheArguments(0L, 0L, 3, null));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!i.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        i iVar = (i) obj;
        return jl40.l(this.a, iVar.a) && jl40.l(this.b, iVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LocationConfig(locationFilter=" + this.a + ", cacheArguments=" + this.b + ')';
    }

    public i(LocationFilter locationFilter, CacheArguments cacheArguments) {
        this.a = locationFilter;
        this.b = cacheArguments;
    }
}
