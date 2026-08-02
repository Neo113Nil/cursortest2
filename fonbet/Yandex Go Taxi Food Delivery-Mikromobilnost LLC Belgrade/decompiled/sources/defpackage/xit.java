package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;

/* loaded from: classes10.dex */
public final class xit extends Lifecycle {
    public static final xit b = new xit();
    public static final wit c = new wit();

    @Override // androidx.lifecycle.Lifecycle
    public final void a(oey oeyVar) {
        if (!(oeyVar instanceof DefaultLifecycleObserver)) {
            w511.g(oeyVar, " must implement androidx.lifecycle.DefaultLifecycleObserver.");
            return;
        }
        DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) oeyVar;
        wit witVar = c;
        defaultLifecycleObserver.onCreate(witVar);
        defaultLifecycleObserver.onStart(witVar);
        defaultLifecycleObserver.onResume(witVar);
    }

    @Override // androidx.lifecycle.Lifecycle
    public final Lifecycle.State b() {
        return Lifecycle.State.RESUMED;
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void d(oey oeyVar) {
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
