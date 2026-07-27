package t8;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes2.dex */
public final class b extends com.bumptech.glide.e {
    public final X509TrustManager i;

    /* renamed from: j, reason: collision with root package name */
    public final X509TrustManagerExtensions f40922j;

    public b(X509TrustManager trustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        kotlin.jvm.internal.h.e(trustManager, "trustManager");
        this.i = trustManager;
        this.f40922j = x509TrustManagerExtensions;
    }

    @Override // com.bumptech.glide.e
    public final List a(String hostname, List chain) {
        kotlin.jvm.internal.h.e(chain, "chain");
        kotlin.jvm.internal.h.e(hostname, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f40922j.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), "RSA", hostname);
            kotlin.jvm.internal.h.d(checkServerTrusted, "checkServerTrusted(...)");
            return checkServerTrusted;
        } catch (CertificateException e9) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e9.getMessage());
            sSLPeerUnverifiedException.initCause(e9);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).i == this.i;
    }

    public final int hashCode() {
        return System.identityHashCode(this.i);
    }
}
