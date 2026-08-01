package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* renamed from: com.google.android.gms.internal.ads.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class HandlerThreadC2898a0 extends HandlerThread implements Handler.Callback {

    /* renamed from: n, reason: collision with root package name */
    public RunnableC4067vn f28990n;

    /* renamed from: u, reason: collision with root package name */
    public Handler f28991u;

    /* renamed from: v, reason: collision with root package name */
    public Error f28992v;

    /* renamed from: w, reason: collision with root package name */
    public RuntimeException f28993w;

    /* renamed from: x, reason: collision with root package name */
    public C2952b0 f28994x;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        RunnableC4067vn runnableC4067vn;
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    int i6 = message.arg1;
                    RunnableC4067vn runnableC4067vn2 = this.f28990n;
                    if (runnableC4067vn2 == null) {
                        throw null;
                    }
                    runnableC4067vn2.a(i6);
                    SurfaceTexture surfaceTexture = this.f28990n.f34741y;
                    surfaceTexture.getClass();
                    this.f28994x = new C2952b0(this, surfaceTexture, i6 != 0);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (C2561Fn e9) {
                    AbstractC2968bG.J("PlaceholderSurface", "Failed to initialize placeholder surface", e9);
                    this.f28993w = new IllegalStateException(e9);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e10) {
                    AbstractC2968bG.J("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f28992v = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    AbstractC2968bG.J("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f28993w = e11;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    runnableC4067vn = this.f28990n;
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                if (runnableC4067vn == null) {
                    throw null;
                }
                runnableC4067vn.b();
                return true;
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
