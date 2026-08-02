package com.squareup.cash.blockers.presenters;

import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.profile.RealProfileNotificationsRepository;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.presenters.TransferringPresenter$MetroFactory;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.protos.franklin.app.AppService;

/* loaded from: classes.dex */
public final class RequestPushNotificationsBlockerPresenter$Factory$Impl {
    public final TransferringPresenter$MetroFactory delegateFactory;

    public RequestPushNotificationsBlockerPresenter$Factory$Impl(TransferringPresenter$MetroFactory transferringPresenter$MetroFactory) {
        this.delegateFactory = transferringPresenter$MetroFactory;
    }

    public final RequestPushNotificationsBlockerPresenter create(BlockersScreens.RequestPushNotificationsBlockerScreen requestPushNotificationsBlockerScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        TransferringPresenter$MetroFactory transferringPresenter$MetroFactory = this.delegateFactory;
        BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) transferringPresenter$MetroFactory.blockersDataNavigator.invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) transferringPresenter$MetroFactory.stringManager.lambda.invoke();
        AndroidPermissionManager androidPermissionManager = (AndroidPermissionManager) transferringPresenter$MetroFactory.balanceSnapshotManager.invoke();
        Analytics analytics = (Analytics) transferringPresenter$MetroFactory.appService.getValue();
        AppService appService = (AppService) transferringPresenter$MetroFactory.flowStarter.getValue();
        RealProfileNotificationsRepository realProfileNotificationsRepository = (RealProfileNotificationsRepository) transferringPresenter$MetroFactory.moneyFormatterFactory.invoke();
        SessionManager sessionManager = (SessionManager) transferringPresenter$MetroFactory.uuidGenerator.lambda.invoke();
        blockersDataNavigator.getClass();
        androidStringManager.getClass();
        androidPermissionManager.getClass();
        analytics.getClass();
        appService.getClass();
        realProfileNotificationsRepository.getClass();
        sessionManager.getClass();
        return new RequestPushNotificationsBlockerPresenter(blockersDataNavigator, androidStringManager, requestPushNotificationsBlockerScreen, screenNavigator, androidPermissionManager, analytics, appService, realProfileNotificationsRepository, sessionManager);
    }
}
