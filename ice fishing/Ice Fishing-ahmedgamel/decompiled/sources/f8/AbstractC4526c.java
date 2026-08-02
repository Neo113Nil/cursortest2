package f8;

import D.G;
import i1.C4585b;

/* renamed from: f8.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4526c {

    /* renamed from: d, reason: collision with root package name */
    public static final C4525b f37500d = new C4525b(new j(false, true, "    ", "type", true, EnumC4524a.f37498n), h8.a.f38142a);

    /* renamed from: a, reason: collision with root package name */
    public final j f37501a;

    /* renamed from: b, reason: collision with root package name */
    public final G3.e f37502b;

    /* renamed from: c, reason: collision with root package name */
    public final C4585b f37503c = new C4585b(26);

    public AbstractC4526c(j jVar, G3.e eVar) {
        this.f37501a = jVar;
        this.f37502b = eVar;
    }

    public final l a(String string) {
        kotlin.jvm.internal.h.e(string, "string");
        p pVar = p.f37535a;
        G g9 = new G(string);
        Object E8 = new g8.p(this, g8.t.f37773v, g9, p.f37536b).E(pVar);
        if (g9.e() == 10) {
            return (l) E8;
        }
        G.n(g9, "Expected EOF after parsing, but had " + string.charAt(g9.f333u - 1) + " instead", 0, 6);
        throw null;
    }
}
