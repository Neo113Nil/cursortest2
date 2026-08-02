package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;
import flex.engine.a;

/* loaded from: classes9.dex */
public final class zxl implements DefaultLifecycleObserver {
    public boolean a;
    public final /* synthetic */ a b;

    public zxl(a aVar) {
        this.b = aVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(pey peyVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(pey peyVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(pey peyVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(pey peyVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(pey peyVar) {
        if (this.a) {
            this.b.P.z(fzl.a);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(pey peyVar) {
        this.b.P.z(dzl.a);
        this.a = true;
    }
}
