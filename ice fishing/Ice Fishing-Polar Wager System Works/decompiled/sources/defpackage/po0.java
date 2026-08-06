package defpackage;

/* loaded from: classes.dex */
public final class po0 {
    public static final java.util.LinkedHashMap oh6vYeIP = new java.util.LinkedHashMap();
    public final java.util.LinkedHashMap IHQe1A4L2xu = new java.util.LinkedHashMap();

    public final void IHQe1A4L2xu(defpackage.oo0 oo0Var) {
        oo0Var.getClass();
        java.lang.String kd6TUFXn = defpackage.e90.kd6TUFXn(oo0Var.getClass());
        if (kd6TUFXn.length() <= 0) {
            defpackage.db.fnWB2E7cs("navigator name cannot be an empty string");
            return;
        }
        java.util.LinkedHashMap linkedHashMap = this.IHQe1A4L2xu;
        defpackage.oo0 oo0Var2 = (defpackage.oo0) linkedHashMap.get(kd6TUFXn);
        if (defpackage.x70.QoRHpC4k(oo0Var2, oo0Var)) {
            return;
        }
        if (oo0Var2 != null && oo0Var2.oh6vYeIP) {
            defpackage.db.G3OKOH3wZRC("Navigator ", oo0Var, " is replacing an already attached ", oo0Var2);
        } else if (oo0Var.oh6vYeIP) {
            defpackage.db.riuEU0zW4("Navigator ", oo0Var, " is already attached to another NavController");
        }
    }

    public final defpackage.oo0 oh6vYeIP(java.lang.String str) {
        str.getClass();
        if (str.length() <= 0) {
            defpackage.db.fnWB2E7cs("navigator name cannot be an empty string");
            return null;
        }
        defpackage.oo0 oo0Var = (defpackage.oo0) this.IHQe1A4L2xu.get(str);
        if (oo0Var != null) {
            return oo0Var;
        }
        defpackage.db.AARZUJiTa(defpackage.fx0.ez2rX8ReCYw("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        return null;
    }
}
