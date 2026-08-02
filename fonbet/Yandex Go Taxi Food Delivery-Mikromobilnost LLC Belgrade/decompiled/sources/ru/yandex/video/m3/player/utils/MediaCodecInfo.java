package ru.yandex.video.m3.player.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lru/yandex/video/m3/player/utils/MediaCodecInfo;", "", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MediaCodecInfo {
    public static final int $stable = 0;
    private final String name;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/player/utils/MediaCodecInfo$Builder;", "", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "setName", "build", "Lru/yandex/video/m3/player/utils/MediaCodecInfo;", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private String name;

        public Builder(String str) {
            this.name = str;
        }

        public final MediaCodecInfo build$video_player_internalRelease() {
            return new MediaCodecInfo(this.name, null);
        }

        public final String getName() {
            return this.name;
        }

        public final void setName(String str) {
            this.name = str;
        }
    }

    private MediaCodecInfo(String str) {
        this.name = str;
    }

    public final String getName() {
        return this.name;
    }

    public /* synthetic */ MediaCodecInfo(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
