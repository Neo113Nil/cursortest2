package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes3.dex */
public final /* synthetic */ class np6 implements lu7, qlh, zjo, iyr {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ np6(long j, Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
        this.a = j;
    }

    @Override // defpackage.zjo, defpackage.myc
    public Object apply(Object obj) {
        String str = (String) this.b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((xqg) this.c).a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        try {
            boolean z = rawQuery.getCount() > 0;
            rawQuery.close();
            long j = this.a;
            if (z) {
                sQLiteDatabase.execSQL(dfi.e(j, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // defpackage.qlh
    public void b(c9e c9eVar, int i) {
        c9eVar.W(((ulh) this.b).c, i, ((onh) this.c).e(true), this.a);
    }

    @Override // defpackage.iyr
    public Object execute() {
        hgp hgpVar = (hgp) this.b;
        de2 de2Var = (de2) this.c;
        bko bkoVar = (bko) hgpVar.d;
        long a = ((up4) hgpVar.g).a() + this.a;
        bkoVar.getClass();
        bkoVar.g(new plh(a, de2Var));
        return null;
    }

    @Override // defpackage.lu7
    public void j(uzm uzmVar) {
        ((op6) uzmVar.get()).d((String) this.b, this.a, (yd2) this.c);
    }

    public /* synthetic */ np6(String str, long j, yd2 yd2Var) {
        this.b = str;
        this.a = j;
        this.c = yd2Var;
    }
}
