package l2;

import Y1.d;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.Wv;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f38868a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f38869b;

    static {
        HashMap hashMap = new HashMap();
        f38869b = hashMap;
        hashMap.put(d.f3904n, 0);
        hashMap.put(d.f3905u, 1);
        hashMap.put(d.f3906v, 2);
        for (d dVar : hashMap.keySet()) {
            f38868a.append(((Integer) f38869b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f38869b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i) {
        d dVar = (d) f38868a.get(i);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(Wv.f(i, "Unknown Priority for value "));
    }
}
