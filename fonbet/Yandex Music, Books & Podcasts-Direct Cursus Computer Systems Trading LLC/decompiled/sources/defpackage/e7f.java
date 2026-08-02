package defpackage;

/* loaded from: classes5.dex */
public abstract class e7f implements t9f {
    public final t9f a;

    public e7f(t9f t9fVar) {
        t9fVar.getClass();
        this.a = t9fVar;
    }

    public abstract w4f a(w4f w4fVar);

    public w4f b(w4f w4fVar) {
        w4fVar.getClass();
        return w4fVar;
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        s4f r = ltg.r(eg7Var);
        return r.d().a(this.a, a(r.f()));
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return this.a.getDescriptor();
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        l6bVar.getClass();
        b5f s = ltg.s(l6bVar);
        s.D(b(t7g.S(s.d(), obj, this.a)));
    }
}
