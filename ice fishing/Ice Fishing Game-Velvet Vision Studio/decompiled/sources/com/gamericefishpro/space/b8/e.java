package com.gamericefishpro.space.b8;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements com.gamericefishpro.space.gb.d {
    public static final e a = new e();
    public static final com.gamericefishpro.space.gb.c b = com.gamericefishpro.space.gb.c.a("eventTimeMs");
    public static final com.gamericefishpro.space.gb.c c = com.gamericefishpro.space.gb.c.a("eventCode");
    public static final com.gamericefishpro.space.gb.c d = com.gamericefishpro.space.gb.c.a("eventUptimeMs");
    public static final com.gamericefishpro.space.gb.c e = com.gamericefishpro.space.gb.c.a("sourceExtension");
    public static final com.gamericefishpro.space.gb.c f = com.gamericefishpro.space.gb.c.a("sourceExtensionJsonProto3");
    public static final com.gamericefishpro.space.gb.c g = com.gamericefishpro.space.gb.c.a("timezoneOffsetSeconds");
    public static final com.gamericefishpro.space.gb.c h = com.gamericefishpro.space.gb.c.a("networkConnectionInfo");

    @Override // com.gamericefishpro.space.gb.a
    public final void a(Object obj, Object obj2) {
        com.gamericefishpro.space.gb.e eVar = (com.gamericefishpro.space.gb.e) obj2;
        l lVar = (l) ((s) obj);
        eVar.e(b, lVar.a);
        eVar.a(c, lVar.b);
        eVar.e(d, lVar.c);
        eVar.a(e, lVar.d);
        eVar.a(f, lVar.e);
        eVar.e(g, lVar.f);
        eVar.a(h, lVar.g);
    }
}
