package defpackage;

/* loaded from: classes4.dex */
public final class lu6 implements mu6 {
    public boolean a;
    public boolean b;

    public /* synthetic */ lu6(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.mu6
    public ru6 p(v2q v2qVar, v2q v2qVar2, boolean z) {
        boolean z2;
        v2qVar2.getClass();
        if (this.a && this.b && z && !nt0.t(v2qVar2, v2qVar) && (v2qVar2 instanceof u2q)) {
            u2q u2qVar = (u2q) v2qVar2;
            if (u2qVar.d) {
                gy1 gy1Var = u2qVar.c;
                u2q u2qVar2 = v2qVar instanceof u2q ? (u2q) v2qVar : null;
                if (gy1Var == (u2qVar2 != null ? u2qVar2.c : null)) {
                    z2 = true;
                    return new ru6(v2qVar2, v2qVar, z2);
                }
            }
        }
        z2 = false;
        return new ru6(v2qVar2, v2qVar, z2);
    }
}
