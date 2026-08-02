package com.squareup.cash.clientsync;

import androidx.room.TransactorKt;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.ExecutableQuery;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda1;
import com.squareup.cash.common.composeui.BadgedBoxKt$$ExternalSyntheticLambda0;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.SessionQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.InstrumentQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.contacts.ContactQueries$$ExternalSyntheticLambda1;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class SyncRangeQueries$DeleteAllQuery extends ExecutableQuery {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TransacterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SyncRangeQueries$DeleteAllQuery(TransacterImpl transacterImpl, Function1 function1, int i) {
        super(function1);
        this.$r8$classId = i;
        this.this$0 = transacterImpl;
    }

    @Override // app.cash.sqldelight.ExecutableQuery
    public final QueryResult execute(Function1 function1) {
        int i = this.$r8$classId;
        int i2 = 29;
        TransacterImpl transacterImpl = this.this$0;
        switch (i) {
            case 0:
                LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) transacterImpl;
                QueryResult queryResult = (QueryResult) TransactorKt.transactionWithResult$default(localTabContentQueries, new BadgedBoxKt$$ExternalSyntheticLambda0(4, localTabContentQueries, function1));
                localTabContentQueries.notifyQueries(27475432, new SyncRangeQueries$$ExternalSyntheticLambda1(15));
                return queryResult;
            case 1:
                LocalTabContentQueries localTabContentQueries2 = (LocalTabContentQueries) transacterImpl;
                QueryResult queryResult2 = (QueryResult) TransactorKt.transactionWithResult$default(localTabContentQueries2, new BorrowHomeKt$$ExternalSyntheticLambda1(i2, (Object) localTabContentQueries2, (Object) function1));
                localTabContentQueries2.notifyQueries(1892418216, new SyncRangeQueries$$ExternalSyntheticLambda1(12));
                return queryResult2;
            case 2:
                SessionQueries sessionQueries = (SessionQueries) transacterImpl;
                QueryResult queryResult3 = (QueryResult) TransactorKt.transactionWithResult$default(sessionQueries, new InstrumentQueries$$ExternalSyntheticLambda0(7, sessionQueries, function1));
                sessionQueries.notifyQueries(-32939414, new SessionQueries$$ExternalSyntheticLambda1(14, false));
                return queryResult3;
            case 3:
                InstrumentQueries instrumentQueries = (InstrumentQueries) transacterImpl;
                QueryResult queryResult4 = (QueryResult) TransactorKt.transactionWithResult$default(instrumentQueries, new InstrumentQueries$$ExternalSyntheticLambda0(28, instrumentQueries, function1));
                instrumentQueries.notifyQueries(-1113417694, new ContactQueries$$ExternalSyntheticLambda1(21));
                return queryResult4;
            default:
                InstrumentQueries instrumentQueries2 = (InstrumentQueries) transacterImpl;
                QueryResult queryResult5 = (QueryResult) TransactorKt.transactionWithResult$default(instrumentQueries2, new InstrumentQueries$$ExternalSyntheticLambda0(i2, instrumentQueries2, function1));
                instrumentQueries2.notifyQueries(-715077827, new ContactQueries$$ExternalSyntheticLambda1(29));
                return queryResult5;
        }
    }

    public final String toString() {
        switch (this.$r8$classId) {
            case 0:
                return "SyncRange.sq:deleteAll";
            case 1:
                return "SyncEntity.sq:deleteAll";
            case 2:
                return "StorageLink.sq:createOnboardingLink";
            case 3:
                return "EntityRanges.sq:deleteAll";
            default:
                return "SyncEntity.sq:deleteAll";
        }
    }
}
