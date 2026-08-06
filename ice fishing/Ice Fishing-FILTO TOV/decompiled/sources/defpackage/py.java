package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
final class py extends me0 {
    public final boolean AvO7iQsrTN;
    public final z11 EljAMC1QTz;
    public final float GWasM1elztuh;
    public final long OOA6hdeuvCS;
    public final float X1lG3V04pd;
    public final float Yi7zF1RB1;
    public final long encWxUiV2;
    public final long mOu10nynGul;
    public final float xqGvceK5x;

    public py(float f, float f2, float f3, float f4, long j, z11 z11Var, boolean z, long j2, long j3) {
        this.GWasM1elztuh = f;
        this.Yi7zF1RB1 = f2;
        this.X1lG3V04pd = f3;
        this.xqGvceK5x = f4;
        this.OOA6hdeuvCS = j;
        this.EljAMC1QTz = z11Var;
        this.AvO7iQsrTN = z;
        this.encWxUiV2 = j2;
        this.mOu10nynGul = j3;
    }

    @Override // defpackage.me0
    public final void OOA6hdeuvCS(he0 he0Var) {
        bk0 bk0Var;
        n21 n21Var = (n21) he0Var;
        n21Var.mE4lRynR = this.GWasM1elztuh;
        n21Var.jivtDDk9H = this.Yi7zF1RB1;
        n21Var.Y6hRI1cF8 = this.X1lG3V04pd;
        n21Var.cilMamHF = this.xqGvceK5x;
        n21Var.lv06NcmrQ = 8.0f;
        n21Var.WdrkLMV3xh = this.OOA6hdeuvCS;
        n21Var.WRKkgoJXwDn = this.EljAMC1QTz;
        n21Var.arNh8D4Z5gB = this.AvO7iQsrTN;
        n21Var.pog2g9KITJA = this.encWxUiV2;
        n21Var.M3K9sHhK = this.mOu10nynGul;
        n21Var.k8h8IjolWQ = 3;
        NWXxPwoOUSX9 nWXxPwoOUSX9 = n21Var.EXrPz3p7hFb;
        if (n21Var.OOA6hdeuvCS.Mjvvu5DE && (bk0Var = vc0.AEn1Rrio(n21Var, 2).jivtDDk9H) != null) {
            bk0Var.wDCmwMuMZmB(nWXxPwoOUSX9, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof py)) {
            return false;
        }
        py pyVar = (py) obj;
        return Float.compare(this.GWasM1elztuh, pyVar.GWasM1elztuh) == 0 && Float.compare(this.Yi7zF1RB1, pyVar.Yi7zF1RB1) == 0 && Float.compare(this.X1lG3V04pd, pyVar.X1lG3V04pd) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.xqGvceK5x, pyVar.xqGvceK5x) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(8.0f, 8.0f) == 0 && ga1.GWasM1elztuh(this.OOA6hdeuvCS, pyVar.OOA6hdeuvCS) && o30.rQPn8YBR(this.EljAMC1QTz, pyVar.EljAMC1QTz) && this.AvO7iQsrTN == pyVar.AvO7iQsrTN && yb.X1lG3V04pd(this.encWxUiV2, pyVar.encWxUiV2) && yb.X1lG3V04pd(this.mOu10nynGul, pyVar.mOu10nynGul);
    }

    public final int hashCode() {
        int GWasM1elztuh = mr0.GWasM1elztuh(8.0f, mr0.GWasM1elztuh(0.0f, mr0.GWasM1elztuh(0.0f, mr0.GWasM1elztuh(0.0f, mr0.GWasM1elztuh(this.xqGvceK5x, mr0.GWasM1elztuh(0.0f, mr0.GWasM1elztuh(0.0f, mr0.GWasM1elztuh(this.X1lG3V04pd, mr0.GWasM1elztuh(this.Yi7zF1RB1, Float.hashCode(this.GWasM1elztuh) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = ga1.X1lG3V04pd;
        int xqGvceK5x = mr0.xqGvceK5x((this.EljAMC1QTz.hashCode() + mr0.X1lG3V04pd(GWasM1elztuh, 31, this.OOA6hdeuvCS)) * 31, 961, this.AvO7iQsrTN);
        int i2 = yb.encWxUiV2;
        return mr0.Yi7zF1RB1(3, mr0.Yi7zF1RB1(0, mr0.X1lG3V04pd(mr0.X1lG3V04pd(xqGvceK5x, 31, this.encWxUiV2), 31, this.mOu10nynGul), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.GWasM1elztuh);
        sb.append(", scaleY=");
        sb.append(this.Yi7zF1RB1);
        sb.append(", alpha=");
        sb.append(this.X1lG3V04pd);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.xqGvceK5x);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=");
        sb.append((Object) ga1.Yi7zF1RB1(this.OOA6hdeuvCS));
        sb.append(", shape=");
        sb.append(this.EljAMC1QTz);
        sb.append(", clip=");
        sb.append(this.AvO7iQsrTN);
        sb.append(", renderEffect=null, ambientShadowColor=");
        mr0.uFEq9NpZ(this.encWxUiV2, sb, ", spotShadowColor=");
        sb.append((Object) yb.mOu10nynGul(this.mOu10nynGul));
        sb.append(", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) n30.Uxq83abb04(3));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }

    @Override // defpackage.me0
    public final he0 xqGvceK5x() {
        n21 n21Var = new n21();
        n21Var.mE4lRynR = this.GWasM1elztuh;
        n21Var.jivtDDk9H = this.Yi7zF1RB1;
        n21Var.Y6hRI1cF8 = this.X1lG3V04pd;
        n21Var.cilMamHF = this.xqGvceK5x;
        n21Var.lv06NcmrQ = 8.0f;
        n21Var.WdrkLMV3xh = this.OOA6hdeuvCS;
        n21Var.WRKkgoJXwDn = this.EljAMC1QTz;
        n21Var.arNh8D4Z5gB = this.AvO7iQsrTN;
        n21Var.pog2g9KITJA = this.encWxUiV2;
        n21Var.M3K9sHhK = this.mOu10nynGul;
        n21Var.k8h8IjolWQ = 3;
        n21Var.EXrPz3p7hFb = new NWXxPwoOUSX9(19, n21Var);
        return n21Var;
    }
}
