package c6;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements e6.b, d6.h {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f1265g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1266h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1267i;

    public /* synthetic */ k(Object obj, Object obj2, long j3) {
        this.f1266h = obj;
        this.f1267i = obj2;
        this.f1265g = j3;
    }

    @Override // e6.b
    public Object a() {
        l lVar = (l) this.f1266h;
        w5.i iVar = (w5.i) this.f1267i;
        d6.d dVar = (d6.d) lVar.f1270c;
        long a6 = ((f6.a) lVar.f1274g).a() + this.f1265g;
        d6.j jVar = (d6.j) dVar;
        jVar.getClass();
        jVar.d(new d6.g(a6, iVar));
        return null;
    }

    @Override // d6.h
    public Object apply(Object obj) {
        String str = (String) this.f1266h;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i10 = ((z5.c) this.f1267i).f9148g;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i10)});
        try {
            boolean z10 = rawQuery.getCount() > 0;
            rawQuery.close();
            long j3 = this.f1265g;
            if (z10) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j3 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i10)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i10));
            contentValues.put("events_dropped_count", Long.valueOf(j3));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
