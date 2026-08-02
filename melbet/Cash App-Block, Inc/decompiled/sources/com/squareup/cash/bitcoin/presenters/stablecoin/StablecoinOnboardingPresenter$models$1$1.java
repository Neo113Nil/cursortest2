package com.squareup.cash.bitcoin.presenters.stablecoin;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.bitcoin.screens.ReceiveStablecoinScreen;
import com.squareup.cash.bitcoin.screens.StablecoinDepositOptionsScreen;
import com.squareup.cash.bitcoin.screens.StablecoinOnboardingScreen;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.featureflags.AmplitudeExperiments$BitcoinStablecoinMvp;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.screens.Back;
import com.squareup.preferences.KeyValue;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class StablecoinOnboardingPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ DisclosurePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StablecoinOnboardingPresenter$models$1$1(DisclosurePresenter disclosurePresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = disclosurePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        DisclosurePresenter disclosurePresenter = this.this$0;
        switch (i) {
            case 0:
                return new StablecoinOnboardingPresenter$models$1$1(disclosurePresenter, continuation, 0);
            default:
                return new StablecoinOnboardingPresenter$models$1$1(disclosurePresenter, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((StablecoinOnboardingPresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (r10.set(r1, r9) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r10.set(r1, r9) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0099, code lost:
    
        if (r10.set(r1, r9) == r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b0, code lost:
    
        if (r10.set(r1, r9) == r6) goto L42;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        DisclosurePresenter disclosurePresenter = this.this$0;
        switch (i) {
            case 0:
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) disclosurePresenter.navigator;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                Back back = Back.INSTANCE;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StablecoinOnboardingScreen stablecoinOnboardingScreen = (StablecoinOnboardingScreen) disclosurePresenter.args;
                    if (!stablecoinOnboardingScreen.startedAsInfo) {
                        int ordinal = stablecoinOnboardingScreen.onboardingType.ordinal();
                        if (ordinal == 0) {
                            KeyValue keyValue = (KeyValue) disclosurePresenter.appService;
                            Boolean bool = Boolean.TRUE;
                            this.label = 1;
                            break;
                        } else if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            KeyValue keyValue2 = (KeyValue) disclosurePresenter.blockersNavigator;
                            Boolean bool2 = Boolean.TRUE;
                            this.label = 2;
                            break;
                        }
                        break;
                    } else {
                        screenNavigator.goTo(back);
                        break;
                    }
                } else if (i2 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    if (((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) disclosurePresenter.analytics)).currentValue(AmplitudeExperiments$BitcoinStablecoinMvp.INSTANCE)).enabled()) {
                        screenNavigator.goTo(back);
                        screenNavigator.goTo(new StablecoinDepositOptionsScreen(new MoneyTabScreen(null), null, 2));
                    } else {
                        screenNavigator.goTo(ReceiveStablecoinScreen.INSTANCE);
                    }
                } else if (i2 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    screenNavigator.goTo(back);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    int ordinal2 = ((StablecoinOnboardingScreen) disclosurePresenter.args).onboardingType.ordinal();
                    if (ordinal2 == 0) {
                        KeyValue keyValue3 = (KeyValue) disclosurePresenter.appService;
                        Boolean bool3 = Boolean.TRUE;
                        this.label = 1;
                        break;
                    } else if (ordinal2 != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        KeyValue keyValue4 = (KeyValue) disclosurePresenter.blockersNavigator;
                        Boolean bool4 = Boolean.TRUE;
                        this.label = 2;
                        break;
                    }
                } else if (i3 != 1 && i3 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
