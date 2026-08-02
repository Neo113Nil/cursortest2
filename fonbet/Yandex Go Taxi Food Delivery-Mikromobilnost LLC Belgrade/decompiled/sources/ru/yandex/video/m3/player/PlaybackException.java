package ru.yandex.video.m3.player;

import android.net.Uri;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.g8e;
import defpackage.gw00;
import defpackage.j73;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.ra7;
import defpackage.unr0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.data.loadcontrol.LoadControlState;
import ru.yandex.video.m3.player.tracks.TrackType;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:%\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./01B3\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0001)23456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ¨\u0006["}, d2 = {"Lru/yandex/video/m3/player/PlaybackException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "", Constants.KEY_MESSAGE, "", "details", "", "", "(Ljava/lang/Throwable;Ljava/lang/String;Ljava/util/Map;)V", "getDetails", "()Ljava/util/Map;", "AdaptationSetsCountChanged", "Cancellation", "DrmThrowable", "ErrorBehindLiveWindow", "ErrorCache", "ErrorConnection", "ErrorConnectionSSLHandshake", "ErrorDataSource", "ErrorDataSourceReadPositionOutOfRange", "ErrorGeneric", "ErrorInRenderer", "ErrorInstantiatingDecoder", "ErrorLicenseViolation", "ErrorNegativeStartPosition", "ErrorNoDecoder", "ErrorNoInternetConnection", "ErrorNoPrepare", "ErrorNoSecureDecoder", "ErrorPlayerRePrepared", "ErrorPlayerReleased", "ErrorPlayerStopped", "ErrorPlaylistReset", "ErrorPlaylistStuck", "ErrorPreparing", "ErrorQueryingDecoders", "ErrorSeekPosition", "ErrorStalledStuck", "ErrorSubtitleNoDecoder", "ErrorTimeout", "FrameDropDetected", "HLSLiveRequestsStartOutOfLiveWindow", "PlaybackForbidden", "RepresentationCountChanged", "Stub", "TrackSelectionInitialization", "UnsupportedContentException", "WrongCallbackThread", "Lru/yandex/video/m3/player/PlaybackException$AdaptationSetsCountChanged;", "Lru/yandex/video/m3/player/PlaybackException$Cancellation;", "Lru/yandex/video/m3/player/PlaybackException$DrmThrowable;", "Lru/yandex/video/m3/player/PlaybackException$ErrorBehindLiveWindow;", "Lru/yandex/video/m3/player/PlaybackException$ErrorCache;", "Lru/yandex/video/m3/player/PlaybackException$ErrorConnection;", "Lru/yandex/video/m3/player/PlaybackException$ErrorConnectionSSLHandshake;", "Lru/yandex/video/m3/player/PlaybackException$ErrorDataSource;", "Lru/yandex/video/m3/player/PlaybackException$ErrorDataSourceReadPositionOutOfRange;", "Lru/yandex/video/m3/player/PlaybackException$ErrorGeneric;", "Lru/yandex/video/m3/player/PlaybackException$ErrorInRenderer;", "Lru/yandex/video/m3/player/PlaybackException$ErrorInstantiatingDecoder;", "Lru/yandex/video/m3/player/PlaybackException$ErrorLicenseViolation;", "Lru/yandex/video/m3/player/PlaybackException$ErrorNegativeStartPosition;", "Lru/yandex/video/m3/player/PlaybackException$ErrorNoDecoder;", "Lru/yandex/video/m3/player/PlaybackException$ErrorNoInternetConnection;", "Lru/yandex/video/m3/player/PlaybackException$ErrorNoPrepare;", "Lru/yandex/video/m3/player/PlaybackException$ErrorNoSecureDecoder;", "Lru/yandex/video/m3/player/PlaybackException$ErrorPlayerRePrepared;", "Lru/yandex/video/m3/player/PlaybackException$ErrorPlayerReleased;", "Lru/yandex/video/m3/player/PlaybackException$ErrorPlayerStopped;", "Lru/yandex/video/m3/player/PlaybackException$ErrorPlaylistReset;", "Lru/yandex/video/m3/player/PlaybackException$ErrorPlaylistStuck;", "Lru/yandex/video/m3/player/PlaybackException$ErrorPreparing;", "Lru/yandex/video/m3/player/PlaybackException$ErrorQueryingDecoders;", "Lru/yandex/video/m3/player/PlaybackException$ErrorSeekPosition;", "Lru/yandex/video/m3/player/PlaybackException$ErrorStalledStuck;", "Lru/yandex/video/m3/player/PlaybackException$ErrorSubtitleNoDecoder;", "Lru/yandex/video/m3/player/PlaybackException$ErrorTimeout;", "Lru/yandex/video/m3/player/PlaybackException$ErrorTimeout$ErrorDetachSurface;", "Lru/yandex/video/m3/player/PlaybackException$ErrorTimeout$ErrorForegroundMode;", "Lru/yandex/video/m3/player/PlaybackException$ErrorTimeout$ErrorPlayerRelease;", "Lru/yandex/video/m3/player/PlaybackException$ErrorTimeout$ErrorUndefined;", "Lru/yandex/video/m3/player/PlaybackException$FrameDropDetected;", "Lru/yandex/video/m3/player/PlaybackException$HLSLiveRequestsStartOutOfLiveWindow;", "Lru/yandex/video/m3/player/PlaybackException$PlaybackForbidden;", "Lru/yandex/video/m3/player/PlaybackException$RepresentationCountChanged;", "Lru/yandex/video/m3/player/PlaybackException$Stub;", "Lru/yandex/video/m3/player/PlaybackException$TrackSelectionInitialization;", "Lru/yandex/video/m3/player/PlaybackException$UnsupportedContentException;", "Lru/yandex/video/m3/player/PlaybackException$WrongCallbackThread;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class PlaybackException extends Exception {
    public static final int $stable = 8;
    private final Map<String, Object> details;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$AdaptationSetsCountChanged;", "Lru/yandex/video/m3/player/PlaybackException;", Constants.KEY_MESSAGE, "", "(Ljava/lang/String;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AdaptationSetsCountChanged extends PlaybackException {
        public static final int $stable = 0;

        public AdaptationSetsCountChanged(String str) {
            super(new Throwable(), str, null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$Cancellation;", "Lru/yandex/video/m3/player/PlaybackException;", "cause", "", "(Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Cancellation extends PlaybackException {
        public static final int $stable = 0;

        public Cancellation(Throwable th) {
            super(th, null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorBehindLiveWindow;", "Lru/yandex/video/m3/player/PlaybackException;", "cause", "", "(Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ErrorBehindLiveWindow extends PlaybackException {
        public static final int $stable = 0;

        public ErrorBehindLiveWindow(Throwable th) {
            super(th, null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorCache;", "Lru/yandex/video/m3/player/PlaybackException;", "cause", "", "(Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ErrorCache extends PlaybackException {
        public static final int $stable = 0;

        public ErrorCache(Throwable th) {
            super(th, null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorConnectionSSLHandshake;", "Lru/yandex/video/m3/player/PlaybackException;", "cause", "", "(Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ErrorConnectionSSLHandshake extends PlaybackException {
        public static final int $stable = 0;

        public ErrorConnectionSSLHandshake(Throwable th) {
            super(th, null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorDataSource;", "Lru/yandex/video/m3/player/PlaybackException;", "cause", "", "(Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ErrorDataSource extends PlaybackException {
        public static final int $stable = 0;

        public ErrorDataSource(Throwable th) {
            super(th, null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorDataSourceReadPositionOutOfRange;", "Lru/yandex/video/m3/player/PlaybackException;", "cause", "", "(Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ErrorDataSourceReadPositionOutOfRange extends PlaybackException {
        public static final int $stable = 0;

        public ErrorDataSourceReadPositionOutOfRange(Throwable th) {
            super(th, null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0002\u0005\u0006B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorGeneric;", "Lru/yandex/video/m3/player/PlaybackException;", "cause", "", "(Ljava/lang/Throwable;)V", "ErrorBehindLiveWindowFromPreloadedLiveDashManifest", "PreloadedLiveDashManifestInCacheExpired", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class ErrorGeneric extends PlaybackException {
        public static final int $stable = 0;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorGeneric$ErrorBehindLiveWindowFromPreloadedLiveDashManifest;", "Lru/yandex/video/m3/player/PlaybackException$ErrorGeneric;", "Lra7;", "cache", "", "manifestCacheKey", "", "cause", "<init>", "(Lra7;Ljava/lang/String;Ljava/lang/Throwable;)V", "Lra7;", "getCache", "()Lra7;", "Ljava/lang/String;", "getManifestCacheKey", "()Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ErrorBehindLiveWindowFromPreloadedLiveDashManifest extends ErrorGeneric {
            public static final int $stable = 8;
            private final ra7 cache;
            private final String manifestCacheKey;

            public ErrorBehindLiveWindowFromPreloadedLiveDashManifest(ra7 ra7Var, String str, Throwable th) {
                super(th);
                this.cache = ra7Var;
                this.manifestCacheKey = str;
            }

            public final ra7 getCache() {
                return this.cache;
            }

            public final String getManifestCacheKey() {
                return this.manifestCacheKey;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorGeneric$PreloadedLiveDashManifestInCacheExpired;", "Lru/yandex/video/m3/player/PlaybackException$ErrorGeneric;", "Lra7;", "cache", "", "manifestUri", "", "cause", "<init>", "(Lra7;Ljava/lang/String;Ljava/lang/Throwable;)V", "Lra7;", "getCache", "()Lra7;", "Ljava/lang/String;", "getManifestUri", "()Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class PreloadedLiveDashManifestInCacheExpired extends ErrorGeneric {
            public static final int $stable = 8;
            private final ra7 cache;
            private final String manifestUri;

            public PreloadedLiveDashManifestInCacheExpired(ra7 ra7Var, String str, Throwable th) {
                super(th);
                this.cache = ra7Var;
                this.manifestUri = str;
            }

            public final ra7 getCache() {
                return this.cache;
            }

            public final String getManifestUri() {
                return this.manifestUri;
            }
        }

        public ErrorGeneric(Throwable th) {
            super(th, null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0001\fB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorInstantiatingDecoder;", "Lru/yandex/video/m3/player/PlaybackException;", "decoderName", "", "cause", "", "details", "", "", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V", "getDecoderName", "()Ljava/lang/String;", "ErrorRecoveringDecoder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class ErrorInstantiatingDecoder extends PlaybackException {
        public static final int $stable = 0;
        private final String decoderName;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorInstantiatingDecoder$ErrorRecoveringDecoder;", "Lru/yandex/video/m3/player/PlaybackException$ErrorInstantiatingDecoder;", "decoderName", "", "cause", "", "details", "", "", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ErrorRecoveringDecoder extends ErrorInstantiatingDecoder {
            public static final int $stable = 0;

            public ErrorRecoveringDecoder(String str, Throwable th, Map<String, ? extends Object> map) {
                super(str, th, map);
            }
        }

        public ErrorInstantiatingDecoder(String str, Throwable th, Map<String, ? extends Object> map) {
            super(th, th.getMessage(), map, null);
            this.decoderName = str;
        }

        public final String getDecoderName() {
            return this.decoderName;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorLicenseViolation;", "Lru/yandex/video/m3/player/PlaybackException;", "cause", "", "(Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ErrorLicenseViolation extends PlaybackException {
        public static final int $stable = 0;

        public ErrorLicenseViolation(Throwable th) {
            super(th, null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorNegativeStartPosition;", "Lru/yandex/video/m3/player/PlaybackException;", "startPosition", "", "(J)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ErrorNegativeStartPosition extends PlaybackException {
        public static final int $stable = 0;

        public ErrorNegativeStartPosition(long j) {
            super(new Throwable(), qv10.j(j, "Negative start position "), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorNoDecoder;", "Lru/yandex/video/m3/player/PlaybackException;", "mimeType", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getMimeType", "()Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ErrorNoDecoder extends PlaybackException {
        public static final int $stable = 0;
        private final String mimeType;

        public ErrorNoDecoder(String str, Throwable th) {
            super(th, "mimeType: ".concat(str), null, 4, null);
            this.mimeType = str;
        }

        public final String getMimeType() {
            return this.mimeType;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0002\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorNoInternetConnection;", "Lru/yandex/video/m3/player/PlaybackException;", LaunchBrowserActivity.KEY_URI, "Landroid/net/Uri;", "cause", "", "details", "", "", "", "(Landroid/net/Uri;Ljava/lang/Throwable;Ljava/util/Map;)V", "getUri", "()Landroid/net/Uri;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ErrorNoInternetConnection extends PlaybackException {
        public static final int $stable = 8;
        private final Uri uri;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ErrorNoInternetConnection(Uri uri, Throwable th, Map<String, ? extends Object> map) {
            super(th, r0.toString(), map, null);
            String host;
            StringBuilder sb = new StringBuilder("Failed to connect to ");
            sb.append((Object) ((uri == null || (host = uri.getHost()) == null) ? uri : host));
            sb.append(Extension.COLON_SPACE);
            sb.append(th);
            this.uri = uri;
        }

        public final Uri getUri() {
            return this.uri;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorNoPrepare;", "Lru/yandex/video/m3/player/PlaybackException;", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ErrorNoPrepare extends PlaybackException {
        public static final int $stable = 0;

        public ErrorNoPrepare() {
            super(new Throwable(), null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorNoSecureDecoder;", "Lru/yandex/video/m3/player/PlaybackException;", "mimeType", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getMimeType", "()Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ErrorNoSecureDecoder extends PlaybackException {
        public static final int $stable = 0;
        private final String mimeType;

        public ErrorNoSecureDecoder(String str, Throwable th) {
            super(th, "mimeType: ".concat(str), null, 4, null);
            this.mimeType = str;
        }

        public final String getMimeType() {
            return this.mimeType;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorPlayerRePrepared;", "Lru/yandex/video/m3/player/PlaybackException;", "prepareIndex", "", "(I)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ErrorPlayerRePrepared extends PlaybackException {
        public static final int $stable = 0;

        public ErrorPlayerRePrepared(int i) {
            super(new Throwable(), "Player has been re prepared", gw00.e(new Pair("prepareIndex", Integer.valueOf(i))), null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorPlayerReleased;", "Lru/yandex/video/m3/player/PlaybackException;", "timeSinceReleased", "", "(J)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ErrorPlayerReleased extends PlaybackException {
        public static final int $stable = 0;

        public ErrorPlayerReleased(long j) {
            super(new Throwable(), "Player has been released", gw00.e(new Pair("timeSinceReleased", Long.valueOf(j))), null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorPlayerStopped;", "Lru/yandex/video/m3/player/PlaybackException;", "prepareIndex", "", "(I)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ErrorPlayerStopped extends PlaybackException {
        public static final int $stable = 0;

        public ErrorPlayerStopped(int i) {
            super(new Throwable(), "Player has been stopped", gw00.e(new Pair("prepareIndex", Integer.valueOf(i))), null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorPlaylistReset;", "Lru/yandex/video/m3/player/PlaybackException;", "cause", "", "(Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ErrorPlaylistReset extends PlaybackException {
        public static final int $stable = 0;

        public ErrorPlaylistReset(Throwable th) {
            super(th, null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorPlaylistStuck;", "Lru/yandex/video/m3/player/PlaybackException;", "cause", "", "(Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ErrorPlaylistStuck extends PlaybackException {
        public static final int $stable = 0;

        public ErrorPlaylistStuck(Throwable th) {
            super(th, null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0005B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorPreparing;", "Lru/yandex/video/m3/player/PlaybackException;", "cause", "", "(Ljava/lang/Throwable;)V", "InvalidStreamUrl", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class ErrorPreparing extends PlaybackException {
        public static final int $stable = 0;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorPreparing$InvalidStreamUrl;", "Lru/yandex/video/m3/player/PlaybackException$ErrorPreparing;", "cause", "", "(Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class InvalidStreamUrl extends ErrorPreparing {
            public static final int $stable = 0;

            public InvalidStreamUrl(Throwable th) {
                super(th);
            }
        }

        public ErrorPreparing(Throwable th) {
            super(th, null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorQueryingDecoders;", "Lru/yandex/video/m3/player/PlaybackException;", "cause", "", "(Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ErrorQueryingDecoders extends PlaybackException {
        public static final int $stable = 0;

        public ErrorQueryingDecoders(Throwable th) {
            super(th, null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorSeekPosition;", "Lru/yandex/video/m3/player/PlaybackException;", "cause", "", "(Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ErrorSeekPosition extends PlaybackException {
        public static final int $stable = 0;

        public ErrorSeekPosition(Throwable th) {
            super(th, null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorStalledStuck;", "Lru/yandex/video/m3/player/PlaybackException;", "cause", "", "loadControlState", "Lru/yandex/video/m3/data/loadcontrol/LoadControlState;", "(Ljava/lang/Throwable;Lru/yandex/video/m3/data/loadcontrol/LoadControlState;)V", "getLoadControlState", "()Lru/yandex/video/m3/data/loadcontrol/LoadControlState;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ErrorStalledStuck extends PlaybackException {
        public static final int $stable = 0;
        private final LoadControlState loadControlState;

        public ErrorStalledStuck(Throwable th, LoadControlState loadControlState) {
            super(th, null, null, 6, null);
            this.loadControlState = loadControlState;
        }

        public final LoadControlState getLoadControlState() {
            return this.loadControlState;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorSubtitleNoDecoder;", "Lru/yandex/video/m3/player/PlaybackException;", "cause", "", "(Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ErrorSubtitleNoDecoder extends PlaybackException {
        public static final int $stable = 0;

        public ErrorSubtitleNoDecoder(Throwable th) {
            super(th, null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$FrameDropDetected;", "Lru/yandex/video/m3/player/PlaybackException;", "type", "", "droppedFrames", "", "durationMs", "", "(Ljava/lang/String;IJ)V", "resumePlaybackTimestamp", "getResumePlaybackTimestamp", "()J", "setResumePlaybackTimestamp", "(J)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FrameDropDetected extends PlaybackException {
        public static final int $stable = 8;
        private long resumePlaybackTimestamp;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public FrameDropDetected(String str, int i, long j) {
            super(r0, oyr.n(j, " ms", r1), b.i(new Pair("type", str), new Pair("droppedFrames", Integer.valueOf(i)), new Pair("durationMs", Long.valueOf(j))), null);
            Throwable th = new Throwable();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" frame drop detected: ");
            sb.append(i);
            sb.append(" im ");
        }

        public final long getResumePlaybackTimestamp() {
            return this.resumePlaybackTimestamp;
        }

        public final void setResumePlaybackTimestamp(long j) {
            this.resumePlaybackTimestamp = j;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$HLSLiveRequestsStartOutOfLiveWindow;", "Lru/yandex/video/m3/player/PlaybackException;", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class HLSLiveRequestsStartOutOfLiveWindow extends PlaybackException {
        public static final int $stable = 0;

        public HLSLiveRequestsStartOutOfLiveWindow() {
            super(new Throwable(), null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$PlaybackForbidden;", "Lru/yandex/video/m3/player/PlaybackException;", "cause", "", "(Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PlaybackForbidden extends PlaybackException {
        public static final int $stable = 0;

        public PlaybackForbidden(Throwable th) {
            super(th, null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$RepresentationCountChanged;", "Lru/yandex/video/m3/player/PlaybackException;", Constants.KEY_MESSAGE, "", "(Ljava/lang/String;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RepresentationCountChanged extends PlaybackException {
        public static final int $stable = 0;

        public RepresentationCountChanged(String str) {
            super(new Throwable(), str, null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$Stub;", "Lru/yandex/video/m3/player/PlaybackException;", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Stub extends PlaybackException {
        public static final int $stable = 0;

        private Stub() {
            super(new Throwable(), null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$TrackSelectionInitialization;", "Lru/yandex/video/m3/player/PlaybackException;", Constants.KEY_MESSAGE, "", "details", "", "", "(Ljava/lang/String;Ljava/util/Map;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TrackSelectionInitialization extends PlaybackException {
        public static final int $stable = 0;

        public TrackSelectionInitialization(String str, Map<String, ? extends Object> map) {
            super(new Throwable(), str, map, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$WrongCallbackThread;", "Lru/yandex/video/m3/player/PlaybackException;", "callbackName", "", "callbackThread", "Ljava/lang/Thread;", "correctThread", "(Ljava/lang/String;Ljava/lang/Thread;Ljava/lang/Thread;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class WrongCallbackThread extends PlaybackException {
        public static final int $stable = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public WrongCallbackThread(String str, Thread thread, Thread thread2) {
            super(new RuntimeException(), r7.toString(), null, 4, null);
            StringBuilder x = unr0.x("Player listener callback ", str, " accessed from ");
            x.append(thread.getName());
            x.append(" while correct thread is ");
            x.append(thread2.getName());
        }
    }

    public /* synthetic */ PlaybackException(Throwable th, String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : map, null);
    }

    public final Map<String, Object> getDetails() {
        return this.details;
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\r\u000e\u000f\u0010B#\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0004\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorConnection;", "Lru/yandex/video/m3/player/PlaybackException;", ru.cprocsp.NGate.tools.Constants.INTENT_PARAM_RESPONSE_CODE, "", "dataSpec", "", "cause", "", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "getDataSpec", "()Ljava/lang/String;", "getResponseCode", "()I", "Forbidden", "Unauthorized", "UnavailableForLegalReasons", "Unknown", "Lru/yandex/video/m3/player/PlaybackException$ErrorConnection$Forbidden;", "Lru/yandex/video/m3/player/PlaybackException$ErrorConnection$Unauthorized;", "Lru/yandex/video/m3/player/PlaybackException$ErrorConnection$UnavailableForLegalReasons;", "Lru/yandex/video/m3/player/PlaybackException$ErrorConnection$Unknown;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class ErrorConnection extends PlaybackException {
        public static final int $stable = 0;
        private final String dataSpec;
        private final int responseCode;

        private ErrorConnection(int i, String str, Throwable th) {
            super(th, oyr.k(i, "responseCode: ", ", dataSpec: ", str), null, 4, null);
            this.responseCode = i;
            this.dataSpec = str;
        }

        public final String getDataSpec() {
            return this.dataSpec;
        }

        public final int getResponseCode() {
            return this.responseCode;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorConnection$Forbidden;", "Lru/yandex/video/m3/player/PlaybackException$ErrorConnection;", ru.cprocsp.NGate.tools.Constants.INTENT_PARAM_RESPONSE_CODE, "", "dataSpec", "", "cause", "", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Forbidden extends ErrorConnection {
            public static final int $stable = 0;

            public /* synthetic */ Forbidden(int i, String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(i, (i2 & 2) != 0 ? null : str, th);
            }

            public Forbidden(int i, String str, Throwable th) {
                super(i, str, th, null);
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorConnection$Unauthorized;", "Lru/yandex/video/m3/player/PlaybackException$ErrorConnection;", ru.cprocsp.NGate.tools.Constants.INTENT_PARAM_RESPONSE_CODE, "", "dataSpec", "", "cause", "", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Unauthorized extends ErrorConnection {
            public static final int $stable = 0;

            public /* synthetic */ Unauthorized(int i, String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(i, (i2 & 2) != 0 ? null : str, th);
            }

            public Unauthorized(int i, String str, Throwable th) {
                super(i, str, th, null);
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorConnection$UnavailableForLegalReasons;", "Lru/yandex/video/m3/player/PlaybackException$ErrorConnection;", ru.cprocsp.NGate.tools.Constants.INTENT_PARAM_RESPONSE_CODE, "", "dataSpec", "", "cause", "", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class UnavailableForLegalReasons extends ErrorConnection {
            public static final int $stable = 0;

            public /* synthetic */ UnavailableForLegalReasons(int i, String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(i, (i2 & 2) != 0 ? null : str, th);
            }

            public UnavailableForLegalReasons(int i, String str, Throwable th) {
                super(i, str, th, null);
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorConnection$Unknown;", "Lru/yandex/video/m3/player/PlaybackException$ErrorConnection;", ru.cprocsp.NGate.tools.Constants.INTENT_PARAM_RESPONSE_CODE, "", "dataSpec", "", "cause", "", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Unknown extends ErrorConnection {
            public static final int $stable = 0;

            public /* synthetic */ Unknown(int i, String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(i, (i2 & 2) != 0 ? null : str, th);
            }

            public Unknown(int i, String str, Throwable th) {
                super(i, str, th, null);
            }
        }

        public /* synthetic */ ErrorConnection(int i, String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : str, th, null);
        }

        public /* synthetic */ ErrorConnection(int i, String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, th);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b7\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorTimeout;", "Lru/yandex/video/m3/player/PlaybackException;", "cause", "", "(Ljava/lang/Throwable;)V", "ErrorDetachSurface", "ErrorForegroundMode", "ErrorPlayerRelease", "ErrorUndefined", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class ErrorTimeout extends PlaybackException {
        public static final int $stable = 0;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorTimeout$ErrorDetachSurface;", "Lru/yandex/video/m3/player/PlaybackException;", "cause", "", "(Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ErrorDetachSurface extends PlaybackException {
            public static final int $stable = 0;

            public ErrorDetachSurface(Throwable th) {
                super(th, null, null, 6, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorTimeout$ErrorForegroundMode;", "Lru/yandex/video/m3/player/PlaybackException;", "cause", "", "(Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ErrorForegroundMode extends PlaybackException {
            public static final int $stable = 0;

            public ErrorForegroundMode(Throwable th) {
                super(th, null, null, 6, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorTimeout$ErrorPlayerRelease;", "Lru/yandex/video/m3/player/PlaybackException;", "cause", "", "(Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ErrorPlayerRelease extends PlaybackException {
            public static final int $stable = 0;

            public ErrorPlayerRelease(Throwable th) {
                super(th, null, null, 6, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorTimeout$ErrorUndefined;", "Lru/yandex/video/m3/player/PlaybackException;", "cause", "", "(Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ErrorUndefined extends PlaybackException {
            public static final int $stable = 0;

            public ErrorUndefined(Throwable th) {
                super(th, null, null, 6, null);
            }
        }

        private ErrorTimeout(Throwable th) {
            super(th, null, null, 6, null);
        }

        public /* synthetic */ ErrorTimeout(Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
            this(th);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$UnsupportedContentException;", "Lru/yandex/video/m3/player/PlaybackException;", "cause", "", "(Ljava/lang/Throwable;)V", "ErrorAudio", "ErrorParser", "ErrorVideo", "Lru/yandex/video/m3/player/PlaybackException$UnsupportedContentException$ErrorAudio;", "Lru/yandex/video/m3/player/PlaybackException$UnsupportedContentException$ErrorParser;", "Lru/yandex/video/m3/player/PlaybackException$UnsupportedContentException$ErrorVideo;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class UnsupportedContentException extends PlaybackException {
        public static final int $stable = 0;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0005B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$UnsupportedContentException$ErrorParser;", "Lru/yandex/video/m3/player/PlaybackException$UnsupportedContentException;", "cause", "", "(Ljava/lang/Throwable;)V", "InvalidStreamUrl", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static class ErrorParser extends UnsupportedContentException {
            public static final int $stable = 0;

            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$UnsupportedContentException$ErrorParser$InvalidStreamUrl;", "Lru/yandex/video/m3/player/PlaybackException$UnsupportedContentException$ErrorParser;", "cause", "", "(Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class InvalidStreamUrl extends ErrorParser {
                public static final int $stable = 0;

                public InvalidStreamUrl(Throwable th) {
                    super(th);
                }
            }

            public ErrorParser(Throwable th) {
                super(th, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$UnsupportedContentException$ErrorVideo;", "Lru/yandex/video/m3/player/PlaybackException$UnsupportedContentException;", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ErrorVideo extends UnsupportedContentException {
            public static final int $stable = 0;

            public ErrorVideo() {
                super(new Throwable(), null);
            }
        }

        private UnsupportedContentException(Throwable th) {
            super(th, null, null, 6, null);
        }

        public /* synthetic */ UnsupportedContentException(Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
            this(th);
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$UnsupportedContentException$ErrorAudio;", "Lru/yandex/video/m3/player/PlaybackException$UnsupportedContentException;", "cause", "", "(Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ErrorAudio extends UnsupportedContentException {
            public static final int $stable = 0;

            public /* synthetic */ ErrorAudio(Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? new Throwable() : th);
            }

            public ErrorAudio(Throwable th) {
                super(th, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public ErrorAudio() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00102\u00020\u0001:\b\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017B/\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0007\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorInRenderer;", "Lru/yandex/video/m3/player/PlaybackException;", "diagnosticInfo", "", "cause", "", "details", "", "", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V", "getDiagnosticInfo", "()Ljava/lang/String;", ErrorInRenderer.TRACK_TYPE, "Lru/yandex/video/m3/player/tracks/TrackType;", "getTrackType", "()Lru/yandex/video/m3/player/tracks/TrackType;", "Companion", "FailedDequeueInputBuffer", "FailedDequeueOutputBuffer", "FailedQueueSecureInputBuffer", "FailedReleaseOutputBuffer", "FailedSetSurface", "FailedStop", "UnknownErrorInMediaCodec", "Lru/yandex/video/m3/player/PlaybackException$ErrorInRenderer$FailedDequeueInputBuffer;", "Lru/yandex/video/m3/player/PlaybackException$ErrorInRenderer$FailedDequeueOutputBuffer;", "Lru/yandex/video/m3/player/PlaybackException$ErrorInRenderer$FailedQueueSecureInputBuffer;", "Lru/yandex/video/m3/player/PlaybackException$ErrorInRenderer$FailedReleaseOutputBuffer;", "Lru/yandex/video/m3/player/PlaybackException$ErrorInRenderer$FailedSetSurface;", "Lru/yandex/video/m3/player/PlaybackException$ErrorInRenderer$FailedStop;", "Lru/yandex/video/m3/player/PlaybackException$ErrorInRenderer$UnknownErrorInMediaCodec;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class ErrorInRenderer extends PlaybackException {
        public static final int $stable = 0;
        public static final String TRACK_TYPE = "trackType";
        private final String diagnosticInfo;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorInRenderer$FailedDequeueInputBuffer;", "Lru/yandex/video/m3/player/PlaybackException$ErrorInRenderer;", "diagnosticInfo", "", "cause", "", "details", "", "", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class FailedDequeueInputBuffer extends ErrorInRenderer {
            public static final int $stable = 0;

            public FailedDequeueInputBuffer(String str, Throwable th, Map<String, ? extends Object> map) {
                super(str, th, map, null);
            }
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorInRenderer$FailedDequeueOutputBuffer;", "Lru/yandex/video/m3/player/PlaybackException$ErrorInRenderer;", "diagnosticInfo", "", "cause", "", "details", "", "", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class FailedDequeueOutputBuffer extends ErrorInRenderer {
            public static final int $stable = 0;

            public FailedDequeueOutputBuffer(String str, Throwable th, Map<String, ? extends Object> map) {
                super(str, th, map, null);
            }
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001:\u0001\nB-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\t¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorInRenderer$FailedQueueSecureInputBuffer;", "Lru/yandex/video/m3/player/PlaybackException$ErrorInRenderer;", "diagnosticInfo", "", "cause", "", "details", "", "", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V", "FailedQueueInputBuffer", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static class FailedQueueSecureInputBuffer extends ErrorInRenderer {
            public static final int $stable = 0;

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorInRenderer$FailedQueueSecureInputBuffer$FailedQueueInputBuffer;", "Lru/yandex/video/m3/player/PlaybackException$ErrorInRenderer$FailedQueueSecureInputBuffer;", "diagnosticInfo", "", "cause", "", "details", "", "", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class FailedQueueInputBuffer extends FailedQueueSecureInputBuffer {
                public static final int $stable = 0;

                public FailedQueueInputBuffer(String str, Throwable th, Map<String, ? extends Object> map) {
                    super(str, th, map);
                }
            }

            public FailedQueueSecureInputBuffer(String str, Throwable th, Map<String, ? extends Object> map) {
                super(str, th, map, null);
            }
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorInRenderer$FailedReleaseOutputBuffer;", "Lru/yandex/video/m3/player/PlaybackException$ErrorInRenderer;", "diagnosticInfo", "", "cause", "", "details", "", "", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class FailedReleaseOutputBuffer extends ErrorInRenderer {
            public static final int $stable = 0;

            public FailedReleaseOutputBuffer(String str, Throwable th, Map<String, ? extends Object> map) {
                super(str, th, map, null);
            }
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorInRenderer$FailedSetSurface;", "Lru/yandex/video/m3/player/PlaybackException$ErrorInRenderer;", "diagnosticInfo", "", "cause", "", "details", "", "", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class FailedSetSurface extends ErrorInRenderer {
            public static final int $stable = 0;

            public FailedSetSurface(String str, Throwable th, Map<String, ? extends Object> map) {
                super(str, th, map, null);
            }
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorInRenderer$FailedStop;", "Lru/yandex/video/m3/player/PlaybackException$ErrorInRenderer;", "diagnosticInfo", "", "cause", "", "details", "", "", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class FailedStop extends ErrorInRenderer {
            public static final int $stable = 0;

            public FailedStop(String str, Throwable th, Map<String, ? extends Object> map) {
                super(str, th, map, null);
            }
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001:\u0001\nB-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\t¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorInRenderer$UnknownErrorInMediaCodec;", "Lru/yandex/video/m3/player/PlaybackException$ErrorInRenderer;", "diagnosticInfo", "", "cause", "", "details", "", "", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V", "FailedFlush", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static class UnknownErrorInMediaCodec extends ErrorInRenderer {
            public static final int $stable = 0;

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$ErrorInRenderer$UnknownErrorInMediaCodec$FailedFlush;", "Lru/yandex/video/m3/player/PlaybackException$ErrorInRenderer$UnknownErrorInMediaCodec;", "diagnosticInfo", "", "cause", "", "details", "", "", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class FailedFlush extends UnknownErrorInMediaCodec {
                public static final int $stable = 0;

                public FailedFlush(String str, Throwable th, Map<String, ? extends Object> map) {
                    super(str, th, map);
                }
            }

            public UnknownErrorInMediaCodec(String str, Throwable th, Map<String, ? extends Object> map) {
                super(str, th, map, null);
            }
        }

        private ErrorInRenderer(String str, Throwable th, Map<String, ? extends Object> map) {
            super(th, null, map, 2, null);
            this.diagnosticInfo = str;
        }

        public final String getDiagnosticInfo() {
            return this.diagnosticInfo;
        }

        public final TrackType getTrackType() {
            Map<String, Object> details = getDetails();
            Object obj = details != null ? details.get(TRACK_TYPE) : null;
            if (obj instanceof TrackType) {
                return (TrackType) obj;
            }
            return null;
        }

        public /* synthetic */ ErrorInRenderer(String str, Throwable th, Map map, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, th, map);
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000b\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B3\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\t\u0082\u0001\u000b\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$DrmThrowable;", "Lru/yandex/video/m3/player/PlaybackException;", "cause", "", Constants.KEY_MESSAGE, "", "details", "", "", "(Ljava/lang/Throwable;Ljava/lang/String;Ljava/util/Map;)V", "ErrorAuthentication", "ErrorDiagnosticFatal", "ErrorDiagnosticNotFatal", "ErrorDrmNotSupported", "ErrorDrmProxyConnection", "ErrorDrmUnknown", "ErrorDrmUnsupportedScheme", "ErrorKeysExpired", "ErrorProvisionRequest", "ErrorSession", "MediaResourceBusy", "Lru/yandex/video/m3/player/PlaybackException$DrmThrowable$ErrorAuthentication;", "Lru/yandex/video/m3/player/PlaybackException$DrmThrowable$ErrorDiagnosticFatal;", "Lru/yandex/video/m3/player/PlaybackException$DrmThrowable$ErrorDiagnosticNotFatal;", "Lru/yandex/video/m3/player/PlaybackException$DrmThrowable$ErrorDrmNotSupported;", "Lru/yandex/video/m3/player/PlaybackException$DrmThrowable$ErrorDrmProxyConnection;", "Lru/yandex/video/m3/player/PlaybackException$DrmThrowable$ErrorDrmUnknown;", "Lru/yandex/video/m3/player/PlaybackException$DrmThrowable$ErrorDrmUnsupportedScheme;", "Lru/yandex/video/m3/player/PlaybackException$DrmThrowable$ErrorKeysExpired;", "Lru/yandex/video/m3/player/PlaybackException$DrmThrowable$ErrorProvisionRequest;", "Lru/yandex/video/m3/player/PlaybackException$DrmThrowable$ErrorSession;", "Lru/yandex/video/m3/player/PlaybackException$DrmThrowable$MediaResourceBusy;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class DrmThrowable extends PlaybackException {
        public static final int $stable = 0;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$DrmThrowable$ErrorAuthentication;", "Lru/yandex/video/m3/player/PlaybackException$DrmThrowable;", "cause", "", "(Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ErrorAuthentication extends DrmThrowable {
            public static final int $stable = 0;

            public ErrorAuthentication(Throwable th) {
                super(th, null, null, 6, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$DrmThrowable$ErrorDiagnosticFatal;", "Lru/yandex/video/m3/player/PlaybackException$DrmThrowable;", "error", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ErrorDiagnosticFatal extends DrmThrowable {
            public static final int $stable = 0;
            private final String error;

            public ErrorDiagnosticFatal(String str, Throwable th) {
                super(th, "error: ".concat(str), null, 4, null);
                this.error = str;
            }

            public final String getError() {
                return this.error;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$DrmThrowable$ErrorDiagnosticNotFatal;", "Lru/yandex/video/m3/player/PlaybackException$DrmThrowable;", "error", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ErrorDiagnosticNotFatal extends DrmThrowable {
            public static final int $stable = 0;
            private final String error;

            public ErrorDiagnosticNotFatal(String str, Throwable th) {
                super(th, "error: ".concat(str), null, 4, null);
                this.error = str;
            }

            public final String getError() {
                return this.error;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$DrmThrowable$ErrorDrmNotSupported;", "Lru/yandex/video/m3/player/PlaybackException$DrmThrowable;", "cause", "", "(Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ErrorDrmNotSupported extends DrmThrowable {
            public static final int $stable = 0;

            public ErrorDrmNotSupported(Throwable th) {
                super(th, null, null, 6, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$DrmThrowable$ErrorDrmUnsupportedScheme;", "Lru/yandex/video/m3/player/PlaybackException$DrmThrowable;", "cause", "", "(Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ErrorDrmUnsupportedScheme extends DrmThrowable {
            public static final int $stable = 0;

            public ErrorDrmUnsupportedScheme(Throwable th) {
                super(th, null, null, 6, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$DrmThrowable$ErrorKeysExpired;", "Lru/yandex/video/m3/player/PlaybackException$DrmThrowable;", ErrorResponseData.JSON_ERROR_CODE, "", "cause", "", "(ILjava/lang/Throwable;)V", "getErrorCode", "()I", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ErrorKeysExpired extends DrmThrowable {
            public static final int $stable = 0;
            private final int errorCode;

            public ErrorKeysExpired(int i, Throwable th) {
                super(th, "errorCode=" + i + " message=" + th, null, 4, null);
                this.errorCode = i;
            }

            public final int getErrorCode() {
                return this.errorCode;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$DrmThrowable$ErrorProvisionRequest;", "Lru/yandex/video/m3/player/PlaybackException$DrmThrowable;", "cause", "", "(Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ErrorProvisionRequest extends DrmThrowable {
            public static final int $stable = 0;

            public ErrorProvisionRequest(Throwable th) {
                super(th, null, null, 6, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$DrmThrowable$ErrorSession;", "Lru/yandex/video/m3/player/PlaybackException$DrmThrowable;", "cause", "", "(Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ErrorSession extends DrmThrowable {
            public static final int $stable = 0;

            public ErrorSession(Throwable th) {
                super(th, null, null, 6, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$DrmThrowable$MediaResourceBusy;", "Lru/yandex/video/m3/player/PlaybackException$DrmThrowable;", "cause", "", "(Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class MediaResourceBusy extends DrmThrowable {
            public static final int $stable = 0;

            public MediaResourceBusy(Throwable th) {
                super(th, null, null, 6, null);
            }
        }

        public /* synthetic */ DrmThrowable(Throwable th, String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(th, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : map, null);
        }

        public /* synthetic */ DrmThrowable(Throwable th, String str, Map map, DefaultConstructorMarker defaultConstructorMarker) {
            this(th, str, map);
        }

        private DrmThrowable(Throwable th, String str, Map<String, ? extends Object> map) {
            super(th, str, map, null);
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$DrmThrowable$ErrorDrmProxyConnection;", "Lru/yandex/video/m3/player/PlaybackException$DrmThrowable;", ru.cprocsp.NGate.tools.Constants.INTENT_PARAM_RESPONSE_CODE, "", "responseBody", "", "cause", "", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "getResponseBody", "()Ljava/lang/String;", "getResponseCode", "()I", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ErrorDrmProxyConnection extends DrmThrowable {
            public static final int $stable = 0;
            private final String responseBody;
            private final int responseCode;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public ErrorDrmProxyConnection(int i, String str, Throwable th) {
                super(th, r0.toString(), null, 4, null);
                StringBuilder v = unr0.v(i, "responseCode: ", ", responseBody: ", str, " cause: ");
                v.append(th);
                this.responseCode = i;
                this.responseBody = str;
            }

            public final String getResponseBody() {
                return this.responseBody;
            }

            public final int getResponseCode() {
                return this.responseCode;
            }

            public /* synthetic */ ErrorDrmProxyConnection(int i, String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(i, (i2 & 2) != 0 ? null : str, th);
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BC\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0002\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/yandex/video/m3/player/PlaybackException$DrmThrowable$ErrorDrmUnknown;", "Lru/yandex/video/m3/player/PlaybackException$DrmThrowable;", "cause", "", "(Ljava/lang/Throwable;)V", "cryptoErrorCode", "", "cryptoErrorName", "", Constants.KEY_MESSAGE, "details", "", "", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/util/Map;)V", "getCryptoErrorCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCryptoErrorName", "()Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ErrorDrmUnknown extends DrmThrowable {
            public static final int $stable = 0;
            private final Integer cryptoErrorCode;
            private final String cryptoErrorName;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public ErrorDrmUnknown(Integer num, String str, Throwable th, String str2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(num, str, th, r4, map);
                String X = (i & 8) != 0 ? a.X(j73.A(new String[]{str, th.getMessage()}), Extension.COLON_SPACE, null, null, null, 62) : str2;
                if ((i & 16) != 0) {
                    map = str != null ? g8e.z("error", str) : null;
                }
            }

            public final Integer getCryptoErrorCode() {
                return this.cryptoErrorCode;
            }

            public final String getCryptoErrorName() {
                return this.cryptoErrorName;
            }

            public ErrorDrmUnknown(Integer num, String str, Throwable th, String str2, Map<String, ? extends Object> map) {
                super(th, str2, map, null);
                this.cryptoErrorCode = num;
                this.cryptoErrorName = str;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public ErrorDrmUnknown(Throwable th) {
                this(null, null, th, r0 == null ? "" : r0, null, 16, null);
                String message = th.getMessage();
            }
        }
    }

    public /* synthetic */ PlaybackException(Throwable th, String str, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, str, map);
    }

    private PlaybackException(Throwable th, String str, Map<String, ? extends Object> map) {
        super(str == null ? th.toString() : str, th);
        this.details = map;
    }
}
