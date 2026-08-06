package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class v extends h50 implements lv {
    public final /* synthetic */ Object AvO7iQsrTN;
    public final /* synthetic */ int EljAMC1QTz;
    public final /* synthetic */ Object encWxUiV2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i, Object obj, Object obj2) {
        super(2);
        this.EljAMC1QTz = i;
        this.AvO7iQsrTN = obj;
        this.encWxUiV2 = obj2;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        int i = this.EljAMC1QTz;
        kc1 kc1Var = kc1.GWasM1elztuh;
        Object obj3 = this.encWxUiV2;
        Object obj4 = this.AvO7iQsrTN;
        switch (i) {
            case 0:
                int intValue = ((Number) obj).intValue();
                d01 d01Var = (d01) obj2;
                w wVar = (w) obj3;
                if (!((e01) obj4).Yi7zF1RB1.Yi7zF1RB1(d01Var.EljAMC1QTz)) {
                    wVar.E7jCp8Ls(intValue, d01Var);
                    wVar.E7jCp8Ls.mE4lRynR(kc1Var);
                    break;
                }
                break;
            case 1:
                qx qxVar = (qx) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (!qxVar.dqB83aoLBB(intValue2 & 1, (intValue2 & 3) != 2)) {
                    qxVar.YXi2hvwn7WL();
                    break;
                } else {
                    Boolean bool = (Boolean) ((n60) obj4).AvO7iQsrTN.getValue();
                    boolean booleanValue = bool.booleanValue();
                    lv lvVar = (lv) obj3;
                    qxVar.Fm8W7vP7q(bool);
                    boolean AvO7iQsrTN = qxVar.AvO7iQsrTN(booleanValue);
                    if (booleanValue) {
                        lvVar.EljAMC1QTz(qxVar, 0);
                    } else {
                        if (qxVar.E7jCp8Ls != 0) {
                            we.GWasM1elztuh("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!qxVar.CMh55RymNfS) {
                            if (AvO7iQsrTN) {
                                y21 y21Var = qxVar.YZjbz8VdP5;
                                int i2 = y21Var.AvO7iQsrTN;
                                int i3 = y21Var.encWxUiV2;
                                ve veVar = qxVar.rezfBrjOrqK;
                                veVar.getClass();
                                veVar.xqGvceK5x(false);
                                veVar.Yi7zF1RB1.Mjvvu5DE.TpUsjqg3bxO(sl0.X1lG3V04pd);
                                o30.mOu10nynGul(qxVar.mE4lRynR, i2, i3);
                                qxVar.YZjbz8VdP5.jivtDDk9H();
                            } else {
                                qxVar.z19UFEN2I();
                            }
                        }
                    }
                    if (qxVar.WRKkgoJXwDn && qxVar.YZjbz8VdP5.mOu10nynGul == qxVar.arNh8D4Z5gB) {
                        qxVar.arNh8D4Z5gB = -1;
                        qxVar.WRKkgoJXwDn = false;
                    }
                    qxVar.WIEu4Ya2g8(false);
                    break;
                }
                break;
            default:
                s9 s9Var = (s9) obj;
                oy oyVar = (oy) obj2;
                bk0 bk0Var = (bk0) obj4;
                g60 g60Var = bk0Var.mE4lRynR;
                if (!g60Var.A1EKNP6CxJ()) {
                    bk0Var.dqB83aoLBB = true;
                    break;
                } else {
                    bk0Var.HFYAaqMd6 = s9Var;
                    bk0Var.DmJncFq5 = oyVar;
                    in0 snapshotObserver = ((c) j60.GWasM1elztuh(g60Var)).getSnapshotObserver();
                    yu0 yu0Var = bk0.z19UFEN2I;
                    snapshotObserver.GWasM1elztuh.X1lG3V04pd(bk0Var, XdwzlWIkSDqF.WRKkgoJXwDn, (ak0) obj3);
                    bk0Var.dqB83aoLBB = false;
                    break;
                }
        }
        return kc1Var;
    }
}
