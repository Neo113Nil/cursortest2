package com.squareup.cash.mri.android;

import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.runtime.Recomposer$join$2;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientTransfersThreedsPreInitialization;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$MriContextOnAppStartupAndroid;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$SignedMriContextOnAppStartupAndroid;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$SignedMriContextThreeDsSignalsOnAppStartupAndroid;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.threedsdataonly.backend.real.RealThreeDsWarningsRepository;
import com.squareup.protos.cash.deviceintegritly.api.MRIService;
import com.squareup.protos.cash.deviceintegritly.api.SendMRIContextRequest;
import com.squareup.protos.cash.deviceintegritly.api.SignedMRIService;
import com.squareup.protos.cash.security.mri.api.v1.MRIContext;
import com.squareup.protos.cash.security.mri.api.v1.ThreeDsSignals;
import com.squareup.util.coroutines.DerivedStateFlow;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class MobileRuntimeIntegrityWorker$setup$$inlined$setupSingleCoroutine$default$1 extends SuspendLambda implements Function2 {
    public int I$0;
    public int I$1;
    public /* synthetic */ Object L$0;
    public MRIContext L$6;
    public SignedMRIService L$8;
    public int label;
    public final /* synthetic */ MobileRuntimeIntegrityWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileRuntimeIntegrityWorker$setup$$inlined$setupSingleCoroutine$default$1(Continuation continuation, MobileRuntimeIntegrityWorker mobileRuntimeIntegrityWorker) {
        super(2, continuation);
        this.this$0 = mobileRuntimeIntegrityWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MobileRuntimeIntegrityWorker$setup$$inlined$setupSingleCoroutine$default$1 mobileRuntimeIntegrityWorker$setup$$inlined$setupSingleCoroutine$default$1 = new MobileRuntimeIntegrityWorker$setup$$inlined$setupSingleCoroutine$default$1(continuation, this.this$0);
        mobileRuntimeIntegrityWorker$setup$$inlined$setupSingleCoroutine$default$1.L$0 = obj;
        return mobileRuntimeIntegrityWorker$setup$$inlined$setupSingleCoroutine$default$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MobileRuntimeIntegrityWorker$setup$$inlined$setupSingleCoroutine$default$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x014c, code lost:
    
        if (r3.sendSignedMRIContext((com.squareup.protos.cash.deviceintegritly.api.SendSignedMRIContextRequest) r12, r11) != r2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ac, code lost:
    
        if (r12 == r2) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        boolean enabled;
        ThreeDsSignals threeDsSignals;
        Object m3770awaitWarningsgIAlus;
        int i2;
        int i3;
        MRIContext mRIContext;
        MRIContext mRIContext2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        SignedMRIService signedMRIService;
        MobileRuntimeIntegrityWorker mobileRuntimeIntegrityWorker = this.this$0;
        FeatureFlagManager featureFlagManager = mobileRuntimeIntegrityWorker.featureFlagManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = 0;
        switch (this.label) {
            case 0:
                SafeTrace.throwOnFailure(obj);
                DerivedStateFlow valuesState = Trace.valuesState(featureFlagManager, LaunchDarklyFeatureFlags$MriContextOnAppStartupAndroid.INSTANCE);
                Recomposer$join$2 recomposer$join$2 = new Recomposer$join$2(2, null, 7);
                this.L$0 = null;
                this.I$0 = 0;
                this.label = 1;
                obj = FlowKt.first(valuesState, recomposer$join$2, this);
                if (obj != coroutineSingletons) {
                    i = 0;
                    RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
                    enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.peekCurrentValue(AmplitudeExperiments$ClientTransfersThreedsPreInitialization.INSTANCE)).enabled();
                    boolean enabled2 = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$SignedMriContextThreeDsSignalsOnAppStartupAndroid.INSTANCE)).enabled();
                    if (!enabled && enabled2) {
                        RealThreeDsWarningsRepository realThreeDsWarningsRepository = mobileRuntimeIntegrityWorker.threeDsWarningsRepository;
                        this.L$0 = null;
                        this.I$0 = i;
                        this.I$1 = 0;
                        this.label = 2;
                        m3770awaitWarningsgIAlus = realThreeDsWarningsRepository.m3770awaitWarningsgIAlus(60000L, this);
                        break;
                    } else {
                        threeDsSignals = null;
                        RealMRIFactory realMRIFactory = mobileRuntimeIntegrityWorker.mriFactory;
                        Boolean bool = (Boolean) mobileRuntimeIntegrityWorker.screenRecordingDetector._screenIsBeingRecorded.getValue();
                        this.L$0 = null;
                        this.I$0 = i;
                        this.I$1 = i9;
                        this.label = 3;
                        obj = realMRIFactory.buildMRIContext(null, bool, threeDsSignals, this);
                        if (obj != coroutineSingletons) {
                            i2 = i;
                            i3 = i9;
                            mRIContext = (MRIContext) obj;
                            if (mRIContext != null) {
                                SendMRIContextRequest sendMRIContextRequest = new SendMRIContextRequest(mRIContext, ByteString.EMPTY);
                                MRIService mRIService = mobileRuntimeIntegrityWorker.mriService;
                                this.L$0 = null;
                                this.L$6 = mRIContext;
                                this.I$0 = i2;
                                this.I$1 = i3;
                                this.label = 4;
                                if (mRIService.sendMRIContext(sendMRIContextRequest, this) != coroutineSingletons) {
                                    int i10 = i2;
                                    mRIContext2 = mRIContext;
                                    i4 = i10;
                                    if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$SignedMriContextOnAppStartupAndroid.INSTANCE)).enabled()) {
                                        this.L$0 = null;
                                        this.L$6 = mRIContext2;
                                        this.I$0 = i4;
                                        this.I$1 = i3;
                                        this.label = 5;
                                        Object access$collectExperimentalSignals = MobileRuntimeIntegrityWorker.access$collectExperimentalSignals(mobileRuntimeIntegrityWorker, this);
                                        if (access$collectExperimentalSignals != coroutineSingletons) {
                                            int i11 = i3;
                                            i5 = i4;
                                            obj = access$collectExperimentalSignals;
                                            i6 = i11;
                                            SignedMRIService signedMRIService2 = mobileRuntimeIntegrityWorker.signedMriService;
                                            this.L$0 = null;
                                            this.L$6 = null;
                                            this.L$8 = signedMRIService2;
                                            this.I$0 = i5;
                                            this.I$1 = i6;
                                            this.label = 6;
                                            obj = MobileRuntimeIntegrityWorker.access$buildSignedRequest(mobileRuntimeIntegrityWorker, mRIContext2, (Map) obj, this);
                                            if (obj != coroutineSingletons) {
                                                i7 = i6;
                                                i8 = i5;
                                                signedMRIService = signedMRIService2;
                                                this.L$0 = null;
                                                this.L$6 = null;
                                                this.L$8 = null;
                                                this.I$0 = i8;
                                                this.I$1 = i7;
                                                this.label = 7;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                i = this.I$0;
                SafeTrace.throwOnFailure(obj);
                RealFeatureFlagManager realFeatureFlagManager2 = (RealFeatureFlagManager) featureFlagManager;
                enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager2.peekCurrentValue(AmplitudeExperiments$ClientTransfersThreedsPreInitialization.INSTANCE)).enabled();
                boolean enabled22 = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) realFeatureFlagManager2.peekCurrentValue(LaunchDarklyFeatureFlags$SignedMriContextThreeDsSignalsOnAppStartupAndroid.INSTANCE)).enabled();
                if (!enabled) {
                }
                threeDsSignals = null;
                RealMRIFactory realMRIFactory2 = mobileRuntimeIntegrityWorker.mriFactory;
                Boolean bool2 = (Boolean) mobileRuntimeIntegrityWorker.screenRecordingDetector._screenIsBeingRecorded.getValue();
                this.L$0 = null;
                this.I$0 = i;
                this.I$1 = i9;
                this.label = 3;
                obj = realMRIFactory2.buildMRIContext(null, bool2, threeDsSignals, this);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 2:
                i9 = this.I$1;
                i = this.I$0;
                SafeTrace.throwOnFailure(obj);
                m3770awaitWarningsgIAlus = ((Result) obj).value;
                threeDsSignals = TextFieldStateKt.toThreeDsSignalsProto(m3770awaitWarningsgIAlus);
                RealMRIFactory realMRIFactory22 = mobileRuntimeIntegrityWorker.mriFactory;
                Boolean bool22 = (Boolean) mobileRuntimeIntegrityWorker.screenRecordingDetector._screenIsBeingRecorded.getValue();
                this.L$0 = null;
                this.I$0 = i;
                this.I$1 = i9;
                this.label = 3;
                obj = realMRIFactory22.buildMRIContext(null, bool22, threeDsSignals, this);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 3:
                i3 = this.I$1;
                i2 = this.I$0;
                SafeTrace.throwOnFailure(obj);
                mRIContext = (MRIContext) obj;
                if (mRIContext != null) {
                }
                return Unit.INSTANCE;
            case 4:
                i3 = this.I$1;
                int i12 = this.I$0;
                MRIContext mRIContext3 = this.L$6;
                SafeTrace.throwOnFailure(obj);
                i4 = i12;
                mRIContext2 = mRIContext3;
                if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$SignedMriContextOnAppStartupAndroid.INSTANCE)).enabled()) {
                }
                return Unit.INSTANCE;
            case 5:
                i6 = this.I$1;
                i5 = this.I$0;
                mRIContext2 = this.L$6;
                SafeTrace.throwOnFailure(obj);
                SignedMRIService signedMRIService22 = mobileRuntimeIntegrityWorker.signedMriService;
                this.L$0 = null;
                this.L$6 = null;
                this.L$8 = signedMRIService22;
                this.I$0 = i5;
                this.I$1 = i6;
                this.label = 6;
                obj = MobileRuntimeIntegrityWorker.access$buildSignedRequest(mobileRuntimeIntegrityWorker, mRIContext2, (Map) obj, this);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 6:
                i7 = this.I$1;
                i8 = this.I$0;
                signedMRIService = this.L$8;
                SafeTrace.throwOnFailure(obj);
                this.L$0 = null;
                this.L$6 = null;
                this.L$8 = null;
                this.I$0 = i8;
                this.I$1 = i7;
                this.label = 7;
                break;
            case 7:
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
