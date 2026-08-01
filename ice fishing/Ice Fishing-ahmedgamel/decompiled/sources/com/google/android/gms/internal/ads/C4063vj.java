package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.vj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4063vj implements InterfaceC3927t8 {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC4061vh f34723n;

    /* renamed from: u, reason: collision with root package name */
    public final Executor f34724u;

    /* renamed from: v, reason: collision with root package name */
    public final AtomicReference f34725v = new AtomicReference();

    public C4063vj(InterfaceC4061vh interfaceC4061vh, Executor executor) {
        this.f34723n = interfaceC4061vh;
        this.f34724u = executor;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3927t8
    public final synchronized void f(C3873s8 c3873s8) {
        InterfaceC4061vh interfaceC4061vh = this.f34723n;
        if (interfaceC4061vh != null) {
            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.be)).booleanValue()) {
                if (c3873s8.f33899j) {
                    AtomicReference atomicReference = this.f34725v;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        this.f34724u.execute(new RunnableC4009uj(interfaceC4061vh, 1));
                    }
                } else {
                    AtomicReference atomicReference2 = this.f34725v;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        this.f34724u.execute(new RunnableC4009uj(interfaceC4061vh, 0));
                    }
                }
            }
        }
    }
}
