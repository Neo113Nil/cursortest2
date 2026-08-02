package ru.domesticroots.certificatetransparency.chaincleaner;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/domesticroots/certificatetransparency/chaincleaner/AndroidCertificateChainCleaner;", "Lru/domesticroots/certificatetransparency/chaincleaner/CertificateChainCleaner;", "extensions", "Landroid/net/http/X509TrustManagerExtensions;", "(Landroid/net/http/X509TrustManagerExtensions;)V", "clean", "", "Ljava/security/cert/X509Certificate;", "chain", "hostname", "", "Factory", "domesticroots-certificatetransparency-android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidCertificateChainCleaner implements CertificateChainCleaner {
    private final X509TrustManagerExtensions extensions;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lru/domesticroots/certificatetransparency/chaincleaner/AndroidCertificateChainCleaner$Factory;", "Lru/domesticroots/certificatetransparency/chaincleaner/CertificateChainCleanerFactory;", "()V", "get", "Lru/domesticroots/certificatetransparency/chaincleaner/AndroidCertificateChainCleaner;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "domesticroots-certificatetransparency-android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Factory implements CertificateChainCleanerFactory {
        @Override // ru.domesticroots.certificatetransparency.chaincleaner.CertificateChainCleanerFactory
        public AndroidCertificateChainCleaner get(X509TrustManager trustManager) {
            return new AndroidCertificateChainCleaner(new X509TrustManagerExtensions(trustManager));
        }
    }

    public AndroidCertificateChainCleaner(X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.extensions = x509TrustManagerExtensions;
    }

    @Override // ru.domesticroots.certificatetransparency.chaincleaner.CertificateChainCleaner
    public List<X509Certificate> clean(List<? extends X509Certificate> chain, String hostname) {
        return this.extensions.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), "RSA", hostname);
    }
}
