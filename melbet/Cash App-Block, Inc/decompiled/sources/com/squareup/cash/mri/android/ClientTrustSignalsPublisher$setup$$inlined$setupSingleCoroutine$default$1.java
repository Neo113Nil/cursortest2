package com.squareup.cash.mri.android;

import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.runtime.Recomposer$join$2;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.e2ee.signature.RealSignatureManager;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientTransfersThreedsPreInitialization;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$ClientTrustSignalsOnAppStartup;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$SignedMriContextThreeDsSignalsOnAppStartupAndroid;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.music.presenters.MusicPresenter$models$1$1;
import com.squareup.cash.securitysignals.backend.RealScreenRecordingDetector;
import com.squareup.cash.threedsdataonly.backend.real.RealThreeDsWarningsRepository;
import com.squareup.protos.cash.deviceintegritly.api.ClientTrustSignalsService;
import com.squareup.protos.cash.deviceintegritly.api.PublishClientTrustSignalsRequest;
import com.squareup.protos.cash.security.mri.api.v1.MRIContext;
import com.squareup.protos.cash.security.mri.api.v1.SignedSerializedMRIContext;
import com.squareup.protos.cash.security.mri.api.v1.ThreeDsSignals;
import com.squareup.util.coroutines.DerivedStateFlow;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class ClientTrustSignalsPublisher$setup$$inlined$setupSingleCoroutine$default$1 extends SuspendLambda implements Function2 {
    public int I$0;
    public int I$1;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ RealSignatureManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientTrustSignalsPublisher$setup$$inlined$setupSingleCoroutine$default$1(Continuation continuation, RealSignatureManager realSignatureManager) {
        super(2, continuation);
        this.this$0 = realSignatureManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ClientTrustSignalsPublisher$setup$$inlined$setupSingleCoroutine$default$1 clientTrustSignalsPublisher$setup$$inlined$setupSingleCoroutine$default$1 = new ClientTrustSignalsPublisher$setup$$inlined$setupSingleCoroutine$default$1(continuation, this.this$0);
        clientTrustSignalsPublisher$setup$$inlined$setupSingleCoroutine$default$1.L$0 = obj;
        return clientTrustSignalsPublisher$setup$$inlined$setupSingleCoroutine$default$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ClientTrustSignalsPublisher$setup$$inlined$setupSingleCoroutine$default$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0109, code lost:
    
        if (r0.publish(r3, r14) != r8) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cd  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        ThreeDsSignals threeDsSignals;
        Object m3770awaitWarningsgIAlus;
        int i2;
        int i3;
        MRIContext mRIContext;
        int i4;
        RealSignatureManager realSignatureManager = this.this$0;
        RealMRIFactory realMRIFactory = (RealMRIFactory) realSignatureManager.signedInStateManager;
        FeatureFlagManager featureFlagManager = realSignatureManager.featureFlagManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = this.label;
        int i6 = 0;
        int i7 = 2;
        Continuation continuation = null;
        if (i5 == 0) {
            SafeTrace.throwOnFailure(obj);
            DerivedStateFlow valuesState = Trace.valuesState(featureFlagManager, LaunchDarklyFeatureFlags$ClientTrustSignalsOnAppStartup.INSTANCE);
            Recomposer$join$2 recomposer$join$2 = new Recomposer$join$2(i7, continuation, 6);
            this.L$0 = null;
            this.I$0 = 0;
            this.label = 1;
            obj = FlowKt.first(valuesState, recomposer$join$2, this);
            if (obj != coroutineSingletons) {
                i = 0;
            }
            return coroutineSingletons;
        }
        if (i5 == 1) {
            i = this.I$0;
            SafeTrace.throwOnFailure(obj);
        } else {
            if (i5 == 2) {
                i6 = this.I$1;
                i2 = this.I$0;
                SafeTrace.throwOnFailure(obj);
                m3770awaitWarningsgIAlus = ((Result) obj).value;
                threeDsSignals = TextFieldStateKt.toThreeDsSignalsProto(m3770awaitWarningsgIAlus);
                i = i2;
                Boolean bool = (Boolean) ((RealScreenRecordingDetector) realSignatureManager.logger)._screenIsBeingRecorded.getValue();
                this.L$0 = null;
                this.I$0 = i;
                this.I$1 = i6;
                this.label = 3;
                obj = realMRIFactory.buildMRIContext(null, bool, threeDsSignals, this);
                if (obj != coroutineSingletons) {
                    i3 = i6;
                    int i8 = i;
                    mRIContext = (MRIContext) obj;
                    if (mRIContext != null) {
                    }
                    return Unit.INSTANCE;
                }
                return coroutineSingletons;
            }
            if (i5 == 3) {
                i3 = this.I$1;
                i = this.I$0;
                SafeTrace.throwOnFailure(obj);
                int i82 = i;
                mRIContext = (MRIContext) obj;
                if (mRIContext != null) {
                    this.L$0 = null;
                    this.I$0 = i82;
                    this.I$1 = i3;
                    this.label = 4;
                    obj = JobKt.withContext(realMRIFactory.ioContext, new MusicPresenter$models$1$1(mRIContext, realMRIFactory, continuation, continuation, 18), this);
                    if (obj != coroutineSingletons) {
                        i4 = i82;
                        ClientTrustSignalsService clientTrustSignalsService = (ClientTrustSignalsService) realSignatureManager.signatureRepo;
                        PublishClientTrustSignalsRequest publishClientTrustSignalsRequest = new PublishClientTrustSignalsRequest((SignedSerializedMRIContext) obj, null, null, ByteString.EMPTY);
                        this.L$0 = null;
                        this.I$0 = i4;
                        this.I$1 = i3;
                        this.label = 5;
                    }
                    return coroutineSingletons;
                }
                return Unit.INSTANCE;
            }
            if (i5 != 4) {
                if (i5 == 5) {
                    SafeTrace.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = this.I$1;
            i4 = this.I$0;
            SafeTrace.throwOnFailure(obj);
            ClientTrustSignalsService clientTrustSignalsService2 = (ClientTrustSignalsService) realSignatureManager.signatureRepo;
            PublishClientTrustSignalsRequest publishClientTrustSignalsRequest2 = new PublishClientTrustSignalsRequest((SignedSerializedMRIContext) obj, null, null, ByteString.EMPTY);
            this.L$0 = null;
            this.I$0 = i4;
            this.I$1 = i3;
            this.label = 5;
        }
        RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
        boolean enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.peekCurrentValue(AmplitudeExperiments$ClientTransfersThreedsPreInitialization.INSTANCE)).enabled();
        boolean enabled2 = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$SignedMriContextThreeDsSignalsOnAppStartupAndroid.INSTANCE)).enabled();
        if (!enabled || !enabled2) {
            threeDsSignals = null;
            Boolean bool2 = (Boolean) ((RealScreenRecordingDetector) realSignatureManager.logger)._screenIsBeingRecorded.getValue();
            this.L$0 = null;
            this.I$0 = i;
            this.I$1 = i6;
            this.label = 3;
            obj = realMRIFactory.buildMRIContext(null, bool2, threeDsSignals, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        RealThreeDsWarningsRepository realThreeDsWarningsRepository = (RealThreeDsWarningsRepository) realSignatureManager.checkJob;
        this.L$0 = null;
        this.I$0 = i;
        this.I$1 = 0;
        this.label = 2;
        m3770awaitWarningsgIAlus = realThreeDsWarningsRepository.m3770awaitWarningsgIAlus(60000L, this);
        if (m3770awaitWarningsgIAlus != coroutineSingletons) {
            i2 = i;
            threeDsSignals = TextFieldStateKt.toThreeDsSignalsProto(m3770awaitWarningsgIAlus);
            i = i2;
            Boolean bool22 = (Boolean) ((RealScreenRecordingDetector) realSignatureManager.logger)._screenIsBeingRecorded.getValue();
            this.L$0 = null;
            this.I$0 = i;
            this.I$1 = i6;
            this.label = 3;
            obj = realMRIFactory.buildMRIContext(null, bool22, threeDsSignals, this);
            if (obj != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
