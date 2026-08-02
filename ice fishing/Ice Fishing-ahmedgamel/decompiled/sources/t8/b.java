package t8;

import a.AbstractC0426a;
import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes2.dex */
public final class b extends AbstractC0426a {

    /* renamed from: b, reason: collision with root package name */
    public final X509TrustManager f40887b;

    /* renamed from: c, reason: collision with root package name */
    public final X509TrustManagerExtensions f40888c;

    public b(X509TrustManager trustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        kotlin.jvm.internal.h.e(trustManager, "trustManager");
        this.f40887b = trustManager;
        this.f40888c = x509TrustManagerExtensions;
    }

    @Override // a.AbstractC0426a
    public final List d(String hostname, List chain) {
        kotlin.jvm.internal.h.e(chain, "chain");
        kotlin.jvm.internal.h.e(hostname, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f40888c.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), "RSA", hostname);
            kotlin.jvm.internal.h.d(checkServerTrusted, "checkServerTrusted(...)");
            return checkServerTrusted;
        } catch (CertificateException e9) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e9.getMessage());
            sSLPeerUnverifiedException.initCause(e9);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f40887b == this.f40887b;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f40887b);
    }
}
