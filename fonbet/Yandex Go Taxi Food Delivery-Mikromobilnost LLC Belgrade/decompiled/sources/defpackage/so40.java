package defpackage;

import com.yandex.go.zone.dto.objects.TariffInfoGroupDefinition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes10.dex */
public final class so40 {
    public static List a(List list, Set set) {
        Object obj;
        Object obj2;
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                Object next = it2.next();
                if (jl40.l(((pex0) next).b, str)) {
                    obj2 = next;
                    break;
                }
            }
            pex0 pex0Var = (pex0) obj2;
            if (pex0Var != null) {
                arrayList.add(pex0Var);
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        List list2 = arrayList;
        if (isEmpty) {
            list2 = list;
        }
        List list3 = list2;
        ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((pex0) it3.next()).f);
        }
        Iterable iterable = (List) a.R(arrayList2);
        if (iterable == null) {
            iterable = EmptyList.a;
        }
        Iterable iterable2 = iterable;
        int d = gw00.d(tcc.n(iterable2, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Object obj3 : iterable2) {
            linkedHashMap.put(((TariffInfoGroupDefinition) obj3).a, obj3);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int f = scc.f(arrayList2);
        int i = 1;
        if (1 <= f) {
            while (true) {
                List list4 = (List) arrayList2.get(i);
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    String str2 = (String) entry.getKey();
                    TariffInfoGroupDefinition tariffInfoGroupDefinition = (TariffInfoGroupDefinition) entry.getValue();
                    Iterator it4 = list4.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it4.next();
                        if (jl40.l(((TariffInfoGroupDefinition) obj).a, str2)) {
                            break;
                        }
                    }
                    TariffInfoGroupDefinition tariffInfoGroupDefinition2 = (TariffInfoGroupDefinition) obj;
                    if (tariffInfoGroupDefinition2 == null) {
                        linkedHashSet.add(str2);
                    } else {
                        TariffInfoGroupDefinition tariffInfoGroupDefinition3 = (tariffInfoGroupDefinition == tariffInfoGroupDefinition2 || (jl40.l(tariffInfoGroupDefinition.a, tariffInfoGroupDefinition2.a) && tariffInfoGroupDefinition.c == tariffInfoGroupDefinition2.c && jl40.l(tariffInfoGroupDefinition.d, tariffInfoGroupDefinition2.d) && jl40.l(tariffInfoGroupDefinition.e, tariffInfoGroupDefinition2.e) && jl40.l(tariffInfoGroupDefinition.f, tariffInfoGroupDefinition2.f) && jl40.l(tariffInfoGroupDefinition.g, tariffInfoGroupDefinition2.g))) ? new TariffInfoGroupDefinition(tariffInfoGroupDefinition.a, a.J0(a.U(tariffInfoGroupDefinition.b, tariffInfoGroupDefinition2.b)), tariffInfoGroupDefinition.c, tariffInfoGroupDefinition.d, tariffInfoGroupDefinition.e, tariffInfoGroupDefinition.f, tariffInfoGroupDefinition.g, tariffInfoGroupDefinition.h) : null;
                        if (tariffInfoGroupDefinition3 != null) {
                            linkedHashMap2.put(str2, tariffInfoGroupDefinition3);
                        } else {
                            linkedHashSet.add(str2);
                        }
                    }
                }
                Iterator it5 = linkedHashSet.iterator();
                while (it5.hasNext()) {
                    linkedHashMap2.remove((String) it5.next());
                }
                linkedHashSet.clear();
                if (i == f) {
                    break;
                }
                i++;
            }
        }
        return a.J0(linkedHashMap2.values());
    }
}
