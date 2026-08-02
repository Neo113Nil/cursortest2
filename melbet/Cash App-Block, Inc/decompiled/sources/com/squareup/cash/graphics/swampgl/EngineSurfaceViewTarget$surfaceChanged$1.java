package com.squareup.cash.graphics.swampgl;

import android.graphics.SurfaceTexture;
import android.opengl.EGLSurface;
import android.view.Surface;
import androidx.core.view.DisplayCompat;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent$VerificationError$Error;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.StartVerification;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationState;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.repository.CachedConsumerSession;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.VerificationType;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.OTPController;
import com.stripe.android.uicore.elements.OTPElement;
import com.stripe.android.uicore.elements.ParameterDestination;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class EngineSurfaceViewTarget$surfaceChanged$1 extends SuspendLambda implements Function1 {
    public int $height;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $surface;
    public int $width;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EngineSurfaceViewTarget$surfaceChanged$1(Object obj, Object obj2, int i, int i2, Continuation continuation, int i3) {
        super(1, continuation);
        this.$r8$classId = i3;
        this.this$0 = obj;
        this.$surface = obj2;
        this.$width = i;
        this.$height = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        Object obj = this.$surface;
        switch (i) {
            case 0:
                return new EngineSurfaceViewTarget$surfaceChanged$1((EngineSurfaceViewTarget) this.this$0, (Surface) obj, this.$width, this.$height, continuation, 0);
            case 1:
                return new EngineSurfaceViewTarget$surfaceChanged$1((EngineSurfaceTarget) this.this$0, (SurfaceTexture) obj, this.$width, this.$height, continuation, 1);
            default:
                return new EngineSurfaceViewTarget$surfaceChanged$1((NetworkingSaveToLinkVerificationViewModel) obj, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((EngineSurfaceViewTarget$surfaceChanged$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:3|(1:(1:(11:7|8|9|10|11|12|(1:14)|15|(1:17)(1:21)|18|19)(2:25|26))(1:27))(2:51|(1:53)(2:55|56))|28|(1:30)(1:50)|31|32|33|34|36|37|(8:41|11|12|(0)|15|(0)(0)|18|19)|39|40) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007d, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0082, code lost:
    
        r14 = r4;
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0080, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0085, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x004d, code lost:
    
        if (r8 == r3) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EGLSurface eGLSurface;
        CachedConsumerSession provideConsumerSession;
        Object invoke$default;
        CachedConsumerSession cachedConsumerSession;
        int i;
        Object obj2;
        Object failure;
        switch (this.$r8$classId) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!((EngineSurfaceViewTarget) this.this$0).destroyed && ((Surface) this.$surface).isValid()) {
                    EGLSurface eGLSurface2 = ((EngineSurfaceViewTarget) this.this$0).eglSurface;
                    EngineSurfaceViewTarget engineSurfaceViewTarget = (EngineSurfaceViewTarget) this.this$0;
                    Engine engine = engineSurfaceViewTarget.engine;
                    if (eGLSurface2 != null) {
                        engine.frameScheduler.updateTargetSize(engineSurfaceViewTarget.scene, engineSurfaceViewTarget.targetId, this.$width, this.$height);
                        return Unit.INSTANCE;
                    }
                    Surface surface = (Surface) this.$surface;
                    surface.getClass();
                    EGLSurface createAndConfigure = DisplayCompat.createAndConfigure(engine, surface, ((EngineSurfaceViewTarget) this.this$0).displayRefreshRateHz);
                    if (createAndConfigure == null) {
                        return Unit.INSTANCE;
                    }
                    ((EngineSurfaceViewTarget) this.this$0).eglSurface = createAndConfigure;
                    EngineSurfaceViewTarget engineSurfaceViewTarget2 = (EngineSurfaceViewTarget) this.this$0;
                    engineSurfaceViewTarget2.engine.frameScheduler.registerTarget(engineSurfaceViewTarget2.scene, engineSurfaceViewTarget2.targetId, createAndConfigure, this.$width, this.$height, engineSurfaceViewTarget2.displayRefreshRateHz);
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((EngineSurfaceTarget) this.this$0).destroyed) {
                    return Unit.INSTANCE;
                }
                EngineSurfaceTarget engineSurfaceTarget = (EngineSurfaceTarget) this.this$0;
                Surface surface2 = new Surface((SurfaceTexture) this.$surface);
                engineSurfaceTarget.androidSurface = surface2;
                EGLSurface createAndConfigure2 = DisplayCompat.createAndConfigure(engineSurfaceTarget.engine, surface2, engineSurfaceTarget.displayRefreshRateHz);
                if (createAndConfigure2 == null) {
                    eGLSurface = null;
                } else {
                    engineSurfaceTarget.eglSurface = createAndConfigure2;
                    eGLSurface = createAndConfigure2;
                }
                if (eGLSurface == null) {
                    return Unit.INSTANCE;
                }
                EngineSurfaceTarget engineSurfaceTarget2 = (EngineSurfaceTarget) this.this$0;
                engineSurfaceTarget2.engine.frameScheduler.registerTarget(engineSurfaceTarget2.scene, engineSurfaceTarget2.targetId, eGLSurface, this.$width, this.$height, engineSurfaceTarget2.displayRefreshRateHz);
                return Unit.INSTANCE;
            default:
                NetworkingSaveToLinkVerificationViewModel networkingSaveToLinkVerificationViewModel = (NetworkingSaveToLinkVerificationViewModel) this.$surface;
                FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl = networkingSaveToLinkVerificationViewModel.eventTracker;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.$height;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    provideConsumerSession = networkingSaveToLinkVerificationViewModel.consumerSessionProvider.provideConsumerSession();
                    if (provideConsumerSession == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return null;
                    }
                    GetOrFetchSync getOrFetchSync = networkingSaveToLinkVerificationViewModel.getOrFetchSync;
                    this.this$0 = provideConsumerSession;
                    this.$height = 1;
                    invoke$default = GetOrFetchSync.invoke$default(getOrFetchSync, null, this, 3);
                    break;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i = this.$width;
                        cachedConsumerSession = (CachedConsumerSession) this.this$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            obj2 = obj;
                            failure = (ConsumerSession) obj2;
                            Result.Companion companion = Result.Companion;
                        } catch (Throwable th) {
                            th = th;
                            Result.Companion companion2 = Result.Companion;
                            failure = new Result.Failure(th);
                            if (Result.m4120exceptionOrNullimpl(failure) != null) {
                            }
                            SafeTrace.throwOnFailure(failure);
                            financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.Click(NetworkingSaveToLinkVerificationViewModel.PANE, 25));
                            String str = cachedConsumerSession.emailAddress;
                            String str2 = cachedConsumerSession.phoneNumber;
                            String str3 = cachedConsumerSession.clientSecret;
                            IdentifierSpec.Companion.getClass();
                            return new NetworkingSaveToLinkVerificationState.Payload(i == 0, str, str2, new OTPElement(new IdentifierSpec("otp", (ParameterDestination) null, 6), new OTPController()), str3);
                        }
                        if (Result.m4120exceptionOrNullimpl(failure) != null) {
                            financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.SearchScroll(NetworkingSaveToLinkVerificationViewModel.PANE, FinancialConnectionsAnalyticsEvent$VerificationError$Error.StartVerificationSessionError));
                        }
                        SafeTrace.throwOnFailure(failure);
                        financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.Click(NetworkingSaveToLinkVerificationViewModel.PANE, 25));
                        String str4 = cachedConsumerSession.emailAddress;
                        String str22 = cachedConsumerSession.phoneNumber;
                        String str32 = cachedConsumerSession.clientSecret;
                        IdentifierSpec.Companion.getClass();
                        return new NetworkingSaveToLinkVerificationState.Payload(i == 0, str4, str22, new OTPElement(new IdentifierSpec("otp", (ParameterDestination) null, 6), new OTPController()), str32);
                    }
                    provideConsumerSession = (CachedConsumerSession) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    invoke$default = obj;
                }
                int i3 = ((SynchronizeSessionResponse) invoke$default).manifest.accountholderCustomerEmailAddress != null ? 1 : 0;
                Result.Companion companion3 = Result.Companion;
                StartVerification startVerification = networkingSaveToLinkVerificationViewModel.startVerification;
                String str5 = provideConsumerSession.clientSecret;
                this.this$0 = provideConsumerSession;
                this.$width = i3;
                this.$height = 2;
                Object startConsumerVerification = startVerification.consumerSessionRepository.startConsumerVerification(str5, VerificationType.SMS, this);
                if (startConsumerVerification != coroutineSingletons3) {
                    obj2 = startConsumerVerification;
                    cachedConsumerSession = provideConsumerSession;
                    i = i3;
                    failure = (ConsumerSession) obj2;
                    Result.Companion companion4 = Result.Companion;
                    if (Result.m4120exceptionOrNullimpl(failure) != null) {
                    }
                    SafeTrace.throwOnFailure(failure);
                    financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.Click(NetworkingSaveToLinkVerificationViewModel.PANE, 25));
                    String str42 = cachedConsumerSession.emailAddress;
                    String str222 = cachedConsumerSession.phoneNumber;
                    String str322 = cachedConsumerSession.clientSecret;
                    IdentifierSpec.Companion.getClass();
                    return new NetworkingSaveToLinkVerificationState.Payload(i == 0, str42, str222, new OTPElement(new IdentifierSpec("otp", (ParameterDestination) null, 6), new OTPController()), str322);
                }
                return coroutineSingletons3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineSurfaceViewTarget$surfaceChanged$1(NetworkingSaveToLinkVerificationViewModel networkingSaveToLinkVerificationViewModel, Continuation continuation) {
        super(1, continuation);
        this.$r8$classId = 2;
        this.$surface = networkingSaveToLinkVerificationViewModel;
    }
}
