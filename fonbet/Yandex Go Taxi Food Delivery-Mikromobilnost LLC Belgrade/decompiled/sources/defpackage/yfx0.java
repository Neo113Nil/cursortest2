package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.requirements.glued.interactor.d;

/* loaded from: classes6.dex */
public final class yfx0 {
    public final d a;

    public yfx0(d dVar) {
        this.a = dVar;
    }

    public static ArrayList a(pex0 pex0Var) {
        List f = pex0Var.f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : f) {
            if (obj instanceof jmw0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((jmw0) next).f()) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }
}
