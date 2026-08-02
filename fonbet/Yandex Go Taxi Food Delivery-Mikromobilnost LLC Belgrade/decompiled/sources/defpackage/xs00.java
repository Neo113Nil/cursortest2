package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class xs00 {
    public static String a(a aVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = aVar.a.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlin.collections.a.X(b(qcx.m((b) it.next()), EmptyList.a), "|", null, null, null, 62));
        }
        return kotlin.collections.a.X(arrayList, "~", null, null, null, 62);
    }

    public static ArrayList b(c cVar, List list) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : cVar.a.entrySet()) {
            String str = (String) entry.getKey();
            Object obj = (b) entry.getValue();
            ArrayList o0 = kotlin.collections.a.o0(list, str);
            boolean z = obj instanceof c;
            if (z && jl40.l(str, "stylers")) {
                arrayList.addAll(c(new a(Collections.singletonList(obj)), o0));
            } else if (z) {
                arrayList.addAll(b((c) obj, o0));
            } else {
                boolean z2 = obj instanceof a;
                if (z2 && jl40.l(str, "stylers")) {
                    arrayList.addAll(c((a) obj, o0));
                } else if (z2) {
                    arrayList.add(kotlin.collections.a.X(o0, Extension.DOT_CHAR, null, null, null, 62) + ":" + kotlin.collections.a.X((Iterable) obj, ";", null, null, new ws00(0), 30));
                } else {
                    String X = kotlin.collections.a.X(o0, Extension.DOT_CHAR, null, null, null, 62);
                    d dVar = obj instanceof d ? (d) obj : null;
                    arrayList.add(X + ":" + (dVar != null ? qcx.g(dVar) : null));
                }
            }
        }
        return arrayList;
    }

    public static ArrayList c(a aVar, ArrayList arrayList) {
        String str;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(tcc.n(aVar, 10));
        Iterator it = aVar.a.iterator();
        while (it.hasNext()) {
            arrayList3.add(new LinkedHashMap(qcx.m((b) it.next())));
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Map map = (Map) it2.next();
            String str2 = (String) kotlin.collections.a.Z(arrayList);
            b bVar = (b) map.get("zoom");
            if (bVar != null) {
                if (bVar instanceof d) {
                    str = "[" + bVar + "]";
                } else {
                    a l = qcx.l(bVar);
                    if (l.a.size() == 1) {
                        str = "[" + l.get(0) + "]";
                    } else {
                        str = "[" + l.get(0) + "-" + l.get(1) + "]";
                    }
                }
                str2 = str2 + str;
                map.remove("zoom");
            }
            arrayList2.addAll(b(new c(map), kotlin.collections.a.o0(kotlin.collections.a.K(arrayList), str2)));
        }
        return arrayList2;
    }
}
