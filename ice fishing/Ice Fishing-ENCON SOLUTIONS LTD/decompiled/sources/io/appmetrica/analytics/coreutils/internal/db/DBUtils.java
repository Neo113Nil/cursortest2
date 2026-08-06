package io.appmetrica.analytics.coreutils.internal.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt;

/* loaded from: classes.dex */
public class DBUtils {
    public static void cursorRowToContentValues(Cursor cursor, ContentValues contentValues) {
        try {
            enhancedCursorRowToContentValues(cursor, contentValues);
        } catch (Throwable unused) {
        }
    }

    public static void enhancedCursorRowToContentValues(Cursor cursor, ContentValues contentValues) {
        String[] columnNames = cursor.getColumnNames();
        int length = columnNames.length;
        for (int i2 = 0; i2 < length; i2++) {
            int type = cursor.getType(i2);
            if (type == 0) {
                contentValues.put(columnNames[i2], cursor.getString(i2));
            } else if (type == 1) {
                contentValues.put(columnNames[i2], Long.valueOf(cursor.getLong(i2)));
            } else if (type == 2) {
                contentValues.put(columnNames[i2], Double.valueOf(cursor.getDouble(i2)));
            } else if (type == 3) {
                contentValues.put(columnNames[i2], cursor.getString(i2));
            } else if (type != 4) {
                contentValues.put(columnNames[i2], cursor.getString(i2));
            } else {
                contentValues.put(columnNames[i2], cursor.getBlob(i2));
            }
        }
    }

    public static long queryRowsCount(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.rawQuery("SELECT count() FROM " + str, null);
            return cursor.moveToFirst() ? cursor.getLong(0) : 0L;
        } finally {
            CloseableUtilsKt.closeSafely(cursor);
        }
    }
}
