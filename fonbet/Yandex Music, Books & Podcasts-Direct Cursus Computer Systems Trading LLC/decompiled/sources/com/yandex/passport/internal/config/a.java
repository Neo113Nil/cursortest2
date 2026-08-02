package com.yandex.passport.internal.config;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.btf;
import defpackage.jyr;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class a {
    public final Context a;
    public final jyr b;

    public a(Context context) {
        context.getClass();
        this.a = context;
        this.b = btf.b(new com.yandex.passport.internal.common.e(1, this));
    }

    public final void a(List list, LinkedHashMap linkedHashMap) {
        list.getClass();
        SharedPreferences.Editor edit = ((SharedPreferences) this.b.getValue()).edit();
        edit.clear();
        edit.putStringSet("blacklisted_apps", CollectionsKt.A0(list));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            edit.putString((String) entry.getKey(), (String) entry.getValue());
        }
        edit.apply();
    }
}
