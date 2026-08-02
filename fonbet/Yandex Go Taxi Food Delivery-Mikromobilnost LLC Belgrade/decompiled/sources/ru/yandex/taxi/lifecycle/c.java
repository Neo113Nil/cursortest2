package ru.yandex.taxi.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import defpackage.cfy;
import defpackage.ffy;
import defpackage.o950;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tls;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.e;

/* loaded from: classes9.dex */
public abstract class c {
    public static final void a(Lifecycle lifecycle, Runnable runnable) {
        if (lifecycle.b() == Lifecycle.State.DESTROYED) {
            runnable.run();
        } else {
            lifecycle.a(new cfy(lifecycle, runnable));
        }
    }

    public static final pzt0 b(o950 o950Var, CoroutineStart coroutineStart, tls tlsVar) {
        if (o950Var.w.a(Lifecycle.State.STARTED)) {
            return tje.N(r.a(o950Var), null, coroutineStart, new LifecycleUtils$launchIfStarted$1(o950Var, tlsVar, null), 1);
        }
        return null;
    }

    public static final void d(Lifecycle lifecycle, Lifecycle.Event event, tls tlsVar) {
        lifecycle.a(new ffy(event, tje.N(r.a(lifecycle), null, null, new LifecycleUtils$launchUntil$job$1(tlsVar, null), 3), lifecycle));
    }

    public static final Object e(Lifecycle lifecycle, Lifecycle.Event event, ContinuationImpl continuationImpl) {
        return e.j(e.T(new b(r.b(lifecycle), event), 1), continuationImpl);
    }
}
