package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.view.View;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.gms.internal.ads.sA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3898sA implements InterfaceC3575mA, Ay {

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f34669g = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* renamed from: a, reason: collision with root package name */
    public final Context f34670a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f34671b;

    /* renamed from: c, reason: collision with root package name */
    public long f34672c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f34673d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f34674e = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f34675f = false;

    public C3898sA(Context context, String[] strArr, ExecutorService executorService) {
        this.f34670a = context;
        this.f34671b = executorService;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3575mA
    public final void a(HashMap hashMap) {
        e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3575mA
    public final void b(HashMap hashMap) {
        long j6;
        long j9;
        e();
        synchronized (this) {
            try {
                j6 = this.f34675f ? this.f34673d - this.f34672c : -1L;
            } finally {
            }
        }
        hashMap.put("vs", Long.valueOf(j6));
        synchronized (this) {
            j9 = this.f34674e;
            this.f34674e = -1L;
        }
        hashMap.put("vf", Long.valueOf(j9));
    }

    @Override // com.google.android.gms.internal.ads.Ay
    public final P3.a c() {
        if (Build.VERSION.SDK_INT < 30) {
            return ND.f27257u;
        }
        RunnableFutureC2989bE runnableFutureC2989bE = new RunnableFutureC2989bE(Executors.callable(new RunnableC3830qw(8, this), null));
        this.f34671b.execute(runnableFutureC2989bE);
        return runnableFutureC2989bE;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3575mA
    public final void d(HashMap hashMap, Context context, View view) {
        e();
    }

    public final void e() {
        synchronized (this) {
            try {
                if (this.f34675f) {
                    this.f34673d = System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
