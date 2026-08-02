package com.yandex.passport.internal.account;

import com.yandex.passport.internal.l;
import com.yandex.passport.internal.storage.m;

/* loaded from: classes4.dex */
public final class a {
    public final com.yandex.passport.internal.core.accounts.e a;
    public final b b;

    public a(com.yandex.passport.internal.core.accounts.e eVar, b bVar) {
        eVar.getClass();
        bVar.getClass();
        this.a = eVar;
        this.b = bVar;
    }

    public final l a() {
        return b(this.a.a());
    }

    public final l b(com.yandex.passport.internal.d dVar) {
        l e;
        b bVar = this.b;
        com.yandex.passport.common.core.f c = bVar.a.c();
        if (c != null && (e = dVar.e(c)) != null) {
            return e;
        }
        m mVar = bVar.a;
        String str = (String) mVar.c.getValue(mVar, m.m[1]);
        if (str != null) {
            return dVar.f(str);
        }
        return null;
    }
}
