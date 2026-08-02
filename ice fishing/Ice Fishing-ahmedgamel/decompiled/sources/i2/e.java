package i2;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements f {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f38164n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b2.i f38165u;

    public /* synthetic */ e(long j6, b2.i iVar) {
        this.f38164n = j6;
        this.f38165u = iVar;
    }

    @Override // i2.f
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f38164n));
        b2.i iVar = this.f38165u;
        String str = iVar.f5537a;
        Y1.d dVar = iVar.f5539c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(l2.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f5537a);
            contentValues.put("priority", Integer.valueOf(l2.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
