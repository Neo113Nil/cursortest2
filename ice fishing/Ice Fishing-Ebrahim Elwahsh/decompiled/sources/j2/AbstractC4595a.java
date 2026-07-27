package j2;

import W1.d;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.CL;
import java.util.HashMap;

/* renamed from: j2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4595a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f38539a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f38540b;

    static {
        HashMap hashMap = new HashMap();
        f38540b = hashMap;
        hashMap.put(d.f3419n, 0);
        hashMap.put(d.f3420u, 1);
        hashMap.put(d.f3421v, 2);
        for (d dVar : hashMap.keySet()) {
            f38539a.append(((Integer) f38540b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f38540b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i) {
        d dVar = (d) f38539a.get(i);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(CL.i(i, "Unknown Priority for value "));
    }
}
