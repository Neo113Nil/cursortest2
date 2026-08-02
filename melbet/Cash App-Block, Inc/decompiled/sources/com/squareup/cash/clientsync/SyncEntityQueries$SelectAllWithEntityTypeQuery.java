package com.squareup.cash.clientsync;

import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.common.composeui.BadgedBoxKt$$ExternalSyntheticLambda0;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda1;
import java.util.Collection;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class SyncEntityQueries$SelectAllWithEntityTypeQuery extends Query {
    public final /* synthetic */ int $r8$classId = 0;
    public final Object entity_type;
    public final long limit;
    public final long offset;
    public final /* synthetic */ TransacterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncEntityQueries$SelectAllWithEntityTypeQuery(SessionQueries sessionQueries, long j, Collection collection, OfflineQueries$$ExternalSyntheticLambda1 offlineQueries$$ExternalSyntheticLambda1) {
        super(offlineQueries$$ExternalSyntheticLambda1);
        this.this$0 = sessionQueries;
        this.limit = j;
        this.entity_type = collection;
        this.offset = 50L;
    }

    @Override // app.cash.sqldelight.Query
    public final void addListener(Query.Listener listener) {
        int i = this.$r8$classId;
        TransacterImpl transacterImpl = this.this$0;
        switch (i) {
            case 0:
                ((LocalTabContentQueries) transacterImpl).driver.addListener(new String[]{"sync_entity"}, listener);
                break;
            default:
                ((SessionQueries) transacterImpl).driver.addListener(new String[]{"payment", "customer", "bitcoinTransactionCustomerIds", "loyaltyProgram", "contact", "alias", "contact_alias", "itemizedReceipt", "loyaltyHiddenPaymentTypes", "transfer_customer_ids", "banking_transaction_customer_ids", "lending_transaction_customer_ids", "referral_customer_ids"}, listener);
                break;
        }
    }

    @Override // app.cash.sqldelight.ExecutableQuery
    public final QueryResult execute(Function1 function1) {
        int i = this.$r8$classId;
        TransacterImpl transacterImpl = this.this$0;
        switch (i) {
            case 0:
                LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) transacterImpl;
                return localTabContentQueries.driver.executeQuery(-1380724550, "SELECT sync_entity.topic, sync_entity.entity_id, sync_entity.entity_type, sync_entity.entity_data, sync_entity.entity_version, sync_entity.value_type\nFROM sync_entity\nWHERE entity_type = ?\nLIMIT ?\nOFFSET ?", function1, 3, new BadgedBoxKt$$ExternalSyntheticLambda0(1, localTabContentQueries, this));
            default:
                SessionQueries sessionQueries = (SessionQueries) transacterImpl;
                Collection collection = (Collection) this.entity_type;
                int size = collection.size();
                sessionQueries.getClass();
                return sessionQueries.driver.executeQuery(null, re$$ExternalSyntheticOutline0.m("\n          |SELECT their_id\n          |FROM cashActivity\n          |WHERE display_date > ?\n          |AND is_hidden = 0\n          |AND their_id IN ", TransacterImpl.createArguments(size), "\n          |GROUP BY their_id\n          |ORDER BY count(*) DESC, display_name\n          |LIMIT ?\n          "), function1, collection.size() + 2, new OfflineQueries$$ExternalSyntheticLambda0(this, 8));
        }
    }

    @Override // app.cash.sqldelight.Query
    public final void removeListener(Query.Listener listener) {
        int i = this.$r8$classId;
        TransacterImpl transacterImpl = this.this$0;
        listener.getClass();
        switch (i) {
            case 0:
                ((LocalTabContentQueries) transacterImpl).driver.removeListener(new String[]{"sync_entity"}, listener);
                break;
            default:
                ((SessionQueries) transacterImpl).driver.removeListener(new String[]{"payment", "customer", "bitcoinTransactionCustomerIds", "loyaltyProgram", "contact", "alias", "contact_alias", "itemizedReceipt", "loyaltyHiddenPaymentTypes", "transfer_customer_ids", "banking_transaction_customer_ids", "lending_transaction_customer_ids", "referral_customer_ids"}, listener);
                break;
        }
    }

    public final String toString() {
        switch (this.$r8$classId) {
            case 0:
                return "SyncEntity.sq:selectAllWithEntityType";
            default:
                return "FavoriteRecipients.sq:selectFavoritesOrder";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncEntityQueries$SelectAllWithEntityTypeQuery(LocalTabContentQueries localTabContentQueries, SyncEntityType syncEntityType, long j, long j2, SyncEntityQueries$$ExternalSyntheticLambda0 syncEntityQueries$$ExternalSyntheticLambda0) {
        super(syncEntityQueries$$ExternalSyntheticLambda0);
        this.this$0 = localTabContentQueries;
        this.entity_type = syncEntityType;
        this.limit = j;
        this.offset = j2;
    }
}
