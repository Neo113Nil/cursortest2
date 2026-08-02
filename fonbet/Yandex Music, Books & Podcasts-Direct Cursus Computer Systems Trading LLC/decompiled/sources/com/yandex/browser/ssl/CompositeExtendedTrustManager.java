package com.yandex.browser.ssl;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.io0;
import defpackage.jbw;
import defpackage.jyr;
import defpackage.xq0;
import defpackage.yat;
import defpackage.z75;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002J5\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/browser/ssl/CompositeExtendedTrustManager;", "Ljavax/net/ssl/X509ExtendedTrustManager;", "Ljbw;", "", "Ljava/security/cert/X509Certificate;", "chain", "", "authType", "host", "", "checkServerTrusted", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "hostname1", "hostname2", "", "isSameTrustConfiguration", "(Ljava/lang/String;Ljava/lang/String;)Z", "lib"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class CompositeExtendedTrustManager extends X509ExtendedTrustManager implements jbw {
    public final List a;

    public CompositeExtendedTrustManager(List list) {
        list.getClass();
        this.a = list;
        if (list.isEmpty()) {
            xq0.x("delegates must not be empty");
            throw null;
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        Iterator it = this.a.iterator();
        CertificateException e = null;
        while (it.hasNext()) {
            try {
                ((X509TrustManager) it.next()).checkClientTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e2) {
                e = e2;
            }
        }
        if (e == null) {
            throw new CertificateException("No trust managers to check client certificate");
        }
    }

    @Keep
    @NotNull
    public final List<X509Certificate> checkServerTrusted(@NotNull X509Certificate[] chain, @NotNull String authType, @NotNull String host) throws CertificateException {
        chain.getClass();
        authType.getClass();
        host.getClass();
        Iterator it = this.a.iterator();
        CertificateException e = null;
        while (it.hasNext()) {
            try {
                return yat.a((X509TrustManager) it.next(), chain, authType, host);
            } catch (CertificateException e2) {
                e = e2;
            }
        }
        if (e != null) {
            throw e;
        }
        throw new CertificateException("No trust managers to check server certificate");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        List list = this.a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            X509Certificate[] acceptedIssuers = ((X509TrustManager) it.next()).getAcceptedIssuers();
            acceptedIssuers.getClass();
            List asList = Arrays.asList(acceptedIssuers);
            asList.getClass();
            z75.t(arrayList, asList);
        }
        return (X509Certificate[]) arrayList.toArray(new X509Certificate[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[LOOP:0: B:8:0x0017->B:19:?, LOOP_END, SYNTHETIC] */
    @Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isSameTrustConfiguration(String hostname1, String hostname2) {
        Method method;
        boolean booleanValue;
        List<X509TrustManager> list = this.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (X509TrustManager x509TrustManager : list) {
            jyr jyrVar = yat.a;
            x509TrustManager.getClass();
            try {
                method = x509TrustManager.getClass().getDeclaredMethod("isSameTrustConfiguration", String.class, String.class);
                method.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                method = null;
            }
            if (method != null) {
                try {
                    Object invoke = method.invoke(x509TrustManager, hostname1, hostname2);
                    invoke.getClass();
                    booleanValue = ((Boolean) invoke).booleanValue();
                } catch (Exception unused2) {
                }
                if (booleanValue) {
                    return false;
                }
            }
            booleanValue = true;
            if (booleanValue) {
            }
        }
        return true;
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        Iterator it = this.a.iterator();
        CertificateException e = null;
        while (it.hasNext()) {
            try {
                io0.a((X509TrustManager) it.next(), x509CertificateArr, str, socket);
                return;
            } catch (CertificateException e2) {
                e = e2;
            }
        }
        if (e == null) {
            throw new CertificateException("No trust managers to check client certificate");
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        Iterator it = this.a.iterator();
        CertificateException e = null;
        while (it.hasNext()) {
            try {
                io0.b((X509TrustManager) it.next(), x509CertificateArr, str, sSLEngine);
                return;
            } catch (CertificateException e2) {
                e = e2;
            }
        }
        if (e == null) {
            throw new CertificateException("No trust managers to check client certificate");
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        Iterator it = this.a.iterator();
        CertificateException e = null;
        while (it.hasNext()) {
            try {
                ((X509TrustManager) it.next()).checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e2) {
                e = e2;
            }
        }
        if (e == null) {
            throw new CertificateException("No trust managers to check server certificate");
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        Iterator it = this.a.iterator();
        CertificateException e = null;
        while (it.hasNext()) {
            try {
                io0.c((X509TrustManager) it.next(), x509CertificateArr, str, socket);
                return;
            } catch (CertificateException e2) {
                e = e2;
            }
        }
        if (e == null) {
            throw new CertificateException("No trust managers to check server certificate");
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        Iterator it = this.a.iterator();
        CertificateException e = null;
        while (it.hasNext()) {
            try {
                io0.d((X509TrustManager) it.next(), x509CertificateArr, str, sSLEngine);
                return;
            } catch (CertificateException e2) {
                e = e2;
            }
        }
        if (e == null) {
            throw new CertificateException("No trust managers to check server certificate");
        }
    }
}
