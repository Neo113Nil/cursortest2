package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class r60 extends d60 {
    public final /* synthetic */ lv X1lG3V04pd;
    public final /* synthetic */ v60 Yi7zF1RB1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r60(v60 v60Var, lv lvVar, String str) {
        super(str);
        this.Yi7zF1RB1 = v60Var;
        this.X1lG3V04pd = lvVar;
    }

    @Override // defpackage.bd0
    public final cd0 AvO7iQsrTN(dd0 dd0Var, List list, long j) {
        v60 v60Var = this.Yi7zF1RB1;
        p60 p60Var = v60Var.E7jCp8Ls;
        p60Var.OOA6hdeuvCS = dd0Var.getLayoutDirection();
        p60Var.EljAMC1QTz = dd0Var.Yi7zF1RB1();
        p60Var.AvO7iQsrTN = dd0Var.mOu10nynGul();
        boolean XnEVoBF0td1l = dd0Var.XnEVoBF0td1l();
        lv lvVar = this.X1lG3V04pd;
        if (XnEVoBF0td1l || v60Var.OOA6hdeuvCS.E7jCp8Ls == null) {
            v60Var.encWxUiV2 = 0;
            cd0 cd0Var = (cd0) lvVar.EljAMC1QTz(p60Var, new eg(j));
            return new q60(cd0Var, v60Var, v60Var.encWxUiV2, cd0Var, 1);
        }
        v60Var.mOu10nynGul = 0;
        cd0 cd0Var2 = (cd0) lvVar.EljAMC1QTz(v60Var.XnEVoBF0td1l, new eg(j));
        return new q60(cd0Var2, v60Var, v60Var.mOu10nynGul, cd0Var2, 0);
    }
}
