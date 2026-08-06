package defpackage;

/* loaded from: classes.dex */
public final class ko extends defpackage.od {
    public final /* synthetic */ defpackage.lo AARZUJiTa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko(defpackage.lo loVar) {
        super(1);
        this.AARZUJiTa = loVar;
    }

    @Override // defpackage.od
    public final defpackage.ro1 AARZUJiTa(defpackage.ro1 ro1Var, java.util.List list) {
        defpackage.lo loVar = this.AARZUJiTa;
        if (!loVar.G3OKOH3wZRC) {
            android.view.View childAt = loVar.getChildAt(0);
            int max = java.lang.Math.max(0, childAt.getLeft());
            int max2 = java.lang.Math.max(0, childAt.getTop());
            int max3 = java.lang.Math.max(0, loVar.getWidth() - childAt.getRight());
            int max4 = java.lang.Math.max(0, loVar.getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return ro1Var.IHQe1A4L2xu.G3OKOH3wZRC(max, max2, max3, max4);
            }
        }
        return ro1Var;
    }

    @Override // defpackage.od
    public final defpackage.F7NU4MC0GW EXtogiMhuM(defpackage.wn1 wn1Var, defpackage.F7NU4MC0GW f7nu4mc0gw) {
        defpackage.lo loVar = this.AARZUJiTa;
        if (!loVar.G3OKOH3wZRC) {
            android.view.View childAt = loVar.getChildAt(0);
            int max = java.lang.Math.max(0, childAt.getLeft());
            int max2 = java.lang.Math.max(0, childAt.getTop());
            int max3 = java.lang.Math.max(0, loVar.getWidth() - childAt.getRight());
            int max4 = java.lang.Math.max(0, loVar.getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                defpackage.i60 oh6vYeIP = defpackage.i60.oh6vYeIP(max, max2, max3, max4);
                int i = oh6vYeIP.IHQe1A4L2xu;
                defpackage.i60 i60Var = (defpackage.i60) f7nu4mc0gw.xiZrDbcSW0;
                int i2 = oh6vYeIP.oh6vYeIP;
                int i3 = oh6vYeIP.r1MBDhnF;
                int i4 = oh6vYeIP.F7NU4MC0GW;
                return new defpackage.F7NU4MC0GW(29, defpackage.ro1.IHQe1A4L2xu(i60Var, i, i2, i3, i4), defpackage.ro1.IHQe1A4L2xu((defpackage.i60) f7nu4mc0gw.AARZUJiTa, i, i2, i3, i4));
            }
        }
        return f7nu4mc0gw;
    }
}
