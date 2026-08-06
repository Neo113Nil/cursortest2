package l1;

import a.AbstractC0083a;
import t1.p;

/* renamed from: l1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0981a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final h f8133a;

    public AbstractC0981a(h hVar) {
        this.f8133a = hVar;
    }

    @Override // l1.i
    public i c(h hVar) {
        return AbstractC0083a.n(this, hVar);
    }

    @Override // l1.g
    public final h getKey() {
        return this.f8133a;
    }

    @Override // l1.i
    public final Object k(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // l1.i
    public final i l(i context) {
        kotlin.jvm.internal.i.e(context, "context");
        return context == j.f8138a ? this : (i) context.k(this, new C0982b(1));
    }

    @Override // l1.i
    public g m(h hVar) {
        return AbstractC0083a.j(this, hVar);
    }
}
