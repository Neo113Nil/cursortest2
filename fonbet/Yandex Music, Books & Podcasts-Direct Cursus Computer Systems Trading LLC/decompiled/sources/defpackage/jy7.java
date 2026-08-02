package defpackage;

import com.yandex.plus.log.api.a;
import com.yandex.plus.log.api.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class jy7 implements ef {
    public final b a;
    public final LinkedHashMap b;

    public jy7(ArrayList arrayList, b bVar) {
        bVar.getClass();
        this.a = bVar;
        int a = tah.a(v75.o(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(a < 16 ? 16 : a);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bh bhVar = (bh) it.next();
            linkedHashMap.put(bhVar.b, btf.b(bhVar.c));
        }
        this.b = linkedHashMap;
    }

    @Override // defpackage.ef
    public final df b(md mdVar) {
        mdVar.getClass();
        arf arfVar = (arf) this.b.get(ern.a(mdVar.getClass()));
        df dfVar = arfVar != null ? (df) arfVar.getValue() : null;
        b bVar = this.a;
        if (dfVar != null) {
            a aVar = a.c;
            if (bVar.b(aVar)) {
                bVar.c(aVar, "DescriptorActionHandlerModule", "Handler for action = " + mdVar + " found");
                return dfVar;
            }
        } else {
            a aVar2 = a.d;
            if (bVar.b(aVar2)) {
                bVar.c(aVar2, "DescriptorActionHandlerModule", "Handler for action = " + mdVar + " not found!");
            }
        }
        return dfVar;
    }
}
