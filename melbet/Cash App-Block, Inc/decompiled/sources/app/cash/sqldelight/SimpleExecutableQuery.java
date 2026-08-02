package app.cash.sqldelight;

import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class SimpleExecutableQuery extends ExecutableQuery {
    public final SqlDriver driver;
    public final String fileName;
    public final int identifier;
    public final String label;
    public final String query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleExecutableQuery(int i, SqlDriver sqlDriver, String str, String str2, String str3, Function1 function1) {
        super(function1);
        sqlDriver.getClass();
        this.identifier = i;
        this.driver = sqlDriver;
        this.fileName = str;
        this.label = str2;
        this.query = str3;
    }

    @Override // app.cash.sqldelight.ExecutableQuery
    public final QueryResult execute(Function1 function1) {
        return this.driver.executeQuery(Integer.valueOf(this.identifier), this.query, function1, 0, null);
    }

    public final String toString() {
        return this.fileName + ':' + this.label;
    }
}
