package d1;

import a1.AbstractC0428e;
import a1.j;
import a1.m;
import f6.C4512a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import k1.C4629a;

/* renamed from: d1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4445c implements f {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f37022n;

    public /* synthetic */ C4445c(ArrayList arrayList) {
        this.f37022n = arrayList;
    }

    @Override // d1.f
    public AbstractC0428e a() {
        ArrayList arrayList = this.f37022n;
        return ((C4629a) arrayList.get(0)).c() ? new j(arrayList, 1) : new m(arrayList);
    }

    @Override // d1.f
    public List b() {
        return this.f37022n;
    }

    @Override // d1.f
    public boolean c() {
        ArrayList arrayList = this.f37022n;
        return arrayList.size() == 1 && ((C4629a) arrayList.get(0)).c();
    }

    public C4512a d() {
        ArrayList arrayList = this.f37022n;
        if (arrayList.size() == 2 && arrayList.get(0) != null) {
            return new C4512a(arrayList.toArray());
        }
        Object[] array = arrayList.toArray();
        Comparator comparator = C4512a.f37512v;
        for (int i = 0; i < array.length; i += 2) {
            k6.e eVar = (k6.e) array[i];
            if (eVar != null && eVar.f38686b.isEmpty()) {
                array[i] = null;
            }
        }
        return new C4512a(array, C4512a.f37512v);
    }

    public void e(String str, String str2) {
        f(k6.e.a(f6.b.f37516n, str), str2);
    }

    public void f(k6.e eVar, Object obj) {
        if (eVar == null || eVar.f38686b.isEmpty() || obj == null) {
            return;
        }
        ArrayList arrayList = this.f37022n;
        arrayList.add(eVar);
        arrayList.add(obj);
    }

    public void g(f6.c cVar) {
        if (cVar == null) {
            return;
        }
        cVar.forEach(new S6.a(1, this));
    }

    public C4445c() {
        this.f37022n = new ArrayList();
    }
}
