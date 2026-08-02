package ru.yandex.video.m3.player.impl.concurrent;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0012\u0010\u0007\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0004¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/impl/concurrent/ConcurrentPlayerStateProvider;", "", "isActive", "", "()Z", "isNotActive", "isReleased", "isStopped", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ConcurrentPlayerStateProvider {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean isActive(ConcurrentPlayerStateProvider concurrentPlayerStateProvider) {
            return ConcurrentPlayerStateProvider.super.isActive();
        }

        @Deprecated
        public static boolean isNotActive(ConcurrentPlayerStateProvider concurrentPlayerStateProvider) {
            return ConcurrentPlayerStateProvider.super.isNotActive();
        }
    }

    default boolean isActive() {
        return (isStopped() || isReleased()) ? false : true;
    }

    default boolean isNotActive() {
        return isStopped() || isReleased();
    }

    boolean isReleased();

    boolean isStopped();
}
