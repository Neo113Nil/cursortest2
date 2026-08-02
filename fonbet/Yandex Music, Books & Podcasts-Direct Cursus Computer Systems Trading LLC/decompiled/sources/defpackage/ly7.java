package defpackage;

import com.yandex.passport.internal.storage.d;
import com.yandex.plus.log.api.a;
import com.yandex.plus.log.api.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class ly7 implements vb6 {
    public final d a;
    public final b b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;

    public ly7(ArrayList arrayList, d dVar, b bVar) {
        bVar.getClass();
        this.a = dVar;
        this.b = bVar;
        int a = tah.a(v75.o(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(a < 16 ? 16 : a);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            de6 de6Var = (de6) it.next();
            linkedHashMap.put(de6Var.b, de6Var.c);
        }
        this.c = linkedHashMap;
        this.d = new LinkedHashMap();
    }

    @Override // defpackage.vb6
    public final ub6 a(r7b r7bVar, kb6 kb6Var) {
        r7bVar.getClass();
        kb6Var.getClass();
        d dVar = this.a;
        ky7 ky7Var = new ky7(r7bVar, (f9f) dVar.invoke(kb6Var));
        LinkedHashMap linkedHashMap = this.d;
        ub6 ub6Var = (ub6) linkedHashMap.get(ky7Var);
        if (ub6Var != null) {
            return ub6Var;
        }
        vb6 vb6Var = (vb6) this.c.get(ern.a(kb6Var.getClass()));
        b bVar = this.b;
        if (vb6Var == null) {
            a aVar = a.e;
            if (bVar.b(aVar)) {
                bVar.c(aVar, "DescriptorContentControllerFactory", "Controller for content = " + kb6Var + " not found!");
            }
            kac.l(ern.a(kb6Var.getClass()), "Unsupported content type ");
            return null;
        }
        ub6 a = vb6Var.a(r7bVar, kb6Var);
        a aVar2 = a.c;
        if (bVar.b(aVar2)) {
            bVar.c(aVar2, "DescriptorContentControllerFactory", "Controller for content = " + kb6Var + " found");
        }
        linkedHashMap.put(new ky7(r7bVar, (f9f) dVar.invoke(kb6Var)), a);
        return a;
    }
}
