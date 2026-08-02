package defpackage;

/* loaded from: classes3.dex */
public final class tgj extends z3f {
    public final z3f a;

    public tgj(z3f z3fVar) {
        this.a = z3fVar;
    }

    @Override // defpackage.z3f
    public final Object a(l7f l7fVar) {
        if (l7fVar.peek() != 9) {
            return this.a.a(l7fVar);
        }
        l7fVar.u0();
        return null;
    }

    @Override // defpackage.z3f
    public final void e(n7f n7fVar, Object obj) {
        if (obj == null) {
            n7fVar.D();
        } else {
            this.a.e(n7fVar, obj);
        }
    }

    public final String toString() {
        return this.a + ".nullSafe()";
    }
}
