package ru.yandex.video.m3.ab.api;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0005\b\t\n\u000b\fB\u001d\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/yandex/video/m3/ab/api/AbConfigApiException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "cause", "", Constants.KEY_MESSAGE, "", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "AbConfigFetchException", "IncorrectUrlParameters", "ResponseExtractionApiException", "ResponseIsNotSuccessful", "UuidUnavailableApiException", "Lru/yandex/video/m3/ab/api/AbConfigApiException$AbConfigFetchException;", "Lru/yandex/video/m3/ab/api/AbConfigApiException$IncorrectUrlParameters;", "Lru/yandex/video/m3/ab/api/AbConfigApiException$ResponseExtractionApiException;", "Lru/yandex/video/m3/ab/api/AbConfigApiException$ResponseIsNotSuccessful;", "Lru/yandex/video/m3/ab/api/AbConfigApiException$UuidUnavailableApiException;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public abstract class AbConfigApiException extends RuntimeException {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/ab/api/AbConfigApiException$AbConfigFetchException;", "Lru/yandex/video/m3/ab/api/AbConfigApiException;", "cause", "", Constants.KEY_MESSAGE, "", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class AbConfigFetchException extends AbConfigApiException {
        public static final int $stable = 0;

        public AbConfigFetchException(Throwable th, String str) {
            super(th, str, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/ab/api/AbConfigApiException$IncorrectUrlParameters;", "Lru/yandex/video/m3/ab/api/AbConfigApiException;", "cause", "", Constants.KEY_MESSAGE, "", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class IncorrectUrlParameters extends AbConfigApiException {
        public static final int $stable = 0;

        public IncorrectUrlParameters(Throwable th, String str) {
            super(th, str, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/ab/api/AbConfigApiException$ResponseExtractionApiException;", "Lru/yandex/video/m3/ab/api/AbConfigApiException;", "cause", "", Constants.KEY_MESSAGE, "", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class ResponseExtractionApiException extends AbConfigApiException {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseExtractionApiException(Throwable th, @NotNull String str) {
            super(th, str, null);
            str.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/ab/api/AbConfigApiException$ResponseIsNotSuccessful;", "Lru/yandex/video/m3/ab/api/AbConfigApiException;", Constants.KEY_MESSAGE, "", "responseCode", "", "(Ljava/lang/String;I)V", "getResponseCode", "()I", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class ResponseIsNotSuccessful extends AbConfigApiException {
        public static final int $stable = 0;
        private final int responseCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ResponseIsNotSuccessful(@NotNull String str, int i) {
            super(null, str, 0 == true ? 1 : 0);
            str.getClass();
            this.responseCode = i;
        }

        public final int getResponseCode() {
            return this.responseCode;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/ab/api/AbConfigApiException$UuidUnavailableApiException;", "Lru/yandex/video/m3/ab/api/AbConfigApiException;", Constants.KEY_MESSAGE, "", "(Ljava/lang/String;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class UuidUnavailableApiException extends AbConfigApiException {
        public static final int $stable = 0;

        public UuidUnavailableApiException(String str) {
            super(new Throwable(), str, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AbConfigApiException(Throwable th, String str) {
        super(str, th);
        if (str == null) {
            str = th != null ? th.getMessage() : null;
            if (str == null) {
                str = String.valueOf(th);
            }
        }
    }

    public /* synthetic */ AbConfigApiException(Throwable th, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i & 2) != 0 ? null : str, null);
    }

    public /* synthetic */ AbConfigApiException(Throwable th, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, str);
    }
}
