package defpackage;

/* loaded from: classes.dex */
public final class e61 implements defpackage.l51 {
    public final /* synthetic */ defpackage.i61 IHQe1A4L2xu;
    public final /* synthetic */ defpackage.g61 oh6vYeIP;

    public e61(defpackage.i61 i61Var, defpackage.g61 g61Var) {
        this.IHQe1A4L2xu = i61Var;
        this.oh6vYeIP = g61Var;
    }

    @Override // defpackage.l51
    public final float IHQe1A4L2xu(float f) {
        float abs = java.lang.Math.abs(f);
        defpackage.i61 i61Var = this.IHQe1A4L2xu;
        if (abs != 0.0f && !((java.lang.Boolean) i61Var.EXtogiMhuM.IHQe1A4L2xu()).booleanValue()) {
            throw new defpackage.aw("The fling animation was cancelled", 0);
        }
        return i61Var.F7NU4MC0GW(i61Var.AARZUJiTa(this.oh6vYeIP.IHQe1A4L2xu(2, i61Var.adDC3e2L(i61Var.EXtogiMhuM(f)))));
    }
}
