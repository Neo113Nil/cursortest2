package com.yandex.passport.internal.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import defpackage.evw;
import defpackage.yd5;

/* loaded from: classes4.dex */
public final class h {
    public final evw a;
    public final evw b;

    public h(evw evwVar, evw evwVar2) {
        this.a = evwVar;
        this.b = evwVar2;
    }

    public final void a(com.yandex.passport.common.core.f fVar) {
        fVar.getClass();
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "dropClientToken: uid=" + fVar, 8);
        }
        int delete = ((SQLiteDatabase) this.b.invoke()).delete("tokens", "uid = ?", g.f(fVar));
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "dropClientToken(uid): rows=" + delete, 8);
        }
    }

    public final com.yandex.passport.internal.entities.e b(com.yandex.passport.common.core.f fVar, String str) {
        com.yandex.passport.internal.entities.e eVar;
        fVar.getClass();
        str.getClass();
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "getClientToken: uid=" + fVar + " decryptedClientId=" + str, 8);
        }
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.a.invoke();
        String[] strArr = com.yandex.passport.internal.database.tables.a.e;
        StringBuilder sb = new StringBuilder();
        sb.append(fVar.a.a);
        sb.append(':');
        sb.append(fVar.b);
        Cursor query = sQLiteDatabase.query("tokens", strArr, "uid = ? AND client_id = ?", new String[]{sb.toString(), str}, null, null, null);
        try {
            Cursor cursor = query;
            if (cursor.moveToNext()) {
                String string = cursor.getString(cursor.getColumnIndexOrThrow("client_token"));
                string.getClass();
                eVar = new com.yandex.passport.internal.entities.e(string, str);
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "getClientToken: return token for uid " + fVar + " and client id " + str, 8);
                }
            } else {
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "getClientToken: no token for uid " + fVar, 8);
                }
                eVar = null;
            }
            yd5.q(query, null);
            return eVar;
        } finally {
        }
    }
}
