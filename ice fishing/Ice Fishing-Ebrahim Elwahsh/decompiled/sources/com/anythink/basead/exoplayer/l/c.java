package com.anythink.basead.exoplayer.l;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import android.view.Surface;
import com.anythink.basead.exoplayer.k.C0544a;
import com.anythink.basead.exoplayer.k.af;

/* loaded from: classes.dex */
public final class c extends Surface {

    /* renamed from: b, reason: collision with root package name */
    private static final String f8711b = "DummySurface";

    /* renamed from: c, reason: collision with root package name */
    private static final String f8712c = "EGL_EXT_protected_content";

    /* renamed from: d, reason: collision with root package name */
    private static final String f8713d = "EGL_KHR_surfaceless_context";

    /* renamed from: e, reason: collision with root package name */
    private static int f8714e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f8715f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8716a;

    /* renamed from: g, reason: collision with root package name */
    private final a f8717g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8718h;

    public /* synthetic */ c(a aVar, SurfaceTexture surfaceTexture, boolean z8, byte b9) {
        this(aVar, surfaceTexture, z8);
    }

    public static synchronized boolean a(Context context) {
        int i;
        String eglQueryString;
        int i4;
        synchronized (c.class) {
            try {
                if (!f8715f) {
                    int i9 = af.f8503a;
                    if (i9 >= 24 && ((i9 >= 26 || (!"samsung".equals(af.f8505c) && !"XT1650".equals(af.f8506d))) && ((i9 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains(f8712c)))) {
                        i4 = eglQueryString.contains(f8713d) ? 1 : 2;
                        f8714e = i4;
                        f8715f = true;
                    }
                    i4 = 0;
                    f8714e = i4;
                    f8715f = true;
                }
                i = f8714e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i != 0;
    }

    private static int b(Context context) {
        String eglQueryString;
        int i = af.f8503a;
        if (i < 26 && ("samsung".equals(af.f8505c) || "XT1650".equals(af.f8506d))) {
            return 0;
        }
        if ((i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains(f8712c)) {
            return eglQueryString.contains(f8713d) ? 1 : 2;
        }
        return 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f8717g) {
            try {
                if (!this.f8718h) {
                    this.f8717g.a();
                    this.f8718h = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private c(a aVar, SurfaceTexture surfaceTexture, boolean z8) {
        super(surfaceTexture);
        this.f8717g = aVar;
        this.f8716a = z8;
    }

    public static class a extends HandlerThread implements Handler.Callback {

        /* renamed from: a, reason: collision with root package name */
        private static final int f8719a = 1;

        /* renamed from: b, reason: collision with root package name */
        private static final int f8720b = 2;

        /* renamed from: c, reason: collision with root package name */
        private com.anythink.basead.exoplayer.k.g f8721c;

        /* renamed from: d, reason: collision with root package name */
        private Handler f8722d;

        /* renamed from: e, reason: collision with root package name */
        private Error f8723e;

        /* renamed from: f, reason: collision with root package name */
        private RuntimeException f8724f;

        /* renamed from: g, reason: collision with root package name */
        private c f8725g;

        public a() {
            super("dummySurface");
        }

        private void b(int i) {
            C0544a.a(this.f8721c);
            this.f8721c.a(i);
            this.f8725g = new c(this, this.f8721c.b(), i != 0, (byte) 0);
        }

        public final c a(int i) {
            boolean z8;
            start();
            Handler handler = new Handler(getLooper(), this);
            this.f8722d = handler;
            this.f8721c = new com.anythink.basead.exoplayer.k.g(handler);
            synchronized (this) {
                z8 = false;
                this.f8722d.obtainMessage(1, i, 0).sendToTarget();
                while (this.f8725g == null && this.f8724f == null && this.f8723e == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z8 = true;
                    }
                }
            }
            if (z8) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f8724f;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f8723e;
            if (error == null) {
                return (c) C0544a.a(this.f8725g);
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
                        C0544a.a(this.f8721c);
                        this.f8721c.a();
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
                    C0544a.a(this.f8721c);
                    this.f8721c.a(i4);
                    this.f8725g = new c(this, this.f8721c.b(), i4 != 0, (byte) 0);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e6) {
                    Log.e(c.f8711b, "Failed to initialize dummy surface", e6);
                    this.f8723e = e6;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e9) {
                    Log.e(c.f8711b, "Failed to initialize dummy surface", e9);
                    this.f8724f = e9;
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
            C0544a.a(this.f8721c);
            this.f8721c.a();
        }

        public final void a() {
            C0544a.a(this.f8722d);
            this.f8722d.sendEmptyMessage(2);
        }
    }

    private static void a() {
        if (af.f8503a < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
    }

    public static c a(Context context, boolean z8) {
        if (af.f8503a >= 17) {
            C0544a.b(!z8 || a(context));
            return new a().a(z8 ? f8714e : 0);
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }
}
