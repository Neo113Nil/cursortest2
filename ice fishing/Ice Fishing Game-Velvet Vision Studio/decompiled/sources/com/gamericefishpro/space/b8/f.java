package com.gamericefishpro.space.b8;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements com.gamericefishpro.space.gb.d {
    public static final f a = new f();
    public static final com.gamericefishpro.space.gb.c b = com.gamericefishpro.space.gb.c.a("requestTimeMs");
    public static final com.gamericefishpro.space.gb.c c = com.gamericefishpro.space.gb.c.a("requestUptimeMs");
    public static final com.gamericefishpro.space.gb.c d = com.gamericefishpro.space.gb.c.a("clientInfo");
    public static final com.gamericefishpro.space.gb.c e = com.gamericefishpro.space.gb.c.a("logSource");
    public static final com.gamericefishpro.space.gb.c f = com.gamericefishpro.space.gb.c.a("logSourceName");
    public static final com.gamericefishpro.space.gb.c g = com.gamericefishpro.space.gb.c.a("logEvent");
    public static final com.gamericefishpro.space.gb.c h = com.gamericefishpro.space.gb.c.a("qosTier");

    @Override // com.gamericefishpro.space.gb.a
    public final void a(Object obj, Object obj2) {
        com.gamericefishpro.space.gb.e eVar = (com.gamericefishpro.space.gb.e) obj2;
        m mVar = (m) ((t) obj);
        eVar.e(b, mVar.a);
        eVar.e(c, mVar.b);
        eVar.a(d, mVar.c);
        eVar.a(e, mVar.d);
        eVar.a(f, mVar.e);
        eVar.a(g, mVar.f);
        eVar.a(h, x.d);
    }
}
