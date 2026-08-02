package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.yandex.taxi.contacts.SelectedFrom;

/* loaded from: classes5.dex */
public final class zde {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    public static ArrayList a(String str, List list, List list2) {
        ?? r3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list2) {
            ide ideVar = (ide) obj;
            String str2 = ideVar.a;
            String valueOf = (str2 == null || str2.length() == 0) ? "" : String.valueOf(gvu0.u0(ideVar.a));
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = qv10.w(valueOf, linkedHashMap);
            }
            ((List) obj2).add(obj);
        }
        List<bgq0> list3 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
        for (bgq0 bgq0Var : list3) {
            String str3 = bgq0Var.d;
            arrayList.add(new dde(str3, bgq0Var.a, bgq0Var.b, SelectedFrom.STANDALONE, jl40.l(str3, str)));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (String str4 : a.w0(linkedHashMap.keySet())) {
            arrayList2.add(new ede(str4));
            List list4 = (List) linkedHashMap.get(str4);
            if (list4 != null) {
                List<ide> list5 = list4;
                r3 = new ArrayList(tcc.n(list5, 10));
                for (ide ideVar2 : list5) {
                    String str5 = ideVar2.c;
                    r3.add(new dde(str5, ideVar2.a, ideVar2.b, SelectedFrom.CONTACTS, jl40.l(str5, str)));
                }
            } else {
                r3 = EmptyList.a;
            }
            arrayList2.addAll(r3);
        }
        return arrayList2;
    }
}
