package com.squareup.cash.initialscreenloader.backend;

import androidx.glance.session.SessionWorkerKt$runSession$snapshotMonitor$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.profile.devicemanager.backend.RealDeviceManagerRepo;
import com.squareup.cash.session.backend.RealSessionRefresher;
import com.squareup.cash.session.backend.SessionManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class RealInitialScreenLoader$resetSandbox$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ RealInitialScreenLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealInitialScreenLoader$resetSandbox$2(RealInitialScreenLoader realInitialScreenLoader, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realInitialScreenLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        RealInitialScreenLoader realInitialScreenLoader = this.this$0;
        switch (i) {
            case 0:
                return new RealInitialScreenLoader$resetSandbox$2(realInitialScreenLoader, continuation, 0);
            case 1:
                return new RealInitialScreenLoader$resetSandbox$2(realInitialScreenLoader, continuation, 1);
            case 2:
                return new RealInitialScreenLoader$resetSandbox$2(realInitialScreenLoader, continuation, 2);
            default:
                return new RealInitialScreenLoader$resetSandbox$2(realInitialScreenLoader, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealInitialScreenLoader$resetSandbox$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b7, code lost:
    
        if (kotlinx.coroutines.JobKt.withTimeoutOrNull(r2, r8, r7) == r0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009a, code lost:
    
        if (r8.delete(r2, r7) == r0) goto L45;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        RealInitialScreenLoader realInitialScreenLoader = this.this$0;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                int i3 = 2;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SessionManager sessionManager = realInitialScreenLoader.sessionManager;
                    SessionManager.DeletionMode deletionMode = SessionManager.DeletionMode.ALL;
                    this.label = 1;
                    break;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        Timber.Forest.e("Sandbox failed to tear down.", new Object[0]);
                        realInitialScreenLoader.activityFinisher.finish();
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                Duration.Companion companion = Duration.Companion;
                long m4167getInWholeMillisecondsimpl = Duration.m4167getInWholeMillisecondsimpl(DurationKt.toDuration(10, DurationUnit.SECONDS));
                SessionWorkerKt$runSession$snapshotMonitor$1 sessionWorkerKt$runSession$snapshotMonitor$1 = new SessionWorkerKt$runSession$snapshotMonitor$1(i3, continuation, 6);
                this.label = 2;
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealSessionRefresher realSessionRefresher = realInitialScreenLoader.sessionRefresher;
                    this.label = 1;
                    if (realSessionRefresher.refreshSession(this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 != 0) {
                    if (i5 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                RealColdStartIntegrityChecker realColdStartIntegrityChecker = realInitialScreenLoader.coldStartIntegrityChecker;
                ColdStartIntegrityChecker$TriggeredBy coldStartIntegrityChecker$TriggeredBy = ColdStartIntegrityChecker$TriggeredBy.APP_STARTUP_SIGNED_IN;
                this.label = 1;
                Object coroutineScope = JobKt.coroutineScope(new RealColdStartIntegrityChecker$checkIntegrityWithRetry$2(realColdStartIntegrityChecker, coldStartIntegrityChecker$TriggeredBy, true, null), this);
                return coroutineScope == coroutineSingletons3 ? coroutineSingletons3 : coroutineScope;
            default:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealDeviceManagerRepo realDeviceManagerRepo = realInitialScreenLoader.deviceUpdater;
                    this.label = 1;
                    if (realDeviceManagerRepo.updateDeviceDetails(this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
