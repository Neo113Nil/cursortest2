package com.yandex.plus.core.network.okhttp.error;

import com.yandex.plus.core.network.error.b;
import com.yandex.plus.core.network.error.d;
import com.yandex.plus.core.network.error.i;
import com.yandex.plus.core.network.error.j;
import com.yandex.plus.core.network.error.k;
import com.yandex.plus.core.network.error.l;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.concurrent.CancellationException;
import javax.net.ssl.SSLException;

/* loaded from: classes4.dex */
public final class a implements b {
    public final l a(k kVar, Throwable th) {
        th.getClass();
        kVar.getClass();
        return th instanceof l ? (l) th : ((th instanceof URISyntaxException) || (th instanceof MalformedURLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException) || (th instanceof SocketException) || (th instanceof ProtocolException) || (th instanceof SocketTimeoutException)) ? new l(j.a, th) : th instanceof SSLException ? new l(i.a, th) : ((th instanceof CancellationException) || (th instanceof InterruptedIOException)) ? new l(d.a, th) : th instanceof IOException ? new l(kVar, th) : new l(kVar, th);
    }
}
