package ru.yandex.video.m3.data.exception.network;

import android.net.DnsResolver;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import kotlin.Metadata;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;
import ru.yandex.video.m3.data.exception.network.NetworkRequestExceptionFactory;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/data/exception/network/NetworkRequestExceptionFactoryImpl;", "Lru/yandex/video/m3/data/exception/network/NetworkRequestExceptionFactory;", "()V", "create", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException;", "parameters", "Lru/yandex/video/m3/data/exception/network/NetworkRequestExceptionFactory$Parameters;", "isConnectionTimeoutExeption", "", "throwable", "", "isDnsException", "isSslException", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NetworkRequestExceptionFactoryImpl implements NetworkRequestExceptionFactory {
    public static final int $stable = 0;

    private final boolean isConnectionTimeoutExeption(Throwable throwable) {
        return throwable instanceof SocketTimeoutException;
    }

    private final boolean isDnsException(Throwable throwable) {
        return (throwable instanceof UnknownHostException) || (throwable instanceof DnsResolver.DnsException);
    }

    private final boolean isSslException(Throwable throwable) {
        return (throwable instanceof SSLHandshakeException) || (throwable instanceof SSLKeyException) || (throwable instanceof SSLProtocolException) || (throwable instanceof SSLPeerUnverifiedException) || (throwable instanceof SSLException);
    }

    @Override // ru.yandex.video.m3.data.exception.network.NetworkRequestExceptionFactory
    public NetworkRequestException create(NetworkRequestExceptionFactory.Parameters parameters) {
        if (parameters.getUnknown()) {
            return new NetworkRequestException.UnkwnownHttpError(parameters.getResponseCode(), parameters.getRequestUrl(), parameters.getResourceType(), parameters.getRequestId(), parameters.getMessage(), parameters.getCause());
        }
        Integer responseCode = parameters.getResponseCode();
        if (responseCode != null) {
            int intValue = responseCode.intValue();
            return intValue != 401 ? intValue != 416 ? intValue != 429 ? intValue != 451 ? intValue != 454 ? intValue != 403 ? intValue != 404 ? new NetworkRequestException.BadHttpStatus(responseCode, parameters.getRequestUrl(), parameters.getResourceType(), parameters.getRequestId(), parameters.getMessage(), parameters.getCause()) : new NetworkRequestException.ResourceNotFound(parameters.getRequestUrl(), parameters.getResourceType(), parameters.getRequestId(), parameters.getMessage(), parameters.getCause()) : new NetworkRequestException.InvalidSignature(parameters.getRequestUrl(), parameters.getResourceType(), parameters.getRequestId(), parameters.getMessage(), parameters.getCause()) : new NetworkRequestException.Banned(parameters.getRequestUrl(), parameters.getResourceType(), parameters.getRequestId(), parameters.getMessage(), parameters.getCause()) : new NetworkRequestException.RegionalRestriction(parameters.getRequestUrl(), parameters.getResourceType(), parameters.getRequestId(), parameters.getMessage(), parameters.getCause()) : new NetworkRequestException.TooManyRequests(parameters.getRequestUrl(), parameters.getResourceType(), parameters.getRequestId(), parameters.getMessage(), parameters.getCause()) : new NetworkRequestException.InvalidRange(parameters.getRequestUrl(), parameters.getResourceType(), parameters.getRequestId(), parameters.getMessage(), parameters.getCause()) : new NetworkRequestException.ExpiredSignature(parameters.getRequestUrl(), parameters.getResourceType(), parameters.getRequestId(), parameters.getMessage(), parameters.getCause());
        }
        if (parameters.getCause() == null) {
            return new NetworkRequestException.UnkwnownHttpError(parameters.getResponseCode(), parameters.getRequestUrl(), parameters.getResourceType(), parameters.getRequestId(), parameters.getMessage(), parameters.getCause());
        }
        Throwable cause = parameters.getCause();
        for (int i = 0; i < 10 && cause != null; i++) {
            if (isDnsException(cause)) {
                return new NetworkRequestException.HostNameNotResolved(parameters.getRequestUrl(), parameters.getResourceType(), parameters.getRequestId(), parameters.getMessage(), parameters.getCause());
            }
            if (isConnectionTimeoutExeption(cause)) {
                return new NetworkRequestException.ConnectionTimeout(parameters.getRequestUrl(), parameters.getResourceType(), parameters.getRequestId(), parameters.getMessage(), parameters.getCause());
            }
            if (isSslException(cause)) {
                return new NetworkRequestException.SslError(parameters.getRequestUrl(), parameters.getResourceType(), parameters.getRequestId(), parameters.getMessage(), parameters.getCause());
            }
            cause = cause.getCause();
        }
        return new NetworkRequestException.UnkwnownHttpError(parameters.getResponseCode(), parameters.getRequestUrl(), parameters.getResourceType(), parameters.getRequestId(), parameters.getMessage(), parameters.getCause());
    }
}
