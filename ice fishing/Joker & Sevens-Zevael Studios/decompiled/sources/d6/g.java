package d6;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements h {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f1697g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w5.i f1698h;

    public /* synthetic */ g(long j3, w5.i iVar) {
        this.f1697g = j3;
        this.f1698h = iVar;
    }

    @Override // d6.h
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f1697g));
        w5.i iVar = this.f1698h;
        String str = iVar.f7687a;
        t5.d dVar = iVar.f7689c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(g6.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f7687a);
            contentValues.put("priority", Integer.valueOf(g6.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
