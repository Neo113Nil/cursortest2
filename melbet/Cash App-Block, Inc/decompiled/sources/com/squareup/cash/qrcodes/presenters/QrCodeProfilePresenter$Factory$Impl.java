package com.squareup.cash.qrcodes.presenters;

import com.squareup.cash.boost.db.Reward$Adapter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import com.squareup.cash.qrcodes.navigation.RealQrCodesOutboundNavigator$Factory$Impl;
import com.squareup.cash.qrcodes.screens.QrCodeScreen;
import com.squareup.cash.qrcodes.screens.TeenQrCodeScreen;
import com.squareup.preferences.KeyValue;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;

/* loaded from: classes.dex */
public final class QrCodeProfilePresenter$Factory$Impl {
    public final Reward$Adapter delegateFactory;

    public QrCodeProfilePresenter$Factory$Impl(Reward$Adapter reward$Adapter) {
        this.delegateFactory = reward$Adapter;
    }

    public final QrCodeProfilePresenter create(QrCodeScreen qrCodeScreen, TeenQrCodeScreen teenQrCodeScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        Reward$Adapter reward$Adapter = this.delegateFactory;
        RealProfileManager realProfileManager = (RealProfileManager) ((DelegateFactory) reward$Adapter.avatarsAdapter).invoke();
        RealP2pSettingsManager realP2pSettingsManager = (RealP2pSettingsManager) ((Provider) reward$Adapter.reward_selection_stateAdapter).invoke();
        RealQrCodesPresenter realQrCodesPresenter = (RealQrCodesPresenter) ((Provider) reward$Adapter.boost_detail_bottom_upsellAdapter).invoke();
        RealQrCodesOutboundNavigator$Factory$Impl realQrCodesOutboundNavigator$Factory$Impl = (RealQrCodesOutboundNavigator$Factory$Impl) ((InstanceFactory) reward$Adapter.app_linksAdapter).value;
        KeyValue keyValue = (KeyValue) ((Provider) reward$Adapter.program_detail_rowsAdapter).invoke();
        FeatureFlagManager featureFlagManager = (FeatureFlagManager) ((DoubleCheck) reward$Adapter.boost_detail_rowsAdapter).getValue();
        RealFamilyProfileManager realFamilyProfileManager = (RealFamilyProfileManager) ((Provider) reward$Adapter.boost_attributesAdapter).invoke();
        realProfileManager.getClass();
        realP2pSettingsManager.getClass();
        realQrCodesPresenter.getClass();
        realQrCodesOutboundNavigator$Factory$Impl.getClass();
        keyValue.getClass();
        featureFlagManager.getClass();
        realFamilyProfileManager.getClass();
        return new QrCodeProfilePresenter(realProfileManager, realP2pSettingsManager, realQrCodesPresenter, realQrCodesOutboundNavigator$Factory$Impl, keyValue, featureFlagManager, realFamilyProfileManager, qrCodeScreen, teenQrCodeScreen, screenNavigator);
    }
}
