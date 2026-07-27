package b8;

import D.H;

/* renamed from: b8.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0534c {

    /* renamed from: d, reason: collision with root package name */
    public static final C0533b f5582d = new C0533b(new j(false, true, "    ", "type", true, EnumC0532a.f5580n), d8.a.f37208a);

    /* renamed from: a, reason: collision with root package name */
    public final j f5583a;

    /* renamed from: b, reason: collision with root package name */
    public final C3.e f5584b;

    /* renamed from: c, reason: collision with root package name */
    public final h4.c f5585c = new h4.c(18);

    public AbstractC0534c(j jVar, C3.e eVar) {
        this.f5583a = jVar;
        this.f5584b = eVar;
    }

    public final l a(String string) {
        kotlin.jvm.internal.h.e(string, "string");
        p pVar = p.f5617a;
        H h9 = new H(string);
        Object H6 = new c8.q(this, c8.u.f5805v, h9, p.f5618b).H(pVar);
        if (h9.e() == 10) {
            return (l) H6;
        }
        H.n(h9, "Expected EOF after parsing, but had " + string.charAt(h9.f491u - 1) + " instead", 0, 6);
        throw null;
    }
}
