package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class rc0 extends q70 {
    public static Map AEn1Rrio(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            return yp.OOA6hdeuvCS;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        singletonMap.getClass();
        return singletonMap;
    }

    public static int EXrPz3p7hFb(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static ic0 k8h8IjolWQ(ic0 ic0Var) {
        ic0Var.Yi7zF1RB1();
        ic0Var.YmKjaVtbfp5Z = true;
        if (ic0Var.XnEVoBF0td1l > 0) {
            return ic0Var;
        }
        ic0 ic0Var2 = ic0.Mjvvu5DE;
        ic0Var2.getClass();
        return ic0Var2;
    }

    public static Map ozMwhSAI(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return yp.OOA6hdeuvCS;
        }
        int i = 0;
        if (size == 1) {
            rn0 rn0Var = (rn0) arrayList.get(0);
            rn0Var.getClass();
            Map singletonMap = Collections.singletonMap(rn0Var.OOA6hdeuvCS, rn0Var.EljAMC1QTz);
            singletonMap.getClass();
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(EXrPz3p7hFb(arrayList.size()));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            rn0 rn0Var2 = (rn0) obj;
            linkedHashMap.put(rn0Var2.OOA6hdeuvCS, rn0Var2.EljAMC1QTz);
        }
        return linkedHashMap;
    }
}
