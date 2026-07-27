package o8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class c implements s8.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f39734a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f39735b;

    public c(X509TrustManager trustManager, Method method) {
        h.e(trustManager, "trustManager");
        this.f39734a = trustManager;
        this.f39735b = method;
    }

    @Override // s8.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.f39735b.invoke(this.f39734a, x509Certificate);
            h.c(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) invoke).getTrustedCert();
        } catch (IllegalAccessException e6) {
            throw new AssertionError("unable to get issues and signature", e6);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return h.a(this.f39734a, cVar.f39734a) && h.a(this.f39735b, cVar.f39735b);
    }

    public final int hashCode() {
        return this.f39735b.hashCode() + (this.f39734a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f39734a + ", findByIssuerAndSignatureMethod=" + this.f39735b + ')';
    }
}
