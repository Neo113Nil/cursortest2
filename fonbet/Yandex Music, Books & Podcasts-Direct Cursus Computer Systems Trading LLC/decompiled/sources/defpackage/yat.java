package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public abstract class yat {
    public static final jyr a = btf.b(new x6s(27));

    public static final List a(X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str, String str2) {
        x509TrustManager.getClass();
        x509CertificateArr.getClass();
        str.getClass();
        str2.getClass();
        Method c = c(x509TrustManager);
        if (c == null) {
            x509TrustManager.checkServerTrusted(x509CertificateArr, str);
            return uz0.c(x509CertificateArr);
        }
        try {
            Object invoke = c.invoke(x509TrustManager, x509CertificateArr, str, str2);
            invoke.getClass();
            return (List) invoke;
        } catch (IllegalAccessException e) {
            throw new CertificateException("checkServerTrusted(host) failed", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            CertificateException certificateException = cause instanceof CertificateException ? (CertificateException) cause : null;
            if (certificateException != null) {
                throw certificateException;
            }
            throw new CertificateException("checkServerTrusted(host) failed", e2.getCause());
        }
    }

    public static final X509TrustManager b(KeyStore keyStore) {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            trustManagers.getClass();
            ArrayList arrayList = new ArrayList();
            for (TrustManager trustManager : trustManagers) {
                if (trustManager instanceof X509TrustManager) {
                    arrayList.add(trustManager);
                }
            }
            return (X509TrustManager) CollectionsKt.firstOrNull(arrayList);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static final Method c(X509TrustManager x509TrustManager) {
        x509TrustManager.getClass();
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }
}
