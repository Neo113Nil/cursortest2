package com.squareup.cash.clientrouting.routers.stablecoin;

import app.cash.broadway.navigation.Navigator;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.bitcoin.screens.StablecoinDepositOptionsScreen;
import com.squareup.cash.bitcoin.screens.StablecoinOnboardingScreen;
import com.squareup.cash.bitcoin.screens.StablecoinOnboardingType;
import com.squareup.cash.cdf.app.AppNavigateOpenSpace;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.featureflags.AmplitudeExperiments$BitcoinStablecoinMvp;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.stablecoin.navigation.real.RealStablecoinInboundNavigator$Factory$Impl;
import com.squareup.cash.stablecoin.screens.StablecoinScreens$StablecoinHome;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.preferences.KeyValue;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class StablecoinRouter {
    public final FeatureFlagManager featureFlagManager;
    public final KeyValue hasSeenStablecoinReceiveOnboarding;
    public final Navigator navigator;
    public final ToolbarTuckTargets stablecoinInboundNavigator;

    public StablecoinRouter(KeyValue keyValue, FeatureFlagManager featureFlagManager, RealStablecoinInboundNavigator$Factory$Impl realStablecoinInboundNavigator$Factory$Impl, Navigator navigator) {
        navigator.getClass();
        this.hasSeenStablecoinReceiveOnboarding = keyValue;
        this.featureFlagManager = featureFlagManager;
        this.navigator = navigator;
        Analytics analytics = (Analytics) realStablecoinInboundNavigator$Factory$Impl.delegateFactory.staticImageLoader.invoke();
        analytics.getClass();
        navigator.getClass();
        ToolbarTuckTargets toolbarTuckTargets = new ToolbarTuckTargets();
        toolbarTuckTargets.startCornerCenterX$delegate = analytics;
        toolbarTuckTargets.endCornerCenterX$delegate = navigator;
        this.stablecoinInboundNavigator = toolbarTuckTargets;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ContinuationImpl continuationImpl) {
        StablecoinRouter$route$1 stablecoinRouter$route$1;
        int i;
        boolean booleanValue;
        if (continuationImpl instanceof StablecoinRouter$route$1) {
            stablecoinRouter$route$1 = (StablecoinRouter$route$1) continuationImpl;
            int i2 = stablecoinRouter$route$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stablecoinRouter$route$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stablecoinRouter$route$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stablecoinRouter$route$1.label;
                FeatureFlagManager featureFlagManager = this.featureFlagManager;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(AmplitudeExperiments$BitcoinStablecoinMvp.INSTANCE)).enabled()) {
                        return Unit.INSTANCE;
                    }
                    stablecoinRouter$route$1.label = 1;
                    obj = this.hasSeenStablecoinReceiveOnboarding.get(stablecoinRouter$route$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                Navigator navigator = this.navigator;
                if (booleanValue) {
                    navigator.goTo(new StablecoinOnboardingScreen(StablecoinOnboardingType.RECEIVE, false));
                } else {
                    ((RealFeatureFlagManager) featureFlagManager).currentValue(AmplitudeExperiments$BitcoinStablecoinMvp.INSTANCE);
                    navigator.goTo(new StablecoinDepositOptionsScreen(new MoneyTabScreen(null), null, 2));
                }
                return Unit.INSTANCE;
            }
        }
        stablecoinRouter$route$1 = new StablecoinRouter$route$1(this, continuationImpl);
        Object obj2 = stablecoinRouter$route$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stablecoinRouter$route$1.label;
        FeatureFlagManager featureFlagManager2 = this.featureFlagManager;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        Navigator navigator2 = this.navigator;
        if (booleanValue) {
        }
        return Unit.INSTANCE;
    }

    public static void route(ClientRoute.ViewStablecoinUri viewStablecoinUri) {
        viewStablecoinUri.getClass();
        throw new NotImplementedError("An operation is not implemented: This route is not yet implemented.");
    }

    public final void route(ClientRoute.ViewStablecoin viewStablecoin) {
        viewStablecoin.getClass();
        ToolbarTuckTargets toolbarTuckTargets = this.stablecoinInboundNavigator;
        ((Analytics) toolbarTuckTargets.startCornerCenterX$delegate).track(new AppNavigateOpenSpace(null, null, AppNavigateOpenSpace.Space.STABLECOIN, null, EnumC0170g.SDK_ASSET_ICON_CANCEL_VALUE), null);
        ((Navigator) toolbarTuckTargets.endCornerCenterX$delegate).goTo(StablecoinScreens$StablecoinHome.INSTANCE);
    }
}
