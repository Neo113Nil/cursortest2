package androidx.camera.core.processing;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.AutoValue_SurfaceRequest_TransformationInfo;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.SurfaceRequest$$ExternalSyntheticLambda0;
import androidx.camera.core.impl.AutoValue_StreamSpec;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.util.Consumer;
import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class SurfaceEdge {
    public final Rect mCropRect;
    public final int mFormat;
    public final boolean mHasCameraTransform;
    public final boolean mMirroring;
    public SurfaceRequest mProviderSurfaceRequest;
    public int mRotationDegrees;
    public final Matrix mSensorToBufferTransform;
    public SettableSurface mSettableSurface;
    public final AutoValue_StreamSpec mStreamSpec;
    public int mTargetRotation;
    public final int mTargets;
    public boolean mHasConsumer = false;
    public final HashSet mOnInvalidatedListeners = new HashSet();
    public boolean mIsClosed = false;
    public final ArrayList mTransformationUpdatesListeners = new ArrayList();

    public final class SettableSurface extends DeferrableSurface {
        public final CallbackToFutureAdapter$Completer mCompleter;
        public SurfaceOutputImpl mConsumer;
        public DeferrableSurface mProvider;
        public final CallbackToFutureAdapter$SafeFuture mSurfaceFuture;

        public SettableSurface(int i, Size size) {
            super(i, size);
            CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = new CallbackToFutureAdapter$Completer();
            callbackToFutureAdapter$Completer.cancellationFuture = new ResolvableFuture();
            CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = new CallbackToFutureAdapter$SafeFuture(callbackToFutureAdapter$Completer);
            callbackToFutureAdapter$Completer.future = callbackToFutureAdapter$SafeFuture;
            callbackToFutureAdapter$Completer.tag = JsonLogicResult$Success$$ExternalSyntheticOutline0.class;
            try {
                this.mCompleter = callbackToFutureAdapter$Completer;
                callbackToFutureAdapter$Completer.tag = "SettableFuture hashCode: " + hashCode();
            } catch (Exception e) {
                callbackToFutureAdapter$SafeFuture.setException(e);
            }
            this.mSurfaceFuture = callbackToFutureAdapter$SafeFuture;
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        public final void close() {
            super.close();
            Threads.runOnMain(new SurfaceEdge$$ExternalSyntheticLambda0(this, 2));
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        public final ListenableFuture provideSurface() {
            return this.mSurfaceFuture;
        }

        public final boolean setProvider(DeferrableSurface deferrableSurface, Runnable runnable) {
            boolean z;
            Size size = this.mPrescribedSize;
            Threads.checkMainThread();
            deferrableSurface.getClass();
            int i = deferrableSurface.mPrescribedStreamFormat;
            Size size2 = deferrableSurface.mPrescribedSize;
            DeferrableSurface deferrableSurface2 = this.mProvider;
            if (deferrableSurface2 == deferrableSurface) {
                return false;
            }
            TransactorKt.checkState("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", deferrableSurface2 == null);
            TransactorKt.checkArgument("The provider's size(" + size + ") must match the parent(" + size2 + ")", size.equals(size2));
            int i2 = this.mPrescribedStreamFormat;
            TransactorKt.checkArgument(Recorder$$ExternalSyntheticOutline2.m(i2, i, "The provider's format(", ") must match the parent(", ")"), i2 == i);
            synchronized (this.mLock) {
                z = this.mClosed;
            }
            TransactorKt.checkState("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z);
            this.mProvider = deferrableSurface;
            Futures.propagateTransform(true, deferrableSurface.getSurface(), this.mCompleter, zzabp.directExecutor());
            deferrableSurface.incrementUseCount();
            Futures.nonCancellationPropagating(this.mTerminationFuture).addListener(new SurfaceEdge$$ExternalSyntheticLambda2(deferrableSurface, 1), zzabp.directExecutor());
            Futures.nonCancellationPropagating(deferrableSurface.mCloseFuture).addListener(runnable, zzabp.mainThreadExecutor());
            return true;
        }
    }

    public SurfaceEdge(int i, int i2, AutoValue_StreamSpec autoValue_StreamSpec, Matrix matrix, boolean z, Rect rect, int i3, int i4, boolean z2) {
        this.mTargets = i;
        this.mFormat = i2;
        this.mStreamSpec = autoValue_StreamSpec;
        this.mSensorToBufferTransform = matrix;
        this.mHasCameraTransform = z;
        this.mCropRect = rect;
        this.mRotationDegrees = i3;
        this.mTargetRotation = i4;
        this.mMirroring = z2;
        this.mSettableSurface = new SettableSurface(i2, autoValue_StreamSpec.resolution);
    }

    public final void addOnInvalidatedListener(Runnable runnable) {
        Threads.checkMainThread();
        checkNotClosed();
        this.mOnInvalidatedListeners.add(runnable);
    }

    public final void checkNotClosed() {
        TransactorKt.checkState("Edge is already closed.", !this.mIsClosed);
    }

    public final void close() {
        Threads.checkMainThread();
        this.mSettableSurface.close();
        this.mIsClosed = true;
        this.mTransformationUpdatesListeners.clear();
        this.mOnInvalidatedListeners.clear();
    }

    public final SurfaceRequest createSurfaceRequest(CameraInternal cameraInternal, boolean z) {
        Threads.checkMainThread();
        checkNotClosed();
        AutoValue_StreamSpec autoValue_StreamSpec = this.mStreamSpec;
        Size size = autoValue_StreamSpec.resolution;
        DynamicRange dynamicRange = autoValue_StreamSpec.dynamicRange;
        int i = autoValue_StreamSpec.sessionType;
        Range range = autoValue_StreamSpec.expectedFrameRateRange;
        int i2 = 0;
        SurfaceRequest surfaceRequest = new SurfaceRequest(size, cameraInternal, z, dynamicRange, i, range, new SurfaceEdge$$ExternalSyntheticLambda1(this, 0));
        try {
            SurfaceRequest.AnonymousClass2 anonymousClass2 = surfaceRequest.mInternalDeferrableSurface;
            SettableSurface settableSurface = this.mSettableSurface;
            Objects.requireNonNull(settableSurface);
            if (settableSurface.setProvider(anonymousClass2, new SurfaceEdge$$ExternalSyntheticLambda0(settableSurface, i2))) {
                Futures.nonCancellationPropagating(settableSurface.mTerminationFuture).addListener(new SurfaceEdge$$ExternalSyntheticLambda2(anonymousClass2, 0), zzabp.directExecutor());
            }
            this.mProviderSurfaceRequest = surfaceRequest;
            notifyTransformationInfoUpdate();
            return surfaceRequest;
        } catch (DeferrableSurface.SurfaceClosedException e) {
            throw new AssertionError("Surface is somehow already closed", e);
        } catch (RuntimeException e2) {
            surfaceRequest.willNotProvideSurface();
            throw e2;
        }
    }

    public final void invalidate() {
        boolean z;
        Threads.checkMainThread();
        checkNotClosed();
        SettableSurface settableSurface = this.mSettableSurface;
        settableSurface.getClass();
        Threads.checkMainThread();
        if (settableSurface.mProvider == null) {
            synchronized (settableSurface.mLock) {
                z = settableSurface.mClosed;
            }
            if (!z) {
                return;
            }
        }
        this.mHasConsumer = false;
        this.mSettableSurface.close();
        this.mSettableSurface = new SettableSurface(this.mFormat, this.mStreamSpec.resolution);
        Iterator it = this.mOnInvalidatedListeners.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void notifyTransformationInfoUpdate() {
        SurfaceRequest.TransformationInfoListener transformationInfoListener;
        Executor executor;
        Threads.checkMainThread();
        AutoValue_SurfaceRequest_TransformationInfo autoValue_SurfaceRequest_TransformationInfo = new AutoValue_SurfaceRequest_TransformationInfo(this.mCropRect, this.mRotationDegrees, this.mTargetRotation, this.mHasCameraTransform, this.mSensorToBufferTransform, this.mMirroring);
        SurfaceRequest surfaceRequest = this.mProviderSurfaceRequest;
        if (surfaceRequest != null) {
            synchronized (surfaceRequest.mLock) {
                surfaceRequest.mTransformationInfo = autoValue_SurfaceRequest_TransformationInfo;
                transformationInfoListener = surfaceRequest.mTransformationInfoListener;
                executor = surfaceRequest.mTransformationInfoExecutor;
            }
            if (transformationInfoListener != null && executor != null) {
                executor.execute(new SurfaceRequest$$ExternalSyntheticLambda0(transformationInfoListener, autoValue_SurfaceRequest_TransformationInfo, 0));
            }
        }
        Iterator it = this.mTransformationUpdatesListeners.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).accept(autoValue_SurfaceRequest_TransformationInfo);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceEdge{targets=");
        sb.append(this.mTargets);
        sb.append(", format=");
        sb.append(this.mFormat);
        sb.append(", resolution=");
        sb.append(this.mStreamSpec.resolution);
        sb.append(", cropRect=");
        sb.append(this.mCropRect);
        sb.append(", rotationDegrees=");
        sb.append(this.mRotationDegrees);
        sb.append(", mirroring=");
        sb.append(this.mMirroring);
        sb.append(", sensorToBufferTransform= ");
        Matrix matrix = this.mSensorToBufferTransform;
        sb.append(matrix);
        sb.append(", rotationInTransform= ");
        sb.append(TransformUtils.getRotationDegrees(matrix));
        sb.append(", isMirrorInTransform= ");
        sb.append(TransformUtils.isMirrored(matrix));
        sb.append(", isClosed=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.mIsClosed, '}');
    }
}
