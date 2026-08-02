package com.yandex.passport.internal.config;

import android.content.SharedPreferences;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class o {
    public final d a;

    public o(d dVar) {
        dVar.getClass();
        this.a = dVar;
    }

    public final String a() {
        SharedPreferences a = this.a.a(com.yandex.passport.common.core.b.c);
        if (a != null) {
            return a.getString("vpn_cookie", null);
        }
        return null;
    }

    public final void b(List list) {
        SharedPreferences a;
        SharedPreferences.Editor edit;
        com.yandex.passport.common.core.b bVar = com.yandex.passport.common.core.b.c;
        list.getClass();
        if (list.isEmpty() || (a = this.a.a(bVar)) == null || (edit = a.edit()) == null) {
            return;
        }
        edit.putString("vpn_cookie", CollectionsKt.X(list, "; ", null, null, null, 62));
        edit.apply();
    }
}
