package com.squareup.cash.blockers.presenters;

import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.protos.cash.grantly.app.ShippingAddressService;
import com.squareup.protos.franklin.app.AppService;

/* loaded from: classes.dex */
public final class SetAddressPresenter$Factory$Impl {
    public final SetAddressPresenter$MetroFactory delegateFactory;

    public SetAddressPresenter$Factory$Impl(SetAddressPresenter$MetroFactory setAddressPresenter$MetroFactory) {
        this.delegateFactory = setAddressPresenter$MetroFactory;
    }

    public final CardLockPresenter create(BlockersScreens.StreetAddressScreen streetAddressScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        SetAddressPresenter$MetroFactory setAddressPresenter$MetroFactory = this.delegateFactory;
        AndroidStringManager androidStringManager = (AndroidStringManager) setAddressPresenter$MetroFactory.stringManager.lambda.invoke();
        Analytics analytics = (Analytics) setAddressPresenter$MetroFactory.analytics.getValue();
        BlockerFlowListener blockerFlowListener = (BlockerFlowListener) setAddressPresenter$MetroFactory.blockerFlowAnalytics.invoke();
        ShippingAddressService shippingAddressService = (ShippingAddressService) setAddressPresenter$MetroFactory.service.getValue();
        AppService appService = (AppService) setAddressPresenter$MetroFactory.franklinAppService.getValue();
        BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) setAddressPresenter$MetroFactory.blockersNavigator.invoke();
        AppConfigManager appConfigManager = (AppConfigManager) setAddressPresenter$MetroFactory.appConfig.getValue();
        RealIdvPresenter$RealIdvPresenterFactory$Impl realIdvPresenter$RealIdvPresenterFactory$Impl = (RealIdvPresenter$RealIdvPresenterFactory$Impl) setAddressPresenter$MetroFactory.idvPresenterFactory.invoke();
        RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl = (RealBlockersHelper$Factory$Impl) setAddressPresenter$MetroFactory.blockersHelperFactory.invoke();
        androidStringManager.getClass();
        analytics.getClass();
        blockerFlowListener.getClass();
        shippingAddressService.getClass();
        appService.getClass();
        blockersDataNavigator.getClass();
        appConfigManager.getClass();
        realIdvPresenter$RealIdvPresenterFactory$Impl.getClass();
        realBlockersHelper$Factory$Impl.getClass();
        return new CardLockPresenter(androidStringManager, analytics, blockerFlowListener, shippingAddressService, appService, blockersDataNavigator, appConfigManager, realIdvPresenter$RealIdvPresenterFactory$Impl, realBlockersHelper$Factory$Impl, streetAddressScreen, screenNavigator);
    }
}
