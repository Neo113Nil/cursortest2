package com.squareup.cash.paymentpad.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.media3.muxer.Av1ConfigUtil;
import androidx.tracing.Trace;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.SwipeKt;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.local.backend.MarkMarketingMessageAsViewed$MetroFactory;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.squareup.cash.appmessages.overlay.RealOverlayAppMessageReader;
import com.squareup.cash.blockers.treehouse.TreehouseFlows;
import com.squareup.cash.boost.backend.RealBoostSyncer$refresh$1;
import com.squareup.cash.card.onboarding.InteractiveCardView$flingTo$1;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.PublicProfile;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.profile.documents.RealLegalDocumentManager$MetroFactory;
import com.squareup.cash.eligibility.backend.api.EligibleFeature;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientHapticsImprovements;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobileSurfacesKeypadQrToProfile;
import com.squareup.cash.featureflags.AmplitudeExperiments$P2pNearbyBle;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$PaymentPadAlertBanner;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.gcl.RealGlobalConfigManager;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.inappreview.real.RealRequestReviewFlagWrapper;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.merchant.backend.real.RealMerchantProfileRepo$MetroFactory;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$31$$inlined$map$1;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda9;
import com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper;
import com.squareup.cash.navigation.CashPaymentPadOutboundNavigator$Factory$Impl;
import com.squareup.cash.nearby.backend.RealNearbyPermissionStateProvider;
import com.squareup.cash.offers.views.home.OffersHomeV2Kt$$ExternalSyntheticLambda7;
import com.squareup.cash.overlays.OverlayKt$Overlay$1$1$1$1$1;
import com.squareup.cash.paychecks.views.HelpSheetViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.paymentpad.viewmodels.HomeViewModel;
import com.squareup.cash.paymentpad.viewmodels.MainPaymentPadViewModel;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import com.squareup.cash.payments.presenters.MainPaymentPresenter$models$4$4;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$PaymentPad;
import com.squareup.cash.qrcodes.QrShortcutInstaller;
import com.squareup.cash.storage.AndroidFileSaver;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter$Factory$Impl;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.tabs.viewmodels.TabToolbarViewModel;
import com.squareup.cash.tabs.viewmodels.TabToolbarViewModel$TabToolbarTitle$Icon;
import com.squareup.cash.tabs.viewmodels.TabToolbarViewModel$TabToolbarTitle$None;
import com.squareup.cash.ui.overlays.presenter.RealAlertBannerPresenter;
import com.squareup.cash.ui.overlays.presenter.RealAlertBannerPresenter$Factory$Impl;
import com.squareup.cash.ui.overlays.viewmodels.AlertBannerScreen;
import com.squareup.cash.ui.overlays.viewmodels.AlertBannerViewModel;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.franklin.ui.FullCashtag;
import com.squareup.util.compose.LifecycleKt;
import com.squareup.util.coroutines.StateFlowKt;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.ChannelAsFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;
import papa.PapaEvent;

/* loaded from: classes6.dex */
public final class HomeViewPresenter implements MoleculePresenter {
    public final RealAlertBannerPresenter alertBannerPresenter;
    public final Analytics analytics;
    public final Flow badgingState;
    public final FeatureFlagManager featureFlagManager;
    public final KeyValue hasSeenQrShortcutsOnboarding;
    public final EglCore inAppReviewLauncher;
    public final RealLowDiskSpaceAlertManager lowDiskSpaceAlertManager;
    public final Lazy mainPaymentPadPresenter$delegate;
    public final MoneybotFlagsHelper moneybotFlagsHelper;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealNearbyPermissionStateProvider nearbyPermissionStateProvider;
    public final RealOverlayAppMessageReader overlayAppMessageReader;
    public final RealP2pSettingsManager p2pSettingsManager;
    public final BufferedChannel paymentPadChannel;
    public final ChannelAsFlow paymentPadEvents;
    public final EglCore paymentPadOutboundNavigator;
    public final RealPaymentTabSettings paymentTabSettings;
    public final RealProfileManager profileManager;
    public final QrShortcutInstaller qrShortcutInstaller;
    public final KeyValue qrShortcutsOnboardingAppStarts;
    public final RealRequestReviewFlagWrapper requestReviewFlagWrapper;
    public final TabToolbarPresenter tabToolbarPresenter;
    public final SharedFlowImpl toolbarEvents = FlowKt.MutableSharedFlow$default(0, 0, null, 7);

