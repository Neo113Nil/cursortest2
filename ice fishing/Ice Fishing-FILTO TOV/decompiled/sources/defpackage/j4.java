package defpackage;

import android.content.Context;
import java.util.Iterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class j4 implements wu {
    public final /* synthetic */ hi0 EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ j4(hi0 hi0Var, int i) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = hi0Var;
    }

    @Override // defpackage.wu
    public final Object GWasM1elztuh() {
        int i;
        int i2 = this.OOA6hdeuvCS;
        kc1 kc1Var = kc1.GWasM1elztuh;
        hi0 hi0Var = this.EljAMC1QTz;
        switch (i2) {
            case 0:
                l60.lv06NcmrQ(hi0Var);
                return kc1Var;
            case 1:
                l60.lv06NcmrQ(hi0Var);
                return kc1Var;
            case 2:
                l60.lv06NcmrQ(hi0Var);
                return kc1Var;
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                l60.lv06NcmrQ(hi0Var);
                return kc1Var;
            case 4:
                l60.jivtDDk9H(hi0Var, "menu", new bCsSzSHkbaQ(5));
                return kc1Var;
            case 5:
                l60.jivtDDk9H(hi0Var, "sectors", new oh0(10));
                return kc1Var;
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                l60.jivtDDk9H(hi0Var, "how_to_play", new oh0(10));
                return kc1Var;
            case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                l60.jivtDDk9H(hi0Var, "settings", new oh0(10));
                return kc1Var;
            case 8:
                y5 y5Var = hi0Var.EljAMC1QTz;
                boolean z = false;
                if (hi0Var.AvO7iQsrTN) {
                    v4 v4Var = hi0Var.Yi7zF1RB1.EljAMC1QTz;
                    if (v4Var == null || !v4Var.isEmpty()) {
                        Iterator it = v4Var.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (!(((fh0) it.next()).EljAMC1QTz instanceof bi0) && (i = i + 1) < 0) {
                                throw new ArithmeticException("Count overflow has happened.");
                            }
                        }
                    } else {
                        i = 0;
                    }
                    if (i > 1) {
                        z = true;
                    }
                }
                y5Var.xqGvceK5x(z);
                return kc1Var;
            default:
                Context context = hi0Var.GWasM1elztuh;
                fj0 fj0Var = hi0Var.Yi7zF1RB1.mE4lRynR;
                context.getClass();
                fj0Var.getClass();
                return new qi0();
        }
    }
}
