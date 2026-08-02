package com.squareup.cash.graphics.swampgl;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class GLThread {
    public final JobImpl cleanupJob;
    public EGLContext eglContext;
    public EGLDisplay eglDisplay;
    public EGLSurface fallbackPbufferSurface;
    public volatile CoroutineContext glContext;
    public volatile StandaloneCoroutine lifecycleJob;
    public final Function1 onError;
    public final CoroutineScope parentScope;

    public GLThread(CoroutineScope coroutineScope, Function1 function1) {
        coroutineScope.getClass();
        function1.getClass();
        this.parentScope = coroutineScope;
        this.onError = function1;
        EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
        eGLContext.getClass();
        this.eglContext = eGLContext;
        EGLDisplay eGLDisplay = EGL14.EGL_NO_DISPLAY;
        eGLDisplay.getClass();
        this.eglDisplay = eGLDisplay;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        eGLSurface.getClass();
        this.fallbackPbufferSurface = eGLSurface;
        this.cleanupJob = JobKt.Job$default();
    }

    public static final void access$cleanupEglResources(GLThread gLThread) {
        if (!Intrinsics.areEqual(gLThread.eglContext, EGL14.EGL_NO_CONTEXT) && !Intrinsics.areEqual(gLThread.eglDisplay, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = gLThread.eglDisplay;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            if (!Intrinsics.areEqual(gLThread.fallbackPbufferSurface, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(gLThread.eglDisplay, gLThread.fallbackPbufferSurface);
                EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
                eGLSurface2.getClass();
                gLThread.fallbackPbufferSurface = eGLSurface2;
            }
            EGL14.eglDestroyContext(gLThread.eglDisplay, gLThread.eglContext);
            EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
            eGLContext.getClass();
            gLThread.eglContext = eGLContext;
            Timber.Forest forest = Timber.Forest;
            forest.tag("GLThread");
            forest.d("EGL context destroyed on SwampGL-Engine", new Object[0]);
        }
        if (Intrinsics.areEqual(gLThread.eglDisplay, EGL14.EGL_NO_DISPLAY)) {
            return;
        }
        EGL14.eglTerminate(gLThread.eglDisplay);
        EGLDisplay eGLDisplay2 = EGL14.EGL_NO_DISPLAY;
        eGLDisplay2.getClass();
        gLThread.eglDisplay = eGLDisplay2;
        Timber.Forest forest2 = Timber.Forest;
        forest2.tag("GLThread");
        forest2.d("EGL display terminated on SwampGL-Engine", new Object[0]);
    }

    public final StandaloneCoroutine launch(Function1 function1) {
        CoroutineContext coroutineContext = this.glContext;
        Continuation continuation = null;
        if (coroutineContext != null) {
            return JobKt.launch$default(this.parentScope, coroutineContext, null, new GLThread$launch$1(function1, continuation, 0), 2);
        }
        a$$ExternalSyntheticBUOutline0.m$1("GLThread not started");
        return null;
    }
}
