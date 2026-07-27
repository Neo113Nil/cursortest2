package com.anythink.core.common.n.b;

import com.anythink.core.common.n.b.v;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.anythink.core.common.n.b.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0545a {

    /* renamed from: a, reason: collision with root package name */
    final v f15017a;

    /* renamed from: b, reason: collision with root package name */
    final q f15018b;

    /* renamed from: c, reason: collision with root package name */
    final SocketFactory f15019c;

    /* renamed from: d, reason: collision with root package name */
    final b f15020d;

    /* renamed from: e, reason: collision with root package name */
    final List<ab> f15021e;

    /* renamed from: f, reason: collision with root package name */
    final List<l> f15022f;

    /* renamed from: g, reason: collision with root package name */
    final ProxySelector f15023g;

    /* renamed from: h, reason: collision with root package name */
    final Proxy f15024h;
    final SSLSocketFactory i;

    /* renamed from: j, reason: collision with root package name */
    final HostnameVerifier f15025j;

    /* renamed from: k, reason: collision with root package name */
    final g f15026k;

    public C0545a(String str, int i, q qVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, g gVar, b bVar, Proxy proxy, List<ab> list, List<l> list2, ProxySelector proxySelector) {
        v.a aVar = new v.a();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            aVar.f15900a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            aVar.f15900a = "https";
        }
        v.a a9 = aVar.a(str);
        if (i <= 0 || i > 65535) {
            throw new IllegalArgumentException("unexpected port: ".concat(String.valueOf(i)));
        }
        a9.f15904e = i;
        this.f15017a = a9.b();
        if (qVar == null) {
            throw new NullPointerException("dns == null");
        }
        this.f15018b = qVar;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f15019c = socketFactory;
        if (bVar == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f15020d = bVar;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.f15021e = com.anythink.core.common.n.b.a.c.a(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f15022f = com.anythink.core.common.n.b.a.c.a(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.f15023g = proxySelector;
        this.f15024h = proxy;
        this.i = sSLSocketFactory;
        this.f15025j = hostnameVerifier;
        this.f15026k = gVar;
    }

    public final v a() {
        return this.f15017a;
    }

    public final q b() {
        return this.f15018b;
    }

    public final SocketFactory c() {
        return this.f15019c;
    }

    public final b d() {
        return this.f15020d;
    }

    public final List<ab> e() {
        return this.f15021e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0545a)) {
            return false;
        }
        C0545a c0545a = (C0545a) obj;
        return this.f15017a.equals(c0545a.f15017a) && a(c0545a);
    }

    public final List<l> f() {
        return this.f15022f;
    }

    public final ProxySelector g() {
        return this.f15023g;
    }

    public final Proxy h() {
        return this.f15024h;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f15026k) + ((Objects.hashCode(this.f15025j) + ((Objects.hashCode(this.i) + ((Objects.hashCode(this.f15024h) + ((this.f15023g.hashCode() + ((this.f15022f.hashCode() + ((this.f15021e.hashCode() + ((this.f15020d.hashCode() + ((this.f15018b.hashCode() + ((this.f15017a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final SSLSocketFactory i() {
        return this.i;
    }

    public final HostnameVerifier j() {
        return this.f15025j;
    }

    public final g k() {
        return this.f15026k;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        sb.append(this.f15017a.f15892m);
        sb.append(":");
        sb.append(this.f15017a.f15893n);
        if (this.f15024h != null) {
            sb.append(", proxy=");
            sb.append(this.f15024h);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.f15023g);
        }
        sb.append("}");
        return sb.toString();
    }

    public final boolean a(C0545a c0545a) {
        return this.f15018b.equals(c0545a.f15018b) && this.f15020d.equals(c0545a.f15020d) && this.f15021e.equals(c0545a.f15021e) && this.f15022f.equals(c0545a.f15022f) && this.f15023g.equals(c0545a.f15023g) && Objects.equals(this.f15024h, c0545a.f15024h) && Objects.equals(this.i, c0545a.i) && Objects.equals(this.f15025j, c0545a.f15025j) && Objects.equals(this.f15026k, c0545a.f15026k) && this.f15017a.f15893n == c0545a.f15017a.f15893n;
    }
}
