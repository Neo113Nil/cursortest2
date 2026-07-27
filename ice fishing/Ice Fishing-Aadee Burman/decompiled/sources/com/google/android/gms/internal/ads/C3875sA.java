package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.view.View;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.gms.internal.ads.sA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3875sA implements InterfaceC3552mA, Ay {

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f33901g = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* renamed from: a, reason: collision with root package name */
    public final Context f33902a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f33903b;

    /* renamed from: c, reason: collision with root package name */
    public long f33904c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f33905d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f33906e = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f33907f = false;

    public C3875sA(Context context, String[] strArr, ExecutorService executorService) {
        this.f33902a = context;
        this.f33903b = executorService;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3552mA
    public final void a(HashMap hashMap) {
        e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3552mA
    public final void b(HashMap hashMap) {
        long j6;
        long j9;
        e();
        synchronized (this) {
            try {
                j6 = this.f33907f ? this.f33905d - this.f33904c : -1L;
            } finally {
            }
        }
        hashMap.put("vs", Long.valueOf(j6));
        synchronized (this) {
            j9 = this.f33906e;
            this.f33906e = -1L;
        }
        hashMap.put("vf", Long.valueOf(j9));
    }

    @Override // com.google.android.gms.internal.ads.Ay
    public final N3.a c() {
        if (Build.VERSION.SDK_INT < 30) {
            return ND.f26473u;
        }
        RunnableFutureC2966bE runnableFutureC2966bE = new RunnableFutureC2966bE(Executors.callable(new RunnableC3807qw(8, this), null));
        this.f33903b.execute(runnableFutureC2966bE);
        return runnableFutureC2966bE;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3552mA
    public final void d(HashMap hashMap, Context context, View view) {
        e();
    }

    public final void e() {
        synchronized (this) {
            try {
                if (this.f33907f) {
                    this.f33905d = System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
