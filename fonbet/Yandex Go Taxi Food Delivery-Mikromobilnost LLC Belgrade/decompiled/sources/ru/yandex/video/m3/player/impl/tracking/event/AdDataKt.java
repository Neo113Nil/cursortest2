package ru.yandex.video.m3.player.impl.tracking.event;

import kotlin.Metadata;
import ru.yandex.video.m3.data.AdType;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toTrackingAdType", "Lru/yandex/video/m3/player/impl/tracking/event/TrackingAdType;", "Lru/yandex/video/m3/data/AdType;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdDataKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdType.values().length];
            try {
                iArr[AdType.Preroll.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdType.Midroll.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdType.Postroll.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final TrackingAdType toTrackingAdType(AdType adType) {
        int i = WhenMappings.$EnumSwitchMapping$0[adType.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? TrackingAdType.UNDEFINED : TrackingAdType.POSTROLL : TrackingAdType.MIDROLL : TrackingAdType.PREROLL;
    }
}
