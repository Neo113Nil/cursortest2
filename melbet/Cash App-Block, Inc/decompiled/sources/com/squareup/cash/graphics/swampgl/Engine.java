package com.squareup.cash.graphics.swampgl;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import androidx.glance.session.SessionWorker$doWork$2$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.zxing.BinaryBitmap;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class Engine implements GLLauncher {
    public EGLConfig eglConfig;
    public EGLDisplay eglDisplay;
    public final BinaryBitmap frameScheduler;
    public GLThread glThread;
    public volatile int glesVersion;
    public volatile boolean initialized;
    public final Function1 onError;
    public volatile JobImpl pendingTermination;
    public final CoroutineScope scope;

    public Engine(CoroutineScope coroutineScope, Function1 function1) {
        coroutineScope.getClass();
        this.scope = coroutineScope;
        this.onError = function1;
        EGLDisplay eGLDisplay = EGL14.EGL_NO_DISPLAY;
        eGLDisplay.getClass();
        this.eglDisplay = eGLDisplay;
        this.frameScheduler = new BinaryBitmap(this);
    }

    public final void initialize() {
        if (this.initialized) {
            return;
        }
        JobImpl jobImpl = this.pendingTermination;
        Continuation continuation = null;
        this.pendingTermination = null;
        CoroutineScope coroutineScope = this.scope;
        GLThread gLThread = new GLThread(coroutineScope, this.onError);
        if (gLThread.lifecycleJob != null) {
            a$$ExternalSyntheticBUOutline0.m$1("GLThread already started");
            return;
        }
        gLThread.lifecycleJob = JobKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new GLThread$start$2(gLThread, null), 1);
        gLThread.launch(new SessionWorker$doWork$2$2(jobImpl, this, gLThread, continuation, 19));
        this.glThread = gLThread;
        this.initialized = true;
        Timber.Forest forest = Timber.Forest;
        forest.tag("SwampGL");
        forest.i("✅ SwampGL initialized", new Object[0]);
    }

    @Override // com.squareup.cash.graphics.swampgl.GLLauncher
    public final Job launch(Function1 function1) {
        GLThread gLThread = this.glThread;
        if (gLThread != null) {
            return gLThread.launch(function1);
        }
        JobImpl Job$default = JobKt.Job$default();
        Job$default.complete$1();
        return Job$default;
    }

    public final void restoreSurfacelessCurrent() {
        boolean z;
        GLThread gLThread = this.glThread;
        if (gLThread == null) {
            return;
        }
        if (Intrinsics.areEqual(gLThread.eglDisplay, EGL14.EGL_NO_DISPLAY) || Intrinsics.areEqual(gLThread.eglContext, EGL14.EGL_NO_CONTEXT)) {
            z = false;
        } else {
            EGLSurface eGLSurface = !Intrinsics.areEqual(gLThread.fallbackPbufferSurface, EGL14.EGL_NO_SURFACE) ? gLThread.fallbackPbufferSurface : EGL14.EGL_NO_SURFACE;
            z = EGL14.eglMakeCurrent(gLThread.eglDisplay, eGLSurface, eGLSurface, gLThread.eglContext);
        }
        if (z) {
            return;
        }
        Timber.Forest forest = Timber.Forest;
        forest.tag("SwampGL");
        forest.w(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to restore surfaceless context (eglError=0x", Integer.toHexString(EGL14.eglGetError()), ")"), new Object[0]);
    }

    public final void shutdown() {
        StandaloneCoroutine standaloneCoroutine;
        if (this.initialized) {
            this.initialized = false;
            GLThread gLThread = this.glThread;
            this.glThread = null;
            this.pendingTermination = gLThread != null ? gLThread.cleanupJob : null;
            if (gLThread != null && (standaloneCoroutine = gLThread.lifecycleJob) != null) {
                standaloneCoroutine.cancel(null);
            }
            Timber.Forest forest = Timber.Forest;
            forest.tag("SwampGL");
            forest.i("SwampGL shutdown initiated", new Object[0]);
        }
    }

    public /* synthetic */ Engine(CoroutineScope coroutineScope) {
        this(coroutineScope, new GpsConfigQueries$$ExternalSyntheticLambda1(29));
    }
}
