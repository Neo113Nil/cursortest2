package com.squareup.cash.blockers.presenters;

import com.squareup.cash.blockers.presenters.SsnPresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.resource.text.AndroidStringManager;

/* loaded from: classes.dex */
public final class SsnPresenter$Factory$Impl {
    public final SsnPresenter.MetroFactory delegateFactory;

    public SsnPresenter$Factory$Impl(SsnPresenter.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final SsnPresenter create(BlockersScreens.SsnScreen ssnScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        SsnPresenter.MetroFactory metroFactory = this.delegateFactory;
        AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.stringManager.lambda.invoke();
        RealIdvPresenter$RealIdvPresenterFactory$Impl realIdvPresenter$RealIdvPresenterFactory$Impl = (RealIdvPresenter$RealIdvPresenterFactory$Impl) metroFactory.idvPresenterFactory.invoke();
        RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl = (RealBlockersHelper$Factory$Impl) metroFactory.blockersHelperFactory.invoke();
        androidStringManager.getClass();
        realIdvPresenter$RealIdvPresenterFactory$Impl.getClass();
        realBlockersHelper$Factory$Impl.getClass();
        return new SsnPresenter(androidStringManager, realIdvPresenter$RealIdvPresenterFactory$Impl, realBlockersHelper$Factory$Impl, ssnScreen, screenNavigator);
    }
}
