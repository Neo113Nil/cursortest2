package ru.yandex.video.m3.player.netperf;

import defpackage.kwu;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/player/netperf/NeverAddTInUrl;", "Lru/yandex/video/m3/player/netperf/IsAppropriateUrlChecker;", "<init>", "()V", "Lkwu;", "url", "", "isAppropriateUrl", "(Lkwu;)Z", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NeverAddTInUrl implements IsAppropriateUrlChecker {
    public static final int $stable = 0;
    public static final NeverAddTInUrl INSTANCE = new NeverAddTInUrl();

    private NeverAddTInUrl() {
    }

    @Override // ru.yandex.video.m3.player.netperf.IsAppropriateUrlChecker
    public boolean isAppropriateUrl(kwu url) {
        return false;
    }
}
