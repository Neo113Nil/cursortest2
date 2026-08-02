package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import coil3.util.a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class uey implements t5j0, DefaultLifecycleObserver {
    public final Lifecycle a;
    public final l8x b;

    public uey(Lifecycle lifecycle, l8x l8xVar) {
        this.a = lifecycle;
        this.b = l8xVar;
    }

    @Override // defpackage.t5j0
    public final Object J(Continuation continuation) {
        Object a = a.a(this.a, (ContinuationImpl) continuation);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }

    @Override // defpackage.t5j0
    public final void e() {
        this.a.d(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(pey peyVar) {
        this.b.a(null);
    }

    @Override // defpackage.t5j0
    public final void start() {
        this.a.a(this);
    }
}
