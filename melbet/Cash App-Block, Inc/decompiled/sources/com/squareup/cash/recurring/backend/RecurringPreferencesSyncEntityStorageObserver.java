package com.squareup.cash.recurring.backend;

import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda8;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda8;
import com.squareup.cash.recurring.db.RecurringPreferenceQueries;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.SyncRecurringPreference;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;

/* loaded from: classes.dex */
public final class RecurringPreferencesSyncEntityStorageObserver extends SyncEntityStorageObserver {
    public final RecurringPreferenceQueries recurringPreferenceQueries;

    public RecurringPreferencesSyncEntityStorageObserver(CashAccountDatabaseImpl cashAccountDatabaseImpl) {
        super(AndroidSyncValueSpecs.RecurringPreferences);
        this.recurringPreferenceQueries = cashAccountDatabaseImpl.recurringPreferenceQueries;
    }

    @Override // com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver
    public final void onDeleteAllEntities() {
        RecurringPreferenceQueries recurringPreferenceQueries = this.recurringPreferenceQueries;
        recurringPreferenceQueries.driver.execute(189099081, "DELETE\nFROM recurring_preference", null);
        recurringPreferenceQueries.notifyQueries(189099081, new OpenSourceKt$$ExternalSyntheticLambda8(26));
    }

    @Override // com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver
    public final void onDeleteEntity(String str, SyncEntityType syncEntityType) {
        str.getClass();
        syncEntityType.getClass();
        RecurringPreferenceQueries recurringPreferenceQueries = this.recurringPreferenceQueries;
        recurringPreferenceQueries.getClass();
        recurringPreferenceQueries.driver.execute(1336461880, "DELETE\nFROM recurring_preference\nWHERE entity_id == ?", new OpenSourceKt$$ExternalSyntheticLambda11(22, recurringPreferenceQueries, str));
        recurringPreferenceQueries.notifyQueries(1336461880, new OpenSourceKt$$ExternalSyntheticLambda8(25));
    }

    @Override // com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver
    public final void onUpdateEntity(String str, SyncEntityType syncEntityType, Object obj) {
        SyncRecurringPreference syncRecurringPreference = (SyncRecurringPreference) obj;
        str.getClass();
        syncEntityType.getClass();
        syncRecurringPreference.getClass();
        ScheduledTransactionPreference scheduledTransactionPreference = syncRecurringPreference.preference;
        scheduledTransactionPreference.getClass();
        Boolean bool = scheduledTransactionPreference.enabled;
        bool.getClass();
        boolean booleanValue = bool.booleanValue();
        Money money = scheduledTransactionPreference.amount;
        money.getClass();
        RecurringSchedule recurringSchedule = scheduledTransactionPreference.recurring_schedule;
        recurringSchedule.getClass();
        ScheduledTransactionPreference.Type type2 = scheduledTransactionPreference.type;
        type2.getClass();
        Long l = scheduledTransactionPreference.next_reload_at;
        String str2 = scheduledTransactionPreference.investment_entity_token;
        RecurringPreferenceQueries recurringPreferenceQueries = this.recurringPreferenceQueries;
        recurringPreferenceQueries.getClass();
        recurringPreferenceQueries.driver.execute(917720747, "INSERT OR REPLACE INTO recurring_preference\nVALUES (?, ?, ?, ?, ?, ?, ?)", new InviteContactsBodyKt$$ExternalSyntheticLambda8(recurringPreferenceQueries, str, booleanValue, money, recurringSchedule, l, type2, str2));
        recurringPreferenceQueries.notifyQueries(917720747, new OpenSourceKt$$ExternalSyntheticLambda8(24));
    }
}
