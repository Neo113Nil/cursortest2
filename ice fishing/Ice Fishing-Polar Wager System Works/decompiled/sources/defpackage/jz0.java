package defpackage;

/* loaded from: classes.dex */
public final class jz0 implements defpackage.sd0 {
    public final /* synthetic */ int adDC3e2L;
    public final java.lang.Object xiZrDbcSW0;

    public /* synthetic */ jz0(int i, java.lang.Object obj) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = obj;
    }

    @Override // defpackage.sd0
    public final void riuEU0zW4(defpackage.ud0 ud0Var, defpackage.md0 md0Var) {
        int i = this.adDC3e2L;
        java.lang.Object obj = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                defpackage.i41 i41Var = (defpackage.i41) obj;
                if (md0Var != defpackage.md0.ON_CREATE) {
                    throw new java.lang.AssertionError("Next event must be ON_CREATE");
                }
                ud0Var.EXtogiMhuM().xiZrDbcSW0(this);
                android.os.Bundle cnag84Bm = i41Var.r1MBDhnF().cnag84Bm("androidx.savedstate.Restarter");
                if (cnag84Bm == null) {
                    return;
                }
                java.util.ArrayList<java.lang.String> stringArrayList = cnag84Bm.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    defpackage.db.AARZUJiTa("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                int size = stringArrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    java.lang.String str = stringArrayList.get(i2);
                    i2++;
                    java.lang.String str2 = str;
                    try {
                        java.lang.Class<? extends U> asSubclass = java.lang.Class.forName(str2, false, defpackage.jz0.class.getClassLoader()).asSubclass(defpackage.f41.class);
                        asSubclass.getClass();
                        try {
                            java.lang.reflect.Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                java.lang.Object newInstance = declaredConstructor.newInstance(null);
                                newInstance.getClass();
                                if (!(i41Var instanceof defpackage.cn1)) {
                                    defpackage.db.EgCjBq0SZwJ(i41Var, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                    return;
                                }
                                java.util.LinkedHashMap linkedHashMap = ((defpackage.cn1) i41Var).AARZUJiTa().IHQe1A4L2xu;
                                defpackage.F7NU4MC0GW r1MBDhnF = i41Var.r1MBDhnF();
                                java.util.Iterator it = defpackage.td.FisHbM7NmV(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    defpackage.vm1 vm1Var = (defpackage.vm1) linkedHashMap.get(it.next());
                                    if (vm1Var != null) {
                                        defpackage.s70.AARZUJiTa(vm1Var, r1MBDhnF, i41Var.EXtogiMhuM());
                                    }
                                }
                                if (!defpackage.td.FisHbM7NmV(linkedHashMap.keySet()).isEmpty()) {
                                    r1MBDhnF.C0U8sNJm();
                                }
                            } catch (java.lang.Exception e) {
                                defpackage.db.JlrlGoKF("Failed to instantiate ", str2, e);
                                return;
                            }
                        } catch (java.lang.NoSuchMethodException e2) {
                            throw new java.lang.IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (java.lang.ClassNotFoundException e3) {
                        throw new java.lang.RuntimeException(defpackage.fx0.ez2rX8ReCYw("Class ", str2, " wasn't found"), e3);
                    }
                }
                return;
            case 1:
                com.corsair.ledger.MainActivity mainActivity = (com.corsair.ledger.MainActivity) obj;
                if (mainActivity.riuEU0zW4 == null) {
                    defpackage.jf jfVar = (defpackage.jf) mainActivity.getLastNonConfigurationInstance();
                    if (jfVar != null) {
                        mainActivity.riuEU0zW4 = jfVar.IHQe1A4L2xu;
                    }
                    if (mainActivity.riuEU0zW4 == null) {
                        mainActivity.riuEU0zW4 = new defpackage.bn1();
                    }
                }
                mainActivity.adDC3e2L.xiZrDbcSW0(this);
                return;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                new java.util.HashMap();
                defpackage.y10[] y10VarArr = (defpackage.y10[]) obj;
                if (y10VarArr.length > 0) {
                    defpackage.y10 y10Var = y10VarArr[0];
                    throw null;
                }
                if (y10VarArr.length <= 0) {
                    return;
                }
                defpackage.y10 y10Var2 = y10VarArr[0];
                throw null;
            default:
                if (md0Var != defpackage.md0.ON_CREATE) {
                    defpackage.db.EgCjBq0SZwJ(md0Var, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    ud0Var.EXtogiMhuM().xiZrDbcSW0(this);
                    ((defpackage.d41) obj).oh6vYeIP();
                    return;
                }
        }
    }
}
