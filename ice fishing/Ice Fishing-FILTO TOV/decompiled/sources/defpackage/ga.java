package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ga implements ms {
    public final /* synthetic */ Object AvO7iQsrTN;
    public final /* synthetic */ Serializable EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;
    public final /* synthetic */ Object encWxUiV2;
    public final /* synthetic */ Object mOu10nynGul;

    public /* synthetic */ ga(Serializable serializable, Object obj, Object obj2, Object obj3, int i) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = serializable;
        this.AvO7iQsrTN = obj;
        this.encWxUiV2 = obj2;
        this.mOu10nynGul = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c5  */
    @Override // defpackage.ms
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object E7jCp8Ls(Object obj, vg vgVar) {
        fa faVar;
        int i;
        int i2 = this.OOA6hdeuvCS;
        kc1 kc1Var = kc1.GWasM1elztuh;
        int i3 = 1;
        Serializable serializable = this.EljAMC1QTz;
        int i4 = 0;
        switch (i2) {
            case 0:
                if (vgVar instanceof fa) {
                    faVar = (fa) vgVar;
                    int i5 = faVar.E7jCp8Ls;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        faVar.E7jCp8Ls = i5 - Integer.MIN_VALUE;
                        Object obj2 = faVar.JFJ3QoxA;
                        i = faVar.E7jCp8Ls;
                        if (i != 0) {
                            o50.A1EKNP6CxJ(obj2);
                            f40 f40Var = (f40) ((rt0) serializable).OOA6hdeuvCS;
                            if (f40Var != null) {
                                f40Var.GWasM1elztuh(new na("Child of the scoped flow was cancelled", i4));
                                faVar.encWxUiV2 = this;
                                faVar.mOu10nynGul = obj;
                                faVar.E7jCp8Ls = 1;
                                Object cilMamHF = f40Var.cilMamHF(faVar);
                                qh qhVar = qh.OOA6hdeuvCS;
                                if (cilMamHF == qhVar) {
                                    break;
                                }
                            }
                        } else if (i != 1) {
                            o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            obj = faVar.mOu10nynGul;
                            this = faVar.encWxUiV2;
                            o50.A1EKNP6CxJ(obj2);
                        }
                        ((rt0) this.EljAMC1QTz).OOA6hdeuvCS = fb1.MZhzXH72((ph) this.AvO7iQsrTN, null, new ea((ha) this.encWxUiV2, (ms) this.mOu10nynGul, obj, null), 1);
                        break;
                    }
                }
                faVar = new fa(this, vgVar);
                Object obj22 = faVar.JFJ3QoxA;
                i = faVar.E7jCp8Ls;
                if (i != 0) {
                }
                ((rt0) this.EljAMC1QTz).OOA6hdeuvCS = fb1.MZhzXH72((ph) this.AvO7iQsrTN, null, new ea((ha) this.encWxUiV2, (ms) this.mOu10nynGul, obj, null), 1);
            default:
                d30 d30Var = (d30) obj;
                pt0 pt0Var = (pt0) this.encWxUiV2;
                pt0 pt0Var2 = (pt0) this.AvO7iQsrTN;
                pt0 pt0Var3 = (pt0) serializable;
                if (d30Var instanceof vr0) {
                    pt0Var3.OOA6hdeuvCS++;
                } else if (d30Var instanceof wr0) {
                    pt0Var3.OOA6hdeuvCS--;
                } else if (d30Var instanceof ur0) {
                    pt0Var3.OOA6hdeuvCS--;
                } else if (d30Var instanceof vz) {
                    pt0Var2.OOA6hdeuvCS++;
                } else if (d30Var instanceof wz) {
                    pt0Var2.OOA6hdeuvCS--;
                } else if (d30Var instanceof et) {
                    pt0Var.OOA6hdeuvCS++;
                } else if (d30Var instanceof ft) {
                    pt0Var.OOA6hdeuvCS--;
                }
                boolean z = pt0Var3.OOA6hdeuvCS > 0;
                boolean z2 = pt0Var2.OOA6hdeuvCS > 0;
                boolean z3 = pt0Var.OOA6hdeuvCS > 0;
                yj yjVar = (yj) this.mOu10nynGul;
                if (yjVar.jivtDDk9H != z) {
                    yjVar.jivtDDk9H = z;
                    i4 = 1;
                }
                if (yjVar.Y6hRI1cF8 != z2) {
                    yjVar.Y6hRI1cF8 = z2;
                    i4 = 1;
                }
                if (yjVar.cilMamHF != z3) {
                    yjVar.cilMamHF = z3;
                } else {
                    i3 = i4;
                }
                if (i3 != 0) {
                    p.uFEq9NpZ(yjVar);
                    break;
                }
                break;
        }
        return kc1Var;
    }
}
