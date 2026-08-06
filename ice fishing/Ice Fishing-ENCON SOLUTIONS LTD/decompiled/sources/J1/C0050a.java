package J1;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import u0.AbstractC1050a;

/* renamed from: J1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0050a {

    /* renamed from: a, reason: collision with root package name */
    public final C0051b f813a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f814b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f815c;

    /* renamed from: d, reason: collision with root package name */
    public final V1.c f816d;

    /* renamed from: e, reason: collision with root package name */
    public final e f817e;

    /* renamed from: f, reason: collision with root package name */
    public final C0051b f818f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f819g;

    /* renamed from: h, reason: collision with root package name */
    public final o f820h;

    /* renamed from: i, reason: collision with root package name */
    public final List f821i;

    /* renamed from: j, reason: collision with root package name */
    public final List f822j;

    public C0050a(String uriHost, int i2, C0051b dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, V1.c cVar, e eVar, C0051b proxyAuthenticator, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        kotlin.jvm.internal.i.e(uriHost, "uriHost");
        kotlin.jvm.internal.i.e(dns, "dns");
        kotlin.jvm.internal.i.e(socketFactory, "socketFactory");
        kotlin.jvm.internal.i.e(proxyAuthenticator, "proxyAuthenticator");
        kotlin.jvm.internal.i.e(protocols, "protocols");
        kotlin.jvm.internal.i.e(connectionSpecs, "connectionSpecs");
        kotlin.jvm.internal.i.e(proxySelector, "proxySelector");
        this.f813a = dns;
        this.f814b = socketFactory;
        this.f815c = sSLSocketFactory;
        this.f816d = cVar;
        this.f817e = eVar;
        this.f818f = proxyAuthenticator;
        this.f819g = proxySelector;
        n nVar = new n();
        String str = sSLSocketFactory != null ? "https" : "http";
        if (str.equalsIgnoreCase("http")) {
            nVar.f895a = "http";
        } else {
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException(kotlin.jvm.internal.i.h(str, "unexpected scheme: "));
            }
            nVar.f895a = "https";
        }
        String D2 = AbstractC1050a.D(C0051b.e(uriHost, 0, 0, false, 7));
        if (D2 == null) {
            throw new IllegalArgumentException(kotlin.jvm.internal.i.h(uriHost, "unexpected host: "));
        }
        nVar.f898d = D2;
        if (1 > i2 || i2 >= 65536) {
            throw new IllegalArgumentException(kotlin.jvm.internal.i.h(Integer.valueOf(i2), "unexpected port: ").toString());
        }
        nVar.f899e = i2;
        this.f820h = nVar.a();
        this.f821i = K1.b.w(protocols);
        this.f822j = K1.b.w(connectionSpecs);
    }

    public final boolean a(C0050a that) {
        kotlin.jvm.internal.i.e(that, "that");
        return kotlin.jvm.internal.i.a(this.f813a, that.f813a) && kotlin.jvm.internal.i.a(this.f818f, that.f818f) && kotlin.jvm.internal.i.a(this.f821i, that.f821i) && kotlin.jvm.internal.i.a(this.f822j, that.f822j) && kotlin.jvm.internal.i.a(this.f819g, that.f819g) && kotlin.jvm.internal.i.a(null, null) && kotlin.jvm.internal.i.a(this.f815c, that.f815c) && kotlin.jvm.internal.i.a(this.f816d, that.f816d) && kotlin.jvm.internal.i.a(this.f817e, that.f817e) && this.f820h.f908e == that.f820h.f908e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0050a) {
            C0050a c0050a = (C0050a) obj;
            if (kotlin.jvm.internal.i.a(this.f820h, c0050a.f820h) && a(c0050a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f817e) + ((Objects.hashCode(this.f816d) + ((Objects.hashCode(this.f815c) + ((this.f819g.hashCode() + ((this.f822j.hashCode() + ((this.f821i.hashCode() + ((this.f818f.hashCode() + ((this.f813a.hashCode() + C1.a.e(this.f820h.f911h, 527, 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        o oVar = this.f820h;
        sb.append(oVar.f907d);
        sb.append(':');
        sb.append(oVar.f908e);
        sb.append(", ");
        sb.append(kotlin.jvm.internal.i.h(this.f819g, "proxySelector="));
        sb.append('}');
        return sb.toString();
    }
}
