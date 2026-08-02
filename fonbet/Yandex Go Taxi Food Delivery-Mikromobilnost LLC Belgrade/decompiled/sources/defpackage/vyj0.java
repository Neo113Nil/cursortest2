package defpackage;

/* loaded from: classes2.dex */
public interface vyj0 {
    static /* synthetic */ void h(vyj0 vyj0Var, sls slsVar, sls slsVar2, ytf ytfVar, int i) {
        if ((i & 1) != 0) {
            slsVar = null;
        }
        if ((i & 2) != 0) {
            slsVar2 = null;
        }
        if ((i & 4) != 0) {
            ytfVar = null;
        }
        vyj0Var.setButtonsActions(slsVar, slsVar2, ytfVar);
    }

    sls getBackAction();

    sls getExtraAction();

    sls getMainAction();

    void setButtonsActions(sls slsVar, sls slsVar2, sls slsVar3);
}
