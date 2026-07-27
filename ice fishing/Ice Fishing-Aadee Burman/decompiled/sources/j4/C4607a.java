package j4;

import k4.EnumC4633a;

/* renamed from: j4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4607a implements V3.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C4607a f38383a = new C4607a();

    /* renamed from: b, reason: collision with root package name */
    public static final V3.c f38384b = new V3.c("projectNumber", D.y.u(D.y.t(Y3.e.class, new Y3.a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final V3.c f38385c = new V3.c("messageId", D.y.u(D.y.t(Y3.e.class, new Y3.a(2))));

    /* renamed from: d, reason: collision with root package name */
    public static final V3.c f38386d = new V3.c("instanceId", D.y.u(D.y.t(Y3.e.class, new Y3.a(3))));

    /* renamed from: e, reason: collision with root package name */
    public static final V3.c f38387e = new V3.c("messageType", D.y.u(D.y.t(Y3.e.class, new Y3.a(4))));

    /* renamed from: f, reason: collision with root package name */
    public static final V3.c f38388f = new V3.c("sdkPlatform", D.y.u(D.y.t(Y3.e.class, new Y3.a(5))));

    /* renamed from: g, reason: collision with root package name */
    public static final V3.c f38389g = new V3.c("packageName", D.y.u(D.y.t(Y3.e.class, new Y3.a(6))));

    /* renamed from: h, reason: collision with root package name */
    public static final V3.c f38390h = new V3.c("collapseKey", D.y.u(D.y.t(Y3.e.class, new Y3.a(7))));
    public static final V3.c i = new V3.c("priority", D.y.u(D.y.t(Y3.e.class, new Y3.a(8))));

    /* renamed from: j, reason: collision with root package name */
    public static final V3.c f38391j = new V3.c("ttl", D.y.u(D.y.t(Y3.e.class, new Y3.a(9))));

    /* renamed from: k, reason: collision with root package name */
    public static final V3.c f38392k = new V3.c("topic", D.y.u(D.y.t(Y3.e.class, new Y3.a(10))));

    /* renamed from: l, reason: collision with root package name */
    public static final V3.c f38393l = new V3.c("bulkId", D.y.u(D.y.t(Y3.e.class, new Y3.a(11))));

    /* renamed from: m, reason: collision with root package name */
    public static final V3.c f38394m = new V3.c("event", D.y.u(D.y.t(Y3.e.class, new Y3.a(12))));

    /* renamed from: n, reason: collision with root package name */
    public static final V3.c f38395n = new V3.c("analyticsLabel", D.y.u(D.y.t(Y3.e.class, new Y3.a(13))));

    /* renamed from: o, reason: collision with root package name */
    public static final V3.c f38396o = new V3.c("campaignId", D.y.u(D.y.t(Y3.e.class, new Y3.a(14))));

    /* renamed from: p, reason: collision with root package name */
    public static final V3.c f38397p = new V3.c("composerLabel", D.y.u(D.y.t(Y3.e.class, new Y3.a(15))));

    @Override // V3.a
    public final void a(Object obj, Object obj2) {
        k4.d dVar = (k4.d) obj;
        V3.e eVar = (V3.e) obj2;
        eVar.a(f38384b, dVar.f38664a);
        eVar.c(f38385c, dVar.f38665b);
        eVar.c(f38386d, dVar.f38666c);
        eVar.c(f38387e, dVar.f38667d);
        eVar.c(f38388f, k4.c.ANDROID);
        eVar.c(f38389g, dVar.f38668e);
        eVar.c(f38390h, dVar.f38669f);
        eVar.b(i, 0);
        eVar.b(f38391j, dVar.f38670g);
        eVar.c(f38392k, dVar.f38671h);
        eVar.a(f38393l, 0L);
        eVar.c(f38394m, EnumC4633a.MESSAGE_DELIVERED);
        eVar.c(f38395n, dVar.i);
        eVar.a(f38396o, 0L);
        eVar.c(f38397p, dVar.f38672j);
    }
}
