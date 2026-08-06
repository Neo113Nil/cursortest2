package defpackage;

/* loaded from: classes.dex */
public final class bs0 extends defpackage.gs0 {
    public static final defpackage.bs0 r1MBDhnF = new defpackage.bs0(1, 0, 2);

    @Override // defpackage.gs0
    public final void IHQe1A4L2xu(defpackage.pd pdVar, defpackage.b6 b6Var, defpackage.ia1 ia1Var, defpackage.v01 v01Var, defpackage.hs0 hs0Var) {
        int oh6vYeIP = pdVar.oh6vYeIP(0);
        int i = ia1Var.V7bD7b8KA;
        int Uv8CGu3G = ia1Var.Uv8CGu3G(ia1Var.oh6vYeIP, ia1Var.kd6TUFXn(i));
        int AARZUJiTa = ia1Var.AARZUJiTa(ia1Var.oh6vYeIP, ia1Var.kd6TUFXn(i + 1));
        for (int max = java.lang.Math.max(Uv8CGu3G, AARZUJiTa - oh6vYeIP); max < AARZUJiTa; max++) {
            java.lang.Object obj = ia1Var.r1MBDhnF[ia1Var.EXtogiMhuM(max)];
            if (obj instanceof defpackage.x10) {
                v01Var.adDC3e2L((defpackage.x10) obj);
            } else if (obj instanceof defpackage.az0) {
                ((defpackage.az0) obj).r1MBDhnF();
            }
        }
        if (oh6vYeIP <= 0) {
            defpackage.dh.IHQe1A4L2xu("Check failed");
        }
        int i2 = ia1Var.V7bD7b8KA;
        int Uv8CGu3G2 = ia1Var.Uv8CGu3G(ia1Var.oh6vYeIP, ia1Var.kd6TUFXn(i2));
        int AARZUJiTa2 = ia1Var.AARZUJiTa(ia1Var.oh6vYeIP, ia1Var.kd6TUFXn(i2 + 1)) - oh6vYeIP;
        if (AARZUJiTa2 < Uv8CGu3G2) {
            defpackage.dh.IHQe1A4L2xu("Check failed");
        }
        ia1Var.wll2JLbTBC2(AARZUJiTa2, oh6vYeIP, i2);
        int i3 = ia1Var.riuEU0zW4;
        if (i3 >= Uv8CGu3G2) {
            ia1Var.riuEU0zW4 = i3 - oh6vYeIP;
        }
    }
}
