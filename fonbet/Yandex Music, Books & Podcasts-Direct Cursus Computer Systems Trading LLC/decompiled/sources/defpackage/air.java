package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class air implements yhr {
    @Override // defpackage.yhr
    public final void a(zp4 zp4Var) {
        ArrayList arrayList = new ArrayList();
        tjn tjnVar = new tjn(xuj.E, new yp4(zp4Var, "SELECT name FROM sqlite_master WHERE type='table'", new String[0]));
        try {
            Cursor a = tjnVar.a();
            if (!a.moveToFirst()) {
                tjnVar.close();
                return;
            }
            do {
                arrayList.add(a.getString(a.getColumnIndexOrThrow("name")));
            } while (a.moveToNext());
            tjnVar.close();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                SQLiteStatement compileStatement = ((dg0) zp4Var.b).a.compileStatement(f1d.g("DROP TABLE IF EXISTS ", (String) it.next()));
                ((ArrayList) zp4Var.c).add(compileStatement);
                compileStatement.execute();
            }
        } finally {
        }
    }

    public final String toString() {
        return "Drop all database tables";
    }
}
