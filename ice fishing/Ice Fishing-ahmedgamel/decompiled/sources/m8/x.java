package m8;

import i1.C4586c;
import i8.C4603a;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import v7.C5125p;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final C4603a f39593a;

    /* renamed from: b, reason: collision with root package name */
    public final C4586c f39594b;

    /* renamed from: c, reason: collision with root package name */
    public final a f39595c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f39596d;

    /* renamed from: e, reason: collision with root package name */
    public final List f39597e;

    /* renamed from: f, reason: collision with root package name */
    public int f39598f;

    /* renamed from: g, reason: collision with root package name */
    public Object f39599g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f39600h;

    public x(C4603a address, C4586c routeDatabase, a connectionUser, boolean z6) {
        List k9;
        kotlin.jvm.internal.h.e(address, "address");
        kotlin.jvm.internal.h.e(routeDatabase, "routeDatabase");
        kotlin.jvm.internal.h.e(connectionUser, "connectionUser");
        this.f39593a = address;
        this.f39594b = routeDatabase;
        this.f39595c = connectionUser;
        this.f39596d = z6;
        C5125p c5125p = C5125p.f41221n;
        this.f39597e = c5125p;
        this.f39599g = c5125p;
        this.f39600h = new ArrayList();
        i8.n url = address.f38193h;
        connectionUser.getClass();
        kotlin.jvm.internal.h.e(url, "url");
        connectionUser.f39478a.getClass();
        URI g9 = url.g();
        if (g9.getHost() == null) {
            k9 = j8.d.k(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> select = address.f38192g.select(g9);
            k9 = (select == null || select.isEmpty()) ? j8.d.k(new Proxy[]{Proxy.NO_PROXY}) : j8.d.j(select);
        }
        this.f39597e = k9;
        this.f39598f = 0;
        kotlin.jvm.internal.h.e(url, "url");
        connectionUser.f39478a.getClass();
    }

    public final boolean a() {
        return this.f39598f < this.f39597e.size() || !this.f39600h.isEmpty();
    }
}
