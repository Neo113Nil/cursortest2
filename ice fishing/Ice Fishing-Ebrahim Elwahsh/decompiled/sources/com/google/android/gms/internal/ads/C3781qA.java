package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkCapabilities;
import android.view.View;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.gms.internal.ads.qA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3781qA implements InterfaceC3673oA, By {

    /* renamed from: a, reason: collision with root package name */
    public final Context f33662a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f33663b;

    /* renamed from: c, reason: collision with root package name */
    public NetworkCapabilities f33664c = null;

    public C3781qA(Context context, ExecutorService executorService) {
        this.f33662a = context;
        this.f33663b = executorService;
    }

    @Override // com.google.android.gms.internal.ads.By
    public final J3.a a() {
        RunnableFutureC3083dE runnableFutureC3083dE = new RunnableFutureC3083dE(Executors.callable(new RunnableC3873rw(7, this), null));
        this.f33663b.execute(runnableFutureC3083dE);
        return runnableFutureC3083dE;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3673oA
    public final void c(HashMap hashMap) {
        NetworkCapabilities networkCapabilities;
        long j9;
        synchronized (this) {
            networkCapabilities = this.f33664c;
        }
        hashMap.put("ntc", networkCapabilities);
        synchronized (this) {
            try {
                NetworkCapabilities networkCapabilities2 = this.f33664c;
                if (networkCapabilities2 != null) {
                    if (networkCapabilities2.hasTransport(4)) {
                        j9 = 2;
                    } else if (this.f33664c.hasTransport(1)) {
                        j9 = 1;
                    } else if (this.f33664c.hasTransport(0)) {
                        j9 = 0;
                    }
                }
                j9 = -1;
            } finally {
            }
        }
        hashMap.put(com.anythink.expressad.foundation.g.a.f19233W, Long.valueOf(j9));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3673oA
    public final void b(HashMap hashMap) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3673oA
    public final void d(HashMap hashMap, Context context, View view) {
    }
}
