package com.squareup.cash.db2.payment;

import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda12;
import com.squareup.cash.db2.InstrumentQueries;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class OfflineQueries$PendingQuery extends Query {
    public final /* synthetic */ int $r8$classId;
    public final long limit;
    public final long max_recipients;
    public final /* synthetic */ TransacterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineQueries$PendingQuery(RewardSlotQueries rewardSlotQueries, OfflineQueries$$ExternalSyntheticLambda0 offlineQueries$$ExternalSyntheticLambda0) {
        super(offlineQueries$$ExternalSyntheticLambda0);
        this.$r8$classId = 0;
        this.this$0 = rewardSlotQueries;
        this.max_recipients = 25L;
        this.limit = 25L;
    }

    @Override // app.cash.sqldelight.Query
    public final void addListener(Query.Listener listener) {
        int i = this.$r8$classId;
        TransacterImpl transacterImpl = this.this$0;
        switch (i) {
            case 0:
                ((RewardSlotQueries) transacterImpl).driver.addListener(new String[]{"pendingPayment", "payment", "instrumentLinkingConfig", "pendingTransfer"}, listener);
                break;
            case 1:
                ((LocalTabContentQueries) transacterImpl).driver.addListener(new String[]{"sync_entity"}, listener);
                break;
            default:
                ((InstrumentQueries) transacterImpl).driver.addListener(new String[]{"sync_entity"}, listener);
                break;
        }
    }

    @Override // app.cash.sqldelight.ExecutableQuery
    public final QueryResult execute(Function1 function1) {
        int i = this.$r8$classId;
        TransacterImpl transacterImpl = this.this$0;
        switch (i) {
            case 0:
                return ((RewardSlotQueries) transacterImpl).driver.executeQuery(789162278, "WITH RECURSIVE tally (recipient_index) AS (\n  SELECT 0 AS recipient_index\n  UNION ALL\n  SELECT recipient_index + 1 FROM tally WHERE recipient_index < ?\n)\nSELECT pending.external_id, pending.payment_request, pending.transfer_request, pending.created_at, pending.credit_card_fee_bps, pending.recipients, pending.pending_reason, recipient_index\nFROM pending\nJOIN tally ON tally.recipient_index < recipients\nORDER BY created_at DESC, recipient_index DESC\nLIMIT ?\nOFFSET ?", function1, 3, new OfflineQueries$$ExternalSyntheticLambda0(this, 11));
            case 1:
                return ((LocalTabContentQueries) transacterImpl).driver.executeQuery(535152055, "SELECT sync_entity.topic, sync_entity.entity_id, sync_entity.entity_type, sync_entity.entity_data, sync_entity.entity_version, sync_entity.value_type\nFROM sync_entity\nLIMIT ?\nOFFSET ?", function1, 2, new CaptureCheckFaceKt$$ExternalSyntheticLambda12(this, 16));
            default:
                return ((InstrumentQueries) transacterImpl).driver.executeQuery(-2072343988, "SELECT sync_entity.entity_id, sync_entity.type, sync_entity.entity, sync_entity.entity_processor_version, sync_entity.sync_value_type, sync_entity.sync_entity_version, sync_entity.topic\nFROM sync_entity\nLIMIT ?\nOFFSET ?", function1, 2, new OfflineQueries$$ExternalSyntheticLambda0(this, 7));
        }
    }

    @Override // app.cash.sqldelight.Query
    public final void removeListener(Query.Listener listener) {
        int i = this.$r8$classId;
        TransacterImpl transacterImpl = this.this$0;
        listener.getClass();
        switch (i) {
            case 0:
                ((RewardSlotQueries) transacterImpl).driver.removeListener(new String[]{"pendingPayment", "payment", "instrumentLinkingConfig", "pendingTransfer"}, listener);
                break;
            case 1:
                ((LocalTabContentQueries) transacterImpl).driver.removeListener(new String[]{"sync_entity"}, listener);
                break;
            default:
                ((InstrumentQueries) transacterImpl).driver.removeListener(new String[]{"sync_entity"}, listener);
                break;
        }
    }

    public final String toString() {
        switch (this.$r8$classId) {
        }
        return "SyncEntity.sq:selectAll";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OfflineQueries$PendingQuery(TransacterImpl transacterImpl, long j, Function1 function1, int i) {
        super(function1);
        this.$r8$classId = i;
        this.this$0 = transacterImpl;
        this.max_recipients = 100L;
        this.limit = j;
    }
}
