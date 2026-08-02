package com.yandex.plus.bdui.plus.templating.render;

import defpackage.tah;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class b implements com.yandex.plus.core.templating.render.b {
    public static final b b = new b(0);
    public static final b c = new b(1);
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i) {
        this.a = i;
    }

    @Override // com.yandex.plus.core.templating.render.b
    public final Object a(Object obj, Map map) {
        switch (this.a) {
            case 0:
                Map map2 = (Map) obj;
                map2.getClass();
                map.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(map2.size()));
                for (Map.Entry entry : map2.entrySet()) {
                    Object key = entry.getKey();
                    Map map3 = (Map) entry.getValue();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(tah.a(map3.size()));
                    for (Map.Entry entry2 : map3.entrySet()) {
                        linkedHashMap2.put(entry2.getKey(), ((g) entry2.getValue()).a(map));
                    }
                    linkedHashMap.put(key, linkedHashMap2);
                }
                return linkedHashMap;
            default:
                Map map4 = (Map) obj;
                map4.getClass();
                map.getClass();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(tah.a(map4.size()));
                for (Map.Entry entry3 : map4.entrySet()) {
                    linkedHashMap3.put(entry3.getKey(), ((g) entry3.getValue()).a(map));
                }
                return linkedHashMap3;
        }
    }
}
