package I1;

import W6.h;
import a1.AbstractC0421e;
import a1.j;
import a1.m;
import c6.C0542a;
import d6.C4460a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import k1.C4628a;

/* loaded from: classes.dex */
public final class b implements d1.e {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f1246n;

    public b(int i) {
        switch (i) {
            case 1:
                this.f1246n = new ArrayList();
                break;
            case 2:
                this.f1246n = new ArrayList();
                break;
            case 3:
            default:
                this.f1246n = new ArrayList();
                break;
            case 4:
                this.f1246n = new ArrayList(20);
                break;
        }
    }

    @Override // d1.e
    public AbstractC0421e a() {
        ArrayList arrayList = this.f1246n;
        return ((C4628a) arrayList.get(0)).c() ? new j(arrayList, 1) : new m(arrayList);
    }

    @Override // d1.e
    public List b() {
        return this.f1246n;
    }

    @Override // d1.e
    public boolean c() {
        ArrayList arrayList = this.f1246n;
        return arrayList.size() == 1 && ((C4628a) arrayList.get(0)).c();
    }

    public h d() {
        return new h(this.f1246n);
    }

    public C0542a e() {
        ArrayList arrayList = this.f1246n;
        if (arrayList.size() == 2 && arrayList.get(0) != null) {
            return new C0542a(arrayList.toArray());
        }
        Object[] array = arrayList.toArray();
        Comparator comparator = C0542a.f5711w;
        for (int i = 0; i < array.length; i += 2) {
            C4460a c4460a = (C4460a) array[i];
            if (c4460a != null && c4460a.f37203b.isEmpty()) {
                array[i] = null;
            }
        }
        return new C0542a(array, C0542a.f5711w);
    }

    public e8.m f() {
        return new e8.m((String[]) this.f1246n.toArray(new String[0]));
    }

    public void g(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1246n;
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

    public b(ArrayList arrayList) {
        this.f1246n = arrayList;
    }
}
