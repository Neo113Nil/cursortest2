package com.squareup.cash.persona.presenters;

import android.os.Parcelable;
import androidx.core.text.TextUtilsCompat;
import app.cash.api.ApiResult;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flow.api.MultiBlockerFacilitator$Resolver;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.deviceintegrity.DeviceIntegrity$EntryPoint;
import com.squareup.cash.deviceintegrity.RealDeviceIntegrityAttester;
import com.squareup.cash.featureflags.AmplitudeExperiments$StandardDeviceAttestationDidv;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.mri.android.MRIUseCase;
import com.squareup.cash.mri.android.RealMRIFactory;
import com.squareup.cash.persona.backend.PersonaDidvInquiryLauncher;
import com.squareup.cash.persona.backend.RealPersonaDidvInquiryLauncher;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.security.mri.api.v1.SignedSerializedMRIContext;
import com.squareup.protos.franklin.blockers.PersonaDidvBlocker;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.persona.ResolvePersonaDidvBlockerRequest;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PersonaDidvPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public PersonaDidvInquiryLauncher.InquiryResult L$0;
    public String L$1;
    public MultiBlockerFacilitator$Resolver L$2;
    public RequestContext L$3;
    public int label;
    public final /* synthetic */ LocalHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonaDidvPresenter$models$1$1(LocalHomePresenter localHomePresenter, Continuation continuation) {
        super(2, continuation);
        this.this$0 = localHomePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PersonaDidvPresenter$models$1$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PersonaDidvPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x016f, code lost:
    
        if (r0 == r11) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0171, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f0, code lost:
    
        if (r4 != r11) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00a1, code lost:
    
        if (r0 == r11) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0071, code lost:
    
        if (r0.attestStandardRequest(r3, "DIDV", r4, r29) == r11) goto L67;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object launchInquiry;
        PersonaDidvInquiryLauncher.InquiryResult inquiryResult;
        String str;
        String str2;
        MultiBlockerFacilitator$Resolver multiBlockerFacilitator$Resolver;
        RequestContext requestContext;
        Object buildSignedSerializedMRIContext$default;
        ResolvePersonaDidvBlockerRequest.InquiryResponse inquiryResponse;
        Object resolve;
        LocalHomePresenter localHomePresenter = this.this$0;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) localHomePresenter.navigator;
        BlockersScreens.PersonaDidvScreen personaDidvScreen = (BlockersScreens.PersonaDidvScreen) localHomePresenter.localHomeGeoPresenterFactory;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            if (((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) localHomePresenter.featureFlagManager)).peekCurrentValue(AmplitudeExperiments$StandardDeviceAttestationDidv.INSTANCE)).enabled()) {
                RealDeviceIntegrityAttester realDeviceIntegrityAttester = (RealDeviceIntegrityAttester) localHomePresenter.tabContentPresenterFactory;
                String m = re$$ExternalSyntheticOutline0.m();
                DeviceIntegrity$EntryPoint deviceIntegrity$EntryPoint = DeviceIntegrity$EntryPoint.PERSONA_DIDV;
                this.label = 1;
            }
        } else if (i == 1) {
            SafeTrace.throwOnFailure(obj);
        } else if (i == 2) {
            SafeTrace.throwOnFailure(obj);
            launchInquiry = obj;
            inquiryResult = (PersonaDidvInquiryLauncher.InquiryResult) launchInquiry;
            boolean z = inquiryResult instanceof PersonaDidvInquiryLauncher.InquiryResult.Cancel;
            if (z && !personaDidvScreen.resolveBlockerOnCancel) {
                screenNavigator.goTo(personaDidvScreen.blockersData.exitScreen);
                return Unit.INSTANCE;
            }
            if (z) {
                str2 = ((PersonaDidvInquiryLauncher.InquiryResult.Cancel) inquiryResult).inquiryId;
            } else if (inquiryResult instanceof PersonaDidvInquiryLauncher.InquiryResult.Complete) {
                str2 = ((PersonaDidvInquiryLauncher.InquiryResult.Complete) inquiryResult).inquiryId;
            } else {
                if (!(inquiryResult instanceof PersonaDidvInquiryLauncher.InquiryResult.Error)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                str = null;
                multiBlockerFacilitator$Resolver = (MultiBlockerFacilitator$Resolver) localHomePresenter.embeddedMapEnabled$delegate;
                requestContext = personaDidvScreen.blockersData.requestContext;
                RealMRIFactory realMRIFactory = (RealMRIFactory) localHomePresenter.neighborhoodsTabContentEnabled$delegate;
                MRIUseCase mRIUseCase = MRIUseCase.DIDV;
                this.L$0 = inquiryResult;
                this.L$1 = str;
                this.L$2 = multiBlockerFacilitator$Resolver;
                this.L$3 = requestContext;
                this.label = 3;
                buildSignedSerializedMRIContext$default = RealMRIFactory.buildSignedSerializedMRIContext$default(realMRIFactory, mRIUseCase, null, this, 6);
            }
            str = str2;
            multiBlockerFacilitator$Resolver = (MultiBlockerFacilitator$Resolver) localHomePresenter.embeddedMapEnabled$delegate;
            requestContext = personaDidvScreen.blockersData.requestContext;
            RealMRIFactory realMRIFactory2 = (RealMRIFactory) localHomePresenter.neighborhoodsTabContentEnabled$delegate;
            MRIUseCase mRIUseCase2 = MRIUseCase.DIDV;
            this.L$0 = inquiryResult;
            this.L$1 = str;
            this.L$2 = multiBlockerFacilitator$Resolver;
            this.L$3 = requestContext;
            this.label = 3;
            buildSignedSerializedMRIContext$default = RealMRIFactory.buildSignedSerializedMRIContext$default(realMRIFactory2, mRIUseCase2, null, this, 6);
        } else {
            if (i != 3) {
                if (i != 4) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                resolve = obj;
                ApiResult apiResult = (ApiResult) resolve;
                if (apiResult instanceof ApiResult.Success) {
                    BlockersData blockersData = personaDidvScreen.blockersData;
                    ResponseContext responseContext = (ResponseContext) ((ApiResult.Success) apiResult).response;
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    screenNavigator.goTo(((BlockersDataNavigator) localHomePresenter.store).getNext(personaDidvScreen, blockersData.updateFromResponseContext(responseContext, false)));
                } else if (apiResult instanceof ApiResult.Failure) {
                    screenNavigator.goTo(new FailureMessageBlockerScreen(personaDidvScreen.blockersData, TextUtilsCompat.errorMessaging((AndroidStringManager) localHomePresenter.clearMarketingBadgesIfNeeded, (ApiResult.Failure) apiResult, null).message, null, 4));
                }
                return Unit.INSTANCE;
            }
            requestContext = this.L$3;
            multiBlockerFacilitator$Resolver = this.L$2;
            str = this.L$1;
            inquiryResult = this.L$0;
            SafeTrace.throwOnFailure(obj);
            buildSignedSerializedMRIContext$default = obj;
            RequestContext copy$default = RequestContext.copy$default(requestContext, null, null, null, null, null, null, null, null, null, null, (SignedSerializedMRIContext) buildSignedSerializedMRIContext$default, null, 6143);
            boolean z2 = inquiryResult instanceof PersonaDidvInquiryLauncher.InquiryResult.Error;
            String str3 = z2 ? ((PersonaDidvInquiryLauncher.InquiryResult.Error) inquiryResult).debugMessage : null;
            boolean z3 = inquiryResult instanceof PersonaDidvInquiryLauncher.InquiryResult.Cancel;
            if (z3) {
                inquiryResponse = ResolvePersonaDidvBlockerRequest.InquiryResponse.CANCEL;
            } else if (inquiryResult instanceof PersonaDidvInquiryLauncher.InquiryResult.Complete) {
                inquiryResponse = ResolvePersonaDidvBlockerRequest.InquiryResponse.COMPLETE;
            } else {
                if (!z2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                inquiryResponse = ResolvePersonaDidvBlockerRequest.InquiryResponse.ERROR;
            }
            ResolvePersonaDidvBlockerRequest resolvePersonaDidvBlockerRequest = new ResolvePersonaDidvBlockerRequest(copy$default, inquiryResponse, str, inquiryResult instanceof PersonaDidvInquiryLauncher.InquiryResult.Complete ? ((PersonaDidvInquiryLauncher.InquiryResult.Complete) inquiryResult).status : null, z3 ? ((PersonaDidvInquiryLauncher.InquiryResult.Cancel) inquiryResult).sessionToken : null, str3, Boolean.valueOf(personaDidvScreen.fallbackModeEnabled), ByteString.EMPTY);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 4;
            resolve = multiBlockerFacilitator$Resolver.resolve(resolvePersonaDidvBlockerRequest, this);
        }
        PersonaDidvInquiryLauncher personaDidvInquiryLauncher = (PersonaDidvInquiryLauncher) localHomePresenter.syncer;
        String str4 = personaDidvScreen.subFlowToken;
        PersonaDidvInquiryLauncher.Inquiry inquiry = new PersonaDidvInquiryLauncher.Inquiry(personaDidvScreen.inquiryId, personaDidvScreen.sessionToken);
        PersonaDidvBlocker.FlowType flowType = personaDidvScreen.personaFlowType;
        String name = flowType != null ? flowType.name() : null;
        boolean z4 = personaDidvScreen.fallbackModeEnabled;
        String str5 = personaDidvScreen.fallbackTemplateId;
        boolean z5 = personaDidvScreen.biometricConsentCollected;
        this.label = 2;
        launchInquiry = ((RealPersonaDidvInquiryLauncher) personaDidvInquiryLauncher).launchInquiry(str4, inquiry, name, z4, str5, z5, this);
    }
}
