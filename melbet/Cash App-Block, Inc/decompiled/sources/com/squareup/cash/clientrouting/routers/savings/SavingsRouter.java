package com.squareup.cash.clientrouting.routers.savings;

import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.broadway.navigation.Navigator;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.cdf.savingsfolder.SavingsFolderViewEnhancedYieldUpsell;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda12;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.RealClientRouteRouter$route$1;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.savings.backend.api.GeneralSavingsError;
import com.squareup.cash.savings.backend.api.data.SavingsBalance;
import com.squareup.cash.savings.backend.api.model.SavingsCard;
import com.squareup.cash.savings.backend.api.model.SavingsScreen;
import com.squareup.cash.savings.backend.real.SyncValuesBasedSavingsBalanceStore;
import com.squareup.cash.savings.screens.GeneralSavingsScreen;
import com.squareup.cash.savings.screens.SavingsCardSheet;
import com.squareup.cash.savings.screens.SavingsRouteInterstitialScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.EnumSet;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.savings.SavingsApplet;
import squareup.cash.savings.action.SavingsAction;

/* loaded from: classes6.dex */
public final class SavingsRouter implements HasObservability {
    public final Analytics analytics;
    public final ErrorReporter errorReporter;
    public final Navigator navigator;
    public final SampleStrategy oneErrorPerAppSessionStrategy;
    public final Lazy router$delegate;
    public final RealRouter$Factory$Impl routerFactory;
    public final SyncValuesBasedSavingsBalanceStore savingsBalanceStore;
    public final SyncValueReader syncValueReader;

