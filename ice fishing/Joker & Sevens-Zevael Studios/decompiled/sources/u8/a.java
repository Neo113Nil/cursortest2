package u8;

import android.database.Cursor;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements t8.a {
    private final Cursor _cursor;

    public a(Cursor cursor) {
        j.e(cursor, "_cursor");
        this._cursor = cursor;
    }

    @Override // t8.a
    public int getCount() {
        return this._cursor.getCount();
    }

    @Override // t8.a
    public float getFloat(String str) {
        j.e(str, "column");
        Cursor cursor = this._cursor;
        return cursor.getFloat(cursor.getColumnIndex(str));
    }

    @Override // t8.a
    public int getInt(String str) {
        j.e(str, "column");
        Cursor cursor = this._cursor;
        return cursor.getInt(cursor.getColumnIndex(str));
    }

    @Override // t8.a
    public long getLong(String str) {
        j.e(str, "column");
        Cursor cursor = this._cursor;
        return cursor.getLong(cursor.getColumnIndex(str));
    }

    @Override // t8.a
    public Float getOptFloat(String str) {
        j.e(str, "column");
        int columnIndex = this._cursor.getColumnIndex(str);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return Float.valueOf(this._cursor.getFloat(columnIndex));
    }

    @Override // t8.a
    public Integer getOptInt(String str) {
        j.e(str, "column");
        int columnIndex = this._cursor.getColumnIndex(str);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return Integer.valueOf(this._cursor.getInt(columnIndex));
    }

    @Override // t8.a
    public Long getOptLong(String str) {
        j.e(str, "column");
        int columnIndex = this._cursor.getColumnIndex(str);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return Long.valueOf(this._cursor.getLong(columnIndex));
    }

    @Override // t8.a
    public String getOptString(String str) {
        j.e(str, "column");
        int columnIndex = this._cursor.getColumnIndex(str);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return this._cursor.getString(columnIndex);
    }

    @Override // t8.a
    public String getString(String str) {
        j.e(str, "column");
        Cursor cursor = this._cursor;
        String string = cursor.getString(cursor.getColumnIndex(str));
        j.d(string, "_cursor.getString(_cursor.getColumnIndex(column))");
        return string;
    }

    @Override // t8.a
    public boolean moveToFirst() {
        return this._cursor.moveToFirst();
    }

    @Override // t8.a
    public boolean moveToNext() {
        return this._cursor.moveToNext();
    }
}
