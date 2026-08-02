package yads;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import defpackage.nba1;

/* loaded from: classes7.dex */
public final class ob2 extends HandlerThread implements Handler.Callback {
    public nl0 b;
    public Handler c;
    public Error d;
    public RuntimeException e;
    public pb2 f;

    public ob2() {
        super("ExoPlayer:PlaceholderSurface");
    }

    public final pb2 a(int i) {
        boolean z;
        start();
        Handler handler = new Handler(getLooper(), this);
        this.c = handler;
        this.b = new nl0(handler);
        synchronized (this) {
            z = false;
            this.c.obtainMessage(1, i, 0).sendToTarget();
            while (this.f == null && this.e == null && this.d == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.e;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.d;
        if (error != null) {
            throw error;
        }
        pb2 pb2Var = this.f;
        pb2Var.getClass();
        return pb2Var;
    }

    public final void b(int i) {
        this.b.getClass();
        this.b.a(i);
        SurfaceTexture surfaceTexture = this.b.g;
        surfaceTexture.getClass();
        this.f = new pb2(this, surfaceTexture, i != 0);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    try {
                        b(message.arg1);
                        synchronized (this) {
                            notify();
                        }
                        return true;
                    } catch (Error e) {
                        nba1.c("PlaceholderSurface", nba1.b("Failed to initialize placeholder surface", e));
                        this.d = e;
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (RuntimeException e2) {
                    nba1.c("PlaceholderSurface", nba1.b("Failed to initialize placeholder surface", e2));
                    this.e = e2;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    this.b.getClass();
                    this.b.a();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
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
