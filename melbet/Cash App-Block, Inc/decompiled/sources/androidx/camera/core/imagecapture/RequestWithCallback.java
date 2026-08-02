package androidx.camera.core.imagecapture;

import androidx.camera.core.impl.utils.futures.ChainingListenableFuture;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.room.TransactorKt;

/* loaded from: classes3.dex */
public final class RequestWithCallback {
    public final CallbackToFutureAdapter$Completer mCaptureCompleter;
    public final CallbackToFutureAdapter$SafeFuture mCaptureFuture;
    public ChainingListenableFuture mCaptureRequestFuture;
    public final CallbackToFutureAdapter$Completer mCompleteCompleter;
    public final CallbackToFutureAdapter$SafeFuture mCompleteFuture;
    public boolean mIsAborted = false;
    public boolean mIsStarted = false;
    public final TakePictureManagerImpl mRetryControl;
    public final AutoValue_TakePictureRequest mTakePictureRequest;

    public RequestWithCallback(AutoValue_TakePictureRequest autoValue_TakePictureRequest, TakePictureManagerImpl takePictureManagerImpl) {
        this.mTakePictureRequest = autoValue_TakePictureRequest;
        this.mRetryControl = takePictureManagerImpl;
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = new CallbackToFutureAdapter$Completer();
        callbackToFutureAdapter$Completer.cancellationFuture = new ResolvableFuture();
        CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = new CallbackToFutureAdapter$SafeFuture(callbackToFutureAdapter$Completer);
        callbackToFutureAdapter$Completer.future = callbackToFutureAdapter$SafeFuture;
        try {
            this.mCaptureCompleter = callbackToFutureAdapter$Completer;
            callbackToFutureAdapter$Completer.tag = "CaptureCompleteFuture";
        } catch (Exception e) {
            callbackToFutureAdapter$SafeFuture.setException(e);
        }
        this.mCaptureFuture = callbackToFutureAdapter$SafeFuture;
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer2 = new CallbackToFutureAdapter$Completer();
        callbackToFutureAdapter$Completer2.cancellationFuture = new ResolvableFuture();
        CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture2 = new CallbackToFutureAdapter$SafeFuture(callbackToFutureAdapter$Completer2);
        callbackToFutureAdapter$Completer2.future = callbackToFutureAdapter$SafeFuture2;
        try {
            this.mCompleteCompleter = callbackToFutureAdapter$Completer2;
            callbackToFutureAdapter$Completer2.tag = "RequestCompleteFuture";
        } catch (Exception e2) {
            callbackToFutureAdapter$SafeFuture2.setException(e2);
        }
        this.mCompleteFuture = callbackToFutureAdapter$SafeFuture2;
    }

    public final void markComplete() {
        AutoValue_TakePictureRequest autoValue_TakePictureRequest = this.mTakePictureRequest;
        boolean z = autoValue_TakePictureRequest.simultaneousCapture;
        if (!z || autoValue_TakePictureRequest.isFormatProcessedInSimultaneousCapture()) {
            if (!z) {
                TransactorKt.checkState("The callback can only complete once.", !this.mCompleteFuture.delegate.isDone());
            }
            this.mCompleteCompleter.set(null);
        }
    }
}
