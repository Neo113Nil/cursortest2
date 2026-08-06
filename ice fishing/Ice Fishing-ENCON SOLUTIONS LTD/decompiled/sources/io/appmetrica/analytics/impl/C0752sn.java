package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import i1.AbstractC0252i;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.sn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0752sn implements TempCacheStorage {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0891y6 f6918a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6919b;

    /* renamed from: c, reason: collision with root package name */
    public final SystemTimeProvider f6920c = new SystemTimeProvider();

    public C0752sn(InterfaceC0891y6 interfaceC0891y6, String str) {
        this.f6918a = interfaceC0891y6;
        this.f6919b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<TempCacheStorage.Entry> get(String str, int i2) {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        C0804un c0804un;
        ArrayList arrayList = new ArrayList();
        Cursor cursor2 = null;
        try {
            sQLiteDatabase = this.f6918a.a();
            sQLiteDatabase2 = sQLiteDatabase;
        } catch (Throwable unused) {
            cursor = null;
        }
        if (sQLiteDatabase != 0) {
            try {
                cursor = sQLiteDatabase.query(false, this.f6919b, null, "scope=?", new String[]{str}, null, null, "id", String.valueOf(i2));
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        try {
                            try {
                                c0804un = new C0804un(cursor.getLong(cursor.getColumnIndexOrThrow("id")), cursor.getString(cursor.getColumnIndexOrThrow("scope")), cursor.getLong(cursor.getColumnIndexOrThrow("timestamp")), cursor.getBlob(cursor.getColumnIndexOrThrow("data")));
                            } catch (Throwable unused2) {
                                c0804un = null;
                            }
                            if (c0804un != null) {
                                arrayList.add(c0804un);
                            }
                        } catch (Throwable unused3) {
                            cursor2 = sQLiteDatabase;
                            sQLiteDatabase = cursor2;
                            cursor2 = cursor;
                            sQLiteDatabase2 = sQLiteDatabase;
                            AbstractC0572lo.a(cursor2);
                            this.f6918a.a(sQLiteDatabase2);
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
        AbstractC0572lo.a(cursor2);
        this.f6918a.a(sQLiteDatabase2);
        return arrayList;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final long put(String str, long j2, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = this.f6918a.a();
            if (sQLiteDatabase != null) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("scope", str);
                    contentValues.put("timestamp", Long.valueOf(j2));
                    contentValues.put("data", bArr);
                    long insertOrThrow = sQLiteDatabase.insertOrThrow(this.f6919b, null, contentValues);
                    this.f6918a.a(sQLiteDatabase);
                    return insertOrThrow;
                } catch (Throwable unused) {
                    sQLiteDatabase2 = sQLiteDatabase;
                    sQLiteDatabase = sQLiteDatabase2;
                    this.f6918a.a(sQLiteDatabase);
                    return -1L;
                }
            }
        } catch (Throwable unused2) {
        }
        this.f6918a.a(sQLiteDatabase);
        return -1L;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void remove(long j2) {
        a("id=?", new String[]{String.valueOf(j2)});
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void removeOlderThan(String str, long j2) {
        a("scope=? AND timestamp<?", new String[]{str, String.valueOf(this.f6920c.currentTimeMillis() - j2)});
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final TempCacheStorage.Entry get(String str) {
        return (TempCacheStorage.Entry) AbstractC0252i.H(get(str, 1));
    }

    public final void a(String str, String[] strArr) {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.f6918a.a();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.delete(this.f6919b, str, strArr);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabase = null;
        }
        this.f6918a.a(sQLiteDatabase);
    }
}
