package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.w;

/* loaded from: classes10.dex */
public final class sdy implements oey {
    public final tdy a;
    public final pey b;

    public sdy(pey peyVar, tdy tdyVar) {
        this.b = peyVar;
        this.a = tdyVar;
    }

    @w(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(pey peyVar) {
        this.a.m(peyVar);
    }

    @w(Lifecycle.Event.ON_START)
    public void onStart(pey peyVar) {
        this.a.g(peyVar);
    }

    @w(Lifecycle.Event.ON_STOP)
    public void onStop(pey peyVar) {
        this.a.h(peyVar);
    }
}
