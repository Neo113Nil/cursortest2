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
    private static final String f8554b = "DummySurface";

    /* renamed from: c, reason: collision with root package name */
    private static final String f8555c = "EGL_EXT_protected_content";

    /* renamed from: d, reason: collision with root package name */
    private static final String f8556d = "EGL_KHR_surfaceless_context";

    /* renamed from: e, reason: collision with root package name */
    private static int f8557e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f8558f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8559a;

    /* renamed from: g, reason: collision with root package name */
    private final a f8560g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8561h;

    public /* synthetic */ c(a aVar, SurfaceTexture surfaceTexture, boolean z3, byte b9) {
        this(aVar, surfaceTexture, z3);
    }

    public static synchronized boolean a(Context context) {
        int i;
        String eglQueryString;
        int i6;
        synchronized (c.class) {
            try {
                if (!f8558f) {
                    int i9 = af.f8346a;
                    if (i9 >= 24 && ((i9 >= 26 || (!"samsung".equals(af.f8348c) && !"XT1650".equals(af.f8349d))) && ((i9 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains(f8555c)))) {
                        i6 = eglQueryString.contains(f8556d) ? 1 : 2;
                        f8557e = i6;
                        f8558f = true;
                    }
                    i6 = 0;
                    f8557e = i6;
                    f8558f = true;
                }
                i = f8557e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i != 0;
    }

    private static int b(Context context) {
        String eglQueryString;
        int i = af.f8346a;
        if (i < 26 && ("samsung".equals(af.f8348c) || "XT1650".equals(af.f8349d))) {
            return 0;
        }
        if ((i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains(f8555c)) {
            return eglQueryString.contains(f8556d) ? 1 : 2;
        }
        return 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f8560g) {
            try {
                if (!this.f8561h) {
                    this.f8560g.a();
                    this.f8561h = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private c(a aVar, SurfaceTexture surfaceTexture, boolean z3) {
        super(surfaceTexture);
        this.f8560g = aVar;
        this.f8559a = z3;
    }

    public static class a extends HandlerThread implements Handler.Callback {

        /* renamed from: a, reason: collision with root package name */
        private static final int f8562a = 1;

        /* renamed from: b, reason: collision with root package name */
        private static final int f8563b = 2;

        /* renamed from: c, reason: collision with root package name */
        private com.anythink.basead.exoplayer.k.g f8564c;

        /* renamed from: d, reason: collision with root package name */
        private Handler f8565d;

        /* renamed from: e, reason: collision with root package name */
        private Error f8566e;

        /* renamed from: f, reason: collision with root package name */
        private RuntimeException f8567f;

        /* renamed from: g, reason: collision with root package name */
        private c f8568g;

        public a() {
            super("dummySurface");
        }

        private void b(int i) {
            com.anythink.basead.exoplayer.k.a.a(this.f8564c);
            this.f8564c.a(i);
            this.f8568g = new c(this, this.f8564c.b(), i != 0, (byte) 0);
        }

        public final c a(int i) {
            boolean z3;
            start();
            Handler handler = new Handler(getLooper(), this);
            this.f8565d = handler;
            this.f8564c = new com.anythink.basead.exoplayer.k.g(handler);
            synchronized (this) {
                z3 = false;
                this.f8565d.obtainMessage(1, i, 0).sendToTarget();
                while (this.f8568g == null && this.f8567f == null && this.f8566e == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z3 = true;
                    }
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f8567f;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f8566e;
            if (error == null) {
                return (c) com.anythink.basead.exoplayer.k.a.a(this.f8568g);
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
                        com.anythink.basead.exoplayer.k.a.a(this.f8564c);
                        this.f8564c.a();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    int i6 = message.arg1;
                    com.anythink.basead.exoplayer.k.a.a(this.f8564c);
                    this.f8564c.a(i6);
                    this.f8568g = new c(this, this.f8564c.b(), i6 != 0, (byte) 0);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e9) {
                    Log.e(c.f8554b, "Failed to initialize dummy surface", e9);
                    this.f8566e = e9;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e10) {
                    Log.e(c.f8554b, "Failed to initialize dummy surface", e10);
                    this.f8567f = e10;
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
            com.anythink.basead.exoplayer.k.a.a(this.f8564c);
            this.f8564c.a();
        }

        public final void a() {
            com.anythink.basead.exoplayer.k.a.a(this.f8565d);
            this.f8565d.sendEmptyMessage(2);
        }
    }

    private static void a() {
        if (af.f8346a < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
    }

    public static c a(Context context, boolean z3) {
        if (af.f8346a >= 17) {
            com.anythink.basead.exoplayer.k.a.b(!z3 || a(context));
            return new a().a(z3 ? f8557e : 0);
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }
}
