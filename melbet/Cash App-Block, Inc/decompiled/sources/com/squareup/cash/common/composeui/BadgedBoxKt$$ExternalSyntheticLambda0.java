package com.squareup.cash.common.composeui;

import android.content.Context;
import android.util.JsonWriter;
import androidx.compose.material.SliderKt$$ExternalSyntheticLambda3;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.core.app.NotificationManagerCompat;
import app.cash.api.ApiResult;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.TransactionWrapper;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda25;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda5;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaad;
import com.google.crypto.tink.KeysetHandle;
import com.google.mlkit.common.internal.zzb;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda3;
import com.squareup.cash.badging.db.BadgeQueries$VersionQuery;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.boost.db.Reward$Adapter;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda7;
import com.squareup.cash.clientsync.SyncEntityQueries$SelectAllWithEntityTypeQuery;
import com.squareup.cash.clientsync.SyncRangeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.clientsync.errors.RealClientSyncErrorReporter;
import com.squareup.cash.clientsync.errors.StorageOperationErrorMetadata;
import com.squareup.cash.clientsync.errors.StorageOperationPersistenceFailure;
import com.squareup.cash.clientsync.errors.SyncEntityShadowDivergence;
import com.squareup.cash.clientsync.errors.SyncEntityShadowException;
import com.squareup.cash.clientsync.models.SyncEntity;
import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.clientsync.models.SyncValueType;
import com.squareup.cash.clientsync.persistence.ShadowedSyncEntityStore;
import com.squareup.cash.clientsync.persistence.ShadowedSyncRangeStore;
import com.squareup.cash.clientsync.persistence.SyncEntityStore;
import com.squareup.cash.clientsync.persistence.SyncRangeStore;
import com.squareup.cash.clientsync.pipeline.ClientSyncStorageObserver;
import com.squareup.cash.clientsync.pipeline.DeleteAllRangesAndEntities;
import com.squareup.cash.clientsync.pipeline.DeleteEntity;
import com.squareup.cash.clientsync.pipeline.RealClientSyncStorageOperationBatchExecutor;
import com.squareup.cash.clientsync.pipeline.ReplaceRanges;
import com.squareup.cash.clientsync.pipeline.StorageOperation;
import com.squareup.cash.clientsync.pipeline.StorageOperationBatch;
import com.squareup.cash.clientsync.pipeline.UpdateEntity;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.composeUi.foundation.text.LinkTapDetectorState;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.data.profile.RealContactAliasFetcher;
import com.squareup.cash.data.profile.RealCustomerLimitsManager;
import com.squareup.cash.data.profile.RealDemandDepositAccountManager;
import com.squareup.cash.data.profile.RealProfileSyncer;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.SessionQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db.SessionQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda13;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db.WireRepeatedAdapter;
import com.squareup.cash.db2.BankingConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.InstrumentQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.InstrumentQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.OfflineConfig;
import com.squareup.cash.db2.SyncDetailsQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.TreehouseAppConfigQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.db2.WebLoginConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.WebLoginConfigQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.profile.ScenarioPlan;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda2;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.marketcapabilities.RealMarketCapabilitiesDataManager;
import com.squareup.cash.marketcapabilities.RealMarketCapabilitiesValidator;
import com.squareup.cash.merchant.views.MerchantBlockingViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.observability.types.MetadataSection$TreehouseSection;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.widget.BadgedLayout;
import com.squareup.protos.cash.janus.api.ContactAlias;
import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.protos.cash.janus.api.GetContactAliasesResponse;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CountryText;
import com.squareup.protos.franklin.api.SharingContent;
import com.squareup.protos.franklin.api.SupportConfig;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.app.BankingConfig;
import com.squareup.protos.franklin.app.CashLiteConfig;
import com.squareup.protos.franklin.app.GetAppConfigResponse;
import com.squareup.protos.franklin.app.GetEffectiveCustomerLimitsResponse;
import com.squareup.protos.franklin.app.ReactionConfig;
import com.squareup.protos.franklin.bankbook.InstitutionsConfig;
import com.squareup.protos.franklin.common.BalanceData;
import com.squareup.protos.franklin.common.BlockersConfig;
import com.squareup.protos.franklin.common.ClientRoutingConfig;
import com.squareup.protos.franklin.common.CryptocurrencyConfig;
import com.squareup.protos.franklin.common.DirectDepositAccount;
import com.squareup.protos.franklin.common.EnableCryptocurrencyTransferInStatus;
import com.squareup.protos.franklin.common.EnableCryptocurrencyTransferOutStatus;
import com.squareup.protos.franklin.common.InstrumentLinkingConfig;
import com.squareup.protos.franklin.common.LimitedAction;
import com.squareup.protos.franklin.common.LocalizationConfig;
import com.squareup.protos.franklin.common.MarketCapabilitiesConfig;
import com.squareup.protos.franklin.common.OfflineConfig;
import com.squareup.protos.franklin.common.PaymentHistoryConfig;
import com.squareup.protos.franklin.common.RecipientConfig;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.ScheduledReloadData;
import com.squareup.protos.franklin.common.StampsConfig;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.SuggestedRecipientsData;
import com.squareup.protos.franklin.common.TreehouseConfig;
import com.squareup.protos.franklin.common.WebLoginConfig;
import com.squareup.protos.franklin.common.scenarios.BankAccountLinkingConfig;
import com.squareup.protos.franklin.common.scenarios.InvitationConfig;
import com.squareup.util.android.Intents;
import com.squareup.util.android.Keyboards;
import com.squareup.util.cash.ProtoDefaults;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.Clock;
import kotlin.time.Instant;

