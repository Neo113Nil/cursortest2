package flex.network.cache.parsing;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lflex/network/cache/parsing/CacheMode;", "", "DISK", "IN_MEMORY", "flex-network-cache_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CacheMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CacheMode[] $VALUES;
    public static final CacheMode DISK;
    public static final CacheMode IN_MEMORY;

    static {
        CacheMode cacheMode = new CacheMode("DISK", 0);
        DISK = cacheMode;
        CacheMode cacheMode2 = new CacheMode("IN_MEMORY", 1);
        IN_MEMORY = cacheMode2;
        CacheMode[] cacheModeArr = {cacheMode, cacheMode2};
        $VALUES = cacheModeArr;
        $ENTRIES = a.a(cacheModeArr);
    }

    public static CacheMode valueOf(String str) {
        return (CacheMode) Enum.valueOf(CacheMode.class, str);
    }

    public static CacheMode[] values() {
        return (CacheMode[]) $VALUES.clone();
    }
}
