package f8;

import D.H;
import g1.C4523c;

/* renamed from: f8.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4516c {

    /* renamed from: d, reason: collision with root package name */
    public static final C4515b f37538d = new C4515b(new j(false, true, "    ", "type", true, EnumC4514a.f37536n), h8.a.f38025a);

    /* renamed from: a, reason: collision with root package name */
    public final j f37539a;

    /* renamed from: b, reason: collision with root package name */
    public final M2.i f37540b;

    /* renamed from: c, reason: collision with root package name */
    public final C4523c f37541c = new C4523c(21);

    public AbstractC4516c(j jVar, M2.i iVar) {
        this.f37539a = jVar;
        this.f37540b = iVar;
    }

    public final l a(String string) {
        kotlin.jvm.internal.h.e(string, "string");
        p pVar = p.f37573a;
        H h9 = new H(string);
        Object D8 = new g8.p(this, g8.t.f37747v, h9, p.f37574b).D(pVar);
        if (h9.e() == 10) {
            return (l) D8;
        }
        H.m(h9, "Expected EOF after parsing, but had " + string.charAt(h9.f436u - 1) + " instead", 0, 6);
        throw null;
    }
}
