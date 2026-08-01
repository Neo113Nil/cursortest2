package m8;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final q f39319a;

    /* renamed from: b, reason: collision with root package name */
    public final f f39320b;

    /* renamed from: c, reason: collision with root package name */
    public final n8.h f39321c;

    public a(q call, f fVar, n8.h hVar) {
        kotlin.jvm.internal.h.e(call, "call");
        this.f39319a = call;
        this.f39320b = fVar;
        this.f39321c = hVar;
    }

    public final void a(r connection) {
        kotlin.jvm.internal.h.e(connection, "connection");
        q qVar = this.f39319a;
        qVar.getClass();
        TimeZone timeZone = j8.d.f38483a;
        if (qVar.f39378A != null) {
            throw new IllegalStateException("Check failed.");
        }
        qVar.f39378A = connection;
        connection.f39409r.add(new o(qVar, qVar.f39392y));
    }

    public final void b(e connectPlan) {
        kotlin.jvm.internal.h.e(connectPlan, "connectPlan");
        this.f39319a.f39386I.add(connectPlan);
    }

    public final void c(i8.y route) {
        kotlin.jvm.internal.h.e(route, "route");
        this.f39319a.getClass();
        InetSocketAddress inetSocketAddress = route.f38264c;
        kotlin.jvm.internal.h.e(inetSocketAddress, "inetSocketAddress");
    }

    public final r d() {
        return this.f39319a.f39378A;
    }

    public final void e(i8.y route, IOException iOException) {
        kotlin.jvm.internal.h.e(route, "route");
        this.f39319a.getClass();
        InetSocketAddress inetSocketAddress = route.f38264c;
        kotlin.jvm.internal.h.e(inetSocketAddress, "inetSocketAddress");
    }

    public final void f(i8.y route) {
        kotlin.jvm.internal.h.e(route, "route");
        this.f39319a.getClass();
        InetSocketAddress inetSocketAddress = route.f38264c;
        kotlin.jvm.internal.h.e(inetSocketAddress, "inetSocketAddress");
    }

    public final void g(r connection) {
        kotlin.jvm.internal.h.e(connection, "connection");
        this.f39319a.getClass();
    }

    public final void h(r connection) {
        kotlin.jvm.internal.h.e(connection, "connection");
        connection.f39401j.getClass();
        q call = this.f39319a;
        kotlin.jvm.internal.h.e(call, "call");
    }

    public final boolean j() {
        return !kotlin.jvm.internal.h.a((String) this.f39321c.f39521e.f40193v, "GET");
    }

    public final boolean k() {
        return this.f39319a.f39384G;
    }

    public final Socket m() {
        return this.f39319a.m();
    }

    public final void n(e connectPlan) {
        kotlin.jvm.internal.h.e(connectPlan, "connectPlan");
        this.f39319a.f39386I.remove(connectPlan);
    }

    public final void i(r rVar) {
    }

    public final void l(r rVar) {
    }
}
