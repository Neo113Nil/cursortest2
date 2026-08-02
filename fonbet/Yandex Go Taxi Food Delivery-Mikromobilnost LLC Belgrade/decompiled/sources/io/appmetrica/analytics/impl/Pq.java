package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.coreutils.internal.buffering.DeferredBatchExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes9.dex */
public final class Pq implements TempCacheStorage {
    public final InterfaceC0817w7 a;
    public final String b;
    public final SystemTimeProvider c = new SystemTimeProvider();
    public final Q3 d = new Q3(new Oq(this));

    public Pq(InterfaceC0817w7 interfaceC0817w7, String str) {
        this.a = interfaceC0817w7;
        this.b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<TempCacheStorage.Entry> get(String str, int i) {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        Rq rq;
        ArrayList arrayList = new ArrayList();
        Cursor cursor2 = null;
        try {
            sQLiteDatabase = this.a.a();
            sQLiteDatabase2 = sQLiteDatabase;
        } catch (Throwable unused) {
            cursor = null;
        }
        if (sQLiteDatabase != 0) {
            try {
                cursor = sQLiteDatabase.query(false, this.b, null, "scope=?", new String[]{str}, null, null, "id", String.valueOf(i));
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        try {
                            try {
                                rq = new Rq(cursor.getLong(cursor.getColumnIndexOrThrow("id")), cursor.getString(cursor.getColumnIndexOrThrow("scope")), cursor.getLong(cursor.getColumnIndexOrThrow(ClidProvider.TIMESTAMP)), cursor.getBlob(cursor.getColumnIndexOrThrow(Constants.KEY_DATA)));
                            } catch (Throwable unused2) {
                                rq = null;
                            }
                            if (rq != null) {
                                arrayList.add(rq);
                            }
                        } catch (Throwable unused3) {
                            cursor2 = sQLiteDatabase;
                            sQLiteDatabase = cursor2;
                            cursor2 = cursor;
                            sQLiteDatabase2 = sQLiteDatabase;
                            Or.a(cursor2);
                            this.a.a(sQLiteDatabase2);
                            return arrayList;
                        }
                    }
                }
            } catch (Throwable unused4) {
                cursor = null;
            }
            cursor2 = cursor;
            sQLiteDatabase2 = sQLiteDatabase;
        }
        Or.a(cursor2);
        this.a.a(sQLiteDatabase2);
        return arrayList;
    }

    public final void b() {
        this.d.b.flushAsync();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final TempCacheStorage.Entry get(String str) {
        return (TempCacheStorage.Entry) kotlin.collections.a.R(get(str, 1));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void put(String str, long j, byte[] bArr) {
        DeferredBatchExecutor.submit$default(this.d.b, new Sq(str, j, bArr), false, 2, null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void remove(long j) {
        a("id=?", new String[]{String.valueOf(j)});
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void removeOlderThan(String str, long j) {
        a("scope=? AND timestamp<?", new String[]{str, String.valueOf(this.c.currentTimeMillis() - j)});
    }

    public final long a(String str, long j, byte[] bArr) {
        return a(Collections.singletonList(new Sq(str, j, bArr)));
    }

    public final long a(List list) {
        long j = -1;
        if (list.isEmpty()) {
            return -1L;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase a = this.a.a();
            if (a != null) {
                try {
                    a.beginTransaction();
                    try {
                        Iterator it = list.iterator();
                        long j2 = -1;
                        while (it.hasNext()) {
                            Sq sq = (Sq) it.next();
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("scope", sq.a);
                            contentValues.put(ClidProvider.TIMESTAMP, Long.valueOf(sq.b));
                            contentValues.put(Constants.KEY_DATA, sq.c);
                            j2 = a.insertOrThrow(this.b, null, contentValues);
                        }
                        a.setTransactionSuccessful();
                        a.endTransaction();
                        j = j2;
                    } catch (Throwable th) {
                        a.endTransaction();
                        throw th;
                    }
                } catch (Throwable unused) {
                    sQLiteDatabase = a;
                    this.a.a(sQLiteDatabase);
                    return -1L;
                }
            }
            this.a.a(a);
            return j;
        } catch (Throwable unused2) {
        }
    }

    public final void a(String str, String[] strArr) {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.a.a();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.delete(this.b, str, strArr);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabase = null;
        }
        this.a.a(sQLiteDatabase);
    }

    public final void a() {
        this.d.b.flush();
    }
}
