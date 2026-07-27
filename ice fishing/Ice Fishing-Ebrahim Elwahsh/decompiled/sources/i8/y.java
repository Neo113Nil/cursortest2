package i8;

import e8.C4483a;
import g1.C4523c;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import r7.C4985p;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final C4483a f38448a;

    /* renamed from: b, reason: collision with root package name */
    public final C4523c f38449b;

    /* renamed from: c, reason: collision with root package name */
    public final a f38450c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f38451d;

    /* renamed from: e, reason: collision with root package name */
    public final List f38452e;

    /* renamed from: f, reason: collision with root package name */
    public int f38453f;

    /* renamed from: g, reason: collision with root package name */
    public Object f38454g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f38455h;

    public y(C4483a address, C4523c routeDatabase, a connectionUser, boolean z8) {
        List k6;
        kotlin.jvm.internal.h.e(address, "address");
        kotlin.jvm.internal.h.e(routeDatabase, "routeDatabase");
        kotlin.jvm.internal.h.e(connectionUser, "connectionUser");
        this.f38448a = address;
        this.f38449b = routeDatabase;
        this.f38450c = connectionUser;
        this.f38451d = z8;
        C4985p c4985p = C4985p.f40358n;
        this.f38452e = c4985p;
        this.f38454g = c4985p;
        this.f38455h = new ArrayList();
        e8.o url = address.f37351h;
        connectionUser.getClass();
        kotlin.jvm.internal.h.e(url, "url");
        connectionUser.f38332a.getClass();
        URI g9 = url.g();
        if (g9.getHost() == null) {
            k6 = f8.d.k(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> select = address.f37350g.select(g9);
            k6 = (select == null || select.isEmpty()) ? f8.d.k(new Proxy[]{Proxy.NO_PROXY}) : f8.d.j(select);
        }
        this.f38452e = k6;
        this.f38453f = 0;
        kotlin.jvm.internal.h.e(url, "url");
        connectionUser.f38332a.getClass();
    }

    public final boolean a() {
        return this.f38453f < this.f38452e.size() || !this.f38455h.isEmpty();
    }
}
