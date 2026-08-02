package com.yandex.plus.home.analytics;

import defpackage.omb;
import defpackage.vkb;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class a implements com.yandex.plus.home.feature.webviews.internalapi.analytics.a {
    public final /* synthetic */ int a;
    public final omb b;

    public a(omb ombVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                ombVar.getClass();
                this.b = ombVar;
                break;
            default:
                ombVar.getClass();
                this.b = ombVar;
                break;
        }
    }

    @Override // com.yandex.plus.home.feature.webviews.internalapi.analytics.a
    public final void a(String str) {
        int i = this.a;
        str.getClass();
        switch (i) {
            case 0:
                omb ombVar = this.b;
                ombVar.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("from", str);
                linkedHashMap.put("_meta", omb.a(1, new HashMap()));
                ombVar.d("PlusHome.Content.Shown", linkedHashMap);
                break;
            default:
                omb ombVar2 = this.b;
                ombVar2.getClass();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("from", str);
                linkedHashMap2.put("_meta", omb.a(1, new HashMap()));
                ombVar2.d("PlusStories.Content.Shown", linkedHashMap2);
                break;
        }
    }

    @Override // com.yandex.plus.home.feature.webviews.internalapi.analytics.a
    public final void b(String str, com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.b bVar) {
        vkb H;
        vkb H2;
        int i = this.a;
        str.getClass();
        switch (i) {
            case 0:
                if (bVar != null && (H = com.yandex.plus.bdui.plus.analytics.b.H(bVar)) != null) {
                    this.b.c(str, H);
                    break;
                }
                break;
            default:
                if (bVar != null && (H2 = com.yandex.plus.bdui.plus.analytics.b.H(bVar)) != null) {
                    this.b.c(str, H2);
                    break;
                }
                break;
        }
    }

    @Override // com.yandex.plus.home.feature.webviews.internalapi.analytics.a
    public final void c(String str, com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.b bVar) {
        vkb H;
        vkb H2;
        int i = this.a;
        str.getClass();
        switch (i) {
            case 0:
                if (bVar != null && (H = com.yandex.plus.bdui.plus.analytics.b.H(bVar)) != null) {
                    this.b.b(str, H);
                    break;
                }
                break;
            default:
                if (bVar != null && (H2 = com.yandex.plus.bdui.plus.analytics.b.H(bVar)) != null) {
                    this.b.b(str, H2);
                    break;
                }
                break;
        }
    }

    @Override // com.yandex.plus.home.feature.webviews.internalapi.analytics.a
    public final void d(String str, String str2) {
        int i = this.a;
        str.getClass();
        str2.getClass();
        switch (i) {
            case 0:
                omb ombVar = this.b;
                ombVar.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("from", str);
                linkedHashMap.put("page_url", str2);
                linkedHashMap.put("_meta", omb.a(2, new HashMap()));
                ombVar.d("PlusHome.Content.Loading.Error", linkedHashMap);
                break;
            default:
                omb ombVar2 = this.b;
                ombVar2.getClass();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("from", str);
                linkedHashMap2.put("page_url", str2);
                linkedHashMap2.put("_meta", omb.a(2, new HashMap()));
                ombVar2.d("PlusStories.Content.Loading.Error", linkedHashMap2);
                break;
        }
    }

    @Override // com.yandex.plus.home.feature.webviews.internalapi.analytics.a
    public final void f(String str) {
        int i = this.a;
        str.getClass();
        switch (i) {
            case 0:
                omb ombVar = this.b;
                ombVar.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("from", str);
                linkedHashMap.put("_meta", omb.a(1, new HashMap()));
                ombVar.d("PlusHome.Opened", linkedHashMap);
                break;
            default:
                omb ombVar2 = this.b;
                ombVar2.getClass();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("from", str);
                linkedHashMap2.put("_meta", omb.a(1, new HashMap()));
                ombVar2.d("PlusStories.Opened", linkedHashMap2);
                break;
        }
    }
}
