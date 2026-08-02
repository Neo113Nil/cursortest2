package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes5.dex */
public final class iq implements X509TrustManager {
    public final /* synthetic */ List[] a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ kkp d;

    public iq(kkp kkpVar, List[] listArr, String str, String str2) {
        this.d = kkpVar;
        this.a = listArr;
        this.b = str;
        this.c = str2;
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        List list;
        String str2 = this.c;
        kkp kkpVar = this.d;
        X509TrustManager x509TrustManager = (X509TrustManager) kkpVar.b;
        Method method = (Method) kkpVar.d;
        String str3 = this.b;
        if (method == null) {
            x509TrustManager.checkServerTrusted(x509CertificateArr, str3);
            list = Arrays.asList(x509CertificateArr);
        } else {
            try {
                list = (List) method.invoke(x509TrustManager, x509CertificateArr, str3, str2);
            } catch (IllegalAccessException e) {
                throw new CertificateException("AIA host check failed", e);
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (!(cause instanceof CertificateException)) {
                    throw new CertificateException("AIA host check failed", cause);
                }
                throw ((CertificateException) cause);
            }
        }
        this.a[0] = list;
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return ((X509TrustManager) this.d.b).getAcceptedIssuers();
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
    }
}
