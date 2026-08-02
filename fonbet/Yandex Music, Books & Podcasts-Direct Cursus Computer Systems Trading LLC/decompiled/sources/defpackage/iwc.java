package defpackage;

import android.database.sqlite.SQLiteStatement;

/* loaded from: classes.dex */
public final class iwc extends hwc implements dtr {
    public final SQLiteStatement c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwc(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        sQLiteStatement.getClass();
        this.c = sQLiteStatement;
    }

    @Override // defpackage.dtr
    public final void execute() {
        this.c.execute();
    }
}
