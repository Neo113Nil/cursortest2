package m8;

import i8.y;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final p f39478a;

    /* renamed from: b, reason: collision with root package name */
    public final f f39479b;

    /* renamed from: c, reason: collision with root package name */
    public final n8.h f39480c;

    public a(p call, f fVar, n8.h hVar) {
        kotlin.jvm.internal.h.e(call, "call");
        this.f39478a = call;
        this.f39479b = fVar;
        this.f39480c = hVar;
    }

    public final void a(q connection) {
        kotlin.jvm.internal.h.e(connection, "connection");
        p pVar = this.f39478a;
        pVar.getClass();
        TimeZone timeZone = j8.d.f38495a;
        if (pVar.f39535A != null) {
            throw new IllegalStateException("Check failed.");
        }
        pVar.f39535A = connection;
        connection.f39566r.add(new n(pVar, pVar.f39549y));
    }

    public final void b(e connectPlan) {
        kotlin.jvm.internal.h.e(connectPlan, "connectPlan");
        this.f39478a.f39543I.add(connectPlan);
    }

    public final void c(y route) {
        kotlin.jvm.internal.h.e(route, "route");
        this.f39478a.getClass();
        InetSocketAddress inetSocketAddress = route.f38383c;
        kotlin.jvm.internal.h.e(inetSocketAddress, "inetSocketAddress");
    }

    public final q d() {
        return this.f39478a.f39535A;
    }

    public final void e(y route, IOException iOException) {
        kotlin.jvm.internal.h.e(route, "route");
        this.f39478a.getClass();
        InetSocketAddress inetSocketAddress = route.f38383c;
        kotlin.jvm.internal.h.e(inetSocketAddress, "inetSocketAddress");
    }

    public final void f(y route) {
        kotlin.jvm.internal.h.e(route, "route");
        this.f39478a.getClass();
        InetSocketAddress inetSocketAddress = route.f38383c;
        kotlin.jvm.internal.h.e(inetSocketAddress, "inetSocketAddress");
    }

    public final void g(q connection) {
        kotlin.jvm.internal.h.e(connection, "connection");
        this.f39478a.getClass();
    }

    public final void h(q connection) {
        kotlin.jvm.internal.h.e(connection, "connection");
        connection.f39558j.getClass();
        p call = this.f39478a;
        kotlin.jvm.internal.h.e(call, "call");
    }

    public final boolean j() {
        return !kotlin.jvm.internal.h.a((String) this.f39480c.f39688e.f40492v, "GET");
    }

    public final boolean k() {
        return this.f39478a.f39541G;
    }

    public final Socket m() {
        return this.f39478a.m();
    }

    public final void n(e connectPlan) {
        kotlin.jvm.internal.h.e(connectPlan, "connectPlan");
        this.f39478a.f39543I.remove(connectPlan);
    }

    public final void i(q qVar) {
    }

    public final void l(q qVar) {
    }
}