    public SavingsRouter(SyncValueReader syncValueReader, SyncValuesBasedSavingsBalanceStore syncValuesBasedSavingsBalanceStore, RealRouter$Factory$Impl realRouter$Factory$Impl, Analytics analytics, ErrorReporter errorReporter, SampleStrategy sampleStrategy, Navigator navigator) {
        navigator.getClass();
        this.syncValueReader = syncValueReader;
        this.savingsBalanceStore = syncValuesBasedSavingsBalanceStore;
        this.routerFactory = realRouter$Factory$Impl;
        this.analytics = analytics;
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
        this.navigator = navigator;
        this.router$delegate = LazyKt.lazy(new SsnViewKt$$ExternalSyntheticLambda4(this, 24));
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return this.oneErrorPerAppSessionStrategy;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object navigateToSavingsHomeOrNuxWithInitialCard(SavingsCard savingsCard, ContinuationImpl continuationImpl) {
        SavingsRouter$navigateToSavingsHomeOrNuxWithInitialCard$1 savingsRouter$navigateToSavingsHomeOrNuxWithInitialCard$1;
        Object obj;
        int i;
        if (continuationImpl instanceof SavingsRouter$navigateToSavingsHomeOrNuxWithInitialCard$1) {
            savingsRouter$navigateToSavingsHomeOrNuxWithInitialCard$1 = (SavingsRouter$navigateToSavingsHomeOrNuxWithInitialCard$1) continuationImpl;
            int i2 = savingsRouter$navigateToSavingsHomeOrNuxWithInitialCard$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                savingsRouter$navigateToSavingsHomeOrNuxWithInitialCard$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = savingsRouter$navigateToSavingsHomeOrNuxWithInitialCard$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsRouter$navigateToSavingsHomeOrNuxWithInitialCard$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    FinishSetupTileBadgeCounter finishSetupTileBadgeCounter = this.savingsBalanceStore.get();
                    savingsRouter$navigateToSavingsHomeOrNuxWithInitialCard$1.L$0 = savingsCard;
                    savingsRouter$navigateToSavingsHomeOrNuxWithInitialCard$1.label = 1;
                    obj = FlowKt.first(finishSetupTileBadgeCounter, savingsRouter$navigateToSavingsHomeOrNuxWithInitialCard$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    savingsCard = savingsRouter$navigateToSavingsHomeOrNuxWithInitialCard$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                if (((SavingsBalance) obj) != null) {
                    return Unit.INSTANCE;
                }
                GeneralSavingsScreen generalSavingsScreen = new GeneralSavingsScreen(SavingsScreen.ScreenType.Home.INSTANCE);
                Navigator navigator = this.navigator;
                navigator.goTo(generalSavingsScreen);
                if (savingsCard != null) {
                    this.analytics.track(new SavingsFolderViewEnhancedYieldUpsell(), null);
                    navigator.goTo(new SavingsCardSheet(savingsCard, generalSavingsScreen));
                }
                return Unit.INSTANCE;
            }
        }
        savingsRouter$navigateToSavingsHomeOrNuxWithInitialCard$1 = new SavingsRouter$navigateToSavingsHomeOrNuxWithInitialCard$1(this, continuationImpl);
        obj = savingsRouter$navigateToSavingsHomeOrNuxWithInitialCard$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsRouter$navigateToSavingsHomeOrNuxWithInitialCard$1.label;
        if (i != 0) {
        }
        if (((SavingsBalance) obj) != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        if (navigateToSavingsHomeOrNuxWithInitialCard(r9, r0) != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.ViewSavingsHomeWithModalHalfSheet viewSavingsHomeWithModalHalfSheet, ContinuationImpl continuationImpl) {
        SavingsRouter$route$2 savingsRouter$route$2;
        int i;
        if (continuationImpl instanceof SavingsRouter$route$2) {
            savingsRouter$route$2 = (SavingsRouter$route$2) continuationImpl;
            int i2 = savingsRouter$route$2.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                savingsRouter$route$2.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = savingsRouter$route$2.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsRouter$route$2.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlow singleValueOrDefault = this.syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.SavingsConfig, null, new CaptureCheckFaceKt$$ExternalSyntheticLambda12(this, 14));
                    savingsRouter$route$2.L$0 = viewSavingsHomeWithModalHalfSheet;
                    savingsRouter$route$2.label = 1;
                    obj = FlowKt.first(singleValueOrDefault, savingsRouter$route$2);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    viewSavingsHomeWithModalHalfSheet = savingsRouter$route$2.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                SavingsCard savingsCard = (SavingsCard) obj;
                if (!viewSavingsHomeWithModalHalfSheet.name.equals("get-cash-card-to-start-earning")) {
                    savingsCard = null;
                }
                savingsRouter$route$2.L$0 = null;
                savingsRouter$route$2.label = 2;
                EnumSet.noneOf(RoutingParams.Flag.class).getClass();
            }
        }
        savingsRouter$route$2 = new SavingsRouter$route$2(this, continuationImpl);
        Object obj3 = savingsRouter$route$2.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsRouter$route$2.label;
        if (i != 0) {
        }
        SavingsCard savingsCard2 = (SavingsCard) obj3;
        if (!viewSavingsHomeWithModalHalfSheet.name.equals("get-cash-card-to-start-earning")) {
        }
        savingsRouter$route$2.L$0 = null;
        savingsRouter$route$2.label = 2;
        EnumSet.noneOf(RoutingParams.Flag.class).getClass();
    }

    public final Object route(RealClientRouteRouter$route$1 realClientRouteRouter$route$1) {
        Object navigateToSavingsHomeOrNuxWithInitialCard = navigateToSavingsHomeOrNuxWithInitialCard(null, realClientRouteRouter$route$1);
        return navigateToSavingsHomeOrNuxWithInitialCard == CoroutineSingletons.COROUTINE_SUSPENDED ? navigateToSavingsHomeOrNuxWithInitialCard : Unit.INSTANCE;
    }

    public final void route(ClientRoute.ViewSavingsNuxOrHome viewSavingsNuxOrHome, RoutingParams routingParams) {
        SavingsAction savingsAction;
        SavingsAction.Action action;
        viewSavingsNuxOrHome.getClass();
        routingParams.getClass();
        SavingsApplet savingsApplet = (SavingsApplet) this.syncValueReader.getSingleValue(AndroidSyncValueSpecs.SavingsApplet).getValue();
        String str = null;
        if (savingsApplet != null && (savingsAction = savingsApplet.override_action) != null && (action = savingsAction.action) != null) {
            SavingsAction.Action.ClientRoute clientRoute = action instanceof SavingsAction.Action.ClientRoute ? (SavingsAction.Action.ClientRoute) action : null;
            if (clientRoute != null) {
                str = clientRoute.value;
            }
        }
        if (str != null) {
            ((RealRouter) this.router$delegate.getValue()).route(routingParams, str);
        } else {
            this.navigator.goTo(new SavingsRouteInterstitialScreen(routingParams));
        }
    }

    public final void route(ClientRoute.ViewSavingsGeneralFolder viewSavingsGeneralFolder) {
        viewSavingsGeneralFolder.getClass();
        this.navigator.goTo(new GeneralSavingsScreen(SavingsScreen.ScreenType.GeneralSavings.INSTANCE));
    }

    public final void route(ClientRoute.ViewSavingsGoal viewSavingsGoal) {
        viewSavingsGoal.getClass();
        this.navigator.goTo(new GeneralSavingsScreen(new SavingsScreen.ScreenType.GoalDetail(viewSavingsGoal.goaltoken)));
    }

    public final void route(ClientRoute.DeprecatedViewSavingsAddCash deprecatedViewSavingsAddCash) {
        deprecatedViewSavingsAddCash.getClass();
        this.errorReporter.report(new GeneralSavingsError(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Attempting to route to transfer flow (", deprecatedViewSavingsAddCash.context, ") with V2 screens enabled"), null), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
    }
}
