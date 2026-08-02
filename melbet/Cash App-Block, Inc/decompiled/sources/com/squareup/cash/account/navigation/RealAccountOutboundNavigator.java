package com.squareup.cash.account.navigation;

import android.app.Activity;
import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.local.navigation.api.RealCashLocalNavigator;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.R;
import com.squareup.cash.account.types.SignedInStateManager;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator$Factory$Impl;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.common.moneyformatter.RoundingMode;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.roundups.BitcoinRoundUpsAvailability;
import com.squareup.cash.crypto.backend.roundups.RealBitcoinRoundUpsRepo;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealClientScenarioCompleter;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.RealProfileManager$profileOrNull$2;
import com.squareup.cash.db.SupportConfig;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.favorites.presenters.RealFavoritesInboundNavigator$Factory$Impl;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.graphics.views.GLSceneScopeProvider$SceneScope$2$1$1;
import com.squareup.cash.growtools.presenters.manager.GrowToolsManagerDelegate;
import com.squareup.cash.growtools.presenters.manager.activity.RealGrowToolsActivityPresenterFactory;
import com.squareup.cash.growtools.presenters.manager.roundups.OriginSpecificData;
import com.squareup.cash.growtools.presenters.manager.roundups.RoundUpsAutomationTarget;
import com.squareup.cash.growtools.presenters.manager.roundups.RoundUpsOriginSpecificDataUtilsKt$WhenMappings;
import com.squareup.cash.growtools.presenters.manager.state.GrowToolsManagerState;
import com.squareup.cash.growtools.screens.GrowToolsManagerScreen;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewModel;
import com.squareup.cash.history.views.ActivityItemLayout$$ExternalSyntheticLambda4;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$models$6$1;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.profile.devicemanager.navigation.RealDeviceManagerInboundNavigator$Factory$Impl;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.qrcodes.navigation.RealQrCodesInboundNavigator$Factory$Impl;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.transfers.navigation.real.RealTransfersInboundNavigator$Factory$Impl;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.work.data.real.RealPayDataLoader$fetchData$1;
import com.squareup.kotterknife.Lazy;
import com.squareup.protos.cash.investautomator.api.flows.InitiateChangeRoundUpDestinationFlowParameters;
import com.squareup.protos.cash.investautomator.model.Automation;
import com.squareup.protos.cash.investautomator.model.api.flows.InvestAutomatorFlowService;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.UiInvestingAutomation;
import com.squareup.util.android.RealIntentFactory;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.random.RandomKt;
import kotlin.ranges.ClosedRange;
import kotlin.reflect.KClasses;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class RealAccountOutboundNavigator implements GrowToolsManagerDelegate, HasObservability {
    public final Object accountInboundNavigator;
    public final Object activity;
    public final Analytics analytics;
    public final Object appConfig;
    public final Object clientScenarioCompleter;
    public final Object deviceManagerNavigator;
    public final Object favoritesNavigator;
    public final Object featureFlagManager;
    public final FlowStarter flowStarter;
    public final Object intentFactory;
    public final Object ioDispatcher;
    public final BetterNavigator.ScreenNavigator navigator;
    public final Object qrCodesInboundNavigator;
    public final Object signedInStateManager;
    public final Object supportNavigator;
    public final Object transfersInboundNavigatorFactory;

    public RealAccountOutboundNavigator(BetterNavigator.ScreenNavigator screenNavigator, RealSupportNavigator realSupportNavigator, FlowStarter flowStarter, RealAccountInboundNavigator$Factory$Impl realAccountInboundNavigator$Factory$Impl, RealQrCodesInboundNavigator$Factory$Impl realQrCodesInboundNavigator$Factory$Impl, RealDeviceManagerInboundNavigator$Factory$Impl realDeviceManagerInboundNavigator$Factory$Impl, RealFavoritesInboundNavigator$Factory$Impl realFavoritesInboundNavigator$Factory$Impl, Analytics analytics, RealIntentFactory realIntentFactory, Activity activity, AppConfigManager appConfigManager, SignedInStateManager signedInStateManager, RealClientScenarioCompleter realClientScenarioCompleter, RealBitcoinCapabilityProvider realBitcoinCapabilityProvider, RealBitcoinInboundNavigator$Factory$Impl realBitcoinInboundNavigator$Factory$Impl, RealTransfersInboundNavigator$Factory$Impl realTransfersInboundNavigator$Factory$Impl, FeatureFlagManager featureFlagManager, CoroutineContext coroutineContext) {
        this.navigator = screenNavigator;
        this.supportNavigator = realSupportNavigator;
        this.flowStarter = flowStarter;
        this.analytics = analytics;
        this.intentFactory = realIntentFactory;
        this.activity = activity;
        this.appConfig = appConfigManager;
        this.signedInStateManager = signedInStateManager;
        this.clientScenarioCompleter = realClientScenarioCompleter;
        this.transfersInboundNavigatorFactory = realTransfersInboundNavigator$Factory$Impl;
        this.featureFlagManager = featureFlagManager;
        this.ioDispatcher = coroutineContext;
        this.accountInboundNavigator = new RealAccountInboundNavigator(screenNavigator, 0);
        realBitcoinInboundNavigator$Factory$Impl.create(screenNavigator);
        Analytics analytics2 = (Analytics) realQrCodesInboundNavigator$Factory$Impl.delegateFactory.sandboxer.invoke();
        analytics2.getClass();
        this.qrCodesInboundNavigator = new ToolbarTuckTargets(screenNavigator, analytics2);
        this.deviceManagerNavigator = new RealCashLocalNavigator(screenNavigator, 2);
        this.favoritesNavigator = realFavoritesInboundNavigator$Factory$Impl.create(screenNavigator);
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public ErrorReporter getErrorReporter() {
        return (ErrorReporter) this.ioDispatcher;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public SampleStrategy getOneErrorPerAppSessionStrategy() {
        return (SampleStrategy) this.accountInboundNavigator;
    }

    public void goToError(String str) {
        str.getClass();
        this.navigator.goTo(new ProfileScreens.ErrorScreen(str, null, 14));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object goToPrivacyNotice(ContinuationImpl continuationImpl) {
        RealAccountOutboundNavigator$goToPrivacyNotice$1 realAccountOutboundNavigator$goToPrivacyNotice$1;
        int i;
        if (continuationImpl instanceof RealAccountOutboundNavigator$goToPrivacyNotice$1) {
            realAccountOutboundNavigator$goToPrivacyNotice$1 = (RealAccountOutboundNavigator$goToPrivacyNotice$1) continuationImpl;
            int i2 = realAccountOutboundNavigator$goToPrivacyNotice$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realAccountOutboundNavigator$goToPrivacyNotice$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realAccountOutboundNavigator$goToPrivacyNotice$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAccountOutboundNavigator$goToPrivacyNotice$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CoroutineContext coroutineContext = (CoroutineContext) this.ioDispatcher;
                    RealAccountOutboundNavigator$goToPrivacyNotice$config$1 realAccountOutboundNavigator$goToPrivacyNotice$config$1 = new RealAccountOutboundNavigator$goToPrivacyNotice$config$1(this, continuation, 0);
                    realAccountOutboundNavigator$goToPrivacyNotice$1.label = 1;
                    obj = JobKt.withContext(coroutineContext, realAccountOutboundNavigator$goToPrivacyNotice$config$1, realAccountOutboundNavigator$goToPrivacyNotice$1);
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
                ((RealIntentFactory) this.intentFactory).maybeStartUrlIntent(((SupportConfig) obj).privacy_notice_url, (Activity) this.activity, true);
                return Unit.INSTANCE;
            }
        }
        realAccountOutboundNavigator$goToPrivacyNotice$1 = new RealAccountOutboundNavigator$goToPrivacyNotice$1(this, continuationImpl);
        Object obj2 = realAccountOutboundNavigator$goToPrivacyNotice$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAccountOutboundNavigator$goToPrivacyNotice$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        ((RealIntentFactory) this.intentFactory).maybeStartUrlIntent(((SupportConfig) obj2).privacy_notice_url, (Activity) this.activity, true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object goToTermsOfService(ContinuationImpl continuationImpl) {
        RealAccountOutboundNavigator$goToTermsOfService$1 realAccountOutboundNavigator$goToTermsOfService$1;
        int i;
        if (continuationImpl instanceof RealAccountOutboundNavigator$goToTermsOfService$1) {
            realAccountOutboundNavigator$goToTermsOfService$1 = (RealAccountOutboundNavigator$goToTermsOfService$1) continuationImpl;
            int i2 = realAccountOutboundNavigator$goToTermsOfService$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realAccountOutboundNavigator$goToTermsOfService$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realAccountOutboundNavigator$goToTermsOfService$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAccountOutboundNavigator$goToTermsOfService$1.label;
                Continuation continuation = null;
                int i3 = 1;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CoroutineContext coroutineContext = (CoroutineContext) this.ioDispatcher;
                    RealAccountOutboundNavigator$goToPrivacyNotice$config$1 realAccountOutboundNavigator$goToPrivacyNotice$config$1 = new RealAccountOutboundNavigator$goToPrivacyNotice$config$1(this, continuation, i3);
                    realAccountOutboundNavigator$goToTermsOfService$1.label = 1;
                    obj = JobKt.withContext(coroutineContext, realAccountOutboundNavigator$goToPrivacyNotice$config$1, realAccountOutboundNavigator$goToTermsOfService$1);
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
                ((RealIntentFactory) this.intentFactory).maybeStartUrlIntent(((SupportConfig) obj).terms_of_service_url, (Activity) this.activity, true);
                return Unit.INSTANCE;
            }
        }
        realAccountOutboundNavigator$goToTermsOfService$1 = new RealAccountOutboundNavigator$goToTermsOfService$1(this, continuationImpl);
        Object obj2 = realAccountOutboundNavigator$goToTermsOfService$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAccountOutboundNavigator$goToTermsOfService$1.label;
        Continuation continuation2 = null;
        int i32 = 1;
        if (i != 0) {
        }
        ((RealIntentFactory) this.intentFactory).maybeStartUrlIntent(((SupportConfig) obj2).terms_of_service_url, (Activity) this.activity, true);
        return Unit.INSTANCE;
    }

    @Override // com.squareup.cash.growtools.presenters.manager.GrowToolsManagerDelegate
    public GrowToolsManagerViewModel models(Flow flow, Composer composer, int i) {
        MutableState mutableState;
        MutableState mutableState2;
        OriginSpecificData originSpecificData;
        boolean z;
        GrowToolsManagerViewModel loaded;
        String str;
        OriginSpecificData originSpecificData2;
        boolean z2;
        boolean z3;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.intentFactory;
        GrowToolsManagerScreen.ManageRoundUpsScreen manageRoundUpsScreen = (GrowToolsManagerScreen.ManageRoundUpsScreen) this.featureFlagManager;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(286986409);
        GrowToolsManagerState rememberManagerState = KClasses.rememberManagerState(gapComposer);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = (DerivedStateFlow) this.deviceManagerNavigator;
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue, null, gapComposer, 1);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = ((RealFamilyProfileManager) this.clientScenarioCompleter).familyProfile;
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState2 = Updater.collectAsState((StateFlow) rememberedValue2, null, gapComposer, 1);
        boolean changed = gapComposer.changed((FamilyProfile) collectAsState2.getValue());
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changed || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = ((RealGrowToolsActivityPresenterFactory) this.supportNavigator).create(manageRoundUpsScreen, this.navigator, (FamilyProfile) collectAsState2.getValue());
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(((RealActivityEmbeddedPresenter) rememberedValue3).models(gapComposer, 0), gapComposer);
        UiInvestingAutomation uiInvestingAutomation = (UiInvestingAutomation) collectAsState.getValue();
        MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(uiInvestingAutomation != null ? uiInvestingAutomation.automation : null, gapComposer);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = (StateFlow) this.favoritesNavigator;
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState collectAsState3 = Updater.collectAsState((StateFlow) rememberedValue4, null, gapComposer, 1);
        GrowToolsManagerScreen.Origin origin = manageRoundUpsScreen.origin;
        RealBitcoinRoundUpsRepo realBitcoinRoundUpsRepo = (RealBitcoinRoundUpsRepo) this.signedInStateManager;
        Lazy lazy = (Lazy) this.activity;
        UiInvestingAutomation uiInvestingAutomation2 = (UiInvestingAutomation) collectAsState.getValue();
        Automation automation = (Automation) rememberUpdatedState2.getValue();
        FamilyProfile familyProfile = (FamilyProfile) collectAsState2.getValue();
        Boolean bool = (Boolean) collectAsState3.getValue();
        boolean booleanValue = bool.booleanValue();
        origin.getClass();
        familyProfile.getClass();
        Resources resources = androidStringManager.resources;
        gapComposer.startReplaceGroup(270509199);
        if (uiInvestingAutomation2 == null || automation == null) {
            mutableState = rememberUpdatedState2;
            mutableState2 = rememberUpdatedState;
            gapComposer.end(false);
            originSpecificData = null;
        } else {
            mutableState = rememberUpdatedState2;
            if (RoundUpsOriginSpecificDataUtilsKt$WhenMappings.$EnumSwitchMapping$0[origin.ordinal()] == 1) {
                gapComposer.startReplaceGroup(-2033651412);
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = realBitcoinRoundUpsRepo.bitcoinRoundUpsAvailability;
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                MutableState collectAsState4 = Updater.collectAsState((StateFlow) rememberedValue5, null, gapComposer, 1);
                Object rememberedValue6 = gapComposer.rememberedValue();
                if (rememberedValue6 == neverEqualPolicy) {
                    rememberedValue6 = realBitcoinRoundUpsRepo.bitcoinRoundUpsUsageStats;
                    gapComposer.updateRememberedValue(rememberedValue6);
                }
                Updater.collectAsState((StateFlow) rememberedValue6, null, gapComposer, 1);
                String str2 = androidStringManager.get(R.string.grow_tools_bitcoin);
                zzd zzdVar = Icons.Companion;
                StackedAvatarViewModel.Avatar avatar = new StackedAvatarViewModel.Avatar(null, null, null, null, null, new Icon("FF9MIq"), null, ColorModel.Bitcoin.INSTANCE, false, false, null, false, null, null, 130015);
                String str3 = androidStringManager.get(R.string.grow_tools_roundups_bitcoin_title);
                GrowToolsManagerViewModel.Loaded.Header.Target.GrowToolsAvatar.DefaultAvatar defaultAvatar = new GrowToolsManagerViewModel.Loaded.Header.Target.GrowToolsAvatar.DefaultAvatar(avatar);
                if (((BitcoinRoundUpsAvailability) collectAsState4.getValue()) instanceof BitcoinRoundUpsAvailability.Available.Bitcoin) {
                    BitcoinRoundUpsAvailability bitcoinRoundUpsAvailability = (BitcoinRoundUpsAvailability) collectAsState4.getValue();
                    bitcoinRoundUpsAvailability.getClass();
                    if ((bitcoinRoundUpsAvailability instanceof BitcoinRoundUpsAvailability.Available) && ((BitcoinRoundUpsAvailability.Available) bitcoinRoundUpsAvailability).getActive()) {
                        z3 = true;
                        OriginSpecificData.TotalStats bitcoinStats = ClosedRange.DefaultImpls.bitcoinStats(realBitcoinRoundUpsRepo, gapComposer);
                        String str4 = androidStringManager.get(R.string.grow_tools_roundups_bitcoin_empty_activity);
                        String lowerCase = str2.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        resources.getClass();
                        String format2 = new MessageFormat(resources.getString(R.string.grow_tools_roundups_toggle_off_confirm_message)).format(new Object[]{lowerCase});
                        format2.getClass();
                        originSpecificData2 = new OriginSpecificData(str3, str2, null, defaultAvatar, false, z3, bitcoinStats, str4, format2);
                        z2 = false;
                        gapComposer.end(false);
                        mutableState2 = rememberUpdatedState;
                    }
                }
                z3 = false;
                OriginSpecificData.TotalStats bitcoinStats2 = ClosedRange.DefaultImpls.bitcoinStats(realBitcoinRoundUpsRepo, gapComposer);
                String str42 = androidStringManager.get(R.string.grow_tools_roundups_bitcoin_empty_activity);
                String lowerCase2 = str2.toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                resources.getClass();
                String format22 = new MessageFormat(resources.getString(R.string.grow_tools_roundups_toggle_off_confirm_message)).format(new Object[]{lowerCase2});
                format22.getClass();
                originSpecificData2 = new OriginSpecificData(str3, str2, null, defaultAvatar, false, z3, bitcoinStats2, str42, format22);
                z2 = false;
                gapComposer.end(false);
                mutableState2 = rememberUpdatedState;
            } else {
                gapComposer.startReplaceGroup(-2033647621);
                Automation.AutomationTarget automationTarget = automation.target;
                automationTarget.getClass();
                RoundUpsAutomationTarget target = RandomKt.toTarget(this, automationTarget);
                String displayName = target.getDisplayName();
                GrowToolsManagerViewModel.Loaded.Header.Target.GrowToolsAvatar.DefaultAvatar defaultAvatar2 = new GrowToolsManagerViewModel.Loaded.Header.Target.GrowToolsAvatar.DefaultAvatar(new StackedAvatarViewModel.Avatar(null, null, null, null, null, null, null, null, false, false, null, false, null, null, 131071));
                boolean changedInstance = gapComposer.changedInstance(target) | gapComposer.changedInstance(lazy) | gapComposer.changed(booleanValue);
                Object rememberedValue7 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue7 == neverEqualPolicy) {
                    mutableState2 = rememberUpdatedState;
                    rememberedValue7 = new RealPayDataLoader$fetchData$1(target, lazy, booleanValue, (Continuation) null);
                    gapComposer.updateRememberedValue(rememberedValue7);
                } else {
                    mutableState2 = rememberUpdatedState;
                }
                MutableState produceState = Updater.produceState(defaultAvatar2, bool, (Function2) rememberedValue7, gapComposer, 0);
                if (target instanceof RoundUpsAutomationTarget.CryptoCurrency) {
                    str = displayName.toLowerCase(Locale.ROOT);
                    str.getClass();
                } else {
                    str = displayName;
                }
                String str5 = androidStringManager.get(R.string.grow_tools_roundups_title);
                String str6 = familyProfile instanceof FamilyProfile.ManagedAccount ? null : androidStringManager.get(R.string.grow_tools_change);
                GrowToolsManagerViewModel.Loaded.Header.Target.GrowToolsAvatar growToolsAvatar = (GrowToolsManagerViewModel.Loaded.Header.Target.GrowToolsAvatar) produceState.getValue();
                Automation.AutomationStatus automationStatus = automation.status;
                Automation.AutomationStatus automationStatus2 = Automation.AutomationStatus.ACTIVE;
                boolean z4 = automationStatus == automationStatus2;
                boolean z5 = automationStatus == automationStatus2;
                UiInvestingAutomation.UiAutomationStatistics uiAutomationStatistics = uiInvestingAutomation2.statistics;
                uiAutomationStatistics.getClass();
                Integer num = uiAutomationStatistics.number_of_executions;
                num.getClass();
                Money money = uiAutomationStatistics.total_amount_invested;
                money.getClass();
                OriginSpecificData.TotalStats totalStats = new OriginSpecificData.TotalStats(num, money);
                String str7 = androidStringManager.get(R.string.grow_tools_roundups_empty_activity);
                str.getClass();
                resources.getClass();
                String format3 = new MessageFormat(resources.getString(R.string.grow_tools_roundups_toggle_off_confirm_message)).format(new Object[]{str});
                format3.getClass();
                originSpecificData2 = new OriginSpecificData(str5, displayName, str6, growToolsAvatar, z4, z5, totalStats, str7, format3);
                z2 = false;
                gapComposer.end(false);
            }
            gapComposer.end(z2);
            originSpecificData = originSpecificData2;
        }
        MutableState rememberUpdatedState3 = Updater.rememberUpdatedState(originSpecificData, gapComposer);
        OriginSpecificData originSpecificData3 = (OriginSpecificData) rememberUpdatedState3.getValue();
        Boolean valueOf = originSpecificData3 != null ? Boolean.valueOf(originSpecificData3.active) : null;
        int i2 = 22;
        if (valueOf != null) {
            gapComposer.startReplaceGroup(-1106477359);
            Updater.LaunchedEffect(gapComposer, valueOf, new GLSceneScopeProvider$SceneScope$2$1$1(valueOf, (Continuation) null, rememberManagerState, i2));
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-1106436997);
            gapComposer.end(false);
        }
        Updater.LaunchedEffect(gapComposer, flow, new MoneybotChatPresenter$models$6$1(flow, (Continuation) null, (Object) this, (Object) rememberManagerState, rememberUpdatedState3, mutableState, 5));
        Unit unit = Unit.INSTANCE;
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue8 == neverEqualPolicy) {
            rememberedValue8 = new RealProfileManager$profileOrNull$2(this, null, i2);
            gapComposer.updateRememberedValue(rememberedValue8);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue8);
        OriginSpecificData originSpecificData4 = (OriginSpecificData) rememberUpdatedState3.getValue();
        if (originSpecificData4 == null) {
            gapComposer.startReplaceGroup(-1664508757);
            z = false;
            gapComposer.end(false);
            loaded = null;
        } else {
            gapComposer.startReplaceGroup(916137494);
            UiCallbackModel uiCallbackModel = (UiCallbackModel) mutableState2.getValue();
            boolean isInteractive = rememberManagerState.isInteractive();
            boolean z6 = originSpecificData4.active;
            boolean z7 = isInteractive ? z6 : !z6;
            String str8 = originSpecificData4.title;
            OriginSpecificData.TotalStats totalStats2 = originSpecificData4.totalStats;
            Integer num2 = totalStats2.count;
            GrowToolsManagerViewModel.Loaded.Header header = new GrowToolsManagerViewModel.Loaded.Header(str8, androidStringManager.get(R.string.grow_tools_roundups_toggle_text), z7, rememberManagerState.isInteractive(), new GrowToolsManagerViewModel.Loaded.Header.Target(originSpecificData4.targetName, z7 ? androidStringManager.get(R.string.grow_tools_roundups_on) : androidStringManager.get(R.string.grow_tools_roundups_off), originSpecificData4.avatar, Icons.RoundUps16, originSpecificData4.targetActionButtonText), originSpecificData4.isAvatarClickable);
            Money money2 = totalStats2.amount;
            GrowToolsManagerViewModel.Loaded.TotalStats totalStats3 = (num2 == null || money2 == null || num2.intValue() == 0) ? null : new GrowToolsManagerViewModel.Loaded.TotalStats(androidStringManager.get(R.string.grow_tools_totals_title), androidStringManager.get(R.string.grow_tools_roundups_count_label), String.valueOf(num2.intValue()), androidStringManager.get(R.string.grow_tools_amount_label), ((MoneyFormatter) this.qrCodesInboundNavigator).format(money2));
            GrowToolsManagerState.ShowDialog showDialog = (GrowToolsManagerState.ShowDialog) rememberManagerState.showDialog$delegate.getValue();
            GrowToolsManagerViewModel.Loaded.Dialog dialog = showDialog != null ? showDialog.f1143type == GrowToolsManagerState.ShowDialog.DialogType.ERROR ? new GrowToolsManagerViewModel.Loaded.Dialog(androidStringManager.get(R.string.grow_tools_error_dialog_title), androidStringManager.get(R.string.grow_tools_error_dialog_body), androidStringManager.get(R.string.grow_tools_ok)) : new GrowToolsManagerViewModel.Loaded.Dialog(androidStringManager.get(R.string.grow_tools_toggle_off_dialog_title), originSpecificData4.toggleOffConfirmMessage, androidStringManager.get(R.string.grow_tools_roundups_toggle_off_confirm_button), androidStringManager.get(R.string.grow_tools_toggle_off_dialog_cancel), false) : null;
            if (totalStats3 != null) {
                gapComposer.startReplaceGroup(-1106477359);
                Updater.LaunchedEffect(gapComposer, totalStats3, new GLSceneScopeProvider$SceneScope$2$1$1(totalStats3, (Continuation) null, uiCallbackModel, 23));
                z = false;
                gapComposer.end(false);
            } else {
                z = false;
                gapComposer.startReplaceGroup(-1106436997);
                gapComposer.end(false);
            }
            loaded = new GrowToolsManagerViewModel.Loaded(header, totalStats3, uiCallbackModel, dialog);
            gapComposer.end(z);
        }
        if (loaded == null) {
            loaded = GrowToolsManagerViewModel.Loading.INSTANCE;
        }
        gapComposer.end(z);
        return loaded;
    }

    public void startChangeDestinationFlow(Automation automation, ColorModel.Bitcoin bitcoin) {
        this.navigator.goTo(FlowStarter.startPlasmaFlowWithParams$default(this.flowStarter, Flow$Type.CHANGE_ROUND_UP_DESTINATION, new InitiateChangeRoundUpDestinationFlowParameters(null, automation, ByteString.EMPTY), (GrowToolsManagerScreen.ManageRoundUpsScreen) this.featureFlagManager, null, null, null, bitcoin, 888));
    }

    public RealAccountOutboundNavigator(SyncValueReader syncValueReader, LocalizedMoneyFormatter.Factory factory, RealGrowToolsActivityPresenterFactory realGrowToolsActivityPresenterFactory, AndroidStringManager androidStringManager, Lazy lazy, InvestAutomatorFlowService investAutomatorFlowService, FlowStarter flowStarter, RealBitcoinRoundUpsRepo realBitcoinRoundUpsRepo, Analytics analytics, RealFamilyProfileManager realFamilyProfileManager, CoroutineScope coroutineScope, GrowToolsManagerScreen.ManageRoundUpsScreen manageRoundUpsScreen, BetterNavigator.ScreenNavigator screenNavigator, ErrorReporter errorReporter, SampleStrategy sampleStrategy) {
        manageRoundUpsScreen.getClass();
        this.supportNavigator = realGrowToolsActivityPresenterFactory;
        this.intentFactory = androidStringManager;
        this.activity = lazy;
        this.appConfig = investAutomatorFlowService;
        this.flowStarter = flowStarter;
        this.signedInStateManager = realBitcoinRoundUpsRepo;
        this.analytics = analytics;
        this.clientScenarioCompleter = realFamilyProfileManager;
        this.transfersInboundNavigatorFactory = coroutineScope;
        this.featureFlagManager = manageRoundUpsScreen;
        this.navigator = screenNavigator;
        this.ioDispatcher = errorReporter;
        this.accountInboundNavigator = sampleStrategy;
        RoundingMode roundingMode = RoundingMode.DOWN;
        this.qrCodesInboundNavigator = factory.createAbbreviatedExactlyTwoFractionDigits();
        this.deviceManagerNavigator = StateFlowKt.mapState(syncValueReader.getAllValues(AndroidSyncValueSpecs.InvestingAutomation), new ActivityItemLayout$$ExternalSyntheticLambda4(5));
        this.favoritesNavigator = syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.VersionedSavingsFolders, Boolean.TRUE, new ActivityItemLayout$$ExternalSyntheticLambda4(6));
    }
}
