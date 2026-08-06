package S1;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b extends R1.l {

    /* renamed from: i, reason: collision with root package name */
    public final X509TrustManager f1774i;

    /* renamed from: j, reason: collision with root package name */
    public final X509TrustManagerExtensions f1775j;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f1774i = x509TrustManager;
        this.f1775j = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f1774i == this.f1774i;
    }

    @Override // R1.l
    public final List f(String hostname, List chain) {
        kotlin.jvm.internal.i.e(chain, "chain");
        kotlin.jvm.internal.i.e(hostname, "hostname");
        Object[] array = chain.toArray(new X509Certificate[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        try {
            List<X509Certificate> checkServerTrusted = this.f1775j.checkServerTrusted((X509Certificate[]) array, "RSA", hostname);
            kotlin.jvm.internal.i.d(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f1774i);
    }
}
