package defpackage;

import com.ybsdk.core.utils.c;
import kotlin.a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public abstract class uc5 extends yr31 implements d6v {
    public final n0 A;
    public final /* synthetic */ c b = new c();
    public final ev31 c;
    public final i3y w;
    public final n0 x;
    public final cd0 y;
    public final i3y z;

    public uc5(sls slsVar, ev31 ev31Var) {
        this.c = ev31Var;
        int i = 9;
        this.w = a.a(new jc0(i, slsVar));
        n0 c = ffx.c(0, 16, BufferOverflow.DROP_OLDEST, 1);
        this.x = c;
        this.y = new cd0(8, Y(), this);
        this.z = a.a(new l95(i, this));
        this.A = c;
    }

    @Override // defpackage.d6v
    public final Object B(Object obj, sls slsVar, tls tlsVar, wls wlsVar, ContinuationImpl continuationImpl) {
        Object B = this.b.B(obj, slsVar, tlsVar, wlsVar, continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return B;
    }

    @Override // defpackage.d6v
    public final Object O(wls wlsVar, Object obj, Continuation continuation) {
        Object O = this.b.O(wlsVar, obj, continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return O;
    }

    public final void W(Object obj, Throwable th) {
        c cVar = this.b;
        cVar.getClass();
        if (com.ybsdk.core.utils.ext.c.b(th)) {
            cVar.a.remove(obj);
        }
    }

    public final Object X() {
        return ((r0) Y()).getValue();
    }

    public final pz40 Y() {
        return (pz40) this.w.getValue();
    }

    public final void Z(qas0 qas0Var) {
        this.x.g(qas0Var);
    }

    public final void a0(tls tlsVar) {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, tlsVar.invoke(value)));
    }

    @Override // defpackage.d6v
    public final String i(String str) {
        return this.b.i(str);
    }
}
