package com.squareup.cash.mri.android;

import android.provider.Settings;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$MriBuildSignedContextTimeoutAndroid;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$SignedMriContextDidvSigningEnabled;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$SignedMriContextPaymentSigningEnabled;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$SignedMriContextTtpSigningEnabled;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.keystore.AttestedKeyService;
import com.squareup.cash.music.presenters.MusicPresenter$models$1$1;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.protos.cash.security.mri.api.v1.MRIContext;
import com.squareup.protos.cash.security.mri.api.v1.Signals;
import com.squareup.protos.cash.security.mri.api.v1.SignedSerializedMRIContext;
import com.squareup.protos.cash.security.mri.api.v1.ThreeDsSignals;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Reflection;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.JobKt;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import retrofit2.OkHttpCall;

/* loaded from: classes.dex */
public final class RealMRIFactory {
    public final AttestedKeyService defaultAttestedKeyService;
    public final ErrorReporter errorReporter;
    public final FeatureFlagManager featureFlagManager;
    public final OkHttpCall.AnonymousClass1 identifiersCollector;
    public final CoroutineContext ioContext;
    public final boolean isDebug;
    public final RealSignalsCollector signalsCollector;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/mri/android/RealMRIFactory$MRIFactoryError", "Lcom/squareup/cash/observability/types/ReportedError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public final class MRIFactoryError extends ReportedError {
        public final Throwable cause;
        public final String message;
        public final Map metadata;
        public final Set targets;

        /* JADX WARN: Multi-variable type inference failed */
        public MRIFactoryError(Throwable th, String str, int i, boolean z, MRIUseCase mRIUseCase) {
            String simpleName;
            th.getClass();
            this.cause = th;
            this.message = Recorder$$ExternalSyntheticOutline2.m("MRIFactory: ", th.getMessage());
            this.targets = ArraysKt___ArraysKt.toSet(new ReportedError.ErrorReportingTarget[]{ReportedError.ErrorReportingTarget.DATADOG, ReportedError.ErrorReportingTarget.LOGS});
            String concat = "MRIFactory.".concat(str);
            MapBuilder mapBuilder = new MapBuilder();
            mapBuilder.put("retry_attempt", Integer.valueOf(i));
            mapBuilder.put("is_final_failure", Boolean.valueOf(z));
            if (th instanceof SafeSignalCollector$SignalTimedOutException) {
                simpleName = "signal_timeout";
            } else if (th instanceof SafeSignalCollector$InProgressException) {
                simpleName = "signal_in_progress";
            } else {
                simpleName = Reflection.factory.getOrCreateKotlinClass(th.getClass()).getSimpleName();
                if (simpleName == null) {
                    simpleName = "unknown";
                }
            }
            mapBuilder.put("error_kind", simpleName);
            if (th instanceof SafeSignalCollector$SignalException) {
                mapBuilder.put("signal_name", ((SafeSignalCollector$SignalException) th).getSignalName());
            }
            if (mRIUseCase != null) {
                mapBuilder.put("use_case", mRIUseCase.name());
            }
            this.metadata = MapsKt__MapsJVMKt.mapOf(new Pair(concat, mapBuilder.build()));
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return this.cause;
        }

        @Override // com.squareup.cash.observability.types.FeatureError
        public final Set getFeatures() {
            return ArraysKt___ArraysKt.toSet(new ErrorFeature[]{ErrorFeature.Security.INSTANCE, ErrorFeature.DigitalSigning.INSTANCE});
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }

        @Override // com.squareup.cash.observability.types.ReportedError
        public final Map getMetadata() {
            return this.metadata;
        }

        @Override // com.squareup.cash.observability.types.ReportedError
        public final Set getTargets() {
            return this.targets;
        }
    }

