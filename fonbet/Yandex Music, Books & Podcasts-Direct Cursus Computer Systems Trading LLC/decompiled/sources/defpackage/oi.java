package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public class oi extends oc4 implements qln {
    public oi(CoroutineContext coroutineContext, zi3 zi3Var, boolean z) {
        super(coroutineContext, zi3Var, false, z);
        Q((r2f) coroutineContext.get(o6c.l));
    }

    @Override // defpackage.h3f
    public final boolean M(Throwable th) {
        cxb.V(th, this.c);
        return true;
    }

    @Override // defpackage.h3f
    public final void b0(Throwable th) {
        if (th != null) {
            r0 = th instanceof CancellationException ? (CancellationException) th : null;
            if (r0 == null) {
                r0 = n7w.c(getClass().getSimpleName().concat(" was cancelled"), th);
            }
        }
        this.d.g(r0);
    }
}
