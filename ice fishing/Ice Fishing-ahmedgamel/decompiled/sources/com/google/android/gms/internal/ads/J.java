package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p2.C4835j;
import u2.HandlerC5068A;

/* loaded from: classes2.dex */
public final class J implements Executor {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f25630n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f25631u;

    public /* synthetic */ J(int i, Object obj) {
        this.f25630n = i;
        this.f25631u = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f25630n) {
            case 0:
                ((ExecutorService) this.f25631u).execute(runnable);
                return;
            case 1:
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    ((HandlerC5068A) this.f25631u).post(runnable);
                    return;
                }
                try {
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    u2.D d2 = C4835j.f39733C.f39738c;
                    Context context = C4835j.f39733C.f39743h.f29521e;
                    if (context != null) {
                        try {
                            if (((Boolean) AbstractC2865Ya.f28684b.r()).booleanValue()) {
                                T2.b.a(context, th);
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    throw th;
                }
            default:
                ((C3212ft) this.f25631u).e(runnable);
                return;
        }
    }

    public J() {
        this.f25630n = 1;
        this.f25631u = new HandlerC5068A(Looper.getMainLooper(), 3);
    }
}
