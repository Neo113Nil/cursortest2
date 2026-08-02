package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;

/* loaded from: classes.dex */
public final class usk extends Surface {
    public static int d;
    public static boolean e;
    public final boolean a;
    public final tsk b;
    public boolean c;

    public usk(tsk tskVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.b = tskVar;
        this.a = z;
    }

    public static synchronized boolean a(Context context) {
        boolean z;
        String eglQueryString;
        int i;
        synchronized (usk.class) {
            try {
                if (!e) {
                    int i2 = dvt.a;
                    if (i2 >= 24 && ((i2 >= 26 || (!"samsung".equals(Build.MANUFACTURER) && !"XT1650".equals(Build.MODEL))) && ((i2 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")))) {
                        String eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                        i = eglQueryString2 != null && eglQueryString2.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
                        d = i;
                        e = true;
                    }
                    i = 0;
                    d = i;
                    e = true;
                }
                z = d != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public static usk b(Context context, boolean z) {
        boolean z2 = false;
        vq1.A(!z || a(context));
        tsk tskVar = new tsk("ExoPlayer:PlaceholderSurface");
        int i = z ? d : 0;
        tskVar.start();
        Handler handler = new Handler(tskVar.getLooper(), tskVar);
        tskVar.b = handler;
        tskVar.a = new fya(handler);
        synchronized (tskVar) {
            tskVar.b.obtainMessage(1, i, 0).sendToTarget();
            while (tskVar.e == null && tskVar.d == null && tskVar.c == null) {
                try {
                    tskVar.wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = tskVar.d;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = tskVar.c;
        if (error != null) {
            throw error;
        }
        usk uskVar = tskVar.e;
        uskVar.getClass();
        return uskVar;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.b) {
            try {
                if (!this.c) {
                    tsk tskVar = this.b;
                    tskVar.b.getClass();
                    tskVar.b.sendEmptyMessage(2);
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
