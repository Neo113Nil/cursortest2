package ru.yandex.video.m3.player.impl.source;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.dto.VideoData;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/player/impl/source/LaunchType;", "", "()V", "ByContentId", "ByVideoData", "Lru/yandex/video/m3/player/impl/source/LaunchType$ByContentId;", "Lru/yandex/video/m3/player/impl/source/LaunchType$ByVideoData;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class LaunchType {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/player/impl/source/LaunchType$ByContentId;", "Lru/yandex/video/m3/player/impl/source/LaunchType;", "contentId", "", "(Ljava/lang/String;)V", "getContentId", "()Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ByContentId extends LaunchType {
        public static final int $stable = 0;
        private final String contentId;

        public ByContentId(String str) {
            super(null);
            this.contentId = str;
        }

        public final String getContentId() {
            return this.contentId;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/player/impl/source/LaunchType$ByVideoData;", "Lru/yandex/video/m3/player/impl/source/LaunchType;", Constants.KEY_DATA, "Lru/yandex/video/m3/data/dto/VideoData;", "(Lru/yandex/video/m3/data/dto/VideoData;)V", "getData", "()Lru/yandex/video/m3/data/dto/VideoData;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ByVideoData extends LaunchType {
        public static final int $stable = 8;
        private final VideoData data;

        public ByVideoData(VideoData videoData) {
            super(null);
            this.data = videoData;
        }

        public final VideoData getData() {
            return this.data;
        }
    }

    public /* synthetic */ LaunchType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private LaunchType() {
    }
}
