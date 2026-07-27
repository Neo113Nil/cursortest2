package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkCapabilities;
import android.view.View;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.gms.internal.ads.oA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3660oA implements InterfaceC3552mA, Ay {

    /* renamed from: a, reason: collision with root package name */
    public final Context f32863a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f32864b;

    /* renamed from: c, reason: collision with root package name */
    public NetworkCapabilities f32865c = null;

    public C3660oA(Context context, ExecutorService executorService) {
        this.f32863a = context;
        this.f32864b = executorService;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3552mA
    public final void b(HashMap hashMap) {
        NetworkCapabilities networkCapabilities;
        long j6;
        synchronized (this) {
            networkCapabilities = this.f32865c;
        }
        hashMap.put("ntc", networkCapabilities);
        synchronized (this) {
            try {
                NetworkCapabilities networkCapabilities2 = this.f32865c;
                if (networkCapabilities2 != null) {
                    if (networkCapabilities2.hasTransport(4)) {
                        j6 = 2;
                    } else if (this.f32865c.hasTransport(1)) {
                        j6 = 1;
                    } else if (this.f32865c.hasTransport(0)) {
                        j6 = 0;
                    }
                }
                j6 = -1;
            } finally {
            }
        }
        hashMap.put(com.anythink.expressad.foundation.g.a.f19075W, Long.valueOf(j6));
    }

    @Override // com.google.android.gms.internal.ads.Ay
    public final N3.a c() {
        RunnableFutureC2966bE runnableFutureC2966bE = new RunnableFutureC2966bE(Executors.callable(new RunnableC3807qw(7, this), null));
        this.f32864b.execute(runnableFutureC2966bE);
        return runnableFutureC2966bE;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3552mA
    public final void a(HashMap hashMap) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3552mA
    public final void d(HashMap hashMap, Context context, View view) {
    }
}
