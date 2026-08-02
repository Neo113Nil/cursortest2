package defpackage;

/* loaded from: classes9.dex */
public final class xb4 implements rv7 {
    public final vb4[] a;

    public xb4(vb4[] vb4VarArr) {
        this.a = vb4VarArr;
    }

    @Override // defpackage.rv7
    public final void a(Throwable th) {
        b();
    }

    public final void b() {
        for (vb4 vb4Var : this.a) {
            m1k m1kVar = vb4Var.B;
            if (m1kVar == null) {
                m1kVar = null;
            }
            m1kVar.dispose();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + ']';
    }
}
