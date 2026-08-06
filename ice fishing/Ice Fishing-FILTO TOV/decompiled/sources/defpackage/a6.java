package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.UUID;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class a6 extends we1 {
    public final String X1lG3V04pd;
    public final String Yi7zF1RB1 = "SaveableStateHolder_BackStackEntryKey";
    public lf1 xqGvceK5x;

    public a6(pw0 pw0Var) {
        Object obj;
        pw0Var.getClass();
        v5 v5Var = pw0Var.Yi7zF1RB1;
        LinkedHashMap linkedHashMap = (LinkedHashMap) v5Var.GWasM1elztuh;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) v5Var.xqGvceK5x;
        try {
            p51 p51Var = (p51) linkedHashMap2.get("SaveableStateHolder_BackStackEntryKey");
            if (p51Var == null || (obj = p51Var.getValue()) == null) {
                obj = linkedHashMap.get("SaveableStateHolder_BackStackEntryKey");
            }
        } catch (ClassCastException unused) {
            linkedHashMap.remove("SaveableStateHolder_BackStackEntryKey");
            ((LinkedHashMap) v5Var.X1lG3V04pd).remove("SaveableStateHolder_BackStackEntryKey");
            linkedHashMap2.remove("SaveableStateHolder_BackStackEntryKey");
            obj = null;
        }
        String str = (String) obj;
        if (str == null) {
            str = UUID.randomUUID().toString();
            String str2 = this.Yi7zF1RB1;
            str2.getClass();
            if (str != null) {
                ArrayList arrayList = rw0.GWasM1elztuh;
                if (arrayList == null || !arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        if (((Class) obj2).isInstance(str)) {
                        }
                    }
                }
                o4.iwATDS1i01k("Can't put value with type ", str.getClass(), " into saved state");
                throw null;
            }
            ArrayList arrayList2 = rw0.GWasM1elztuh;
            pw0Var.GWasM1elztuh.get(str2);
            v5Var.rQPn8YBR(str, str2);
        }
        this.X1lG3V04pd = str;
    }

    @Override // defpackage.we1
    public final void xqGvceK5x() {
        lf1 lf1Var = this.xqGvceK5x;
        if (lf1Var == null) {
            o30.YXi2hvwn7WL("saveableStateHolderRef");
            throw null;
        }
        iw0 iw0Var = (iw0) lf1Var.GWasM1elztuh.get();
        if (iw0Var != null) {
            iw0Var.X1lG3V04pd(this.X1lG3V04pd);
        }
        lf1 lf1Var2 = this.xqGvceK5x;
        if (lf1Var2 != null) {
            lf1Var2.GWasM1elztuh.clear();
        } else {
            o30.YXi2hvwn7WL("saveableStateHolderRef");
            throw null;
        }
    }
}
