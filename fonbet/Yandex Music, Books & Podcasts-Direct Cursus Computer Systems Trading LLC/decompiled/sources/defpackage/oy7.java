package defpackage;

import com.yandex.passport.internal.storage.d;
import com.yandex.plus.log.api.a;
import com.yandex.plus.log.api.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class oy7 implements uro {
    public final d a;
    public final b b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;

    public oy7(ArrayList arrayList, d dVar, b bVar) {
        bVar.getClass();
        this.a = dVar;
        this.b = bVar;
        int a = tah.a(v75.o(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(a < 16 ? 16 : a);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            iso isoVar = (iso) it.next();
            linkedHashMap.put(isoVar.b, isoVar.c);
        }
        this.c = linkedHashMap;
        this.d = new LinkedHashMap();
    }

    @Override // defpackage.uro
    public final tro a(r7b r7bVar, sro sroVar) {
        r7bVar.getClass();
        sroVar.getClass();
        d dVar = this.a;
        ny7 ny7Var = new ny7(r7bVar, (f9f) dVar.invoke(sroVar));
        LinkedHashMap linkedHashMap = this.d;
        tro troVar = (tro) linkedHashMap.get(ny7Var);
        if (troVar != null) {
            return troVar;
        }
        uro uroVar = (uro) this.c.get(ern.a(sroVar.getClass()));
        b bVar = this.b;
        if (uroVar == null) {
            a aVar = a.e;
            if (bVar.b(aVar)) {
                bVar.c(aVar, "DescriptorScaffoldControllerFactory", "Controller for scaffold " + sroVar + " not found!");
            }
            kac.l(ern.a(sroVar.getClass()), "Unsupported scaffold type ");
            return null;
        }
        tro a = uroVar.a(r7bVar, sroVar);
        a aVar2 = a.c;
        if (bVar.b(aVar2)) {
            bVar.c(aVar2, "DescriptorScaffoldControllerFactory", "Controller for scaffold " + sroVar + " found");
        }
        linkedHashMap.put(new ny7(r7bVar, (f9f) dVar.invoke(sroVar)), a);
        return a;
    }
}
