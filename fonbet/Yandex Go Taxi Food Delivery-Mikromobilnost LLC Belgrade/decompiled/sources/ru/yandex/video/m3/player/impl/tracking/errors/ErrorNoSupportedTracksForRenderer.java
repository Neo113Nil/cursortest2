package ru.yandex.video.m3.player.impl.tracking.errors;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0005\u0006B\u0011\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/errors/ErrorNoSupportedTracksForRenderer;", "", Constants.KEY_MESSAGE, "", "(Ljava/lang/String;)V", "Audio", "Video", "Lru/yandex/video/m3/player/impl/tracking/errors/ErrorNoSupportedTracksForRenderer$Audio;", "Lru/yandex/video/m3/player/impl/tracking/errors/ErrorNoSupportedTracksForRenderer$Video;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class ErrorNoSupportedTracksForRenderer extends Throwable {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/errors/ErrorNoSupportedTracksForRenderer$Audio;", "Lru/yandex/video/m3/player/impl/tracking/errors/ErrorNoSupportedTracksForRenderer;", Constants.KEY_MESSAGE, "", "(Ljava/lang/String;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Audio extends ErrorNoSupportedTracksForRenderer {
        public static final int $stable = 0;

        public Audio(String str) {
            super(str, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/errors/ErrorNoSupportedTracksForRenderer$Video;", "Lru/yandex/video/m3/player/impl/tracking/errors/ErrorNoSupportedTracksForRenderer;", Constants.KEY_MESSAGE, "", "(Ljava/lang/String;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Video extends ErrorNoSupportedTracksForRenderer {
        public static final int $stable = 0;

        public Video(String str) {
            super(str, null);
        }
    }

    public /* synthetic */ ErrorNoSupportedTracksForRenderer(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private ErrorNoSupportedTracksForRenderer(String str) {
        super(str);
    }
}
