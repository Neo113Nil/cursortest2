package com.squareup.cash.payments.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.core.math.MathUtils;
import androidx.core.net.UriKt;
import androidx.room.RoomDatabase$performClear$1;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.broadway.presenter.molecule.AnswersKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.LocalAddBrandsPresenter$models$2$1;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.datadog.opentelemetry.trace.OtelConventions;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahh;
import com.squareup.cash.NavigationSideEffects;
import com.squareup.cash.account.presenters.settings.PersonalSetting;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$$ExternalSyntheticLambda2;
import com.squareup.cash.cdf.ContactInviteEntryPoint;
import com.squareup.cash.cdf.asset.AssetSendAddRecipientFromQRCode;
import com.squareup.cash.cdf.asset.Origin;
import com.squareup.cash.cdf.contact.ContactAccessRequestPermission;
import com.squareup.cash.clipboard.RealClipboardObserver;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.address.StablecoinWithdrawalOption;
import com.squareup.cash.crypto.backend.stablecoin.StablecoinNetworkRepo;
import com.squareup.cash.crypto.backend.stablecoin.StablecoinNetworksResult;
import com.squareup.cash.crypto.navigation.CryptoFlowStarter;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.contacts.RealContactSync$syncRequest$2;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.eligibility.backend.api.EligibleFeature;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.featureflags.AmplitudeExperiments$CoreFlowContactSyncUpsell;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.google.pay.payments.api.GooglePayPaymentsClient;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentRowLoader;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.music.presenters.MusicPresenter$models$3$1;
import com.squareup.cash.offers.presenters.OffersHomePresenter$models$2$1;
import com.squareup.cash.offers.views.home.OffersHomeV2Kt$$ExternalSyntheticLambda7;
import com.squareup.cash.paychecks.views.PaycheckCirclesKt$$ExternalSyntheticLambda3;
import com.squareup.cash.payments.RealPaymentInitiator;
import com.squareup.cash.payments.backend.api.OfflineManager;
import com.squareup.cash.payments.backend.api.PaymentLinkRepository$GetPayLinkDataResult;
import com.squareup.cash.payments.backend.real.RealStatusAndLimitsManager;
import com.squareup.cash.payments.screens.PaymentConfigurationFlow;
import com.squareup.cash.payments.screens.PaymentConfigurationStep;
import com.squareup.cash.payments.screens.PaymentFlowData;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$PaymentPad;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel;
import com.squareup.cash.payments.viewmodels.RecipientSelectedStep;
import com.squareup.cash.payments.views.MainPaymentView$Content$2$1;
import com.squareup.cash.payments.views.MainPaymentViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.permissions.ModifiablePermissions;
import com.squareup.cash.pools.presenters.PoolsListPresenter$models$2$2;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda0;
import com.squareup.cash.qrcodes.screens.CashtagQrScanQuestion;
import com.squareup.cash.qrcodes.screens.CashtagQrScanResult;
import com.squareup.cash.recipients.data.RealRecipientRepository;
import com.squareup.cash.recipients.data.Section;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.securitysignals.api.SecuritySignalsAggregator;
import com.squareup.cash.storage.AndroidFileSaver$save$2;
import com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.transfers.views.shared.TransferSheetKt$$ExternalSyntheticLambda0;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.network.impl.RealNetworkInfo;
import com.squareup.preferences.BooleanPreference;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.blockstable.api.v1.InputSource;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.api.Region;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PaymentConfigurationPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final Origin analyticsOrigin;
    public final AppConfigManager appConfigManager;
    public final PaymentScreens.PaymentConfiguration args;
    public final BooleanPreference askedContactsPaymentPreference;
    public final RealBalanceSnapshotManager balanceSnapshotManager;
    public final BlockersDataNavigator blockersDataNavigator;
    public final RealClipboardObserver clipboardObserver;
    public final AndroidClock clock;
    public final ModifiablePermissions contactsPermission;
    public final CryptoFlowStarter cryptoFlowStarter;
    public final PersonalizationDraftStore draftStore;
    public final RealFeatureEligibilityRepository featureEligibilityRepository;
    public final FeatureFlagManager featureFlagManager;
    public final FlowStarter flowStarter;
    public final String flowToken;
    public final GooglePayPaymentsClient googlePayPaymentsClient;
    public final KeyValue hasSeenStablecoinWithdrawalOnboarding;
    public final RealInstrumentManager instrumentManager;
    public final RealInstrumentRowLoader instrumentRowLoader;
    public long instrumentSelectionStartTimestamp;
    public final IntentLauncher intentLauncher;
    public final CoroutineContext ioDispatcher;
    public final MoneyFormatter moneyFormatter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealNetworkInfo networkInfo;
    public final OfflineManager offlineManager;
    public final RealPaymentConfigurationRouter$Factory$Impl paymentConfigurationRouterFactory;
    public final RealPaymentInitiator paymentInitiator;
    public final AssetPublicSuffixList paymentLinkRepository;
    public final UUID paymentToken;
    public final RealPersonalizePaymentManager personalizePaymentManager;
    public final RealProfileManager profileManager;
    public final RealRecipientRepository recipientRepository;
    public final KeyValue recipientSelectorTooltipSeenCount;
    public String searchFlowToken;
    public final SecuritySignalsAggregator securitySignalsAggregator;
    public final StablecoinNetworkRepo stablecoinNetworkRepo;
    public final RealStatusAndLimitsManager statusAndLimitsManager;
    public final AndroidStringManager stringManager;

    public PaymentConfigurationPresenter(PaymentScreens.PaymentConfiguration paymentConfiguration, BetterNavigator.ScreenNavigator screenNavigator, RealRecipientRepository realRecipientRepository, RealProfileManager realProfileManager, AndroidStringManager androidStringManager, RealPaymentInitiator realPaymentInitiator, RealBalanceSnapshotManager realBalanceSnapshotManager, IntentLauncher intentLauncher, FeatureFlagManager featureFlagManager, RealFeatureEligibilityRepository realFeatureEligibilityRepository, GooglePayPaymentsClient googlePayPaymentsClient, RealInstrumentRowLoader realInstrumentRowLoader, RealInstrumentManager realInstrumentManager, AppConfigManager appConfigManager, Analytics analytics, RealNetworkInfo realNetworkInfo, RealStatusAndLimitsManager realStatusAndLimitsManager, OfflineManager offlineManager, SecuritySignalsAggregator securitySignalsAggregator, AssetPublicSuffixList assetPublicSuffixList, StablecoinNetworkRepo stablecoinNetworkRepo, KeyValue keyValue, FlowStarter flowStarter, BlockersDataNavigator blockersDataNavigator, CryptoFlowStarter cryptoFlowStarter, RealClipboardObserver realClipboardObserver, RealPaymentConfigurationRouter$Factory$Impl realPaymentConfigurationRouter$Factory$Impl, BooleanPreference booleanPreference, ModifiablePermissions modifiablePermissions, CoroutineContext coroutineContext, AndroidClock androidClock, RealUuidGenerator realUuidGenerator, LocalizedMoneyFormatter.Factory factory, RealPersonalizePaymentManager realPersonalizePaymentManager, KeyValue keyValue2, PersonalizationDraftStore personalizationDraftStore) {
        paymentConfiguration.getClass();
        this.args = paymentConfiguration;
        this.navigator = screenNavigator;
        this.recipientRepository = realRecipientRepository;
        this.profileManager = realProfileManager;
        this.stringManager = androidStringManager;
        this.paymentInitiator = realPaymentInitiator;
        this.balanceSnapshotManager = realBalanceSnapshotManager;
        this.intentLauncher = intentLauncher;
        this.featureFlagManager = featureFlagManager;
        this.featureEligibilityRepository = realFeatureEligibilityRepository;
        this.googlePayPaymentsClient = googlePayPaymentsClient;
        this.instrumentRowLoader = realInstrumentRowLoader;
        this.instrumentManager = realInstrumentManager;
        this.appConfigManager = appConfigManager;
        this.analytics = analytics;
        this.networkInfo = realNetworkInfo;
        this.statusAndLimitsManager = realStatusAndLimitsManager;
        this.offlineManager = offlineManager;
        this.securitySignalsAggregator = securitySignalsAggregator;
        this.paymentLinkRepository = assetPublicSuffixList;
        this.stablecoinNetworkRepo = stablecoinNetworkRepo;
        this.hasSeenStablecoinWithdrawalOnboarding = keyValue;
        this.flowStarter = flowStarter;
        this.blockersDataNavigator = blockersDataNavigator;
        this.cryptoFlowStarter = cryptoFlowStarter;
        this.clipboardObserver = realClipboardObserver;
        this.paymentConfigurationRouterFactory = realPaymentConfigurationRouter$Factory$Impl;
        this.askedContactsPaymentPreference = booleanPreference;
        this.contactsPermission = modifiablePermissions;
        this.ioDispatcher = coroutineContext;
        this.clock = androidClock;
        this.personalizePaymentManager = realPersonalizePaymentManager;
        this.recipientSelectorTooltipSeenCount = keyValue2;
        this.draftStore = personalizationDraftStore;
        UUID uuid = paymentConfiguration.paymentToken;
        this.paymentToken = uuid == null ? RealUuidGenerator.generate() : uuid;
        String str = paymentConfiguration.flowToken;
        this.flowToken = str == null ? re$$ExternalSyntheticOutline0.m() : str;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
        this.analyticsOrigin = paymentConfiguration.paymentConfigurationFlow instanceof PaymentConfigurationFlow.PersonFirst ? Origin.PERSON_FIRST : Origin.AMOUNT_FIRST;
    }

    public static final void access$handleContactPermissionTap(PaymentConfigurationPresenter paymentConfigurationPresenter, ContactAccessRequestPermission.PermissionRequestSource permissionRequestSource, boolean z) {
        paymentConfigurationPresenter.analytics.track(new ContactAccessRequestPermission(permissionRequestSource, ContactInviteEntryPoint.PAYMENT, paymentConfigurationPresenter.flowToken), null);
        BooleanPreference booleanPreference = paymentConfigurationPresenter.askedContactsPaymentPreference;
        if (!booleanPreference.get() || z) {
            paymentConfigurationPresenter.contactsPermission.request();
        } else {
            paymentConfigurationPresenter.intentLauncher.launchSettings();
        }
        booleanPreference.set(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$models$loadPayLinkData(PaymentConfigurationPresenter paymentConfigurationPresenter, MutableState mutableState, CoroutineScope coroutineScope, RealPaymentConfigurationRouter realPaymentConfigurationRouter, String str, ContinuationImpl continuationImpl) {
        PaymentConfigurationPresenter$models$loadPayLinkData$1 paymentConfigurationPresenter$models$loadPayLinkData$1;
        int i;
        CoroutineScope coroutineScope2;
        RealPaymentConfigurationRouter realPaymentConfigurationRouter2;
        PaymentLinkRepository$GetPayLinkDataResult paymentLinkRepository$GetPayLinkDataResult;
        PaymentConfigurationPresenter paymentConfigurationPresenter2 = paymentConfigurationPresenter;
        MutableState mutableState2 = mutableState;
        if (continuationImpl instanceof PaymentConfigurationPresenter$models$loadPayLinkData$1) {
            paymentConfigurationPresenter$models$loadPayLinkData$1 = (PaymentConfigurationPresenter$models$loadPayLinkData$1) continuationImpl;
            int i2 = paymentConfigurationPresenter$models$loadPayLinkData$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                paymentConfigurationPresenter$models$loadPayLinkData$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = paymentConfigurationPresenter$models$loadPayLinkData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentConfigurationPresenter$models$loadPayLinkData$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState2.setValue(PaymentRouterData.copy$default((PaymentRouterData) mutableState2.getValue(), null, null, null, false, false, false, null, null, false, null, false, false, null, null, null, null, null, null, false, 16711679));
                    AssetPublicSuffixList assetPublicSuffixList = paymentConfigurationPresenter2.paymentLinkRepository;
                    paymentConfigurationPresenter$models$loadPayLinkData$1.L$0 = paymentConfigurationPresenter2;
                    paymentConfigurationPresenter$models$loadPayLinkData$1.L$1 = mutableState2;
                    coroutineScope2 = coroutineScope;
                    paymentConfigurationPresenter$models$loadPayLinkData$1.L$2 = coroutineScope2;
                    realPaymentConfigurationRouter2 = realPaymentConfigurationRouter;
                    paymentConfigurationPresenter$models$loadPayLinkData$1.L$3 = realPaymentConfigurationRouter2;
                    paymentConfigurationPresenter$models$loadPayLinkData$1.label = 1;
                    obj = JobKt.withContext((CoroutineContext) assetPublicSuffixList.path, new MainPaymentPresenter$models$4$4(assetPublicSuffixList, str, continuation, 9), paymentConfigurationPresenter$models$loadPayLinkData$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    RealPaymentConfigurationRouter realPaymentConfigurationRouter3 = paymentConfigurationPresenter$models$loadPayLinkData$1.L$3;
                    CoroutineScope coroutineScope3 = paymentConfigurationPresenter$models$loadPayLinkData$1.L$2;
                    MutableState mutableState3 = paymentConfigurationPresenter$models$loadPayLinkData$1.L$1;
                    PaymentConfigurationPresenter paymentConfigurationPresenter3 = paymentConfigurationPresenter$models$loadPayLinkData$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    realPaymentConfigurationRouter2 = realPaymentConfigurationRouter3;
                    coroutineScope2 = coroutineScope3;
                    paymentConfigurationPresenter2 = paymentConfigurationPresenter3;
                    mutableState2 = mutableState3;
                }
                paymentLinkRepository$GetPayLinkDataResult = (PaymentLinkRepository$GetPayLinkDataResult) obj;
                if (!(paymentLinkRepository$GetPayLinkDataResult instanceof PaymentLinkRepository$GetPayLinkDataResult.Success)) {
                    PaymentLinkRepository$GetPayLinkDataResult.Success success = (PaymentLinkRepository$GetPayLinkDataResult.Success) paymentLinkRepository$GetPayLinkDataResult;
                    models$nextStep(coroutineScope2, realPaymentConfigurationRouter2, mutableState2, PaymentRouterData.copy$default((PaymentRouterData) mutableState2.getValue(), paymentConfigurationPresenter2.toRecipientViewModel(success.recipient), success.note, success.amount, false, false, false, null, null, false, null, false, false, null, null, null, null, null, null, false, 16711657));
                } else if (paymentLinkRepository$GetPayLinkDataResult instanceof PaymentLinkRepository$GetPayLinkDataResult.OwnLink) {
                    mutableState2.setValue(PaymentRouterData.copy$default((PaymentRouterData) mutableState2.getValue(), null, null, null, false, false, false, null, null, false, null, false, false, null, PaymentConfigurationViewModel.Loading.LoadingStatus.OpenedOwnLink.INSTANCE, null, null, null, null, false, 16711679));
                } else {
                    if (!(paymentLinkRepository$GetPayLinkDataResult instanceof PaymentLinkRepository$GetPayLinkDataResult.Failed)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    mutableState2.setValue(PaymentRouterData.copy$default((PaymentRouterData) mutableState2.getValue(), null, null, null, false, false, false, null, null, false, null, false, false, null, PaymentConfigurationViewModel.Loading.LoadingStatus.Errored.INSTANCE, null, null, null, null, false, 16711679));
                }
                return Unit.INSTANCE;
            }
        }
        paymentConfigurationPresenter$models$loadPayLinkData$1 = new PaymentConfigurationPresenter$models$loadPayLinkData$1(continuationImpl);
        Object obj2 = paymentConfigurationPresenter$models$loadPayLinkData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentConfigurationPresenter$models$loadPayLinkData$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        paymentLinkRepository$GetPayLinkDataResult = (PaymentLinkRepository$GetPayLinkDataResult) obj2;
        if (!(paymentLinkRepository$GetPayLinkDataResult instanceof PaymentLinkRepository$GetPayLinkDataResult.Success)) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[LOOP:0: B:18:0x00aa->B:40:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$models$loadStablecoinQrScanOptions(PaymentConfigurationPresenter paymentConfigurationPresenter, MutableState mutableState, CoroutineScope coroutineScope, RealPaymentConfigurationRouter realPaymentConfigurationRouter, String str, ContinuationImpl continuationImpl) {
        PaymentConfigurationPresenter$models$loadStablecoinQrScanOptions$1 paymentConfigurationPresenter$models$loadStablecoinQrScanOptions$1;
        int i;
        RealPaymentConfigurationRouter realPaymentConfigurationRouter2;
        MutableState mutableState2;
        CoroutineScope coroutineScope2;
        boolean z;
        PaymentConfigurationPresenter paymentConfigurationPresenter2 = paymentConfigurationPresenter;
        if (continuationImpl instanceof PaymentConfigurationPresenter$models$loadStablecoinQrScanOptions$1) {
            paymentConfigurationPresenter$models$loadStablecoinQrScanOptions$1 = (PaymentConfigurationPresenter$models$loadStablecoinQrScanOptions$1) continuationImpl;
            int i2 = paymentConfigurationPresenter$models$loadStablecoinQrScanOptions$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                paymentConfigurationPresenter$models$loadStablecoinQrScanOptions$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = paymentConfigurationPresenter$models$loadStablecoinQrScanOptions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentConfigurationPresenter$models$loadStablecoinQrScanOptions$1.label;
                Money money = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    StablecoinNetworkRepo stablecoinNetworkRepo = paymentConfigurationPresenter2.stablecoinNetworkRepo;
                    InputSource inputSource = InputSource.INPUT_SOURCE_QR_CODE_SCANNER;
                    paymentConfigurationPresenter$models$loadStablecoinQrScanOptions$1.L$0 = paymentConfigurationPresenter2;
                    paymentConfigurationPresenter$models$loadStablecoinQrScanOptions$1.L$1 = mutableState;
                    paymentConfigurationPresenter$models$loadStablecoinQrScanOptions$1.L$2 = coroutineScope;
                    realPaymentConfigurationRouter2 = realPaymentConfigurationRouter;
                    paymentConfigurationPresenter$models$loadStablecoinQrScanOptions$1.L$3 = realPaymentConfigurationRouter2;
                    paymentConfigurationPresenter$models$loadStablecoinQrScanOptions$1.label = 1;
                    obj = stablecoinNetworkRepo.getWithdrawalOptions(str, inputSource, paymentConfigurationPresenter$models$loadStablecoinQrScanOptions$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    mutableState2 = mutableState;
                    coroutineScope2 = coroutineScope;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    RealPaymentConfigurationRouter realPaymentConfigurationRouter3 = paymentConfigurationPresenter$models$loadStablecoinQrScanOptions$1.L$3;
                    coroutineScope2 = paymentConfigurationPresenter$models$loadStablecoinQrScanOptions$1.L$2;
                    mutableState2 = paymentConfigurationPresenter$models$loadStablecoinQrScanOptions$1.L$1;
                    PaymentConfigurationPresenter paymentConfigurationPresenter3 = paymentConfigurationPresenter$models$loadStablecoinQrScanOptions$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    realPaymentConfigurationRouter2 = realPaymentConfigurationRouter3;
                    paymentConfigurationPresenter2 = paymentConfigurationPresenter3;
                }
                StablecoinNetworksResult stablecoinNetworksResult = (StablecoinNetworksResult) obj;
                z = stablecoinNetworksResult instanceof StablecoinNetworksResult.Success;
                PaymentConfigurationViewModel.Loading.LoadingStatus.Errored errored = PaymentConfigurationViewModel.Loading.LoadingStatus.Errored.INSTANCE;
                if (!z) {
                    StablecoinNetworksResult.Success success = (StablecoinNetworksResult.Success) stablecoinNetworksResult;
                    List list = success.options;
                    if (list.isEmpty()) {
                        mutableState2.setValue(PaymentRouterData.copy$default((PaymentRouterData) mutableState2.getValue(), null, null, null, false, false, false, null, null, false, null, false, false, null, errored, null, null, null, null, false, 16711679));
                        return Unit.INSTANCE;
                    }
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        StablecoinWithdrawalOption stablecoinWithdrawalOption = (StablecoinWithdrawalOption) it.next();
                        stablecoinWithdrawalOption.getClass();
                        Money money2 = stablecoinWithdrawalOption.amount;
                        if (money2 != null) {
                            Long l = money2.amount;
                            if ((l != null ? l.longValue() : 0L) > 0) {
                                if (money2 == null) {
                                    money = money2;
                                    break;
                                }
                            }
                        }
                        money2 = null;
                        if (money2 == null) {
                        }
                    }
                    PaymentRouterData paymentRouterData = (PaymentRouterData) mutableState2.getValue();
                    if (money == null) {
                        money = ((PaymentRouterData) mutableState2.getValue()).amount;
                    }
                    PaymentRouterData copy$default = PaymentRouterData.copy$default(paymentRouterData, null, null, money, false, false, false, null, null, false, null, false, false, null, null, null, success.options, null, null, false, 15663087);
                    if (list.size() == 1) {
                        copy$default = PaymentRouterData.copy$default(copy$default, zzahh.toRecipientViewModel((StablecoinWithdrawalOption) CollectionsKt.single(list)), null, null, false, false, false, null, null, false, null, false, false, null, null, null, null, null, null, false, 16777213);
                    }
                    models$nextStep(coroutineScope2, realPaymentConfigurationRouter2, mutableState2, copy$default);
                } else if (stablecoinNetworksResult instanceof StablecoinNetworksResult.NeedsPlasmaFlow) {
                    FlowStarter flowStarter = paymentConfigurationPresenter2.flowStarter;
                    PaymentScreens.PaymentConfiguration paymentConfiguration = paymentConfigurationPresenter2.args;
                    Screen screen = paymentConfiguration.exitScreen;
                    if (screen == null) {
                        screen = PaymentScreens$HomeScreens$PaymentPad.INSTANCE;
                    }
                    paymentConfigurationPresenter2.navigator.goTo(paymentConfigurationPresenter2.blockersDataNavigator.getNext(paymentConfiguration, OtelConventions.startPlasmaClientScenarioFlow(flowStarter, screen, ((StablecoinNetworksResult.NeedsPlasmaFlow) stablecoinNetworksResult).responseContext, paymentConfigurationPresenter2.flowToken)));
                } else {
                    if (!(stablecoinNetworksResult instanceof StablecoinNetworksResult.Error)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    mutableState2.setValue(PaymentRouterData.copy$default((PaymentRouterData) mutableState2.getValue(), null, null, null, false, false, false, null, null, false, null, false, false, null, errored, null, null, null, null, false, 16711679));
                }
                return Unit.INSTANCE;
            }
        }
        paymentConfigurationPresenter$models$loadStablecoinQrScanOptions$1 = new PaymentConfigurationPresenter$models$loadStablecoinQrScanOptions$1(continuationImpl);
        Object obj2 = paymentConfigurationPresenter$models$loadStablecoinQrScanOptions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentConfigurationPresenter$models$loadStablecoinQrScanOptions$1.label;
        Money money3 = null;
        if (i != 0) {
        }
        StablecoinNetworksResult stablecoinNetworksResult2 = (StablecoinNetworksResult) obj2;
        z = stablecoinNetworksResult2 instanceof StablecoinNetworksResult.Success;
        PaymentConfigurationViewModel.Loading.LoadingStatus.Errored errored2 = PaymentConfigurationViewModel.Loading.LoadingStatus.Errored.INSTANCE;
        if (!z) {
        }
        return Unit.INSTANCE;
    }

    public static final boolean models$lambda$1(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    public static final StandaloneCoroutine models$nextStep(CoroutineScope coroutineScope, RealPaymentConfigurationRouter realPaymentConfigurationRouter, MutableState mutableState, PaymentRouterData paymentRouterData) {
        return JobKt.launch$default(coroutineScope, null, null, new MainPaymentPresenter$models$4$4(realPaymentConfigurationRouter, paymentRouterData, mutableState, null, 25), 3);
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        boolean z;
        MutableState mutableState;
        MutableState mutableState2;
        Object obj;
        boolean z2;
        CoroutineScope coroutineScope;
        RealPaymentConfigurationRouter realPaymentConfigurationRouter;
        StaticProvidableCompositionLocal staticProvidableCompositionLocal;
        Object obj2;
        final RealPaymentConfigurationRouter realPaymentConfigurationRouter2;
        CoroutineScope coroutineScope2;
        MutableStateFlow mutableStateFlow;
        RealPaymentConfigurationRouter realPaymentConfigurationRouter3;
        MutableState mutableState3;
        int i2;
        GapComposer gapComposer;
        MutableState mutableState4;
        MutableState mutableState5;
        Continuation continuation;
        MutableState mutableState6;
        Continuation continuation2;
        Continuation continuation3;
        MutableState mutableState7;
        CoroutineScope coroutineScope3;
        RealPaymentConfigurationRouter realPaymentConfigurationRouter4;
        boolean z3;
        Object paymentConfigurationPresenter$models$26$1;
        boolean z4;
        Object androidFileSaver$save$2;
        final PaymentConfigurationPresenter paymentConfigurationPresenter = this;
        flow.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startReplaceGroup(-1933433624);
        Object rememberedValue = gapComposer2.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj3 = rememberedValue;
        if (rememberedValue == neverEqualPolicy) {
            CoroutineScope createCompositionCoroutineScope = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
            gapComposer2.updateRememberedValue(createCompositionCoroutineScope);
            obj3 = createCompositionCoroutineScope;
        }
        final CoroutineScope coroutineScope4 = (CoroutineScope) obj3;
        Object rememberedValue2 = gapComposer2.rememberedValue();
        Object obj4 = rememberedValue2;
        if (rememberedValue2 == neverEqualPolicy) {
            Flow granted = paymentConfigurationPresenter.contactsPermission.granted();
            gapComposer2.updateRememberedValue(granted);
            obj4 = granted;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) obj4, Boolean.TRUE, null, gapComposer2, 48, 2);
        Object rememberedValue3 = gapComposer2.rememberedValue();
        Object obj5 = rememberedValue3;
        if (rememberedValue3 == neverEqualPolicy) {
            EnumEntries entries = CashInstrumentType.getEntries();
            ArrayList arrayList = new ArrayList();
            for (Object obj6 : entries) {
                CashInstrumentType cashInstrumentType = (CashInstrumentType) obj6;
                if (cashInstrumentType != CashInstrumentType.CASH_BALANCE && cashInstrumentType != CashInstrumentType.BANK_ACCOUNT) {
                    arrayList.add(obj6);
                }
            }
            CashInstrumentType[] cashInstrumentTypeArr = (CashInstrumentType[]) arrayList.toArray(new CashInstrumentType[0]);
            Flow forTypes = paymentConfigurationPresenter.instrumentManager.forTypes((CashInstrumentType[]) Arrays.copyOf(cashInstrumentTypeArr, cashInstrumentTypeArr.length));
            gapComposer2.updateRememberedValue(forTypes);
            obj5 = forTypes;
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) obj5, null, null, gapComposer2, 48, 2);
        Object[] objArr = new Object[0];
        boolean changedInstance = gapComposer2.changedInstance(paymentConfigurationPresenter);
        Object rememberedValue4 = gapComposer2.rememberedValue();
        int i3 = 26;
        Object obj7 = rememberedValue4;
        if (changedInstance || rememberedValue4 == neverEqualPolicy) {
            MoneyTabUIKt$$ExternalSyntheticLambda5 moneyTabUIKt$$ExternalSyntheticLambda5 = new MoneyTabUIKt$$ExternalSyntheticLambda5(paymentConfigurationPresenter, i3);
            gapComposer2.updateRememberedValue(moneyTabUIKt$$ExternalSyntheticLambda5);
            obj7 = moneyTabUIKt$$ExternalSyntheticLambda5;
        }
        MutableState mutableState8 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) obj7, gapComposer2, 0);
        Object rememberedValue5 = gapComposer2.rememberedValue();
        Object obj8 = rememberedValue5;
        if (rememberedValue5 == neverEqualPolicy) {
            ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer2.updateRememberedValue(mutableStateOf$default);
            obj8 = mutableStateOf$default;
        }
        MutableState mutableState9 = (MutableState) obj8;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance2 = gapComposer2.changedInstance(paymentConfigurationPresenter);
        Object rememberedValue6 = gapComposer2.rememberedValue();
        Continuation continuation4 = null;
        Object obj9 = rememberedValue6;
        if (changedInstance2 || rememberedValue6 == neverEqualPolicy) {
            MainPaymentPresenter$models$4$4 mainPaymentPresenter$models$4$4 = new MainPaymentPresenter$models$4$4(paymentConfigurationPresenter, mutableState9, continuation4, 24);
            gapComposer2.updateRememberedValue(mainPaymentPresenter$models$4$4);
            obj9 = mainPaymentPresenter$models$4$4;
        }
        Updater.LaunchedEffect(gapComposer2, unit, (Function2) obj9);
        Object rememberedValue7 = gapComposer2.rememberedValue();
        Object obj10 = rememberedValue7;
        if (rememberedValue7 == neverEqualPolicy) {
            Boolean valueOf = Boolean.valueOf(((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) paymentConfigurationPresenter.featureFlagManager).currentValue(AmplitudeExperiments$CoreFlowContactSyncUpsell.INSTANCE)).enabled());
            gapComposer2.updateRememberedValue(valueOf);
            obj10 = valueOf;
        }
        boolean booleanValue = ((Boolean) obj10).booleanValue();
        Object rememberedValue8 = gapComposer2.rememberedValue();
        Object obj11 = rememberedValue8;
        if (rememberedValue8 == neverEqualPolicy) {
            Flow hasPassedIdv = paymentConfigurationPresenter.statusAndLimitsManager.hasPassedIdv();
            gapComposer2.updateRememberedValue(hasPassedIdv);
            obj11 = hasPassedIdv;
        }
        MutableState collectAsState3 = Updater.collectAsState((Flow) obj11, null, null, gapComposer2, 48, 2);
        Object rememberedValue9 = gapComposer2.rememberedValue();
        Object obj12 = rememberedValue9;
        if (rememberedValue9 == neverEqualPolicy) {
            FlowQuery$mapToList$$inlined$map$1 region = paymentConfigurationPresenter.profileManager.region();
            gapComposer2.updateRememberedValue(region);
            obj12 = region;
        }
        MutableState collectAsState4 = Updater.collectAsState((Flow) obj12, null, null, gapComposer2, 48, 2);
        Object rememberedValue10 = gapComposer2.rememberedValue();
        int i4 = 10;
        if (rememberedValue10 == neverEqualPolicy) {
            FinishSetupTileBadgeCounter finishSetupTileBadgeCounter = new FinishSetupTileBadgeCounter(i4, paymentConfigurationPresenter.featureEligibilityRepository.currentEligibleFeatures(), new EligibleFeature[]{EligibleFeature.RECURRING_P2P_PAYMENT_FEATURE_VISIBILITY});
            gapComposer2.updateRememberedValue(finishSetupTileBadgeCounter);
            rememberedValue10 = finishSetupTileBadgeCounter;
        }
        MutableState collectAsState5 = Updater.collectAsState((Flow) rememberedValue10, null, null, gapComposer2, 48, 2);
        Object rememberedValue11 = gapComposer2.rememberedValue();
        Object obj13 = rememberedValue11;
        if (rememberedValue11 == neverEqualPolicy) {
            StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow("");
            gapComposer2.updateRememberedValue(MutableStateFlow);
            obj13 = MutableStateFlow;
        }
        MutableStateFlow mutableStateFlow2 = (MutableStateFlow) obj13;
        Object[] objArr2 = new Object[0];
        boolean changedInstance3 = gapComposer2.changedInstance(paymentConfigurationPresenter) | gapComposer2.changed(collectAsState);
        Object rememberedValue12 = gapComposer2.rememberedValue();
        Object obj14 = rememberedValue12;
        if (changedInstance3 || rememberedValue12 == neverEqualPolicy) {
            OffersHomeV2Kt$$ExternalSyntheticLambda7 offersHomeV2Kt$$ExternalSyntheticLambda7 = new OffersHomeV2Kt$$ExternalSyntheticLambda7(i3, paymentConfigurationPresenter, collectAsState);
            gapComposer2.updateRememberedValue(offersHomeV2Kt$$ExternalSyntheticLambda7);
            obj14 = offersHomeV2Kt$$ExternalSyntheticLambda7;
        }
        final MutableState mutableState10 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) obj14, gapComposer2, 0);
        Object[] objArr3 = new Object[0];
        Object rememberedValue13 = gapComposer2.rememberedValue();
        int i5 = 11;
        Object obj15 = rememberedValue13;
        if (rememberedValue13 == neverEqualPolicy) {
            MainPaymentViewKt$$ExternalSyntheticLambda0 mainPaymentViewKt$$ExternalSyntheticLambda0 = new MainPaymentViewKt$$ExternalSyntheticLambda0(i5);
            gapComposer2.updateRememberedValue(mainPaymentViewKt$$ExternalSyntheticLambda0);
            obj15 = mainPaymentViewKt$$ExternalSyntheticLambda0;
        }
        MutableState mutableState11 = (MutableState) SaverKt.rememberSaveable(objArr3, (Function0) obj15, gapComposer2, 48);
        PaymentScreens.PaymentConfiguration paymentConfiguration = paymentConfigurationPresenter.args;
        PaymentConfigurationFlow paymentConfigurationFlow = paymentConfiguration.paymentConfigurationFlow;
        paymentConfigurationFlow.getClass();
        PaymentFlowData data = paymentConfigurationFlow.getData();
        PaymentFlowData.StablecoinQrScanFlowData stablecoinQrScanFlowData = data instanceof PaymentFlowData.StablecoinQrScanFlowData ? (PaymentFlowData.StablecoinQrScanFlowData) data : null;
        String str = stablecoinQrScanFlowData != null ? stablecoinQrScanFlowData.scannedData : null;
        PaymentConfigurationFlow paymentConfigurationFlow2 = paymentConfiguration.paymentConfigurationFlow;
        boolean z5 = paymentConfigurationFlow2 instanceof PaymentConfigurationFlow.StablecoinQrScanFlow;
        boolean z6 = (paymentConfigurationFlow2 instanceof PaymentConfigurationFlow.Default) || z5;
        Object rememberedValue14 = gapComposer2.rememberedValue();
        Object obj16 = rememberedValue14;
        if (rememberedValue14 == neverEqualPolicy) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            gapComposer2.updateRememberedValue(linkedHashSet);
            obj16 = linkedHashSet;
        }
        Set set = (Set) obj16;
        Object rememberedValue15 = gapComposer2.rememberedValue();
        if (rememberedValue15 == neverEqualPolicy) {
            PaymentRouterData paymentRouterData = (PaymentRouterData) mutableState10.getValue();
            PaymentConfigurationStep paymentConfigurationStep = (PaymentConfigurationStep) mutableState11.getValue();
            paymentRouterData.getClass();
            zzlj zzljVar = paymentConfigurationPresenter.paymentConfigurationRouterFactory.delegateFactory;
            z = z6;
            FeatureFlagManager featureFlagManager = (FeatureFlagManager) ((DoubleCheck) zzljVar.zza).getValue();
            AndroidStringManager androidStringManager = (AndroidStringManager) ((LambdaProvider) zzljVar.zzb).lambda.invoke();
            AndroidClock androidClock = (AndroidClock) ((LambdaProvider) zzljVar.zzc).lambda.invoke();
            AndroidDateFormatManager androidDateFormatManager = (AndroidDateFormatManager) ((LambdaProvider) zzljVar.zze).lambda.invoke();
            ToolbarTuckTargets toolbarTuckTargets = (ToolbarTuckTargets) ((PersonalSetting.MetroFactory) zzljVar.zzd).invoke();
            LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) ((Provider) zzljVar.zzf).invoke();
            featureFlagManager.getClass();
            androidStringManager.getClass();
            androidClock.getClass();
            androidDateFormatManager.getClass();
            factory.getClass();
            rememberedValue15 = new RealPaymentConfigurationRouter(featureFlagManager, paymentRouterData, paymentConfigurationPresenter.navigator, paymentConfigurationStep, androidStringManager, androidClock, androidDateFormatManager, toolbarTuckTargets, factory);
            gapComposer2.updateRememberedValue(rememberedValue15);
        } else {
            z = z6;
        }
        final RealPaymentConfigurationRouter realPaymentConfigurationRouter5 = (RealPaymentConfigurationRouter) rememberedValue15;
        Object rememberedValue16 = gapComposer2.rememberedValue();
        Object obj17 = rememberedValue16;
        if (rememberedValue16 == neverEqualPolicy) {
            ReadonlyStateFlow readonlyStateFlow = realPaymentConfigurationRouter5.currentStep;
            gapComposer2.updateRememberedValue(readonlyStateFlow);
            obj17 = readonlyStateFlow;
        }
        String str2 = str;
        MutableState collectAsState6 = Updater.collectAsState((StateFlow) obj17, null, gapComposer2, 1);
        Object rememberedValue17 = gapComposer2.rememberedValue();
        Object obj18 = rememberedValue17;
        if (rememberedValue17 == neverEqualPolicy) {
            ReadonlyStateFlow readonlyStateFlow2 = realPaymentConfigurationRouter5.currentModel;
            gapComposer2.updateRememberedValue(readonlyStateFlow2);
            obj18 = readonlyStateFlow2;
        }
        Set set2 = set;
        MutableState collectAsState7 = Updater.collectAsState((StateFlow) obj18, null, gapComposer2, 1);
        PaymentConfigurationStep paymentConfigurationStep2 = (PaymentConfigurationStep) collectAsState6.getValue();
        boolean changed = gapComposer2.changed(mutableState11) | gapComposer2.changed(collectAsState6);
        Object rememberedValue18 = gapComposer2.rememberedValue();
        if (changed || rememberedValue18 == neverEqualPolicy) {
            mutableState = collectAsState;
            mutableState2 = collectAsState7;
            OffersHomePresenter$models$2$1 offersHomePresenter$models$2$1 = new OffersHomePresenter$models$2$1(collectAsState6, mutableState11, null, 11);
            gapComposer2.updateRememberedValue(offersHomePresenter$models$2$1);
            obj = offersHomePresenter$models$2$1;
        } else {
            mutableState = collectAsState;
            mutableState2 = collectAsState7;
            obj = rememberedValue18;
        }
        Updater.LaunchedEffect(gapComposer2, paymentConfigurationStep2, (Function2) obj);
        PaymentRouterData paymentRouterData2 = (PaymentRouterData) mutableState10.getValue();
        boolean changedInstance4 = gapComposer2.changedInstance(realPaymentConfigurationRouter5) | gapComposer2.changed(mutableState10);
        Object rememberedValue19 = gapComposer2.rememberedValue();
        Object obj19 = rememberedValue19;
        if (changedInstance4 || rememberedValue19 == neverEqualPolicy) {
            PaymentConfigurationPresenter$models$3$1 paymentConfigurationPresenter$models$3$1 = new PaymentConfigurationPresenter$models$3$1(realPaymentConfigurationRouter5, mutableState10, null, 0);
            gapComposer2.updateRememberedValue(paymentConfigurationPresenter$models$3$1);
            obj19 = paymentConfigurationPresenter$models$3$1;
        }
        Updater.LaunchedEffect(gapComposer2, paymentRouterData2, (Function2) obj19);
        Boolean bool = (Boolean) collectAsState5.getValue();
        boolean changed2 = gapComposer2.changed(collectAsState5) | gapComposer2.changed(mutableState10);
        Object rememberedValue20 = gapComposer2.rememberedValue();
        int i6 = 12;
        Object obj20 = rememberedValue20;
        if (changed2 || rememberedValue20 == neverEqualPolicy) {
            OffersHomePresenter$models$2$1 offersHomePresenter$models$2$12 = new OffersHomePresenter$models$2$1(collectAsState5, mutableState10, null, i6);
            gapComposer2.updateRememberedValue(offersHomePresenter$models$2$12);
            obj20 = offersHomePresenter$models$2$12;
        }
        Updater.LaunchedEffect(gapComposer2, bool, (Function2) obj20);
        int i7 = 2;
        if (((PaymentRouterData) mutableState10.getValue()).createLinkErrored) {
            gapComposer2.startReplaceGroup(889375322);
            boolean changedInstance5 = gapComposer2.changedInstance(paymentConfigurationPresenter) | gapComposer2.changed(mutableState10);
            Object rememberedValue21 = gapComposer2.rememberedValue();
            Object obj21 = rememberedValue21;
            if (changedInstance5 || rememberedValue21 == neverEqualPolicy) {
                AndroidFileSaver$save$2 androidFileSaver$save$22 = new AndroidFileSaver$save$2(paymentConfigurationPresenter, mutableState10, (Continuation) null, i7);
                gapComposer2.updateRememberedValue(androidFileSaver$save$22);
                obj21 = androidFileSaver$save$22;
            }
            Updater.LaunchedEffect(gapComposer2, unit, (Function2) obj21);
            gapComposer2.end(false);
        } else {
            gapComposer2.startReplaceGroup(889559834);
            gapComposer2.end(false);
        }
        boolean changed3 = gapComposer2.changed(mutableState10) | gapComposer2.changedInstance(paymentConfigurationPresenter);
        Object rememberedValue22 = gapComposer2.rememberedValue();
        Object obj22 = rememberedValue22;
        if (changed3 || rememberedValue22 == neverEqualPolicy) {
            MainPaymentView$Content$2$1 mainPaymentView$Content$2$1 = new MainPaymentView$Content$2$1(mutableState10, paymentConfigurationPresenter, null, 18);
            gapComposer2.updateRememberedValue(mainPaymentView$Content$2$1);
            obj22 = mainPaymentView$Content$2$1;
        }
        Updater.LaunchedEffect(gapComposer2, unit, (Function2) obj22);
        boolean changedInstance6 = gapComposer2.changedInstance(coroutineScope4) | gapComposer2.changedInstance(realPaymentConfigurationRouter5) | gapComposer2.changed(mutableState10) | gapComposer2.changedInstance(paymentConfigurationPresenter);
        Object rememberedValue23 = gapComposer2.rememberedValue();
        if (changedInstance6 || rememberedValue23 == neverEqualPolicy) {
            final int i8 = 0;
            z2 = z;
            Function2 function2 = new Function2(paymentConfigurationPresenter) { // from class: com.squareup.cash.payments.presenters.PaymentConfigurationPresenter$$ExternalSyntheticLambda3
                public final /* synthetic */ PaymentConfigurationPresenter f$0;

                {
                    this.f$0 = paymentConfigurationPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj23, Object obj24) {
                    int i9 = i8;
                    RealPaymentConfigurationRouter realPaymentConfigurationRouter6 = realPaymentConfigurationRouter5;
                    CoroutineScope coroutineScope5 = coroutineScope4;
                    MutableState mutableState12 = mutableState10;
                    PaymentConfigurationPresenter paymentConfigurationPresenter2 = this.f$0;
                    switch (i9) {
                        case 0:
                            PaymentScreens.DuplicatePayment.DuplicatePaymentResult duplicatePaymentResult = (PaymentScreens.DuplicatePayment.DuplicatePaymentResult) obj24;
                            ((PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion) obj23).getClass();
                            if (duplicatePaymentResult != null) {
                                PaymentConfigurationPresenter.models$nextStep(coroutineScope5, realPaymentConfigurationRouter6, mutableState12, PaymentRouterData.copy$default((PaymentRouterData) mutableState12.getValue(), paymentConfigurationPresenter2.toRecipientViewModel(duplicatePaymentResult.recipient), null, null, false, false, false, null, null, false, null, false, false, null, null, null, null, null, null, false, 16777213));
                            }
                            break;
                        default:
                            CashtagQrScanResult cashtagQrScanResult = (CashtagQrScanResult) obj24;
                            ((CashtagQrScanQuestion) obj23).getClass();
                            if (cashtagQrScanResult != null) {
                                paymentConfigurationPresenter2.analytics.track(new AssetSendAddRecipientFromQRCode(paymentConfigurationPresenter2.paymentToken.toString(), paymentConfigurationPresenter2.flowToken), null);
                                PaymentConfigurationPresenter.models$nextStep(coroutineScope5, realPaymentConfigurationRouter6, mutableState12, PaymentRouterData.copy$default((PaymentRouterData) mutableState12.getValue(), paymentConfigurationPresenter2.toRecipientViewModel(cashtagQrScanResult.recipient), null, null, false, false, false, null, null, false, null, false, false, null, null, null, null, null, null, false, 16777213));
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            coroutineScope = coroutineScope4;
            realPaymentConfigurationRouter = realPaymentConfigurationRouter5;
            mutableState10 = mutableState10;
            gapComposer2.updateRememberedValue(function2);
            rememberedValue23 = function2;
        } else {
            realPaymentConfigurationRouter = realPaymentConfigurationRouter5;
            z2 = z;
            coroutineScope = coroutineScope4;
        }
        Function2 function22 = (Function2) rememberedValue23;
        StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = AnswersKt.LocalAnswerDispatcher;
        AnswerDispatcher answerDispatcher = (AnswerDispatcher) gapComposer2.consume(staticProvidableCompositionLocal2);
        boolean changed4 = gapComposer2.changed(function22) | gapComposer2.changedInstance(answerDispatcher);
        Object rememberedValue24 = gapComposer2.rememberedValue();
        Object obj23 = rememberedValue24;
        if (changed4 || rememberedValue24 == neverEqualPolicy) {
            ArticlePresenter$models$$inlined$AnswerHandler$1 articlePresenter$models$$inlined$AnswerHandler$1 = new ArticlePresenter$models$$inlined$AnswerHandler$1(function22, answerDispatcher, i6);
            gapComposer2.updateRememberedValue(articlePresenter$models$$inlined$AnswerHandler$1);
            obj23 = articlePresenter$models$$inlined$AnswerHandler$1;
        }
        Updater.DisposableEffect(answerDispatcher, (Function1) obj23, gapComposer2);
        boolean changed5 = gapComposer2.changed(collectAsState2) | gapComposer2.changedInstance(paymentConfigurationPresenter) | gapComposer2.changed(mutableState10) | gapComposer2.changed(mutableState8);
        Object rememberedValue25 = gapComposer2.rememberedValue();
        if (changed5 || rememberedValue25 == neverEqualPolicy) {
            staticProvidableCompositionLocal = staticProvidableCompositionLocal2;
            PoolGoalMetKt$$ExternalSyntheticLambda0 poolGoalMetKt$$ExternalSyntheticLambda0 = new PoolGoalMetKt$$ExternalSyntheticLambda0(paymentConfigurationPresenter, collectAsState2, mutableState10, mutableState8, 7);
            gapComposer2.updateRememberedValue(poolGoalMetKt$$ExternalSyntheticLambda0);
            rememberedValue25 = poolGoalMetKt$$ExternalSyntheticLambda0;
        } else {
            staticProvidableCompositionLocal = staticProvidableCompositionLocal2;
        }
        Function2 function23 = (Function2) rememberedValue25;
        AnswerDispatcher answerDispatcher2 = (AnswerDispatcher) gapComposer2.consume(staticProvidableCompositionLocal);
        boolean changed6 = gapComposer2.changed(function23) | gapComposer2.changedInstance(answerDispatcher2);
        Object rememberedValue26 = gapComposer2.rememberedValue();
        Object obj24 = rememberedValue26;
        if (changed6 || rememberedValue26 == neverEqualPolicy) {
            ArticlePresenter$models$$inlined$AnswerHandler$1 articlePresenter$models$$inlined$AnswerHandler$12 = new ArticlePresenter$models$$inlined$AnswerHandler$1(function23, answerDispatcher2, 13);
            gapComposer2.updateRememberedValue(articlePresenter$models$$inlined$AnswerHandler$12);
            obj24 = articlePresenter$models$$inlined$AnswerHandler$12;
        }
        Updater.DisposableEffect(answerDispatcher2, (Function1) obj24, gapComposer2);
        boolean changed7 = gapComposer2.changed(mutableState10) | gapComposer2.changed(mutableState8);
        Object rememberedValue27 = gapComposer2.rememberedValue();
        if (changed7 || rememberedValue27 == neverEqualPolicy) {
            BitcoinDepositsPresenter$$ExternalSyntheticLambda2 bitcoinDepositsPresenter$$ExternalSyntheticLambda2 = new BitcoinDepositsPresenter$$ExternalSyntheticLambda2(mutableState10, mutableState8, 1);
            gapComposer2.updateRememberedValue(bitcoinDepositsPresenter$$ExternalSyntheticLambda2);
            obj2 = bitcoinDepositsPresenter$$ExternalSyntheticLambda2;
        } else {
            obj2 = rememberedValue27;
        }
        Function2 function24 = (Function2) obj2;
        AnswerDispatcher answerDispatcher3 = (AnswerDispatcher) gapComposer2.consume(staticProvidableCompositionLocal);
        boolean changed8 = gapComposer2.changed(function24) | gapComposer2.changedInstance(answerDispatcher3);
        Object rememberedValue28 = gapComposer2.rememberedValue();
        Object obj25 = rememberedValue28;
        if (changed8 || rememberedValue28 == neverEqualPolicy) {
            ArticlePresenter$models$$inlined$AnswerHandler$1 articlePresenter$models$$inlined$AnswerHandler$13 = new ArticlePresenter$models$$inlined$AnswerHandler$1(function24, answerDispatcher3, 14);
            gapComposer2.updateRememberedValue(articlePresenter$models$$inlined$AnswerHandler$13);
            obj25 = articlePresenter$models$$inlined$AnswerHandler$13;
        }
        Updater.DisposableEffect(answerDispatcher3, (Function1) obj25, gapComposer2);
        boolean changedInstance7 = gapComposer2.changedInstance(paymentConfigurationPresenter) | gapComposer2.changedInstance(coroutineScope) | gapComposer2.changedInstance(realPaymentConfigurationRouter) | gapComposer2.changed(mutableState10);
        Object rememberedValue29 = gapComposer2.rememberedValue();
        if (changedInstance7 || rememberedValue29 == neverEqualPolicy) {
            final int i9 = 1;
            final MutableState mutableState12 = mutableState10;
            final CoroutineScope coroutineScope5 = coroutineScope;
            realPaymentConfigurationRouter2 = realPaymentConfigurationRouter;
            Function2 function25 = new Function2(paymentConfigurationPresenter) { // from class: com.squareup.cash.payments.presenters.PaymentConfigurationPresenter$$ExternalSyntheticLambda3
                public final /* synthetic */ PaymentConfigurationPresenter f$0;

                {
                    this.f$0 = paymentConfigurationPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj232, Object obj242) {
                    int i92 = i9;
                    RealPaymentConfigurationRouter realPaymentConfigurationRouter6 = realPaymentConfigurationRouter2;
                    CoroutineScope coroutineScope52 = coroutineScope5;
                    MutableState mutableState122 = mutableState12;
                    PaymentConfigurationPresenter paymentConfigurationPresenter2 = this.f$0;
                    switch (i92) {
                        case 0:
                            PaymentScreens.DuplicatePayment.DuplicatePaymentResult duplicatePaymentResult = (PaymentScreens.DuplicatePayment.DuplicatePaymentResult) obj242;
                            ((PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion) obj232).getClass();
                            if (duplicatePaymentResult != null) {
                                PaymentConfigurationPresenter.models$nextStep(coroutineScope52, realPaymentConfigurationRouter6, mutableState122, PaymentRouterData.copy$default((PaymentRouterData) mutableState122.getValue(), paymentConfigurationPresenter2.toRecipientViewModel(duplicatePaymentResult.recipient), null, null, false, false, false, null, null, false, null, false, false, null, null, null, null, null, null, false, 16777213));
                            }
                            break;
                        default:
                            CashtagQrScanResult cashtagQrScanResult = (CashtagQrScanResult) obj242;
                            ((CashtagQrScanQuestion) obj232).getClass();
                            if (cashtagQrScanResult != null) {
                                paymentConfigurationPresenter2.analytics.track(new AssetSendAddRecipientFromQRCode(paymentConfigurationPresenter2.paymentToken.toString(), paymentConfigurationPresenter2.flowToken), null);
                                PaymentConfigurationPresenter.models$nextStep(coroutineScope52, realPaymentConfigurationRouter6, mutableState122, PaymentRouterData.copy$default((PaymentRouterData) mutableState122.getValue(), paymentConfigurationPresenter2.toRecipientViewModel(cashtagQrScanResult.recipient), null, null, false, false, false, null, null, false, null, false, false, null, null, null, null, null, null, false, 16777213));
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            coroutineScope2 = coroutineScope5;
            mutableState10 = mutableState12;
            gapComposer2.updateRememberedValue(function25);
            rememberedValue29 = function25;
        } else {
            realPaymentConfigurationRouter2 = realPaymentConfigurationRouter;
            coroutineScope2 = coroutineScope;
        }
        Function2 function26 = (Function2) rememberedValue29;
        AnswerDispatcher answerDispatcher4 = (AnswerDispatcher) gapComposer2.consume(staticProvidableCompositionLocal);
        boolean changed9 = gapComposer2.changed(function26) | gapComposer2.changedInstance(answerDispatcher4);
        Object rememberedValue30 = gapComposer2.rememberedValue();
        Object obj26 = rememberedValue30;
        if (changed9 || rememberedValue30 == neverEqualPolicy) {
            ArticlePresenter$models$$inlined$AnswerHandler$1 articlePresenter$models$$inlined$AnswerHandler$14 = new ArticlePresenter$models$$inlined$AnswerHandler$1(function26, answerDispatcher4, 15);
            gapComposer2.updateRememberedValue(articlePresenter$models$$inlined$AnswerHandler$14);
            obj26 = articlePresenter$models$$inlined$AnswerHandler$14;
        }
        Updater.DisposableEffect(answerDispatcher4, (Function1) obj26, gapComposer2);
        boolean changedInstance8 = gapComposer2.changedInstance(paymentConfigurationPresenter) | gapComposer2.changed(mutableState10);
        Object rememberedValue31 = gapComposer2.rememberedValue();
        int i10 = 20;
        Object obj27 = rememberedValue31;
        if (changedInstance8 || rememberedValue31 == neverEqualPolicy) {
            PaycheckCirclesKt$$ExternalSyntheticLambda3 paycheckCirclesKt$$ExternalSyntheticLambda3 = new PaycheckCirclesKt$$ExternalSyntheticLambda3(i10, paymentConfigurationPresenter, mutableState10);
            gapComposer2.updateRememberedValue(paycheckCirclesKt$$ExternalSyntheticLambda3);
            obj27 = paycheckCirclesKt$$ExternalSyntheticLambda3;
        }
        Function2 function27 = (Function2) obj27;
        AnswerDispatcher answerDispatcher5 = (AnswerDispatcher) gapComposer2.consume(staticProvidableCompositionLocal);
        boolean changed10 = gapComposer2.changed(function27) | gapComposer2.changedInstance(answerDispatcher5);
        Object rememberedValue32 = gapComposer2.rememberedValue();
        int i11 = 16;
        Object obj28 = rememberedValue32;
        if (changed10 || rememberedValue32 == neverEqualPolicy) {
            ArticlePresenter$models$$inlined$AnswerHandler$1 articlePresenter$models$$inlined$AnswerHandler$15 = new ArticlePresenter$models$$inlined$AnswerHandler$1(function27, answerDispatcher5, i11);
            gapComposer2.updateRememberedValue(articlePresenter$models$$inlined$AnswerHandler$15);
            obj28 = articlePresenter$models$$inlined$AnswerHandler$15;
        }
        Updater.DisposableEffect(answerDispatcher5, (Function1) obj28, gapComposer2);
        InstrumentSelection instrumentSelection = (InstrumentSelection) mutableState8.getValue();
        Boolean valueOf2 = Boolean.valueOf(((PaymentConfigurationViewModel) mutableState2.getValue()) instanceof RecipientSelectedStep);
        Money money = ((PaymentRouterData) mutableState10.getValue()).amount;
        Boolean bool2 = (Boolean) mutableState9.getValue();
        bool2.getClass();
        Object[] objArr4 = {instrumentSelection, valueOf2, money, bool2, ((PaymentRouterData) mutableState10.getValue()).scheduleSelection};
        MutableState mutableState13 = mutableState2;
        boolean changedInstance9 = gapComposer2.changedInstance(paymentConfigurationPresenter) | gapComposer2.changed(mutableState13) | gapComposer2.changed(mutableState10) | gapComposer2.changed(mutableState8);
        Object rememberedValue33 = gapComposer2.rememberedValue();
        if (changedInstance9 || rememberedValue33 == neverEqualPolicy) {
            mutableStateFlow = mutableStateFlow2;
            realPaymentConfigurationRouter3 = realPaymentConfigurationRouter2;
            mutableState3 = collectAsState2;
            i2 = 48;
            gapComposer = gapComposer2;
            PoolsListPresenter$models$2$2 poolsListPresenter$models$2$2 = new PoolsListPresenter$models$2$2(paymentConfigurationPresenter, mutableState13, mutableState10, mutableState8, mutableState9, null, 3);
            mutableState4 = mutableState13;
            gapComposer.updateRememberedValue(poolsListPresenter$models$2$2);
            rememberedValue33 = poolsListPresenter$models$2$2;
        } else {
            mutableStateFlow = mutableStateFlow2;
            mutableState4 = mutableState13;
            realPaymentConfigurationRouter3 = realPaymentConfigurationRouter2;
            gapComposer = gapComposer2;
            mutableState3 = collectAsState2;
            i2 = 48;
        }
        Updater.LaunchedEffect(objArr4, (Function2) rememberedValue33, gapComposer);
        Object[] objArr5 = new Object[0];
        Object rememberedValue34 = gapComposer.rememberedValue();
        if (rememberedValue34 == neverEqualPolicy) {
            rememberedValue34 = new MainPaymentViewKt$$ExternalSyntheticLambda0(12);
            gapComposer.updateRememberedValue(rememberedValue34);
        }
        MutableState mutableState14 = (MutableState) SaverKt.rememberSaveable(objArr5, (Function0) rememberedValue34, gapComposer, i2);
        MutableState mutableState15 = mutableState;
        boolean changed11 = gapComposer.changed(mutableState14) | gapComposer.changedInstance(paymentConfigurationPresenter) | gapComposer.changed(mutableState15);
        Object rememberedValue35 = gapComposer.rememberedValue();
        if (changed11 || rememberedValue35 == neverEqualPolicy) {
            rememberedValue35 = new PaymentConfigurationPresenter$models$13$1(paymentConfigurationPresenter, mutableState14, (State) mutableState15, (Continuation) null);
            gapComposer.updateRememberedValue(rememberedValue35);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue35);
        if (((PaymentConfigurationViewModel) mutableState4.getValue()) instanceof PaymentConfigurationViewModel.SelectRecipientMenu) {
            gapComposer.startReplaceGroup(897001570);
            boolean changedInstance10 = gapComposer.changedInstance(mutableStateFlow) | gapComposer.changedInstance(paymentConfigurationPresenter) | gapComposer.changed(mutableState10) | gapComposer.changed(collectAsState4) | gapComposer.changed(mutableState15);
            Object rememberedValue36 = gapComposer.rememberedValue();
            if (changedInstance10 || rememberedValue36 == neverEqualPolicy) {
                PoolsListPresenter$models$2$2 poolsListPresenter$models$2$22 = new PoolsListPresenter$models$2$2(mutableStateFlow, paymentConfigurationPresenter, mutableState10, collectAsState4, mutableState15, (Continuation) null);
                paymentConfigurationPresenter = paymentConfigurationPresenter;
                mutableState5 = mutableState15;
                gapComposer.updateRememberedValue(poolsListPresenter$models$2$22);
                rememberedValue36 = poolsListPresenter$models$2$22;
            } else {
                mutableState5 = mutableState15;
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue36);
            boolean changedInstance11 = gapComposer.changedInstance(paymentConfigurationPresenter) | gapComposer.changed(mutableState5);
            Object rememberedValue37 = gapComposer.rememberedValue();
            if (changedInstance11 || rememberedValue37 == neverEqualPolicy) {
                rememberedValue37 = new MainPaymentView$Content$2$1(paymentConfigurationPresenter, mutableState5, null, 16);
                gapComposer.updateRememberedValue(rememberedValue37);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue37);
            Boolean valueOf3 = Boolean.valueOf(models$lambda$1(mutableState5));
            boolean changed12 = gapComposer.changed(mutableState10) | gapComposer.changed(mutableState5);
            Object rememberedValue38 = gapComposer.rememberedValue();
            if (changed12 || rememberedValue38 == neverEqualPolicy) {
                rememberedValue38 = new OffersHomePresenter$models$2$1(mutableState10, mutableState5, null, 10);
                gapComposer.updateRememberedValue(rememberedValue38);
            }
            Updater.LaunchedEffect(gapComposer, valueOf3, (Function2) rememberedValue38);
            Object rememberedValue39 = gapComposer.rememberedValue();
            if (rememberedValue39 == neverEqualPolicy) {
                rememberedValue39 = Updater.derivedStateOf(new TransferSheetKt$$ExternalSyntheticLambda0(booleanValue, mutableState5, mutableState10, 2));
                gapComposer.updateRememberedValue(rememberedValue39);
            }
            State state = (State) rememberedValue39;
            Boolean bool3 = (Boolean) state.getValue();
            bool3.getClass();
            boolean changed13 = gapComposer.changed(mutableState10);
            Object rememberedValue40 = gapComposer.rememberedValue();
            if (changed13 || rememberedValue40 == neverEqualPolicy) {
                rememberedValue40 = new MainPaymentView$Content$2$1(mutableState10, state, null, 17);
                gapComposer.updateRememberedValue(rememberedValue40);
            }
            Updater.LaunchedEffect(gapComposer, bool3, (Function2) rememberedValue40);
            Object rememberedValue41 = gapComposer.rememberedValue();
            if (rememberedValue41 == neverEqualPolicy) {
                rememberedValue41 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue41);
            }
            MutableState mutableState16 = (MutableState) rememberedValue41;
            Boolean bool4 = (Boolean) state.getValue();
            bool4.getClass();
            boolean changedInstance12 = gapComposer.changedInstance(paymentConfigurationPresenter);
            Object rememberedValue42 = gapComposer.rememberedValue();
            if (changedInstance12 || rememberedValue42 == neverEqualPolicy) {
                continuation = null;
                rememberedValue42 = new PaymentConfigurationPresenter$models$13$1(paymentConfigurationPresenter, state, mutableState16, (Continuation) null);
                gapComposer.updateRememberedValue(rememberedValue42);
            } else {
                continuation = null;
            }
            Updater.LaunchedEffect(gapComposer, bool4, (Function2) rememberedValue42);
            gapComposer.end(false);
        } else {
            mutableState5 = mutableState15;
            continuation = null;
            gapComposer.startReplaceGroup(900868634);
            gapComposer.end(false);
        }
        if (((PaymentConfigurationViewModel) mutableState4.getValue()) instanceof PaymentConfigurationViewModel.SelectStablecoinWithdrawalOption) {
            gapComposer.startReplaceGroup(900967617);
            boolean changed14 = gapComposer.changed(mutableState10) | gapComposer.changedInstance(set2) | gapComposer.changedInstance(paymentConfigurationPresenter);
            Object rememberedValue43 = gapComposer.rememberedValue();
            if (changed14 || rememberedValue43 == neverEqualPolicy) {
                MutableState mutableState17 = mutableState10;
                PaymentConfigurationPresenter paymentConfigurationPresenter2 = paymentConfigurationPresenter;
                continuation2 = continuation;
                androidFileSaver$save$2 = new AndroidFileSaver$save$2(mutableState17, set2, paymentConfigurationPresenter2, continuation2, 1);
                mutableState6 = mutableState17;
                set2 = set2;
                paymentConfigurationPresenter = paymentConfigurationPresenter2;
                gapComposer.updateRememberedValue(androidFileSaver$save$2);
            } else {
                set2 = set2;
                mutableState6 = mutableState10;
                androidFileSaver$save$2 = rememberedValue43;
                continuation2 = continuation;
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) androidFileSaver$save$2);
            gapComposer.end(false);
        } else {
            mutableState6 = mutableState10;
            continuation2 = continuation;
            gapComposer.startReplaceGroup(901483674);
            gapComposer.end(false);
        }
        if ((((PaymentConfigurationViewModel) mutableState4.getValue()) instanceof PaymentConfigurationViewModel.InputAmount) && z5) {
            gapComposer.startReplaceGroup(901544279);
            boolean changedInstance13 = gapComposer.changedInstance(paymentConfigurationPresenter);
            Object rememberedValue44 = gapComposer.rememberedValue();
            if (changedInstance13 || rememberedValue44 == neverEqualPolicy) {
                z4 = false;
                rememberedValue44 = new PaymentConfigurationPresenter$models$20$1(paymentConfigurationPresenter, continuation2, false ? 1 : 0);
                gapComposer.updateRememberedValue(rememberedValue44);
            } else {
                z4 = false;
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue44);
            gapComposer.end(z4);
        } else {
            gapComposer.startReplaceGroup(901639418);
            gapComposer.end(false);
        }
        if (((PaymentConfigurationViewModel) mutableState4.getValue()) instanceof PaymentConfigurationViewModel.ReviewPayment) {
            gapComposer.startReplaceGroup(901703991);
            PaymentConfigurationViewModel paymentConfigurationViewModel = (PaymentConfigurationViewModel) mutableState4.getValue();
            paymentConfigurationViewModel.getClass();
            PaymentConfigurationViewModel.ReviewPayment reviewPayment = (PaymentConfigurationViewModel.ReviewPayment) paymentConfigurationViewModel;
            Boolean valueOf4 = Boolean.valueOf(z2);
            RecipientViewModel recipientViewModel = reviewPayment.recipient;
            boolean changed15 = gapComposer.changed(z2) | gapComposer.changedInstance(reviewPayment) | gapComposer.changedInstance(paymentConfigurationPresenter);
            Object rememberedValue45 = gapComposer.rememberedValue();
            if (changed15 || rememberedValue45 == neverEqualPolicy) {
                PaymentConfigurationPresenter paymentConfigurationPresenter3 = paymentConfigurationPresenter;
                RoomDatabase$performClear$1 roomDatabase$performClear$1 = new RoomDatabase$performClear$1(z2, reviewPayment, paymentConfigurationPresenter3, continuation2, 13);
                paymentConfigurationPresenter = paymentConfigurationPresenter3;
                continuation3 = continuation2;
                gapComposer.updateRememberedValue(roomDatabase$performClear$1);
                rememberedValue45 = roomDatabase$performClear$1;
            } else {
                continuation3 = continuation2;
            }
            Updater.LaunchedEffect(valueOf4, recipientViewModel, (Function2) rememberedValue45, gapComposer);
            boolean changedInstance14 = gapComposer.changedInstance(paymentConfigurationPresenter);
            Object rememberedValue46 = gapComposer.rememberedValue();
            if (changedInstance14 || rememberedValue46 == neverEqualPolicy) {
                rememberedValue46 = new MusicPresenter$models$3$1(paymentConfigurationPresenter, continuation3, 20);
                gapComposer.updateRememberedValue(rememberedValue46);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue46);
            gapComposer.end(false);
        } else {
            continuation3 = continuation2;
            gapComposer.startReplaceGroup(902660186);
            gapComposer.end(false);
        }
        if (((PaymentConfigurationViewModel) mutableState4.getValue()) instanceof PaymentConfigurationViewModel.InputNote) {
            gapComposer.startReplaceGroup(902697014);
            boolean changedInstance15 = gapComposer.changedInstance(paymentConfigurationPresenter);
            Object rememberedValue47 = gapComposer.rememberedValue();
            if (changedInstance15 || rememberedValue47 == neverEqualPolicy) {
                rememberedValue47 = new PaymentConfigurationPresenter$models$20$1(paymentConfigurationPresenter, continuation3, 1);
                gapComposer.updateRememberedValue(rememberedValue47);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue47);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(902916122);
            gapComposer.end(false);
        }
        if (((PaymentConfigurationViewModel) mutableState4.getValue()) instanceof PaymentConfigurationViewModel.RequestShareOption) {
            gapComposer.startReplaceGroup(902967179);
            boolean changedInstance16 = gapComposer.changedInstance(paymentConfigurationPresenter);
            Object rememberedValue48 = gapComposer.rememberedValue();
            if (changedInstance16 || rememberedValue48 == neverEqualPolicy) {
                rememberedValue48 = new PaymentConfigurationPresenter$models$20$1(paymentConfigurationPresenter, continuation3, 2);
                gapComposer.updateRememberedValue(rememberedValue48);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue48);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(903350618);
            gapComposer.end(false);
        }
        if (((PaymentConfigurationViewModel) mutableState4.getValue()) instanceof PaymentConfigurationViewModel.Loading) {
            gapComposer.startReplaceGroup(903385400);
            boolean changedInstance17 = gapComposer.changedInstance(paymentConfigurationPresenter);
            Object rememberedValue49 = gapComposer.rememberedValue();
            if (changedInstance17 || rememberedValue49 == neverEqualPolicy) {
                rememberedValue49 = new PaymentConfigurationPresenter$models$20$1(paymentConfigurationPresenter, continuation3, 3);
                gapComposer.updateRememberedValue(rememberedValue49);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue49);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(903602586);
            gapComposer.end(false);
        }
        if (((PaymentConfigurationViewModel) mutableState4.getValue()) instanceof PaymentConfigurationViewModel.Loading) {
            gapComposer.startReplaceGroup(906179368);
            realPaymentConfigurationRouter4 = realPaymentConfigurationRouter3;
            boolean changed16 = gapComposer.changed(mutableState6) | gapComposer.changedInstance(paymentConfigurationPresenter) | gapComposer.changedInstance(coroutineScope2) | gapComposer.changedInstance(realPaymentConfigurationRouter4);
            Object rememberedValue50 = gapComposer.rememberedValue();
            if (changed16 || rememberedValue50 == neverEqualPolicy) {
                PaymentConfigurationPresenter paymentConfigurationPresenter4 = paymentConfigurationPresenter;
                MutableState mutableState18 = mutableState6;
                coroutineScope3 = coroutineScope2;
                paymentConfigurationPresenter$models$26$1 = new PaymentConfigurationPresenter$models$26$1(mutableState18, paymentConfigurationPresenter4, coroutineScope3, realPaymentConfigurationRouter4, (Continuation) null);
                mutableState7 = mutableState18;
                paymentConfigurationPresenter = paymentConfigurationPresenter4;
                gapComposer.updateRememberedValue(paymentConfigurationPresenter$models$26$1);
            } else {
                paymentConfigurationPresenter$models$26$1 = rememberedValue50;
                mutableState7 = mutableState6;
                coroutineScope3 = coroutineScope2;
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) paymentConfigurationPresenter$models$26$1);
            PaymentConfigurationViewModel.Loading.LoadingStatus loadingStatus = ((PaymentRouterData) mutableState7.getValue()).loadingStatus;
            boolean changed17 = gapComposer.changed(z5);
            String str3 = str2;
            boolean changed18 = changed17 | gapComposer.changed(str3) | gapComposer.changed(mutableState7) | gapComposer.changedInstance(paymentConfigurationPresenter) | gapComposer.changedInstance(coroutineScope3) | gapComposer.changedInstance(realPaymentConfigurationRouter4);
            Object rememberedValue51 = gapComposer.rememberedValue();
            if (changed18 || rememberedValue51 == neverEqualPolicy) {
                CoroutineScope coroutineScope6 = coroutineScope3;
                MutableState mutableState19 = mutableState7;
                RealContactSync$syncRequest$2.AnonymousClass1 anonymousClass1 = new RealContactSync$syncRequest$2.AnonymousClass1(6, str3, mutableState19, this, coroutineScope6, realPaymentConfigurationRouter4, (Continuation) null, z5);
                str3 = str3;
                mutableState7 = mutableState19;
                coroutineScope3 = coroutineScope6;
                realPaymentConfigurationRouter4 = realPaymentConfigurationRouter4;
                gapComposer.updateRememberedValue(anonymousClass1);
                rememberedValue51 = anonymousClass1;
            }
            Updater.LaunchedEffect(str3, loadingStatus, (Function2) rememberedValue51, gapComposer);
            z3 = false;
            gapComposer.end(false);
        } else {
            mutableState7 = mutableState6;
            coroutineScope3 = coroutineScope2;
            realPaymentConfigurationRouter4 = realPaymentConfigurationRouter3;
            z3 = false;
            gapComposer.startReplaceGroup(906627194);
            gapComposer.end(false);
        }
        RealPaymentConfigurationRouter realPaymentConfigurationRouter6 = realPaymentConfigurationRouter4;
        GapComposer gapComposer3 = gapComposer;
        MutableState mutableState20 = mutableState4;
        Updater.LaunchedEffect(gapComposer3, flow, new LocalAddBrandsPresenter$models$2$1(flow, (Continuation) null, this, mutableStateFlow, mutableState20, mutableState7, realPaymentConfigurationRouter6, coroutineScope3, mutableState5, collectAsState3, mutableState3, set2));
        PaymentConfigurationViewModel paymentConfigurationViewModel2 = (PaymentConfigurationViewModel) mutableState20.getValue();
        gapComposer3.end(z3);
        return paymentConfigurationViewModel2;
    }

    public final RecipientViewModel toRecipientViewModel(Recipient recipient) {
        return UriKt.toRecipientViewModel(MathUtils.toRecipient(recipient), String.valueOf(recipient.customerId), Section.Type.RESULTS, Region.USA, this.stringManager, false, false);
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final Provider analytics;
        public final Provider appConfigManager;
        public final Provider askedContactsPaymentPreference;
        public final Provider balanceSnapshotManager;
        public final Provider blockersDataNavigator;
        public final Provider clipboardObserver;
        public final Provider clock;
        public final Provider contactsPermission;
        public final Provider cryptoFlowStarter;
        public final Provider draftStore;
        public final Provider featureEligibilityRepository;
        public final Provider featureFlagManager;
        public final Provider flowStarter;
        public final Provider googlePayPaymentsClient;
        public final Provider hasSeenStablecoinWithdrawalOnboarding;
        public final Provider instrumentManager;
        public final Provider instrumentRowLoader;
        public final Provider intentLauncher;
        public final Provider ioDispatcher;
        public final Provider moneyFormatterFactory;
        public final Provider networkInfo;
        public final Provider offlineManager;
        public final InstanceFactory paymentConfigurationRouterFactory;
        public final Provider paymentInitiator;
        public final Factory paymentLinkRepository;
        public final Provider personalizePaymentManager;
        public final Provider profileManager;
        public final Provider recipientRepository;
        public final Provider recipientSelectorTooltipSeenCount;
        public final Provider securitySignalsAggregator;
        public final Provider stablecoinNetworkRepo;
        public final Provider statusAndLimitsManager;
        public final Provider stringManager;
        public final Provider uuidGenerator;

        public MetroFactory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, Provider provider15, Provider provider16, Provider provider17, NavigationSideEffects.MetroFactory metroFactory, Provider provider18, Provider provider19, Provider provider20, Provider provider21, Provider provider22, Provider provider23, InstanceFactory instanceFactory, Provider provider24, Provider provider25, Provider provider26, Provider provider27, Provider provider28, Provider provider29, Provider provider30, Provider provider31, Provider provider32) {
            this.recipientRepository = provider;
            this.profileManager = provider2;
            this.stringManager = provider3;
            this.paymentInitiator = provider4;
            this.balanceSnapshotManager = provider5;
            this.intentLauncher = provider6;
            this.featureFlagManager = provider7;
            this.featureEligibilityRepository = provider8;
            this.googlePayPaymentsClient = provider9;
            this.instrumentRowLoader = provider10;
            this.instrumentManager = provider11;
            this.appConfigManager = provider12;
            this.analytics = provider13;
            this.networkInfo = provider14;
            this.statusAndLimitsManager = provider15;
            this.offlineManager = provider16;
            this.securitySignalsAggregator = provider17;
            this.paymentLinkRepository = metroFactory;
            this.stablecoinNetworkRepo = provider18;
            this.hasSeenStablecoinWithdrawalOnboarding = provider19;
            this.flowStarter = provider20;
            this.blockersDataNavigator = provider21;
            this.cryptoFlowStarter = provider22;
            this.clipboardObserver = provider23;
            this.paymentConfigurationRouterFactory = instanceFactory;
            this.askedContactsPaymentPreference = provider24;
            this.contactsPermission = provider25;
            this.ioDispatcher = provider26;
            this.clock = provider27;
            this.uuidGenerator = provider28;
            this.moneyFormatterFactory = provider29;
            this.personalizePaymentManager = provider30;
            this.recipientSelectorTooltipSeenCount = provider31;
            this.draftStore = provider32;
        }

        public MetroFactory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, InstanceFactory instanceFactory, Provider provider12, Provider provider13, Provider provider14, Provider provider15, Provider provider16, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5, Provider provider17, Provider provider18, Provider provider19, Provider provider20, Provider provider21, Provider provider22, Provider provider23, Provider provider24, Provider provider25, InstanceFactory instanceFactory6, Provider provider26, InstanceFactory instanceFactory7, Provider provider27) {
            this.recipientRepository = provider;
            this.profileManager = provider2;
            this.stringManager = provider3;
            this.paymentInitiator = provider4;
            this.balanceSnapshotManager = provider5;
            this.intentLauncher = provider6;
            this.featureFlagManager = provider7;
            this.featureEligibilityRepository = provider8;
            this.googlePayPaymentsClient = provider9;
            this.instrumentRowLoader = provider10;
            this.instrumentManager = provider11;
            this.paymentConfigurationRouterFactory = instanceFactory;
            this.appConfigManager = provider12;
            this.analytics = provider13;
            this.networkInfo = provider14;
            this.statusAndLimitsManager = provider15;
            this.offlineManager = provider16;
            this.uuidGenerator = instanceFactory2;
            this.moneyFormatterFactory = instanceFactory3;
            this.personalizePaymentManager = instanceFactory4;
            this.recipientSelectorTooltipSeenCount = instanceFactory5;
            this.securitySignalsAggregator = provider17;
            this.stablecoinNetworkRepo = provider18;
            this.hasSeenStablecoinWithdrawalOnboarding = provider19;
            this.flowStarter = provider20;
            this.blockersDataNavigator = provider21;
            this.cryptoFlowStarter = provider22;
            this.clipboardObserver = provider23;
            this.askedContactsPaymentPreference = provider24;
            this.contactsPermission = provider25;
            this.draftStore = instanceFactory6;
            this.ioDispatcher = provider26;
            this.paymentLinkRepository = instanceFactory7;
            this.clock = provider27;
        }
    }
}
