package ru.yandex.video.m3.player.impl.tracking.event;

import defpackage.w511;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/event/VideoType;", "", "(Ljava/lang/String;I)V", "VOD", "LIVE", "EVENT", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum VideoType {
    VOD,
    LIVE,
    EVENT;


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/event/VideoType$Companion;", "", "()V", "fromPlayerData", "Lru/yandex/video/m3/player/impl/tracking/event/VideoType;", "videoType", "Lru/yandex/video/m3/data/VideoType;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ru.yandex.video.m3.data.VideoType.values().length];
                try {
                    iArr[ru.yandex.video.m3.data.VideoType.VOD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ru.yandex.video.m3.data.VideoType.EVENT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ru.yandex.video.m3.data.VideoType.LIVE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final VideoType fromPlayerData(ru.yandex.video.m3.data.VideoType videoType) {
            int i = videoType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[videoType.ordinal()];
            if (i == -1) {
                return null;
            }
            if (i == 1) {
                return VideoType.VOD;
            }
            if (i == 2) {
                return VideoType.EVENT;
            }
            if (i == 3) {
                return VideoType.LIVE;
            }
            w511.b();
            return null;
        }

        private Companion() {
        }
    }
}
