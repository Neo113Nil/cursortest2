package ru.yandex.video.m3.player.impl.tracking.data;

import defpackage.w511;
import javax.net.ssl.SSLHandshakeException;
import kotlin.Metadata;
import ru.yandex.video.m3.data.exception.ManifestLoadingException;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;
import ru.yandex.video.m3.player.AdException;
import ru.yandex.video.m3.player.PlaybackException;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0004¨\u0006\u0005"}, d2 = {"toErrorType", "", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException;", "Lru/yandex/video/m3/player/AdException;", "Lru/yandex/video/m3/player/PlaybackException;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ErrorTypeKt {
    public static final String toErrorType(PlaybackException playbackException) {
        if (playbackException instanceof PlaybackException.ErrorSeekPosition) {
            return "SeekPosition";
        }
        if (playbackException instanceof PlaybackException.ErrorPlaylistStuck) {
            return "PlaylistStuck";
        }
        if (playbackException instanceof PlaybackException.ErrorPlaylistReset) {
            return "PlaylistReset";
        }
        if (playbackException instanceof PlaybackException.ErrorBehindLiveWindow) {
            return "BehindLiveWindow";
        }
        if (playbackException instanceof PlaybackException.ErrorQueryingDecoders) {
            return "QueryingDecoders";
        }
        if (playbackException instanceof PlaybackException.ErrorNoSecureDecoder) {
            return "NoSecureDecoder";
        }
        if (playbackException instanceof PlaybackException.ErrorNoDecoder) {
            return "NoDecoder";
        }
        if (playbackException instanceof PlaybackException.ErrorInstantiatingDecoder.ErrorRecoveringDecoder) {
            return "RecoveringDecoder";
        }
        if (playbackException instanceof PlaybackException.ErrorInstantiatingDecoder) {
            return "InstantiatingDecoder";
        }
        if (playbackException instanceof PlaybackException.ErrorSubtitleNoDecoder) {
            return "SubtitleNoDecoder";
        }
        if (playbackException instanceof PlaybackException.ErrorCache) {
            return "Cache";
        }
        if (playbackException instanceof PlaybackException.ErrorConnection.Unknown) {
            return "InternetConnection";
        }
        if (playbackException instanceof PlaybackException.ErrorConnection.Unauthorized) {
            return "InternetConnectionUnauthorized";
        }
        if (playbackException instanceof PlaybackException.ErrorConnection.Forbidden) {
            return "InternetConnectionForbidden";
        }
        if (playbackException instanceof PlaybackException.ErrorConnection.UnavailableForLegalReasons) {
            return "InternetConnectionRegional";
        }
        if (playbackException instanceof PlaybackException.ErrorConnectionSSLHandshake) {
            return "SSLHandshake";
        }
        if (playbackException instanceof PlaybackException.ErrorNoInternetConnection) {
            return "NoInternetConnection";
        }
        if (playbackException instanceof PlaybackException.ErrorGeneric.ErrorBehindLiveWindowFromPreloadedLiveDashManifest) {
            return "ErrorBehindLiveWindowFromPreloadedLiveDashManifest";
        }
        if (playbackException instanceof PlaybackException.ErrorGeneric.PreloadedLiveDashManifestInCacheExpired) {
            return "PreloadedLiveDashManifestInCacheExpired";
        }
        if (playbackException instanceof PlaybackException.ErrorGeneric) {
            return "Unknown";
        }
        if (playbackException instanceof PlaybackException.ErrorLicenseViolation) {
            return "LicenseViolation";
        }
        if (playbackException instanceof PlaybackException.ErrorNoPrepare) {
            return "NoPrepare";
        }
        if (playbackException instanceof PlaybackException.ErrorPlayerReleased) {
            return "PlayerReleased";
        }
        if (playbackException instanceof PlaybackException.ErrorPlayerStopped) {
            return "PlayerStopped";
        }
        if (playbackException instanceof PlaybackException.ErrorPlayerRePrepared) {
            return "PlayerRePrepared";
        }
        if (playbackException instanceof PlaybackException.ErrorNegativeStartPosition) {
            return "NegativeStartPosition";
        }
        if (playbackException instanceof PlaybackException.DrmThrowable.ErrorDrmProxyConnection) {
            return "DrmProxyConnection";
        }
        if (playbackException instanceof PlaybackException.DrmThrowable.ErrorDrmUnknown) {
            return ((PlaybackException.DrmThrowable.ErrorDrmUnknown) playbackException).getCryptoErrorCode() == null ? "DrmUnknown" : "DrmCrypto";
        }
        if (playbackException instanceof PlaybackException.DrmThrowable.ErrorDrmNotSupported) {
            return "DrmNotSupported";
        }
        if (playbackException instanceof PlaybackException.DrmThrowable.ErrorDrmUnsupportedScheme) {
            return "DrmUnsupportedScheme";
        }
        if (playbackException instanceof PlaybackException.DrmThrowable.ErrorSession) {
            return "DrmSession";
        }
        if (playbackException instanceof PlaybackException.DrmThrowable.ErrorKeysExpired) {
            return "DrmKeysExpired";
        }
        if (playbackException instanceof PlaybackException.DrmThrowable.ErrorProvisionRequest) {
            return "DrmProvisionRequest";
        }
        if (playbackException instanceof PlaybackException.DrmThrowable.ErrorAuthentication) {
            return "DrmProxyAuthentication";
        }
        if (playbackException instanceof PlaybackException.DrmThrowable.ErrorDiagnosticFatal) {
            return "DrmDiagnosticFatal";
        }
        if (playbackException instanceof PlaybackException.DrmThrowable.ErrorDiagnosticNotFatal) {
            return "DrmDiagnosticNotFatal";
        }
        if (playbackException instanceof PlaybackException.DrmThrowable.MediaResourceBusy) {
            return "MediaResourceBusy";
        }
        if (playbackException instanceof PlaybackException.UnsupportedContentException.ErrorAudio) {
            return "UnsupportedAudio";
        }
        if (playbackException instanceof PlaybackException.UnsupportedContentException.ErrorVideo) {
            return "UnsupportedVideo";
        }
        if (playbackException instanceof PlaybackException.UnsupportedContentException.ErrorParser.InvalidStreamUrl) {
            return "InvalidStreamUrl";
        }
        if (playbackException instanceof PlaybackException.UnsupportedContentException.ErrorParser) {
            return "ManifestParser";
        }
        if (playbackException instanceof PlaybackException.ErrorInRenderer.FailedDequeueOutputBuffer) {
            return "RendererFailedDequeueOutputBuffer";
        }
        if (playbackException instanceof PlaybackException.ErrorInRenderer.FailedDequeueInputBuffer) {
            return "RendererFailedDequeueInputBuffer";
        }
        if (playbackException instanceof PlaybackException.ErrorInRenderer.FailedStop) {
            return "RendererFailedStop";
        }
        if (playbackException instanceof PlaybackException.ErrorInRenderer.FailedSetSurface) {
            return "RendererFailedSetSurface";
        }
        if (playbackException instanceof PlaybackException.ErrorInRenderer.FailedQueueSecureInputBuffer.FailedQueueInputBuffer) {
            return "RendererFailedQueueInputBuffer";
        }
        if (playbackException instanceof PlaybackException.ErrorInRenderer.FailedQueueSecureInputBuffer) {
            return "RendererFailedQueueSecureInputBuffer";
        }
        if (playbackException instanceof PlaybackException.ErrorInRenderer.FailedReleaseOutputBuffer) {
            return "RendererFailedReleaseOutputBuffer";
        }
        if (playbackException instanceof PlaybackException.ErrorInRenderer.UnknownErrorInMediaCodec.FailedFlush) {
            return "RendererFailedFlush";
        }
        if (playbackException instanceof PlaybackException.ErrorInRenderer.UnknownErrorInMediaCodec) {
            return "RendererUnknownErrorInMediaCodec";
        }
        if (playbackException instanceof PlaybackException.HLSLiveRequestsStartOutOfLiveWindow) {
            return "HLSLiveRequestsStartOutOfLiveWindow";
        }
        if (playbackException instanceof PlaybackException.AdaptationSetsCountChanged) {
            return "AdaptationSetsCountChanged";
        }
        if (playbackException instanceof PlaybackException.RepresentationCountChanged) {
            return "RepresentationCountChanged";
        }
        if (playbackException instanceof PlaybackException.TrackSelectionInitialization) {
            return "TrackSelectionInitialization";
        }
        if (playbackException instanceof PlaybackException.WrongCallbackThread) {
            return "WrongCallbackThread";
        }
        if (!(playbackException instanceof PlaybackException.ErrorPreparing)) {
            if (playbackException instanceof PlaybackException.ErrorTimeout.ErrorDetachSurface) {
                return "DetachingSurfaceTimedOut";
            }
            if (playbackException instanceof PlaybackException.ErrorTimeout.ErrorForegroundMode) {
                return "SettingForegroundModeTimedOut";
            }
            if (playbackException instanceof PlaybackException.ErrorTimeout.ErrorPlayerRelease) {
                return "PlayerReleaseTimedOut";
            }
            if (playbackException instanceof PlaybackException.ErrorTimeout.ErrorUndefined) {
                return "UndefinedTimeout";
            }
            if (playbackException instanceof PlaybackException.PlaybackForbidden) {
                return "PlaybackForbidden";
            }
            if (playbackException instanceof PlaybackException.FrameDropDetected) {
                return "FrameDropDetected";
            }
            if (playbackException instanceof PlaybackException.Cancellation) {
                return "Cancellation";
            }
            if (playbackException instanceof PlaybackException.ErrorDataSourceReadPositionOutOfRange) {
                return "ErrorDataSourceReadPositionOutOfRange";
            }
            if (playbackException instanceof PlaybackException.ErrorDataSource) {
                return "ErrorDataSource";
            }
            if (playbackException instanceof PlaybackException.ErrorStalledStuck) {
                return "ErrorStalledStuck";
            }
            if (playbackException instanceof PlaybackException.Stub) {
                return "Stub";
            }
            w511.b();
            return null;
        }
        if (!(playbackException.getCause() instanceof ManifestLoadingException)) {
            return playbackException instanceof PlaybackException.ErrorPreparing.InvalidStreamUrl ? "InvalidStreamUrl" : "Preparing";
        }
        ManifestLoadingException manifestLoadingException = (ManifestLoadingException) playbackException.getCause();
        if (manifestLoadingException instanceof ManifestLoadingException.Forbidden) {
            return "Forbidden";
        }
        if (manifestLoadingException instanceof ManifestLoadingException.PaymentRequired) {
            return "PaymentRequired";
        }
        if (manifestLoadingException instanceof ManifestLoadingException.NotFound) {
            return "ManifestNotFound";
        }
        if (manifestLoadingException instanceof ManifestLoadingException.ForbiddenByLicense) {
            return "ForbiddenByLicense";
        }
        if (manifestLoadingException instanceof ManifestLoadingException.ForbiddenByModeration) {
            return "ForbiddenByModeration";
        }
        if (manifestLoadingException instanceof ManifestLoadingException.UserProfileNotCreated) {
            return "UserProfileNotCreated";
        }
        if (manifestLoadingException instanceof ManifestLoadingException.UnsupportedByApplication) {
            return "DrmNotSupported";
        }
        if (manifestLoadingException instanceof ManifestLoadingException.ConnectionError) {
            Throwable cause = playbackException.getCause();
            return (cause != null ? cause.getCause() : null) instanceof SSLHandshakeException ? "SSLHandshake" : "InternetConnection";
        }
        if (manifestLoadingException instanceof ManifestLoadingException.CommunicationError) {
            return "InternetConnection";
        }
        if (manifestLoadingException instanceof ManifestLoadingException.PurchaseNotFoundError) {
            return "PurchaseNotFound";
        }
        if (manifestLoadingException instanceof ManifestLoadingException.PurchaseExpiredError) {
            return "PurchaseExpired";
        }
        if (manifestLoadingException instanceof ManifestLoadingException.SubscriptionNotFoundError) {
            return "SubscriptionNotFound";
        }
        if (manifestLoadingException instanceof ManifestLoadingException.GeoConstraintViolationError) {
            return "GeoConstraintViolation";
        }
        if (manifestLoadingException instanceof ManifestLoadingException.LicensesNotFoundError) {
            return "LicensesNotFound";
        }
        if (manifestLoadingException instanceof ManifestLoadingException.LicenseTypesNotAvailable) {
            return "LicenseTypesNotAvailable";
        }
        if (manifestLoadingException instanceof ManifestLoadingException.ServiceConstraintViolationError) {
            return "ServiceConstraintViolation";
        }
        if (manifestLoadingException instanceof ManifestLoadingException.ProductConstraintViolationError) {
            return "ProductConstraintViolation";
        }
        if (manifestLoadingException instanceof ManifestLoadingException.MonetizationModelConstraintViolationError) {
            return "MonetizationModelConstraintViolation";
        }
        if (manifestLoadingException instanceof ManifestLoadingException.WrongSubscription) {
            return "WrongSubscription";
        }
        if (manifestLoadingException instanceof ManifestLoadingException.SupportedStreamsNotFoundError) {
            return "SupportedStreamsNotFound";
        }
        if (manifestLoadingException instanceof ManifestLoadingException.InvalidRegion) {
            return "InvalidRegion";
        }
        if (manifestLoadingException instanceof ManifestLoadingException.UnknownError) {
            return "ManifestLoadingUnknown";
        }
        if (manifestLoadingException instanceof ManifestLoadingException.WatchableConstraintViolation) {
            return "WatchableConstraintViolationError";
        }
        w511.b();
        return null;
    }

    public static final String toErrorType(AdException adException) {
        if (adException instanceof AdException.NoAd) {
            return "NoAd";
        }
        if (adException instanceof AdException.PlaybackEngineError) {
            return "PlaybackEngineError";
        }
        if (adException instanceof AdException.NoAdViewAttached) {
            return "NoAdViewAttached";
        }
        if (adException instanceof AdException.AdUnknown) {
            return "AdUnknown";
        }
        if (adException instanceof AdException.Stub) {
            return "Stub";
        }
        w511.b();
        return null;
    }

    public static final String toErrorType(NetworkRequestException networkRequestException) {
        if (networkRequestException instanceof NetworkRequestException.ExpiredSignature) {
            return "EXPIRED_SIGNATURE";
        }
        if (networkRequestException instanceof NetworkRequestException.InvalidSignature) {
            return "INVALID_SIGNATURE";
        }
        if (networkRequestException instanceof NetworkRequestException.ResourceNotFound) {
            return "RESOURCE_NOT_FOUND";
        }
        if (networkRequestException instanceof NetworkRequestException.InvalidRange) {
            return "INVALID_RANGE";
        }
        if (networkRequestException instanceof NetworkRequestException.TooManyRequests) {
            return "TOO_MANY_REQUESTS";
        }
        if (networkRequestException instanceof NetworkRequestException.RegionalRestriction) {
            return "REGIONAL_RESTRICTION";
        }
        if (networkRequestException instanceof NetworkRequestException.Banned) {
            return "BANNED";
        }
        if (networkRequestException instanceof NetworkRequestException.BadHttpStatus) {
            return "BAD_HTTP_STATUS";
        }
        if (networkRequestException instanceof NetworkRequestException.HostNameNotResolved) {
            return "HOSTNAME_NOT_RESOLVED";
        }
        if (networkRequestException instanceof NetworkRequestException.ConnectionFailed) {
            return "CONNECTION_FAILED";
        }
        if (networkRequestException instanceof NetworkRequestException.ConnectionTimeout) {
            return "CONNECTION_TIMEOUT";
        }
        if (networkRequestException instanceof NetworkRequestException.SslError) {
            return "SSL_ERROR";
        }
        if (networkRequestException instanceof NetworkRequestException.FetchTimeout) {
            return "FETCH_TIMEOUT";
        }
        if (networkRequestException instanceof NetworkRequestException.ConnectionClosed) {
            return "CONNECTION_CLOSED";
        }
        if (networkRequestException instanceof NetworkRequestException.UnkwnownHttpError) {
            return "UNKNOWN_HTTP_ERROR";
        }
        w511.b();
        return null;
    }
}
