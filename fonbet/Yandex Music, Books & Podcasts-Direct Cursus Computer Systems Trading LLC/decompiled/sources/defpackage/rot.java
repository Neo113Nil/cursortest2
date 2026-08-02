package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class rot implements iyr {
    public final /* synthetic */ int a;
    public final /* synthetic */ bko b;

    public /* synthetic */ rot(bko bkoVar, int i) {
        this.a = i;
        this.b = bkoVar;
    }

    @Override // defpackage.iyr
    public final Object execute() {
        SQLiteDatabase a;
        int i = this.a;
        bko bkoVar = this.b;
        switch (i) {
            case 0:
                bkoVar.getClass();
                int i2 = ko4.e;
                kkp kkpVar = new kkp(26);
                kkpVar.c = null;
                kkpVar.d = new ArrayList();
                kkpVar.e = null;
                kkpVar.b = "";
                HashMap hashMap = new HashMap();
                a = bkoVar.a();
                a.beginTransaction();
                try {
                    ko4 ko4Var = (ko4) bko.I(a.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new u13(18, bkoVar, hashMap, kkpVar));
                    a.setTransactionSuccessful();
                    return ko4Var;
                } finally {
                }
            default:
                long a2 = bkoVar.b.a() - bkoVar.d.d;
                a = bkoVar.a();
                a.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(a2)};
                    Cursor rawQuery = a.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    try {
                        Cursor cursor = rawQuery;
                        while (cursor.moveToNext()) {
                            bkoVar.z(cursor.getInt(0), xqg.MESSAGE_TOO_OLD, cursor.getString(1));
                        }
                        rawQuery.close();
                        int delete = a.delete("events", "timestamp_ms < ?", strArr);
                        a.setTransactionSuccessful();
                        a.endTransaction();
                        return Integer.valueOf(delete);
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                } finally {
                }
        }
    }
}
