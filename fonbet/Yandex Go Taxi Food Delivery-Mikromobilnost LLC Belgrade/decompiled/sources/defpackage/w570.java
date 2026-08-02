package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.processing.util.GLUtils$InputFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.EglBase;
import ru.CryptoPro.JCP.ProviderParameters;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public class w570 {
    public Thread c;
    public EGLConfig g;
    public Surface i;
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final HashMap b = new HashMap();
    public EGLDisplay d = EGL14.EGL_NO_DISPLAY;
    public EGLContext e = EGL14.EGL_NO_CONTEXT;
    public int[] f = brs.a;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public Map j = Collections.EMPTY_MAP;
    public zqs k = null;
    public GLUtils$InputFormat l = GLUtils$InputFormat.UNKNOWN;
    public int m = -1;

    public final void a(q8n q8nVar, s64 s64Var) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.d = eglGetDisplay;
        if (Objects.equals(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            ny61.r("Unable to get EGL14 display");
            return;
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.d, iArr, 0, iArr, 1)) {
            this.d = EGL14.EGL_NO_DISPLAY;
            ny61.r("Unable to initialize EGL14");
            return;
        }
        if (s64Var != null) {
            s64Var.b = iArr[0] + Extension.DOT_CHAR + iArr[1];
        }
        int i = q8nVar.a() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.d, new int[]{12324, i, 12323, i, 12322, i, 12321, q8nVar.a() ? 2 : 8, 12325, 0, 12326, 0, 12352, q8nVar.a() ? 64 : 4, EglBase.EGL_RECORDABLE_ANDROID, q8nVar.a() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            ny61.r("Unable to find a suitable EGLConfig");
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(this.d, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, q8nVar.a() ? 3 : 2, 12344}, 0);
        brs.a("eglCreateContext");
        this.g = eGLConfig;
        this.e = eglCreateContext;
        EGL14.eglQueryContext(this.d, eglCreateContext, 12440, new int[1], 0);
    }

    public final o74 b(Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.d;
            EGLConfig eGLConfig = this.g;
            Objects.requireNonNull(eGLConfig);
            EGLSurface h = brs.h(eGLDisplay, eGLConfig, surface, this.f);
            EGLDisplay eGLDisplay2 = this.d;
            int[] iArr = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, h, 12375, iArr, 0);
            int i = iArr[0];
            int[] iArr2 = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, h, 12374, iArr2, 0);
            Size size = new Size(i, iArr2[0]);
            return new o74(h, size.getWidth(), size.getHeight());
        } catch (IllegalArgumentException | IllegalStateException unused) {
            sgb1.g(5, "OpenGlRenderer");
            return null;
        }
    }

    public final void c() {
        EGLDisplay eGLDisplay = this.d;
        EGLConfig eGLConfig = this.g;
        Objects.requireNonNull(eGLConfig);
        int[] iArr = brs.a;
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        brs.a("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            this.h = eglCreatePbufferSurface;
        } else {
            ny61.r("surface was null");
        }
    }

    public final sa90 d(q8n q8nVar) {
        brs.d(false, this.a);
        try {
            a(q8nVar, null);
            c();
            f(this.h);
            String glGetString = GLES20.glGetString(7939);
            String eglQueryString = EGL14.eglQueryString(this.d, 12373);
            if (glGetString == null) {
                glGetString = "";
            }
            if (eglQueryString == null) {
                eglQueryString = "";
            }
            return new sa90(glGetString, eglQueryString);
        } catch (IllegalStateException unused) {
            sgb1.g(5, "OpenGlRenderer");
            return new sa90("", "");
        } finally {
            i();
        }
    }

    public t64 e(q8n q8nVar, Map map) {
        AtomicBoolean atomicBoolean = this.a;
        brs.d(false, atomicBoolean);
        s64 s64Var = new s64();
        s64Var.a = ProviderParameters.DEFAULT_PRODUCT_VER;
        s64Var.b = ProviderParameters.DEFAULT_PRODUCT_VER;
        s64Var.c = "";
        s64Var.d = "";
        try {
            if (q8nVar.a()) {
                sa90 d = d(q8nVar);
                String str = (String) d.a;
                str.getClass();
                String str2 = (String) d.b;
                str2.getClass();
                if (!str.contains("GL_EXT_YUV_target")) {
                    sgb1.g(5, "OpenGlRenderer");
                    q8nVar = q8n.d;
                }
                int[] iArr = brs.a;
                if (q8nVar.a == 3) {
                    if (str2.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                        iArr = brs.b;
                    } else {
                        sgb1.g(5, "GLUtils");
                    }
                }
                this.f = iArr;
                s64Var.c = str;
                s64Var.d = str2;
            }
            a(q8nVar, s64Var);
            c();
            f(this.h);
            s64Var.a = brs.i();
            this.j = brs.f(q8nVar, map);
            int g = brs.g();
            this.m = g;
            l(g);
            this.c = Thread.currentThread();
            atomicBoolean.set(true);
            String str3 = s64Var.a == null ? " glVersion" : "";
            if (s64Var.b == null) {
                str3 = str3.concat(" eglVersion");
            }
            if (s64Var.c == null) {
                str3 = str3.concat(" glExtensions");
            }
            if (s64Var.d == null) {
                str3 = str3.concat(" eglExtensions");
            }
            if (str3.isEmpty()) {
                return new t64(s64Var.a, s64Var.b, s64Var.c, s64Var.d);
            }
            ny61.r("Missing required properties:".concat(str3));
            return null;
        } catch (IllegalArgumentException | IllegalStateException e) {
            i();
            throw e;
        }
    }

    public final void f(EGLSurface eGLSurface) {
        this.d.getClass();
        this.e.getClass();
        if (EGL14.eglMakeCurrent(this.d, eGLSurface, eGLSurface, this.e)) {
            return;
        }
        ny61.r("eglMakeCurrent failed");
    }

    public final void g(Surface surface) {
        brs.d(true, this.a);
        brs.c(this.c);
        HashMap hashMap = this.b;
        if (hashMap.containsKey(surface)) {
            return;
        }
        hashMap.put(surface, brs.j);
    }

    public void h() {
        if (this.a.getAndSet(false)) {
            brs.c(this.c);
            i();
        }
    }

    public final void i() {
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            GLES20.glDeleteProgram(((zqs) it.next()).a);
        }
        this.j = Collections.EMPTY_MAP;
        this.k = null;
        if (!Objects.equals(this.d, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            HashMap hashMap = this.b;
            for (ry80 ry80Var : hashMap.values()) {
                if (!Objects.equals(ry80Var.a(), EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.d, ry80Var.a())) {
                    try {
                        brs.a("eglDestroySurface");
                    } catch (IllegalStateException e) {
                        sgb1.e("GLUtils", e.toString(), e);
                    }
                }
            }
            hashMap.clear();
            if (!Objects.equals(this.h, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.d, this.h);
                this.h = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.d, this.e);
                this.e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.d);
            this.d = EGL14.EGL_NO_DISPLAY;
        }
        this.g = null;
        this.m = -1;
        this.l = GLUtils$InputFormat.UNKNOWN;
        this.i = null;
        this.c = null;
    }

    public final void j(Surface surface, boolean z) {
        if (this.i == surface) {
            this.i = null;
            f(this.h);
        }
        HashMap hashMap = this.b;
        ry80 ry80Var = z ? (ry80) hashMap.remove(surface) : (ry80) hashMap.put(surface, brs.j);
        if (ry80Var == null || ry80Var == brs.j) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.d, ry80Var.a());
        } catch (RuntimeException unused) {
            sgb1.g(5, "OpenGlRenderer");
        }
    }

    public final void k(long j, float[] fArr, Surface surface) {
        brs.d(true, this.a);
        brs.c(this.c);
        HashMap hashMap = this.b;
        d6z.y("The surface is not registered.", hashMap.containsKey(surface));
        ry80 ry80Var = (ry80) hashMap.get(surface);
        Objects.requireNonNull(ry80Var);
        if (ry80Var == brs.j) {
            ry80Var = b(surface);
            if (ry80Var == null) {
                return;
            } else {
                hashMap.put(surface, ry80Var);
            }
        }
        if (surface != this.i) {
            f(ry80Var.a());
            this.i = surface;
            GLES20.glViewport(0, 0, ry80Var.c(), ry80Var.b());
            GLES20.glScissor(0, 0, ry80Var.c(), ry80Var.b());
        }
        zqs zqsVar = this.k;
        zqsVar.getClass();
        if (zqsVar instanceof ars) {
            GLES20.glUniformMatrix4fv(((ars) zqsVar).f, 1, false, fArr, 0);
            brs.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        brs.b("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.d, ry80Var.a(), j);
        if (EGL14.eglSwapBuffers(this.d, ry80Var.a())) {
            return;
        }
        Integer.toHexString(EGL14.eglGetError());
        sgb1.g(5, "OpenGlRenderer");
        j(surface, false);
    }

    public final void l(int i) {
        zqs zqsVar = (zqs) this.j.get(this.l);
        if (zqsVar == null) {
            yci0.t(this.l, "Unable to configure program for input format: ");
            return;
        }
        if (this.k != zqsVar) {
            this.k = zqsVar;
            zqsVar.b();
            Objects.toString(this.l);
            Objects.toString(this.k);
        }
        GLES20.glActiveTexture(33984);
        brs.b("glActiveTexture");
        GLES20.glBindTexture(36197, i);
        brs.b("glBindTexture");
    }
}
