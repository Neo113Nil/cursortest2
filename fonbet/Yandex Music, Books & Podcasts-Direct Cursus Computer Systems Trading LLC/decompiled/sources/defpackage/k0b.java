package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class k0b {
    public final jyr a = l18.b.b(hag.I(afw.class), true);

    public static ArrayList a(how howVar) {
        Iterable g0 = howVar != null ? CollectionsKt.g0(howVar.a, howVar.b) : c5b.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : g0) {
            fow.b.getClass();
            if (u75.h(fow.d, fow.f, fow.h).contains(((gow) obj).b)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            gow gowVar = (gow) it.next();
            arrayList2.add(new q0b(gowVar.a, gowVar.k));
        }
        return arrayList2;
    }

    public final fkn b() {
        jyr jyrVar = this.a;
        ub7 ub7Var = new ub7(6, ((afw) jyrVar.getValue()).d(), this);
        how b = ((afw) jyrVar.getValue()).b();
        return lg3.u0(ub7Var, cmd.a, b != null ? a(b) : c5b.a);
    }
}
