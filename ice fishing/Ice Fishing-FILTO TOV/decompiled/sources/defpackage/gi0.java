package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
@dj0("navigation")
/* loaded from: classes.dex */
public class gi0 extends ej0 {
    public final fj0 X1lG3V04pd;

    public gi0(fj0 fj0Var) {
        fj0Var.getClass();
        this.X1lG3V04pd = fj0Var;
    }

    @Override // defpackage.ej0
    /* renamed from: AvO7iQsrTN, reason: merged with bridge method [inline-methods] */
    public bi0 GWasM1elztuh() {
        return new bi0(this);
    }

    @Override // defpackage.ej0
    public final void xqGvceK5x(List list, si0 si0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fh0 fh0Var = (fh0) it.next();
            xh0 xh0Var = fh0Var.EljAMC1QTz;
            xh0Var.getClass();
            bi0 bi0Var = (bi0) xh0Var;
            ai0 ai0Var = bi0Var.EljAMC1QTz;
            rt0 rt0Var = new rt0();
            rt0Var.OOA6hdeuvCS = fh0Var.E7jCp8Ls.GWasM1elztuh();
            ei0 ei0Var = bi0Var.JFJ3QoxA;
            int i = ei0Var.X1lG3V04pd;
            String str = ei0Var.OOA6hdeuvCS;
            if (i == 0 && str == null) {
                ai0Var.getClass();
                String valueOf = String.valueOf(ai0Var.GWasM1elztuh);
                valueOf.getClass();
                if (ei0Var.GWasM1elztuh.EljAMC1QTz.GWasM1elztuh == 0) {
                    valueOf = "the root navigation";
                }
                throw new IllegalStateException("no start destination defined via app:startDestination for ".concat(valueOf).toString());
            }
            int i2 = 0;
            xh0 Yi7zF1RB1 = str != null ? ei0Var.Yi7zF1RB1(str, false) : (xh0) ei0Var.Yi7zF1RB1.Yi7zF1RB1(i);
            if (Yi7zF1RB1 == null) {
                if (ei0Var.xqGvceK5x == null) {
                    String str2 = ei0Var.OOA6hdeuvCS;
                    if (str2 == null) {
                        str2 = String.valueOf(ei0Var.X1lG3V04pd);
                    }
                    ei0Var.xqGvceK5x = str2;
                }
                String str3 = ei0Var.xqGvceK5x;
                str3.getClass();
                throw new IllegalArgumentException("navigation destination " + str3 + " is not a direct child of this NavGraph");
            }
            ai0 ai0Var2 = Yi7zF1RB1.EljAMC1QTz;
            if (str != null) {
                if (!str.equals((String) ai0Var2.OOA6hdeuvCS)) {
                    wh0 GWasM1elztuh = ai0Var2.GWasM1elztuh(str);
                    Bundle bundle = GWasM1elztuh != null ? GWasM1elztuh.EljAMC1QTz : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle jivtDDk9H = ki1.jivtDDk9H((rn0[]) Arrays.copyOf(new rn0[0], 0));
                        jivtDDk9H.putAll(bundle);
                        Bundle bundle2 = (Bundle) rt0Var.OOA6hdeuvCS;
                        if (bundle2 != null) {
                            jivtDDk9H.putAll(bundle2);
                        }
                        rt0Var.OOA6hdeuvCS = jivtDDk9H;
                    }
                }
                if (Yi7zF1RB1.Yi7zF1RB1().isEmpty()) {
                    continue;
                } else {
                    ArrayList mE4lRynR = w60.mE4lRynR(Yi7zF1RB1.Yi7zF1RB1(), new fi0(i2, rt0Var));
                    if (!mE4lRynR.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + Yi7zF1RB1 + ". Missing required arguments [" + mE4lRynR + ']').toString());
                    }
                }
            }
            this.X1lG3V04pd.Yi7zF1RB1(Yi7zF1RB1.OOA6hdeuvCS).xqGvceK5x(fb1.HFYAaqMd6(Yi7zF1RB1().Yi7zF1RB1(Yi7zF1RB1, Yi7zF1RB1.GWasM1elztuh((Bundle) rt0Var.OOA6hdeuvCS))), si0Var);
        }
    }
}
