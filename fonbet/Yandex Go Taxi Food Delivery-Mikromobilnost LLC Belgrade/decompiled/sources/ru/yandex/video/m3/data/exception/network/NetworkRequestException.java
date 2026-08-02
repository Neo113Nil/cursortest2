package ru.yandex.video.m3.data.exception.network;

import defpackage.i3y;
import defpackage.jwu;
import defpackage.kwu;
import defpackage.sls;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.a;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.video.m3.data.dto.JsonConverterImpl;
import ru.yandex.video.m3.player.utils.DataSpecUtilKt;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 %2\u00060\u0001j\u0002`\u0002:\u0011&'%()*+,-./012345BC\b\u0004\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012H\u0005¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001e\u0010\u0010R\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\u0082\u0001\u000f6789:;<=>?@ABCD¨\u0006E"}, d2 = {"Lru/yandex/video/m3/data/exception/network/NetworkRequestException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", Constants.INTENT_PARAM_RESPONSE_CODE, "", "requestUrl", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;", "resourceType", "requestId", io.appmetrica.analytics.rtm.internal.Constants.KEY_MESSAGE, "", "cause", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "getDetails$video_player_internalRelease", "()Ljava/lang/String;", "getDetails", "", "", "getMapDetails", "()Ljava/util/Map;", "Ljava/lang/Integer;", "getResponseCode", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getRequestUrl", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;", "getResourceType", "()Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;", "getRequestId", "Lru/yandex/video/m3/data/dto/JsonConverterImpl;", "jsonConverter$delegate", "Li3y;", "getJsonConverter", "()Lru/yandex/video/m3/data/dto/JsonConverterImpl;", "jsonConverter", "Companion", "BadHttpStatus", "Banned", "ConnectionClosed", "ConnectionFailed", "ConnectionTimeout", "ExpiredSignature", "FetchTimeout", "HostNameNotResolved", "InvalidRange", "InvalidSignature", "RegionalRestriction", "ResourceNotFound", "ResourceType", "SslError", "TooManyRequests", "UnkwnownHttpError", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException$BadHttpStatus;", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException$Banned;", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ConnectionClosed;", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ConnectionFailed;", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ConnectionTimeout;", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ExpiredSignature;", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException$FetchTimeout;", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException$HostNameNotResolved;", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException$InvalidRange;", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException$InvalidSignature;", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException$RegionalRestriction;", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceNotFound;", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException$SslError;", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException$TooManyRequests;", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException$UnkwnownHttpError;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class NetworkRequestException extends RuntimeException {
    public static final int BANNED = 454;
    public static final int EXPIRED_SIGNATURE = 401;
    private static final String HOST = "host";
    public static final int INVALID_RANGE = 416;
    public static final int INVALID_SIGNATURE = 403;
    private static final String LID = "lid";
    public static final int REGIONAL_RESTRICTION = 451;
    public static final int RESOURCE_NOT_FOUND = 404;
    public static final int TOO_MANY_REQUESTS = 429;

    /* renamed from: jsonConverter$delegate, reason: from kotlin metadata */
    private final i3y jsonConverter;
    private final String requestId;
    private final String requestUrl;
    private final ResourceType resourceType;
    private final Integer responseCode;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;", "", "(Ljava/lang/String;I)V", "MANIFEST", "SEGMENT", "CONTENT_ID", "UNKNOWN", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum ResourceType {
        MANIFEST,
        SEGMENT,
        CONTENT_ID,
        UNKNOWN
    }

    private NetworkRequestException(Integer num, String str, ResourceType resourceType, String str2, String str3, Throwable th) {
        super(str3, th);
        this.responseCode = num;
        this.requestUrl = str;
        this.resourceType = resourceType;
        this.requestId = str2;
        this.jsonConverter = a.a(new sls() { // from class: ru.yandex.video.m3.data.exception.network.NetworkRequestException$jsonConverter$2
            @Override // defpackage.sls
            public final JsonConverterImpl invoke() {
                return new JsonConverterImpl();
            }
        });
    }

    private final JsonConverterImpl getJsonConverter() {
        return (JsonConverterImpl) this.jsonConverter.getValue();
    }

    public final String getDetails$video_player_internalRelease() {
        Object failure;
        try {
            failure = getJsonConverter().to(getMapDetails());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        String str = (String) failure;
        return str == null ? "" : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<String, Object> getMapDetails() {
        kwu e;
        String str;
        String str2;
        MapBuilder mapBuilder = new MapBuilder();
        String str3 = this.requestUrl;
        String str4 = null;
        if (str3 != null) {
            try {
                jwu jwuVar = new jwu();
                jwuVar.i(null, str3);
                e = jwuVar.e();
            } catch (IllegalArgumentException unused) {
            }
            if (e != null && (str2 = e.d) != null) {
                str4 = str2;
            }
            mapBuilder.put("host", str4);
            str = this.requestUrl;
            if (str != null) {
                mapBuilder.put(LID, DataSpecUtilKt.getLidFromStringUrl(str));
            }
            return mapBuilder.j();
        }
        e = null;
        if (e != null) {
            str4 = str2;
        }
        mapBuilder.put("host", str4);
        str = this.requestUrl;
        if (str != null) {
        }
        return mapBuilder.j();
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getRequestUrl() {
        return this.requestUrl;
    }

    public final ResourceType getResourceType() {
        return this.resourceType;
    }

    public final Integer getResponseCode() {
        return this.responseCode;
    }

    public /* synthetic */ NetworkRequestException(Integer num, String str, ResourceType resourceType, String str2, String str3, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, resourceType, str2, str3, th);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/data/exception/network/NetworkRequestException$Banned;", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException;", "requestUrl", "", "resourceType", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;", "requestId", "throwableMessage", "cause", "", "(Ljava/lang/String;Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Banned extends NetworkRequestException {
        public static final int $stable = 0;

        public /* synthetic */ Banned(String str, ResourceType resourceType, String str2, String str3, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, resourceType, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : th);
        }

        public Banned(String str, ResourceType resourceType, String str2, String str3, Throwable th) {
            super(Integer.valueOf(NetworkRequestException.BANNED), str, resourceType, str2, str3, th, null);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ConnectionClosed;", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException;", "requestUrl", "", "resourceType", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;", "requestId", "throwableMessage", "cause", "", "(Ljava/lang/String;Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ConnectionClosed extends NetworkRequestException {
        public static final int $stable = 0;

        public /* synthetic */ ConnectionClosed(String str, ResourceType resourceType, String str2, String str3, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, resourceType, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : th);
        }

        public ConnectionClosed(String str, ResourceType resourceType, String str2, String str3, Throwable th) {
            super(null, str, resourceType, str2, str3, th, null);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ConnectionFailed;", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException;", "requestUrl", "", "resourceType", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;", "requestId", "throwableMessage", "cause", "", "(Ljava/lang/String;Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ConnectionFailed extends NetworkRequestException {
        public static final int $stable = 0;

        public /* synthetic */ ConnectionFailed(String str, ResourceType resourceType, String str2, String str3, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, resourceType, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : th);
        }

        public ConnectionFailed(String str, ResourceType resourceType, String str2, String str3, Throwable th) {
            super(null, str, resourceType, str2, str3, th, null);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ConnectionTimeout;", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException;", "requestUrl", "", "resourceType", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;", "requestId", "throwableMessage", "cause", "", "(Ljava/lang/String;Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ConnectionTimeout extends NetworkRequestException {
        public static final int $stable = 0;

        public /* synthetic */ ConnectionTimeout(String str, ResourceType resourceType, String str2, String str3, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, resourceType, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : th);
        }

        public ConnectionTimeout(String str, ResourceType resourceType, String str2, String str3, Throwable th) {
            super(null, str, resourceType, str2, str3, th, null);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ExpiredSignature;", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException;", "requestUrl", "", "resourceType", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;", "requestId", "throwableMessage", "cause", "", "(Ljava/lang/String;Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ExpiredSignature extends NetworkRequestException {
        public static final int $stable = 0;

        public /* synthetic */ ExpiredSignature(String str, ResourceType resourceType, String str2, String str3, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, resourceType, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : th);
        }

        public ExpiredSignature(String str, ResourceType resourceType, String str2, String str3, Throwable th) {
            super(401, str, resourceType, str2, str3, th, null);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/data/exception/network/NetworkRequestException$FetchTimeout;", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException;", "requestUrl", "", "resourceType", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;", "requestId", "throwableMessage", "cause", "", "(Ljava/lang/String;Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FetchTimeout extends NetworkRequestException {
        public static final int $stable = 0;

        public /* synthetic */ FetchTimeout(String str, ResourceType resourceType, String str2, String str3, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, resourceType, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : th);
        }

        public FetchTimeout(String str, ResourceType resourceType, String str2, String str3, Throwable th) {
            super(null, str, resourceType, str2, str3, th, null);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/data/exception/network/NetworkRequestException$HostNameNotResolved;", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException;", "requestUrl", "", "resourceType", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;", "requestId", "throwableMessage", "cause", "", "(Ljava/lang/String;Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class HostNameNotResolved extends NetworkRequestException {
        public static final int $stable = 0;

        public /* synthetic */ HostNameNotResolved(String str, ResourceType resourceType, String str2, String str3, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, resourceType, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : th);
        }

        public HostNameNotResolved(String str, ResourceType resourceType, String str2, String str3, Throwable th) {
            super(null, str, resourceType, str2, str3, th, null);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/data/exception/network/NetworkRequestException$InvalidRange;", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException;", "requestUrl", "", "resourceType", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;", "requestId", "throwableMessage", "cause", "", "(Ljava/lang/String;Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class InvalidRange extends NetworkRequestException {
        public static final int $stable = 0;

        public /* synthetic */ InvalidRange(String str, ResourceType resourceType, String str2, String str3, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, resourceType, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : th);
        }

        public InvalidRange(String str, ResourceType resourceType, String str2, String str3, Throwable th) {
            super(Integer.valueOf(NetworkRequestException.INVALID_RANGE), str, resourceType, str2, str3, th, null);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/data/exception/network/NetworkRequestException$InvalidSignature;", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException;", "requestUrl", "", "resourceType", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;", "requestId", "throwableMessage", "cause", "", "(Ljava/lang/String;Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class InvalidSignature extends NetworkRequestException {
        public static final int $stable = 0;

        public /* synthetic */ InvalidSignature(String str, ResourceType resourceType, String str2, String str3, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, resourceType, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : th);
        }

        public InvalidSignature(String str, ResourceType resourceType, String str2, String str3, Throwable th) {
            super(403, str, resourceType, str2, str3, th, null);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/data/exception/network/NetworkRequestException$RegionalRestriction;", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException;", "requestUrl", "", "resourceType", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;", "requestId", "throwableMessage", "cause", "", "(Ljava/lang/String;Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RegionalRestriction extends NetworkRequestException {
        public static final int $stable = 0;

        public /* synthetic */ RegionalRestriction(String str, ResourceType resourceType, String str2, String str3, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, resourceType, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : th);
        }

        public RegionalRestriction(String str, ResourceType resourceType, String str2, String str3, Throwable th) {
            super(Integer.valueOf(NetworkRequestException.REGIONAL_RESTRICTION), str, resourceType, str2, str3, th, null);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceNotFound;", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException;", "requestUrl", "", "resourceType", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;", "requestId", "throwableMessage", "cause", "", "(Ljava/lang/String;Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ResourceNotFound extends NetworkRequestException {
        public static final int $stable = 0;

        public /* synthetic */ ResourceNotFound(String str, ResourceType resourceType, String str2, String str3, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, resourceType, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : th);
        }

        public ResourceNotFound(String str, ResourceType resourceType, String str2, String str3, Throwable th) {
            super(404, str, resourceType, str2, str3, th, null);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/data/exception/network/NetworkRequestException$SslError;", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException;", "requestUrl", "", "resourceType", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;", "requestId", "throwableMessage", "cause", "", "(Ljava/lang/String;Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SslError extends NetworkRequestException {
        public static final int $stable = 0;

        public /* synthetic */ SslError(String str, ResourceType resourceType, String str2, String str3, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, resourceType, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : th);
        }

        public SslError(String str, ResourceType resourceType, String str2, String str3, Throwable th) {
            super(null, str, resourceType, str2, str3, th, null);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/data/exception/network/NetworkRequestException$TooManyRequests;", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException;", "requestUrl", "", "resourceType", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;", "requestId", "throwableMessage", "cause", "", "(Ljava/lang/String;Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TooManyRequests extends NetworkRequestException {
        public static final int $stable = 0;

        public /* synthetic */ TooManyRequests(String str, ResourceType resourceType, String str2, String str3, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, resourceType, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : th);
        }

        public TooManyRequests(String str, ResourceType resourceType, String str2, String str3, Throwable th) {
            super(Integer.valueOf(NetworkRequestException.TOO_MANY_REQUESTS), str, resourceType, str2, str3, th, null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/data/exception/network/NetworkRequestException$BadHttpStatus;", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException;", "badResponseCode", "", "requestUrl", "", "resourceType", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;", "requestId", "throwableMessage", "cause", "", "(Ljava/lang/Integer;Ljava/lang/String;Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class BadHttpStatus extends NetworkRequestException {
        public static final int $stable = 0;

        public /* synthetic */ BadHttpStatus(Integer num, String str, ResourceType resourceType, String str2, String str3, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, resourceType, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : th);
        }

        public BadHttpStatus(Integer num, String str, ResourceType resourceType, String str2, String str3, Throwable th) {
            super(num, str, resourceType, str2, str3, th, null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/data/exception/network/NetworkRequestException$UnkwnownHttpError;", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException;", Constants.INTENT_PARAM_RESPONSE_CODE, "", "requestUrl", "", "resourceType", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;", "requestId", "throwableMessage", "cause", "", "(Ljava/lang/Integer;Ljava/lang/String;Lru/yandex/video/m3/data/exception/network/NetworkRequestException$ResourceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UnkwnownHttpError extends NetworkRequestException {
        public static final int $stable = 0;

        public /* synthetic */ UnkwnownHttpError(Integer num, String str, ResourceType resourceType, String str2, String str3, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, resourceType, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : th);
        }

        public UnkwnownHttpError(Integer num, String str, ResourceType resourceType, String str2, String str3, Throwable th) {
            super(num, str, resourceType, str2, str3, th, null);
        }
    }
}
