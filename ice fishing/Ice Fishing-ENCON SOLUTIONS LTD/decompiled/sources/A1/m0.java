package A1;

import a.AbstractC0083a;
import l1.C0982b;

/* loaded from: classes.dex */
public final class m0 implements l1.g, l1.h {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f60a = new m0();

    @Override // l1.i
    public final l1.i c(l1.h hVar) {
        return AbstractC0083a.n(this, hVar);
    }

    @Override // l1.i
    public final Object k(Object obj, t1.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // l1.i
    public final l1.i l(l1.i context) {
        kotlin.jvm.internal.i.e(context, "context");
        return context == l1.j.f8138a ? this : (l1.i) context.k(this, new C0982b(1));
    }

    @Override // l1.i
    public final l1.g m(l1.h hVar) {
        return AbstractC0083a.j(this, hVar);
    }

    @Override // l1.g
    public final l1.h getKey() {
        return this;
    }
}
