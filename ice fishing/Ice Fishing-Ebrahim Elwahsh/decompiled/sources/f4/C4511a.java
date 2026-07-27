package f4;

import g4.EnumC4528a;

/* renamed from: f4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4511a implements R3.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C4511a f37716a = new C4511a();

    /* renamed from: b, reason: collision with root package name */
    public static final R3.c f37717b = new R3.c("projectNumber", D.y.q(D.y.p(U3.e.class, new U3.a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final R3.c f37718c = new R3.c("messageId", D.y.q(D.y.p(U3.e.class, new U3.a(2))));

    /* renamed from: d, reason: collision with root package name */
    public static final R3.c f37719d = new R3.c("instanceId", D.y.q(D.y.p(U3.e.class, new U3.a(3))));

    /* renamed from: e, reason: collision with root package name */
    public static final R3.c f37720e = new R3.c("messageType", D.y.q(D.y.p(U3.e.class, new U3.a(4))));

    /* renamed from: f, reason: collision with root package name */
    public static final R3.c f37721f = new R3.c("sdkPlatform", D.y.q(D.y.p(U3.e.class, new U3.a(5))));

    /* renamed from: g, reason: collision with root package name */
    public static final R3.c f37722g = new R3.c("packageName", D.y.q(D.y.p(U3.e.class, new U3.a(6))));

    /* renamed from: h, reason: collision with root package name */
    public static final R3.c f37723h = new R3.c("collapseKey", D.y.q(D.y.p(U3.e.class, new U3.a(7))));
    public static final R3.c i = new R3.c("priority", D.y.q(D.y.p(U3.e.class, new U3.a(8))));

    /* renamed from: j, reason: collision with root package name */
    public static final R3.c f37724j = new R3.c("ttl", D.y.q(D.y.p(U3.e.class, new U3.a(9))));

    /* renamed from: k, reason: collision with root package name */
    public static final R3.c f37725k = new R3.c("topic", D.y.q(D.y.p(U3.e.class, new U3.a(10))));

    /* renamed from: l, reason: collision with root package name */
    public static final R3.c f37726l = new R3.c("bulkId", D.y.q(D.y.p(U3.e.class, new U3.a(11))));

    /* renamed from: m, reason: collision with root package name */
    public static final R3.c f37727m = new R3.c("event", D.y.q(D.y.p(U3.e.class, new U3.a(12))));

    /* renamed from: n, reason: collision with root package name */
    public static final R3.c f37728n = new R3.c("analyticsLabel", D.y.q(D.y.p(U3.e.class, new U3.a(13))));

    /* renamed from: o, reason: collision with root package name */
    public static final R3.c f37729o = new R3.c("campaignId", D.y.q(D.y.p(U3.e.class, new U3.a(14))));

    /* renamed from: p, reason: collision with root package name */
    public static final R3.c f37730p = new R3.c("composerLabel", D.y.q(D.y.p(U3.e.class, new U3.a(15))));

    @Override // R3.a
    public final void a(Object obj, Object obj2) {
        g4.d dVar = (g4.d) obj;
        R3.e eVar = (R3.e) obj2;
        eVar.c(f37717b, dVar.f37910a);
        eVar.a(f37718c, dVar.f37911b);
        eVar.a(f37719d, dVar.f37912c);
        eVar.a(f37720e, dVar.f37913d);
        eVar.a(f37721f, g4.c.ANDROID);
        eVar.a(f37722g, dVar.f37914e);
        eVar.a(f37723h, dVar.f37915f);
        eVar.b(i, 0);
        eVar.b(f37724j, dVar.f37916g);
        eVar.a(f37725k, dVar.f37917h);
        eVar.c(f37726l, 0L);
        eVar.a(f37727m, EnumC4528a.MESSAGE_DELIVERED);
        eVar.a(f37728n, dVar.i);
        eVar.c(f37729o, 0L);
        eVar.a(f37730p, dVar.f37918j);
    }
}
