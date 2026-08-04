package com.gamericefishpro.space.i8;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.gamericefishpro.space.c8.j;
import com.gamericefishpro.space.j8.i;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements com.gamericefishpro.space.k8.b, com.gamericefishpro.space.j8.g {
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object i;

    public /* synthetic */ g(long j, Object obj, Object obj2) {
        this.e = obj;
        this.i = obj2;
        this.d = j;
    }

    @Override // com.gamericefishpro.space.j8.g
    public Object apply(Object obj) {
        String str = (String) this.e;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((com.gamericefishpro.space.f8.c) this.i).d;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        try {
            boolean z = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j = this.d;
            if (z) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // com.gamericefishpro.space.k8.b
    public Object b() {
        h hVar = (h) this.e;
        j jVar = (j) this.i;
        com.gamericefishpro.space.j8.d dVar = (com.gamericefishpro.space.j8.d) hVar.c;
        long jD = ((com.gamericefishpro.space.l8.a) hVar.g).d() + this.d;
        i iVar = (i) dVar;
        iVar.getClass();
        iVar.j(new com.gamericefishpro.space.j8.f(jD, jVar));
        return null;
    }
}
