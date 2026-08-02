package defpackage;

/* loaded from: classes3.dex */
public final class uxd extends jt2 {
    public final o4s g;

    public uxd(f7l f7lVar, f5s f5sVar, t5s t5sVar, vx2 vx2Var, o4s o4sVar, z66 z66Var) {
        super(f7lVar, f5sVar, t5sVar, vx2Var, z66Var);
        this.g = o4sVar;
    }

    @Override // defpackage.jt2
    public final boolean a(boolean z, sx2 sx2Var, boolean z2, long j, boolean z3, boolean z4) {
        sx2Var.getClass();
        if (z3) {
            return true;
        }
        this.g.getClass();
        return !o4s.b() || !o4s.d() || sx2Var.b || sx2Var.a > o4s.a() || System.currentTimeMillis() < j;
    }
}
