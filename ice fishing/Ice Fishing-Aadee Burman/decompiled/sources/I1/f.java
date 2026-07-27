package I1;

import g6.C4531a;
import h6.C4574a;
import java.util.ArrayList;
import java.util.Comparator;
import s1.k;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1286a;

    public f(int i) {
        switch (i) {
            case 1:
                this.f1286a = new ArrayList();
                break;
            default:
                this.f1286a = new ArrayList();
                break;
        }
    }

    public C4531a a() {
        ArrayList arrayList = this.f1286a;
        if (arrayList.size() == 2 && arrayList.get(0) != null) {
            return new C4531a(arrayList.toArray());
        }
        Object[] array = arrayList.toArray();
        Comparator comparator = C4531a.f37656w;
        for (int i = 0; i < array.length; i += 2) {
            C4574a c4574a = (C4574a) array[i];
            if (c4574a != null && c4574a.f38020b.isEmpty()) {
                array[i] = null;
            }
        }
        return new C4531a(array, C4531a.f37656w);
    }

    public synchronized k b(Class cls) {
        int size = this.f1286a.size();
        for (int i = 0; i < size; i++) {
            e eVar = (e) this.f1286a.get(i);
            if (eVar.f1284a.isAssignableFrom(cls)) {
                return eVar.f1285b;
            }
        }
        return null;
    }
}
