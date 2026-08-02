package com.yandex.plus.home.plaque.plugin.internal.defaults;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.i5f;
import defpackage.quj;
import defpackage.x3f;

/* loaded from: classes5.dex */
public final class c {
    public final com.yandex.plus.log.api.b a;
    public final kotlinx.coroutines.a b;
    public final SharedPreferences c;
    public final i5f d;

    public c(Context context, com.yandex.plus.log.api.b bVar, kotlinx.coroutines.a aVar) {
        bVar.getClass();
        aVar.getClass();
        this.a = bVar;
        this.b = aVar;
        this.c = context.getSharedPreferences("plaque_definition_preferences", 0);
        this.d = quj.r(x3f.d, new com.yandex.plus.home.feature.webviews.internal.webview.e(8));
    }

    public static final String a(c cVar, com.yandex.plus.home.plaque.repository.graphql.cache.a aVar) {
        return aVar.a + '|' + aVar.b + '|' + aVar.c;
    }
}
