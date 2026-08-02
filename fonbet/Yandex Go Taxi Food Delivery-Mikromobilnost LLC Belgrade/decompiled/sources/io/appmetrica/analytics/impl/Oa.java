package io.appmetrica.analytics.impl;

import defpackage.iy2;
import defpackage.jl40;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.impl.InterfaceC0309ej;
import io.appmetrica.analytics.impl.Oa;

/* loaded from: classes9.dex */
public final class Oa implements InterfaceC0194aj {
    public final InterfaceC0194aj a;
    public final ICommonExecutor b;

    public Oa(InterfaceC0194aj interfaceC0194aj, ICommonExecutor iCommonExecutor) {
        this.a = interfaceC0194aj;
        this.b = iCommonExecutor;
    }

    public static final void a(Thread thread, Wi wi, Oa oa, InterfaceC0309ej interfaceC0309ej) {
        if (jl40.l(Thread.currentThread(), thread)) {
            wi.a(interfaceC0309ej);
        } else {
            oa.b.execute(new iy2(24, wi, interfaceC0309ej));
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0194aj
    public final void a(Wi wi) {
        this.b.execute(new iy2(25, this, wi));
    }

    public static final void a(final Oa oa, final Wi wi) {
        final Thread currentThread = Thread.currentThread();
        oa.a.a(new Wi() { // from class: bp60
            @Override // io.appmetrica.analytics.impl.Wi
            public final void a(InterfaceC0309ej interfaceC0309ej) {
                Oa.a(currentThread, wi, oa, interfaceC0309ej);
            }
        });
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0194aj
    public final String a() {
        return this.a.a();
    }

    public static final void a(Wi wi, InterfaceC0309ej interfaceC0309ej) {
        wi.a(interfaceC0309ej);
    }
}
