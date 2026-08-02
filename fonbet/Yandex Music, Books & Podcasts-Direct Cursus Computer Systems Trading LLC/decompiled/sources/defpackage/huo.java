package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public class huo extends a6 implements om6 {
    public final Continuation d;

    public huo(Continuation continuation, CoroutineContext coroutineContext) {
        super(coroutineContext, true, true);
        this.d = continuation;
    }

    @Override // defpackage.h3f
    public final boolean T() {
        return true;
    }

    @Override // defpackage.om6
    public final om6 getCallerFrame() {
        Continuation continuation = this.d;
        if (continuation instanceof om6) {
            return (om6) continuation;
        }
        return null;
    }

    @Override // defpackage.om6
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.h3f
    public void p(Object obj) {
        Continuation continuation = this.d;
        w98.a(ild.B(obj, continuation), qxe.b(continuation));
    }

    @Override // defpackage.h3f
    public void q(Object obj) {
        Continuation continuation = this.d;
        continuation.resumeWith(ild.B(obj, continuation));
    }

    public void p0() {
    }
}
