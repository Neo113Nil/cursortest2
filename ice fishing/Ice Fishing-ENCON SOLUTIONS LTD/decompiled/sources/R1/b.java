package R1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b implements V1.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f1743a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f1744b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f1743a = x509TrustManager;
        this.f1744b = method;
    }

    @Override // V1.d
    public final X509Certificate a(X509Certificate cert) {
        kotlin.jvm.internal.i.e(cert, "cert");
        try {
            Object invoke = this.f1744b.invoke(this.f1743a, cert);
            if (invoke != null) {
                return ((TrustAnchor) invoke).getTrustedCert();
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
        } catch (IllegalAccessException e2) {
            throw new AssertionError("unable to get issues and signature", e2);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.i.a(this.f1743a, bVar.f1743a) && kotlin.jvm.internal.i.a(this.f1744b, bVar.f1744b);
    }

    public final int hashCode() {
        return this.f1744b.hashCode() + (this.f1743a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f1743a + ", findByIssuerAndSignatureMethod=" + this.f1744b + ')';
    }
}
