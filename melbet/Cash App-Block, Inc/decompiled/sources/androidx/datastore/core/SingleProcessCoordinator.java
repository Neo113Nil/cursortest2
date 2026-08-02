package androidx.datastore.core;

import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.memory.MemoryCacheService;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class SingleProcessCoordinator {
    public final MutexImpl mutex = new MutexImpl();
    public final MemoryCacheService version = new MemoryCacheService(16);
    public final SafeFlow updateNotifications = new SafeFlow(new SingleProcessCoordinator$updateNotifications$1(2, null));

    public SingleProcessCoordinator(String str) {
    }

    public final Integer getVersion() {
        return new Integer(((AtomicInteger) this.version.imageLoader).get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r8 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.datastore.core.SingleProcessCoordinator] */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object lock(Function1 function1, ContinuationImpl continuationImpl) {
        SingleProcessCoordinator$lock$1 singleProcessCoordinator$lock$1;
        int i;
        MutexImpl mutexImpl;
        try {
            if (continuationImpl instanceof SingleProcessCoordinator$lock$1) {
                singleProcessCoordinator$lock$1 = (SingleProcessCoordinator$lock$1) continuationImpl;
                int i2 = singleProcessCoordinator$lock$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    singleProcessCoordinator$lock$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = singleProcessCoordinator$lock$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = singleProcessCoordinator$lock$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        singleProcessCoordinator$lock$1.L$0 = function1;
                        MutexImpl mutexImpl2 = this.mutex;
                        singleProcessCoordinator$lock$1.L$1 = mutexImpl2;
                        singleProcessCoordinator$lock$1.label = 1;
                        Object lock = mutexImpl2.lock(singleProcessCoordinator$lock$1);
                        mutexImpl = mutexImpl2;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Mutex mutex = (Mutex) singleProcessCoordinator$lock$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                            this = mutex;
                            return obj;
                        }
                        MutexImpl mutexImpl3 = singleProcessCoordinator$lock$1.L$1;
                        function1 = (Function1) singleProcessCoordinator$lock$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = mutexImpl3;
                    }
                    singleProcessCoordinator$lock$1.L$0 = mutexImpl;
                    singleProcessCoordinator$lock$1.L$1 = null;
                    singleProcessCoordinator$lock$1.label = 2;
                    obj = function1.invoke(singleProcessCoordinator$lock$1);
                    this = mutexImpl;
                }
            }
            if (i != 0) {
            }
            singleProcessCoordinator$lock$1.L$0 = mutexImpl;
            singleProcessCoordinator$lock$1.L$1 = null;
            singleProcessCoordinator$lock$1.label = 2;
            obj = function1.invoke(singleProcessCoordinator$lock$1);
            this = mutexImpl;
        } finally {
            this.unlock(null);
        }
        singleProcessCoordinator$lock$1 = new SingleProcessCoordinator$lock$1(this, continuationImpl);
        Object obj2 = singleProcessCoordinator$lock$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = singleProcessCoordinator$lock$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object tryLock(Function2 function2, ContinuationImpl continuationImpl) {
        SingleProcessCoordinator$tryLock$1 singleProcessCoordinator$tryLock$1;
        int i;
        MutexImpl mutexImpl;
        boolean z;
        Throwable th;
        if (continuationImpl instanceof SingleProcessCoordinator$tryLock$1) {
            singleProcessCoordinator$tryLock$1 = (SingleProcessCoordinator$tryLock$1) continuationImpl;
            int i2 = singleProcessCoordinator$tryLock$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                singleProcessCoordinator$tryLock$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = singleProcessCoordinator$tryLock$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = singleProcessCoordinator$tryLock$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutexImpl mutexImpl2 = this.mutex;
                    boolean tryLock = mutexImpl2.tryLock(null);
                    try {
                        Object valueOf = Boolean.valueOf(tryLock);
                        singleProcessCoordinator$tryLock$1.L$0 = mutexImpl2;
                        singleProcessCoordinator$tryLock$1.Z$0 = tryLock;
                        singleProcessCoordinator$tryLock$1.label = 1;
                        Object invoke = function2.invoke(valueOf, singleProcessCoordinator$tryLock$1);
                        if (invoke == obj2) {
                            return obj2;
                        }
                        mutexImpl = mutexImpl2;
                        z = tryLock;
                        obj = invoke;
                    } catch (Throwable th2) {
                        mutexImpl = mutexImpl2;
                        z = tryLock;
                        th = th2;
                        if (z) {
                            mutexImpl.unlock(null);
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = singleProcessCoordinator$tryLock$1.Z$0;
                    mutexImpl = singleProcessCoordinator$tryLock$1.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        if (z) {
                        }
                        throw th;
                    }
                }
                if (z) {
                    mutexImpl.unlock(null);
                }
                return obj;
            }
        }
        singleProcessCoordinator$tryLock$1 = new SingleProcessCoordinator$tryLock$1(this, continuationImpl);
        Object obj3 = singleProcessCoordinator$tryLock$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = singleProcessCoordinator$tryLock$1.label;
        if (i != 0) {
        }
        if (z) {
        }
        return obj3;
    }
}
