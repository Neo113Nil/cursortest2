package com.yandex.passport.internal.database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import com.yandex.passport.common.network.n;
import com.yandex.passport.internal.flags.i;
import com.yandex.passport.internal.flags.o;
import com.yandex.passport.internal.usecase.m;
import defpackage.evw;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.yd5;
import defpackage.z7o;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class a {
    public final evw a;
    public final evw b;
    public final h c;
    public final n d;
    public final com.yandex.passport.internal.usecase.n e;
    public final m f;
    public final com.yandex.passport.internal.network.mappers.d g;
    public final i h;
    public final Object i = new Object();
    public volatile ArrayList j;

    public a(evw evwVar, evw evwVar2, h hVar, n nVar, com.yandex.passport.internal.usecase.n nVar2, m mVar, com.yandex.passport.internal.network.mappers.d dVar, i iVar) {
        this.a = evwVar;
        this.b = evwVar2;
        this.c = hVar;
        this.d = nVar;
        this.e = nVar2;
        this.f = mVar;
        this.g = dVar;
        this.h = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.yandex.passport.internal.b a(Cursor cursor, String str) {
        String str2;
        String str3;
        Serializable serializable;
        String str4;
        Object t7oVar;
        String string = cursor.getString(cursor.getColumnIndexOrThrow("secure_blob"));
        m mVar = this.f;
        if (string != null) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "blob original: ".concat(string), 8);
            }
            Serializable c = mVar.c(string, "secure_blob");
            if (c instanceof t7o) {
                c = null;
            }
            String str5 = (String) c;
            if (str5 != null) {
                try {
                    r7o r7oVar = z7o.b;
                    t7oVar = g.g(str5);
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                }
                if (t7oVar instanceof t7o) {
                    t7oVar = null;
                }
                b bVar = (b) t7oVar;
                if (bVar != null) {
                    String str6 = bVar.a;
                    String str7 = bVar.b;
                    String str8 = bVar.c;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "blob decrypted userInfo: " + str7, 8);
                    }
                    return new com.yandex.passport.internal.b(str == null ? g.b(cursor) : str, str6, cursor.getString(cursor.getColumnIndexOrThrow("uid")), str7, cursor.getString(cursor.getColumnIndexOrThrow("user_info_meta")), str8, cursor.getString(cursor.getColumnIndexOrThrow("legacy_account_type")), cursor.getString(cursor.getColumnIndexOrThrow("legacy_affinity")), cursor.getString(cursor.getColumnIndexOrThrow("legacy_extra_data_body")));
                }
            }
        }
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("master_token_value"));
        String string3 = cursor.getString(cursor.getColumnIndexOrThrow("user_info_body"));
        String string4 = cursor.getString(cursor.getColumnIndexOrThrow("stash_body"));
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            str2 = "legacy_extra_data_body";
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "original: " + string3, 8);
        } else {
            str2 = "legacy_extra_data_body";
        }
        if (string3 != null) {
            Serializable c2 = mVar.c(string3, "user_info_body");
            if (c2 instanceof t7o) {
                c2 = null;
            }
            str3 = (String) c2;
        } else {
            str3 = null;
        }
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            serializable = null;
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "decrypted: " + str3, 8);
        } else {
            serializable = null;
        }
        String b = str == null ? g.b(cursor) : str;
        if (string2 != null) {
            Serializable c3 = mVar.c(string2, "master_token_value");
            if (c3 instanceof t7o) {
                c3 = serializable;
            }
            str4 = (String) c3;
        } else {
            str4 = serializable;
        }
        String string5 = cursor.getString(cursor.getColumnIndexOrThrow("uid"));
        String string6 = cursor.getString(cursor.getColumnIndexOrThrow("user_info_meta"));
        if (string4 != null) {
            Serializable c4 = mVar.c(string4, "stash_body");
            if (!(c4 instanceof t7o)) {
                serializable = c4;
            }
            serializable = (String) serializable;
        }
        return new com.yandex.passport.internal.b(b, str4, string5, str3, string6, serializable, cursor.getString(cursor.getColumnIndexOrThrow("legacy_account_type")), cursor.getString(cursor.getColumnIndexOrThrow("legacy_affinity")), cursor.getString(cursor.getColumnIndexOrThrow(str2)));
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        Cursor query = ((SQLiteDatabase) this.a.invoke()).query("accounts", com.yandex.passport.internal.database.tables.a.b, null, null, null, null, null);
        try {
            Cursor cursor = query;
            while (cursor.moveToNext()) {
                arrayList.add(a(cursor, null));
            }
            yd5.q(query, null);
            return arrayList;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.io.Serializable] */
    public final ContentValues c(com.yandex.passport.internal.b bVar) {
        String str;
        String str2;
        String encode;
        ContentValues contentValues = new ContentValues();
        String str3 = bVar.a;
        String str4 = bVar.f;
        String str5 = bVar.d;
        String str6 = bVar.b;
        contentValues.put("name", str3);
        contentValues.put("uid", bVar.c);
        contentValues.put("user_info_meta", bVar.e);
        contentValues.put("legacy_account_type", bVar.g);
        contentValues.put("legacy_affinity", bVar.h);
        contentValues.put("legacy_extra_data_body", bVar.i);
        boolean booleanValue = ((Boolean) this.h.b(o.i0)).booleanValue();
        com.yandex.passport.internal.usecase.n nVar = this.e;
        if (booleanValue) {
            StringBuilder sb = new StringBuilder("v=1&masterToken=");
            String str7 = "~";
            if (str6 == null || (str = Uri.encode(str6)) == null) {
                str = "~";
            }
            sb.append(str);
            sb.append("&userInfo=");
            if (str5 == null || (str2 = Uri.encode(str5)) == null) {
                str2 = "~";
            }
            sb.append(str2);
            sb.append("&stash=");
            if (str4 != null && (encode = Uri.encode(str4)) != null) {
                str7 = encode;
            }
            sb.append(str7);
            Serializable c = nVar.c(sb.toString(), "secure_blob");
            if (c instanceof t7o) {
                c = null;
            }
            String str8 = (String) c;
            if (str8 != null) {
                contentValues.put("secure_blob", str8);
                contentValues.putNull("master_token_value");
                contentValues.putNull("user_info_body");
                contentValues.putNull("stash_body");
                return contentValues;
            }
        } else {
            contentValues.putNull("secure_blob");
        }
        ?? c2 = nVar.c(str6, "master_token_value");
        if (!(c2 instanceof t7o)) {
            str6 = c2;
        }
        contentValues.put("master_token_value", str6);
        ?? c3 = nVar.c(str5, "user_info_body");
        if (!(c3 instanceof t7o)) {
            str5 = c3;
        }
        contentValues.put("user_info_body", str5);
        ?? c4 = nVar.c(str4, "stash_body");
        if (!(c4 instanceof t7o)) {
            str4 = c4;
        }
        contentValues.put("stash_body", str4);
        return contentValues;
    }
}
