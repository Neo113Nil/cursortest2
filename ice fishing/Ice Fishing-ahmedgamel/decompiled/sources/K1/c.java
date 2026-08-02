package K1;

import f6.C4522a;
import java.util.ArrayList;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1671a;

    public c(int i) {
        switch (i) {
            case 1:
                this.f1671a = new ArrayList();
                break;
            default:
                this.f1671a = new ArrayList();
                break;
        }
    }

    public C4522a a() {
        ArrayList arrayList = this.f1671a;
        if (arrayList.size() == 2 && arrayList.get(0) != null) {
            return new C4522a(arrayList.toArray());
        }
        Object[] array = arrayList.toArray();
        Comparator comparator = C4522a.f37474v;
        for (int i = 0; i < array.length; i += 2) {
            k6.e eVar = (k6.e) array[i];
            if (eVar != null && eVar.f38613b.isEmpty()) {
                array[i] = null;
            }
        }
        return new C4522a(array, C4522a.f37474v);
    }

    public void b(String str, String str2) {
        c(k6.e.a(f6.b.f37478n, str), str2);
    }

    public void c(k6.e eVar, Object obj) {
        if (eVar == null || eVar.f38613b.isEmpty() || obj == null) {
            return;
        }
        ArrayList arrayList = this.f1671a;
        arrayList.add(eVar);
        arrayList.add(obj);
    }

    public void d(f6.c cVar) {
        if (cVar == null) {
            return;
        }
        cVar.forEach(new S6.b(1, this));
    }

    public c(ArrayList arrayList) {
        this.f1671a = arrayList;
    }
}
