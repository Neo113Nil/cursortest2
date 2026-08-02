package com.squareup.cash.clientrouting.routers.tapToPay;

import app.cash.broadway.navigation.Navigator;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.taptopay.backend.real.RealTapToPayAnalyticsHelper;
import com.squareup.cash.taptopay.screens.TapToPayOnboardingCompleteScreen;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class TapToPayRouter {
    public final Navigator navigator;
    public final RealTapToPayAnalyticsHelper tapToPayAnalyticsHelper;

    public TapToPayRouter(RealTapToPayAnalyticsHelper realTapToPayAnalyticsHelper, Navigator navigator) {
        navigator.getClass();
        this.tapToPayAnalyticsHelper = realTapToPayAnalyticsHelper;
        this.navigator = navigator;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.ViewTapToPayActivationWithToken viewTapToPayActivationWithToken, ContinuationImpl continuationImpl) {
        TapToPayRouter$route$1 tapToPayRouter$route$1;
        int i;
        if (continuationImpl instanceof TapToPayRouter$route$1) {
            tapToPayRouter$route$1 = (TapToPayRouter$route$1) continuationImpl;
            int i2 = tapToPayRouter$route$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                tapToPayRouter$route$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = tapToPayRouter$route$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tapToPayRouter$route$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str = viewTapToPayActivationWithToken.flowToken;
                    tapToPayRouter$route$1.label = 1;
                    this.tapToPayAnalyticsHelper.preferences.edit().putString("TAP_TO_PAY_SERVER_FLOW_KEY", str).apply();
                    if (Unit.INSTANCE == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                this.navigator.goTo(TapToPayOnboardingCompleteScreen.INSTANCE);
                return Unit.INSTANCE;
            }
        }
        tapToPayRouter$route$1 = new TapToPayRouter$route$1(this, continuationImpl);
        Object obj2 = tapToPayRouter$route$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tapToPayRouter$route$1.label;
        if (i != 0) {
        }
        this.navigator.goTo(TapToPayOnboardingCompleteScreen.INSTANCE);
        return Unit.INSTANCE;
    }
}
