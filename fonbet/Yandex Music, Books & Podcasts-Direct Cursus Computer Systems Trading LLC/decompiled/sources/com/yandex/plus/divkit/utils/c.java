package com.yandex.plus.divkit.utils;

import android.net.Uri;
import com.yandex.plus.divkit.impl.o;
import defpackage.as7;
import defpackage.c85;
import defpackage.lpt;
import defpackage.pzb;
import defpackage.xzb;
import defpackage.y7k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class c {
    public static final b d = new b(1);
    public static final b e = new b(0);
    public final xzb a;
    public final y7k b;
    public final String c;

    public c(xzb xzbVar, y7k y7kVar, String str) {
        xzbVar.getClass();
        y7kVar.getClass();
        this.a = xzbVar;
        this.b = y7kVar;
        this.c = str;
    }

    public static Integer a(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof String) {
            return com.yandex.plus.bdui.flex.ui.a.z((String) obj);
        }
        if (obj instanceof c85) {
            return Integer.valueOf(((c85) obj).a);
        }
        return null;
    }

    public static Uri c(Object obj) {
        if (obj instanceof String) {
            return Uri.parse((String) obj);
        }
        if (obj instanceof Uri) {
            return (Uri) obj;
        }
        if (obj instanceof lpt) {
            return Uri.parse(((lpt) obj).a);
        }
        return null;
    }

    public final LinkedHashMap b(Object obj) {
        if (obj instanceof String) {
            return com.yandex.plus.bdui.flex.ui.a.M(new JSONObject((String) obj));
        }
        if (!(obj instanceof JSONObject)) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap(jSONObject.length());
        Iterator<String> keys = jSONObject.keys();
        keys.getClass();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt != null) {
                next.getClass();
                Object d2 = d(opt, new com.yandex.plus.bdui.content.b(14, this, next));
                if (d2 != null) {
                    linkedHashMap.put(next, d2);
                }
            }
        }
        return linkedHashMap;
    }

    public final Object d(Object obj, Function0 function0) {
        Object d2;
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object opt = jSONArray.opt(i);
                if (opt != null && (d2 = d(opt, new as7(this, i, 7))) != null) {
                    arrayList.add(d2);
                }
            }
            return arrayList;
        }
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            LinkedHashMap linkedHashMap = new LinkedHashMap(jSONObject.length());
            Iterator<String> keys = jSONObject.keys();
            keys.getClass();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt2 = jSONObject.opt(next);
                if (opt2 != null) {
                    next.getClass();
                    Object d3 = d(opt2, new com.yandex.plus.bdui.content.b(14, this, next));
                    if (d3 != null) {
                        linkedHashMap.put(next, d3);
                    }
                }
            }
            return linkedHashMap;
        }
        if (obj instanceof c85) {
            return a(obj);
        }
        if (obj instanceof lpt) {
            return c(obj);
        }
        boolean z = obj instanceof String;
        b bVar = e;
        if (z && StringsKt.M((CharSequence) obj, "@{", false)) {
            Object a = new pzb((String) function0.invoke(), obj.toString(), new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, this, c.class, "anyToAny", "anyToAny(Ljava/lang/Object;)Ljava/lang/Object;", 0, 9), new o(1, bVar), this.b, bVar, null).a(this.a);
            return a instanceof JSONArray ? com.yandex.plus.bdui.flex.ui.a.L((JSONArray) a) : a instanceof JSONObject ? com.yandex.plus.bdui.flex.ui.a.M((JSONObject) a) : a instanceof c85 ? a(a) : a instanceof lpt ? c(a) : a;
        }
        if (bVar.b(obj)) {
            return obj;
        }
        return null;
    }
}
