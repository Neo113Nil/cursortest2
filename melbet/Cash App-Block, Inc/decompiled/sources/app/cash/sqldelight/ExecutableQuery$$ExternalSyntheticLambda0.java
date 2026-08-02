package app.cash.sqldelight;

import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.driver.android.AndroidCursor;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final /* synthetic */ class ExecutableQuery$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ExecutableQuery f$0;

    public /* synthetic */ ExecutableQuery$$ExternalSyntheticLambda0(ExecutableQuery executableQuery, int i) {
        this.$r8$classId = i;
        this.f$0 = executableQuery;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        ExecutableQuery executableQuery = this.f$0;
        Object obj2 = null;
        AndroidCursor androidCursor = (AndroidCursor) obj;
        androidCursor.getClass();
        switch (i) {
            case 0:
                ArrayList arrayList = new ArrayList();
                while (((Boolean) androidCursor.next().value).booleanValue()) {
                    arrayList.add(executableQuery.mapper.invoke(androidCursor));
                }
                return new QueryResult.Value(arrayList);
            case 1:
                if (!((Boolean) androidCursor.next().value).booleanValue()) {
                    return new QueryResult.Value(obj2);
                }
                Object invoke = executableQuery.mapper.invoke(androidCursor);
                if (!((Boolean) androidCursor.next().value).booleanValue()) {
                    return new QueryResult.Value(invoke);
                }
                Handlers$$ExternalSyntheticBUOutline0.m(executableQuery, "ResultSet returned more than 1 row for ");
                return null;
            case 2:
                QueryResult.Value next = androidCursor.next();
                ArrayList arrayList2 = new ArrayList();
                ExecutableQuery executableQuery2 = this.f$0;
                if (!((Boolean) next.value).booleanValue()) {
                    return new QueryResult.Value(arrayList2);
                }
                arrayList2.add(executableQuery2.mapper.invoke(androidCursor));
                while (((Boolean) androidCursor.next().value).booleanValue()) {
                    arrayList2.add(executableQuery2.mapper.invoke(androidCursor));
                }
                return new QueryResult.Value(arrayList2);
            default:
                QueryResult.Value next2 = androidCursor.next();
                ExecutableQuery executableQuery3 = this.f$0;
                Object obj3 = null;
                if (!((Boolean) next2.value).booleanValue()) {
                    return new QueryResult.Value(obj3);
                }
                Object invoke2 = executableQuery3.mapper.invoke(androidCursor);
                if (!((Boolean) androidCursor.next().value).booleanValue()) {
                    return new QueryResult.Value(invoke2);
                }
                Handlers$$ExternalSyntheticBUOutline0.m(executableQuery3, "ResultSet returned more than 1 row for ");
                return null;
        }
    }
}
