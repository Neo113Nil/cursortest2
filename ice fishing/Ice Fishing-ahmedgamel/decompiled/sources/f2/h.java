package f2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import c2.EnumC0536c;
import h2.InterfaceC4563b;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements InterfaceC4563b, g2.f {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f37479n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f37480u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f37481v;

    public /* synthetic */ h(long j6, Object obj, Object obj2) {
        this.f37480u = obj;
        this.f37481v = obj2;
        this.f37479n = j6;
    }

    @Override // g2.f
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((EnumC0536c) this.f37481v).f5543n;
        String num = Integer.toString(i);
        String str = (String) this.f37480u;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, num});
        try {
            boolean z3 = rawQuery.getCount() > 0;
            rawQuery.close();
            long j6 = this.f37479n;
            if (z3) {
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

    @Override // h2.InterfaceC4563b
    public Object c() {
        i iVar = (i) this.f37480u;
        long g4 = iVar.f37488g.g() + this.f37479n;
        g2.h hVar = (g2.h) iVar.f37484c;
        Z1.i iVar2 = (Z1.i) this.f37481v;
        hVar.getClass();
        hVar.j(new g2.e(g4, iVar2));
        return null;
    }
}
