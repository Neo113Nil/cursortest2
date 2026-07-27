package D;

/* loaded from: classes.dex */
public final class q0 implements v0.g {

    /* renamed from: f, reason: collision with root package name */
    public final q0 f254f;

    /* renamed from: g, reason: collision with root package name */
    public final S f255g;

    public q0(q0 q0Var, S s2) {
        E0.i.e(s2, "instance");
        this.f254f = q0Var;
        this.f255g = s2;
    }

    public final void c(S s2) {
        if (this.f255g == s2) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        q0 q0Var = this.f254f;
        if (q0Var != null) {
            q0Var.c(s2);
        }
    }

    @Override // v0.i
    public final v0.i f(v0.i iVar) {
        E0.i.e(iVar, "context");
        return iVar == v0.j.f3009f ? this : (v0.i) iVar.m(this, new v0.b(1));
    }

    @Override // v0.i
    public final v0.i g(v0.h hVar) {
        return o.g.x(this, hVar);
    }

    @Override // v0.g
    public final v0.h getKey() {
        return p0.f252f;
    }

    @Override // v0.i
    public final v0.g i(v0.h hVar) {
        return o.g.p(this, hVar);
    }

    @Override // v0.i
    public final Object m(Object obj, D0.p pVar) {
        return pVar.f(obj, this);
    }
}
