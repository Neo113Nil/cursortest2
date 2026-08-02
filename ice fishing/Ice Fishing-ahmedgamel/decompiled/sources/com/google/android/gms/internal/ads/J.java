package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import r2.C4906k;
import w2.HandlerC5139A;

/* loaded from: classes2.dex */
public final class J implements Executor {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26383n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f26384u;

    public /* synthetic */ J(int i, Object obj) {
        this.f26383n = i;
        this.f26384u = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f26383n) {
            case 0:
                ((ExecutorService) this.f26384u).execute(runnable);
                return;
            case 1:
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    ((HandlerC5139A) this.f26384u).post(runnable);
                    return;
                }
                try {
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    w2.D d9 = C4906k.f40186C.f40191c;
                    Context context = C4906k.f40186C.f40196h.f30306e;
                    if (context != null) {
                        try {
                            if (((Boolean) AbstractC2888Ya.f29459b.r()).booleanValue()) {
                                V2.b.a(context, th);
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    throw th;
                }
            default:
                ((C3235ft) this.f26384u).e(runnable);
                return;
        }
    }

    public J() {
        this.f26383n = 1;
        this.f26384u = new HandlerC5139A(Looper.getMainLooper(), 1);
    }
}
