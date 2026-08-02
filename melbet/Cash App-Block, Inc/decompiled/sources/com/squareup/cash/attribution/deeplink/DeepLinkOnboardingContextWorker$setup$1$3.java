package com.squareup.cash.attribution.deeplink;

import com.squareup.cash.onboarding.backend.OnboardingFlowTokenManager$FlowToken;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes.dex */
public final /* synthetic */ class DeepLinkOnboardingContextWorker$setup$1$3 extends AdaptedFunctionReference implements Function3 {
    public static final DeepLinkOnboardingContextWorker$setup$1$3 INSTANCE = new DeepLinkOnboardingContextWorker$setup$1$3(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new Pair((DeepLink) obj, (OnboardingFlowTokenManager$FlowToken) obj2);
    }
}
