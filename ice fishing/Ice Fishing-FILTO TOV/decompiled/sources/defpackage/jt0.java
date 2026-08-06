package defpackage;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class jt0 implements r90 {
    public final Object EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ jt0(int i, Object obj) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = obj;
    }

    @Override // defpackage.r90
    public final void OOA6hdeuvCS(t90 t90Var, l90 l90Var) {
        int i = this.OOA6hdeuvCS;
        Object obj = this.EljAMC1QTz;
        switch (i) {
            case 0:
                yw0 yw0Var = (yw0) obj;
                if (l90Var != l90.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                t90Var.AvO7iQsrTN().EljAMC1QTz(this);
                Bundle rQPn8YBR = yw0Var.X1lG3V04pd().rQPn8YBR("androidx.savedstate.Restarter");
                if (rQPn8YBR == null) {
                    return;
                }
                ArrayList<String> stringArrayList = rQPn8YBR.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    o4.jivtDDk9H("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                int size = stringArrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    String str = stringArrayList.get(i2);
                    i2++;
                    String str2 = str;
                    try {
                        Class<? extends U> asSubclass = Class.forName(str2, false, jt0.class.getClassLoader()).asSubclass(vw0.class);
                        asSubclass.getClass();
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                newInstance.getClass();
                                if (!(yw0Var instanceof ff1)) {
                                    o4.Mjvvu5DE(yw0Var, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                    return;
                                }
                                LinkedHashMap linkedHashMap = ((ff1) yw0Var).OOA6hdeuvCS().GWasM1elztuh;
                                d X1lG3V04pd = yw0Var.X1lG3V04pd();
                                Iterator it = rb.Hc2GqxcqBiX(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    we1 we1Var = (we1) linkedHashMap.get(it.next());
                                    if (we1Var != null) {
                                        b70.uFEq9NpZ(we1Var, X1lG3V04pd, yw0Var.AvO7iQsrTN());
                                    }
                                }
                                if (!rb.Hc2GqxcqBiX(linkedHashMap.keySet()).isEmpty()) {
                                    X1lG3V04pd.Y6hRI1cF8();
                                }
                            } catch (Exception e) {
                                o4.rQPn8YBR("Failed to instantiate ", str2, e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException("Class " + str2 + " wasn't found", e3);
                    }
                }
                return;
            case 1:
                fd fdVar = (fd) obj;
                if (fdVar.mOu10nynGul == null) {
                    bd bdVar = (bd) fdVar.getLastNonConfigurationInstance();
                    if (bdVar != null) {
                        fdVar.mOu10nynGul = bdVar.GWasM1elztuh;
                    }
                    if (fdVar.mOu10nynGul == null) {
                        fdVar.mOu10nynGul = new ef1();
                    }
                }
                fdVar.OOA6hdeuvCS.EljAMC1QTz(this);
                return;
            case 2:
                new HashMap();
                wx[] wxVarArr = (wx[]) obj;
                if (wxVarArr.length > 0) {
                    wx wxVar = wxVarArr[0];
                    throw null;
                }
                if (wxVarArr.length <= 0) {
                    return;
                }
                wx wxVar2 = wxVarArr[0];
                throw null;
            default:
                if (l90Var != l90.ON_CREATE) {
                    o4.Mjvvu5DE(l90Var, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    t90Var.AvO7iQsrTN().EljAMC1QTz(this);
                    ((tw0) obj).Yi7zF1RB1();
                    return;
                }
        }
    }
}
