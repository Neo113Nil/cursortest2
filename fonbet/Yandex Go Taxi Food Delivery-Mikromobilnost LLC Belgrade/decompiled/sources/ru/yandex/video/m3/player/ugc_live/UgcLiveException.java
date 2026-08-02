package ru.yandex.video.m3.player.ugc_live;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.oyr;
import defpackage.unr0;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0005\b\t\n\u000b\fB\u001f\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/yandex/video/m3/player/ugc_live/UgcLiveException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "", Constants.KEY_MESSAGE, "", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "BroadcastIsCancelled", "ConnectionError", "UgcLiveStatusIsNull", "UnknownUgcLiveStatus", "XivaException", "Lru/yandex/video/m3/player/ugc_live/UgcLiveException$BroadcastIsCancelled;", "Lru/yandex/video/m3/player/ugc_live/UgcLiveException$ConnectionError;", "Lru/yandex/video/m3/player/ugc_live/UgcLiveException$UgcLiveStatusIsNull;", "Lru/yandex/video/m3/player/ugc_live/UgcLiveException$UnknownUgcLiveStatus;", "Lru/yandex/video/m3/player/ugc_live/UgcLiveException$XivaException;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class UgcLiveException extends Exception {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/ugc_live/UgcLiveException$BroadcastIsCancelled;", "Lru/yandex/video/m3/player/ugc_live/UgcLiveException;", Constants.KEY_MESSAGE, "", "(Ljava/lang/String;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class BroadcastIsCancelled extends UgcLiveException {
        public static final int $stable = 0;

        /* JADX WARN: Multi-variable type inference failed */
        public BroadcastIsCancelled(String str) {
            super(null, str, 1, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/ugc_live/UgcLiveException$ConnectionError;", "Lru/yandex/video/m3/player/ugc_live/UgcLiveException;", "cause", "", "(Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ConnectionError extends UgcLiveException {
        public static final int $stable = 0;

        /* JADX WARN: Multi-variable type inference failed */
        public ConnectionError(Throwable th) {
            super(th, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/ugc_live/UgcLiveException$UgcLiveStatusIsNull;", "Lru/yandex/video/m3/player/ugc_live/UgcLiveException;", Constants.KEY_MESSAGE, "", "(Ljava/lang/String;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UgcLiveStatusIsNull extends UgcLiveException {
        public static final int $stable = 0;

        /* JADX WARN: Multi-variable type inference failed */
        public UgcLiveStatusIsNull(String str) {
            super(null, str, 1, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/ugc_live/UgcLiveException$UnknownUgcLiveStatus;", "Lru/yandex/video/m3/player/ugc_live/UgcLiveException;", Constants.KEY_MESSAGE, "", "(Ljava/lang/String;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UnknownUgcLiveStatus extends UgcLiveException {
        public static final int $stable = 0;

        /* JADX WARN: Multi-variable type inference failed */
        public UnknownUgcLiveStatus(String str) {
            super(null, str, 1, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ UgcLiveException(Throwable th, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : th, (i & 2) != 0 ? null : str, null);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0007\b\t\n\u000b\f\r\u000eB\u001f\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006\u0082\u0001\b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lru/yandex/video/m3/player/ugc_live/UgcLiveException$XivaException;", "Lru/yandex/video/m3/player/ugc_live/UgcLiveException;", "cause", "", Constants.KEY_MESSAGE, "", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "AuthError", "ConnectionError", "InternalError", "JsonParseException", "OtherClosedError", "RequestError", "UnknownError", "WrongResponseError", "Lru/yandex/video/m3/player/ugc_live/UgcLiveException$XivaException$AuthError;", "Lru/yandex/video/m3/player/ugc_live/UgcLiveException$XivaException$ConnectionError;", "Lru/yandex/video/m3/player/ugc_live/UgcLiveException$XivaException$InternalError;", "Lru/yandex/video/m3/player/ugc_live/UgcLiveException$XivaException$JsonParseException;", "Lru/yandex/video/m3/player/ugc_live/UgcLiveException$XivaException$OtherClosedError;", "Lru/yandex/video/m3/player/ugc_live/UgcLiveException$XivaException$RequestError;", "Lru/yandex/video/m3/player/ugc_live/UgcLiveException$XivaException$UnknownError;", "Lru/yandex/video/m3/player/ugc_live/UgcLiveException$XivaException$WrongResponseError;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class XivaException extends UgcLiveException {
        public static final int $stable = 0;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/player/ugc_live/UgcLiveException$XivaException$AuthError;", "Lru/yandex/video/m3/player/ugc_live/UgcLiveException$XivaException;", AuthSdkActivity.RESPONSE_TYPE_CODE, "", CRLReasonCodeExtension.REASON, "", "(ILjava/lang/String;)V", "getCode", "()I", "getReason", "()Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class AuthError extends XivaException {
            public static final int $stable = 0;
            private final int code;
            private final String reason;

            /* JADX WARN: Multi-variable type inference failed */
            public AuthError(int i, String str) {
                super(null, oyr.k(i, "code=", " reason=", str), 1, 0 == true ? 1 : 0);
                this.code = i;
                this.reason = str;
            }

            public final int getCode() {
                return this.code;
            }

            public final String getReason() {
                return this.reason;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/ugc_live/UgcLiveException$XivaException$ConnectionError;", "Lru/yandex/video/m3/player/ugc_live/UgcLiveException$XivaException;", "cause", "", "(Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ConnectionError extends XivaException {
            public static final int $stable = 0;

            /* JADX WARN: Multi-variable type inference failed */
            public ConnectionError(Throwable th) {
                super(th, null, 2, 0 == true ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/player/ugc_live/UgcLiveException$XivaException$InternalError;", "Lru/yandex/video/m3/player/ugc_live/UgcLiveException$XivaException;", AuthSdkActivity.RESPONSE_TYPE_CODE, "", CRLReasonCodeExtension.REASON, "", "(ILjava/lang/String;)V", "getCode", "()I", "getReason", "()Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class InternalError extends XivaException {
            public static final int $stable = 0;
            private final int code;
            private final String reason;

            /* JADX WARN: Multi-variable type inference failed */
            public InternalError(int i, String str) {
                super(null, oyr.k(i, "code=", " reason=", str), 1, 0 == true ? 1 : 0);
                this.code = i;
                this.reason = str;
            }

            public final int getCode() {
                return this.code;
            }

            public final String getReason() {
                return this.reason;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/ugc_live/UgcLiveException$XivaException$JsonParseException;", "Lru/yandex/video/m3/player/ugc_live/UgcLiveException$XivaException;", "cause", "", "(Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class JsonParseException extends XivaException {
            public static final int $stable = 0;

            /* JADX WARN: Multi-variable type inference failed */
            public JsonParseException(Throwable th) {
                super(th, null, 2, 0 == true ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/player/ugc_live/UgcLiveException$XivaException$OtherClosedError;", "Lru/yandex/video/m3/player/ugc_live/UgcLiveException$XivaException;", AuthSdkActivity.RESPONSE_TYPE_CODE, "", CRLReasonCodeExtension.REASON, "", "isPingReceived", "", "(ILjava/lang/String;Z)V", "getCode", "()I", "getReason", "()Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class OtherClosedError extends XivaException {
            public static final int $stable = 0;
            private final int code;
            private final String reason;

            /* JADX WARN: Illegal instructions before constructor call */
            /* JADX WARN: Multi-variable type inference failed */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public OtherClosedError(int i, String str, boolean z) {
                super(null, r0.toString(), 1, 0 == true ? 1 : 0);
                StringBuilder v = unr0.v(i, "code=", " reason=", str, " isPingReceived=");
                v.append(z);
                this.code = i;
                this.reason = str;
            }

            public final int getCode() {
                return this.code;
            }

            public final String getReason() {
                return this.reason;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/player/ugc_live/UgcLiveException$XivaException$RequestError;", "Lru/yandex/video/m3/player/ugc_live/UgcLiveException$XivaException;", AuthSdkActivity.RESPONSE_TYPE_CODE, "", CRLReasonCodeExtension.REASON, "", "(ILjava/lang/String;)V", "getCode", "()I", "getReason", "()Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class RequestError extends XivaException {
            public static final int $stable = 0;
            private final int code;
            private final String reason;

            /* JADX WARN: Multi-variable type inference failed */
            public RequestError(int i, String str) {
                super(null, oyr.k(i, "code=", " reason=", str), 1, 0 == true ? 1 : 0);
                this.code = i;
                this.reason = str;
            }

            public final int getCode() {
                return this.code;
            }

            public final String getReason() {
                return this.reason;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/ugc_live/UgcLiveException$XivaException$UnknownError;", "Lru/yandex/video/m3/player/ugc_live/UgcLiveException$XivaException;", "cause", "", "(Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class UnknownError extends XivaException {
            public static final int $stable = 0;

            /* JADX WARN: Multi-variable type inference failed */
            public UnknownError(Throwable th) {
                super(th, null, 2, 0 == true ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/ugc_live/UgcLiveException$XivaException$WrongResponseError;", "Lru/yandex/video/m3/player/ugc_live/UgcLiveException$XivaException;", "cause", "", "(Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class WrongResponseError extends XivaException {
            public static final int $stable = 0;

            /* JADX WARN: Multi-variable type inference failed */
            public WrongResponseError(Throwable th) {
                super(th, null, 2, 0 == true ? 1 : 0);
            }
        }

        public /* synthetic */ XivaException(Throwable th, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th, (i & 2) != 0 ? null : str, null);
        }

        public /* synthetic */ XivaException(Throwable th, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(th, str);
        }

        private XivaException(Throwable th, String str) {
            super(th, str, null);
        }
    }

    public /* synthetic */ UgcLiveException(Throwable th, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, str);
    }

    private UgcLiveException(Throwable th, String str) {
        super(str == null ? th != null ? th.toString() : null : str, th);
    }
}
