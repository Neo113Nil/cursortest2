package androidx.glance.session;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class SessionManagerImpl implements SessionManager {
    public final MutexImpl mutex = new MutexImpl();
    public final SessionManagerImpl$scope$1 scope = new SessionManagerImpl$scope$1(this);

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
    
        if (r9.lock(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object runWithLock(Function2 function2, ContinuationImpl continuationImpl) {
        SessionManagerImpl$runWithLock$1 sessionManagerImpl$runWithLock$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        MutexImpl mutexImpl;
        Function2 function22;
        Mutex mutex;
        Object invoke;
        try {
            if (continuationImpl instanceof SessionManagerImpl$runWithLock$1) {
                sessionManagerImpl$runWithLock$1 = (SessionManagerImpl$runWithLock$1) continuationImpl;
                int i2 = sessionManagerImpl$runWithLock$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    sessionManagerImpl$runWithLock$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = sessionManagerImpl$runWithLock$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = sessionManagerImpl$runWithLock$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        sessionManagerImpl$runWithLock$1.L$0 = this;
                        sessionManagerImpl$runWithLock$1.L$1 = (SuspendLambda) function2;
                        mutexImpl = this.mutex;
                        sessionManagerImpl$runWithLock$1.L$2 = mutexImpl;
                        sessionManagerImpl$runWithLock$1.label = 1;
                        function22 = function2;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mutex = (Mutex) sessionManagerImpl$runWithLock$1.L$0;
                            try {
                                SafeTrace.throwOnFailure(obj);
                                mutex.unlock(null);
                                return obj;
                            } catch (Throwable th) {
                                th = th;
                                mutex.unlock(null);
                                throw th;
                            }
                        }
                        MutexImpl mutexImpl2 = sessionManagerImpl$runWithLock$1.L$2;
                        Function2 function23 = (Function2) sessionManagerImpl$runWithLock$1.L$1;
                        SessionManagerImpl sessionManagerImpl = (SessionManagerImpl) sessionManagerImpl$runWithLock$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = mutexImpl2;
                        this = sessionManagerImpl;
                        function22 = function23;
                    }
                    SessionManagerImpl$scope$1 sessionManagerImpl$scope$1 = this.scope;
                    sessionManagerImpl$runWithLock$1.L$0 = mutexImpl;
                    sessionManagerImpl$runWithLock$1.L$1 = null;
                    sessionManagerImpl$runWithLock$1.L$2 = null;
                    sessionManagerImpl$runWithLock$1.label = 2;
                    invoke = function22.invoke(sessionManagerImpl$scope$1, sessionManagerImpl$runWithLock$1);
                    if (invoke != coroutineSingletons) {
                        MutexImpl mutexImpl3 = mutexImpl;
                        obj = invoke;
                        mutex = mutexImpl3;
                        mutex.unlock(null);
                        return obj;
                    }
                    return coroutineSingletons;
                }
            }
            SessionManagerImpl$scope$1 sessionManagerImpl$scope$12 = this.scope;
            sessionManagerImpl$runWithLock$1.L$0 = mutexImpl;
            sessionManagerImpl$runWithLock$1.L$1 = null;
            sessionManagerImpl$runWithLock$1.L$2 = null;
            sessionManagerImpl$runWithLock$1.label = 2;
            invoke = function22.invoke(sessionManagerImpl$scope$12, sessionManagerImpl$runWithLock$1);
            if (invoke != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            mutex = mutexImpl;
            mutex.unlock(null);
            throw th;
        }
        sessionManagerImpl$runWithLock$1 = new SessionManagerImpl$runWithLock$1(this, continuationImpl);
        Object obj2 = sessionManagerImpl$runWithLock$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sessionManagerImpl$runWithLock$1.label;
        if (i != 0) {
        }
    }
}
