package defpackage;

import com.yandex.div.shimmer.a;
import com.yandex.feedsdk.di.FeedSdkComponent;
import json.state.disk.storage.feature.b;
import json.state.disk.storage.feature.c;

/* loaded from: classes.dex */
public final class upq {
    public final g0p a;

    public upq(g0p g0pVar) {
        this.a = g0pVar;
    }

    public final FeedSdkComponent a(xpq xpqVar, k6x k6xVar) {
        gqq gqqVar = new gqq(xpqVar.c, scc.g(new e76(xpqVar.a), new a(0)));
        vpq vpqVar = xpqVar.g;
        vit vitVar = new vit(gqqVar, k6xVar);
        c cVar = new c(xpqVar.a, "jason_state_storage");
        x4c x4cVar = new x4c(24);
        if (vpqVar.d) {
            d5z0 d5z0Var = h5z0.a;
            d5z0Var.getClass();
            if (h5z0.c.length == 0) {
                d5z0Var.s(new c5z0());
            }
        }
        gqqVar.d.add(new bwl(0, vitVar));
        new b(k6xVar, cVar).a();
        return ((FeedSdkComponent.Builder) eja1.g(FeedSdkComponent.Builder.class)).a(new xpq(xpqVar.a, xpqVar.b, xpqVar.c, new com.yandex.feedsdk.internal.safe.a(xpqVar.d), xpqVar.e, xpqVar.f, xpqVar.g, xpqVar.h, xpqVar.i, q5z.U(xpqVar.j, this.a), xpqVar.k, xpqVar.l, xpqVar.m, xpqVar.n, xpqVar.o, xpqVar.p, xpqVar.q, xpqVar.r, xpqVar.s, xpqVar.t, xpqVar.u, xpqVar.v, xpqVar.w, xpqVar.x, xpqVar.y, xpqVar.z, xpqVar.A, xpqVar.B, xpqVar.C, xpqVar.D, xpqVar.E, xpqVar.F, xpqVar.G, xpqVar.H, xpqVar.I, 0, 16), gqqVar, x4cVar, k6xVar);
    }
}
