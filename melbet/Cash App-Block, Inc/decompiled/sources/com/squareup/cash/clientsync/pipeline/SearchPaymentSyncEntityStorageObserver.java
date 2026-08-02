package com.squareup.cash.clientsync.pipeline;

import app.cash.local.db.LocalTabContentQueries;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda12;
import com.squareup.cash.clientsync.models.SyncEntity;
import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.clientsync.pipeline.DeleteEntity;
import com.squareup.cash.clientsync.pipeline.UpdateEntity;
import com.squareup.cash.clientsync.readers.AndroidSyncEntitySpecs$Payment$1;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.common.cashsearch.SearchExtensionsKt;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.common.SyncCustomer;
import com.squareup.protos.franklin.common.SyncPayment;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.protos.franklin.ui.UiPayment;
import com.squareup.util.coil.UtilsKt;
import com.squareup.util.compose.ListsKt;
import kotlin.collections.ArraysKt___ArraysKt;

/* loaded from: classes.dex */
public final class SearchPaymentSyncEntityStorageObserver extends SyncEntityStorageObserver {
    public final /* synthetic */ int $r8$classId;
    public final LocalTabContentQueries searchQueries;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchPaymentSyncEntityStorageObserver(CashAccountDatabaseImpl cashAccountDatabaseImpl, int i) {
        super(new AndroidSyncEntitySpecs$Payment$1[]{AndroidSyncValueSpecs.Payment, AndroidSyncValueSpecs.Transaction, AndroidSyncValueSpecs.Transfer, AndroidSyncValueSpecs.LoanActivity, AndroidSyncValueSpecs.SponsoredAccount}, 0);
        this.$r8$classId = i;
        switch (i) {
            case 1:
                super(new AndroidSyncEntitySpecs$Payment$1[]{AndroidSyncValueSpecs.Customer, AndroidSyncValueSpecs.Merchant}, 0);
                this.searchQueries = cashAccountDatabaseImpl.searchQueries;
                break;
            default:
                this.searchQueries = cashAccountDatabaseImpl.searchQueries;
                break;
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver, com.squareup.cash.clientsync.pipeline.ClientSyncStorageObserver.Typed
    public final void onAfterDeleteEntity(DeleteEntity.Result result) {
        int i = this.$r8$classId;
        LocalTabContentQueries localTabContentQueries = this.searchQueries;
        switch (i) {
            case 0:
                SyncEntity entity = result.getStorageOperation().getEntity();
                if (isEntitySupported(entity)) {
                    SearchExtensionsKt.delete(localTabContentQueries, entity.getEntityId(), ListsKt.access$toSearchEntityType(entity.getEntityType()));
                    break;
                }
                break;
            default:
                SyncEntity entity2 = result.getStorageOperation().getEntity();
                if (isEntitySupported(entity2)) {
                    SearchExtensionsKt.delete(localTabContentQueries, entity2.getEntityId(), UtilsKt.access$toSearchEntityType(entity2.getEntityType()));
                    break;
                }
                break;
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver, com.squareup.cash.clientsync.pipeline.ClientSyncStorageObserver.Typed
    public final void onAfterUpdateEntity(UpdateEntity.Result result) {
        switch (this.$r8$classId) {
            case 0:
                SyncEntity entity = result.getStorageOperation().getEntity();
                if (isEntitySupported(entity)) {
                    SyncPayment syncPayment = ((com.squareup.protos.franklin.common.SyncEntity) entity.getEntityProto()).payment;
                    syncPayment.getClass();
                    UiPayment uiPayment = syncPayment.payment;
                    uiPayment.getClass();
                    String str = uiPayment.note;
                    Money money = uiPayment.amount;
                    Long l = money != null ? money.amount : null;
                    boolean z = uiPayment.role == Role.SENDER;
                    String str2 = uiPayment.sender_id;
                    str2.getClass();
                    String str3 = uiPayment.recipient_id;
                    str3.getClass();
                    SearchExtensionsKt.insertPayment(this.searchQueries, str, l, z, str2, str3, ListsKt.access$toSearchEntityType(entity.getEntityType()), entity.getEntityId());
                    break;
                }
                break;
            default:
                SyncEntity entity2 = result.getStorageOperation().getEntity();
                if (isEntitySupported(entity2)) {
                    SyncCustomer syncCustomer = ((com.squareup.protos.franklin.common.SyncEntity) entity2.getEntityProto()).customer;
                    syncCustomer.getClass();
                    UiCustomer uiCustomer = syncCustomer.customer;
                    uiCustomer.getClass();
                    SearchExtensionsKt.insertCustomer(this.searchQueries, ArraysKt___ArraysKt.filterNotNull(new String[]{uiCustomer.email_address, uiCustomer.full_name, uiCustomer.sms_number, uiCustomer.cashtag}), entity2.getEntityId(), UtilsKt.access$toSearchEntityType(entity2.getEntityType()));
                    break;
                }
                break;
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver
    public final void onDeleteAllEntities() {
        switch (this.$r8$classId) {
            case 0:
                this.searchQueries.transactionWithWrapper(new CaptureCheckFaceKt$$ExternalSyntheticLambda12(this, 22));
                break;
            default:
                this.searchQueries.transactionWithWrapper(new CaptureCheckFaceKt$$ExternalSyntheticLambda12(this, 21));
                break;
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver
    public final void onDeleteEntity(String str, SyncEntityType syncEntityType) {
        int i = this.$r8$classId;
        str.getClass();
        syncEntityType.getClass();
    }

    @Override // com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver
    public final void onUpdateEntity(String str, SyncEntityType syncEntityType, Object obj) {
        switch (this.$r8$classId) {
            case 0:
                str.getClass();
                syncEntityType.getClass();
                ((SyncPayment) obj).getClass();
                break;
            default:
                str.getClass();
                syncEntityType.getClass();
                ((SyncCustomer) obj).getClass();
                break;
        }
    }
}
