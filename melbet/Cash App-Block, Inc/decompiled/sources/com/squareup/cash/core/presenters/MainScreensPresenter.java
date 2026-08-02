package com.squareup.cash.core.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.tracing.Trace;
import app.cash.badging.api.BadgingState;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.badging.backend.RealBadgingStateAccessibilityHelper;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.presenters.RealBrandFollowPresenter;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.squareup.cash.R;
import com.squareup.cash.account.types.SignedInStateManager;
import com.squareup.cash.appmessages.InAppNotificationModel;
import com.squareup.cash.appmessages.RealAppMessageManager;
import com.squareup.cash.appmessages.TooltipAppMessageViewModel;
import com.squareup.cash.appmessages.presenters.RealAppMessageActionPerformer$Factory$Impl;
import com.squareup.cash.appmessages.presenters.RealInAppNotificationPresenter;
import com.squareup.cash.appmessages.presenters.RealInAppNotificationPresenter$Factory$Impl;
import com.squareup.cash.appmessages.presenters.RealTooltipAppMessagePresenter;
import com.squareup.cash.appmessages.presenters.RealTooltipAppMessagePresenter$Factory$Impl;
import com.squareup.cash.cashapplite.CashAppLiteReleaseModule$$ExternalSyntheticLambda0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticLambda9;
import com.squareup.cash.common.moneyformatter.RoundingMode;
import com.squareup.cash.core.navigationcontainer.models.MainScreensViewEvent;
import com.squareup.cash.core.navigationcontainer.models.MainScreensViewModel$Loading;
import com.squareup.cash.core.navigationcontainer.models.MainScreensViewModel$Ready;
import com.squareup.cash.core.navigationcontainer.models.MainScreensViewModel$Tab;
import com.squareup.cash.core.navigationcontainer.models.MainScreensViewModel$TabTreatment;
import com.squareup.cash.data.accessibility.AndroidAccessibilityManager;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.AmplitudeExperiments$MoneybotNavTransition;
import com.squareup.cash.featureflags.AmplitudeExperiments$MoneybotTopControlsTransition;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$MarketingMessagesTabBadging;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.privacy.RealBalancePrivacy;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.profile.presenters.RealProfilePasscodePresenter$MetroFactory;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.tabprovider.api.TabInfo;
import com.squareup.cash.tabprovider.real.RealTabPublisher;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageClientService;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.util.cash.Countries;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import okhttp3.internal.Tags;
import okio.Path$$ExternalSyntheticBUOutline0;
import retrofit2.OkHttpCall;

