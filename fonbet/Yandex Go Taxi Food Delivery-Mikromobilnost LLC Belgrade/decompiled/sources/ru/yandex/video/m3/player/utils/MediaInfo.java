package ru.yandex.video.m3.player.utils;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0015\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/player/utils/MediaInfo;", "", "supportedCodecs", "", "Lru/yandex/video/m3/player/utils/MediaCodecInfo;", "(Ljava/util/List;)V", "getSupportedCodecs", "()Ljava/util/List;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MediaInfo {
    public static final int $stable = 8;
    private final List<MediaCodecInfo> supportedCodecs;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\r\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u000bR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\f"}, d2 = {"Lru/yandex/video/m3/player/utils/MediaInfo$Builder;", "", "supportedCodecs", "", "Lru/yandex/video/m3/player/utils/MediaCodecInfo;", "(Ljava/util/List;)V", "getSupportedCodecs", "()Ljava/util/List;", "setSupportedCodecs", "build", "Lru/yandex/video/m3/player/utils/MediaInfo;", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private List<MediaCodecInfo> supportedCodecs;

        public Builder(List<MediaCodecInfo> list) {
            this.supportedCodecs = list;
        }

        public final MediaInfo build$video_player_internalRelease() {
            return new MediaInfo(this.supportedCodecs, null);
        }

        public final List<MediaCodecInfo> getSupportedCodecs() {
            return this.supportedCodecs;
        }

        public final void setSupportedCodecs(List<MediaCodecInfo> list) {
            this.supportedCodecs = list;
        }
    }

    private MediaInfo(List<MediaCodecInfo> list) {
        this.supportedCodecs = list;
    }

    public final List<MediaCodecInfo> getSupportedCodecs() {
        return this.supportedCodecs;
    }

    public /* synthetic */ MediaInfo(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }
}
