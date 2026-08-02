package app.cash.sqldelight.db;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import java.io.Closeable;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface SqlDriver extends Closeable {
    void addListener(String[] strArr, Query.Listener listener);

    AndroidSqliteDriver.Transaction currentTransaction();

    QueryResult execute(Integer num, String str, Function1 function1);

    QueryResult executeQuery(Integer num, String str, Function1 function1, int i, Function1 function12);

    QueryResult newTransaction();

    void notifyListeners(String... strArr);

    void removeListener(String[] strArr, Query.Listener listener);
}
