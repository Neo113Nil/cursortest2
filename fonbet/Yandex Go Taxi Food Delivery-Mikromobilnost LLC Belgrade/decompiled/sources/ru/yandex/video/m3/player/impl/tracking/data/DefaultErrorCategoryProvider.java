package ru.yandex.video.m3.player.impl.tracking.data;

import defpackage.w511;
import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.Metadata;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;
import ru.yandex.video.m3.player.AdException;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.impl.tracking.errors.ErrorNoSupportedTracksForRenderer;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¨\u0006\f"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/data/DefaultErrorCategoryProvider;", "Lru/yandex/video/m3/player/impl/tracking/data/ErrorCategoryProvider;", "()V", "getCategory", "", "throwable", "", "isSocketTimeoutException", "", "sourceException", "Ljava/io/IOException;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultErrorCategoryProvider implements ErrorCategoryProvider {
    public static final int $stable = 0;
    public static final String AD = "ADS";
    public static final String CONFIG = "CONFIG";
    public static final String DRM = "DRM";
    public static final String EXCEPTION = "EXCEPTION";
    public static final String MEDIA = "MEDIA";
    public static final String NETWORK_MEDIA = "NETWORK_MEDIA";
    public static final String NETWORK_REQUEST = "NETWORK_REQUEST";
    public static final String NETWORK_TIMEOUT = "NETWORK_TIMEOUT";
    public static final String PREPARING = "PREPARING";
    public static final String UNSUPPORTED_ENV = "UNSUPPORTED_ENV";

    private final boolean isSocketTimeoutException(IOException sourceException) {
        int i = 0;
        for (IOException iOException = sourceException; i < 11 && iOException != null; iOException = iOException.getCause()) {
            if (iOException instanceof SocketTimeoutException) {
                return true;
            }
            i++;
        }
        return false;
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.data.ErrorCategoryProvider
    public String getCategory(Throwable throwable) {
        if (!(throwable instanceof PlaybackException)) {
            return throwable instanceof NetworkRequestException ? NETWORK_REQUEST : throwable instanceof ErrorNoSupportedTracksForRenderer ? UNSUPPORTED_ENV : throwable instanceof AdException ? AD : throwable instanceof IOException ? isSocketTimeoutException((IOException) throwable) ? NETWORK_TIMEOUT : NETWORK_MEDIA : EXCEPTION;
        }
        PlaybackException playbackException = (PlaybackException) throwable;
        if (playbackException instanceof PlaybackException.UnsupportedContentException.ErrorParser.InvalidStreamUrl) {
            return CONFIG;
        }
        if (playbackException instanceof PlaybackException.ErrorSeekPosition ? true : playbackException instanceof PlaybackException.ErrorPlaylistStuck ? true : playbackException instanceof PlaybackException.ErrorPlaylistReset ? true : playbackException instanceof PlaybackException.ErrorCache ? true : playbackException instanceof PlaybackException.ErrorLicenseViolation ? true : playbackException instanceof PlaybackException.UnsupportedContentException.ErrorParser ? true : playbackException instanceof PlaybackException.ErrorBehindLiveWindow ? true : playbackException instanceof PlaybackException.AdaptationSetsCountChanged ? true : playbackException instanceof PlaybackException.RepresentationCountChanged) {
            return MEDIA;
        }
        if (playbackException instanceof PlaybackException.ErrorQueryingDecoders ? true : playbackException instanceof PlaybackException.ErrorNoSecureDecoder ? true : playbackException instanceof PlaybackException.ErrorNoDecoder ? true : playbackException instanceof PlaybackException.ErrorInstantiatingDecoder ? true : playbackException instanceof PlaybackException.ErrorSubtitleNoDecoder ? true : playbackException instanceof PlaybackException.UnsupportedContentException.ErrorAudio ? true : playbackException instanceof PlaybackException.UnsupportedContentException.ErrorVideo ? true : playbackException instanceof PlaybackException.FrameDropDetected ? true : playbackException instanceof PlaybackException.ErrorInRenderer) {
            return UNSUPPORTED_ENV;
        }
        if (playbackException instanceof PlaybackException.DrmThrowable) {
            return DRM;
        }
        if (playbackException instanceof PlaybackException.ErrorConnection ? true : playbackException instanceof PlaybackException.ErrorConnectionSSLHandshake ? true : playbackException instanceof PlaybackException.ErrorNoInternetConnection) {
            return NETWORK_MEDIA;
        }
        if (playbackException instanceof PlaybackException.TrackSelectionInitialization ? true : playbackException instanceof PlaybackException.HLSLiveRequestsStartOutOfLiveWindow ? true : playbackException instanceof PlaybackException.ErrorNoPrepare ? true : playbackException instanceof PlaybackException.ErrorNegativeStartPosition) {
            return CONFIG;
        }
        if (playbackException instanceof PlaybackException.PlaybackForbidden ? true : playbackException instanceof PlaybackException.ErrorPreparing ? true : playbackException instanceof PlaybackException.ErrorPlayerReleased ? true : playbackException instanceof PlaybackException.ErrorPlayerStopped ? true : playbackException instanceof PlaybackException.ErrorPlayerRePrepared) {
            return PREPARING;
        }
        if ((playbackException instanceof PlaybackException.WrongCallbackThread ? true : playbackException instanceof PlaybackException.ErrorTimeout.ErrorUndefined ? true : playbackException instanceof PlaybackException.ErrorTimeout.ErrorForegroundMode ? true : playbackException instanceof PlaybackException.ErrorTimeout.ErrorPlayerRelease ? true : playbackException instanceof PlaybackException.ErrorTimeout.ErrorDetachSurface ? true : playbackException instanceof PlaybackException.ErrorGeneric.ErrorBehindLiveWindowFromPreloadedLiveDashManifest ? true : playbackException instanceof PlaybackException.ErrorGeneric.PreloadedLiveDashManifestInCacheExpired ? true : playbackException instanceof PlaybackException.ErrorGeneric ? true : playbackException instanceof PlaybackException.Cancellation ? true : playbackException instanceof PlaybackException.ErrorDataSourceReadPositionOutOfRange ? true : playbackException instanceof PlaybackException.ErrorDataSource ? true : playbackException instanceof PlaybackException.ErrorStalledStuck) || (playbackException instanceof PlaybackException.Stub)) {
            return EXCEPTION;
        }
        w511.b();
        return null;
    }
}
