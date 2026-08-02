package com.squareup.cash.appintro.views;

import android.content.Context;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.tracing.Trace;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.ViewFactory;
import app.cash.broadway.ui.compose.ComposeUiView;
import coil3.RealImageLoader;
import com.squareup.cash.appintro.screens.AlternativeNewSponsorAliasScreen;
import com.squareup.cash.appintro.screens.SponsorshipRequestReferralIntroScreen;
import com.squareup.cash.blockers.scenarioplan.screens.ScenarioPlanScreens;
import com.squareup.cash.blockers.scenarioplan.views.ScenarioPlanErrorView;
import com.squareup.cash.blockers.scenarioplan.views.ScenarioPlanErrorView$Factory$Impl;
import com.squareup.cash.blockers.scenarioplan.views.ScenarioPlanLoadingView;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.treehouse.TreehouseFlows;
import com.squareup.cash.blockers.treehouse.views.TreehouseBlockerUi;
import com.squareup.cash.blockers.treehouse.views.TreehouseBlockerUi$Factory$Impl;
import com.squareup.cash.blockers.views.FormBlockerView$Factory$Impl;
import com.squareup.cash.formview.components.FormView$Factory$Impl;
import com.squareup.cash.history.analytics.LoadTimeClock;
import com.squareup.cash.merchant.views.SquareLoyaltyDetailsView;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.shopping.sup.screens.SingleUsePaymentScreen$SingleUsePaymentAddCardSheetScreen;
import com.squareup.cash.shopping.sup.screens.SingleUsePaymentScreen$SingleUsePaymentCardDetailsScreen;
import com.squareup.cash.shopping.sup.screens.SingleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen;
import com.squareup.cash.shopping.sup.screens.SingleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen;
import com.squareup.cash.shopping.sup.views.SingleUsePaymentAddCardSheet;
import com.squareup.cash.shopping.sup.views.SingleUsePaymentCardDetailsSheet;
import com.squareup.cash.shopping.sup.views.SingleUsePaymentPlanDetailsSheet;
import com.squareup.cash.treehouse.android.platform.CashTreehouseLayout;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class AppIntroViewFactory implements ViewFactory {
    public final /* synthetic */ int $r8$classId;
    public final Object formBlockerView;

    public AppIntroViewFactory(RealImageLoader realImageLoader, LocalizedMoneyFormatter.Factory factory) {
        this.$r8$classId = 3;
        this.formBlockerView = factory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.squareup.cash.blockers.views.FormBlockerView] */
    @Override // app.cash.broadway.ui.ViewFactory
    public final ViewFactory.ScreenView createView(Screen screen, Context context, ViewGroup viewGroup) {
        AlternativeNewSponsorAliasView alternativeNewSponsorAliasView;
        ComposeUiView scenarioPlanErrorView;
        int i = this.$r8$classId;
        Object obj = this.formBlockerView;
        context.getClass();
        switch (i) {
            case 0:
                if (screen instanceof SponsorshipRequestReferralIntroScreen) {
                    alternativeNewSponsorAliasView = ((FormBlockerView$Factory$Impl) obj).create(context);
                } else {
                    if (!(screen instanceof AlternativeNewSponsorAliasScreen)) {
                        return null;
                    }
                    alternativeNewSponsorAliasView = new AlternativeNewSponsorAliasView(context);
                }
                return new ViewFactory.ScreenView(alternativeNewSponsorAliasView, alternativeNewSponsorAliasView);
            case 1:
                if (!(screen instanceof ScenarioPlanScreens)) {
                    return null;
                }
                ScenarioPlanScreens scenarioPlanScreens = (ScenarioPlanScreens) screen;
                if (scenarioPlanScreens instanceof ScenarioPlanScreens.ScenarioPlanLoadingScreen) {
                    scenarioPlanErrorView = new ScenarioPlanLoadingView(context);
                } else {
                    if (!(scenarioPlanScreens instanceof ScenarioPlanScreens.ScenarioPlanErrorScreen)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    FormView$Factory$Impl formView$Factory$Impl = (FormView$Factory$Impl) ((ScenarioPlanErrorView$Factory$Impl) obj).delegateFactory.sandboxer.invoke();
                    formView$Factory$Impl.getClass();
                    scenarioPlanErrorView = new ScenarioPlanErrorView(context, formView$Factory$Impl);
                }
                return new ViewFactory.ScreenView(scenarioPlanErrorView, scenarioPlanErrorView);
            case 2:
                if (!(screen instanceof BlockersScreens.TreehouseBlockerScreen)) {
                    return null;
                }
                OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = Trace.get(viewGroup);
                onBackPressedDispatcherOwner.getClass();
                OnBackPressedDispatcher onBackPressedDispatcher = onBackPressedDispatcherOwner.getOnBackPressedDispatcher();
                onBackPressedDispatcher.getClass();
                LoadTimeClock.MetroFactory metroFactory = ((TreehouseBlockerUi$Factory$Impl) obj).delegateFactory;
                TreehouseFlows treehouseFlows = (TreehouseFlows) metroFactory.clock.invoke();
                CashTreehouseLayout.Factory factory = (CashTreehouseLayout.Factory) metroFactory.observabilityManager.invoke();
                treehouseFlows.getClass();
                factory.getClass();
                TreehouseBlockerUi treehouseBlockerUi = new TreehouseBlockerUi(treehouseFlows, factory, context, onBackPressedDispatcher);
                return new ViewFactory.ScreenView(treehouseBlockerUi.getView(), treehouseBlockerUi);
            default:
                if (screen instanceof SingleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen) {
                    SquareLoyaltyDetailsView squareLoyaltyDetailsView = new SquareLoyaltyDetailsView(context, (LocalizedMoneyFormatter.Factory) obj);
                    return new ViewFactory.ScreenView(squareLoyaltyDetailsView, squareLoyaltyDetailsView);
                }
                if (screen instanceof SingleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen) {
                    SingleUsePaymentPlanDetailsSheet singleUsePaymentPlanDetailsSheet = new SingleUsePaymentPlanDetailsSheet(context);
                    return new ViewFactory.ScreenView(singleUsePaymentPlanDetailsSheet, singleUsePaymentPlanDetailsSheet);
                }
                if (screen instanceof SingleUsePaymentScreen$SingleUsePaymentCardDetailsScreen) {
                    SingleUsePaymentCardDetailsSheet singleUsePaymentCardDetailsSheet = new SingleUsePaymentCardDetailsSheet(context);
                    return new ViewFactory.ScreenView(singleUsePaymentCardDetailsSheet, singleUsePaymentCardDetailsSheet);
                }
                if (!(screen instanceof SingleUsePaymentScreen$SingleUsePaymentAddCardSheetScreen)) {
                    return null;
                }
                SingleUsePaymentAddCardSheet singleUsePaymentAddCardSheet = new SingleUsePaymentAddCardSheet(context);
                return new ViewFactory.ScreenView(singleUsePaymentAddCardSheet, singleUsePaymentAddCardSheet);
        }
    }

    public /* synthetic */ AppIntroViewFactory(Object obj, int i) {
        this.$r8$classId = i;
        this.formBlockerView = obj;
    }
}
