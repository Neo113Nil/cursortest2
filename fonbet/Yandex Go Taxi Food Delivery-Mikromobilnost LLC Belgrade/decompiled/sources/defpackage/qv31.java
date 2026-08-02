package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import coil3.c;
import coil3.util.a;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class qv31 implements t5j0, DefaultLifecycleObserver {
    public final c a;
    public final gev b;
    public final umf c;
    public final Lifecycle w;
    public final l8x x;

    public qv31(c cVar, gev gevVar, umf umfVar, Lifecycle lifecycle, l8x l8xVar) {
        this.a = cVar;
        this.b = gevVar;
        this.c = umfVar;
        this.w = lifecycle;
        this.x = l8xVar;
    }

    @Override // defpackage.t5j0
    public final void I() {
        umf umfVar = this.c;
        if (umfVar.a.isAttachedToWindow()) {
            return;
        }
        qje.v(umfVar.a).setRequest(this);
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // defpackage.t5j0
    public final Object J(Continuation continuation) {
        Object a;
        Lifecycle lifecycle = this.w;
        return (lifecycle == null || (a = a.a(lifecycle, (ContinuationImpl) continuation)) != CoroutineSingletons.COROUTINE_SUSPENDED) ? zy11.a : a;
    }

    public final void a() {
        this.x.a(null);
        Object obj = this.c;
        boolean z = obj instanceof oey;
        Lifecycle lifecycle = this.w;
        if (z && lifecycle != null) {
            lifecycle.d((oey) obj);
        }
        if (lifecycle != null) {
            lifecycle.d(this);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(pey peyVar) {
        qje.v(this.c.a).dispose();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.t5j0
    public final void start() {
        Lifecycle lifecycle = this.w;
        if (lifecycle != null) {
            lifecycle.a(this);
        }
        umf umfVar = this.c;
        if ((umfVar instanceof oey) && lifecycle != null) {
            oey oeyVar = (oey) umfVar;
            lifecycle.d(oeyVar);
            lifecycle.a(oeyVar);
        }
        qje.v(umfVar.a).setRequest(this);
    }
}
