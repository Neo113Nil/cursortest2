package io.appmetrica.analytics.networkokhttp.impl;

import J1.p;
import J1.r;
import J1.s;
import J1.t;
import R1.n;
import i1.AbstractC0252i;
import i1.AbstractC0253j;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemPropertiesHelper;
import io.appmetrica.analytics.networkapi.NetworkClientSettings;
import io.appmetrica.analytics.networkokhttp.internal.InterceptorSupplier;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.i;
import z1.g;

/* loaded from: classes.dex */
public abstract class d {
    public static s a(NetworkClientSettings networkClientSettings) {
        p pVar;
        r rVar = new r();
        t tVar = t.HTTP_2;
        t tVar2 = t.HTTP_1_1;
        ArrayList T2 = AbstractC0252i.T(AbstractC0253j.B(tVar, tVar2));
        t tVar3 = t.H2_PRIOR_KNOWLEDGE;
        if (!T2.contains(tVar3) && !T2.contains(tVar2)) {
            throw new IllegalArgumentException(i.h(T2, "protocols must contain h2_prior_knowledge or http/1.1: ").toString());
        }
        if (T2.contains(tVar3) && T2.size() > 1) {
            throw new IllegalArgumentException(i.h(T2, "protocols containing h2_prior_knowledge cannot use other protocols: ").toString());
        }
        if (T2.contains(t.HTTP_1_0)) {
            throw new IllegalArgumentException(i.h(T2, "protocols must not contain http/1.0: ").toString());
        }
        if (T2.contains(null)) {
            throw new IllegalArgumentException("protocols must not contain null");
        }
        T2.remove(t.SPDY_3);
        T2.equals(rVar.f931q);
        List unmodifiableList = Collections.unmodifiableList(T2);
        i.d(unmodifiableList, "unmodifiableList(protocolsCopy)");
        rVar.f931q = unmodifiableList;
        Integer readTimeout = networkClientSettings.getReadTimeout();
        if (readTimeout != null) {
            long intValue = readTimeout.intValue();
            TimeUnit unit = TimeUnit.MILLISECONDS;
            i.e(unit, "unit");
            rVar.f935v = K1.b.b(intValue, unit);
        }
        Integer connectTimeout = networkClientSettings.getConnectTimeout();
        if (connectTimeout != null) {
            long intValue2 = connectTimeout.intValue();
            TimeUnit unit2 = TimeUnit.MILLISECONDS;
            i.e(unit2, "unit");
            rVar.f934u = K1.b.b(intValue2, unit2);
        }
        Boolean instanceFollowRedirects = networkClientSettings.getInstanceFollowRedirects();
        if (instanceFollowRedirects != null) {
            rVar.f922h = instanceFollowRedirects.booleanValue();
        }
        try {
            String readSystemProperty = SystemPropertiesHelper.readSystemProperty("debug.yndx.iaa.okhttp.mock");
            InterceptorSupplier interceptorSupplier = g.a0(readSystemProperty) ? null : (InterceptorSupplier) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(readSystemProperty, InterceptorSupplier.class);
            if (interceptorSupplier != null && (pVar = interceptorSupplier.get()) != null) {
                rVar.f917c.add(pVar);
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
                X509TrustManager x509TrustManager = (X509TrustManager) AbstractC0252i.H(arrayList);
                if (x509TrustManager != null) {
                    if (sslSocketFactory.equals(rVar.f928n)) {
                        x509TrustManager.equals(rVar.f929o);
                    }
                    rVar.f928n = sslSocketFactory;
                    n nVar = n.f1772a;
                    rVar.t = n.f1772a.b(x509TrustManager);
                    rVar.f929o = x509TrustManager;
                }
            } catch (Throwable unused2) {
            }
        }
        networkClientSettings.getUseCaches();
        return new s(rVar);
    }
}
