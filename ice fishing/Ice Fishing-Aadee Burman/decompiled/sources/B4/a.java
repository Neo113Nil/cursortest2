package B4;

import android.database.Cursor;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class a implements A4.a {
    private final Cursor _cursor;

    public a(Cursor _cursor) {
        h.e(_cursor, "_cursor");
        this._cursor = _cursor;
    }

    @Override // A4.a
    public int getCount() {
        return this._cursor.getCount();
    }

    @Override // A4.a
    public float getFloat(String column) {
        h.e(column, "column");
        Cursor cursor = this._cursor;
        return cursor.getFloat(cursor.getColumnIndex(column));
    }

    @Override // A4.a
    public int getInt(String column) {
        h.e(column, "column");
        Cursor cursor = this._cursor;
        return cursor.getInt(cursor.getColumnIndex(column));
    }

    @Override // A4.a
    public long getLong(String column) {
        h.e(column, "column");
        Cursor cursor = this._cursor;
        return cursor.getLong(cursor.getColumnIndex(column));
    }

    @Override // A4.a
    public Float getOptFloat(String column) {
        h.e(column, "column");
        int columnIndex = this._cursor.getColumnIndex(column);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return Float.valueOf(this._cursor.getFloat(columnIndex));
    }

    @Override // A4.a
    public Integer getOptInt(String column) {
        h.e(column, "column");
        int columnIndex = this._cursor.getColumnIndex(column);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return Integer.valueOf(this._cursor.getInt(columnIndex));
    }

    @Override // A4.a
    public Long getOptLong(String column) {
        h.e(column, "column");
        int columnIndex = this._cursor.getColumnIndex(column);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return Long.valueOf(this._cursor.getLong(columnIndex));
    }

    @Override // A4.a
    public String getOptString(String column) {
        h.e(column, "column");
        int columnIndex = this._cursor.getColumnIndex(column);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return this._cursor.getString(columnIndex);
    }

    @Override // A4.a
    public String getString(String column) {
        h.e(column, "column");
        Cursor cursor = this._cursor;
        String string = cursor.getString(cursor.getColumnIndex(column));
        h.d(string, "getString(...)");
        return string;
    }

    @Override // A4.a
    public boolean moveToFirst() {
        return this._cursor.moveToFirst();
    }

    @Override // A4.a
    public boolean moveToNext() {
        return this._cursor.moveToNext();
    }
}
