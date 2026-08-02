package ru.yandex.video.m3.player.impl;

import defpackage.ra7;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/player/impl/ErrorBehindLiveWindowFromPreloadedLiveDashManifest;", "Ljava/io/IOException;", "Lra7;", "cache", "", "manifestCacheKey", "", "cause", "<init>", "(Lra7;Ljava/lang/String;Ljava/lang/Throwable;)V", "Lra7;", "getCache", "()Lra7;", "Ljava/lang/String;", "getManifestCacheKey", "()Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ErrorBehindLiveWindowFromPreloadedLiveDashManifest extends IOException {
    public static final int $stable = 8;
    private final ra7 cache;
    private final String manifestCacheKey;

    public ErrorBehindLiveWindowFromPreloadedLiveDashManifest(ra7 ra7Var, String str, Throwable th) {
        super(th);
        this.cache = ra7Var;
        this.manifestCacheKey = str;
    }

    public final ra7 getCache() {
        return this.cache;
    }

    public final String getManifestCacheKey() {
        return this.manifestCacheKey;
    }
}
