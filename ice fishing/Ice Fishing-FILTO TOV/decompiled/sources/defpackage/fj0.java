package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class fj0 {
    public static final LinkedHashMap Yi7zF1RB1 = new LinkedHashMap();
    public final LinkedHashMap GWasM1elztuh = new LinkedHashMap();

    public final void GWasM1elztuh(ej0 ej0Var) {
        ej0Var.getClass();
        String Mjvvu5DE = z50.Mjvvu5DE(ej0Var.getClass());
        if (Mjvvu5DE.length() <= 0) {
            o4.mE4lRynR("navigator name cannot be an empty string");
            return;
        }
        LinkedHashMap linkedHashMap = this.GWasM1elztuh;
        ej0 ej0Var2 = (ej0) linkedHashMap.get(Mjvvu5DE);
        if (o30.rQPn8YBR(ej0Var2, ej0Var)) {
            return;
        }
        if (ej0Var2 != null && ej0Var2.Yi7zF1RB1) {
            o4.WIEu4Ya2g8("Navigator ", ej0Var, " is replacing an already attached ", ej0Var2);
        } else if (ej0Var.Yi7zF1RB1) {
            o4.encWxUiV2("Navigator ", ej0Var, " is already attached to another NavController");
        }
    }

    public final ej0 Yi7zF1RB1(String str) {
        str.getClass();
        if (str.length() <= 0) {
            o4.mE4lRynR("navigator name cannot be an empty string");
            return null;
        }
        ej0 ej0Var = (ej0) this.GWasM1elztuh.get(str);
        if (ej0Var != null) {
            return ej0Var;
        }
        throw new IllegalStateException("Could not find Navigator with name \"" + str + "\". You must call NavController.addNavigator() for each navigation type.");
    }
}
