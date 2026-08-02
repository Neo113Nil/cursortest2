package com.squareup.cash.activity.presenters;

import app.cash.badging.api.Badger2;
import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.activity.analytics.ActivityAnalyticsService;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.presenters.ActivityItemEventHandler;
import com.squareup.cash.blockers.analytics.RealFlowTokenGenerator;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.payments.backend.api.PaymentManager;
import com.squareup.cash.payments.backend.real.RealPaymentActionCompletionDispatcher;
import com.squareup.cash.pools.presenters.PoolDetailsPresenter$MetroFactory;
import com.squareup.cash.reactions.real.RealReactionManager;
import com.squareup.cash.treehouse.activity.ActivityDataBridge;
import com.squareup.cash.treehouse.activity.ActivityPaymentManager2;
import com.squareup.cash.treehouse.activity.HostActivityDataBridge;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class DefaultActivityItemEventHandler$Factory$Impl implements ActivityItemEventHandler.Factory {
    public final PoolDetailsPresenter$MetroFactory delegateFactory;

    public DefaultActivityItemEventHandler$Factory$Impl(PoolDetailsPresenter$MetroFactory poolDetailsPresenter$MetroFactory) {
        this.delegateFactory = poolDetailsPresenter$MetroFactory;
    }

    @Override // com.squareup.cash.activity.presenters.ActivityItemEventHandler.Factory
    public final DefaultActivityItemEventHandler create(Navigator navigator, Function1 function1) {
        navigator.getClass();
        PoolDetailsPresenter$MetroFactory poolDetailsPresenter$MetroFactory = this.delegateFactory;
        RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) poolDetailsPresenter$MetroFactory.moneyFormatterFactory.invoke();
        ActivityPaymentManager2 activityPaymentManager2 = (ActivityPaymentManager2) poolDetailsPresenter$MetroFactory.poolsRepository.invoke();
        Badger2 badger2 = (Badger2) poolDetailsPresenter$MetroFactory.launcher.invoke();
        PaymentManager paymentManager = (PaymentManager) poolDetailsPresenter$MetroFactory.activityEmbeddedPresenterFactory.invoke();
        RealFlowTokenGenerator realFlowTokenGenerator = (RealFlowTokenGenerator) poolDetailsPresenter$MetroFactory.defaultActivityItemEventHandlerFactory.invoke();
        RealPaymentActionCompletionDispatcher realPaymentActionCompletionDispatcher = (RealPaymentActionCompletionDispatcher) poolDetailsPresenter$MetroFactory.stringManager.invoke();
        RealReactionManager realReactionManager = (RealReactionManager) poolDetailsPresenter$MetroFactory.sessionManager.invoke();
        CoroutineScope coroutineScope = (CoroutineScope) ((InstanceFactory) poolDetailsPresenter$MetroFactory.dateFormatManager).value;
        CoroutineContext coroutineContext = (CoroutineContext) poolDetailsPresenter$MetroFactory.clock.invoke();
        ActivityDataBridge activityDataBridge = (ActivityDataBridge) poolDetailsPresenter$MetroFactory.uuidGenerator.invoke();
        HostActivityDataBridge hostActivityDataBridge = (HostActivityDataBridge) poolDetailsPresenter$MetroFactory.blockersNavigator.invoke();
        ActivityAnalyticsService activityAnalyticsService = (ActivityAnalyticsService) poolDetailsPresenter$MetroFactory.analytics.invoke();
        FeatureFlagManager featureFlagManager = (FeatureFlagManager) poolDetailsPresenter$MetroFactory.featureFlagManager.invoke();
        RealActivitiesCacheManager realActivitiesCacheManager = (RealActivitiesCacheManager) poolDetailsPresenter$MetroFactory.activitiesCacheManager.invoke();
        realRouter$Factory$Impl.getClass();
        activityPaymentManager2.getClass();
        badger2.getClass();
        paymentManager.getClass();
        realFlowTokenGenerator.getClass();
        realPaymentActionCompletionDispatcher.getClass();
        realReactionManager.getClass();
        coroutineScope.getClass();
        coroutineContext.getClass();
        activityDataBridge.getClass();
        hostActivityDataBridge.getClass();
        activityAnalyticsService.getClass();
        featureFlagManager.getClass();
        realActivitiesCacheManager.getClass();
        return new DefaultActivityItemEventHandler(navigator, function1, realRouter$Factory$Impl, activityPaymentManager2, badger2, paymentManager, realFlowTokenGenerator, realPaymentActionCompletionDispatcher, realReactionManager, coroutineScope, coroutineContext, activityDataBridge, hostActivityDataBridge, activityAnalyticsService, featureFlagManager, realActivitiesCacheManager);
    }
}
