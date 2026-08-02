package com.yandex.passport.internal.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.yandex.passport.internal.push.t0;

/* loaded from: classes4.dex */
public final class e {
    public final d a;

    public e(d dVar) {
        this.a = dVar;
    }

    public final t0 a(com.yandex.passport.common.core.f fVar) {
        SQLiteDatabase readableDatabase = this.a.getReadableDatabase();
        fVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(fVar.a.a);
        sb.append(':');
        sb.append(fVar.b);
        Cursor rawQuery = readableDatabase.rawQuery("SELECT gcm_token_hash FROM gcm_subscriptions WHERE uid = '" + sb.toString() + "'", null);
        try {
            if (!rawQuery.moveToFirst()) {
                rawQuery.close();
                return null;
            }
            t0 t0Var = new t0(fVar, rawQuery.getString(rawQuery.getColumnIndexOrThrow("gcm_token_hash")));
            rawQuery.close();
            return t0Var;
        } catch (Throwable th) {
            if (rawQuery != null) {
                try {
                    rawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
