package g2;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements f {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f37637n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Z1.i f37638u;

    public /* synthetic */ e(long j6, Z1.i iVar) {
        this.f37637n = j6;
        this.f37638u = iVar;
    }

    @Override // g2.f
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f37637n));
        Z1.i iVar = this.f37638u;
        String str = iVar.f4148a;
        W1.d dVar = iVar.f4150c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(j2.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f4148a);
            contentValues.put("priority", Integer.valueOf(j2.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
