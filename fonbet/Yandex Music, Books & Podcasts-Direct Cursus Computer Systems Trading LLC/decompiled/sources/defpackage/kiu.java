package defpackage;

/* loaded from: classes.dex */
public abstract class kiu extends fxd {
    public int w0 = 0;
    public int x0 = 0;
    public int y0 = 0;
    public int z0 = 0;
    public int A0 = 0;
    public int B0 = 0;
    public boolean C0 = false;
    public int D0 = 0;
    public int E0 = 0;
    public final fv2 F0 = new fv2();
    public awm G0 = null;

    @Override // defpackage.fxd
    public final void U() {
        for (int i = 0; i < this.v0; i++) {
            aa6 aa6Var = this.u0[i];
            if (aa6Var != null) {
                aa6Var.G = true;
            }
        }
    }

    public abstract void V(int i, int i2, int i3, int i4);

    public final void W(aa6 aa6Var, z96 z96Var, int i, z96 z96Var2, int i2) {
        awm awmVar;
        aa6 aa6Var2;
        while (true) {
            awmVar = this.G0;
            if (awmVar != null || (aa6Var2 = this.V) == null) {
                break;
            } else {
                this.G0 = ((ba6) aa6Var2).y0;
            }
        }
        fv2 fv2Var = this.F0;
        fv2Var.a = z96Var;
        fv2Var.b = z96Var2;
        fv2Var.c = i;
        fv2Var.d = i2;
        awmVar.d(aa6Var, fv2Var);
        aa6Var.P(fv2Var.e);
        aa6Var.M(fv2Var.f);
        aa6Var.E = fv2Var.h;
        aa6Var.J(fv2Var.g);
    }
}