/* loaded from: classes.dex */
public final class MainScreensPresenter implements MoleculePresenter {
    public final RealBadgingStateAccessibilityHelper badgingStateAccessibilityHelper;
    public final MoneyFormatter balanceFormatter;
    public final RealBalancePrivacy balancePrivacy;
    public final RealBalanceSnapshotManager balanceSnapshotManager;
    public final CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteGate;
    public final RealFamilyProfileManager familyProfileManager;
    public final FeatureFlagManager featureFlagManager;
    public final RealInAppNotificationPresenter inAppNotificationPresenter;
    public final RealMoneybotAnalyticsService moneybotAnalyticsService;
    public final Navigator navigator;
    public final RealSessionFlags sessionFlags;
    public final SignedInStateManager signedInStateManager;
    public final AndroidStringManager stringManager;
    public final Flow tabBadges;
    public final OkHttpCall.AnonymousClass1 tabNavigator;
    public final RealTabPublisher tabPublisher;
    public final RealTooltipAppMessagePresenter tooltipAppMessagePresenter;

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TabInfo.Id.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TabInfo.Id id = TabInfo.Id.Activity;
                iArr[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TabInfo.Id id2 = TabInfo.Id.Activity;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TabInfo.Id id3 = TabInfo.Id.Activity;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                TabInfo.Id id4 = TabInfo.Id.Activity;
                iArr[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                TabInfo.Id id5 = TabInfo.Id.Activity;
                iArr[2] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[CurrencyCode.values().length];
            try {
                iArr2[CurrencyCode.EUR.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CurrencyCode.GBP.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public MainScreensPresenter(RealBadgingStateAccessibilityHelper realBadgingStateAccessibilityHelper, RealBalanceSnapshotManager realBalanceSnapshotManager, RealInAppNotificationPresenter$Factory$Impl realInAppNotificationPresenter$Factory$Impl, RealTooltipAppMessagePresenter$Factory$Impl realTooltipAppMessagePresenter$Factory$Impl, FeatureFlagManager featureFlagManager, RealMoneybotAnalyticsService realMoneybotAnalyticsService, MoneybotFlagsHelper moneybotFlagsHelper, LocalizedMoneyFormatter.Factory factory, SignedInStateManager signedInStateManager, AndroidStringManager androidStringManager, Flow flow, RealSessionFlags realSessionFlags, OkHttpCall.AnonymousClass1 anonymousClass1, RealTabPublisher realTabPublisher, RealBalancePrivacy realBalancePrivacy, CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda0, RealFamilyProfileManager realFamilyProfileManager, Navigator navigator) {
        navigator.getClass();
        this.badgingStateAccessibilityHelper = realBadgingStateAccessibilityHelper;
        this.balanceSnapshotManager = realBalanceSnapshotManager;
        this.featureFlagManager = featureFlagManager;
        this.moneybotAnalyticsService = realMoneybotAnalyticsService;
        this.signedInStateManager = signedInStateManager;
        this.stringManager = androidStringManager;
        this.tabBadges = flow;
        this.sessionFlags = realSessionFlags;
        this.tabNavigator = anonymousClass1;
        this.tabPublisher = realTabPublisher;
        this.balancePrivacy = realBalancePrivacy;
        this.cashAppLiteGate = cashAppLiteReleaseModule$$ExternalSyntheticLambda0;
        this.familyProfileManager = realFamilyProfileManager;
        this.navigator = navigator;
        RealBrandFollowPresenter.MetroFactory metroFactory = realInAppNotificationPresenter$Factory$Impl.delegateFactory;
        RealAppMessageActionPerformer$Factory$Impl realAppMessageActionPerformer$Factory$Impl = (RealAppMessageActionPerformer$Factory$Impl) metroFactory.syncer.invoke();
        CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) metroFactory.store.invoke();
        AppMessageClientService appMessageClientService = (AppMessageClientService) metroFactory.service.invoke();
        AndroidAccessibilityManager androidAccessibilityManager = (AndroidAccessibilityManager) metroFactory.repository.invoke();
        RealAppMessageManager realAppMessageManager = (RealAppMessageManager) metroFactory.analytics.invoke();
        CoroutineContext coroutineContext = (CoroutineContext) metroFactory.responseContextHandlerFactory.invoke();
        realAppMessageActionPerformer$Factory$Impl.getClass();
        cashAccountDatabaseImpl.getClass();
        appMessageClientService.getClass();
        androidAccessibilityManager.getClass();
        realAppMessageManager.getClass();
        coroutineContext.getClass();
        this.inAppNotificationPresenter = new RealInAppNotificationPresenter(realAppMessageActionPerformer$Factory$Impl, cashAccountDatabaseImpl, appMessageClientService, androidAccessibilityManager, realAppMessageManager, coroutineContext, navigator);
        RealProfilePasscodePresenter$MetroFactory realProfilePasscodePresenter$MetroFactory = realTooltipAppMessagePresenter$Factory$Impl.delegateFactory;
        RealAppMessageActionPerformer$Factory$Impl realAppMessageActionPerformer$Factory$Impl2 = (RealAppMessageActionPerformer$Factory$Impl) realProfilePasscodePresenter$MetroFactory.balanceSnapshotManager.invoke();
        CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) realProfilePasscodePresenter$MetroFactory.cryptoBalanceRepo.invoke();
        AppMessageClientService appMessageClientService2 = (AppMessageClientService) realProfilePasscodePresenter$MetroFactory.instrumentManager.invoke();
        Analytics analytics = (Analytics) realProfilePasscodePresenter$MetroFactory.profileManager.invoke();
        AndroidClock androidClock = (AndroidClock) realProfilePasscodePresenter$MetroFactory.blockersNavigator.invoke();
        RealAppMessageManager realAppMessageManager2 = (RealAppMessageManager) realProfilePasscodePresenter$MetroFactory.analytics.invoke();
        AndroidStringManager androidStringManager2 = (AndroidStringManager) realProfilePasscodePresenter$MetroFactory.stringManager.invoke();
        RealSessionFlags realSessionFlags2 = (RealSessionFlags) realProfilePasscodePresenter$MetroFactory.featureFlagManager.invoke();
        MoneybotFlagsHelper moneybotFlagsHelper2 = (MoneybotFlagsHelper) realProfilePasscodePresenter$MetroFactory.passcodeFlowStarter.invoke();
        KeyValue keyValue = (KeyValue) realProfilePasscodePresenter$MetroFactory.passcodeSettings.invoke();
        CoroutineContext coroutineContext2 = (CoroutineContext) realProfilePasscodePresenter$MetroFactory.ioDispatcher.invoke();
        realAppMessageActionPerformer$Factory$Impl2.getClass();
        cashAccountDatabaseImpl2.getClass();
        appMessageClientService2.getClass();
        analytics.getClass();
        androidClock.getClass();
        realAppMessageManager2.getClass();
        androidStringManager2.getClass();
        realSessionFlags2.getClass();
        moneybotFlagsHelper2.getClass();
        keyValue.getClass();
        coroutineContext2.getClass();
        this.tooltipAppMessagePresenter = new RealTooltipAppMessagePresenter(realAppMessageActionPerformer$Factory$Impl2, cashAccountDatabaseImpl2, appMessageClientService2, analytics, androidClock, realAppMessageManager2, androidStringManager2, realSessionFlags2, moneybotFlagsHelper2, keyValue, coroutineContext2, navigator);
        RoundingMode roundingMode = RoundingMode.DOWN;
        this.balanceFormatter = factory.createAbbreviatedUpToOneFractionDigit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        MutableState mutableState;
        GapComposer gapComposer;
        MainScreensViewModel$Tab mainScreensViewModel$Tab;
        MainScreensViewModel$Tab.Icon icon;
        long j;
        Money money;
        DerivedStateFlow derivedStateFlow = this.signedInStateManager.state;
        flow.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startReplaceGroup(899045702);
        Object rememberedValue = gapComposer2.rememberedValue();
        int i2 = 3;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(derivedStateFlow, 3);
            gapComposer2.updateRememberedValue(rememberedValue);
        }
        Boolean bool = Boolean.FALSE;
        Continuation continuation = null;
        if (((Boolean) Updater.collectAsState((Flow) rememberedValue, bool, null, gapComposer2, 48, 2).getValue()).booleanValue()) {
            gapComposer2.startReplaceGroup(54849801);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = this.balanceSnapshotManager.select();
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            mutableState = Updater.collectAsState((Flow) rememberedValue2, null, null, gapComposer2, 48, 2);
            gapComposer2.end(false);
        } else {
            gapComposer2.startReplaceGroup(54937097);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = Updater.mutableStateOf$default(null);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            mutableState = (MutableState) rememberedValue3;
            gapComposer2.end(false);
        }
        MutableState mutableState2 = mutableState;
        Object rememberedValue4 = gapComposer2.rememberedValue();
        int i3 = 25;
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = new AppLockMonitor$special$$inlined$map$2(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(derivedStateFlow, 6), 25), 4);
            gapComposer2.updateRememberedValue(rememberedValue4);
        }
        int i4 = 4;
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue4, "0", null, gapComposer2, 48, 2);
        Object rememberedValue5 = gapComposer2.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = Countries.observeState(this.balancePrivacy.obfuscationEnabled);
            gapComposer2.updateRememberedValue(rememberedValue5);
        }
        MutableState collectAsState2 = Updater.collectAsState((StateFlow) rememberedValue5, bool, null, gapComposer2, 48, 2);
        BalanceSnapshot balanceSnapshot = (BalanceSnapshot) mutableState2.getValue();
        CurrencyCode currencyCode = (balanceSnapshot == null || (money = balanceSnapshot.balance) == null) ? null : money.currency_code;
        MutableState collectAsState3 = Updater.collectAsState(this.tabBadges, null, null, gapComposer2, 48, 2);
        Object rememberedValue6 = gapComposer2.rememberedValue();
        if (rememberedValue6 == neverEqualPolicy) {
            rememberedValue6 = this.sessionFlags.moneybotHome;
            gapComposer2.updateRememberedValue(rememberedValue6);
        }
        MutableState collectAsState4 = Updater.collectAsState((StateFlow) rememberedValue6, null, gapComposer2, 1);
        Object rememberedValue7 = gapComposer2.rememberedValue();
        FeatureFlagManager featureFlagManager = this.featureFlagManager;
        if (rememberedValue7 == neverEqualPolicy) {
            rememberedValue7 = Trace.valuesState(featureFlagManager, AmplitudeExperiments$MoneybotNavTransition.INSTANCE);
            gapComposer2.updateRememberedValue(rememberedValue7);
        }
        MutableState collectAsState5 = Updater.collectAsState((StateFlow) rememberedValue7, null, gapComposer2, 1);
        Object rememberedValue8 = gapComposer2.rememberedValue();
        if (rememberedValue8 == neverEqualPolicy) {
            rememberedValue8 = Trace.valuesState(featureFlagManager, AmplitudeExperiments$MoneybotTopControlsTransition.INSTANCE);
            gapComposer2.updateRememberedValue(rememberedValue8);
        }
        MutableState collectAsState6 = Updater.collectAsState((StateFlow) rememberedValue8, null, gapComposer2, 1);
        Object rememberedValue9 = gapComposer2.rememberedValue();
        if (rememberedValue9 == neverEqualPolicy) {
            rememberedValue9 = this.familyProfileManager.familyProfile;
            gapComposer2.updateRememberedValue(rememberedValue9);
        }
        MutableState collectAsState7 = Updater.collectAsState((StateFlow) rememberedValue9, FamilyProfile.Standard.INSTANCE, null, gapComposer2, 0, 2);
        Object rememberedValue10 = gapComposer2.rememberedValue();
        int i5 = 2;
        if (rememberedValue10 == neverEqualPolicy) {
            AppLockMonitor$special$$inlined$map$2 appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(flow, 4), 2);
            gapComposer2.updateRememberedValue(appLockMonitor$special$$inlined$map$2);
            rememberedValue10 = appLockMonitor$special$$inlined$map$2;
        }
        InAppNotificationModel inAppNotificationModel = (InAppNotificationModel) this.inAppNotificationPresenter.models((Flow) rememberedValue10, gapComposer2, 0);
        Object rememberedValue11 = gapComposer2.rememberedValue();
        int i6 = 5;
        if (rememberedValue11 == neverEqualPolicy) {
            AppLockMonitor$special$$inlined$map$2 appLockMonitor$special$$inlined$map$22 = new AppLockMonitor$special$$inlined$map$2(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(flow, 5), 3);
            gapComposer2.updateRememberedValue(appLockMonitor$special$$inlined$map$22);
            rememberedValue11 = appLockMonitor$special$$inlined$map$22;
        }
        TooltipAppMessageViewModel tooltipAppMessageViewModel = (TooltipAppMessageViewModel) this.tooltipAppMessagePresenter.models((Flow) rememberedValue11, gapComposer2, 0);
        Updater.LaunchedEffect(gapComposer2, flow, new DataStoreImpl$data$1(flow, continuation, this, i3));
        Object rememberedValue12 = gapComposer2.rememberedValue();
        if (rememberedValue12 == neverEqualPolicy) {
            rememberedValue12 = StateFlowKt.mapState(this.tabPublisher._state, new Matcher$$ExternalSyntheticLambda9(22));
            gapComposer2.updateRememberedValue(rememberedValue12);
        }
        int i7 = 1;
        List list = (List) Updater.collectAsState((StateFlow) rememberedValue12, null, gapComposer2, 1).getValue();
        if (list == null) {
            gapComposer2.end(false);
            return MainScreensViewModel$Loading.INSTANCE;
        }
        List<TabInfo> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (TabInfo tabInfo : list2) {
            TabInfo.Id id = tabInfo.identifier;
            Function1 function1 = tabInfo.screenMatcher;
            int ordinal = id.ordinal();
            Continuation continuation2 = continuation;
            RealBadgingStateAccessibilityHelper realBadgingStateAccessibilityHelper = this.badgingStateAccessibilityHelper;
            AndroidStringManager androidStringManager = this.stringManager;
            if (ordinal != 0) {
                if (ordinal == i7) {
                    gapComposer = gapComposer2;
                    String str = (String) collectAsState.getValue();
                    BadgingState badgingState = (BadgingState) collectAsState3.getValue();
                    BalanceSnapshot balanceSnapshot2 = (BalanceSnapshot) mutableState2.getValue();
                    boolean booleanValue = ((Boolean) collectAsState2.getValue()).booleanValue();
                    long j2 = badgingState != null ? badgingState.balance : 0L;
                    Money money2 = balanceSnapshot2 != null ? balanceSnapshot2.balance : continuation2;
                    if (!booleanValue && money2 != 0) {
                        Long l = money2.amount;
                        l.getClass();
                        if (l.longValue() > 100) {
                            icon = new MainScreensViewModel$Tab.Icon.Text(this.balanceFormatter.format(money2));
                            mainScreensViewModel$Tab = new MainScreensViewModel$Tab(Recorder$$ExternalSyntheticOutline2.m$1(str, "banking"), icon, j2, androidStringManager.get(R.string.core_pres_tab_money), realBadgingStateAccessibilityHelper.get(j2), androidStringManager.get(R.string.core_pres_tab_money), function1, new MainScreensViewEvent.TapBanking(j2), MainScreensViewModel$Tab.TooltipTarget.Money);
                        }
                    }
                    icon = MainScreensViewModel$Tab.Icon.Money.INSTANCE;
                    mainScreensViewModel$Tab = new MainScreensViewModel$Tab(Recorder$$ExternalSyntheticOutline2.m$1(str, "banking"), icon, j2, androidStringManager.get(R.string.core_pres_tab_money), realBadgingStateAccessibilityHelper.get(j2), androidStringManager.get(R.string.core_pres_tab_money), function1, new MainScreensViewEvent.TapBanking(j2), MainScreensViewModel$Tab.TooltipTarget.Money);
                } else {
                    if (ordinal == i5) {
                        Path$$ExternalSyntheticBUOutline0.m();
                        return continuation2;
                    }
                    if (ordinal == i2) {
                        gapComposer = gapComposer2;
                        String str2 = (String) collectAsState.getValue();
                        BadgingState badgingState2 = (BadgingState) collectAsState3.getValue();
                        int i8 = currencyCode == null ? -1 : WhenMappings.$EnumSwitchMapping$1[currencyCode.ordinal()];
                        MainScreensViewModel$Tab.Icon icon2 = i8 != i7 ? i8 != 2 ? MainScreensViewModel$Tab.Icon.PaymentDollar.INSTANCE : MainScreensViewModel$Tab.Icon.PaymentPound.INSTANCE : MainScreensViewModel$Tab.Icon.PaymentGeneric.INSTANCE;
                        long j3 = badgingState2 != null ? badgingState2.paymentPad : 0L;
                        mainScreensViewModel$Tab = new MainScreensViewModel$Tab(Recorder$$ExternalSyntheticOutline2.m$1(str2, "payment"), icon2, j3, androidStringManager.get(R.string.core_pres_tab_payment), realBadgingStateAccessibilityHelper.get(j3), androidStringManager.get(R.string.core_pres_tab_payment), function1, new MainScreensViewEvent.TapSend(j3), MainScreensViewModel$Tab.TooltipTarget.Send, true);
                    } else if (ordinal != i4) {
                        if (ordinal != i6) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return continuation2;
                        }
                        String str3 = (String) collectAsState.getValue();
                        BadgingState badgingState3 = (BadgingState) collectAsState3.getValue();
                        if (((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$MarketingMessagesTabBadging.INSTANCE)).enabled()) {
                            gapComposer = gapComposer2;
                            if (badgingState3 != null) {
                                j = badgingState3.local;
                                mainScreensViewModel$Tab = new MainScreensViewModel$Tab(Recorder$$ExternalSyntheticOutline2.m$1(str3, "local"), MainScreensViewModel$Tab.Icon.Local.INSTANCE, j, androidStringManager.get(R.string.core_pres_tab_local), realBadgingStateAccessibilityHelper.get(j), androidStringManager.get(R.string.core_pres_tab_local), function1, new MainScreensViewEvent.TapLocal(j), MainScreensViewModel$Tab.TooltipTarget.Local);
                            }
                            j = 0;
                            mainScreensViewModel$Tab = new MainScreensViewModel$Tab(Recorder$$ExternalSyntheticOutline2.m$1(str3, "local"), MainScreensViewModel$Tab.Icon.Local.INSTANCE, j, androidStringManager.get(R.string.core_pres_tab_local), realBadgingStateAccessibilityHelper.get(j), androidStringManager.get(R.string.core_pres_tab_local), function1, new MainScreensViewEvent.TapLocal(j), MainScreensViewModel$Tab.TooltipTarget.Local);
                        } else {
                            gapComposer = gapComposer2;
                            if (badgingState3 != null) {
                                j = badgingState3.card;
                                mainScreensViewModel$Tab = new MainScreensViewModel$Tab(Recorder$$ExternalSyntheticOutline2.m$1(str3, "local"), MainScreensViewModel$Tab.Icon.Local.INSTANCE, j, androidStringManager.get(R.string.core_pres_tab_local), realBadgingStateAccessibilityHelper.get(j), androidStringManager.get(R.string.core_pres_tab_local), function1, new MainScreensViewEvent.TapLocal(j), MainScreensViewModel$Tab.TooltipTarget.Local);
                            }
                            j = 0;
                            mainScreensViewModel$Tab = new MainScreensViewModel$Tab(Recorder$$ExternalSyntheticOutline2.m$1(str3, "local"), MainScreensViewModel$Tab.Icon.Local.INSTANCE, j, androidStringManager.get(R.string.core_pres_tab_local), realBadgingStateAccessibilityHelper.get(j), androidStringManager.get(R.string.core_pres_tab_local), function1, new MainScreensViewEvent.TapLocal(j), MainScreensViewModel$Tab.TooltipTarget.Local);
                        }
                    }
                }
                arrayList.add(mainScreensViewModel$Tab);
                continuation = continuation2;
                gapComposer2 = gapComposer;
                i4 = 4;
                i7 = 1;
                i5 = 2;
                i6 = 5;
                i2 = 3;
            }
            gapComposer = gapComposer2;
            String str4 = (String) collectAsState.getValue();
            BadgingState badgingState4 = (BadgingState) collectAsState3.getValue();
            boolean booleanValue2 = ((Boolean) collectAsState4.getValue()).booleanValue();
            long j4 = badgingState4 != null ? badgingState4.activity : 0L;
            mainScreensViewModel$Tab = new MainScreensViewModel$Tab(Recorder$$ExternalSyntheticOutline2.m$1(str4, "activity"), (booleanValue2 || j4 <= 0) ? MainScreensViewModel$Tab.Icon.Activity.INSTANCE : new MainScreensViewModel$Tab.Icon.FullBadge(j4), !booleanValue2 ? 0L : j4, androidStringManager.get(R.string.core_pres_tab_activity), realBadgingStateAccessibilityHelper.get(j4), androidStringManager.get(R.string.core_pres_tab_activity), function1, new MainScreensViewEvent.TapActivity(j4), MainScreensViewModel$Tab.TooltipTarget.Activity);
            arrayList.add(mainScreensViewModel$Tab);
            continuation = continuation2;
            gapComposer2 = gapComposer;
            i4 = 4;
            i7 = 1;
            i5 = 2;
            i6 = 5;
            i2 = 3;
        }
        GapComposer gapComposer3 = gapComposer2;
        MainScreensViewModel$Ready mainScreensViewModel$Ready = new MainScreensViewModel$Ready(((FamilyProfile) collectAsState7.getValue()) instanceof FamilyProfile.ManagedAccount ? MainScreensViewModel$TabTreatment.Hidden.INSTANCE : this.cashAppLiteGate.f$0 ? MainScreensViewModel$TabTreatment.LiteFab.INSTANCE : ((Boolean) collectAsState4.getValue()).booleanValue() ? MainScreensViewModel$TabTreatment.Floating.INSTANCE : MainScreensViewModel$TabTreatment.Inline.INSTANCE, Tags.toPersistentList(arrayList), inAppNotificationModel, tooltipAppMessageViewModel, ((Boolean) collectAsState4.getValue()).booleanValue(), ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) collectAsState5.getValue()).enabled(), ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) collectAsState6.getValue()).enabled());
        gapComposer3.end(false);
        return mainScreensViewModel$Ready;
    }
}
