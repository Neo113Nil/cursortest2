package app.cash.sqldelight;

import app.cash.sqldelight.driver.android.AndroidSqliteDriver;

/* loaded from: classes.dex */
public final class TransactionWrapper implements TransactionCallbacks {
    public final AndroidSqliteDriver.Transaction transaction;

    public TransactionWrapper(AndroidSqliteDriver.Transaction transaction) {
        this.transaction = transaction;
    }
}
