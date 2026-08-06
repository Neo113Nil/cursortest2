package io.appmetrica.analytics.networktasks.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.network.internal.NetworkClientBuilder;
import io.appmetrica.analytics.networkapi.NetworkClientSettings;
import io.appmetrica.analytics.networkapi.Request;
import io.appmetrica.analytics.networkapi.Response;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class a {
    public static Response a(String str, String str2, SSLSocketFactory sSLSocketFactory) {
        Request.Builder withMethod = new Request.Builder(str2).withMethod(Request.Method.GET);
        if (!TextUtils.isEmpty(str)) {
            withMethod.addHeader("If-None-Match", str);
        }
        NetworkClientBuilder networkClientBuilder = new NetworkClientBuilder();
        NetworkClientSettings.Builder withSslSocketFactory = new NetworkClientSettings.Builder().withInstanceFollowRedirects(true).withSslSocketFactory(sSLSocketFactory);
        int i2 = b.f7459a;
        return networkClientBuilder.withSettings(withSslSocketFactory.withConnectTimeout(i2).withReadTimeout(i2).build()).build().newCall(withMethod.build()).execute();
    }
}
