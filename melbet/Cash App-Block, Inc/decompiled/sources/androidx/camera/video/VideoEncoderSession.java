package androidx.camera.video;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda1;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.executor.SequentialExecutor;
import androidx.camera.core.impl.utils.futures.ImmediateFuture$ImmediateFailedFuture;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda2;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.lifecycle.BlockRunner$cancel$1;
import androidx.room.IMultiInstanceInvalidationService;
import androidx.room.InvalidationTracker;
import androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1;
import androidx.room.ObserverWrapper;
import androidx.room.TriggerBasedInvalidationTracker;
import androidx.tracing.Trace;
import app.cash.zipline.CallResult;
import com.google.android.play.core.review.internal.zzr;
import com.squareup.cash.permissions.AndroidPermissionChecker$granted$$inlined$map$1;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class VideoEncoderSession {
    public final /* synthetic */ int $r8$classId;
    public Object mActiveSurface;
    public final Object mExecutor;
    public Object mReadyToReleaseCompleter;
    public Object mReadyToReleaseFuture;
    public Object mReleasedCompleter;
    public Object mReleasedFuture;
    public final Object mSequentialExecutor;
    public Object mSurfaceRequest;
    public Object mVideoEncoder;
    public final Object mVideoEncoderFactory;
    public int mVideoEncoderState;

    public VideoEncoderSession(Context context, String str, InvalidationTracker invalidationTracker) {
        this.$r8$classId = 1;
        context.getClass();
        str.getClass();
        this.mExecutor = str;
        this.mSequentialExecutor = invalidationTracker;
        this.mVideoEncoderFactory = context.getApplicationContext();
        this.mVideoEncoder = invalidationTracker.database.getCoroutineScope();
        this.mActiveSurface = new AtomicBoolean(true);
        this.mReleasedFuture = FlowKt.MutableSharedFlow(0, 0, BufferOverflow.SUSPEND);
        String[] strArr = invalidationTracker.tableNames;
        CallResult callResult = new CallResult();
        callResult.serviceNames = this;
        callResult.result = strArr;
        this.mReadyToReleaseFuture = callResult;
        this.mReleasedCompleter = new MultiInstanceInvalidationClient$invalidationCallback$1(this);
        this.mReadyToReleaseCompleter = new zzr(this, 1);
    }

    public void closeInternal() {
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(this.mVideoEncoderState);
        if (ordinal == 0 || ordinal == 1) {
            terminateNow();
            return;
        }
        if (ordinal != 2 && ordinal != 3) {
            if (ordinal == 4) {
                StringUtilsKt.d("VideoEncoderSession", "closeInternal in RELEASED state, No-op");
                return;
            } else {
                f$$ExternalSyntheticLambda0.m("State ", Recorder$$ExternalSyntheticOutline1.stringValueOf$3(this.mVideoEncoderState), " is not handled");
                return;
            }
        }
        StringUtilsKt.d("VideoEncoderSession", "closeInternal in " + Recorder$$ExternalSyntheticOutline1.stringValueOf$3(this.mVideoEncoderState) + " state");
        this.mVideoEncoderState = 3;
    }

    public AndroidPermissionChecker$granted$$inlined$map$1 createFlow(String[] strArr) {
        strArr.getClass();
        return new AndroidPermissionChecker$granted$$inlined$map$1((SharedFlowImpl) this.mReleasedFuture, strArr, 1);
    }

    public void start(Intent intent) {
        intent.getClass();
        if (((AtomicBoolean) this.mActiveSurface).compareAndSet(true, false)) {
            ((Context) this.mVideoEncoderFactory).bindService(intent, (zzr) this.mReadyToReleaseCompleter, 1);
            InvalidationTracker invalidationTracker = (InvalidationTracker) this.mSequentialExecutor;
            CallResult callResult = (CallResult) this.mReadyToReleaseFuture;
            callResult.getClass();
            LinkedHashMap linkedHashMap = invalidationTracker.observerMap;
            TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = invalidationTracker.implementation;
            Pair validateTableNames$room_runtime_release = triggerBasedInvalidationTracker.validateTableNames$room_runtime_release((String[]) callResult.result);
            String[] strArr = (String[]) validateTableNames$room_runtime_release.first;
            int[] iArr = (int[]) validateTableNames$room_runtime_release.second;
            ObserverWrapper observerWrapper = new ObserverWrapper(callResult, iArr, strArr);
            ReentrantLock reentrantLock = invalidationTracker.observerMapLock;
            reentrantLock.lock();
            try {
                ObserverWrapper observerWrapper2 = linkedHashMap.containsKey(callResult) ? (ObserverWrapper) MapsKt__MapsKt.getValue(linkedHashMap, callResult) : (ObserverWrapper) linkedHashMap.put(callResult, observerWrapper);
                reentrantLock.unlock();
                if (observerWrapper2 == null) {
                    triggerBasedInvalidationTracker.observedTableStates.onObserverAdded$room_runtime_release(iArr);
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public void stop() {
        if (((AtomicBoolean) this.mActiveSurface).compareAndSet(false, true)) {
            InvalidationTracker invalidationTracker = (InvalidationTracker) this.mSequentialExecutor;
            CallResult callResult = (CallResult) this.mReadyToReleaseFuture;
            callResult.getClass();
            ReentrantLock reentrantLock = invalidationTracker.observerMapLock;
            reentrantLock.lock();
            try {
                ObserverWrapper observerWrapper = (ObserverWrapper) invalidationTracker.observerMap.remove(callResult);
                if (observerWrapper != null) {
                    TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = invalidationTracker.implementation;
                    int[] iArr = observerWrapper.tableIds;
                    triggerBasedInvalidationTracker.getClass();
                    iArr.getClass();
                    if (triggerBasedInvalidationTracker.observedTableStates.onObserverRemoved$room_runtime_release(iArr)) {
                        Trace.runBlockingUninterruptible(new BlockRunner$cancel$1(invalidationTracker, (Continuation) null, 3));
                    }
                }
                try {
                    IMultiInstanceInvalidationService iMultiInstanceInvalidationService = (IMultiInstanceInvalidationService) this.mSurfaceRequest;
                    if (iMultiInstanceInvalidationService != null) {
                        iMultiInstanceInvalidationService.unregisterCallback((MultiInstanceInvalidationClient$invalidationCallback$1) this.mReleasedCompleter, this.mVideoEncoderState);
                    }
                } catch (RemoteException e) {
                    Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e);
                }
                ((Context) this.mVideoEncoderFactory).unbindService((zzr) this.mReadyToReleaseCompleter);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public void terminateNow() {
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(this.mVideoEncoderState);
        if (ordinal == 0) {
            this.mVideoEncoderState = 5;
            return;
        }
        if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
            int i = this.mVideoEncoderState;
            if (ordinal != 4) {
                f$$ExternalSyntheticLambda0.m("State ", Recorder$$ExternalSyntheticOutline1.stringValueOf$3(i), " is not handled");
                return;
            }
            StringUtilsKt.d("VideoEncoderSession", "terminateNow in " + Recorder$$ExternalSyntheticOutline1.stringValueOf$3(i) + ", No-op");
            return;
        }
        this.mVideoEncoderState = 5;
        ((CallbackToFutureAdapter$Completer) this.mReadyToReleaseCompleter).set((EncoderImpl) this.mVideoEncoder);
        this.mSurfaceRequest = null;
        if (((EncoderImpl) this.mVideoEncoder) == null) {
            StringUtilsKt.w("VideoEncoderSession", "There's no VideoEncoder to release! Finish release completer.");
            ((CallbackToFutureAdapter$Completer) this.mReleasedCompleter).set(null);
            return;
        }
        StringUtilsKt.d("VideoEncoderSession", "VideoEncoder is releasing: " + ((EncoderImpl) this.mVideoEncoder));
        EncoderImpl encoderImpl = (EncoderImpl) this.mVideoEncoder;
        encoderImpl.mEncoderExecutor.execute(new EncoderImpl$$ExternalSyntheticLambda2(encoderImpl, 0));
        ((EncoderImpl) this.mVideoEncoder).mReleasedFuture.addListener(new Preview$$ExternalSyntheticLambda0(this, 21), (Executor) this.mSequentialExecutor);
        this.mVideoEncoder = null;
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 0:
                return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString((SurfaceRequest) this.mSurfaceRequest, "SURFACE_REQUEST_NOT_CONFIGURED");
            default:
                return super.toString();
        }
    }

    public VideoEncoderSession(ZslControlImpl$$ExternalSyntheticLambda1 zslControlImpl$$ExternalSyntheticLambda1, SequentialExecutor sequentialExecutor, Executor executor) {
        this.$r8$classId = 0;
        this.mVideoEncoder = null;
        this.mActiveSurface = null;
        this.mSurfaceRequest = null;
        this.mVideoEncoderState = 1;
        this.mReleasedFuture = new ImmediateFuture$ImmediateFailedFuture(new IllegalStateException("Cannot close the encoder before configuring."), 0);
        this.mReleasedCompleter = null;
        this.mReadyToReleaseFuture = new ImmediateFuture$ImmediateFailedFuture(new IllegalStateException("Cannot close the encoder before configuring."), 0);
        this.mReadyToReleaseCompleter = null;
        this.mExecutor = executor;
        this.mSequentialExecutor = sequentialExecutor;
        this.mVideoEncoderFactory = zslControlImpl$$ExternalSyntheticLambda1;
    }
}
