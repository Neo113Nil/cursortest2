package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final /* synthetic */ class fw7 implements lw7, iyr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fw7(hgp hgpVar, Iterable iterable, de2 de2Var, long j) {
        this.a = 2;
        this.b = hgpVar;
        this.e = iterable;
        this.d = de2Var;
        this.c = j;
    }

    @Override // defpackage.lw7
    public ScheduledFuture a(qxp qxpVar) {
        switch (this.a) {
            case 0:
                kw7 kw7Var = (kw7) this.b;
                Runnable runnable = (Runnable) this.e;
                return kw7Var.b.schedule(new iw7(kw7Var, runnable, qxpVar, 1), this.c, (TimeUnit) this.d);
            default:
                kw7 kw7Var2 = (kw7) this.b;
                Callable callable = (Callable) this.e;
                return kw7Var2.b.schedule(new jw7(0, kw7Var2, callable, qxpVar), this.c, (TimeUnit) this.d);
        }
    }

    @Override // defpackage.iyr
    public Object execute() {
        hgp hgpVar = (hgp) this.b;
        Iterable iterable = (Iterable) this.e;
        de2 de2Var = (de2) this.d;
        bko bkoVar = (bko) hgpVar.d;
        bkoVar.getClass();
        if (iterable.iterator().hasNext()) {
            String concat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(bko.H(iterable));
            SQLiteDatabase a = bkoVar.a();
            a.beginTransaction();
            try {
                a.compileStatement(concat).execute();
                Cursor rawQuery = a.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                try {
                    Cursor cursor = rawQuery;
                    while (cursor.moveToNext()) {
                        bkoVar.z(cursor.getInt(0), xqg.MAX_RETRIES_REACHED, cursor.getString(1));
                    }
                    rawQuery.close();
                    a.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                    a.setTransactionSuccessful();
                } catch (Throwable th) {
                    rawQuery.close();
                    throw th;
                }
            } finally {
                a.endTransaction();
            }
        }
        bkoVar.g(new plh(((up4) hgpVar.g).a() + this.c, de2Var));
        return null;
    }

    public /* synthetic */ fw7(kw7 kw7Var, Object obj, long j, TimeUnit timeUnit, int i) {
        this.a = i;
        this.b = kw7Var;
        this.e = obj;
        this.c = j;
        this.d = timeUnit;
    }
}
