package F;

import a.AbstractC0083a;
import l1.C0982b;

/* loaded from: classes.dex */
public final class o0 implements l1.g {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f539a;

    /* renamed from: b, reason: collision with root package name */
    public final P f540b;

    public o0(o0 o0Var, P instance) {
        kotlin.jvm.internal.i.e(instance, "instance");
        this.f539a = o0Var;
        this.f540b = instance;
    }

    @Override // l1.i
    public final l1.i c(l1.h hVar) {
        return AbstractC0083a.n(this, hVar);
    }

    public final void d(P p2) {
        if (this.f540b == p2) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        o0 o0Var = this.f539a;
        if (o0Var != null) {
            o0Var.d(p2);
        }
    }

    @Override // l1.g
    public final l1.h getKey() {
        return n0.f536a;
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
}
