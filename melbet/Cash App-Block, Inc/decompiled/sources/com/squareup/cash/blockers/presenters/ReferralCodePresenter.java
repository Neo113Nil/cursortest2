package com.squareup.cash.blockers.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.biometrics.AndroidSecureStore$read$2;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.Header;
import com.squareup.cash.blockers.viewmodels.Header$Avatar$Placeholder;
import com.squareup.cash.blockers.viewmodels.ReferralCodeViewModel;
import com.squareup.cash.cdf.referralreward.ReferralRewardReceiveComplete;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.TemporaryStorage$getDir$2;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.profile.RealReferralManager;
import com.squareup.cash.data.profile.ReferralManager$RewardStatus;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.screens.ReferralStatusPresentationArgs$RewardInfo;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.TimeToLiveSyncState;
import com.squareup.cash.support.presenters.SupportHomePresenter$models$lambda$5$$inlined$map$1;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.ApplyRewardCodeResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class ReferralCodePresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final AppService appService;
    public final BlockersScreens.ReferralCodeScreen args;
    public final BlockersDataNavigator blockersNavigator;
    public final AndroidClock clock;
    public final BetterNavigator.ScreenNavigator navigator;
    public final TimeToLiveSyncState profileSyncState;
    public final Header promptHeader;
    public final RealReferralManager referralManager;
    public final AndroidStringManager stringManager;
    public long subscriptionTime;

    public abstract class InternalUpdate {

        public final class RewardCodeApplyErrored extends InternalUpdate {
            public static final RewardCodeApplyErrored INSTANCE = new RewardCodeApplyErrored();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RewardCodeApplyErrored);
            }

            public final int hashCode() {
                return -818210995;
            }

            public final String toString() {
                return "RewardCodeApplyErrored";
            }
        }

        public final class RewardCodeApplyFailed extends InternalUpdate {
            public final Header header;

            public RewardCodeApplyFailed(Header header) {
                this.header = header;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RewardCodeApplyFailed) && Intrinsics.areEqual(this.header, ((RewardCodeApplyFailed) obj).header);
            }

            public final int hashCode() {
                Header header = this.header;
                if (header == null) {
                    return 0;
                }
                return header.hashCode();
            }

            public final String toString() {
                return "RewardCodeApplyFailed(header=" + this.header + ")";
            }
        }

        public final class RewardCodeApplyInProgress extends InternalUpdate {
            public static final RewardCodeApplyInProgress INSTANCE = new RewardCodeApplyInProgress();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RewardCodeApplyInProgress);
            }

            public final int hashCode() {
                return -77538804;
            }

            public final String toString() {
                return "RewardCodeApplyInProgress";
            }
        }

        public final class RewardCodeApplySucceeded extends InternalUpdate {
            public static final RewardCodeApplySucceeded INSTANCE = new RewardCodeApplySucceeded();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RewardCodeApplySucceeded);
            }

            public final int hashCode() {
                return 293948295;
            }

            public final String toString() {
                return "RewardCodeApplySucceeded";
            }
        }

        public final class RewardCodeCheckInProgress extends InternalUpdate {
            public static final RewardCodeCheckInProgress INSTANCE = new RewardCodeCheckInProgress();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RewardCodeCheckInProgress);
            }

            public final int hashCode() {
                return -154696922;
            }

            public final String toString() {
                return "RewardCodeCheckInProgress";
            }
        }

        public final class RewardCodeCheckInvalid extends InternalUpdate {
            public static final RewardCodeCheckInvalid INSTANCE = new RewardCodeCheckInvalid();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RewardCodeCheckInvalid);
            }

            public final int hashCode() {
                return -1601173053;
            }

            public final String toString() {
                return "RewardCodeCheckInvalid";
            }
        }

        public final class RewardCodeCheckRequestErrored extends InternalUpdate {
            public static final RewardCodeCheckRequestErrored INSTANCE = new RewardCodeCheckRequestErrored();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RewardCodeCheckRequestErrored);
            }

            public final int hashCode() {
                return 1475198412;
            }

            public final String toString() {
                return "RewardCodeCheckRequestErrored";
            }
        }

        public final class RewardCodeCheckValid extends InternalUpdate {
            public final Header header;

            public RewardCodeCheckValid(Header header) {
                this.header = header;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RewardCodeCheckValid) && this.header.equals(((RewardCodeCheckValid) obj).header);
            }

            public final int hashCode() {
                return this.header.hashCode();
            }

            public final String toString() {
                return "RewardCodeCheckValid(header=" + this.header + ")";
            }
        }
    }

    public ReferralCodePresenter(RealReferralManager realReferralManager, AndroidStringManager androidStringManager, Analytics analytics, AppService appService, BlockersDataNavigator blockersDataNavigator, AndroidClock androidClock, TimeToLiveSyncState timeToLiveSyncState, BlockersScreens.ReferralCodeScreen referralCodeScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.referralManager = realReferralManager;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.appService = appService;
        this.blockersNavigator = blockersDataNavigator;
        this.clock = androidClock;
        this.profileSyncState = timeToLiveSyncState;
        this.args = referralCodeScreen;
        this.navigator = screenNavigator;
        this.promptHeader = new Header(Header$Avatar$Placeholder.INSTANCE, androidStringManager.get(referralCodeScreen.blockersData.flow == BlockersData.Flow.ONBOARDING ? R.string.blockers_referral_code_title_onboarding : R.string.blockers_referral_code_title_profile));
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        MutableState mutableState;
        BlockersScreens.ReferralCodeScreen referralCodeScreen = this.args;
        int i2 = referralCodeScreen.minimumCodeLength;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1524858562);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        int i3 = 1;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Continuation continuation = null;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            rememberedValue = new TemporaryStorage$getDir$2(this, continuation, i3);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = i2 > 0 ? new AppLockMonitor$special$$inlined$map$2(Integer.valueOf(i2), 19) : new SupportHomePresenter$models$lambda$5$$inlined$map$1(this.referralManager.rewardStatus(), 3);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue2, Integer.valueOf(i2), null, gapComposer, 0, 2);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Updater.mutableStateOf$default(new ReferralCodeViewModel(!referralCodeScreen.skippable, i2 == 0, referralCodeScreen.suggestedCode, true, false, false, this.promptHeader, false));
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState2 = (MutableState) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = FlowKt.MutableSharedFlow$default(0, 0, null, 7);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) rememberedValue4;
        Updater.LaunchedEffect(gapComposer, flow, new AndroidSecureStore$read$2(flow, (Continuation) null, this, mutableSharedFlow, collectAsState, 25));
        boolean changedInstance2 = gapComposer.changedInstance(mutableSharedFlow) | gapComposer.changedInstance(this);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue5 == neverEqualPolicy) {
            mutableState = mutableState2;
            PasscodePresenter$models$1$2 passcodePresenter$models$1$2 = new PasscodePresenter$models$1$2(mutableSharedFlow, this, mutableState, continuation, 19);
            gapComposer.updateRememberedValue(passcodePresenter$models$1$2);
            rememberedValue5 = passcodePresenter$models$1$2;
        } else {
            mutableState = mutableState2;
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue5);
        ReferralCodeViewModel referralCodeViewModel = (ReferralCodeViewModel) mutableState.getValue();
        gapComposer.end(false);
        return referralCodeViewModel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r6.referralManager.refresh(true, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onAppliedCodeValid(ApplyRewardCodeResponse applyRewardCodeResponse, ContinuationImpl continuationImpl) {
        ReferralCodePresenter$onAppliedCodeValid$1 referralCodePresenter$onAppliedCodeValid$1;
        int i;
        if (continuationImpl instanceof ReferralCodePresenter$onAppliedCodeValid$1) {
            referralCodePresenter$onAppliedCodeValid$1 = (ReferralCodePresenter$onAppliedCodeValid$1) continuationImpl;
            int i2 = referralCodePresenter$onAppliedCodeValid$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                referralCodePresenter$onAppliedCodeValid$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = referralCodePresenter$onAppliedCodeValid$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = referralCodePresenter$onAppliedCodeValid$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    referralCodePresenter$onAppliedCodeValid$1.L$0 = applyRewardCodeResponse;
                    referralCodePresenter$onAppliedCodeValid$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        this.profileSyncState.lastAttemptedRefresh = 0L;
                        this.navigator.goTo((Screen) obj);
                        return InternalUpdate.RewardCodeApplySucceeded.INSTANCE;
                    }
                    applyRewardCodeResponse = referralCodePresenter$onAppliedCodeValid$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                ResponseContext responseContext = applyRewardCodeResponse.response_context;
                responseContext.getClass();
                referralCodePresenter$onAppliedCodeValid$1.L$0 = null;
                referralCodePresenter$onAppliedCodeValid$1.label = 2;
                obj = onCompleteGetNextScreen(responseContext, referralCodePresenter$onAppliedCodeValid$1);
            }
        }
        referralCodePresenter$onAppliedCodeValid$1 = new ReferralCodePresenter$onAppliedCodeValid$1(this, continuationImpl);
        Object obj3 = referralCodePresenter$onAppliedCodeValid$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = referralCodePresenter$onAppliedCodeValid$1.label;
        if (i != 0) {
        }
        ResponseContext responseContext2 = applyRewardCodeResponse.response_context;
        responseContext2.getClass();
        referralCodePresenter$onAppliedCodeValid$1.L$0 = null;
        referralCodePresenter$onAppliedCodeValid$1.label = 2;
        obj3 = onCompleteGetNextScreen(responseContext2, referralCodePresenter$onAppliedCodeValid$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onCompleteGetNextScreen(ResponseContext responseContext, ContinuationImpl continuationImpl) {
        ReferralCodePresenter$onCompleteGetNextScreen$1 referralCodePresenter$onCompleteGetNextScreen$1;
        int i;
        BlockersData.AnalyticsData.Source source;
        BlockersScreens.ReferralCodeScreen referralCodeScreen = this.args;
        BlockersData blockersData = referralCodeScreen.blockersData;
        if (continuationImpl instanceof ReferralCodePresenter$onCompleteGetNextScreen$1) {
            referralCodePresenter$onCompleteGetNextScreen$1 = (ReferralCodePresenter$onCompleteGetNextScreen$1) continuationImpl;
            int i2 = referralCodePresenter$onCompleteGetNextScreen$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                referralCodePresenter$onCompleteGetNextScreen$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = referralCodePresenter$onCompleteGetNextScreen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = referralCodePresenter$onCompleteGetNextScreen$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ClientScenario clientScenario = blockersData.clientScenario;
                    String name = clientScenario != null ? clientScenario.name() : null;
                    Long l = new Long(this.clock.millis() - this.subscriptionTime);
                    String str = blockersData.flowToken;
                    String name2 = blockersData.ratePlan.name();
                    BlockersData.AnalyticsData analyticsData = blockersData.analyticsData;
                    this.analytics.track(new ReferralRewardReceiveComplete(l, name, str, name2, (analyticsData == null || (source = analyticsData.source) == null) ? null : source.getAnalyticsName()), null);
                    if (blockersData.flow == BlockersData.Flow.ONBOARDING) {
                        return this.blockersNavigator.getNext(referralCodeScreen, blockersData.updateFromResponseContext(responseContext, false));
                    }
                    FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 rewardStatus = this.referralManager.rewardStatus();
                    referralCodePresenter$onCompleteGetNextScreen$1.label = 1;
                    obj = FlowKt.first(rewardStatus, referralCodePresenter$onCompleteGetNextScreen$1);
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
                ReferralManager$RewardStatus referralManager$RewardStatus = (ReferralManager$RewardStatus) obj;
                return new ProfileScreens.ReferralStatusScreen(new ReferralStatusPresentationArgs$RewardInfo(referralManager$RewardStatus.available_reward_payments, referralManager$RewardStatus.completed_reward_payments, referralManager$RewardStatus.reward_payment_amount, referralManager$RewardStatus.expiration, referralManager$RewardStatus.reward_header_text, referralManager$RewardStatus.reward_main_text));
            }
        }
        referralCodePresenter$onCompleteGetNextScreen$1 = new ReferralCodePresenter$onCompleteGetNextScreen$1(this, continuationImpl);
        Object obj2 = referralCodePresenter$onCompleteGetNextScreen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = referralCodePresenter$onCompleteGetNextScreen$1.label;
        if (i != 0) {
        }
        ReferralManager$RewardStatus referralManager$RewardStatus2 = (ReferralManager$RewardStatus) obj2;
        return new ProfileScreens.ReferralStatusScreen(new ReferralStatusPresentationArgs$RewardInfo(referralManager$RewardStatus2.available_reward_payments, referralManager$RewardStatus2.completed_reward_payments, referralManager$RewardStatus2.reward_payment_amount, referralManager$RewardStatus2.expiration, referralManager$RewardStatus2.reward_header_text, referralManager$RewardStatus2.reward_main_text));
    }
}
