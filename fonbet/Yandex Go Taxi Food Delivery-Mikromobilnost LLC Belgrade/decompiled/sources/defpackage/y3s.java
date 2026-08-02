package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.section_promo.b;

/* loaded from: classes5.dex */
public final class y3s {
    public static final /* synthetic */ int d = 0;
    public final b a;
    public final a b;
    public final LinkedHashMap c;

    public y3s(Set set, b bVar, a aVar) {
        this.a = bVar;
        this.b = aVar;
        Set set2 = set;
        int d2 = gw00.d(tcc.n(set2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(d2 < 16 ? 16 : d2);
        for (Object obj : set2) {
            linkedHashMap.put(((m7) obj).c(), obj);
        }
        this.c = linkedHashMap;
    }

    public final tpr a(pre preVar) {
        m7 m7Var = (m7) this.c.get(preVar.getType());
        boolean z = preVar instanceof kg31;
        int i = 2;
        EmptyList emptyList = EmptyList.a;
        if (!z) {
            if (m7Var != null) {
                return m7Var.d(preVar.getId());
            }
            jgz.a.h("y3s");
            jgz.a(oyr.p("No StateHolder found for WidgetType ", preVar.getType(), ". Check dependency injection or binding"), new Object[0]);
            return new g92(i, emptyList);
        }
        kg31 kg31Var = (kg31) preVar;
        ArrayList arrayList = kg31Var.b;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(a((pre) it.next()));
        }
        boolean isEmpty = arrayList2.isEmpty();
        Collection collection = arrayList2;
        if (isEmpty) {
            collection = Collections.singletonList(new g92(i, emptyList));
        }
        return new l7(9, new ui7((tpr[]) kotlin.collections.a.J0((List) collection).toArray(new tpr[0]), 4), this, kg31Var);
    }
}