    public HomeViewPresenter(Analytics analytics, RealProfileManager realProfileManager, RealOverlayAppMessageReader realOverlayAppMessageReader, EglCore eglCore, RealRequestReviewFlagWrapper realRequestReviewFlagWrapper, CashPaymentPadOutboundNavigator$Factory$Impl cashPaymentPadOutboundNavigator$Factory$Impl, TabToolbarPresenter$Factory$Impl tabToolbarPresenter$Factory$Impl, MainPaymentPadPresenter$Factory$Impl mainPaymentPadPresenter$Factory$Impl, RealAlertBannerPresenter$Factory$Impl realAlertBannerPresenter$Factory$Impl, FeatureFlagManager featureFlagManager, RealLowDiskSpaceAlertManager realLowDiskSpaceAlertManager, RealP2pSettingsManager realP2pSettingsManager, RealPaymentTabSettings realPaymentTabSettings, RealSessionFlags realSessionFlags, RealUuidGenerator realUuidGenerator, RealNearbyPermissionStateProvider realNearbyPermissionStateProvider, KeyValue keyValue, KeyValue keyValue2, QrShortcutInstaller qrShortcutInstaller, BetterNavigator.ScreenNavigator screenNavigator, Flow flow, MoneybotFlagsHelper moneybotFlagsHelper) {
        this.analytics = analytics;
        this.profileManager = realProfileManager;
        this.overlayAppMessageReader = realOverlayAppMessageReader;
        this.inAppReviewLauncher = eglCore;
        this.requestReviewFlagWrapper = realRequestReviewFlagWrapper;
        this.featureFlagManager = featureFlagManager;
        this.lowDiskSpaceAlertManager = realLowDiskSpaceAlertManager;
        this.p2pSettingsManager = realP2pSettingsManager;
        this.paymentTabSettings = realPaymentTabSettings;
        this.nearbyPermissionStateProvider = realNearbyPermissionStateProvider;
        this.hasSeenQrShortcutsOnboarding = keyValue;
        this.qrShortcutsOnboardingAppStarts = keyValue2;
        this.qrShortcutInstaller = qrShortcutInstaller;
        this.navigator = screenNavigator;
        this.badgingState = flow;
        this.moneybotFlagsHelper = moneybotFlagsHelper;
        this.tabToolbarPresenter = tabToolbarPresenter$Factory$Impl.create(screenNavigator, PaymentScreens$HomeScreens$PaymentPad.INSTANCE);
        this.mainPaymentPadPresenter$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new OffersHomeV2Kt$$ExternalSyntheticLambda7(23, mainPaymentPadPresenter$Factory$Impl, this));
        this.alertBannerPresenter = realAlertBannerPresenter$Factory$Impl.create$1(screenNavigator, AlertBannerScreen.PAYMENT_TAB);
        this.paymentPadOutboundNavigator = cashPaymentPadOutboundNavigator$Factory$Impl.create$1(screenNavigator);
        BufferedChannel Channel$default = PapaEvent.Channel$default(1, null, null, 6);
        this.paymentPadChannel = Channel$default;
        this.paymentPadEvents = FlowKt.receiveAsFlow(Channel$default);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        UiCallbackModel uiCallbackModel;
        boolean z;
        boolean z2;
        Object initialLoading;
        Av1ConfigUtil av1ConfigUtil;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1521807399);
        AmplitudeExperiments$ClientHapticsImprovements amplitudeExperiments$ClientHapticsImprovements = AmplitudeExperiments$ClientHapticsImprovements.INSTANCE;
        FeatureFlagManager featureFlagManager = this.featureFlagManager;
        RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
        boolean enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.currentValue(amplitudeExperiments$ClientHapticsImprovements)).enabled();
        boolean enabled2 = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$PaymentPadAlertBanner.INSTANCE)).enabled();
        Object rememberedValue = gapComposer.rememberedValue();
        int i2 = 3;
        int i3 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            RealPaymentTabSettings realPaymentTabSettings = this.paymentTabSettings;
            rememberedValue = !realPaymentTabSettings.bleManager.activity.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le") ? new AppLockMonitor$special$$inlined$map$2(Boolean.FALSE, 19) : new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(((RealFeatureFlagManager) realPaymentTabSettings.featureFlagManager).values(AmplitudeExperiments$P2pNearbyBle.INSTANCE), new FinishSetupTileBadgeCounter(10, realPaymentTabSettings.featureEligibilityRepository.currentEligibleFeatures(), new EligibleFeature[]{EligibleFeature.NEARBY_PAYMENT_FEATURE_VISIBILITY}), new InteractiveCardView$flingTo$1.AnonymousClass1(i2, (Continuation) (objArr8 == true ? 1 : 0), 4), 0);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Boolean bool = Boolean.FALSE;
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, bool, null, gapComposer, 48, 2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            MoneyTabPresenter$models$lambda$31$$inlined$map$1 moneyTabPresenter$models$lambda$31$$inlined$map$1 = new MoneyTabPresenter$models$lambda$31$$inlined$map$1(this.p2pSettingsManager.select(), 23);
            gapComposer.updateRememberedValue(moneyTabPresenter$models$lambda$31$$inlined$map$1);
            rememberedValue2 = moneyTabPresenter$models$lambda$31$$inlined$map$1;
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue2, bool, null, gapComposer, 48, 2);
        Object rememberedValue3 = gapComposer.rememberedValue();
        MoneybotFlagsHelper moneybotFlagsHelper = this.moneybotFlagsHelper;
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = moneybotFlagsHelper.moneybotHomeEnabled();
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        boolean booleanValue = ((Boolean) Updater.collectAsState((Flow) rememberedValue3, bool, null, gapComposer, 48, 2).getValue()).booleanValue();
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = moneybotFlagsHelper.moneybotEnabled();
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        boolean booleanValue2 = ((Boolean) Updater.collectAsState((Flow) rememberedValue4, bool, null, gapComposer, 48, 2).getValue()).booleanValue();
        Object rememberedValue5 = gapComposer.rememberedValue();
        int i4 = 27;
        if (rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = StateFlowKt.mapState(Trace.valuesStateExperiment(featureFlagManager, AmplitudeExperiments$MobileSurfacesKeypadQrToProfile.INSTANCE), new HelpSheetViewKt$$ExternalSyntheticLambda4(i4));
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState collectAsState3 = Updater.collectAsState((StateFlow) rememberedValue5, null, gapComposer, 1);
        MainPaymentPadViewModel models = ((MainPaymentPadPresenter) this.mainPaymentPadPresenter$delegate.getValue()).models((Flow) this.paymentPadEvents, (Composer) gapComposer, 0);
        if (enabled2) {
            gapComposer.startReplaceGroup(1511725978);
            UiCallbackModel models2 = this.alertBannerPresenter.models(gapComposer);
            gapComposer.end(false);
            uiCallbackModel = models2;
        } else {
            gapComposer.startReplaceGroup(1511777779);
            gapComposer.end(false);
            uiCallbackModel = null;
        }
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (rememberedValue6 == neverEqualPolicy) {
            rememberedValue6 = Updater.mutableStateOf$default(bool);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        MutableState mutableState = (MutableState) rememberedValue6;
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (rememberedValue7 == neverEqualPolicy) {
            rememberedValue7 = new MoneyTabUIKt$$ExternalSyntheticLambda9(i4, mutableState);
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        SwipeKt.SwipeHandler(this, (Function1) rememberedValue7, gapComposer, ((i >> 3) & 14) | 48);
        Unit unit = Unit.INSTANCE;
        Object[] objArr9 = {unit};
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue8 == neverEqualPolicy) {
            rememberedValue8 = new OverlayKt$Overlay$1$1$1$1$1(this, mutableState, objArr == true ? 1 : 0, 11);
            gapComposer.updateRememberedValue(rememberedValue8);
        }
        LifecycleKt.LifecycleLaunchedEffect(objArr9, null, null, (Function2) rememberedValue8, gapComposer, 0);
        Object[] objArr10 = {unit};
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue9 == neverEqualPolicy) {
            rememberedValue9 = new HomeViewPresenter$models$3$1(this, objArr2 == true ? 1 : 0, i3);
            gapComposer.updateRememberedValue(rememberedValue9);
        }
        LifecycleKt.LifecycleLaunchedEffect(objArr10, null, null, (Function2) rememberedValue9, gapComposer, 0);
        boolean changedInstance3 = gapComposer.changedInstance(this);
        Object rememberedValue10 = gapComposer.rememberedValue();
        if (changedInstance3 || rememberedValue10 == neverEqualPolicy) {
            rememberedValue10 = new HomeViewPresenter$models$3$1(this, objArr3 == true ? 1 : 0, r8);
            gapComposer.updateRememberedValue(rememberedValue10);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue10);
        boolean changedInstance4 = gapComposer.changedInstance(this);
        Object rememberedValue11 = gapComposer.rememberedValue();
        if (changedInstance4 || rememberedValue11 == neverEqualPolicy) {
            rememberedValue11 = new HomeViewPresenter$models$5$1(this, objArr4 == true ? 1 : 0, i3);
            gapComposer.updateRememberedValue(rememberedValue11);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue11);
        Object rememberedValue12 = gapComposer.rememberedValue();
        if (rememberedValue12 == neverEqualPolicy) {
            rememberedValue12 = this.profileManager.publicProfile();
            gapComposer.updateRememberedValue(rememberedValue12);
        }
        MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue12, null, null, gapComposer, 48, 2);
        boolean changed = gapComposer.changed((PublicProfile) collectAsState4.getValue());
        Object rememberedValue13 = gapComposer.rememberedValue();
        if (changed || rememberedValue13 == neverEqualPolicy) {
            PublicProfile publicProfile = (PublicProfile) collectAsState4.getValue();
            if (publicProfile != null) {
                FullCashtag fullCashtag = publicProfile.fullCashtag;
                String str = fullCashtag != null ? fullCashtag.cashtag_qr_image_url : null;
                if (str != null && str.length() != 0) {
                    String str2 = fullCashtag != null ? fullCashtag.printable_cashtag_qr_image_url : null;
                    if (str2 != null && str2.length() != 0) {
                        z = true;
                        rememberedValue13 = Boolean.valueOf(z);
                        gapComposer.updateRememberedValue(rememberedValue13);
                    }
                }
            }
            z = false;
            rememberedValue13 = Boolean.valueOf(z);
            gapComposer.updateRememberedValue(rememberedValue13);
        }
        Boolean bool2 = (Boolean) rememberedValue13;
        boolean booleanValue3 = bool2.booleanValue();
        boolean changed2 = gapComposer.changed(booleanValue3) | gapComposer.changedInstance(this);
        Object rememberedValue14 = gapComposer.rememberedValue();
        int i5 = 7;
        if (changed2 || rememberedValue14 == neverEqualPolicy) {
            rememberedValue14 = new RealBoostSyncer$refresh$1(booleanValue3, (Object) this, (Continuation) (objArr5 == true ? 1 : 0), i5);
            gapComposer.updateRememberedValue(rememberedValue14);
        }
        Updater.LaunchedEffect(gapComposer, bool2, (Function2) rememberedValue14);
        TabToolbarInternalViewModel models3 = this.tabToolbarPresenter.models((Flow) this.toolbarEvents, (Composer) gapComposer, 64);
        MoneyTabPresenter$models$lambda$31$$inlined$map$1 moneyTabPresenter$models$lambda$31$$inlined$map$12 = new MoneyTabPresenter$models$lambda$31$$inlined$map$1(flow, 22);
        Updater.LaunchedEffect(gapComposer, moneyTabPresenter$models$lambda$31$$inlined$map$12, new MainPaymentPresenter$models$4$4((Flow) moneyTabPresenter$models$lambda$31$$inlined$map$12, (Continuation) (objArr7 == true ? 1 : 0), (Object) uiCallbackModel, 6));
        Updater.LaunchedEffect(gapComposer, flow, new MainPaymentPresenter$models$4$4(flow, (Continuation) (objArr6 == true ? 1 : 0), (Object) this, i5));
        if (((PublicProfile) collectAsState4.getValue()) != null) {
            if (booleanValue3) {
                TabToolbarViewModel$TabToolbarTitle$Icon.IconType iconType = TabToolbarViewModel$TabToolbarTitle$Icon.IconType.QR_SCANNER;
                final TabToolbarViewModel$TabToolbarTitle$Icon tabToolbarViewModel$TabToolbarTitle$Icon = new TabToolbarViewModel$TabToolbarTitle$Icon();
                av1ConfigUtil = new Av1ConfigUtil(tabToolbarViewModel$TabToolbarTitle$Icon) { // from class: com.squareup.cash.tabs.viewmodels.TabToolbarViewModel$TabToolbarTitle$ImageTitle
                    public final TabToolbarViewModel$TabToolbarTitle$Icon icon;

                    {
                        this.icon = tabToolbarViewModel$TabToolbarTitle$Icon;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof TabToolbarViewModel$TabToolbarTitle$ImageTitle) && this.icon.equals(((TabToolbarViewModel$TabToolbarTitle$ImageTitle) obj).icon);
                    }

                    public final int hashCode() {
                        return this.icon.hashCode();
                    }

                    public final String toString() {
                        return "ImageTitle(icon=" + this.icon + ")";
                    }
                };
            } else {
                av1ConfigUtil = TabToolbarViewModel$TabToolbarTitle$None.INSTANCE;
            }
            HomeViewModel.QrButtonPlacement qrButtonPlacement = (!booleanValue3 || ((Boolean) collectAsState3.getValue()).booleanValue()) ? HomeViewModel.QrButtonPlacement.NONE : (booleanValue || booleanValue2) ? HomeViewModel.QrButtonPlacement.END : HomeViewModel.QrButtonPlacement.START;
            r8 = (!((Boolean) collectAsState.getValue()).booleanValue() || ((Boolean) collectAsState2.getValue()).booleanValue()) ? 0 : 1;
            TabToolbarViewModel tabToolbarViewModel = new TabToolbarViewModel(av1ConfigUtil);
            z2 = false;
            initialLoading = new HomeViewModel.Ready(qrButtonPlacement, r8, enabled, models, models3, tabToolbarViewModel, uiCallbackModel != null ? (AlertBannerViewModel) uiCallbackModel.model : null);
        } else {
            z2 = false;
            initialLoading = new HomeViewModel.InitialLoading(enabled, models);
        }
        gapComposer.end(z2);
        return initialLoading;
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final Provider alertBannerPresenterFactory;
        public final Provider analytics;
        public final Provider badgingState;
        public final Provider featureFlagManager;
        public final Provider hasSeenQrShortcutsOnboarding;
        public final Factory inAppReviewLauncher;
        public final Provider lowDiskSpaceAlertManager;
        public final Factory mainPaymentPadPresenterFactory;
        public final Provider moneybotFlagsHelper;
        public final Provider nearbyPermissionStateProvider;
        public final Provider overlayAppMessageReader;
        public final Provider p2pSettingsManager;
        public final Provider paymentPadOutboundNavigatorFactory;
        public final Provider paymentTabSettings;
        public final Provider profileManager;
        public final Provider qrShortcutInstaller;
        public final Provider qrShortcutsOnboardingAppStarts;
        public final Provider requestReviewFlagWrapper;
        public final Provider sessionFlags;
        public final Provider tabToolbarPresenterFactory;
        public final Provider uuidGenerator;

        public MetroFactory(Provider provider, RealMerchantProfileRepo$MetroFactory realMerchantProfileRepo$MetroFactory, RealLegalDocumentManager$MetroFactory realLegalDocumentManager$MetroFactory, Provider provider2, Provider provider3, RealMerchantProfileRepo$MetroFactory realMerchantProfileRepo$MetroFactory2, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, RealMerchantProfileRepo$MetroFactory realMerchantProfileRepo$MetroFactory3, Provider provider13, MarkMarketingMessageAsViewed$MetroFactory markMarketingMessageAsViewed$MetroFactory, Provider provider14, AndroidFileSaver.MetroFactory metroFactory, Provider provider15) {
            this.analytics = provider;
            this.qrShortcutInstaller = realMerchantProfileRepo$MetroFactory;
            this.badgingState = realLegalDocumentManager$MetroFactory;
            this.profileManager = provider2;
            this.overlayAppMessageReader = provider3;
            this.moneybotFlagsHelper = realMerchantProfileRepo$MetroFactory2;
            this.requestReviewFlagWrapper = provider4;
            this.paymentPadOutboundNavigatorFactory = provider5;
            this.tabToolbarPresenterFactory = provider6;
            this.alertBannerPresenterFactory = provider7;
            this.featureFlagManager = provider8;
            this.p2pSettingsManager = provider9;
            this.paymentTabSettings = provider10;
            this.sessionFlags = provider11;
            this.uuidGenerator = provider12;
            this.inAppReviewLauncher = realMerchantProfileRepo$MetroFactory3;
            this.nearbyPermissionStateProvider = provider13;
            this.mainPaymentPadPresenterFactory = markMarketingMessageAsViewed$MetroFactory;
            this.hasSeenQrShortcutsOnboarding = provider14;
            this.lowDiskSpaceAlertManager = metroFactory;
            this.qrShortcutsOnboardingAppStarts = provider15;
        }

        public MetroFactory(Provider provider, Provider provider2, Provider provider3, RealGlobalConfigManager.MetroFactory metroFactory, Provider provider4, Provider provider5, Provider provider6, InstanceFactory instanceFactory, Provider provider7, Provider provider8, RealBadger2.MetroFactory metroFactory2, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18) {
            this.analytics = provider;
            this.profileManager = provider2;
            this.overlayAppMessageReader = provider3;
            this.inAppReviewLauncher = metroFactory;
            this.requestReviewFlagWrapper = provider4;
            this.paymentPadOutboundNavigatorFactory = provider5;
            this.tabToolbarPresenterFactory = provider6;
            this.mainPaymentPadPresenterFactory = instanceFactory;
            this.alertBannerPresenterFactory = provider7;
            this.featureFlagManager = provider8;
            this.lowDiskSpaceAlertManager = metroFactory2;
            this.p2pSettingsManager = provider9;
            this.paymentTabSettings = provider10;
            this.sessionFlags = provider11;
            this.uuidGenerator = provider12;
            this.nearbyPermissionStateProvider = provider13;
            this.hasSeenQrShortcutsOnboarding = provider14;
            this.qrShortcutsOnboardingAppStarts = provider15;
            this.qrShortcutInstaller = provider16;
            this.badgingState = provider17;
            this.moneybotFlagsHelper = provider18;
        }

        public MetroFactory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, TreehouseFlows.MetroFactory metroFactory, InstanceFactory instanceFactory, Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19) {
            this.analytics = provider;
            this.profileManager = provider2;
            this.overlayAppMessageReader = provider3;
            this.requestReviewFlagWrapper = provider4;
            this.paymentPadOutboundNavigatorFactory = provider5;
            this.tabToolbarPresenterFactory = provider6;
            this.alertBannerPresenterFactory = provider7;
            this.featureFlagManager = provider8;
            this.p2pSettingsManager = provider9;
            this.paymentTabSettings = provider10;
            this.sessionFlags = provider11;
            this.uuidGenerator = provider12;
            this.nearbyPermissionStateProvider = provider13;
            this.inAppReviewLauncher = metroFactory;
            this.mainPaymentPadPresenterFactory = instanceFactory;
            this.hasSeenQrShortcutsOnboarding = provider14;
            this.qrShortcutsOnboardingAppStarts = provider15;
            this.qrShortcutInstaller = provider16;
            this.badgingState = provider17;
            this.moneybotFlagsHelper = provider18;
            this.lowDiskSpaceAlertManager = provider19;
        }
    }
}
