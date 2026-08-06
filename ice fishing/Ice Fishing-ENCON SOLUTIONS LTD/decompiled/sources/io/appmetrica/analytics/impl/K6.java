package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class K6 extends InterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    public final X4 f4626a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L6 f4627b;

    public K6(L6 l6, X4 x4) {
        this.f4627b = l6;
        this.f4626a = x4;
    }

    public final synchronized void a(ArrayList arrayList) {
        try {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ContentValues contentValues = (ContentValues) it.next();
                this.f4627b.getClass();
                Integer asInteger = contentValues.getAsInteger("type");
                asInteger.intValue();
                arrayList2.add(asInteger);
            }
            Iterator it2 = this.f4627b.f4682j.iterator();
            while (it2.hasNext()) {
                ((S8) it2.next()).a(arrayList2);
            }
            ((C0527k5) this.f4626a.f5361p).e();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        int i2;
        while (isRunning()) {
            try {
                synchronized (this) {
                    try {
                        if (L6.a(this.f4627b)) {
                            wait();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable unused) {
                stopRunning();
            }
            synchronized (this.f4627b.f4677e) {
                arrayList = new ArrayList(this.f4627b.f4678f);
                this.f4627b.f4678f.clear();
            }
            L6 l6 = this.f4627b;
            l6.getClass();
            if (!arrayList.isEmpty()) {
                long j2 = ((C0539kh) l6.f4680h.f5356k.a()).f6392v;
                l6.f4674b.lock();
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase writableDatabase = l6.f4675c.getWritableDatabase();
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.beginTransaction();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ContentValues contentValues = (ContentValues) it.next();
                                writableDatabase.insertOrThrow("events", null, contentValues);
                                l6.f4681i.incrementAndGet();
                                l6.a(contentValues, "Event saved to db");
                            }
                            if (l6.f4681i.get() > j2) {
                                i2 = l6.a(writableDatabase);
                                l6.f4681i.addAndGet(-i2);
                            } else {
                                i2 = 0;
                            }
                            writableDatabase.setTransactionSuccessful();
                            if (i2 != 0) {
                                Iterator it2 = l6.f4682j.iterator();
                                while (it2.hasNext()) {
                                    ((S8) it2.next()).a();
                                }
                            }
                        } catch (Throwable unused2) {
                            sQLiteDatabase = writableDatabase;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.endTransaction();
                            }
                            l6.f4674b.unlock();
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
                l6.f4674b.unlock();
            }
            a(arrayList);
        }
    }
}
