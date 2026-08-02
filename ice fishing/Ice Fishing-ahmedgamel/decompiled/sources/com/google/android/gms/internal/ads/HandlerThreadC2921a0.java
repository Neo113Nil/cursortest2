package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* renamed from: com.google.android.gms.internal.ads.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class HandlerThreadC2921a0 extends HandlerThread implements Handler.Callback {

    /* renamed from: n, reason: collision with root package name */
    public RunnableC4144wn f29760n;

    /* renamed from: u, reason: collision with root package name */
    public Handler f29761u;

    /* renamed from: v, reason: collision with root package name */
    public Error f29762v;

    /* renamed from: w, reason: collision with root package name */
    public RuntimeException f29763w;

    /* renamed from: x, reason: collision with root package name */
    public C2975b0 f29764x;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        RunnableC4144wn runnableC4144wn;
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    int i4 = message.arg1;
                    RunnableC4144wn runnableC4144wn2 = this.f29760n;
                    if (runnableC4144wn2 == null) {
                        throw null;
                    }
                    runnableC4144wn2.a(i4);
                    SurfaceTexture surfaceTexture = this.f29760n.f35660y;
                    surfaceTexture.getClass();
                    this.f29764x = new C2975b0(this, surfaceTexture, i4 != 0);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (C2598Gn e9) {
                    AbstractC2991bG.J("PlaceholderSurface", "Failed to initialize placeholder surface", e9);
                    this.f29763w = new IllegalStateException(e9);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e10) {
                    AbstractC2991bG.J("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f29762v = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    AbstractC2991bG.J("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f29763w = e11;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    runnableC4144wn = this.f29760n;
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                if (runnableC4144wn == null) {
                    throw null;
                }
                runnableC4144wn.b();
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
