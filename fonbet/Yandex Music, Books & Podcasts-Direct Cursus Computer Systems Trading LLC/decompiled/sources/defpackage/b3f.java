package defpackage;

/* loaded from: classes5.dex */
public final class b3f extends y2f {
    public final h3f e;
    public final c3f f;
    public final ij4 g;
    public final Object h;

    public b3f(h3f h3fVar, c3f c3fVar, ij4 ij4Var, Object obj) {
        this.e = h3fVar;
        this.f = c3fVar;
        this.g = ij4Var;
        this.h = obj;
    }

    @Override // defpackage.y2f
    public final boolean k() {
        return false;
    }

    @Override // defpackage.y2f
    public final void l(Throwable th) {
        ij4 ij4Var = this.g;
        ij4 Z = h3f.Z(ij4Var);
        h3f h3fVar = this.e;
        c3f c3fVar = this.f;
        Object obj = this.h;
        if (Z == null || !h3fVar.k0(c3fVar, Z, obj)) {
            c3fVar.a.e(new q8g(2), 2);
            ij4 Z2 = h3f.Z(ij4Var);
            if (Z2 == null || !h3fVar.k0(c3fVar, Z2, obj)) {
                h3fVar.p(h3fVar.B(c3fVar, obj));
            }
        }
    }
}
