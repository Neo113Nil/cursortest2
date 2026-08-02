package com.squareup.cash.session.backend;

import androidx.compose.ui.draw.RotateKt;
import app.cash.api.ApiResult;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.cdf.appsession.AppSessionInitiateFail;
import com.squareup.cash.cdf.appsession.AppSessionInitiateStart;
import com.squareup.cash.cdf.appsession.AppSessionInitiateSucceed;
import com.squareup.cash.deviceintegrity.RealDeviceIntegrityAttester;
import com.squareup.cash.featureflags.RealLoginFeatureFlagsHandler;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.mri.android.MRIUseCase;
import com.squareup.cash.mri.android.RealMRIFactory;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import com.squareup.preferences.PreferenceFlow$flow$1;
import com.squareup.protos.cash.security.mri.api.v1.SignedSerializedMRIContext;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.InitiateSessionResponse;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.SessionStatus;
import com.squareup.util.android.RealBackupService;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLoggerImpl;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealSessionInitiator implements HasObservability {
    public final Analytics analytics;
    public final AppService appService;
    public final RealBackupService backupService;
    public final RealDeviceIntegrityAttester deviceIntegrityAttester;
    public final Lazy engine;
    public final ErrorReporter errorReporter;
    public final CoroutineContext ioDispatcher;
    public final RealLoginFeatureFlagsHandler loginFeatureFlagsHandler;
    public final RealMRIFactory mriFactory;
    public final SampleStrategy oneErrorPerAppSessionStrategy;
    public final SessionManager sessionManager;
    public final Signal signOutSignal;

    public RealSessionInitiator(Analytics analytics, AppService appService, RealBackupService realBackupService, CoroutineContext coroutineContext, RealLoginFeatureFlagsHandler realLoginFeatureFlagsHandler, Signal signal, RealDeviceIntegrityAttester realDeviceIntegrityAttester, SessionManager sessionManager, Lazy lazy, RealLocaleManager realLocaleManager, RealMRIFactory realMRIFactory, ErrorReporter errorReporter, SampleStrategy sampleStrategy) {
        this.analytics = analytics;
        this.appService = appService;
        this.backupService = realBackupService;
        this.ioDispatcher = coroutineContext;
        this.loginFeatureFlagsHandler = realLoginFeatureFlagsHandler;
        this.signOutSignal = signal;
        this.deviceIntegrityAttester = realDeviceIntegrityAttester;
        this.sessionManager = sessionManager;
        this.engine = lazy;
        this.mriFactory = realMRIFactory;
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00ec, code lost:
    
        if (r7.updateAppToken(r0, r2) == r3) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00bc, code lost:
    
        if (r0 == r3) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0092, code lost:
    
        if (r0 == r3) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0076, code lost:
    
        if (r0 == r3) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call(ContinuationImpl continuationImpl) {
        RealSessionInitiator$call$1 realSessionInitiator$call$1;
        int i;
        String str;
        ApiResult apiResult;
        InitiateSessionResponse initiateSessionResponse;
        ProtoParsingError protoParsingExceptionFor;
        ApiResult apiResult2;
        Object withContext;
        ApiResult apiResult3;
        String str2;
        InitiateSessionResponse initiateSessionResponse2;
        ApiResult apiResult4;
        String str3;
        if (continuationImpl instanceof RealSessionInitiator$call$1) {
            realSessionInitiator$call$1 = (RealSessionInitiator$call$1) continuationImpl;
            int i2 = realSessionInitiator$call$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realSessionInitiator$call$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realSessionInitiator$call$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realSessionInitiator$call$1.label;
                RealBackupService realBackupService = this.backupService;
                SessionManager sessionManager = this.sessionManager;
                Analytics analytics = this.analytics;
                Continuation continuation = null;
                switch (i) {
                    case 0:
                        SafeTrace.throwOnFailure(obj);
                        realSessionInitiator$call$1.label = 1;
                        obj = realBackupService.readBackupTag(realSessionInitiator$call$1);
                        break;
                    case 1:
                        SafeTrace.throwOnFailure(obj);
                        str = (String) obj;
                        analytics.track(new AppSessionInitiateStart(), null);
                        MRIUseCase mRIUseCase = MRIUseCase.INITIATE_SESSION;
                        realSessionInitiator$call$1.L$0 = str;
                        realSessionInitiator$call$1.label = 2;
                        obj = RealMRIFactory.buildSignedSerializedMRIContext$default(this.mriFactory, mRIUseCase, null, realSessionInitiator$call$1, 6);
                        break;
                    case 2:
                        str = realSessionInitiator$call$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        RealSessionInitiator$call$result$1 realSessionInitiator$call$result$1 = new RealSessionInitiator$call$result$1(this, str, new RequestContext(null, null, null, null, null, null, null, (SignedSerializedMRIContext) obj, 6143), null);
                        realSessionInitiator$call$1.L$0 = null;
                        realSessionInitiator$call$1.label = 3;
                        obj = StateFlowKt.until(this.signOutSignal, realSessionInitiator$call$result$1, realSessionInitiator$call$1);
                        break;
                    case 3:
                        SafeTrace.throwOnFailure(obj);
                        apiResult = (ApiResult) obj;
                        if (apiResult == null) {
                            return null;
                        }
                        if (!(apiResult instanceof ApiResult.Success)) {
                            if (!(apiResult instanceof ApiResult.Failure)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            ApiResult.Failure.HttpFailure httpFailure = apiResult instanceof ApiResult.Failure.HttpFailure ? (ApiResult.Failure.HttpFailure) apiResult : null;
                            analytics.track(new AppSessionInitiateFail(httpFailure != null ? new Integer(httpFailure.code) : null, Boolean.valueOf(apiResult instanceof ApiResult.Failure.NetworkFailure)), null);
                            Timber.Forest.e("Failed to initiate session.", new Object[0]);
                            return apiResult;
                        }
                        initiateSessionResponse = (InitiateSessionResponse) ((ApiResult.Success) apiResult).response;
                        String str4 = initiateSessionResponse.app_token;
                        if (str4 != null) {
                            Timber.Forest.d("App token acquired.", new Object[0]);
                            realSessionInitiator$call$1.L$0 = null;
                            realSessionInitiator$call$1.L$2 = apiResult;
                            realSessionInitiator$call$1.L$3 = initiateSessionResponse;
                            realSessionInitiator$call$1.label = 4;
                            break;
                        }
                        if (!(PlatformKt.getCurrentSessionState(sessionManager) instanceof SessionState.Initiated)) {
                            try {
                                SessionParsingErrorFactory sessionParsingErrorFactory = SessionParsingErrorFactory.INSTANCE;
                                try {
                                    String str5 = initiateSessionResponse.session_token;
                                    if (str5 == null) {
                                        throw new IllegalArgumentException(TrackingEventsLoggerImpl.KEY_SESSION_TOKEN);
                                    }
                                    SessionStatus sessionStatus = initiateSessionResponse.session_status;
                                    if (sessionStatus == null) {
                                        throw new IllegalArgumentException("session_status");
                                    }
                                    Session session = new Session(str5, sessionStatus);
                                    Timber.Forest.d("Session token acquired.", new Object[0]);
                                    realSessionInitiator$call$1.L$0 = null;
                                    realSessionInitiator$call$1.L$2 = apiResult;
                                    realSessionInitiator$call$1.L$3 = initiateSessionResponse;
                                    realSessionInitiator$call$1.label = 5;
                                    if (sessionManager.updateSession(session, "InitiateSessionRequest", realSessionInitiator$call$1) != obj2) {
                                        apiResult2 = apiResult;
                                        apiResult = apiResult2;
                                    }
                                    return obj2;
                                } catch (Exception e) {
                                    protoParsingExceptionFor = RotateKt.toProtoParsingExceptionFor(e, initiateSessionResponse != null ? Reflection.factory.getOrCreateKotlinClass(InitiateSessionResponse.class) : null, sessionParsingErrorFactory, null);
                                    throw protoParsingExceptionFor;
                                }
                            } catch (com.squareup.cash.banking.observability.ProtoParsingError e2) {
                                this.errorReporter.report(e2, this.oneErrorPerAppSessionStrategy);
                                analytics.track(new AppSessionInitiateFail(), null);
                                Timber.Forest.e("Failed to initiate session: malformed InitiateSessionResponse.", new Object[0], e2);
                                return new ApiResult.Failure.NetworkFailure(e2);
                            }
                        }
                        analytics.track(new AppSessionInitiateSucceed(), null);
                        List list = initiateSessionResponse.login_feature_flags;
                        realSessionInitiator$call$1.L$0 = null;
                        realSessionInitiator$call$1.L$2 = apiResult;
                        realSessionInitiator$call$1.L$3 = initiateSessionResponse;
                        realSessionInitiator$call$1.label = 6;
                        RealLoginFeatureFlagsHandler realLoginFeatureFlagsHandler = this.loginFeatureFlagsHandler;
                        withContext = JobKt.withContext(realLoginFeatureFlagsHandler.ioDispatcher, new RealGcmRegistrar$unregister$2(realLoginFeatureFlagsHandler, list, continuation, 18), realSessionInitiator$call$1);
                        if (withContext != obj2) {
                            withContext = Unit.INSTANCE;
                        }
                        if (withContext != obj2) {
                            apiResult3 = apiResult;
                            str2 = initiateSessionResponse.play_integrity_nonce;
                            if (str2 != null) {
                                PreferenceFlow$flow$1 preferenceFlow$flow$1 = new PreferenceFlow$flow$1(this, str2, continuation, 1);
                                realSessionInitiator$call$1.L$0 = null;
                                realSessionInitiator$call$1.L$2 = apiResult3;
                                realSessionInitiator$call$1.L$3 = initiateSessionResponse;
                                realSessionInitiator$call$1.label = 7;
                                obj = JobKt.withContext(this.ioDispatcher, preferenceFlow$flow$1, realSessionInitiator$call$1);
                                if (obj != obj2) {
                                    initiateSessionResponse2 = initiateSessionResponse;
                                    apiResult4 = apiResult3;
                                    apiResult3 = apiResult4;
                                    initiateSessionResponse = initiateSessionResponse2;
                                }
                            }
                            str3 = initiateSessionResponse.backup_tag;
                            if (str3 != null) {
                                realSessionInitiator$call$1.L$0 = null;
                                realSessionInitiator$call$1.L$2 = apiResult3;
                                realSessionInitiator$call$1.L$3 = null;
                                realSessionInitiator$call$1.label = 8;
                                Object withContext2 = JobKt.withContext(realBackupService.ioDispatcher, new RealGcmRegistrar$unregister$2(str3, realBackupService, continuation, 29), realSessionInitiator$call$1);
                                if (withContext2 != obj2) {
                                    withContext2 = Unit.INSTANCE;
                                }
                                if (withContext2 == obj2) {
                                }
                            }
                            return apiResult3;
                        }
                        return obj2;
                    case 4:
                        initiateSessionResponse = realSessionInitiator$call$1.L$3;
                        apiResult = realSessionInitiator$call$1.L$2;
                        SafeTrace.throwOnFailure(obj);
                        if (!(PlatformKt.getCurrentSessionState(sessionManager) instanceof SessionState.Initiated)) {
                        }
                        analytics.track(new AppSessionInitiateSucceed(), null);
                        List list2 = initiateSessionResponse.login_feature_flags;
                        realSessionInitiator$call$1.L$0 = null;
                        realSessionInitiator$call$1.L$2 = apiResult;
                        realSessionInitiator$call$1.L$3 = initiateSessionResponse;
                        realSessionInitiator$call$1.label = 6;
                        RealLoginFeatureFlagsHandler realLoginFeatureFlagsHandler2 = this.loginFeatureFlagsHandler;
                        withContext = JobKt.withContext(realLoginFeatureFlagsHandler2.ioDispatcher, new RealGcmRegistrar$unregister$2(realLoginFeatureFlagsHandler2, list2, continuation, 18), realSessionInitiator$call$1);
                        if (withContext != obj2) {
                        }
                        if (withContext != obj2) {
                        }
                        return obj2;
                    case 5:
                        initiateSessionResponse = realSessionInitiator$call$1.L$3;
                        apiResult2 = realSessionInitiator$call$1.L$2;
                        SafeTrace.throwOnFailure(obj);
                        apiResult = apiResult2;
                        analytics.track(new AppSessionInitiateSucceed(), null);
                        List list22 = initiateSessionResponse.login_feature_flags;
                        realSessionInitiator$call$1.L$0 = null;
                        realSessionInitiator$call$1.L$2 = apiResult;
                        realSessionInitiator$call$1.L$3 = initiateSessionResponse;
                        realSessionInitiator$call$1.label = 6;
                        RealLoginFeatureFlagsHandler realLoginFeatureFlagsHandler22 = this.loginFeatureFlagsHandler;
                        withContext = JobKt.withContext(realLoginFeatureFlagsHandler22.ioDispatcher, new RealGcmRegistrar$unregister$2(realLoginFeatureFlagsHandler22, list22, continuation, 18), realSessionInitiator$call$1);
                        if (withContext != obj2) {
                        }
                        if (withContext != obj2) {
                        }
                        return obj2;
                    case 6:
                        initiateSessionResponse = realSessionInitiator$call$1.L$3;
                        apiResult3 = realSessionInitiator$call$1.L$2;
                        SafeTrace.throwOnFailure(obj);
                        str2 = initiateSessionResponse.play_integrity_nonce;
                        if (str2 != null) {
                        }
                        str3 = initiateSessionResponse.backup_tag;
                        if (str3 != null) {
                        }
                        return apiResult3;
                    case 7:
                        initiateSessionResponse2 = realSessionInitiator$call$1.L$3;
                        apiResult4 = realSessionInitiator$call$1.L$2;
                        SafeTrace.throwOnFailure(obj);
                        apiResult3 = apiResult4;
                        initiateSessionResponse = initiateSessionResponse2;
                        str3 = initiateSessionResponse.backup_tag;
                        if (str3 != null) {
                        }
                        return apiResult3;
                    case 8:
                        ApiResult apiResult5 = realSessionInitiator$call$1.L$2;
                        SafeTrace.throwOnFailure(obj);
                        return apiResult5;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        realSessionInitiator$call$1 = new RealSessionInitiator$call$1(this, continuationImpl);
        Object obj3 = realSessionInitiator$call$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSessionInitiator$call$1.label;
        RealBackupService realBackupService2 = this.backupService;
        SessionManager sessionManager2 = this.sessionManager;
        Analytics analytics2 = this.analytics;
        Continuation continuation2 = null;
        switch (i) {
        }
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return this.oneErrorPerAppSessionStrategy;
    }
}
