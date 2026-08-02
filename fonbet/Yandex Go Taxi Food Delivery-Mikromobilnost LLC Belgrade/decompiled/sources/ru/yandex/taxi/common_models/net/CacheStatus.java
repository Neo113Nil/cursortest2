package ru.yandex.taxi.common_models.net;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.mc7;
import defpackage.r66;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/common_models/net/CacheStatus;", "", "Companion", "mc7", "UPDATED", "NOT_MODIFIED", "NO_CACHE", "go-client-android.features.experiments:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CacheStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CacheStatus[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final mc7 Companion;
    public static final CacheStatus NOT_MODIFIED;
    public static final CacheStatus NO_CACHE;
    public static final String SERIAL_NOT_MODIFIED = "not_modified";
    public static final String SERIAL_NO_CACHE = "no_cache";
    public static final String SERIAL_UPDATED = "updated";
    public static final CacheStatus UPDATED;

    static {
        CacheStatus cacheStatus = new CacheStatus("UPDATED", 0);
        UPDATED = cacheStatus;
        CacheStatus cacheStatus2 = new CacheStatus("NOT_MODIFIED", 1);
        NOT_MODIFIED = cacheStatus2;
        CacheStatus cacheStatus3 = new CacheStatus("NO_CACHE", 2);
        NO_CACHE = cacheStatus3;
        CacheStatus[] cacheStatusArr = {cacheStatus, cacheStatus2, cacheStatus3};
        $VALUES = cacheStatusArr;
        $ENTRIES = kotlin.enums.a.a(cacheStatusArr);
        Companion = new mc7();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new r66(13));
    }

    public static CacheStatus valueOf(String str) {
        return (CacheStatus) Enum.valueOf(CacheStatus.class, str);
    }

    public static CacheStatus[] values() {
        return (CacheStatus[]) $VALUES.clone();
    }
}
