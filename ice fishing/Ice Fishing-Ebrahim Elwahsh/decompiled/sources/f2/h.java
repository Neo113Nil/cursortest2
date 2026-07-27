package f2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import h2.InterfaceC4565b;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements InterfaceC4565b, g2.f {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f37683n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f37684u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f37685v;

    public /* synthetic */ h(long j9, Object obj, Object obj2) {
        this.f37684u = obj;
        this.f37685v = obj2;
        this.f37683n = j9;
    }

    @Override // g2.f
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((c2.c) this.f37685v).f5700n;
        String num = Integer.toString(i);
        String str = (String) this.f37684u;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, num});
        try {
            boolean z8 = rawQuery.getCount() > 0;
            rawQuery.close();
            long j9 = this.f37683n;
            if (z8) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j9 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j9));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // h2.InterfaceC4565b
    public Object d() {
        i iVar = (i) this.f37684u;
        long a9 = iVar.f37692g.a() + this.f37683n;
        g2.h hVar = (g2.h) iVar.f37688c;
        Z1.i iVar2 = (Z1.i) this.f37685v;
        hVar.getClass();
        hVar.i(new g2.e(a9, iVar2));
        return null;
    }
}
