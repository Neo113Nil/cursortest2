package h2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import e2.EnumC4475c;
import j2.InterfaceC4611b;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements InterfaceC4611b, i2.f {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f38103n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f38104u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f38105v;

    public /* synthetic */ h(long j6, Object obj, Object obj2) {
        this.f38104u = obj;
        this.f38105v = obj2;
        this.f38103n = j6;
    }

    @Override // i2.f
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((EnumC4475c) this.f38105v).f37258n;
        String num = Integer.toString(i);
        String str = (String) this.f38104u;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, num});
        try {
            boolean z6 = rawQuery.getCount() > 0;
            rawQuery.close();
            long j6 = this.f38103n;
            if (z6) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j6 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j6));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // j2.InterfaceC4611b
    public Object d() {
        i iVar = (i) this.f38104u;
        long f2 = iVar.f38112g.f() + this.f38103n;
        i2.h hVar = (i2.h) iVar.f38108c;
        b2.i iVar2 = (b2.i) this.f38105v;
        hVar.getClass();
        hVar.j(new i2.e(f2, iVar2));
        return null;
    }
}
