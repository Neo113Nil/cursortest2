package com.yandex.passport.internal.config;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e {
    public final d a;
    public final com.yandex.passport.common.a b;
    public final com.yandex.passport.common.common.a c;

    public e(d dVar, com.yandex.passport.common.a aVar, com.yandex.passport.common.common.a aVar2) {
        dVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        this.a = dVar;
        this.b = aVar;
        this.c = aVar2;
    }

    public final boolean a(com.yandex.passport.common.core.b bVar, String str, String str2) {
        SharedPreferences a = this.a.a(bVar);
        if (a == null) {
            return true;
        }
        long j = a.getLong(str, 0L);
        String string = a.getString(str2, null);
        if (j <= 0 || !Intrinsics.d(string, ((com.yandex.passport.internal.common.d) this.c).a())) {
            return false;
        }
        this.b.getClass();
        long currentTimeMillis = System.currentTimeMillis() - j;
        return currentTimeMillis >= 0 && currentTimeMillis < 86400000;
    }

    public final void b(com.yandex.passport.common.core.b bVar, String str, String str2) {
        SharedPreferences.Editor edit;
        SharedPreferences a = this.a.a(bVar);
        if (a == null || (edit = a.edit()) == null) {
            return;
        }
        String a2 = ((com.yandex.passport.internal.common.d) this.c).a();
        this.b.getClass();
        edit.putLong(str, System.currentTimeMillis());
        edit.putString(str2, a2);
        edit.apply();
    }
}
