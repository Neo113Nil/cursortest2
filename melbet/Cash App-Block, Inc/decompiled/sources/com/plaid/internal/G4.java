package com.plaid.internal;

import android.database.Cursor;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class G4 implements Callable<I4> {
    public final /* synthetic */ RoomSQLiteQuery a;
    public final /* synthetic */ H4 b;

    public G4(H4 h4, RoomSQLiteQuery roomSQLiteQuery) {
        this.b = h4;
        this.a = roomSQLiteQuery;
    }

    @Override // java.util.concurrent.Callable
    public final I4 call() {
        Cursor query = DBUtil.query(this.b.a, this.a);
        try {
            return query.moveToFirst() ? new I4(query.getString(CursorUtil.getColumnIndexOrThrow(query, "workflow_id")), query.getString(CursorUtil.getColumnIndexOrThrow(query, "id")), query.getBlob(CursorUtil.getColumnIndexOrThrow(query, "model"))) : null;
        } finally {
            query.close();
            this.a.release();
        }
    }
}
