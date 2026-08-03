package c6;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements e6.b, m7.h {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1257g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f1258h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1259i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1260j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1261k;

    public /* synthetic */ i(l lVar, Iterable iterable, w5.i iVar, long j3) {
        this.f1257g = 0;
        this.f1259i = lVar;
        this.f1260j = iterable;
        this.f1261k = iVar;
        this.f1258h = j3;
    }

    @Override // e6.b
    public Object a() {
        l lVar = (l) this.f1259i;
        Iterable iterable = (Iterable) this.f1260j;
        w5.i iVar = (w5.i) this.f1261k;
        d6.j jVar = (d6.j) ((d6.d) lVar.f1270c);
        jVar.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + d6.j.j(iterable);
            SQLiteDatabase a6 = jVar.a();
            a6.beginTransaction();
            try {
                a6.compileStatement(str).execute();
                Cursor rawQuery = a6.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        jVar.g(rawQuery.getInt(0), z5.c.MAX_RETRIES_REACHED, rawQuery.getString(1));
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                }
                rawQuery.close();
                a6.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                a6.setTransactionSuccessful();
            } finally {
                a6.endTransaction();
            }
        }
        jVar.d(new d6.g(((f6.a) lVar.f1274g).a() + this.f1258h, iVar));
        return null;
    }

    @Override // m7.h
    public ScheduledFuture b(m7.g gVar) {
        switch (this.f1257g) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                m7.f fVar = (m7.f) this.f1259i;
                Runnable runnable = (Runnable) this.f1260j;
                return fVar.f4955h.schedule(new m7.d(fVar, runnable, gVar, 1), this.f1258h, (TimeUnit) this.f1261k);
            default:
                m7.f fVar2 = (m7.f) this.f1259i;
                Callable callable = (Callable) this.f1260j;
                return fVar2.f4955h.schedule(new m7.e(fVar2, callable, gVar, 0), this.f1258h, (TimeUnit) this.f1261k);
        }
    }

    public /* synthetic */ i(m7.f fVar, Object obj, long j3, TimeUnit timeUnit, int i10) {
        this.f1257g = i10;
        this.f1259i = fVar;
        this.f1260j = obj;
        this.f1258h = j3;
        this.f1261k = timeUnit;
    }
}
