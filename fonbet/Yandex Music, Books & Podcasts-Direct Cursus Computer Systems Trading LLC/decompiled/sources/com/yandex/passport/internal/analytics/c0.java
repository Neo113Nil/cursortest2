package com.yandex.passport.internal.analytics;

import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import defpackage.nc3;
import defpackage.s9f;
import defpackage.xy0;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class c0 {
    public final Context a;
    public final com.yandex.passport.internal.storage.m b;
    public final com.yandex.passport.internal.account.a c;
    public final com.yandex.passport.internal.database.d d;
    public final o0 e;
    public final com.yandex.passport.internal.properties.x f;
    public final com.yandex.passport.common.a g;

    public c0(Context context, com.yandex.passport.internal.storage.m mVar, com.yandex.passport.internal.account.a aVar, com.yandex.passport.internal.database.d dVar, o0 o0Var, com.yandex.passport.internal.properties.x xVar, com.yandex.passport.common.a aVar2) {
        context.getClass();
        mVar.getClass();
        aVar.getClass();
        dVar.getClass();
        o0Var.getClass();
        xVar.getClass();
        aVar2.getClass();
        this.a = context;
        this.b = mVar;
        this.c = aVar;
        this.d = dVar;
        this.e = o0Var;
        this.f = xVar;
        this.g = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.yandex.passport.internal.d dVar) {
        char c;
        long j;
        boolean z;
        boolean z2;
        b0 b0Var;
        com.yandex.passport.api.n f;
        this.g.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        com.yandex.passport.internal.storage.m mVar = this.b;
        nc3 nc3Var = mVar.k;
        s9f[] s9fVarArr = com.yandex.passport.internal.storage.m.m;
        long longValue = ((Number) nc3Var.getValue(mVar, s9fVarArr[10])).longValue();
        if (longValue != 0 && elapsedRealtime - longValue <= 86400000 && (elapsedRealtime >= 86400000 || elapsedRealtime >= longValue)) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "core.activation already sent", 8);
                return;
            }
            return;
        }
        ArrayList g = dVar.g();
        com.yandex.passport.internal.database.d dVar2 = this.d;
        long queryNumEntries = DatabaseUtils.queryNumEntries((SQLiteDatabase) dVar2.b.a.invoke(), "tokens");
        com.yandex.passport.internal.l b = this.c.b(dVar);
        if (b == null) {
            b0Var = b0.a;
        } else {
            com.yandex.passport.common.core.f fVar = b.b;
            if (b.d.a != null) {
                b0 b0Var2 = b0.c;
                c = '\n';
                j = 0;
                com.yandex.passport.internal.credentials.f b2 = this.f.b(fVar.a);
                if (b2 != null) {
                    String str = b2.c;
                    str.getClass();
                    com.yandex.passport.internal.entities.e b3 = dVar2.b.b(fVar, str);
                    if (b3 != null && com.yandex.plus.core.network.api.utils.a.z(b3.a) != null) {
                        z = true;
                        z2 = z;
                        b0Var = b0Var2;
                        boolean a = com.yandex.passport.internal.util.p.a(this.a);
                        int size = g.size();
                        String name = b0Var.name();
                        f = b != null ? b.f() : null;
                        o0 o0Var = this.e;
                        o0Var.getClass();
                        name.getClass();
                        xy0 xy0Var = new xy0(0);
                        xy0Var.put("accounts_num", String.valueOf(size));
                        xy0Var.put("hasCurrentAccount", String.valueOf(queryNumEntries > j));
                        xy0Var.put("hasMasterToken", name);
                        xy0Var.put("hasClientAndMasterToken", String.valueOf(z2));
                        xy0Var.put("isForeground", String.valueOf(a));
                        if (f != null) {
                            xy0Var.put("accountType", f.toString());
                        }
                        o0Var.a.e(j.d, xy0Var);
                        mVar.k.setValue(mVar, s9fVarArr[c], Long.valueOf(SystemClock.elapsedRealtime()));
                    }
                }
                z = false;
                z2 = z;
                b0Var = b0Var2;
                boolean a2 = com.yandex.passport.internal.util.p.a(this.a);
                int size2 = g.size();
                String name2 = b0Var.name();
                if (b != null) {
                }
                o0 o0Var2 = this.e;
                o0Var2.getClass();
                name2.getClass();
                xy0 xy0Var2 = new xy0(0);
                xy0Var2.put("accounts_num", String.valueOf(size2));
                xy0Var2.put("hasCurrentAccount", String.valueOf(queryNumEntries > j));
                xy0Var2.put("hasMasterToken", name2);
                xy0Var2.put("hasClientAndMasterToken", String.valueOf(z2));
                xy0Var2.put("isForeground", String.valueOf(a2));
                if (f != null) {
                }
                o0Var2.a.e(j.d, xy0Var2);
                mVar.k.setValue(mVar, s9fVarArr[c], Long.valueOf(SystemClock.elapsedRealtime()));
            }
            b0Var = b0.b;
        }
        c = '\n';
        j = 0;
        z2 = false;
        boolean a22 = com.yandex.passport.internal.util.p.a(this.a);
        int size22 = g.size();
        String name22 = b0Var.name();
        if (b != null) {
        }
        o0 o0Var22 = this.e;
        o0Var22.getClass();
        name22.getClass();
        xy0 xy0Var22 = new xy0(0);
        xy0Var22.put("accounts_num", String.valueOf(size22));
        xy0Var22.put("hasCurrentAccount", String.valueOf(queryNumEntries > j));
        xy0Var22.put("hasMasterToken", name22);
        xy0Var22.put("hasClientAndMasterToken", String.valueOf(z2));
        xy0Var22.put("isForeground", String.valueOf(a22));
        if (f != null) {
        }
        o0Var22.a.e(j.d, xy0Var22);
        mVar.k.setValue(mVar, s9fVarArr[c], Long.valueOf(SystemClock.elapsedRealtime()));
    }
}
