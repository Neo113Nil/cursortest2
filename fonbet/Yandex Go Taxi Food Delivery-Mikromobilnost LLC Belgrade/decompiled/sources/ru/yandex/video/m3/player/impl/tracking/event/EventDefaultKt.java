package ru.yandex.video.m3.player.impl.tracking.event;

import defpackage.w511;
import kotlin.Metadata;
import ru.yandex.video.m3.data.StalledReason;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0001\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"orEmpty", "Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;", "toLoggingStalledReason", "Lru/yandex/video/m3/player/impl/tracking/event/LoggingStalledReason;", "Lru/yandex/video/m3/data/StalledReason;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EventDefaultKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StalledReason.values().length];
            try {
                iArr[StalledReason.INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StalledReason.SEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StalledReason.VIDEO_TRACK_CHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StalledReason.SET_SOURCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StalledReason.RECOVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StalledReason.LIVE_EDGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StalledReason.OTHER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[StalledReason.AD_START.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[StalledReason.AD_END.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final DefaultEventData orEmpty(DefaultEventData defaultEventData) {
        return defaultEventData == null ? new DefaultEventData(null, 1, null) : defaultEventData;
    }

    public static final LoggingStalledReason toLoggingStalledReason(StalledReason stalledReason) {
        switch (WhenMappings.$EnumSwitchMapping$0[stalledReason.ordinal()]) {
            case 1:
                return LoggingStalledReason.INIT;
            case 2:
                return LoggingStalledReason.SEEK;
            case 3:
                return LoggingStalledReason.VIDEO_TRACK_CHANGE;
            case 4:
                return LoggingStalledReason.SET_SOURCE;
            case 5:
                return LoggingStalledReason.RECOVER;
            case 6:
                return LoggingStalledReason.LIVE_EDGE;
            case 7:
                return LoggingStalledReason.OTHER;
            case 8:
                return LoggingStalledReason.AD_START;
            case 9:
                return LoggingStalledReason.AD_END;
            default:
                w511.b();
                return null;
        }
    }
}
