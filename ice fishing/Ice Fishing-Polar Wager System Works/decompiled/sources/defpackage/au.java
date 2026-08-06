package defpackage;

/* loaded from: classes.dex */
public final class au extends defpackage.p90 implements defpackage.g00 {
    public final /* synthetic */ defpackage.bu AARZUJiTa;
    public final /* synthetic */ int xiZrDbcSW0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ au(defpackage.bu buVar, int i) {
        super(1);
        this.xiZrDbcSW0 = i;
        this.AARZUJiTa = buVar;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        int i = this.xiZrDbcSW0;
        defpackage.st stVar = defpackage.st.AARZUJiTa;
        defpackage.st stVar2 = defpackage.st.xiZrDbcSW0;
        defpackage.st stVar3 = defpackage.st.adDC3e2L;
        defpackage.bu buVar = this.AARZUJiTa;
        switch (i) {
            case 0:
                defpackage.hi1 hi1Var = (defpackage.hi1) obj;
                boolean IHQe1A4L2xu = hi1Var.IHQe1A4L2xu(stVar3, stVar2);
                defpackage.ub1 ub1Var = null;
                if (IHQe1A4L2xu) {
                    defpackage.qb qbVar = buVar.V7bD7b8KA.IHQe1A4L2xu.oh6vYeIP;
                    if (qbVar != null) {
                        ub1Var = qbVar.r1MBDhnF;
                    }
                } else if (hi1Var.IHQe1A4L2xu(stVar2, stVar)) {
                    defpackage.qb qbVar2 = buVar.PAEGRtP0bX.IHQe1A4L2xu.oh6vYeIP;
                    if (qbVar2 != null) {
                        ub1Var = qbVar2.r1MBDhnF;
                    }
                } else {
                    ub1Var = defpackage.xt.F7NU4MC0GW;
                }
                return ub1Var == null ? defpackage.xt.F7NU4MC0GW : ub1Var;
            default:
                defpackage.hi1 hi1Var2 = (defpackage.hi1) obj;
                if (hi1Var2.IHQe1A4L2xu(stVar3, stVar2)) {
                    return defpackage.xt.r1MBDhnF;
                }
                if (!hi1Var2.IHQe1A4L2xu(stVar2, stVar)) {
                    return defpackage.xt.r1MBDhnF;
                }
                defpackage.mi1 mi1Var = buVar.PAEGRtP0bX.IHQe1A4L2xu;
                return defpackage.xt.r1MBDhnF;
        }
    }
}
