package defpackage;

import android.os.Bundle;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class fi0 implements hv {
    public final /* synthetic */ rt0 EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ fi0(int i, rt0 rt0Var) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = rt0Var;
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        int i = this.OOA6hdeuvCS;
        rt0 rt0Var = this.EljAMC1QTz;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                Object obj2 = rt0Var.OOA6hdeuvCS;
                return Boolean.valueOf(obj2 == null || !((Bundle) obj2).containsKey(str));
            default:
                va1 va1Var = (va1) obj;
                va1Var.getClass();
                z70 z70Var = ((xa1) va1Var).mE4lRynR;
                List list = (List) rt0Var.OOA6hdeuvCS;
                if (list != null) {
                    list.add(z70Var);
                } else {
                    list = fb1.TpUsjqg3bxO(z70Var);
                }
                rt0Var.OOA6hdeuvCS = list;
                return ua1.EljAMC1QTz;
        }
    }
}
