package com.squareup.cash.profile.presenters;

import app.cash.local.presenters.LocalEditorialPresenter;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.businessaccount.backend.real.RealBusinessProfileManager;
import com.squareup.cash.cashapppay.presenters.GrantPresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import com.squareup.cash.profile.repo.real.RealProfileRepo;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.resource.text.AndroidStringManager;

/* loaded from: classes.dex */
public final class RealProfilePreviewPresenter$Factory$Impl {
    public final GrantPresenter.MetroFactory delegateFactory;

    public RealProfilePreviewPresenter$Factory$Impl(GrantPresenter.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final LocalEditorialPresenter create$1(ProfileScreens.ProfilePreview profilePreview, BetterNavigator.ScreenNavigator screenNavigator) {
        profilePreview.getClass();
        GrantPresenter.MetroFactory metroFactory = this.delegateFactory;
        RealProfileManager realProfileManager = (RealProfileManager) metroFactory.blockersDataNavigator.invoke();
        RealProfileRepo realProfileRepo = (RealProfileRepo) metroFactory.multiBlockerFacilitator.invoke();
        RealP2pSettingsManager realP2pSettingsManager = (RealP2pSettingsManager) metroFactory.analytics.invoke();
        RealBusinessProfileManager realBusinessProfileManager = (RealBusinessProfileManager) metroFactory.blockerFlowAnalytics.invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.blockersHelperFactory.invoke();
        RealGenericProfileElementsPresenter$Factory$Impl realGenericProfileElementsPresenter$Factory$Impl = (RealGenericProfileElementsPresenter$Factory$Impl) metroFactory.activityEvents.value;
        RealBitcoinCapabilityProvider realBitcoinCapabilityProvider = (RealBitcoinCapabilityProvider) metroFactory.blockerActionUriDecoder.invoke();
        realProfileManager.getClass();
        realProfileRepo.getClass();
        realP2pSettingsManager.getClass();
        realBusinessProfileManager.getClass();
        androidStringManager.getClass();
        realGenericProfileElementsPresenter$Factory$Impl.getClass();
        realBitcoinCapabilityProvider.getClass();
        return new LocalEditorialPresenter(realProfileManager, realProfileRepo, realP2pSettingsManager, realBusinessProfileManager, androidStringManager, realGenericProfileElementsPresenter$Factory$Impl, realBitcoinCapabilityProvider, profilePreview, screenNavigator);
    }
}
