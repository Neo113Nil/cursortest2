package io.appmetrica.analytics.locationapi.internal;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class CacheArguments {

    /* renamed from: a, reason: collision with root package name */
    private final long f7354a;

    /* renamed from: b, reason: collision with root package name */
    private final long f7355b;

    public CacheArguments() {
        this(0L, 0L, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!CacheArguments.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.locationapi.internal.CacheArguments");
        }
        CacheArguments cacheArguments = (CacheArguments) obj;
        return this.f7354a == cacheArguments.f7354a && this.f7355b == cacheArguments.f7355b;
    }

    public final long getOutdatedTimeInterval() {
        return this.f7355b;
    }

    public final long getRefreshPeriod() {
        return this.f7354a;
    }

    public int hashCode() {
        return Long.hashCode(this.f7355b) + (Long.hashCode(this.f7354a) * 31);
    }

    public String toString() {
        return "CacheArguments(refreshPeriod=" + this.f7354a + ", outdatedTimeInterval=" + this.f7355b + ')';
    }

    public CacheArguments(long j2, long j3) {
        this.f7354a = j2;
        this.f7355b = j3;
    }

    public /* synthetic */ CacheArguments(long j2, long j3, int i2, e eVar) {
        this((i2 & 1) != 0 ? TimeUnit.SECONDS.toMillis(10L) : j2, (i2 & 2) != 0 ? TimeUnit.MINUTES.toMillis(2L) : j3);
    }
}
