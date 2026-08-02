package app.cash.sqldelight.driver.android;

import androidx.sqlite.db.SupportSQLiteStatement;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class AndroidPreparedStatement implements AndroidStatement {
    public final SupportSQLiteStatement statement;

    public AndroidPreparedStatement(SupportSQLiteStatement supportSQLiteStatement) {
        supportSQLiteStatement.getClass();
        this.statement = supportSQLiteStatement;
    }

    @Override // app.cash.sqldelight.driver.android.AndroidStatement
    public final void bindBoolean(int i, Boolean bool) {
        SupportSQLiteStatement supportSQLiteStatement = this.statement;
        if (bool == null) {
            supportSQLiteStatement.bindNull(i + 1);
        } else {
            supportSQLiteStatement.bindLong(i + 1, bool.booleanValue() ? 1L : 0L);
        }
    }

    @Override // app.cash.sqldelight.driver.android.AndroidStatement
    public final void bindBytes(int i, byte[] bArr) {
        SupportSQLiteStatement supportSQLiteStatement = this.statement;
        int i2 = i + 1;
        if (bArr == null) {
            supportSQLiteStatement.bindNull(i2);
        } else {
            supportSQLiteStatement.bindBlob(i2, bArr);
        }
    }

    @Override // app.cash.sqldelight.driver.android.AndroidStatement
    public final void bindDouble(int i, Double d) {
        SupportSQLiteStatement supportSQLiteStatement = this.statement;
        int i2 = i + 1;
        if (d == null) {
            supportSQLiteStatement.bindNull(i2);
        } else {
            supportSQLiteStatement.bindDouble(i2, d.doubleValue());
        }
    }

    @Override // app.cash.sqldelight.driver.android.AndroidStatement
    public final void bindLong(int i, Long l) {
        SupportSQLiteStatement supportSQLiteStatement = this.statement;
        int i2 = i + 1;
        if (l == null) {
            supportSQLiteStatement.bindNull(i2);
        } else {
            supportSQLiteStatement.bindLong(i2, l.longValue());
        }
    }

    @Override // app.cash.sqldelight.driver.android.AndroidStatement
    public final void bindString(int i, String str) {
        SupportSQLiteStatement supportSQLiteStatement = this.statement;
        int i2 = i + 1;
        if (str == null) {
            supportSQLiteStatement.bindNull(i2);
        } else {
            supportSQLiteStatement.bindString(i2, str);
        }
    }

    @Override // app.cash.sqldelight.driver.android.AndroidStatement
    public final void close() {
        this.statement.close();
    }

    @Override // app.cash.sqldelight.driver.android.AndroidStatement
    public final long execute() {
        return this.statement.executeUpdateDelete();
    }

    @Override // app.cash.sqldelight.driver.android.AndroidStatement
    public final Object executeQuery(Function1 function1) {
        function1.getClass();
        throw new UnsupportedOperationException();
    }
}
