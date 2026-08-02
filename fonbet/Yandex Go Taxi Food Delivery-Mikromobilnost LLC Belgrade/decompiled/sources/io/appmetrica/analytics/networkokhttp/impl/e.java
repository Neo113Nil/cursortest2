package io.appmetrica.analytics.networkokhttp.impl;

import defpackage.bg61;
import defpackage.evu0;
import defpackage.p8w;
import defpackage.scc;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemPropertiesHelper;
import io.appmetrica.analytics.networkapi.NetworkClientSettings;
import io.appmetrica.analytics.networkokhttp.internal.InterceptorSupplier;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;

/* loaded from: classes9.dex */
public abstract class e {
    public static OkHttpClient a(NetworkClientSettings networkClientSettings) {
        p8w p8wVar;
        OkHttpClient.a aVar = new OkHttpClient.a();
        aVar.f(scc.g(Protocol.HTTP_2, Protocol.HTTP_1_1));
        Integer readTimeout = networkClientSettings.getReadTimeout();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (readTimeout != null) {
            aVar.g(readTimeout.intValue(), timeUnit);
        }
        if (networkClientSettings.getConnectTimeout() != null) {
            aVar.b(r1.intValue(), timeUnit);
        }
        Long callTimeout = networkClientSettings.getCallTimeout();
        if (callTimeout != null) {
            aVar.x = bg61.b(callTimeout.longValue(), timeUnit);
        }
        Boolean instanceFollowRedirects = networkClientSettings.getInstanceFollowRedirects();
        if (instanceFollowRedirects != null) {
            aVar.i = instanceFollowRedirects.booleanValue();
        }
        try {
            String readSystemProperty = SystemPropertiesHelper.readSystemProperty("debug.yndx.iaa.okhttp.mock");
            InterceptorSupplier interceptorSupplier = evu0.J(readSystemProperty) ? null : (InterceptorSupplier) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(readSystemProperty, InterceptorSupplier.class);
            if (interceptorSupplier != null && (p8wVar = interceptorSupplier.get()) != null) {
                aVar.a(p8wVar);
            }
        } catch (Throwable unused) {
        }
        SSLSocketFactory sslSocketFactory = networkClientSettings.getSslSocketFactory();
        if (sslSocketFactory != null) {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                ArrayList arrayList = new ArrayList();
                for (TrustManager trustManager : trustManagers) {
                    if (trustManager instanceof X509TrustManager) {
                        arrayList.add(trustManager);
                    }
                }
                X509TrustManager x509TrustManager = (X509TrustManager) kotlin.collections.a.R(arrayList);
                if (x509TrustManager != null) {
                    aVar.h(sslSocketFactory, x509TrustManager);
                }
            } catch (Throwable unused2) {
            }
        }
        Boolean useCaches = networkClientSettings.getUseCaches();
        if (useCaches != null && !useCaches.booleanValue()) {
            aVar.l = null;
        }
        return new OkHttpClient(aVar);
    }
}
