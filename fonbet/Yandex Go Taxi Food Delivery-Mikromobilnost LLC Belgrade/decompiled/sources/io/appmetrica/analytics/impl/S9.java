package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import defpackage.tcc;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class S9 {
    public final V7 a;
    public final S5 b;
    public final AtomicLong c;
    public final List d;
    public final F7 e;
    public final ReentrantReadWriteLock.WriteLock f;

    public S9(V7 v7, S5 s5, AtomicLong atomicLong, ArrayList arrayList, F7 f7, ReentrantReadWriteLock reentrantReadWriteLock) {
        this.a = v7;
        this.b = s5;
        this.c = atomicLong;
        this.d = arrayList;
        this.e = f7;
        this.f = reentrantReadWriteLock.writeLock();
    }

    public final int a(SQLiteDatabase sQLiteDatabase) {
        try {
            return this.e.a(sQLiteDatabase, String.format("id IN (SELECT id FROM events ORDER BY CASE WHEN type IN (%1$s) THEN 2 WHEN type IN (%2$s) THEN 1 ELSE 0 END, id LIMIT (SELECT count() FROM events) / %3$s)", Arrays.copyOf(new Object[]{kotlin.collections.a.X(La.i, Extension.FIX_SPACE, null, null, null, 62), kotlin.collections.a.X(La.j, Extension.FIX_SPACE, null, null, null, 62), 10}, 3)), null, 2, this.b.b.b, true).b;
        } catch (Throwable th) {
            C0313en c0313en = Cm.a;
            c0313en.getClass();
            c0313en.a(new Dm("deleteExcessiveReports exception", th));
            return 0;
        }
    }

    public final void b(List list) {
        int i;
        if (list.isEmpty()) {
            return;
        }
        long j = ((Xj) this.b.k.a()).v;
        ReentrantReadWriteLock.WriteLock writeLock = this.f;
        writeLock.lock();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
                if (writableDatabase != null) {
                    try {
                        writableDatabase.beginTransaction();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ContentValues contentValues = (ContentValues) it.next();
                            writableDatabase.insertOrThrow("events", null, contentValues);
                            this.c.incrementAndGet();
                            a(contentValues);
                        }
                        if (this.c.get() > j) {
                            i = a(writableDatabase);
                            this.c.addAndGet(-i);
                        } else {
                            i = 0;
                        }
                        writableDatabase.setTransactionSuccessful();
                        if (i != 0) {
                            Iterator it2 = this.d.iterator();
                            while (it2.hasNext()) {
                                ((InterfaceC0387ha) it2.next()).a();
                            }
                        }
                    } catch (Throwable unused) {
                        sQLiteDatabase = writableDatabase;
                        Or.a(sQLiteDatabase);
                        writeLock.unlock();
                    }
                }
                Or.a(writableDatabase);
            } catch (Throwable th) {
                writeLock.unlock();
                throw th;
            }
        } catch (Throwable unused2) {
        }
        writeLock.unlock();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ContentValues contentValues) {
        Integer asInteger = contentValues.getAsInteger("type");
        if (La.d.contains(Hc.a(asInteger != null ? asInteger.intValue() : -1))) {
            C0212b8 model = new C0241c8(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
            PublicLogger publicLogger = this.b.m;
            Hc hc = model.d;
            C0183a8 c0183a8 = model.g;
            publicLogger.info(Ei.a("Event saved to db", hc, c0183a8.b, c0183a8.c), new Object[0]);
        }
    }

    public final void a(List list) {
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer asInteger = ((ContentValues) it.next()).getAsInteger("type");
            arrayList.add(Integer.valueOf(asInteger != null ? asInteger.intValue() : -1));
        }
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            ((InterfaceC0387ha) it2.next()).a(arrayList);
        }
        ((C0325f6) this.b.p).e();
    }
}
