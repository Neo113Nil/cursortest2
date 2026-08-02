package ru.domesticroots.webview;

import defpackage.tgz;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes9.dex */
public abstract class c {
    public static X509TrustManager a(X509TrustManager x509TrustManager, tgz tgzVar) {
        return new AiaCompletingExtendedTrustManager(x509TrustManager, tgzVar);
    }
}
