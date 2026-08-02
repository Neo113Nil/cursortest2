package ru.yandex.video.m3.player.impl.tracking.data;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/data/PlayerStateProvider;", "", "Lzy11;", "connectToPlayer", "()V", "disconnectFromPlayer", "Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;", "getPlayerState", "()Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PlayerStateProvider {
    void connectToPlayer();

    void disconnectFromPlayer();

    PlayerState getPlayerState();
}
