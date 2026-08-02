package com.squareup.cash.e2ee.signature;

import androidx.lifecycle.Lifecycle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.CashApp$onCreate$4$1$1;
import com.squareup.cash.account.types.SignedInStateManager;
import com.squareup.cash.boost.backend.RealBoostSelector;
import com.squareup.cash.e2ee.signature.logger.RealSignatureManagerLogger;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientTransfersThreedsPreInitialization;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.mri.android.ClientTrustSignalsPublisher$setup$$inlined$setupSingleCoroutine$default$1;
import com.squareup.cash.mri.android.RealMRIFactory;
import com.squareup.cash.securitysignals.backend.RealScreenRecordingDetector;
import com.squareup.cash.threedsdataonly.backend.real.RealThreeDsService;
import com.squareup.cash.threedsdataonly.backend.real.RealThreeDsSpanTrackingService;
import com.squareup.cash.threedsdataonly.backend.real.RealThreeDsWarningsRepository;
import com.squareup.cash.threedsdataonly.backend.real.ThreeDsServiceInitializer$setup$1$1;
import com.squareup.protos.cash.deviceintegritly.api.ClientTrustSignalsService;
import com.squareup.util.coroutines.SetupTeardownKt$sam$com_squareup_util_coroutines_Teardown$0;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.IoActivitySetupTeardown;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import papa.internal.AppUpdateDetector$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public final class RealSignatureManager implements IoActivitySetupTeardown {
    public final /* synthetic */ int $r8$classId = 0;
    public Object checkJob;
    public final FeatureFlagManager featureFlagManager;
    public final Object logger;
    public final Object signatureRepo;
    public final Object signedInStateManager;

    public RealSignatureManager(FeatureFlagManager featureFlagManager, RealThreeDsSpanTrackingService realThreeDsSpanTrackingService, Analytics analytics, RealThreeDsService realThreeDsService, RealThreeDsWarningsRepository realThreeDsWarningsRepository) {
        this.featureFlagManager = featureFlagManager;
        this.signatureRepo = realThreeDsSpanTrackingService;
        this.signedInStateManager = analytics;
        this.logger = realThreeDsService;
        this.checkJob = realThreeDsWarningsRepository;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:14|15))(6:16|(1:18)|19|20|(1:22)(1:25)|(1:24))|11|12))|28|6|7|(0)(0)|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0028, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        ((com.squareup.cash.e2ee.signature.logger.RealSignatureManagerLogger) r6.logger).logDeleteSignatureFailure(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$deleteSignature(RealSignatureManager realSignatureManager, ContinuationImpl continuationImpl) {
        RealSignatureManager$deleteSignature$1 realSignatureManager$deleteSignature$1;
        int i;
        if (continuationImpl instanceof RealSignatureManager$deleteSignature$1) {
            realSignatureManager$deleteSignature$1 = (RealSignatureManager$deleteSignature$1) continuationImpl;
            int i2 = realSignatureManager$deleteSignature$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realSignatureManager$deleteSignature$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realSignatureManager$deleteSignature$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realSignatureManager$deleteSignature$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    StandaloneCoroutine standaloneCoroutine = (StandaloneCoroutine) realSignatureManager.checkJob;
                    if (standaloneCoroutine != null) {
                        standaloneCoroutine.cancel(null);
                    }
                    realSignatureManager.checkJob = null;
                    RealSignatureRepo realSignatureRepo = (RealSignatureRepo) realSignatureManager.signatureRepo;
                    realSignatureManager$deleteSignature$1.label = 1;
                    Object withContext = JobKt.withContext(realSignatureRepo.ioDispatcher, new CashApp$onCreate$4$1$1(realSignatureRepo, continuation, 19), realSignatureManager$deleteSignature$1);
                    if (withContext != obj2) {
                        withContext = Unit.INSTANCE;
                    }
                    if (withContext == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
        realSignatureManager$deleteSignature$1 = new RealSignatureManager$deleteSignature$1(realSignatureManager, continuationImpl);
        Object obj3 = realSignatureManager$deleteSignature$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSignatureManager$deleteSignature$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        Continuation continuation = null;
        switch (this.$r8$classId) {
            case 0:
                coroutineScope.getClass();
                ((Lifecycle) obj).getClass();
                JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new RealBoostSelector.AnonymousClass1(continuation, this, 10), 1);
                return StateFlowKt.noOpTeardown;
            case 1:
                coroutineScope.getClass();
                ((Lifecycle) obj).getClass();
                JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new ClientTrustSignalsPublisher$setup$$inlined$setupSingleCoroutine$default$1(null, this), 1);
                return StateFlowKt.noOpTeardown;
            default:
                coroutineScope.getClass();
                ((Lifecycle) obj).getClass();
                if (((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(AmplitudeExperiments$ClientTransfersThreedsPreInitialization.INSTANCE)).enabled()) {
                    JobKt.launch$default(coroutineScope, null, null, new ThreeDsServiceInitializer$setup$1$1(this, continuation, 0), 3);
                }
                return new SetupTeardownKt$sam$com_squareup_util_coroutines_Teardown$0(new AppUpdateDetector$$ExternalSyntheticLambda0(this, 4));
        }
    }

    public RealSignatureManager(ClientTrustSignalsService clientTrustSignalsService, FeatureFlagManager featureFlagManager, RealMRIFactory realMRIFactory, RealScreenRecordingDetector realScreenRecordingDetector, RealThreeDsWarningsRepository realThreeDsWarningsRepository) {
        this.signatureRepo = clientTrustSignalsService;
        this.featureFlagManager = featureFlagManager;
        this.signedInStateManager = realMRIFactory;
        this.logger = realScreenRecordingDetector;
        this.checkJob = realThreeDsWarningsRepository;
    }

    public RealSignatureManager(FeatureFlagManager featureFlagManager, RealSignatureRepo realSignatureRepo, SignedInStateManager signedInStateManager, RealSignatureManagerLogger realSignatureManagerLogger) {
        this.featureFlagManager = featureFlagManager;
        this.signatureRepo = realSignatureRepo;
        this.signedInStateManager = signedInStateManager;
        this.logger = realSignatureManagerLogger;
    }
}
