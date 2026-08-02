package androidx.media3.exoplayer.video;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.media3.common.util.EGLSurfaceTexture;
import androidx.media3.common.util.GlUtil$GlException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class PlaceholderSurface extends Surface {
    public static int secureMode;
    public static boolean secureModeInitialized;
    public final boolean secure;
    public final PlaceholderSurfaceThread thread;
    public boolean threadReleased;

    public final class PlaceholderSurfaceThread extends HandlerThread implements Handler.Callback {
        public EGLSurfaceTexture eglSurfaceTexture;
        public Handler handler;
        public Error initError;
        public RuntimeException initException;
        public PlaceholderSurface surface;

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            try {
                if (i == 1) {
                    try {
                        initInternal(message.arg1);
                        synchronized (this) {
                            notify();
                        }
                        return true;
                    } catch (GlUtil$GlException e) {
                        Log.e("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                        this.initException = new IllegalStateException(e);
                        synchronized (this) {
                            notify();
                        }
                    } catch (Error e2) {
                        Log.e("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                        this.initError = e2;
                        synchronized (this) {
                            notify();
                        }
                    } catch (RuntimeException e3) {
                        Log.e("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                        this.initException = e3;
                        synchronized (this) {
                            notify();
                        }
                    }
                } else if (i == 2) {
                    try {
                        releaseInternal();
                        return true;
                    } catch (Throwable th) {
                        try {
                            Log.e("PlaceholderSurface", "Failed to release placeholder surface", th);
                            return true;
                        } finally {
                            quit();
                        }
                    }
                }
                return true;
            } catch (Throwable th2) {
                synchronized (this) {
                    notify();
                    throw th2;
                }
            }
        }

        public final void initInternal(int i) {
            EGLSurface eglCreatePbufferSurface;
            this.eglSurfaceTexture.getClass();
            EGLSurfaceTexture eGLSurfaceTexture = this.eglSurfaceTexture;
            int[] iArr = eGLSurfaceTexture.textureIdHolder;
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            Log.checkGlException("eglGetDisplay failed", eglGetDisplay != null);
            int[] iArr2 = new int[2];
            Log.checkGlException("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1));
            eGLSurfaceTexture.display = eglGetDisplay;
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr3 = new int[1];
            boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, EGLSurfaceTexture.EGL_CONFIG_ATTRIBUTES, 0, eGLConfigArr, 0, 1, iArr3, 0);
            boolean z = eglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null;
            Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
            String str = Util.DEVICE_DEBUG_INFO;
            Log.checkGlException(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z);
            EGLConfig eGLConfig = eGLConfigArr[0];
            EGLContext eglCreateContext = EGL14.eglCreateContext(eGLSurfaceTexture.display, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
            Log.checkGlException("eglCreateContext failed", eglCreateContext != null);
            eGLSurfaceTexture.context = eglCreateContext;
            EGLDisplay eGLDisplay = eGLSurfaceTexture.display;
            if (i == 1) {
                eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
            } else {
                eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                Log.checkGlException("eglCreatePbufferSurface failed", eglCreatePbufferSurface != null);
            }
            Log.checkGlException("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
            eGLSurfaceTexture.surface = eglCreatePbufferSurface;
            GLES20.glGenTextures(1, iArr, 0);
            Log.checkGlError();
            SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
            eGLSurfaceTexture.texture = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(eGLSurfaceTexture);
            SurfaceTexture surfaceTexture2 = this.eglSurfaceTexture.texture;
            surfaceTexture2.getClass();
            this.surface = new PlaceholderSurface(this, surfaceTexture2, i != 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void releaseInternal() {
            this.eglSurfaceTexture.getClass();
            EGLSurfaceTexture eGLSurfaceTexture = this.eglSurfaceTexture;
            eGLSurfaceTexture.handler.removeCallbacks(eGLSurfaceTexture);
            try {
                SurfaceTexture surfaceTexture = eGLSurfaceTexture.texture;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    GLES20.glDeleteTextures(1, eGLSurfaceTexture.textureIdHolder, 0);
                }
            } finally {
                EGLDisplay eGLDisplay = eGLSurfaceTexture.display;
                if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGLDisplay eGLDisplay2 = eGLSurfaceTexture.display;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                }
                EGLSurface eGLSurface2 = eGLSurfaceTexture.surface;
                if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(eGLSurfaceTexture.display, eGLSurfaceTexture.surface);
                }
                EGLContext eGLContext = eGLSurfaceTexture.context;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(eGLSurfaceTexture.display, eGLContext);
                }
                EGL14.eglReleaseThread();
                EGLDisplay eGLDisplay3 = eGLSurfaceTexture.display;
                if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglTerminate(eGLSurfaceTexture.display);
                }
                eGLSurfaceTexture.display = null;
                eGLSurfaceTexture.context = null;
                eGLSurfaceTexture.surface = null;
                eGLSurfaceTexture.texture = null;
            }
        }
    }

    public PlaceholderSurface(PlaceholderSurfaceThread placeholderSurfaceThread, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.thread = placeholderSurfaceThread;
        this.secure = z;
    }

    public static synchronized boolean isSecureSupported() {
        int i;
        boolean z;
        synchronized (PlaceholderSurface.class) {
            try {
                if (!secureModeInitialized) {
                    try {
                    } catch (GlUtil$GlException e) {
                        Log.e("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e.getMessage());
                    }
                    if (Log.isExtensionSupported("EGL_EXT_protected_content")) {
                        i = Log.isExtensionSupported("EGL_KHR_surfaceless_context") ? 1 : 2;
                        secureMode = i;
                        secureModeInitialized = true;
                    }
                    i = 0;
                    secureMode = i;
                    secureModeInitialized = true;
                }
                z = secureMode != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.thread) {
            try {
                if (!this.threadReleased) {
                    PlaceholderSurfaceThread placeholderSurfaceThread = this.thread;
                    placeholderSurfaceThread.handler.getClass();
                    placeholderSurfaceThread.handler.sendEmptyMessage(2);
                    this.threadReleased = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
