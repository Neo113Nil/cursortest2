package com.squareup.cash.afterpayapplet.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.draw.RotateKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.molecule.PlatformKt;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.loader.ActivitiesCache;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.presenters.ActivityEmbeddedPresenter$Companion;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewModel;
import com.squareup.cash.activity.viewmodels.ActivityFeedEntry;
import com.squareup.cash.afterpayapplet.backend.AfterpayAppletParsingErrorFactory;
import com.squareup.cash.afterpayapplet.backend.HomeResult;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletAnalytics;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletPurchasesScreen;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletPurchasesEmbeddedViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.FooterSection;
import com.squareup.cash.afterpayapplet.viewmodels.LoadableText;
import com.squareup.cash.aiedge.MLKitTitleGenerator$prepareModel$1;
import com.squareup.cash.amountslider.AmountPickerCondensedView;
import com.squareup.cash.arcade.treehouse.SearchBarBinding$Content$1$1;
import com.squareup.cash.banking.observability.ProtoParsingError;
import com.squareup.cash.biometrics.AndroidSecureStore$read$2;
import com.squareup.cash.cdf.afterpayapplet.AfterpayAppletScreen;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletActivityResponse;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHome;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletPurchaseHistoryResponse;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletResponse;
import com.squareup.protos.cash.cashsuggest.api.CreditLineSnapshot;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.util.cash.StringsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.Flow;
import squareup.cash.earnings.EarningTool;

/* loaded from: classes5.dex */
public final class AfterpayAppletPurchasesEmbeddedPresenter implements MoleculePresenter, HasObservability {
    public final RealAfterpayAppletAnalytics afterpayAppletAnalytics;
    public final RealAfterpayAppletRepository afterpayAppletRepository;
    public final AfterpayAppletScreen$AfterpayAppletPurchasesScreen args;
    public final RealActivityEmbeddedPresenter completedEmbeddedPresenter;
    public final ActivitiesManager.Factory defaultActivitiesManagerFactory;
    public final ErrorReporter errorReporter;
    public final ParcelableSnapshotMutableState footerSection$delegate;
    public final MoneyFormatter moneyFormatter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealObservabilityManager observabilityManager;
    public final SampleStrategy oneErrorPerAppSessionStrategy;
    public final RealRouter router;
    public final AndroidStringManager stringManager;
    public final RealActivityEmbeddedPresenter upcomingEmbeddedPresenter;
    public static final Map refreshAttributePurchase = Thread$State$EnumUnboxingLocalUtility.m("source_screen", "PURCHASE");
    public static final ActivityEmbeddedViewModel EMPTY_ACTIVITY_MODEL = new ActivityEmbeddedViewModel(false, EmptyList.INSTANCE);

