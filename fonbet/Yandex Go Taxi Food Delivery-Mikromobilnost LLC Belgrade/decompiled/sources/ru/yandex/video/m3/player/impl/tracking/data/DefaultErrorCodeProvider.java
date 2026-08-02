package ru.yandex.video.m3.player.impl.tracking.data;

import kotlin.Metadata;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;
import ru.yandex.video.m3.player.AdException;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.impl.tracking.errors.ErrorNoSupportedTracksForRenderer;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/data/DefaultErrorCodeProvider;", "Lru/yandex/video/m3/player/impl/tracking/data/ErrorCodeProvider;", "()V", "getCode", "", "throwable", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultErrorCodeProvider implements ErrorCodeProvider {
    public static final int $stable = 0;

    @Override // ru.yandex.video.m3.player.impl.tracking.data.ErrorCodeProvider
    public String getCode(Throwable throwable) {
        if (!(throwable instanceof PlaybackException)) {
            return throwable instanceof ErrorNoSupportedTracksForRenderer.Video ? "NoSupportedTracksForVideoRenderer" : throwable instanceof ErrorNoSupportedTracksForRenderer.Audio ? "NoSupportedTracksForAudioRenderer" : throwable instanceof AdException ? ErrorTypeKt.toErrorType((AdException) throwable) : throwable instanceof NetworkRequestException ? ErrorTypeKt.toErrorType((NetworkRequestException) throwable) : throwable.getClass().getName();
        }
        PlaybackException playbackException = (PlaybackException) throwable;
        if (!(playbackException instanceof PlaybackException.ErrorPreparing)) {
            return ErrorTypeKt.toErrorType(playbackException);
        }
        return "Preparing." + ErrorTypeKt.toErrorType(playbackException);
    }
}
