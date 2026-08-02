package app.cash.zipline.loader;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import java.io.IOException;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class NullSqlDriver implements SqlDriver {
    @Override // app.cash.sqldelight.db.SqlDriver
    public final void addListener(String[] strArr, Query.Listener listener) {
        listener.getClass();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public final AndroidSqliteDriver.Transaction currentTransaction() {
        throw new IOException("NullSqlDriver");
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public final QueryResult execute(Integer num, String str, Function1 function1) {
        throw new IOException("NullSqlDriver");
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public final QueryResult executeQuery(Integer num, String str, Function1 function1, int i, Function1 function12) {
        str.getClass();
        function1.getClass();
        throw new IOException("NullSqlDriver");
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public final QueryResult newTransaction() {
        throw new IOException("NullSqlDriver");
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public final void notifyListeners(String... strArr) {
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public final void removeListener(String[] strArr, Query.Listener listener) {
        listener.getClass();
    }
}
