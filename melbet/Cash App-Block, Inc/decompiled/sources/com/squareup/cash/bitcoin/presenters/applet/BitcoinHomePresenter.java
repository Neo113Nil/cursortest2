package com.squareup.cash.bitcoin.presenters.applet;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.google.zxing.BinaryBitmap;
import com.nimbusds.jose.jca.JCAContext;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.benefits.presenters.BenefitsHubPresenter$models$1$1;
import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator$Factory$Impl;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$special$$inlined$filter$1;
import com.squareup.cash.bitcoin.presenters.applet.allowlist.BitcoinWidgetAllowlistProvider;
import com.squareup.cash.bitcoin.presenters.applet.toolbar.RealBitcoinHomeToolbarPresenter;
import com.squareup.cash.bitcoin.presenters.applet.toolbar.RealBitcoinHomeToolbarPresenter$Factory$Impl;
import com.squareup.cash.bitcoin.presenters.applet.widget.BitcoinWidgetPlugin;
import com.squareup.cash.bitcoin.presenters.applet.widget.BitcoinWidgetPluginProvider;
import com.squareup.cash.bitcoin.presenters.investing.RealBitcoinSponsoredStateRepo;
import com.squareup.cash.bitcoin.presenters.map.RealBitcoinMapEligibilityManager;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.bitcoin.screens.BitcoinOverlay;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeState;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.toolbar.BitcoinHomeToolbarViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.widget.BitcoinWidget;
import com.squareup.cash.blockers.presenters.AmountBlockerPresenter$models$1$2;
import com.squareup.cash.blockers.views.ErrorView$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.views.SetNameViewKt$SetName$2$1;
import com.squareup.cash.card.onboarding.CardModelView$iconTexture$$inlined$map$1;
import com.squareup.cash.cashapplite.CashAppLiteReleaseModule$$ExternalSyntheticLambda0;
import com.squareup.cash.cdf.performance.PerformanceMeasureScrollPerformance;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.capability.RealBitcoinActivityProvider;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.family.familyhub.backend.api.DependentControlStatus;
import com.squareup.cash.family.familyhub.backend.real.RealDependentBalanceDetailLoggingManager;
import com.squareup.cash.family.familyhub.backend.real.RealDependentControlStatusManager;
import com.squareup.cash.family.familyhub.backend.real.RealDependentCustomerTokenRepository;
import com.squareup.cash.featureflags.AmplitudeExperiments$BitcoinMapCardV2;
import com.squareup.cash.featureflags.FeatureFlag$StringAmplitudeExperiment;
import com.squareup.cash.featureflags.FeatureFlag$StringFeatureFlag$Value;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$BitcoinAchEnqueueRequirements;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.history.presenters.ReportAbusePresenter$MetroFactory;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.performance.ScrollPerformanceAnalyzer;
import com.squareup.cash.performance.ScrollPerformanceAnalyzer$Factory$Impl;
import com.squareup.cash.recipients.data.RealCustomerStore;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.transfers.backend.real.RealTransferRequirementHandler;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;

