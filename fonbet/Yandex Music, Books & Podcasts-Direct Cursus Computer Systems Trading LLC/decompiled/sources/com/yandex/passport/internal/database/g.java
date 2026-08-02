package com.yandex.passport.internal.database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import defpackage.wb8;
import java.util.HashMap;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public abstract class g {
    public static final f a = new f(2, 3, 0);

    public static final boolean a(Cursor cursor, String str) {
        return cursor.getInt(cursor.getColumnIndexOrThrow(str)) > 0;
    }

    public static final String b(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndexOrThrow("name"));
        if (string != null) {
            return string;
        }
        wb8.h("Required column name");
        return null;
    }

    public static c c(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndexOrThrow("uid"));
        return new c(string != null ? Long.parseLong(string) : -1L, String.valueOf(cursor.getString(cursor.getColumnIndexOrThrow("parent_name"))), a(cursor, "is_child"), a(cursor, "has_plus"), String.valueOf(cursor.getString(cursor.getColumnIndexOrThrow("display_login"))), String.valueOf(cursor.getString(cursor.getColumnIndexOrThrow("display_name"))), String.valueOf(cursor.getString(cursor.getColumnIndexOrThrow("public_name"))), cursor.getString(cursor.getColumnIndexOrThrow("avatar_url")), a(cursor, "is_deleted"));
    }

    public static final long d(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) {
        sQLiteDatabase.getClass();
        try {
            return sQLiteDatabase.insertOrThrow(str, null, contentValues);
        } catch (SQLException e) {
            com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
            if (!com.yandex.passport.common.logger.a.a.isEnabled()) {
                return -1L;
            }
            com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Error inserting", e);
            return -1L;
        }
    }

    public static long e(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) {
        sQLiteDatabase.getClass();
        try {
            return sQLiteDatabase.replaceOrThrow(str, null, contentValues);
        } catch (SQLException e) {
            com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
            if (!com.yandex.passport.common.logger.a.a.isEnabled()) {
                return -1L;
            }
            com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Error replacing", e);
            return -1L;
        }
    }

    public static final String[] f(com.yandex.passport.common.core.f fVar) {
        fVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(fVar.a.a);
        sb.append(':');
        sb.append(fVar.b);
        return new String[]{sb.toString()};
    }

    public static b g(String str) {
        if (!kotlin.text.c.v(str, "v=1&", false)) {
            return null;
        }
        HashMap hashMap = new HashMap(4);
        for (String str2 : StringsKt.e0(str, new char[]{'&'}, 6)) {
            int S = StringsKt.S(str2, '=', 0, 6);
            if (S > 0) {
                hashMap.put(str2.substring(0, S), str2.substring(S + 1));
            }
        }
        return new b(h("masterToken", hashMap), h("userInfo", hashMap), h("stash", hashMap));
    }

    public static final String h(String str, HashMap hashMap) {
        String str2 = (String) hashMap.get(str);
        if (str2 == null || str2.equals("~")) {
            return null;
        }
        return Uri.decode(str2);
    }
}
