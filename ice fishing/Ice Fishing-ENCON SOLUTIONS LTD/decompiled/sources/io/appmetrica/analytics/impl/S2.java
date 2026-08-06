package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* loaded from: classes.dex */
public final class S2 implements IBinaryDataHelper {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0891y6 f5023a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5024b;

    public S2(InterfaceC0891y6 interfaceC0891y6, String str) {
        this.f5023a = interfaceC0891y6;
        this.f5024b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final byte[] get(String str) {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.f5023a.a();
        } catch (Throwable unused) {
            cursor = null;
            sQLiteDatabase = null;
        }
        if (sQLiteDatabase != null) {
            try {
                cursor = sQLiteDatabase.query(this.f5024b, null, "data_key = ?", new String[]{str}, null, null, null);
                if (cursor != null) {
                    try {
                        if (cursor.getCount() == 1 && cursor.moveToFirst()) {
                            byte[] blob = cursor.getBlob(cursor.getColumnIndexOrThrow("value"));
                            AbstractC0572lo.a(cursor);
                            this.f5023a.a(sQLiteDatabase);
                            return blob;
                        }
                    } catch (Throwable unused2) {
                    }
                }
                if (cursor != null) {
                    cursor.getCount();
                }
            } catch (Throwable unused3) {
            }
            AbstractC0572lo.a(cursor);
            this.f5023a.a(sQLiteDatabase);
            return null;
        }
        cursor = null;
        AbstractC0572lo.a(cursor);
        this.f5023a.a(sQLiteDatabase);
        return null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final void insert(String str, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = this.f5023a.a();
            if (sQLiteDatabase != null) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("data_key", str);
                    contentValues.put("value", bArr);
                    sQLiteDatabase.insertWithOnConflict(this.f5024b, null, contentValues, 5);
                } catch (Throwable unused) {
                    sQLiteDatabase2 = sQLiteDatabase;
                    sQLiteDatabase = sQLiteDatabase2;
                    this.f5023a.a(sQLiteDatabase);
                }
            }
        } catch (Throwable unused2) {
        }
        this.f5023a.a(sQLiteDatabase);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final void remove(String str) {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.f5023a.a();
            if (sQLiteDatabase != null) {
                try {
                    new ContentValues().put("data_key", str);
                    sQLiteDatabase.delete(this.f5024b, "data_key = ?", new String[]{str});
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabase = null;
        }
        this.f5023a.a(sQLiteDatabase);
    }
}
