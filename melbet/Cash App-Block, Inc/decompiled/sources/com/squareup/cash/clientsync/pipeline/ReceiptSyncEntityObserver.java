package com.squareup.cash.clientsync.pipeline;

import app.cash.sqldelight.TransacterImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientsync.models.SyncEntity;
import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.clientsync.pipeline.UpdateEntity;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.BankingConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.SyncDetailsQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.db2.profile.documents.DocumentQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.security.PasswordInfoQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.maps.presenter.CashMapPresenter$$ExternalSyntheticLambda4;
import com.squareup.cash.ui.widget.keypad.KeypadViewKt$$ExternalSyntheticLambda0;
import com.squareup.protos.document.DocumentCategoryEntity;
import com.squareup.protos.document.DocumentEntity;
import com.squareup.protos.document.VersionData;
import com.squareup.protos.franklin.common.SyncLoyaltyProgram;
import com.squareup.protos.franklin.common.SyncReceiptEntity;
import com.squareup.protos.franklin.loyalty.LoyaltyProgram;
import com.squareup.protos.franklin.loyalty.LoyaltyUnit;
import com.squareup.protos.franklin.loyalty.ProgramRewards;
import com.squareup.protos.franklin.ui.UiItemizedReceipt;
import com.squareup.protos.franklin.ui.UiLoyaltyProgram;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class ReceiptSyncEntityObserver extends SyncEntityStorageObserver {
    public final /* synthetic */ int $r8$classId;
    public final TransacterImpl queries;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiptSyncEntityObserver(CashAccountDatabaseImpl cashAccountDatabaseImpl, int i) {
        super(AndroidSyncValueSpecs.ReceiptEntity);
        this.$r8$classId = i;
        switch (i) {
            case 1:
                super(AndroidSyncValueSpecs.DocumentCategoryEntity);
                this.queries = cashAccountDatabaseImpl.documentCategoryQueries;
                break;
            case 2:
                super(AndroidSyncValueSpecs.DocumentEntity);
                this.queries = cashAccountDatabaseImpl.documentQueries;
                break;
            case 3:
                super(AndroidSyncValueSpecs.LoyaltyProgram);
                this.queries = cashAccountDatabaseImpl.loyaltyProgramQueries;
                break;
            default:
                this.queries = cashAccountDatabaseImpl.itemizedReceiptQueries;
                break;
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver, com.squareup.cash.clientsync.pipeline.ClientSyncStorageObserver.Typed
    public void onAfterUpdateEntity(UpdateEntity.Result result) {
        int i = this.$r8$classId;
        TransacterImpl transacterImpl = this.queries;
        switch (i) {
            case 1:
                SyncEntity entity = result.getStorageOperation().getEntity();
                if (isEntitySupported(entity)) {
                    com.squareup.protos.franklin.common.SyncEntity syncEntity = (com.squareup.protos.franklin.common.SyncEntity) entity.getEntityProto();
                    syncEntity.getClass();
                    DocumentCategoryEntity documentCategoryEntity = syncEntity.document_category_entity;
                    documentCategoryEntity.getClass();
                    InstrumentQueries instrumentQueries = (InstrumentQueries) transacterImpl;
                    String entityId = entity.getEntityId();
                    String str = documentCategoryEntity.category;
                    str.getClass();
                    String str2 = documentCategoryEntity.parent_category;
                    str2.getClass();
                    String str3 = documentCategoryEntity.display_name;
                    str3.getClass();
                    Integer num = documentCategoryEntity.order;
                    Long l = ((com.squareup.protos.franklin.common.SyncEntity) entity.getEntityProto()).display_date;
                    DocumentCategoryEntity.RenderStyle renderStyle = documentCategoryEntity.render_style;
                    VersionData versionData = documentCategoryEntity.version_data;
                    instrumentQueries.getClass();
                    entityId.getClass();
                    instrumentQueries.driver.execute(-797570861, "INSERT OR REPLACE INTO documentCategory\nVALUES (?, ?, ?, ?, ?, ?, ?, ?)", new KeypadViewKt$$ExternalSyntheticLambda0(entityId, str, str2, str3, num, l, renderStyle, versionData, instrumentQueries));
                    instrumentQueries.notifyQueries(-797570861, new ProfileQueries$$ExternalSyntheticLambda4(21));
                    break;
                }
                break;
            case 2:
                SyncEntity entity2 = result.getStorageOperation().getEntity();
                if (isEntitySupported(entity2)) {
                    com.squareup.protos.franklin.common.SyncEntity syncEntity2 = (com.squareup.protos.franklin.common.SyncEntity) entity2.getEntityProto();
                    syncEntity2.getClass();
                    DocumentEntity documentEntity = syncEntity2.document_entity;
                    documentEntity.getClass();
                    InstrumentQueries instrumentQueries2 = (InstrumentQueries) transacterImpl;
                    String entityId2 = entity2.getEntityId();
                    String str4 = documentEntity.token;
                    str4.getClass();
                    String str5 = documentEntity.category;
                    str5.getClass();
                    String str6 = documentEntity.title;
                    str6.getClass();
                    Long l2 = ((com.squareup.protos.franklin.common.SyncEntity) entity2.getEntityProto()).display_date;
                    String str7 = documentEntity.client_route;
                    String str8 = documentEntity.url;
                    VersionData versionData2 = documentEntity.version_data;
                    String str9 = documentEntity.owner_token;
                    instrumentQueries2.getClass();
                    entityId2.getClass();
                    instrumentQueries2.driver.execute(1687905077, "INSERT OR REPLACE INTO document\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)", new DocumentQueries$$ExternalSyntheticLambda0(entityId2, str4, str5, str6, l2, str7, str8, versionData2, str9, instrumentQueries2));
                    instrumentQueries2.notifyQueries(1687905077, new ProfileQueries$$ExternalSyntheticLambda4(24));
                    break;
                }
                break;
            default:
                super.onAfterUpdateEntity(result);
                break;
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver
    public final void onDeleteAllEntities() {
        int i = this.$r8$classId;
        TransacterImpl transacterImpl = this.queries;
        switch (i) {
            case 0:
                SessionQueries sessionQueries = (SessionQueries) transacterImpl;
                sessionQueries.driver.execute(-1611816346, "DELETE FROM itemizedReceipt", null);
                sessionQueries.notifyQueries(-1611816346, new PasswordInfoQueries$$ExternalSyntheticLambda0(2));
                break;
            case 1:
                InstrumentQueries instrumentQueries = (InstrumentQueries) transacterImpl;
                instrumentQueries.driver.execute(-648617060, "DELETE FROM documentCategory", null);
                instrumentQueries.notifyQueries(-648617060, new ProfileQueries$$ExternalSyntheticLambda4(20));
                break;
            case 2:
                InstrumentQueries instrumentQueries2 = (InstrumentQueries) transacterImpl;
                instrumentQueries2.driver.execute(-1071131142, "DELETE FROM document", null);
                instrumentQueries2.notifyQueries(-1071131142, new ProfileQueries$$ExternalSyntheticLambda4(26));
                break;
            default:
                InstrumentQueries instrumentQueries3 = (InstrumentQueries) transacterImpl;
                instrumentQueries3.driver.execute(1420796138, "DELETE FROM loyaltyProgram", null);
                instrumentQueries3.notifyQueries(1420796138, new OfflineQueries$$ExternalSyntheticLambda1(4));
                break;
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver
    public final void onDeleteEntity(String str, SyncEntityType syncEntityType) {
        int i = this.$r8$classId;
        int i2 = 3;
        TransacterImpl transacterImpl = this.queries;
        str.getClass();
        syncEntityType.getClass();
        switch (i) {
            case 0:
                Timber.Forest.d("Deleting receipt with token ".concat(str), new Object[0]);
                SessionQueries sessionQueries = (SessionQueries) transacterImpl;
                sessionQueries.getClass();
                sessionQueries.driver.execute(467737127, "DELETE FROM itemizedReceipt\nWHERE token = ?", new SyncDetailsQueries$$ExternalSyntheticLambda2(str, 21));
                sessionQueries.notifyQueries(467737127, new PasswordInfoQueries$$ExternalSyntheticLambda0(i2));
                break;
            case 1:
                InstrumentQueries instrumentQueries = (InstrumentQueries) transacterImpl;
                instrumentQueries.getClass();
                instrumentQueries.driver.execute(-252389566, "DELETE FROM documentCategory\nWHERE entity_id = ?", new SyncDetailsQueries$$ExternalSyntheticLambda2(str, 19));
                instrumentQueries.notifyQueries(-252389566, new ProfileQueries$$ExternalSyntheticLambda4(22));
                break;
            case 2:
                InstrumentQueries instrumentQueries2 = (InstrumentQueries) transacterImpl;
                instrumentQueries2.getClass();
                instrumentQueries2.driver.execute(701795232, "DELETE FROM document\nWHERE entity_id = ?", new SyncDetailsQueries$$ExternalSyntheticLambda2(str, 20));
                instrumentQueries2.notifyQueries(701795232, new ProfileQueries$$ExternalSyntheticLambda4(25));
                break;
            default:
                InstrumentQueries instrumentQueries3 = (InstrumentQueries) transacterImpl;
                instrumentQueries3.getClass();
                instrumentQueries3.driver.execute(-409796403, "DELETE FROM loyaltyProgram\nWHERE program_id = ?", new SyncDetailsQueries$$ExternalSyntheticLambda2(str, 13));
                instrumentQueries3.notifyQueries(-409796403, new OfflineQueries$$ExternalSyntheticLambda1(3));
                break;
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver
    public final void onUpdateEntity(String str, SyncEntityType syncEntityType, Object obj) {
        int i = this.$r8$classId;
        TransacterImpl transacterImpl = this.queries;
        switch (i) {
            case 0:
                SyncReceiptEntity syncReceiptEntity = (SyncReceiptEntity) obj;
                str.getClass();
                syncEntityType.getClass();
                syncReceiptEntity.getClass();
                Timber.Forest.d("Putting receipt with token ".concat(str), new Object[0]);
                UiItemizedReceipt uiItemizedReceipt = syncReceiptEntity.receipt;
                uiItemizedReceipt.getClass();
                String str2 = uiItemizedReceipt.transaction_token;
                String str3 = uiItemizedReceipt.render_json;
                if (str2 == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Attempted to put receipt with null transaction token");
                    break;
                } else if (str3 == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Attempted to put receipt with null render JSON");
                    break;
                } else {
                    ((SessionQueries) transacterImpl).transactionWithWrapper(new BankingConfigQueries$$ExternalSyntheticLambda0((Object) this, str2, str, str3, 4));
                    break;
                }
            case 1:
                str.getClass();
                syncEntityType.getClass();
                ((DocumentCategoryEntity) obj).getClass();
                break;
            case 2:
                str.getClass();
                syncEntityType.getClass();
                ((DocumentEntity) obj).getClass();
                break;
            default:
                SyncLoyaltyProgram syncLoyaltyProgram = (SyncLoyaltyProgram) obj;
                str.getClass();
                syncEntityType.getClass();
                syncLoyaltyProgram.getClass();
                InstrumentQueries instrumentQueries = (InstrumentQueries) transacterImpl;
                UiLoyaltyProgram uiLoyaltyProgram = syncLoyaltyProgram.loyalty_program;
                uiLoyaltyProgram.getClass();
                LoyaltyProgram loyaltyProgram = uiLoyaltyProgram.loyalty_program;
                loyaltyProgram.getClass();
                String str4 = loyaltyProgram.cash_merchant_token;
                str4.getClass();
                loyaltyProgram.getClass();
                ProgramRewards programRewards = loyaltyProgram.program_rewards;
                programRewards.getClass();
                LoyaltyUnit loyaltyUnit = loyaltyProgram.loyalty_unit;
                loyaltyUnit.getClass();
                String str5 = loyaltyProgram.render_json;
                String str6 = loyaltyProgram.program_description;
                String str7 = loyaltyProgram.deep_link_token;
                instrumentQueries.getClass();
                instrumentQueries.driver.execute(608877695, "INSERT OR REPLACE INTO loyaltyProgram\nVALUES (?,?,?,?,?,?,?)", new CashMapPresenter$$ExternalSyntheticLambda4(str, str4, instrumentQueries, programRewards, loyaltyUnit, str5, str6, str7, 2));
                instrumentQueries.notifyQueries(608877695, new OfflineQueries$$ExternalSyntheticLambda1(2));
                break;
        }
    }
}
