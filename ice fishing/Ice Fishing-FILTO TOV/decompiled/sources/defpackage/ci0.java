package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ci0 extends yh0 {
    public final String AvO7iQsrTN;
    public final fj0 EljAMC1QTz;
    public final ArrayList encWxUiV2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci0(fj0 fj0Var) {
        super(fj0Var.Yi7zF1RB1(z50.Mjvvu5DE(gi0.class)), null);
        fj0Var.getClass();
        this.encWxUiV2 = new ArrayList();
        this.EljAMC1QTz = fj0Var;
        this.AvO7iQsrTN = "menu";
    }

    public final bi0 X1lG3V04pd() {
        int hashCode;
        bi0 bi0Var = (bi0) super.GWasM1elztuh();
        ArrayList arrayList = this.encWxUiV2;
        arrayList.getClass();
        ei0 ei0Var = bi0Var.JFJ3QoxA;
        ei0Var.getClass();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            xh0 xh0Var = (xh0) obj;
            if (xh0Var != null) {
                y41 y41Var = ei0Var.Yi7zF1RB1;
                bi0 bi0Var2 = ei0Var.GWasM1elztuh;
                ai0 ai0Var = bi0Var2.EljAMC1QTz;
                ai0 ai0Var2 = xh0Var.EljAMC1QTz;
                int i2 = ai0Var2.GWasM1elztuh;
                String str = (String) ai0Var2.OOA6hdeuvCS;
                if (i2 == 0 && str == null) {
                    o4.mE4lRynR("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                    return null;
                }
                String str2 = (String) ai0Var.OOA6hdeuvCS;
                if (str2 != null && o30.rQPn8YBR(str, str2)) {
                    o4.mOu10nynGul("Destination ", xh0Var, " cannot have the same route as graph ", bi0Var2);
                    return null;
                }
                if (i2 == ai0Var.GWasM1elztuh) {
                    o4.mOu10nynGul("Destination ", xh0Var, " cannot have the same id as graph ", bi0Var2);
                    return null;
                }
                xh0 xh0Var2 = (xh0) y41Var.Yi7zF1RB1(i2);
                if (xh0Var2 == xh0Var) {
                    continue;
                } else {
                    if (xh0Var.AvO7iQsrTN != null) {
                        o4.jivtDDk9H("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                        return null;
                    }
                    if (xh0Var2 != null) {
                        xh0Var2.AvO7iQsrTN = null;
                    }
                    xh0Var.AvO7iQsrTN = bi0Var2;
                    y41Var.xqGvceK5x(ai0Var2.GWasM1elztuh, xh0Var);
                }
            }
        }
        String str3 = this.AvO7iQsrTN;
        if (str3 == null) {
            if (this.Yi7zF1RB1 != null) {
                o4.jivtDDk9H("You must set a start destination route");
                return null;
            }
            o4.jivtDDk9H("You must set a start destination id");
            return null;
        }
        bi0 bi0Var3 = ei0Var.GWasM1elztuh;
        if (str3 != null) {
            if (str3.equals((String) bi0Var3.EljAMC1QTz.OOA6hdeuvCS)) {
                o4.mOu10nynGul("Start destination ", str3, " cannot use the same route as the graph ", bi0Var3);
            } else if (b61.MItybXapHX(str3)) {
                o4.mE4lRynR("Cannot have an empty start destination route");
            } else {
                int i3 = xh0.mOu10nynGul;
                hashCode = "android-app://androidx.navigation/".concat(str3).hashCode();
            }
            return bi0Var;
        }
        hashCode = 0;
        ei0Var.X1lG3V04pd = hashCode;
        ei0Var.OOA6hdeuvCS = str3;
        return bi0Var;
    }
}
