package app.cash.sqldelight;

import app.cash.sqldelight.db.QueryResult;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class ExecutableQuery {
    public final Function1 mapper;

    public ExecutableQuery(Function1 function1) {
        function1.getClass();
        this.mapper = function1;
    }

    public abstract QueryResult execute(Function1 function1);

    public final List executeAsList() {
        return (List) execute(new ExecutableQuery$$ExternalSyntheticLambda0((Query) this, 0)).getValue();
    }

    public final Object executeAsOne() {
        Object executeAsOneOrNull = executeAsOneOrNull();
        if (executeAsOneOrNull != null) {
            return executeAsOneOrNull;
        }
        throw new NullPointerException("ResultSet returned null for " + this);
    }

    public final Object executeAsOneOrNull() {
        return execute(new ExecutableQuery$$ExternalSyntheticLambda0(this, 1)).getValue();
    }
}
