package com.plaid.internal;

import android.database.Cursor;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class Z7 implements Callable<List<h8>> {
    public final /* synthetic */ RoomSQLiteQuery a;
    public final /* synthetic */ g8 b;

    public Z7(g8 g8Var, RoomSQLiteQuery roomSQLiteQuery) {
        this.b = g8Var;
        this.a = roomSQLiteQuery;
    }

    @Override // java.util.concurrent.Callable
    public final List<h8> call() {
        Cursor query = DBUtil.query(this.b.a, this.a);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "workflow_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "analytics_model");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new h8(query.getString(columnIndexOrThrow), query.getString(columnIndexOrThrow2), query.getBlob(columnIndexOrThrow3)));
            }
            return arrayList;
        } finally {
            query.close();
            this.a.release();
        }
    }
}
