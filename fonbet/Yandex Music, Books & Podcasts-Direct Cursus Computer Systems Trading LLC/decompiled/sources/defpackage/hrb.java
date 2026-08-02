package defpackage;

import android.media.MediaCodec;
import android.media.MediaDrmResetException;
import android.media.ResourceBusyException;
import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLHandshakeException;
import kotlin.Pair;
import kotlin.text.StringsKt;
import ru.yandex.video.m3.data.CodecInfo;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.drm.DrmLoadException;
import ru.yandex.video.m3.player.impl.ErrorBehindLiveWindowFromPreloadedLiveDashManifest;
import ru.yandex.video.m3.player.tracks.TrackType;

/* loaded from: classes6.dex */
public abstract class hrb {
    public static final List a = u75.h("android.media.MediaCodec", "android.media.MediaCodecList");

    public static final PlaybackException.DrmThrowable a(MediaCodec.CryptoException cryptoException) {
        String str;
        if (cryptoException.getErrorCode() == 2) {
            return new PlaybackException.DrmThrowable.ErrorKeysExpired(cryptoException.getErrorCode(), cryptoException);
        }
        Integer valueOf = Integer.valueOf(cryptoException.getErrorCode());
        int errorCode = cryptoException.getErrorCode();
        if (errorCode == 13) {
            str = "generic_oem";
        } else if (errorCode == 14) {
            str = "generic_plugin";
        } else if (errorCode == 17) {
            str = "license_parse_failed";
        } else if (errorCode == 23) {
            str = "media_framework_error";
        } else if (errorCode != 33) {
            switch (errorCode) {
                case 1:
                    str = "no_key";
                    break;
                case 2:
                    str = "key_expired";
                    break;
                case 3:
                    str = "resource_busy";
                    break;
                case 4:
                    str = "insufficient_output_protection";
                    break;
                case 5:
                    str = "session_not_opened";
                    break;
                case 6:
                    str = "unsupported_operation";
                    break;
                case 7:
                    str = "insufficiеnt_security";
                    break;
                case 8:
                    str = "frame_too_large";
                    break;
                case 9:
                    str = "lost_state";
                    break;
                default:
                    str = "unknown code " + cryptoException.getErrorCode();
                    break;
            }
        } else {
            str = "zero_subsamples";
        }
        return new PlaybackException.DrmThrowable.ErrorDrmUnknown(valueOf, str, cryptoException, null, null, 24, null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public static final PlaybackException.ErrorInRenderer b(Exception exc) {
        TrackType trackType;
        Throwable cause = exc.getCause();
        PlaybackException.ErrorInRenderer errorInRenderer = null;
        if (cause instanceof MediaCodec.CodecException ? true : cause instanceof IllegalStateException ? true : cause instanceof IllegalArgumentException) {
            StackTraceElement[] stackTrace = cause.getStackTrace();
            stackTrace.getClass();
            String d = d(stackTrace);
            if (d != null) {
                String diagnosticInfo = cause instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) cause).getDiagnosticInfo() : null;
                f9h f9hVar = new f9h();
                f9hVar.put("nativeMethod", d);
                boolean z = exc instanceof akh;
                if (z) {
                    trackType = TrackType.Video;
                } else if (exc instanceof lih) {
                    trackType = TrackType.Audio;
                } else {
                    String message = exc.getMessage();
                    if (message == null || !StringsKt.M(message, "avc", false)) {
                        String message2 = exc.getMessage();
                        trackType = (message2 == null || !StringsKt.M(message2, "aac", false)) ? TrackType.Other : TrackType.Audio;
                    } else {
                        trackType = TrackType.Video;
                    }
                }
                f9hVar.put(PlaybackException.ErrorInRenderer.TRACK_TYPE, trackType);
                akh akhVar = z ? (akh) exc : null;
                if (akhVar != null) {
                    f9hVar.put("isSurfaceValid", Boolean.valueOf(akhVar.d));
                }
                n8b n8bVar = exc instanceof n8b ? (n8b) exc : null;
                if (n8bVar != null) {
                    f9hVar.put("isRecoverable", Boolean.valueOf(n8bVar.e));
                    f9hVar.put("isTransient", Boolean.valueOf(n8bVar.f));
                    f9hVar.put("metrics", String.valueOf(n8bVar.g));
                }
                f9h b = f9hVar.b();
                switch (d.hashCode()) {
                    case -1562230564:
                        if (d.equals("native_flush")) {
                            errorInRenderer = new PlaybackException.ErrorInRenderer.UnknownErrorInMediaCodec.FailedFlush(diagnosticInfo, exc, b);
                            break;
                        }
                        break;
                    case -1423524280:
                        if (d.equals("releaseOutputBuffer")) {
                            errorInRenderer = new PlaybackException.ErrorInRenderer.FailedReleaseOutputBuffer(diagnosticInfo, exc, b);
                            break;
                        }
                        break;
                    case -1288388151:
                        if (d.equals("native_dequeueOutputBuffer")) {
                            errorInRenderer = new PlaybackException.ErrorInRenderer.FailedDequeueOutputBuffer(diagnosticInfo, exc, b);
                            break;
                        }
                        break;
                    case -668817919:
                        if (d.equals("native_queueInputBuffer")) {
                            errorInRenderer = new PlaybackException.ErrorInRenderer.FailedQueueSecureInputBuffer.FailedQueueInputBuffer(diagnosticInfo, exc, b);
                            break;
                        }
                        break;
                    case -104311021:
                        if (d.equals("native_setSurface")) {
                            errorInRenderer = new PlaybackException.ErrorInRenderer.FailedSetSurface(diagnosticInfo, exc, b);
                            break;
                        }
                        break;
                    case 848782978:
                        if (d.equals("native_dequeueInputBuffer")) {
                            errorInRenderer = new PlaybackException.ErrorInRenderer.FailedDequeueInputBuffer(diagnosticInfo, exc, b);
                            break;
                        }
                        break;
                    case 1130255562:
                        if (d.equals("native_queueSecureInputBuffer")) {
                            errorInRenderer = new PlaybackException.ErrorInRenderer.FailedQueueSecureInputBuffer(diagnosticInfo, exc, b);
                            break;
                        }
                        break;
                    case 1751115562:
                        if (d.equals("native_stop")) {
                            errorInRenderer = new PlaybackException.ErrorInRenderer.FailedStop(diagnosticInfo, exc, b);
                            break;
                        }
                        break;
                }
                if (errorInRenderer == null) {
                    return new PlaybackException.ErrorInRenderer.UnknownErrorInMediaCodec(diagnosticInfo, exc, b);
                }
            }
        }
        return errorInRenderer;
    }

