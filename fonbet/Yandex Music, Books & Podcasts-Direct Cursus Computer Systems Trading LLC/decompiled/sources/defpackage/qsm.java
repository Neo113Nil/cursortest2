package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class qsm {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(lsm.a, 0);
        hashMap.put(lsm.b, 1);
        hashMap.put(lsm.c, 2);
        for (lsm lsmVar : hashMap.keySet()) {
            a.append(((Integer) b.get(lsmVar)).intValue(), lsmVar);
        }
    }

    public static int a(lsm lsmVar) {
        Integer num = (Integer) b.get(lsmVar);
        if (num != null) {
            return num.intValue();
        }
        b6e.u(lsmVar, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static lsm b(int i) {
        lsm lsmVar = (lsm) a.get(i);
        if (lsmVar != null) {
            return lsmVar;
        }
        xq0.x(k5r.i(i, "Unknown Priority for value "));
        return null;
    }
}
