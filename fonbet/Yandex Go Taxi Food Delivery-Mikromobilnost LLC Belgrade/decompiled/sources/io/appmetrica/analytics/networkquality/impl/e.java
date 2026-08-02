package io.appmetrica.analytics.networkquality.impl;

import defpackage.evu0;
import defpackage.jl40;
import defpackage.wls;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.networkapi.NetworkCallMetrics;
import io.appmetrica.analytics.networkapi.NetworkClientSettings;
import io.appmetrica.analytics.networkapi.Request;
import io.appmetrica.analytics.networkapi.Response;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.BindException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLException;
import kotlin.Result;

/* loaded from: classes9.dex */
public final class e {
    public final IExecutionPolicy a;
    public final TimeProvider b;
    public final wls c;

    public /* synthetic */ e(IExecutionPolicy iExecutionPolicy) {
        this(iExecutionPolicy, new SystemTimeProvider(), d.a);
    }

    public final a a(t tVar) {
        Object failure;
        NetworkCallMetrics metrics;
        String message;
        String message2;
        NetworkCallMetrics metrics2;
        String str = tVar.d;
        if (!this.a.canBeExecuted()) {
            return new a(this.b.currentTimeMillis(), 0L, "forbidden_by_execution_policy", 0, null, null, null);
        }
        NetworkClientSettings build = new NetworkClientSettings.Builder().withConnectTimeout(tVar.i * 1000).withCallTimeout(tVar.j, TimeUnit.SECONDS).withCollectMetrics(tVar.l).build();
        try {
            failure = Request.Method.valueOf(tVar.b.toUpperCase(Locale.ROOT));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Object obj = Request.Method.GET;
        if (failure instanceof Result.Failure) {
            failure = obj;
        }
        Request.Builder withMethod = new Request.Builder(tVar.a).withMethod((Request.Method) failure);
        for (Map.Entry entry : tVar.c.entrySet()) {
            withMethod.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        Request build2 = withMethod.build();
        long currentTimeMillis = this.b.currentTimeMillis();
        Response response = (Response) this.c.invoke(build, build2);
        long currentTimeMillis2 = this.b.currentTimeMillis() - currentTimeMillis;
        if (response.getIsCompleted()) {
            int code = response.getCode();
            List list = s.a;
            String str2 = (200 > code || code >= 300) ? "http_error" : "success";
            return new a(currentTimeMillis, currentTimeMillis2, str2, code, response.getUrl(), null, (!tVar.l || (tVar.m && str2.equals("success")) || (metrics2 = response.getMetrics()) == null) ? null : new c(metrics2.getDnsLookup(), metrics2.getTcpConnect(), metrics2.getTlsHandshake(), metrics2.getTimeToFirstByte(), metrics2.getResponse(), currentTimeMillis2, metrics2.getConnectionReused(), metrics2.getCom.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL java.lang.String()));
        }
        Throwable th2 = response.getIo.appmetrica.analytics.rtm.internal.Constants.KEY_EXCEPTION java.lang.String();
        String str3 = "network_error";
        if (th2 instanceof IOException) {
            NetworkCallMetrics metrics3 = response.getMetrics();
            boolean z = (metrics3 != null ? metrics3.getTcpConnect() : null) != null;
            List list2 = s.a;
            IOException iOException = (IOException) th2;
            if (iOException instanceof UnknownHostException) {
                str3 = "dns_failure";
            } else if (iOException instanceof SSLException) {
                str3 = "tls_failure";
            } else {
                boolean z2 = iOException instanceof ConnectException;
                if (z2 && (message2 = ((ConnectException) iOException).getMessage()) != null) {
                    List list3 = s.b;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            if (evu0.y(message2, (String) it.next(), true)) {
                                break;
                            }
                        }
                    }
                }
                if (!z2) {
                    if (iOException instanceof SocketException) {
                        SocketException socketException = (SocketException) iOException;
                        if (!(socketException instanceof PortUnreachableException) && !(socketException instanceof NoRouteToHostException) && !(socketException instanceof BindException) && (message = socketException.getMessage()) != null) {
                            List list4 = s.a;
                            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                                Iterator it2 = list4.iterator();
                                while (it2.hasNext()) {
                                    if (evu0.y(message, (String) it2.next(), true)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    if (!(iOException instanceof EOFException) && !(iOException.getCause() instanceof EOFException)) {
                        boolean z3 = iOException instanceof SocketTimeoutException;
                        if (!z3 || z) {
                            if (z3 || ((iOException instanceof InterruptedIOException) && jl40.l(iOException.getMessage(), "timeout"))) {
                                str3 = "attempt_timeout";
                            }
                        }
                        str3 = "connect_timeout";
                    }
                }
                str3 = "connection_failure";
            }
        }
        return new a(currentTimeMillis, currentTimeMillis2, str3, 0, null, th2 != null ? th2.getMessage() : null, (!tVar.l || (metrics = response.getMetrics()) == null) ? null : new c(metrics.getDnsLookup(), metrics.getTcpConnect(), metrics.getTlsHandshake(), metrics.getTimeToFirstByte(), metrics.getResponse(), currentTimeMillis2, metrics.getConnectionReused(), metrics.getCom.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL java.lang.String()));
    }

    public e(IExecutionPolicy iExecutionPolicy, TimeProvider timeProvider, wls wlsVar) {
        this.a = iExecutionPolicy;
        this.b = timeProvider;
        this.c = wlsVar;
    }
}
