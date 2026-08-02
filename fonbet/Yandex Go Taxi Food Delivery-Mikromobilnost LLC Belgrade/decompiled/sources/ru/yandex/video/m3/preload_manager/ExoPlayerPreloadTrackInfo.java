package ru.yandex.video.m3.preload_manager;

import androidx.media3.common.StreamKey;
import defpackage.f7s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.tracks.TrackType;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b\r\u0010!¨\u0006#"}, d2 = {"Lru/yandex/video/m3/preload_manager/ExoPlayerPreloadTrackInfo;", "Lru/yandex/video/m3/preload_manager/PreloadTrackInfo;", "", "title", "Lru/yandex/video/m3/player/tracks/TrackType;", PlaybackException.ErrorInRenderer.TRACK_TYPE, "Landroidx/media3/common/StreamKey;", "streamKey", "Landroidx/media3/common/a;", "format", "Lru/yandex/video/m3/data/StreamType;", "streamType", "", "isDynamic", "<init>", "(Ljava/lang/String;Lru/yandex/video/m3/player/tracks/TrackType;Landroidx/media3/common/StreamKey;Landroidx/media3/common/a;Lru/yandex/video/m3/data/StreamType;Z)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getTitle", "Lru/yandex/video/m3/player/tracks/TrackType;", "getTrackType", "()Lru/yandex/video/m3/player/tracks/TrackType;", "Landroidx/media3/common/StreamKey;", "getStreamKey", "()Landroidx/media3/common/StreamKey;", "Landroidx/media3/common/a;", "getFormat", "()Landroidx/media3/common/a;", "Lru/yandex/video/m3/data/StreamType;", "getStreamType", "()Lru/yandex/video/m3/data/StreamType;", "Z", "()Z", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExoPlayerPreloadTrackInfo implements PreloadTrackInfo {
    private final androidx.media3.common.a format;
    private final boolean isDynamic;
    private final StreamKey streamKey;
    private final StreamType streamType;
    private final String title;
    private final TrackType trackType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final ExoPlayerPreloadTrackInfo EMPTY = new ExoPlayerPreloadTrackInfo("", TrackType.Video, new StreamKey(0, 0, 0), new androidx.media3.common.a(new f7s()), StreamType.Unknown, false);

    public ExoPlayerPreloadTrackInfo(String str, TrackType trackType, StreamKey streamKey, androidx.media3.common.a aVar, StreamType streamType, boolean z) {
        this.title = str;
        this.trackType = trackType;
        this.streamKey = streamKey;
        this.format = aVar;
        this.streamType = streamType;
        this.isDynamic = z;
    }

    public final androidx.media3.common.a getFormat() {
        return this.format;
    }

    public final StreamKey getStreamKey() {
        return this.streamKey;
    }

    public final StreamType getStreamType() {
        return this.streamType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final TrackType getTrackType() {
        return this.trackType;
    }

    /* renamed from: isDynamic, reason: from getter */
    public final boolean getIsDynamic() {
        return this.isDynamic;
    }

    public String toString() {
        return PreloadTrackInfoKt.debugPrint(this);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/preload_manager/ExoPlayerPreloadTrackInfo$Companion;", "", "()V", "EMPTY", "Lru/yandex/video/m3/preload_manager/ExoPlayerPreloadTrackInfo;", "getEMPTY$video_player_internalRelease", "()Lru/yandex/video/m3/preload_manager/ExoPlayerPreloadTrackInfo;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ExoPlayerPreloadTrackInfo getEMPTY$video_player_internalRelease() {
            return ExoPlayerPreloadTrackInfo.EMPTY;
        }

        private Companion() {
        }
    }
}
