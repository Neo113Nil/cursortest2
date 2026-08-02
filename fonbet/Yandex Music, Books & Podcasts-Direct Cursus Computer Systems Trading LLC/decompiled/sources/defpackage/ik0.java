package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ik0 implements ok0 {
    public ArrayList a;

    public ik0(int i, boolean z) {
        switch (i) {
            case 2:
                this.a = new ArrayList();
                break;
            case 6:
                this.a = new ArrayList();
                break;
            default:
                this.a = new ArrayList(20);
                break;
        }
    }

    @Override // defpackage.ok0
    public cs2 a() {
        ArrayList arrayList = this.a;
        return ((acf) arrayList.get(0)).c() ? new bod(arrayList, 1) : new kak(arrayList);
    }

    @Override // defpackage.ok0
    public List b() {
        return this.a;
    }

    @Override // defpackage.ok0
    public boolean c() {
        ArrayList arrayList = this.a;
        return arrayList.size() == 1 && ((acf) arrayList.get(0)).c();
    }

    public void d(Object obj) {
        ArrayList arrayList = this.a;
        a4g.r(obj, "Set contributions cannot be null");
        arrayList.add(obj);
    }

    public synchronized ArrayList e(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            s6t s6tVar = (s6t) it.next();
            if ((s6tVar.a.isAssignableFrom(cls) && cls2.isAssignableFrom(s6tVar.b)) && !arrayList.contains(s6tVar.b)) {
                arrayList.add(s6tVar.b);
            }
        }
        return arrayList;
    }
}
