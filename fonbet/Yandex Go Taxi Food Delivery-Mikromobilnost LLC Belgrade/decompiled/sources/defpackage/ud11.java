package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class ud11 {
    public final Object a;
    public final ArrayList b;

    public ud11() {
        this.b = new ArrayList();
        this.a = null;
    }

    public final ud11 a(Object obj) {
        ud11 ud11Var = new ud11(obj);
        this.b.add(ud11Var);
        return ud11Var;
    }

    public final vd11 b() {
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ud11) it.next()).b());
        }
        return new vd11(arrayList2, this.a);
    }

    public ud11(Object obj) {
        this.b = new ArrayList();
        this.a = obj;
    }
}
