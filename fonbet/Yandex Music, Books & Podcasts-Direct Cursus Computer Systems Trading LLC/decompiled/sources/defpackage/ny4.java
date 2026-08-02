package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public final class ny4 extends z3f {
    public static final ny0 c = new ny0(2);
    public final z3f a;
    public final /* synthetic */ int b;

    public ny4(z3f z3fVar, int i) {
        this.b = i;
        this.a = z3fVar;
    }

    @Override // defpackage.z3f
    public Object a(l7f l7fVar) {
        Collection arrayList;
        switch (this.b) {
            case 0:
                arrayList = new ArrayList();
                break;
            default:
                arrayList = new LinkedHashSet();
                break;
        }
        l7fVar.a();
        while (l7fVar.hasNext()) {
            arrayList.add(this.a.a(l7fVar));
        }
        l7fVar.z();
        return arrayList;
    }

    @Override // defpackage.z3f
    public void e(n7f n7fVar, Object obj) {
        n7fVar.b();
        Iterator it = ((Collection) obj).iterator();
        while (it.hasNext()) {
            this.a.e(n7fVar, it.next());
        }
        n7fVar.o(1, 2, ']');
    }

    public final String toString() {
        return this.a + ".collection()";
    }
}
