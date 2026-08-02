package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreutils.internal.cache.SynchronizedDataCache;
import java.util.List;
import ru.yandex.common.startup.StartupRequest;

/* loaded from: classes9.dex */
public final class D2 extends SynchronizedDataCache {
    public static final P0 a = new P0();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D2() {
        this(r0, 2 * r0);
        long j = a.b;
    }

    public final boolean a(List<w2> list) {
        return true;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.cache.DataCache
    public final boolean shouldUpdate(Object obj) {
        return true;
    }

    public final String toString() {
        return "WifiNetworksDataCache{mCachedData=" + this.mCachedData + '}';
    }

    public D2(long j, long j2) {
        super(j, j2, StartupRequest.PARAM_WIFI);
    }
}
