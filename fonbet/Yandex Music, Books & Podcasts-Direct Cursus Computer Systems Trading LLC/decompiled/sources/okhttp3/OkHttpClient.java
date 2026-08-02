package okhttp3;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.b0o;
import defpackage.cvt;
import defpackage.d0o;
import defpackage.ds3;
import defpackage.e3s;
import defpackage.es3;
import defpackage.g02;
import defpackage.gln;
import defpackage.ha4;
import defpackage.i9w;
import defpackage.iib;
import defpackage.imp;
import defpackage.irf;
import defpackage.izm;
import defpackage.jib;
import defpackage.joj;
import defpackage.l1j;
import defpackage.l66;
import defpackage.m8s;
import defpackage.mkn;
import defpackage.otk;
import defpackage.ozw;
import defpackage.put;
import defpackage.rgj;
import defpackage.swf;
import defpackage.to3;
import defpackage.vtm;
import defpackage.xq0;
import defpackage.z75;
import defpackage.z98;
import java.net.ProtocolException;
import java.net.ProxySelector;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/OkHttpClient;", "", "Lds3;", "joj", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public class OkHttpClient implements Cloneable, ds3 {
    public static final List C = cvt.l(izm.HTTP_2, izm.HTTP_1_1);
    public static final List D = cvt.l(l66.e, l66.f);
    public final long A;
    public final vtm B;
    public final z98 a;
    public final ozw b;
    public final List c;
    public final List d;
    public final iib e;
    public final boolean f;
    public final imp g;
    public final boolean h;
    public final boolean i;
    public final e3s j;
    public final to3 k;
    public final i9w l;
    public final ProxySelector m;
    public final imp n;
    public final SocketFactory o;
    public final SSLSocketFactory p;
    public final X509TrustManager q;
    public final List r;
    public final List s;
    public final HostnameVerifier t;
    public final ha4 u;
    public final irf v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OkHttpClient(joj jojVar) {
        List list;
        jojVar.getClass();
        this.a = jojVar.a;
        this.b = jojVar.b;
        this.c = cvt.x(jojVar.c);
        this.d = cvt.x(jojVar.d);
        this.e = jojVar.e;
        this.f = jojVar.f;
        this.g = jojVar.g;
        this.h = jojVar.h;
        this.i = jojVar.i;
        this.j = jojVar.j;
        this.k = jojVar.k;
        this.l = jojVar.l;
        ProxySelector proxySelector = jojVar.m;
        proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
        this.m = proxySelector == null ? rgj.a : proxySelector;
        this.n = jojVar.n;
        this.o = jojVar.o;
        List list2 = jojVar.r;
        this.r = list2;
        this.s = jojVar.s;
        this.t = jojVar.t;
        this.w = jojVar.w;
        this.x = jojVar.x;
        this.y = jojVar.y;
        this.z = jojVar.z;
        this.A = jojVar.A;
        vtm vtmVar = jojVar.B;
        this.B = vtmVar == null ? new vtm(5) : vtmVar;
        List list3 = list2;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                if (((l66) it.next()).a) {
                    SSLSocketFactory sSLSocketFactory = jojVar.p;
                    if (sSLSocketFactory != null) {
                        this.p = sSLSocketFactory;
                        irf irfVar = jojVar.v;
                        irfVar.getClass();
                        this.v = irfVar;
                        X509TrustManager x509TrustManager = jojVar.q;
                        x509TrustManager.getClass();
                        this.q = x509TrustManager;
                        ha4 ha4Var = jojVar.u;
                        ha4Var.getClass();
                        this.u = Intrinsics.d(ha4Var.b, irfVar) ? ha4Var : new ha4(ha4Var.a, irfVar);
                    } else {
                        otk otkVar = otk.a;
                        X509TrustManager n = otk.a.n();
                        this.q = n;
                        this.p = otk.a.m(n);
                        irf b = otk.a.b(n);
                        this.v = b;
                        ha4 ha4Var2 = jojVar.u;
                        ha4Var2.getClass();
                        this.u = Intrinsics.d(ha4Var2.b, b) ? ha4Var2 : new ha4(ha4Var2.a, b);
                    }
                    X509TrustManager x509TrustManager2 = this.q;
                    irf irfVar2 = this.v;
                    SSLSocketFactory sSLSocketFactory2 = this.p;
                    List list4 = this.d;
                    list = this.c;
                    list.getClass();
                    if (!list.contains(null)) {
                        l1j.m(list, "Null interceptor: ");
                        throw null;
                    }
                    list4.getClass();
                    if (list4.contains(null)) {
                        l1j.m(list4, "Null network interceptor: ");
                        throw null;
                    }
                    List list5 = this.r;
                    if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                        Iterator it2 = list5.iterator();
                        while (it2.hasNext()) {
                            if (((l66) it2.next()).a) {
                                if (sSLSocketFactory2 == null) {
                                    xq0.q("sslSocketFactory == null");
                                    throw null;
                                }
                                if (irfVar2 == null) {
                                    xq0.q("certificateChainCleaner == null");
                                    throw null;
                                }
                                if (x509TrustManager2 != null) {
                                    return;
                                }
                                xq0.q("x509TrustManager == null");
                                throw null;
                            }
                        }
                    }
                    if (sSLSocketFactory2 != null) {
                        xq0.q("Check failed.");
                        throw null;
                    }
                    if (irfVar2 != null) {
                        xq0.q("Check failed.");
                        throw null;
                    }
                    if (x509TrustManager2 != null) {
                        xq0.q("Check failed.");
                        throw null;
                    }
                    if (Intrinsics.d(this.u, ha4.c)) {
                        return;
                    }
                    xq0.q("Check failed.");
                    throw null;
                }
            }
        }
        this.p = null;
        this.v = null;
        this.q = null;
        this.u = ha4.c;
        X509TrustManager x509TrustManager22 = this.q;
        irf irfVar22 = this.v;
        SSLSocketFactory sSLSocketFactory22 = this.p;
        List list42 = this.d;
        list = this.c;
        list.getClass();
        if (!list.contains(null)) {
        }
    }

    @Override // defpackage.ds3
    public final es3 b(d0o d0oVar) {
        d0oVar.getClass();
        return new mkn(this, d0oVar, false);
    }

    public final joj c() {
        joj jojVar = new joj();
        jojVar.a = this.a;
        jojVar.b = this.b;
        z75.t(jojVar.c, this.c);
        z75.t(jojVar.d, this.d);
        jojVar.e = this.e;
        jojVar.f = this.f;
        jojVar.g = this.g;
        jojVar.h = this.h;
        jojVar.i = this.i;
        jojVar.j = this.j;
        jojVar.k = this.k;
        jojVar.l = this.l;
        jojVar.m = this.m;
        jojVar.n = this.n;
        jojVar.o = this.o;
        jojVar.p = this.p;
        jojVar.q = this.q;
        jojVar.r = this.r;
        jojVar.s = this.s;
        jojVar.t = this.t;
        jojVar.u = this.u;
        jojVar.v = this.v;
        jojVar.w = this.w;
        jojVar.x = this.x;
        jojVar.y = this.y;
        jojVar.z = this.z;
        jojVar.A = this.A;
        jojVar.B = this.B;
        return jojVar;
    }

    public final Object clone() {
        return super.clone();
    }

    public final gln d(d0o d0oVar, swf swfVar) {
        gln glnVar = new gln(m8s.h, d0oVar, swfVar, new Random(), 0, this.A);
        if (d0oVar.c.a("Sec-WebSocket-Extensions") != null) {
            glnVar.c(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return glnVar;
        }
        joj c = c();
        c.e = new put(jib.a);
        c.d(gln.w);
        OkHttpClient okHttpClient = new OkHttpClient(c);
        b0o b = d0oVar.b();
        b.d("Upgrade", "websocket");
        b.d("Connection", "Upgrade");
        b.d("Sec-WebSocket-Key", glnVar.f);
        b.d("Sec-WebSocket-Version", "13");
        b.d("Sec-WebSocket-Extensions", "permessage-deflate");
        d0o b2 = b.b();
        mkn mknVar = new mkn(okHttpClient, b2, true);
        glnVar.g = mknVar;
        mknVar.z(new g02(glnVar, b2));
        return glnVar;
    }

    public OkHttpClient() {
        this(new joj());
    }
}
