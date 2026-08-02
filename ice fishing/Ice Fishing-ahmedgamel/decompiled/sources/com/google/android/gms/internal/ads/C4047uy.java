package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.uy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4047uy implements InterfaceC3832qy {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f35378a = Executors.newSingleThreadScheduledExecutor();

    @Override // com.google.android.gms.internal.ads.InterfaceC3832qy
    public final void a(Runnable runnable, long j6) {
        this.f35378a.schedule(runnable, j6, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3832qy
    public final void f() {
    }
}
