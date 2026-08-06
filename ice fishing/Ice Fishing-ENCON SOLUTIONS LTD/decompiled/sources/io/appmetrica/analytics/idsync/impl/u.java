package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.network.internal.NetworkClientBuilder;
import io.appmetrica.analytics.networkapi.NetworkClientSettings;
import io.appmetrica.analytics.networkapi.Request;
import io.appmetrica.analytics.networkapi.Response;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceContext f4070a;

    public u(ServiceContext serviceContext) {
        this.f4070a = serviceContext;
    }

    public final boolean a(String str, String str2) {
        try {
            Response execute = new NetworkClientBuilder().withSettings(new NetworkClientSettings.Builder().withSslSocketFactory(this.f4070a.getNetworkContext().getSslSocketFactoryProvider().getSslSocketFactory()).withUseCaches(false).withInstanceFollowRedirects(true).withMaxResponseSize(10240).build()).build().newCall(new Request.Builder(str).withMethod(Request.Method.POST).withBody(str2.getBytes(z1.a.f8620a)).addHeader("Content-Type", "application/json").build()).execute();
            if (!execute.isCompleted()) {
                return false;
            }
            if (execute.getCode() != 200) {
                int code = execute.getCode();
                if (400 > code || code >= 500) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
