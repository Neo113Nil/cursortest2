package i8;

import com.google.android.gms.internal.ads.Wv;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import w.AbstractC5128c;

/* renamed from: i8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4603a {

    /* renamed from: a, reason: collision with root package name */
    public final b f38186a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f38187b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f38188c;

    /* renamed from: d, reason: collision with root package name */
    public final w8.c f38189d;

    /* renamed from: e, reason: collision with root package name */
    public final d f38190e;

    /* renamed from: f, reason: collision with root package name */
    public final b f38191f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f38192g;

    /* renamed from: h, reason: collision with root package name */
    public final n f38193h;
    public final List i;

    /* renamed from: j, reason: collision with root package name */
    public final List f38194j;

    public C4603a(String uriHost, int i, b dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, w8.c cVar, d dVar, b proxyAuthenticator, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        kotlin.jvm.internal.h.e(uriHost, "uriHost");
        kotlin.jvm.internal.h.e(dns, "dns");
        kotlin.jvm.internal.h.e(socketFactory, "socketFactory");
        kotlin.jvm.internal.h.e(proxyAuthenticator, "proxyAuthenticator");
        kotlin.jvm.internal.h.e(protocols, "protocols");
        kotlin.jvm.internal.h.e(connectionSpecs, "connectionSpecs");
        kotlin.jvm.internal.h.e(proxySelector, "proxySelector");
        this.f38186a = dns;
        this.f38187b = socketFactory;
        this.f38188c = sSLSocketFactory;
        this.f38189d = cVar;
        this.f38190e = dVar;
        this.f38191f = proxyAuthenticator;
        this.f38192g = proxySelector;
        m mVar = new m();
        String str = sSLSocketFactory != null ? "https" : "http";
        if (str.equalsIgnoreCase("http")) {
            mVar.f38270a = "http";
        } else {
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            mVar.f38270a = "https";
        }
        String b9 = j8.b.b(x8.a.c(0, uriHost, 0, 7));
        if (b9 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(uriHost));
        }
        mVar.f38273d = b9;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(Wv.f(i, "unexpected port: ").toString());
        }
        mVar.f38274e = i;
        this.f38193h = mVar.a();
        this.i = j8.d.j(protocols);
        this.f38194j = j8.d.j(connectionSpecs);
    }

    public final boolean a(C4603a that) {
        kotlin.jvm.internal.h.e(that, "that");
        return kotlin.jvm.internal.h.a(this.f38186a, that.f38186a) && kotlin.jvm.internal.h.a(this.f38191f, that.f38191f) && kotlin.jvm.internal.h.a(this.i, that.i) && kotlin.jvm.internal.h.a(this.f38194j, that.f38194j) && kotlin.jvm.internal.h.a(this.f38192g, that.f38192g) && kotlin.jvm.internal.h.a(this.f38188c, that.f38188c) && kotlin.jvm.internal.h.a(this.f38189d, that.f38189d) && kotlin.jvm.internal.h.a(this.f38190e, that.f38190e) && this.f38193h.f38282e == that.f38193h.f38282e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4603a)) {
            return false;
        }
        C4603a c4603a = (C4603a) obj;
        return kotlin.jvm.internal.h.a(this.f38193h, c4603a.f38193h) && a(c4603a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f38190e) + ((Objects.hashCode(this.f38189d) + ((Objects.hashCode(this.f38188c) + ((this.f38192g.hashCode() + ((this.f38194j.hashCode() + ((this.i.hashCode() + ((this.f38191f.hashCode() + ((this.f38186a.hashCode() + AbstractC5128c.a(527, 31, this.f38193h.f38285h)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        n nVar = this.f38193h;
        sb.append(nVar.f38281d);
        sb.append(':');
        sb.append(nVar.f38282e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f38192g);
        sb.append('}');
        return sb.toString();
    }
}
