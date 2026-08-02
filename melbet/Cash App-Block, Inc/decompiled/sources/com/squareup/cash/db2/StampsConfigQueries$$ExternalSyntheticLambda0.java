package com.squareup.cash.db2;

import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.TransactionWrapper;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.driver.android.AndroidCursor;
import app.cash.sqldelight.driver.android.AndroidStatement;
import app.cash.zipline.loader.internal.cache.PinsQueries;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.data.contacts.RealContactSyncDetailsRepository;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db.WireRepeatedAdapter;
import com.squareup.cash.db2.OfflineConfig;
import com.squareup.cash.db2.activity.CashActivityQueries$ActivityQuery;
import com.squareup.cash.db2.activity.CashActivityQueries$CountActivityByRollupTypeQuery;
import com.squareup.cash.db2.activity.CashActivityQueries$CountActivityQuery;
import com.squareup.cash.db2.activity.InvestmentActivityQueries$entityColorForPayment$2;
import com.squareup.cash.db2.contacts.AliasQueries$CustomerIdForAliasQuery;
import com.squareup.cash.db2.contacts.ContactQueries;
import com.squareup.cash.db2.contacts.CustomerQueries$ForIdQuery;
import com.squareup.cash.payments.screens.InstrumentSelectionData;
import com.squareup.cash.payments.screens.PaymentInitiatorData;
import com.squareup.protos.franklin.api.Blockers;
import com.squareup.protos.franklin.common.ScenarioInitiatorType;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class StampsConfigQueries$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ StampsConfigQueries$$ExternalSyntheticLambda0(LocalTabContentQueries localTabContentQueries) {
        this.$r8$classId = 9;
        int i = CashLiteConfigQueries$select$2.$r8$clinit;
        this.f$1 = localTabContentQueries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v4, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v3, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v3, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v4, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v3, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v5, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v7, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v29, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v34, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v4, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v77, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v7, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r8v4, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v3, types: [byte[], java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        StatusResult statusResult;
        StatusResult statusResult2;
        StatusResult statusResult3;
        StatusResult statusResult4;
        StatusResult statusResult5;
        StatusResult statusResult6;
        StatusResult statusResult7;
        List list;
        StatusResult statusResult8;
        int i = this.$r8$classId;
        int i2 = 2;
        int i3 = 0;
        Object obj2 = this.f$1;
        switch (i) {
            case 0:
                int i4 = StampsConfigQueries$select$2.$r8$clinit;
                InstrumentQueries instrumentQueries = (InstrumentQueries) obj2;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                androidCursor.getClass();
                ?? bytes = androidCursor.getBytes(0);
                break;
            case 1:
                Blockers blockers = (Blockers) obj;
                blockers.getClass();
                break;
            case 2:
                Blockers blockers2 = (Blockers) obj;
                blockers2.getClass();
                break;
            case 3:
                BlockersData blockersData = (BlockersData) obj;
                blockersData.getClass();
                InstrumentSelectionData instrumentSelectionData = ((PaymentInitiatorData) obj2).selection;
                break;
            case 4:
                ScenarioInitiatorType scenarioInitiatorType = (ScenarioInitiatorType) obj2;
                BlockersData blockersData2 = (BlockersData) obj;
                blockersData2.getClass();
                break;
            case 5:
                ((TransactionWrapper) obj).getClass();
                SessionQueries sessionQueries = ((RealContactSyncDetailsRepository) obj2).syncDetailsQueries;
                sessionQueries.driver.execute(829306098, "DELETE FROM sync_details", null);
                sessionQueries.notifyQueries(829306098, new InstrumentQueries$$ExternalSyntheticLambda2(24, false));
                sessionQueries.driver.execute(429479430, "INSERT INTO sync_details DEFAULT VALUES", null);
                sessionQueries.notifyQueries(429479430, new InstrumentQueries$$ExternalSyntheticLambda2(25, false));
                break;
            case 6:
                SessionQueries sessionQueries2 = ((RealAppConfigManager) obj2).webLoginConfigQueries;
                sessionQueries2.driver.execute(488388376, "UPDATE webLoginConfig\nSET expires_at = 0", null);
                sessionQueries2.notifyQueries(488388376, new InstrumentQueries$$ExternalSyntheticLambda2(29, false));
                break;
            case 7:
                LocalDate localDate = (LocalDate) obj;
                localDate.getClass();
                break;
            case 8:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindString(0, (String) ((RewardQueries.ForIdsQuery) obj2).token);
                break;
            case 9:
                int i5 = CashLiteConfigQueries$select$2.$r8$clinit;
                LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) obj2;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                androidCursor2.getClass();
                ?? bytes2 = androidCursor2.getBytes(0);
                break;
            case 10:
                OfflineConfigQueries$select$2 offlineConfigQueries$select$2 = OfflineConfigQueries$select$2.INSTANCE;
                InstrumentQueries instrumentQueries2 = (InstrumentQueries) obj2;
                AndroidCursor androidCursor3 = (AndroidCursor) obj;
                androidCursor3.getClass();
                Boolean bool = androidCursor3.getBoolean(0);
                bool.getClass();
                String string2 = androidCursor3.getString(1);
                ?? bytes3 = androidCursor3.getBytes(2);
                StatusResult statusResult9 = bytes3 != 0 ? (StatusResult) ((WireAdapter) ((OfflineConfig.Adapter) instrumentQueries2.instrumentAdapter).attempted_payment_status_resultAdapter).decode(bytes3) : null;
                ?? bytes4 = androidCursor3.getBytes(3);
                StatusResult statusResult10 = bytes4 != 0 ? (StatusResult) ((WireAdapter) ((OfflineConfig.Adapter) instrumentQueries2.instrumentAdapter).offline_payment_status_resultAdapter).decode(bytes4) : null;
                ?? bytes5 = androidCursor3.getBytes(4);
                StatusResult statusResult11 = bytes5 != 0 ? (StatusResult) ((WireAdapter) ((OfflineConfig.Adapter) instrumentQueries2.instrumentAdapter).attempted_bill_status_resultAdapter).decode(bytes5) : null;
                ?? bytes6 = androidCursor3.getBytes(5);
                StatusResult statusResult12 = bytes6 != 0 ? (StatusResult) ((WireAdapter) ((OfflineConfig.Adapter) instrumentQueries2.instrumentAdapter).offline_bill_status_resultAdapter).decode(bytes6) : null;
                ?? bytes7 = androidCursor3.getBytes(6);
                StatusResult statusResult13 = bytes7 != 0 ? (StatusResult) ((WireAdapter) ((OfflineConfig.Adapter) instrumentQueries2.instrumentAdapter).attempted_cash_out_status_resultAdapter).decode(bytes7) : null;
                ?? bytes8 = androidCursor3.getBytes(7);
                StatusResult statusResult14 = bytes8 != 0 ? (StatusResult) ((WireAdapter) ((OfflineConfig.Adapter) instrumentQueries2.instrumentAdapter).offline_cash_out_status_resultAdapter).decode(bytes8) : null;
                ?? bytes9 = androidCursor3.getBytes(8);
                StatusResult statusResult15 = bytes9 != 0 ? (StatusResult) ((WireAdapter) ((OfflineConfig.Adapter) instrumentQueries2.instrumentAdapter).attempted_add_cash_status_resultAdapter).decode(bytes9) : null;
                ?? bytes10 = androidCursor3.getBytes(9);
                StatusResult statusResult16 = bytes10 != 0 ? (StatusResult) ((WireAdapter) ((OfflineConfig.Adapter) instrumentQueries2.instrumentAdapter).offline_add_cash_status_resultAdapter).decode(bytes10) : null;
                ?? bytes11 = androidCursor3.getBytes(10);
                List list2 = bytes11 != 0 ? (List) ((WireRepeatedAdapter) ((OfflineConfig.Adapter) instrumentQueries2.instrumentAdapter).retry_intervalsAdapter).decode(bytes11) : null;
                ?? bytes12 = androidCursor3.getBytes(11);
                if (bytes12 != 0) {
                    StatusResult statusResult17 = statusResult16;
                    statusResult4 = (StatusResult) ((WireAdapter) ((OfflineConfig.Adapter) instrumentQueries2.instrumentAdapter).error_cash_out_status_resultAdapter).decode(bytes12);
                    statusResult = statusResult12;
                    statusResult2 = statusResult14;
                    statusResult3 = statusResult17;
                } else {
                    statusResult = statusResult12;
                    statusResult2 = statusResult14;
                    statusResult3 = statusResult16;
                    statusResult4 = null;
                }
                ?? bytes13 = androidCursor3.getBytes(12);
                if (bytes13 != 0) {
                    List list3 = list2;
                    statusResult8 = (StatusResult) ((WireAdapter) ((OfflineConfig.Adapter) instrumentQueries2.instrumentAdapter).error_add_cash_status_resultAdapter).decode(bytes13);
                    statusResult5 = statusResult11;
                    statusResult6 = statusResult13;
                    statusResult7 = statusResult15;
                    list = list3;
                } else {
                    statusResult5 = statusResult11;
                    statusResult6 = statusResult13;
                    statusResult7 = statusResult15;
                    list = list2;
                    statusResult8 = null;
                }
                ?? bytes14 = androidCursor3.getBytes(13);
                StatusResult statusResult18 = statusResult5;
                ScenarioPlan scenarioPlan = bytes14 != 0 ? (ScenarioPlan) ((WireAdapter) ((OfflineConfig.Adapter) instrumentQueries2.instrumentAdapter).offline_transfer_scenario_planAdapter).decode(bytes14) : null;
                ?? bytes15 = androidCursor3.getBytes(14);
                break;
            case 11:
                InstrumentQueries instrumentQueries3 = (InstrumentQueries) obj2;
                ((TransactionWrapper) obj).getClass();
                instrumentQueries3.driver.execute(996829867, "DELETE FROM transfer_customer_ids", null);
                SqlDriver sqlDriver = instrumentQueries3.driver;
                sqlDriver.execute(996829868, "DELETE FROM banking_transaction_customer_ids", null);
                sqlDriver.execute(996829869, "DELETE FROM lending_transaction_customer_ids", null);
                break;
            case 12:
                AndroidCursor androidCursor4 = (AndroidCursor) obj;
                androidCursor4.getClass();
                break;
            case 13:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindString(0, (String) ((RewardQueries.ForIdsQuery) obj2).token);
                break;
            case 14:
                CashActivityQueries$ActivityQuery cashActivityQueries$ActivityQuery = (CashActivityQueries$ActivityQuery) obj2;
                AndroidStatement androidStatement3 = (AndroidStatement) obj;
                androidStatement3.getClass();
                androidStatement3.bindBoolean(0, Boolean.valueOf(cashActivityQueries$ActivityQuery.outstanding));
                androidStatement3.bindBoolean(1, Boolean.FALSE);
                Iterator it = cashActivityQueries$ActivityQuery.rollUpIgnoreList.iterator();
                while (it.hasNext()) {
                    androidStatement3.bindString(i2, (String) it.next());
                    i2++;
                }
                Iterator it2 = cashActivityQueries$ActivityQuery.paymentTypeIgnoreList.iterator();
                while (it2.hasNext()) {
                    androidStatement3.bindString(i2, (String) it2.next());
                    i2++;
                }
                androidStatement3.bindLong(i2, Long.valueOf(cashActivityQueries$ActivityQuery.limit));
                androidStatement3.bindLong(i2 + 1, Long.valueOf(cashActivityQueries$ActivityQuery.offset));
                break;
            case 15:
                PinsQueries.Get_pinQuery get_pinQuery = (PinsQueries.Get_pinQuery) obj2;
                AndroidStatement androidStatement4 = (AndroidStatement) obj;
                androidStatement4.getClass();
                Iterator it3 = ((Collection) get_pinQuery.application_name).iterator();
                while (it3.hasNext()) {
                    androidStatement4.bindString(i3, (String) it3.next());
                    i3++;
                }
                androidStatement4.bindLong(i3, Long.valueOf(get_pinQuery.file_id));
                androidStatement4.bindLong(i3 + 1, 0L);
                break;
            case 16:
                CashActivityQueries$CountActivityByRollupTypeQuery cashActivityQueries$CountActivityByRollupTypeQuery = (CashActivityQueries$CountActivityByRollupTypeQuery) obj2;
                AndroidStatement androidStatement5 = (AndroidStatement) obj;
                androidStatement5.getClass();
                androidStatement5.bindBoolean(0, Boolean.valueOf(cashActivityQueries$CountActivityByRollupTypeQuery.outstanding));
                androidStatement5.bindBoolean(1, Boolean.FALSE);
                Iterator it4 = cashActivityQueries$CountActivityByRollupTypeQuery.allowList.iterator();
                while (it4.hasNext()) {
                    androidStatement5.bindString(i2, (String) it4.next());
                    i2++;
                }
                break;
            case 17:
                CashActivityQueries$CountActivityQuery cashActivityQueries$CountActivityQuery = (CashActivityQueries$CountActivityQuery) obj2;
                AndroidStatement androidStatement6 = (AndroidStatement) obj;
                androidStatement6.getClass();
                androidStatement6.bindBoolean(0, Boolean.valueOf(cashActivityQueries$CountActivityQuery.outstanding));
                androidStatement6.bindBoolean(1, Boolean.FALSE);
                Iterator it5 = cashActivityQueries$CountActivityQuery.rollUpIgnoreList.iterator();
                while (it5.hasNext()) {
                    androidStatement6.bindString(i2, (String) it5.next());
                    i2++;
                }
                Iterator it6 = cashActivityQueries$CountActivityQuery.paymentTypeIgnoreList.iterator();
                while (it6.hasNext()) {
                    androidStatement6.bindString(i2, (String) it6.next());
                    i2++;
                }
                break;
            case 18:
                AndroidStatement androidStatement7 = (AndroidStatement) obj;
                androidStatement7.getClass();
                androidStatement7.bindString(0, (String) ((RewardQueries.ForIdsQuery) obj2).token);
                androidStatement7.bindBoolean(1, Boolean.FALSE);
                break;
            case 19:
                int i6 = InvestmentActivityQueries$entityColorForPayment$2.$r8$clinit;
                RewardSlotQueries rewardSlotQueries = (RewardSlotQueries) obj2;
                AndroidCursor androidCursor5 = (AndroidCursor) obj;
                androidCursor5.getClass();
                String string3 = androidCursor5.getString(0);
                ?? bytes16 = androidCursor5.getBytes(1);
                break;
            case 20:
                AndroidStatement androidStatement8 = (AndroidStatement) obj;
                androidStatement8.getClass();
                androidStatement8.bindString(0, (String) ((RewardQueries.ForIdsQuery) obj2).token);
                break;
            case 21:
                AndroidStatement androidStatement9 = (AndroidStatement) obj;
                androidStatement9.getClass();
                String str = ((AliasQueries$CustomerIdForAliasQuery) obj2).alias;
                androidStatement9.bindString(0, str);
                androidStatement9.bindString(1, str);
                break;
            case 22:
                AndroidStatement androidStatement10 = (AndroidStatement) obj;
                androidStatement10.getClass();
                androidStatement10.bindString(0, ((AliasQueries$CustomerIdForAliasQuery) obj2).alias);
                break;
            case 23:
                AndroidStatement androidStatement11 = (AndroidStatement) obj;
                androidStatement11.getClass();
                androidStatement11.bindString(0, ((ContactQueries.ContactByIdQuery) obj2).customerId);
                break;
            case 24:
                AndroidStatement androidStatement12 = (AndroidStatement) obj;
                androidStatement12.getClass();
                androidStatement12.bindString(0, ((ContactQueries.ContactByIdQuery) obj2).customerId);
                break;
            case 25:
                AndroidStatement androidStatement13 = (AndroidStatement) obj;
                androidStatement13.getClass();
                androidStatement13.bindString(0, ((CustomerQueries$ForIdQuery) obj2).customer_id);
                break;
            case 26:
                AndroidStatement androidStatement14 = (AndroidStatement) obj;
                androidStatement14.getClass();
                androidStatement14.bindString(0, ((CustomerQueries$ForIdQuery) obj2).customer_id);
                break;
            case 27:
                AndroidStatement androidStatement15 = (AndroidStatement) obj;
                androidStatement15.getClass();
                androidStatement15.bindString(0, ((CustomerQueries$ForIdQuery) obj2).customer_id);
                break;
            case 28:
                AndroidStatement androidStatement16 = (AndroidStatement) obj;
                androidStatement16.getClass();
                androidStatement16.bindString(0, ((CustomerQueries$ForIdQuery) obj2).customer_id);
                break;
            default:
                AndroidStatement androidStatement17 = (AndroidStatement) obj;
                androidStatement17.getClass();
                Iterator it7 = ((Collection) ((RewardQueries.ForIdsQuery) obj2).token).iterator();
                while (it7.hasNext()) {
                    androidStatement17.bindString(i3, (String) it7.next());
                    i3++;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ StampsConfigQueries$$ExternalSyntheticLambda0(RewardSlotQueries rewardSlotQueries) {
        this.$r8$classId = 19;
        int i = InvestmentActivityQueries$entityColorForPayment$2.$r8$clinit;
        this.f$1 = rewardSlotQueries;
    }

    public /* synthetic */ StampsConfigQueries$$ExternalSyntheticLambda0(InstrumentQueries instrumentQueries) {
        this.$r8$classId = 10;
        OfflineConfigQueries$select$2 offlineConfigQueries$select$2 = OfflineConfigQueries$select$2.INSTANCE;
        this.f$1 = instrumentQueries;
    }

    public /* synthetic */ StampsConfigQueries$$ExternalSyntheticLambda0(InstrumentQueries instrumentQueries, byte b) {
        this.$r8$classId = 0;
        int i = StampsConfigQueries$select$2.$r8$clinit;
        this.f$1 = instrumentQueries;
    }

    public /* synthetic */ StampsConfigQueries$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
    }
}
