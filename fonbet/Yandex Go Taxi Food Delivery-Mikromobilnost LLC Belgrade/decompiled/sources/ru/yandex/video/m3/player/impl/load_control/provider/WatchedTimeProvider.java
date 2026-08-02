package ru.yandex.video.m3.player.impl.load_control.provider;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/impl/load_control/provider/WatchedTimeProvider;", "Lru/yandex/video/m3/player/impl/load_control/provider/DependentLifecycle;", "getWatchedTimeMs", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface WatchedTimeProvider extends DependentLifecycle {
    long getWatchedTimeMs();
}
