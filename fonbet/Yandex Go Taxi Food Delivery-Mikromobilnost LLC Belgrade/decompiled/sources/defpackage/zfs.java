package defpackage;

import android.database.sqlite.SQLiteStatement;

/* loaded from: classes.dex */
public final class zfs extends yfs implements mkw0 {
    public final SQLiteStatement b;

    public zfs(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.b = sQLiteStatement;
    }

    public final long a() {
        return this.b.executeInsert();
    }

    public final int c() {
        return this.b.executeUpdateDelete();
    }
}
