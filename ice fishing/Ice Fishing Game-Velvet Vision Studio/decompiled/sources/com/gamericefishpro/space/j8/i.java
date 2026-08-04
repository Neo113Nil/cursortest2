package com.gamericefishpro.space.j8;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements d, com.gamericefishpro.space.k8.c, c {
    public static final com.gamericefishpro.space.z7.c y = new com.gamericefishpro.space.z7.c("proto");
    public final k d;
    public final com.gamericefishpro.space.l8.a e;
    public final com.gamericefishpro.space.l8.a i;
    public final a v;
    public final com.gamericefishpro.space.nh.a w;

    public i(com.gamericefishpro.space.l8.a aVar, com.gamericefishpro.space.l8.a aVar2, a aVar3, k kVar, com.gamericefishpro.space.nh.a aVar4) {
        this.d = kVar;
        this.e = aVar;
        this.i = aVar2;
        this.v = aVar3;
        this.w = aVar4;
    }

    public static Long c(SQLiteDatabase sQLiteDatabase, com.gamericefishpro.space.c8.j jVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(jVar.a, String.valueOf(com.gamericefishpro.space.m8.a.a(jVar.c))));
        byte[] bArr = jVar.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String t(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((b) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object w(Cursor cursor, g gVar) {
        try {
            return gVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase b() {
        k kVar = this.d;
        Objects.requireNonNull(kVar);
        com.gamericefishpro.space.l8.a aVar = this.i;
        long jD = aVar.d();
        while (true) {
            try {
                return kVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (aVar.d() >= ((long) this.v.c) + jD) {
                    throw new com.gamericefishpro.space.k8.a("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    public final Object j(g gVar) {
        SQLiteDatabase sQLiteDatabaseB = b();
        sQLiteDatabaseB.beginTransaction();
        try {
            Object objApply = gVar.apply(sQLiteDatabaseB);
            sQLiteDatabaseB.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseB.endTransaction();
        }
    }

    public final ArrayList l(SQLiteDatabase sQLiteDatabase, com.gamericefishpro.space.c8.j jVar, int i) {
        ArrayList arrayList = new ArrayList();
        Long lC = c(sQLiteDatabase, jVar);
        if (lC == null) {
            return arrayList;
        }
        w(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lC.toString()}, null, null, null, String.valueOf(i)), new com.gamericefishpro.space.h8.a(this, (Object) arrayList, jVar, 2));
        return arrayList;
    }

    public final void n(long j, com.gamericefishpro.space.f8.c cVar, String str) {
        j(new com.gamericefishpro.space.i8.g(j, str, cVar));
    }

    public final Object o(com.gamericefishpro.space.k8.b bVar) {
        SQLiteDatabase sQLiteDatabaseB = b();
        com.gamericefishpro.space.l8.a aVar = this.i;
        long jD = aVar.d();
        while (true) {
            try {
                sQLiteDatabaseB.beginTransaction();
                try {
                    Object objB = bVar.b();
                    sQLiteDatabaseB.setTransactionSuccessful();
                    return objB;
                } finally {
                    sQLiteDatabaseB.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (aVar.d() >= ((long) this.v.c) + jD) {
                    throw new com.gamericefishpro.space.k8.a("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
