package ru.yandex.video.m3.player.impl.utils;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "", "currentTimeMillis", "", "elapsedRealtime", "uptimeMillis", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TimeProvider {
    long currentTimeMillis();

    long elapsedRealtime();

    long uptimeMillis();
}
