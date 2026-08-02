package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkCapabilities;
import android.view.View;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.gms.internal.ads.oA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3683oA implements InterfaceC3575mA, Ay {

    /* renamed from: a, reason: collision with root package name */
    public final Context f33650a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f33651b;

    /* renamed from: c, reason: collision with root package name */
    public NetworkCapabilities f33652c = null;

    public C3683oA(Context context, ExecutorService executorService) {
        this.f33650a = context;
        this.f33651b = executorService;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3575mA
    public final void b(HashMap hashMap) {
        NetworkCapabilities networkCapabilities;
        long j6;
        synchronized (this) {
            networkCapabilities = this.f33652c;
        }
        hashMap.put("ntc", networkCapabilities);
        synchronized (this) {
            try {
                NetworkCapabilities networkCapabilities2 = this.f33652c;
                if (networkCapabilities2 != null) {
                    if (networkCapabilities2.hasTransport(4)) {
                        j6 = 2;
                    } else if (this.f33652c.hasTransport(1)) {
                        j6 = 1;
                    } else if (this.f33652c.hasTransport(0)) {
                        j6 = 0;
                    }
                }
                j6 = -1;
            } finally {
            }
        }
        hashMap.put(com.anythink.expressad.foundation.g.a.f19862W, Long.valueOf(j6));
    }

    @Override // com.google.android.gms.internal.ads.Ay
    public final P3.a c() {
        RunnableFutureC2989bE runnableFutureC2989bE = new RunnableFutureC2989bE(Executors.callable(new RunnableC3830qw(7, this), null));
        this.f33651b.execute(runnableFutureC2989bE);
        return runnableFutureC2989bE;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3575mA
    public final void a(HashMap hashMap) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3575mA
    public final void d(HashMap hashMap, Context context, View view) {
    }
}
