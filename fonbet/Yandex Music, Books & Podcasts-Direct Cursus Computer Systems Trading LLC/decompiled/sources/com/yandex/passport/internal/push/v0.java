package com.yandex.passport.internal.push;

import com.yandex.passport.api.v2;
import defpackage.ern;
import defpackage.f1d;
import defpackage.s9f;
import defpackage.yxm;

/* loaded from: classes4.dex */
public final class v0 {
    public final com.yandex.passport.common.a a;
    public final long b;
    public final com.yandex.passport.internal.core.accounts.h c;
    public final com.yandex.passport.internal.core.accounts.h d;
    public final com.yandex.passport.internal.core.accounts.h e;
    public static final /* synthetic */ s9f[] g = {new yxm(v0.class, "lastSubscriptionsMap", "getLastSubscriptionsMap()Lcom/yandex/passport/internal/util/storage/PersistableMap;", 0), f1d.c(ern.a, v0.class, "notificationsEnabled", "getNotificationsEnabled()Lcom/yandex/passport/internal/util/storage/PersistableMap;", 0), new yxm(v0.class, "locationsMap", "getLocationsMap()Lcom/yandex/passport/internal/util/storage/PersistableMap;", 0)};
    public static final t f = new t();

    public v0(com.yandex.passport.common.a aVar, com.yandex.passport.internal.flags.i iVar) {
        aVar.getClass();
        iVar.getClass();
        long c = com.yandex.passport.common.time.a.c(0, 0, ((Number) iVar.b(com.yandex.passport.internal.flags.o.p)).intValue(), 7);
        this.a = aVar;
        this.b = c;
        this.c = new com.yandex.passport.internal.core.accounts.h(new k0(2), new k0(3), (String) null);
        this.d = new com.yandex.passport.internal.core.accounts.h(new k0(4), new k0(5), (String) null);
        this.e = new com.yandex.passport.internal.core.accounts.h(new k0(6), new k0(7), (String) null);
    }

    public final com.yandex.passport.internal.util.storage.a a() {
        return (com.yandex.passport.internal.util.storage.a) this.c.getValue(this, g[0]);
    }

    public final void b(com.yandex.passport.common.core.f fVar, v2 v2Var, boolean z, long j) {
        f.getClass();
        String b = t.b(fVar, v2Var);
        com.yandex.passport.internal.util.storage.a a = a();
        this.a.getClass();
        a.put(b, Long.valueOf(com.yandex.passport.common.a.a()));
        s9f[] s9fVarArr = g;
        ((com.yandex.passport.internal.util.storage.a) this.d.getValue(this, s9fVarArr[1])).put(b, Boolean.valueOf(z));
        com.yandex.passport.internal.util.storage.a aVar = (com.yandex.passport.internal.util.storage.a) this.e.getValue(this, s9fVarArr[2]);
        StringBuilder sb = new StringBuilder();
        sb.append(fVar.a.a);
        sb.append(':');
        sb.append(fVar.b);
        aVar.put(sb.toString(), Long.valueOf(j));
    }
}
