package defpackage;

import com.combinations.level.experts.core.domain.model.GameProgress;
import com.combinations.level.experts.core.domain.model.GameSettings;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class fx implements ms {
    public final /* synthetic */ kx EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ fx(kx kxVar, int i) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = kxVar;
    }

    @Override // defpackage.ms
    public final Object E7jCp8Ls(Object obj, vg vgVar) {
        int i = this.OOA6hdeuvCS;
        kc1 kc1Var = kc1.GWasM1elztuh;
        kx kxVar = this.EljAMC1QTz;
        switch (i) {
            case 0:
                kxVar.EljAMC1QTz.mE4lRynR(new fw(((GameProgress) obj).getHints()));
                break;
            default:
                kxVar.EljAMC1QTz.mE4lRynR(new mw((GameSettings) obj));
                break;
        }
        return kc1Var;
    }
}
