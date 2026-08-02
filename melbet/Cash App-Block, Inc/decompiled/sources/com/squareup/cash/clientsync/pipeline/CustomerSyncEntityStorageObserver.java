package com.squareup.cash.clientsync.pipeline;

import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.clientsync.readers.AndroidSyncEntitySpecs$Payment$1;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.SyncDetailsQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.contacts.ContactQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.db.InvestmentEntityQueries;
import com.squareup.cash.investing.db.InvestmentEntityQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.db.InvestmentHoldingQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda3;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.recipients.data.RealCustomerStore;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.SyncCustomer;
import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import com.squareup.protos.franklin.ui.UiCustomer;
import java.util.Arrays;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class CustomerSyncEntityStorageObserver extends SyncEntityStorageObserver {
    public final /* synthetic */ int $r8$classId = 1;
    public final Object customerStore;

    public CustomerSyncEntityStorageObserver(RealCustomerStore realCustomerStore) {
        super(new AndroidSyncEntitySpecs$Payment$1[]{AndroidSyncValueSpecs.Customer, AndroidSyncValueSpecs.Merchant}, 1);
        this.customerStore = realCustomerStore;
    }

    @Override // com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver
    public final void onDeleteAllEntities() {
        int i = this.$r8$classId;
        Object obj = this.customerStore;
        switch (i) {
            case 0:
                RewardSlotQueries rewardSlotQueries = ((RealCustomerStore) obj).customerQueries;
                rewardSlotQueries.driver.execute(-1009329777, "DELETE FROM customer", null);
                rewardSlotQueries.notifyQueries(-1009329777, new ContactQueries$$ExternalSyntheticLambda1(7));
                break;
            default:
                InvestmentEntityQueries investmentEntityQueries = (InvestmentEntityQueries) obj;
                investmentEntityQueries.driver.execute(2108438945, "DELETE\nFROM investment_holding", null);
                investmentEntityQueries.notifyQueries(2108438945, new InvestmentHoldingQueries$$ExternalSyntheticLambda4(0));
                break;
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver
    public final void onDeleteEntity(String str, SyncEntityType syncEntityType, Object obj) {
        UiCustomer uiCustomer;
        String str2;
        String substring;
        int i = this.$r8$classId;
        Object obj2 = this.customerStore;
        switch (i) {
            case 0:
                SyncCustomer syncCustomer = (SyncCustomer) obj;
                str.getClass();
                syncEntityType.getClass();
                RealCustomerStore realCustomerStore = (RealCustomerStore) obj2;
                if (syncCustomer != null && (uiCustomer = syncCustomer.customer) != null && (str2 = uiCustomer.id) != null) {
                    str = str2;
                }
                realCustomerStore.getClass();
                RewardSlotQueries rewardSlotQueries = realCustomerStore.customerQueries;
                rewardSlotQueries.getClass();
                rewardSlotQueries.driver.execute(701408306, "DELETE FROM customer\nWHERE customer_id = ?", new SyncDetailsQueries$$ExternalSyntheticLambda2(str, 10));
                rewardSlotQueries.notifyQueries(701408306, new ContactQueries$$ExternalSyntheticLambda1(14));
                break;
            default:
                SyncInvestmentHolding syncInvestmentHolding = (SyncInvestmentHolding) obj;
                str.getClass();
                syncEntityType.getClass();
                InvestmentEntityQueries investmentEntityQueries = (InvestmentEntityQueries) obj2;
                if (syncInvestmentHolding == null || (substring = syncInvestmentHolding.investment_entity_token) == null) {
                    substring = str.substring(2);
                }
                investmentEntityQueries.getClass();
                investmentEntityQueries.driver.execute(972362416, "DELETE\nFROM investment_holding\nWHERE token = ?", new ClusterItemKt$$ExternalSyntheticLambda3(substring, 3));
                investmentEntityQueries.notifyQueries(972362416, new InvestmentEntityQueries$$ExternalSyntheticLambda1(28));
                break;
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver
    public final void onUpdateEntity(String str, SyncEntityType syncEntityType, Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.customerStore;
        switch (i) {
            case 0:
                SyncCustomer syncCustomer = (SyncCustomer) obj;
                str.getClass();
                syncEntityType.getClass();
                syncCustomer.getClass();
                UiCustomer uiCustomer = syncCustomer.customer;
                uiCustomer.getClass();
                if (uiCustomer.render_data == null) {
                    Timber.Forest.e(new IllegalArgumentException(String.format("Received null render data for customer %s", Arrays.copyOf(new Object[]{uiCustomer.id}, 1))));
                }
                RealCustomerStore realCustomerStore = (RealCustomerStore) obj2;
                realCustomerStore.getClass();
                realCustomerStore.customerQueries.transactionWithWrapper(new OpenSourceKt$$ExternalSyntheticLambda11(21, realCustomerStore, uiCustomer));
                break;
            default:
                SyncInvestmentHolding syncInvestmentHolding = (SyncInvestmentHolding) obj;
                str.getClass();
                syncEntityType.getClass();
                syncInvestmentHolding.getClass();
                InvestmentEntityQueries investmentEntityQueries = (InvestmentEntityQueries) obj2;
                String str2 = syncInvestmentHolding.investment_entity_token;
                str2.getClass();
                String str3 = syncInvestmentHolding.units;
                str3.getClass();
                Money money = syncInvestmentHolding.active_invested_amount;
                money.getClass();
                Long l = money.amount;
                l.getClass();
                long longValue = l.longValue();
                CurrencyCode currencyCode = money.currency_code;
                currencyCode.getClass();
                SyncInvestmentHolding.InvestmentHoldingState investmentHoldingState = syncInvestmentHolding.state;
                investmentHoldingState.getClass();
                investmentEntityQueries.insert(str2, str3, longValue, currencyCode, investmentHoldingState, syncInvestmentHolding.daily_gain_params, syncInvestmentHolding.average_cost);
                break;
        }
    }

    public CustomerSyncEntityStorageObserver(CashAccountDatabaseImpl cashAccountDatabaseImpl) {
        super(new AndroidSyncEntitySpecs$Payment$1[]{AndroidSyncValueSpecs.InvestmentHolding}, 1);
        this.customerStore = cashAccountDatabaseImpl.investmentHoldingQueries;
    }
}
