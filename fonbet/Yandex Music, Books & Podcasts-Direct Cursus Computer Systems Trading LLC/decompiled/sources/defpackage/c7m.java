package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes4.dex */
public final class c7m {
    public final byb a;

    public c7m(byb bybVar) {
        bybVar.getClass();
        this.a = bybVar;
    }

    public final String a() {
        List split$default;
        Long s0;
        Long s02;
        List<String> d = this.a.d();
        ArrayList arrayList = new ArrayList();
        for (String str : d) {
            split$default = StringsKt__StringsKt.split$default(str, new String[]{StringUtils.COMMA}, false, 0, 6, null);
            List list = split$default;
            ArrayList arrayList2 = new ArrayList(v75.o(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(StringsKt.t0((String) it.next()).toString());
            }
            if (arrayList2.size() != 3) {
                str = (arrayList2.size() != 2 || (s0 = StringsKt.s0((String) arrayList2.get(0))) == null || (s02 = StringsKt.s0((String) arrayList2.get(1))) == null) ? null : CollectionsKt.X(u75.h(s0, 0L, s02), StringUtils.COMMA, null, null, null, 62);
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return CollectionsKt.X(arrayList, ";", null, null, null, 62);
    }

    public final Set b() {
        Map C = this.a.e().b.C();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : C.entrySet()) {
            if (!Intrinsics.d((String) entry.getKey(), "ABTestIds")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            arrayList.add(((String) entry2.getKey()) + StringUtils.PROCESS_POSTFIX_DELIMITER + ((String) entry2.getValue()));
        }
        return CollectionsKt.A0(arrayList);
    }
}
