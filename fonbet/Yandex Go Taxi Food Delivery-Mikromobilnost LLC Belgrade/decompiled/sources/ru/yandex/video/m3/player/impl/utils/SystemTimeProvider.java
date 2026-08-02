package ru.yandex.video.m3.player.impl.utils;

import android.os.SystemClock;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/SystemTimeProvider;", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "()V", "currentTimeMillis", "", "elapsedRealtime", "uptimeMillis", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SystemTimeProvider implements TimeProvider {
    public static final int $stable = 0;

    @Override // ru.yandex.video.m3.player.impl.utils.TimeProvider
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // ru.yandex.video.m3.player.impl.utils.TimeProvider
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // ru.yandex.video.m3.player.impl.utils.TimeProvider
    public long uptimeMillis() {
        return SystemClock.uptimeMillis();
    }
}
