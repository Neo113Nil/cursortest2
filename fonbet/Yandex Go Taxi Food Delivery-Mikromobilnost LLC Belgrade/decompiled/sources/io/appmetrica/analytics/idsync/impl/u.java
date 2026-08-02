package io.appmetrica.analytics.idsync.impl;

import com.google.android.gms.gcm.Task;
import defpackage.uza;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.network.internal.NetworkClientBuilder;
import io.appmetrica.analytics.networkapi.NetworkClientSettings;
import io.appmetrica.analytics.networkapi.Request;
import io.appmetrica.analytics.networkapi.Response;

/* loaded from: classes4.dex */
public final class u {
    public final ServiceContext a;

    public u(ServiceContext serviceContext) {
        this.a = serviceContext;
    }

    public final boolean a(String str, String str2) {
        try {
            Response execute = new NetworkClientBuilder().withSettings(new NetworkClientSettings.Builder().withSslSocketFactory(this.a.getNetworkContext().getSslSocketFactoryProvider().getSslSocketFactory()).withUseCaches(false).withInstanceFollowRedirects(true).withMaxResponseSize(Task.EXTRAS_LIMIT_BYTES).build()).build().newCall(new Request.Builder(str).withMethod(Request.Method.POST).withBody(str2.getBytes(uza.a)).addHeader("Content-Type", "application/json").build()).execute();
            if (execute.getIsCompleted()) {
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
