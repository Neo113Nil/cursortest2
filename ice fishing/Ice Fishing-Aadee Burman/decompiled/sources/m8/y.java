package m8;

import g1.C4523c;
import i8.C4594a;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import v7.C5135p;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final C4594a f39436a;

    /* renamed from: b, reason: collision with root package name */
    public final C4523c f39437b;

    /* renamed from: c, reason: collision with root package name */
    public final a f39438c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f39439d;

    /* renamed from: e, reason: collision with root package name */
    public final List f39440e;

    /* renamed from: f, reason: collision with root package name */
    public int f39441f;

    /* renamed from: g, reason: collision with root package name */
    public Object f39442g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f39443h;

    public y(C4594a address, C4523c routeDatabase, a connectionUser, boolean z3) {
        List k9;
        kotlin.jvm.internal.h.e(address, "address");
        kotlin.jvm.internal.h.e(routeDatabase, "routeDatabase");
        kotlin.jvm.internal.h.e(connectionUser, "connectionUser");
        this.f39436a = address;
        this.f39437b = routeDatabase;
        this.f39438c = connectionUser;
        this.f39439d = z3;
        C5135p c5135p = C5135p.f41439n;
        this.f39440e = c5135p;
        this.f39442g = c5135p;
        this.f39443h = new ArrayList();
        i8.n url = address.f38074h;
        connectionUser.getClass();
        kotlin.jvm.internal.h.e(url, "url");
        connectionUser.f39319a.getClass();
        URI g4 = url.g();
        if (g4.getHost() == null) {
            k9 = j8.d.k(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> select = address.f38073g.select(g4);
            k9 = (select == null || select.isEmpty()) ? j8.d.k(new Proxy[]{Proxy.NO_PROXY}) : j8.d.j(select);
        }
        this.f39440e = k9;
        this.f39441f = 0;
        kotlin.jvm.internal.h.e(url, "url");
        connectionUser.f39319a.getClass();
    }

    public final boolean a() {
        return this.f39441f < this.f39440e.size() || !this.f39443h.isEmpty();
    }
}
