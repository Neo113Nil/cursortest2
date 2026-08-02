package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final /* synthetic */ class qll0 implements sll0 {
    public final /* synthetic */ long a;
    public final /* synthetic */ v111 b;

    public /* synthetic */ qll0(long j, v111 v111Var) {
        this.a = j;
        this.b = v111Var;
    }

    @Override // defpackage.sll0
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.a));
        v111 v111Var = this.b;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{v111Var.b(), String.valueOf(i3f0.a(v111Var.d()))}) < 1) {
            contentValues.put("backend_name", v111Var.b());
            contentValues.put("priority", Integer.valueOf(i3f0.a(v111Var.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
