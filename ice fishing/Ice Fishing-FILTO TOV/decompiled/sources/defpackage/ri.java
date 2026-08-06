package defpackage;

import com.combinations.level.experts.core.domain.model.GameSettings;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ri implements ms {
    public final /* synthetic */ ms EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ ri(ms msVar, int i) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = msVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a3  */
    @Override // defpackage.ms
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object E7jCp8Ls(Object obj, vg vgVar) {
        qi qiVar;
        int i;
        nj njVar;
        int i2;
        int i3 = this.OOA6hdeuvCS;
        kc1 kc1Var = kc1.GWasM1elztuh;
        ms msVar = this.EljAMC1QTz;
        qh qhVar = qh.OOA6hdeuvCS;
        switch (i3) {
            case 0:
                if (vgVar instanceof qi) {
                    qiVar = (qi) vgVar;
                    int i4 = qiVar.mOu10nynGul;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        qiVar.mOu10nynGul = i4 - Integer.MIN_VALUE;
                        Object obj2 = qiVar.encWxUiV2;
                        i = qiVar.mOu10nynGul;
                        if (i != 0) {
                            o50.A1EKNP6CxJ(obj2);
                            l51 l51Var = (l51) obj;
                            if (l51Var instanceof vs0) {
                                throw ((vs0) l51Var).Yi7zF1RB1;
                            }
                            if (l51Var instanceof bi) {
                                Object obj3 = ((bi) l51Var).Yi7zF1RB1;
                                qiVar.mOu10nynGul = 1;
                                return msVar.E7jCp8Ls(obj3, qiVar) == qhVar ? qhVar : kc1Var;
                            }
                            if ((l51Var instanceof wr) || (l51Var instanceof ec1) || (l51Var instanceof tj0)) {
                                o4.jivtDDk9H("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            } else {
                                o4.xqGvceK5x();
                            }
                        } else {
                            if (i == 1) {
                                o50.A1EKNP6CxJ(obj2);
                                return kc1Var;
                            }
                            o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                        }
                        return null;
                    }
                }
                qiVar = new qi(this, vgVar);
                Object obj22 = qiVar.encWxUiV2;
                i = qiVar.mOu10nynGul;
                if (i != 0) {
                }
                return null;
            default:
                if (vgVar instanceof nj) {
                    njVar = (nj) vgVar;
                    int i5 = njVar.mOu10nynGul;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        njVar.mOu10nynGul = i5 - Integer.MIN_VALUE;
                        Object obj4 = njVar.encWxUiV2;
                        i2 = njVar.mOu10nynGul;
                        if (i2 == 0) {
                            if (i2 == 1) {
                                o50.A1EKNP6CxJ(obj4);
                                return kc1Var;
                            }
                            o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o50.A1EKNP6CxJ(obj4);
                        eg0 eg0Var = (eg0) obj;
                        Boolean bool = (Boolean) eg0Var.X1lG3V04pd(oj.X1lG3V04pd);
                        boolean booleanValue = bool != null ? bool.booleanValue() : true;
                        Boolean bool2 = (Boolean) eg0Var.X1lG3V04pd(oj.xqGvceK5x);
                        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : true;
                        Boolean bool3 = (Boolean) eg0Var.X1lG3V04pd(oj.OOA6hdeuvCS);
                        GameSettings gameSettings = new GameSettings(booleanValue, booleanValue2, bool3 != null ? bool3.booleanValue() : true);
                        njVar.mOu10nynGul = 1;
                        return msVar.E7jCp8Ls(gameSettings, njVar) == qhVar ? qhVar : kc1Var;
                    }
                }
                njVar = new nj(this, vgVar);
                Object obj42 = njVar.encWxUiV2;
                i2 = njVar.mOu10nynGul;
                if (i2 == 0) {
                }
        }
    }
}
