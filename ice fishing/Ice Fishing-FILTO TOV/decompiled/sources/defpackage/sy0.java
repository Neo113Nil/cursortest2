package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class sy0 implements zx0 {
    public final /* synthetic */ wy0 GWasM1elztuh;
    public final /* synthetic */ uy0 Yi7zF1RB1;

    public sy0(wy0 wy0Var, uy0 uy0Var) {
        this.GWasM1elztuh = wy0Var;
        this.Yi7zF1RB1 = uy0Var;
    }

    @Override // defpackage.zx0
    public final float GWasM1elztuh(float f) {
        float abs = Math.abs(f);
        wy0 wy0Var = this.GWasM1elztuh;
        if (abs != 0.0f && !((Boolean) wy0Var.encWxUiV2.GWasM1elztuh()).booleanValue()) {
            throw new es("The fling animation was cancelled", 0);
        }
        return wy0Var.xqGvceK5x(wy0Var.AvO7iQsrTN(this.Yi7zF1RB1.GWasM1elztuh(2, wy0Var.OOA6hdeuvCS(wy0Var.encWxUiV2(f)))));
    }
}
