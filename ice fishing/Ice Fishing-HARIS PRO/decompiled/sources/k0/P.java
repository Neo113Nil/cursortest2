package k0;

import android.util.SparseArray;
import java.util.Set;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f3404a;

    /* renamed from: b, reason: collision with root package name */
    public int f3405b;

    /* renamed from: c, reason: collision with root package name */
    public Set f3406c;

    public final O a(int i) {
        SparseArray sparseArray = this.f3404a;
        O o2 = (O) sparseArray.get(i);
        if (o2 != null) {
            return o2;
        }
        O o3 = new O();
        sparseArray.put(i, o3);
        return o3;
    }
}
