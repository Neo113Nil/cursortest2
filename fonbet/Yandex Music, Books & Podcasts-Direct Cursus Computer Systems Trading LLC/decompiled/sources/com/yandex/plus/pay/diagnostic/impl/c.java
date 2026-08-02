package com.yandex.plus.pay.diagnostic.impl;

import android.util.MalformedJsonException;
import defpackage.ack;
import defpackage.bck;
import java.io.IOException;
import java.net.URI;
import javax.net.ssl.SSLException;
import org.json.JSONException;

/* loaded from: classes5.dex */
public final class c {
    public final bck a;

    public c(bck bckVar) {
        this.a = bckVar;
    }

    public final void a(URI uri, String str, String str2, String str3, Integer num, Throwable th) {
        uri.getClass();
        if (num == null && th == null) {
            return;
        }
        ack ackVar = num == null ? th != null ? th instanceof SSLException ? ack.Ssl : ((th instanceof JSONException) || (th instanceof MalformedJsonException)) ? ack.Parse : th instanceof IOException ? ack.Network : ack.Unknown : ack.Unknown : ack.Http;
        String host = uri.getHost();
        host.getClass();
        String path = uri.getPath();
        path.getClass();
        String str4 = str == null ? "no_value" : str;
        String num2 = num != null ? num.toString() : null;
        this.a.a(host, path, str4, ackVar, num2 == null ? "no_value" : num2, str3 == null ? "no_value" : str3, str2 == null ? "no_value" : str2);
    }
}