/* loaded from: classes6.dex */
public final /* synthetic */ class BadgedBoxKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ BadgedBoxKt$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    private final Object invoke$com$squareup$cash$data$db$RealAppConfigManager$$ExternalSyntheticLambda4(Object obj) {
        List<TreehouseConfig.TreehouseApp> list;
        List split$default;
        Object obj2;
        RealAppConfigManager realAppConfigManager = (RealAppConfigManager) this.f$0;
        GetAppConfigResponse getAppConfigResponse = (GetAppConfigResponse) this.f$1;
        TransactionWrapper transactionWrapper = (TransactionWrapper) obj;
        transactionWrapper.getClass();
        ArcadeModal$$ExternalSyntheticLambda2 arcadeModal$$ExternalSyntheticLambda2 = new ArcadeModal$$ExternalSyntheticLambda2(realAppConfigManager, 2);
        AndroidSqliteDriver.Transaction transaction = transactionWrapper.transaction;
        if (transaction.ownerThreadId != Thread.currentThread().getId()) {
            a$$ExternalSyntheticBUOutline0.m$1("Transaction objects (`TransactionWithReturn` and `TransactionWithoutReturn`) must be used\nonly within the transaction lambda scope.");
            return null;
        }
        transaction.postCommitHooks.add(arcadeModal$$ExternalSyntheticLambda2);
        realAppConfigManager.invitationConfigQueries.transactionWithWrapper(new BadgedBoxKt$$ExternalSyntheticLambda0(24, getAppConfigResponse.invitation_config, realAppConfigManager));
        realAppConfigManager.recipientConfigQueries.transactionWithWrapper(new BadgedBoxKt$$ExternalSyntheticLambda0(20, getAppConfigResponse.recipient_config, realAppConfigManager));
        realAppConfigManager.institutionsConfigQueries.transactionWithWrapper(new BadgedBoxKt$$ExternalSyntheticLambda0(25, getAppConfigResponse.institutions_config, realAppConfigManager));
        BlockersConfig blockersConfig = getAppConfigResponse.blockers_config;
        int i = 18;
        boolean z = false;
        if (blockersConfig != null) {
            LocalTabContentQueries localTabContentQueries = realAppConfigManager.blockersConfigQueries;
            Boolean bool = blockersConfig.address_typeahead_enabled;
            localTabContentQueries.driver.execute(-1314594198, "UPDATE blockersConfig\nSET address_typeahead_enabled = ?,\n    add_cash_header_text = ?,\n    target_balance_amount = ?", new BankingConfigQueries$$ExternalSyntheticLambda0(8, Boolean.valueOf(bool != null ? bool.booleanValue() : false), blockersConfig.target_balance_amount, localTabContentQueries, blockersConfig.add_cash_header_text));
            localTabContentQueries.notifyQueries(-1314594198, new SessionQueries$$ExternalSyntheticLambda1(i, z));
        }
        realAppConfigManager.cryptocurrencyConfigQueries.transactionWithWrapper(new BadgedBoxKt$$ExternalSyntheticLambda0(i, getAppConfigResponse.cryptocurrency_config, realAppConfigManager));
        InstrumentLinkingConfig instrumentLinkingConfig = getAppConfigResponse.instrument_linking_config;
        if (instrumentLinkingConfig != null) {
            final InstrumentQueries instrumentQueries = realAppConfigManager.instrumentLinkingConfigQueries;
            final String str = instrumentLinkingConfig.instrument_header_no_instrument_linked;
            final String str2 = instrumentLinkingConfig.instrument_description_no_instrument_linked;
            final String str3 = instrumentLinkingConfig.instrument_header_bank_account_linked;
            final String str4 = instrumentLinkingConfig.instrument_description_bank_account_linked;
            final String str5 = instrumentLinkingConfig.instrument_header_no_instrument_linked_personal;
            final String str6 = instrumentLinkingConfig.instrument_description_no_instrument_linked_personal;
            final Long l = instrumentLinkingConfig.credit_card_fee_bps;
            final Boolean bool2 = instrumentLinkingConfig.credit_card_linking_enabled;
            final Integer num = instrumentLinkingConfig.max_credit_card_prompts;
            final Boolean bool3 = instrumentLinkingConfig.cash_balance_enabled;
            final Boolean bool4 = instrumentLinkingConfig.issued_cards_enabled;
            final Boolean bool5 = instrumentLinkingConfig.bankbook_enabled;
            final InstrumentLinkingConfig.IssuedCardDisabledStyle issuedCardDisabledStyle = instrumentLinkingConfig.issued_card_disabled_style;
            final Boolean bool6 = instrumentLinkingConfig.physical_issued_cards_enabled;
            final Boolean bool7 = instrumentLinkingConfig.nfc_card_linking_enabled;
            final BankAccountLinkingConfig bankAccountLinkingConfig = instrumentLinkingConfig.bank_account_linking_config;
            instrumentQueries.driver.execute(913522114, "UPDATE instrumentLinkingConfig\nSET header_no_instrument_linked = ?,\n    description_no_instrument_linked = ?,\n    header_bank_account_linked = ?,\n    description_bank_account_linked = ?,\n    header_no_instrument_linked_personal = ?,\n    description_no_instrument_linked_personal = ?,\n    credit_card_fee_bps = ?,\n    credit_card_linking_enabled = ?,\n    max_credit_prompts = ?,\n    cash_balance_enabled = ?,\n    issued_cards_enabled = ?,\n    bankbook_enabled = ?,\n    issued_card_disabled_style = ?,\n    physical_issued_cards_enabled = ?,\n    nfc_card_linking_enabled = ?,\n    bank_account_linking_config = ?", new Function1() { // from class: com.squareup.cash.db2.InstrumentLinkingConfigQueries$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    Long l2;
                    AndroidStatement androidStatement = (AndroidStatement) obj3;
                    Request$Priority$EnumUnboxingLocalUtility.m(androidStatement, 0, str, 1, str2);
                    androidStatement.bindString(2, str3);
                    androidStatement.bindString(3, str4);
                    androidStatement.bindString(4, str5);
                    androidStatement.bindString(5, str6);
                    androidStatement.bindLong(6, l);
                    androidStatement.bindBoolean(7, bool2);
                    Integer num2 = num;
                    InstrumentQueries instrumentQueries2 = instrumentQueries;
                    if (num2 != null) {
                        int intValue = num2.intValue();
                        ((ScenarioPlan.Adapter) instrumentQueries2.instrumentAdapter).getClass();
                        l2 = Long.valueOf(intValue);
                    } else {
                        l2 = null;
                    }
                    androidStatement.bindLong(8, l2);
                    androidStatement.bindBoolean(9, bool3);
                    androidStatement.bindBoolean(10, bool4);
                    androidStatement.bindBoolean(11, bool5);
                    InstrumentLinkingConfig.IssuedCardDisabledStyle issuedCardDisabledStyle2 = issuedCardDisabledStyle;
                    androidStatement.bindString(12, issuedCardDisabledStyle2 != null ? (String) ((ScenarioPlan.Adapter) instrumentQueries2.instrumentAdapter).client_scenarioAdapter.encode(issuedCardDisabledStyle2) : null);
                    androidStatement.bindBoolean(13, bool6);
                    androidStatement.bindBoolean(14, bool7);
                    BankAccountLinkingConfig bankAccountLinkingConfig2 = bankAccountLinkingConfig;
                    androidStatement.bindBytes(15, bankAccountLinkingConfig2 != null ? (byte[]) ((ScenarioPlan.Adapter) instrumentQueries2.instrumentAdapter).scenario_planAdapter.encode(bankAccountLinkingConfig2) : null);
                    return Unit.INSTANCE;
                }
            });
            instrumentQueries.notifyQueries(913522114, new InstrumentQueries$$ExternalSyntheticLambda2(2, false));
        }
        realAppConfigManager.offlineConfigQueries.transactionWithWrapper(new BadgedBoxKt$$ExternalSyntheticLambda0(17, getAppConfigResponse.offline_config, realAppConfigManager));
        int i2 = 15;
        realAppConfigManager.paymentHistoryConfigQueries.transactionWithWrapper(new BadgedBoxKt$$ExternalSyntheticLambda0(i2, getAppConfigResponse.payment_history_config, realAppConfigManager));
        realAppConfigManager.stampsConfigQueries.transactionWithWrapper(new BadgedBoxKt$$ExternalSyntheticLambda0(19, getAppConfigResponse.stamps_config, realAppConfigManager));
        realAppConfigManager.supportConfigQueries.transactionWithWrapper(new BadgedBoxKt$$ExternalSyntheticLambda0(21, getAppConfigResponse.support_config, realAppConfigManager));
        realAppConfigManager.webLoginConfigQueries.transactionWithWrapper(new BadgedBoxKt$$ExternalSyntheticLambda0(22, getAppConfigResponse.web_login_config, realAppConfigManager));
        realAppConfigManager.reactionConfigQueries.transactionWithWrapper(new BadgedBoxKt$$ExternalSyntheticLambda0(16, getAppConfigResponse.reaction_config, realAppConfigManager));
        BankingConfig bankingConfig = getAppConfigResponse.banking_config;
        if (bankingConfig != null) {
            BankingConfig.Strings strings = bankingConfig.strings;
            LocalTabContentQueries localTabContentQueries2 = realAppConfigManager.bankingConfigQueries;
            strings.getClass();
            localTabContentQueries2.driver.execute(1896709671, "UPDATE bankingConfig\nSET main_screen_title = ?,\n    main_screen_balance_subtitle = ?,\n    recurring_deposits_dda_upsell = ?", new BankingConfigQueries$$ExternalSyntheticLambda0(strings.main_screen_title, strings.main_screen_balance_subtitle, bankingConfig.recurring_deposits_dda_upsell, localTabContentQueries2, 0));
            localTabContentQueries2.notifyQueries(1896709671, new SessionQueries$$ExternalSyntheticLambda1(i2, false));
        }
        TreehouseConfig treehouseConfig = getAppConfigResponse.treehouse_config;
        SessionQueries sessionQueries = realAppConfigManager.treehouseAppConfigQueries;
        int i3 = 28;
        int i4 = 6;
        if (treehouseConfig != null && (list = treehouseConfig.apps) != null) {
            sessionQueries.driver.execute(-2076853713, "DELETE FROM treehouseAppConfig", null);
            sessionQueries.notifyQueries(-2076853713, new InstrumentQueries$$ExternalSyntheticLambda2(27, false));
            for (TreehouseConfig.TreehouseApp treehouseApp : list) {
                String str7 = treehouseApp.app_name;
                String str8 = treehouseApp.manifestURL;
                sessionQueries.driver.execute(-1254493408, "INSERT INTO treehouseAppConfig(app_name, path, url, minimal_commit_timestamp)\nVALUES (?, ?, ?, ?)", new TreehouseAppConfigQueries$$ExternalSyntheticLambda3(str7, 0, treehouseApp.path, str8, treehouseApp.minimal_commit_timestamp));
                sessionQueries.notifyQueries(-1254493408, new InstrumentQueries$$ExternalSyntheticLambda2(28, false));
                String path = new URL(str8).getPath();
                path.getClass();
                split$default = StringsKt__StringsKt.split$default(path, new String[]{"/"}, false, 0, 6, null);
                Iterator it = split$default.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (((String) obj2).length() >= 40) {
                        break;
                    }
                }
                String str9 = (String) obj2;
                String substring = str9 != null ? StringsKt.substring(str9, new IntRange(0, 6, 1)) : "unknown";
                String str10 = treehouseApp.app_name;
                if (str10 != null) {
                    realAppConfigManager.bugsnagClient.addMetadata(MetadataSection$TreehouseSection.INSTANCE, new MetadataSection$TreehouseSection.VersionKey(str10), substring);
                    realAppConfigManager.observabilityManager.addCustomAttributeToRumMonitoring(CollectionsKt__CollectionsJVMKt.listOf(new Pair(new MetadataSection$TreehouseSection.VersionKey(str10), substring)));
                }
            }
        }
        MarketCapabilitiesConfig marketCapabilitiesConfig = getAppConfigResponse.market_capabilities_config;
        RealMarketCapabilitiesDataManager realMarketCapabilitiesDataManager = realAppConfigManager.marketCapabilitiesDataManager;
        List list2 = marketCapabilitiesConfig != null ? marketCapabilitiesConfig.capabilities : null;
        if ((list2 != null ? RealMarketCapabilitiesValidator.validateClientMarketCapabilities(zzaad.convertAndFilterKnownValues(list2)) : false) && list2 != null) {
            GpsConfigQueries gpsConfigQueries = realMarketCapabilitiesDataManager.dataSource.marketCapabilitiesConfigQueries;
            gpsConfigQueries.getClass();
            gpsConfigQueries.driver.execute(1072617956, "INSERT OR REPLACE INTO marketCapabilitiesConfig\nVALUES(\"market_capabilities_config\", ?)", new MerchantBlockingViewKt$$ExternalSyntheticLambda15(29, gpsConfigQueries, list2));
            gpsConfigQueries.notifyQueries(1072617956, new CashMapViewKt$$ExternalSyntheticLambda0(i4));
        }
        ClientRoutingConfig clientRoutingConfig = getAppConfigResponse.client_routing_config;
        if (clientRoutingConfig != null) {
            LocalTabContentQueries localTabContentQueries3 = realAppConfigManager.clientRouteConfigQueries;
            localTabContentQueries3.driver.execute(1583388796, "UPDATE clientRoutingConfig\nSET client_route_rules = ?,\n    deep_link_rules = ?", new CaptureCheckFaceKt$$ExternalSyntheticLambda11(26, clientRoutingConfig.client_routes, clientRoutingConfig.deep_links, localTabContentQueries3));
            localTabContentQueries3.notifyQueries(1583388796, new SessionQueries$$ExternalSyntheticLambda1(20, false));
        }
        LocalizationConfig localizationConfig = getAppConfigResponse.localization_config;
        GpsConfigQueries gpsConfigQueries2 = realAppConfigManager.localizationConfigQueries;
        gpsConfigQueries2.driver.execute(-2134856661, "UPDATE localizationConfig SET config = ?", new MerchantBlockingViewKt$$ExternalSyntheticLambda15(i3, localizationConfig, gpsConfigQueries2));
        gpsConfigQueries2.notifyQueries(-2134856661, new CashMapViewKt$$ExternalSyntheticLambda0(3));
        CashLiteConfig cashLiteConfig = getAppConfigResponse.cash_lite_config;
        LocalTabContentQueries localTabContentQueries4 = realAppConfigManager.cashLiteConfigQueries;
        localTabContentQueries4.driver.execute(545440562, "UPDATE cashLiteConfig SET config = ?", new InstrumentQueries$$ExternalSyntheticLambda0(9, cashLiteConfig, localTabContentQueries4));
        localTabContentQueries4.notifyQueries(545440562, new SessionQueries$$ExternalSyntheticLambda1(19, false));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:228:0x0854, code lost:
    
        if ((r1 ^ r7) >= 0) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0880, code lost:
    
        if ((r1 ^ r7) >= 0) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02a0, code lost:
    
        if (r0 == null) goto L61;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Long l;
        long j;
        long j2;
        StorageOperation.Result result;
        AnnotatedString.Range range;
        InstrumentQueries instrumentQueries;
        String str;
        int i = this.$r8$classId;
        int i2 = 12;
        int i3 = 14;
        int i4 = 20;
        int i5 = 22;
        int i6 = 17;
        int i7 = 2;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                BadgedLayout badgedLayout = new BadgedLayout(context, (RealImageLoader) obj3);
                ComposeView composeView = new ComposeView(context, null, 0, 6, null);
                composeView.setContent((ComposableLambdaImpl) obj2);
                badgedLayout.addView(composeView);
                return badgedLayout;
            case 1:
                SyncEntityQueries$SelectAllWithEntityTypeQuery syncEntityQueries$SelectAllWithEntityTypeQuery = (SyncEntityQueries$SelectAllWithEntityTypeQuery) obj2;
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                ((zzb) ((LocalTabContentQueries) obj3).local_tab_contentAdapter).getClass();
                ((SyncEntityType) syncEntityQueries$SelectAllWithEntityTypeQuery.entity_type).getClass();
                androidStatement.bindLong(0, Long.valueOf(r1.value));
                androidStatement.bindLong(1, Long.valueOf(syncEntityQueries$SelectAllWithEntityTypeQuery.limit));
                androidStatement.bindLong(2, Long.valueOf(syncEntityQueries$SelectAllWithEntityTypeQuery.offset));
                return Unit.INSTANCE;
            case 2:
                LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) obj2;
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                if (((SyncValueType) ((RewardQueries.ForIdsQuery) obj3).token) != null) {
                    ((zzb) localTabContentQueries.local_tab_contentAdapter).getClass();
                    l = Long.valueOf(r1.value);
                } else {
                    l = null;
                }
                androidStatement2.bindLong(0, l);
                return Unit.INSTANCE;
            case 3:
                BadgeQueries$VersionQuery badgeQueries$VersionQuery = (BadgeQueries$VersionQuery) obj3;
                AndroidStatement androidStatement3 = (AndroidStatement) obj;
                androidStatement3.getClass();
                androidStatement3.bindString(0, (String) badgeQueries$VersionQuery.external_token);
                ((zzb) ((LocalTabContentQueries) obj2).local_tab_contentAdapter).getClass();
                ((SyncEntityType) badgeQueries$VersionQuery.item_type).getClass();
                androidStatement3.bindLong(1, Long.valueOf(r1.value));
                return Unit.INSTANCE;
            case 4:
                LocalTabContentQueries localTabContentQueries2 = (LocalTabContentQueries) obj3;
                ((TransactionWrapper) obj).getClass();
                localTabContentQueries2.driver.execute(634089369, "DELETE FROM sync_range", null);
                return localTabContentQueries2.driver.executeQuery(634089370, "SELECT changes()", (Function1) obj2, 0, null);
            case 5:
                ShadowedSyncEntityStore shadowedSyncEntityStore = (ShadowedSyncEntityStore) obj3;
                SyncEntityType syncEntityType = (SyncEntityType) obj2;
                SyncEntityStore syncEntityStore = shadowedSyncEntityStore.mainStore;
                RealClientSyncErrorReporter realClientSyncErrorReporter = shadowedSyncEntityStore.errorReporter;
                SyncEntityStore syncEntityStore2 = shadowedSyncEntityStore.shadowStore;
                List allEntitiesOfType = syncEntityStore.getAllEntitiesOfType(syncEntityType);
                try {
                    List allEntitiesOfType2 = syncEntityStore2.getAllEntitiesOfType(syncEntityType);
                    Set set = CollectionsKt.toSet(allEntitiesOfType);
                    Set set2 = CollectionsKt.toSet(allEntitiesOfType2);
                    if (!Intrinsics.areEqual(set, set2)) {
                        int i8 = SyncEntityShadowDivergence.$r8$clinit;
                        Map mapOf = MapsKt__MapsKt.mapOf(new Pair("entityType", String.valueOf(syncEntityType.value)), new Pair("limit", String.valueOf(Integer.MAX_VALUE)), new Pair("offset", String.valueOf(0)));
                        Class<?> cls = syncEntityStore.getClass();
                        ReflectionFactory reflectionFactory = Reflection.factory;
                        realClientSyncErrorReporter.reportNonFatal(Intents.create("getAllEntitiesOfType", mapOf, reflectionFactory.getOrCreateKotlinClass(cls), reflectionFactory.getOrCreateKotlinClass(syncEntityStore2.getClass()), set, set2));
                    }
                } catch (Throwable th) {
                    int i9 = SyncEntityShadowException.$r8$clinit;
                    Class<?> cls2 = syncEntityStore.getClass();
                    ReflectionFactory reflectionFactory2 = Reflection.factory;
                    realClientSyncErrorReporter.reportNonFatal(Keyboards.create("There was an exception in getAllEntitiesOfType", th, reflectionFactory2.getOrCreateKotlinClass(cls2), reflectionFactory2.getOrCreateKotlinClass(syncEntityStore2.getClass())));
                }
                return allEntitiesOfType;
            case 6:
                ShadowedSyncEntityStore shadowedSyncEntityStore2 = (ShadowedSyncEntityStore) obj3;
                SyncEntity syncEntity = (SyncEntity) obj2;
                SyncEntityStore syncEntityStore3 = shadowedSyncEntityStore2.mainStore;
                SyncEntityStore syncEntityStore4 = shadowedSyncEntityStore2.shadowStore;
                syncEntityStore3.insertEntity(syncEntity);
                try {
                    syncEntityStore4.insertEntity(syncEntity);
                } catch (Throwable th2) {
                    RealClientSyncErrorReporter realClientSyncErrorReporter2 = shadowedSyncEntityStore2.errorReporter;
                    int i10 = SyncEntityShadowException.$r8$clinit;
                    Class<?> cls3 = syncEntityStore3.getClass();
                    ReflectionFactory reflectionFactory3 = Reflection.factory;
                    realClientSyncErrorReporter2.reportNonFatal(Keyboards.create("There was an exception in insertEntity", th2, reflectionFactory3.getOrCreateKotlinClass(cls3), reflectionFactory3.getOrCreateKotlinClass(syncEntityStore4.getClass())));
                }
                return Unit.INSTANCE;
            case 7:
                ShadowedSyncEntityStore shadowedSyncEntityStore3 = (ShadowedSyncEntityStore) obj3;
                SyncValueType syncValueType = (SyncValueType) obj2;
                SyncEntityStore syncEntityStore5 = shadowedSyncEntityStore3.mainStore;
                RealClientSyncErrorReporter realClientSyncErrorReporter3 = shadowedSyncEntityStore3.errorReporter;
                SyncEntityStore syncEntityStore6 = shadowedSyncEntityStore3.shadowStore;
                List allValuesOfType = syncEntityStore5.getAllValuesOfType(syncValueType);
                try {
                    List allValuesOfType2 = syncEntityStore6.getAllValuesOfType(syncValueType);
                    Set set3 = CollectionsKt.toSet(allValuesOfType);
                    Set set4 = CollectionsKt.toSet(allValuesOfType2);
                    if (!Intrinsics.areEqual(set3, set4)) {
                        int i11 = SyncEntityShadowDivergence.$r8$clinit;
                        Map mapOf2 = MapsKt__MapsJVMKt.mapOf(new Pair("valueType", String.valueOf(syncValueType.value)));
                        Class<?> cls4 = syncEntityStore5.getClass();
                        ReflectionFactory reflectionFactory4 = Reflection.factory;
                        realClientSyncErrorReporter3.reportNonFatal(Intents.create("getAllValuesOfType", mapOf2, reflectionFactory4.getOrCreateKotlinClass(cls4), reflectionFactory4.getOrCreateKotlinClass(syncEntityStore6.getClass()), set3, set4));
                    }
                } catch (Throwable th3) {
                    int i12 = SyncEntityShadowException.$r8$clinit;
                    Class<?> cls5 = syncEntityStore5.getClass();
                    ReflectionFactory reflectionFactory5 = Reflection.factory;
                    realClientSyncErrorReporter3.reportNonFatal(Keyboards.create("There was an exception in getAllValuesOfType", th3, reflectionFactory5.getOrCreateKotlinClass(cls5), reflectionFactory5.getOrCreateKotlinClass(syncEntityStore6.getClass())));
                }
                return allValuesOfType;
            case 8:
                ShadowedSyncEntityStore shadowedSyncEntityStore4 = (ShadowedSyncEntityStore) obj2;
                SyncEntityStore syncEntityStore7 = shadowedSyncEntityStore4.mainStore;
                SyncEntityStore syncEntityStore8 = shadowedSyncEntityStore4.shadowStore;
                ((Ref$LongRef) obj3).element = syncEntityStore7.deleteAllEntities();
                try {
                    syncEntityStore8.deleteAllEntities();
                } catch (Throwable th4) {
                    RealClientSyncErrorReporter realClientSyncErrorReporter4 = shadowedSyncEntityStore4.errorReporter;
                    int i13 = SyncEntityShadowException.$r8$clinit;
                    Class<?> cls6 = syncEntityStore7.getClass();
                    ReflectionFactory reflectionFactory6 = Reflection.factory;
                    realClientSyncErrorReporter4.reportNonFatal(Keyboards.create("There was an exception in deleteAllEntities", th4, reflectionFactory6.getOrCreateKotlinClass(cls6), reflectionFactory6.getOrCreateKotlinClass(syncEntityStore8.getClass())));
                }
                return Unit.INSTANCE;
            case 9:
                ShadowedSyncRangeStore shadowedSyncRangeStore = (ShadowedSyncRangeStore) obj3;
                int i14 = shadowedSyncRangeStore.operationIdGenerator;
                shadowedSyncRangeStore.operationIdGenerator = i14 + 1;
                shadowedSyncRangeStore.audit(i14, "deleteAllRanges:before");
                ((Ref$LongRef) obj2).element = shadowedSyncRangeStore.mainStore.deleteAllRanges();
                try {
                    shadowedSyncRangeStore.shadowStore.deleteAllRanges();
                } catch (Throwable th5) {
                    shadowedSyncRangeStore.reportError("There was an error while trying to perform deleteAllRanges.", th5);
                }
                shadowedSyncRangeStore.audit(i14, "deleteAllRanges:after");
                return Unit.INSTANCE;
            case 10:
                KeysetHandle keysetHandle = (KeysetHandle) obj3;
                String str2 = (String) obj2;
                ((TransactionWrapper) obj).getClass();
                SessionQueries sessionQueries = (SessionQueries) keysetHandle.annotationsMap;
                Instant now = ((Clock) keysetHandle.entries).now();
                int i15 = now.nanosecondsOfSecond;
                long j3 = now.epochSeconds;
                long j4 = 1000;
                if (j3 >= 0) {
                    j = Long.MAX_VALUE;
                    if (j3 != 1) {
                        if (j3 != 0) {
                            long j5 = j3 * 1000;
                            if (j5 / 1000 == j3) {
                                j4 = j5;
                            }
                        } else {
                            j4 = 0;
                        }
                    }
                    long j6 = i15 / 1000000;
                    j2 = j4 + j6;
                    if ((j4 ^ j2) < 0) {
                        break;
                    }
                    j = j2;
                } else {
                    long j7 = j3 + 1;
                    j = Long.MIN_VALUE;
                    if (j7 != 1) {
                        if (j7 != 0) {
                            long j8 = j7 * 1000;
                            if (j8 / 1000 == j7) {
                                j4 = j8;
                            }
                        } else {
                            j4 = 0;
                        }
                    }
                    long j9 = (i15 / 1000000) + NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
                    j2 = j4 + j9;
                    if ((j4 ^ j2) < 0) {
                        break;
                    }
                    j = j2;
                }
                sessionQueries.getClass();
                sessionQueries.driver.execute(-811492498, "INSERT OR REPLACE INTO audit_log_entry (row_id, timestamp_ms, message)\nVALUES (NULL, ?, ?)", new StorageLinkQueries$$ExternalSyntheticLambda13(j, str2, 3));
                sessionQueries.notifyQueries(-811492498, new SyncRangeQueries$$ExternalSyntheticLambda1(i7));
                sessionQueries.driver.execute(-625384941, "DELETE\nFROM audit_log_entry\nWHERE row_id <= (SELECT max(row_id) FROM audit_log_entry) - ?", new SyncRangeQueries$$ExternalSyntheticLambda1(4));
                sessionQueries.notifyQueries(-625384941, new SyncRangeQueries$$ExternalSyntheticLambda1(5));
                return Unit.INSTANCE;
            case 11:
                RealClientSyncStorageOperationBatchExecutor realClientSyncStorageOperationBatchExecutor = (RealClientSyncStorageOperationBatchExecutor) obj2;
                List<StorageOperation> list = ((StorageOperationBatch) obj3).f1115operations;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (StorageOperation storageOperation : list) {
                    SyncRangeStore syncRangeStore = realClientSyncStorageOperationBatchExecutor.rangeStore;
                    ClientSyncStorageObserver[] clientSyncStorageObserverArr = realClientSyncStorageOperationBatchExecutor.storageObservers;
                    try {
                        for (ClientSyncStorageObserver clientSyncStorageObserver : clientSyncStorageObserverArr) {
                            clientSyncStorageObserver.onBeforeStorageOperation(storageOperation);
                        }
                        if (storageOperation instanceof ReplaceRanges) {
                            ReplaceRanges replaceRanges = (ReplaceRanges) storageOperation;
                            syncRangeStore.replaceRanges(replaceRanges.rangesToDelete, replaceRanges.rangesToAdd);
                            result = new ReplaceRanges.Result(replaceRanges);
                        } else if (storageOperation instanceof UpdateEntity) {
                            result = realClientSyncStorageOperationBatchExecutor.executeUpdateEntity((UpdateEntity) storageOperation);
                        } else if (storageOperation instanceof DeleteEntity) {
                            result = realClientSyncStorageOperationBatchExecutor.executeDeleteEntity((DeleteEntity) storageOperation);
                        } else {
                            if (!(storageOperation instanceof DeleteAllRangesAndEntities)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            result = new DeleteAllRangesAndEntities.Result((DeleteAllRangesAndEntities) storageOperation, syncRangeStore.deleteAllRanges(), realClientSyncStorageOperationBatchExecutor.entityStore.deleteAllEntities());
                        }
                        for (ClientSyncStorageObserver clientSyncStorageObserver2 : clientSyncStorageObserverArr) {
                            clientSyncStorageObserver2.onAfterStorageOperation(result);
                        }
                        arrayList.add(result);
                    } catch (Throwable th6) {
                        for (ClientSyncStorageObserver clientSyncStorageObserver3 : clientSyncStorageObserverArr) {
                            clientSyncStorageObserver3.onStorageOperationFailure(storageOperation, th6);
                        }
                        RealClientSyncErrorReporter realClientSyncErrorReporter5 = realClientSyncStorageOperationBatchExecutor.errorReporter;
                        int i16 = StorageOperationPersistenceFailure.$r8$clinit;
                        storageOperation.getClass();
                        realClientSyncErrorReporter5.reportFatal(new StorageOperationPersistenceFailure(th6, new StorageOperationPersistenceFailure.Metadata(new StorageOperationErrorMetadata(storageOperation))));
                        throw null;
                    }
                }
                return arrayList;
            case 12:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj3;
                LinkTapDetectorState linkTapDetectorState = (LinkTapDetectorState) obj2;
                Offset offset = (Offset) obj;
                TextLayoutResult textLayoutResult = (TextLayoutResult) linkTapDetectorState.textLayoutResult$delegate.getValue();
                if (textLayoutResult != null) {
                    int m966getOffsetForPositionk4lQ0M = textLayoutResult.multiParagraph.m966getOffsetForPositionk4lQ0M(offset.packedValue);
                    range = (AnnotatedString.Range) CollectionsKt.firstOrNull(((AnnotatedString) linkTapDetectorState.text$delegate.getValue()).getLinkAnnotations(m966getOffsetForPositionk4lQ0M, m966getOffsetForPositionk4lQ0M));
                } else {
                    range = null;
                }
                ref$ObjectRef.element = range;
                return Boolean.valueOf(range != null);
            case 13:
                BlockersData blockersData = (BlockersData) obj;
                blockersData.getClass();
                return BlockersData.copy$default(blockersData, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, (ColorModel) obj3, null, null, null, null, false, null, null, null, -1, 65407).updateFromResponseContext((ResponseContext) obj2, false);
            case 14:
                UiAlias.Type.Companion companion = (UiAlias.Type.Companion) obj2;
                JsonWriter jsonWriter = (JsonWriter) obj;
                jsonWriter.getClass();
                jsonWriter.beginArray();
                for (Object obj4 : (Object[]) obj3) {
                    Function1 valueWriter = companion.valueWriter(obj4);
                    if (valueWriter != null) {
                        valueWriter.invoke(jsonWriter);
                    }
                }
                jsonWriter.endArray();
                return Unit.INSTANCE;
            case 15:
                PaymentHistoryConfig paymentHistoryConfig = (PaymentHistoryConfig) obj3;
                RealAppConfigManager realAppConfigManager = (RealAppConfigManager) obj2;
                ((TransactionWrapper) obj).getClass();
                if (paymentHistoryConfig != null) {
                    InstrumentQueries instrumentQueries2 = realAppConfigManager.paymentHistoryConfigQueries;
                    SessionQueries sessionQueries2 = realAppConfigManager.loyaltyHiddenPaymentTypesQueries;
                    SessionQueries sessionQueries3 = realAppConfigManager.bitcoinCustomerIdQueries;
                    instrumentQueries2.getClass();
                    SqlDriver sqlDriver = instrumentQueries2.driver;
                    instrumentQueries2.notifyQueries(-1232480902, new InstrumentQueries$$ExternalSyntheticLambda2(14, false));
                    for (String str3 : paymentHistoryConfig.transfer_customer_ids) {
                        str3.getClass();
                        sqlDriver.execute(1036161557, "INSERT INTO transfer_customer_ids VALUES (?)", new SyncDetailsQueries$$ExternalSyntheticLambda2(str3, 4));
                        instrumentQueries2.notifyQueries(1036161557, new InstrumentQueries$$ExternalSyntheticLambda2(15, false));
                    }
                    for (String str4 : paymentHistoryConfig.banking_transaction_customer_ids) {
                        str4.getClass();
                        sqlDriver.execute(1359044178, "INSERT INTO banking_transaction_customer_ids VALUES (?)", new SyncDetailsQueries$$ExternalSyntheticLambda2(str4, i7));
                        instrumentQueries2.notifyQueries(1359044178, new InstrumentQueries$$ExternalSyntheticLambda2(11, false));
                    }
                    for (String str5 : paymentHistoryConfig.lending_transaction_customer_ids) {
                        str5.getClass();
                        sqlDriver.execute(-1354728577, "INSERT INTO lending_transaction_customer_ids VALUES (?)", new SyncDetailsQueries$$ExternalSyntheticLambda2(str5, 5));
                        instrumentQueries2.notifyQueries(-1354728577, new InstrumentQueries$$ExternalSyntheticLambda2(10, false));
                    }
                    for (String str6 : paymentHistoryConfig.referral_customer_ids) {
                        str6.getClass();
                        sqlDriver.execute(-134860473, "INSERT INTO referral_customer_ids VALUES (?)", new SyncDetailsQueries$$ExternalSyntheticLambda2(str6, 3));
                        instrumentQueries2.notifyQueries(-134860473, new InstrumentQueries$$ExternalSyntheticLambda2(12, false));
                    }
                    sqlDriver.execute(-300216225, "UPDATE paymentHistoryConfig\nSET script_url = ?,\n    search_url = ?,\n    top_level_feed_payment_type_deny_list = ?,\n    loyalty_merchant_hidden_payment_types = ?,\n    automated_investment_payment_types = ?", new SliderKt$$ExternalSyntheticLambda3(paymentHistoryConfig.script_url, paymentHistoryConfig.search_script_url, paymentHistoryConfig.top_level_hidden_payment_types, paymentHistoryConfig.loyalty_merchant_payment_activity_hidden_payment_types, paymentHistoryConfig.automated_investment_payment_types, instrumentQueries2, 6));
                    instrumentQueries2.notifyQueries(-300216225, new InstrumentQueries$$ExternalSyntheticLambda2(13, false));
                    sessionQueries3.driver.execute(1024477307, "DELETE FROM bitcoinTransactionCustomerIds", null);
                    sessionQueries3.notifyQueries(1024477307, new SessionQueries$$ExternalSyntheticLambda1(i6, false));
                    for (String str7 : paymentHistoryConfig.bitcoin_transaction_customer_ids) {
                        str7.getClass();
                        sessionQueries3.driver.execute(1176143241, "INSERT INTO bitcoinTransactionCustomerIds\nVALUES (?)", new BadgeKt$$ExternalSyntheticLambda3(str7, 28));
                        sessionQueries3.notifyQueries(1176143241, new SessionQueries$$ExternalSyntheticLambda1(16, false));
                    }
                    sessionQueries2.driver.execute(2039387652, "DELETE FROM loyaltyHiddenPaymentTypes", null);
                    sessionQueries2.notifyQueries(2039387652, new InstrumentQueries$$ExternalSyntheticLambda2(8, false));
                    for (String str8 : paymentHistoryConfig.loyalty_merchant_payment_activity_hidden_payment_types) {
                        str8.getClass();
                        sessionQueries2.driver.execute(-2103913710, "INSERT OR REPLACE INTO loyaltyHiddenPaymentTypes\nVALUES (?)", new SyncDetailsQueries$$ExternalSyntheticLambda2(str8, 1 == true ? 1 : 0));
                        sessionQueries2.notifyQueries(-2103913710, new InstrumentQueries$$ExternalSyntheticLambda2(7, false));
                    }
                }
                return Unit.INSTANCE;
            case 16:
                ReactionConfig reactionConfig = (ReactionConfig) obj3;
                RealAppConfigManager realAppConfigManager2 = (RealAppConfigManager) obj2;
                ((TransactionWrapper) obj).getClass();
                if (reactionConfig != null) {
                    InstrumentQueries instrumentQueries3 = realAppConfigManager2.reactionConfigQueries;
                    instrumentQueries3.driver.execute(-1989837094, "UPDATE reactionConfig\nSET maxEmojisPerReaction = ?, extendedReactions = ?", new CaptureCheckFaceKt$$ExternalSyntheticLambda7(reactionConfig.max_emoji_per_reaction != null ? r0.intValue() : 0L, reactionConfig.extended_picker_reactions, instrumentQueries3, 3));
                    instrumentQueries3.notifyQueries(-1989837094, new InstrumentQueries$$ExternalSyntheticLambda2(16, false));
                }
                return Unit.INSTANCE;
            case 17:
                OfflineConfig offlineConfig = (OfflineConfig) obj3;
                RealAppConfigManager realAppConfigManager3 = (RealAppConfigManager) obj2;
                ((TransactionWrapper) obj).getClass();
                if (offlineConfig != null) {
                    final InstrumentQueries instrumentQueries4 = realAppConfigManager3.offlineConfigQueries;
                    Boolean bool = offlineConfig.enabled;
                    bool.getClass();
                    final boolean booleanValue = bool.booleanValue();
                    final String str9 = offlineConfig.external_status_url;
                    final StatusResult statusResult = offlineConfig.attempted_payment_status_result;
                    final StatusResult statusResult2 = offlineConfig.offline_payment_status_result;
                    final StatusResult statusResult3 = offlineConfig.attempted_bill_status_result;
                    final StatusResult statusResult4 = offlineConfig.offline_bill_status_result;
                    final StatusResult statusResult5 = offlineConfig.attempted_cash_out_status_result;
                    final StatusResult statusResult6 = offlineConfig.offline_cash_out_status_result;
                    final StatusResult statusResult7 = offlineConfig.error_cash_out_status_result;
                    final StatusResult statusResult8 = offlineConfig.attempted_add_cash_status_result;
                    final StatusResult statusResult9 = offlineConfig.offline_add_cash_status_result;
                    final StatusResult statusResult10 = offlineConfig.error_add_cash_status_result;
                    final com.squareup.protos.franklin.common.scenarios.ScenarioPlan scenarioPlan = offlineConfig.offline_transfer_scenario_plan;
                    final com.squareup.protos.franklin.common.scenarios.ScenarioPlan scenarioPlan2 = offlineConfig.error_transfer_scenario_plan;
                    final List list2 = offlineConfig.retry_intervals;
                    instrumentQueries4.driver.execute(-1212851740, "UPDATE offlineConfig\nSET enabled = ?,\n    external_status_url = ?,\n    attempted_payment_status_result = ?,\n    offline_payment_status_result = ?,\n    attempted_bill_status_result = ?,\n    offline_bill_status_result = ?,\n    attempted_cash_out_status_result = ?,\n    offline_cash_out_status_result = ?,\n    error_cash_out_status_result = ?,\n    attempted_add_cash_status_result = ?,\n    offline_add_cash_status_result = ?,\n    error_add_cash_status_result = ?,\n    offline_transfer_scenario_plan = ?,\n    error_transfer_scenario_plan = ?,\n    retry_intervals = ?", new Function1() { // from class: com.squareup.cash.db2.OfflineConfigQueries$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            AndroidStatement androidStatement4 = (AndroidStatement) obj5;
                            androidStatement4.getClass();
                            androidStatement4.bindBoolean(0, Boolean.valueOf(booleanValue));
                            androidStatement4.bindString(1, str9);
                            StatusResult statusResult11 = statusResult;
                            InstrumentQueries instrumentQueries5 = instrumentQueries4;
                            androidStatement4.bindBytes(2, statusResult11 != null ? (byte[]) ((WireAdapter) ((OfflineConfig.Adapter) instrumentQueries5.instrumentAdapter).attempted_payment_status_resultAdapter).encode(statusResult11) : null);
                            StatusResult statusResult12 = statusResult2;
                            androidStatement4.bindBytes(3, statusResult12 != null ? (byte[]) ((WireAdapter) ((OfflineConfig.Adapter) instrumentQueries5.instrumentAdapter).offline_payment_status_resultAdapter).encode(statusResult12) : null);
                            StatusResult statusResult13 = statusResult3;
                            androidStatement4.bindBytes(4, statusResult13 != null ? (byte[]) ((WireAdapter) ((OfflineConfig.Adapter) instrumentQueries5.instrumentAdapter).attempted_bill_status_resultAdapter).encode(statusResult13) : null);
                            StatusResult statusResult14 = statusResult4;
                            androidStatement4.bindBytes(5, statusResult14 != null ? (byte[]) ((WireAdapter) ((OfflineConfig.Adapter) instrumentQueries5.instrumentAdapter).offline_bill_status_resultAdapter).encode(statusResult14) : null);
                            StatusResult statusResult15 = statusResult5;
                            androidStatement4.bindBytes(6, statusResult15 != null ? (byte[]) ((WireAdapter) ((OfflineConfig.Adapter) instrumentQueries5.instrumentAdapter).attempted_cash_out_status_resultAdapter).encode(statusResult15) : null);
                            StatusResult statusResult16 = statusResult6;
                            androidStatement4.bindBytes(7, statusResult16 != null ? (byte[]) ((WireAdapter) ((OfflineConfig.Adapter) instrumentQueries5.instrumentAdapter).offline_cash_out_status_resultAdapter).encode(statusResult16) : null);
                            StatusResult statusResult17 = statusResult7;
                            androidStatement4.bindBytes(8, statusResult17 != null ? (byte[]) ((WireAdapter) ((OfflineConfig.Adapter) instrumentQueries5.instrumentAdapter).error_cash_out_status_resultAdapter).encode(statusResult17) : null);
                            StatusResult statusResult18 = statusResult8;
                            androidStatement4.bindBytes(9, statusResult18 != null ? (byte[]) ((WireAdapter) ((OfflineConfig.Adapter) instrumentQueries5.instrumentAdapter).attempted_add_cash_status_resultAdapter).encode(statusResult18) : null);
                            StatusResult statusResult19 = statusResult9;
                            androidStatement4.bindBytes(10, statusResult19 != null ? (byte[]) ((WireAdapter) ((OfflineConfig.Adapter) instrumentQueries5.instrumentAdapter).offline_add_cash_status_resultAdapter).encode(statusResult19) : null);
                            StatusResult statusResult20 = statusResult10;
                            androidStatement4.bindBytes(11, statusResult20 != null ? (byte[]) ((WireAdapter) ((OfflineConfig.Adapter) instrumentQueries5.instrumentAdapter).error_add_cash_status_resultAdapter).encode(statusResult20) : null);
                            com.squareup.protos.franklin.common.scenarios.ScenarioPlan scenarioPlan3 = scenarioPlan;
                            androidStatement4.bindBytes(12, scenarioPlan3 != null ? (byte[]) ((WireAdapter) ((OfflineConfig.Adapter) instrumentQueries5.instrumentAdapter).offline_transfer_scenario_planAdapter).encode(scenarioPlan3) : null);
                            com.squareup.protos.franklin.common.scenarios.ScenarioPlan scenarioPlan4 = scenarioPlan2;
                            androidStatement4.bindBytes(13, scenarioPlan4 != null ? (byte[]) ((WireAdapter) ((OfflineConfig.Adapter) instrumentQueries5.instrumentAdapter).error_transfer_scenario_planAdapter).encode(scenarioPlan4) : null);
                            List list3 = list2;
                            androidStatement4.bindBytes(14, list3 != null ? (byte[]) ((WireRepeatedAdapter) ((OfflineConfig.Adapter) instrumentQueries5.instrumentAdapter).retry_intervalsAdapter).encode(list3) : null);
                            return Unit.INSTANCE;
                        }
                    });
                    instrumentQueries4.notifyQueries(-1212851740, new InstrumentQueries$$ExternalSyntheticLambda2(9, false));
                }
                return Unit.INSTANCE;
            case 18:
                CryptocurrencyConfig cryptocurrencyConfig = (CryptocurrencyConfig) obj3;
                RealAppConfigManager realAppConfigManager4 = (RealAppConfigManager) obj2;
                ((TransactionWrapper) obj).getClass();
                if (cryptocurrencyConfig != null) {
                    SessionQueries sessionQueries4 = realAppConfigManager4.cryptocurrencyConfigQueries;
                    sessionQueries4.driver.execute(126468227, "UPDATE cryptocurrencyConfig\nSET btc_welcome_message = ?,\n    learn_about_btc_button_text = ?,\n    learn_about_btc_url = ?,\n    dismiss_button_text = ?,\n    minimum_withdrawal_limit_sats = ?", new OverlayKt$$ExternalSyntheticLambda3(cryptocurrencyConfig.btc_welcome_message, cryptocurrencyConfig.learn_about_btc_button_text, cryptocurrencyConfig.learn_about_btc_url, cryptocurrencyConfig.dismiss_button_text, cryptocurrencyConfig.minimum_withdrawal_limit_sats, 13));
                    sessionQueries4.notifyQueries(126468227, new SessionQueries$$ExternalSyntheticLambda1(i5, false));
                }
                return Unit.INSTANCE;
            case 19:
                StampsConfig stampsConfig = (StampsConfig) obj3;
                RealAppConfigManager realAppConfigManager5 = (RealAppConfigManager) obj2;
                ((TransactionWrapper) obj).getClass();
                if (stampsConfig != null) {
                    InstrumentQueries instrumentQueries5 = realAppConfigManager5.stampsConfigQueries;
                    instrumentQueries5.driver.execute(1538982337, "UPDATE stampsConfig\nSET stamps = ?", new InstrumentQueries$$ExternalSyntheticLambda0(i4, stampsConfig.stamps, instrumentQueries5));
                    instrumentQueries5.notifyQueries(1538982337, new InstrumentQueries$$ExternalSyntheticLambda2(18, false));
                }
                return Unit.INSTANCE;
            case 20:
                RecipientConfig recipientConfig = (RecipientConfig) obj3;
                RealAppConfigManager realAppConfigManager6 = (RealAppConfigManager) obj2;
                ((TransactionWrapper) obj).getClass();
                if (recipientConfig != null) {
                    InstrumentQueries instrumentQueries6 = realAppConfigManager6.recipientConfigQueries;
                    SuggestedRecipientsData suggestedRecipientsData = recipientConfig.pay_data;
                    SuggestedRecipientsData suggestedRecipientsData2 = recipientConfig.request_data;
                    Boolean bool2 = recipientConfig.confirm_cashtag_recipients;
                    instrumentQueries6.driver.execute(486942746, "UPDATE recipientConfig\nSET pay_data = ?,\n    request_data = ?,\n    confirm_cashtag_recipient = ?", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(suggestedRecipientsData, suggestedRecipientsData2, bool2 != null ? bool2.booleanValue() : false, instrumentQueries6, 8));
                    instrumentQueries6.notifyQueries(486942746, new InstrumentQueries$$ExternalSyntheticLambda2(17, false));
                }
                return Unit.INSTANCE;
            case 21:
                SupportConfig supportConfig = (SupportConfig) obj3;
                RealAppConfigManager realAppConfigManager7 = (RealAppConfigManager) obj2;
                ((TransactionWrapper) obj).getClass();
                if (supportConfig != null) {
                    SessionQueries sessionQueries5 = realAppConfigManager7.supportConfigQueries;
                    sessionQueries5.driver.execute(1999531930, "UPDATE supportConfig\nSET privacy_policy_url = ?,\n    terms_of_service_url = ?", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda5(supportConfig.privacy_policy_url, supportConfig.terms_of_service_url, i2));
                    sessionQueries5.notifyQueries(1999531930, new InstrumentQueries$$ExternalSyntheticLambda2(19, false));
                }
                return Unit.INSTANCE;
            case 22:
                WebLoginConfig webLoginConfig = (WebLoginConfig) obj3;
                RealAppConfigManager realAppConfigManager8 = (RealAppConfigManager) obj2;
                ((TransactionWrapper) obj).getClass();
                if (webLoginConfig != null) {
                    SessionQueries sessionQueries6 = realAppConfigManager8.webLoginConfigQueries;
                    String str10 = webLoginConfig.token;
                    Long l2 = webLoginConfig.expires_at;
                    sessionQueries6.driver.execute(491500838, "UPDATE webLoginConfig\nSET token = ?,\n    expires_at = ?", new WebLoginConfigQueries$$ExternalSyntheticLambda3(str10, Long.valueOf(l2 != null ? l2.longValue() : 0L)));
                    sessionQueries6.notifyQueries(491500838, new WebLoginConfigQueries$$ExternalSyntheticLambda2(1, false));
                }
                return Unit.INSTANCE;
            case 23:
                return invoke$com$squareup$cash$data$db$RealAppConfigManager$$ExternalSyntheticLambda4(obj);
            case 24:
                InvitationConfig invitationConfig = (InvitationConfig) obj3;
                final InstrumentQueries instrumentQueries7 = ((RealAppConfigManager) obj2).invitationConfigQueries;
                ((TransactionWrapper) obj).getClass();
                if (invitationConfig != null) {
                    final Boolean bool3 = invitationConfig.enabled;
                    final Money money = invitationConfig.bounty_amount;
                    final Money money2 = invitationConfig.welcome_bonus_amount;
                    final String str11 = invitationConfig.header_text;
                    final String str12 = invitationConfig.preview_message;
                    final String str13 = invitationConfig.message_template;
                    final Boolean bool4 = invitationConfig.invite_all_enabled;
                    final String str14 = invitationConfig.reward_code;
                    final String str15 = invitationConfig.reward_code_url;
                    SharingContent sharingContent = invitationConfig.sharing_content;
                    final String str16 = sharingContent != null ? sharingContent.default_text : null;
                    final String str17 = invitationConfig.header_link_display_text;
                    final String str18 = invitationConfig.profile_button_text;
                    final String str19 = invitationConfig.activity_button_text;
                    final List<CountryText> list3 = invitationConfig.preview_message_by_country;
                    final String str20 = invitationConfig.profile_row_title;
                    final String str21 = invitationConfig.profile_row_subtitle;
                    final String str22 = invitationConfig.standalone_invite_friends_cta;
                    final String str23 = invitationConfig.short_invite_friends_cta;
                    SqlDriver sqlDriver2 = instrumentQueries7.driver;
                    Function1 function1 = new Function1() { // from class: com.squareup.cash.db2.InvitationConfigQueries$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            AndroidStatement androidStatement4 = (AndroidStatement) obj5;
                            androidStatement4.getClass();
                            androidStatement4.bindBoolean(0, bool3);
                            Money money3 = money;
                            InstrumentQueries instrumentQueries8 = instrumentQueries7;
                            androidStatement4.bindBytes(1, money3 != null ? (byte[]) ((WireAdapter) ((Instrument$Adapter) instrumentQueries8.instrumentAdapter).cash_instrument_typeAdapter).encode(money3) : null);
                            Money money4 = money2;
                            androidStatement4.bindBytes(2, money4 != null ? (byte[]) ((WireAdapter) ((Instrument$Adapter) instrumentQueries8.instrumentAdapter).card_brandAdapter).encode(money4) : null);
                            androidStatement4.bindString(3, str11);
                            androidStatement4.bindString(4, str12);
                            androidStatement4.bindString(5, str13);
                            androidStatement4.bindBoolean(6, bool4);
                            androidStatement4.bindString(7, str14);
                            androidStatement4.bindString(8, str15);
                            androidStatement4.bindString(9, str16);
                            androidStatement4.bindString(10, str17);
                            androidStatement4.bindString(11, str18);
                            androidStatement4.bindString(12, str19);
                            List list4 = list3;
                            androidStatement4.bindBytes(13, list4 != null ? (byte[]) ((WireRepeatedAdapter) ((Instrument$Adapter) instrumentQueries8.instrumentAdapter).balance_currencyAdapter).encode(list4) : null);
                            androidStatement4.bindString(14, str20);
                            androidStatement4.bindString(15, str21);
                            androidStatement4.bindString(16, str22);
                            androidStatement4.bindString(17, str23);
                            return Unit.INSTANCE;
                        }
                    };
                    instrumentQueries = instrumentQueries7;
                    QueryResult execute = sqlDriver2.execute(1322214986, "UPDATE invitationConfig\nSET enabled = ?,\n    bounty_amount = ?,\n    welcome_amount = ?,\n    header = ?,\n    preview_message = ?,\n    message_template = ?,\n    invite_all_enabled = ?,\n    reward_code = ?,\n    reward_code_url = ?,\n    share_text = ?,\n    header_link_display_text = ?,\n    profile_button_text = ?,\n    activity_button_text = ?,\n    preview_message_by_country = ?,\n    profile_row_title = ?,\n    profile_row_subtitle = ?,\n    standalone_invite_friends_cta = ?,\n    short_invite_friends_cta = ?", function1);
                    instrumentQueries.notifyQueries(1322214986, new InstrumentQueries$$ExternalSyntheticLambda2(3, false));
                    break;
                } else {
                    instrumentQueries = instrumentQueries7;
                }
                final Boolean bool5 = Boolean.FALSE;
                final Money money3 = null;
                final Money money4 = null;
                final String str24 = null;
                final String str25 = null;
                final String str26 = null;
                final Boolean bool6 = null;
                final String str27 = null;
                final String str28 = null;
                final String str29 = null;
                final String str30 = null;
                final String str31 = null;
                final String str32 = null;
                final List list4 = null;
                final String str33 = null;
                final String str34 = null;
                final String str35 = null;
                final String str36 = null;
                final InstrumentQueries instrumentQueries8 = instrumentQueries;
                instrumentQueries.driver.execute(1322214986, "UPDATE invitationConfig\nSET enabled = ?,\n    bounty_amount = ?,\n    welcome_amount = ?,\n    header = ?,\n    preview_message = ?,\n    message_template = ?,\n    invite_all_enabled = ?,\n    reward_code = ?,\n    reward_code_url = ?,\n    share_text = ?,\n    header_link_display_text = ?,\n    profile_button_text = ?,\n    activity_button_text = ?,\n    preview_message_by_country = ?,\n    profile_row_title = ?,\n    profile_row_subtitle = ?,\n    standalone_invite_friends_cta = ?,\n    short_invite_friends_cta = ?", new Function1() { // from class: com.squareup.cash.db2.InvitationConfigQueries$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        AndroidStatement androidStatement4 = (AndroidStatement) obj5;
                        androidStatement4.getClass();
                        androidStatement4.bindBoolean(0, bool5);
                        Money money32 = money3;
                        InstrumentQueries instrumentQueries82 = instrumentQueries8;
                        androidStatement4.bindBytes(1, money32 != null ? (byte[]) ((WireAdapter) ((Instrument$Adapter) instrumentQueries82.instrumentAdapter).cash_instrument_typeAdapter).encode(money32) : null);
                        Money money42 = money4;
                        androidStatement4.bindBytes(2, money42 != null ? (byte[]) ((WireAdapter) ((Instrument$Adapter) instrumentQueries82.instrumentAdapter).card_brandAdapter).encode(money42) : null);
                        androidStatement4.bindString(3, str24);
                        androidStatement4.bindString(4, str25);
                        androidStatement4.bindString(5, str26);
                        androidStatement4.bindBoolean(6, bool6);
                        androidStatement4.bindString(7, str27);
                        androidStatement4.bindString(8, str28);
                        androidStatement4.bindString(9, str29);
                        androidStatement4.bindString(10, str30);
                        androidStatement4.bindString(11, str31);
                        androidStatement4.bindString(12, str32);
                        List list42 = list4;
                        androidStatement4.bindBytes(13, list42 != null ? (byte[]) ((WireRepeatedAdapter) ((Instrument$Adapter) instrumentQueries82.instrumentAdapter).balance_currencyAdapter).encode(list42) : null);
                        androidStatement4.bindString(14, str33);
                        androidStatement4.bindString(15, str34);
                        androidStatement4.bindString(16, str35);
                        androidStatement4.bindString(17, str36);
                        return Unit.INSTANCE;
                    }
                });
                instrumentQueries.notifyQueries(1322214986, new InstrumentQueries$$ExternalSyntheticLambda2(3, false));
                return Unit.INSTANCE;
            case 25:
                InstitutionsConfig institutionsConfig = (InstitutionsConfig) obj3;
                RealAppConfigManager realAppConfigManager9 = (RealAppConfigManager) obj2;
                ((TransactionWrapper) obj).getClass();
                if (institutionsConfig != null) {
                    InstrumentQueries instrumentQueries9 = realAppConfigManager9.institutionsConfigQueries;
                    instrumentQueries9.driver.execute(-606984596, "UPDATE institutionsConfig\nSET institutions = ?", new InstrumentQueries$$ExternalSyntheticLambda0(i3, institutionsConfig.institutions, instrumentQueries9));
                    instrumentQueries9.notifyQueries(-606984596, new InstrumentQueries$$ExternalSyntheticLambda2(1, false));
                }
                return Unit.INSTANCE;
            case 26:
                InstrumentQueries instrumentQueries10 = ((RealContactAliasFetcher) obj3).profileAliasQueries;
                instrumentQueries10.deleteByType(UiAlias.Type.EMAIL);
                instrumentQueries10.deleteByType(UiAlias.Type.SMS);
                for (ContactAlias contactAlias : ((GetContactAliasesResponse) ((ApiResult.Success) obj2).response).aliases) {
                    ContactAliasType contactAliasType = contactAlias.alias_type;
                    int i17 = contactAliasType == null ? -1 : RealContactAliasFetcher.WhenMappings.$EnumSwitchMapping$0[contactAliasType.ordinal()];
                    UiAlias.Type type2 = i17 != 1 ? i17 != 2 ? null : UiAlias.Type.SMS : UiAlias.Type.EMAIL;
                    if (type2 != null && (str = contactAlias.alias_value) != null) {
                        instrumentQueries10.insert(type2, str, true);
                    }
                }
                return Unit.INSTANCE;
            case 27:
                InstrumentQueries instrumentQueries11 = ((RealCustomerLimitsManager) obj3).limitsQueries;
                instrumentQueries11.driver.execute(-1918847836, "DELETE FROM effective_limits", null);
                instrumentQueries11.notifyQueries(-1918847836, new OfflineQueries$$ExternalSyntheticLambda1(19));
                for (GetEffectiveCustomerLimitsResponse.LimitForAction limitForAction : ((GetEffectiveCustomerLimitsResponse) obj2).limits) {
                    LimitedAction limitedAction = limitForAction.action;
                    limitedAction.getClass();
                    Money money5 = limitForAction.limit;
                    money5.getClass();
                    String str37 = limitForAction.limit_exceeded_message;
                    instrumentQueries11.getClass();
                    instrumentQueries11.driver.execute(956775777, "INSERT INTO effective_limits\nVALUES (?, ?, ?)", new BankingConfigQueries$$ExternalSyntheticLambda0(instrumentQueries11, limitedAction, money5, str37));
                    instrumentQueries11.notifyQueries(956775777, new OfflineQueries$$ExternalSyntheticLambda1(20));
                }
                return Unit.INSTANCE;
            case 28:
                DirectDepositAccount directDepositAccount = (DirectDepositAccount) obj2;
                ((TransactionWrapper) obj).getClass();
                SessionQueries sessionQueries7 = ((RealDemandDepositAccountManager) obj3).queries;
                sessionQueries7.driver.execute(-871097970, "DELETE FROM directDepositAccount", null);
                sessionQueries7.notifyQueries(-871097970, new OfflineQueries$$ExternalSyntheticLambda1(23));
                if (directDepositAccount != null) {
                    String str38 = directDepositAccount.routing_number;
                    str38.getClass();
                    String str39 = directDepositAccount.account_number_prefix;
                    str39.getClass();
                    Boolean bool7 = directDepositAccount.is_placeholder;
                    bool7.getClass();
                    boolean booleanValue2 = bool7.booleanValue();
                    String str40 = directDepositAccount.dda_explanation_text;
                    Boolean bool8 = directDepositAccount.display_complete_account_number;
                    String str41 = directDepositAccount.support_node_token;
                    sessionQueries7.getClass();
                    sessionQueries7.driver.execute(-712895074, "INSERT OR REPLACE INTO directDepositAccount\nVALUES (?, ?, ?, ?, ?, ?)", new SessionQueries$$ExternalSyntheticLambda0(str38, str39, booleanValue2, str40, bool8, str41));
                    sessionQueries7.notifyQueries(-712895074, new OfflineQueries$$ExternalSyntheticLambda1(22));
                }
                return Unit.INSTANCE;
            default:
                BalanceData balanceData = (BalanceData) obj2;
                ((TransactionWrapper) obj).getClass();
                final InstrumentQueries instrumentQueries12 = ((RealProfileSyncer) obj3).balanceDataQueries;
                instrumentQueries12.driver.execute(1813897890, "DELETE FROM balanceData", null);
                instrumentQueries12.notifyQueries(1813897890, new OfflineQueries$$ExternalSyntheticLambda1(18));
                Boolean bool9 = balanceData.cash_balance_home_screen_button_enabled;
                bool9.getClass();
                final boolean booleanValue3 = bool9.booleanValue();
                Integer num = balanceData.cash_balance_home_screen_button_priority;
                num.getClass();
                final int intValue = num.intValue();
                Boolean bool10 = balanceData.adding_cash_enabled;
                bool10.getClass();
                final boolean booleanValue4 = bool10.booleanValue();
                EnableCryptocurrencyTransferOutStatus enableCryptocurrencyTransferOutStatus = balanceData.enable_cryptocurrency_transfer_out_status;
                if (enableCryptocurrencyTransferOutStatus == null) {
                    enableCryptocurrencyTransferOutStatus = ProtoDefaults.ENABLE_CRYPTOCURRENCY_TRANSFER_OUT_STATUS;
                }
                final EnableCryptocurrencyTransferOutStatus enableCryptocurrencyTransferOutStatus2 = enableCryptocurrencyTransferOutStatus;
                final String str42 = balanceData.enable_cryptocurrency_transfer_out_button_text;
                final List list5 = balanceData.balance_limit_groups;
                final ScheduledReloadData scheduledReloadData = balanceData.scheduled_reload_data;
                Boolean bool11 = balanceData.scheduled_reload_enabled;
                final boolean booleanValue5 = bool11 != null ? bool11.booleanValue() : false;
                EnableCryptocurrencyTransferInStatus enableCryptocurrencyTransferInStatus = balanceData.enable_cryptocurrency_transfer_in_status;
                if (enableCryptocurrencyTransferInStatus == null) {
                    enableCryptocurrencyTransferInStatus = ProtoDefaults.ENABLE_CRYPTOCURRENCY_TRANSFER_IN_STATUS;
                }
                final EnableCryptocurrencyTransferInStatus enableCryptocurrencyTransferInStatus2 = enableCryptocurrencyTransferInStatus;
                final String str43 = balanceData.enable_cryptocurrency_transfer_in_button_text;
                Boolean bool12 = balanceData.check_deposits_enabled;
                bool12.getClass();
                final boolean booleanValue6 = bool12.booleanValue();
                final BalanceData.Button button = balanceData.direct_deposit;
                final BalanceData.Button button2 = balanceData.deposit_check;
                final BalanceData.Button button3 = balanceData.dda_form;
                Boolean bool13 = balanceData.bitcoin_p2p_enabled;
                bool13.getClass();
                final boolean booleanValue7 = bool13.booleanValue();
                instrumentQueries12.getClass();
                enableCryptocurrencyTransferOutStatus2.getClass();
                list5.getClass();
                enableCryptocurrencyTransferInStatus2.getClass();
                instrumentQueries12.driver.execute(1965563824, "INSERT OR REPLACE INTO balanceData\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new Function1() { // from class: com.squareup.cash.db2.profile.BalanceDataQueries$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        AndroidStatement androidStatement4 = (AndroidStatement) obj5;
                        androidStatement4.getClass();
                        androidStatement4.bindBoolean(0, Boolean.valueOf(booleanValue3));
                        InstrumentQueries instrumentQueries13 = instrumentQueries12;
                        ((Reward$Adapter) instrumentQueries13.instrumentAdapter).getClass();
                        androidStatement4.bindLong(1, Long.valueOf(intValue));
                        androidStatement4.bindBoolean(2, Boolean.valueOf(booleanValue4));
                        Reward$Adapter reward$Adapter = (Reward$Adapter) instrumentQueries13.instrumentAdapter;
                        androidStatement4.bindString(3, (String) ((EnumColumnAdapter) reward$Adapter.boost_detail_rowsAdapter).encode(enableCryptocurrencyTransferOutStatus2));
                        androidStatement4.bindString(4, str42);
                        androidStatement4.bindBytes(5, (byte[]) ((WireRepeatedAdapter) reward$Adapter.program_detail_rowsAdapter).encode(list5));
                        ScheduledReloadData scheduledReloadData2 = scheduledReloadData;
                        androidStatement4.bindBytes(6, scheduledReloadData2 != null ? (byte[]) ((WireAdapter) reward$Adapter.avatarsAdapter).encode(scheduledReloadData2) : null);
                        androidStatement4.bindBoolean(7, Boolean.valueOf(booleanValue5));
                        androidStatement4.bindString(8, (String) ((EnumColumnAdapter) reward$Adapter.boost_attributesAdapter).encode(enableCryptocurrencyTransferInStatus2));
                        androidStatement4.bindString(9, str43);
                        androidStatement4.bindBoolean(10, Boolean.valueOf(booleanValue6));
                        BalanceData.Button button4 = button;
                        androidStatement4.bindBytes(11, button4 != null ? (byte[]) ((WireAdapter) reward$Adapter.reward_selection_stateAdapter).encode(button4) : null);
                        BalanceData.Button button5 = button2;
                        androidStatement4.bindBytes(12, button5 != null ? (byte[]) ((WireAdapter) reward$Adapter.boost_detail_bottom_upsellAdapter).encode(button5) : null);
                        BalanceData.Button button6 = button3;
                        androidStatement4.bindBytes(13, button6 != null ? (byte[]) ((WireAdapter) reward$Adapter.app_linksAdapter).encode(button6) : null);
                        androidStatement4.bindBoolean(14, Boolean.valueOf(booleanValue7));
                        return Unit.INSTANCE;
                    }
                });
                instrumentQueries12.notifyQueries(1965563824, new OfflineQueries$$ExternalSyntheticLambda1(17));
                return Unit.INSTANCE;
        }
    }
}
