package com.squareup.cash.family.familyhub.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.broadway.presenter.molecule.AnswersKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.cdf.sponsoredaccount.DependentControlType;
import com.squareup.cash.cdf.sponsoredaccount.SponsoredAccountManageToggleDependentControl;
import com.squareup.cash.cdf.sponsoredaccount.ToggleValue;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper$skipBlocker$1;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda2;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda5;
import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.cash.family.familyhub.backend.api.DependentControlStatus;
import com.squareup.cash.family.familyhub.backend.real.RealDependentControlStatusManager;
import com.squareup.cash.family.familyhub.screens.DependentControlScreen;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewModel;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1;
import com.squareup.cash.formview.components.FormCashtag;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$filter$1;
import com.squareup.cash.integration.analytics.Analytics;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public abstract class BaseDependentControlPresenter implements MoleculePresenter {
    public final DependentControlScreen args;
    public final Lazy controlStatusManager$delegate;
    public final BaseDependentControlDependencies deps;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealRouter router;
    public final CoroutineScope sandboxedScope;

    public BaseDependentControlPresenter(BaseDependentControlDependencies baseDependentControlDependencies, DependentControlScreen dependentControlScreen, BetterNavigator.ScreenNavigator screenNavigator, CoroutineScope coroutineScope) {
        dependentControlScreen.getClass();
        this.deps = baseDependentControlDependencies;
        this.args = dependentControlScreen;
        this.navigator = screenNavigator;
        this.sandboxedScope = coroutineScope;
        this.router = baseDependentControlDependencies.routerFactory.create$1(screenNavigator);
        this.controlStatusManager$delegate = LazyKt.lazy(new ArcadeModal$$ExternalSyntheticLambda2(this, 18));
    }

    public abstract DependentControlViewModel createViewModel(String str, DependentControlStatus dependentControlStatus, GapComposer gapComposer);

    public Flow dependentFirstName() {
        return new RealGooglePayer$createWallet$$inlined$filter$1(this.deps.customerStore.getCustomerForId(this.args.getDependentCustomerToken()), 14);
    }

    public final RealDependentControlStatusManager getControlStatusManager() {
        return (RealDependentControlStatusManager) this.controlStatusManager$delegate.getValue();
    }

    public abstract ControlType getControlType();

    public Unit handleCancelDisabling() {
        return Unit.INSTANCE;
    }

    public Object handleConfirmDisabling(BaseDependentControlPresenter$models$3$1 baseDependentControlPresenter$models$3$1) {
        DependentControlType dependentControlType;
        Analytics analytics = this.deps.analytics;
        int ordinal = getControlType().ordinal();
        if (ordinal == 0) {
            dependentControlType = DependentControlType.RealTimeNotifications;
        } else if (ordinal == 1) {
            dependentControlType = DependentControlType.P2PTransactions;
        } else if (ordinal == 2) {
            dependentControlType = DependentControlType.CashCard;
        } else if (ordinal == 3) {
            dependentControlType = DependentControlType.StockInvesting;
        } else if (ordinal == 4) {
            dependentControlType = DependentControlType.BitcoinInvesting;
        } else {
            if (ordinal != 5) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            dependentControlType = DependentControlType.Promotions;
        }
        analytics.track(new SponsoredAccountManageToggleDependentControl(dependentControlType, ToggleValue.Disabled, this.args.getDependentCustomerToken()), null);
        Object dependentControlStatus = getControlStatusManager().setDependentControlStatus(false, baseDependentControlPresenter$models$3$1);
        return dependentControlStatus == CoroutineSingletons.COROUTINE_SUSPENDED ? dependentControlStatus : Unit.INSTANCE;
    }

    public abstract Object handleControlSpecificEvent(DependentControlViewEvent dependentControlViewEvent, String str, DependentControlStatus dependentControlStatus, RealFidesmoClient$observeDeviceState$1 realFidesmoClient$observeDeviceState$1);

    public void handleFooterLinkClicked(String str) {
        str.getClass();
        this.router.route(new RoutingParams(null, null, null, null, null, null, 511), str);
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-2108072160);
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (rememberedValue == obj) {
            rememberedValue = dependentFirstName();
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, "", null, gapComposer, 48, 2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == obj) {
            rememberedValue2 = getControlStatusManager().dependentControlStatus;
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue2, DependentControlStatus.InitialLoading.INSTANCE, null, gapComposer, 0, 2);
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue3 == obj) {
            rememberedValue3 = new ArcadeModal$$ExternalSyntheticLambda5(this, 10);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Function2 function2 = (Function2) rememberedValue3;
        AnswerDispatcher answerDispatcher = (AnswerDispatcher) gapComposer.consume(AnswersKt.LocalAnswerDispatcher);
        boolean changed = gapComposer.changed(function2) | gapComposer.changedInstance(answerDispatcher);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changed || rememberedValue4 == obj) {
            rememberedValue4 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, 28);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        Updater.DisposableEffect(answerDispatcher, (Function1) rememberedValue4, gapComposer);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue5 == obj) {
            rememberedValue5 = new FormCashtag.AnonymousClass8.AnonymousClass2(this, null, 5);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue5);
        Updater.LaunchedEffect(gapComposer, flow, new RealBlockersHelper$skipBlocker$1(flow, (Continuation) null, this, collectAsState, collectAsState2, 24));
        DependentControlViewModel createViewModel = createViewModel((String) collectAsState.getValue(), (DependentControlStatus) collectAsState2.getValue(), gapComposer);
        gapComposer.end(false);
        return createViewModel;
    }

    public Object onInitialize(Continuation continuation) {
        return Unit.INSTANCE;
    }
}
