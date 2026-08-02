package com.yandex.plus.home.dailyquests.plugin.internal.proxy;

import com.yandex.plus.plaquesdk.plaque.api.models.a0;
import com.yandex.plus.plaquesdk.plaque.api.models.b0;
import com.yandex.plus.plaquesdk.plaque.api.models.c0;
import com.yandex.plus.plaquesdk.plaque.api.models.d0;
import com.yandex.plus.plaquesdk.plaque.api.models.g0;
import com.yandex.plus.plaquesdk.plaque.api.models.j0;
import com.yandex.plus.plaquesdk.plaque.api.models.n;
import com.yandex.plus.plaquesdk.plaque.api.models.o;
import com.yandex.plus.plaquesdk.plaque.api.models.p;
import com.yandex.plus.plaquesdk.plaque.api.models.s;
import com.yandex.plus.plaquesdk.plaque.api.models.t;
import com.yandex.plus.plaquesdk.plaque.api.models.u;
import com.yandex.plus.plaquesdk.plaque.api.models.v;
import com.yandex.plus.plaquesdk.plaque.api.models.x;
import com.yandex.plus.plaquesdk.plaque.api.models.y;
import com.yandex.plus.plaquesdk.plaque.api.models.z;
import defpackage.b6e;
import defpackage.omb;
import defpackage.t75;
import defpackage.v75;
import defpackage.z75;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class a {
    public final omb a;

    public a(omb ombVar, int i) {
        switch (i) {
            case 1:
                ombVar.getClass();
                this.a = ombVar;
                break;
            default:
                ombVar.getClass();
                this.a = ombVar;
                break;
        }
    }

    public static List a(x xVar) {
        if (xVar instanceof s) {
            return t75.c(xVar);
        }
        if (!(xVar instanceof o)) {
            b6e.s();
            return null;
        }
        List a = ((o) xVar).a();
        ArrayList arrayList = new ArrayList();
        Iterator it = a.iterator();
        while (it.hasNext()) {
            z75.t(arrayList, a((x) it.next()));
        }
        return arrayList;
    }

    public static LinkedHashMap c(c0 c0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (c0Var instanceof y) {
            linkedHashMap.put(Constants.KEY_ACTION, "deeplink");
            linkedHashMap.put("deeplink", ((y) c0Var).b);
            return linkedHashMap;
        }
        if (c0Var instanceof b0) {
            linkedHashMap.put(Constants.KEY_ACTION, "switch");
            return linkedHashMap;
        }
        if (c0Var instanceof a0) {
            linkedHashMap.put(Constants.KEY_ACTION, "host");
            linkedHashMap.putAll(((a0) c0Var).c);
            return linkedHashMap;
        }
        if (c0Var instanceof z) {
            linkedHashMap.put(Constants.KEY_ACTION, "just_interact");
            return linkedHashMap;
        }
        if (c0Var == null) {
            linkedHashMap.put(Constants.KEY_ACTION, "no_action");
            return linkedHashMap;
        }
        b6e.s();
        return null;
    }

    public static LinkedHashMap d(s sVar, com.yandex.plus.home.plaque.feature.api.context.b bVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("widget_id", sVar.getId());
        linkedHashMap.putAll(c(sVar.q()));
        if (sVar instanceof v) {
            linkedHashMap.put("content_type", "text");
            linkedHashMap.put("text", ((v) sVar).e.a.toString());
            return linkedHashMap;
        }
        if (sVar instanceof p) {
            linkedHashMap.put("content_type", "icon");
            return linkedHashMap;
        }
        if (sVar instanceof u) {
            linkedHashMap.put("content_type", "switch");
            u uVar = (u) sVar;
            linkedHashMap.put("text", uVar.e.a.toString());
            Boolean bool = (Boolean) bVar.c.get(uVar.a);
            linkedHashMap.put("turn", String.valueOf(bool != null ? bool.booleanValue() : false));
            return linkedHashMap;
        }
        if (sVar instanceof n) {
            linkedHashMap.put("content_type", "button");
            return linkedHashMap;
        }
        if (sVar instanceof t) {
            linkedHashMap.put("content_type", "spacer");
            return linkedHashMap;
        }
        b6e.s();
        return null;
    }

    public void b(com.yandex.plus.home.plaque.repository.api.model.c cVar, com.yandex.plus.home.plaque.feature.api.context.b bVar) {
        cVar.getClass();
        bVar.getClass();
        j0 b = cVar.b();
        Map a = cVar.a();
        String str = b.a;
        Object obj = bVar.a.get("screen");
        String str2 = obj instanceof String ? (String) obj : null;
        if (str2 == null) {
            str2 = "no_value";
        }
        g0 g0Var = b.c;
        d0 d0Var = g0Var instanceof d0 ? (d0) g0Var : null;
        String num = d0Var != null ? Integer.valueOf(d0Var.a).toString() : null;
        String str3 = num != null ? num : "no_value";
        List a2 = a(b.b);
        ArrayList arrayList = new ArrayList(v75.o(a2, 10));
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            arrayList.add(d((s) it.next(), bVar));
        }
        omb ombVar = this.a;
        ombVar.getClass();
        str.getClass();
        a.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("plaque_id", str);
        linkedHashMap.put("screen", str2);
        linkedHashMap.put("notification_count", str3);
        linkedHashMap.put("widget_list", arrayList);
        linkedHashMap.put("metric_context", a);
        linkedHashMap.put("_meta", omb.a(1, new HashMap()));
        ombVar.d("CashbackBadge.Shown", linkedHashMap);
    }
}
