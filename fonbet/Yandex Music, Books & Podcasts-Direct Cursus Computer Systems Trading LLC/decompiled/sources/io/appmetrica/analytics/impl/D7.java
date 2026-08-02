package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class D7 extends InterruptionSafeThread {
    public final P5 a;
    public final /* synthetic */ E7 b;

    public D7(E7 e7, P5 p5) {
        this.b = e7;
        this.a = p5;
    }

    public final synchronized void a(ArrayList arrayList) {
        try {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ContentValues contentValues = (ContentValues) it.next();
                this.b.getClass();
                Integer asInteger = contentValues.getAsInteger("type");
                asInteger.intValue();
                arrayList2.add(asInteger);
            }
            Iterator it2 = this.b.j.iterator();
            while (it2.hasNext()) {
                ((InterfaceC0111aa) it2.next()).a(arrayList2);
            }
            ((C0165c6) this.a.p).e();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        int i;
        while (isRunning()) {
            try {
                synchronized (this) {
                    try {
                        if (E7.a(this.b)) {
                            wait();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable unused) {
                stopRunning();
            }
            synchronized (this.b.e) {
                arrayList = new ArrayList(this.b.f);
                this.b.f.clear();
            }
            E7 e7 = this.b;
            e7.getClass();
            if (!arrayList.isEmpty()) {
                long j = ((Nj) e7.h.k.a()).v;
                e7.b.lock();
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase writableDatabase = e7.c.getWritableDatabase();
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.beginTransaction();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ContentValues contentValues = (ContentValues) it.next();
                                writableDatabase.insertOrThrow("events", null, contentValues);
                                e7.i.incrementAndGet();
                                e7.a(contentValues, "Event saved to db");
                            }
                            if (e7.i.get() > j) {
                                i = e7.a(writableDatabase);
                                e7.i.addAndGet(-i);
                            } else {
                                i = 0;
                            }
                            writableDatabase.setTransactionSuccessful();
                            if (i != 0) {
                                Iterator it2 = e7.j.iterator();
                                while (it2.hasNext()) {
                                    ((InterfaceC0111aa) it2.next()).a();
                                }
                            }
                        } catch (Throwable unused2) {
                            sQLiteDatabase = writableDatabase;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.endTransaction();
                            }
                            e7.b.unlock();
                            a(arrayList);
                        }
                    }
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.endTransaction();
                        } catch (Throwable unused3) {
                        }
                    }
                } catch (Throwable unused4) {
                }
                e7.b.unlock();
            }
            a(arrayList);
        }
    }
}
