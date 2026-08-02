package ru.yandex.video.m3.player.error_handling;

import kotlin.Metadata;
import ru.yandex.video.m3.player.PlaybackException;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/player/error_handling/DummyExternalErrorHandler;", "Lru/yandex/video/m3/player/error_handling/ExternalErrorHandler;", "()V", "onPlaybackError", "", "playbackException", "Lru/yandex/video/m3/player/PlaybackException;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DummyExternalErrorHandler implements ExternalErrorHandler {
    public static final int $stable = 0;

    @Override // ru.yandex.video.m3.player.error_handling.ExternalErrorHandler
    public boolean onPlaybackError(PlaybackException playbackException) {
        return false;
    }
}
