package com.yandex.plus.home.analytics.diagnostic.panel;

import defpackage.dnb;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class a {
    public final dnb a;

    public a(dnb dnbVar) {
        dnbVar.getClass();
        this.a = dnbVar;
    }

    public final void a(String str, String str2) {
        dnb dnbVar = this.a;
        dnbVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("section_id", str);
        linkedHashMap.put("shortcut_type", str2);
        linkedHashMap.put("_meta", dnb.b(new HashMap()));
        dnbVar.c("Error.Panel.DailyWidget.Missed.Shortcut", linkedHashMap);
    }

    public final void b(String str, String str2) {
        str.getClass();
        dnb dnbVar = this.a;
        dnbVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("section_id", str);
        linkedHashMap.put("shortcut_id", str2);
        linkedHashMap.put("_meta", dnb.b(new HashMap()));
        dnbVar.c("Error.Panel.DailyWidget.Missed.Title", linkedHashMap);
    }
}
