package app.cash.sqldelight.db;

import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;

/* loaded from: classes.dex */
public interface SqlSchema {
    QueryResult.Value create(AndroidSqliteDriver androidSqliteDriver);

    long getVersion();

    QueryResult.Value migrate(AndroidSqliteDriver androidSqliteDriver, long j, long j2, AfterVersion... afterVersionArr);
}
