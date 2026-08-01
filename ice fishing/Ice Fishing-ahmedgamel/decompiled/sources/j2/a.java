package j2;

import W1.d;
import android.util.SparseArray;
import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f38356a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f38357b;

    static {
        HashMap hashMap = new HashMap();
        f38357b = hashMap;
        hashMap.put(d.f3407n, 0);
        hashMap.put(d.f3408u, 1);
        hashMap.put(d.f3409v, 2);
        for (d dVar : hashMap.keySet()) {
            f38356a.append(((Integer) f38357b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f38357b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i) {
        d dVar = (d) f38356a.get(i);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(AbstractC4404f.e(i, "Unknown Priority for value "));
    }
}
