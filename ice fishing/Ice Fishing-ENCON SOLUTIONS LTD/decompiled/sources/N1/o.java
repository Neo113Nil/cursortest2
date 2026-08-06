package N1;

import J1.C0050a;
import J1.C0051b;
import J1.s;
import J1.t;
import J1.v;
import J1.x;
import J1.y;
import P.C0053b;
import W1.p;
import W1.q;
import W1.u;
import W1.w;
import a.AbstractC0083a;
import i1.r;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class o implements O1.e {

    /* renamed from: a, reason: collision with root package name */
    public int f1225a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1226b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1227c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1228d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1229e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1230f;

    /* renamed from: g, reason: collision with root package name */
    public Iterable f1231g;

    public o(C0050a c0050a, C.j routeDatabase, i call) {
        List l2;
        kotlin.jvm.internal.i.e(routeDatabase, "routeDatabase");
        kotlin.jvm.internal.i.e(call, "call");
        this.f1226b = c0050a;
        this.f1227c = routeDatabase;
        this.f1228d = call;
        r rVar = r.f3416a;
        this.f1229e = rVar;
        this.f1230f = rVar;
        this.f1231g = new ArrayList();
        J1.o url = c0050a.f820h;
        kotlin.jvm.internal.i.e(url, "url");
        URI f2 = url.f();
        if (f2.getHost() == null) {
            l2 = K1.b.l(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = c0050a.f819g.select(f2);
            l2 = (select == null || select.isEmpty()) ? K1.b.l(Proxy.NO_PROXY) : K1.b.w(select);
        }
        this.f1229e = l2;
        this.f1225a = 0;
    }

    @Override // O1.e
    public u a(v request, long j2) {
        kotlin.jvm.internal.i.e(request, "request");
        if ("chunked".equalsIgnoreCase(request.f979c.a("Transfer-Encoding"))) {
            int i2 = this.f1225a;
            if (i2 != 1) {
                throw new IllegalStateException(kotlin.jvm.internal.i.h(Integer.valueOf(i2), "state: ").toString());
            }
            this.f1225a = 2;
            return new P1.b(this);
        }
        if (j2 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        int i3 = this.f1225a;
        if (i3 != 1) {
            throw new IllegalStateException(kotlin.jvm.internal.i.h(Integer.valueOf(i3), "state: ").toString());
        }
        this.f1225a = 2;
        return new P1.e(this);
    }

    @Override // O1.e
    public w b(y yVar) {
        if (!O1.f.a(yVar)) {
            return j(0L);
        }
        if ("chunked".equalsIgnoreCase(y.a(yVar, "Transfer-Encoding"))) {
            J1.o oVar = yVar.f1000a.f977a;
            int i2 = this.f1225a;
            if (i2 != 4) {
                throw new IllegalStateException(kotlin.jvm.internal.i.h(Integer.valueOf(i2), "state: ").toString());
            }
            this.f1225a = 5;
            return new P1.c(this, oVar);
        }
        long k2 = K1.b.k(yVar);
        if (k2 != -1) {
            return j(k2);
        }
        int i3 = this.f1225a;
        if (i3 != 4) {
            throw new IllegalStateException(kotlin.jvm.internal.i.h(Integer.valueOf(i3), "state: ").toString());
        }
        this.f1225a = 5;
        ((k) this.f1227c).k();
        return new P1.f(this);
    }

    @Override // O1.e
    public long c(y yVar) {
        if (!O1.f.a(yVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(y.a(yVar, "Transfer-Encoding"))) {
            return -1L;
        }
        return K1.b.k(yVar);
    }

    @Override // O1.e
    public void cancel() {
        Socket socket = ((k) this.f1227c).f1200c;
        if (socket == null) {
            return;
        }
        K1.b.e(socket);
    }

    @Override // O1.e
    public void d() {
        ((p) this.f1229e).flush();
    }

    @Override // O1.e
    public void e(v request) {
        kotlin.jvm.internal.i.e(request, "request");
        Proxy.Type type = ((k) this.f1227c).f1199b.f804b.type();
        kotlin.jvm.internal.i.d(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append(request.f978b);
        sb.append(' ');
        J1.o oVar = request.f977a;
        if (oVar.f912i || type != Proxy.Type.HTTP) {
            String b2 = oVar.b();
            String d2 = oVar.d();
            if (d2 != null) {
                b2 = b2 + '?' + ((Object) d2);
            }
            sb.append(b2);
        } else {
            sb.append(oVar);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        k(request.f979c, sb2);
    }

    @Override // O1.e
    public void f() {
        ((p) this.f1229e).flush();
    }

    @Override // O1.e
    public x g(boolean z2) {
        C0053b c0053b = (C0053b) this.f1230f;
        int i2 = this.f1225a;
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            throw new IllegalStateException(kotlin.jvm.internal.i.h(Integer.valueOf(i2), "state: ").toString());
        }
        J1.n nVar = null;
        try {
            String o2 = ((q) c0053b.f1301c).o(c0053b.f1300b);
            c0053b.f1300b -= o2.length();
            O1.h o3 = AbstractC0083a.o(o2);
            int i3 = o3.f1248b;
            x xVar = new x();
            xVar.f988b = (t) o3.f1249c;
            xVar.f989c = i3;
            xVar.f990d = (String) o3.f1250d;
            xVar.f992f = c0053b.c().c();
            if (z2 && i3 == 100) {
                return null;
            }
            if (i3 == 100) {
                this.f1225a = 3;
            } else if (102 > i3 || i3 >= 200) {
                this.f1225a = 4;
            } else {
                this.f1225a = 3;
            }
            return xVar;
        } catch (EOFException e2) {
            J1.o oVar = ((k) this.f1227c).f1199b.f803a.f820h;
            oVar.getClass();
            try {
                J1.n nVar2 = new J1.n();
                nVar2.c(oVar, "/...");
                nVar = nVar2;
            } catch (IllegalArgumentException unused) {
            }
            kotlin.jvm.internal.i.b(nVar);
            nVar.f896b = C0051b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
            nVar.f897c = C0051b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
            throw new IOException(kotlin.jvm.internal.i.h(nVar.a().f911h, "unexpected end of stream on "), e2);
        }
    }

    @Override // O1.e
    public k h() {
        return (k) this.f1227c;
    }

    public boolean i() {
        return this.f1225a < ((List) this.f1229e).size() || !((ArrayList) this.f1231g).isEmpty();
    }

    public P1.d j(long j2) {
        int i2 = this.f1225a;
        if (i2 != 4) {
            throw new IllegalStateException(kotlin.jvm.internal.i.h(Integer.valueOf(i2), "state: ").toString());
        }
        this.f1225a = 5;
        return new P1.d(this, j2);
    }

    public void k(J1.m mVar, String requestLine) {
        kotlin.jvm.internal.i.e(requestLine, "requestLine");
        int i2 = this.f1225a;
        if (i2 != 0) {
            throw new IllegalStateException(kotlin.jvm.internal.i.h(Integer.valueOf(i2), "state: ").toString());
        }
        p pVar = (p) this.f1229e;
        pVar.g(requestLine);
        pVar.g("\r\n");
        int size = mVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            pVar.g(mVar.b(i3));
            pVar.g(": ");
            pVar.g(mVar.d(i3));
            pVar.g("\r\n");
        }
        pVar.g("\r\n");
        this.f1225a = 1;
    }

    public o(s sVar, k connection, q source, p sink) {
        kotlin.jvm.internal.i.e(connection, "connection");
        kotlin.jvm.internal.i.e(source, "source");
        kotlin.jvm.internal.i.e(sink, "sink");
        this.f1226b = sVar;
        this.f1227c = connection;
        this.f1228d = source;
        this.f1229e = sink;
        this.f1230f = new C0053b(source);
    }
}
