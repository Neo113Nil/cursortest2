package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* loaded from: classes2.dex */
public final class Y extends HandlerThread implements Handler.Callback {

    /* renamed from: n, reason: collision with root package name */
    public RunnableC2526Dn f28752n;

    /* renamed from: u, reason: collision with root package name */
    public Handler f28753u;

    /* renamed from: v, reason: collision with root package name */
    public Error f28754v;

    /* renamed from: w, reason: collision with root package name */
    public RuntimeException f28755w;

    /* renamed from: x, reason: collision with root package name */
    public Z f28756x;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        RunnableC2526Dn runnableC2526Dn;
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    try {
                        int i4 = message.arg1;
                        RunnableC2526Dn runnableC2526Dn2 = this.f28752n;
                        if (runnableC2526Dn2 == null) {
                            throw null;
                        }
                        runnableC2526Dn2.a(i4);
                        SurfaceTexture surfaceTexture = this.f28752n.f24554y;
                        surfaceTexture.getClass();
                        this.f28756x = new Z(this, surfaceTexture, i4 != 0);
                        synchronized (this) {
                            notify();
                        }
                        return true;
                    } catch (C2696Nn e6) {
                        AbstractC3217fl.X("PlaceholderSurface", "Failed to initialize placeholder surface", e6);
                        this.f28755w = new IllegalStateException(e6);
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (Error e9) {
                    AbstractC3217fl.X("PlaceholderSurface", "Failed to initialize placeholder surface", e9);
                    this.f28754v = e9;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e10) {
                    AbstractC3217fl.X("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f28755w = e10;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    runnableC2526Dn = this.f28752n;
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                if (runnableC2526Dn == null) {
                    throw null;
                }
                runnableC2526Dn.b();
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
