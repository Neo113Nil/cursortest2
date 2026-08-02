package com.yandex.plus.bdui.plus.templating.render;

import defpackage.tah;
import defpackage.v75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class a implements com.yandex.plus.core.templating.render.a {
    public final /* synthetic */ int a;
    public final com.yandex.plus.core.templating.parser.b b;

    public a(com.yandex.plus.core.templating.parser.b bVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                bVar.getClass();
                this.b = bVar;
                break;
            case 2:
                bVar.getClass();
                this.b = bVar;
                break;
            default:
                bVar.getClass();
                this.b = bVar;
                break;
        }
    }

    @Override // com.yandex.plus.core.templating.render.a
    public final Pair b(Object obj) {
        switch (this.a) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    Map map2 = (Map) entry.getValue();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(tah.a(map2.size()));
                    for (Map.Entry entry2 : map2.entrySet()) {
                        linkedHashMap2.put(entry2.getKey(), com.yandex.plus.bdui.flex.ui.a.u(this, this.b, entry2.getValue(), linkedHashSet));
                    }
                    linkedHashMap.put(key, linkedHashMap2);
                }
                return new Pair(linkedHashSet, linkedHashMap);
            case 1:
                Map map3 = (Map) obj;
                map3.getClass();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(tah.a(map3.size()));
                for (Map.Entry entry3 : map3.entrySet()) {
                    linkedHashMap3.put(entry3.getKey(), com.yandex.plus.bdui.flex.ui.a.u(this, this.b, entry3.getValue(), linkedHashSet2));
                }
                return new Pair(linkedHashSet2, linkedHashMap3);
            default:
                com.yandex.plus.bdui.query.g gVar = (com.yandex.plus.bdui.query.g) obj;
                gVar.getClass();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                String path = gVar.getPath();
                com.yandex.plus.core.templating.parser.b bVar = this.b;
                com.yandex.plus.bdui.templating.render.g a = com.yandex.plus.bdui.templating.render.d.a(bVar, path);
                LinkedHashMap linkedHashMap4 = null;
                ArrayList arrayList = a instanceof com.yandex.plus.bdui.templating.render.e ? ((com.yandex.plus.bdui.templating.render.e) a).a : null;
                if (arrayList != null) {
                    linkedHashSet3.addAll(com.yandex.plus.core.templating.render.a.a(arrayList));
                }
                Map params = gVar.getParams();
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(tah.a(params.size()));
                for (Map.Entry entry4 : params.entrySet()) {
                    Object key2 = entry4.getKey();
                    List list = (List) entry4.getValue();
                    ArrayList arrayList2 = new ArrayList(v75.o(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        com.yandex.plus.bdui.templating.render.g a2 = com.yandex.plus.bdui.templating.render.d.a(bVar, (String) it.next());
                        ArrayList arrayList3 = a2 instanceof com.yandex.plus.bdui.templating.render.e ? ((com.yandex.plus.bdui.templating.render.e) a2).a : null;
                        if (arrayList3 != null) {
                            linkedHashSet3.addAll(com.yandex.plus.core.templating.render.a.a(arrayList3));
                        }
                        arrayList2.add(a2);
                    }
                    linkedHashMap5.put(key2, arrayList2);
                }
                Map body = gVar.getBody();
                if (body != null) {
                    com.yandex.plus.bdui.templating.render.a aVar = new com.yandex.plus.bdui.templating.render.a(0, this, linkedHashSet3);
                    linkedHashMap4 = new LinkedHashMap(tah.a(body.size()));
                    for (Map.Entry entry5 : body.entrySet()) {
                        linkedHashMap4.put(entry5.getKey(), com.yandex.plus.bdui.plus.analytics.b.o(entry5.getValue(), String.class, aVar));
                    }
                }
                return new Pair(linkedHashSet3, new com.yandex.plus.bdui.templating.render.c(a, linkedHashMap5, linkedHashMap4));
        }
    }
}
