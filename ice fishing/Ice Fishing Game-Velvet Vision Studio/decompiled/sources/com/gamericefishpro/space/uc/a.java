package com.gamericefishpro.space.uc;

import android.database.Cursor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.tc.a {
    private final Cursor _cursor;

    public a(Cursor _cursor) {
        Intrinsics.checkNotNullParameter(_cursor, "_cursor");
        this._cursor = _cursor;
    }

    @Override // com.gamericefishpro.space.tc.a
    public int getCount() {
        return this._cursor.getCount();
    }

    @Override // com.gamericefishpro.space.tc.a
    public float getFloat(String column) {
        Intrinsics.checkNotNullParameter(column, "column");
        Cursor cursor = this._cursor;
        return cursor.getFloat(cursor.getColumnIndex(column));
    }

    @Override // com.gamericefishpro.space.tc.a
    public int getInt(String column) {
        Intrinsics.checkNotNullParameter(column, "column");
        Cursor cursor = this._cursor;
        return cursor.getInt(cursor.getColumnIndex(column));
    }

    @Override // com.gamericefishpro.space.tc.a
    public long getLong(String column) {
        Intrinsics.checkNotNullParameter(column, "column");
        Cursor cursor = this._cursor;
        return cursor.getLong(cursor.getColumnIndex(column));
    }

    @Override // com.gamericefishpro.space.tc.a
    public Float getOptFloat(String column) {
        Intrinsics.checkNotNullParameter(column, "column");
        int columnIndex = this._cursor.getColumnIndex(column);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return Float.valueOf(this._cursor.getFloat(columnIndex));
    }

    @Override // com.gamericefishpro.space.tc.a
    public Integer getOptInt(String column) {
        Intrinsics.checkNotNullParameter(column, "column");
        int columnIndex = this._cursor.getColumnIndex(column);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return Integer.valueOf(this._cursor.getInt(columnIndex));
    }

    @Override // com.gamericefishpro.space.tc.a
    public Long getOptLong(String column) {
        Intrinsics.checkNotNullParameter(column, "column");
        int columnIndex = this._cursor.getColumnIndex(column);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return Long.valueOf(this._cursor.getLong(columnIndex));
    }

    @Override // com.gamericefishpro.space.tc.a
    public String getOptString(String column) {
        Intrinsics.checkNotNullParameter(column, "column");
        int columnIndex = this._cursor.getColumnIndex(column);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return this._cursor.getString(columnIndex);
    }

    @Override // com.gamericefishpro.space.tc.a
    public String getString(String column) {
        Intrinsics.checkNotNullParameter(column, "column");
        Cursor cursor = this._cursor;
        String string = cursor.getString(cursor.getColumnIndex(column));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.gamericefishpro.space.tc.a
    public boolean moveToFirst() {
        return this._cursor.moveToFirst();
    }

    @Override // com.gamericefishpro.space.tc.a
    public boolean moveToNext() {
        return this._cursor.moveToNext();
    }
}
