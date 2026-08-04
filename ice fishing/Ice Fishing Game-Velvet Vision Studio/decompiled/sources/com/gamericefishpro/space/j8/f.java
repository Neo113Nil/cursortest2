package com.gamericefishpro.space.j8;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements g {
    public final /* synthetic */ long d;
    public final /* synthetic */ com.gamericefishpro.space.c8.j e;

    public /* synthetic */ f(long j, com.gamericefishpro.space.c8.j jVar) {
        this.d = j;
        this.e = jVar;
    }

    @Override // com.gamericefishpro.space.j8.g
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.d));
        com.gamericefishpro.space.c8.j jVar = this.e;
        String str = jVar.a;
        com.gamericefishpro.space.z7.d dVar = jVar.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(com.gamericefishpro.space.m8.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", jVar.a);
            contentValues.put("priority", Integer.valueOf(com.gamericefishpro.space.m8.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
