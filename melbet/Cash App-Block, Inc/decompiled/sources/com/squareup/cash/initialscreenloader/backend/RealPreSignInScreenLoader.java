package com.squareup.cash.initialscreenloader.backend;

import androidx.room.util.DBUtil;
import app.cash.api.ApiResult;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzlt;
import com.squareup.cash.appintro.screens.SponsorshipRequestContent;
import com.squareup.cash.appintro.screens.SponsorshipRequestReferralIntroScreen;
import com.squareup.cash.attribution.deeplink.DeepLink;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.onboarding.screens.OnboardingLandingScreen;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.protos.cash.usher.api.GetPreSignInDataRequest;
import com.squareup.protos.cash.usher.api.GetPreSignInDataResponse;
import com.squareup.protos.cash.usher.api.GetPreSignInDataResponse$IntroData$ContextualOnboardingIntroData;
import com.squareup.protos.cash.usher.api.GetPreSignInDataResponse$IntroData$InvitationIntroData;
import com.squareup.protos.cash.usher.api.GetPreSignInDataResponse$IntroData$StaffInvitationIntroData;
import com.squareup.protos.cash.usher.api.GetPreSignInDataResponse$InvitationIntroData$Content$SponsorSponsorshipRequestContent;
import com.squareup.protos.cash.usher.api.GetPreSignInDataResponse$InvitationIntroData$Content$TeenSponsorshipRequestContent;
import com.squareup.protos.cash.usher.api.UsherService;
import com.squareup.protos.franklin.api.ClientScenario;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.net.URI;
import java.util.Locale;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.SharedFlow;
import okio.ByteString;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealPreSignInScreenLoader {
    public static final Set VALID_REMOTE_URL_SCHEMES = ArraysKt___ArraysKt.toSet(new String[]{"http", "https"});
    public final SharedFlow deepLinkState;
    public final FlowStarter flowStarter;
    public final Locale locale;
    public final UsherService service;

    public RealPreSignInScreenLoader(FlowStarter flowStarter, UsherService usherService, SharedFlow sharedFlow, Locale locale) {
        this.flowStarter = flowStarter;
        this.service = usherService;
        this.deepLinkState = sharedFlow;
        this.locale = locale;
    }

    public static String validRemoteUrlOrNull(String str) {
        String obj;
        Object failure;
        String str2;
        String host;
        if (str == null || (obj = StringsKt.trim(str).toString()) == null) {
            return null;
        }
        if (obj.length() <= 0) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            failure = new URI(obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        URI uri = (URI) failure;
        if (uri == null) {
            return null;
        }
        String scheme = uri.getScheme();
        if (scheme != null) {
            Locale locale = Locale.US;
            str2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(locale, scheme, locale);
        } else {
            str2 = null;
        }
        if (!CollectionsKt.contains(VALID_REMOTE_URL_SCHEMES, str2) || (host = uri.getHost()) == null || StringsKt.isBlank(host)) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadPreSignInScreen(Function0 function0, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        RealPreSignInScreenLoader$loadPreSignInScreen$1 realPreSignInScreenLoader$loadPreSignInScreen$1;
        int i;
        DeepLink deepLink;
        boolean z3;
        Object obj;
        Function0 function02;
        ApiResult apiResult;
        SponsorshipRequestContent sponsorshipRequestContent;
        if (continuationImpl instanceof RealPreSignInScreenLoader$loadPreSignInScreen$1) {
            realPreSignInScreenLoader$loadPreSignInScreen$1 = (RealPreSignInScreenLoader$loadPreSignInScreen$1) continuationImpl;
            int i2 = realPreSignInScreenLoader$loadPreSignInScreen$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPreSignInScreenLoader$loadPreSignInScreen$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realPreSignInScreenLoader$loadPreSignInScreen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPreSignInScreenLoader$loadPreSignInScreen$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    if (Intrinsics.areEqual(this.locale.getCountry(), "US")) {
                        deepLink = z ? (DeepLink) CollectionsKt.firstOrNull(this.deepLinkState.getReplayCache()) : null;
                        GetPreSignInDataRequest getPreSignInDataRequest = new GetPreSignInDataRequest(deepLink != null ? new GetPreSignInDataRequest.ClientDeepLinkContext(deepLink.deepLink, deepLink.payload, ByteString.EMPTY) : null, ByteString.EMPTY);
                        realPreSignInScreenLoader$loadPreSignInScreen$1.L$0 = function0;
                        realPreSignInScreenLoader$loadPreSignInScreen$1.L$1 = deepLink;
                        z3 = z2;
                        realPreSignInScreenLoader$loadPreSignInScreen$1.Z$1 = z3;
                        realPreSignInScreenLoader$loadPreSignInScreen$1.label = 1;
                        Object preSignInData = this.service.getPreSignInData(getPreSignInDataRequest, realPreSignInScreenLoader$loadPreSignInScreen$1);
                        if (preSignInData == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        obj = preSignInData;
                        function02 = function0;
                    }
                    return null;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z4 = realPreSignInScreenLoader$loadPreSignInScreen$1.Z$1;
                deepLink = realPreSignInScreenLoader$loadPreSignInScreen$1.L$1;
                function02 = realPreSignInScreenLoader$loadPreSignInScreen$1.L$0;
                SafeTrace.throwOnFailure(obj2);
                obj = obj2;
                z3 = z4;
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    if (!(apiResult instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    DBUtil dBUtil = ((GetPreSignInDataResponse) ((ApiResult.Success) apiResult).response).intro_data;
                    if (dBUtil instanceof GetPreSignInDataResponse$IntroData$InvitationIntroData) {
                        if (z3) {
                            zzlt zzltVar = ((GetPreSignInDataResponse$IntroData$InvitationIntroData) dBUtil).value.content;
                            if (zzltVar instanceof GetPreSignInDataResponse$InvitationIntroData$Content$TeenSponsorshipRequestContent) {
                                sponsorshipRequestContent = new SponsorshipRequestContent.Teen(((GetPreSignInDataResponse$InvitationIntroData$Content$TeenSponsorshipRequestContent) zzltVar).getValue());
                            } else if (zzltVar instanceof GetPreSignInDataResponse$InvitationIntroData$Content$SponsorSponsorshipRequestContent) {
                                sponsorshipRequestContent = new SponsorshipRequestContent.Sponsor(((GetPreSignInDataResponse$InvitationIntroData$Content$SponsorSponsorshipRequestContent) zzltVar).getValue());
                            } else {
                                if (zzltVar != null) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                sponsorshipRequestContent = null;
                            }
                            if (sponsorshipRequestContent != null) {
                                ClientScenario clientScenario = ClientScenario.ONBOARDING;
                                RealFlowStarter realFlowStarter = (RealFlowStarter) this.flowStarter;
                                clientScenario.getClass();
                                BlockersData startFlow$default = FlowStarter.startFlow$default(realFlowStarter, BlockersData.Flow.ONBOARDING, PaymentScreens$HomeScreens$Home.INSTANCE, null, clientScenario, null, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_BW_HALFTONING_INFO);
                                String str = deepLink != null ? deepLink.payload : null;
                                return new SponsorshipRequestReferralIntroScreen(startFlow$default, sponsorshipRequestContent, str != null ? str : "");
                            }
                        }
                    } else if (dBUtil instanceof GetPreSignInDataResponse$IntroData$ContextualOnboardingIntroData) {
                        GetPreSignInDataResponse.ContextualOnboardingIntroData contextualOnboardingIntroData = ((GetPreSignInDataResponse$IntroData$ContextualOnboardingIntroData) dBUtil).value;
                        String validRemoteUrlOrNull = validRemoteUrlOrNull(contextualOnboardingIntroData.video_url);
                        if (validRemoteUrlOrNull != null) {
                            String validRemoteUrlOrNull2 = validRemoteUrlOrNull(contextualOnboardingIntroData.image_url);
                            return new OnboardingLandingScreen((Screen) function02.invoke(), validRemoteUrlOrNull2 != null ? validRemoteUrlOrNull2 : "", validRemoteUrlOrNull);
                        }
                    } else if (!(dBUtil instanceof GetPreSignInDataResponse$IntroData$StaffInvitationIntroData) && dBUtil != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                    }
                }
                return null;
            }
        }
        realPreSignInScreenLoader$loadPreSignInScreen$1 = new RealPreSignInScreenLoader$loadPreSignInScreen$1(this, continuationImpl);
        Object obj22 = realPreSignInScreenLoader$loadPreSignInScreen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPreSignInScreenLoader$loadPreSignInScreen$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
        return null;
    }
}
