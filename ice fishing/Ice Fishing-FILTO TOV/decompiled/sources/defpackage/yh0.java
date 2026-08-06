package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class yh0 {
    public final ej0 GWasM1elztuh;
    public final String Yi7zF1RB1;
    public final LinkedHashMap X1lG3V04pd = new LinkedHashMap();
    public final ArrayList xqGvceK5x = new ArrayList();
    public final LinkedHashMap OOA6hdeuvCS = new LinkedHashMap();

    public yh0(ej0 ej0Var, String str) {
        this.GWasM1elztuh = ej0Var;
        this.Yi7zF1RB1 = str;
    }

    public xh0 GWasM1elztuh() {
        xh0 Yi7zF1RB1 = Yi7zF1RB1();
        Yi7zF1RB1.getClass();
        ai0 ai0Var = Yi7zF1RB1.EljAMC1QTz;
        for (Map.Entry entry : this.X1lG3V04pd.entrySet()) {
            String str = (String) entry.getKey();
            eh0 eh0Var = (eh0) entry.getValue();
            str.getClass();
            eh0Var.getClass();
            ai0Var.getClass();
            ((LinkedHashMap) ai0Var.xqGvceK5x).put(str, eh0Var);
        }
        ArrayList arrayList = this.xqGvceK5x;
        int size = arrayList.size();
        final int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            final vh0 vh0Var = (vh0) obj;
            vh0Var.getClass();
            ai0Var.getClass();
            ArrayList mE4lRynR = w60.mE4lRynR((LinkedHashMap) ai0Var.xqGvceK5x, new hv() { // from class: zh0
                @Override // defpackage.hv
                public final Object mOu10nynGul(Object obj2) {
                    boolean contains;
                    int i3 = i;
                    vh0 vh0Var2 = vh0Var;
                    String str2 = (String) obj2;
                    switch (i3) {
                        case 0:
                            str2.getClass();
                            contains = vh0Var2.X1lG3V04pd().contains(str2);
                            break;
                        default:
                            str2.getClass();
                            contains = vh0Var2.X1lG3V04pd().contains(str2);
                            break;
                    }
                    return Boolean.valueOf(!contains);
                }
            });
            if (!mE4lRynR.isEmpty()) {
                throw new IllegalArgumentException(("Deep link " + vh0Var.GWasM1elztuh + " can't be used to open destination " + ((xh0) ai0Var.Yi7zF1RB1) + ".\nFollowing required arguments are missing: " + mE4lRynR).toString());
            }
            ((ArrayList) ai0Var.X1lG3V04pd).add(vh0Var);
        }
        Iterator it = this.OOA6hdeuvCS.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            ((Number) entry2.getKey()).intValue();
            entry2.getValue().getClass();
            o4.YmKjaVtbfp5Z();
            return null;
        }
        String str2 = this.Yi7zF1RB1;
        if (str2 != null) {
            ai0Var.getClass();
            if (b61.MItybXapHX(str2)) {
                o4.mE4lRynR("Cannot have an empty route");
                return null;
            }
            String concat = "android-app://androidx.navigation/".concat(str2);
            final vh0 vh0Var2 = new vh0(concat);
            final int i3 = 1;
            ArrayList mE4lRynR2 = w60.mE4lRynR((LinkedHashMap) ai0Var.xqGvceK5x, new hv() { // from class: zh0
                @Override // defpackage.hv
                public final Object mOu10nynGul(Object obj2) {
                    boolean contains;
                    int i32 = i3;
                    vh0 vh0Var22 = vh0Var2;
                    String str22 = (String) obj2;
                    switch (i32) {
                        case 0:
                            str22.getClass();
                            contains = vh0Var22.X1lG3V04pd().contains(str22);
                            break;
                        default:
                            str22.getClass();
                            contains = vh0Var22.X1lG3V04pd().contains(str22);
                            break;
                    }
                    return Boolean.valueOf(!contains);
                }
            });
            if (!mE4lRynR2.isEmpty()) {
                throw new IllegalArgumentException(("Cannot set route \"" + str2 + "\" for destination " + ((xh0) ai0Var.Yi7zF1RB1) + ". Following required arguments are missing: " + mE4lRynR2).toString());
            }
            ai0Var.EljAMC1QTz = new m71(new o1(5, concat));
            ai0Var.GWasM1elztuh = concat.hashCode();
            ai0Var.OOA6hdeuvCS = str2;
        }
        return Yi7zF1RB1;
    }

    public xh0 Yi7zF1RB1() {
        return this.GWasM1elztuh.GWasM1elztuh();
    }
}
