package com.squareup.cash.crypto.backend.roundups;

import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
import androidx.room.util.DBUtil;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.banking.real.RealDisclosureProvider$special$$inlined$map$1;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.crypto.backend.settings.RealBitcoinConfigRepo;
import com.squareup.cash.data.blockers.FlowStarter$$ExternalSyntheticLambda0;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda2;
import com.squareup.cash.data.db.RealAppConfigManager$cashLiteConfig$$inlined$map$1;
import com.squareup.cash.data.profile.RealProfileManager$setPhoto$2;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.InstrumentQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.entities.PaymentQueries;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$filter$1;
import com.squareup.protos.cash.investautomator.model.Automation;
import com.squareup.protos.cash.investautomator.model.Automation$AllocationStrategy$Type$RoundUp;
import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.protos.cash.papermate.enums.FeeType;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import java.io.Serializable;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealBitcoinRoundUpsRepo {
    public final RealBitcoinConfigRepo bitcoinConfigRepo;
    public final DerivedStateFlow bitcoinRoundUpsAvailability;
    public final ReadonlyStateFlow bitcoinRoundUpsUsageStats;
    public final PaymentQueries cashActivityQueries;
    public final CoroutineContext ioContext;

    public RealBitcoinRoundUpsRepo(SyncValueReader syncValueReader, AppConfigManager appConfigManager, CashAccountDatabaseImpl cashAccountDatabaseImpl, RealBitcoinConfigRepo realBitcoinConfigRepo, CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        this.bitcoinConfigRepo = realBitcoinConfigRepo;
        this.ioContext = coroutineContext;
        this.cashActivityQueries = cashAccountDatabaseImpl.cashActivityQueries;
        int i = 13;
        this.bitcoinRoundUpsAvailability = StateFlowKt.mapState(syncValueReader.getAllValues(AndroidSyncValueSpecs.InvestingAutomation), new FlowStarter$$ExternalSyntheticLambda0(i));
        RealAppConfigManager realAppConfigManager = (RealAppConfigManager) appConfigManager;
        InstrumentQueries instrumentQueries = realAppConfigManager.paymentHistoryConfigQueries;
        RealAppConfigManager$$ExternalSyntheticLambda2 realAppConfigManager$$ExternalSyntheticLambda2 = new RealAppConfigManager$$ExternalSyntheticLambda2(0);
        instrumentQueries.getClass();
        SqlDriver sqlDriver = instrumentQueries.driver;
        InstrumentQueries$$ExternalSyntheticLambda0 instrumentQueries$$ExternalSyntheticLambda0 = new InstrumentQueries$$ExternalSyntheticLambda0(18, realAppConfigManager$$ExternalSyntheticLambda2, instrumentQueries);
        sqlDriver.getClass();
        this.bitcoinRoundUpsUsageStats = FlowKt.stateIn(FlowKt.flowOn(new DataStoreImpl$data$1$invokeSuspend$$inlined$map$1(new RealGooglePayer$createWallet$$inlined$filter$1(FlowKt.distinctUntilChanged(new SafeFlow(new RealProfileManager$setPhoto$2(new RealAppConfigManager$cashLiteConfig$$inlined$map$1(new FinishSetupTileBadgeCounter(4, DBUtil.toFlow(new SimpleQuery(-367391598, new String[]{"paymentHistoryConfig"}, sqlDriver, "PaymentHistoryConfig.sq", "select", "SELECT paymentHistoryConfig.script_url, paymentHistoryConfig.search_url, paymentHistoryConfig.top_level_feed_payment_type_deny_list, paymentHistoryConfig.loyalty_merchant_hidden_payment_types, paymentHistoryConfig.automated_investment_payment_types\nFROM paymentHistoryConfig", instrumentQueries$$ExternalSyntheticLambda0)), realAppConfigManager.ioDispatcher), 6), (Continuation) null, this, i))), 5), 27), coroutineContext), coroutineScope, new StartedWhileSubscribed(0L, Long.MAX_VALUE), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable createActiveBitcoinAutomation(ContinuationImpl continuationImpl) {
        RealBitcoinRoundUpsRepo$createActiveBitcoinAutomation$1 realBitcoinRoundUpsRepo$createActiveBitcoinAutomation$1;
        int i;
        if (continuationImpl instanceof RealBitcoinRoundUpsRepo$createActiveBitcoinAutomation$1) {
            realBitcoinRoundUpsRepo$createActiveBitcoinAutomation$1 = (RealBitcoinRoundUpsRepo$createActiveBitcoinAutomation$1) continuationImpl;
            int i2 = realBitcoinRoundUpsRepo$createActiveBitcoinAutomation$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBitcoinRoundUpsRepo$createActiveBitcoinAutomation$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realBitcoinRoundUpsRepo$createActiveBitcoinAutomation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBitcoinRoundUpsRepo$createActiveBitcoinAutomation$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealDisclosureProvider$special$$inlined$map$1 realDisclosureProvider$special$$inlined$map$1 = this.bitcoinConfigRepo.bitcoinInvestmentEntityToken;
                    realBitcoinRoundUpsRepo$createActiveBitcoinAutomation$1.label = 1;
                    obj = FlowKt.first(realDisclosureProvider$special$$inlined$map$1, realBitcoinRoundUpsRepo$createActiveBitcoinAutomation$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                FeeType.Companion companion = Automation.AutomationStatus.Companion;
                RetailerType.Companion companion2 = Automation.AutomationTrigger.Companion;
                Automation.AllocationStrategy allocationStrategy = new Automation.AllocationStrategy(new Automation$AllocationStrategy$Type$RoundUp(new Automation.AllocationStrategy.RoundUp(new Integer(1))));
                ContactAliasType.Companion companion3 = Automation.AutomationTarget.Type.Companion;
                return new Automation(allocationStrategy, new Automation.AutomationTarget((String) obj));
            }
        }
        realBitcoinRoundUpsRepo$createActiveBitcoinAutomation$1 = new RealBitcoinRoundUpsRepo$createActiveBitcoinAutomation$1(this, continuationImpl);
        Object obj2 = realBitcoinRoundUpsRepo$createActiveBitcoinAutomation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBitcoinRoundUpsRepo$createActiveBitcoinAutomation$1.label;
        if (i != 0) {
        }
        FeeType.Companion companion4 = Automation.AutomationStatus.Companion;
        RetailerType.Companion companion22 = Automation.AutomationTrigger.Companion;
        Automation.AllocationStrategy allocationStrategy2 = new Automation.AllocationStrategy(new Automation$AllocationStrategy$Type$RoundUp(new Automation.AllocationStrategy.RoundUp(new Integer(1))));
        ContactAliasType.Companion companion32 = Automation.AutomationTarget.Type.Companion;
        return new Automation(allocationStrategy2, new Automation.AutomationTarget((String) obj2));
    }
}
