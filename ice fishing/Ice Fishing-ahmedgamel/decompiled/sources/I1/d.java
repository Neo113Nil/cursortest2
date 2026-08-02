package I1;

import c1.AbstractC0545e;
import c1.j;
import c1.m;
import g6.C4535a;
import h6.C4579a;
import i8.l;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import m1.C4739a;

/* loaded from: classes.dex */
public final class d implements f1.e {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f1308n;

    public d(int i) {
        switch (i) {
            case 2:
                this.f1308n = new ArrayList();
                break;
            case 3:
                this.f1308n = new ArrayList(20);
                break;
            default:
                this.f1308n = new ArrayList();
                break;
        }
    }

    @Override // f1.e
    public AbstractC0545e a() {
        ArrayList arrayList = this.f1308n;
        return ((C4739a) arrayList.get(0)).c() ? new j(arrayList, 1) : new m(arrayList);
    }

    @Override // f1.e
    public List b() {
        return this.f1308n;
    }

    @Override // f1.e
    public boolean c() {
        ArrayList arrayList = this.f1308n;
        return arrayList.size() == 1 && ((C4739a) arrayList.get(0)).c();
    }

    public C4535a d() {
        ArrayList arrayList = this.f1308n;
        if (arrayList.size() == 2 && arrayList.get(0) != null) {
            return new C4535a(arrayList.toArray());
        }
        Object[] array = arrayList.toArray();
        Comparator comparator = C4535a.f37681w;
        for (int i = 0; i < array.length; i += 2) {
            C4579a c4579a = (C4579a) array[i];
            if (c4579a != null && c4579a.f38137b.isEmpty()) {
                array[i] = null;
            }
        }
        return new C4535a(array, C4535a.f37681w);
    }

    public l e() {
        return new l((String[]) this.f1308n.toArray(new String[0]));
    }

    public synchronized ArrayList f(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.f1308n.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if ((cVar.f1305a.isAssignableFrom(cls) && cls2.isAssignableFrom(cVar.f1306b)) && !arrayList.contains(cVar.f1306b)) {
                arrayList.add(cVar.f1306b);
            }
        }
        return arrayList;
    }

    public void g(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1308n;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public d(ArrayList arrayList) {
        this.f1308n = arrayList;
    }
}
