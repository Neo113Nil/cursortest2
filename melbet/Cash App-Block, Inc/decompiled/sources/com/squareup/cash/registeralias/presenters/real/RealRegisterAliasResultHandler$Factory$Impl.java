package com.squareup.cash.registeralias.presenters.real;

import coil3.ImageLoader$Builder;
import com.squareup.cash.cashapppay.presenters.GrantPresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.onboarding.backend.RealOnboardingFlowTokenManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.TimeToLiveSyncState;
import com.squareup.preferences.StringPreference;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class RealRegisterAliasResultHandler$Factory$Impl {
    public final GrantPresenter.MetroFactory delegateFactory;

    public RealRegisterAliasResultHandler$Factory$Impl(GrantPresenter.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final ImageLoader$Builder create$1(BetterNavigator.ScreenNavigator screenNavigator) {
        GrantPresenter.MetroFactory metroFactory = this.delegateFactory;
        Analytics analytics = (Analytics) metroFactory.blockersDataNavigator.invoke();
        TimeToLiveSyncState timeToLiveSyncState = (TimeToLiveSyncState) metroFactory.multiBlockerFacilitator.invoke();
        StringPreference stringPreference = (StringPreference) metroFactory.analytics.invoke();
        CoroutineScope coroutineScope = (CoroutineScope) metroFactory.activityEvents.value;
        RealOnboardingFlowTokenManager realOnboardingFlowTokenManager = (RealOnboardingFlowTokenManager) metroFactory.blockerFlowAnalytics.invoke();
        BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) metroFactory.blockersHelperFactory.invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.blockerActionUriDecoder.invoke();
        analytics.getClass();
        timeToLiveSyncState.getClass();
        stringPreference.getClass();
        coroutineScope.getClass();
        realOnboardingFlowTokenManager.getClass();
        blockersDataNavigator.getClass();
        androidStringManager.getClass();
        return new ImageLoader$Builder(analytics, timeToLiveSyncState, stringPreference, coroutineScope, realOnboardingFlowTokenManager, blockersDataNavigator, androidStringManager, screenNavigator);
    }
}
