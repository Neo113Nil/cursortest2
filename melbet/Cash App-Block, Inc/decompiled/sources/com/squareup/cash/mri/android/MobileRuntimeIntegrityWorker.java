package com.squareup.cash.mri.android;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.lifecycle.Lifecycle;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.banking.applets.presenters.RealBalanceAppletTileRepository;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.crypto.backend.balance.RealRestrictedBalanceStore;
import com.squareup.cash.data.profile.RealDemandDepositAccountManager;
import com.squareup.cash.data.transfers.TransferManager;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$Mricomputationalintegritymemorycostkbandroid;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$Mricomputationalintegritytimeoutmsandroid;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$SignMriContextWithGenericSigning;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.keystore.AttestedKeyService;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.music.presenters.MusicPresenter$models$1$1;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.payments.backend.real.RealStatusAndLimitsManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.applets.presenters.RealSavingsAppletTileRepository;
import com.squareup.cash.savings.backend.real.SyncValuesBasedSavingsBalanceStore;
import com.squareup.cash.securitysignals.backend.RealScreenRecordingDetector;
import com.squareup.cash.threedsdataonly.backend.real.RealThreeDsWarningsRepository;
import com.squareup.cash.wallet.presenters.CardAppletTileRepository;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.squareup.protos.cash.deviceintegritly.api.MRIService;
import com.squareup.protos.cash.deviceintegritly.api.SendSignedMRIContextRequest;
import com.squareup.protos.cash.deviceintegritly.api.SignedMRIService;
import com.squareup.protos.cash.piggybank.appapi.PiggybankAppService;
import com.squareup.protos.cash.security.mri.api.v1.MRIContext;
import com.squareup.protos.cash.security.mri.api.v1.SignedSerializedMRIContext;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.IoActivitySetupTeardown;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class MobileRuntimeIntegrityWorker implements IoActivitySetupTeardown {
    public static final Moshi moshi = new Moshi(new Moshi.Builder());
    public final AttestedKeyService.Factory attestedKeyServiceFactory;
    public final RealComputationalIntegrityChecker computationalIntegrityChecker;
    public final ErrorReporter errorReporter;
    public final FeatureFlagManager featureFlagManager;
    public final RealMessageSigner messageSigner;
    public final RealMRIFactory mriFactory;
    public final MRIService mriService;
    public final RealScreenRecordingDetector screenRecordingDetector;
    public final SignedMRIService signedMriService;
    public final RealThreeDsWarningsRepository threeDsWarningsRepository;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJV\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\u00062\b\b\u0003\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0011\u0012\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0016\u0010\u0013R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u0012\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0018\u0010\u0013R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u001a\u0012\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR \u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u001a\u0012\u0004\b\u001f\u0010\u0015\u001a\u0004\b\u001e\u0010\u001cR \u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u001a\u0012\u0004\b!\u0010\u0015\u001a\u0004\b \u0010\u001cR \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\"\u0012\u0004\b%\u0010\u0015\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"com/squareup/cash/mri/android/MobileRuntimeIntegrityWorker$ComputationalIntegrityJson", "", "", "wallClockMs", "cpuTimeMs", "inputTimestampMs", "", "memoryCostKb", "timeCost", "parallelism", "", "outputHash", "<init>", "(JJJIIILjava/lang/String;)V", "Lcom/squareup/cash/mri/android/MobileRuntimeIntegrityWorker$ComputationalIntegrityJson;", "copy", "(JJJIIILjava/lang/String;)Lcom/squareup/cash/mri/android/MobileRuntimeIntegrityWorker$ComputationalIntegrityJson;", "J", "getWallClockMs", "()J", "getWallClockMs$annotations", "()V", "getCpuTimeMs", "getCpuTimeMs$annotations", "getInputTimestampMs", "getInputTimestampMs$annotations", "I", "getMemoryCostKb", "()I", "getMemoryCostKb$annotations", "getTimeCost", "getTimeCost$annotations", "getParallelism", "getParallelism$annotations", "Ljava/lang/String;", "getOutputHash", "()Ljava/lang/String;", "getOutputHash$annotations", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public final /* data */ class ComputationalIntegrityJson {
        public final long cpuTimeMs;
        public final long inputTimestampMs;
        public final int memoryCostKb;
        public final String outputHash;
        public final int parallelism;
        public final int timeCost;
        public final long wallClockMs;

        public ComputationalIntegrityJson(@Json(name = "wall_clock_ms") long j, @Json(name = "cpu_time_ms") long j2, @Json(name = "input_timestamp_ms") long j3, @Json(name = "memory_cost_kb") int i, @Json(name = "time_cost") int i2, @Json(name = "parallelism") int i3, @Json(name = "output_hash") String str) {
            str.getClass();
            this.wallClockMs = j;
            this.cpuTimeMs = j2;
            this.inputTimestampMs = j3;
            this.memoryCostKb = i;
            this.timeCost = i2;
            this.parallelism = i3;
            this.outputHash = str;
        }

        @Json(name = "cpu_time_ms")
        public static /* synthetic */ void getCpuTimeMs$annotations() {
        }

        @Json(name = "input_timestamp_ms")
        public static /* synthetic */ void getInputTimestampMs$annotations() {
        }

        @Json(name = "memory_cost_kb")
        public static /* synthetic */ void getMemoryCostKb$annotations() {
        }

        @Json(name = "output_hash")
        public static /* synthetic */ void getOutputHash$annotations() {
        }

        @Json(name = "parallelism")
        public static /* synthetic */ void getParallelism$annotations() {
        }

        @Json(name = "time_cost")
        public static /* synthetic */ void getTimeCost$annotations() {
        }

        @Json(name = "wall_clock_ms")
        public static /* synthetic */ void getWallClockMs$annotations() {
        }

        public final ComputationalIntegrityJson copy(@Json(name = "wall_clock_ms") long wallClockMs, @Json(name = "cpu_time_ms") long cpuTimeMs, @Json(name = "input_timestamp_ms") long inputTimestampMs, @Json(name = "memory_cost_kb") int memoryCostKb, @Json(name = "time_cost") int timeCost, @Json(name = "parallelism") int parallelism, @Json(name = "output_hash") String outputHash) {
            outputHash.getClass();
            return new ComputationalIntegrityJson(wallClockMs, cpuTimeMs, inputTimestampMs, memoryCostKb, timeCost, parallelism, outputHash);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ComputationalIntegrityJson)) {
                return false;
            }
            ComputationalIntegrityJson computationalIntegrityJson = (ComputationalIntegrityJson) obj;
            return this.wallClockMs == computationalIntegrityJson.wallClockMs && this.cpuTimeMs == computationalIntegrityJson.cpuTimeMs && this.inputTimestampMs == computationalIntegrityJson.inputTimestampMs && this.memoryCostKb == computationalIntegrityJson.memoryCostKb && this.timeCost == computationalIntegrityJson.timeCost && this.parallelism == computationalIntegrityJson.parallelism && Intrinsics.areEqual(this.outputHash, computationalIntegrityJson.outputHash);
        }

        public final int hashCode() {
            return this.outputHash.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.parallelism, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.timeCost, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.memoryCostKb, Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.wallClockMs) * 31, 31, this.cpuTimeMs), 31, this.inputTimestampMs), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(this.wallClockMs, "ComputationalIntegrityJson(wallClockMs=", ", cpuTimeMs=");
            m1149m.append(this.cpuTimeMs);
            Boxes$$ExternalSyntheticOutline1.m1151m(this.inputTimestampMs, ", inputTimestampMs=", ", memoryCostKb=", m1149m);
            Recorder$$ExternalSyntheticOutline1.m105m(this.memoryCostKb, this.timeCost, ", timeCost=", ", parallelism=", m1149m);
            m1149m.append(this.parallelism);
            m1149m.append(", outputHash=");
            m1149m.append(this.outputHash);
            m1149m.append(")");
            return m1149m.toString();
        }
    }

    /* loaded from: classes6.dex */
    public final class ResultWrapper {
        public final Object value;

        public ResultWrapper(Object obj) {
            this.value = obj;
        }

        public final Object getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/mri/android/MobileRuntimeIntegrityWorker$TimeoutError", "Lcom/squareup/cash/observability/types/ReportedError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public final /* data */ class TimeoutError extends ReportedError {
        public final RuntimeException cause;
        public final String message;

        public TimeoutError(RuntimeException runtimeException, String str) {
            this.message = str;
            this.cause = runtimeException;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TimeoutError)) {
                return false;
            }
            TimeoutError timeoutError = (TimeoutError) obj;
            return Intrinsics.areEqual(this.message, timeoutError.message) && Intrinsics.areEqual(this.cause, timeoutError.cause);
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return this.cause;
        }

        @Override // com.squareup.cash.observability.types.FeatureError
        public final Set getFeatures() {
            return SetsKt__SetsJVMKt.setOf(ErrorFeature.Security.INSTANCE);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }

        public final int hashCode() {
            return this.cause.hashCode() + (this.message.hashCode() * 31);
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "TimeoutError(message=" + this.message + ", cause=" + this.cause + ")";
        }
    }

    public MobileRuntimeIntegrityWorker(MRIService mRIService, SignedMRIService signedMRIService, FeatureFlagManager featureFlagManager, RealMRIFactory realMRIFactory, RealMessageSigner realMessageSigner, AttestedKeyService.Factory factory, RealScreenRecordingDetector realScreenRecordingDetector, RealThreeDsWarningsRepository realThreeDsWarningsRepository, RealComputationalIntegrityChecker realComputationalIntegrityChecker, ErrorReporter errorReporter) {
        this.mriService = mRIService;
        this.signedMriService = signedMRIService;
        this.featureFlagManager = featureFlagManager;
        this.mriFactory = realMRIFactory;
        this.messageSigner = realMessageSigner;
        this.attestedKeyServiceFactory = factory;
        this.screenRecordingDetector = realScreenRecordingDetector;
        this.threeDsWarningsRepository = realThreeDsWarningsRepository;
        this.computationalIntegrityChecker = realComputationalIntegrityChecker;
        this.errorReporter = errorReporter;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable access$buildSignedRequest(MobileRuntimeIntegrityWorker mobileRuntimeIntegrityWorker, MRIContext mRIContext, Map map, ContinuationImpl continuationImpl) {
        MobileRuntimeIntegrityWorker$buildSignedRequest$1 mobileRuntimeIntegrityWorker$buildSignedRequest$1;
        int i;
        AttestedKeyService create;
        MRIContext mRIContext2;
        Map map2;
        AttestedKeyService attestedKeyService;
        Object m3594signyxL6bBk;
        Object obj;
        Object obj2;
        if (continuationImpl instanceof MobileRuntimeIntegrityWorker$buildSignedRequest$1) {
            mobileRuntimeIntegrityWorker$buildSignedRequest$1 = (MobileRuntimeIntegrityWorker$buildSignedRequest$1) continuationImpl;
            int i2 = mobileRuntimeIntegrityWorker$buildSignedRequest$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                mobileRuntimeIntegrityWorker$buildSignedRequest$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj3 = mobileRuntimeIntegrityWorker$buildSignedRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobileRuntimeIntegrityWorker$buildSignedRequest$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj3);
                    AttestedKeyService.Factory factory = mobileRuntimeIntegrityWorker.attestedKeyServiceFactory;
                    AttestedKeyService.GenerationMode generationMode = AttestedKeyService.GenerationMode.RECREATE_AT_STARTUP;
                    create = factory.create("cashapp.ak.mri_worker");
                    RealMRIFactory realMRIFactory = mobileRuntimeIntegrityWorker.mriFactory;
                    mobileRuntimeIntegrityWorker$buildSignedRequest$1.L$0 = mRIContext;
                    mobileRuntimeIntegrityWorker$buildSignedRequest$1.L$1 = map;
                    mobileRuntimeIntegrityWorker$buildSignedRequest$1.L$2 = create;
                    mobileRuntimeIntegrityWorker$buildSignedRequest$1.label = 1;
                    obj3 = JobKt.withContext(realMRIFactory.ioContext, new MusicPresenter$models$1$1(mRIContext, realMRIFactory, create, continuation, 18), mobileRuntimeIntegrityWorker$buildSignedRequest$1);
                    if (obj3 != coroutineSingletons) {
                        mRIContext2 = mRIContext;
                        map2 = map;
                        attestedKeyService = create;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = mobileRuntimeIntegrityWorker$buildSignedRequest$1.L$3;
                    SafeTrace.throwOnFailure(obj3);
                    obj2 = ((Result) obj3).value;
                    if (Result.m4120exceptionOrNullimpl(obj2) == null) {
                        obj = obj2;
                    }
                    return (SendSignedMRIContextRequest) obj;
                }
                attestedKeyService = mobileRuntimeIntegrityWorker$buildSignedRequest$1.L$2;
                Map map3 = mobileRuntimeIntegrityWorker$buildSignedRequest$1.L$1;
                MRIContext mRIContext3 = mobileRuntimeIntegrityWorker$buildSignedRequest$1.L$0;
                SafeTrace.throwOnFailure(obj3);
                map2 = map3;
                mRIContext2 = mRIContext3;
                SendSignedMRIContextRequest sendSignedMRIContextRequest = new SendSignedMRIContextRequest((SignedSerializedMRIContext) obj3, mRIContext2, map2, null, ByteString.EMPTY);
                if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) mobileRuntimeIntegrityWorker.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$SignMriContextWithGenericSigning.INSTANCE)).enabled()) {
                    return sendSignedMRIContextRequest;
                }
                RealMessageSigner realMessageSigner = mobileRuntimeIntegrityWorker.messageSigner;
                mobileRuntimeIntegrityWorker$buildSignedRequest$1.L$0 = null;
                mobileRuntimeIntegrityWorker$buildSignedRequest$1.L$1 = null;
                mobileRuntimeIntegrityWorker$buildSignedRequest$1.L$2 = null;
                mobileRuntimeIntegrityWorker$buildSignedRequest$1.L$3 = sendSignedMRIContextRequest;
                mobileRuntimeIntegrityWorker$buildSignedRequest$1.label = 2;
                m3594signyxL6bBk = realMessageSigner.m3594signyxL6bBk(sendSignedMRIContextRequest, attestedKeyService, true, (r10 & 8) != 0, mobileRuntimeIntegrityWorker$buildSignedRequest$1);
                if (m3594signyxL6bBk != coroutineSingletons) {
                    obj = sendSignedMRIContextRequest;
                    obj2 = m3594signyxL6bBk;
                    if (Result.m4120exceptionOrNullimpl(obj2) == null) {
                    }
                    return (SendSignedMRIContextRequest) obj;
                }
                return coroutineSingletons;
            }
        }
        mobileRuntimeIntegrityWorker$buildSignedRequest$1 = new MobileRuntimeIntegrityWorker$buildSignedRequest$1(mobileRuntimeIntegrityWorker, continuationImpl);
        Object obj32 = mobileRuntimeIntegrityWorker$buildSignedRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobileRuntimeIntegrityWorker$buildSignedRequest$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        SendSignedMRIContextRequest sendSignedMRIContextRequest2 = new SendSignedMRIContextRequest((SignedSerializedMRIContext) obj32, mRIContext2, map2, null, ByteString.EMPTY);
        if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) mobileRuntimeIntegrityWorker.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$SignMriContextWithGenericSigning.INSTANCE)).enabled()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0087 A[Catch: Exception -> 0x00c4, CancellationException -> 0x00c5, TryCatch #0 {Exception -> 0x00c4, blocks: (B:12:0x002a, B:13:0x0083, B:15:0x0087, B:18:0x00b1, B:20:0x00b9), top: B:11:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b1 A[Catch: Exception -> 0x00c4, CancellationException -> 0x00c5, TryCatch #0 {Exception -> 0x00c4, blocks: (B:12:0x002a, B:13:0x0083, B:15:0x0087, B:18:0x00b1, B:20:0x00b9), top: B:11:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$collectExperimentalSignals(MobileRuntimeIntegrityWorker mobileRuntimeIntegrityWorker, ContinuationImpl continuationImpl) {
        MobileRuntimeIntegrityWorker$collectExperimentalSignals$1 mobileRuntimeIntegrityWorker$collectExperimentalSignals$1;
        int i;
        ComputationalIntegrityConfig computationalIntegrityConfig;
        LinkedHashMap linkedHashMap;
        ComputationalIntegrityConfig computationalIntegrityConfig2;
        ResultWrapper resultWrapper;
        try {
            if (continuationImpl instanceof MobileRuntimeIntegrityWorker$collectExperimentalSignals$1) {
                mobileRuntimeIntegrityWorker$collectExperimentalSignals$1 = (MobileRuntimeIntegrityWorker$collectExperimentalSignals$1) continuationImpl;
                int i2 = mobileRuntimeIntegrityWorker$collectExperimentalSignals$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    mobileRuntimeIntegrityWorker$collectExperimentalSignals$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = mobileRuntimeIntegrityWorker$collectExperimentalSignals$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = mobileRuntimeIntegrityWorker$collectExperimentalSignals$1.label;
                    Continuation continuation = null;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) mobileRuntimeIntegrityWorker.featureFlagManager;
                        int i3 = (int) ((FeatureFlag$LongFeatureFlag.Value) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$Mricomputationalintegritymemorycostkbandroid.INSTANCE)).value;
                        if (i3 > 0) {
                            long j = ((FeatureFlag$LongFeatureFlag.Value) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$Mricomputationalintegritytimeoutmsandroid.INSTANCE)).value;
                            if (j > 0) {
                                computationalIntegrityConfig = new ComputationalIntegrityConfig(i3, j);
                                if (computationalIntegrityConfig != null) {
                                    return linkedHashMap2;
                                }
                                try {
                                    long timeoutMs = computationalIntegrityConfig.getTimeoutMs();
                                    MusicPresenter$models$2$1 musicPresenter$models$2$1 = new MusicPresenter$models$2$1(mobileRuntimeIntegrityWorker, computationalIntegrityConfig, continuation, 22);
                                    mobileRuntimeIntegrityWorker$collectExperimentalSignals$1.L$0 = linkedHashMap2;
                                    mobileRuntimeIntegrityWorker$collectExperimentalSignals$1.L$1 = computationalIntegrityConfig;
                                    mobileRuntimeIntegrityWorker$collectExperimentalSignals$1.label = 1;
                                    Object withTimeoutOrNull = JobKt.withTimeoutOrNull(timeoutMs, musicPresenter$models$2$1, mobileRuntimeIntegrityWorker$collectExperimentalSignals$1);
                                    if (withTimeoutOrNull == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    linkedHashMap = linkedHashMap2;
                                    obj = withTimeoutOrNull;
                                    computationalIntegrityConfig2 = computationalIntegrityConfig;
                                } catch (Exception unused) {
                                    return linkedHashMap2;
                                }
                            }
                        }
                        computationalIntegrityConfig = null;
                        if (computationalIntegrityConfig != null) {
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        computationalIntegrityConfig2 = mobileRuntimeIntegrityWorker$collectExperimentalSignals$1.L$1;
                        linkedHashMap = mobileRuntimeIntegrityWorker$collectExperimentalSignals$1.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                        } catch (Exception unused2) {
                            return linkedHashMap;
                        }
                    }
                    resultWrapper = (ResultWrapper) obj;
                    if (resultWrapper == null) {
                        ComputationalIntegrityResult computationalIntegrityResult = (ComputationalIntegrityResult) resultWrapper.getValue();
                        if (computationalIntegrityResult != null) {
                            linkedHashMap.put("computational_integrity", serializeComputationalIntegrity(computationalIntegrityResult));
                        }
                        return linkedHashMap;
                    }
                    mobileRuntimeIntegrityWorker.errorReporter.report(new TimeoutError(new RuntimeException("PoW timed out"), "Computational integrity timed out after " + computationalIntegrityConfig2.getTimeoutMs() + "ms"), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                    return linkedHashMap;
                }
            }
            if (i != 0) {
            }
            resultWrapper = (ResultWrapper) obj;
            if (resultWrapper == null) {
            }
        } catch (CancellationException e) {
            throw e;
        }
        mobileRuntimeIntegrityWorker$collectExperimentalSignals$1 = new MobileRuntimeIntegrityWorker$collectExperimentalSignals$1(mobileRuntimeIntegrityWorker, continuationImpl);
        Object obj2 = mobileRuntimeIntegrityWorker$collectExperimentalSignals$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobileRuntimeIntegrityWorker$collectExperimentalSignals$1.label;
        Continuation continuation2 = null;
    }

    public static String serializeComputationalIntegrity(ComputationalIntegrityResult computationalIntegrityResult) {
        ComputationalIntegrityJson computationalIntegrityJson = new ComputationalIntegrityJson(computationalIntegrityResult.getWallClockMs(), computationalIntegrityResult.getCpuTimeMs(), computationalIntegrityResult.getInputTimestampMs(), computationalIntegrityResult.getConfig().getMemoryCostKb(), 2, 2, computationalIntegrityResult.getOutputHash());
        Moshi moshi2 = moshi;
        moshi2.getClass();
        String json = moshi2.adapter(ComputationalIntegrityJson.class, Util.NO_ANNOTATIONS, null).toJson(computationalIntegrityJson);
        json.getClass();
        return json;
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        coroutineScope.getClass();
        ((Lifecycle) obj).getClass();
        JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new MobileRuntimeIntegrityWorker$setup$$inlined$setupSingleCoroutine$default$1(null, this), 1);
        return StateFlowKt.noOpTeardown;
    }

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider attestedKeyServiceFactory;
        public final Provider computationalIntegrityChecker;
        public final Provider errorReporter;
        public final Provider featureFlagManager;
        public final Provider messageSigner;
        public final Provider mriFactory;
        public final Provider mriService;
        public final InstanceFactory screenRecordingDetector;
        public final Provider signedMriService;
        public final Provider threeDsWarningsRepository;

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, Provider provider, DoubleCheck doubleCheck5, InstanceFactory instanceFactory, DoubleCheck doubleCheck6, DoubleCheck doubleCheck7, LambdaProvider lambdaProvider) {
            this.$r8$classId = 0;
            this.mriService = doubleCheck;
            this.signedMriService = doubleCheck2;
            this.featureFlagManager = doubleCheck3;
            this.mriFactory = doubleCheck4;
            this.messageSigner = provider;
            this.attestedKeyServiceFactory = doubleCheck5;
            this.screenRecordingDetector = instanceFactory;
            this.threeDsWarningsRepository = doubleCheck6;
            this.computationalIntegrityChecker = doubleCheck7;
            this.errorReporter = lambdaProvider;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.errorReporter;
            InstanceFactory instanceFactory = this.screenRecordingDetector;
            Provider provider2 = this.computationalIntegrityChecker;
            Provider provider3 = this.threeDsWarningsRepository;
            Provider provider4 = this.attestedKeyServiceFactory;
            Provider provider5 = this.messageSigner;
            Provider provider6 = this.mriFactory;
            Provider provider7 = this.featureFlagManager;
            Provider provider8 = this.signedMriService;
            Provider provider9 = this.mriService;
            switch (i) {
                case 0:
                    MRIService mRIService = (MRIService) provider9.invoke();
                    SignedMRIService signedMRIService = (SignedMRIService) provider8.invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider7.invoke();
                    RealMRIFactory realMRIFactory = (RealMRIFactory) provider6.invoke();
                    RealMessageSigner realMessageSigner = (RealMessageSigner) provider5.invoke();
                    AttestedKeyService.Factory factory = (AttestedKeyService.Factory) provider4.invoke();
                    RealScreenRecordingDetector realScreenRecordingDetector = (RealScreenRecordingDetector) instanceFactory.value;
                    RealThreeDsWarningsRepository realThreeDsWarningsRepository = (RealThreeDsWarningsRepository) provider3.invoke();
                    RealComputationalIntegrityChecker realComputationalIntegrityChecker = (RealComputationalIntegrityChecker) provider2.invoke();
                    ErrorReporter errorReporter = (ErrorReporter) provider.invoke();
                    mRIService.getClass();
                    signedMRIService.getClass();
                    featureFlagManager.getClass();
                    realMRIFactory.getClass();
                    realMessageSigner.getClass();
                    factory.getClass();
                    realScreenRecordingDetector.getClass();
                    realThreeDsWarningsRepository.getClass();
                    realComputationalIntegrityChecker.getClass();
                    errorReporter.getClass();
                    return new MobileRuntimeIntegrityWorker(mRIService, signedMRIService, featureFlagManager, realMRIFactory, realMessageSigner, factory, realScreenRecordingDetector, realThreeDsWarningsRepository, realComputationalIntegrityChecker, errorReporter);
                case 1:
                    SyncValueReader syncValueReader = (SyncValueReader) provider9.invoke();
                    RealBalanceSnapshotManager realBalanceSnapshotManager = (RealBalanceSnapshotManager) provider8.invoke();
                    RealDemandDepositAccountManager realDemandDepositAccountManager = (RealDemandDepositAccountManager) provider7.invoke();
                    RealStatusAndLimitsManager realStatusAndLimitsManager = (RealStatusAndLimitsManager) provider6.invoke();
                    RealFeatureEligibilityRepository realFeatureEligibilityRepository = (RealFeatureEligibilityRepository) provider5.invoke();
                    CardAppletTileRepository cardAppletTileRepository = (CardAppletTileRepository) provider4.invoke();
                    RealRestrictedBalanceStore realRestrictedBalanceStore = (RealRestrictedBalanceStore) provider3.invoke();
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) provider2.invoke();
                    CoroutineScope coroutineScope = (CoroutineScope) instanceFactory.value;
                    TransferManager transferManager = (TransferManager) provider.invoke();
                    syncValueReader.getClass();
                    realBalanceSnapshotManager.getClass();
                    realDemandDepositAccountManager.getClass();
                    realStatusAndLimitsManager.getClass();
                    realFeatureEligibilityRepository.getClass();
                    cardAppletTileRepository.getClass();
                    realRestrictedBalanceStore.getClass();
                    featureFlagManager2.getClass();
                    coroutineScope.getClass();
                    transferManager.getClass();
                    return new RealBalanceAppletTileRepository(syncValueReader, realBalanceSnapshotManager, realDemandDepositAccountManager, realStatusAndLimitsManager, realFeatureEligibilityRepository, cardAppletTileRepository, realRestrictedBalanceStore, featureFlagManager2, coroutineScope, transferManager);
                default:
                    SyncValueReader syncValueReader2 = (SyncValueReader) provider9.invoke();
                    RealFeatureEligibilityRepository realFeatureEligibilityRepository2 = (RealFeatureEligibilityRepository) provider8.invoke();
                    SyncValuesBasedSavingsBalanceStore syncValuesBasedSavingsBalanceStore = (SyncValuesBasedSavingsBalanceStore) provider7.invoke();
                    PiggybankAppService piggybankAppService = (PiggybankAppService) provider6.invoke();
                    AndroidStringManager androidStringManager = (AndroidStringManager) provider5.invoke();
                    RealClientRouteParser realClientRouteParser = (RealClientRouteParser) provider4.invoke();
                    ErrorReporter errorReporter2 = (ErrorReporter) provider3.invoke();
                    SampleStrategy sampleStrategy = (SampleStrategy) provider2.invoke();
                    CoroutineScope coroutineScope2 = (CoroutineScope) instanceFactory.value;
                    CoroutineContext coroutineContext = (CoroutineContext) provider.invoke();
                    syncValueReader2.getClass();
                    realFeatureEligibilityRepository2.getClass();
                    syncValuesBasedSavingsBalanceStore.getClass();
                    piggybankAppService.getClass();
                    androidStringManager.getClass();
                    realClientRouteParser.getClass();
                    errorReporter2.getClass();
                    sampleStrategy.getClass();
                    coroutineScope2.getClass();
                    coroutineContext.getClass();
                    return new RealSavingsAppletTileRepository(syncValueReader2, realFeatureEligibilityRepository2, syncValuesBasedSavingsBalanceStore, piggybankAppService, androidStringManager, realClientRouteParser, errorReporter2, sampleStrategy, coroutineScope2, coroutineContext);
            }
        }

        public /* synthetic */ MetroFactory(DoubleCheck doubleCheck, Provider provider, Provider provider2, Provider provider3, Provider provider4, DoubleCheck doubleCheck2, Provider provider5, Provider provider6, InstanceFactory instanceFactory, Provider provider7, int i) {
            this.$r8$classId = i;
            this.mriService = doubleCheck;
            this.signedMriService = provider;
            this.featureFlagManager = provider2;
            this.mriFactory = provider3;
            this.messageSigner = provider4;
            this.attestedKeyServiceFactory = doubleCheck2;
            this.threeDsWarningsRepository = provider5;
            this.computationalIntegrityChecker = provider6;
            this.screenRecordingDetector = instanceFactory;
            this.errorReporter = provider7;
        }
    }
}
