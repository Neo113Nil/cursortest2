package defpackage;

import com.combinations.level.experts.core.domain.model.GameProgress;
import com.combinations.level.experts.core.domain.model.GameSettings;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class r11 implements ms {
    public final /* synthetic */ u11 EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ r11(u11 u11Var, int i) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = u11Var;
    }

    @Override // defpackage.ms
    public final Object E7jCp8Ls(Object obj, vg vgVar) {
        Object value;
        q11 q11Var;
        Object value2;
        q11 q11Var2;
        int i = this.OOA6hdeuvCS;
        kc1 kc1Var = kc1.GWasM1elztuh;
        u11 u11Var = this.EljAMC1QTz;
        switch (i) {
            case 0:
                GameSettings gameSettings = (GameSettings) obj;
                p51 p51Var = u11Var.Yi7zF1RB1;
                do {
                    value = p51Var.getValue();
                    q11Var = (q11) value;
                    q11Var.getClass();
                } while (!p51Var.encWxUiV2(value, q11.GWasM1elztuh(q11Var, gameSettings, 0, 0, 0, false, 30)));
            default:
                GameProgress gameProgress = (GameProgress) obj;
                p51 p51Var2 = u11Var.Yi7zF1RB1;
                do {
                    value2 = p51Var2.getValue();
                    q11Var2 = (q11) value2;
                    q11Var2.getClass();
                } while (!p51Var2.encWxUiV2(value2, q11.GWasM1elztuh(q11Var2, null, gameProgress.getTotalStars(), gameProgress.getCompletedCount(), gameProgress.getHints(), false, 17)));
        }
        return kc1Var;
    }
}
