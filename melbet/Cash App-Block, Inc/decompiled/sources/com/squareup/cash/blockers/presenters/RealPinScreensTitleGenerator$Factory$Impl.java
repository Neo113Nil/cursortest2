package com.squareup.cash.blockers.presenters;

import com.squareup.cash.account.backend.RealAccountholderAccountRepository;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.family.navigation.RealFamilyNavigator$MetroFactory;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import com.squareup.cash.resource.text.AndroidStringManager;

/* loaded from: classes.dex */
public final class RealPinScreensTitleGenerator$Factory$Impl {
    public final RealFamilyNavigator$MetroFactory delegateFactory;

    public RealPinScreensTitleGenerator$Factory$Impl(RealFamilyNavigator$MetroFactory realFamilyNavigator$MetroFactory) {
        this.delegateFactory = realFamilyNavigator$MetroFactory;
    }

    public final RealPinScreensTitleGenerator create$1(TitleTemplates titleTemplates) {
        RealFamilyNavigator$MetroFactory realFamilyNavigator$MetroFactory = this.delegateFactory;
        RealP2pSettingsManager realP2pSettingsManager = (RealP2pSettingsManager) realFamilyNavigator$MetroFactory.analytics.invoke();
        RealProfileManager realProfileManager = (RealProfileManager) realFamilyNavigator$MetroFactory.sessionManager.invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) realFamilyNavigator$MetroFactory.supportNavigator.invoke();
        RealAccountholderAccountRepository realAccountholderAccountRepository = (RealAccountholderAccountRepository) realFamilyNavigator$MetroFactory.stringManager.invoke();
        realP2pSettingsManager.getClass();
        realProfileManager.getClass();
        androidStringManager.getClass();
        realAccountholderAccountRepository.getClass();
        return new RealPinScreensTitleGenerator(realP2pSettingsManager, realProfileManager, androidStringManager, realAccountholderAccountRepository, titleTemplates);
    }
}
