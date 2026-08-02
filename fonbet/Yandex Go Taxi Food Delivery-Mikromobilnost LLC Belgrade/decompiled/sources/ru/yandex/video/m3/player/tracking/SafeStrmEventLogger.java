package ru.yandex.video.m3.player.tracking;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/player/tracking/SafeStrmEventLogger;", "Lru/yandex/video/m3/player/tracking/StrmEventLogger;", "Lru/yandex/video/m3/player/tracking/StrmManager;", "strmManager", "<init>", "(Lru/yandex/video/m3/player/tracking/StrmManager;)V", "", "eventName", "Lzy11;", "logEvent", "(Ljava/lang/String;)V", "", "throwable", "logError", "(Ljava/lang/Throwable;)V", "Lru/yandex/video/m3/player/tracking/StrmManager;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SafeStrmEventLogger implements StrmEventLogger {
    public static final int $stable = 8;
    private final StrmManager strmManager;

    public SafeStrmEventLogger(StrmManager strmManager) {
        this.strmManager = strmManager;
    }

    @Override // ru.yandex.video.m3.player.tracking.StrmEventLogger
    public void logError(Throwable throwable) {
        StrmEventLogger strmEventLogger = this.strmManager.getStrmEventLogger();
        if (strmEventLogger != null) {
            strmEventLogger.logError(throwable);
        }
    }

    @Override // ru.yandex.video.m3.player.tracking.StrmEventLogger
    public void logEvent(String eventName) {
        StrmEventLogger strmEventLogger = this.strmManager.getStrmEventLogger();
        if (strmEventLogger != null) {
            strmEventLogger.logEvent(eventName);
        }
    }
}
