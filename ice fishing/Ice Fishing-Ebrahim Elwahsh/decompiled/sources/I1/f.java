package I1;

import Z0.t;
import android.graphics.Matrix;
import android.graphics.Path;
import b6.C0530a;
import j1.j;
import java.util.ArrayList;
import java.util.Comparator;
import s1.k;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1255a;

    public f(int i) {
        switch (i) {
            case 1:
                this.f1255a = new ArrayList();
                break;
            case 2:
                this.f1255a = new ArrayList();
                break;
            default:
                this.f1255a = new ArrayList();
                break;
        }
    }

    public void a(Path path) {
        ArrayList arrayList = this.f1255a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            t tVar = (t) arrayList.get(size);
            Matrix matrix = j.f38533a;
            if (tVar != null && !tVar.f4193a) {
                j.a(path, tVar.f4196d.l() / 100.0f, tVar.f4197e.l() / 100.0f, tVar.f4198f.l() / 360.0f);
            }
        }
    }

    public C0530a b() {
        ArrayList arrayList = this.f1255a;
        if (arrayList.size() == 2 && arrayList.get(0) != null) {
            return new C0530a(arrayList.toArray());
        }
        Object[] array = arrayList.toArray();
        Comparator comparator = C0530a.f5556v;
        for (int i = 0; i < array.length; i += 2) {
            g6.e eVar = (g6.e) array[i];
            if (eVar != null && eVar.f37932b.isEmpty()) {
                array[i] = null;
            }
        }
        return new C0530a(array, C0530a.f5556v);
    }

    public synchronized k c(Class cls) {
        int size = this.f1255a.size();
        for (int i = 0; i < size; i++) {
            e eVar = (e) this.f1255a.get(i);
            if (eVar.f1253a.isAssignableFrom(cls)) {
                return eVar.f1254b;
            }
        }
        return null;
    }

    public void d(g6.e eVar, Object obj) {
        if (eVar == null || eVar.f37932b.isEmpty() || obj == null) {
            return;
        }
        ArrayList arrayList = this.f1255a;
        arrayList.add(eVar);
        arrayList.add(obj);
    }

    public void e(String str, String str2) {
        d(g6.e.a(b6.b.f5560n, str), str2);
    }

    public void f(b6.c cVar) {
        if (cVar == null) {
            return;
        }
        cVar.forEach(new O6.a(1, this));
    }

    public f(ArrayList arrayList) {
        this.f1255a = arrayList;
    }
}
