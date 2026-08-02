package ru.yandex.video.m3.player.ui.debug.internal.providers.composite;

import kotlin.Metadata;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PlayerObserver;
import ru.yandex.video.m3.player.tracks.Track;
import ru.yandex.video.m3.player.ui.debug.internal.providers.BufferSizeProvider;
import ru.yandex.video.m3.player.ui.debug.internal.providers.ErrorProvider;
import ru.yandex.video.m3.player.ui.debug.internal.providers.TracksProvider;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/internal/providers/composite/CompositePlayerObserver;", "Lru/yandex/video/m3/player/PlayerObserver;", "", "Lru/yandex/video/m3/player/ui/debug/internal/providers/BufferSizeProvider;", "bufferSizeProvider", "Lru/yandex/video/m3/player/ui/debug/internal/providers/TracksProvider;", "tracksProvider", "Lru/yandex/video/m3/player/ui/debug/internal/providers/ErrorProvider;", "errorProvider", "<init>", "(Lru/yandex/video/m3/player/ui/debug/internal/providers/BufferSizeProvider;Lru/yandex/video/m3/player/ui/debug/internal/providers/TracksProvider;Lru/yandex/video/m3/player/ui/debug/internal/providers/ErrorProvider;)V", "", "bufferSizeMs", "Lzy11;", "onBufferSizeChanged", "(J)V", "Lru/yandex/video/m3/player/tracks/Track;", "audioTrack", "subtitlesTrack", "videoTrack", "onTracksChanged", "(Lru/yandex/video/m3/player/tracks/Track;Lru/yandex/video/m3/player/tracks/Track;Lru/yandex/video/m3/player/tracks/Track;)V", "Lru/yandex/video/m3/player/PlaybackException;", "playbackException", "onPlaybackError", "(Lru/yandex/video/m3/player/PlaybackException;)V", "Lru/yandex/video/m3/player/ui/debug/internal/providers/BufferSizeProvider;", "Lru/yandex/video/m3/player/ui/debug/internal/providers/TracksProvider;", "Lru/yandex/video/m3/player/ui/debug/internal/providers/ErrorProvider;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CompositePlayerObserver implements PlayerObserver<Object> {
    public static final int $stable = 0;
    private final BufferSizeProvider bufferSizeProvider;
    private final ErrorProvider errorProvider;
    private final TracksProvider tracksProvider;

    public CompositePlayerObserver(BufferSizeProvider bufferSizeProvider, TracksProvider tracksProvider, ErrorProvider errorProvider) {
        this.bufferSizeProvider = bufferSizeProvider;
        this.tracksProvider = tracksProvider;
        this.errorProvider = errorProvider;
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onBufferSizeChanged(long bufferSizeMs) {
        this.bufferSizeProvider.onBufferSizeChanged(bufferSizeMs);
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onPlaybackError(PlaybackException playbackException) {
        this.errorProvider.onPlaybackError(playbackException);
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onTracksChanged(Track audioTrack, Track subtitlesTrack, Track videoTrack) {
        this.tracksProvider.onTracksChanged(audioTrack, subtitlesTrack, videoTrack);
    }
}
