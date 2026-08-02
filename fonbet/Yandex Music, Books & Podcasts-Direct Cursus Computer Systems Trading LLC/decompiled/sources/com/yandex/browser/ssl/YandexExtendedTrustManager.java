package com.yandex.browser.ssl;

import android.util.Log;
import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.c5b;
import defpackage.cr;
import defpackage.io0;
import defpackage.jbw;
import defpackage.jyr;
import defpackage.vw6;
import defpackage.yat;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002J5\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/browser/ssl/YandexExtendedTrustManager;", "Ljavax/net/ssl/X509ExtendedTrustManager;", "Ljbw;", "", "Ljava/security/cert/X509Certificate;", "chain", "", "authType", "host", "", "checkServerTrusted", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "hostname1", "hostname2", "", "isSameTrustConfiguration", "(Ljava/lang/String;Ljava/lang/String;)Z", "lib"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class YandexExtendedTrustManager extends X509ExtendedTrustManager implements jbw {
    public final cr a;

    public YandexExtendedTrustManager(vw6 vw6Var) {
        vw6Var.getClass();
        this.a = new cr(vw6Var);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        cr crVar = this.a;
        crVar.getClass();
        jyr jyrVar = yat.a;
        io0.a(crVar.I(), x509CertificateArr, str, socket);
    }

    @Keep
    @NotNull
    public final List<X509Certificate> checkServerTrusted(@NotNull X509Certificate[] chain, @NotNull String authType, @NotNull String host) throws CertificateException {
        chain.getClass();
        authType.getClass();
        host.getClass();
        cr crVar = this.a;
        crVar.getClass();
        try {
            Method method = (Method) ((jyr) crVar.e).getValue();
            Object invoke = method != null ? method.invoke(chain, authType, host) : null;
            List<X509Certificate> list = invoke instanceof List ? (List) invoke : null;
            return list == null ? c5b.a : list;
        } catch (CertificateException unused) {
            synchronized (crVar.h) {
                try {
                    crVar.C();
                    crVar.D();
                    Method method2 = (Method) crVar.g;
                    Object invoke2 = method2 != null ? method2.invoke(chain, authType, host) : null;
                    List<X509Certificate> list2 = invoke2 instanceof List ? (List) invoke2 : null;
                    return list2 == null ? c5b.a : list2;
                } catch (Exception e) {
                    throw new CertificateException("Unable to verify certificate chain", e);
                } finally {
                }
            }
        } catch (Exception e2) {
            throw new CertificateException("Unable to verify certificate chain", e2);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        X509Certificate[] acceptedIssuers = this.a.I().getAcceptedIssuers();
        acceptedIssuers.getClass();
        return acceptedIssuers;
    }

    @Keep
    public final boolean isSameTrustConfiguration(String hostname1, String hostname2) {
        cr crVar = this.a;
        crVar.getClass();
        try {
            Method method = (Method) ((jyr) crVar.f).getValue();
            Object invoke = method != null ? method.invoke(hostname1, hostname2) : null;
            Boolean bool = invoke instanceof Boolean ? (Boolean) invoke : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        cr crVar = this.a;
        crVar.getClass();
        jyr jyrVar = yat.a;
        io0.b(crVar.I(), x509CertificateArr, str, sSLEngine);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.a.I().checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        cr crVar = this.a;
        crVar.getClass();
        try {
            X509TrustManager I = crVar.I();
            jyr jyrVar = yat.a;
            io0.c(I, x509CertificateArr, str, socket);
        } catch (CertificateException e) {
            synchronized (crVar.h) {
                crVar.C();
                crVar.D();
                X509TrustManager x509TrustManager = (X509TrustManager) crVar.d;
                if (x509TrustManager != null) {
                    jyr jyrVar2 = yat.a;
                    io0.c(x509TrustManager, x509CertificateArr, str, socket);
                } else {
                    Log.w("YandexTrustManager", "Custom TrustManager is null");
                    throw e;
                }
            }
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        cr crVar = this.a;
        crVar.getClass();
        try {
            X509TrustManager I = crVar.I();
            jyr jyrVar = yat.a;
            io0.d(I, x509CertificateArr, str, sSLEngine);
        } catch (CertificateException e) {
            synchronized (crVar.h) {
                crVar.C();
                crVar.D();
                X509TrustManager x509TrustManager = (X509TrustManager) crVar.d;
                if (x509TrustManager != null) {
                    jyr jyrVar2 = yat.a;
                    io0.d(x509TrustManager, x509CertificateArr, str, sSLEngine);
                } else {
                    Log.w("YandexTrustManager", "Custom TrustManager is null");
                    throw e;
                }
            }
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        cr crVar = this.a;
        crVar.getClass();
        try {
            crVar.I().checkServerTrusted(x509CertificateArr, str);
        } catch (CertificateException e) {
            synchronized (crVar.h) {
                crVar.C();
                crVar.D();
                X509TrustManager x509TrustManager = (X509TrustManager) crVar.d;
                if (x509TrustManager != null) {
                    x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                } else {
                    Log.w("YandexTrustManager", "Custom TrustManager is null");
                    throw e;
                }
            }
        }
    }
}
