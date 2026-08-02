package app.cash.sqldelight.driver.android;

import android.database.Cursor;
import app.cash.sqldelight.db.QueryResult;

/* loaded from: classes.dex */
public final class AndroidCursor {
    public final Cursor cursor;

    public AndroidCursor(Cursor cursor) {
        cursor.getClass();
        this.cursor = cursor;
    }

    public final Boolean getBoolean(int i) {
        Cursor cursor = this.cursor;
        if (cursor.isNull(i)) {
            return null;
        }
        return Boolean.valueOf(cursor.getLong(i) == 1);
    }

    public final byte[] getBytes(int i) {
        Cursor cursor = this.cursor;
        if (cursor.isNull(i)) {
            return null;
        }
        return cursor.getBlob(i);
    }

    public final Double getDouble(int i) {
        Cursor cursor = this.cursor;
        if (cursor.isNull(i)) {
            return null;
        }
        return Double.valueOf(cursor.getDouble(i));
    }

    public final Long getLong(int i) {
        Cursor cursor = this.cursor;
        if (cursor.isNull(i)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i));
    }

    public final String getString(int i) {
        Cursor cursor = this.cursor;
        if (cursor.isNull(i)) {
            return null;
        }
        return cursor.getString(i);
    }

    public final QueryResult.Value next() {
        return new QueryResult.Value(Boolean.valueOf(this.cursor.moveToNext()));
    }
}
