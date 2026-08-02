package com.squareup.cash.history.backend.real;

import app.cash.sqldelight.TransacterImpl;
import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.SyncDetailsQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.contacts.ContactQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.contacts.LoyaltyAccountQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.db2.profile.documents.DocumentQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda3;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda3;
import com.squareup.preferences.BooleanPreference;
import com.squareup.protos.franklin.common.SyncBusinessGrant;
import com.squareup.protos.franklin.common.SyncLoyaltyAccount;
import com.squareup.protos.franklin.ui.UiLoyaltyAccount;

/* loaded from: classes.dex */
public final class LoyaltyAccountSyncEntityStorageObserver extends SyncEntityStorageObserver {
    public final /* synthetic */ int $r8$classId = 0;
    public final Object errorReporter;
    public final TransacterImpl loyaltyAccountQueries;

    public LoyaltyAccountSyncEntityStorageObserver(ErrorReporter errorReporter, CashAccountDatabaseImpl cashAccountDatabaseImpl) {
        super(AndroidSyncValueSpecs.LoyaltyAccount);
        this.errorReporter = errorReporter;
        this.loyaltyAccountQueries = cashAccountDatabaseImpl.loyaltyAccountQueries;
    }

    @Override // com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver
    public final void onDeleteAllEntities() {
        int i = this.$r8$classId;
        TransacterImpl transacterImpl = this.loyaltyAccountQueries;
        switch (i) {
            case 0:
                SessionQueries sessionQueries = (SessionQueries) transacterImpl;
                sessionQueries.driver.execute(-99200698, "DELETE FROM loyaltyAccount", null);
                sessionQueries.notifyQueries(-99200698, new ContactQueries$$ExternalSyntheticLambda1(16));
                break;
            default:
                GpsConfigQueries gpsConfigQueries = (GpsConfigQueries) transacterImpl;
                gpsConfigQueries.driver.execute(-1852766527, "DELETE\nFROM businessGrants", null);
                gpsConfigQueries.notifyQueries(-1852766527, new PoolDetailsViewKt$$ExternalSyntheticLambda3(16));
                break;
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver
    public final void onDeleteEntity(String str, SyncEntityType syncEntityType) {
        int i = this.$r8$classId;
        TransacterImpl transacterImpl = this.loyaltyAccountQueries;
        str.getClass();
        syncEntityType.getClass();
        switch (i) {
            case 0:
                SessionQueries sessionQueries = (SessionQueries) transacterImpl;
                sessionQueries.getClass();
                sessionQueries.driver.execute(-837875159, "DELETE FROM loyaltyAccount\nWHERE account_id = ?", new SyncDetailsQueries$$ExternalSyntheticLambda2(str, 11));
                sessionQueries.notifyQueries(-837875159, new ContactQueries$$ExternalSyntheticLambda1(15));
                break;
            default:
                GpsConfigQueries gpsConfigQueries = (GpsConfigQueries) transacterImpl;
                gpsConfigQueries.getClass();
                gpsConfigQueries.driver.execute(1907510500, "DELETE FROM businessGrants\nWHERE id = ?", new ClusterItemKt$$ExternalSyntheticLambda3(str, 28));
                gpsConfigQueries.notifyQueries(1907510500, new PoolDetailsViewKt$$ExternalSyntheticLambda3(15));
                break;
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver
    public final void onUpdateEntity(String str, SyncEntityType syncEntityType, Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.errorReporter;
        TransacterImpl transacterImpl = this.loyaltyAccountQueries;
        switch (i) {
            case 0:
                SyncLoyaltyAccount syncLoyaltyAccount = (SyncLoyaltyAccount) obj;
                str.getClass();
                syncEntityType.getClass();
                syncLoyaltyAccount.getClass();
                UiLoyaltyAccount uiLoyaltyAccount = syncLoyaltyAccount.loyalty_account;
                uiLoyaltyAccount.getClass();
                String str2 = uiLoyaltyAccount.phone_number;
                if (str2 == null) {
                    ((ErrorReporter) obj2).report(new LoyaltyAccountMissingFieldError(), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                }
                SessionQueries sessionQueries = (SessionQueries) transacterImpl;
                if (str2 == null) {
                    str2 = "";
                }
                Long l = uiLoyaltyAccount.points_earned;
                l.getClass();
                long longValue = l.longValue();
                Long l2 = uiLoyaltyAccount.last_time_visited;
                l2.getClass();
                long longValue2 = l2.longValue();
                String str3 = uiLoyaltyAccount.account_status_url;
                String str4 = uiLoyaltyAccount.loyalty_program_id;
                str4.getClass();
                sessionQueries.getClass();
                sessionQueries.driver.execute(180798939, "INSERT OR REPLACE INTO loyaltyAccount\nVALUES (?,?,?,?,?,?)", new LoyaltyAccountQueries$$ExternalSyntheticLambda3(str, str2, longValue, longValue2, str3, str4));
                sessionQueries.notifyQueries(180798939, new ContactQueries$$ExternalSyntheticLambda1(17));
                break;
            default:
                SyncBusinessGrant syncBusinessGrant = (SyncBusinessGrant) obj;
                str.getClass();
                syncEntityType.getClass();
                syncBusinessGrant.getClass();
                GpsConfigQueries gpsConfigQueries = (GpsConfigQueries) transacterImpl;
                String str5 = syncBusinessGrant.merchant_id;
                Long l3 = syncBusinessGrant.updated_at;
                Long l4 = syncBusinessGrant.created_at;
                Long l5 = syncBusinessGrant.expires_at;
                String str6 = syncBusinessGrant.client_id;
                SyncBusinessGrant.ActionType actionType = syncBusinessGrant.action_type;
                String str7 = syncBusinessGrant.account_reference_id;
                SyncBusinessGrant.RenderingBehavior renderingBehavior = syncBusinessGrant.rendering_behavior;
                gpsConfigQueries.getClass();
                gpsConfigQueries.driver.execute(-625328178, "INSERT OR REPLACE\nINTO businessGrants\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)", new DocumentQueries$$ExternalSyntheticLambda0(str, str5, l3, l4, l5, str6, actionType, str7, renderingBehavior, gpsConfigQueries));
                gpsConfigQueries.notifyQueries(-625328178, new PoolDetailsViewKt$$ExternalSyntheticLambda3(17));
                ((BooleanPreference) obj2).set(true);
                break;
        }
    }

    public LoyaltyAccountSyncEntityStorageObserver(BooleanPreference booleanPreference, CashAccountDatabaseImpl cashAccountDatabaseImpl) {
        super(AndroidSyncValueSpecs.BusinessGrant);
        this.errorReporter = booleanPreference;
        this.loyaltyAccountQueries = cashAccountDatabaseImpl.businessGrantsQueries;
    }
}