    public RealMRIFactory(RealSignalsCollector realSignalsCollector, OkHttpCall.AnonymousClass1 anonymousClass1, AttestedKeyService.Factory factory, ErrorReporter errorReporter, FeatureFlagManager featureFlagManager, CoroutineContext coroutineContext, boolean z) {
        this.signalsCollector = realSignalsCollector;
        this.identifiersCollector = anonymousClass1;
        this.errorReporter = errorReporter;
        this.featureFlagManager = featureFlagManager;
        this.ioContext = coroutineContext;
        this.isDebug = z;
        AttestedKeyService.GenerationMode generationMode = AttestedKeyService.GenerationMode.RECREATE_AT_STARTUP;
        this.defaultAttestedKeyService = factory.create("cashapp.ak.mri");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$setDefaultSignals(RealMRIFactory realMRIFactory, Signals.Builder builder, Boolean bool, ContinuationImpl continuationImpl) {
        RealMRIFactory$setDefaultSignals$1 realMRIFactory$setDefaultSignals$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        Signals.Builder builder2;
        Boolean bool2;
        int i2;
        Signals.Builder builder3;
        int i3;
        Signals.Builder builder4;
        Signals.Builder builder5;
        Boolean bool3;
        int i4;
        Signals.Builder builder6;
        Signals.Builder builder7;
        Boolean bool4;
        Signals.Builder builder8;
        Signals.Builder builder9;
        Boolean bool5;
        RealSignalsCollector realSignalsCollector = realMRIFactory.signalsCollector;
        if (continuationImpl instanceof RealMRIFactory$setDefaultSignals$1) {
            realMRIFactory$setDefaultSignals$1 = (RealMRIFactory$setDefaultSignals$1) continuationImpl;
            int i5 = realMRIFactory$setDefaultSignals$1.label;
            if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                realMRIFactory$setDefaultSignals$1.label = i5 - PKIFailureInfo.systemUnavail;
                obj = realMRIFactory$setDefaultSignals$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realMRIFactory$setDefaultSignals$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realMRIFactory$setDefaultSignals$1.L$1 = bool;
                    realMRIFactory$setDefaultSignals$1.L$2 = builder;
                    realMRIFactory$setDefaultSignals$1.L$3 = builder;
                    realMRIFactory$setDefaultSignals$1.L$4 = builder;
                    realMRIFactory$setDefaultSignals$1.I$0 = 0;
                    realMRIFactory$setDefaultSignals$1.label = 1;
                    Object collect = realSignalsCollector.screenMirrorSignal.collect();
                    if (collect != coroutineSingletons) {
                        builder2 = builder;
                        bool2 = bool;
                        i2 = 0;
                        obj = collect;
                        builder3 = builder2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        i3 = realMRIFactory$setDefaultSignals$1.I$0;
                        builder4 = realMRIFactory$setDefaultSignals$1.L$4;
                        builder3 = realMRIFactory$setDefaultSignals$1.L$3;
                        builder5 = realMRIFactory$setDefaultSignals$1.L$2;
                        bool3 = realMRIFactory$setDefaultSignals$1.L$1;
                        SafeTrace.throwOnFailure(obj);
                        builder4.is_vpn_connected = (Boolean) obj;
                        realMRIFactory$setDefaultSignals$1.L$1 = bool3;
                        realMRIFactory$setDefaultSignals$1.L$2 = builder5;
                        realMRIFactory$setDefaultSignals$1.L$3 = builder3;
                        realMRIFactory$setDefaultSignals$1.L$4 = builder3;
                        realMRIFactory$setDefaultSignals$1.I$0 = i3;
                        realMRIFactory$setDefaultSignals$1.label = 3;
                        obj = realSignalsCollector.debuggerSignal.collect();
                        if (obj != coroutineSingletons) {
                            i4 = i3;
                            builder6 = builder3;
                            builder7 = builder5;
                            bool4 = bool3;
                            builder3.is_debugger_attached = (Boolean) obj;
                            realMRIFactory$setDefaultSignals$1.L$1 = bool4;
                            realMRIFactory$setDefaultSignals$1.L$2 = builder7;
                            realMRIFactory$setDefaultSignals$1.L$3 = builder6;
                            realMRIFactory$setDefaultSignals$1.L$4 = builder6;
                            realMRIFactory$setDefaultSignals$1.I$0 = i4;
                            realMRIFactory$setDefaultSignals$1.label = 4;
                            obj = realSignalsCollector.devModeSignal.collect();
                            if (obj != coroutineSingletons) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        builder6 = realMRIFactory$setDefaultSignals$1.L$4;
                        builder8 = realMRIFactory$setDefaultSignals$1.L$3;
                        builder9 = realMRIFactory$setDefaultSignals$1.L$2;
                        bool5 = realMRIFactory$setDefaultSignals$1.L$1;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            builder6.is_developer_mode_enabled = (Boolean) obj;
                        } catch (Settings.SettingNotFoundException unused) {
                        }
                        if (bool5 != null) {
                            builder8.is_screen_recording = bool5;
                        }
                        return builder9;
                    }
                    int i6 = realMRIFactory$setDefaultSignals$1.I$0;
                    Signals.Builder builder10 = realMRIFactory$setDefaultSignals$1.L$4;
                    Signals.Builder builder11 = realMRIFactory$setDefaultSignals$1.L$3;
                    builder7 = realMRIFactory$setDefaultSignals$1.L$2;
                    bool4 = realMRIFactory$setDefaultSignals$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                    i4 = i6;
                    builder6 = builder11;
                    builder3 = builder10;
                    builder3.is_debugger_attached = (Boolean) obj;
                    try {
                        realMRIFactory$setDefaultSignals$1.L$1 = bool4;
                        realMRIFactory$setDefaultSignals$1.L$2 = builder7;
                        realMRIFactory$setDefaultSignals$1.L$3 = builder6;
                        realMRIFactory$setDefaultSignals$1.L$4 = builder6;
                        realMRIFactory$setDefaultSignals$1.I$0 = i4;
                        realMRIFactory$setDefaultSignals$1.label = 4;
                        obj = realSignalsCollector.devModeSignal.collect();
                    } catch (Settings.SettingNotFoundException unused2) {
                        builder8 = builder6;
                        builder9 = builder7;
                        bool5 = bool4;
                    }
                    if (obj != coroutineSingletons) {
                        builder8 = builder6;
                        builder9 = builder7;
                        bool5 = bool4;
                        builder6.is_developer_mode_enabled = (Boolean) obj;
                        if (bool5 != null) {
                        }
                        return builder9;
                    }
                    return coroutineSingletons;
                }
                int i7 = realMRIFactory$setDefaultSignals$1.I$0;
                Signals.Builder builder12 = realMRIFactory$setDefaultSignals$1.L$4;
                builder3 = realMRIFactory$setDefaultSignals$1.L$3;
                builder2 = realMRIFactory$setDefaultSignals$1.L$2;
                bool2 = realMRIFactory$setDefaultSignals$1.L$1;
                SafeTrace.throwOnFailure(obj);
                i2 = i7;
                builder = builder12;
                builder.is_screen_being_mirrored = (Boolean) obj;
                realMRIFactory$setDefaultSignals$1.L$1 = bool2;
                realMRIFactory$setDefaultSignals$1.L$2 = builder2;
                realMRIFactory$setDefaultSignals$1.L$3 = builder3;
                realMRIFactory$setDefaultSignals$1.L$4 = builder3;
                realMRIFactory$setDefaultSignals$1.I$0 = i2;
                realMRIFactory$setDefaultSignals$1.label = 2;
                obj = realSignalsCollector.vpnSignal.collect();
                if (obj != coroutineSingletons) {
                    i3 = i2;
                    builder4 = builder3;
                    builder5 = builder2;
                    bool3 = bool2;
                    builder4.is_vpn_connected = (Boolean) obj;
                    realMRIFactory$setDefaultSignals$1.L$1 = bool3;
                    realMRIFactory$setDefaultSignals$1.L$2 = builder5;
                    realMRIFactory$setDefaultSignals$1.L$3 = builder3;
                    realMRIFactory$setDefaultSignals$1.L$4 = builder3;
                    realMRIFactory$setDefaultSignals$1.I$0 = i3;
                    realMRIFactory$setDefaultSignals$1.label = 3;
                    obj = realSignalsCollector.debuggerSignal.collect();
                    if (obj != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        realMRIFactory$setDefaultSignals$1 = new RealMRIFactory$setDefaultSignals$1(realMRIFactory, continuationImpl);
        obj = realMRIFactory$setDefaultSignals$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realMRIFactory$setDefaultSignals$1.label;
        if (i != 0) {
        }
        builder.is_screen_being_mirrored = (Boolean) obj;
        realMRIFactory$setDefaultSignals$1.L$1 = bool2;
        realMRIFactory$setDefaultSignals$1.L$2 = builder2;
        realMRIFactory$setDefaultSignals$1.L$3 = builder3;
        realMRIFactory$setDefaultSignals$1.L$4 = builder3;
        realMRIFactory$setDefaultSignals$1.I$0 = i2;
        realMRIFactory$setDefaultSignals$1.label = 2;
        obj = realSignalsCollector.vpnSignal.collect();
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public static /* synthetic */ Serializable buildSignedSerializedMRIContext$default(RealMRIFactory realMRIFactory, MRIUseCase mRIUseCase, Boolean bool, ContinuationImpl continuationImpl, int i) {
        if ((i & 2) != 0) {
            bool = null;
        }
        return realMRIFactory.buildSignedSerializedMRIContext(mRIUseCase, bool, continuationImpl);
    }

    public final Object buildMRIContext(MRIUseCase mRIUseCase, Boolean bool, ThreeDsSignals threeDsSignals, ContinuationImpl continuationImpl) {
        Duration.Companion companion = Duration.Companion;
        return JobKt.m4184withTimeoutKLykuaI(DurationKt.toDuration(((FeatureFlag$LongFeatureFlag.Value) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$MriBuildSignedContextTimeoutAndroid.INSTANCE)).value, DurationUnit.SECONDS), new RealMRIFactory$buildMRIContext$2(this, bool, threeDsSignals, mRIUseCase, null, 0), continuationImpl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a4, code lost:
    
        if (r13 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a6, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0044, code lost:
    
        if (r13 == r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable buildSignedSerializedMRIContext(MRIUseCase mRIUseCase, Boolean bool, ContinuationImpl continuationImpl) {
        RealMRIFactory$buildSignedSerializedMRIContext$1 realMRIFactory$buildSignedSerializedMRIContext$1;
        int i;
        MRIContext mRIContext;
        boolean enabled;
        if (continuationImpl instanceof RealMRIFactory$buildSignedSerializedMRIContext$1) {
            realMRIFactory$buildSignedSerializedMRIContext$1 = (RealMRIFactory$buildSignedSerializedMRIContext$1) continuationImpl;
            int i2 = realMRIFactory$buildSignedSerializedMRIContext$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realMRIFactory$buildSignedSerializedMRIContext$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realMRIFactory$buildSignedSerializedMRIContext$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realMRIFactory$buildSignedSerializedMRIContext$1.label;
                Object obj2 = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realMRIFactory$buildSignedSerializedMRIContext$1.L$0 = mRIUseCase;
                    realMRIFactory$buildSignedSerializedMRIContext$1.label = 1;
                    obj = buildMRIContext(mRIUseCase, bool, null, realMRIFactory$buildSignedSerializedMRIContext$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return (SignedSerializedMRIContext) obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mRIUseCase = realMRIFactory$buildSignedSerializedMRIContext$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                mRIContext = (MRIContext) obj;
                if (mRIContext != null) {
                    return null;
                }
                int ordinal = mRIUseCase.ordinal();
                FeatureFlagManager featureFlagManager = this.featureFlagManager;
                if (ordinal == 0) {
                    enabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$SignedMriContextPaymentSigningEnabled.INSTANCE)).enabled();
                } else if (ordinal == 1) {
                    enabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$SignedMriContextTtpSigningEnabled.INSTANCE)).enabled();
                } else if (ordinal == 2) {
                    enabled = this.isDebug;
                } else {
                    if (ordinal != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    enabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$SignedMriContextDidvSigningEnabled.INSTANCE)).enabled();
                }
                if (!enabled) {
                    Integer num = new Integer(1);
                    ByteString.Companion companion = ByteString.Companion;
                    return new SignedSerializedMRIContext(num, ByteString.Companion.of$default(MRIContext.ADAPTER.encode(mRIContext)), objArr == true ? 1 : 0);
                }
                realMRIFactory$buildSignedSerializedMRIContext$1.L$0 = null;
                realMRIFactory$buildSignedSerializedMRIContext$1.label = 2;
                obj = JobKt.withContext(this.ioContext, new MusicPresenter$models$1$1((Object) mRIContext, (Object) this, obj2, (Continuation) (objArr2 == true ? 1 : 0), 18), realMRIFactory$buildSignedSerializedMRIContext$1);
            }
        }
        realMRIFactory$buildSignedSerializedMRIContext$1 = new RealMRIFactory$buildSignedSerializedMRIContext$1(this, continuationImpl);
        Object obj3 = realMRIFactory$buildSignedSerializedMRIContext$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realMRIFactory$buildSignedSerializedMRIContext$1.label;
        Object obj22 = null;
        Object[] objArr3 = 0;
        Object[] objArr22 = 0;
        if (i != 0) {
        }
        mRIContext = (MRIContext) obj3;
        if (mRIContext != null) {
        }
    }
}
