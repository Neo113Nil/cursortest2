package androidx.camera.camera2.pipe.internal;

import androidx.camera.camera2.pipe.core.MutexToken;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class GraphSessionLock {
    public final MutexImpl mutex = new MutexImpl();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object acquireToken$camera_camera2_pipe(ContinuationImpl continuationImpl) {
        GraphSessionLock$acquireToken$1 graphSessionLock$acquireToken$1;
        int i;
        MutexImpl mutexImpl;
        if (continuationImpl instanceof GraphSessionLock$acquireToken$1) {
            graphSessionLock$acquireToken$1 = (GraphSessionLock$acquireToken$1) continuationImpl;
            int i2 = graphSessionLock$acquireToken$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                graphSessionLock$acquireToken$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = graphSessionLock$acquireToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = graphSessionLock$acquireToken$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutexImpl = this.mutex;
                    graphSessionLock$acquireToken$1.L$0 = mutexImpl;
                    graphSessionLock$acquireToken$1.label = 1;
                    if (mutexImpl.lock(graphSessionLock$acquireToken$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutexImpl = graphSessionLock$acquireToken$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                return new MutexToken(mutexImpl);
            }
        }
        graphSessionLock$acquireToken$1 = new GraphSessionLock$acquireToken$1(this, continuationImpl);
        Object obj2 = graphSessionLock$acquireToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = graphSessionLock$acquireToken$1.label;
        if (i != 0) {
        }
        return new MutexToken(mutexImpl);
    }
}
