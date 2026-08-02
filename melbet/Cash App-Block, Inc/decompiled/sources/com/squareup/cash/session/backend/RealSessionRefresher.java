package com.squareup.cash.session.backend;

import androidx.glance.session.SessionWorker$doWork$2$2;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.deviceintegrity.RealDeviceIntegrityAttester;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.util.android.RealBackupService;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealSessionRefresher {
    public final AppService appService;
    public final RealBackupService backupService;
    public final RealDeviceIntegrityAttester deviceIntegrityAttester;
    public final SessionManager sessionManager;
    public final Signal signOut;

    public RealSessionRefresher(AppService appService, Signal signal, SessionManager sessionManager, RealBackupService realBackupService, RealDeviceIntegrityAttester realDeviceIntegrityAttester) {
        this.appService = appService;
        this.signOut = signal;
        this.sessionManager = sessionManager;
        this.backupService = realBackupService;
        this.deviceIntegrityAttester = realDeviceIntegrityAttester;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refreshSession(ContinuationImpl continuationImpl) {
        RealSessionRefresher$refreshSession$1 realSessionRefresher$refreshSession$1;
        int i;
        if (continuationImpl instanceof RealSessionRefresher$refreshSession$1) {
            realSessionRefresher$refreshSession$1 = (RealSessionRefresher$refreshSession$1) continuationImpl;
            int i2 = realSessionRefresher$refreshSession$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realSessionRefresher$refreshSession$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realSessionRefresher$refreshSession$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realSessionRefresher$refreshSession$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!(PlatformKt.getCurrentSessionState(this.sessionManager) instanceof SessionState.Authenticated)) {
                        return Unit.INSTANCE;
                    }
                    realSessionRefresher$refreshSession$1.label = 1;
                    obj = this.backupService.readBackupTag(realSessionRefresher$refreshSession$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                SessionWorker$doWork$2$2 sessionWorker$doWork$2$2 = new SessionWorker$doWork$2$2(this, (String) obj, continuation, 21);
                realSessionRefresher$refreshSession$1.label = 2;
                Object until = StateFlowKt.until(this.signOut, sessionWorker$doWork$2$2, realSessionRefresher$refreshSession$1);
                return until != coroutineSingletons ? coroutineSingletons : until;
            }
        }
        realSessionRefresher$refreshSession$1 = new RealSessionRefresher$refreshSession$1(this, continuationImpl);
        Object obj2 = realSessionRefresher$refreshSession$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSessionRefresher$refreshSession$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        SessionWorker$doWork$2$2 sessionWorker$doWork$2$22 = new SessionWorker$doWork$2$2(this, (String) obj2, continuation2, 21);
        realSessionRefresher$refreshSession$1.label = 2;
        Object until2 = StateFlowKt.until(this.signOut, sessionWorker$doWork$2$22, realSessionRefresher$refreshSession$1);
        if (until2 != coroutineSingletons2) {
        }
    }
}
