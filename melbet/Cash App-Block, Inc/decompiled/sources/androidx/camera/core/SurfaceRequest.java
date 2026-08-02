package androidx.camera.core;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.biometric.BiometricPrompt;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import androidx.camera.core.impl.AutoValue_StreamSpec;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.processing.SurfaceEdge$$ExternalSyntheticLambda1;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.util.Consumer;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import com.bumptech.glide.util.Executors$1;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class SurfaceRequest {
    public static final Range FRAME_RATE_RANGE_UNSPECIFIED = AutoValue_StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
    public final CameraInternal mCamera;
    public final DynamicRange mDynamicRange;
    public final Range mExpectedFrameRate;
    public final AnonymousClass2 mInternalDeferrableSurface;
    public final boolean mIsPrimary;
    public final Object mLock = new Object();
    public final CallbackToFutureAdapter$Completer mRequestCancellationCompleter;
    public final Size mResolution;
    public final CallbackToFutureAdapter$SafeFuture mSessionStatusFuture;
    public final int mSessionType;
    public final CallbackToFutureAdapter$Completer mSurfaceCompleter;
    public final CallbackToFutureAdapter$SafeFuture mSurfaceFuture;
    public final CallbackToFutureAdapter$Completer mSurfaceRecreationCompleter;
    public AutoValue_SurfaceRequest_TransformationInfo mTransformationInfo;
    public Executor mTransformationInfoExecutor;
    public TransformationInfoListener mTransformationInfoListener;

    final class RequestCancelledException extends RuntimeException {
    }

    public interface TransformationInfoListener {
        void onTransformationInfoUpdate(AutoValue_SurfaceRequest_TransformationInfo autoValue_SurfaceRequest_TransformationInfo);
    }

    public SurfaceRequest(Size size, CameraInternal cameraInternal, boolean z, DynamicRange dynamicRange, int i, Range range, SurfaceEdge$$ExternalSyntheticLambda1 surfaceEdge$$ExternalSyntheticLambda1) {
        this.mResolution = size;
        this.mCamera = cameraInternal;
        this.mIsPrimary = z;
        TransactorKt.checkArgument("SurfaceRequest's DynamicRange must always be fully specified.", dynamicRange.isFullySpecified());
        this.mDynamicRange = dynamicRange;
        this.mSessionType = i;
        this.mExpectedFrameRate = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference(null);
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = new CallbackToFutureAdapter$Completer();
        callbackToFutureAdapter$Completer.cancellationFuture = new ResolvableFuture();
        CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = new CallbackToFutureAdapter$SafeFuture(callbackToFutureAdapter$Completer);
        callbackToFutureAdapter$Completer.future = callbackToFutureAdapter$SafeFuture;
        callbackToFutureAdapter$Completer.tag = JsonLogicResult$Success$$ExternalSyntheticOutline0.class;
        try {
            atomicReference.set(callbackToFutureAdapter$Completer);
            callbackToFutureAdapter$Completer.tag = str.concat("-cancellation");
        } catch (Exception e) {
            callbackToFutureAdapter$SafeFuture.setException(e);
        }
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer2 = (CallbackToFutureAdapter$Completer) atomicReference.get();
        callbackToFutureAdapter$Completer2.getClass();
        this.mRequestCancellationCompleter = callbackToFutureAdapter$Completer2;
        AtomicReference atomicReference2 = new AtomicReference(null);
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer3 = new CallbackToFutureAdapter$Completer();
        callbackToFutureAdapter$Completer3.cancellationFuture = new ResolvableFuture();
        CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture2 = new CallbackToFutureAdapter$SafeFuture(callbackToFutureAdapter$Completer3);
        callbackToFutureAdapter$Completer3.future = callbackToFutureAdapter$SafeFuture2;
        callbackToFutureAdapter$Completer3.tag = JsonLogicResult$Success$$ExternalSyntheticOutline0.class;
        try {
            atomicReference2.set(callbackToFutureAdapter$Completer3);
            callbackToFutureAdapter$Completer3.tag = str.concat("-status");
        } catch (Exception e2) {
            callbackToFutureAdapter$SafeFuture2.setException(e2);
        }
        this.mSessionStatusFuture = callbackToFutureAdapter$SafeFuture2;
        int i2 = 2;
        Futures.addCallback(callbackToFutureAdapter$SafeFuture2, new UseCaseGroup(i2, callbackToFutureAdapter$Completer2, callbackToFutureAdapter$SafeFuture), zzabp.directExecutor());
        final CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer4 = (CallbackToFutureAdapter$Completer) atomicReference2.get();
        callbackToFutureAdapter$Completer4.getClass();
        AtomicReference atomicReference3 = new AtomicReference(null);
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer5 = new CallbackToFutureAdapter$Completer();
        callbackToFutureAdapter$Completer5.cancellationFuture = new ResolvableFuture();
        CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture3 = new CallbackToFutureAdapter$SafeFuture(callbackToFutureAdapter$Completer5);
        callbackToFutureAdapter$Completer5.future = callbackToFutureAdapter$SafeFuture3;
        callbackToFutureAdapter$Completer5.tag = JsonLogicResult$Success$$ExternalSyntheticOutline0.class;
        try {
            atomicReference3.set(callbackToFutureAdapter$Completer5);
            callbackToFutureAdapter$Completer5.tag = str.concat("-Surface");
        } catch (Exception e3) {
            callbackToFutureAdapter$SafeFuture3.setException(e3);
        }
        this.mSurfaceFuture = callbackToFutureAdapter$SafeFuture3;
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer6 = (CallbackToFutureAdapter$Completer) atomicReference3.get();
        callbackToFutureAdapter$Completer6.getClass();
        this.mSurfaceCompleter = callbackToFutureAdapter$Completer6;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this, size);
        this.mInternalDeferrableSurface = anonymousClass2;
        final ListenableFuture nonCancellationPropagating = Futures.nonCancellationPropagating(anonymousClass2.mTerminationFuture);
        Futures.addCallback(callbackToFutureAdapter$SafeFuture3, new FutureCallback() { // from class: androidx.camera.core.SurfaceRequest.3
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final void onFailure(Throwable th) {
                boolean z2 = th instanceof CancellationException;
                CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer7 = callbackToFutureAdapter$Completer4;
                if (z2) {
                    TransactorKt.checkState(null, callbackToFutureAdapter$Completer7.setException(new RequestCancelledException(str.concat(" cancelled."), th)));
                } else {
                    callbackToFutureAdapter$Completer7.set(null);
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final void onSuccess(Object obj) {
                Futures.propagateTransform(true, ListenableFuture.this, callbackToFutureAdapter$Completer4, zzabp.directExecutor());
            }
        }, zzabp.directExecutor());
        nonCancellationPropagating.addListener(new SurfaceRequest$$ExternalSyntheticLambda1(this, 0), zzabp.directExecutor());
        Executors$1 directExecutor = zzabp.directExecutor();
        AtomicReference atomicReference4 = new AtomicReference(null);
        Futures.addCallback(DBUtil.getFuture(new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(i2, this, atomicReference4)), new BiometricPrompt(surfaceEdge$$ExternalSyntheticLambda1, 10), directExecutor);
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer7 = (CallbackToFutureAdapter$Completer) atomicReference4.get();
        callbackToFutureAdapter$Completer7.getClass();
        this.mSurfaceRecreationCompleter = callbackToFutureAdapter$Completer7;
    }

    public final void provideSurface(final Surface surface, Executor executor, final Consumer consumer) {
        if (!surface.isValid()) {
            final int i = 0;
            executor.execute(new Runnable() { // from class: androidx.camera.core.SurfaceRequest$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    Surface surface2 = surface;
                    Consumer consumer2 = consumer;
                    switch (i2) {
                        case 0:
                            consumer2.accept(new AutoValue_SurfaceRequest_Result(2, surface2));
                            break;
                        case 1:
                            consumer2.accept(new AutoValue_SurfaceRequest_Result(3, surface2));
                            break;
                        default:
                            consumer2.accept(new AutoValue_SurfaceRequest_Result(4, surface2));
                            break;
                    }
                }
            });
            return;
        }
        if (!this.mSurfaceCompleter.set(surface)) {
            CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = this.mSurfaceFuture;
            if (!callbackToFutureAdapter$SafeFuture.isCancelled()) {
                TransactorKt.checkState(null, callbackToFutureAdapter$SafeFuture.delegate.isDone());
                try {
                    callbackToFutureAdapter$SafeFuture.get();
                    final int i2 = 1;
                    executor.execute(new Runnable() { // from class: androidx.camera.core.SurfaceRequest$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i22 = i2;
                            Surface surface2 = surface;
                            Consumer consumer2 = consumer;
                            switch (i22) {
                                case 0:
                                    consumer2.accept(new AutoValue_SurfaceRequest_Result(2, surface2));
                                    break;
                                case 1:
                                    consumer2.accept(new AutoValue_SurfaceRequest_Result(3, surface2));
                                    break;
                                default:
                                    consumer2.accept(new AutoValue_SurfaceRequest_Result(4, surface2));
                                    break;
                            }
                        }
                    });
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    final int i3 = 2;
                    executor.execute(new Runnable() { // from class: androidx.camera.core.SurfaceRequest$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i22 = i3;
                            Surface surface2 = surface;
                            Consumer consumer2 = consumer;
                            switch (i22) {
                                case 0:
                                    consumer2.accept(new AutoValue_SurfaceRequest_Result(2, surface2));
                                    break;
                                case 1:
                                    consumer2.accept(new AutoValue_SurfaceRequest_Result(3, surface2));
                                    break;
                                default:
                                    consumer2.accept(new AutoValue_SurfaceRequest_Result(4, surface2));
                                    break;
                            }
                        }
                    });
                    return;
                }
            }
        }
        Futures.addCallback(this.mSessionStatusFuture, new UseCaseGroup(3, consumer, surface), executor);
    }

    public final void setTransformationInfoListener(Executor executor, TransformationInfoListener transformationInfoListener) {
        AutoValue_SurfaceRequest_TransformationInfo autoValue_SurfaceRequest_TransformationInfo;
        synchronized (this.mLock) {
            this.mTransformationInfoListener = transformationInfoListener;
            this.mTransformationInfoExecutor = executor;
            autoValue_SurfaceRequest_TransformationInfo = this.mTransformationInfo;
        }
        if (autoValue_SurfaceRequest_TransformationInfo != null) {
            executor.execute(new SurfaceRequest$$ExternalSyntheticLambda0(transformationInfoListener, autoValue_SurfaceRequest_TransformationInfo, 1));
        }
    }

    public final boolean willNotProvideSurface() {
        return this.mSurfaceCompleter.setException(new DeferrableSurface.SurfaceUnavailableException("Surface request will not complete."));
    }

    /* renamed from: androidx.camera.core.SurfaceRequest$2, reason: invalid class name */
    public final class AnonymousClass2 extends DeferrableSurface {
        public final /* synthetic */ int $r8$classId = 1;
        public final Object this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SurfaceRequest surfaceRequest, Size size) {
            super(34, size);
            this.this$0 = surfaceRequest;
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        public final ListenableFuture provideSurface() {
            int i = this.$r8$classId;
            Object obj = this.this$0;
            switch (i) {
                case 0:
                    return ((SurfaceRequest) obj).mSurfaceFuture;
                default:
                    return Futures.immediateFuture((Surface) obj);
            }
        }

        public AnonymousClass2(Surface surface, Size size, int i) {
            super(i, size);
            this.this$0 = surface;
        }
    }
}
