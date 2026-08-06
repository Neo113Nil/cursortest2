package defpackage;

import com.combinations.level.experts.core.domain.model.GameProgress;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class v8 implements ms {
    public final /* synthetic */ Object EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ v8(int i, Object obj) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = obj;
    }

    @Override // defpackage.ms
    public final Object E7jCp8Ls(Object obj, vg vgVar) {
        Object AvO7iQsrTN;
        Object value;
        int i = this.OOA6hdeuvCS;
        kc1 kc1Var = kc1.GWasM1elztuh;
        Object obj2 = this.EljAMC1QTz;
        switch (i) {
            case 0:
                d30 d30Var = (d30) obj;
                p41 p41Var = (p41) obj2;
                if (d30Var instanceof vz) {
                    p41Var.add(d30Var);
                } else if (d30Var instanceof wz) {
                    p41Var.remove(((wz) d30Var).GWasM1elztuh);
                } else if (d30Var instanceof et) {
                    p41Var.add(d30Var);
                } else if (d30Var instanceof ft) {
                    p41Var.remove(((ft) d30Var).GWasM1elztuh);
                } else if (d30Var instanceof vr0) {
                    p41Var.add(d30Var);
                } else if (d30Var instanceof wr0) {
                    p41Var.remove(((wr0) d30Var).GWasM1elztuh);
                } else if (d30Var instanceof ur0) {
                    p41Var.remove(((ur0) d30Var).GWasM1elztuh);
                }
                return kc1Var;
            case 1:
                ((hv) obj2).mOu10nynGul((bc1) obj);
                return kc1Var;
            case 2:
                fj fjVar = (fj) obj2;
                return ((fjVar.AvO7iQsrTN.AvO7iQsrTN() instanceof wr) || (AvO7iQsrTN = fj.AvO7iQsrTN(fjVar, true, vgVar)) != qh.OOA6hdeuvCS) ? kc1Var : AvO7iQsrTN;
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                ((rt0) obj2).OOA6hdeuvCS = obj;
                throw new GWasM1elztuh(this);
            case 4:
                GameProgress gameProgress = (GameProgress) obj;
                p51 p51Var = ((rd0) obj2).Yi7zF1RB1;
                do {
                    value = p51Var.getValue();
                    ((qd0) value).getClass();
                } while (!p51Var.encWxUiV2(value, new qd0(false, gameProgress.getNextLevel(), gameProgress.getTotalStars(), gameProgress.getMaxStars(), gameProgress.getCompletedCount(), h90.Yi7zF1RB1, gameProgress.getHints(), gameProgress.isCampaignComplete())));
                return kc1Var;
            case 5:
                ((qe0) obj2).AvO7iQsrTN.encWxUiV2(((Number) obj).floatValue());
                return kc1Var;
            default:
                kz0 kz0Var = (kz0) obj2;
                kz0Var.encWxUiV2(new E7jCp8Ls(kz0Var, (GameProgress) obj));
                return kc1Var;
        }
    }
}
