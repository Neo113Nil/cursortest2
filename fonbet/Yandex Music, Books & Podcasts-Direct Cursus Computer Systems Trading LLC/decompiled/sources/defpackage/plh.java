package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import androidx.media3.session.i;

/* loaded from: classes.dex */
public final /* synthetic */ class plh implements qlh, fvh, zjo {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;

    public /* synthetic */ plh(long j, de2 de2Var) {
        this.a = j;
        this.b = de2Var;
    }

    @Override // defpackage.zjo, defpackage.myc
    public Object apply(Object obj) {
        de2 de2Var = (de2) this.b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.a));
        String str = de2Var.a;
        lsm lsmVar = de2Var.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(qsm.a(lsmVar))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put("priority", Integer.valueOf(qsm.a(lsmVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // defpackage.qlh
    public void b(c9e c9eVar, int i) {
        ulh ulhVar = (ulh) this.b;
        c9eVar.u0(ulhVar.c, i, this.a);
    }

    @Override // defpackage.fvh
    public Object h(i iVar, wrh wrhVar, int i) {
        return iVar.s(wrhVar, yde.y((onh) this.b), 0, this.a);
    }

    public /* synthetic */ plh(long j, Object obj) {
        this.b = obj;
        this.a = j;
    }
}
