package io.appmetrica.analytics.locationapi.internal;

import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class LocationFilter {

    /* renamed from: a, reason: collision with root package name */
    private final long f7356a;

    /* renamed from: b, reason: collision with root package name */
    private final float f7357b;

    public LocationFilter() {
        this(0L, 0.0f, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!LocationFilter.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.locationapi.internal.LocationFilter");
        }
        LocationFilter locationFilter = (LocationFilter) obj;
        return this.f7356a == locationFilter.f7356a && this.f7357b == locationFilter.f7357b;
    }

    public final float getUpdateDistanceInterval() {
        return this.f7357b;
    }

    public final long getUpdateTimeInterval() {
        return this.f7356a;
    }

    public int hashCode() {
        return Float.hashCode(this.f7357b) + (Long.hashCode(this.f7356a) * 31);
    }

    public String toString() {
        return "LocationFilter(updateTimeInterval=" + this.f7356a + ", updateDistanceInterval=" + this.f7357b + ')';
    }

    public LocationFilter(long j2, float f2) {
        this.f7356a = j2;
        this.f7357b = f2;
    }

    public /* synthetic */ LocationFilter(long j2, float f2, int i2, e eVar) {
        this((i2 & 1) != 0 ? 5000L : j2, (i2 & 2) != 0 ? 10.0f : f2);
    }
}
