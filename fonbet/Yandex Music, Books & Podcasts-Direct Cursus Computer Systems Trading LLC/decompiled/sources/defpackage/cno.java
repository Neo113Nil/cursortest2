package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraService;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class cno implements Continuation, om6 {

    @NotNull
    private static final bno b = new bno(null);
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(cno.class, Object.class, CameraService.RESULT);
    public final Continuation a;
    private volatile Object result;

    public cno(Continuation continuation, nm6 nm6Var) {
        continuation.getClass();
        this.a = continuation;
        this.result = nm6Var;
    }

    public final Object a() {
        Object obj = this.result;
        nm6 nm6Var = nm6.b;
        if (obj == nm6Var) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            nm6 nm6Var2 = nm6.a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nm6Var, nm6Var2)) {
                if (atomicReferenceFieldUpdater.get(this) != nm6Var) {
                    obj = this.result;
                }
            }
            return nm6.a;
        }
        if (obj == nm6.c) {
            return nm6.a;
        }
        if (obj instanceof t7o) {
            throw ((t7o) obj).a;
        }
        return obj;
    }

    @Override // defpackage.om6
    public final om6 getCallerFrame() {
        Continuation continuation = this.a;
        if (continuation instanceof om6) {
            return (om6) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.a.getContext();
    }

    @Override // defpackage.om6
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            nm6 nm6Var = nm6.b;
            if (obj2 == nm6Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, nm6Var, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != nm6Var) {
                        break;
                    }
                }
                return;
            }
            nm6 nm6Var2 = nm6.a;
            if (obj2 != nm6Var2) {
                xq0.q("Already resumed");
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = c;
            nm6 nm6Var3 = nm6.c;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, nm6Var2, nm6Var3)) {
                if (atomicReferenceFieldUpdater2.get(this) != nm6Var2) {
                    break;
                }
            }
            this.a.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cno(Continuation continuation) {
        this(continuation, nm6.b);
        continuation.getClass();
    }
}
