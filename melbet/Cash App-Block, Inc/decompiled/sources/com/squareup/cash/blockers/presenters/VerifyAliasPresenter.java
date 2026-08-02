package com.squareup.cash.blockers.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.core.text.TextUtilsCompat;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda3;
import com.squareup.cash.attribution.deeplink.DeepLink;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.bitcoin.views.send.MoveBitcoinViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.VerifyAliasModel;
import com.squareup.cash.blockers.views.LabelValueView$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.views.PlaidLinkView;
import com.squareup.cash.blockers.views.SetNameViewKt$SetName$2$1;
import com.squareup.cash.boost.backend.RealBoostSelector$removeBoost$1;
import com.squareup.cash.cdf.AliasType;
import com.squareup.cash.cdf.alias.AliasRegisterComplete;
import com.squareup.cash.cdf.alias.AliasRegisterReceiveError;
import com.squareup.cash.cdf.alias.AliasRegisterStart;
import com.squareup.cash.cdf.alias.AliasVerifyComplete;
import com.squareup.cash.cdf.alias.AliasVerifyReceiveError;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.views.MoneyTabUIKt$MoneyTabLoaded$1$1;
import com.squareup.cash.onboarding.backend.RealOnboardingFlowTokenManager;
import com.squareup.cash.onboarding.util.AliasRegistrar$Args;
import com.squareup.cash.onboarding.util.AliasRegistrar$Result;
import com.squareup.cash.onboarding.util.AliasVerifier$Args;
import com.squareup.cash.onboarding.util.AliasVerifier$Result;
import com.squareup.cash.onboarding.util.RealAliasRegistrar;
import com.squareup.cash.overlays.OverlayKt;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import com.squareup.cash.validation.RealPendingEmailVerification;
import com.squareup.preferences.StringPreference;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.ScenarioInitiatorType;
import com.squareup.util.android.PhoneNumbers;
import com.squareup.util.cash.Regions;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class VerifyAliasPresenter implements MoleculePresenter {
    public final CoroutineScope activityScope;
    public final RealAliasRegistrar aliasRegistrar;
    public final ToolbarTuckTargets aliasVerifier;
    public final Analytics analytics;
    public final BlockersScreens.VerifyAliasScreen args;
    public final BlockerFlowListener blockerFlowAnalytics;
    public final RealBlockersHelper blockersHelper;
    public final BlockersDataNavigator blockersNavigator;
    public final SharedFlow deferredDeepLinkState;
    public final FlowStarter flowStarter;
    public final State initialState;
    public final CoroutineContext ioContext;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealOnboardingFlowTokenManager onboardingFlowTokenManager;
    public final StringPreference pendingEmailPreference;
    public final RealPendingEmailVerification pendingEmailVerification;
    public final int resendCodeButtonDelaySeconds;
    public final Signal signOut;
    public final AndroidStringManager stringManager;
    public final RealSupportNavigator supportNavigator;
    public final UserJourneyTracker userJourneyTracker;

    public final class State {
        public final boolean clearInput;
        public final boolean isLoading;
        public final int remainingSecondsToEnableResendCodeButton;
        public final boolean resendCodeButtonEnabled;
        public final String title;
        public final String verificationCode;

        public State(int i, String str, String str2, boolean z, boolean z2, boolean z3) {
            str.getClass();
            this.title = str;
            this.isLoading = z;
            this.clearInput = z2;
            this.verificationCode = str2;
            this.resendCodeButtonEnabled = z3;
            this.remainingSecondsToEnableResendCodeButton = i;
        }

        public static State copy$default(State state, String str, boolean z, boolean z2, String str2, boolean z3, int i, int i2) {
            if ((i2 & 1) != 0) {
                str = state.title;
            }
            String str3 = str;
            if ((i2 & 2) != 0) {
                z = state.isLoading;
            }
            boolean z4 = z;
            if ((i2 & 4) != 0) {
                z2 = state.clearInput;
            }
            boolean z5 = z2;
            if ((i2 & 8) != 0) {
                str2 = state.verificationCode;
            }
            String str4 = str2;
            if ((i2 & 16) != 0) {
                z3 = state.resendCodeButtonEnabled;
            }
            boolean z6 = z3;
            if ((i2 & 32) != 0) {
                i = state.remainingSecondsToEnableResendCodeButton;
            }
            state.getClass();
            str3.getClass();
            str4.getClass();
            return new State(i, str3, str4, z4, z5, z6);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.areEqual(this.title, state.title) && this.isLoading == state.isLoading && this.clearInput == state.clearInput && this.verificationCode.equals(state.verificationCode) && this.resendCodeButtonEnabled == state.resendCodeButtonEnabled && this.remainingSecondsToEnableResendCodeButton == state.remainingSecondsToEnableResendCodeButton;
        }

        public final int hashCode() {
            return Integer.hashCode(this.remainingSecondsToEnableResendCodeButton) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.isLoading), 31, this.clearInput), 31, this.verificationCode), 31, this.resendCodeButtonEnabled);
        }

        public final String toString() {
            StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("State(title=", this.title, ", isLoading=", ", clearInput=", this.isLoading);
            NavAction$$ExternalSyntheticOutline0.m(m1540m, this.clearInput, ", verificationCode=", this.verificationCode, ", resendCodeButtonEnabled=");
            m1540m.append(this.resendCodeButtonEnabled);
            m1540m.append(", remainingSecondsToEnableResendCodeButton=");
            m1540m.append(this.remainingSecondsToEnableResendCodeButton);
            m1540m.append(")");
            return m1540m.toString();
        }
    }

    public VerifyAliasPresenter(AndroidStringManager androidStringManager, Analytics analytics, BlockerFlowListener blockerFlowListener, BlockersDataNavigator blockersDataNavigator, FlowStarter flowStarter, ToolbarTuckTargets toolbarTuckTargets, RealAliasRegistrar realAliasRegistrar, RealOnboardingFlowTokenManager realOnboardingFlowTokenManager, UserJourneyTracker userJourneyTracker, RealSupportNavigator realSupportNavigator, SharedFlow sharedFlow, StringPreference stringPreference, RealPendingEmailVerification realPendingEmailVerification, Signal signal, long j, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, BlockersScreens.VerifyAliasScreen verifyAliasScreen, BetterNavigator.ScreenNavigator screenNavigator, CoroutineContext coroutineContext, CoroutineScope coroutineScope) {
        Resources resources = androidStringManager.resources;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.blockerFlowAnalytics = blockerFlowListener;
        this.blockersNavigator = blockersDataNavigator;
        this.flowStarter = flowStarter;
        this.aliasVerifier = toolbarTuckTargets;
        this.aliasRegistrar = realAliasRegistrar;
        this.onboardingFlowTokenManager = realOnboardingFlowTokenManager;
        this.userJourneyTracker = userJourneyTracker;
        this.supportNavigator = realSupportNavigator;
        this.deferredDeepLinkState = sharedFlow;
        this.pendingEmailPreference = stringPreference;
        this.pendingEmailVerification = realPendingEmailVerification;
        this.signOut = signal;
        this.args = verifyAliasScreen;
        this.navigator = screenNavigator;
        this.ioContext = coroutineContext;
        this.activityScope = coroutineScope;
        Duration.Companion companion = Duration.Companion;
        int m4176toLongimpl = (int) Duration.m4176toLongimpl(j, DurationUnit.SECONDS);
        this.resendCodeButtonDelaySeconds = m4176toLongimpl;
        Redacted redacted = verifyAliasScreen.mainText;
        Redacted redacted2 = verifyAliasScreen.alias;
        String str = (String) redacted.getValue();
        if (str == null) {
            int ordinal = verifyAliasScreen.aliasType.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    throw null;
                }
                String format2 = PhoneNumbers.format((String) redacted2.getValue(), Regions.toCountry(verifyAliasScreen.blockersData.region).name(), null);
                format2 = format2 == null ? "null" : format2;
                resources.getClass();
                str = new MessageFormat(resources.getString(R.string.blockers_verify_title)).format(new Object[]{format2});
                str.getClass();
            } else if (StringsKt.isBlank((CharSequence) redacted2.getValue())) {
                str = androidStringManager.get(R.string.blockers_verify_title_unknown_email);
            } else {
                Object value = redacted2.getValue();
                value.getClass();
                resources.getClass();
                str = new MessageFormat(resources.getString(R.string.blockers_verify_title)).format(new Object[]{value});
                str.getClass();
            }
        }
        this.initialState = new State(m4176toLongimpl, str, "", false, false, false);
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(screenNavigator);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$verify(VerifyAliasPresenter verifyAliasPresenter, String str, Function1 function1, Continuation continuation) {
        VerifyAliasPresenter$verify$1 verifyAliasPresenter$verify$1;
        int i;
        AliasVerifier$Args.AliasType aliasType;
        AliasVerifier$Result aliasVerifier$Result;
        AliasVerifyReceiveError.ErrorType errorType;
        String str2;
        int i2;
        int i3;
        Function1 function12 = function1;
        BetterNavigator.ScreenNavigator screenNavigator = verifyAliasPresenter.navigator;
        AndroidStringManager androidStringManager = verifyAliasPresenter.stringManager;
        Analytics analytics = verifyAliasPresenter.analytics;
        BlockersScreens.VerifyAliasScreen verifyAliasScreen = verifyAliasPresenter.args;
        BlockersData blockersData = verifyAliasScreen.blockersData;
        BlockersScreens.VerifyAliasScreen.AliasType aliasType2 = verifyAliasScreen.aliasType;
        if (continuation instanceof VerifyAliasPresenter$verify$1) {
            verifyAliasPresenter$verify$1 = (VerifyAliasPresenter$verify$1) continuation;
            int i4 = verifyAliasPresenter$verify$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                verifyAliasPresenter$verify$1.label = i4 - PKIFailureInfo.systemUnavail;
                Object obj = verifyAliasPresenter$verify$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verifyAliasPresenter$verify$1.label;
                int i5 = 0;
                Continuation continuation2 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str3 = (String) verifyAliasScreen.alias.getValue();
                    int ordinal = aliasType2.ordinal();
                    if (ordinal == 0) {
                        aliasType = AliasVerifier$Args.AliasType.EMAIL;
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        aliasType = AliasVerifier$Args.AliasType.SMS;
                    }
                    AliasVerifier$Args.AliasType aliasType3 = aliasType;
                    DeepLink deepLink = (DeepLink) CollectionsKt.firstOrNull(verifyAliasPresenter.deferredDeepLinkState.getReplayCache());
                    AliasVerifier$Args aliasVerifier$Args = new AliasVerifier$Args(str3, aliasType3, str, deepLink != null ? RequestContext.copy$default(blockersData.requestContext, null, null, null, null, null, null, null, null, ScenarioInitiatorType.EXTERNAL, deepLink.deepLink, null, null, 6655) : blockersData.requestContext, blockersData.clientScenario, blockersData.flowToken);
                    function12.invoke(new MoveBitcoinViewKt$$ExternalSyntheticLambda3(29));
                    Signal signal = verifyAliasPresenter.signOut;
                    VerifyAliasPresenter$verify$result$1 verifyAliasPresenter$verify$result$1 = new VerifyAliasPresenter$verify$result$1(verifyAliasPresenter, aliasVerifier$Args, continuation2, i5);
                    verifyAliasPresenter$verify$1.L$1 = function12;
                    verifyAliasPresenter$verify$1.label = 1;
                    obj = StateFlowKt.until(signal, verifyAliasPresenter$verify$result$1, verifyAliasPresenter$verify$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function12 = verifyAliasPresenter$verify$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                aliasVerifier$Result = (AliasVerifier$Result) obj;
                int i6 = 3;
                if (!(aliasVerifier$Result instanceof AliasVerifier$Result.Successful)) {
                    Timber.Forest.d(aliasType2 + " verified", new Object[0]);
                    analytics.track(new AliasVerifyComplete(OverlayKt.access$toCdfAliasType(aliasType2), false, blockersData.flowToken), null);
                    JobKt.launch$default(verifyAliasPresenter.activityScope, verifyAliasPresenter.ioContext, null, new PlaidLinkView.AnonymousClass2(verifyAliasPresenter, (AliasVerifier$Result.Successful) aliasVerifier$Result, continuation2, i6), 2);
                } else if (aliasVerifier$Result instanceof AliasVerifier$Result.NotSuccessful) {
                    AliasVerifier$Result.NotSuccessful notSuccessful = (AliasVerifier$Result.NotSuccessful) aliasVerifier$Result;
                    AliasVerifier$Result.NotSuccessful.Status status = notSuccessful.status;
                    AliasType access$toCdfAliasType = OverlayKt.access$toCdfAliasType(aliasType2);
                    String str4 = notSuccessful.failureMessage;
                    int ordinal2 = status.ordinal();
                    if (ordinal2 == 0) {
                        errorType = AliasVerifyReceiveError.ErrorType.INVALID_ALIAS;
                    } else if (ordinal2 == 1) {
                        errorType = AliasVerifyReceiveError.ErrorType.INVALID_VERIFICATION_CODE;
                    } else if (ordinal2 == 2) {
                        errorType = AliasVerifyReceiveError.ErrorType.EXPIRED_CODE;
                    } else if (ordinal2 == 3) {
                        errorType = AliasVerifyReceiveError.ErrorType.TOO_MANY_FAILED_ATTEMPTS;
                    } else {
                        if (ordinal2 != 4) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        errorType = AliasVerifyReceiveError.ErrorType.NOT_ELIGIBLE;
                    }
                    analytics.track(new AliasVerifyReceiveError(access$toCdfAliasType, errorType, blockersData.flowToken), null);
                    ResponseContext responseContext = notSuccessful.responseContext;
                    if (responseContext == null || (str2 = responseContext.dialog_message) == null || str2.length() <= 0) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        function12.invoke(new LabelValueView$$ExternalSyntheticLambda0(7));
                        screenNavigator.goTo(new BlockersScreens.SuccessMessageScreen(blockersData.updateFromResponseContext(responseContext, false), verifyAliasScreen, str2, responseContext.dialog_title));
                    } else {
                        int ordinal3 = status.ordinal();
                        if (ordinal3 == 0) {
                            Timber.Forest.e("Failed to verify. Invalid " + aliasType2 + ".", new Object[0]);
                            function12.invoke(new LabelValueView$$ExternalSyntheticLambda0(1));
                            screenNavigator.goTo(Back.INSTANCE);
                        } else if (ordinal3 == 1) {
                            Timber.Forest.e("Invalid verification code.", new Object[0]);
                            int ordinal4 = aliasType2.ordinal();
                            if (ordinal4 != 0) {
                                i2 = 1;
                                if (ordinal4 != 1) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                i3 = R.string.blockers_verify_sms_error_invalid;
                            } else {
                                i2 = 1;
                                i3 = R.string.blockers_verify_email_error_invalid;
                            }
                            function12.invoke(new VerifyAliasPresenter$$ExternalSyntheticLambda3(verifyAliasPresenter, androidStringManager.get(i3), i2));
                        } else if (ordinal3 == 2) {
                            function12.invoke(new VerifyAliasPresenter$$ExternalSyntheticLambda3(verifyAliasPresenter, androidStringManager.get(R.string.blockers_verify_error_expired), 2));
                        } else if (ordinal3 == 3) {
                            Timber.Forest.e("Failed to verify " + aliasType2 + ". Too many attempts.", new Object[0]);
                            function12.invoke(new LabelValueView$$ExternalSyntheticLambda0(2));
                            if (str4 == null) {
                                int ordinal5 = aliasType2.ordinal();
                                if (ordinal5 == 0) {
                                    str4 = androidStringManager.get(R.string.blockers_verify_email_error_too_many);
                                } else {
                                    if (ordinal5 != 1) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    str4 = androidStringManager.get(R.string.blockers_verify_sms_error_too_many);
                                }
                            }
                            responseContext.getClass();
                            screenNavigator.goTo(new BlockersScreens.VerifyErrorScreen(blockersData.updateFromResponseContext(responseContext, false), str4));
                        } else {
                            if (ordinal3 != 4) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            Timber.Forest.e("Not eligible for merge.", new Object[0]);
                            screenNavigator.goTo(new BlockersScreens.IneligibleMergeScreen(blockersData, str4));
                        }
                    }
                } else if (aliasVerifier$Result instanceof AliasVerifier$Result.NetworkFailure) {
                    Timber.Forest.e("Failed to verify " + aliasType2 + ".", new Object[0]);
                    analytics.track(new AliasVerifyReceiveError(OverlayKt.access$toCdfAliasType(aliasType2), AliasVerifyReceiveError.ErrorType.FAILURE, blockersData.flowToken), null);
                    function12.invoke(new LabelValueView$$ExternalSyntheticLambda0(6));
                    screenNavigator.goTo(new FailureMessageBlockerScreen(blockersData, TextUtilsCompat.errorMessaging(androidStringManager, ((AliasVerifier$Result.NetworkFailure) aliasVerifier$Result).failure, null).message, null, 4));
                }
                return Unit.INSTANCE;
            }
        }
        verifyAliasPresenter$verify$1 = new VerifyAliasPresenter$verify$1(verifyAliasPresenter, continuation);
        Object obj2 = verifyAliasPresenter$verify$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verifyAliasPresenter$verify$1.label;
        int i52 = 0;
        Continuation continuation22 = null;
        if (i != 0) {
        }
        aliasVerifier$Result = (AliasVerifier$Result) obj2;
        int i62 = 3;
        if (!(aliasVerifier$Result instanceof AliasVerifier$Result.Successful)) {
        }
        return Unit.INSTANCE;
    }

    public final void exitAfterVerificationFailed() {
        BlockersData blockersData = this.args.blockersData;
        BlockersData.Flow flow = blockersData.flow;
        BlockersData.Flow flow2 = BlockersData.Flow.ONBOARDING;
        BetterNavigator.ScreenNavigator screenNavigator = this.navigator;
        if (flow == flow2) {
            screenNavigator.goTo(((RealFlowStarter) this.flowStarter).signOut());
        } else {
            this.blockerFlowAnalytics.onFlowCancelled(blockersData);
            screenNavigator.goTo(blockersData.exitScreen);
        }
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(826603502);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(this.initialState);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new SetNameViewKt$SetName$2$1(this, mutableState, continuation, 17);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
        Boolean valueOf = Boolean.valueOf(((State) mutableState.getValue()).resendCodeButtonEnabled);
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new MoneyTabUIKt$MoneyTabLoaded$1$1(this, mutableState, (Continuation) null);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue3);
        Updater.LaunchedEffect(gapComposer, flow, new RealBoostSelector$removeBoost$1(flow, continuation, this, mutableState, 6));
        BlockersScreens.VerifyAliasScreen verifyAliasScreen = this.args;
        VerifyAliasModel verifyAliasModel = new VerifyAliasModel(verifyAliasScreen.headline, ((State) mutableState.getValue()).title, ((State) mutableState.getValue()).isLoading, ((State) mutableState.getValue()).clearInput, ((State) mutableState.getValue()).verificationCode, verifyAliasScreen.dismissAction != null ? VerifyAliasModel.NavigationButton.CLOSE : verifyAliasScreen.blockersData.clientScenario == ClientScenario.RETURNING_CUSTOMER_LOGIN ? VerifyAliasModel.NavigationButton.BACK : VerifyAliasModel.NavigationButton.NONE, ((State) mutableState.getValue()).resendCodeButtonEnabled ? VerifyAliasModel.ResendCodeButtonState.Enabled.INSTANCE : new VerifyAliasModel.ResendCodeButtonState.Disabled(((State) mutableState.getValue()).remainingSecondsToEnableResendCodeButton));
        gapComposer.end(false);
        return verifyAliasModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object reregister(AliasRegistrar$Args.DeliveryMechanism deliveryMechanism, Function1 function1, ContinuationImpl continuationImpl) {
        VerifyAliasPresenter$reregister$1 verifyAliasPresenter$reregister$1;
        int i;
        AliasRegistrar$Args.DeliveryMechanism deliveryMechanism2;
        boolean z;
        AliasRegisterReceiveError.ErrorType errorType;
        String str;
        int i2;
        String str2;
        Function1 function12 = function1;
        BlockersScreens.VerifyAliasScreen verifyAliasScreen = this.args;
        Redacted redacted = verifyAliasScreen.alias;
        BlockersData blockersData = verifyAliasScreen.blockersData;
        if (continuationImpl instanceof VerifyAliasPresenter$reregister$1) {
            verifyAliasPresenter$reregister$1 = (VerifyAliasPresenter$reregister$1) continuationImpl;
            int i3 = verifyAliasPresenter$reregister$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                verifyAliasPresenter$reregister$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = verifyAliasPresenter$reregister$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verifyAliasPresenter$reregister$1.label;
                int i4 = 3;
                Analytics analytics = this.analytics;
                String str3 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AliasRegistrar$Args aliasRegistrar$Args = new AliasRegistrar$Args((String) redacted.getValue(), deliveryMechanism, blockersData.requestContext, blockersData.clientScenario, blockersData.flowToken, false, null, 96);
                    analytics.track(new AliasRegisterStart(OverlayKt.access$toAliasType(deliveryMechanism), blockersData.flowToken, Boolean.TRUE, null), null);
                    function12.invoke(new LabelValueView$$ExternalSyntheticLambda0(i4));
                    deliveryMechanism2 = deliveryMechanism;
                    verifyAliasPresenter$reregister$1.L$0 = deliveryMechanism2;
                    verifyAliasPresenter$reregister$1.L$1 = function12;
                    verifyAliasPresenter$reregister$1.label = 1;
                    obj = this.aliasRegistrar.register(aliasRegistrar$Args, verifyAliasPresenter$reregister$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function12 = verifyAliasPresenter$reregister$1.L$1;
                    AliasRegistrar$Args.DeliveryMechanism deliveryMechanism3 = verifyAliasPresenter$reregister$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    deliveryMechanism2 = deliveryMechanism3;
                }
                AliasRegistrar$Result aliasRegistrar$Result = (AliasRegistrar$Result) obj;
                z = aliasRegistrar$Result instanceof AliasRegistrar$Result.Successful;
                AndroidStringManager androidStringManager = this.stringManager;
                int i5 = 0;
                if (z) {
                    boolean z2 = aliasRegistrar$Result instanceof AliasRegistrar$Result.NetworkFailure;
                    BetterNavigator.ScreenNavigator screenNavigator = this.navigator;
                    if (z2) {
                        Timber.Forest.e("Failed to re-register by " + deliveryMechanism2 + ".", new Object[0]);
                        analytics.track(new AliasRegisterReceiveError(OverlayKt.access$toAliasType(deliveryMechanism2), AliasRegisterReceiveError.ErrorType.FAILURE, blockersData.flowToken, Boolean.TRUE), null);
                        int i6 = 4;
                        function12.invoke(new LabelValueView$$ExternalSyntheticLambda0(i6));
                        screenNavigator.goTo(new FailureMessageBlockerScreen(blockersData, TextUtilsCompat.errorMessaging(androidStringManager, ((AliasRegistrar$Result.NetworkFailure) aliasRegistrar$Result).failure, null).message, str3, i6));
                    } else {
                        if (!(aliasRegistrar$Result instanceof AliasRegistrar$Result.NotSuccessful)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        AliasType access$toAliasType = OverlayKt.access$toAliasType(deliveryMechanism2);
                        AliasRegistrar$Result.NotSuccessful notSuccessful = (AliasRegistrar$Result.NotSuccessful) aliasRegistrar$Result;
                        AliasRegistrar$Result.NotSuccessful.Status status = notSuccessful.status;
                        int ordinal = status.ordinal();
                        if (ordinal == 0) {
                            errorType = AliasRegisterReceiveError.ErrorType.INVALID_ALIAS;
                        } else if (ordinal == 1) {
                            errorType = AliasRegisterReceiveError.ErrorType.TOO_MANY_REQUESTS;
                        } else {
                            if (ordinal != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            errorType = AliasRegisterReceiveError.ErrorType.DUPLICATE_ALIAS;
                        }
                        analytics.track(new AliasRegisterReceiveError(access$toAliasType, errorType, blockersData.flowToken, Boolean.TRUE), null);
                        ResponseContext responseContext = notSuccessful.responseContext;
                        if (responseContext == null || (str = responseContext.dialog_message) == null || str.length() <= 0) {
                            str = null;
                        }
                        if (str != null) {
                            function12.invoke(new LabelValueView$$ExternalSyntheticLambda0(5));
                            screenNavigator.goTo(new BlockersScreens.SuccessMessageScreen(blockersData.updateFromResponseContext(responseContext, false), verifyAliasScreen, str, responseContext.dialog_title));
                            return Unit.INSTANCE;
                        }
                        int ordinal2 = status.ordinal();
                        if (ordinal2 == 0) {
                            screenNavigator.goTo(Back.INSTANCE);
                        } else if (ordinal2 == 1) {
                            Timber.Forest.e("Failed to re-register. Too many requests.", new Object[0]);
                            String str4 = notSuccessful.failureMessage;
                            if (str4 == null) {
                                int ordinal3 = verifyAliasScreen.aliasType.ordinal();
                                if (ordinal3 == 0) {
                                    i2 = R.string.blockers_register_email_error_too_many;
                                } else {
                                    if (ordinal3 != 1) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    i2 = R.string.blockers_register_sms_error_too_many;
                                }
                                str4 = androidStringManager.get(i2);
                            }
                            function12.invoke(new VerifyAliasPresenter$$ExternalSyntheticLambda3(this, str4, 3));
                        } else {
                            if (ordinal2 != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            Timber.Forest.d("Failed to re-register. Duplicate alias.", new Object[0]);
                            int ordinal4 = deliveryMechanism2.ordinal();
                            if (ordinal4 != 0) {
                                if (ordinal4 == 1) {
                                    str2 = androidStringManager.get(R.string.blockers_register_email_error_duplicate);
                                    function12.invoke(new BadgeKt$$ExternalSyntheticLambda3(str2, 13));
                                } else if (ordinal4 != 2) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                            }
                            str2 = androidStringManager.get(R.string.blockers_register_sms_error_duplicate);
                            function12.invoke(new BadgeKt$$ExternalSyntheticLambda3(str2, 13));
                        }
                    }
                } else {
                    Timber.Forest.d("Alias re-registered.", new Object[0]);
                    analytics.track(new AliasRegisterComplete(OverlayKt.access$toAliasType(deliveryMechanism2), Boolean.TRUE, blockersData.flowToken), null);
                    int ordinal5 = deliveryMechanism2.ordinal();
                    if (ordinal5 == 0 || ordinal5 == 1) {
                        function12.invoke(new BadgeQueries$$ExternalSyntheticLambda5(this, 24));
                    } else {
                        if (ordinal5 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        String format2 = PhoneNumbers.format((String) redacted.getValue(), Regions.toCountry(blockersData.region).name(), null);
                        if (format2 == null) {
                            format2 = "null";
                        }
                        Resources resources = androidStringManager.resources;
                        resources.getClass();
                        String format3 = new MessageFormat(resources.getString(R.string.blockers_verify_title_call)).format(new Object[]{format2});
                        format3.getClass();
                        function12.invoke(new VerifyAliasPresenter$$ExternalSyntheticLambda3(this, format3, i5));
                    }
                }
                return Unit.INSTANCE;
            }
        }
        verifyAliasPresenter$reregister$1 = new VerifyAliasPresenter$reregister$1(this, continuationImpl);
        Object obj2 = verifyAliasPresenter$reregister$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verifyAliasPresenter$reregister$1.label;
        int i42 = 3;
        Analytics analytics2 = this.analytics;
        String str32 = null;
        if (i != 0) {
        }
        AliasRegistrar$Result aliasRegistrar$Result2 = (AliasRegistrar$Result) obj2;
        z = aliasRegistrar$Result2 instanceof AliasRegistrar$Result.Successful;
        AndroidStringManager androidStringManager2 = this.stringManager;
        int i52 = 0;
        if (z) {
        }
        return Unit.INSTANCE;
    }
}
