package defpackage;

import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* loaded from: classes9.dex */
public final class zx11 extends fbp0 {
    private volatile boolean threadLocalIsSet;
    public final ThreadLocal z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zx11(fse fseVar, Continuation continuation) {
        super(fseVar.get(r0) == null ? fseVar.plus(r0) : fseVar, continuation);
        hwk0 hwk0Var = hwk0.c;
        this.z = new ThreadLocal();
        if (continuation.get_context().get(x4c.K) instanceof jse) {
            return;
        }
        Object H = gwk0.H(fseVar, null);
        gwk0.x(fseVar, H);
        q0(fseVar, H);
    }

    @Override // defpackage.fbp0
    public final void n0() {
        p0();
    }

    public final boolean o0() {
        boolean z = this.threadLocalIsSet && this.z.get() == null;
        this.z.remove();
        return !z;
    }

    public final void p0() {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.z.get();
            if (pair != null) {
                gwk0.x((fse) pair.getFirst(), pair.getSecond());
            }
            this.z.remove();
        }
    }

    public final void q0(fse fseVar, Object obj) {
        this.threadLocalIsSet = true;
        this.z.set(new Pair(fseVar, obj));
    }

    @Override // defpackage.fbp0, kotlinx.coroutines.c
    public final void r(Object obj) {
        p0();
        Object M = udq0.M(obj);
        Continuation continuation = this.y;
        fse fseVar = continuation.get_context();
        Object H = gwk0.H(fseVar, null);
        zx11 n0 = H != gwk0.d ? q5z.n0(continuation, fseVar, H) : null;
        try {
            continuation.resumeWith(M);
            if (n0 == null || n0.o0()) {
                gwk0.x(fseVar, H);
            }
        } catch (Throwable th) {
            if (n0 == null || n0.o0()) {
                gwk0.x(fseVar, H);
            }
            throw th;
        }
    }
}
