package com.squareup.cash.blockers.presenters;

import android.os.Parcelable;
import androidx.glance.session.SessionWorker$doWork$2$2;
import androidx.media3.common.FlagSet;
import androidx.paging.MulticastedPagingData$asPagingData$2;
import app.cash.broadway.screen.Screen;
import app.cash.passcode.backend.RealAppLockState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.mlkit.vision.common.zzb;
import com.squareup.cash.biometrics.AndroidBiometricsStore;
import com.squareup.cash.biometrics.CashBiometricsInfo;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.PasscodeGatedEndpoint;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.PasscodeViewEvent;
import com.squareup.cash.cdf.account.AccountAuthenticateComplete;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.janus.api.PasscodeService;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.common.ResponseContext;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.Duration;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class PasscodeGenericGatedEndpointTypeTransformer implements PasscodeTypedTransformer {
    public final Analytics analytics;
    public final RealAppLockState appLockState;
    public final PasscodeService appService;
    public final BlockersScreens.PasscodeScreen args;
    public int attemptCount;
    public final AndroidBiometricsStore biometricsStore;
    public final SessionWorker$doWork$2$2 biometricsToken;
    public final BlockersDataNavigator blockersDataNavigator;
    public final AndroidClock clock;
    public final AppService franklinAppService;
    public boolean navigatedAway;
    public final BetterNavigator.ScreenNavigator navigator;
    public final PasscodeGatedEndpoint passcodeGatedEndpoint;
    public Duration startPasscodeInput;
    public final AndroidStringManager stringManager;
    public final String verificationInstrumentToken;

    public PasscodeGenericGatedEndpointTypeTransformer(AndroidStringManager androidStringManager, PasscodeService passcodeService, AppService appService, AndroidBiometricsStore androidBiometricsStore, BlockersDataNavigator blockersDataNavigator, RealAppLockState realAppLockState, Analytics analytics, AndroidClock androidClock, CashBiometricsInfo cashBiometricsInfo, BlockersScreens.PasscodeScreen passcodeScreen, BetterNavigator.ScreenNavigator screenNavigator, SessionWorker$doWork$2$2 sessionWorker$doWork$2$2, RealSessionFlags realSessionFlags) {
        PasscodeGatedEndpoint builder;
        BlockersScreens.PasscodeScreen.Type type2 = passcodeScreen.f1062type;
        type2.getClass();
        int ordinal = type2.ordinal();
        int i = 10;
        if (ordinal == 2) {
            builder = new FlagSet.Builder((Object) cashBiometricsInfo, true, i);
        } else if (ordinal == 3) {
            builder = new FlagSet.Builder((Object) cashBiometricsInfo, false, i);
        } else {
            if (ordinal != 4) {
                OptionalProvider$$ExternalSyntheticLambda0.m((Object) type2, "unsupported endpoint call type: ");
                throw null;
            }
            builder = new zzb(cashBiometricsInfo);
        }
        this.stringManager = androidStringManager;
        this.appService = passcodeService;
        this.franklinAppService = appService;
        this.biometricsStore = androidBiometricsStore;
        this.blockersDataNavigator = blockersDataNavigator;
        this.appLockState = realAppLockState;
        this.analytics = analytics;
        this.clock = androidClock;
        this.passcodeGatedEndpoint = builder;
        this.args = passcodeScreen;
        this.navigator = screenNavigator;
        this.biometricsToken = sessionWorker$doWork$2$2;
        this.verificationInstrumentToken = passcodeScreen.verificationInstrumentToken;
    }

    public static final void access$handleError(PasscodeGenericGatedEndpointTypeTransformer passcodeGenericGatedEndpointTypeTransformer, ResponseContext responseContext, String str, int i) {
        BlockersScreens.PasscodeScreen passcodeScreen = passcodeGenericGatedEndpointTypeTransformer.args;
        BlockersData blockersData = passcodeScreen.blockersData;
        responseContext.getClass();
        Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
        BlockersData updateFromResponseContext = blockersData.updateFromResponseContext(responseContext, false);
        Screen next = passcodeGenericGatedEndpointTypeTransformer.blockersDataNavigator.getNext(passcodeScreen, updateFromResponseContext);
        String str2 = responseContext.dialog_message;
        passcodeGenericGatedEndpointTypeTransformer.completeAuthentication(new BlockersScreens.SuccessMessageScreen(updateFromResponseContext, next, str2 == null ? str : str2, null, 8), i, AccountAuthenticateComplete.AuthenticationResult.FAILURE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleSuccess(PasscodeGenericGatedEndpointTypeTransformer passcodeGenericGatedEndpointTypeTransformer, PasscodeViewEvent.VerifyPasscode verifyPasscode, PasscodeGatedEndpoint.Response.Success success, int i, ContinuationImpl continuationImpl) {
        PasscodeGenericGatedEndpointTypeTransformer$handleSuccess$1 passcodeGenericGatedEndpointTypeTransformer$handleSuccess$1;
        int i2;
        if (continuationImpl instanceof PasscodeGenericGatedEndpointTypeTransformer$handleSuccess$1) {
            passcodeGenericGatedEndpointTypeTransformer$handleSuccess$1 = (PasscodeGenericGatedEndpointTypeTransformer$handleSuccess$1) continuationImpl;
            int i3 = passcodeGenericGatedEndpointTypeTransformer$handleSuccess$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                passcodeGenericGatedEndpointTypeTransformer$handleSuccess$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = passcodeGenericGatedEndpointTypeTransformer$handleSuccess$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = passcodeGenericGatedEndpointTypeTransformer$handleSuccess$1.label;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    passcodeGenericGatedEndpointTypeTransformer.appLockState.sendEvent(RealAppLockState.AppLockEvent.AppUnlocked.INSTANCE);
                    String str = passcodeGenericGatedEndpointTypeTransformer.verificationInstrumentToken;
                    if ((verifyPasscode instanceof PasscodeViewEvent.VerifyPasscode.WithoutFingerprint) && str != null) {
                        AndroidBiometricsStore androidBiometricsStore = passcodeGenericGatedEndpointTypeTransformer.biometricsStore;
                        String str2 = success.token;
                        passcodeGenericGatedEndpointTypeTransformer$handleSuccess$1.L$1 = success;
                        passcodeGenericGatedEndpointTypeTransformer$handleSuccess$1.I$0 = i;
                        passcodeGenericGatedEndpointTypeTransformer$handleSuccess$1.label = 1;
                        if (androidBiometricsStore.write(str, str2, passcodeGenericGatedEndpointTypeTransformer$handleSuccess$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = passcodeGenericGatedEndpointTypeTransformer$handleSuccess$1.I$0;
                    PasscodeGatedEndpoint.Response.Success success2 = passcodeGenericGatedEndpointTypeTransformer$handleSuccess$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                    success = success2;
                }
                BlockersDataNavigator blockersDataNavigator = passcodeGenericGatedEndpointTypeTransformer.blockersDataNavigator;
                BlockersScreens.PasscodeScreen passcodeScreen = passcodeGenericGatedEndpointTypeTransformer.args;
                BlockersData blockersData = passcodeScreen.blockersData;
                ResponseContext responseContext = success.responseContext;
                responseContext.getClass();
                Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                passcodeGenericGatedEndpointTypeTransformer.completeAuthentication(blockersDataNavigator.getNext(passcodeScreen, blockersData.updateFromResponseContext(responseContext, false)), i, AccountAuthenticateComplete.AuthenticationResult.SUCCESS);
                return Unit.INSTANCE;
            }
        }
        passcodeGenericGatedEndpointTypeTransformer$handleSuccess$1 = new PasscodeGenericGatedEndpointTypeTransformer$handleSuccess$1(passcodeGenericGatedEndpointTypeTransformer, continuationImpl);
        Object obj2 = passcodeGenericGatedEndpointTypeTransformer$handleSuccess$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = passcodeGenericGatedEndpointTypeTransformer$handleSuccess$1.label;
        if (i2 != 0) {
        }
        BlockersDataNavigator blockersDataNavigator2 = passcodeGenericGatedEndpointTypeTransformer.blockersDataNavigator;
        BlockersScreens.PasscodeScreen passcodeScreen2 = passcodeGenericGatedEndpointTypeTransformer.args;
        BlockersData blockersData2 = passcodeScreen2.blockersData;
        ResponseContext responseContext2 = success.responseContext;
        responseContext2.getClass();
        Parcelable.Creator<BlockersData> creator2 = BlockersData.CREATOR;
        passcodeGenericGatedEndpointTypeTransformer.completeAuthentication(blockersDataNavigator2.getNext(passcodeScreen2, blockersData2.updateFromResponseContext(responseContext2, false)), i, AccountAuthenticateComplete.AuthenticationResult.SUCCESS);
        return Unit.INSTANCE;
    }

    public final void completeAuthentication(Screen screen, int i, AccountAuthenticateComplete.AuthenticationResult authenticationResult) {
        BlockersScreens.PasscodeScreen passcodeScreen = this.args;
        ClientScenario clientScenario = passcodeScreen.blockersData.clientScenario;
        this.analytics.track(new AccountAuthenticateComplete(clientScenario != null ? clientScenario.name() : null, passcodeScreen.blockersData.flowToken, authenticationResult, Integer.valueOf(i)), null);
        this.navigator.goTo(screen);
    }

    @Override // com.squareup.cash.blockers.presenters.PasscodeTypedTransformer
    public final Flow transform(Flow flow) {
        Continuation continuation = null;
        int i = 4;
        return new FlowKt__MergeKt$flatMapMerge$$inlined$map$1(i, FlowKt.channelFlow(new PasscodePresenter$models$1$2(this, flow, continuation, 10)), new MulticastedPagingData$asPagingData$2(this, continuation, i));
    }
}
