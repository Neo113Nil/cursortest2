package defpackage;

/* loaded from: classes.dex */
public final class dl0 extends defpackage.yg0 {
    public final defpackage.lu0 EXtogiMhuM;
    public java.lang.Object riuEU0zW4;

    public dl0(defpackage.lu0 lu0Var, java.lang.Object obj, java.lang.Object obj2) {
        super(0, obj, obj2);
        this.EXtogiMhuM = lu0Var;
        this.riuEU0zW4 = obj2;
    }

    @Override // defpackage.yg0, java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.riuEU0zW4;
    }

    @Override // defpackage.yg0, java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        java.lang.Object obj2 = this.riuEU0zW4;
        this.riuEU0zW4 = obj;
        defpackage.ju0 ju0Var = this.EXtogiMhuM.adDC3e2L;
        defpackage.fu0 fu0Var = ju0Var.EXtogiMhuM;
        java.lang.Object obj3 = this.xiZrDbcSW0;
        if (!fu0Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = ju0Var.AARZUJiTa;
        if (!z) {
            fu0Var.put(obj3, obj);
        } else {
            if (!z) {
                defpackage.db.DFo87pBq1E5();
                return null;
            }
            defpackage.zi1 zi1Var = ju0Var.adDC3e2L[ju0Var.xiZrDbcSW0];
            java.lang.Object obj4 = zi1Var.adDC3e2L[zi1Var.AARZUJiTa];
            fu0Var.put(obj3, obj);
            ju0Var.r1MBDhnF(obj4 != null ? obj4.hashCode() : 0, fu0Var.xiZrDbcSW0, obj4, 0);
        }
        ju0Var.ez2rX8ReCYw = fu0Var.EXtogiMhuM;
        return obj2;
    }
}
