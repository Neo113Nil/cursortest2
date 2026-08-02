package com.yandex.plus.pay.api.analytics;

import defpackage.v75;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes5.dex */
public final class b {
    public String a;
    public Set b;
    public Set c;
    public final LinkedHashMap d = new LinkedHashMap();

    public final void a(String str) {
        List split$default;
        List split$default2;
        Long s0;
        split$default = StringsKt__StringsKt.split$default(str, new String[]{";"}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : split$default) {
            if (!StringsKt.U((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            split$default2 = StringsKt__StringsKt.split$default((String) it.next(), new String[]{StringUtils.COMMA}, false, 0, 6, null);
            List list = split$default2;
            ArrayList arrayList3 = new ArrayList(v75.o(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList3.add(StringsKt.t0((String) it2.next()).toString());
            }
            e eVar = null;
            if (arrayList3.size() == 3 && (s0 = StringsKt.s0((String) arrayList3.get(0))) != null) {
                long longValue = s0.longValue();
                Long s02 = StringsKt.s0((String) arrayList3.get(2));
                if (s02 != null) {
                    eVar = new e(longValue, s02.longValue());
                }
            }
            if (eVar != null) {
                arrayList2.add(eVar);
            }
        }
        this.b = CollectionsKt.A0(arrayList2);
    }
}
