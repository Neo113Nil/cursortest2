package com.squareup.cash.clientsync.pipeline;

import app.cash.sqldelight.TransacterImpl;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda3;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.InstrumentQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.education.stories.db.StoryQueries;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.investing.db.InvestmentHoldingQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.investing.db.categories.FilterGroupQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.primitives.FilterToken;
import com.squareup.cash.merchant.views.MerchantBlockingViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.offers.db.OffersSheetQueries$ForSheetKeyQuery;
import com.squareup.protos.franklin.common.SyncInvestmentFilterGroup;
import com.squareup.protos.franklin.common.SyncInvitation;
import com.squareup.protos.franklin.ui.UiInvitation;
import okio.ByteString;

/* loaded from: classes.dex */
public final class InvitationSyncEntityStorageObserver extends SyncEntityStorageObserver {
    public final /* synthetic */ int $r8$classId;
    public final TransacterImpl contactQueries;
    public final CashAccountDatabaseImpl database;
    public final TransacterImpl invitationEntityQueries;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvitationSyncEntityStorageObserver(CashAccountDatabaseImpl cashAccountDatabaseImpl, int i) {
        super(AndroidSyncValueSpecs.Invitation);
        this.$r8$classId = i;
        switch (i) {
            case 1:
                super(AndroidSyncValueSpecs.InvestmentFilterGroup);
                this.database = cashAccountDatabaseImpl;
                this.contactQueries = cashAccountDatabaseImpl.categoryInFilterGroupQueries;
                this.invitationEntityQueries = cashAccountDatabaseImpl.filterGroupQueries;
                break;
            default:
                this.database = cashAccountDatabaseImpl;
                this.contactQueries = cashAccountDatabaseImpl.contactQueries;
                this.invitationEntityQueries = cashAccountDatabaseImpl.invitationEntityQueries;
                break;
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver
    public final void onDeleteAllEntities() {
        switch (this.$r8$classId) {
            case 0:
                SessionQueries sessionQueries = (SessionQueries) this.invitationEntityQueries;
                sessionQueries.driver.execute(-1248338988, "DELETE FROM invitationEntity", null);
                sessionQueries.notifyQueries(-1248338988, new InstrumentQueries$$ExternalSyntheticLambda2(5, false));
                break;
            default:
                this.database.transactionWithWrapper(new GpsConfigQueries$$ExternalSyntheticLambda2(this, 18));
                break;
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver
    public final void onDeleteEntity(String str, SyncEntityType syncEntityType) {
        int i = this.$r8$classId;
        int i2 = 0;
        TransacterImpl transacterImpl = this.invitationEntityQueries;
        str.getClass();
        syncEntityType.getClass();
        switch (i) {
            case 0:
                SessionQueries sessionQueries = (SessionQueries) transacterImpl;
                sessionQueries.getClass();
                sessionQueries.driver.execute(2112913037, "DELETE FROM invitationEntity\nWHERE entity_id = ?", new BadgeKt$$ExternalSyntheticLambda3(str, 29));
                sessionQueries.notifyQueries(2112913037, new InstrumentQueries$$ExternalSyntheticLambda2(4, false));
                break;
            default:
                RewardSlotQueries rewardSlotQueries = (RewardSlotQueries) transacterImpl;
                rewardSlotQueries.getClass();
                FilterToken filterToken = (FilterToken) new OffersSheetQueries$ForSheetKeyQuery(rewardSlotQueries, str, new FilterGroupQueries$$ExternalSyntheticLambda0(rewardSlotQueries, i2)).executeAsOneOrNull();
                if (filterToken != null) {
                    ((StoryQueries) this.contactQueries).deleteForFilter(filterToken.getValue());
                    rewardSlotQueries.driver.execute(1410367599, "DELETE FROM filter_group\nWHERE token = ?", new MerchantBlockingViewKt$$ExternalSyntheticLambda15(19, rewardSlotQueries, filterToken));
                    rewardSlotQueries.notifyQueries(1410367599, new InvestmentHoldingQueries$$ExternalSyntheticLambda4(12));
                    break;
                }
                break;
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver
    public final void onUpdateEntity(String str, SyncEntityType syncEntityType, Object obj) {
        int i = this.$r8$classId;
        CashAccountDatabaseImpl cashAccountDatabaseImpl = this.database;
        switch (i) {
            case 0:
                SyncInvitation syncInvitation = (SyncInvitation) obj;
                str.getClass();
                syncEntityType.getClass();
                syncInvitation.getClass();
                UiInvitation uiInvitation = syncInvitation.invitation;
                uiInvitation.getClass();
                ByteString byteString = uiInvitation.hashed_alias;
                byteString.getClass();
                cashAccountDatabaseImpl.transactionWithWrapper(new CaptureCheckFaceKt$$ExternalSyntheticLambda11(19, this, str, byteString.hex()));
                break;
            default:
                SyncInvestmentFilterGroup syncInvestmentFilterGroup = (SyncInvestmentFilterGroup) obj;
                str.getClass();
                syncEntityType.getClass();
                syncInvestmentFilterGroup.getClass();
                cashAccountDatabaseImpl.transactionWithWrapper(new GpsConfigQueries$$ExternalSyntheticLambda3(17, this, syncInvestmentFilterGroup, str));
                break;
        }
    }
}
