package l4;

import a4.C0437a;
import m4.C4746d;
import m4.EnumC4743a;
import m4.EnumC4745c;

/* renamed from: l4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4675a implements X3.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C4675a f38895a = new C4675a();

    /* renamed from: b, reason: collision with root package name */
    public static final X3.c f38896b = new X3.c("projectNumber", D.x.r(D.x.q(a4.e.class, new C0437a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final X3.c f38897c = new X3.c("messageId", D.x.r(D.x.q(a4.e.class, new C0437a(2))));

    /* renamed from: d, reason: collision with root package name */
    public static final X3.c f38898d = new X3.c("instanceId", D.x.r(D.x.q(a4.e.class, new C0437a(3))));

    /* renamed from: e, reason: collision with root package name */
    public static final X3.c f38899e = new X3.c("messageType", D.x.r(D.x.q(a4.e.class, new C0437a(4))));

    /* renamed from: f, reason: collision with root package name */
    public static final X3.c f38900f = new X3.c("sdkPlatform", D.x.r(D.x.q(a4.e.class, new C0437a(5))));

    /* renamed from: g, reason: collision with root package name */
    public static final X3.c f38901g = new X3.c("packageName", D.x.r(D.x.q(a4.e.class, new C0437a(6))));

    /* renamed from: h, reason: collision with root package name */
    public static final X3.c f38902h = new X3.c("collapseKey", D.x.r(D.x.q(a4.e.class, new C0437a(7))));
    public static final X3.c i = new X3.c("priority", D.x.r(D.x.q(a4.e.class, new C0437a(8))));

    /* renamed from: j, reason: collision with root package name */
    public static final X3.c f38903j = new X3.c("ttl", D.x.r(D.x.q(a4.e.class, new C0437a(9))));

    /* renamed from: k, reason: collision with root package name */
    public static final X3.c f38904k = new X3.c("topic", D.x.r(D.x.q(a4.e.class, new C0437a(10))));

    /* renamed from: l, reason: collision with root package name */
    public static final X3.c f38905l = new X3.c("bulkId", D.x.r(D.x.q(a4.e.class, new C0437a(11))));

    /* renamed from: m, reason: collision with root package name */
    public static final X3.c f38906m = new X3.c("event", D.x.r(D.x.q(a4.e.class, new C0437a(12))));

    /* renamed from: n, reason: collision with root package name */
    public static final X3.c f38907n = new X3.c("analyticsLabel", D.x.r(D.x.q(a4.e.class, new C0437a(13))));

    /* renamed from: o, reason: collision with root package name */
    public static final X3.c f38908o = new X3.c("campaignId", D.x.r(D.x.q(a4.e.class, new C0437a(14))));

    /* renamed from: p, reason: collision with root package name */
    public static final X3.c f38909p = new X3.c("composerLabel", D.x.r(D.x.q(a4.e.class, new C0437a(15))));

    @Override // X3.a
    public final void a(Object obj, Object obj2) {
        C4746d c4746d = (C4746d) obj;
        X3.e eVar = (X3.e) obj2;
        eVar.b(f38896b, c4746d.f39453a);
        eVar.a(f38897c, c4746d.f39454b);
        eVar.a(f38898d, c4746d.f39455c);
        eVar.a(f38899e, c4746d.f39456d);
        eVar.a(f38900f, EnumC4745c.ANDROID);
        eVar.a(f38901g, c4746d.f39457e);
        eVar.a(f38902h, c4746d.f39458f);
        eVar.c(i, 0);
        eVar.c(f38903j, c4746d.f39459g);
        eVar.a(f38904k, c4746d.f39460h);
        eVar.b(f38905l, 0L);
        eVar.a(f38906m, EnumC4743a.MESSAGE_DELIVERED);
        eVar.a(f38907n, c4746d.i);
        eVar.b(f38908o, 0L);
        eVar.a(f38909p, c4746d.f39461j);
    }
}
