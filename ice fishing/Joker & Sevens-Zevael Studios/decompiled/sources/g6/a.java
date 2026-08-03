package g6;

import android.util.SparseArray;
import java.util.HashMap;
import t5.d;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f2535a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f2536b;

    static {
        HashMap hashMap = new HashMap();
        f2536b = hashMap;
        hashMap.put(d.f6527g, 0);
        hashMap.put(d.f6528h, 1);
        hashMap.put(d.f6529i, 2);
        for (d dVar : hashMap.keySet()) {
            f2535a.append(((Integer) f2536b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f2536b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f2535a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(a4.d.g("Unknown Priority for value ", i10));
    }
}
