package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class zq0 {
    public static final java.util.LinkedHashMap giKS3J6vZuNy = new java.util.LinkedHashMap();
    public final java.util.LinkedHashMap ZpBGe2uQfcn8 = new java.util.LinkedHashMap();

    public final void ZpBGe2uQfcn8(defpackage.yq0 yq0Var) {
        yq0Var.getClass();
        java.lang.String maCixPsq4ml2 = defpackage.t80.maCixPsq4ml2(yq0Var.getClass());
        if (maCixPsq4ml2.length() <= 0) {
            defpackage.h7.w7APNrr0aGRc("navigator name cannot be an empty string");
            return;
        }
        java.util.LinkedHashMap linkedHashMap = this.ZpBGe2uQfcn8;
        defpackage.yq0 yq0Var2 = (defpackage.yq0) linkedHashMap.get(maCixPsq4ml2);
        if (defpackage.ma0.QiMR8OkAhezm(yq0Var2, yq0Var)) {
            return;
        }
        if (yq0Var2 != null && yq0Var2.giKS3J6vZuNy) {
            defpackage.h7.s0TASMVLSWD5("Navigator ", yq0Var, " is replacing an already attached ", yq0Var2);
        } else if (yq0Var.giKS3J6vZuNy) {
            defpackage.h7.e6mdH7fiFuta("Navigator ", yq0Var, " is already attached to another NavController");
        }
    }

    public final defpackage.yq0 giKS3J6vZuNy(java.lang.String str) {
        str.getClass();
        if (str.length() <= 0) {
            defpackage.h7.w7APNrr0aGRc("navigator name cannot be an empty string");
            return null;
        }
        defpackage.yq0 yq0Var = (defpackage.yq0) this.ZpBGe2uQfcn8.get(str);
        if (yq0Var != null) {
            return yq0Var;
        }
        throw new java.lang.IllegalStateException("Could not find Navigator with name \"" + str + "\". You must call NavController.addNavigator() for each navigation type.");
    }
}
