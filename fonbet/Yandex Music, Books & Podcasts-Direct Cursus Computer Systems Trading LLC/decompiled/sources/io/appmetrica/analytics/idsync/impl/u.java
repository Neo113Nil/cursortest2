package io.appmetrica.analytics.idsync.impl;

import com.connectsdk.etc.helper.HttpMessage;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import io.appmetrica.analytics.network.internal.Response;
import kotlin.text.Charsets;

/* loaded from: classes5.dex */
public final class u {
    public final ServiceContext a;

    public u(ServiceContext serviceContext) {
        this.a = serviceContext;
    }

    public final boolean a(String str, String str2) {
        try {
            Response execute = new NetworkClient.Builder().withSslSocketFactory(this.a.getNetworkContext().getSslSocketFactoryProvider().getSslSocketFactory()).withUseCaches(false).withInstanceFollowRedirects(true).withMaxResponseSize(10240).build().newCall(new Request.Builder(str).post(str2.getBytes(Charsets.UTF_8)).addHeader(HttpMessage.CONTENT_TYPE_HEADER, "application/json").build()).execute();
            if (execute.isCompleted()) {
                if (execute.getCode() != 200) {
                    int code = execute.getCode();
                    if (400 > code || code >= 500) {
                    }
                }
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
