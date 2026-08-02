package ru.yandex.video.m3.data.exception.network;

import android.net.DnsResolver;
import defpackage.k1j;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

/* loaded from: classes6.dex */
public final class e implements k1j {
    public final NetworkRequestException a(d dVar) {
        boolean z = dVar.g;
        Integer num = dVar.a;
        if (z) {
            return new NetworkRequestException.UnkwnownHttpError(num, dVar.b, dVar.d, dVar.c, dVar.e, dVar.f);
        }
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 401) {
                return new NetworkRequestException.ExpiredSignature(dVar.b, dVar.d, dVar.c, dVar.e, dVar.f);
            }
            if (intValue == 416) {
                return new NetworkRequestException.InvalidRange(dVar.b, dVar.d, dVar.c, dVar.e, dVar.f);
            }
            if (intValue == 429) {
                return new NetworkRequestException.TooManyRequests(dVar.b, dVar.d, dVar.c, dVar.e, dVar.f);
            }
            if (intValue == 451) {
                return new NetworkRequestException.RegionalRestriction(dVar.b, dVar.d, dVar.c, dVar.e, dVar.f);
            }
            if (intValue == 454) {
                return new NetworkRequestException.Banned(dVar.b, dVar.d, dVar.c, dVar.e, dVar.f);
            }
            if (intValue == 403) {
                return new NetworkRequestException.InvalidSignature(dVar.b, dVar.d, dVar.c, dVar.e, dVar.f);
            }
            String str = dVar.b;
            return intValue != 404 ? new NetworkRequestException.BadHttpStatus(num, str, dVar.d, dVar.c, dVar.e, dVar.f) : new NetworkRequestException.ResourceNotFound(str, dVar.d, dVar.c, dVar.e, dVar.f);
        }
        Throwable th = dVar.f;
        if (th == null) {
            return new NetworkRequestException.UnkwnownHttpError(num, dVar.b, dVar.d, dVar.c, dVar.e, th);
        }
        for (int i = 0; i < 10; i++) {
            if (th == null) {
                return new NetworkRequestException.UnkwnownHttpError(dVar.a, dVar.b, dVar.d, dVar.c, dVar.e, dVar.f);
            }
            if ((th instanceof UnknownHostException) || (th instanceof DnsResolver.DnsException)) {
                return new NetworkRequestException.HostNameNotResolved(dVar.b, dVar.d, dVar.c, dVar.e, dVar.f);
            }
            if (th instanceof SocketTimeoutException) {
                return new NetworkRequestException.ConnectionTimeout(dVar.b, dVar.d, dVar.c, dVar.e, dVar.f);
            }
            if ((th instanceof SSLHandshakeException) || (th instanceof SSLKeyException) || (th instanceof SSLProtocolException) || (th instanceof SSLPeerUnverifiedException) || (th instanceof SSLException)) {
                return new NetworkRequestException.SslError(dVar.b, dVar.d, dVar.c, dVar.e, dVar.f);
            }
            th = th.getCause();
        }
        return new NetworkRequestException.UnkwnownHttpError(dVar.a, dVar.b, dVar.d, dVar.c, dVar.e, dVar.f);
    }
}
