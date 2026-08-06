package io.appmetrica.analytics.location.impl;

import android.location.Location;
import io.appmetrica.analytics.coreutils.internal.cache.SynchronizedDataCache;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class m extends SynchronizedDataCache {

    /* renamed from: d, reason: collision with root package name */
    public static final long f7323d = 200;

    /* renamed from: e, reason: collision with root package name */
    public static final long f7324e = 50;

    /* renamed from: a, reason: collision with root package name */
    public final l f7326a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f7321b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c, reason: collision with root package name */
    public static final long f7322c = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: f, reason: collision with root package name */
    public static final List<String> f7325f = Arrays.asList("gps", "network");

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m() {
        this(r1, r2, 2 * r2);
        l lVar = new l(f7322c);
        long j2 = f7321b;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.cache.DataCache
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean shouldUpdate(Location location) {
        return f7325f.contains(location.getProvider()) && (this.mCachedData.isEmpty() || this.mCachedData.shouldUpdateData() || a(location, (Location) this.mCachedData.getData(), this.f7326a.f7320a, 200L));
    }

    public m(l lVar, long j2, long j3) {
        super(j2, j3, "location");
        this.f7326a = lVar;
    }

    public static boolean a(Location location, Location location2, long j2, long j3) {
        boolean equals;
        if (location2 == null) {
            return true;
        }
        if (location == null) {
            return false;
        }
        long time = location.getTime() - location2.getTime();
        boolean z2 = time > j2;
        boolean z3 = time < (-j2);
        boolean z4 = time > 0;
        if (z2) {
            return true;
        }
        if (z3) {
            return false;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z5 = accuracy > 0;
        boolean z6 = accuracy < 0;
        boolean z7 = ((long) accuracy) > j3;
        String provider = location.getProvider();
        String provider2 = location2.getProvider();
        if (provider == null) {
            equals = provider2 == null;
        } else {
            equals = provider.equals(provider2);
        }
        if (z6) {
            return true;
        }
        if (!z4 || z5) {
            return z4 && !z7 && equals;
        }
        return true;
    }
}
