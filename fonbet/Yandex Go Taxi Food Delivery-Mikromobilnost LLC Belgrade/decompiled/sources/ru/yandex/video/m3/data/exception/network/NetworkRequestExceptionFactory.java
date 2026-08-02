package ru.yandex.video.m3.data.exception.network;

import android.net.Uri;
import defpackage.tw21;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/data/exception/network/NetworkRequestExceptionFactory;", "", "create", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException;", "parameters", "Lru/yandex/video/m3/data/exception/network/NetworkRequestExceptionFactory$Parameters;", "Parameters", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface NetworkRequestExceptionFactory {
    NetworkRequestException create(Parameters parameters);

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cBI\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/yandex/video/m3/data/exception/network/NetworkRequestExceptionFactory$Parameters;", "", Constants.INTENT_PARAM_RESPONSE_CODE, "", "requestUrl", "", "requestId", "resourceType", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;", io.appmetrica.analytics.rtm.internal.Constants.KEY_MESSAGE, "cause", "", "unknown", "", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;Ljava/lang/String;Ljava/lang/Throwable;Z)V", "getCause", "()Ljava/lang/Throwable;", "getMessage", "()Ljava/lang/String;", "getRequestId", "getRequestUrl", "getResourceType", "()Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;", "getResponseCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUnknown", "()Z", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Parameters {
        public static final int $stable = 8;
        private final Throwable cause;
        private final String message;
        private final String requestId;
        private final String requestUrl;
        private final NetworkRequestException.ResourceType resourceType;
        private final Integer responseCode;
        private final boolean unknown;

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\r\u0010(\u001a\u00020)H\u0000¢\u0006\u0002\b*J\u0012\u0010+\u001a\u00020\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\u00020#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006,"}, d2 = {"Lru/yandex/video/m3/data/exception/network/NetworkRequestExceptionFactory$Parameters$Builder;", "", "()V", "cause", "", "getCause", "()Ljava/lang/Throwable;", "setCause", "(Ljava/lang/Throwable;)V", io.appmetrica.analytics.rtm.internal.Constants.KEY_MESSAGE, "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "requestId", "getRequestId", "setRequestId", "requestUrl", "getRequestUrl", "setRequestUrl", "resourceType", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;", "getResourceType", "()Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;", "setResourceType", "(Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;)V", Constants.INTENT_PARAM_RESPONSE_CODE, "", "getResponseCode", "()Ljava/lang/Integer;", "setResponseCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "unknown", "", "getUnknown", "()Z", "setUnknown", "(Z)V", "build", "Lru/yandex/video/m3/data/exception/network/NetworkRequestExceptionFactory$Parameters;", "build$video_player_internalRelease", "tryResolveResourceTypeByUrl", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Builder {
            public static final int $stable = 8;
            private Throwable cause;
            private String message;
            private String requestId;
            private String requestUrl;
            private NetworkRequestException.ResourceType resourceType = NetworkRequestException.ResourceType.UNKNOWN;
            private Integer responseCode;
            private boolean unknown;

            private final NetworkRequestException.ResourceType tryResolveResourceTypeByUrl(String requestUrl) {
                if (requestUrl == null) {
                    return NetworkRequestException.ResourceType.UNKNOWN;
                }
                int N = tw21.N(Uri.parse(requestUrl));
                return (N == 0 || N == 2) ? NetworkRequestException.ResourceType.MANIFEST : N != 4 ? NetworkRequestException.ResourceType.UNKNOWN : NetworkRequestException.ResourceType.SEGMENT;
            }

            public final Parameters build$video_player_internalRelease() {
                if (this.resourceType == NetworkRequestException.ResourceType.UNKNOWN) {
                    this.resourceType = tryResolveResourceTypeByUrl(this.requestUrl);
                }
                return new Parameters(this.responseCode, this.requestUrl, this.requestId, this.resourceType, this.message, this.cause, this.unknown, null);
            }

            public final Throwable getCause() {
                return this.cause;
            }

            public final String getMessage() {
                return this.message;
            }

            public final String getRequestId() {
                return this.requestId;
            }

            public final String getRequestUrl() {
                return this.requestUrl;
            }

            public final NetworkRequestException.ResourceType getResourceType() {
                return this.resourceType;
            }

            public final Integer getResponseCode() {
                return this.responseCode;
            }

            public final boolean getUnknown() {
                return this.unknown;
            }

            public final void setCause(Throwable th) {
                this.cause = th;
            }

            public final void setMessage(String str) {
                this.message = str;
            }

            public final void setRequestId(String str) {
                this.requestId = str;
            }

            public final void setRequestUrl(String str) {
                this.requestUrl = str;
            }

            public final void setResourceType(NetworkRequestException.ResourceType resourceType) {
                this.resourceType = resourceType;
            }

            public final void setResponseCode(Integer num) {
                this.responseCode = num;
            }

            public final void setUnknown(boolean z) {
                this.unknown = z;
            }
        }

        private Parameters(Integer num, String str, String str2, NetworkRequestException.ResourceType resourceType, String str3, Throwable th, boolean z) {
            this.responseCode = num;
            this.requestUrl = str;
            this.requestId = str2;
            this.resourceType = resourceType;
            this.message = str3;
            this.cause = th;
            this.unknown = z;
        }

        public final Throwable getCause() {
            return this.cause;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getRequestId() {
            return this.requestId;
        }

        public final String getRequestUrl() {
            return this.requestUrl;
        }

        public final NetworkRequestException.ResourceType getResourceType() {
            return this.resourceType;
        }

        public final Integer getResponseCode() {
            return this.responseCode;
        }

        public final boolean getUnknown() {
            return this.unknown;
        }

        public /* synthetic */ Parameters(Integer num, String str, String str2, NetworkRequestException.ResourceType resourceType, String str3, Throwable th, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, str, str2, resourceType, str3, th, z);
        }
    }
}