    public static final LinkedHashMap c(CodecInfo codecInfo, String str, StackTraceElement[] stackTraceElementArr) {
        String name = codecInfo != null ? codecInfo.getName() : null;
        if (name == null) {
            name = "";
        }
        Pair pair = new Pair("decoderName", name);
        if (str == null) {
            str = "";
        }
        Pair pair2 = new Pair("diagnosticInfo", str);
        String d = d(stackTraceElementArr);
        Map e = uah.e(pair, pair2, new Pair("nativeMethod", d != null ? d : ""));
        Map e2 = codecInfo != null ? uah.e(new Pair("isHardwareAccelerated", Boolean.valueOf(codecInfo.getHardwareAccelerated())), new Pair("maxSupportedInstances", Integer.valueOf(codecInfo.getMaxSupportedInstances()))) : null;
        if (e2 == null) {
            e2 = e5b.a;
            e2.getClass();
        }
        return uah.i(e, e2);
    }

    public static final String d(StackTraceElement[] stackTraceElementArr) {
        StackTraceElement stackTraceElement;
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                stackTraceElement = null;
                break;
            }
            stackTraceElement = stackTraceElementArr[i];
            if (stackTraceElement.isNativeMethod() && a.contains(stackTraceElement.getClassName())) {
                break;
            }
            i++;
        }
        if (stackTraceElement != null) {
            return stackTraceElement.getMethodName();
        }
        return null;
    }

    public static final PlaybackException e(Throwable th) {
        Uri uri;
        String y;
        Uri uri2;
        String host;
        String str;
        StackTraceElement[] stackTrace;
        CodecInfo codecInfo;
        StackTraceElement[] stackTrace2;
        StackTraceElement[] stackTrace3;
        StackTraceElement[] stackTrace4;
        th.getClass();
        CodecInfo codecInfo2 = null;
        if (th instanceof pqb) {
            PlaybackException.ErrorInRenderer b = b((Exception) th);
            if (b != null) {
                return b;
            }
            Throwable cause = th.getCause();
            PlaybackException e = cause != null ? e(cause) : null;
            return e == null ? new PlaybackException.ErrorGeneric(th) : e;
        }
        if (th instanceof wsb) {
            int i = ((wsb) th).a;
            return i != 1 ? i != 2 ? i != 3 ? new PlaybackException.ErrorTimeout.ErrorUndefined(th) : new PlaybackException.ErrorTimeout.ErrorDetachSurface(th) : new PlaybackException.ErrorTimeout.ErrorForegroundMode(th) : new PlaybackException.ErrorTimeout.ErrorPlayerRelease(th);
        }
        if (th instanceof PlaybackException) {
            return (PlaybackException) th;
        }
        if (th instanceof dbe) {
            return new PlaybackException.ErrorSeekPosition(th);
        }
        if (th instanceof wjh) {
            return new PlaybackException.ErrorQueryingDecoders(th);
        }
        if (th instanceof oih) {
            oih oihVar = (oih) th;
            String str2 = oihVar.a;
            mih mihVar = oihVar.c;
            if (mihVar == null) {
                if (th.getCause() instanceof wjh) {
                    return new PlaybackException.ErrorQueryingDecoders(th);
                }
                if (oihVar.b) {
                    return new PlaybackException.ErrorNoSecureDecoder(str2 != null ? str2 : "Unknown Mime Type", th);
                }
                return new PlaybackException.ErrorNoDecoder(str2 != null ? str2 : "Unknown Mime Type", th);
            }
            String str3 = mihVar.a;
            str = str3 != null ? str3 : "";
            CodecInfo.Companion.getClass();
            CodecInfo a2 = rq4.a(mihVar);
            String str4 = oihVar.d;
            Throwable cause2 = th.getCause();
            if (cause2 == null || (stackTrace4 = cause2.getStackTrace()) == null) {
                stackTrace4 = oihVar.getStackTrace();
            }
            stackTrace4.getClass();
            return new PlaybackException.ErrorInstantiatingDecoder(str, th, c(a2, str4, stackTrace4));
        }
        if (th instanceof hs2) {
            hs2 hs2Var = (hs2) th;
            String str5 = hs2Var.a;
            mih mihVar2 = hs2Var.c;
            if (mihVar2 == null) {
                if (th.getCause() instanceof wjh) {
                    return new PlaybackException.ErrorQueryingDecoders(th);
                }
                if (hs2Var.b) {
                    return new PlaybackException.ErrorNoSecureDecoder(str5 != null ? str5 : "Unknown Mime Type", th);
                }
                return new PlaybackException.ErrorNoDecoder(str5 != null ? str5 : "Unknown Mime Type", th);
            }
            String str6 = mihVar2.a;
            str6.getClass();
            CodecInfo.Companion.getClass();
            CodecInfo a3 = rq4.a(mihVar2);
            String str7 = hs2Var.d;
            Throwable cause3 = th.getCause();
            if (cause3 == null || (stackTrace3 = cause3.getStackTrace()) == null) {
                stackTrace3 = hs2Var.getStackTrace();
            }
            stackTrace3.getClass();
            return new PlaybackException.ErrorInstantiatingDecoder(str6, th, c(a3, str7, stackTrace3));
        }
        if (th instanceof nih) {
            nih nihVar = (nih) th;
            mih mihVar3 = nihVar.a;
            String str8 = mihVar3 != null ? mihVar3.a : null;
            if (str8 == null) {
                str8 = "";
            }
            if (mihVar3 != null) {
                CodecInfo.Companion.getClass();
                codecInfo = rq4.a(mihVar3);
            } else {
                codecInfo = null;
            }
            String str9 = nihVar.b;
            Throwable cause4 = th.getCause();
            if (cause4 == null || (stackTrace2 = cause4.getStackTrace()) == null) {
                stackTrace2 = nihVar.getStackTrace();
            }
            stackTrace2.getClass();
            qq4 qq4Var = nihVar.d;
            qq4Var.getClass();
            String name = codecInfo != null ? codecInfo.getName() : null;
            if (name == null) {
                name = "";
            }
            Pair pair = new Pair("decoderName", name);
            if (str9 == null) {
                str9 = "";
            }
            Pair pair2 = new Pair("diagnosticInfo", str9);
            String d = d(stackTrace2);
            return new PlaybackException.ErrorInstantiatingDecoder.ErrorRecoveringDecoder(str8, th, uah.e(pair, pair2, new Pair("nativeMethod", d != null ? d : ""), new Pair("recoverType", qq4Var.b)));
        }
        if (th instanceof lih) {
            PlaybackException b2 = b((Exception) th);
            if (b2 == null) {
                lih lihVar = (lih) th;
                mih mihVar4 = lihVar.a;
                String str10 = mihVar4 != null ? mihVar4.a : null;
                str = str10 != null ? str10 : "";
                if (mihVar4 != null) {
                    CodecInfo.Companion.getClass();
                    codecInfo2 = rq4.a(mihVar4);
                }
                String str11 = lihVar.b;
                Throwable cause5 = th.getCause();
                if (cause5 == null || (stackTrace = cause5.getStackTrace()) == null) {
                    stackTrace = lihVar.getStackTrace();
                }
                stackTrace.getClass();
                b2 = new PlaybackException.ErrorInstantiatingDecoder(str, th, c(codecInfo2, str11, stackTrace));
            }
            return b2;
        }
        if (th instanceof yy2) {
            return new PlaybackException.ErrorBehindLiveWindow(th);
        }
        if (th instanceof MediaCodec.CryptoException) {
            return a((MediaCodec.CryptoException) th);
        }
        if (th instanceof yqa) {
            Throwable cause6 = th.getCause();
            if (cause6 == null) {
                return new PlaybackException.DrmThrowable.ErrorSession(th);
            }
            if ((cause6 instanceof MediaDrmResetException) || (cause6 instanceof ResourceBusyException)) {
                return new PlaybackException.DrmThrowable.MediaResourceBusy(th);
            }
            if (cause6 instanceof MediaCodec.CryptoException) {
                return a((MediaCodec.CryptoException) cause6);
            }
            if (cause6 instanceof icf) {
                return new PlaybackException.DrmThrowable.ErrorKeysExpired(2, th);
            }
            if (cause6 instanceof PlaybackException.DrmThrowable.ErrorDrmProxyConnection) {
                return ((PlaybackException.DrmThrowable.ErrorDrmProxyConnection) cause6).getResponseCode() == 403 ? new PlaybackException.DrmThrowable.ErrorAuthentication(th) : (PlaybackException.DrmThrowable) cause6;
            }
            if (!(cause6 instanceof DrmLoadException.ErrorDiagnostic)) {
                return cause6 instanceof DrmLoadException.ErrorProvisionRequestException ? new PlaybackException.DrmThrowable.ErrorProvisionRequest(th) : cause6 instanceof PlaybackException ? (PlaybackException) cause6 : new PlaybackException.DrmThrowable.ErrorSession(th);
            }
            DrmLoadException.ErrorDiagnostic errorDiagnostic = (DrmLoadException.ErrorDiagnostic) cause6;
            boolean isFatal = errorDiagnostic.getIsFatal();
            if (isFatal) {
                return new PlaybackException.DrmThrowable.ErrorDiagnosticFatal(errorDiagnostic.getError(), th);
            }
            if (!isFatal) {
                return new PlaybackException.DrmThrowable.ErrorDiagnosticNotFatal(errorDiagnostic.getError(), th);
            }
            b6e.s();
            return null;
        }
        if (th instanceof i6e) {
            i6e i6eVar = (i6e) th;
            nb7 nb7Var = i6eVar.b;
            int i2 = i6eVar.d;
            return i2 != 401 ? i2 != 403 ? i2 != 451 ? new PlaybackException.ErrorConnection.Unknown(i2, nb7Var.toString(), th) : new PlaybackException.ErrorConnection.UnavailableForLegalReasons(i2, nb7Var.toString(), th) : new PlaybackException.ErrorConnection.Forbidden(i2, nb7Var.toString(), th) : new PlaybackException.ErrorConnection.Unauthorized(i2, nb7Var.toString(), th);
        }
        if (th instanceof g6e) {
            if (th.getCause() instanceof SSLHandshakeException) {
                return new PlaybackException.ErrorConnectionSSLHandshake(th);
            }
            nb7 nb7Var2 = ((g6e) th).b;
            if (nb7Var2 == null) {
                nb7Var2 = null;
            }
            Uri uri3 = nb7Var2 != null ? nb7Var2.a : null;
            f9h f9hVar = new f9h();
            if (nb7Var2 != null && (uri2 = nb7Var2.a) != null && (host = uri2.getHost()) != null) {
                f9hVar.put("host", host);
            }
            if (nb7Var2 != null && (uri = nb7Var2.a) != null && (y = ild.y(uri)) != null) {
                f9hVar.put("lid", y);
            }
            return new PlaybackException.ErrorNoInternetConnection(uri3, th, f9hVar.b());
        }
        if (th instanceof hb7) {
            return ((hb7) th).a == 2008 ? new PlaybackException.ErrorDataSourceReadPositionOutOfRange(th) : new PlaybackException.ErrorDataSource(th);
        }
        if (th instanceof olt) {
            return new PlaybackException.UnsupportedContentException.ErrorParser.InvalidStreamUrl(th);
        }
        if (th instanceof r7k) {
            return new PlaybackException.UnsupportedContentException.ErrorParser(th);
        }
        if (th instanceof lgg) {
            if (th.getCause() instanceof RuntimeException) {
                Throwable cause7 = th.getCause();
                if ((cause7 != null ? cause7.getCause() : null) instanceof PlaybackException.AdaptationSetsCountChanged) {
                    Throwable cause8 = th.getCause();
                    Throwable cause9 = cause8 != null ? cause8.getCause() : null;
                    cause9.getClass();
                    return (PlaybackException.AdaptationSetsCountChanged) cause9;
                }
            }
            if (th.getCause() instanceof RuntimeException) {
                Throwable cause10 = th.getCause();
                if ((cause10 != null ? cause10.getCause() : null) instanceof PlaybackException.RepresentationCountChanged) {
                    Throwable cause11 = th.getCause();
                    Throwable cause12 = cause11 != null ? cause11.getCause() : null;
                    cause12.getClass();
                    return (PlaybackException.RepresentationCountChanged) cause12;
                }
            }
            return new PlaybackException.UnsupportedContentException.ErrorParser(th);
        }
        if (th instanceof jy1 ? true : th instanceof ky1 ? true : th instanceof zj7) {
            return new PlaybackException.UnsupportedContentException.ErrorAudio(th);
        }
        if (th instanceof kpr) {
            return new PlaybackException.ErrorSubtitleNoDecoder(th);
        }
        if (th instanceof g97) {
            return new PlaybackException.UnsupportedContentException.ErrorParser(th);
        }
        if (th instanceof o0e) {
            return new PlaybackException.ErrorPlaylistStuck(th);
        }
        if (th instanceof n0e) {
            return new PlaybackException.ErrorPlaylistReset(th);
        }
        if (th instanceof oo3) {
            return new PlaybackException.ErrorCache(th);
        }
        if (!(th instanceof DrmLoadException.ErrorDiagnostic)) {
            if (th instanceof DrmLoadException.ErrorProvisionRequestException) {
                return new PlaybackException.DrmThrowable.ErrorProvisionRequest(th);
            }
            if (!(th instanceof ErrorBehindLiveWindowFromPreloadedLiveDashManifest)) {
                return th instanceof ynm ? new PlaybackException.ErrorGeneric.PreloadedLiveDashManifestInCacheExpired(null, null, th) : new PlaybackException.ErrorGeneric(th);
            }
            ErrorBehindLiveWindowFromPreloadedLiveDashManifest errorBehindLiveWindowFromPreloadedLiveDashManifest = (ErrorBehindLiveWindowFromPreloadedLiveDashManifest) th;
            return new PlaybackException.ErrorGeneric.ErrorBehindLiveWindowFromPreloadedLiveDashManifest(errorBehindLiveWindowFromPreloadedLiveDashManifest.getCache(), errorBehindLiveWindowFromPreloadedLiveDashManifest.getManifestCacheKey(), th);
        }
        DrmLoadException.ErrorDiagnostic errorDiagnostic2 = (DrmLoadException.ErrorDiagnostic) th;
        boolean isFatal2 = errorDiagnostic2.getIsFatal();
        if (isFatal2) {
            return new PlaybackException.DrmThrowable.ErrorDiagnosticFatal(errorDiagnostic2.getError(), th);
        }
        if (!isFatal2) {
            return new PlaybackException.DrmThrowable.ErrorDiagnosticNotFatal(errorDiagnostic2.getError(), th);
        }
        b6e.s();
        return null;
    }
}
