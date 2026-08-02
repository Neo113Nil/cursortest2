package com.squareup.cash.banking.navigation.real;

import app.cash.broadway.navigation.Navigator;
import com.fillr.featuretoggle.UnleashContext;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.family.navigation.RealFamilyNavigator$MetroFactory;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.transfers.navigation.real.RealTransfersInboundNavigator$Factory$Impl;

/* loaded from: classes.dex */
public final class RealBankingOutboundNavigator$Factory$Impl {
    public final RealFamilyNavigator$MetroFactory delegateFactory;

    public RealBankingOutboundNavigator$Factory$Impl(RealFamilyNavigator$MetroFactory realFamilyNavigator$MetroFactory) {
        this.delegateFactory = realFamilyNavigator$MetroFactory;
    }

    public final UnleashContext create$1(Navigator navigator) {
        navigator.getClass();
        RealFamilyNavigator$MetroFactory realFamilyNavigator$MetroFactory = this.delegateFactory;
        RealSupportNavigator realSupportNavigator = (RealSupportNavigator) realFamilyNavigator$MetroFactory.analytics.invoke();
        FlowStarter flowStarter = (FlowStarter) realFamilyNavigator$MetroFactory.sessionManager.invoke();
        RealMoneyNavigatorHelper realMoneyNavigatorHelper = (RealMoneyNavigatorHelper) realFamilyNavigator$MetroFactory.supportNavigator.invoke();
        RealTransfersInboundNavigator$Factory$Impl realTransfersInboundNavigator$Factory$Impl = (RealTransfersInboundNavigator$Factory$Impl) realFamilyNavigator$MetroFactory.stringManager.invoke();
        realSupportNavigator.getClass();
        flowStarter.getClass();
        realMoneyNavigatorHelper.getClass();
        realTransfersInboundNavigator$Factory$Impl.getClass();
        return new UnleashContext(navigator, realSupportNavigator, flowStarter, realMoneyNavigatorHelper, realTransfersInboundNavigator$Factory$Impl);
    }
}
