package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class r31 implements defpackage.ug0 {
    public final /* synthetic */ int WDYagTQQm9ns;
    public final java.lang.Object oh71FJcDz6S2;

    public /* synthetic */ r31(int i, java.lang.Object obj) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = obj;
    }

    @Override // defpackage.ug0
    public final void e6mdH7fiFuta(defpackage.wg0 wg0Var, defpackage.og0 og0Var) {
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                defpackage.b81 b81Var = (defpackage.b81) obj;
                if (og0Var != defpackage.og0.ON_CREATE) {
                    throw new java.lang.AssertionError("Next event must be ON_CREATE");
                }
                wg0Var.QiMR8OkAhezm().oh71FJcDz6S2(this);
                android.os.Bundle gUjdnLbkVAaA = b81Var.fWTAfUmVKrZq().gUjdnLbkVAaA("androidx.savedstate.Restarter");
                if (gUjdnLbkVAaA == null) {
                    return;
                }
                java.util.ArrayList<java.lang.String> stringArrayList = gUjdnLbkVAaA.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    defpackage.h7.P05cfTpS5W5L("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                int size = stringArrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    java.lang.String str = stringArrayList.get(i2);
                    i2++;
                    java.lang.String str2 = str;
                    try {
                        java.lang.Class<? extends U> asSubclass = java.lang.Class.forName(str2, false, defpackage.r31.class.getClassLoader()).asSubclass(defpackage.y71.class);
                        asSubclass.getClass();
                        try {
                            java.lang.reflect.Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                java.lang.Object newInstance = declaredConstructor.newInstance(null);
                                newInstance.getClass();
                                if (!(b81Var instanceof defpackage.ru1)) {
                                    defpackage.h7.ZVVdXbWmyCSK(b81Var, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                    return;
                                }
                                java.util.LinkedHashMap linkedHashMap = ((defpackage.ru1) b81Var).WDYagTQQm9ns().ZpBGe2uQfcn8;
                                defpackage.n80 fWTAfUmVKrZq = b81Var.fWTAfUmVKrZq();
                                java.util.Iterator it = defpackage.hf.RIHPIrzkudeW(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    defpackage.iu1 iu1Var = (defpackage.iu1) linkedHashMap.get(it.next());
                                    if (iu1Var != null) {
                                        defpackage.j80.P05cfTpS5W5L(iu1Var, fWTAfUmVKrZq, b81Var.QiMR8OkAhezm());
                                    }
                                }
                                if (!defpackage.hf.RIHPIrzkudeW(linkedHashMap.keySet()).isEmpty()) {
                                    fWTAfUmVKrZq.UmgHb6n58gfG();
                                }
                            } catch (java.lang.Exception e) {
                                defpackage.h7.fNwYGHIYeJcR("Failed to instantiate ", str2, e);
                                return;
                            }
                        } catch (java.lang.NoSuchMethodException e2) {
                            throw new java.lang.IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (java.lang.ClassNotFoundException e3) {
                        throw new java.lang.RuntimeException("Class " + str2 + " wasn't found", e3);
                    }
                }
                return;
            case 1:
                defpackage.gh ghVar = (defpackage.gh) obj;
                if (ghVar.e6mdH7fiFuta == null) {
                    defpackage.ch chVar = (defpackage.ch) ghVar.getLastNonConfigurationInstance();
                    if (chVar != null) {
                        ghVar.e6mdH7fiFuta = chVar.ZpBGe2uQfcn8;
                    }
                    if (ghVar.e6mdH7fiFuta == null) {
                        ghVar.e6mdH7fiFuta = new defpackage.qu1();
                    }
                }
                ghVar.WDYagTQQm9ns.oh71FJcDz6S2(this);
                return;
            case 2:
                new java.util.HashMap();
                defpackage.k30[] k30VarArr = (defpackage.k30[]) obj;
                if (k30VarArr.length > 0) {
                    defpackage.k30 k30Var = k30VarArr[0];
                    throw null;
                }
                if (k30VarArr.length <= 0) {
                    return;
                }
                defpackage.k30 k30Var2 = k30VarArr[0];
                throw null;
            default:
                if (og0Var != defpackage.og0.ON_CREATE) {
                    defpackage.h7.ZVVdXbWmyCSK(og0Var, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    wg0Var.QiMR8OkAhezm().oh71FJcDz6S2(this);
                    ((defpackage.w71) obj).giKS3J6vZuNy();
                    return;
                }
        }
    }
}
