package com.squareup.cash.gcl;

import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.gcl.GlobalConfigManager$RefreshResult;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.wire.GrpcMethod;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealGlobalConfigManager$tryRefreshCache$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ RealGlobalConfigManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealGlobalConfigManager$tryRefreshCache$2(RealGlobalConfigManager realGlobalConfigManager, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realGlobalConfigManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        RealGlobalConfigManager realGlobalConfigManager = this.this$0;
        switch (i) {
            case 0:
                return new RealGlobalConfigManager$tryRefreshCache$2(realGlobalConfigManager, continuation, 0);
            default:
                return new RealGlobalConfigManager$tryRefreshCache$2(realGlobalConfigManager, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealGlobalConfigManager$tryRefreshCache$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        GlobalConfigManager$RefreshResult.Success success = GlobalConfigManager$RefreshResult.Success.INSTANCE;
        RealGlobalConfigManager realGlobalConfigManager = this.this$0;
        Continuation continuation = null;
        int i2 = 1;
        switch (i) {
            case 0:
                SessionManager sessionManager = realGlobalConfigManager.sessionManager;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!(PlatformKt.getCurrentSessionState(sessionManager) instanceof SessionState.Initiated)) {
                        return GlobalConfigManager$RefreshResult.NotYetInitiated.INSTANCE;
                    }
                    if (PlatformKt.hasOnboardedAccount(sessionManager) || (PlatformKt.getCurrentSessionState(sessionManager) instanceof SessionState.Authenticated)) {
                        return success;
                    }
                    long j = RealGlobalConfigManager.globalConfigTimeout;
                    RealGlobalConfigManager$tryRefreshCache$2 realGlobalConfigManager$tryRefreshCache$2 = new RealGlobalConfigManager$tryRefreshCache$2(realGlobalConfigManager, continuation, i2);
                    this.label = 1;
                    obj = JobKt.m4185withTimeoutOrNullKLykuaI(j, realGlobalConfigManager$tryRefreshCache$2, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                GlobalConfigManager$RefreshResult.Success success2 = (GlobalConfigManager$RefreshResult.Success) obj;
                return success2 != null ? success2 : new GlobalConfigManager$RefreshResult.Failure(RefreshTimeoutException.INSTANCE);
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    GrpcMethod grpcMethod = realGlobalConfigManager.onboardingConfigManager;
                    this.label = 1;
                    return grpcMethod.fetchOnboardingConfig(this) == coroutineSingletons2 ? coroutineSingletons2 : success;
                }
                if (i4 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return success;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
