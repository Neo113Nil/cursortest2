package app.cash.sqldelight;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class SimpleQuery extends Query {
    public final SqlDriver driver;
    public final String fileName;
    public final int identifier;
    public final String label;
    public final String query;
    public final String[] queryKeys;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleQuery(int i, String[] strArr, SqlDriver sqlDriver, String str, String str2, String str3, Function1 function1) {
        super(function1);
        sqlDriver.getClass();
        this.identifier = i;
        this.queryKeys = strArr;
        this.driver = sqlDriver;
        this.fileName = str;
        this.label = str2;
        this.query = str3;
    }

    @Override // app.cash.sqldelight.Query
    public final void addListener(Query.Listener listener) {
        String[] strArr = this.queryKeys;
        this.driver.addListener((String[]) Arrays.copyOf(strArr, strArr.length), listener);
    }

    @Override // app.cash.sqldelight.ExecutableQuery
    public final QueryResult execute(Function1 function1) {
        return this.driver.executeQuery(Integer.valueOf(this.identifier), this.query, function1, 0, null);
    }

    @Override // app.cash.sqldelight.Query
    public final void removeListener(Query.Listener listener) {
        listener.getClass();
        String[] strArr = this.queryKeys;
        this.driver.removeListener((String[]) Arrays.copyOf(strArr, strArr.length), listener);
    }

    public final String toString() {
        return this.fileName + ':' + this.label;
    }
}
