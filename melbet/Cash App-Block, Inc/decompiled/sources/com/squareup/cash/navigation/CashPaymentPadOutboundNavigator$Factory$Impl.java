package com.squareup.cash.navigation;

import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.family.navigation.RealFamilyNavigator$MetroFactory;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.qrcodes.navigation.RealQrCodesInboundNavigator$Factory$Impl;

/* loaded from: classes.dex */
public final class CashPaymentPadOutboundNavigator$Factory$Impl {
    public final RealFamilyNavigator$MetroFactory delegateFactory;

    public CashPaymentPadOutboundNavigator$Factory$Impl(RealFamilyNavigator$MetroFactory realFamilyNavigator$MetroFactory) {
        this.delegateFactory = realFamilyNavigator$MetroFactory;
    }

    public final EglCore create$1(BetterNavigator.ScreenNavigator screenNavigator) {
        RealFamilyNavigator$MetroFactory realFamilyNavigator$MetroFactory = this.delegateFactory;
        RealQrCodesInboundNavigator$Factory$Impl realQrCodesInboundNavigator$Factory$Impl = (RealQrCodesInboundNavigator$Factory$Impl) realFamilyNavigator$MetroFactory.analytics.invoke();
        RealBitcoinCapabilityProvider realBitcoinCapabilityProvider = (RealBitcoinCapabilityProvider) realFamilyNavigator$MetroFactory.sessionManager.invoke();
        RealBitcoinInboundNavigator$Factory$Impl realBitcoinInboundNavigator$Factory$Impl = (RealBitcoinInboundNavigator$Factory$Impl) realFamilyNavigator$MetroFactory.supportNavigator.invoke();
        FeatureFlagManager featureFlagManager = (FeatureFlagManager) realFamilyNavigator$MetroFactory.stringManager.invoke();
        realQrCodesInboundNavigator$Factory$Impl.getClass();
        realBitcoinCapabilityProvider.getClass();
        realBitcoinInboundNavigator$Factory$Impl.getClass();
        featureFlagManager.getClass();
        return new EglCore(realQrCodesInboundNavigator$Factory$Impl, realBitcoinCapabilityProvider, realBitcoinInboundNavigator$Factory$Impl, featureFlagManager, screenNavigator);
    }
}
