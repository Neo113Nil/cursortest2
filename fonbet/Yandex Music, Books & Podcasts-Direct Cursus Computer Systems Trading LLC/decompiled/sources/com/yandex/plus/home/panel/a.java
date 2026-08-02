package com.yandex.plus.home.panel;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.home.repository.api.model.panel.j;
import com.yandex.plus.home.repository.api.model.panel.k;
import com.yandex.plus.home.repository.api.model.panel.l;
import com.yandex.plus.home.repository.api.model.panel.m;
import com.yandex.plus.home.repository.api.model.panel.n;
import defpackage.b6e;
import defpackage.dnb;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;

/* loaded from: classes5.dex */
public final class a {
    public final dnb a;
    public final com.yandex.plus.home.internal.di.a b;

    public a(dnb dnbVar, com.yandex.plus.home.internal.di.a aVar) {
        dnbVar.getClass();
        this.a = dnbVar;
        this.b = aVar;
    }

    public final void a(LinkedList linkedList) {
        linkedList.getClass();
        if (((Boolean) this.b.invoke()).booleanValue()) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                n nVar = (n) it.next();
                boolean z = nVar instanceof k;
                dnb dnbVar = this.a;
                if (z) {
                    k kVar = (k) nVar;
                    String y = u.y(kVar.b);
                    String y2 = u.y(kVar.a);
                    dnbVar.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("shortcut_id", y);
                    linkedHashMap.put("shortcut_type", y2);
                    linkedHashMap.put("_meta", dnb.b(new HashMap()));
                    dnbVar.c("Error.Panel.Mapping.DarkShortcutNotFound", linkedHashMap);
                } else {
                    if (nVar instanceof l) {
                        l lVar = (l) nVar;
                        String y3 = u.y(lVar.b);
                        String y4 = u.y(lVar.a);
                        String y5 = u.y(lVar.c);
                        StringBuilder sb = new StringBuilder();
                        sb.append(lVar.f);
                        sb.append(lVar.g ? ".Light" : ".Dark");
                        String y6 = u.y(sb.toString());
                        String y7 = u.y(lVar.d);
                        String y8 = u.y(lVar.e);
                        dnbVar.getClass();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        linkedHashMap2.put("shortcut_id", y3);
                        linkedHashMap2.put("shortcut_type", y4);
                        linkedHashMap2.put("overlay_shape", y5);
                        linkedHashMap2.put("property_class_name", y6);
                        linkedHashMap2.put("property_name", y7);
                        linkedHashMap2.put("property_value", y8);
                        linkedHashMap2.put("property_items_count", "no_value");
                        linkedHashMap2.put("_meta", dnb.b(new HashMap()));
                        dnbVar.c("Error.Panel.Mapping.InvalidProperty", linkedHashMap2);
                    } else if (nVar instanceof m) {
                        m mVar = (m) nVar;
                        String y9 = u.y(mVar.b);
                        String y10 = u.y(mVar.a);
                        String y11 = u.y(mVar.c.concat(mVar.d ? ".Light" : ".Dark"));
                        String y12 = u.y("logo");
                        dnbVar.getClass();
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        linkedHashMap3.put("shortcut_id", y9);
                        linkedHashMap3.put("shortcut_type", y10);
                        linkedHashMap3.put("shortcut_class_name", y11);
                        linkedHashMap3.put("overlay_shape", y12);
                        linkedHashMap3.put("_meta", dnb.b(new HashMap()));
                        dnbVar.c("Error.Panel.Mapping.OverlayNotFound", linkedHashMap3);
                    } else {
                        if (!(nVar instanceof j)) {
                            b6e.s();
                            return;
                        }
                        String y13 = u.y(((j) nVar).a);
                        dnbVar.getClass();
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                        linkedHashMap4.put("section_type", y13);
                        linkedHashMap4.put("_meta", dnb.b(new HashMap()));
                        dnbVar.c("Error.Panel.Mapping.DarkSectionNotFound", linkedHashMap4);
                    }
                }
            }
        }
    }
}
