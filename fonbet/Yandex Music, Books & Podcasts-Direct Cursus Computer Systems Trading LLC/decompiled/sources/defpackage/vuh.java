package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final /* synthetic */ class vuh implements ua6, zjo {
    public final /* synthetic */ long a;

    public /* synthetic */ vuh(long j) {
        this.a = j;
    }

    @Override // defpackage.ua6
    public void accept(Object obj) {
        ((lrl) obj).s(this.a);
    }

    @Override // defpackage.zjo, defpackage.myc
    public Object apply(Object obj) {
        long j = this.a;
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
        try {
            Cursor cursor = rawQuery;
            cursor.moveToNext();
            return new iis(cursor.getLong(0), j);
        } finally {
            rawQuery.close();
        }
    }
}
