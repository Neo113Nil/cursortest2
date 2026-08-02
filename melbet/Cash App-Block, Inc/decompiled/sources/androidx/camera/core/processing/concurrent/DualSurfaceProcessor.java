package androidx.camera.core.processing.concurrent;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.SurfaceRequest$$ExternalSyntheticLambda1;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService;
import androidx.camera.core.processing.SurfaceOutputImpl;
import androidx.camera.core.processing.SurfaceProcessorInternal;
import androidx.camera.core.processing.util.GLUtils;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda13;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda15;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.concurrent.futures.ResolvableFuture;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class DualSurfaceProcessor implements SurfaceProcessorInternal, SurfaceTexture.OnFrameAvailableListener {
    public final HandlerScheduledExecutorService mGlExecutor;
    public final Handler mGlHandler;
    public final DualOpenGlRenderer mGlRenderer;
    public final HandlerThread mGlThread;
    public int mInputSurfaceCount;
    public final AtomicBoolean mIsReleaseRequested;
    public boolean mIsReleased;
    public final LinkedHashMap mOutputSurfaces;
    public SurfaceTexture mPrimarySurfaceTexture;
    public SurfaceTexture mSecondarySurfaceTexture;

    public DualSurfaceProcessor(DynamicRange dynamicRange, UseCaseGroup useCaseGroup, UseCaseGroup useCaseGroup2) {
        Map map = Collections.EMPTY_MAP;
        this.mInputSurfaceCount = 0;
        this.mIsReleased = false;
        this.mIsReleaseRequested = new AtomicBoolean(false);
        this.mOutputSurfaces = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.mGlThread = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.mGlHandler = handler;
        this.mGlExecutor = new HandlerScheduledExecutorService(handler);
        this.mGlRenderer = new DualOpenGlRenderer(useCaseGroup, useCaseGroup2);
        try {
            initGlRenderer$1(dynamicRange);
        } catch (RuntimeException e) {
            release();
            throw e;
        }
    }

    public final void checkReadyToRelease$1() {
        if (this.mIsReleased && this.mInputSurfaceCount == 0) {
            LinkedHashMap linkedHashMap = this.mOutputSurfaces;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((SurfaceOutputImpl) it.next()).close();
            }
            linkedHashMap.clear();
            DualOpenGlRenderer dualOpenGlRenderer = this.mGlRenderer;
            if (((AtomicBoolean) dualOpenGlRenderer.mInitialized).getAndSet(false)) {
                GLUtils.checkGlThreadOrThrow((Thread) dualOpenGlRenderer.mGlThread);
                dualOpenGlRenderer.releaseInternal();
            }
            dualOpenGlRenderer.mPrimaryExternalTextureId = -1;
            dualOpenGlRenderer.mSecondaryExternalTextureId = -1;
            this.mGlThread.quit();
        }
    }

    public final void executeSafely$1(Runnable runnable, Runnable runnable2) {
        try {
            this.mGlExecutor.execute(new AFd1wSDK$$ExternalSyntheticLambda2(10, this, runnable2, runnable));
        } catch (RejectedExecutionException e) {
            StringUtilsKt.w("DualSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    public final void initGlRenderer$1(DynamicRange dynamicRange) {
        Map map = Collections.EMPTY_MAP;
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = new CallbackToFutureAdapter$Completer();
        callbackToFutureAdapter$Completer.cancellationFuture = new ResolvableFuture();
        CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = new CallbackToFutureAdapter$SafeFuture(callbackToFutureAdapter$Completer);
        callbackToFutureAdapter$Completer.future = callbackToFutureAdapter$SafeFuture;
        callbackToFutureAdapter$Completer.tag = JsonLogicResult$Success$$ExternalSyntheticOutline0.class;
        try {
            executeSafely$1(new AFd1wSDK$$ExternalSyntheticLambda2(this, dynamicRange, callbackToFutureAdapter$Completer), new Recorder$$ExternalSyntheticLambda13(3));
            callbackToFutureAdapter$Completer.tag = "Init GlRenderer";
        } catch (Exception e) {
            callbackToFutureAdapter$SafeFuture.setException(e);
        }
        try {
            callbackToFutureAdapter$SafeFuture.get();
        } catch (InterruptedException | ExecutionException e2) {
            e = e2;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            a$$ExternalSyntheticBUOutline0.m("Failed to create DefaultSurfaceProcessor", e);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.mIsReleaseRequested.get() || (surfaceTexture2 = this.mPrimarySurfaceTexture) == null || this.mSecondarySurfaceTexture == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.mSecondarySurfaceTexture.updateTexImage();
        for (Map.Entry entry : this.mOutputSurfaces.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            SurfaceOutputImpl surfaceOutputImpl = (SurfaceOutputImpl) entry.getKey();
            if (surfaceOutputImpl.mFormat == 34) {
                try {
                    this.mGlRenderer.render(surfaceTexture.getTimestamp(), surface, surfaceOutputImpl, this.mPrimarySurfaceTexture, this.mSecondarySurfaceTexture);
                } catch (RuntimeException e) {
                    StringUtilsKt.e("DualSurfaceProcessor", "Failed to render with OpenGL.", e);
                }
            }
        }
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public final void onInputSurface(SurfaceRequest surfaceRequest) {
        if (this.mIsReleaseRequested.get()) {
            surfaceRequest.willNotProvideSurface();
        } else {
            executeSafely$1(new Recorder$$ExternalSyntheticLambda15(4, this, surfaceRequest), new SurfaceRequest$$ExternalSyntheticLambda1(surfaceRequest, 1));
        }
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public final void onOutputSurface(SurfaceOutputImpl surfaceOutputImpl) {
        if (this.mIsReleaseRequested.get()) {
            surfaceOutputImpl.close();
            return;
        }
        Recorder$$ExternalSyntheticLambda15 recorder$$ExternalSyntheticLambda15 = new Recorder$$ExternalSyntheticLambda15(5, this, surfaceOutputImpl);
        Objects.requireNonNull(surfaceOutputImpl);
        executeSafely$1(recorder$$ExternalSyntheticLambda15, new Preview$$ExternalSyntheticLambda0(surfaceOutputImpl, 13));
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public final void release() {
        if (this.mIsReleaseRequested.getAndSet(true)) {
            return;
        }
        executeSafely$1(new Preview$$ExternalSyntheticLambda0(this, 16), new Recorder$$ExternalSyntheticLambda13(3));
    }
}