/* loaded from: classes5.dex */
public final class BitcoinHomePresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final BitcoinHome args;
    public final BinaryBitmap bip177ExperimentDisplayPreferenceHandler;
    public final RealBitcoinActivityProvider bitcoinActivityProvider;
    public final boolean bitcoinEnqueueRequirementsEnabled;
    public final BitcoinWidgetAllowlistProvider bitcoinWidgetAllowlistProvider;
    public final BitcoinWidgetPluginProvider bitcoinWidgetPluginProvider;
    public final CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteGate;
    public final JCAContext cryptoDependentStatusRepo;
    public final RealDependentBalanceDetailLoggingManager dependentBalanceDetailLogger;
    public final Lazy dependentBitcoinControlStatusManager$delegate;
    public final RealDependentControlStatusManager.Factory dependentControlStatusManagerFactory;
    public final FeatureFlagManager featureFlagManager;
    public final BetterNavigator.ScreenNavigator navigator;
    public final ScrollPerformanceAnalyzer performanceAnalyzer;
    public final RealBitcoinHomeToolbarPresenter$Factory$Impl toolbarPresenterFactory;
    public final RealTransferRequirementHandler transferRequirementHandler;

    public BitcoinHomePresenter(RealBitcoinHomeToolbarPresenter$Factory$Impl realBitcoinHomeToolbarPresenter$Factory$Impl, RealBitcoinActivityProvider realBitcoinActivityProvider, BitcoinWidgetPluginProvider bitcoinWidgetPluginProvider, BitcoinWidgetAllowlistProvider bitcoinWidgetAllowlistProvider, ScrollPerformanceAnalyzer$Factory$Impl scrollPerformanceAnalyzer$Factory$Impl, Analytics analytics, JCAContext jCAContext, RealDependentControlStatusManager.Factory factory, RealDependentCustomerTokenRepository realDependentCustomerTokenRepository, RealDependentBalanceDetailLoggingManager realDependentBalanceDetailLoggingManager, BinaryBitmap binaryBitmap, RealTransferRequirementHandler realTransferRequirementHandler, FeatureFlagManager featureFlagManager, CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda0, BetterNavigator.ScreenNavigator screenNavigator, BitcoinHome bitcoinHome) {
        bitcoinHome.getClass();
        this.toolbarPresenterFactory = realBitcoinHomeToolbarPresenter$Factory$Impl;
        this.bitcoinActivityProvider = realBitcoinActivityProvider;
        this.bitcoinWidgetPluginProvider = bitcoinWidgetPluginProvider;
        this.bitcoinWidgetAllowlistProvider = bitcoinWidgetAllowlistProvider;
        this.analytics = analytics;
        this.cryptoDependentStatusRepo = jCAContext;
        this.dependentControlStatusManagerFactory = factory;
        this.dependentBalanceDetailLogger = realDependentBalanceDetailLoggingManager;
        this.bip177ExperimentDisplayPreferenceHandler = binaryBitmap;
        this.transferRequirementHandler = realTransferRequirementHandler;
        this.featureFlagManager = featureFlagManager;
        this.cashAppLiteGate = cashAppLiteReleaseModule$$ExternalSyntheticLambda0;
        this.navigator = screenNavigator;
        this.args = bitcoinHome;
        this.bitcoinEnqueueRequirementsEnabled = Intrinsics.areEqual(((FeatureFlag$StringFeatureFlag$Value) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$BitcoinAchEnqueueRequirements.INSTANCE)).value, "enabled_tab");
        this.performanceAnalyzer = scrollPerformanceAnalyzer$Factory$Impl.create(PerformanceMeasureScrollPerformance.Element.INVESTING_BITCOIN_MAIN);
        this.dependentBitcoinControlStatusManager$delegate = LazyKt.lazy(new ErrorView$$ExternalSyntheticLambda0(this, 17));
        realDependentCustomerTokenRepository._customerTokenFlow.setValue(bitcoinHome.dependentCustomerToken);
    }

    public final void HandleDependentScreenView(Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-954716273);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Unit unit = Unit.INSTANCE;
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BitcoinHomePresenter$models$2$1(this, null, i3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinHomePresenter$$ExternalSyntheticLambda0(this, i, 0);
        }
    }

    public final void HandleOpenAnalytics(Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1588788005);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Unit unit = Unit.INSTANCE;
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BitcoinHomePresenter$models$2$1(this, null, i3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinHomePresenter$$ExternalSyntheticLambda0(this, i, 1);
        }
    }

    public final void HandleScrollAnalytics(Flow flow, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1817807254);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(flow) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(this) ? 32 : 16;
        }
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BitcoinDepositsPresenter$special$$inlined$filter$1(flow, 18);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Flow flow2 = (Flow) rememberedValue;
            Updater.LaunchedEffect(gapComposer, flow2, new AmountBlockerPresenter$models$1$2(flow2, (Continuation) null, this, i3));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BalanceHomeViewKt$$ExternalSyntheticLambda11(this, flow, i, 28);
        }
    }

    public final void HandleTransferRequirements(Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1393223558);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BitcoinHomePresenter$models$3$1(this, null, 1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, "transfer-requirement-handler", (Function2) rememberedValue);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinHomePresenter$$ExternalSyntheticLambda0(this, i, 2);
        }
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        BetterNavigator.ScreenNavigator screenNavigator;
        Boolean bool;
        String str;
        MutableState mutableState;
        Object loading;
        Object obj;
        String str2;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1608724994);
        int i2 = i & 112;
        HandleScrollAnalytics(flow, gapComposer, i & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        int i3 = (i >> 3) & 14;
        HandleOpenAnalytics(gapComposer, i3);
        HandleDependentScreenView(gapComposer, i3);
        HandleTransferRequirements(gapComposer, i3);
        BitcoinHome bitcoinHome = this.args;
        BitcoinOverlay bitcoinOverlay = bitcoinHome.overlayToLaunchOnStart;
        Continuation continuation = null;
        int i4 = 0;
        if (bitcoinOverlay != null) {
            gapComposer.startReplaceGroup(-1106477359);
            Updater.LaunchedEffect(gapComposer, bitcoinOverlay, new SetNameViewKt$SetName$2$1(bitcoinOverlay, continuation, this, 11));
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-1106436997);
            gapComposer.end(false);
        }
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = (FlowKt__ZipKt$combine$$inlined$unsafeFlow$1) this.cryptoDependentStatusRepo.provider;
            gapComposer.updateRememberedValue(rememberedValue);
        }
        if (Intrinsics.areEqual((Boolean) Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2).getValue(), Boolean.TRUE)) {
            gapComposer.startReplaceGroup(-2013270070);
            Unit unit = Unit.INSTANCE;
            boolean z = ((i2 ^ 48) > 32 && gapComposer.changed(this)) || (i & 48) == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new BitcoinHomePresenter$models$2$1(this, continuation, i4);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-2013187424);
            gapComposer.end(false);
        }
        Object rememberedValue3 = gapComposer.rememberedValue();
        BetterNavigator.ScreenNavigator screenNavigator2 = this.navigator;
        if (rememberedValue3 == neverEqualPolicy) {
            ReportAbusePresenter$MetroFactory reportAbusePresenter$MetroFactory = this.toolbarPresenterFactory.delegateFactory;
            RealBitcoinInboundNavigator$Factory$Impl realBitcoinInboundNavigator$Factory$Impl = (RealBitcoinInboundNavigator$Factory$Impl) reportAbusePresenter$MetroFactory.contactRepository.invoke();
            AndroidStringManager androidStringManager = (AndroidStringManager) reportAbusePresenter$MetroFactory.stringManager.lambda.invoke();
            RealBitcoinSponsoredStateRepo realBitcoinSponsoredStateRepo = (RealBitcoinSponsoredStateRepo) reportAbusePresenter$MetroFactory.favoritesManager.invoke();
            Analytics analytics = (Analytics) reportAbusePresenter$MetroFactory.paymentManager.getValue();
            RealDependentCustomerTokenRepository realDependentCustomerTokenRepository = (RealDependentCustomerTokenRepository) reportAbusePresenter$MetroFactory.appService.getValue();
            RealCustomerStore realCustomerStore = (RealCustomerStore) reportAbusePresenter$MetroFactory.familyProfileManager.invoke();
            RealBitcoinMapEligibilityManager realBitcoinMapEligibilityManager = (RealBitcoinMapEligibilityManager) reportAbusePresenter$MetroFactory.routerFactory.invoke();
            realBitcoinInboundNavigator$Factory$Impl.getClass();
            androidStringManager.getClass();
            realBitcoinSponsoredStateRepo.getClass();
            analytics.getClass();
            realDependentCustomerTokenRepository.getClass();
            realCustomerStore.getClass();
            realBitcoinMapEligibilityManager.getClass();
            screenNavigator = screenNavigator2;
            RealBitcoinHomeToolbarPresenter realBitcoinHomeToolbarPresenter = new RealBitcoinHomeToolbarPresenter(realBitcoinInboundNavigator$Factory$Impl, androidStringManager, realBitcoinSponsoredStateRepo, analytics, realDependentCustomerTokenRepository, realCustomerStore, realBitcoinMapEligibilityManager, screenNavigator);
            gapComposer.updateRememberedValue(realBitcoinHomeToolbarPresenter);
            rememberedValue3 = realBitcoinHomeToolbarPresenter;
        } else {
            screenNavigator = screenNavigator2;
        }
        RealBitcoinHomeToolbarPresenter realBitcoinHomeToolbarPresenter2 = (RealBitcoinHomeToolbarPresenter) rememberedValue3;
        realBitcoinHomeToolbarPresenter2.getClass();
        Object rememberedValue4 = gapComposer.rememberedValue();
        int i5 = 7;
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = new CardModelView$iconTexture$$inlined$map$1(flow, i5);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        Flow flow2 = (Flow) rememberedValue4;
        String str3 = realBitcoinHomeToolbarPresenter2.dependentCustomerToken;
        flow2.getClass();
        gapComposer.startReplaceGroup(-55242616);
        Updater.LaunchedEffect(gapComposer, flow2, new AmountBlockerPresenter$models$1$2(flow2, continuation, realBitcoinHomeToolbarPresenter2, i5));
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = realBitcoinHomeToolbarPresenter2.sponsoredStateRepo.sponsorshipStateProvider.isSponsored();
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        BetterNavigator.ScreenNavigator screenNavigator3 = screenNavigator;
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue5, null, null, gapComposer, 48, 2);
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (rememberedValue6 == neverEqualPolicy) {
            rememberedValue6 = str3 != null ? realBitcoinHomeToolbarPresenter2.customerStore.getCustomerForId(str3) : new AppLockMonitor$special$$inlined$map$2(null, 19);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue6, null, null, gapComposer, 48, 2);
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (rememberedValue7 == neverEqualPolicy) {
            rememberedValue7 = realBitcoinHomeToolbarPresenter2.bitcoinMapEligibilityManager.isEligible();
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue7, Boolean.FALSE, null, gapComposer, 48, 2);
        boolean z2 = (str3 != null || (bool = (Boolean) collectAsState.getValue()) == null || bool.booleanValue()) ? false : true;
        boolean booleanValue = ((Boolean) collectAsState3.getValue()).booleanValue();
        Recipient recipient = (Recipient) collectAsState2.getValue();
        AndroidStringManager androidStringManager2 = realBitcoinHomeToolbarPresenter2.stringManager;
        if (recipient != null) {
            Recipient recipient2 = (Recipient) collectAsState2.getValue();
            if (recipient2 == null || (str2 = recipient2.getFirstName()) == null) {
                str2 = "";
            }
            Resources resources = androidStringManager2.resources;
            resources.getClass();
            str = new MessageFormat(resources.getString(R.string.dependent_bitcoin_home_toolbar_title)).format(new Object[]{str2});
            str.getClass();
        } else {
            str = androidStringManager2.get(R.string.bitcoin_asset_label);
        }
        String str4 = str;
        BitcoinHomeToolbarViewModel bitcoinHomeToolbarViewModel = new BitcoinHomeToolbarViewModel(str4, z2, booleanValue);
        gapComposer.end(false);
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (rememberedValue8 == neverEqualPolicy) {
            rememberedValue8 = this.bitcoinActivityProvider.hasBitcoinActivity();
            gapComposer.updateRememberedValue(rememberedValue8);
        }
        Boolean bool2 = (Boolean) Updater.collectAsState((Flow) rememberedValue8, null, null, gapComposer, 48, 2).getValue();
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (rememberedValue9 == neverEqualPolicy) {
            rememberedValue9 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue9);
        }
        MutableState mutableState2 = (MutableState) rememberedValue9;
        if (bool2 != null) {
            gapComposer.startReplaceGroup(-2012730422);
            if (bitcoinHome.dependentCustomerToken != null) {
                gapComposer.startReplaceGroup(-2012671987);
                Unit unit2 = Unit.INSTANCE;
                boolean z3 = ((i2 ^ 48) > 32 && gapComposer.changed(this)) || (i & 48) == 32;
                Object rememberedValue10 = gapComposer.rememberedValue();
                if (z3 || rememberedValue10 == neverEqualPolicy) {
                    rememberedValue10 = new BitcoinHomePresenter$models$3$1(this, null, 0);
                    gapComposer.updateRememberedValue(rememberedValue10);
                }
                Updater.LaunchedEffect(gapComposer, unit2, (Function2) rememberedValue10);
                Object rememberedValue11 = gapComposer.rememberedValue();
                if (rememberedValue11 == neverEqualPolicy) {
                    rememberedValue11 = ((RealDependentControlStatusManager) this.dependentBitcoinControlStatusManager$delegate.getValue()).dependentControlStatus;
                    gapComposer.updateRememberedValue(rememberedValue11);
                }
                mutableState = mutableState2;
                DependentControlStatus dependentControlStatus = (DependentControlStatus) Updater.collectAsState((Flow) rememberedValue11, DependentControlStatus.InitialLoading.INSTANCE, null, gapComposer, 0, 2).getValue();
                DependentControlStatus.Loaded.LoadedBitcoinControl loadedBitcoinControl = dependentControlStatus instanceof DependentControlStatus.Loaded.LoadedBitcoinControl ? (DependentControlStatus.Loaded.LoadedBitcoinControl) dependentControlStatus : null;
                obj = (loadedBitcoinControl == null || loadedBitcoinControl.controlEnabled) ? BitcoinHomeState.FamiliesActiveState.INSTANCE : BitcoinHomeState.FamiliesDisabledState.INSTANCE;
                gapComposer.end(false);
            } else {
                mutableState = mutableState2;
                if (bool2.booleanValue() || this.cashAppLiteGate.f$0) {
                    gapComposer.startReplaceGroup(-2011976626);
                    gapComposer.end(false);
                    obj = BitcoinHomeState.ActiveState.INSTANCE;
                } else {
                    gapComposer.startReplaceGroup(-2011918563);
                    DragAndDrop_androidKt.HandleDefaultDisplayPreference(this.bip177ExperimentDisplayPreferenceHandler, gapComposer, 0);
                    obj = BitcoinHomeState.NullState.INSTANCE;
                    gapComposer.end(false);
                }
            }
            mutableState.setValue(obj);
            gapComposer.end(false);
        } else {
            mutableState = mutableState2;
            gapComposer.startReplaceGroup(-2011786720);
            gapComposer.end(false);
        }
        Object rememberedValue12 = gapComposer.rememberedValue();
        if (rememberedValue12 == neverEqualPolicy) {
            rememberedValue12 = this.bitcoinWidgetAllowlistProvider.allowedWidgets();
            gapComposer.updateRememberedValue(rememberedValue12);
        }
        MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue12, null, null, gapComposer, 48, 2);
        BitcoinHomeState bitcoinHomeState = (BitcoinHomeState) mutableState.getValue();
        Set set = (Set) collectAsState4.getValue();
        if (bitcoinHomeState == null || set == null) {
            gapComposer.startReplaceGroup(-2051929354);
            gapComposer.end(false);
            loading = new BitcoinHomeViewModel.Loading(new BitcoinHomeToolbarViewModel(str4, false, false));
        } else {
            gapComposer.startReplaceGroup(-2051936346);
            int i6 = i2 << 9;
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            boolean changedInstance = gapComposer.changedInstance(bitcoinHomeState) | ((((57344 & i6) ^ 24576) > 16384 && gapComposer.changed(this)) || (i6 & 24576) == 16384);
            Object rememberedValue13 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue13 == neverEqualPolicy) {
                rememberedValue13 = new BenefitsHubPresenter$models$1$1(this, bitcoinHomeState, continuation, 22);
                gapComposer.updateRememberedValue(rememberedValue13);
            }
            MutableState produceState = Updater.produceState(emptyMap, bitcoinHomeState, (Function2) rememberedValue13, gapComposer, 6);
            boolean changed = gapComposer.changed(bitcoinHomeState) | gapComposer.changed(set);
            Object rememberedValue14 = gapComposer.rememberedValue();
            Object obj2 = rememberedValue14;
            if (changed || rememberedValue14 == neverEqualPolicy) {
                List<BitcoinWidget> placements = bitcoinHomeState.getPlacements();
                if (Intrinsics.areEqual(((FeatureFlag$StringAmplitudeExperiment.Value) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(AmplitudeExperiments$BitcoinMapCardV2.INSTANCE)).value, "enabled-below-grow-tools") && placements.contains(BitcoinWidget.BITCOIN_MAP_CARD) && placements.contains(BitcoinWidget.STACKING_TOOLS)) {
                    ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    for (BitcoinWidget bitcoinWidget : placements) {
                        BitcoinWidget bitcoinWidget2 = BitcoinWidget.BITCOIN_MAP_CARD;
                        if (bitcoinWidget != bitcoinWidget2) {
                            createListBuilder.add(bitcoinWidget);
                            if (bitcoinWidget == BitcoinWidget.STACKING_TOOLS) {
                                createListBuilder.add(bitcoinWidget2);
                            }
                        }
                    }
                    placements = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : placements) {
                    if (set.contains((BitcoinWidget) obj3)) {
                        arrayList.add(obj3);
                    }
                }
                gapComposer.updateRememberedValue(arrayList);
                obj2 = arrayList;
            }
            List list = (List) obj2;
            gapComposer.startReplaceGroup(1292035564);
            MapBuilder mapBuilder = new MapBuilder();
            gapComposer.startReplaceGroup(1292038131);
            Map map = (Map) produceState.getValue();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (set.contains((BitcoinWidget) entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                BitcoinWidget bitcoinWidget3 = (BitcoinWidget) entry2.getKey();
                BitcoinWidgetPlugin bitcoinWidgetPlugin = (BitcoinWidgetPlugin) entry2.getValue();
                gapComposer.startMovableGroup(-954601971, bitcoinWidget3);
                bitcoinWidgetPlugin.getClass();
                gapComposer.startReplaceGroup(717796033);
                BitcoinHomeWidgetViewModel models = bitcoinWidgetPlugin.getPresenter().models(screenNavigator3, flow, gapComposer, 0);
                gapComposer.end(false);
                mapBuilder.put(bitcoinWidget3, models);
                gapComposer.end(false);
            }
            gapComposer.end(false);
            MapBuilder build = mapBuilder.build();
            gapComposer.end(false);
            if (bitcoinHomeState instanceof BitcoinHomeState.ActiveState) {
                loading = new BitcoinHomeViewModel.Ready.ActiveState(bitcoinHomeToolbarViewModel, build, list);
            } else if (bitcoinHomeState instanceof BitcoinHomeState.FamiliesActiveState) {
                loading = new BitcoinHomeViewModel.Ready.FamiliesActiveState(bitcoinHomeToolbarViewModel, build, list);
            } else if (bitcoinHomeState instanceof BitcoinHomeState.FamiliesDisabledState) {
                loading = new BitcoinHomeViewModel.Ready.FamiliesDisabledState(bitcoinHomeToolbarViewModel, build, list);
            } else {
                if (!(bitcoinHomeState instanceof BitcoinHomeState.NullState)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                loading = new BitcoinHomeViewModel.Ready.NullState(bitcoinHomeToolbarViewModel, build, list);
            }
            gapComposer.end(false);
        }
        gapComposer.end(false);
        return loading;
    }
}
