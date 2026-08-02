package ru.yandex.video.m3.player.impl.tracking;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/QueryParam;", "", "name", "", "isEssentialForCacheKey", "", "(Ljava/lang/String;Z)V", "()Z", "getName", "()Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class QueryParam {
    public static final int $stable = 0;
    private final boolean isEssentialForCacheKey;
    private final String name;

    public QueryParam(String str, boolean z) {
        this.name = str;
        this.isEssentialForCacheKey = z;
    }

    public final String getName() {
        return this.name;
    }

    /* renamed from: isEssentialForCacheKey, reason: from getter */
    public final boolean getIsEssentialForCacheKey() {
        return this.isEssentialForCacheKey;
    }
}
