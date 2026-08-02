package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.vj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4086vj implements InterfaceC3950t8 {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC4084vh f35480n;

    /* renamed from: u, reason: collision with root package name */
    public final Executor f35481u;

    /* renamed from: v, reason: collision with root package name */
    public final AtomicReference f35482v = new AtomicReference();

    public C4086vj(InterfaceC4084vh interfaceC4084vh, Executor executor) {
        this.f35480n = interfaceC4084vh;
        this.f35481u = executor;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3950t8
    public final synchronized void f(C3896s8 c3896s8) {
        InterfaceC4084vh interfaceC4084vh = this.f35480n;
        if (interfaceC4084vh != null) {
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.be)).booleanValue()) {
                if (c3896s8.f34667j) {
                    AtomicReference atomicReference = this.f35482v;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        this.f35481u.execute(new RunnableC4032uj(interfaceC4084vh, 1));
                    }
                } else {
                    AtomicReference atomicReference2 = this.f35482v;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        this.f35481u.execute(new RunnableC4032uj(interfaceC4084vh, 0));
                    }
                }
            }
        }
    }
}
