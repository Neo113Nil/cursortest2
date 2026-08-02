package com.anythink.basead.exoplayer.l;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import android.view.Surface;
import com.anythink.basead.exoplayer.k.af;

/* loaded from: classes.dex */
public final class c extends Surface {

    /* renamed from: b, reason: collision with root package name */
    private static final String f9340b = "DummySurface";

    /* renamed from: c, reason: collision with root package name */
    private static final String f9341c = "EGL_EXT_protected_content";

    /* renamed from: d, reason: collision with root package name */
    private static final String f9342d = "EGL_KHR_surfaceless_context";

    /* renamed from: e, reason: collision with root package name */
    private static int f9343e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f9344f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9345a;

    /* renamed from: g, reason: collision with root package name */
    private final a f9346g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f9347h;

    public /* synthetic */ c(a aVar, SurfaceTexture surfaceTexture, boolean z6, byte b9) {
        this(aVar, surfaceTexture, z6);
    }

    public static synchronized boolean a(Context context) {
        int i;
        String eglQueryString;
        int i4;
        synchronized (c.class) {
            try {
                if (!f9344f) {
                    int i6 = af.f9132a;
                    if (i6 >= 24 && ((i6 >= 26 || (!"samsung".equals(af.f9134c) && !"XT1650".equals(af.f9135d))) && ((i6 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains(f9341c)))) {
                        i4 = eglQueryString.contains(f9342d) ? 1 : 2;
                        f9343e = i4;
                        f9344f = true;
                    }
                    i4 = 0;
                    f9343e = i4;
                    f9344f = true;
                }
                i = f9343e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i != 0;
    }

    private static int b(Context context) {
        String eglQueryString;
        int i = af.f9132a;
        if (i < 26 && ("samsung".equals(af.f9134c) || "XT1650".equals(af.f9135d))) {
            return 0;
        }
        if ((i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains(f9341c)) {
            return eglQueryString.contains(f9342d) ? 1 : 2;
        }
        return 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f9346g) {
            try {
                if (!this.f9347h) {
                    this.f9346g.a();
                    this.f9347h = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private c(a aVar, SurfaceTexture surfaceTexture, boolean z6) {
        super(surfaceTexture);
        this.f9346g = aVar;
        this.f9345a = z6;
    }

    public static class a extends HandlerThread implements Handler.Callback {

        /* renamed from: a, reason: collision with root package name */
        private static final int f9348a = 1;

        /* renamed from: b, reason: collision with root package name */
        private static final int f9349b = 2;

        /* renamed from: c, reason: collision with root package name */
        private com.anythink.basead.exoplayer.k.g f9350c;

        /* renamed from: d, reason: collision with root package name */
        private Handler f9351d;

        /* renamed from: e, reason: collision with root package name */
        private Error f9352e;

        /* renamed from: f, reason: collision with root package name */
        private RuntimeException f9353f;

        /* renamed from: g, reason: collision with root package name */
        private c f9354g;

        public a() {
            super("dummySurface");
        }

        private void b(int i) {
            com.anythink.basead.exoplayer.k.a.a(this.f9350c);
            this.f9350c.a(i);
            this.f9354g = new c(this, this.f9350c.b(), i != 0, (byte) 0);
        }

        public final c a(int i) {
            boolean z6;
            start();
            Handler handler = new Handler(getLooper(), this);
            this.f9351d = handler;
            this.f9350c = new com.anythink.basead.exoplayer.k.g(handler);
            synchronized (this) {
                z6 = false;
                this.f9351d.obtainMessage(1, i, 0).sendToTarget();
                while (this.f9354g == null && this.f9353f == null && this.f9352e == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z6 = true;
                    }
                }
            }
            if (z6) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f9353f;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f9352e;
            if (error == null) {
                return (c) com.anythink.basead.exoplayer.k.a.a(this.f9354g);
            }
            throw error;
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            try {
                if (i != 1) {
                    if (i != 2) {
                        return true;
                    }
                    try {
                        com.anythink.basead.exoplayer.k.a.a(this.f9350c);
                        this.f9350c.a();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    int i4 = message.arg1;
                    com.anythink.basead.exoplayer.k.a.a(this.f9350c);
                    this.f9350c.a(i4);
                    this.f9354g = new c(this, this.f9350c.b(), i4 != 0, (byte) 0);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e9) {
                    Log.e(c.f9340b, "Failed to initialize dummy surface", e9);
                    this.f9352e = e9;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e10) {
                    Log.e(c.f9340b, "Failed to initialize dummy surface", e10);
                    this.f9353f = e10;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }

        private void b() {
            com.anythink.basead.exoplayer.k.a.a(this.f9350c);
            this.f9350c.a();
        }

        public final void a() {
            com.anythink.basead.exoplayer.k.a.a(this.f9351d);
            this.f9351d.sendEmptyMessage(2);
        }
    }

    private static void a() {
        if (af.f9132a < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
    }

    public static c a(Context context, boolean z6) {
        if (af.f9132a >= 17) {
            com.anythink.basead.exoplayer.k.a.b(!z6 || a(context));
            return new a().a(z6 ? f9343e : 0);
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }
}
