package com.squareup.cash.cashapplite.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.history.screens.HistoryScreens;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.backend.loader.RealActivityTokenFactory;
import com.squareup.cash.activity.presenters.ActivityEmbeddedPresenter$Companion;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.activity.viewmodels.FullScreenActivityViewModel;
import com.squareup.cash.card.onboarding.CardStudioPresenter$models$1$1;
import com.squareup.cash.cashapplite.screens.LiteActivityScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.history.backend.api.PendingInvestingActivityPageHandler;
import com.squareup.cash.history.presenters.PasscodeDialogPresenter$models$1$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class LiteActivityPresenter implements MoleculePresenter {
    public final /* synthetic */ int $r8$classId = 1;
    public final RealActivityEmbeddedPresenter activityEmbeddedPresenter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidStringManager stringManager;

    public LiteActivityPresenter(SessionManager sessionManager, AndroidStringManager androidStringManager, RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl, LiteActivityScreen liteActivityScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        liteActivityScreen.getClass();
        this.stringManager = androidStringManager;
        this.navigator = screenNavigator;
        this.activityEmbeddedPresenter = realActivityEmbeddedPresenter$Factory$Impl.create(screenNavigator, ActivityEmbeddedPresenter$Companion.FilteredFeedConfiguration$default(new ActivitiesManager.ActivityContext(new ActivityToken(ActivityTokenType.CUSTOMER_TOKEN, PlatformKt.activeAccountTokenOrNull(sessionManager), (String) null, 12), ActivityScope.MY_ACTIVITY, (ActivitiesManager.ActivityPageHandler) null, 12), null, liteActivityScreen, false, null, null, null, null, null, 16378));
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        int i2 = this.$r8$classId;
        AndroidStringManager androidStringManager = this.stringManager;
        Continuation continuation = null;
        RealActivityEmbeddedPresenter realActivityEmbeddedPresenter = this.activityEmbeddedPresenter;
        switch (i2) {
            case 0:
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(894689271);
                Updater.LaunchedEffect(gapComposer, flow, new CardStudioPresenter$models$1$1(flow, continuation, this, 21));
                FullScreenActivityViewModel fullScreenActivityViewModel = new FullScreenActivityViewModel(realActivityEmbeddedPresenter.models(gapComposer, 0), androidStringManager.get(R.string.lite_activity_applet_title));
                gapComposer.end(false);
                return fullScreenActivityViewModel;
            default:
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(-1010242461);
                UiCallbackModel models = realActivityEmbeddedPresenter.models(gapComposer2, 0);
                Updater.LaunchedEffect(gapComposer2, flow, new PasscodeDialogPresenter$models$1$1(flow, continuation, this, 8));
                FullScreenActivityViewModel fullScreenActivityViewModel2 = new FullScreenActivityViewModel(models, androidStringManager.get(R.string.tab_title_activity));
                gapComposer2.end(false);
                return fullScreenActivityViewModel2;
        }
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final Provider activityEmbeddedPresenterFactory;
        public final LambdaProvider sessionManager;
        public final LambdaProvider stringManager;

        public /* synthetic */ MetroFactory(LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, Factory factory) {
            this.sessionManager = lambdaProvider;
            this.stringManager = lambdaProvider2;
            this.activityEmbeddedPresenterFactory = factory;
        }

        public /* synthetic */ MetroFactory(Factory factory, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2) {
            this.activityEmbeddedPresenterFactory = factory;
            this.sessionManager = lambdaProvider;
            this.stringManager = lambdaProvider2;
        }
    }

    public LiteActivityPresenter(AndroidStringManager androidStringManager, BetterNavigator.ScreenNavigator screenNavigator, RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl, RealActivityTokenFactory realActivityTokenFactory, RealActivitiesCacheManager realActivitiesCacheManager, PendingInvestingActivityPageHandler pendingInvestingActivityPageHandler) {
        this.stringManager = androidStringManager;
        this.navigator = screenNavigator;
        ActivitiesManager.ActivityContext activityContext = new ActivitiesManager.ActivityContext(RealActivityTokenFactory.create$default(realActivityTokenFactory, ActivityTokenType.CUSTOMER_TOKEN), ActivityScope.MY_ACTIVITY, pendingInvestingActivityPageHandler, 8);
        HistoryScreens.InvestingPendingTransactionsScreen investingPendingTransactionsScreen = HistoryScreens.InvestingPendingTransactionsScreen.INSTANCE;
        this.activityEmbeddedPresenter = realActivityEmbeddedPresenter$Factory$Impl.create(screenNavigator, ActivityEmbeddedPresenter$Companion.FilteredFeedConfiguration$default(activityContext, RealActivitiesCacheManager.take$default(realActivitiesCacheManager, investingPendingTransactionsScreen), investingPendingTransactionsScreen, false, null, null, null, null, null, 16376));
    }
}