    public AfterpayAppletPurchasesEmbeddedPresenter(BetterNavigator.ScreenNavigator screenNavigator, AfterpayAppletScreen$AfterpayAppletPurchasesScreen afterpayAppletScreen$AfterpayAppletPurchasesScreen, AndroidStringManager androidStringManager, RealObservabilityManager realObservabilityManager, RealAfterpayAppletRepository realAfterpayAppletRepository, RealAfterpayAppletAnalytics realAfterpayAppletAnalytics, ErrorReporter errorReporter, SampleStrategy sampleStrategy, RealRouter$Factory$Impl realRouter$Factory$Impl, SessionManager sessionManager, LocalizedMoneyFormatter.Factory factory, RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl, OrderItemEventHandler$Factory$Impl orderItemEventHandler$Factory$Impl, AfterpayAppletPageRequestHandler$Factory$Impl afterpayAppletPageRequestHandler$Factory$Impl, ActivitiesManager.Factory factory2) {
        afterpayAppletScreen$AfterpayAppletPurchasesScreen.getClass();
        this.navigator = screenNavigator;
        this.args = afterpayAppletScreen$AfterpayAppletPurchasesScreen;
        this.stringManager = androidStringManager;
        this.observabilityManager = realObservabilityManager;
        this.afterpayAppletRepository = realAfterpayAppletRepository;
        this.afterpayAppletAnalytics = realAfterpayAppletAnalytics;
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
        this.defaultActivitiesManagerFactory = factory2;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        this.moneyFormatter = factory.create(MoneyFormatterConfig.STANDARD);
        this.footerSection$delegate = Updater.mutableStateOf$default(null);
        String activeAccountToken = PlatformKt.activeAccountToken(sessionManager);
        ActivitiesManager.ActivityContext activityContext = new ActivitiesManager.ActivityContext(new ActivityToken(ActivityTokenType.CUSTOMER_TOKEN_ORDERS, activeAccountToken, (String) null, 12), ActivityScope.MY_ACTIVITY, afterpayAppletPageRequestHandler$Factory$Impl.create("PurchasesEmbedded"), 8);
        final int i = 0;
        this.upcomingEmbeddedPresenter = realActivityEmbeddedPresenter$Factory$Impl.create(screenNavigator, ActivityEmbeddedPresenter$Companion.EmbeddedRecentsConfiguration$default(activityContext, new ActivitiesCache.InMemory(), afterpayAppletScreen$AfterpayAppletPurchasesScreen, new Function0(this) { // from class: com.squareup.cash.afterpayapplet.presenters.AfterpayAppletPurchasesEmbeddedPresenter$$ExternalSyntheticLambda0
            public final /* synthetic */ AfterpayAppletPurchasesEmbeddedPresenter f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AfterpayAppletPurchasesEmbeddedPresenter afterpayAppletPurchasesEmbeddedPresenter = this.f$0;
                switch (i2) {
                    case 0:
                        afterpayAppletPurchasesEmbeddedPresenter.afterpayAppletAnalytics.trackViewedAllOrders(false);
                        afterpayAppletPurchasesEmbeddedPresenter.navigator.goTo(new AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen(AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen.OrderActivityType.UPCOMING));
                        break;
                    default:
                        afterpayAppletPurchasesEmbeddedPresenter.afterpayAppletAnalytics.trackViewedAllOrders(true);
                        afterpayAppletPurchasesEmbeddedPresenter.navigator.goTo(new AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen(AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen.OrderActivityType.COMPLETED));
                        break;
                }
                return Unit.INSTANCE;
            }
        }, 15, null, null, orderItemEventHandler$Factory$Impl, null, new ActivitiesManager.Factory(this) { // from class: com.squareup.cash.afterpayapplet.presenters.AfterpayAppletPurchasesEmbeddedPresenter$$ExternalSyntheticLambda1
            public final /* synthetic */ AfterpayAppletPurchasesEmbeddedPresenter f$0;

            {
                this.f$0 = this;
            }

            @Override // com.squareup.cash.activity.backend.loader.ActivitiesManager.Factory
            public final ActivitiesManager create(ActivitiesManager.ActivityContext activityContext2, ActivitiesCache activitiesCache) {
                int i2 = i;
                AfterpayAppletPurchasesEmbeddedPresenter afterpayAppletPurchasesEmbeddedPresenter = this.f$0;
                switch (i2) {
                    case 0:
                        activityContext2.getClass();
                        activitiesCache.getClass();
                        return new UpcomingOrdersActivitiesManager(afterpayAppletPurchasesEmbeddedPresenter.defaultActivitiesManagerFactory.create(activityContext2, activitiesCache));
                    default:
                        activityContext2.getClass();
                        activitiesCache.getClass();
                        return new CompletedOrdersActivitiesManager(afterpayAppletPurchasesEmbeddedPresenter.defaultActivitiesManagerFactory.create(activityContext2, activitiesCache));
                }
            }
        }, 5576));
        final int i2 = 1;
        this.completedEmbeddedPresenter = realActivityEmbeddedPresenter$Factory$Impl.create(screenNavigator, ActivityEmbeddedPresenter$Companion.EmbeddedRecentsConfiguration$default(activityContext, new ActivitiesCache.InMemory(), afterpayAppletScreen$AfterpayAppletPurchasesScreen, new Function0(this) { // from class: com.squareup.cash.afterpayapplet.presenters.AfterpayAppletPurchasesEmbeddedPresenter$$ExternalSyntheticLambda0
            public final /* synthetic */ AfterpayAppletPurchasesEmbeddedPresenter f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AfterpayAppletPurchasesEmbeddedPresenter afterpayAppletPurchasesEmbeddedPresenter = this.f$0;
                switch (i22) {
                    case 0:
                        afterpayAppletPurchasesEmbeddedPresenter.afterpayAppletAnalytics.trackViewedAllOrders(false);
                        afterpayAppletPurchasesEmbeddedPresenter.navigator.goTo(new AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen(AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen.OrderActivityType.UPCOMING));
                        break;
                    default:
                        afterpayAppletPurchasesEmbeddedPresenter.afterpayAppletAnalytics.trackViewedAllOrders(true);
                        afterpayAppletPurchasesEmbeddedPresenter.navigator.goTo(new AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen(AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen.OrderActivityType.COMPLETED));
                        break;
                }
                return Unit.INSTANCE;
            }
        }, 3, null, null, orderItemEventHandler$Factory$Impl, null, new ActivitiesManager.Factory(this) { // from class: com.squareup.cash.afterpayapplet.presenters.AfterpayAppletPurchasesEmbeddedPresenter$$ExternalSyntheticLambda1
            public final /* synthetic */ AfterpayAppletPurchasesEmbeddedPresenter f$0;

            {
                this.f$0 = this;
            }

            @Override // com.squareup.cash.activity.backend.loader.ActivitiesManager.Factory
            public final ActivitiesManager create(ActivitiesManager.ActivityContext activityContext2, ActivitiesCache activitiesCache) {
                int i22 = i2;
                AfterpayAppletPurchasesEmbeddedPresenter afterpayAppletPurchasesEmbeddedPresenter = this.f$0;
                switch (i22) {
                    case 0:
                        activityContext2.getClass();
                        activitiesCache.getClass();
                        return new UpcomingOrdersActivitiesManager(afterpayAppletPurchasesEmbeddedPresenter.defaultActivitiesManagerFactory.create(activityContext2, activitiesCache));
                    default:
                        activityContext2.getClass();
                        activitiesCache.getClass();
                        return new CompletedOrdersActivitiesManager(afterpayAppletPurchasesEmbeddedPresenter.defaultActivitiesManagerFactory.create(activityContext2, activitiesCache));
                }
            }
        }, 5576));
    }

    public static boolean hasActivityItems(ActivityEmbeddedViewModel activityEmbeddedViewModel) {
        List list = activityEmbeddedViewModel.feedEntries;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((ActivityFeedEntry) it.next()) instanceof ActivityFeedEntry.Item) {
                return true;
            }
        }
        return false;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return this.oneErrorPerAppSessionStrategy;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        String translated;
        AfterpayAppletPurchaseHistoryResponse afterpayAppletPurchaseHistoryResponse;
        LocalizedString localizedString;
        AfterpayAppletActivityResponse afterpayAppletActivityResponse;
        LocalizedString localizedString2;
        String str;
        AfterpayAppletPurchasesEmbeddedViewModel.TotalOwedSection totalOwedSection;
        String translated2;
        AfterpayAppletPurchaseHistoryResponse afterpayAppletPurchaseHistoryResponse2;
        LocalizedString localizedString3;
        AfterpayAppletActivityResponse afterpayAppletActivityResponse2;
        LocalizedString localizedString4;
        String translated3;
        AfterpayAppletPurchaseHistoryResponse afterpayAppletPurchaseHistoryResponse3;
        LocalizedString localizedString5;
        AfterpayAppletActivityResponse afterpayAppletActivityResponse3;
        LocalizedString localizedString6;
        String translated4;
        AfterpayAppletActivityResponse afterpayAppletActivityResponse4;
        LocalizedString localizedString7;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1429916011);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(HomeResult.HomeLoading.INSTANCE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new MLKitTitleGenerator$prepareModel$1(this, mutableState, null, 4);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new AmountPickerCondensedView.AnonymousClass14(this, null, 6);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
        HomeResult homeResult = (HomeResult) mutableState.getValue();
        boolean changedInstance3 = gapComposer.changedInstance(this);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changedInstance3 || rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = new SearchBarBinding$Content$1$1(this, mutableState, continuation, 12);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        Updater.LaunchedEffect(gapComposer, homeResult, (Function2) rememberedValue4);
        UiCallbackModel models = this.upcomingEmbeddedPresenter.models(gapComposer, 0);
        Object obj = models.model;
        UiCallbackModel models2 = this.completedEmbeddedPresenter.models(gapComposer, 0);
        Object obj2 = models2.model;
        Updater.LaunchedEffect(gapComposer, flow, new AndroidSecureStore$read$2(flow, (Continuation) null, this, models, models2, 1));
        boolean z = ((HomeResult) mutableState.getValue()) instanceof HomeResult.HomeError;
        AndroidStringManager androidStringManager = this.stringManager;
        if (z) {
            this.afterpayAppletAnalytics.trackErrorAnalyticEvent(AfterpayAppletScreen.PURCHASES);
            AfterpayAppletPurchasesEmbeddedViewModel.Error error = new AfterpayAppletPurchasesEmbeddedViewModel.Error(androidStringManager.get(R.string.afterpay_applet_purchases_toolbar_title), androidStringManager.get(R.string.afterpay_purchases_error_title), androidStringManager.get(R.string.afterpay_error_message), androidStringManager.get(R.string.afterpay_error_button));
            gapComposer.end(false);
            return error;
        }
        ActivityEmbeddedViewModel activityEmbeddedViewModel = (ActivityEmbeddedViewModel) obj;
        boolean hasActivityItems = hasActivityItems(activityEmbeddedViewModel);
        ActivityEmbeddedViewModel activityEmbeddedViewModel2 = (ActivityEmbeddedViewModel) obj2;
        boolean hasActivityItems2 = hasActivityItems(activityEmbeddedViewModel2);
        boolean z2 = !hasActivityItems && hasActivityItems2;
        boolean z3 = !hasActivityItems2 && hasActivityItems;
        String str2 = androidStringManager.get(R.string.afterpay_applet_purchases_history_button);
        HomeResult homeResult2 = (HomeResult) mutableState.getValue();
        homeResult2.getClass();
        if ((homeResult2 instanceof HomeResult.HomeLoading) || (homeResult2 instanceof HomeResult.HomeError) || (homeResult2 instanceof HomeResult.Empty)) {
            translated = null;
        } else {
            if (!(homeResult2 instanceof HomeResult.HomeData)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            AfterpayAppletHome afterpayAppletHome = ((HomeResult.HomeData) homeResult2).data.home;
            translated = (afterpayAppletHome == null || (afterpayAppletActivityResponse = afterpayAppletHome.activity_preload) == null || (localizedString2 = afterpayAppletActivityResponse.screen_title) == null) ? (afterpayAppletHome == null || (afterpayAppletPurchaseHistoryResponse = afterpayAppletHome.purchase_history_preload) == null || (localizedString = afterpayAppletPurchaseHistoryResponse.screen_title) == null) ? androidStringManager.get(R.string.afterpay_applet_purchases_toolbar_title) : StringsKt.translated(localizedString) : StringsKt.translated(localizedString2);
        }
        if (translated == null) {
            translated = androidStringManager.get(R.string.afterpay_applet_purchases_toolbar_title);
        }
        String str3 = translated;
        HomeResult homeResult3 = (HomeResult) mutableState.getValue();
        homeResult3.getClass();
        MoneyFormatter moneyFormatter = this.moneyFormatter;
        moneyFormatter.getClass();
        boolean z4 = homeResult3 instanceof HomeResult.HomeLoading;
        LoadableText loadableText = LoadableText.Loading.INSTANCE;
        if (!z4 && !(homeResult3 instanceof HomeResult.HomeError) && !(homeResult3 instanceof HomeResult.Empty)) {
            if (!(homeResult3 instanceof HomeResult.HomeData)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            AfterpayAppletResponse afterpayAppletResponse = ((HomeResult.HomeData) homeResult3).data;
            afterpayAppletResponse.getClass();
            try {
                AfterpayAppletParsingErrorFactory afterpayAppletParsingErrorFactory = AfterpayAppletParsingErrorFactory.INSTANCE;
                try {
                    CreditLineSnapshot creditLineSnapshot = afterpayAppletResponse.credit_line_snapshot;
                    if (creditLineSnapshot == null) {
                        throw new IllegalArgumentException("credit_line_snapshot");
                    }
                    loadableText = new LoadableText.Loaded(moneyFormatter.format(EarningTool.Tool.totalBalanceMoney(creditLineSnapshot)));
                } catch (Exception e) {
                    throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(AfterpayAppletResponse.class), afterpayAppletParsingErrorFactory, null);
                }
            } catch (ProtoParsingError e2) {
                this.errorReporter.report(e2, this.oneErrorPerAppSessionStrategy);
                loadableText = null;
            }
        }
        if (loadableText != null) {
            HomeResult homeResult4 = (HomeResult) mutableState.getValue();
            homeResult4.getClass();
            str = null;
            if ((homeResult4 instanceof HomeResult.HomeLoading) || (homeResult4 instanceof HomeResult.HomeError) || (homeResult4 instanceof HomeResult.Empty)) {
                translated4 = null;
            } else {
                if (!(homeResult4 instanceof HomeResult.HomeData)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                AfterpayAppletHome afterpayAppletHome2 = ((HomeResult.HomeData) homeResult4).data.home;
                translated4 = (afterpayAppletHome2 == null || (afterpayAppletActivityResponse4 = afterpayAppletHome2.activity_preload) == null || (localizedString7 = afterpayAppletActivityResponse4.header_subtitle) == null) ? androidStringManager.get(R.string.afterpay_applet_purchases_total_owed_header) : StringsKt.translated(localizedString7);
            }
            if (translated4 == null) {
                translated4 = androidStringManager.get(R.string.afterpay_applet_purchases_total_owed_header);
            }
            totalOwedSection = new AfterpayAppletPurchasesEmbeddedViewModel.TotalOwedSection(loadableText, translated4);
        } else {
            str = null;
            totalOwedSection = null;
        }
        ActivityEmbeddedViewModel activityEmbeddedViewModel3 = EMPTY_ACTIVITY_MODEL;
        if (z2) {
            activityEmbeddedViewModel = activityEmbeddedViewModel3;
        }
        HomeResult homeResult5 = (HomeResult) mutableState.getValue();
        homeResult5.getClass();
        if ((homeResult5 instanceof HomeResult.HomeLoading) || (homeResult5 instanceof HomeResult.HomeError) || (homeResult5 instanceof HomeResult.Empty)) {
            translated2 = str;
        } else {
            if (!(homeResult5 instanceof HomeResult.HomeData)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return str;
            }
            AfterpayAppletHome afterpayAppletHome3 = ((HomeResult.HomeData) homeResult5).data.home;
            translated2 = (afterpayAppletHome3 == null || (afterpayAppletActivityResponse2 = afterpayAppletHome3.activity_preload) == null || (localizedString4 = afterpayAppletActivityResponse2.upcoming_title) == null) ? (afterpayAppletHome3 == null || (afterpayAppletPurchaseHistoryResponse2 = afterpayAppletHome3.purchase_history_preload) == null || (localizedString3 = afterpayAppletPurchaseHistoryResponse2.upcoming_title) == null) ? androidStringManager.get(R.string.afterpay_applet_purchases_active_purchases_header) : StringsKt.translated(localizedString3) : StringsKt.translated(localizedString4);
        }
        if (translated2 == null) {
            translated2 = androidStringManager.get(R.string.afterpay_applet_purchases_active_purchases_header);
        }
        AfterpayAppletPurchasesEmbeddedViewModel.EmbeddedActivitySection embeddedActivitySection = new AfterpayAppletPurchasesEmbeddedViewModel.EmbeddedActivitySection(activityEmbeddedViewModel, translated2, str2);
        if (z3) {
            activityEmbeddedViewModel2 = activityEmbeddedViewModel3;
        }
        HomeResult homeResult6 = (HomeResult) mutableState.getValue();
        homeResult6.getClass();
        if ((homeResult6 instanceof HomeResult.HomeLoading) || (homeResult6 instanceof HomeResult.HomeError) || (homeResult6 instanceof HomeResult.Empty)) {
            translated3 = str;
        } else {
            if (!(homeResult6 instanceof HomeResult.HomeData)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return str;
            }
            AfterpayAppletHome afterpayAppletHome4 = ((HomeResult.HomeData) homeResult6).data.home;
            translated3 = (afterpayAppletHome4 == null || (afterpayAppletActivityResponse3 = afterpayAppletHome4.activity_preload) == null || (localizedString6 = afterpayAppletActivityResponse3.completed_title) == null) ? (afterpayAppletHome4 == null || (afterpayAppletPurchaseHistoryResponse3 = afterpayAppletHome4.purchase_history_preload) == null || (localizedString5 = afterpayAppletPurchaseHistoryResponse3.completed_title) == null) ? androidStringManager.get(R.string.afterpay_applet_purchases_history_header) : StringsKt.translated(localizedString5) : StringsKt.translated(localizedString6);
        }
        if (translated3 == null) {
            translated3 = androidStringManager.get(R.string.afterpay_applet_purchases_history_header);
        }
        AfterpayAppletPurchasesEmbeddedViewModel.Default r13 = new AfterpayAppletPurchasesEmbeddedViewModel.Default(str3, totalOwedSection, embeddedActivitySection, new AfterpayAppletPurchasesEmbeddedViewModel.EmbeddedActivitySection(activityEmbeddedViewModel2, translated3, str2), (FooterSection) this.footerSection$delegate.getValue());
        gapComposer.end(false);
        return r13;
    }
}
