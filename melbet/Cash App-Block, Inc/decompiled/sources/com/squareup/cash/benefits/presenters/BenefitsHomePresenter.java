package com.squareup.cash.benefits.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.draw.RotateKt;
import androidx.core.text.TextUtilsCompat;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.mlkit.vision.common.zzb;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.presenters.ActivityEmbeddedPresenter$Companion;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.aiedge.MLKitTitleGenerator$1;
import com.squareup.cash.amountslider.AmountPickerCondensedView;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.banking.DisclosureForScreen;
import com.squareup.cash.banking.real.RealDisclosureProvider;
import com.squareup.cash.bankingbenefits.api.v1_0.app.RefreshCashGreenSyncValuesRequest;
import com.squareup.cash.benefits.components.presenters.BenefitsComparisonTablePresenter;
import com.squareup.cash.benefits.components.presenters.BenefitsComparisonTablePresenter$Factory$Impl;
import com.squareup.cash.benefits.components.viewmodels.BenefitsComparisonTableViewModel;
import com.squareup.cash.benefits.components.viewmodels.GreenStatus;
import com.squareup.cash.benefits.navigation.real.RealBenefitsOutboundNavigator$Factory$Impl;
import com.squareup.cash.benefits.utils.BankingBenefitsProtoParsingErrorFactory;
import com.squareup.cash.benefits.utils.ErrorReportingKt;
import com.squareup.cash.benefits.viewmodels.BenefitsHomeViewModel;
import com.squareup.cash.benefits.views.BenefitsHubViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.biometrics.AndroidSecureStore$read$2;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$special$$inlined$filter$1;
import com.squareup.cash.blockers.views.ErrorView$$ExternalSyntheticLambda0;
import com.squareup.cash.card.spendinginsights.activity.SpendingInsightsActivityRequestHandler;
import com.squareup.cash.card.spendinginsights.backend.api.model.SpendingInsightsConfig;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobileBankingEvergreenEligibleTransactionExperience;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobileBankingEvergreenProgressBar;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$GreenHubAdditionsCta;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.payments.presenters.AnalyticsHelperKt;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.spendinginsights.navigation.real.RealSpendingInsightsInboundNavigator$Factory$Impl;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.bankingbenefits.api.v1_0.BankingBenefitsAppService;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.RequestContext;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Instant;
import java.time.ZoneId;
import java.util.List;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.EmptyFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.bankingbenefits.ui.CashGreenV1;
import squareup.cash.bankingbenefits.ui.SpendPathProgress;
import squareup.cash.overdraft.OverdraftStatus;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class BenefitsHomePresenter implements MoleculePresenter, HasObservability {
    public final RealActivitiesCacheManager activityCacheManager;
    public final ActivityClientService activityClientService;
    public final RealActivityEmbeddedPresenter$Factory$Impl activityEmbeddedPresenterFactory;
    public final Analytics analytics;
    public final BankingBenefitsAppService benefitsAppService;
    public final zzb benefitsOutboundNavigator;
    public final BenefitsComparisonTablePresenter benefitsTablePresenter;
    public final AndroidDateFormatManager dateFormatManager;
    public final RealDisclosureProvider disclosureProvider;
    public final TimeZone easternTimeZone;
    public final ErrorReporter errorReporter;
    public final FeatureFlagManager featureFlagManager;
    public final MoneyFormatter moneyFormatter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final SampleStrategy oneErrorPerAppSessionStrategy;
    public final boolean progressBarAnimationEnabled;
    public final RealRouter router;
    public final SessionManager sessionManager;
    public final boolean stickyCtaEnabled;
    public final AndroidStringManager stringManager;
    public final SyncValueReader syncValueReader;

    public BenefitsHomePresenter(RealBenefitsOutboundNavigator$Factory$Impl realBenefitsOutboundNavigator$Factory$Impl, LocalizedMoneyFormatter.Factory factory, RealRouter$Factory$Impl realRouter$Factory$Impl, BenefitsComparisonTablePresenter$Factory$Impl benefitsComparisonTablePresenter$Factory$Impl, ErrorReporter errorReporter, SampleStrategy sampleStrategy, RealActivitiesCacheManager realActivitiesCacheManager, ActivityClientService activityClientService, RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl, Analytics analytics, BankingBenefitsAppService bankingBenefitsAppService, AndroidDateFormatManager androidDateFormatManager, RealDisclosureProvider realDisclosureProvider, FeatureFlagManager featureFlagManager, SessionManager sessionManager, AndroidStringManager androidStringManager, SyncValueReader syncValueReader, BetterNavigator.ScreenNavigator screenNavigator) {
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
        this.activityCacheManager = realActivitiesCacheManager;
        this.activityClientService = activityClientService;
        this.activityEmbeddedPresenterFactory = realActivityEmbeddedPresenter$Factory$Impl;
        this.analytics = analytics;
        this.benefitsAppService = bankingBenefitsAppService;
        this.dateFormatManager = androidDateFormatManager;
        this.disclosureProvider = realDisclosureProvider;
        this.featureFlagManager = featureFlagManager;
        this.sessionManager = sessionManager;
        this.stringManager = androidStringManager;
        this.syncValueReader = syncValueReader;
        this.navigator = screenNavigator;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        ((RealSpendingInsightsInboundNavigator$Factory$Impl) realBenefitsOutboundNavigator$Factory$Impl.delegateFactory.activity.value).getClass();
        zzb zzbVar = new zzb();
        zzbVar.zza = new JCAContext(screenNavigator, 25);
        this.benefitsOutboundNavigator = zzbVar;
        this.benefitsTablePresenter = benefitsComparisonTablePresenter$Factory$Impl.create(null);
        this.moneyFormatter = factory.create(MoneyFormatterConfig.STANDARD);
        this.easternTimeZone = TimeZone.getTimeZone(ZoneId.of("America/New_York"));
        RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
        this.stickyCtaEnabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$GreenHubAdditionsCta.INSTANCE)).enabled();
        this.progressBarAnimationEnabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.currentValue(AmplitudeExperiments$MobileBankingEvergreenProgressBar.INSTANCE)).enabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$refreshCashGreenSyncValues(BenefitsHomePresenter benefitsHomePresenter, ContinuationImpl continuationImpl) {
        BenefitsHomePresenter$refreshCashGreenSyncValues$1 benefitsHomePresenter$refreshCashGreenSyncValues$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof BenefitsHomePresenter$refreshCashGreenSyncValues$1) {
            benefitsHomePresenter$refreshCashGreenSyncValues$1 = (BenefitsHomePresenter$refreshCashGreenSyncValues$1) continuationImpl;
            int i2 = benefitsHomePresenter$refreshCashGreenSyncValues$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                benefitsHomePresenter$refreshCashGreenSyncValues$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = benefitsHomePresenter$refreshCashGreenSyncValues$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = benefitsHomePresenter$refreshCashGreenSyncValues$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RefreshCashGreenSyncValuesRequest refreshCashGreenSyncValuesRequest = new RefreshCashGreenSyncValuesRequest(4, new RequestContext(null, null, null, null, null, null, null, null, 8191), CollectionsKt__CollectionsKt.listOf((Object[]) new RefreshCashGreenSyncValuesRequest.RefreshTarget[]{RefreshCashGreenSyncValuesRequest.RefreshTarget.CASH_GREEN, RefreshCashGreenSyncValuesRequest.RefreshTarget.GREEN_BENEFITS}));
                    BankingBenefitsAppService bankingBenefitsAppService = benefitsHomePresenter.benefitsAppService;
                    benefitsHomePresenter$refreshCashGreenSyncValues$1.label = 1;
                    obj = bankingBenefitsAppService.refreshCashGreenSyncValues(refreshCashGreenSyncValuesRequest, benefitsHomePresenter$refreshCashGreenSyncValues$1);
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
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    Timber.Forest.w("Failed to refresh Cash Green Sync Values: %s", TextUtilsCompat.errorMessaging(benefitsHomePresenter.stringManager, (ApiResult.Failure) apiResult, null).message);
                } else {
                    if (!(apiResult instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Timber.Forest.d("Successfully refreshed Cash Green Sync Values", new Object[0]);
                }
                return Unit.INSTANCE;
            }
        }
        benefitsHomePresenter$refreshCashGreenSyncValues$1 = new BenefitsHomePresenter$refreshCashGreenSyncValues$1(benefitsHomePresenter, continuationImpl);
        Object obj2 = benefitsHomePresenter$refreshCashGreenSyncValues$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = benefitsHomePresenter$refreshCashGreenSyncValues$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
        return Unit.INSTANCE;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return this.oneErrorPerAppSessionStrategy;
    }

    public final boolean isEvergreenEligibleTransactionExperienceEnabled() {
        return ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) this.featureFlagManager).currentValue(AmplitudeExperiments$MobileBankingEvergreenEligibleTransactionExperience.INSTANCE)).enabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03e9 A[ADDED_TO_REGION] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        OverdraftStatus overdraftStatus;
        CashGreenV1.Status status;
        CashGreenV1.Status status2;
        String format2;
        BenefitsHomeViewModel.Content.HeaderViewModel headerViewModel;
        AndroidStringManager androidStringManager;
        boolean z;
        BenefitsHomeViewModel.StatusPathInfoSection.ProgressBarViewModel progressBarViewModel;
        AndroidStringManager androidStringManager2;
        BenefitsHomeViewModel.StatusPathInfoSection statusPathInfoSection;
        boolean z2;
        String format3;
        String format4;
        CashGreenV1.Status status3;
        List list;
        BenefitsHomeViewModel.Content.StickyCtaViewModel stickyCtaViewModel;
        OverdraftStatus.Eligible eligible;
        boolean z3;
        String str;
        OverdraftStatus.State_ state_;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-168147762);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        int i2 = 14;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Continuation continuation = null;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            rememberedValue = new AmountPickerCondensedView.AnonymousClass14(this, continuation, i2);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        Object rememberedValue2 = gapComposer.rememberedValue();
        int i3 = 8;
        SyncValueReader syncValueReader = this.syncValueReader;
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.CardSpendingInsightsConfig, null, new BadgeQueries$$ExternalSyntheticLambda5(this, i3));
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue2, null, gapComposer, 1);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = syncValueReader.getSingleValue(AndroidSyncValueSpecs.CashGreen, new BenefitsHubViewKt$$ExternalSyntheticLambda2(8));
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState collectAsState2 = Updater.collectAsState((StateFlow) rememberedValue3, null, gapComposer, 1);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            BitcoinDepositsPresenter$special$$inlined$filter$1 bitcoinDepositsPresenter$special$$inlined$filter$1 = new BitcoinDepositsPresenter$special$$inlined$filter$1(this.disclosureProvider.disclosure(DisclosureForScreen.BENEFITS_HOME, ""), i2);
            gapComposer.updateRememberedValue(bitcoinDepositsPresenter$special$$inlined$filter$1);
            rememberedValue4 = bitcoinDepositsPresenter$special$$inlined$filter$1;
        }
        MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue4, null, null, gapComposer, 48, 2);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = syncValueReader.getSingleValue(AndroidSyncValueSpecs.OverdraftStatus);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState collectAsState4 = Updater.collectAsState((StateFlow) rememberedValue5, null, gapComposer, 1);
        BenefitsComparisonTableViewModel models = this.benefitsTablePresenter.models(EmptyFlow.INSTANCE, gapComposer);
        CashGreenV1 cashGreenV1 = (CashGreenV1) collectAsState2.getValue();
        CashGreenV1.Status status4 = cashGreenV1 != null ? cashGreenV1.status : null;
        ErrorReporter errorReporter = this.errorReporter;
        BenefitsHomeViewModel.Loading loading = BenefitsHomeViewModel.Loading.INSTANCE;
        if (status4 == null || models.equals(loading)) {
            if (((CashGreenV1) collectAsState2.getValue()) != null) {
                BankingBenefitsProtoParsingErrorFactory bankingBenefitsProtoParsingErrorFactory = BankingBenefitsProtoParsingErrorFactory.INSTANCE;
                try {
                    CashGreenV1 cashGreenV12 = (CashGreenV1) collectAsState2.getValue();
                    if ((cashGreenV12 != null ? cashGreenV12.status : null) == null) {
                        try {
                            throw new IllegalArgumentException("status");
                        } catch (Exception e) {
                            errorReporter.report(RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(CashGreenV1.class), bankingBenefitsProtoParsingErrorFactory, null), this.oneErrorPerAppSessionStrategy);
                        }
                    }
                } catch (Exception e2) {
                    throw RotateKt.toProtoParsingExceptionFor(e2, Reflection.factory.getOrCreateKotlinClass(CashGreenV1.class), bankingBenefitsProtoParsingErrorFactory, null);
                }
            }
            gapComposer.end(false);
            return loading;
        }
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (rememberedValue6 == neverEqualPolicy) {
            String activeAccountToken = PlatformKt.activeAccountToken(this.sessionManager);
            SpendingInsightsConfig spendingInsightsConfig = (SpendingInsightsConfig) collectAsState.getValue();
            rememberedValue6 = AnalyticsHelperKt.spendingInsightsActivityContext(activeAccountToken, new SpendingInsightsActivityRequestHandler(this.activityClientService, errorReporter, spendingInsightsConfig != null ? spendingInsightsConfig.activitySection : null));
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        ActivitiesManager.ActivityContext activityContext = (ActivitiesManager.ActivityContext) rememberedValue6;
        boolean changed = gapComposer.changed(activityContext);
        Object rememberedValue7 = gapComposer.rememberedValue();
        AndroidStringManager androidStringManager3 = this.stringManager;
        if (changed || rememberedValue7 == neverEqualPolicy) {
            rememberedValue7 = this.activityEmbeddedPresenterFactory.create(this.navigator, ActivityEmbeddedPresenter$Companion.EmbeddedRecentsConfiguration$default(activityContext, RealActivitiesCacheManager.take$default(this.activityCacheManager, activityContext), null, new ErrorView$$ExternalSyntheticLambda0(this, i2), 3, androidStringManager3.get(R.string.benefits_home_activity_empty_message), null, null, null, null, 8008));
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        RealActivityEmbeddedPresenter realActivityEmbeddedPresenter = (RealActivityEmbeddedPresenter) rememberedValue7;
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue8 == neverEqualPolicy) {
            rememberedValue8 = new MLKitTitleGenerator$1(this, continuation, 16);
            gapComposer.updateRememberedValue(rememberedValue8);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue8);
        Updater.LaunchedEffect(gapComposer, flow, new AndroidSecureStore$read$2(flow, (Continuation) null, this, collectAsState2, collectAsState4, 6));
        UiCallbackModel models2 = realActivityEmbeddedPresenter.models(gapComposer, 0);
        CashGreenV1 cashGreenV13 = (CashGreenV1) collectAsState2.getValue();
        cashGreenV13.getClass();
        CashGreenV1.Status status5 = cashGreenV13.status;
        String str2 = (String) collectAsState3.getValue();
        OverdraftStatus overdraftStatus2 = (OverdraftStatus) collectAsState4.getValue();
        String str3 = cashGreenV13.support_url;
        CashGreenV1.StatusMethod statusMethod = cashGreenV13.status_method;
        status5.getClass();
        CashGreenV1.Status status6 = CashGreenV1.Status.ACTIVE;
        boolean z4 = status5 == status6;
        String str4 = androidStringManager3.get(R.string.benefits_home_status_label);
        Resources resources = androidStringManager3.resources;
        String str5 = z4 ? androidStringManager3.get(R.string.benefits_home_status_state_active) : androidStringManager3.get(R.string.benefits_home_status_state_inactive);
        GreenStatus greenStatus = z4 ? GreenStatus.ACTIVE : GreenStatus.INACTIVE;
        TimeZone timeZone = this.easternTimeZone;
        boolean z5 = z4;
        AndroidDateFormatManager androidDateFormatManager = this.dateFormatManager;
        if (z5) {
            overdraftStatus = overdraftStatus2;
            Long l = cashGreenV13.expire_at;
            l.getClass();
            Instant ofEpochMilli = Instant.ofEpochMilli(l.longValue());
            timeZone.getClass();
            status = status5;
            String format5 = androidDateFormatManager.getDateFormat("MMM d", timeZone).formatter.format(ofEpochMilli);
            format5.getClass();
            status2 = status6;
            ArrayMap arrayMap = new ArrayMap(1);
            arrayMap.put(InquiryField.DateField.TYPE, format5);
            resources.getClass();
            format2 = new MessageFormat(resources.getString(R.string.benefits_home_active_status_expiry_label)).format(arrayMap);
            format2.getClass();
        } else {
            status = status5;
            overdraftStatus = overdraftStatus2;
            status2 = status6;
            format2 = null;
        }
        BenefitsHomeViewModel.Content.HeaderViewModel headerViewModel2 = new BenefitsHomeViewModel.Content.HeaderViewModel(str4, greenStatus, str5, format2);
        if (z5 && statusMethod == CashGreenV1.StatusMethod.DIRECT_DEPOSIT) {
            statusPathInfoSection = new BenefitsHomeViewModel.StatusPathInfoSection(androidStringManager3.get(R.string.benefits_home_status_achieved_through_direct_deposit_description), null, str3 != null ? androidStringManager3.get(R.string.benefits_home_other_ways_to_qualify_button) : null, null);
            headerViewModel = headerViewModel2;
            androidStringManager2 = androidStringManager3;
            z = true;
        } else {
            String str6 = androidStringManager3.get(R.string.benefits_home_spend_bar_status_requirement_description);
            SpendPathProgress spendPath = ErrorReportingKt.spendPath(this, cashGreenV13);
            if (spendPath != null) {
                Money money = spendPath.current_aggregated_amount;
                money.getClass();
                MoneyFormatter moneyFormatter = this.moneyFormatter;
                String format6 = moneyFormatter.format(money);
                Money money2 = spendPath.threshold_amount;
                money2.getClass();
                headerViewModel = headerViewModel2;
                Money money3 = spendPath.remaining_amount;
                money3.getClass();
                String format7 = moneyFormatter.format(money3);
                Long l2 = money.amount;
                l2.getClass();
                long longValue = l2.longValue();
                Long l3 = money2.amount;
                l3.getClass();
                boolean z6 = longValue >= l3.longValue();
                Double d = spendPath.percent_complete;
                d.getClass();
                androidStringManager = androidStringManager3;
                double doubleValue = d.doubleValue();
                Long l4 = spendPath.period_end_at;
                l4.getClass();
                long longValue2 = l4.longValue();
                if (!z5) {
                    z2 = z6;
                    format7.getClass();
                    ArrayMap arrayMap2 = new ArrayMap(1);
                    arrayMap2.put("amount", format7);
                    resources.getClass();
                    format3 = new MessageFormat(resources.getString(R.string.benefits_home_spend_bar_inactive_spend_description)).format(arrayMap2);
                    format3.getClass();
                } else if (z6) {
                    timeZone.getClass();
                    String format8 = androidDateFormatManager.getDateFormat("MMM", timeZone).formatter.format(Instant.ofEpochMilli(longValue2));
                    format8.getClass();
                    format6.getClass();
                    z2 = z6;
                    ArrayMap arrayMap3 = new ArrayMap(2);
                    arrayMap3.put("amount", format6);
                    arrayMap3.put("month", format8);
                    resources.getClass();
                    format3 = new MessageFormat(resources.getString(R.string.benefits_home_spend_bar_active_earned_spend_description)).format(arrayMap3);
                    format3.getClass();
                } else {
                    z2 = z6;
                    format7.getClass();
                    ArrayMap arrayMap4 = new ArrayMap(1);
                    arrayMap4.put("amount", format7);
                    resources.getClass();
                    format3 = new MessageFormat(resources.getString(R.string.benefits_home_spend_bar_active_unearned_spend_description)).format(arrayMap4);
                    format3.getClass();
                }
                if (z2) {
                    format4 = null;
                    z = true;
                } else {
                    timeZone.getClass();
                    String format9 = androidDateFormatManager.getDateFormat("MMM d", timeZone).formatter.format(Instant.ofEpochMilli(longValue2));
                    format9.getClass();
                    z = true;
                    ArrayMap arrayMap5 = new ArrayMap(1);
                    arrayMap5.put(InquiryField.DateField.TYPE, format9);
                    resources.getClass();
                    format4 = new MessageFormat(resources.getString(R.string.benefits_home_spend_bar_unearned_deadline_description)).format(arrayMap5);
                    format4.getClass();
                }
                progressBarViewModel = new BenefitsHomeViewModel.StatusPathInfoSection.ProgressBarViewModel(format3, (float) doubleValue, format4, this.progressBarAnimationEnabled);
            } else {
                headerViewModel = headerViewModel2;
                androidStringManager = androidStringManager3;
                z = true;
                progressBarViewModel = null;
            }
            androidStringManager2 = androidStringManager;
            statusPathInfoSection = new BenefitsHomeViewModel.StatusPathInfoSection(str6, progressBarViewModel, str3 != null ? androidStringManager2.get(R.string.benefits_home_other_ways_to_qualify_button) : null, (!isEvergreenEligibleTransactionExperienceEnabled() || (z5 && statusMethod == CashGreenV1.StatusMethod.DIRECT_DEPOSIT)) ? false : z ? androidStringManager2.get(R.string.benefits_home_spending_button) : null);
        }
        BenefitsHomeViewModel.Content.ActivitySection activitySection = isEvergreenEligibleTransactionExperienceEnabled() ? null : new BenefitsHomeViewModel.Content.ActivitySection(models2, androidStringManager2.get(R.string.benefits_home_activity_section_title));
        if (str2 != null) {
            CashGreenV1.Status status7 = status;
            list = CollectionsKt__CollectionsJVMKt.listOf(str2);
            status3 = status7;
        } else {
            status3 = status;
            list = null;
        }
        if (this.stickyCtaEnabled) {
            boolean z7 = status3 == status2 ? z : false;
            OverdraftStatus overdraftStatus3 = overdraftStatus;
            if (overdraftStatus != null && (state_ = overdraftStatus3.State) != null) {
                OverdraftStatus.State_.Eligible eligible2 = state_ instanceof OverdraftStatus.State_.Eligible ? (OverdraftStatus.State_.Eligible) state_ : null;
                if (eligible2 != null) {
                    eligible = eligible2.value;
                    if (eligible != null) {
                        OverdraftStatus.Button button = overdraftStatus3.footer_button_override;
                        if (button == null || (str = button.client_route_url) == null) {
                            OverdraftStatus.Button button2 = overdraftStatus3.footer_button;
                            str = button2 != null ? button2.client_route_url : null;
                        }
                        if (str != null) {
                            z3 = z;
                            stickyCtaViewModel = (z7 || !z3) ? null : new BenefitsHomeViewModel.Content.StickyCtaViewModel(androidStringManager2.get(R.string.benefits_home_overdraft_cta), androidStringManager2.get(R.string.benefits_home_overdraft_disclaimer));
                        }
                    }
                    z3 = false;
                    stickyCtaViewModel = (z7 || !z3) ? null : new BenefitsHomeViewModel.Content.StickyCtaViewModel(androidStringManager2.get(R.string.benefits_home_overdraft_cta), androidStringManager2.get(R.string.benefits_home_overdraft_disclaimer));
                }
            }
            eligible = null;
            if (eligible != null) {
            }
            z3 = false;
            stickyCtaViewModel = (z7 || !z3) ? null : new BenefitsHomeViewModel.Content.StickyCtaViewModel(androidStringManager2.get(R.string.benefits_home_overdraft_cta), androidStringManager2.get(R.string.benefits_home_overdraft_disclaimer));
        } else {
            stickyCtaViewModel = null;
        }
        BenefitsHomeViewModel.Content content = new BenefitsHomeViewModel.Content(headerViewModel, statusPathInfoSection, models, activitySection, list, stickyCtaViewModel);
        gapComposer.end(false);
        return content;
    }
}
