package s8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class c implements w8.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f40492a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f40493b;

    public c(X509TrustManager trustManager, Method method) {
        h.e(trustManager, "trustManager");
        this.f40492a = trustManager;
        this.f40493b = method;
    }

    @Override // w8.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.f40493b.invoke(this.f40492a, x509Certificate);
            h.c(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) invoke).getTrustedCert();
        } catch (IllegalAccessException e9) {
            throw new AssertionError("unable to get issues and signature", e9);
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
        return h.a(this.f40492a, cVar.f40492a) && h.a(this.f40493b, cVar.f40493b);
    }

    public final int hashCode() {
        return this.f40493b.hashCode() + (this.f40492a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f40492a + ", findByIssuerAndSignatureMethod=" + this.f40493b + ')';
    }
}
