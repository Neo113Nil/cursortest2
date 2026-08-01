package S3;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import c2.EnumC0536c;
import h2.InterfaceC4563b;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements g, InterfaceC4563b {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2859n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f2860u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f2861v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f2862w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f2863x;

    public /* synthetic */ b(f fVar, Object obj, long j6, TimeUnit timeUnit, int i) {
        this.f2859n = i;
        this.f2860u = fVar;
        this.f2863x = obj;
        this.f2861v = j6;
        this.f2862w = timeUnit;
    }

    @Override // S3.g
    public ScheduledFuture a(F1.a aVar) {
        switch (this.f2859n) {
            case 0:
                f fVar = (f) this.f2860u;
                return fVar.f2878u.schedule(new e(fVar, (Runnable) this.f2863x, aVar, 1), this.f2861v, (TimeUnit) this.f2862w);
            default:
                f fVar2 = (f) this.f2860u;
                return fVar2.f2878u.schedule(new K0.e(1, fVar2, (Callable) this.f2863x, aVar), this.f2861v, (TimeUnit) this.f2862w);
        }
    }

    @Override // h2.InterfaceC4563b
    public Object c() {
        f2.i iVar = (f2.i) this.f2860u;
        g2.h hVar = (g2.h) iVar.f37484c;
        hVar.getClass();
        Iterable iterable = (Iterable) this.f2863x;
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + g2.h.n(iterable);
            SQLiteDatabase b9 = hVar.b();
            b9.beginTransaction();
            try {
                b9.compileStatement(str).execute();
                Cursor rawQuery = b9.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        hVar.l(rawQuery.getInt(0), EnumC0536c.MAX_RETRIES_REACHED, rawQuery.getString(1));
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                }
                rawQuery.close();
                b9.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                b9.setTransactionSuccessful();
            } finally {
                b9.endTransaction();
            }
        }
        hVar.j(new g2.e(iVar.f37488g.g() + this.f2861v, (Z1.i) this.f2862w));
        return null;
    }

    public /* synthetic */ b(f2.i iVar, Iterable iterable, Z1.i iVar2, long j6) {
        this.f2859n = 2;
        this.f2860u = iVar;
        this.f2863x = iterable;
        this.f2862w = iVar2;
        this.f2861v = j6;
    }
}
