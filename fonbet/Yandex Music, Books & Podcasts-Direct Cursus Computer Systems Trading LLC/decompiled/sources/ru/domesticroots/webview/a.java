package ru.domesticroots.webview;

import androidx.annotation.NonNull;
import defpackage.osg;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes5.dex */
public abstract class a {
    @NonNull
    public static X509TrustManager a(@NonNull X509TrustManager x509TrustManager, @NonNull osg osgVar) {
        return new AiaCompletingExtendedTrustManager(x509TrustManager, osgVar);
    }
}
