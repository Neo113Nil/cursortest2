package com.plaid.internal;

import android.database.Cursor;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class O3 implements Callable<String> {
    public final /* synthetic */ RoomSQLiteQuery a;
    public final /* synthetic */ P3 b;

    public O3(P3 p3, RoomSQLiteQuery roomSQLiteQuery) {
        this.b = p3;
        this.a = roomSQLiteQuery;
    }

    @Override // java.util.concurrent.Callable
    public final String call() {
        String str;
        Cursor query = DBUtil.query(this.b.a, this.a);
        try {
            if (query.moveToFirst() && !query.isNull(0)) {
                str = query.getString(0);
                return str;
            }
            str = null;
            return str;
        } finally {
            query.close();
            this.a.release();
        }
    }
}
