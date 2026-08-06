package defpackage;

/* loaded from: classes.dex */
public final class r7 extends defpackage.vm1 {
    public final java.lang.String oh6vYeIP;
    public defpackage.in1 r1MBDhnF;

    public r7(defpackage.y31 y31Var) {
        java.lang.String str = (java.lang.String) y31Var.IHQe1A4L2xu("SaveableStateHolder_BackStackEntryKey");
        if (str == null) {
            str = java.util.UUID.randomUUID().toString();
            if (str != null) {
                java.util.ArrayList arrayList = defpackage.a41.IHQe1A4L2xu;
                if (arrayList == null || !arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        java.lang.Object obj = arrayList.get(i);
                        i++;
                        if (((java.lang.Class) obj).isInstance(str)) {
                        }
                    }
                }
                defpackage.db.QoRHpC4k("Can't put value with type ", str.getClass(), " into saved state");
                throw null;
            }
            java.util.ArrayList arrayList2 = defpackage.a41.IHQe1A4L2xu;
            y31Var.IHQe1A4L2xu.get("SaveableStateHolder_BackStackEntryKey");
            y31Var.oh6vYeIP.riuEU0zW4(str, "SaveableStateHolder_BackStackEntryKey");
        }
        this.oh6vYeIP = str;
    }

    @Override // defpackage.vm1
    public final void F7NU4MC0GW() {
        defpackage.in1 in1Var = this.r1MBDhnF;
        if (in1Var == null) {
            defpackage.x70.Ye0N2xE9Hc("saveableStateHolderRef");
            throw null;
        }
        defpackage.r31 r31Var = (defpackage.r31) in1Var.IHQe1A4L2xu.get();
        if (r31Var != null) {
            r31Var.r1MBDhnF(this.oh6vYeIP);
        }
        defpackage.in1 in1Var2 = this.r1MBDhnF;
        if (in1Var2 != null) {
            in1Var2.IHQe1A4L2xu.clear();
        } else {
            defpackage.x70.Ye0N2xE9Hc("saveableStateHolderRef");
            throw null;
        }
    }
}
