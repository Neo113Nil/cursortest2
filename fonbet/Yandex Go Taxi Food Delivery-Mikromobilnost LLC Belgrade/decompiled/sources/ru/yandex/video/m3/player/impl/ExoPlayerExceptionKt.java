package ru.yandex.video.m3.player.impl;

import android.media.MediaCodec;
import android.media.MediaDrmResetException;
import android.media.ResourceBusyException;
import android.net.Uri;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.datasource.cache.Cache$CacheException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoTimeoutException;
import androidx.media3.exoplayer.audio.AudioSink$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.DefaultAudioSink$InvalidAudioTrackTimestampException;
import androidx.media3.exoplayer.dash.DashManifestStaleException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.KeysExpiredException;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker$PlaylistResetException;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker$PlaylistStuckException;
import androidx.media3.exoplayer.mediacodec.BaseMediaCodecRenderer$DecoderInitializationException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRecoverException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.source.UnrecognizedInputFormatException;
import androidx.media3.exoplayer.source.dash.PreloadedLiveDashManifestInCacheExpired;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import androidx.media3.exoplayer.video.EnhancedMediaCodecVideoDecoderException;
import androidx.media3.exoplayer.video.MediaCodecVideoDecoderException;
import androidx.media3.extractor.text.SubtitleDecoderException;
import defpackage.evu0;
import defpackage.npg;
import defpackage.qv10;
import defpackage.sb10;
import defpackage.scc;
import defpackage.w511;
import defpackage.z9c;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLHandshakeException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.data.CodecInfo;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.drm.DrmLoadException;
import ru.yandex.video.m3.player.tracks.TrackType;
import ru.yandex.video.m3.player.utils.DataSpecUtilKt;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0013\u001a\u00020\u0012*\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a-\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001c\u001a\u0004\u0018\u00010\r*\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a=\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\"0!2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b#\u0010$\u001aE\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\"0!2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(\"\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+\"\u0014\u0010-\u001a\u00020,8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010.\"\u0014\u0010/\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u00100\"\u0014\u00101\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u00100\"\u0018\u00105\u001a\u00020\r*\u0002028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104\"\u0018\u00105\u001a\u00020\r*\u0002068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00107¨\u00068"}, d2 = {"", "Lru/yandex/video/m3/player/PlaybackException;", "toPlayerError", "(Ljava/lang/Throwable;)Lru/yandex/video/m3/player/PlaybackException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exoPlaybackException", "checkRendererException", "(Ljava/lang/Exception;)Lru/yandex/video/m3/player/PlaybackException;", "Landroid/media/MediaCodec$CryptoException;", Constants.KEY_EXCEPTION, "checkCryptoException", "(Landroid/media/MediaCodec$CryptoException;)Lru/yandex/video/m3/player/PlaybackException;", "", "stringifyCryptoErrorCode", "(Landroid/media/MediaCodec$CryptoException;)Ljava/lang/String;", "getDiagnosticInfo", "(Ljava/lang/Throwable;)Ljava/lang/String;", "Lru/yandex/video/m3/player/tracks/TrackType;", "getExoRendererTrackType", "(Ljava/lang/Exception;)Lru/yandex/video/m3/player/tracks/TrackType;", "methodName", "diagnosticInfo", "Lru/yandex/video/m3/player/PlaybackException$ErrorInRenderer;", "getErrorInRendererByMethodName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)Lru/yandex/video/m3/player/PlaybackException$ErrorInRenderer;", "", "Ljava/lang/StackTraceElement;", "getNativeCodecMethod", "([Ljava/lang/StackTraceElement;)Ljava/lang/String;", "Lru/yandex/video/m3/data/CodecInfo;", "codecInfo", "stackTrace", "", "", "getInstantiatingDecoderDetails", "(Lru/yandex/video/m3/data/CodecInfo;Ljava/lang/String;[Ljava/lang/StackTraceElement;)Ljava/util/Map;", "Lz9c;", "recoverOptions", "getRecoveringDecoderDetails", "(Lru/yandex/video/m3/data/CodecInfo;Ljava/lang/String;[Ljava/lang/StackTraceElement;Lz9c;)Ljava/util/Map;", "", "CODEC_RELATED_CLASS_NAMES", "Ljava/util/List;", "", "HTTP_AUTHENTICATION_ERROR", CA20Status.STATUS_USER_I, "HOST", "Ljava/lang/String;", "LID", "Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;", "getMimeTypeOrUnknown", "(Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;)Ljava/lang/String;", "mimeTypeOrUnknown", "Landroidx/media3/exoplayer/mediacodec/BaseMediaCodecRenderer$DecoderInitializationException;", "(Landroidx/media3/exoplayer/mediacodec/BaseMediaCodecRenderer$DecoderInitializationException;)Ljava/lang/String;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExoPlayerExceptionKt {
    private static final List<String> CODEC_RELATED_CLASS_NAMES = scc.g("android.media.MediaCodec", "android.media.MediaCodecList");
    private static final String HOST = "host";
    private static final int HTTP_AUTHENTICATION_ERROR = 403;
    private static final String LID = "lid";

    private static final PlaybackException checkCryptoException(MediaCodec.CryptoException cryptoException) {
        return cryptoException.getErrorCode() == 2 ? new PlaybackException.DrmThrowable.ErrorKeysExpired(cryptoException.getErrorCode(), cryptoException) : new PlaybackException.DrmThrowable.ErrorDrmUnknown(Integer.valueOf(cryptoException.getErrorCode()), stringifyCryptoErrorCode(cryptoException), cryptoException, null, null, 24, null);
    }

    private static final PlaybackException checkRendererException(Exception exc) {
        String nativeCodecMethod;
        Throwable cause = exc.getCause();
        if (!(cause instanceof MediaCodec.CodecException ? true : cause instanceof IllegalStateException ? true : cause instanceof IllegalArgumentException) || (nativeCodecMethod = getNativeCodecMethod(cause.getStackTrace())) == null) {
            return null;
        }
        return getErrorInRendererByMethodName(nativeCodecMethod, getDiagnosticInfo(cause), exc);
    }

    private static final String getDiagnosticInfo(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    private static final PlaybackException.ErrorInRenderer getErrorInRendererByMethodName(String str, String str2, Exception exc) {
        MapBuilder y = qv10.y("nativeMethod", str);
        y.put(PlaybackException.ErrorInRenderer.TRACK_TYPE, getExoRendererTrackType(exc));
        PlaybackException.ErrorInRenderer errorInRenderer = null;
        MediaCodecVideoDecoderException mediaCodecVideoDecoderException = exc instanceof MediaCodecVideoDecoderException ? (MediaCodecVideoDecoderException) exc : null;
        if (mediaCodecVideoDecoderException != null) {
            y.put("isSurfaceValid", Boolean.valueOf(mediaCodecVideoDecoderException.isSurfaceValid));
        }
        EnhancedMediaCodecVideoDecoderException enhancedMediaCodecVideoDecoderException = exc instanceof EnhancedMediaCodecVideoDecoderException ? (EnhancedMediaCodecVideoDecoderException) exc : null;
        if (enhancedMediaCodecVideoDecoderException != null) {
            y.put("isRecoverable", Boolean.valueOf(enhancedMediaCodecVideoDecoderException.isRecoverable));
            y.put("isTransient", Boolean.valueOf(enhancedMediaCodecVideoDecoderException.isTransient));
            y.put("metrics", String.valueOf(enhancedMediaCodecVideoDecoderException.metrics));
        }
        MapBuilder j = y.j();
        switch (str.hashCode()) {
            case -1562230564:
                if (str.equals("native_flush")) {
                    errorInRenderer = new PlaybackException.ErrorInRenderer.UnknownErrorInMediaCodec.FailedFlush(str2, exc, j);
                    break;
                }
                break;
            case -1423524280:
                if (str.equals("releaseOutputBuffer")) {
                    errorInRenderer = new PlaybackException.ErrorInRenderer.FailedReleaseOutputBuffer(str2, exc, j);
                    break;
                }
                break;
            case -1288388151:
                if (str.equals("native_dequeueOutputBuffer")) {
                    errorInRenderer = new PlaybackException.ErrorInRenderer.FailedDequeueOutputBuffer(str2, exc, j);
                    break;
                }
                break;
            case -668817919:
                if (str.equals("native_queueInputBuffer")) {
                    errorInRenderer = new PlaybackException.ErrorInRenderer.FailedQueueSecureInputBuffer.FailedQueueInputBuffer(str2, exc, j);
                    break;
                }
                break;
            case -104311021:
                if (str.equals("native_setSurface")) {
                    errorInRenderer = new PlaybackException.ErrorInRenderer.FailedSetSurface(str2, exc, j);
                    break;
                }
                break;
            case 848782978:
                if (str.equals("native_dequeueInputBuffer")) {
                    errorInRenderer = new PlaybackException.ErrorInRenderer.FailedDequeueInputBuffer(str2, exc, j);
                    break;
                }
                break;
            case 1130255562:
                if (str.equals("native_queueSecureInputBuffer")) {
                    errorInRenderer = new PlaybackException.ErrorInRenderer.FailedQueueSecureInputBuffer(str2, exc, j);
                    break;
                }
                break;
            case 1751115562:
                if (str.equals("native_stop")) {
                    errorInRenderer = new PlaybackException.ErrorInRenderer.FailedStop(str2, exc, j);
                    break;
                }
                break;
        }
        return errorInRenderer == null ? new PlaybackException.ErrorInRenderer.UnknownErrorInMediaCodec(str2, exc, j) : errorInRenderer;
    }

    private static final TrackType getExoRendererTrackType(Exception exc) {
        if (exc instanceof MediaCodecVideoDecoderException) {
            return TrackType.Video;
        }
        if (exc instanceof MediaCodecDecoderException) {
            return TrackType.Audio;
        }
        String message = exc.getMessage();
        if (message != null && evu0.y(message, "avc", false)) {
            return TrackType.Video;
        }
        String message2 = exc.getMessage();
        return (message2 == null || !evu0.y(message2, "aac", false)) ? TrackType.Other : TrackType.Audio;
    }

    private static final Map<String, Object> getInstantiatingDecoderDetails(CodecInfo codecInfo, String str, StackTraceElement[] stackTraceElementArr) {
        String name = codecInfo != null ? codecInfo.getName() : null;
        if (name == null) {
            name = "";
        }
        Pair pair = new Pair("decoderName", name);
        if (str == null) {
            str = "";
        }
        Pair pair2 = new Pair("diagnosticInfo", str);
        String nativeCodecMethod = getNativeCodecMethod(stackTraceElementArr);
        Map i = b.i(pair, pair2, new Pair("nativeMethod", nativeCodecMethod != null ? nativeCodecMethod : ""));
        Map i2 = codecInfo != null ? b.i(new Pair("isHardwareAccelerated", Boolean.valueOf(codecInfo.getHardwareAccelerated())), new Pair("maxSupportedInstances", Integer.valueOf(codecInfo.getMaxSupportedInstances()))) : null;
        if (i2 == null) {
            i2 = b.f();
        }
        return b.n(i, i2);
    }

    private static final String getMimeTypeOrUnknown(MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException) {
        String str = mediaCodecRenderer$DecoderInitializationException.mimeType;
        return str == null ? "Unknown Mime Type" : str;
    }

    private static final String getNativeCodecMethod(StackTraceElement[] stackTraceElementArr) {
        StackTraceElement stackTraceElement;
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                stackTraceElement = null;
                break;
            }
            stackTraceElement = stackTraceElementArr[i];
            if (stackTraceElement.isNativeMethod() && CODEC_RELATED_CLASS_NAMES.contains(stackTraceElement.getClassName())) {
                break;
            }
            i++;
        }
        if (stackTraceElement != null) {
            return stackTraceElement.getMethodName();
        }
        return null;
    }

    private static final Map<String, Object> getRecoveringDecoderDetails(CodecInfo codecInfo, String str, StackTraceElement[] stackTraceElementArr, z9c z9cVar) {
        String name = codecInfo != null ? codecInfo.getName() : null;
        if (name == null) {
            name = "";
        }
        Pair pair = new Pair("decoderName", name);
        if (str == null) {
            str = "";
        }
        Pair pair2 = new Pair("diagnosticInfo", str);
        String nativeCodecMethod = getNativeCodecMethod(stackTraceElementArr);
        return b.i(pair, pair2, new Pair("nativeMethod", nativeCodecMethod != null ? nativeCodecMethod : ""), new Pair("recoverType", z9cVar.b));
    }

    private static final String stringifyCryptoErrorCode(MediaCodec.CryptoException cryptoException) {
        int errorCode = cryptoException.getErrorCode();
        if (errorCode == 13) {
            return "generic_oem";
        }
        if (errorCode == 14) {
            return "generic_plugin";
        }
        if (errorCode == 17) {
            return "license_parse_failed";
        }
        if (errorCode == 23) {
            return "media_framework_error";
        }
        if (errorCode == 33) {
            return "zero_subsamples";
        }
        switch (errorCode) {
            case 1:
                return "no_key";
            case 2:
                return "key_expired";
            case 3:
                return "resource_busy";
            case 4:
                return "insufficient_output_protection";
            case 5:
                return "session_not_opened";
            case 6:
                return "unsupported_operation";
            case 7:
                return "insufficiеnt_security";
            case 8:
                return "frame_too_large";
            case 9:
                return "lost_state";
            default:
                return "unknown code " + cryptoException.getErrorCode();
        }
    }

    public static final PlaybackException toPlayerError(Throwable th) {
        Uri uri;
        String lidFromUri;
        Uri uri2;
        String host;
        PlaybackException mediaResourceBusy;
        PlaybackException errorDiagnosticNotFatal;
        String str;
        StackTraceElement[] stackTrace;
        StackTraceElement[] stackTrace2;
        StackTraceElement[] stackTrace3;
        StackTraceElement[] stackTrace4;
        if (th instanceof ExoPlaybackException) {
            PlaybackException checkRendererException = checkRendererException((Exception) th);
            if (checkRendererException != null) {
                return checkRendererException;
            }
            Throwable cause = th.getCause();
            PlaybackException playerError = cause != null ? toPlayerError(cause) : null;
            return playerError == null ? new PlaybackException.ErrorGeneric(th) : playerError;
        }
        if (th instanceof ExoTimeoutException) {
            int i = ((ExoTimeoutException) th).timeoutOperation;
            return i != 1 ? i != 2 ? i != 3 ? new PlaybackException.ErrorTimeout.ErrorUndefined(th) : new PlaybackException.ErrorTimeout.ErrorDetachSurface(th) : new PlaybackException.ErrorTimeout.ErrorForegroundMode(th) : new PlaybackException.ErrorTimeout.ErrorPlayerRelease(th);
        }
        if (th instanceof PlaybackException) {
            return (PlaybackException) th;
        }
        if (th instanceof IllegalSeekPositionException) {
            return new PlaybackException.ErrorSeekPosition(th);
        }
        if (th instanceof MediaCodecUtil$DecoderQueryException) {
            return new PlaybackException.ErrorQueryingDecoders(th);
        }
        if (th instanceof MediaCodecRenderer$DecoderInitializationException) {
            MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException = (MediaCodecRenderer$DecoderInitializationException) th;
            if (mediaCodecRenderer$DecoderInitializationException.codecInfo == null) {
                return th.getCause() instanceof MediaCodecUtil$DecoderQueryException ? new PlaybackException.ErrorQueryingDecoders(th) : mediaCodecRenderer$DecoderInitializationException.secureDecoderRequired ? new PlaybackException.ErrorNoSecureDecoder(getMimeTypeOrUnknown(mediaCodecRenderer$DecoderInitializationException), th) : new PlaybackException.ErrorNoDecoder(getMimeTypeOrUnknown(mediaCodecRenderer$DecoderInitializationException), th);
            }
            sb10 sb10Var = mediaCodecRenderer$DecoderInitializationException.codecInfo;
            String str2 = sb10Var != null ? sb10Var.a : null;
            str = str2 != null ? str2 : "";
            CodecInfo codecInfoDto = sb10Var != null ? CodecInfo.INSTANCE.toCodecInfoDto(sb10Var) : null;
            String str3 = mediaCodecRenderer$DecoderInitializationException.diagnosticInfo;
            Throwable cause2 = th.getCause();
            if (cause2 == null || (stackTrace4 = cause2.getStackTrace()) == null) {
                stackTrace4 = mediaCodecRenderer$DecoderInitializationException.getStackTrace();
            }
            return new PlaybackException.ErrorInstantiatingDecoder(str, th, getInstantiatingDecoderDetails(codecInfoDto, str3, stackTrace4));
        }
        if (th instanceof BaseMediaCodecRenderer$DecoderInitializationException) {
            BaseMediaCodecRenderer$DecoderInitializationException baseMediaCodecRenderer$DecoderInitializationException = (BaseMediaCodecRenderer$DecoderInitializationException) th;
            if (baseMediaCodecRenderer$DecoderInitializationException.codecInfo == null) {
                return th.getCause() instanceof MediaCodecUtil$DecoderQueryException ? new PlaybackException.ErrorQueryingDecoders(th) : baseMediaCodecRenderer$DecoderInitializationException.secureDecoderRequired ? new PlaybackException.ErrorNoSecureDecoder(getMimeTypeOrUnknown(baseMediaCodecRenderer$DecoderInitializationException), th) : new PlaybackException.ErrorNoDecoder(getMimeTypeOrUnknown(baseMediaCodecRenderer$DecoderInitializationException), th);
            }
            sb10 sb10Var2 = baseMediaCodecRenderer$DecoderInitializationException.codecInfo;
            String str4 = sb10Var2.a;
            CodecInfo codecInfoDto2 = CodecInfo.INSTANCE.toCodecInfoDto(sb10Var2);
            String str5 = baseMediaCodecRenderer$DecoderInitializationException.diagnosticInfo;
            Throwable cause3 = th.getCause();
            if (cause3 == null || (stackTrace3 = cause3.getStackTrace()) == null) {
                stackTrace3 = baseMediaCodecRenderer$DecoderInitializationException.getStackTrace();
            }
            return new PlaybackException.ErrorInstantiatingDecoder(str4, th, getInstantiatingDecoderDetails(codecInfoDto2, str5, stackTrace3));
        }
        if (th instanceof MediaCodecRecoverException) {
            MediaCodecRecoverException mediaCodecRecoverException = (MediaCodecRecoverException) th;
            sb10 sb10Var3 = mediaCodecRecoverException.codecInfo;
            String str6 = sb10Var3 != null ? sb10Var3.a : null;
            str = str6 != null ? str6 : "";
            CodecInfo codecInfoDto3 = sb10Var3 != null ? CodecInfo.INSTANCE.toCodecInfoDto(sb10Var3) : null;
            String str7 = mediaCodecRecoverException.diagnosticInfo;
            Throwable cause4 = th.getCause();
            if (cause4 == null || (stackTrace2 = cause4.getStackTrace()) == null) {
                stackTrace2 = mediaCodecRecoverException.getStackTrace();
            }
            return new PlaybackException.ErrorInstantiatingDecoder.ErrorRecoveringDecoder(str, th, getRecoveringDecoderDetails(codecInfoDto3, str7, stackTrace2, mediaCodecRecoverException.recoverOptions));
        }
        if (th instanceof MediaCodecDecoderException) {
            PlaybackException checkRendererException2 = checkRendererException((Exception) th);
            if (checkRendererException2 == null) {
                MediaCodecDecoderException mediaCodecDecoderException = (MediaCodecDecoderException) th;
                sb10 sb10Var4 = mediaCodecDecoderException.codecInfo;
                String str8 = sb10Var4 != null ? sb10Var4.a : null;
                str = str8 != null ? str8 : "";
                CodecInfo codecInfoDto4 = sb10Var4 != null ? CodecInfo.INSTANCE.toCodecInfoDto(sb10Var4) : null;
                String str9 = mediaCodecDecoderException.diagnosticInfo;
                Throwable cause5 = th.getCause();
                if (cause5 == null || (stackTrace = cause5.getStackTrace()) == null) {
                    stackTrace = mediaCodecDecoderException.getStackTrace();
                }
                checkRendererException2 = new PlaybackException.ErrorInstantiatingDecoder(str, th, getInstantiatingDecoderDetails(codecInfoDto4, str9, stackTrace));
            }
            return checkRendererException2;
        }
        if (th instanceof BehindLiveWindowException) {
            return new PlaybackException.ErrorBehindLiveWindow(th);
        }
        if (th instanceof MediaCodec.CryptoException) {
            return checkCryptoException((MediaCodec.CryptoException) th);
        }
        if (th instanceof DrmSession$DrmSessionException) {
            Throwable cause6 = th.getCause();
            if (cause6 != null) {
                if ((cause6 instanceof MediaDrmResetException) || (cause6 instanceof ResourceBusyException)) {
                    mediaResourceBusy = new PlaybackException.DrmThrowable.MediaResourceBusy(th);
                } else if (cause6 instanceof MediaCodec.CryptoException) {
                    mediaResourceBusy = checkCryptoException((MediaCodec.CryptoException) cause6);
                } else if (cause6 instanceof KeysExpiredException) {
                    mediaResourceBusy = new PlaybackException.DrmThrowable.ErrorKeysExpired(2, th);
                } else if (cause6 instanceof PlaybackException.DrmThrowable.ErrorDrmProxyConnection) {
                    mediaResourceBusy = ((PlaybackException.DrmThrowable.ErrorDrmProxyConnection) cause6).getResponseCode() == 403 ? new PlaybackException.DrmThrowable.ErrorAuthentication(th) : (PlaybackException.DrmThrowable) cause6;
                } else if (cause6 instanceof DrmLoadException.ErrorDiagnostic) {
                    DrmLoadException.ErrorDiagnostic errorDiagnostic = (DrmLoadException.ErrorDiagnostic) cause6;
                    boolean isFatal = errorDiagnostic.getIsFatal();
                    if (isFatal) {
                        errorDiagnosticNotFatal = new PlaybackException.DrmThrowable.ErrorDiagnosticFatal(errorDiagnostic.getError(), th);
                    } else {
                        if (isFatal) {
                            w511.b();
                            return null;
                        }
                        errorDiagnosticNotFatal = new PlaybackException.DrmThrowable.ErrorDiagnosticNotFatal(errorDiagnostic.getError(), th);
                    }
                    mediaResourceBusy = errorDiagnosticNotFatal;
                } else {
                    mediaResourceBusy = cause6 instanceof DrmLoadException.ErrorProvisionRequestException ? new PlaybackException.DrmThrowable.ErrorProvisionRequest(th) : cause6 instanceof PlaybackException ? (PlaybackException) cause6 : new PlaybackException.DrmThrowable.ErrorSession(th);
                }
                if (mediaResourceBusy != null) {
                    return mediaResourceBusy;
                }
            }
            return new PlaybackException.DrmThrowable.ErrorSession(th);
        }
        if (th instanceof HttpDataSource$InvalidResponseCodeException) {
            HttpDataSource$InvalidResponseCodeException httpDataSource$InvalidResponseCodeException = (HttpDataSource$InvalidResponseCodeException) th;
            int i2 = httpDataSource$InvalidResponseCodeException.responseCode;
            return i2 != 401 ? i2 != 403 ? i2 != 451 ? new PlaybackException.ErrorConnection.Unknown(httpDataSource$InvalidResponseCodeException.responseCode, httpDataSource$InvalidResponseCodeException.dataSpec.toString(), th) : new PlaybackException.ErrorConnection.UnavailableForLegalReasons(httpDataSource$InvalidResponseCodeException.responseCode, httpDataSource$InvalidResponseCodeException.dataSpec.toString(), th) : new PlaybackException.ErrorConnection.Forbidden(httpDataSource$InvalidResponseCodeException.responseCode, httpDataSource$InvalidResponseCodeException.dataSpec.toString(), th) : new PlaybackException.ErrorConnection.Unauthorized(httpDataSource$InvalidResponseCodeException.responseCode, httpDataSource$InvalidResponseCodeException.dataSpec.toString(), th);
        }
        if (th instanceof HttpDataSource$HttpDataSourceException) {
            if (th.getCause() instanceof SSLHandshakeException) {
                return new PlaybackException.ErrorConnectionSSLHandshake(th);
            }
            npg npgVar = ((HttpDataSource$HttpDataSourceException) th).dataSpec;
            if (npgVar == null) {
                npgVar = null;
            }
            Uri uri3 = npgVar != null ? npgVar.a : null;
            MapBuilder mapBuilder = new MapBuilder();
            if (npgVar != null && (uri2 = npgVar.a) != null && (host = uri2.getHost()) != null) {
                mapBuilder.put("host", host);
            }
            if (npgVar != null && (uri = npgVar.a) != null && (lidFromUri = DataSpecUtilKt.getLidFromUri(uri)) != null) {
                mapBuilder.put(LID, lidFromUri);
            }
            return new PlaybackException.ErrorNoInternetConnection(uri3, th, mapBuilder.j());
        }
        if (th instanceof DataSourceException) {
            return ((DataSourceException) th).reason == 2008 ? new PlaybackException.ErrorDataSourceReadPositionOutOfRange(th) : new PlaybackException.ErrorDataSource(th);
        }
        if (th instanceof UnrecognizedInputFormatException) {
            return new PlaybackException.UnsupportedContentException.ErrorParser.InvalidStreamUrl(th);
        }
        if (th instanceof ParserException) {
            return new PlaybackException.UnsupportedContentException.ErrorParser(th);
        }
        if (th instanceof Loader$UnexpectedLoaderException) {
            if (th.getCause() instanceof RuntimeException) {
                Throwable cause7 = th.getCause();
                if ((cause7 != null ? cause7.getCause() : null) instanceof PlaybackException.AdaptationSetsCountChanged) {
                    Throwable cause8 = th.getCause();
                    return (PlaybackException.AdaptationSetsCountChanged) (cause8 != null ? cause8.getCause() : null);
                }
            }
            if (th.getCause() instanceof RuntimeException) {
                Throwable cause9 = th.getCause();
                if ((cause9 != null ? cause9.getCause() : null) instanceof PlaybackException.RepresentationCountChanged) {
                    Throwable cause10 = th.getCause();
                    return (PlaybackException.RepresentationCountChanged) (cause10 != null ? cause10.getCause() : null);
                }
            }
            return new PlaybackException.UnsupportedContentException.ErrorParser(th);
        }
        if (th instanceof AudioSink$ConfigurationException ? true : th instanceof AudioSink$InitializationException ? true : th instanceof DefaultAudioSink$InvalidAudioTrackTimestampException) {
            return new PlaybackException.UnsupportedContentException.ErrorAudio(th);
        }
        if (th instanceof SubtitleDecoderException) {
            return new PlaybackException.ErrorSubtitleNoDecoder(th);
        }
        if (th instanceof DashManifestStaleException) {
            return new PlaybackException.UnsupportedContentException.ErrorParser(th);
        }
        if (th instanceof HlsPlaylistTracker$PlaylistStuckException) {
            return new PlaybackException.ErrorPlaylistStuck(th);
        }
        if (th instanceof HlsPlaylistTracker$PlaylistResetException) {
            return new PlaybackException.ErrorPlaylistReset(th);
        }
        if (th instanceof Cache$CacheException) {
            return new PlaybackException.ErrorCache(th);
        }
        if (th instanceof DrmLoadException.ErrorDiagnostic) {
            DrmLoadException.ErrorDiagnostic errorDiagnostic2 = (DrmLoadException.ErrorDiagnostic) th;
            boolean isFatal2 = errorDiagnostic2.getIsFatal();
            if (isFatal2) {
                return new PlaybackException.DrmThrowable.ErrorDiagnosticFatal(errorDiagnostic2.getError(), th);
            }
            if (!isFatal2) {
                return new PlaybackException.DrmThrowable.ErrorDiagnosticNotFatal(errorDiagnostic2.getError(), th);
            }
            w511.b();
            return null;
        }
        if (th instanceof DrmLoadException.ErrorProvisionRequestException) {
            return new PlaybackException.DrmThrowable.ErrorProvisionRequest(th);
        }
        if (th instanceof ErrorBehindLiveWindowFromPreloadedLiveDashManifest) {
            ErrorBehindLiveWindowFromPreloadedLiveDashManifest errorBehindLiveWindowFromPreloadedLiveDashManifest = (ErrorBehindLiveWindowFromPreloadedLiveDashManifest) th;
            return new PlaybackException.ErrorGeneric.ErrorBehindLiveWindowFromPreloadedLiveDashManifest(errorBehindLiveWindowFromPreloadedLiveDashManifest.getCache(), errorBehindLiveWindowFromPreloadedLiveDashManifest.getManifestCacheKey(), th);
        }
        if (!(th instanceof PreloadedLiveDashManifestInCacheExpired)) {
            return new PlaybackException.ErrorGeneric(th);
        }
        PreloadedLiveDashManifestInCacheExpired preloadedLiveDashManifestInCacheExpired = (PreloadedLiveDashManifestInCacheExpired) th;
        return new PlaybackException.ErrorGeneric.PreloadedLiveDashManifestInCacheExpired(preloadedLiveDashManifestInCacheExpired.getCache(), preloadedLiveDashManifestInCacheExpired.getManifestCacheKey(), th);
    }

    private static final String getMimeTypeOrUnknown(BaseMediaCodecRenderer$DecoderInitializationException baseMediaCodecRenderer$DecoderInitializationException) {
        String str = baseMediaCodecRenderer$DecoderInitializationException.mimeType;
        return str == null ? "Unknown Mime Type" : str;
    }
}
