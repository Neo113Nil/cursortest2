package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;

/* loaded from: classes.dex */
public final class FrameworkSQLiteStatement extends FrameworkSQLiteProgram implements SupportSQLiteStatement {
    public final SQLiteStatement delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameworkSQLiteStatement(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        sQLiteStatement.getClass();
        this.delegate = sQLiteStatement;
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final void execute() {
        this.delegate.execute();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final long executeInsert() {
        return this.delegate.executeInsert();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final int executeUpdateDelete() {
        return this.delegate.executeUpdateDelete();
    }
}
