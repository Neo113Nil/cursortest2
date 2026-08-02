package androidx.camera.view;

import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.futures.ChainingListenableFuture;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.Recorder;
import androidx.camera.view.PreviewView;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.lifecycle.MutableLiveData;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class PreviewStreamStateObserver implements Observable.Observer {
    public final CameraInfoInternal mCameraInfoInternal;
    public FutureChain mFlowFuture;
    public boolean mHasStartedPreviewStreamFlow = false;
    public PreviewView.StreamState mPreviewStreamState;
    public final MutableLiveData mPreviewStreamStateLiveData;
    public final PreviewViewImplementation mPreviewViewImplementation;

    public PreviewStreamStateObserver(CameraInfoInternal cameraInfoInternal, MutableLiveData mutableLiveData, PreviewViewImplementation previewViewImplementation) {
        this.mCameraInfoInternal = cameraInfoInternal;
        this.mPreviewStreamStateLiveData = mutableLiveData;
        this.mPreviewViewImplementation = previewViewImplementation;
        synchronized (this) {
            this.mPreviewStreamState = (PreviewView.StreamState) mutableLiveData.getValue();
        }
    }

    @Override // androidx.camera.core.impl.Observable.Observer
    public final void onError(Throwable th) {
        FutureChain futureChain = this.mFlowFuture;
        if (futureChain != null) {
            futureChain.cancel(false);
            this.mFlowFuture = null;
        }
        updatePreviewStreamState(PreviewView.StreamState.IDLE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.camera.view.PreviewStreamStateObserver$2, java.lang.Object] */
    @Override // androidx.camera.core.impl.Observable.Observer
    public final void onNewData(Object obj) {
        CameraInternal.State state = (CameraInternal.State) obj;
        CameraInternal.State state2 = CameraInternal.State.CLOSING;
        PreviewView.StreamState streamState = PreviewView.StreamState.IDLE;
        if (state == state2 || state == CameraInternal.State.CLOSED || state == CameraInternal.State.RELEASING || state == CameraInternal.State.RELEASED) {
            updatePreviewStreamState(streamState);
            if (this.mHasStartedPreviewStreamFlow) {
                this.mHasStartedPreviewStreamFlow = false;
                FutureChain futureChain = this.mFlowFuture;
                if (futureChain != null) {
                    futureChain.cancel(false);
                    this.mFlowFuture = null;
                    return;
                }
                return;
            }
            return;
        }
        if ((state == CameraInternal.State.OPENING || state == CameraInternal.State.OPEN || state == CameraInternal.State.PENDING_OPEN) && !this.mHasStartedPreviewStreamFlow) {
            final CameraInfoInternal cameraInfoInternal = this.mCameraInfoInternal;
            updatePreviewStreamState(streamState);
            ArrayList arrayList = new ArrayList();
            final CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = new CallbackToFutureAdapter$Completer();
            callbackToFutureAdapter$Completer.cancellationFuture = new ResolvableFuture();
            CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = new CallbackToFutureAdapter$SafeFuture(callbackToFutureAdapter$Completer);
            callbackToFutureAdapter$Completer.future = callbackToFutureAdapter$SafeFuture;
            callbackToFutureAdapter$Completer.tag = JsonLogicResult$Success$$ExternalSyntheticOutline0.class;
            try {
                ?? r2 = new CameraCaptureCallback() { // from class: androidx.camera.view.PreviewStreamStateObserver.2
                    @Override // androidx.camera.core.impl.CameraCaptureCallback
                    public final void onCaptureCompleted(int i, CameraCaptureResult cameraCaptureResult) {
                        CallbackToFutureAdapter$Completer.this.set(null);
                        ((CameraInfoInternal) cameraInfoInternal).removeSessionCaptureCallback(this);
                    }
                };
                arrayList.add(r2);
                cameraInfoInternal.addSessionCaptureCallback(zzabp.directExecutor(), r2);
                callbackToFutureAdapter$Completer.tag = "waitForCaptureResult";
            } catch (Exception e) {
                callbackToFutureAdapter$SafeFuture.setException(e);
            }
            ChainingListenableFuture transformAsync = Futures.transformAsync(FutureChain.from(callbackToFutureAdapter$SafeFuture), new PreviewStreamStateObserver$$ExternalSyntheticLambda0(this), zzabp.directExecutor());
            PreviewStreamStateObserver$$ExternalSyntheticLambda0 previewStreamStateObserver$$ExternalSyntheticLambda0 = new PreviewStreamStateObserver$$ExternalSyntheticLambda0(this);
            ChainingListenableFuture transformAsync2 = Futures.transformAsync(transformAsync, new Toolbar.AnonymousClass1(previewStreamStateObserver$$ExternalSyntheticLambda0), zzabp.directExecutor());
            this.mFlowFuture = transformAsync2;
            Futures.addCallback(transformAsync2, new Recorder.AnonymousClass3(this, arrayList, cameraInfoInternal, false, 11), zzabp.directExecutor());
            this.mHasStartedPreviewStreamFlow = true;
        }
    }

    public final void updatePreviewStreamState(PreviewView.StreamState streamState) {
        synchronized (this) {
            try {
                if (this.mPreviewStreamState.equals(streamState)) {
                    return;
                }
                this.mPreviewStreamState = streamState;
                StringUtilsKt.d("StreamStateObserver", "Update Preview stream state to " + streamState);
                this.mPreviewStreamStateLiveData.postValue(streamState);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
