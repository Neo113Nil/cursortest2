package ru.yandex.video.m3.player.impl.tracking;

import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.data.ExtendedStalledReason;
import ru.yandex.video.m3.player.impl.tracking.event.LoggingStalledReason;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/StalledStateProvider;", "", "Lru/yandex/video/m3/player/impl/tracking/event/LoggingStalledReason;", "stalledReason", "", "Lru/yandex/video/m3/player/impl/tracking/StalledState;", "beginStalledPeriods", "(Lru/yandex/video/m3/player/impl/tracking/event/LoggingStalledReason;)Ljava/util/List;", "endStalledPeriod", "()Lru/yandex/video/m3/player/impl/tracking/StalledState;", "", "playWhenReady", "Lzy11;", "setPlayWhenReady", "(Z)V", "Lru/yandex/video/m3/data/ExtendedStalledReason;", "extendedStalledReason", "setExtendedStalledReason", "(Lru/yandex/video/m3/data/ExtendedStalledReason;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface StalledStateProvider {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void setExtendedStalledReason(StalledStateProvider stalledStateProvider, ExtendedStalledReason extendedStalledReason) {
            StalledStateProvider.super.setExtendedStalledReason(extendedStalledReason);
        }

        @Deprecated
        public static void setPlayWhenReady(StalledStateProvider stalledStateProvider, boolean z) {
            StalledStateProvider.super.setPlayWhenReady(z);
        }
    }

    List<StalledState> beginStalledPeriods(LoggingStalledReason stalledReason);

    StalledState endStalledPeriod();

    default void setExtendedStalledReason(ExtendedStalledReason extendedStalledReason) {
    }

    default void setPlayWhenReady(boolean playWhenReady) {
    }
}
