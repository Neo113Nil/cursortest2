package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class I5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final List f4530a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f4531b = C0610na.k().w().a();

    /* renamed from: c, reason: collision with root package name */
    public final WaitForActivationDelayBarrier f4532c = C0610na.k().a();

    public I5(List list) {
        this.f4530a = list;
    }

    public static final void a(I5 i5) {
        Iterator it = i5.f4530a.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4532c.subscribe(TimeUnit.SECONDS.toMillis(10L), this.f4531b, new E0.a(7, this));
    }
}
