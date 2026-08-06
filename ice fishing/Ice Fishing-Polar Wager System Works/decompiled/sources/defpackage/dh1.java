package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class dh1 implements defpackage.g00 {
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ java.lang.Object xiZrDbcSW0;

    public /* synthetic */ dh1(int i, java.lang.Object obj) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = obj;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        boolean isToggle;
        java.lang.Boolean bool;
        boolean z;
        boolean toggleValue;
        int i = this.adDC3e2L;
        java.lang.Object obj2 = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                defpackage.n71 n71Var = (defpackage.n71) obj2;
                defpackage.h2 h2Var = (defpackage.h2) obj;
                isToggle = h2Var.IHQe1A4L2xu.isToggle();
                if (isToggle) {
                    toggleValue = h2Var.IHQe1A4L2xu.getToggleValue();
                    bool = java.lang.Boolean.valueOf(toggleValue);
                } else {
                    bool = null;
                }
                if (bool != null) {
                    defpackage.fh1 fh1Var = bool.booleanValue() ? defpackage.fh1.adDC3e2L : defpackage.fh1.xiZrDbcSW0;
                    defpackage.j90[] j90VarArr = defpackage.l71.IHQe1A4L2xu;
                    defpackage.m71 m71Var = defpackage.j71.yIx6ChFVk;
                    defpackage.j90 j90Var = defpackage.l71.IHQe1A4L2xu[26];
                    n71Var.IHQe1A4L2xu(m71Var, fh1Var);
                    z = true;
                } else {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            default:
                ((defpackage.iq) obj).getClass();
                return new defpackage.r1(5, (defpackage.bh1) obj2);
        }
    }
}
