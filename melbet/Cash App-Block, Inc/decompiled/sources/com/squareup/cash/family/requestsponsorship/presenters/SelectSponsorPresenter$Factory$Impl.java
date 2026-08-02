package com.squareup.cash.family.requestsponsorship.presenters;

import androidx.compose.ui.node.NodeChain;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.family.requestsponsorship.screens.SelectDependentScreen;
import com.squareup.cash.family.requestsponsorship.screens.SelectSponsorScreen;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.permissions.ModifiablePermissions;
import com.squareup.cash.recipients.data.RealRecipientRepository;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.aegis.service.AegisService;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.util.coroutines.Signal;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;

/* loaded from: classes.dex */
public final class SelectSponsorPresenter$Factory$Impl {
    public final NodeChain delegateFactory;

    public SelectSponsorPresenter$Factory$Impl(NodeChain nodeChain) {
        this.delegateFactory = nodeChain;
    }

    public static SelectSponsorPresenter create$default(SelectSponsorPresenter$Factory$Impl selectSponsorPresenter$Factory$Impl, SelectSponsorScreen selectSponsorScreen, SelectDependentScreen selectDependentScreen, BetterNavigator.ScreenNavigator screenNavigator, int i) {
        SelectSponsorScreen selectSponsorScreen2 = (i & 1) != 0 ? null : selectSponsorScreen;
        SelectDependentScreen selectDependentScreen2 = (i & 2) != 0 ? null : selectDependentScreen;
        NodeChain nodeChain = selectSponsorPresenter$Factory$Impl.delegateFactory;
        AegisService aegisService = (AegisService) ((DoubleCheck) nodeChain.layoutNode).getValue();
        AppService appService = (AppService) ((DoubleCheck) nodeChain.sentinelHead).getValue();
        RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl = (RealBlockersHelper$Factory$Impl) ((Provider) nodeChain.innerCoordinator).invoke();
        BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) ((Provider) nodeChain.outerCoordinator).invoke();
        ModifiablePermissions modifiablePermissions = (ModifiablePermissions) ((Provider) nodeChain.tail).invoke();
        FeatureFlagManager featureFlagManager = (FeatureFlagManager) ((DoubleCheck) nodeChain.head).getValue();
        RealRecipientRepository realRecipientRepository = (RealRecipientRepository) ((Provider) nodeChain.current).invoke();
        Signal signal = (Signal) ((DoubleCheck) nodeChain.buffer).getValue();
        AndroidStringManager androidStringManager = (AndroidStringManager) ((LambdaProvider) nodeChain.stack).lambda.invoke();
        RealProfileManager realProfileManager = (RealProfileManager) ((DelegateFactory) nodeChain.cachedDiffer).invoke();
        aegisService.getClass();
        appService.getClass();
        realBlockersHelper$Factory$Impl.getClass();
        blockersDataNavigator.getClass();
        modifiablePermissions.getClass();
        featureFlagManager.getClass();
        realRecipientRepository.getClass();
        signal.getClass();
        androidStringManager.getClass();
        realProfileManager.getClass();
        return new SelectSponsorPresenter(aegisService, appService, realBlockersHelper$Factory$Impl, blockersDataNavigator, modifiablePermissions, featureFlagManager, realRecipientRepository, signal, androidStringManager, realProfileManager, selectSponsorScreen2, selectDependentScreen2, screenNavigator);
    }
}
