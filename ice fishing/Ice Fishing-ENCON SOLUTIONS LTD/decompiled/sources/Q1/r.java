package Q1;

import a.AbstractC0083a;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class r implements O1.e {

    /* renamed from: g, reason: collision with root package name */
    public static final List f1650g = K1.b.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h, reason: collision with root package name */
    public static final List f1651h = K1.b.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final N1.k f1652a;

    /* renamed from: b, reason: collision with root package name */
    public final O1.g f1653b;

    /* renamed from: c, reason: collision with root package name */
    public final q f1654c;

    /* renamed from: d, reason: collision with root package name */
    public volatile y f1655d;

    /* renamed from: e, reason: collision with root package name */
    public final J1.t f1656e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f1657f;

    public r(J1.s client, N1.k connection, O1.g gVar, q http2Connection) {
        kotlin.jvm.internal.i.e(client, "client");
        kotlin.jvm.internal.i.e(connection, "connection");
        kotlin.jvm.internal.i.e(http2Connection, "http2Connection");
        this.f1652a = connection;
        this.f1653b = gVar;
        this.f1654c = http2Connection;
        J1.t tVar = J1.t.H2_PRIOR_KNOWLEDGE;
        this.f1656e = client.f956r.contains(tVar) ? tVar : J1.t.HTTP_2;
    }

    @Override // O1.e
    public final W1.u a(J1.v request, long j2) {
        kotlin.jvm.internal.i.e(request, "request");
        y yVar = this.f1655d;
        kotlin.jvm.internal.i.b(yVar);
        return yVar.g();
    }

    @Override // O1.e
    public final W1.w b(J1.y yVar) {
        y yVar2 = this.f1655d;
        kotlin.jvm.internal.i.b(yVar2);
        return yVar2.f1687i;
    }

    @Override // O1.e
    public final long c(J1.y yVar) {
        if (O1.f.a(yVar)) {
            return K1.b.k(yVar);
        }
        return 0L;
    }

    @Override // O1.e
    public final void cancel() {
        this.f1657f = true;
        y yVar = this.f1655d;
        if (yVar == null) {
            return;
        }
        yVar.e(EnumC0079b.CANCEL);
    }

    @Override // O1.e
    public final void d() {
        y yVar = this.f1655d;
        kotlin.jvm.internal.i.b(yVar);
        yVar.g().close();
    }

    @Override // O1.e
    public final void e(J1.v request) {
        int i2;
        y yVar;
        kotlin.jvm.internal.i.e(request, "request");
        if (this.f1655d != null) {
            return;
        }
        boolean z2 = true;
        boolean z3 = request.f980d != null;
        J1.m mVar = request.f979c;
        ArrayList arrayList = new ArrayList(mVar.size() + 4);
        arrayList.add(new C0080c(C0080c.f1574f, request.f978b));
        W1.j jVar = C0080c.f1575g;
        J1.o url = request.f977a;
        kotlin.jvm.internal.i.e(url, "url");
        String b2 = url.b();
        String d2 = url.d();
        if (d2 != null) {
            b2 = b2 + '?' + ((Object) d2);
        }
        arrayList.add(new C0080c(jVar, b2));
        String a2 = request.f979c.a("Host");
        if (a2 != null) {
            arrayList.add(new C0080c(C0080c.f1577i, a2));
        }
        arrayList.add(new C0080c(C0080c.f1576h, url.f904a));
        int size = mVar.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = i3 + 1;
            String b3 = mVar.b(i3);
            Locale US = Locale.US;
            kotlin.jvm.internal.i.d(US, "US");
            String lowerCase = b3.toLowerCase(US);
            kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f1650g.contains(lowerCase) || (lowerCase.equals("te") && kotlin.jvm.internal.i.a(mVar.d(i3), "trailers"))) {
                arrayList.add(new C0080c(lowerCase, mVar.d(i3)));
            }
            i3 = i4;
        }
        q qVar = this.f1654c;
        qVar.getClass();
        boolean z4 = !z3;
        synchronized (qVar.f1647w) {
            synchronized (qVar) {
                try {
                    if (qVar.f1630e > 1073741823) {
                        qVar.k(EnumC0079b.REFUSED_STREAM);
                    }
                    if (qVar.f1631f) {
                        throw new C0078a();
                    }
                    i2 = qVar.f1630e;
                    qVar.f1630e = i2 + 2;
                    yVar = new y(i2, qVar, z4, false, null);
                    if (z3 && qVar.t < qVar.f1645u && yVar.f1683e < yVar.f1684f) {
                        z2 = false;
                    }
                    if (yVar.i()) {
                        qVar.f1627b.put(Integer.valueOf(i2), yVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            qVar.f1647w.k(z4, i2, arrayList);
        }
        if (z2) {
            qVar.f1647w.flush();
        }
        this.f1655d = yVar;
        if (this.f1657f) {
            y yVar2 = this.f1655d;
            kotlin.jvm.internal.i.b(yVar2);
            yVar2.e(EnumC0079b.CANCEL);
            throw new IOException("Canceled");
        }
        y yVar3 = this.f1655d;
        kotlin.jvm.internal.i.b(yVar3);
        x xVar = yVar3.f1689k;
        long j2 = this.f1653b.f1244g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        xVar.g(j2, timeUnit);
        y yVar4 = this.f1655d;
        kotlin.jvm.internal.i.b(yVar4);
        yVar4.f1690l.g(this.f1653b.f1245h, timeUnit);
    }

    @Override // O1.e
    public final void f() {
        this.f1654c.flush();
    }

    @Override // O1.e
    public final J1.x g(boolean z2) {
        J1.m mVar;
        y yVar = this.f1655d;
        if (yVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (yVar) {
            yVar.f1689k.h();
            while (yVar.f1685g.isEmpty() && yVar.f1691m == null) {
                try {
                    yVar.l();
                } catch (Throwable th) {
                    yVar.f1689k.k();
                    throw th;
                }
            }
            yVar.f1689k.k();
            if (yVar.f1685g.isEmpty()) {
                IOException iOException = yVar.f1692n;
                if (iOException != null) {
                    throw iOException;
                }
                EnumC0079b enumC0079b = yVar.f1691m;
                kotlin.jvm.internal.i.b(enumC0079b);
                throw new E(enumC0079b);
            }
            Object removeFirst = yVar.f1685g.removeFirst();
            kotlin.jvm.internal.i.d(removeFirst, "headersQueue.removeFirst()");
            mVar = (J1.m) removeFirst;
        }
        J1.t protocol = this.f1656e;
        kotlin.jvm.internal.i.e(protocol, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = mVar.size();
        O1.h hVar = null;
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            String name = mVar.b(i2);
            String value = mVar.d(i2);
            if (kotlin.jvm.internal.i.a(name, ":status")) {
                hVar = AbstractC0083a.o(kotlin.jvm.internal.i.h(value, "HTTP/1.1 "));
            } else if (!f1651h.contains(name)) {
                kotlin.jvm.internal.i.e(name, "name");
                kotlin.jvm.internal.i.e(value, "value");
                arrayList.add(name);
                arrayList.add(z1.g.k0(value).toString());
            }
            i2 = i3;
        }
        if (hVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        J1.x xVar = new J1.x();
        xVar.f988b = protocol;
        xVar.f989c = hVar.f1248b;
        xVar.f990d = (String) hVar.f1250d;
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        J1.l lVar = new J1.l(0);
        i1.o.F(lVar.f893a, (String[]) array);
        xVar.f992f = lVar;
        if (z2 && xVar.f989c == 100) {
            return null;
        }
        return xVar;
    }

    @Override // O1.e
    public final N1.k h() {
        return this.f1652a;
    }
}
