package U3;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import e2.EnumC4475c;
import i1.C4586c;
import j2.InterfaceC4611b;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements g, InterfaceC4611b {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3298n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3299u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f3300v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f3301w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f3302x;

    public /* synthetic */ b(f fVar, Object obj, long j6, TimeUnit timeUnit, int i) {
        this.f3298n = i;
        this.f3299u = fVar;
        this.f3302x = obj;
        this.f3300v = j6;
        this.f3301w = timeUnit;
    }

    @Override // U3.g
    public ScheduledFuture a(C4586c c4586c) {
        switch (this.f3298n) {
            case 0:
                f fVar = (f) this.f3299u;
                return fVar.f3317u.schedule(new e(fVar, (Runnable) this.f3302x, c4586c, 1), this.f3300v, (TimeUnit) this.f3301w);
            default:
                f fVar2 = (f) this.f3299u;
                return fVar2.f3317u.schedule(new K0.e(1, fVar2, (Callable) this.f3302x, c4586c), this.f3300v, (TimeUnit) this.f3301w);
        }
    }

    @Override // j2.InterfaceC4611b
    public Object d() {
        h2.i iVar = (h2.i) this.f3299u;
        i2.h hVar = (i2.h) iVar.f38108c;
        hVar.getClass();
        Iterable iterable = (Iterable) this.f3302x;
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + i2.h.n(iterable);
            SQLiteDatabase b9 = hVar.b();
            b9.beginTransaction();
            try {
                b9.compileStatement(str).execute();
                Cursor rawQuery = b9.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        hVar.l(rawQuery.getInt(0), EnumC4475c.MAX_RETRIES_REACHED, rawQuery.getString(1));
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
        hVar.j(new i2.e(iVar.f38112g.f() + this.f3300v, (b2.i) this.f3301w));
        return null;
    }

    public /* synthetic */ b(h2.i iVar, Iterable iterable, b2.i iVar2, long j6) {
        this.f3298n = 2;
        this.f3299u = iVar;
        this.f3302x = iterable;
        this.f3301w = iVar2;
        this.f3300v = j6;
    }
}
