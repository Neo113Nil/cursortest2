package com.yandex.plus.home.analytics;

import defpackage.omb;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class d implements com.yandex.plus.home.feature.webviews.internalapi.analytics.a {
    public final omb a;

    public d(omb ombVar) {
        ombVar.getClass();
        this.a = ombVar;
    }

    @Override // com.yandex.plus.home.feature.webviews.internalapi.analytics.a
    public final void a(String str) {
        str.getClass();
        omb ombVar = this.a;
        ombVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("from", str);
        linkedHashMap.put("_meta", omb.a(1, new HashMap()));
        ombVar.d("PlusSimple.Content.Shown", linkedHashMap);
    }

    @Override // com.yandex.plus.home.feature.webviews.internalapi.analytics.a
    public final void d(String str, String str2) {
        str.getClass();
        str2.getClass();
        omb ombVar = this.a;
        ombVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("from", str);
        linkedHashMap.put("page_url", str2);
        linkedHashMap.put("_meta", omb.a(2, new HashMap()));
        ombVar.d("PlusSimple.Content.Loading.Error", linkedHashMap);
    }

    @Override // com.yandex.plus.home.feature.webviews.internalapi.analytics.a
    public final void e(String str, String str2) {
        str.getClass();
        str2.getClass();
        omb ombVar = this.a;
        ombVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("from", str);
        linkedHashMap.put("url", str2);
        linkedHashMap.put("_meta", omb.a(1, new HashMap()));
        ombVar.d("PlusSimple.Content.Loading.Completed", linkedHashMap);
    }

    @Override // com.yandex.plus.home.feature.webviews.internalapi.analytics.a
    public final void f(String str) {
        str.getClass();
        omb ombVar = this.a;
        ombVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("from", str);
        linkedHashMap.put("_meta", omb.a(1, new HashMap()));
        ombVar.d("PlusSimple.Opened", linkedHashMap);
    }
}
