package com.squareup.cash.profile.presenters;

import app.cash.broadway.screen.Screen;
import com.bugsnag.android.DeviceBuildInfo;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.favorites.data.RealFavoritesManager;
import com.squareup.cash.favorites.presenters.RealFavoritesInboundNavigator$Factory$Impl;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.history.payments.presenters.ProfilePaymentHistoryPresenter$Factory$Impl;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.profile.repo.real.RealProfileRepo;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.cashface.api.CashFaceClientService;
import dev.zacsweers.metro.Provider;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class RealGenericProfileElementsPresenter$Factory$Impl {
    public final DeviceBuildInfo delegateFactory;

    public RealGenericProfileElementsPresenter$Factory$Impl(DeviceBuildInfo deviceBuildInfo) {
        this.delegateFactory = deviceBuildInfo;
    }

    public final RealGenericProfileElementsPresenter create$1(Screen screen, ProfileScreens.GenericProfileElementsSection genericProfileElementsSection, Flow flow, BetterNavigator.ScreenNavigator screenNavigator) {
        screen.getClass();
        DeviceBuildInfo deviceBuildInfo = this.delegateFactory;
        CashFaceClientService cashFaceClientService = (CashFaceClientService) ((Provider) deviceBuildInfo.manufacturer).invoke();
        Analytics analytics = (Analytics) ((Provider) deviceBuildInfo.model).invoke();
        BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) ((Provider) deviceBuildInfo.osVersion).invoke();
        FlowStarter flowStarter = (FlowStarter) ((Provider) deviceBuildInfo.osBuild).invoke();
        RealProfileRepo realProfileRepo = (RealProfileRepo) ((RealSessionFlags.MetroFactory) deviceBuildInfo.fingerprint).invoke();
        ProfilePaymentHistoryPresenter$Factory$Impl profilePaymentHistoryPresenter$Factory$Impl = (ProfilePaymentHistoryPresenter$Factory$Impl) ((Provider) deviceBuildInfo.tags).invoke();
        RealFavoritesInboundNavigator$Factory$Impl realFavoritesInboundNavigator$Factory$Impl = (RealFavoritesInboundNavigator$Factory$Impl) ((Provider) deviceBuildInfo.brand).invoke();
        RealFavoritesManager realFavoritesManager = (RealFavoritesManager) ((Provider) deviceBuildInfo.apiLevel).invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) ((Provider) deviceBuildInfo.cpuAbis).invoke();
        cashFaceClientService.getClass();
        analytics.getClass();
        blockersDataNavigator.getClass();
        flowStarter.getClass();
        profilePaymentHistoryPresenter$Factory$Impl.getClass();
        realFavoritesInboundNavigator$Factory$Impl.getClass();
        realFavoritesManager.getClass();
        androidStringManager.getClass();
        return new RealGenericProfileElementsPresenter(cashFaceClientService, analytics, blockersDataNavigator, flowStarter, realProfileRepo, profilePaymentHistoryPresenter$Factory$Impl, realFavoritesInboundNavigator$Factory$Impl, realFavoritesManager, androidStringManager, screen, genericProfileElementsSection, flow, screenNavigator);
    }
}
