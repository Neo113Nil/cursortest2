package com.squareup.cash.blockers.presenters;

import android.app.Activity;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealClientScenarioCompleter;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.RealReferralManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.support.presenters.ArticlePresenter;
import com.squareup.cash.transfers.navigation.real.RealTransfersInboundNavigator$Factory$Impl;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class StatusResultPresenter$Factory$Impl {
    public final ArticlePresenter.MetroFactory delegateFactory;

    public StatusResultPresenter$Factory$Impl(ArticlePresenter.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final StatusResultPresenter create(BlockersScreens.StatusResultScreen statusResultScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        ArticlePresenter.MetroFactory metroFactory = this.delegateFactory;
        BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) metroFactory.contactSupportNavigator.invoke();
        FlowStarter flowStarter = (FlowStarter) ((DoubleCheck) metroFactory.articlesService).getValue();
        RealClientScenarioCompleter realClientScenarioCompleter = (RealClientScenarioCompleter) ((DoubleCheck) metroFactory.transactionService).getValue();
        Analytics analytics = (Analytics) ((DoubleCheck) metroFactory.analytics).getValue();
        IntentLauncher intentLauncher = (IntentLauncher) metroFactory.linkNavigator.invoke();
        AppConfigManager appConfigManager = (AppConfigManager) ((DoubleCheck) metroFactory.supportPhoneService).getValue();
        RealBalanceSnapshotManager realBalanceSnapshotManager = (RealBalanceSnapshotManager) metroFactory.viewedArticlesStore.invoke();
        CoroutineContext coroutineContext = (CoroutineContext) ((LambdaProvider) metroFactory.stringManager).lambda.invoke();
        Activity activity = (Activity) ((InstanceFactory) metroFactory.activityDataBridge).value;
        RealSupportNavigator realSupportNavigator = (RealSupportNavigator) metroFactory.supportStatus.invoke();
        RealReferralManager realReferralManager = (RealReferralManager) metroFactory.launcher.invoke();
        SessionManager sessionManager = (SessionManager) ((LambdaProvider) metroFactory.dateFormatManager).lambda.invoke();
        PromotionPanePresenter$Factory$Impl promotionPanePresenter$Factory$Impl = (PromotionPanePresenter$Factory$Impl) ((InstanceFactory) metroFactory.viewTokenGenerator).value;
        RealScheduledReloadUpsellPresenter$Factory$Impl realScheduledReloadUpsellPresenter$Factory$Impl = (RealScheduledReloadUpsellPresenter$Factory$Impl) ((InstanceFactory) metroFactory.observabilityManager).value;
        RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) metroFactory.routerFactory.invoke();
        RealObservabilityManager realObservabilityManager = (RealObservabilityManager) ((LambdaProvider) metroFactory.clock).lambda.invoke();
        FeatureFlagManager featureFlagManager = (FeatureFlagManager) ((DoubleCheck) metroFactory.incidentsService).getValue();
        RealTransfersInboundNavigator$Factory$Impl realTransfersInboundNavigator$Factory$Impl = (RealTransfersInboundNavigator$Factory$Impl) metroFactory.moshi.invoke();
        blockersDataNavigator.getClass();
        flowStarter.getClass();
        realClientScenarioCompleter.getClass();
        analytics.getClass();
        intentLauncher.getClass();
        appConfigManager.getClass();
        realBalanceSnapshotManager.getClass();
        coroutineContext.getClass();
        activity.getClass();
        realSupportNavigator.getClass();
        realReferralManager.getClass();
        sessionManager.getClass();
        promotionPanePresenter$Factory$Impl.getClass();
        realScheduledReloadUpsellPresenter$Factory$Impl.getClass();
        realRouter$Factory$Impl.getClass();
        realObservabilityManager.getClass();
        featureFlagManager.getClass();
        realTransfersInboundNavigator$Factory$Impl.getClass();
        return new StatusResultPresenter(blockersDataNavigator, flowStarter, realClientScenarioCompleter, analytics, intentLauncher, appConfigManager, realBalanceSnapshotManager, coroutineContext, activity, realSupportNavigator, realReferralManager, sessionManager, promotionPanePresenter$Factory$Impl, realScheduledReloadUpsellPresenter$Factory$Impl, realRouter$Factory$Impl, screenNavigator, statusResultScreen, realObservabilityManager, featureFlagManager, realTransfersInboundNavigator$Factory$Impl);
    }
}
