package com.gamericefishpro.space.cb;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements h, com.gamericefishpro.space.k8.b {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ long i;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ b(g gVar, Object obj, long j, TimeUnit timeUnit, int i) {
        this.d = i;
        this.e = gVar;
        this.w = obj;
        this.i = j;
        this.v = timeUnit;
    }

    @Override // com.gamericefishpro.space.cb.h
    public ScheduledFuture a(com.gamericefishpro.space.vb.c cVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g gVar = (g) this.e;
                Runnable runnable = (Runnable) this.w;
                return gVar.e.schedule(new e(gVar, runnable, cVar, 1), this.i, (TimeUnit) this.v);
            default:
                g gVar2 = (g) this.e;
                Callable callable = (Callable) this.w;
                return gVar2.e.schedule(new f(gVar2, callable, cVar, 0), this.i, (TimeUnit) this.v);
        }
    }

    @Override // com.gamericefishpro.space.k8.b
    public Object b() {
        com.gamericefishpro.space.i8.h hVar = (com.gamericefishpro.space.i8.h) this.e;
        Iterable iterable = (Iterable) this.w;
        com.gamericefishpro.space.c8.j jVar = (com.gamericefishpro.space.c8.j) this.v;
        com.gamericefishpro.space.j8.i iVar = (com.gamericefishpro.space.j8.i) ((com.gamericefishpro.space.j8.d) hVar.c);
        iVar.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + com.gamericefishpro.space.j8.i.t(iterable);
            SQLiteDatabase sQLiteDatabaseB = iVar.b();
            sQLiteDatabaseB.beginTransaction();
            try {
                sQLiteDatabaseB.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseB.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        iVar.n(cursorRawQuery.getInt(0), com.gamericefishpro.space.f8.c.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseB.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseB.setTransactionSuccessful();
                sQLiteDatabaseB.endTransaction();
            } catch (Throwable th2) {
                sQLiteDatabaseB.endTransaction();
                throw th2;
            }
        }
        iVar.j(new com.gamericefishpro.space.j8.f(((com.gamericefishpro.space.l8.a) hVar.g).d() + this.i, jVar));
        return null;
    }

    public /* synthetic */ b(com.gamericefishpro.space.i8.h hVar, Iterable iterable, com.gamericefishpro.space.c8.j jVar, long j) {
        this.d = 2;
        this.e = hVar;
        this.w = iterable;
        this.v = jVar;
        this.i = j;
    }
}
