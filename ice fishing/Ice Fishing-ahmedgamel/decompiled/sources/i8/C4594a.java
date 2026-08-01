package i8;

import com.icefishing.icefishingbigwin.AbstractC4404f;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: i8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4594a {

    /* renamed from: a, reason: collision with root package name */
    public final b f38067a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f38068b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f38069c;

    /* renamed from: d, reason: collision with root package name */
    public final w8.c f38070d;

    /* renamed from: e, reason: collision with root package name */
    public final d f38071e;

    /* renamed from: f, reason: collision with root package name */
    public final b f38072f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f38073g;

    /* renamed from: h, reason: collision with root package name */
    public final n f38074h;
    public final List i;

    /* renamed from: j, reason: collision with root package name */
    public final List f38075j;

    public C4594a(String uriHost, int i, b dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, w8.c cVar, d dVar, b proxyAuthenticator, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        kotlin.jvm.internal.h.e(uriHost, "uriHost");
        kotlin.jvm.internal.h.e(dns, "dns");
        kotlin.jvm.internal.h.e(socketFactory, "socketFactory");
        kotlin.jvm.internal.h.e(proxyAuthenticator, "proxyAuthenticator");
        kotlin.jvm.internal.h.e(protocols, "protocols");
        kotlin.jvm.internal.h.e(connectionSpecs, "connectionSpecs");
        kotlin.jvm.internal.h.e(proxySelector, "proxySelector");
        this.f38067a = dns;
        this.f38068b = socketFactory;
        this.f38069c = sSLSocketFactory;
        this.f38070d = cVar;
        this.f38071e = dVar;
        this.f38072f = proxyAuthenticator;
        this.f38073g = proxySelector;
        m mVar = new m();
        String str = sSLSocketFactory != null ? "https" : "http";
        if (str.equalsIgnoreCase("http")) {
            mVar.f38151a = "http";
        } else {
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            mVar.f38151a = "https";
        }
        String b9 = j8.b.b(x8.a.c(0, uriHost, 0, 7));
        if (b9 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(uriHost));
        }
        mVar.f38154d = b9;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(AbstractC4404f.e(i, "unexpected port: ").toString());
        }
        mVar.f38155e = i;
        this.f38074h = mVar.a();
        this.i = j8.d.j(protocols);
        this.f38075j = j8.d.j(connectionSpecs);
    }

    public final boolean a(C4594a that) {
        kotlin.jvm.internal.h.e(that, "that");
        return kotlin.jvm.internal.h.a(this.f38067a, that.f38067a) && kotlin.jvm.internal.h.a(this.f38072f, that.f38072f) && kotlin.jvm.internal.h.a(this.i, that.i) && kotlin.jvm.internal.h.a(this.f38075j, that.f38075j) && kotlin.jvm.internal.h.a(this.f38073g, that.f38073g) && kotlin.jvm.internal.h.a(this.f38069c, that.f38069c) && kotlin.jvm.internal.h.a(this.f38070d, that.f38070d) && kotlin.jvm.internal.h.a(this.f38071e, that.f38071e) && this.f38074h.f38163e == that.f38074h.f38163e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4594a)) {
            return false;
        }
        C4594a c4594a = (C4594a) obj;
        return kotlin.jvm.internal.h.a(this.f38074h, c4594a.f38074h) && a(c4594a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f38071e) + ((Objects.hashCode(this.f38070d) + ((Objects.hashCode(this.f38069c) + ((this.f38073g.hashCode() + ((this.f38075j.hashCode() + ((this.i.hashCode() + ((this.f38072f.hashCode() + ((this.f38067a.hashCode() + u1.h.k(527, 31, this.f38074h.f38166h)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        n nVar = this.f38074h;
        sb.append(nVar.f38162d);
        sb.append(':');
        sb.append(nVar.f38163e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f38073g);
        sb.append('}');
        return sb.toString();
    }
}
