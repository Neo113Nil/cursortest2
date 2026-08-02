package defpackage;

import com.connectsdk.service.NetcastTVService;

/* loaded from: classes3.dex */
public final class y82 implements rhj {
    public static final y82 a = new y82();
    public static final d9c b = new d9c("projectNumber", vz1.y(vz1.x(xym.class, new xt1(1))));
    public static final d9c c = new d9c("messageId", vz1.y(vz1.x(xym.class, new xt1(2))));
    public static final d9c d = new d9c("instanceId", vz1.y(vz1.x(xym.class, new xt1(3))));
    public static final d9c e = new d9c("messageType", vz1.y(vz1.x(xym.class, new xt1(4))));
    public static final d9c f = new d9c("sdkPlatform", vz1.y(vz1.x(xym.class, new xt1(5))));
    public static final d9c g = new d9c("packageName", vz1.y(vz1.x(xym.class, new xt1(6))));
    public static final d9c h = new d9c("collapseKey", vz1.y(vz1.x(xym.class, new xt1(7))));
    public static final d9c i = new d9c("priority", vz1.y(vz1.x(xym.class, new xt1(8))));
    public static final d9c j = new d9c("ttl", vz1.y(vz1.x(xym.class, new xt1(9))));
    public static final d9c k = new d9c("topic", vz1.y(vz1.x(xym.class, new xt1(10))));
    public static final d9c l = new d9c("bulkId", vz1.y(vz1.x(xym.class, new xt1(11))));
    public static final d9c m = new d9c(NetcastTVService.UDAP_API_EVENT, vz1.y(vz1.x(xym.class, new xt1(12))));
    public static final d9c n = new d9c("analyticsLabel", vz1.y(vz1.x(xym.class, new xt1(13))));
    public static final d9c o = new d9c("campaignId", vz1.y(vz1.x(xym.class, new xt1(14))));
    public static final d9c p = new d9c("composerLabel", vz1.y(vz1.x(xym.class, new xt1(15))));

    @Override // defpackage.j6b
    public final void a(Object obj, Object obj2) {
        f0i f0iVar = (f0i) obj;
        shj shjVar = (shj) obj2;
        shjVar.g(b, f0iVar.a);
        shjVar.a(c, f0iVar.b);
        shjVar.a(d, f0iVar.c);
        shjVar.a(e, f0iVar.d);
        shjVar.a(f, e0i.ANDROID);
        shjVar.a(g, f0iVar.e);
        shjVar.a(h, f0iVar.f);
        shjVar.e(i, 0);
        shjVar.e(j, f0iVar.g);
        shjVar.a(k, f0iVar.h);
        shjVar.g(l, 0L);
        shjVar.a(m, c0i.MESSAGE_DELIVERED);
        shjVar.a(n, f0iVar.i);
        shjVar.g(o, 0L);
        shjVar.a(p, f0iVar.j);
    }
}
