package ru.yandex.video.m3.player.impl.utils;

import androidx.media3.common.ParserException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.datasource.cache.CacheDataSink$CacheDataSinkException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientImpl;
import defpackage.qwy;
import defpackage.rwy;
import defpackage.scc;
import defpackage.swy;
import defpackage.twy;
import defpackage.w511;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.List;
import javax.net.ssl.SSLException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.StreamResetException;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.video.m3.player.drm.DrmLoadException;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000 42\u00020\u0001:\u00014B\u001d\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J!\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010#\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b$\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\"\u0010(\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R \u00100\u001a\b\u0012\u0004\u0012\u00020/0.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/LoadErrorHandlingPolicyImpl;", "Ltwy;", "", "maxRetryDelayMs", "", "minLoadableRetryCount", "<init>", "(JI)V", "Ljava/io/IOException;", "sourceException", "Ljava/lang/Class;", "", "checkType", "", "isRootCauseExceptionType", "(Ljava/io/IOException;Ljava/lang/Class;)Z", Constants.INTENT_PARAM_RESPONSE_CODE, "isEligibleForFallbackResponseCode", "(I)Z", "responseCode4xxForbiddenToFallbackOrRetry", "Lqwy;", "fallbackOptions", "Lswy;", "loadErrorInfo", "Lrwy;", "getFallbackSelectionFor", "(Lqwy;Lswy;)Lrwy;", "getRetryDelayMsFor", "(Lswy;)J", "dataType", "getMinimumLoadableRetryCount", "(I)I", io.appmetrica.analytics.rtm.internal.Constants.KEY_EXCEPTION, "isEligibleForFallback$video_player_internalRelease", "(Ljava/io/IOException;)Z", "isEligibleForFallback", "isEligibleForRetry$video_player_internalRelease", "isEligibleForRetry", "J", CA20Status.STATUS_USER_I, "expDoRetryForStreamResetException", "Z", "getExpDoRetryForStreamResetException$video_player_internalRelease", "()Z", "setExpDoRetryForStreamResetException$video_player_internalRelease", "(Z)V", "", "", "eligibleForFallbackErrors", "Ljava/util/List;", "getEligibleForFallbackErrors$video_player_internalRelease", "()Ljava/util/List;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LoadErrorHandlingPolicyImpl implements twy {
    public static final long DEFAULT_MAX_RETRY_DELAY_MS = 5000;
    public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT = 3;
    private final List<String> eligibleForFallbackErrors;
    private boolean expDoRetryForStreamResetException;
    private final long maxRetryDelayMs;
    private final int minLoadableRetryCount;
    public static final int $stable = 8;

    public LoadErrorHandlingPolicyImpl(long j, int i) {
        this.maxRetryDelayMs = j;
        this.minLoadableRetryCount = i;
        this.eligibleForFallbackErrors = scc.g("InvalidResponseCodeException", "SocketTimeoutException", "SocketConnectionResetException", "SSLException");
    }

    private final boolean isEligibleForFallbackResponseCode(int responseCode) {
        if (400 > responseCode || responseCode >= 500 || responseCode4xxForbiddenToFallbackOrRetry(responseCode)) {
            return 500 <= responseCode && responseCode < 600;
        }
        return true;
    }

    private final boolean isRootCauseExceptionType(IOException sourceException, Class<? extends Object> checkType) {
        int i = 0;
        for (IOException iOException = sourceException; i < 11 && iOException != null; iOException = iOException.getCause()) {
            if (checkType.isInstance(iOException)) {
                return true;
            }
            i++;
        }
        return false;
    }

    private final boolean responseCode4xxForbiddenToFallbackOrRetry(int responseCode) {
        return responseCode == 451 || responseCode == 401 || responseCode == 403 || responseCode == 416;
    }

    public final List<String> getEligibleForFallbackErrors$video_player_internalRelease() {
        return this.eligibleForFallbackErrors;
    }

    /* renamed from: getExpDoRetryForStreamResetException$video_player_internalRelease, reason: from getter */
    public final boolean getExpDoRetryForStreamResetException() {
        return this.expDoRetryForStreamResetException;
    }

    @Override // defpackage.twy
    public rwy getFallbackSelectionFor(qwy fallbackOptions, swy loadErrorInfo) {
        if (!isEligibleForFallback$video_player_internalRelease(loadErrorInfo.a)) {
            return null;
        }
        if (fallbackOptions.a(1)) {
            return new rwy(1, MapiClientImpl.RETRIES_TIME_MILLIS);
        }
        if (fallbackOptions.a(2)) {
            return new rwy(2, 60000L);
        }
        return null;
    }

    @Override // defpackage.twy
    public int getMinimumLoadableRetryCount(int dataType) {
        return this.minLoadableRetryCount;
    }

    @Override // defpackage.twy
    public long getRetryDelayMsFor(swy loadErrorInfo) {
        if (isEligibleForRetry$video_player_internalRelease(loadErrorInfo.a)) {
            return Math.min((loadErrorInfo.b - 1) * 1000, this.maxRetryDelayMs);
        }
        return -9223372036854775807L;
    }

    public final boolean isEligibleForFallback$video_player_internalRelease(IOException exception) {
        return ((exception instanceof HttpDataSource$InvalidResponseCodeException) && isEligibleForFallbackResponseCode(((HttpDataSource$InvalidResponseCodeException) exception).responseCode)) || isRootCauseExceptionType(exception, SocketTimeoutException.class) || isRootCauseExceptionType(exception, SocketException.class) || isRootCauseExceptionType(exception, SSLException.class);
    }

    public final boolean isEligibleForRetry$video_player_internalRelease(IOException exception) {
        if (exception instanceof HttpDataSource$InvalidResponseCodeException) {
            return !responseCode4xxForbiddenToFallbackOrRetry(((HttpDataSource$InvalidResponseCodeException) exception).responseCode);
        }
        if (exception instanceof FileNotFoundException ? true : exception instanceof Loader$UnexpectedLoaderException ? true : exception instanceof CacheDataSink$CacheDataSinkException) {
            return false;
        }
        if (exception instanceof ParserException) {
            return this.expDoRetryForStreamResetException && isRootCauseExceptionType(exception, StreamResetException.class);
        }
        if (!(exception instanceof DrmLoadException.ErrorDiagnostic)) {
            return true;
        }
        boolean isFatal = ((DrmLoadException.ErrorDiagnostic) exception).getIsFatal();
        if (isFatal) {
            return false;
        }
        if (!isFatal) {
            return true;
        }
        w511.b();
        return false;
    }

    @Override // defpackage.twy
    public /* bridge */ /* synthetic */ void onLoadTaskConcluded(long j) {
    }

    public final void setExpDoRetryForStreamResetException$video_player_internalRelease(boolean z) {
        this.expDoRetryForStreamResetException = z;
    }

    public LoadErrorHandlingPolicyImpl() {
        this(0L, 0, 3, null);
    }

    public /* synthetic */ LoadErrorHandlingPolicyImpl(long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 5000L : j, (i2 & 2) != 0 ? 3 : i);
    }
}
