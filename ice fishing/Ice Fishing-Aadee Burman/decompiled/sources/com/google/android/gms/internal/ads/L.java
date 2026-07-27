package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final /* synthetic */ class L implements Executor {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26004n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Handler f26005u;

    public /* synthetic */ L(Handler handler, int i) {
        this.f26004n = i;
        this.f26005u = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f26004n) {
            case 0:
                this.f26005u.post(runnable);
                break;
            case 1:
                this.f26005u.post(runnable);
                break;
            default:
                this.f26005u.post(runnable);
                break;
        }
    }

    public L(Ux ux, Handler handler) {
        this.f26004n = 1;
        this.f26005u = handler;
        Objects.requireNonNull(ux);
    }
}
