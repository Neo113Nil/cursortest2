package com.squareup.cash.account.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.account.navigation.RealAccountOutboundNavigator;
import com.squareup.cash.cdf.personalprofile.PersonalProfileViewOpen;
import com.squareup.cash.cdf.personalprofile.PersonalProfileViewOpenLink;
import com.squareup.cash.cdf.personalprofile.PersonalProfileViewOpenScreen;
import com.squareup.cash.data.profile.RealProfileSyncer;
import com.squareup.cash.data.profile.RealReferralManager;
import com.squareup.cash.featureflags.AmplitudeExperiments$AccountForceProfileSync;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.transfers.navigation.real.RealTransfersInboundNavigator$Factory$Impl;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class AccountPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ AccountPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccountPresenter$models$1$1(AccountPresenter accountPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = accountPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        AccountPresenter accountPresenter = this.this$0;
        switch (i) {
            case 0:
                return new AccountPresenter$models$1$1(accountPresenter, continuation, 0);
            case 1:
                return new AccountPresenter$models$1$1(accountPresenter, continuation, 1);
            case 2:
                return new AccountPresenter$models$1$1(accountPresenter, continuation, 2);
            case 3:
                return new AccountPresenter$models$1$1(accountPresenter, continuation, 3);
            case 4:
                return new AccountPresenter$models$1$1(accountPresenter, continuation, 4);
            default:
                return new AccountPresenter$models$1$1(accountPresenter, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((AccountPresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        AccountPresenter accountPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Analytics analytics = accountPresenter.analytics;
                    PersonalProfileViewOpen.PersonalProfileScreen personalProfileScreen = PersonalProfileViewOpen.PersonalProfileScreen.YOUR_ACCOUNT;
                    analytics.track(new PersonalProfileViewOpen(), null);
                    if (((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) accountPresenter.featureFlagManager).currentValue(AmplitudeExperiments$AccountForceProfileSync.INSTANCE)).enabled()) {
                        RealProfileSyncer realProfileSyncer = accountPresenter.profileSyncer;
                        this.label = 1;
                        if (realProfileSyncer.refresh(true, this) == coroutineSingletons) {
                            break;
                        }
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealReferralManager realReferralManager = accountPresenter.referralManager;
                    this.label = 1;
                    if (realReferralManager.refresh(true, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    accountPresenter.linkedBanksViewedPreference.set(true);
                    accountPresenter.logPersonalProfileViewOpenScreen(PersonalProfileViewOpenScreen.PersonalProfileSubScreen.LINKED_BANKS);
                    RealAccountOutboundNavigator realAccountOutboundNavigator = accountPresenter.accountOutboundNavigator;
                    Object goToLinkedAccountsScreen = ((RealTransfersInboundNavigator$Factory$Impl) realAccountOutboundNavigator.transfersInboundNavigatorFactory).create$1(realAccountOutboundNavigator.navigator).goToLinkedAccountsScreen(this);
                    if (goToLinkedAccountsScreen != coroutineSingletons3) {
                        goToLinkedAccountsScreen = Unit.INSTANCE;
                    }
                    if (goToLinkedAccountsScreen != coroutineSingletons3) {
                        goToLinkedAccountsScreen = Unit.INSTANCE;
                    }
                    if (goToLinkedAccountsScreen == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    accountPresenter.analytics.track(new PersonalProfileViewOpenLink(PersonalProfileViewOpenLink.Destination.PRIVACY_POLICY), null);
                    RealAccountOutboundNavigator realAccountOutboundNavigator2 = accountPresenter.accountOutboundNavigator;
                    this.label = 1;
                    if (realAccountOutboundNavigator2.goToPrivacyNotice(this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    accountPresenter.analytics.track(new PersonalProfileViewOpenLink(PersonalProfileViewOpenLink.Destination.TERMS_OF_SERVICE), null);
                    RealAccountOutboundNavigator realAccountOutboundNavigator3 = accountPresenter.accountOutboundNavigator;
                    this.label = 1;
                    if (realAccountOutboundNavigator3.goToTermsOfService(this) == coroutineSingletons5) {
                        break;
                    }
                } else if (i6 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealReferralManager realReferralManager2 = accountPresenter.referralManager;
                    this.label = 1;
                    if (realReferralManager2.referralStatusRowSeen(this) == coroutineSingletons6) {
                        break;
                    }
                } else if (i7 != 1) {
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
