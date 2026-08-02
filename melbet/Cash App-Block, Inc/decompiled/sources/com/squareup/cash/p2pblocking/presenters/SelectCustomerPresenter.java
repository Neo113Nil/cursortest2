package com.squareup.cash.p2pblocking.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.room.util.DBUtil;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.inputfieldtext.InputFieldText;
import app.cash.inputfieldtext.saver.RealInputFieldTextSaver;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.molecule.PlatformKt;
import com.google.mlkit.vision.text.internal.zzr;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.presenters.ActivityEmbeddedPresenter$Companion;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.activity.viewmodels.FullScreenActivityViewModel;
import com.squareup.cash.banking.real.RealDisclosureProvider$special$$inlined$map$1;
import com.squareup.cash.businessaccount.kybrestriction.presenters.KybRestrictionBannerPresenter$AssistedInjectionFactory$Impl;
import com.squareup.cash.businessaccount.screens.KybRestrictionBannerScreen;
import com.squareup.cash.card.onboarding.CardStudioPresenter$models$1$1;
import com.squareup.cash.card.spendinginsights.activity.SpendingInsightsActivityRequestHandler;
import com.squareup.cash.card.spendinginsights.backend.api.model.SpendingInsightsConfig;
import com.squareup.cash.card.spendinginsights.screens.CardActivityListScreen;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda12;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$1;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.deposits.physical.backend.real.barcode.RealCashDepositBarcodeManager;
import com.squareup.cash.deposits.physical.screens.PaperMoneyDepositBarcodeScreen;
import com.squareup.cash.deposits.physical.viewmodels.barcode.PaperMoneyDepositBarcodeViewModel;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.AmplitudeExperiments$BankingCashGreenRelease;
import com.squareup.cash.featureflags.AmplitudeExperiments$FamiliesSponsorDrivenAllowlist;
import com.squareup.cash.featureflags.FeatureFlag$ControlTreatmentAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$InvestingServerDrivenDisclosureText;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$PmdBarcodeDetailRows;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.formview.components.FormCashtag$8$invokeSuspend$$inlined$map$1;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.history.backend.real.RealInvestmentActivity;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.investing.backend.real.RealInvestingStateManager;
import com.squareup.cash.investing.db.Investing_settings;
import com.squareup.cash.investing.presenters.InvestingDiscoverySectionsPresenter$Factory$Impl;
import com.squareup.cash.investing.primitives.InvestingState;
import com.squareup.cash.investing.primitives.NewsKind;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewEvent;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewModel;
import com.squareup.cash.investing.viewmodels.market.hours.InvestingPendingTradesTileWidgetViewModel;
import com.squareup.cash.investing.viewmodels.market.hours.InvestingPlaceholderGraphViewModel;
import com.squareup.cash.investingcrypto.presenters.news.InvestingCryptoNewsPresenter$Factory$Impl;
import com.squareup.cash.investingcrypto.viewmodels.ColoredLearnMoreConfigurationModel;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewModel;
import com.squareup.cash.invitations.InviteContactsPresenter$filterContacts$$inlined$map$1;
import com.squareup.cash.invitations.InviteContactsPresenter$special$$inlined$map$1;
import com.squareup.cash.keystore.RealKeyStoreProvider$setEntry$2;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.moneybot.presenters.MoneybotHomePresenter;
import com.squareup.cash.moneybot.presenters.plugins.NavigationCardPresenter;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.p2pblocking.screens.P2PScreenMode;
import com.squareup.cash.p2pblocking.screens.P2PSearchData;
import com.squareup.cash.p2pblocking.screens.SelectCustomerScreen;
import com.squareup.cash.p2pblocking.viewmodels.P2PFailureDialogModel;
import com.squareup.cash.p2pblocking.viewmodels.SelectCustomerViewModel;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.payments.presenters.AnalyticsHelperKt;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import com.squareup.cash.util.cache.Cache;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$toHeroModule$1$1;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.blockly.common.BlockingContext;
import com.squareup.protos.cash.cashbusinessaccounts.KybEligibilityWarning;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.protos.franklin.investing.resources.LearnMoreConfiguration;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final class SelectCustomerPresenter implements MoleculePresenter, HasObservability {
    public final /* synthetic */ int $r8$classId = 1;
    public final Object args;
    public final Object controller;
    public final Object currentCustomerToken;
    public final Object familyProfileManager;
    public final Object inputFieldTextSaver;
    public final boolean isFeatureFlagEnabled;
    public final Object navigator;
    public final Object profileManager;
    public final Object sponsorshipStateProvider;
    public final Object stringManager;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [app.cash.broadway.screen.Screen] */
    public SelectCustomerPresenter(AndroidStringManager androidStringManager, SessionManager sessionManager, RealProfileManager realProfileManager, RealFamilyAccountsManager realFamilyAccountsManager, RealFamilyProfileManager realFamilyProfileManager, FeatureFlagManager featureFlagManager, RealUuidGenerator realUuidGenerator, RealInputFieldTextSaver realInputFieldTextSaver, AllowListController$Factory$Impl allowListController$Factory$Impl, BlockListController$Factory$Impl blockListController$Factory$Impl, SelectCustomerScreen selectCustomerScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        Object create;
        selectCustomerScreen.getClass();
        this.stringManager = androidStringManager;
        this.profileManager = realProfileManager;
        this.sponsorshipStateProvider = realFamilyAccountsManager;
        this.familyProfileManager = realFamilyProfileManager;
        this.inputFieldTextSaver = realInputFieldTextSaver;
        this.args = selectCustomerScreen;
        this.navigator = screenNavigator;
        this.currentCustomerToken = PlatformKt.activeAccountToken(sessionManager);
        P2PScreenMode p2PScreenMode = selectCustomerScreen.screenMode;
        if (p2PScreenMode instanceof P2PScreenMode.AllowList) {
            create = allowListController$Factory$Impl.create();
        } else {
            if (!Intrinsics.areEqual(p2PScreenMode, P2PScreenMode.BlockList.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                throw null;
            }
            ?? r1 = selectCustomerScreen.destinationScreen;
            create = blockListController$Factory$Impl.create(r1 != 0 ? r1 : selectCustomerScreen, screenNavigator);
        }
        this.controller = create;
        this.isFeatureFlagEnabled = ((FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).currentValue(AmplitudeExperiments$FamiliesSponsorDrivenAllowlist.INSTANCE)).enabled();
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public ErrorReporter getErrorReporter() {
        return (ErrorReporter) this.currentCustomerToken;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public SampleStrategy getOneErrorPerAppSessionStrategy() {
        return (SampleStrategy) this.controller;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        CoroutineScope coroutineScope;
        MutableState mutableState;
        Continuation continuation;
        SearchResultsData searchResultsData;
        List list;
        List list2;
        Continuation continuation2;
        SpendingInsightsActivityRequestHandler spendingInsightsActivityRequestHandler;
        String str;
        Set ofNotNull;
        InvestingPendingTradesTileWidgetViewModel investingPendingTradesTileWidgetViewModel;
        String str2;
        Investing_settings investing_settings;
        String str3;
        int i2 = this.$r8$classId;
        Object obj = this.inputFieldTextSaver;
        Object obj2 = this.navigator;
        int i3 = 16;
        Object obj3 = this.currentCustomerToken;
        boolean z = this.isFeatureFlagEnabled;
        Object obj4 = this.args;
        Object obj5 = this.familyProfileManager;
        Object obj6 = this.controller;
        Object obj7 = this.sponsorshipStateProvider;
        Object obj8 = this.profileManager;
        Object obj9 = this.stringManager;
        Object obj10 = Composer.Companion.Empty;
        Continuation continuation3 = null;
        switch (i2) {
            case 0:
                AndroidStringManager androidStringManager = (AndroidStringManager) obj9;
                SelectCustomerScreen selectCustomerScreen = (SelectCustomerScreen) obj4;
                RealProfileManager realProfileManager = (RealProfileManager) obj8;
                P2PListController p2PListController = (P2PListController) obj6;
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(-1047230054);
                Object[] objArr = new Object[0];
                RealInputFieldTextSaver realInputFieldTextSaver = (RealInputFieldTextSaver) obj;
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == obj10) {
                    rememberedValue = new P2PListViewKt$$ExternalSyntheticLambda2(13);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                MutableState rememberSaveable = SaverKt.rememberSaveable(objArr, (Saver) realInputFieldTextSaver, (Function0) rememberedValue, (Composer) gapComposer, MLKEMEngine.KyberPolyBytes);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == obj10) {
                    rememberedValue2 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                CoroutineScope coroutineScope2 = (CoroutineScope) rememberedValue2;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (rememberedValue3 == obj10) {
                    rememberedValue3 = p2PListController.getSearchData();
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue3, null, null, gapComposer, 48, 2);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (rememberedValue4 == obj10) {
                    rememberedValue4 = Updater.mutableStateOf$default(null);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                MutableState mutableState2 = (MutableState) rememberedValue4;
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (rememberedValue5 == obj10) {
                    coroutineScope = coroutineScope2;
                    mutableState = mutableState2;
                    Object realDrawerOpener$getDrawerScreen$$inlined$map$1 = new RealDrawerOpener$getDrawerScreen$$inlined$map$1(realProfileManager.publicProfile(), 13);
                    gapComposer.updateRememberedValue(realDrawerOpener$getDrawerScreen$$inlined$map$1);
                    rememberedValue5 = realDrawerOpener$getDrawerScreen$$inlined$map$1;
                } else {
                    coroutineScope = coroutineScope2;
                    mutableState = mutableState2;
                }
                MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue5, null, null, gapComposer, 48, 2);
                Object rememberedValue6 = gapComposer.rememberedValue();
                if (rememberedValue6 == obj10) {
                    Object realDisclosureProvider$special$$inlined$map$1 = new RealDisclosureProvider$special$$inlined$map$1(realProfileManager.region(), 16);
                    gapComposer.updateRememberedValue(realDisclosureProvider$special$$inlined$map$1);
                    rememberedValue6 = realDisclosureProvider$special$$inlined$map$1;
                }
                MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue6, null, null, gapComposer, 48, 2);
                Object rememberedValue7 = gapComposer.rememberedValue();
                if (rememberedValue7 == obj10) {
                    rememberedValue7 = ((RealFamilyAccountsManager) obj7).isSponsored();
                    gapComposer.updateRememberedValue(rememberedValue7);
                }
                MutableState collectAsState4 = Updater.collectAsState((StateFlow) rememberedValue7, Boolean.FALSE, null, gapComposer, 48, 2);
                gapComposer.startReplaceGroup(-1365704014);
                Object rememberedValue8 = gapComposer.rememberedValue();
                if (rememberedValue8 == obj10) {
                    rememberedValue8 = ((RealFamilyProfileManager) obj5).familyProfile;
                    gapComposer.updateRememberedValue(rememberedValue8);
                }
                MutableState collectAsState5 = Updater.collectAsState((StateFlow) rememberedValue8, FamilyProfile.Standard.INSTANCE, null, gapComposer, 0, 2);
                boolean changed = gapComposer.changed((FamilyProfile) collectAsState5.getValue());
                Object rememberedValue9 = gapComposer.rememberedValue();
                if (changed || rememberedValue9 == obj10) {
                    rememberedValue9 = Recorder$$ExternalSyntheticOutline1.m(collectAsState5.getValue() instanceof FamilyProfile.ManagedAccount, gapComposer);
                }
                MutableState mutableState3 = (MutableState) rememberedValue9;
                gapComposer.end(false);
                CharSequence value = ((InputFieldText) rememberSaveable.getValue()).getValue();
                boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changed(rememberSaveable);
                Object rememberedValue10 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue10 == obj10) {
                    rememberedValue10 = new RealKeyStoreProvider$setEntry$2(this, rememberSaveable, (Continuation) null, 21);
                    gapComposer.updateRememberedValue(rememberedValue10);
                }
                Updater.LaunchedEffect(gapComposer, value, (Function2) rememberedValue10);
                boolean changedInstance2 = gapComposer.changedInstance(flow) | gapComposer.changed(rememberSaveable);
                Object rememberedValue11 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue11 == obj10) {
                    continuation = null;
                    rememberedValue11 = new CardSchemePresenter$toHeroModule$1$1(5, rememberSaveable, continuation, flow);
                    gapComposer.updateRememberedValue(rememberedValue11);
                } else {
                    continuation = null;
                }
                Updater.LaunchedEffect(gapComposer, flow, (Function2) rememberedValue11);
                Continuation continuation4 = continuation;
                MutableState mutableState4 = mutableState;
                Updater.LaunchedEffect(gapComposer, flow, new AnimationsKt$takeUntil$1$1(flow, (Continuation) null, this, coroutineScope, mutableState4, 27));
                P2PSearchData p2PSearchData = (P2PSearchData) collectAsState.getValue();
                if (p2PSearchData != null) {
                    P2PListController p2PListController2 = (P2PListController) obj6;
                    String str4 = selectCustomerScreen.forCustomerToken;
                    String str5 = (String) obj3;
                    String str6 = (String) collectAsState2.getValue();
                    boolean booleanValue = ((Boolean) collectAsState4.getValue()).booleanValue();
                    boolean booleanValue2 = ((Boolean) mutableState3.getValue()).booleanValue();
                    BlockingContext blockingContext = selectCustomerScreen.context;
                    P2PScreenMode p2PScreenMode = selectCustomerScreen.screenMode;
                    P2PScreenMode.AllowList allowList = p2PScreenMode instanceof P2PScreenMode.AllowList ? (P2PScreenMode.AllowList) p2PScreenMode : continuation4;
                    searchResultsData = p2PListController2.transformSearchResults(p2PSearchData, str4, str5, str6, booleanValue, booleanValue2, allowList != 0 ? allowList.limit : continuation4, blockingContext);
                } else {
                    searchResultsData = continuation4;
                }
                InputFieldText inputFieldText = (InputFieldText) rememberSaveable.getValue();
                String searchPlaceholder = p2PListController.getSearchPlaceholder();
                String str7 = androidStringManager.get(R.string.select_customer_to_block_suggestion_section_title);
                if (searchResultsData == 0 || (list = searchResultsData.suggestionResults) == null) {
                    list = EmptyList.INSTANCE;
                }
                List list3 = list;
                String str8 = androidStringManager.get(R.string.select_customer_to_block_search_result_section_title);
                String searchTitle = p2PListController.getSearchTitle(z);
                String searchHeaderTitle = p2PListController.getSearchHeaderTitle(z);
                if (searchResultsData == 0 || (list2 = searchResultsData.searchResults) == null) {
                    list2 = EmptyList.INSTANCE;
                }
                SelectCustomerViewModel selectCustomerViewModel = new SelectCustomerViewModel(inputFieldText, searchPlaceholder, list3, str7, searchTitle, searchHeaderTitle, list2, str8, (Region) collectAsState3.getValue(), ((P2PSearchData) collectAsState.getValue()) == null, (P2PFailureDialogModel) mutableState4.getValue(), false, false, null, null, null);
                gapComposer.end(false);
                return selectCustomerViewModel;
            case 1:
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(-2138097450);
                Object rememberedValue12 = gapComposer2.rememberedValue();
                if (rememberedValue12 == obj10) {
                    continuation2 = null;
                    rememberedValue12 = ((SyncValueReader) obj8).getSingleValueOrDefault(AndroidSyncValueSpecs.CardSpendingInsightsConfig, null, new CaptureCheckFaceKt$$ExternalSyntheticLambda12(this, 9));
                    gapComposer2.updateRememberedValue(rememberedValue12);
                } else {
                    continuation2 = null;
                }
                MutableState receiveValueAsState = Strings.receiveValueAsState((StateFlow) rememberedValue12, gapComposer2);
                Updater.LaunchedEffect(gapComposer2, flow, new CardStudioPresenter$models$1$1(flow, continuation2, this, 15));
                Object rememberedValue13 = gapComposer2.rememberedValue();
                if (rememberedValue13 == obj10) {
                    String activeAccountToken = PlatformKt.activeAccountToken((SessionManager) obj4);
                    if (z) {
                        ActivityClientService activityClientService = (ActivityClientService) obj7;
                        ErrorReporter errorReporter = (ErrorReporter) obj3;
                        SpendingInsightsConfig spendingInsightsConfig = (SpendingInsightsConfig) receiveValueAsState.getValue();
                        spendingInsightsActivityRequestHandler = new SpendingInsightsActivityRequestHandler(activityClientService, errorReporter, spendingInsightsConfig != null ? spendingInsightsConfig.activitySection : null);
                    } else {
                        spendingInsightsActivityRequestHandler = null;
                    }
                    rememberedValue13 = AnalyticsHelperKt.spendingInsightsActivityContext(activeAccountToken, spendingInsightsActivityRequestHandler);
                    gapComposer2.updateRememberedValue(rememberedValue13);
                }
                ActivitiesManager.ActivityContext activityContext = (ActivitiesManager.ActivityContext) rememberedValue13;
                boolean changed2 = gapComposer2.changed(activityContext);
                Object rememberedValue14 = gapComposer2.rememberedValue();
                if (changed2 || rememberedValue14 == obj10) {
                    rememberedValue14 = ((RealActivityEmbeddedPresenter$Factory$Impl) obj).create((BetterNavigator.ScreenNavigator) obj2, ActivityEmbeddedPresenter$Companion.FilteredFeedConfiguration$default(activityContext, RealActivitiesCacheManager.take$default((RealActivitiesCacheManager) obj5, activityContext), null, false, null, null, null, null, null, 16376));
                    gapComposer2.updateRememberedValue(rememberedValue14);
                }
                FullScreenActivityViewModel fullScreenActivityViewModel = new FullScreenActivityViewModel(((RealActivityEmbeddedPresenter) rememberedValue14).models(gapComposer2, 0), ((CardActivityListScreen) obj9).title);
                gapComposer2.end(false);
                return fullScreenActivityViewModel;
            case 2:
                flow.getClass();
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(1563812978);
                Object rememberedValue15 = gapComposer3.rememberedValue();
                if (rememberedValue15 == obj10) {
                    rememberedValue15 = Updater.mutableStateOf$default(PaperMoneyDepositBarcodeViewModel.Loading.INSTANCE);
                    gapComposer3.updateRememberedValue(rememberedValue15);
                }
                MutableState mutableState5 = (MutableState) rememberedValue15;
                Updater.LaunchedEffect(gapComposer3, flow, new VerifyCheckDepositPresenter$models$3$1(flow, (Continuation) null, (MoleculePresenter) this, mutableState5, 20));
                PaperMoneyDepositBarcodeViewModel paperMoneyDepositBarcodeViewModel = (PaperMoneyDepositBarcodeViewModel) mutableState5.getValue();
                gapComposer3.end(false);
                return paperMoneyDepositBarcodeViewModel;
            default:
                AndroidStringManager androidStringManager2 = (AndroidStringManager) obj9;
                flow.getClass();
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(-529791330);
                Object rememberedValue16 = gapComposer4.rememberedValue();
                if (rememberedValue16 == obj10) {
                    rememberedValue16 = DBUtil.mapToOneOrNull(DBUtil.toFlow(((CashAccountDatabaseImpl) obj8).investingSettingsQueries.select$2()), (CoroutineContext) obj7);
                    gapComposer4.updateRememberedValue(rememberedValue16);
                }
                MutableState collectAsState6 = Updater.collectAsState((Flow) rememberedValue16, null, null, gapComposer4, 48, 2);
                List models = ((LocalCashBalancePresenter) obj6).models(flow, (Composer) gapComposer4, i & 14);
                Object rememberedValue17 = gapComposer4.rememberedValue();
                int i4 = 2;
                if (rememberedValue17 == obj10) {
                    Object formCashtag$8$invokeSuspend$$inlined$map$1 = new FormCashtag$8$invokeSuspend$$inlined$map$1(new InviteContactsPresenter$filterContacts$$inlined$map$1(flow, i4), i3);
                    gapComposer4.updateRememberedValue(formCashtag$8$invokeSuspend$$inlined$map$1);
                    rememberedValue17 = formCashtag$8$invokeSuspend$$inlined$map$1;
                }
                InvestingCryptoNewsViewModel investingCryptoNewsViewModel = (InvestingCryptoNewsViewModel) ((MoneybotHomePresenter) obj2).models((Flow) rememberedValue17, gapComposer4, 0);
                InvestingState investingStates = ((RealInvestingStateManager) obj5).investingStates(gapComposer4);
                Object rememberedValue18 = gapComposer4.rememberedValue();
                if (rememberedValue18 == obj10) {
                    rememberedValue18 = ((RealInvestmentActivity) obj4).countPendingStockActivity();
                    gapComposer4.updateRememberedValue(rememberedValue18);
                }
                MutableState collectAsState7 = Updater.collectAsState((Flow) rememberedValue18, 0L, null, gapComposer4, 48, 2);
                Object rememberedValue19 = gapComposer4.rememberedValue();
                int i5 = 3;
                if (rememberedValue19 == obj10) {
                    Object inviteContactsPresenter$special$$inlined$map$1 = new InviteContactsPresenter$special$$inlined$map$1(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new CheckStatusPresenter.AnonymousClass1(this, continuation3, 18), new InviteContactsPresenter$filterContacts$$inlined$map$1(flow, i5)), this, 1);
                    gapComposer4.updateRememberedValue(inviteContactsPresenter$special$$inlined$map$1);
                    rememberedValue19 = inviteContactsPresenter$special$$inlined$map$1;
                }
                MutableState collectAsState8 = Updater.collectAsState((Flow) rememberedValue19, new InvestingHomeViewEvent.SelectHistoricalRange(HistoricalRange.DAY), null, gapComposer4, 0, 2);
                Investing_settings investing_settings2 = (Investing_settings) collectAsState6.getValue();
                if (investing_settings2 == null || (str = investing_settings2.disclosures_web_url) == null) {
                    str = "null";
                }
                Resources resources = androidStringManager2.resources;
                resources.getClass();
                String format2 = new MessageFormat(resources.getString(R.string.investing_home_disclosure)).format(new Object[]{str});
                format2.getClass();
                String str9 = (!z || (investing_settings = (Investing_settings) collectAsState6.getValue()) == null || (str3 = investing_settings.investing_home_disclosure_text) == null) ? format2 : str3;
                Investing_settings investing_settings3 = (Investing_settings) collectAsState6.getValue();
                LearnMoreConfiguration learnMoreConfiguration = investing_settings3 != null ? investing_settings3.my_first_stock_configuration : null;
                InvestingHomeViewModel.MenuIcon.Settings settings = new InvestingHomeViewModel.MenuIcon.Settings(androidStringManager2.get(R.string.investing_settings_menu_icon_title));
                HistoricalRange historicalRange = ((InvestingHomeViewEvent.SelectHistoricalRange) collectAsState8.getValue()).range;
                long longValue = ((Number) collectAsState7.getValue()).longValue();
                UiCallbackModel models2 = ((NavigationCardPresenter) obj3).models(gapComposer4);
                String str10 = androidStringManager2.get(R.string.discovery_welcome_title);
                String str11 = androidStringManager2.get(R.string.discovery_welcome_subtitle);
                String str12 = androidStringManager2.get(R.string.discover_stock_label);
                str10.getClass();
                str11.getClass();
                str12.getClass();
                InvestingHomeViewModel.StocksWelcome stocksWelcome = new InvestingHomeViewModel.StocksWelcome(str10, str11);
                boolean z2 = longValue > 0;
                boolean z3 = models2.model != null;
                InvestingState.Content content = investingStates instanceof InvestingState.Content ? (InvestingState.Content) investingStates : null;
                if (content == null || !content.isDependent) {
                    ofNotNull = SetsKt__SetsKt.setOfNotNull(z3 ? InvestingHomeViewModel.Module.KYB_RESTRICTION : null, z2 ? InvestingHomeViewModel.Module.PLACEHOLDER_GRAPH : InvestingHomeViewModel.Module.STOCKS_WELCOME, !z2 ? InvestingHomeViewModel.Module.DISCOVER_STOCK : null, InvestingHomeViewModel.Module.NEWS_CAROUSEL, z2 ? InvestingHomeViewModel.Module.PENDING_TRADES : null, InvestingHomeViewModel.Module.HOLDINGS, InvestingHomeViewModel.Module.MY_FIRST_CONFIGURATION, InvestingHomeViewModel.Module.DISCLOSURE);
                } else {
                    ofNotNull = SetsKt__SetsKt.setOfNotNull(z3 ? InvestingHomeViewModel.Module.KYB_RESTRICTION : null, z2 ? InvestingHomeViewModel.Module.PLACEHOLDER_GRAPH : InvestingHomeViewModel.Module.STOCKS_WELCOME, !z2 ? InvestingHomeViewModel.Module.DISCOVER_STOCK : null, InvestingHomeViewModel.Module.MY_FIRST_CONFIGURATION, InvestingHomeViewModel.Module.NEWS_CAROUSEL, z2 ? InvestingHomeViewModel.Module.PENDING_TRADES : null, InvestingHomeViewModel.Module.HOLDINGS, InvestingHomeViewModel.Module.DISCLOSURE);
                }
                Set set = ofNotNull;
                if (z2) {
                    Long valueOf = Long.valueOf(longValue);
                    ArrayMap arrayMap = new ArrayMap(1);
                    arrayMap.put("count", valueOf);
                    String format3 = new MessageFormat(resources.getString(R.string.investing_pending_stocks)).format(arrayMap);
                    format3.getClass();
                    investingPendingTradesTileWidgetViewModel = new InvestingPendingTradesTileWidgetViewModel(format3, androidStringManager2.get(R.string.investing_view_all_pending_stock));
                } else {
                    investingPendingTradesTileWidgetViewModel = null;
                }
                int ordinal = historicalRange.ordinal();
                if (ordinal == 0) {
                    str2 = androidStringManager2.get(R.string.portfolio_value_today);
                } else if (ordinal == 1) {
                    str2 = androidStringManager2.get(R.string.portfolio_value_past_week);
                } else if (ordinal == 2) {
                    str2 = androidStringManager2.get(R.string.portfolio_value_past_month);
                } else if (ordinal == 3) {
                    str2 = androidStringManager2.get(R.string.portfolio_value_past_year);
                } else {
                    if (ordinal != 4) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    str2 = androidStringManager2.get(R.string.portfolio_value_all);
                }
                InvestingHomeViewModel.Discovery discovery = new InvestingHomeViewModel.Discovery(stocksWelcome, new InvestingPlaceholderGraphViewModel(historicalRange, str2), models, learnMoreConfiguration != null ? new ColoredLearnMoreConfigurationModel(learnMoreConfiguration) : null, str12, investingCryptoNewsViewModel, str9, investingPendingTradesTileWidgetViewModel, models2, androidStringManager2.get(R.string.investing_tab_title), settings, set);
                gapComposer4.end(false);
                return discovery;
        }
    }

    public SelectCustomerPresenter(CardActivityListScreen cardActivityListScreen, BetterNavigator.ScreenNavigator screenNavigator, SyncValueReader syncValueReader, ActivityClientService activityClientService, RealActivitiesCacheManager realActivitiesCacheManager, RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl, SessionManager sessionManager, ErrorReporter errorReporter, SampleStrategy sampleStrategy, FeatureFlagManager featureFlagManager) {
        this.stringManager = cardActivityListScreen;
        this.navigator = screenNavigator;
        this.profileManager = syncValueReader;
        this.sponsorshipStateProvider = activityClientService;
        this.familyProfileManager = realActivitiesCacheManager;
        this.inputFieldTextSaver = realActivityEmbeddedPresenter$Factory$Impl;
        this.args = sessionManager;
        this.currentCustomerToken = errorReporter;
        this.controller = sampleStrategy;
        this.isFeatureFlagEnabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(AmplitudeExperiments$BankingCashGreenRelease.INSTANCE)).enabled();
    }

    public SelectCustomerPresenter(PaperMoneyDepositBarcodeScreen paperMoneyDepositBarcodeScreen, BetterNavigator.ScreenNavigator screenNavigator, IntentLauncher intentLauncher, zzr zzrVar, AndroidClock androidClock, RealCashDepositBarcodeManager realCashDepositBarcodeManager, AndroidStringManager androidStringManager, Analytics analytics, FeatureFlagManager featureFlagManager, RealRouter$Factory$Impl realRouter$Factory$Impl) {
        paperMoneyDepositBarcodeScreen.getClass();
        this.profileManager = paperMoneyDepositBarcodeScreen;
        this.navigator = screenNavigator;
        this.sponsorshipStateProvider = intentLauncher;
        this.familyProfileManager = zzrVar;
        this.inputFieldTextSaver = androidClock;
        this.args = realCashDepositBarcodeManager;
        this.stringManager = androidStringManager;
        this.currentCustomerToken = analytics;
        this.controller = realRouter$Factory$Impl.create$1(screenNavigator);
        this.isFeatureFlagEnabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$PmdBarcodeDetailRows.INSTANCE)).enabled();
    }

    public SelectCustomerPresenter(AndroidStringManager androidStringManager, CashAccountDatabaseImpl cashAccountDatabaseImpl, InvestingCryptoNewsPresenter$Factory$Impl investingCryptoNewsPresenter$Factory$Impl, CoroutineContext coroutineContext, InvestingDiscoverySectionsPresenter$Factory$Impl investingDiscoverySectionsPresenter$Factory$Impl, RealInvestingStateManager realInvestingStateManager, FeatureFlagManager featureFlagManager, Cache cache, RealInvestmentActivity realInvestmentActivity, KybRestrictionBannerPresenter$AssistedInjectionFactory$Impl kybRestrictionBannerPresenter$AssistedInjectionFactory$Impl, BetterNavigator.ScreenNavigator screenNavigator) {
        this.stringManager = androidStringManager;
        this.profileManager = cashAccountDatabaseImpl;
        this.sponsorshipStateProvider = coroutineContext;
        this.familyProfileManager = realInvestingStateManager;
        this.inputFieldTextSaver = cache;
        this.args = realInvestmentActivity;
        this.navigator = investingCryptoNewsPresenter$Factory$Impl.create(screenNavigator, NewsKind.StocksPortfolio.INSTANCE, null, true);
        this.currentCustomerToken = kybRestrictionBannerPresenter$AssistedInjectionFactory$Impl.create(screenNavigator, new KybRestrictionBannerScreen(new InvestingScreens.InvestingHome(null, null, 63, false), KybEligibilityWarning.RestrictedFeature.RESTRICTED_FEATURE_INVESTING));
        this.isFeatureFlagEnabled = ((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$InvestingServerDrivenDisclosureText.INSTANCE)).enabled();
        this.controller = investingDiscoverySectionsPresenter$Factory$Impl.create(null);
    }
}
